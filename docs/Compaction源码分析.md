-Compaction源码分析

###一.背景
官方文档：
[http://carbondata.apache.org/data-management.html#compacting-data](http://carbondata.apache.org/data-management.html#compacting-data)

主要两个类型：minor和major

minor合并多个文件为一个文件，氛围level 1和level 2；  
parameter为carbon.compaction.level.threshold，默认为4，3

 - 即level 1中四个segments合并成一个新的segment； 
 - 在level 2，如果有level1新生成的segment有3个，则在level 2会再compact成一个新的segment

major是按大小进行合并，默认打下为1024MB，如果没达到这个尺寸，会合并所有的segments，生成一个segment

###二.源码分析
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

 - 按照loadname排序：org.apache.carbondata.processing.merger.CarbonDataMergerUtil#sortSegments
 - 识别需要被merge 的：org.apache.carbondata.processing.merger.CarbonDataMergerUtil#identifySegmentsToBeMerged  
    - **再次排序**：org.apache.carbondata.processing.merger.CarbonDataMergerUtil#sortSegments 
    - 根据时间识别需要merge的segment：executeCompactionorg.apache.carbondata.processing.merger.CarbonDataMergerUtil#identifySegmentsToBeMergedBasedOnLoadedDate
    - 如果是major，会根据size识别需要merge的segment：org.apache.carbondata.processing.merger.CarbonDataMergerUtil#identifySegmentsToBeMergedBasedOnSize；**org.apache.carbondata.core.constants.CarbonCommonConstants#DEFAULT_COLLECTION_SIZE为16？**
      - 获取文件大小：org.apache.carbondata.processing.merger.CarbonDataMergerUtil#getSizeOfSegment
      - 按顺序（loadName排序），从前到后获取文件大小，如果文件超过要求的大小，则返回获取的segments，否则继续
      
 - 删除：org.apache.carbondata.spark.rdd.DataManagementFunc#deletePartialLoadsInCompaction
      -  org.apache.carbondata.spark.load.CarbonLoaderUtil#deletePartialLoadDataIfExist
         -  **再次获取元数据**：org.apache.carbondata.core.statusmanager.SegmentStatusManager#readLoadMetadata
 - 提交job：org.apache.carbondata.spark.rdd.DataManagementFunc$#scanSegmentsAndSubmitJob；调用org.apache.carbondata.spark.compaction.CompactionCallable#call运行triggerCompaction
 - 再次获取元数据：org.apache.carbondata.spark.util.CommonUtil$#readLoadMetadataDetails,**触发生成新的.1segment**
 - 如果是major，则filter出最新的：org.apache.carbondata.processing.merger.CarbonDataMergerUtil#filterOutNewlyAddedSegments
 - 识别出已经被merge的,**此时返回的时最新的segment**：org.apache.carbondata.processing.merger.CarbonDataMergerUtil#identifySegmentsToBeMerged
     


##4.org.apache.carbondata.spark.rdd.Compactor#triggerCompaction
 - 获取mergedLoadName：org.apache.carbondata.processing.merger.CarbonDataMergerUtil#getMergedLoadName(java.util.List<org.apache.carbondata.core.statusmanager.LoadMetadataDetails>); 默认是加.1
 - **再次获取元数据**：org.apache.carbondata.core.statusmanager.SegmentStatusManager#readLoadMetadata
 - 新建CarbonMergerRDD：org.apache.carbondata.spark.rdd.CarbonMergerRDD#CarbonMergerRDD



##5.org.apache.carbondata.spark.rdd.CarbonMergerRDD


执行：org.apache.carbondata.processing.merger.CompactionResultSortProcessor#execute