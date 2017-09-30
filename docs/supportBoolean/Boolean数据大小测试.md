#1. 1100万条数据，多数据类型
##代码

	  sql(
	      s"""
	         | CREATE TABLE boolean_table(
	         | intField INT,
	         | booleanField BOOLEAN,
	         | stringField STRING,
	         | doubleField DOUBLE,
	         | booleanField2 BOOLEAN
	         | )
	         | STORED BY 'carbondata'
	       """.stripMargin)

##结果
	
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFile.csv
	-rw-r--r-- 1 root root 421M Sep 29 20:03 /david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFile.csv
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	-rw-r--r-- 1 root root 54M Sep 29 20:03 /david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno0-0-1506686631303.carbondata
	-rw-r--r-- 1 root root 122M Sep 29 20:04 /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno0-0-1506686631303.carbondata
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/0_batchno0-0-1506686631303.carbonindex
	-rw-r--r-- 1 root root 1.3K Sep 29 20:04 /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/0_batchno0-0-1506686631303.carbonindex
	SZX1000323521:/david/xubo/git/carbondata # du -sh /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	123M	/david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table

421M=>123M  =3.422764228


#2. 1.1亿条数据，多数据类型
##代码

	  sql(
	      s"""
	         | CREATE TABLE boolean_table(
	         | intField INT,
	         | booleanField BOOLEAN,
	         | stringField STRING,
	         | doubleField DOUBLE,
	         | booleanField2 BOOLEAN
	         | )
	         | STORED BY 'carbondata'
	       """.stripMargin)

##结果
	
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFile.csv
	-rw-r--r-- 1 root root 4.5G Sep 29 20:07 /david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFile.csv
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	-rw-r--r-- 1 root root 535M Sep 29 20:07 /david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	SZX1000323521:/david/xubo/git/carbondata # du -sh /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	1.4G	/david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno0-0-1506686882274.carbondata
	-rw-r--r-- 1 root root 776M Sep 29 20:11 /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno0-0-1506686882274.carbondata
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-1-0_batchno0-0-1506686882274.carbondata
	-rw-r--r-- 1 root root 557M Sep 29 20:12 /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-1-0_batchno0-0-1506686882274.carbondata
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/0_batchno0-0-1506686882274.carbonindex
	-rw-r--r-- 1 root root 6.6K Sep 29 20:12 /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/0_batchno0-0-1506686882274.carbonindex

4.5G =》1.4G   =3.214285714

776+557M=1333M
#3. 1100万条数据，只有Boolean
##代码

	  sql(
      s"""
         | CREATE TABLE boolean_table(
         | booleanField BOOLEAN
         | )
         | STORED BY 'carbondata'
       """.stripMargin)

##结果
	
	SZX1000323521:/david/xubo/git/carbondata # du -sh /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	584K	/david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	-rw-r--r-- 1 root root 54M Sep 29 20:21 /david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFile.csv
	-rw-r--r-- 1 root root 421M Sep 29 20:21 /david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFile.csv
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno0-0-1506687690177.carbondata
	-rw-r--r-- 1 root root 274K Sep 29 20:21 /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno0-0-1506687690177.carbondata
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno1-0-1506687690177.carbondata
	-rw-r--r-- 1 root root 264K Sep 29 20:21 /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno1-0-1506687690177.carbondata

54M=》 584k =92.46575342



#4. 1.1亿条数据，只有Boolean
##代码

	  sql(
      s"""
         | CREATE TABLE boolean_table(
         | booleanField BOOLEAN
         | )
         | STORED BY 'carbondata'
       """.stripMargin)

##结果
	
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	-rw-r--r-- 1 root root 535M Sep 29 20:17 /david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno0-0-1506687483483.carbondata
	-rw-r--r-- 1 root root 2.8M Sep 29 20:18 /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno0-0-1506687483483.carbondata
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno1-0-1506687483483.carbondata
	-rw-r--r-- 1 root root 2.6M Sep 29 20:18 /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno1-0-1506687483483.carbondata
	SZX1000323521:/david/xubo/git/carbondata # du -sh /david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	5.3M	/david/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	SZX1000323521:/david/xubo/git/carbondata # ll -h /david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFile.csv
	-rw-r--r-- 1 root root 4.5G Sep 29 20:17 /david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFile.csv


535M => 5.3M  =100.9433962

