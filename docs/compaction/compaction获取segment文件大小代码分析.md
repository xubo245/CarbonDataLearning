

compaction获取segment文件大小代码分析：
##分析:
实际是获取data文件大小

org.apache.carbondata.processing.merger.CarbonDataMergerUtil#getSizeOfSegment

org.apache.carbondata.processing.merger.CarbonDataMergerUtil#getSizeOfFactFileInLoad

/david/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_0/part-0-0_batchno0-0-1507879161916.carbondata

然后再通过File.length方法获取

	  @Override public long getSize() {
	    return file.length();
	  }
	
1012



##确认：

	SZX1000323521:/david/xubo/git/compaction/carbondata # 
	SZX1000323521:/david/xubo/git/compaction/carbondata # ll /david/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_0/part-0-0_batchno0-0-1507879161916.carbondata
	-rw-r--r-- 1 root root 1012 Oct 13 15:19 /david/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_0/part-0-0_batchno0-0-1507879161916.carbondata
	SZX1000323521:/david/xubo/git/compaction/carbondata # ll -h /david/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_0/part-0-0_batchno0-0-1507879161916.carbondata
	-rw-r--r-- 1 root root 1012 Oct 13 15:19 /david/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_0/part-0-0_batchno0-0-1507879161916.carbondata
	SZX1000323521:/david/xubo/git/compaction/carbondata #
