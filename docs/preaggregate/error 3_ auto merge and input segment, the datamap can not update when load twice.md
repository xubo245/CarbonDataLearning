code

	 // TODO
	  test("test whether all segments are loaded into pre-aggregate table: error in auto merge and input segment") {
	    CarbonProperties.getInstance()
	      .addProperty(CarbonCommonConstants.ENABLE_AUTO_LOAD_MERGE, "true")
	    sql("reset")
	    sql("DROP TABLE IF EXISTS main_table")
	    sql(
	      """
	        | CREATE TABLE main_table(
	        |     id INT,
	        |     name STRING,
	        |     city STRING,
	        |     age INT)
	        | STORED BY 'org.apache.carbondata.format'
	      """.stripMargin)
	    sql(s"INSERT INTO main_table VALUES(1, 'xyz', 'bengaluru', 26)")
	    sql(s"INSERT INTO main_table VALUES(1, 'xyz', 'bengaluru', 26)")
	
	    sql(
	      s"""
	         | CREATE DATAMAP preagg_sum
	         | ON TABLE main_table
	         | USING 'preaggregate'
	         | AS SELECT id, SUM(age)
	         | FROM main_table
	         | GROUP BY id
	       """.stripMargin)
	
	
	    sql(s"INSERT INTO main_table VALUES(1, 'xyz', 'bengaluru', 26)")
	    sql("show segments for table main_table_preagg_sum").show()
	    sql(s"LOAD DATA LOCAL INPATH '$testData' INTO TABLE main_table")
	    sql(s"LOAD DATA LOCAL INPATH '$testData' INTO TABLE main_table")
	
	    checkPreAggTable(sql("SELECT id, SUM(age) FROM main_table GROUP BY id"),
	      true, "main_table_preagg_sum")
	
	    sql("show segments for table main_table_preagg_sum").show()
	    //    checkExistence(sql("show segments for table main_table_preagg_sum"), true, "Compacted")
	    CarbonProperties.getInstance()
	      .addProperty(CarbonCommonConstants.ENABLE_AUTO_LOAD_MERGE, "false")
	  }

