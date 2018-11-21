	Testing started at 9:34 PM ...
	log4j:WARN No appenders could be found for logger (org.apache.carbondata.core.util.CarbonProperties).
	log4j:WARN Please initialize the log4j system properly.
	log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
	Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
	18/02/06 05:34:38 INFO SparkContext: Running Spark version 2.2.1
	18/02/06 05:34:38 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
	18/02/06 05:34:38 WARN Utils: Your hostname, hadoop resolves to a loopback address: 127.0.0.1; using 10.229.51.168 instead (on interface eth0)
	18/02/06 05:34:38 WARN Utils: Set SPARK_LOCAL_IP if you need to bind to another address
	18/02/06 05:34:38 INFO SparkContext: Submitted application: Spark2TestQueryExecutor
	18/02/06 05:34:38 INFO SecurityManager: Changing view acls to: root
	18/02/06 05:34:38 INFO SecurityManager: Changing modify acls to: root
	18/02/06 05:34:38 INFO SecurityManager: Changing view acls groups to: 
	18/02/06 05:34:38 INFO SecurityManager: Changing modify acls groups to: 
	18/02/06 05:34:38 INFO SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(root); groups with view permissions: Set(); users  with modify permissions: Set(root); groups with modify permissions: Set()
	18/02/06 05:34:38 INFO Utils: Successfully started service 'sparkDriver' on port 56162.
	18/02/06 05:34:38 INFO SparkEnv: Registering MapOutputTracker
	18/02/06 05:34:38 INFO SparkEnv: Registering BlockManagerMaster
	18/02/06 05:34:38 INFO BlockManagerMasterEndpoint: Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
	18/02/06 05:34:38 INFO BlockManagerMasterEndpoint: BlockManagerMasterEndpoint up
	18/02/06 05:34:38 INFO DiskBlockManager: Created local directory at /tmp/blockmgr-929909f1-026e-4df6-9d2e-9ce03bd4304c
	18/02/06 05:34:38 INFO MemoryStore: MemoryStore started with capacity 867.6 MB
	18/02/06 05:34:39 INFO SparkEnv: Registering OutputCommitCoordinator
	18/02/06 05:34:39 INFO Utils: Successfully started service 'SparkUI' on port 4040.
	18/02/06 05:34:39 INFO SparkUI: Bound SparkUI to 0.0.0.0, and started at http://10.229.51.168:4040
	18/02/06 05:34:39 INFO Executor: Starting executor ID driver on host localhost
	18/02/06 05:34:39 INFO Utils: Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 56139.
	18/02/06 05:34:39 INFO NettyBlockTransferService: Server created on 10.229.51.168:56139
	18/02/06 05:34:39 INFO BlockManager: Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
	18/02/06 05:34:39 INFO BlockManagerMaster: Registering BlockManager BlockManagerId(driver, 10.229.51.168, 56139, None)
	18/02/06 05:34:39 INFO BlockManagerMasterEndpoint: Registering block manager 10.229.51.168:56139 with 867.6 MB RAM, BlockManagerId(driver, 10.229.51.168, 56139, None)
	18/02/06 05:34:39 INFO BlockManagerMaster: Registered BlockManager BlockManagerId(driver, 10.229.51.168, 56139, None)
	18/02/06 05:34:39 INFO BlockManager: Initialized BlockManager: BlockManagerId(driver, 10.229.51.168, 56139, None)
	18/02/06 05:34:40 INFO SharedState: Setting hive.metastore.warehouse.dir ('null') to the value of spark.sql.warehouse.dir ('/xubo/git/carbondata/integration/spark-common/target/warehouse').
	18/02/06 05:34:40 INFO SharedState: Warehouse path is '/xubo/git/carbondata/integration/spark-common/target/warehouse'.
	18/02/06 05:34:40 INFO HiveUtils: Initializing HiveMetastoreConnection version 1.2.1 using Spark classes.
	18/02/06 05:34:41 INFO HiveMetaStore: 0: Opening raw store with implemenation class:org.apache.hadoop.hive.metastore.ObjectStore
	18/02/06 05:34:41 INFO ObjectStore: ObjectStore, initialize called
	18/02/06 05:34:41 INFO Persistence: Property hive.metastore.integral.jdo.pushdown unknown - will be ignored
	18/02/06 05:34:41 INFO Persistence: Property datanucleus.cache.level2 unknown - will be ignored
	18/02/06 05:34:43 INFO ObjectStore: Setting MetaStore object pin classes with hive.metastore.cache.pinobjtypes="Table,StorageDescriptor,SerDeInfo,Partition,Database,Type,FieldSchema,Order"
	18/02/06 05:34:45 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/06 05:34:45 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/06 05:34:45 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/06 05:34:45 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/06 05:34:45 INFO Query: Reading in results for query "org.datanucleus.store.rdbms.query.SQLQuery@0" since the connection used is closing
	18/02/06 05:34:45 INFO MetaStoreDirectSql: Using direct SQL, underlying DB is DERBY
	18/02/06 05:34:45 INFO ObjectStore: Initialized ObjectStore
	18/02/06 05:34:46 INFO HiveMetaStore: Added admin role in metastore
	18/02/06 05:34:46 INFO HiveMetaStore: Added public role in metastore
	18/02/06 05:34:46 INFO HiveMetaStore: No user is added in admin role, since config is empty
	18/02/06 05:34:46 INFO HiveMetaStore: 0: get_all_databases
	18/02/06 05:34:46 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_all_databases	
	18/02/06 05:34:46 INFO HiveMetaStore: 0: get_functions: db=default pat=*
	18/02/06 05:34:46 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_functions: db=default pat=*	
	18/02/06 05:34:46 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MResourceUri" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/06 05:34:46 INFO SessionState: Created local directory: /tmp/2282daa5-eaa6-441f-88d3-582fd9fdf7ee_resources
	18/02/06 05:34:46 INFO SessionState: Created HDFS directory: /tmp/hive/root/2282daa5-eaa6-441f-88d3-582fd9fdf7ee
	18/02/06 05:34:46 INFO SessionState: Created local directory: /tmp/root/2282daa5-eaa6-441f-88d3-582fd9fdf7ee
	18/02/06 05:34:46 INFO SessionState: Created HDFS directory: /tmp/hive/root/2282daa5-eaa6-441f-88d3-582fd9fdf7ee/_tmp_space.db
	18/02/06 05:34:46 INFO HiveClientImpl: Warehouse location for Hive client (version 1.2.1) is /xubo/git/carbondata/integration/spark-common/target/warehouse
	18/02/06 05:34:46 INFO HiveMetaStore: 0: get_database: default
	18/02/06 05:34:46 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_database: default	
	18/02/06 05:34:46 INFO HiveMetaStore: 0: get_database: global_temp
	18/02/06 05:34:46 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_database: global_temp	
	18/02/06 05:34:46 WARN ObjectStore: Failed to get database global_temp, returning NoSuchObjectException
	18/02/06 05:34:46 INFO SessionState: Created local directory: /tmp/80db8c39-a845-4780-bc60-47d8283bffe2_resources
	18/02/06 05:34:46 INFO SessionState: Created HDFS directory: /tmp/hive/root/80db8c39-a845-4780-bc60-47d8283bffe2
	18/02/06 05:34:46 INFO SessionState: Created local directory: /tmp/root/80db8c39-a845-4780-bc60-47d8283bffe2
	18/02/06 05:34:46 INFO SessionState: Created HDFS directory: /tmp/hive/root/80db8c39-a845-4780-bc60-47d8283bffe2/_tmp_space.db
	18/02/06 05:34:46 INFO HiveClientImpl: Warehouse location for Hive client (version 1.2.1) is /xubo/git/carbondata/integration/spark-common/target/warehouse
	18/02/06 05:34:47 INFO StateStoreCoordinatorRef: Registered StateStoreCoordinator endpoint
	WARNING: JMockit was initialized on demand, which may cause certain tests to fail;
	please check the documentation for better ways to get it initialized.
	18/02/06 05:34:48 AUDIT CarbonMetaStoreFactory: [hadoop][root][Thread-1]File based carbon metastore is enabled
	18/02/06 05:34:50 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [main_table] under database [default]
	18/02/06 05:34:50 ERROR CarbonProperties: ScalaTest-run-running-TestPreAggregateLoad Configured value for property carbon.number.of.cores.while.loading is wrong. Falling back to the default value 2
	18/02/06 05:34:50 ERROR CarbonProperties: ScalaTest-run-running-TestPreAggregateLoad Configured value for property carbon.number.of.cores.while.loading is wrong. Falling back to the default value 2
	18/02/06 05:34:51 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [main_table_preagg_sum] under database [default]
	18/02/06 05:34:51 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [main_table_preagg_sum] under database [default]
	18/02/06 05:34:51 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [main_table_preagg_avg] under database [default]
	18/02/06 05:34:51 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [main_table_preagg_avg] under database [default]
	18/02/06 05:34:51 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [main_table_preagg_count] under database [default]
	18/02/06 05:34:51 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [main_table_preagg_count] under database [default]
	18/02/06 05:34:51 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [main_table_preagg_min] under database [default]
	18/02/06 05:34:52 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [main_table_preagg_min] under database [default]
	18/02/06 05:34:52 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleting table [main_table_preagg_max] under database [default]
	18/02/06 05:34:52 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [main_table_preagg_max] under database [default]
	18/02/06 05:34:52 AUDIT CarbonDropTableCommand: [hadoop][root][Thread-1]Deleted table [main_table] under database [default]
	18/02/06 05:34:52 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [main_table]
	18/02/06 05:34:53 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [main_table]
	18/02/06 05:34:53 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table
	18/02/06 05:34:55 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table
	18/02/06 05:34:55 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Compaction request received for table default.main_table
	18/02/06 05:34:56 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table
	18/02/06 05:34:56 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table
	18/02/06 05:34:56 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Compaction request received for table default.main_table
	18/02/06 05:34:56 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table
	18/02/06 05:34:56 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table
	18/02/06 05:34:56 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Compaction request received for table default.main_table
	18/02/06 05:34:56 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [main_table_preagg_sum]
	18/02/06 05:34:57 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [main_table_preagg_sum]
	18/02/06 05:34:57 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap preagg_sum successfully added to Table main_table
	18/02/06 05:34:57 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value * added in the session param
	18/02/06 05:34:57 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value true added in the session param
	18/02/06 05:34:57 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:34:57 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value * added in the session param
	18/02/06 05:34:57 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:34:57 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value true added in the session param
	18/02/06 05:34:57 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_sum
	18/02/06 05:35:00 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_sum
	18/02/06 05:35:00 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [main_table_preagg_avg]
	18/02/06 05:35:01 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [main_table_preagg_avg]
	18/02/06 05:35:01 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap preagg_avg successfully added to Table main_table
	18/02/06 05:35:01 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value * added in the session param
	18/02/06 05:35:01 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value true added in the session param
	18/02/06 05:35:01 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:01 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value * added in the session param
	18/02/06 05:35:01 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:01 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value true added in the session param
	18/02/06 05:35:01 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_avg
	18/02/06 05:35:02 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_avg
	18/02/06 05:35:02 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [main_table_preagg_count]
	18/02/06 05:35:02 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [main_table_preagg_count]
	18/02/06 05:35:02 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap preagg_count successfully added to Table main_table
	18/02/06 05:35:02 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value * added in the session param
	18/02/06 05:35:02 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value true added in the session param
	18/02/06 05:35:02 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:02 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value * added in the session param
	18/02/06 05:35:02 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:02 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value true added in the session param
	18/02/06 05:35:02 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_count
	18/02/06 05:35:03 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_count
	18/02/06 05:35:03 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [main_table_preagg_min]
	18/02/06 05:35:03 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [main_table_preagg_min]
	18/02/06 05:35:04 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap preagg_min successfully added to Table main_table
	18/02/06 05:35:04 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value * added in the session param
	18/02/06 05:35:04 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value true added in the session param
	18/02/06 05:35:04 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:04 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value * added in the session param
	18/02/06 05:35:04 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:04 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value true added in the session param
	18/02/06 05:35:04 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_min
	18/02/06 05:35:05 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_min
	18/02/06 05:35:05 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [default] and Table name [main_table_preagg_max]
	18/02/06 05:35:05 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Table created with Database name [default] and Table name [main_table_preagg_max]
	18/02/06 05:35:05 AUDIT CarbonCreateDataMapCommand: [hadoop][root][Thread-1]DataMap preagg_max successfully added to Table main_table
	18/02/06 05:35:05 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value * added in the session param
	18/02/06 05:35:05 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value true added in the session param
	18/02/06 05:35:05 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:05 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value * added in the session param
	18/02/06 05:35:05 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:05 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value true added in the session param
	18/02/06 05:35:05 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_max
	18/02/06 05:35:06 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_max
	18/02/06 05:35:06 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 0 added in the session param
	18/02/06 05:35:06 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table
	18/02/06 05:35:07 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 3 added in the session param
	18/02/06 05:35:07 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:07 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:07 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 3 added in the session param
	18/02/06 05:35:07 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:07 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:07 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_sum
	18/02/06 05:35:07 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_sum
	18/02/06 05:35:07 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 3 added in the session param
	18/02/06 05:35:07 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:07 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:07 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 3 added in the session param
	18/02/06 05:35:07 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:07 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:07 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_avg
	18/02/06 05:35:08 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_avg
	18/02/06 05:35:08 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 3 added in the session param
	18/02/06 05:35:08 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:08 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:08 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 3 added in the session param
	18/02/06 05:35:08 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:08 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:08 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_count
	18/02/06 05:35:08 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_count
	18/02/06 05:35:08 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 3 added in the session param
	18/02/06 05:35:08 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:08 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:08 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 3 added in the session param
	18/02/06 05:35:08 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:08 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:08 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_min
	18/02/06 05:35:09 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_min
	18/02/06 05:35:09 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 3 added in the session param
	18/02/06 05:35:09 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:09 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:09 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 3 added in the session param
	18/02/06 05:35:09 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:09 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:09 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_max
	18/02/06 05:35:09 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_max
	18/02/06 05:35:09 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table
	18/02/06 05:35:09 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Compaction request received for table default.main_table
	18/02/06 05:35:10 AUDIT CarbonAlterTableCompactionCommand: [hadoop][root][Thread-1]Compaction request received for table default.main_table_preagg_sum
	18/02/06 05:35:10 AUDIT CarbonAlterTableCompactionCommand: [hadoop][root][Thread-1]Compaction request received for table default.main_table_preagg_avg
	18/02/06 05:35:10 AUDIT CarbonAlterTableCompactionCommand: [hadoop][root][Thread-1]Compaction request received for table default.main_table_preagg_count
	18/02/06 05:35:10 AUDIT CarbonAlterTableCompactionCommand: [hadoop][root][Thread-1]Compaction request received for table default.main_table_preagg_min
	18/02/06 05:35:10 AUDIT CarbonAlterTableCompactionCommand: [hadoop][root][Thread-1]Compaction request received for table default.main_table_preagg_max
	18/02/06 05:35:10 ERROR CarbonTableCompactor: ScalaTest-run-running-TestPreAggregateLoad Problem while committing data maps
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
		at org.apache.spark.sql.execution.command.management.CarbonInsertIntoCommand.processData(CarbonInsertIntoCommand.scala:83)
		at org.apache.spark.sql.execution.command.AtomicRunnableCommand.run(package.scala:92)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult$lzycompute(commands.scala:58)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult(commands.scala:56)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.executeCollect(commands.scala:67)
		at org.apache.spark.sql.Dataset.<init>(Dataset.scala:183)
		at org.apache.spark.sql.Dataset$.ofRows(Dataset.scala:68)
		at org.apache.spark.sql.SparkSession.sql(SparkSession.scala:632)
		at org.apache.spark.sql.test.Spark2TestQueryExecutor.sql(Spark2TestQueryExecutor.scala:35)
		at org.apache.spark.sql.test.util.QueryTest.sql(QueryTest.scala:113)
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggregateLoad$$anonfun$35.apply$mcV$sp(TestPreAggregateLoad.scala:1173)
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggregateLoad$$anonfun$35.apply(TestPreAggregateLoad.scala:1150)
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggregateLoad$$anonfun$35.apply(TestPreAggregateLoad.scala:1150)
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
	18/02/06 05:35:10 AUDIT CarbonTableCompactor: [hadoop][root][Thread-1]Compaction request completed for table default.main_table
	18/02/06 05:35:10 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table
	18/02/06 05:35:10 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 4 added in the session param
	18/02/06 05:35:10 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:10 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:10 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 4 added in the session param
	18/02/06 05:35:10 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:10 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:10 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_sum
	18/02/06 05:35:11 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_sum
	18/02/06 05:35:11 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 4 added in the session param
	18/02/06 05:35:11 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:11 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:11 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 4 added in the session param
	18/02/06 05:35:11 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:11 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:11 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_avg
	18/02/06 05:35:11 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_avg
	18/02/06 05:35:11 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 4 added in the session param
	18/02/06 05:35:11 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:11 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:11 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 4 added in the session param
	18/02/06 05:35:11 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:11 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:11 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_count
	18/02/06 05:35:12 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_count
	18/02/06 05:35:12 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 4 added in the session param
	18/02/06 05:35:12 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:12 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:12 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 4 added in the session param
	18/02/06 05:35:12 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:12 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:12 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_min
	18/02/06 05:35:12 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_min
	18/02/06 05:35:12 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 4 added in the session param
	18/02/06 05:35:12 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:12 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:12 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 4 added in the session param
	18/02/06 05:35:12 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:12 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:12 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_max
	18/02/06 05:35:13 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_max
	18/02/06 05:35:13 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table
	18/02/06 05:35:13 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Compaction request received for table default.main_table
	18/02/06 05:35:13 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table
	18/02/06 05:35:13 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 5 added in the session param
	18/02/06 05:35:13 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:13 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:13 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 5 added in the session param
	18/02/06 05:35:13 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:13 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:13 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_sum
	18/02/06 05:35:14 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_sum
	18/02/06 05:35:14 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 5 added in the session param
	18/02/06 05:35:14 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:14 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:14 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 5 added in the session param
	18/02/06 05:35:14 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:14 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:14 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_avg
	18/02/06 05:35:15 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_avg
	18/02/06 05:35:15 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 5 added in the session param
	18/02/06 05:35:15 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:15 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:15 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 5 added in the session param
	18/02/06 05:35:15 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:15 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:15 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_count
	18/02/06 05:35:15 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_count
	18/02/06 05:35:15 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 5 added in the session param
	18/02/06 05:35:15 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:15 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:15 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 5 added in the session param
	18/02/06 05:35:15 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:15 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:15 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_min
	18/02/06 05:35:16 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_min
	18/02/06 05:35:16 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 5 added in the session param
	18/02/06 05:35:16 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:16 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:16 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.input.segments.default.main_table with value 5 added in the session param
	18/02/06 05:35:16 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:16 AUDIT CacheProvider: [hadoop][root][Thread-1]The key validate.carbon.input.segments.default.main_table with value false added in the session param
	18/02/06 05:35:16 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table default.main_table_preagg_max
	18/02/06 05:35:16 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table_preagg_max
	18/02/06 05:35:16 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is successful for default.main_table
	18/02/06 05:35:16 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Compaction request received for table default.main_table
	18/02/06 05:35:16 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:16 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:17 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:17 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:17 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:17 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:17 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:17 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:17 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:17 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:17 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:17 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:17 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:17 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:17 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:17 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:17 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:17 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:18 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:19 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:19 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:19 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:19 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:19 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:19 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:19 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:20 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	18/02/06 05:35:20 AUDIT CacheProvider: [hadoop][root][Thread-1]The key carbon.query.directQueryOnDataMap.enabled with value true added in the session param
	+-------------+------------------+
	|main_table_id|main_table_age_sum|
	+-------------+------------------+
	|            1|                31|
	|            3|                70|
	|            4|                55|
	|            2|                27|
	|            1|                83|
	|            3|                70|
	|            4|                55|
	|            2|                27|
	|            1|                31|
	|            3|                70|
	|            4|                55|
	|            2|                27|
	|            1|                26|
	+-------------+------------------+
	
	+-----------------+-------+--------------------+--------------------+---------+-----------+
	|SegmentSequenceId| Status|     Load Start Time|       Load End Time|Merged To|File Format|
	+-----------------+-------+--------------------+--------------------+---------+-----------+
	|                3|Success|2018-02-06 05:35:...|2018-02-06 05:35:...|       NA|COLUMNAR_V3|
	|                2|Success|2018-02-06 05:35:...|2018-02-06 05:35:...|       NA|COLUMNAR_V3|
	|                1|Success|2018-02-06 05:35:...|2018-02-06 05:35:...|       NA|COLUMNAR_V3|
	|                0|Success|2018-02-06 05:34:...|2018-02-06 05:35:...|       NA|COLUMNAR_V3|
	+-----------------+-------+--------------------+--------------------+---------+-----------+
	
	
	"3Success2018-02-06 05:35:13.9562018-02-06 05:35:14.516NACOLUMNAR_V32Success2018-02-06 05:35:10.8582018-02-06 05:35:11.311NACOLUMNAR_V31Success2018-02-06 05:35:07.0382018-02-06 05:35:07.579NACOLUMNAR_V30Success2018-02-06 05:34:57.5062018-02-06 05:35:00.882NACOLUMNAR_V3" did not contain "Compacted" Failed for [SegmentSequenceId: string, Status: string ... 4 more fields] (Compacted doesn't exist in result)
	ScalaTestFailureLocation: org.apache.spark.sql.test.util.QueryTest$$anonfun$checkExistence$1 at (QueryTest.scala:59)
	org.scalatest.exceptions.TestFailedException: "3Success2018-02-06 05:35:13.9562018-02-06 05:35:14.516NACOLUMNAR_V32Success2018-02-06 05:35:10.8582018-02-06 05:35:11.311NACOLUMNAR_V31Success2018-02-06 05:35:07.0382018-02-06 05:35:07.579NACOLUMNAR_V30Success2018-02-06 05:34:57.5062018-02-06 05:35:00.882NACOLUMNAR_V3" did not contain "Compacted" Failed for [SegmentSequenceId: string, Status: string ... 4 more fields] (Compacted doesn't exist in result)
		at org.scalatest.Assertions$class.newAssertionFailedException(Assertions.scala:500)
		at org.scalatest.FunSuite.newAssertionFailedException(FunSuite.scala:1555)
		at org.scalatest.Assertions$AssertionsHelper.macroAssert(Assertions.scala:466)
		at org.apache.spark.sql.test.util.QueryTest$$anonfun$checkExistence$1.apply(QueryTest.scala:59)
		at org.apache.spark.sql.test.util.QueryTest$$anonfun$checkExistence$1.apply(QueryTest.scala:57)
		at scala.collection.IndexedSeqOptimized$class.foreach(IndexedSeqOptimized.scala:33)
		at scala.collection.mutable.WrappedArray.foreach(WrappedArray.scala:35)
		at org.apache.spark.sql.test.util.QueryTest.checkExistence(QueryTest.scala:57)
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggregateLoad$$anonfun$35.apply$mcV$sp(TestPreAggregateLoad.scala:1185)
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggregateLoad$$anonfun$35.apply(TestPreAggregateLoad.scala:1150)
		at org.apache.carbondata.integration.spark.testsuite.preaggregate.TestPreAggregateLoad$$anonfun$35.apply(TestPreAggregateLoad.scala:1150)
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
	
	
	Process finished with exit code 0
