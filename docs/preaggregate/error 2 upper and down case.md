	error 2: upper and down case
	
code:

	  test("test timeseries create table 19: should support if not exists") {
	    sql("DROP DATAMAP IF EXISTS agg1 ON TABLE mainTable")
	
	    sql(
	      s"""
	         | CREATE DATAMAP agg1 ON TABLE mainTable
	         | USING '$timeSeries'
	         | DMPROPERTIES (
	         |   'EVENT_TIME'='dataTime',
	         |   'MONTH_GRANULARITY'='1')
	         | AS SELECT dataTime, SUM(age) FROM mainTable
	         | GROUP BY dataTime
	        """.stripMargin)
	    sql(
	      s"""
	         | CREATE DATAMAP IF NOT EXISTS agg1 ON TABLE mainTable
	         | USING '$timeSeries'
	         | DMPROPERTIES (
	         |   'EVENT_TIME'='dataTime',
	         |   'MONTH_GRANULARITY'='1')
	         |AS SELECT dataTime, SUM(age) FROM mainTable
	         |GROUP BY dataTime
	        """.stripMargin)
	    checkExistence(sql("SHOW DATAMAP ON TABLE mainTable"), true, "agg1")
	    checkExistence(sql("DESC FORMATTED mainTable_agg1"), true, "maintable_age_sum")
	  }