error:
	
	Testing started at 5:31 PM ...
	log4j:WARN No appenders could be found for logger (org.apache.carbondata.core.util.CarbonProperties).
	log4j:WARN Please initialize the log4j system properly.
	log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
	Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
	18/02/09 01:32:03 INFO SparkContext: Running Spark version 2.2.1
	18/02/09 01:32:03 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
	18/02/09 01:32:03 WARN Utils: Your hostname, hadoop resolves to a loopback address: 127.0.0.1; using 10.229.51.168 instead (on interface eth0)
	18/02/09 01:32:03 WARN Utils: Set SPARK_LOCAL_IP if you need to bind to another address
	18/02/09 01:32:03 INFO SparkContext: Submitted application: Spark2TestQueryExecutor
	18/02/09 01:32:03 INFO SecurityManager: Changing view acls to: root
	18/02/09 01:32:03 INFO SecurityManager: Changing modify acls to: root
	18/02/09 01:32:03 INFO SecurityManager: Changing view acls groups to: 
	18/02/09 01:32:03 INFO SecurityManager: Changing modify acls groups to: 
	18/02/09 01:32:03 INFO SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(root); groups with view permissions: Set(); users  with modify permissions: Set(root); groups with modify permissions: Set()
	18/02/09 01:32:04 INFO Utils: Successfully started service 'sparkDriver' on port 48612.
	18/02/09 01:32:04 INFO SparkEnv: Registering MapOutputTracker
	18/02/09 01:32:04 INFO SparkEnv: Registering BlockManagerMaster
	18/02/09 01:32:04 INFO BlockManagerMasterEndpoint: Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
	18/02/09 01:32:04 INFO BlockManagerMasterEndpoint: BlockManagerMasterEndpoint up
	18/02/09 01:32:04 INFO DiskBlockManager: Created local directory at /tmp/blockmgr-295494a7-1d94-4c57-a4ca-c4d12c1cd332
	18/02/09 01:32:04 INFO MemoryStore: MemoryStore started with capacity 867.6 MB
	18/02/09 01:32:04 INFO SparkEnv: Registering OutputCommitCoordinator
	18/02/09 01:32:04 INFO Utils: Successfully started service 'SparkUI' on port 4040.
	18/02/09 01:32:04 INFO SparkUI: Bound SparkUI to 0.0.0.0, and started at http://10.229.51.168:4040
	18/02/09 01:32:05 INFO Executor: Starting executor ID driver on host localhost
	18/02/09 01:32:05 INFO Utils: Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 51517.
	18/02/09 01:32:05 INFO NettyBlockTransferService: Server created on 10.229.51.168:51517
	18/02/09 01:32:05 INFO BlockManager: Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
	18/02/09 01:32:05 INFO BlockManagerMaster: Registering BlockManager BlockManagerId(driver, 10.229.51.168, 51517, None)
	18/02/09 01:32:05 INFO BlockManagerMasterEndpoint: Registering block manager 10.229.51.168:51517 with 867.6 MB RAM, BlockManagerId(driver, 10.229.51.168, 51517, None)
	18/02/09 01:32:05 INFO BlockManagerMaster: Registered BlockManager BlockManagerId(driver, 10.229.51.168, 51517, None)
	18/02/09 01:32:05 INFO BlockManager: Initialized BlockManager: BlockManagerId(driver, 10.229.51.168, 51517, None)
	18/02/09 01:32:05 INFO SharedState: Setting hive.metastore.warehouse.dir ('null') to the value of spark.sql.warehouse.dir ('/xubo/git/carbondata/integration/spark-common/target/warehouse').
	18/02/09 01:32:05 INFO SharedState: Warehouse path is '/xubo/git/carbondata/integration/spark-common/target/warehouse'.
	18/02/09 01:32:06 INFO HiveUtils: Initializing HiveMetastoreConnection version 1.2.1 using Spark classes.
	18/02/09 01:32:06 INFO HiveMetaStore: 0: Opening raw store with implemenation class:org.apache.hadoop.hive.metastore.ObjectStore
	18/02/09 01:32:07 INFO ObjectStore: ObjectStore, initialize called
	18/02/09 01:32:07 INFO Persistence: Property hive.metastore.integral.jdo.pushdown unknown - will be ignored
	18/02/09 01:32:07 INFO Persistence: Property datanucleus.cache.level2 unknown - will be ignored
	18/02/09 01:32:09 INFO ObjectStore: Setting MetaStore object pin classes with hive.metastore.cache.pinobjtypes="Table,StorageDescriptor,SerDeInfo,Partition,Database,Type,FieldSchema,Order"
	18/02/09 01:32:10 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/09 01:32:10 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/09 01:32:10 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/09 01:32:10 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/09 01:32:10 INFO Query: Reading in results for query "org.datanucleus.store.rdbms.query.SQLQuery@0" since the connection used is closing
	18/02/09 01:32:10 INFO MetaStoreDirectSql: Using direct SQL, underlying DB is DERBY
	18/02/09 01:32:10 INFO ObjectStore: Initialized ObjectStore
	18/02/09 01:32:11 INFO HiveMetaStore: Added admin role in metastore
	18/02/09 01:32:11 INFO HiveMetaStore: Added public role in metastore
	18/02/09 01:32:11 INFO HiveMetaStore: No user is added in admin role, since config is empty
	18/02/09 01:32:11 INFO HiveMetaStore: 0: get_all_databases
	18/02/09 01:32:11 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_all_databases	
	18/02/09 01:32:11 INFO HiveMetaStore: 0: get_functions: db=default pat=*
	18/02/09 01:32:11 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_functions: db=default pat=*	
	18/02/09 01:32:11 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MResourceUri" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/09 01:32:11 INFO SessionState: Created local directory: /tmp/1c39176f-5195-43cc-9a5e-881658da3c43_resources
	18/02/09 01:32:11 INFO SessionState: Created HDFS directory: /tmp/hive/root/1c39176f-5195-43cc-9a5e-881658da3c43
	18/02/09 01:32:11 INFO SessionState: Created local directory: /tmp/root/1c39176f-5195-43cc-9a5e-881658da3c43
	18/02/09 01:32:11 INFO SessionState: Created HDFS directory: /tmp/hive/root/1c39176f-5195-43cc-9a5e-881658da3c43/_tmp_space.db
	18/02/09 01:32:11 INFO HiveClientImpl: Warehouse location for Hive client (version 1.2.1) is /xubo/git/carbondata/integration/spark-common/target/warehouse
	18/02/09 01:32:11 INFO HiveMetaStore: 0: get_database: default
	18/02/09 01:32:11 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_database: default	
	18/02/09 01:32:11 INFO HiveMetaStore: 0: get_database: global_temp
	18/02/09 01:32:11 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_database: global_temp	
	18/02/09 01:32:11 WARN ObjectStore: Failed to get database global_temp, returning NoSuchObjectException
	18/02/09 01:32:12 INFO SessionState: Created local directory: /tmp/e59edf8f-96b3-4689-bc1d-336630ad9143_resources
	18/02/09 01:32:12 INFO SessionState: Created HDFS directory: /tmp/hive/root/e59edf8f-96b3-4689-bc1d-336630ad9143
	18/02/09 01:32:12 INFO SessionState: Created local directory: /tmp/root/e59edf8f-96b3-4689-bc1d-336630ad9143
	18/02/09 01:32:12 INFO SessionState: Created HDFS directory: /tmp/hive/root/e59edf8f-96b3-4689-bc1d-336630ad9143/_tmp_space.db
	18/02/09 01:32:12 INFO HiveClientImpl: Warehouse location for Hive client (version 1.2.1) is /xubo/git/carbondata/integration/spark-common/target/warehouse
	18/02/09 01:32:12 INFO StateStoreCoordinatorRef: Registered StateStoreCoordinator endpoint
	WARNING: JMockit was initialized on demand, which may cause certain tests to fail;
	please check the documentation for better ways to get it initialized.
	18/02/09 01:32:13 AUDIT CarbonMetaStoreFactory: [hadoop][root][Thread-1]File based carbon metastore is enabled
	18/02/09 01:32:14 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [main_table]
	18/02/09 01:32:16 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [main_table]
	18/02/09 01:32:17 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table
	18/02/09 01:32:19 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table
	18/02/09 01:32:19 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Compaction request received for table default.main_table
	18/02/09 01:32:19 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table
	18/02/09 01:32:19 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table
	18/02/09 01:32:19 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Compaction request received for table default.main_table
	18/02/09 01:32:19 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [main_table_preagg_sum]
	18/02/09 01:32:20 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [main_table_preagg_sum]
	18/02/09 01:32:20 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap preagg_sum successfully added to Table main_table
	18/02/09 01:32:20 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value * added in the session param
	18/02/09 01:32:20 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value true added in the session param
	18/02/09 01:32:20 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/09 01:32:20 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value * added in the session param
	18/02/09 01:32:20 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/09 01:32:20 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value true added in the session param
	18/02/09 01:32:20 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_sum
	18/02/09 01:32:22 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_sum
	18/02/09 01:32:23 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table
	18/02/09 01:32:23 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 2 added in the session param
	18/02/09 01:32:23 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/09 01:32:23 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/09 01:32:23 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 2 added in the session param
	18/02/09 01:32:23 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/09 01:32:23 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/09 01:32:23 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_sum
	18/02/09 01:32:24 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_sum
	18/02/09 01:32:24 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table
	18/02/09 01:32:24 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Compaction request received for table default.main_table
	+-----------------+-------+--------------------+--------------------+---------+-----------+
	|SegmentSequenceId| Status|     Load Start Time|       Load End Time|Merged To|File Format|
	+-----------------+-------+--------------------+--------------------+---------+-----------+
	|                1|Success|2018-02-09 01:32:...|2018-02-09 01:32:...|       NA|COLUMNAR_V3|
	|                0|Success|2018-02-09 01:32:...|2018-02-09 01:32:...|       NA|COLUMNAR_V3|
	+-----------------+-------+--------------------+--------------------+---------+-----------+
	
	18/02/09 01:32:24 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table
	18/02/09 01:32:25 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 3 added in the session param
	18/02/09 01:32:25 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/09 01:32:25 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/09 01:32:25 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 3 added in the session param
	18/02/09 01:32:25 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/09 01:32:25 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/09 01:32:25 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_sum
	18/02/09 01:32:25 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_sum
	18/02/09 01:32:25 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table
	18/02/09 01:32:25 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Compaction request received for table default.main_table
	18/02/09 01:32:26 AUDIT CarbonAlterTableCompactionCommand: [hadoop][root][Thread-1]Compaction request received for table default.main_table_preagg_sum
	18/02/09 01:32:26 ERROR CarbonTableCompactor: ScalaTest-run-running-TestPreAggregateLoad Problem while committing data maps
	java.lang.RuntimeException: Failed to update table status for pre-aggregate table
		at scala.sys.package$.error(package.scala:27)
		at org.apache.spark.sql.execution.command.preaaggregate.CommitPreAggregateListener$.onEvent(PreAggregateListeners.scala:317)
		at org.apache.carbondata.events.OperationListenerBus.fireEvent(OperationListenerBus.java:117)
		at org.apache.carbondata.spark.rdd.CarbonTableCompactor.triggerCompaction(CarbonTableCompactor.scala:265)
		at org.apache.carbondata.spark.rdd.CarbonTableCompactor.scanSegmentsAndSubmitJob(CarbonTableCompactor.scala:123)
		at org.apache.carbondata.spark.rdd.CarbonTableCompactor.executeCompaction(CarbonTableCompactor.scala:74)
		at org.apache.carbondata.spark.rdd.CarbonDataRDDFactory$$anon$2.run(CarbonDataRDDFactory.scala:172)
		at org.apache.carbondata.spark.rdd.CarbonDataRDDFactory$.startCompactionThreads(CarbonDataRDDFactory.scala:260)
		at org.apache.carbondata.spark.rdd.CarbonDataRDDFactory$.handleSegmentMerging(CarbonDataRDDFactory.scala:780)
		at org.apache.carbondata.spark.rdd.CarbonDataRDDFactory$.loadCarbonData(CarbonDataRDDFactory.scala:568)
		at org.apache.spark.sql.execution.command.management.CarbonLoadDataCommand.loadData(CarbonLoadDataCommand.scala:485)
		at org.apache.spark.sql.execution.command.management.CarbonLoadDataCommand.processData(CarbonLoadDataCommand.scala:261)
		at org.apache.spark.sql.execution.command.AtomicRunnableCommand.run(package.scala:92)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult$lzycompute(commands.scala:58)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult(commands.scala:56)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.executeCollect(commands.scala:67)
		at org.apache.spark.sql.Dataset.<init>(Dataset.scala:183)
		at org.apache.spark.sql.Dataset$.ofRows(Dataset.scala:68)
		at org.apache.spark.sql.SparkSession.sql(SparkSession.scala:632)
		at org.apache.spark.sql.test.Spark2TestQueryExecutor.sql(Spark2TestQueryExecutor.scala:35)
		at org.apache.spark.sql.test.util.QueryTest.sql(QueryTest.scala:113)
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggregateLoad$$anonfun$35.apply$mcV$sp(TestPreAggregateLoad.scala:1196)
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggregateLoad$$anonfun$35.apply(TestPreAggregateLoad.scala:1161)
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggregateLoad$$anonfun$35.apply(TestPreAggregateLoad.scala:1161)
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
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggregateLoad.org$scalatest$BeforeAndAfterEach$$super$runTest(TestPreAggregateLoad.scala:29)
		at org.scalatest.BeforeAndAfterEach$class.runTest(BeforeAndAfterEach.scala:255)
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggregateLoad.runTest(TestPreAggregateLoad.scala:29)
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
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggregateLoad.org$scalatest$BeforeAndAfterAll$$super$run(TestPreAggregateLoad.scala:29)
		at org.scalatest.BeforeAndAfterAll$class.liftedTree1$1(BeforeAndAfterAll.scala:257)
		at org.scalatest.BeforeAndAfterAll$class.run(BeforeAndAfterAll.scala:256)
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggregateLoad.run(TestPreAggregateLoad.scala:29)
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
	18/02/09 01:32:26 AUDIT CarbonTableCompactor: [hadoop][root][Thread-1]Compaction request completed for table default.main_table
	18/02/09 01:32:26 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table
	18/02/09 01:32:26 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 4 added in the session param
	18/02/09 01:32:26 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/09 01:32:26 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/09 01:32:26 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 4 added in the session param
	18/02/09 01:32:26 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/09 01:32:26 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/09 01:32:26 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_sum
	18/02/09 01:32:27 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_sum
	18/02/09 01:32:27 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table
	18/02/09 01:32:27 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Compaction request received for table default.main_table
	18/02/09 01:32:27 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/09 01:32:27 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	+-----------------+-------+--------------------+--------------------+---------+-----------+
	|SegmentSequenceId| Status|     Load Start Time|       Load End Time|Merged To|File Format|
	+-----------------+-------+--------------------+--------------------+---------+-----------+
	|                3|Success|2018-02-09 01:32:...|2018-02-09 01:32:...|       NA|COLUMNAR_V3|
	|                2|Success|2018-02-09 01:32:...|2018-02-09 01:32:...|       NA|COLUMNAR_V3|
	|                1|Success|2018-02-09 01:32:...|2018-02-09 01:32:...|       NA|COLUMNAR_V3|
	|                0|Success|2018-02-09 01:32:...|2018-02-09 01:32:...|       NA|COLUMNAR_V3|
	+-----------------+-------+--------------------+--------------------+---------+-----------+
	
	18/02/09 01:32:27 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/09 01:32:27 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/09 01:32:27 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/09 01:32:27 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/09 01:32:27 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [main_table] under database [default]
	18/02/09 01:32:28 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [main_table_preagg_sum] under database [default]
	18/02/09 01:32:28 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [main_table_preagg_sum] under database [default]
	18/02/09 01:32:28 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [main_table] under database [default]
	
	Process finished with exit code 0
