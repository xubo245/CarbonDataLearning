

##问题
	org.apache.carbondata.processing.newflow.steps.DataConverterProcessorStepImpl#processRowBatch

当为非法字符的时候，localConverter.convert(rowBatch.next())返回的是null，newBatch里面的数据还是9个，size增加

	protected CarbonRowBatch processRowBatch(CarbonRowBatch rowBatch, RowConverter localConverter) {
	    CarbonRowBatch newBatch = new CarbonRowBatch(rowBatch.getSize());
	    while (rowBatch.hasNext()) {
	      newBatch.addRow(localConverter.convert(rowBatch.next()));
	    }
	    rowCounter.getAndAdd(newBatch.getSize());
	    return newBatch;


报错位置：


org.apache.carbondata.processing.newflow.steps.CarbonRowDataWriterProcessorStepImpl#convertRow

    Object[] measures = new Object[measureCount];
    for (int i = 0; i < this.measureCount; i++) {
      measures[i] = row.getObject(i + this.dimensionWithComplexCount);
    }


##问题分析

差别

纯Boolean类型没有sort，所以默认的DataLoad不走SortIteratorThread.run( public class ParallelReadMergeSorterImpl)

其中有个buffer会过滤null值

org.apache.carbondata.processing.newflow.DataLoadProcessBuilder#build：

	  public AbstractDataLoadProcessorStep build(CarbonLoadModel loadModel, String[] storeLocation,
	      CarbonIterator[] inputIterators) throws Exception {
	    CarbonDataLoadConfiguration configuration = createConfiguration(loadModel, storeLocation);
	    SortScopeOptions.SortScope sortScope = CarbonDataProcessorUtil.getSortScope(configuration);
	    if (!configuration.isSortTable() || sortScope.equals(SortScopeOptions.SortScope.NO_SORT)) {
	      return buildInternalForNoSort(inputIterators, configuration);
	    } else if (configuration.getBucketingInfo() != null) {
	      return buildInternalForBucketing(inputIterators, configuration);
	    } else if (sortScope.equals(SortScopeOptions.SortScope.BATCH_SORT)) {
	      return buildInternalForBatchSort(inputIterators, configuration);
	    } else {
	      return buildInternal(inputIterators, configuration);
	    }
	  }

 - org.apache.carbondata.processing.newflow.DataLoadProcessBuilder#buildInternal
 - org.apache.carbondata.processing.newflow.steps.SortProcessorStepImpl
 - org.apache.carbondata.processing.newflow.steps.SortProcessorStepImpl#initialize
 - org.apache.carbondata.processing.newflow.sort.SorterFactory#createSorter
 - org.apache.carbondata.processing.newflow.sort.impl.ParallelReadMergeSorterImpl
 - org.apache.carbondata.processing.newflow.sort.impl.ParallelReadMergeSorterImpl.SortIteratorThread#run
 
该run方法为：

	   public void run() {
	      try {
	        while (iterator.hasNext()) {
	          CarbonRowBatch batch = iterator.next();
	          int i = 0;
	          while (batch.hasNext()) {
	            CarbonRow row = batch.next();
	            if (row != null) {
	              buffer[i++] = row.getData();
	            }
	          }
	          if (i > 0) {
	            sortDataRows.addRowBatch(buffer, i);
	            rowCounter.getAndAdd(i);
	          }
	        }
	      } catch (Exception e) {
	        LOGGER.error(e);
	        observer.notifyFailed(e);
	      }
	    }

会将为null的值去掉，避免空指针异常