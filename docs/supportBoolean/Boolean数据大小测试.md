#1. 1100万条数据，多数据类型,SNAPPY压缩
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
	
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFile.csv
	-rw-r--r-- 1 root root 421M Sep 29 20:03 /***/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFile.csv
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	-rw-r--r-- 1 root root 54M Sep 29 20:03 /***/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno0-0-1506686631303.carbondata
	-rw-r--r-- 1 root root 122M Sep 29 20:04 /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno0-0-1506686631303.carbondata
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/0_batchno0-0-1506686631303.carbonindex
	-rw-r--r-- 1 root root 1.3K Sep 29 20:04 /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/0_batchno0-0-1506686631303.carbonindex
	***:/***/xubo/git/carbondata # du -sh /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	123M	/***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table

421M=>123M  =3.422764228


#2. 1.1亿条数据，多数据类型,SNAPPY压缩
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
	
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFile.csv
	-rw-r--r-- 1 root root 4.5G Sep 29 20:07 /***/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFile.csv
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	-rw-r--r-- 1 root root 535M Sep 29 20:07 /***/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	***:/***/xubo/git/carbondata # du -sh /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	1.4G	/***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno0-0-1506686882274.carbondata
	-rw-r--r-- 1 root root 776M Sep 29 20:11 /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno0-0-1506686882274.carbondata
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-1-0_batchno0-0-1506686882274.carbondata
	-rw-r--r-- 1 root root 557M Sep 29 20:12 /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-1-0_batchno0-0-1506686882274.carbondata
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/0_batchno0-0-1506686882274.carbonindex
	-rw-r--r-- 1 root root 6.6K Sep 29 20:12 /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/0_batchno0-0-1506686882274.carbonindex

4.5G =》1.4G   =3.214285714

776+557M=1333M
#3. 1100万条数据，只有Boolean,SNAPPY压缩
##代码

	  sql(
      s"""
         | CREATE TABLE boolean_table(
         | booleanField BOOLEAN
         | )
         | STORED BY 'carbondata'
       """.stripMargin)

##结果
	
	***:/***/xubo/git/carbondata # du -sh /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	584K	/***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	-rw-r--r-- 1 root root 54M Sep 29 20:21 /***/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFile.csv
	-rw-r--r-- 1 root root 421M Sep 29 20:21 /***/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFile.csv
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno0-0-1506687690177.carbondata
	-rw-r--r-- 1 root root 274K Sep 29 20:21 /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno0-0-1506687690177.carbondata
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno1-0-1506687690177.carbondata
	-rw-r--r-- 1 root root 264K Sep 29 20:21 /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno1-0-1506687690177.carbondata

54M=》 584k =92.46575342



#4. 1.1亿条数据，只有Boolean,SNAPPY压缩
##代码

	  sql(
      s"""
         | CREATE TABLE boolean_table(
         | booleanField BOOLEAN
         | )
         | STORED BY 'carbondata'
       """.stripMargin)

##结果
	
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	-rw-r--r-- 1 root root 535M Sep 29 20:17 /***/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno0-0-1506687483483.carbondata
	-rw-r--r-- 1 root root 2.8M Sep 29 20:18 /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno0-0-1506687483483.carbondata
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno1-0-1506687483483.carbondata
	-rw-r--r-- 1 root root 2.6M Sep 29 20:18 /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table/Fact/Part0/Segment_0/part-0-0_batchno1-0-1506687483483.carbondata
	***:/***/xubo/git/carbondata # du -sh /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	5.3M	/***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	***:/***/xubo/git/carbondata # ll -h /***/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFile.csv
	-rw-r--r-- 1 root root 4.5G Sep 29 20:17 /***/xubo/git/carbondata/integration/spark-common-test/src/test/resources/bool/supportBooleanBigFile.csv


535M => 5.3M  =100.9433962

#5. 11亿条数据，只有Boolean,SNAPPY压缩
##代码

	  sql(
      s"""
         | CREATE TABLE boolean_table(
         | booleanField BOOLEAN
         | )
         | STORED BY 'carbondata'
       """.stripMargin)

##结果

	***:/***/xubo/git # ll -h /***/xubo/git/carbondata/integration/spark2/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	-rw-r--r-- 1 root root 5.3G Sep 30 15:47 /***/xubo/git/carbondata/integration/spark2/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	***:/***/xubo/git # ll /***/xubo/git/carbondata/integration/spark2/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	-rw-r--r-- 1 root root 5600000000 Sep 30 15:47 /***/xubo/git/carbondata/integration/spark2/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	***:/***/xubo/git # du -sh /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	53M	/***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	***:/***/xubo/git # du -s /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	53748	/***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table

5600000000/53748

5.3G/ 53M  = 102.4


##RLE压缩

#6. 1.1亿条数据，只有Boolean,RLE压缩
##代码

	  sql(
      s"""
         | CREATE TABLE boolean_table(
         | booleanField BOOLEAN
         | )
         | STORED BY 'carbondata'
       """.stripMargin)

##结果

	***:/***/xubo/git # ll -h /***/xubo/git/carbondata/integration/spark2/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	-rw-r--r-- 1 root root 535M Sep 30 16:09 /***/xubo/git/carbondata/integration/spark2/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	***:/***/xubo/git # du -sh /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	352K	/***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	***:/***/xubo/git # 


535M/352K  = 1556.363636



#7. 11亿条数据，只有Boolean,SNAPPY压缩
##代码

	  sql(
      s"""
         | CREATE TABLE boolean_table(
         | booleanField BOOLEAN
         | )
         | STORED BY 'carbondata'
       """.stripMargin)

##结果

	***:/***/xubo/git # ll -h /***/xubo/git/carbondata/integration/spark2/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	-rw-r--r-- 1 root root 5.3G Sep 30 16:11 /***/xubo/git/carbondata/integration/spark2/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv
	***:/***/xubo/git # du -sh /***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table
	3.1M	/***/xubo/git/carbondata/integration/spark-common/target/warehouse/default/boolean_table

5.3G/3.1M = 1750.709677
