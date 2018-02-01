code：

		  test("test timeseries create table 36: support event_time and granularity key with space") {
		    sql("DROP DATAMAP IF EXISTS agg1_month ON TABLE maintable")
		    sql(
		      s"""CREATE DATAMAP agg1_month ON TABLE mainTable
		         |USING '$timeSeries'
		         |DMPROPERTIES (
		         |   'event_time '='dataTime',
		         |   'MONTH_GRANULARITY '=' 1')
		         |AS SELECT dataTime, SUM(age) FROM mainTable
		         |GROUP BY dataTime
		        """.stripMargin)
		    checkExistence(sql("SHOW TABLES"), true, "maintable_agg1_month")
		  }
	
result：

	Testing started at 2:43 PM ...
	log4j:WARN No appenders could be found for logger (org.apache.spark.sql.test.TestQueryExecutor$).
	log4j:WARN Please initialize the log4j system properly.
	log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
	Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
	18/01/31 22:43:25 INFO SparkContext: Running Spark version 2.2.1
	18/01/31 22:43:26 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
	18/01/31 22:43:26 WARN Utils: Your hostname, hadoop resolves to a loopback address: 127.0.0.1; using 10.229.51.168 instead (on interface eth0)
	18/01/31 22:43:26 WARN Utils: Set SPARK_LOCAL_IP if you need to bind to another address
	18/01/31 22:43:26 INFO SparkContext: Submitted application: Spark2TestQueryExecutor
	18/01/31 22:43:26 INFO SecurityManager: Changing view acls to: root
	18/01/31 22:43:26 INFO SecurityManager: Changing modify acls to: root
	18/01/31 22:43:26 INFO SecurityManager: Changing view acls groups to: 
	18/01/31 22:43:26 INFO SecurityManager: Changing modify acls groups to: 
	18/01/31 22:43:26 INFO SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(root); groups with view permissions: Set(); users  with modify permissions: Set(root); groups with modify permissions: Set()
	18/01/31 22:43:26 INFO Utils: Successfully started service 'sparkDriver' on port 58326.
	18/01/31 22:43:26 INFO SparkEnv: Registering MapOutputTracker
	18/01/31 22:43:26 INFO SparkEnv: Registering BlockManagerMaster
	18/01/31 22:43:26 INFO BlockManagerMasterEndpoint: Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
	18/01/31 22:43:26 INFO BlockManagerMasterEndpoint: BlockManagerMasterEndpoint up
	18/01/31 22:43:26 INFO DiskBlockManager: Created local directory at /tmp/blockmgr-7b462241-847f-4aa8-bc82-1255e7a0558a
	18/01/31 22:43:26 INFO MemoryStore: MemoryStore started with capacity 867.6 MB
	18/01/31 22:43:27 INFO SparkEnv: Registering OutputCommitCoordinator
	18/01/31 22:43:27 INFO Utils: Successfully started service 'SparkUI' on port 4040.
	18/01/31 22:43:27 INFO SparkUI: Bound SparkUI to 0.0.0.0, and started at http://10.229.51.168:4040
	18/01/31 22:43:27 INFO Executor: Starting executor ID driver on host localhost
	18/01/31 22:43:27 INFO Utils: Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 38695.
	18/01/31 22:43:27 INFO NettyBlockTransferService: Server created on 10.229.51.168:38695
	18/01/31 22:43:27 INFO BlockManager: Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
	18/01/31 22:43:27 INFO BlockManagerMaster: Registering BlockManager BlockManagerId(driver, 10.229.51.168, 38695, None)
	18/01/31 22:43:27 INFO BlockManagerMasterEndpoint: Registering block manager 10.229.51.168:38695 with 867.6 MB RAM, BlockManagerId(driver, 10.229.51.168, 38695, None)
	18/01/31 22:43:27 INFO BlockManagerMaster: Registered BlockManager BlockManagerId(driver, 10.229.51.168, 38695, None)
	18/01/31 22:43:27 INFO BlockManager: Initialized BlockManager: BlockManagerId(driver, 10.229.51.168, 38695, None)
	18/01/31 22:43:28 INFO SharedState: Setting hive.metastore.warehouse.dir ('null') to the value of spark.sql.warehouse.dir ('/xubo/git/carbondata2/carbondata/integration/spark-common/target/warehouse').
	18/01/31 22:43:28 INFO SharedState: Warehouse path is '/xubo/git/carbondata2/carbondata/integration/spark-common/target/warehouse'.
	18/01/31 22:43:28 INFO HiveUtils: Initializing HiveMetastoreConnection version 1.2.1 using Spark classes.
	18/01/31 22:43:29 INFO HiveMetaStore: 0: Opening raw store with implemenation class:org.apache.hadoop.hive.metastore.ObjectStore
	18/01/31 22:43:29 INFO ObjectStore: ObjectStore, initialize called
	18/01/31 22:43:30 INFO Persistence: Property hive.metastore.integral.jdo.pushdown unknown - will be ignored
	18/01/31 22:43:30 INFO Persistence: Property datanucleus.cache.level2 unknown - will be ignored
	18/01/31 22:43:32 INFO ObjectStore: Setting MetaStore object pin classes with hive.metastore.cache.pinobjtypes="Table,StorageDescriptor,SerDeInfo,Partition,Database,Type,FieldSchema,Order"
	18/01/31 22:43:33 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	18/01/31 22:43:33 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	18/01/31 22:43:34 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	18/01/31 22:43:34 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	18/01/31 22:43:34 INFO Query: Reading in results for query "org.datanucleus.store.rdbms.query.SQLQuery@0" since the connection used is closing
	18/01/31 22:43:34 INFO MetaStoreDirectSql: Using direct SQL, underlying DB is DERBY
	18/01/31 22:43:34 INFO ObjectStore: Initialized ObjectStore
	18/01/31 22:43:34 INFO HiveMetaStore: Added admin role in metastore
	18/01/31 22:43:34 INFO HiveMetaStore: Added public role in metastore
	18/01/31 22:43:34 INFO HiveMetaStore: No user is added in admin role, since config is empty
	18/01/31 22:43:34 INFO HiveMetaStore: 0: get_all_databases
	18/01/31 22:43:34 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_all_databases	
	18/01/31 22:43:34 INFO HiveMetaStore: 0: get_functions: db=default pat=*
	18/01/31 22:43:34 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_functions: db=default pat=*	
	18/01/31 22:43:34 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MResourceUri" is tagged as "embedded-only" so does not have its own datastore table.
	18/01/31 22:43:35 INFO SessionState: Created local directory: /tmp/c96568b3-f987-493c-920d-c3e61d9d9e1b_resources
	18/01/31 22:43:35 INFO SessionState: Created HDFS directory: /tmp/hive/root/c96568b3-f987-493c-920d-c3e61d9d9e1b
	18/01/31 22:43:35 INFO SessionState: Created local directory: /tmp/root/c96568b3-f987-493c-920d-c3e61d9d9e1b
	18/01/31 22:43:35 INFO SessionState: Created HDFS directory: /tmp/hive/root/c96568b3-f987-493c-920d-c3e61d9d9e1b/_tmp_space.db
	18/01/31 22:43:35 INFO HiveClientImpl: Warehouse location for Hive client (version 1.2.1) is /xubo/git/carbondata2/carbondata/integration/spark-common/target/warehouse
	18/01/31 22:43:35 INFO HiveMetaStore: 0: get_database: default
	18/01/31 22:43:35 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_database: default	
	18/01/31 22:43:35 INFO HiveMetaStore: 0: get_database: global_temp
	18/01/31 22:43:35 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_database: global_temp	
	18/01/31 22:43:35 WARN ObjectStore: Failed to get database global_temp, returning NoSuchObjectException
	18/01/31 22:43:35 INFO SessionState: Created local directory: /tmp/6d6dcaad-0049-4192-ae44-aa857a746208_resources
	18/01/31 22:43:35 INFO SessionState: Created HDFS directory: /tmp/hive/root/6d6dcaad-0049-4192-ae44-aa857a746208
	18/01/31 22:43:35 INFO SessionState: Created local directory: /tmp/root/6d6dcaad-0049-4192-ae44-aa857a746208
	18/01/31 22:43:35 INFO SessionState: Created HDFS directory: /tmp/hive/root/6d6dcaad-0049-4192-ae44-aa857a746208/_tmp_space.db
	18/01/31 22:43:35 INFO HiveClientImpl: Warehouse location for Hive client (version 1.2.1) is /xubo/git/carbondata2/carbondata/integration/spark-common/target/warehouse
	18/01/31 22:43:35 INFO StateStoreCoordinatorRef: Registered StateStoreCoordinator endpoint
	18/01/31 22:43:35 AUDIT CarbonMetaStoreFactory: [hadoop][root][Thread-1]File based carbon metastore is enabled
	18/01/31 22:43:36 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [maintable]
	18/01/31 22:43:38 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [maintable]
	18/01/31 22:43:39 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [maintable_agg0_second]
	18/01/31 22:43:39 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [maintable_agg0_second]
	18/01/31 22:43:39 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap agg0_second successfully added to Table mainTable
	18/01/31 22:43:39 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [maintable_agg0_hour]
	18/01/31 22:43:39 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [maintable_agg0_hour]
	18/01/31 22:43:40 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap agg0_hour successfully added to Table mainTable
	18/01/31 22:43:40 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [maintable_agg0_day]
	18/01/31 22:43:40 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [maintable_agg0_day]
	18/01/31 22:43:40 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap agg0_day successfully added to Table mainTable
	18/01/31 22:43:40 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [maintable_agg0_month]
	18/01/31 22:43:40 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [maintable_agg0_month]
	18/01/31 22:43:41 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap agg0_month successfully added to Table mainTable
	18/01/31 22:43:41 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [maintable_agg0_year]
	18/01/31 22:43:41 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [maintable_agg0_year]
	18/01/31 22:43:41 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap agg0_year successfully added to Table mainTable
	18/01/31 22:43:41 AUDIT CarbonDropDataMapCommand: [hadoop][root][Thread-1]Deleting datamap [agg1_month] under table [maintable]
	
	Granularity only support 1
	org.apache.carbondata.spark.exception.MalformedDataMapCommandException: Granularity only support 1
		at org.apache.spark.sql.execution.command.timeseries.TimeSeriesUtil$.getTimeSeriesGranularityDetails(TimeSeriesUtil.scala:118)
		at org.apache.spark.sql.execution.command.datamap.CarbonCreateDataMapCommand.processMetadata(CarbonCreateDataMapCommand.scala:58)
		at org.apache.spark.sql.execution.command.AtomicRunnableCommand.run(package.scala:84)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult$lzycompute(commands.scala:58)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult(commands.scala:56)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.executeCollect(commands.scala:67)
		at org.apache.spark.sql.Dataset.<init>(Dataset.scala:183)
		at org.apache.spark.sql.Dataset$.ofRows(Dataset.scala:68)
		at org.apache.spark.sql.SparkSession.sql(SparkSession.scala:632)
		at org.apache.spark.sql.test.Spark2TestQueryExecutor.sql(Spark2TestQueryExecutor.scala:35)
		at org.apache.spark.sql.test.util.QueryTest.sql(QueryTest.scala:100)
		at org.apache.carbondata.integration.spark.testsuite.timeseries.TestTimeSeriesCreateTable$$anonfun$22.apply$mcV$sp(TestTimeSeriesCreateTable.scala:369)
		at org.apache.carbondata.integration.spark.testsuite.timeseries.TestTimeSeriesCreateTable$$anonfun$22.apply(TestTimeSeriesCreateTable.scala:367)
		at org.apache.carbondata.integration.spark.testsuite.timeseries.TestTimeSeriesCreateTable$$anonfun$22.apply(TestTimeSeriesCreateTable.scala:367)
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
		at org.apache.carbondata.integration.spark.testsuite.timeseries.TestTimeSeriesCreateTable.org$scalatest$BeforeAndAfterAll$$super$run(TestTimeSeriesCreateTable.scala:25)
		at org.scalatest.BeforeAndAfterAll$class.liftedTree1$1(BeforeAndAfterAll.scala:257)
		at org.scalatest.BeforeAndAfterAll$class.run(BeforeAndAfterAll.scala:256)
		at org.apache.carbondata.integration.spark.testsuite.timeseries.TestTimeSeriesCreateTable.run(TestTimeSeriesCreateTable.scala:25)
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
	
	18/01/31 22:43:41 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [maintable] under database [default]
	18/01/31 22:43:41 ERROR CarbonProperties: ScalaTest-run Configured value for property carbon.number.of.cores.while.loading is wrong. Falling back to the default value 2
	18/01/31 22:43:41 ERROR CarbonProperties: ScalaTest-run Configured value for property carbon.number.of.cores.while.loading is wrong. Falling back to the default value 2
	18/01/31 22:43:42 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [maintable_agg0_second] under database [default]
	18/01/31 22:43:42 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [maintable_agg0_second] under database [default]
	18/01/31 22:43:42 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [maintable_agg0_hour] under database [default]
	18/01/31 22:43:42 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [maintable_agg0_hour] under database [default]
	18/01/31 22:43:42 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [maintable_agg0_day] under database [default]
	18/01/31 22:43:42 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [maintable_agg0_day] under database [default]
	18/01/31 22:43:42 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [maintable_agg0_month] under database [default]
	18/01/31 22:43:42 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [maintable_agg0_month] under database [default]
	18/01/31 22:43:42 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [maintable_agg0_year] under database [default]
	18/01/31 22:43:42 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [maintable_agg0_year] under database [default]
	18/01/31 22:43:42 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [maintable] under database [default]
	
	Process finished with exit code 0
