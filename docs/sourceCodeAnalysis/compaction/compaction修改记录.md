##major compaction
major compaction默认是1024M：
	
	***:/***/xubo/git/carbondata # du -sh /***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/*
	69M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_0
	961M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_0.1
	303M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_1
	226M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_2
	381M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_3
	150M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_4


只有四个被合并：

	+-----------------+---------+--------------------+--------------------+
	|SegmentSequenceId|   Status|     Load Start Time|       Load End Time|
	+-----------------+---------+--------------------+--------------------+
	|                4|  Success|2017-09-15 00:46:...|2017-09-15 00:47:...|
	|                3|Compacted|2017-09-15 00:43:...|2017-09-15 00:46:...|
	|                2|Compacted|2017-09-15 00:42:...|2017-09-15 00:43:...|
	|                1|Compacted|2017-09-15 00:39:...|2017-09-15 00:42:...|
	|              0.1|  Success|2017-09-15 00:47:...|2017-09-15 00:48:...|
	|                0|Compacted|2017-09-15 00:39:...|2017-09-15 00:39:...|
	+-----------------+---------+--------------------+--------------------+

原文件：

	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/compaction/carbondata/integration/spark-common-test/src/test/resources/compaction/compactionSupportGlobalSort/bigFile
	total 2.2G
	-rw-r--r-- 1 root root 135M Sep 15 15:52 sample1.csv
	-rw-r--r-- 1 root root 588M Sep 15 15:52 sample2.csv
	-rw-r--r-- 1 root root 446M Sep 15 15:52 sample3.csv
	-rw-r--r-- 1 root root 750M Sep 15 15:52 sample4.csv
	-rw-r--r-- 1 root root 294M Sep 15 15:52 sample5.csv

应该是按压缩后的大小进行compacted

###将文件增大：

	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/compaction/carbondata/integration/spark-common-test/src/test/resources/compaction/compactionSupportGlobalSort/bigFile
	total 3.6G
	-rw-r--r-- 1 root root 218M Sep 15 16:27 sample1.csv
	-rw-r--r-- 1 root root 959M Sep 15 16:27 sample2.csv
	-rw-r--r-- 1 root root 719M Sep 15 16:27 sample3.csv
	-rw-r--r-- 1 root root 1.2G Sep 15 16:28 sample4.csv
	-rw-r--r-- 1 root root 507M Sep 15 16:28 sample5.csv
	***:/***/xubo/git/carbondata # du -sh /***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/*
	112M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_0
	954M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_0.1
	490M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_1
	366M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_2
	615M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_3
	852M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_3.1
	242M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_4

详细的文件大小：

	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_0.1
	total 954M
	-rw-r--r-- 1 root root 687 Sep 15 16:47 0_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 707 Sep 15 16:47 10_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 705 Sep 15 16:47 11_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 705 Sep 15 16:47 12_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 707 Sep 15 16:47 13_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 703 Sep 15 16:48 14_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 707 Sep 15 16:48 15_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 704 Sep 15 16:48 16_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 704 Sep 15 16:48 17_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 702 Sep 15 16:48 18_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 704 Sep 15 16:48 19_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 700 Sep 15 16:47 1_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 702 Sep 15 16:48 20_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 703 Sep 15 16:48 21_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 702 Sep 15 16:48 22_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 702 Sep 15 16:48 23_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 700 Sep 15 16:48 24_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 705 Sep 15 16:48 25_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 697 Sep 15 16:48 26_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 708 Sep 15 16:48 27_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 709 Sep 15 16:48 28_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 709 Sep 15 16:48 29_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 707 Sep 15 16:47 2_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 708 Sep 15 16:47 3_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 708 Sep 15 16:47 4_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 708 Sep 15 16:47 5_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 704 Sep 15 16:47 6_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 706 Sep 15 16:47 7_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 703 Sep 15 16:47 8_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 705 Sep 15 16:47 9_batchno0-0-1505465237629.carbonindex
	-rw-r--r-- 1 root root 49M Sep 15 16:47 part-0-0_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 33M Sep 15 16:47 part-0-10_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 27M Sep 15 16:47 part-0-11_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 44M Sep 15 16:47 part-0-12_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 31M Sep 15 16:47 part-0-13_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 32M Sep 15 16:48 part-0-14_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 38M Sep 15 16:48 part-0-15_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 20M Sep 15 16:48 part-0-16_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 19M Sep 15 16:48 part-0-17_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 15M Sep 15 16:48 part-0-18_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 17M Sep 15 16:48 part-0-19_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 44M Sep 15 16:47 part-0-1_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 13M Sep 15 16:48 part-0-20_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 17M Sep 15 16:48 part-0-21_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 15M Sep 15 16:48 part-0-22_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 42M Sep 15 16:48 part-0-23_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 50M Sep 15 16:48 part-0-24_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 46M Sep 15 16:48 part-0-25_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 55M Sep 15 16:48 part-0-26_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 29M Sep 15 16:48 part-0-27_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 32M Sep 15 16:48 part-0-28_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 38M Sep 15 16:48 part-0-29_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 29M Sep 15 16:47 part-0-2_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 31M Sep 15 16:47 part-0-3_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 32M Sep 15 16:47 part-0-4_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 37M Sep 15 16:47 part-0-5_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 38M Sep 15 16:47 part-0-6_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 36M Sep 15 16:47 part-0-7_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 28M Sep 15 16:47 part-0-8_batchno0-0-1505465237629.carbondata
	-rw-r--r-- 1 root root 31M Sep 15 16:47 part-0-9_batchno0-0-1505465237629.carbondata


##把文件变小
默认compaction大小变小：
默认改为了10M

	  private def resetConf(size:String) {
	    CarbonProperties.getInstance()
	      .addProperty(CarbonCommonConstants.MAJOR_COMPACTION_SIZE, size)
	  }

运行记录：

	***:/ # du -sh /***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/*
	1.1M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_0
	7.9M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_0.1
	4.1M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_1
	3.1M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_2
	5.2M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_3
	7.1M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_3.1
	2.1M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_4
	***:/ # du -sh /***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/*
	1.9M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_0
	9.6M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_0.1
	7.8M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_1
	5.9M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_2
	9.8M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_3
	3.9M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_4
	***:/ # du -sh /***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/*
	1.9M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_0
	9.6M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_0.1
	7.8M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_1
	5.9M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_2
	9.4M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_2.1
	3.9M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_3
	3.9M	/***/xubo/git/compaction/carbondata/integration/spark-common/target/warehouse/default/compaction_globalsort/Fact/Part0/Segment_4
