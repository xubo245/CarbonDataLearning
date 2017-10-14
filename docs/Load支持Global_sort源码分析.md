
#入口
load之前操作都差不多

	 if (updateModel.isDefined) {
	          loadDataFrameForUpdate()
	        } else if (carbonTable.getPartitionInfo(carbonTable.getFactTableName) != null) {
	          loadDataForPartitionTable()
	        } else if (isSortTable && sortScope.equals(SortScopeOptions.SortScope.GLOBAL_SORT)) {
	          LOGGER.audit("Using global sort for loading.")
	          status = DataLoadProcessBuilderOnSpark.loadDataUsingGlobalSort(sqlContext.sparkContext,
	            dataFrame, carbonLoadModel)
	        } else if (dataFrame.isDefined) {
	          loadDataFrame()
	        } else {
	          loadDataFile()
	        }

输入数据：
	
	id,name,city,age
	10,a,wuhan,10
	4,y,hangzhou,20
	7,z,beijing,30
	1,d,shenzhen,40
org.apache.carbondata.spark.load.DataLoadProcessBuilderOnSpark#loadDataUsingGlobalSort

##0.初始化参数，读入数据

    val originRDD = if (dataFrame.isDefined) {
      dataFrame.get.rdd
    } else {
      // input data from files
      val hadoopConfiguration = new Configuration()
      CommonUtil.configureCSVInputFormat(hadoopConfiguration, model)
      hadoopConfiguration.set(FileInputFormat.INPUT_DIR, model.getFactFilePath)
      val columnCount = model.getCsvHeaderColumns.length
      new NewHadoopRDD[NullWritable, StringArrayWritable](
        sc,
        classOf[CSVInputFormat],
        classOf[NullWritable],
        classOf[StringArrayWritable],
        hadoopConfiguration)
        .map(x => DataLoadProcessorStepOnSpark.toStringArrayRow(x._2, columnCount))
    }

结果

	[10,a,wuhan,10]
	[4,y,hangzhou,20]
	[7,z,beijing,30]
	[1,d,shenzhen,40]

##1. Input
    val inputRDD = originRDD
      .mapPartitions(rows => DataLoadProcessorStepOnSpark.toRDDIterator(rows, modelBroadcast))
      .mapPartitionsWithIndex { case (index, rows) =>
        DataLoadProcessorStepOnSpark.inputFunc(rows, index, modelBroadcast, inputStepRowCounter)
      }
其中ataLoadProcessorStepOnSpark.inputFunc会对数据进行解析和转换

    new Iterator[CarbonRow] {
      override def hasNext: Boolean = rows.hasNext

      override def next(): CarbonRow = {
        val row = new CarbonRow(rowParser.parseRow(rows.next()))
        rowCounter.add(1)
        row
      }
    }

org.apache.carbondata.processing.loading.parser.impl.RowParserImpl#parseRow

	  public Object[] parseRow(Object[] row) {
	    // If number of columns are less in a row then create new array with same size of header.
	    if (row.length < numberOfColumns) {
	      String[] temp = new String[numberOfColumns];
	      System.arraycopy(row, 0, temp, 0, row.length);
	      row = temp;
	    }
	    Object[] out = new Object[genericParsers.length];
	    for (int i = 0; i < genericParsers.length; i++) {
	      Object obj = row[inputMapping[i]];
	      out[outputMapping[i]] = genericParsers[i].parse(obj);
	    }
	    return out;
	  }
其中inputMapping时调整的顺序，会将sort列提前到前列

结果

	inputRDD
	[a, wuhan, 10, 10]
	[y, hangzhou, 4, 20]
	[z, beijing, 7, 30]
	[d, shenzhen, 1, 40]

##2.convert

	  // 2. Convert
	    val convertRDD = inputRDD.mapPartitionsWithIndex { case (index, rows) =>
	      DataLoadProcessorStepOnSpark.convertFunc(rows, index, modelBroadcast, partialSuccessAccum,
	        convertStepRowCounter)
	    }.filter(_ != null)// Filter the bad record

DataLoadProcessorStepOnSpark.convertFunc进行convert：

    new Iterator[CarbonRow] {
      override def hasNext: Boolean = rows.hasNext

      override def next(): CarbonRow = {
        val row = rowConverter.convert(rows.next())
        rowCounter.add(1)
        row
      }
    }

rows即为上一步处理的数据：

	 public CarbonRow convert(CarbonRow row) throws CarbonDataLoadingException {
	    //TODO: only copy if it is bad record
	    CarbonRow copy = row.getCopy();
	    logHolder.setLogged(false);
	    logHolder.clear();
	    for (int i = 0; i < fieldConverters.length; i++) {
	      fieldConverters[i].convert(row, logHolder);
	      if (!logHolder.isLogged() && logHolder.isBadRecordNotAdded()) {
	        badRecordLogger.addBadRecordsToBuilder(copy.getData(), logHolder.getReason());
	        if (badRecordLogger.isDataLoadFail()) {
	          String error = "Data load failed due to bad record: " + logHolder.getReason() +
	              "Please enable bad record logger to know the detail reason.";
	          throw new BadRecordFoundException(error);
	        }
	        logHolder.clear();
	        logHolder.setLogged(true);
	        if (badRecordLogger.isBadRecordConvertNullDisable()) {
	          return null;
	        }
	      }
	    }
	    return row;
	  }

