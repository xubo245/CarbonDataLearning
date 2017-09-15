
##报错：

	Compaction type: minor, < default segments in level 1, not compact *** FAILED ***[0m
	[31m  "2Success2017-09-15 06:58:12.1342017-09-15 06:58:12.1951Compacted2017-09-15 06:58:12.0612017-09-15 06:58:12.1230.1Success2017-09-15 06:58:12.2412017-09-15 06:58:12.2760Compacted2017-09-15 06:58:11.9872017-09-15 06:58:12.051" contained "Compacted" Failed for [SegmentSequenceId: string, Status: string ... 2 more fields] (Compacted existed in the result) (QueryTest.scala:56)[0m
	[31m- Compaction type: minor, >= default segments and < (default segments)*2 in level 1, compact once *** FAILED ***[0m
	[31m  Object;(5, 4.1, 4, 3, 2.1, 2, 1, 0.2, 0.1, 0) contained "4.1" (CompactionSupportGlobalSortFunctionTest.scala:141)[0m
	[31m- Compaction type: minor, >= default segments in level 1,compact twice in level 1 *** FAILED ***[0m
	[31m  Object;(8, 7, 6.1, 6, 5, 4.2, 4.1, 4, 3, 2.1, 2, 1, 0.2, 0.1, 0) contained "0.2" (CompactionSupportGlobalSortFunctionTest.scala:176)[0m
	[31m- Compaction type: minor, >= compacted segments in level 2,compact once in level 2 *** FAILED ***[0m
	[31m  Array("11", "10.1", "10", "9", "8.2", "8.1", "8", "7", "6.1", "6", "5", "4.2", "4.1", "4", "3", "2.1", "2", "1", "0.2", "0.1", "0") had length 21 instead of expected length 16 (CompactionSupportGlobalSortFunctionTest.scala:212)[0m
	[32m- Compaction: clean files, major[0m


##问题分析：
本地单个Test文件测试没问题

默认minor的carbon.compaction.level.threshold为4,3，在其他类改成了2，2，需要改回来

##问题解决

	 override def beforeEach {
	    resetConf
	}
	
	
	  private def resetConf() {
	    val prop = CarbonProperties.getInstance()
	    prop.addProperty(CarbonCommonConstants.LOAD_SORT_SCOPE, CarbonCommonConstants.LOAD_SORT_SCOPE_DEFAULT)
	    prop.addProperty(CarbonCommonConstants.LOAD_GLOBAL_SORT_PARTITIONS, CarbonCommonConstants.LOAD_GLOBAL_SORT_PARTITIONS_DEFAULT)
	    prop.addProperty(CarbonCommonConstants.COMPACTION_SEGMENT_LEVEL_THRESHOLD, CarbonCommonConstants.DEFAULT_SEGMENT_LEVEL_THRESHOLD)
	  }