error：

	18/02/06 18:46:45 AUDIT CarbonDropDataMapCommand: [hadoop][root][Thread-1]Deleting datamap [agg1] under table [mainTable]
	18/02/06 18:46:45 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [maintable_agg1]
	18/02/06 18:46:45 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [maintable_agg1]
	18/02/06 18:46:45 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap agg1 successfully added to Table mainTable
	18/02/06 18:46:45 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]Table creation with Database name [default] and Table name [mainTable_agg1] failed. Table [mainTable_agg1] already exists under database [default]
	18/02/06 18:46:45 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap agg1 successfully added to Table mainTable
	
	"mainTable_datatime                  timestamp                                                                       KEY COLUMN,null                                                         mainTable_age_sum                   bigint                                                                          MEASURE,null                                                                                                                                                                                                                                                        ##Detailed Table Information                                                                                                                                                                Database Name                       default                                                                                                                                                 Table Name                          maintable_agg1                                                                                                                                          CARBON Store Path                   /xubo/git/carbondata2/carbondata/integration/spark-common/target/warehouse                                                                              Comment                                                                                                                                                                                     Table Block Size                    1024 MB                                                                                                                                                 Table Data Size                     0                                                                                                                                                       Table Index Size                    0                                                                                                                                                       Last Update Time                    0                                                                                                                                                       SORT_SCOPE                          LOCAL_SORT                                                                      LOCAL_SORT                                                              Streaming                           false                                                                                                                                                                                                                                                                                                                                               ##Detailed Column property                                                                                                                                                                  ADAPTIVE                                                                                                                                                                                    SORT_COLUMNS                        mainTable_datatime                                                                                                                                      " did not contain "maintable_age_sum" Failed for [col_name: string, data_type: string ... 1 more field] (maintable_age_sum doesn't exist in result)
	ScalaTestFailureLocation: org.apache.spark.sql.test.util.QueryTest$$anonfun$checkExistence$1 at (QueryTest.scala:59)
	org.scalatest.exceptions.TestFailedException: "mainTable_datatime                  timestamp                                                                       KEY COLUMN,null                                                         mainTable_age_sum                   bigint                                                                          MEASURE,null                                                                                                                                                                                                                                                        ##Detailed Table Information                                                                                                                                                                Database Name                       default                                                                                                                                                 Table Name                          maintable_agg1                                                                                                                                          CARBON Store Path                   /xubo/git/carbondata2/carbondata/integration/spark-common/target/warehouse                                                                              Comment                                                                                                                                                                                     Table Block Size                    1024 MB                                                                                                                                                 Table Data Size                     0                                                                                                                                                       Table Index Size                    0                                                                                                                                                       Last Update Time                    0                                                                                                                                                       SORT_SCOPE                          LOCAL_SORT                                                                      LOCAL_SORT                                                              Streaming                           false                                                                                                                                                                                                                                                                                                                                               ##Detailed Column property                                                                                                                                                                  ADAPTIVE                                                                                                                                                                                    SORT_COLUMNS                        mainTable_datatime                                                                                                                                      " did not contain "maintable_age_sum" Failed for [col_name: string, data_type: string ... 1 more field] (maintable_age_sum doesn't exist in result)
		at org.scalatest.Assertions$class.newAssertionFailedException(Assertions.scala:500)
		at org.scalatest.FunSuite.newAssertionFailedException(FunSuite.scala:1555)
		at org.scalatest.Assertions$AssertionsHelper.macroAssert(Assertions.scala:466)
		at org.apache.spark.sql.test.util.QueryTest$$anonfun$checkExistence$1.apply(QueryTest.scala:59)
		at org.apache.spark.sql.test.util.QueryTest$$anonfun$checkExistence$1.apply(QueryTest.scala:57)
		at scala.collection.IndexedSeqOptimized$class.foreach(IndexedSeqOptimized.scala:33)
		at scala.collection.mutable.WrappedArray.foreach(WrappedArray.scala:35)
		at org.apache.spark.sql.test.util.QueryTest.checkExistence(QueryTest.scala:57)
		at org.apache.carbondata.integration.spark.testsuite.timeseries.TestTimeSeriesCreateTable$$anonfun$19.apply$mcV$sp(TestTimeSeriesCreateTable.scala:353)
		at org.apache.carbondata.integration.spark.testsuite.timeseries.TestTimeSeriesCreateTable$$anonfun$19.apply(TestTimeSeriesCreateTable.scala:329)
		at org.apache.carbondata.integration.spark.testsuite.timeseries.TestTimeSeriesCreateTable$$anonfun$19.apply(TestTimeSeriesCreateTable.scala:329)
		at org.scalatest.Transformer$$anonfun$apply$1.apply$mcV$sp(Transformer.scala:22)
		at org.scalatest.OutcomeOf$class.outcomeOf(OutcomeOf.scala:85)
		at org.scalatest.OutcomeOf$.outcomeOf(OutcomeOf.scala:104)
		at org.scalatest.Transformer.apply(Transformer.scala:22)
		at org.scalatest.Transformer.apply(Transformer.scala:20)
		at org.scalatest.FunSuiteLike$$anon$1.apply(FunSuiteLike.scala:166)
		at org.apache.spark.sql.test.util.CarbonFunSuite.withFixture(CarbonFunSuite.scala:41)
		at org.scalatest.FunSuiteLike$class.invokeWithFixture$1(FunSuiteLike.scala:163)
		at org.scalatest.FunSuiteLike$$anonfun$runTest$1.apply(FunSuiteLike.scala:175)
		at org.scalatest.FunSuiteLike$$anonfun$runTest$1.apply(FunSuiteLike.scala:175)
		at org.scalatest.SuperEngine.runTestImpl(Engine.scala:306)
		at org.scalatest.FunSuiteLike$class.runTest(FunSuiteLike.scala:175)
		at org.scalatest.FunSuite.runTest(FunSuite.scala:1555)
		at org.scalatest.FunSuiteLike$$anonfun$runTests$1.apply(FunSuiteLike.scala:208)
		at org.scalatest.FunSuiteLike$$anonfun$runTests$1.apply(FunSuiteLike.scala:208)
		at org.scalatest.SuperEngine$$anonfun$traverseSubNodes$1$1.apply(Engine.scala:413)
		at org.scalatest.SuperEngine$$anonfun$traverseSubNodes$1$1.apply(Engine.scala:401)
		at scala.collection.immutable.List.foreach(List.scala:381)
		at org.scalatest.SuperEngine.traverseSubNodes$1(Engine.scala:401)
		at org.scalatest.SuperEngine.org$scalatest$SuperEngine$$runTestsInBranch(Engine.scala:396)
		at org.scalatest.SuperEngine.runTestsImpl(Engine.scala:483)
		at org.scalatest.FunSuiteLike$class.runTests(FunSuiteLike.scala:208)
		at org.scalatest.FunSuite.runTests(FunSuite.scala:1555)
		at org.scalatest.Suite$class.run(Suite.scala:1424)
		at org.scalatest.FunSuite.org$scalatest$FunSuiteLike$$super$run(FunSuite.scala:1555)
		at org.scalatest.FunSuiteLike$$anonfun$run$1.apply(FunSuiteLike.scala:212)
		at org.scalatest.FunSuiteLike$$anonfun$run$1.apply(FunSuiteLike.scala:212)
		at org.scalatest.SuperEngine.runImpl(Engine.scala:545)
		at org.scalatest.FunSuiteLike$class.run(FunSuiteLike.scala:212)
		at org.apache.carbondata.integration.spark.testsuite.timeseries.TestTimeSeriesCreateTable.org$scalatest$BeforeAndAfterAll$$super$run(TestTimeSeriesCreateTable.scala:26)
		at org.scalatest.BeforeAndAfterAll$class.liftedTree1$1(BeforeAndAfterAll.scala:257)
		at org.scalatest.BeforeAndAfterAll$class.run(BeforeAndAfterAll.scala:256)
		at org.apache.carbondata.integration.spark.testsuite.timeseries.TestTimeSeriesCreateTable.run(TestTimeSeriesCreateTable.scala:26)
		at org.scalatest.tools.SuiteRunner.run(SuiteRunner.scala:55)
		at org.scalatest.tools.Runner$$anonfun$doRunRunRunDaDoRunRun$3.apply(Runner.scala:2563)
		at org.scalatest.tools.Runner$$anonfun$doRunRunRunDaDoRunRun$3.apply(Runner.scala:2557)
		at scala.collection.immutable.List.foreach(List.scala:381)
		at org.scalatest.tools.Runner$.doRunRunRunDaDoRunRun(Runner.scala:2557)
		at org.scalatest.tools.Runner$$anonfun$runOptionallyWithPassFailReporter$2.apply(Runner.scala:1044)
		at org.scalatest.tools.Runner$$anonfun$runOptionallyWithPassFailReporter$2.apply(Runner.scala:1043)
		at org.scalatest.tools.Runner$.withClassLoaderAndDispatchReporter(Runner.scala:2722)
		at org.scalatest.tools.Runner$.runOptionallyWithPassFailReporter(Runner.scala:1043)
		at org.scalatest.tools.Runner$.run(Runner.scala:883)
		at org.scalatest.tools.Runner.run(Runner.scala)
		at org.jetbrains.plugins.scala.testingSupport.scalaTest.ScalaTestRunner.runScalaTest2(ScalaTestRunner.java:138)
		at org.jetbrains.plugins.scala.testingSupport.scalaTest.ScalaTestRunner.main(ScalaTestRunner.java:28)
	