会调用相关算法进行转换：
String类型：
org.apache.carbondata.core.util.DataTypeUtil#getBytesBasedOnDataTypeForNoDictionaryColumn
int类型：
org.apache.carbondata.core.util.DataTypeUtil#getMeasureValueBasedOnDataType


结果：

	convertRDD
	[[B@3c87388c, [B@4f62184a, 10, 10]
	[[B@ad4e9f3, [B@4df7e001, 4, 20]
	[[B@48b1f26b, [B@174e137f, 7, 30]
	[[B@3af8fb14, [B@48fde3a2, 1, 40]

##3 sort

	// 3. Sort
	    val configuration = DataLoadProcessBuilder.createConfiguration(model)
	    val sortParameters = SortParameters.createSortParameters(configuration)
	    object RowOrdering extends Ordering[Array[AnyRef]] {
	      def compare(rowA: Array[AnyRef], rowB: Array[AnyRef]): Int = {
	        val rowComparator: Comparator[Array[AnyRef]] =
	          if (sortParameters.getNoDictionaryCount > 0) {
	            new NewRowComparator(sortParameters.getNoDictionaryDimnesionColumn)
	          } else {
	            new NewRowComparatorForNormalDims(sortParameters.getDimColCount)
	          }
	
	        rowComparator.compare(rowA, rowB)
	      }
	    }
	
	    var numPartitions = CarbonDataProcessorUtil.getGlobalSortPartitions(configuration)
	    if (numPartitions <= 0) {
	      numPartitions = convertRDD.partitions.length
	    }
	
	    // Because if the number of partitions greater than 1, there will be action operator(sample) in
	    // sortBy operator. So here we cache the rdd to avoid do input and convert again.
	    if (numPartitions > 1) {
	      convertRDD.persist(StorageLevel.fromString(
	        CarbonProperties.getInstance().getGlobalSortRddStorageLevel()))
	    }
	
	    import scala.reflect.classTag
	    println(convertRDD.partitions.length)
	    val sortRDD = convertRDD
	      .sortBy(_.getData, numPartitions = numPartitions)(RowOrdering, classTag[Array[AnyRef]])
	      .mapPartitionsWithIndex { case (index, rows) =>
	        DataLoadProcessorStepOnSpark.convertTo3Parts(rows, index, modelBroadcast,
	          sortStepRowCounter)
	      }

###3.1 获取numPartitions

    var numPartitions = CarbonDataProcessorUtil.getGlobalSortPartitions(configuration)
    if (numPartitions <= 0) {
      numPartitions = convertRDD.partitions.length
    }

    // Because if the number of partitions greater than 1, there will be action operator(sample) in
    // sortBy operator. So here we cache the rdd to avoid do input and convert again.
    if (numPartitions > 1) {
      convertRDD.persist(StorageLevel.fromString(
        CarbonProperties.getInstance().getGlobalSortRddStorageLevel()))
    }

###3.2 sortBy

	  val sortRDD = convertRDD
	      .sortBy(_.getData, numPartitions = numPartitions)(RowOrdering, classTag[Array[AnyRef]])
	      .mapPartitionsWithIndex { case (index, rows) =>
	        DataLoadProcessorStepOnSpark.convertTo3Parts(rows, index, modelBroadcast,
	          sortStepRowCounter)
	      }

###3.2.1 调用SortByKey

	  def sortBy[K](
	      f: (T) => K,
	      ascending: Boolean = true,
	      numPartitions: Int = this.partitions.length)
	      (implicit ord: Ordering[K], ctag: ClassTag[K]): RDD[T] = withScope {
	    this.keyBy[K](f)
	        .sortByKey(ascending, numPartitions)
	        .values
	  }
###3.2.2 使用RangePartitioner：org.apache.spark.rdd.OrderedRDDFunctions#sortByKey

	 def sortByKey(ascending: Boolean = true, numPartitions: Int = self.partitions.length)
	      : RDD[(K, V)] = self.withScope
	  {
	    val part = new RangePartitioner(numPartitions, self, ascending)
	    new ShuffledRDD[K, V, V](self, part)
	      .setKeyOrdering(if (ascending) ordering else ordering.reverse)
	  }

###3.3 转换：

 DataLoadProcessorStepOnSpark.convertTo3Parts会将数据转换为三部分：dimension、complex Dimension、measure


 // create new row of size 3 (1 for dims , 1 for high card , 1 for measures)

	   new Iterator[CarbonRow] {
	      override def hasNext: Boolean = rows.hasNext
	
	      override def next(): CarbonRow = {
	        val row =
	          new CarbonRow(SortStepRowUtil.convertRow(rows.next().getData, sortParameters))
	        rowCounter.add(1)
	        row
	      }
	    }

转换：

	  public static Object[] convertRow(Object[] data, SortParameters parameters) {
	    int measureCount = parameters.getMeasureColCount();
	    int dimensionCount = parameters.getDimColCount();
	    int complexDimensionCount = parameters.getComplexDimColCount();
	    int noDictionaryCount = parameters.getNoDictionaryCount();
	    boolean[] isNoDictionaryDimensionColumn = parameters.getNoDictionaryDimnesionColumn();
	
	    // create new row of size 3 (1 for dims , 1 for high card , 1 for measures)
	
	    Object[] holder = new Object[3];
	    int index = 0;
	    int nonDicIndex = 0;
	    int allCount = 0;
	    int[] dim = new int[dimensionCount];
	    byte[][] nonDicArray = new byte[noDictionaryCount + complexDimensionCount][];
	    Object[] measures = new Object[measureCount];
	    try {
	      // read dimension values
	      for (int i = 0; i < isNoDictionaryDimensionColumn.length; i++) {
	        if (isNoDictionaryDimensionColumn[i]) {
	          nonDicArray[nonDicIndex++] = (byte[]) data[i];
	        } else {
	          dim[index++] = (int) data[allCount];
	        }
	        allCount++;
	      }
	
	      for (int i = 0; i < complexDimensionCount; i++) {
	        nonDicArray[nonDicIndex++] = (byte[]) data[allCount];
	        allCount++;
	      }
	
	      index = 0;
	
	      // read measure values
	      for (int i = 0; i < measureCount; i++) {
	        measures[index++] = data[allCount];
	        allCount++;
	      }
	
	      NonDictionaryUtil.prepareOutObj(holder, dim, nonDicArray, measures);
	
	      // increment number if record read
	    } catch (Exception e) {
	      throw new RuntimeException("Problem while converting row ", e);
	    }
	
	    //return out row
	    return holder;
	  }

对于4,y,hangzhou,20这行数据

其中字符串y，hangzhou会存到nonDicArray中

4和20会存储到measures中

顺序：

NonDictionaryUtil.prepareOutObj(holder, dim, nonDicArray, measures);

	
	  public static void prepareOutObj(Object[] out, int[] dimArray, byte[][] byteBufferArr,
	      Object[] measureArray) {
	
	    out[WriteStepRowUtil.DICTIONARY_DIMENSION] = dimArray;
	    out[WriteStepRowUtil.NO_DICTIONARY_AND_COMPLEX] = byteBufferArr;
	    out[WriteStepRowUtil.MEASURE] = measureArray;
	
	  }
y和hangzhou对应的是：NO_DICTIONARY_AND_COMPLEX

结果：

	sortRDD
	[[I@2efc40f2, [[B@64996f50, [Ljava.lang.Object;@42c913c9]
	[[I@6cfb27cd, [[B@20cc1170, [Ljava.lang.Object;@f8019d6]
	[[I@c44a652, [[B@699acfd0, [Ljava.lang.Object;@1ca941ab]
	[[I@468c3ab7, [[B@6f536202, [Ljava.lang.Object;@5088c477]

##4.写入数据

    // 4. Write
    sc.runJob(sortRDD, (context: TaskContext, rows: Iterator[CarbonRow]) =>
      DataLoadProcessorStepOnSpark.writeFunc(rows, context.partitionId, modelBroadcast,
        writeStepRowCounter))

    // clean cache
    convertRDD.unpersist()

 - org.apache.carbondata.processing.loading.steps.DataWriterProcessorStepImpl#finish
     - org.apache.carbondata.processing.loading.steps.DataWriterProcessorStepImpl#processingComplete
      - org.apache.carbondata.processing.store.CarbonFactDataHandlerColumnar#closeHandler
         - org.apache.carbondata.processing.store.writer.v3.CarbonFactDataWriterImplV3#writeFooterToFile
             - org.apache.carbondata.processing.store.writer.v3.CarbonFactDataWriterImplV3#writeBlockletInfoToFile
            
写入blocklet：

	org.apache.carbondata.processing.store.writer.v3.CarbonFactDataWriterImplV3#writeBlockletInfoToFile


##5.更新参数

    // Update status
    if (partialSuccessAccum.value != 0) {
      val uniqueLoadStatusId = model.getTableName + CarbonCommonConstants.UNDERSCORE +
        "Partial_Success"
      val loadMetadataDetails = new LoadMetadataDetails()
      loadMetadataDetails.setLoadStatus(CarbonCommonConstants.STORE_LOADSTATUS_PARTIAL_SUCCESS)
      val executionErrors = new ExecutionErrors(FailureCauses.NONE, "")
      executionErrors.failureCauses = FailureCauses.BAD_RECORDS
      Array((uniqueLoadStatusId, (loadMetadataDetails, executionErrors)))
    } else {
      val uniqueLoadStatusId = model.getTableName + CarbonCommonConstants.UNDERSCORE + "Success"
      val loadMetadataDetails = new LoadMetadataDetails()
      loadMetadataDetails.setLoadStatus(CarbonCommonConstants.STORE_LOADSTATUS_SUCCESS)
      val executionErrors = new ExecutionErrors(FailureCauses.NONE, "")
      Array((uniqueLoadStatusId, (loadMetadataDetails, executionErrors)))
    }