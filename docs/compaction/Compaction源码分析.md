-Compaction源码分析

#一.背景
官方文档：
[http://carbondata.apache.org/data-management.html#compacting-data](http://carbondata.apache.org/data-management.html#compacting-data)

主要两个类型：minor和major

minor合并多个文件为一个文件，氛围level 1和level 2；  
parameter为carbon.compaction.level.threshold，默认为4，3

 - 即level 1中四个segments合并成一个新的segment； 
 - 在level 2，如果有level1新生成的segment有3个，则在level 2会再compact成一个新的segment

major是按大小进行合并，默认值为1024MB，如果没达到这个尺寸，会合并所有的segments，生成一个segment

#二.源码分析
##1.主要代码

	org.apache.spark.sql.execution.command.AlterTableCompaction
怎么到这个类就不分析了，参考其他blog   
这个类主要是初始化carbonLoadModel等   
然后执行：

	   CarbonDataRDDFactory
	          .alterTableForCompaction(sparkSession.sqlContext,
	            alterTableModel,
	            carbonLoadModel,
	            relation.tableMeta.storePath,
	            storeLocation
	          )

##2.alterTableForCompaction
	org.apache.carbondata.spark.rdd.CarbonDataRDDFactory#alterTableForCompaction
通过alter对compaction进行操作

 - 获取元数据metadata:org.apache.carbondata.core.statusmanager.LoadMetadataDetails;将tablestatus文件中错次加载的文件元数据读取到listOfLoadFolderDetailsArray
 - 生成compactionModel：org.apache.spark.sql.execution.command.CompactionModel$#apply
 - 获取锁：org.apache.carbondata.core.locks.CarbonLockFactory#getCarbonLockObj(org.apache.carbondata.core.metadata.CarbonTableIdentifier, java.lang.String)
 - 开始compaction：org.apache.carbondata.spark.rdd.CarbonDataRDDFactory$#startCompactionThreads

##3.startCompactionThreads
	org.apache.carbondata.spark.rdd.CarbonDataRDDFactory#startCompactionThreads
java.util.concurrent.Executors#newFixedThreadPool(int)

 - **加载元数据**：org.apache.carbondata.spark.util.CommonUtil#readLoadMetadataDetails，org.apache.carbondata.core.statusmanager.LoadMetadataDetails
 - executeCompaction:org.apache.carbondata.spark.rdd.DataManagementFunc$#executeCompaction
 - 异常处理
 - 删除：org.apache.carbondata.spark.rdd.DataManagementFunc$#deletePartialLoadsInCompaction

##executeCompaction
org.apache.carbondata.spark.rdd.DataManagementFunc#executeCompaction

 - 对metadata信息按照loadname排序：org.apache.carbondata.processing.merger.CarbonDataMergerUtil#sortSegments
 - 识别需要被merge 的：org.apache.carbondata.processing.merger.CarbonDataMergerUtil#identifySegmentsToBeMerged  
    - **再次排序**：org.apache.carbondata.processing.merger.CarbonDataMergerUtil#sortSegments 
    - 过滤掉保护的segment（carbon.numberof.preserve.segments指定）： 主要是按序删掉最新的numberOfSegmentsToBePreserved的segment： org.apache.carbondata.processing.merger.CarbonDataMergerUtil#checkPreserveSegmentsPropertyReturnRemaining
    - 根据时间识别需要merge的segment：通过getLoadStartTime删除掉：executeCompactionorg.apache.carbondata.processing.merger.CarbonDataMergerUtil#identifySegmentsToBeMergedBasedOnLoadedDate
    - 如果是major，会根据size识别需要merge的segment：org.apache.carbondata.processing.merger.CarbonDataMergerUtil#identifySegmentsToBeMergedBasedOnSize；**org.apache.carbondata.core.constants.CarbonCommonConstants#DEFAULT_COLLECTION_SIZE为16？**
      - 获取文件大小：org.apache.carbondata.processing.merger.CarbonDataMergerUtil#getSizeOfSegment
      - 按顺序（loadName排序），从前到后获取文件大小，如果文件超过要求的大小，则返回获取的segments，否则继续
      
 - 删除：org.apache.carbondata.spark.rdd.DataManagementFunc#deletePartialLoadsInCompaction
      -  org.apache.carbondata.spark.load.CarbonLoaderUtil#deletePartialLoadDataIfExist
         -  **再次获取元数据**：org.apache.carbondata.core.statusmanager.SegmentStatusManager#readLoadMetadata
 - 提交job：org.apache.carbondata.spark.rdd.DataManagementFunc$#scanSegmentsAndSubmitJob；调用org.apache.carbondata.spark.compaction.CompactionCallable#call运行**triggerCompaction**
 - 再次获取元数据：org.apache.carbondata.spark.util.CommonUtil$#readLoadMetadataDetails,**触发生成新的.1segment**
 - 如果是major，则filter出最新的：org.apache.carbondata.processing.merger.CarbonDataMergerUtil#filterOutNewlyAddedSegments
 - 识别出已经被merge的,**此时返回的时最新的segment**：org.apache.carbondata.processing.merger.CarbonDataMergerUtil#identifySegmentsToBeMerged
     


##4.org.apache.carbondata.spark.rdd.Compactor#triggerCompaction
 - 获取mergedLoadName：org.apache.carbondata.processing.merger.CarbonDataMergerUtil#getMergedLoadName(java.util.List<org.apache.carbondata.core.statusmanager.LoadMetadataDetails>); 默认是加.1
 - **再次获取元数据**：org.apache.carbondata.core.statusmanager.SegmentStatusManager#readLoadMetadata
 - 新建CarbonMergerRDD：org.apache.carbondata.spark.rdd.CarbonMergerRDD#CarbonMergerRDD



##5.org.apache.carbondata.spark.rdd.CarbonMergerRDD

org.apache.carbondata.spark.rdd.CarbonMergerRDD#internalCompute

 - 初始化：carbonLoadModel、segmentMapping，设置exec为org.apache.carbondata.processing.merger.CarbonCompactionExecutor#CarbonCompactionExecutor
 - 查询并获得结果fire a query and get the results：org.apache.carbondata.processing.merger.CarbonCompactionExecutor#processTableBlocks
 - 执行：org.apache.carbondata.processing.merger.CompactionResultSortProcessor#execute

##6.execute：org.apache.carbondata.processing.merger.CompactionResultSortProcessor#execute

	  public boolean execute(List<RawResultIterator> resultIteratorList) {
	    boolean isCompactionSuccess = false;
	    try {
	      initTempStoreLocation();
	      initSortDataRows();
	      initAggType();
	      processResult(resultIteratorList);
	      // After delete command, if no records are fetched from one split,
	      // below steps are not required to be initialized.
	      if (isRecordFound) {
	        initializeFinalThreadMergerForMergeSort();
	        initDataHandler();
	        readAndLoadDataFromSortTempFiles();
	      }
	      isCompactionSuccess = true;
	    } catch (Exception e) {
	      LOGGER.error(e, "Compaction failed: " + e.getMessage());
	    } finally {
	      // clear temp files and folders created during compaction
	      deleteTempStoreLocation();
	    }
	    return isCompactionSuccess;
	  }

##6.1 核心处理代码
	   
	  private void processResult(List<RawResultIterator> resultIteratorList) throws Exception {
	    for (RawResultIterator resultIterator : resultIteratorList) {
	      while (resultIterator.hasNext()) {
	        addRowForSorting(prepareRowObjectForSorting(resultIterator.next()));
	        isRecordFound = true;
	      }
	    }
	    try {
	      sortDataRows.startSorting();
	    } catch (CarbonSortKeyAndGroupByException e) {
	      LOGGER.error(e);
	      throw new Exception("Problem loading data during compaction: " + e.getMessage());
	    }
	  }

##6.1.1 addRowForSorting
将多个segment的数据逐行合并

然后进行排序

##6.1.2 sorting：
org.apache.carbondata.processing.sortandgroupby.sortdata.SortDataRows#startSorting

	   * Below method will be used to start storing process This method will get
	   * all the temp files present in sort temp folder then it will create the
	   * record holder heap and then it will read first record from each file and
	   * initialize the heap

	
	  if (this.entryCount > 0) {
	      Object[][] toSort;
	      toSort = new Object[entryCount][];
	      System.arraycopy(recordHolderList, 0, toSort, 0, entryCount);
	      if (parameters.getNumberOfNoDictSortColumns() > 0) {
	        Arrays.sort(toSort, new NewRowComparator(parameters.getNoDictionarySortColumn()));
	      } else {
	        Arrays.sort(toSort, new NewRowComparatorForNormalDims(parameters.getNumberOfSortColumns()));
	      }
  		recordHolderList = toSort;

###6.1.2.1 
compaction后sort：org.apache.carbondata.processing.sortandgroupby.sortdata.NewRowComparator#compare
###6.1.2.2
排完序之后再写入新文件：

	   // create new file and choose folder randomly
	      String[] tmpLocation = parameters.getTempFileLocation();
	      String locationChosen = tmpLocation[new Random().nextInt(tmpLocation.length)];
	      File file = new File(
	          locationChosen + File.separator + parameters.getTableName() +
	              System.nanoTime() + CarbonCommonConstants.SORT_TEMP_FILE_EXT);
	      writeDataTofile(recordHolderList, this.entryCount, file);


写入tmp文件的文件名：

	/tmp/991747682781728_0/default/compaction_globalsort/Fact/Part0/Segment_0.1/0/sortrowtmp/compaction_globalsort991867291360950.sorttemp


	  private void writeDataTofile(Object[][] recordHolderList, int entryCountLocal, File file)
	      throws CarbonSortKeyAndGroupByException {
	    // stream
	    if (parameters.isSortFileCompressionEnabled() || parameters.isPrefetch()) {
	      writeSortTempFile(recordHolderList, entryCountLocal, file);
	      return;
	    }
	    writeData(recordHolderList, entryCountLocal, file);

	  }

###6.1.2.3
写入临时文件：
org.apache.carbondata.processing.sort.sortdata.SortDataRows#writeData
	
	SZX1000323521:/david/xubo/git/carbondata # ll /tmp/991747682781728_0/default/compaction_globalsort/Fact/Part0/Segment_0.1/0/sortrowtmp/compaction_globalsort991867291360950.sorttemp
	ls: cannot access /tmp/991747682781728_0/default/compaction_globalsort/Fact/Part0/Segment_0.1/0/sortrowtmp/compaction_globalsort991867291360950.sorttemp: No such file or directory
	SZX1000323521:/david/xubo/git/carbondata # ll /tmp/991747682781728_0/default/compaction_globalsort/Fact/Part0/Segment_0.1/0/sortrowtmp/compaction_globalsort991867291360950.sorttemp
	-rw-r--r-- 1 root root 0 Oct 13 21:52 /tmp/991747682781728_0/default/compaction_globalsort/Fact/Part0/Segment_0.1/0/sortrowtmp/compaction_globalsort991867291360950.sorttemp
	SZX1000323521:/david/xubo/git/carbondata # 


内容：

	^@^@^@^H^@^Aa^@^Ewuhan^A^@^@^@
	^A^@^@^@
	^@^Aa^@^Ewuhan^A^@^@^@
	^A^@^@^@
	^@^Ad^@^Hshenzhen^A^@^@^@^A^A^@^@^@(^@^Ad^@^Hshenzhen^A^@^@^@^A^A^@^@^@(^@^Ay^@^Hhangzhou^A^@^@^@^D^A^@^@^@^T^@^Ay^@^Hhangzhou^A^@^@^@^D^A^@^@^@^T^@^Az^@^Gbeijing^A^@^@^@^G^A^@^@^@^^^@^Az^@^Gbeijing^A^@^@^@^G^A^@^@^@^^
	~                                                                                                                                                                                                                             
##6.1.3

	 if (isRecordFound) {
	        initializeFinalThreadMergerForMergeSort();
	        initDataHandler();
	        readAndLoadDataFromSortTempFiles();
	      }

###6.1.3.1 创建 finalThread merger
	  /**
	   * create an instance of finalThread merger which will perform merge sort on all the
	   * sort temp files
	   */
	  private void initializeFinalThreadMergerForMergeSort() {
	    boolean[] noDictionarySortColumnMapping = null;
	    if (noDictionaryColMapping.length == this.segmentProperties.getNumberOfSortColumns()) {
	      noDictionarySortColumnMapping = noDictionaryColMapping;
	    } else {
	      noDictionarySortColumnMapping = new boolean[this.segmentProperties.getNumberOfSortColumns()];
	      System.arraycopy(noDictionaryColMapping, 0,
	          noDictionarySortColumnMapping, 0, noDictionarySortColumnMapping.length);
	    }
	
	    String[] sortTempFileLocation = CarbonDataProcessorUtil.arrayAppend(tempStoreLocation,
	        CarbonCommonConstants.FILE_SEPARATOR, CarbonCommonConstants.SORT_TEMP_FILE_LOCATION);
	    finalMerger =
	        new SingleThreadFinalSortFilesMerger(sortTempFileLocation, tableName, dimensionColumnCount,
	            segmentProperties.getComplexDimensions().size(), measureCount, noDictionaryCount,
	            dataTypes, noDictionaryColMapping, noDictionarySortColumnMapping);
	  }

获取所有的临时文件位置

###6.1.3.2 初始化data handler
	 /**
	   * initialise carbon data writer instance
	   */
	  private void initDataHandler() throws Exception {
	    CarbonFactDataHandlerModel carbonFactDataHandlerModel = CarbonFactDataHandlerModel
	        .getCarbonFactDataHandlerModel(carbonLoadModel, carbonTable, segmentProperties, tableName,
	            tempStoreLocation);
	    setDataFileAttributesInModel(carbonLoadModel, compactionType, carbonTable,
	        carbonFactDataHandlerModel);
	    dataHandler = CarbonFactHandlerFactory.createCarbonFactHandler(carbonFactDataHandlerModel,
	        CarbonFactHandlerFactory.FactHandlerType.COLUMNAR);
	    try {
	      dataHandler.initialise();
	    } catch (CarbonDataWriterException e) {
	      LOGGER.error(e);
	      throw new Exception("Problem initialising data handler during compaction: " + e.getMessage());
	    }
	  }

carbonFactDataHandlerModel初始化时sort_scope为null

###6.1.3.3 会从临时文件中读取和加载数据：
org.apache.carbondata.processing.merger.CompactionResultSortProcessor#readAndLoadDataFromSortTempFiles

	  /**
	   * This method will read sort temp files, perform merge sort and add it to store for data loading
	   */
	  private void readAndLoadDataFromSortTempFiles() throws Exception {
	    try {
	      intermediateFileMerger.finish();
	      finalMerger.startFinalMerge();
	      while (finalMerger.hasNext()) {
	        Object[] row = finalMerger.next();
	        dataHandler.addDataToStore(new CarbonRow(row));
	      }
	      dataHandler.finish();
	    } catch (CarbonDataWriterException e) {
	      LOGGER.error(e);
	      throw new Exception("Problem loading data during compaction: " + e.getMessage());
	    } catch (Exception e) {
	      LOGGER.error(e);
	      throw new Exception("Problem loading data during compaction: " + e.getMessage());
	    } finally {
	      if (null != dataHandler) {
	        try {
	          dataHandler.closeHandler();
	        } catch (CarbonDataWriterException e) {
	          LOGGER.error(e);
	          throw new Exception("Problem loading data during compaction: " + e.getMessage());
	        }
	      }
	    }
	  }

逐行写入数据：

	 	while (finalMerger.hasNext()) {
		        Object[] row = finalMerger.next();
		        dataHandler.addDataToStore(new CarbonRow(row));
		      }

org.apache.carbondata.processing.store.CarbonFactDataHandlerColumnar#addDataToStore



###写入文件触发：
org.apache.carbondata.processing.store.CarbonFactDataHandlerColumnar#closeHandler

	  /**
	   * below method will be used to close the handler
	   */
	  public void closeHandler() throws CarbonDataWriterException {
	    if (null != this.dataWriter) {
	      // wait until all blocklets have been finished writing
	      while (blockletProcessingCount.get() > 0) {
	        try {
	          Thread.sleep(50);
	        } catch (InterruptedException e) {
	          throw new CarbonDataWriterException(e.getMessage());
	        }
	      }
	      consumerExecutorService.shutdownNow();
	      processWriteTaskSubmitList(consumerExecutorServiceTaskList);
	      this.dataWriter.writeFooterToFile();
	      LOGGER.info("All blocklets have been finished writing");
	      // close all the open stream for both the files
	      this.dataWriter.closeWriter();
	    }
	    this.dataWriter = null;
	  }

具体执行：

     this.dataWriter.writeFooterToFile();
      LOGGER.info("All blocklets have been finished writing");
      // close all the open stream for both the files
      this.dataWriter.closeWriter();