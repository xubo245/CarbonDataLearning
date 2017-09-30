	
为什么字典编码DICTIONARY_INCLUDE支持date，而DICTIONARY_EXCLUDE不行？
	
	DICTIONARY_EXCLUDE is unsupported for date data type column: datefield
	org.apache.carbondata.spark.exception.MalformedCarbonCommandException: DICTIONARY_EXCLUDE is unsupported for date data type column: datefield
		at org.apache.spark.sql.catalyst.CarbonDDLSqlParser$$anonfun$extractDimAndMsrFields$4.apply(CarbonDDLSqlParser.scala:591)
		at org.apache.spark.sql.catalyst.CarbonDDLSqlParser$$anonfun$extractDimAndMsrFields$4.apply(CarbonDDLSqlParser.scala:576)
		at scala.collection.IndexedSeqOptimized$class.foreach(IndexedSeqOptimized.scala:33)
		at scala.collection.mutable.ArrayOps$ofRef.foreach(ArrayOps.scala:186)


##代码：
org.apache.carbondata.spark.testsuite.booleantype.BooleanDataTypesLoadTest

	  test("Loading table: DICTIONARY_EXCLUDE,support boolean and other data type") {
	    sql(
	      s"""
	         | CREATE TABLE boolean_table(
	         | shortField SHORT,
	         | booleanField BOOLEAN,
	         | intField INT,
	         | bigintField LONG,
	         | doubleField DOUBLE,
	         | stringField STRING,
	         | timestampField TIMESTAMP,
	         | decimalField DECIMAL(18,2),
	         | dateField DATE,
	         | charField CHAR(5),
	         | floatField FLOAT,
	         | complexData ARRAY<STRING>,
	         | booleanField2 BOOLEAN
	         | )
	         | STORED BY 'carbondata'
	         | TBLPROPERTIES('sort_columns'='','DICTIONARY_EXCLUDE'='dateField,charField','TABLE_BLOCKSIZE'='512')
	       """.stripMargin)
	
	    val storeLocation = s"$rootPath/integration/spark-common-test/src/test/resources/bool/supportBoolean.csv"
	    sql(
	      s"""
	         | LOAD DATA LOCAL INPATH '${storeLocation}'
	         | INTO TABLE boolean_table
	         | options('FILEHEADER'='shortField,booleanField,intField,bigintField,doubleField,stringField,timestampField,decimalField,dateField,charField,floatField,complexData,booleanField2')
	           """.stripMargin)
	
	    checkAnswer(
	      sql("select booleanField,intField from boolean_table"),
	      Seq(Row(true, 10), Row(false, 17), Row(false, 11),
	        Row(true, 10), Row(true, 10), Row(true, 14),
	        Row(false, 10), Row(false, 10), Row(false, 16), Row(false, 10))
	    )
	  }

参考：

	【1】http://carbondata.apache.org/ddl-operation-on-carbondata.html