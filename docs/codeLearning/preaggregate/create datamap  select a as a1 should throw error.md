	create datamap  *** select a as a1 **
	
	should throw error

code:

	  test("test pre agg create table 2") {
	    sql("create datamap preagg2 on table PreAggMain using 'preaggregate' as select a as a1,sum(b) from PreAggMain group by a")
	    checkExistence(sql("DESCRIBE FORMATTED PreAggMain_preagg2"), true, "preaggmain_a")
	    checkExistence(sql("DESCRIBE FORMATTED PreAggMain_preagg2"), true, "preaggmain_b_sum")
	    checkExistence(sql("DESCRIBE FORMATTED PreAggMain_preagg2"), false, "preaggmain_a1")
	    sql("DESCRIBE FORMATTED PreAggMain_preagg2").show()
	    sql("select * from PreAggMain_preagg2").show()
	    sql("select a1 from PreAggMain_preagg2").show()
	
	    sql("DESCRIBE FORMATTED PreAggMain").show()
	    sql("select * from PreAggMain").show()
	    sql("select a as a1,sum(b) from PreAggMain group by a").show()
	
	    sql("drop datamap preagg2 on table PreAggMain")
	  }

error:
	
	Testing started at 11:56 AM ...
	log4j:WARN No appenders could be found for logger (org.apache.spark.sql.test.TestQueryExecutor$).
	log4j:WARN Please initialize the log4j system properly.
	log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
	Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
	18/02/01 19:56:19 INFO SparkContext: Running Spark version 2.2.1
	18/02/01 19:56:19 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
	18/02/01 19:56:20 WARN Utils: Your hostname, hadoop resolves to a loopback address: 127.0.0.1; using 10.229.51.168 instead (on interface eth0)
	18/02/01 19:56:20 WARN Utils: Set SPARK_LOCAL_IP if you need to bind to another address
	18/02/01 19:56:20 INFO SparkContext: Submitted application: Spark2TestQueryExecutor
	18/02/01 19:56:20 INFO SecurityManager: Changing view acls to: root
	18/02/01 19:56:20 INFO SecurityManager: Changing modify acls to: root
	18/02/01 19:56:20 INFO SecurityManager: Changing view acls groups to: 
	18/02/01 19:56:20 INFO SecurityManager: Changing modify acls groups to: 
	18/02/01 19:56:20 INFO SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(root); groups with view permissions: Set(); users  with modify permissions: Set(root); groups with modify permissions: Set()
	18/02/01 19:56:20 INFO Utils: Successfully started service 'sparkDriver' on port 59637.
	18/02/01 19:56:20 INFO SparkEnv: Registering MapOutputTracker
	18/02/01 19:56:20 INFO SparkEnv: Registering BlockManagerMaster
	18/02/01 19:56:20 INFO BlockManagerMasterEndpoint: Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
	18/02/01 19:56:20 INFO BlockManagerMasterEndpoint: BlockManagerMasterEndpoint up
	18/02/01 19:56:20 INFO DiskBlockManager: Created local directory at /tmp/blockmgr-8065002d-8022-452b-8b9c-dfa2b6130a67
	18/02/01 19:56:20 INFO MemoryStore: MemoryStore started with capacity 867.6 MB
	18/02/01 19:56:20 INFO SparkEnv: Registering OutputCommitCoordinator
	18/02/01 19:56:21 INFO Utils: Successfully started service 'SparkUI' on port 4040.
	18/02/01 19:56:21 INFO SparkUI: Bound SparkUI to 0.0.0.0, and started at http://10.229.51.168:4040
	18/02/01 19:56:21 INFO Executor: Starting executor ID driver on host localhost
	18/02/01 19:56:21 INFO Utils: Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 43279.
	18/02/01 19:56:21 INFO NettyBlockTransferService: Server created on 10.229.51.168:43279
	18/02/01 19:56:21 INFO BlockManager: Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
	18/02/01 19:56:21 INFO BlockManagerMaster: Registering BlockManager BlockManagerId(driver, 10.229.51.168, 43279, None)
	18/02/01 19:56:21 INFO BlockManagerMasterEndpoint: Registering block manager 10.229.51.168:43279 with 867.6 MB RAM, BlockManagerId(driver, 10.229.51.168, 43279, None)
	18/02/01 19:56:21 INFO BlockManagerMaster: Registered BlockManager BlockManagerId(driver, 10.229.51.168, 43279, None)
	18/02/01 19:56:21 INFO BlockManager: Initialized BlockManager: BlockManagerId(driver, 10.229.51.168, 43279, None)
	18/02/01 19:56:21 INFO SharedState: Setting hive.metastore.warehouse.dir ('null') to the value of spark.sql.warehouse.dir ('/xubo/git/carbondata/integration/spark-common/target/warehouse').
	18/02/01 19:56:21 INFO SharedState: Warehouse path is '/xubo/git/carbondata/integration/spark-common/target/warehouse'.
	18/02/01 19:56:22 INFO HiveUtils: Initializing HiveMetastoreConnection version 1.2.1 using Spark classes.
	18/02/01 19:56:23 INFO HiveMetaStore: 0: Opening raw store with implemenation class:org.apache.hadoop.hive.metastore.ObjectStore
	18/02/01 19:56:23 INFO ObjectStore: ObjectStore, initialize called
	18/02/01 19:56:23 INFO Persistence: Property hive.metastore.integral.jdo.pushdown unknown - will be ignored
	18/02/01 19:56:23 INFO Persistence: Property datanucleus.cache.level2 unknown - will be ignored
	18/02/01 19:56:25 INFO ObjectStore: Setting MetaStore object pin classes with hive.metastore.cache.pinobjtypes="Table,StorageDescriptor,SerDeInfo,Partition,Database,Type,FieldSchema,Order"
	18/02/01 19:56:27 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/01 19:56:27 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/01 19:56:27 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/01 19:56:27 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/01 19:56:27 INFO Query: Reading in results for query "org.datanucleus.store.rdbms.query.SQLQuery@0" since the connection used is closing
	18/02/01 19:56:27 INFO MetaStoreDirectSql: Using direct SQL, underlying DB is DERBY
	18/02/01 19:56:27 INFO ObjectStore: Initialized ObjectStore
	18/02/01 19:56:28 INFO HiveMetaStore: Added admin role in metastore
	18/02/01 19:56:28 INFO HiveMetaStore: Added public role in metastore
	18/02/01 19:56:28 INFO HiveMetaStore: No user is added in admin role, since config is empty
	18/02/01 19:56:28 INFO HiveMetaStore: 0: get_all_databases
	18/02/01 19:56:28 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_all_databases	
	18/02/01 19:56:28 INFO HiveMetaStore: 0: get_functions: db=default pat=*
	18/02/01 19:56:28 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_functions: db=default pat=*	
	18/02/01 19:56:28 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MResourceUri" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/01 19:56:28 INFO SessionState: Created local directory: /tmp/20ad95fe-912f-4bcc-8b95-87ade33c438c_resources
	18/02/01 19:56:28 INFO SessionState: Created HDFS directory: /tmp/hive/root/20ad95fe-912f-4bcc-8b95-87ade33c438c
	18/02/01 19:56:28 INFO SessionState: Created local directory: /tmp/root/20ad95fe-912f-4bcc-8b95-87ade33c438c
	18/02/01 19:56:28 INFO SessionState: Created HDFS directory: /tmp/hive/root/20ad95fe-912f-4bcc-8b95-87ade33c438c/_tmp_space.db
	18/02/01 19:56:28 INFO HiveClientImpl: Warehouse location for Hive client (version 1.2.1) is /xubo/git/carbondata/integration/spark-common/target/warehouse
	18/02/01 19:56:28 INFO HiveMetaStore: 0: get_database: default
	18/02/01 19:56:28 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_database: default	
	18/02/01 19:56:28 INFO HiveMetaStore: 0: get_database: global_temp
	18/02/01 19:56:28 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_database: global_temp	
	18/02/01 19:56:28 WARN ObjectStore: Failed to get database global_temp, returning NoSuchObjectException
	18/02/01 19:56:28 INFO SessionState: Created local directory: /tmp/208a2c8c-9cd2-49e7-a653-942820aefd3a_resources
	18/02/01 19:56:28 INFO SessionState: Created HDFS directory: /tmp/hive/root/208a2c8c-9cd2-49e7-a653-942820aefd3a
	18/02/01 19:56:28 INFO SessionState: Created local directory: /tmp/root/208a2c8c-9cd2-49e7-a653-942820aefd3a
	18/02/01 19:56:28 INFO SessionState: Created HDFS directory: /tmp/hive/root/208a2c8c-9cd2-49e7-a653-942820aefd3a/_tmp_space.db
	18/02/01 19:56:28 INFO HiveClientImpl: Warehouse location for Hive client (version 1.2.1) is /xubo/git/carbondata/integration/spark-common/target/warehouse
	18/02/01 19:56:29 INFO StateStoreCoordinatorRef: Registered StateStoreCoordinator endpoint
	18/02/01 19:56:29 AUDIT CarbonMetaStoreFactory: [hadoop][root][Thread-1]File based carbon metastore is enabled
	18/02/01 19:56:30 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [preaggmain]
	18/02/01 19:56:31 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [preaggmain]
	18/02/01 19:56:31 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [preaggmain1]
	18/02/01 19:56:31 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [preaggmain1]
	18/02/01 19:56:31 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [preaggmain2]
	18/02/01 19:56:32 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [preaggmain2]
	18/02/01 19:56:32 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [maintable]
	18/02/01 19:56:32 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [maintable]
	18/02/01 19:56:33 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [preaggmain_preagg2]
	18/02/01 19:56:33 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [preaggmain_preagg2]
	18/02/01 19:56:33 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap preagg2 successfully added to Table PreAggMain
	+--------------------+--------------------+--------------------+
	|            col_name|           data_type|             comment|
	+--------------------+--------------------+--------------------+
	|preaggmain_a     ...|string           ...|KEY COLUMN,null  ...|
	|preaggmain_b_sum ...|double           ...|MEASURE,null     ...|
	|                 ...|                 ...|                 ...|
	|##Detailed Table ...|                 ...|                 ...|
	|Database Name    ...|default          ...|                 ...|
	|Table Name       ...|preaggmain_preagg...|                 ...|
	|CARBON Store Path...|/xubo/git/carbond...|                 ...|
	|Comment          ...|                 ...|                 ...|
	|Table Block Size ...|1024 MB          ...|                 ...|
	|Table Data Size  ...|0                ...|                 ...|
	|Table Index Size ...|0                ...|                 ...|
	|Last Update Time ...|0                ...|                 ...|
	|SORT_SCOPE       ...|LOCAL_SORT       ...|LOCAL_SORT       ...|
	|Streaming        ...|false            ...|                 ...|
	|                 ...|                 ...|                 ...|
	|##Detailed Column...|                 ...|                 ...|
	|ADAPTIVE         ...|                 ...|                 ...|
	|SORT_COLUMNS     ...|preaggmain_a     ...|                 ...|
	+--------------------+--------------------+--------------------+
	
	+------------+----------------+
	|preaggmain_a|preaggmain_b_sum|
	+------------+----------------+
	+------------+----------------+
	
	
	cannot resolve '`a1`' given input columns: [preaggmain_a, preaggmain_b_sum]; line 1 pos 7;
	'Project ['a1]
	+- SubqueryAlias preaggmain_preagg2
	   +- Relation[preaggmain_a#101,preaggmain_b_sum#102] CarbonDatasourceHadoopRelation [ Database name :default, Table name :preaggmain_preagg2, Schema :Some(StructType(StructField(preaggmain_a,StringType,true), StructField(preaggmain_b_sum,DoubleType,true))) ]
	
	org.apache.spark.sql.AnalysisException: cannot resolve '`a1`' given input columns: [preaggmain_a, preaggmain_b_sum]; line 1 pos 7;
	'Project ['a1]
	+- SubqueryAlias preaggmain_preagg2
	   +- Relation[preaggmain_a#101,preaggmain_b_sum#102] CarbonDatasourceHadoopRelation [ Database name :default, Table name :preaggmain_preagg2, Schema :Some(StructType(StructField(preaggmain_a,StringType,true), StructField(preaggmain_b_sum,DoubleType,true))) ]
	
		at org.apache.spark.sql.catalyst.analysis.package$AnalysisErrorAt.failAnalysis(package.scala:42)
		at org.apache.spark.sql.catalyst.analysis.CheckAnalysis$$anonfun$checkAnalysis$1$$anonfun$apply$2.applyOrElse(CheckAnalysis.scala:88)
		at org.apache.spark.sql.catalyst.analysis.CheckAnalysis$$anonfun$checkAnalysis$1$$anonfun$apply$2.applyOrElse(CheckAnalysis.scala:85)
		at org.apache.spark.sql.catalyst.trees.TreeNode$$anonfun$transformUp$1.apply(TreeNode.scala:289)
		at org.apache.spark.sql.catalyst.trees.TreeNode$$anonfun$transformUp$1.apply(TreeNode.scala:289)
		at org.apache.spark.sql.catalyst.trees.CurrentOrigin$.withOrigin(TreeNode.scala:70)
		at org.apache.spark.sql.catalyst.trees.TreeNode.transformUp(TreeNode.scala:288)
		at org.apache.spark.sql.catalyst.plans.QueryPlan$$anonfun$transformExpressionsUp$1.apply(QueryPlan.scala:268)
		at org.apache.spark.sql.catalyst.plans.QueryPlan$$anonfun$transformExpressionsUp$1.apply(QueryPlan.scala:268)
		at org.apache.spark.sql.catalyst.plans.QueryPlan.transformExpression$1(QueryPlan.scala:279)
		at org.apache.spark.sql.catalyst.plans.QueryPlan.org$apache$spark$sql$catalyst$plans$QueryPlan$$recursiveTransform$1(QueryPlan.scala:289)
		at org.apache.spark.sql.catalyst.plans.QueryPlan$$anonfun$org$apache$spark$sql$catalyst$plans$QueryPlan$$recursiveTransform$1$1.apply(QueryPlan.scala:293)
		at scala.collection.TraversableLike$$anonfun$map$1.apply(TraversableLike.scala:234)
		at scala.collection.TraversableLike$$anonfun$map$1.apply(TraversableLike.scala:234)
		at scala.collection.immutable.List.foreach(List.scala:381)
		at scala.collection.TraversableLike$class.map(TraversableLike.scala:234)
		at scala.collection.immutable.List.map(List.scala:285)
		at org.apache.spark.sql.catalyst.plans.QueryPlan.org$apache$spark$sql$catalyst$plans$QueryPlan$$recursiveTransform$1(QueryPlan.scala:293)
		at org.apache.spark.sql.catalyst.plans.QueryPlan$$anonfun$6.apply(QueryPlan.scala:298)
		at org.apache.spark.sql.catalyst.trees.TreeNode.mapProductIterator(TreeNode.scala:187)
		at org.apache.spark.sql.catalyst.plans.QueryPlan.mapExpressions(QueryPlan.scala:298)
		at org.apache.spark.sql.catalyst.plans.QueryPlan.transformExpressionsUp(QueryPlan.scala:268)
		at org.apache.spark.sql.catalyst.analysis.CheckAnalysis$$anonfun$checkAnalysis$1.apply(CheckAnalysis.scala:85)
		at org.apache.spark.sql.catalyst.analysis.CheckAnalysis$$anonfun$checkAnalysis$1.apply(CheckAnalysis.scala:78)
		at org.apache.spark.sql.catalyst.trees.TreeNode.foreachUp(TreeNode.scala:127)
		at org.apache.spark.sql.catalyst.analysis.CheckAnalysis$class.checkAnalysis(CheckAnalysis.scala:78)
		at org.apache.spark.sql.catalyst.analysis.Analyzer.checkAnalysis(Analyzer.scala:91)
		at org.apache.spark.sql.execution.QueryExecution.assertAnalyzed(QueryExecution.scala:52)
		at org.apache.spark.sql.Dataset$.ofRows(Dataset.scala:67)
		at org.apache.spark.sql.SparkSession.sql(SparkSession.scala:632)
		at org.apache.spark.sql.test.Spark2TestQueryExecutor.sql(Spark2TestQueryExecutor.scala:35)
		at org.apache.spark.sql.test.util.QueryTest.sql(QueryTest.scala:110)
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggCreateCommand$$anonfun$2.apply$mcV$sp(TestPreAggCreateCommand.scala:63)
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggCreateCommand$$anonfun$2.apply(TestPreAggCreateCommand.scala:56)
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggCreateCommand$$anonfun$2.apply(TestPreAggCreateCommand.scala:56)
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
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggCreateCommand.org$scalatest$BeforeAndAfterAll$$super$run(TestPreAggCreateCommand.scala:34)
		at org.scalatest.BeforeAndAfterAll$class.liftedTree1$1(BeforeAndAfterAll.scala:257)
		at org.scalatest.BeforeAndAfterAll$class.run(BeforeAndAfterAll.scala:256)
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggCreateCommand.run(TestPreAggCreateCommand.scala:34)
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
	
	18/02/01 19:56:35 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [maintable] under database [default]
	18/02/01 19:56:35 ERROR CarbonProperties: ScalaTest-run Configured value for property carbon.number.of.cores.while.loading is wrong. Falling back to the default value 2
	18/02/01 19:56:35 ERROR CarbonProperties: ScalaTest-run Configured value for property carbon.number.of.cores.while.loading is wrong. Falling back to the default value 2
	18/02/01 19:56:36 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [maintable] under database [default]
	18/02/01 19:56:36 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [preaggmain] under database [default]
	18/02/01 19:56:36 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [preaggmain_preagg2] under database [default]
	18/02/01 19:56:36 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [preaggmain_preagg2] under database [default]
	18/02/01 19:56:36 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [preaggmain] under database [default]
	18/02/01 19:56:36 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [preaggmain1] under database [default]
	18/02/01 19:56:36 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [preaggmain1] under database [default]
	18/02/01 19:56:36 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [preaggmain2] under database [default]
	18/02/01 19:56:36 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [preaggmain2] under database [default]
	
	Process finished with exit code 0
