	
为什么字典编码DICTIONARY_INCLUDE支持date，而DICTIONARY_EXCLUDE不行？
	
	DICTIONARY_EXCLUDE is unsupported for date data type column: datefield
	org.apache.carbondata.spark.exception.MalformedCarbonCommandException: DICTIONARY_EXCLUDE is unsupported for date data type column: datefield
		at org.apache.spark.sql.catalyst.CarbonDDLSqlParser$$anonfun$extractDimAndMsrFields$4.apply(CarbonDDLSqlParser.scala:591)
		at org.apache.spark.sql.catalyst.CarbonDDLSqlParser$$anonfun$extractDimAndMsrFields$4.apply(CarbonDDLSqlParser.scala:576)
		at scala.collection.IndexedSeqOptimized$class.foreach(IndexedSeqOptimized.scala:33)
		at scala.collection.mutable.ArrayOps$ofRef.foreach(ArrayOps.scala:186)

参考：

	【1】http://carbondata.apache.org/ddl-operation-on-carbondata.html