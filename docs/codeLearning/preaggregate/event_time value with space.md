
代码：

	  test("test timeseries create table 35: support event_time and granularity key with space") {
	    sql("DROP DATAMAP IF EXISTS agg1_month ON TABLE maintable")
	    sql(
	      s"""CREATE DATAMAP agg1_month ON TABLE mainTable
	         |USING '$timeSeries'
	         |DMPROPERTIES (
	         |   'event_time '=' dataTime',
	         |   'MONTH_GRANULARITY '='1')
	         |AS SELECT dataTime, SUM(age) FROM mainTable
	         |GROUP BY dataTime
	        """.stripMargin)
	    checkExistence(sql("SHOW TABLES"), true, "maintable_agg1_month")
	  }

问题：

	Testing started at 2:42 PM ...
	log4j:WARN No appenders could be found for logger (org.apache.spark.sql.test.TestQueryExecutor$).
	log4j:WARN Please initialize the log4j system properly.
	log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
	Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
	18/01/31 22:42:35 INFO SparkContext: Running Spark version 2.2.1
	18/01/31 22:42:36 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
	18/01/31 22:42:36 WARN Utils: Your hostname, hadoop resolves to a loopback address: 127.0.0.1; using 10.229.51.168 instead (on interface eth0)
	18/01/31 22:42:36 WARN Utils: Set SPARK_LOCAL_IP if you need to bind to another address
	18/01/31 22:42:36 INFO SparkContext: Submitted application: Spark2TestQueryExecutor
	18/01/31 22:42:36 INFO SecurityManager: Changing view acls to: root
	18/01/31 22:42:36 INFO SecurityManager: Changing modify acls to: root
	18/01/31 22:42:36 INFO SecurityManager: Changing view acls groups to: 
	18/01/31 22:42:36 INFO SecurityManager: Changing modify acls groups to: 
	18/01/31 22:42:36 INFO SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(root); groups with view permissions: Set(); users  with modify permissions: Set(root); groups with modify permissions: Set()
	18/01/31 22:42:36 INFO Utils: Successfully started service 'sparkDriver' on port 51411.
	18/01/31 22:42:36 INFO SparkEnv: Registering MapOutputTracker
	18/01/31 22:42:36 INFO SparkEnv: Registering BlockManagerMaster
	18/01/31 22:42:36 INFO BlockManagerMasterEndpoint: Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
	18/01/31 22:42:36 INFO BlockManagerMasterEndpoint: BlockManagerMasterEndpoint up
	18/01/31 22:42:36 INFO DiskBlockManager: Created local directory at /tmp/blockmgr-34d13179-0b1c-446c-8e6b-3c92b226802b
	18/01/31 22:42:37 INFO MemoryStore: MemoryStore started with capacity 867.6 MB
	18/01/31 22:42:37 INFO SparkEnv: Registering OutputCommitCoordinator
	18/01/31 22:42:37 INFO Utils: Successfully started service 'SparkUI' on port 4040.
	18/01/31 22:42:37 INFO SparkUI: Bound SparkUI to 0.0.0.0, and started at http://10.229.51.168:4040
	18/01/31 22:42:37 INFO Executor: Starting executor ID driver on host localhost
	18/01/31 22:42:37 INFO Utils: Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 58071.
	18/01/31 22:42:37 INFO NettyBlockTransferService: Server created on 10.229.51.168:58071
	18/01/31 22:42:37 INFO BlockManager: Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
	18/01/31 22:42:37 INFO BlockManagerMaster: Registering BlockManager BlockManagerId(driver, 10.229.51.168, 58071, None)
	18/01/31 22:42:37 INFO BlockManagerMasterEndpoint: Registering block manager 10.229.51.168:58071 with 867.6 MB RAM, BlockManagerId(driver, 10.229.51.168, 58071, None)
	18/01/31 22:42:37 INFO BlockManagerMaster: Registered BlockManager BlockManagerId(driver, 10.229.51.168, 58071, None)
	18/01/31 22:42:37 INFO BlockManager: Initialized BlockManager: BlockManagerId(driver, 10.229.51.168, 58071, None)
	18/01/31 22:42:38 INFO SharedState: Setting hive.metastore.warehouse.dir ('null') to the value of spark.sql.warehouse.dir ('/xubo/git/carbondata2/carbondata/integration/spark-common/target/warehouse').
	18/01/31 22:42:38 INFO SharedState: Warehouse path is '/xubo/git/carbondata2/carbondata/integration/spark-common/target/warehouse'.
	18/01/31 22:42:38 INFO HiveUtils: Initializing HiveMetastoreConnection version 1.2.1 using Spark classes.
	18/01/31 22:42:39 INFO HiveMetaStore: 0: Opening raw store with implemenation class:org.apache.hadoop.hive.metastore.ObjectStore
	18/01/31 22:42:39 INFO ObjectStore: ObjectStore, initialize called
	18/01/31 22:42:39 INFO Persistence: Property hive.metastore.integral.jdo.pushdown unknown - will be ignored
	18/01/31 22:42:39 INFO Persistence: Property datanucleus.cache.level2 unknown - will be ignored
	18/01/31 22:42:41 INFO ObjectStore: Setting MetaStore object pin classes with hive.metastore.cache.pinobjtypes="Table,StorageDescriptor,SerDeInfo,Partition,Database,Type,FieldSchema,Order"
	18/01/31 22:42:43 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	18/01/31 22:42:43 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	18/01/31 22:42:43 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	18/01/31 22:42:43 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	18/01/31 22:42:43 INFO Query: Reading in results for query "org.datanucleus.store.rdbms.query.SQLQuery@0" since the connection used is closing
	18/01/31 22:42:43 INFO MetaStoreDirectSql: Using direct SQL, underlying DB is DERBY
	18/01/31 22:42:43 INFO ObjectStore: Initialized ObjectStore
	18/01/31 22:42:43 INFO HiveMetaStore: Added admin role in metastore
	18/01/31 22:42:43 INFO HiveMetaStore: Added public role in metastore
	18/01/31 22:42:44 INFO HiveMetaStore: No user is added in admin role, since config is empty
	18/01/31 22:42:44 INFO HiveMetaStore: 0: get_all_databases
	18/01/31 22:42:44 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_all_databases	
	18/01/31 22:42:44 INFO HiveMetaStore: 0: get_functions: db=default pat=*
	18/01/31 22:42:44 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_functions: db=default pat=*	
	18/01/31 22:42:44 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MResourceUri" is tagged as "embedded-only" so does not have its own datastore table.
	18/01/31 22:42:44 INFO SessionState: Created local directory: /tmp/35768819-6dff-406c-9910-b3b15b94a32f_resources
	18/01/31 22:42:44 INFO SessionState: Created HDFS directory: /tmp/hive/root/35768819-6dff-406c-9910-b3b15b94a32f
	18/01/31 22:42:44 INFO SessionState: Created local directory: /tmp/root/35768819-6dff-406c-9910-b3b15b94a32f
	18/01/31 22:42:44 INFO SessionState: Created HDFS directory: /tmp/hive/root/35768819-6dff-406c-9910-b3b15b94a32f/_tmp_space.db
	18/01/31 22:42:44 INFO HiveClientImpl: Warehouse location for Hive client (version 1.2.1) is /xubo/git/carbondata2/carbondata/integration/spark-common/target/warehouse
	18/01/31 22:42:44 INFO HiveMetaStore: 0: get_database: default
	18/01/31 22:42:44 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_database: default	
	18/01/31 22:42:44 INFO HiveMetaStore: 0: get_database: global_temp
	18/01/31 22:42:44 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_database: global_temp	
	18/01/31 22:42:44 WARN ObjectStore: Failed to get database global_temp, returning NoSuchObjectException
	18/01/31 22:42:44 INFO SessionState: Created local directory: /tmp/de3e6916-f75a-41cd-bea7-00ac1c60bcfe_resources
	18/01/31 22:42:44 INFO SessionState: Created HDFS directory: /tmp/hive/root/de3e6916-f75a-41cd-bea7-00ac1c60bcfe
	18/01/31 22:42:44 INFO SessionState: Created local directory: /tmp/root/de3e6916-f75a-41cd-bea7-00ac1c60bcfe
	18/01/31 22:42:44 INFO SessionState: Created HDFS directory: /tmp/hive/root/de3e6916-f75a-41cd-bea7-00ac1c60bcfe/_tmp_space.db
	18/01/31 22:42:44 INFO HiveClientImpl: Warehouse location for Hive client (version 1.2.1) is /xubo/git/carbondata2/carbondata/integration/spark-common/target/warehouse
	18/01/31 22:42:45 INFO StateStoreCoordinatorRef: Registered StateStoreCoordinator endpoint
	18/01/31 22:42:45 AUDIT CarbonMetaStoreFactory: [hadoop][root][Thread-1]File based carbon metastore is enabled
	18/01/31 22:42:46 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [maintable]
	18/01/31 22:42:47 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [maintable]
	18/01/31 22:42:48 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [maintable_agg0_second]
	18/01/31 22:42:48 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [maintable_agg0_second]
	18/01/31 22:42:49 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap agg0_second successfully added to Table mainTable
	18/01/31 22:42:49 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [maintable_agg0_hour]
	18/01/31 22:42:49 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [maintable_agg0_hour]
	18/01/31 22:42:50 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap agg0_hour successfully added to Table mainTable
	18/01/31 22:42:50 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [maintable_agg0_day]
	18/01/31 22:42:50 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [maintable_agg0_day]
	18/01/31 22:42:50 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap agg0_day successfully added to Table mainTable
	18/01/31 22:42:50 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [maintable_agg0_month]
	18/01/31 22:42:50 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [maintable_agg0_month]
	18/01/31 22:42:51 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap agg0_month successfully added to Table mainTable
	18/01/31 22:42:51 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [maintable_agg0_year]
	18/01/31 22:42:51 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [maintable_agg0_year]
	18/01/31 22:42:51 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap agg0_year successfully added to Table mainTable
	18/01/31 22:42:51 AUDIT CarbonDropDataMapCommand: [hadoop][root][Thread-1]Deleting datamap [agg1_month] under table [maintable]
	
	java.lang.NullPointerException was thrown.
	java.lang.NullPointerException
		at org.apache.spark.sql.execution.command.timeseries.TimeSeriesUtil$.validateTimeSeriesEventTime(TimeSeriesUtil.scala:50)
		at org.apache.spark.sql.execution.command.preaaggregate.CreatePreAggregateTableCommand.processMetadata(CreatePreAggregateTableCommand.scala:104)
		at org.apache.spark.sql.execution.command.datamap.CarbonCreateDataMapCommand.processMetadata(CarbonCreateDataMapCommand.scala:75)
		at org.apache.spark.sql.execution.command.AtomicRunnableCommand.run(package.scala:84)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult$lzycompute(commands.scala:58)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult(commands.scala:56)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.executeCollect(commands.scala:67)
		at org.apache.spark.sql.Dataset.<init>(Dataset.scala:183)
		at org.apache.spark.sql.Dataset$.ofRows(Dataset.scala:68)
		at org.apache.spark.sql.SparkSession.sql(SparkSession.scala:632)
		at org.apache.spark.sql.test.Spark2TestQueryExecutor.sql(Spark2TestQueryExecutor.scala:35)
		at org.apache.spark.sql.test.util.QueryTest.sql(QueryTest.scala:100)
		at org.apache.carbondata.integration.spark.testsuite.timeseries.TestTimeSeriesCreateTable$$anonfun$21.apply$mcV$sp(TestTimeSeriesCreateTable.scala:355)
		at org.apache.carbondata.integration.spark.testsuite.timeseries.TestTimeSeriesCreateTable$$anonfun$21.apply(TestTimeSeriesCreateTable.scala:353)
		at org.apache.carbondata.integration.spark.testsuite.timeseries.TestTimeSeriesCreateTable$$anonfun$21.apply(TestTimeSeriesCreateTable.scala:353)
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
	
	18/01/31 22:42:51 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [maintable] under database [default]
	18/01/31 22:42:51 ERROR CarbonProperties: ScalaTest-run Configured value for property carbon.number.of.cores.while.loading is wrong. Falling back to the default value 2
	18/01/31 22:42:51 ERROR CarbonProperties: ScalaTest-run Configured value for property carbon.number.of.cores.while.loading is wrong. Falling back to the default value 2
	18/01/31 22:42:52 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [maintable_agg0_second] under database [default]
	18/01/31 22:42:53 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [maintable_agg0_second] under database [default]
	18/01/31 22:42:53 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [maintable_agg0_hour] under database [default]
	18/01/31 22:42:53 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [maintable_agg0_hour] under database [default]
	18/01/31 22:42:53 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [maintable_agg0_day] under database [default]
	18/01/31 22:42:53 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [maintable_agg0_day] under database [default]
	18/01/31 22:42:53 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [maintable_agg0_month] under database [default]
	18/01/31 22:42:53 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [maintable_agg0_month] under database [default]
	18/01/31 22:42:53 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [maintable_agg0_year] under database [default]
	18/01/31 22:42:53 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [maintable_agg0_year] under database [default]
	18/01/31 22:42:53 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [maintable] under database [default]
	
	Process finished with exit code 0
