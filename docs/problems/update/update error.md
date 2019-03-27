-XX:PermSize=128m -XX:MaxPermSize=128m	
	
	Java HotSpot(TM) 64-Bit Server VM warning: ignoring option PermSize=128m; support was removed in 8.0
	Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=128m; support was removed in 8.0
	log4j:WARN No appenders could be found for logger (org.apache.hadoop.util.Shell).
	log4j:WARN Please initialize the log4j system properly.
	log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
	Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
	18/02/27 09:21:43 INFO SparkContext: Running Spark version 2.2.1
	18/02/27 09:21:43 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
	18/02/27 09:21:43 WARN Utils: Your hostname, hadoop resolves to a loopback address: 127.0.0.1; using 10.229.51.168 instead (on interface eth0)
	18/02/27 09:21:43 WARN Utils: Set SPARK_LOCAL_IP if you need to bind to another address
	18/02/27 09:21:43 INFO SparkContext: Submitted application: a54b1dea-35a3-48a4-ae32-aa5d5d8e86d5
	18/02/27 09:21:43 INFO SecurityManager: Changing view acls to: root
	18/02/27 09:21:43 INFO SecurityManager: Changing modify acls to: root
	18/02/27 09:21:43 INFO SecurityManager: Changing view acls groups to: 
	18/02/27 09:21:43 INFO SecurityManager: Changing modify acls groups to: 
	18/02/27 09:21:43 INFO SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(root); groups with view permissions: Set(); users  with modify permissions: Set(root); groups with modify permissions: Set()
	18/02/27 09:21:44 INFO Utils: Successfully started service 'sparkDriver' on port 35688.
	18/02/27 09:21:44 INFO SparkEnv: Registering MapOutputTracker
	18/02/27 09:21:44 INFO SparkEnv: Registering BlockManagerMaster
	18/02/27 09:21:44 INFO BlockManagerMasterEndpoint: Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
	18/02/27 09:21:44 INFO BlockManagerMasterEndpoint: BlockManagerMasterEndpoint up
	18/02/27 09:21:44 INFO DiskBlockManager: Created local directory at /tmp/blockmgr-79cec97e-5125-4f7f-8e1e-f653cc111190
	18/02/27 09:21:44 INFO MemoryStore: MemoryStore started with capacity 867.6 MB
	18/02/27 09:21:44 INFO SparkEnv: Registering OutputCommitCoordinator
	18/02/27 09:21:44 INFO Utils: Successfully started service 'SparkUI' on port 4040.
	18/02/27 09:21:44 INFO SparkUI: Bound SparkUI to 0.0.0.0, and started at http://127.0.0.1:4040
	18/02/27 09:21:44 INFO Executor: Starting executor ID driver on host localhost
	18/02/27 09:21:44 INFO Utils: Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 56803.
	18/02/27 09:21:44 INFO NettyBlockTransferService: Server created on 127.0.0.1:56803
	18/02/27 09:21:44 INFO BlockManager: Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
	18/02/27 09:21:44 INFO BlockManagerMaster: Registering BlockManager BlockManagerId(driver, 127.0.0.1, 56803, None)
	18/02/27 09:21:44 INFO BlockManagerMasterEndpoint: Registering block manager 127.0.0.1:56803 with 867.6 MB RAM, BlockManagerId(driver, 127.0.0.1, 56803, None)
	18/02/27 09:21:44 INFO BlockManagerMaster: Registered BlockManager BlockManagerId(driver, 127.0.0.1, 56803, None)
	18/02/27 09:21:44 INFO BlockManager: Initialized BlockManager: BlockManagerId(driver, 127.0.0.1, 56803, None)
	18/02/27 09:21:44 INFO CarbonProperties: main Property file path: /xubo/git/carbondata2/carbondata/../../../conf/carbon.properties
	18/02/27 09:21:44 INFO CarbonProperties: main ------Using Carbon.properties --------
	18/02/27 09:21:44 INFO CarbonProperties: main {}
	18/02/27 09:21:44 INFO CarbonProperties: main Carbon Current data file version: V3
	18/02/27 09:21:44 INFO CarbonProperties: main Blocklet Size Configured value is "64
	18/02/27 09:21:44 WARN CarbonProperties: main The enable unsafe sort value "null" is invalid. Using the default value "false
	18/02/27 09:21:44 WARN CarbonProperties: main The custom block distribution value "null" is invalid. Using the default value "false
	18/02/27 09:21:44 WARN CarbonProperties: main The enable vector reader value "null" is invalid. Using the default value "true
	18/02/27 09:21:44 WARN CarbonProperties: main The carbon task distribution value "null" is invalid. Using the default value "block
	18/02/27 09:21:44 WARN CarbonProperties: main The enable auto handoff value "null" is invalid. Using the default value "true
	18/02/27 09:21:44 ERROR CarbonProperties: main The specified value for property sort.inmemory.size.inmbis Invalid. Taking the default value.1024
	18/02/27 09:21:44 INFO SharedState: Setting hive.metastore.warehouse.dir ('null') to the value of spark.sql.warehouse.dir ('file:/xubo/git/carbondata2/carbondata/spark-warehouse/').
	18/02/27 09:21:44 INFO SharedState: Warehouse path is 'file:/xubo/git/carbondata2/carbondata/spark-warehouse/'.
	18/02/27 09:21:45 INFO HiveUtils: Initializing HiveMetastoreConnection version 1.2.1 using Spark classes.
	18/02/27 09:21:46 INFO HiveMetaStore: 0: Opening raw store with implemenation class:org.apache.hadoop.hive.metastore.ObjectStore
	18/02/27 09:21:46 INFO ObjectStore: ObjectStore, initialize called
	18/02/27 09:21:46 INFO Persistence: Property hive.metastore.integral.jdo.pushdown unknown - will be ignored
	18/02/27 09:21:46 INFO Persistence: Property datanucleus.cache.level2 unknown - will be ignored
	18/02/27 09:21:47 INFO ObjectStore: Setting MetaStore object pin classes with hive.metastore.cache.pinobjtypes="Table,StorageDescriptor,SerDeInfo,Partition,Database,Type,FieldSchema,Order"
	18/02/27 09:21:48 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/27 09:21:48 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/27 09:21:49 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/27 09:21:49 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/27 09:21:49 INFO Query: Reading in results for query "org.datanucleus.store.rdbms.query.SQLQuery@0" since the connection used is closing
	18/02/27 09:21:49 INFO MetaStoreDirectSql: Using direct SQL, underlying DB is DERBY
	18/02/27 09:21:49 INFO ObjectStore: Initialized ObjectStore
	18/02/27 09:21:49 INFO HiveMetaStore: Added admin role in metastore
	18/02/27 09:21:49 INFO HiveMetaStore: Added public role in metastore
	18/02/27 09:21:49 INFO HiveMetaStore: No user is added in admin role, since config is empty
	18/02/27 09:21:49 INFO HiveMetaStore: 0: get_all_databases
	18/02/27 09:21:49 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_all_databases	
	18/02/27 09:21:49 INFO HiveMetaStore: 0: get_functions: db=default pat=*
	18/02/27 09:21:49 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_functions: db=default pat=*	
	18/02/27 09:21:49 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MResourceUri" is tagged as "embedded-only" so does not have its own datastore table.
	18/02/27 09:21:49 INFO HiveMetaStore: 0: get_functions: db=public pat=*
	18/02/27 09:21:49 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_functions: db=public pat=*	
	18/02/27 09:21:49 INFO SessionState: Created local directory: /tmp/a61c3538-285b-49a9-8ad7-c9bbfa064148_resources
	18/02/27 09:21:49 INFO SessionState: Created HDFS directory: /tmp/hive/root/a61c3538-285b-49a9-8ad7-c9bbfa064148
	18/02/27 09:21:49 INFO SessionState: Created local directory: /tmp/root/a61c3538-285b-49a9-8ad7-c9bbfa064148
	18/02/27 09:21:49 INFO SessionState: Created HDFS directory: /tmp/hive/root/a61c3538-285b-49a9-8ad7-c9bbfa064148/_tmp_space.db
	18/02/27 09:21:49 INFO HiveClientImpl: Warehouse location for Hive client (version 1.2.1) is file:/xubo/git/carbondata2/carbondata/spark-warehouse/
	18/02/27 09:21:49 INFO HiveMetaStore: 0: get_database: default
	18/02/27 09:21:49 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_database: default	
	18/02/27 09:21:49 INFO HiveMetaStore: 0: get_database: global_temp
	18/02/27 09:21:49 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_database: global_temp	
	18/02/27 09:21:49 WARN ObjectStore: Failed to get database global_temp, returning NoSuchObjectException
	18/02/27 09:21:49 INFO SessionState: Created local directory: /tmp/a8700a64-2bfb-4bd1-9e0c-f46c0b571a0e_resources
	18/02/27 09:21:49 INFO SessionState: Created HDFS directory: /tmp/hive/root/a8700a64-2bfb-4bd1-9e0c-f46c0b571a0e
	18/02/27 09:21:49 INFO SessionState: Created local directory: /tmp/root/a8700a64-2bfb-4bd1-9e0c-f46c0b571a0e
	18/02/27 09:21:49 INFO SessionState: Created HDFS directory: /tmp/hive/root/a8700a64-2bfb-4bd1-9e0c-f46c0b571a0e/_tmp_space.db
	18/02/27 09:21:49 INFO HiveClientImpl: Warehouse location for Hive client (version 1.2.1) is file:/xubo/git/carbondata2/carbondata/spark-warehouse/
	18/02/27 09:21:50 INFO StateStoreCoordinatorRef: Registered StateStoreCoordinator endpoint
	18/02/27 09:21:50 AUDIT CarbonMetaStoreFactory: [hadoop][root][Thread-1]File based carbon metastore is enabled
	++
	||
	++
	++
	
	++
	||
	++
	++
	
	18/02/27 09:21:51 AUDIT CarbonCreateTableCommand: [hadoop][root][Thread-1]Creating Table with Database name [public] and Table name [c_compact3]
	++
	||
	++
	++
	
	[1,1aaaaaaaa1,2009-05-27,1c1,1,1,1dddddd1,1]
	[2,2aaaaaaaa2,2009-05-27,2c2,1,1,2dddddd2,1]
	[3,3aaaaaaaa3,2009-05-27,3c3,1,1,3dddddd3,1]
	[4,4aaaaaaaa4,2009-05-27,4c4,1,1,4dddddd4,1]
	[5,5aaaaaaaa5,2009-05-27,5c5,1,1,5dddddd5,1]
	[6,6aaaaaaaa6,2009-05-27,6c6,1,1,6dddddd6,1]
	[7,7aaaaaaaa7,2009-05-27,7c7,1,1,7dddddd7,1]
	[8,8aaaaaaaa8,2009-05-27,8c8,1,1,8dddddd8,1]
	[9,9aaaaaaaa9,2009-05-27,9c9,1,1,9dddddd9,1]
	[10,10aaaaaaaa10,2009-05-27,10c10,1,1,10dddddd10,1]
	[11,11aaaaaaaa11,2009-05-27,11c11,1,1,11dddddd11,1]
	[12,12aaaaaaaa12,2009-05-27,12c12,1,1,12dddddd12,1]
	[13,13aaaaaaaa13,2009-05-27,13c13,1,1,13dddddd13,1]
	[14,14aaaaaaaa14,2009-05-27,14c14,1,1,14dddddd14,1]
	[15,15aaaaaaaa15,2009-05-27,15c15,1,1,15dddddd15,1]
	[16,16aaaaaaaa16,2009-05-27,16c16,1,1,16dddddd16,1]
	[17,17aaaaaaaa17,2009-05-27,17c17,1,1,17dddddd17,1]
	[18,18aaaaaaaa18,2009-05-27,18c18,1,1,18dddddd18,1]
	[19,19aaaaaaaa19,2009-05-27,19c19,1,1,19dddddd19,1]
	[20,20aaaaaaaa20,2009-05-27,20c20,1,1,20dddddd20,1]
	18/02/27 09:21:53 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load request has been received for table public.c_compact3
	18/02/27 09:21:53 WARN CarbonDataProcessorUtil: main sort scope is set to LOCAL_SORT
	18/02/27 09:21:53 WARN CarbonDataProcessorUtil: Executor task launch worker for task 1 sort scope is set to LOCAL_SORT
	18/02/27 09:21:53 WARN CarbonDataProcessorUtil: Executor task launch worker for task 1 batch sort size is set to 0
	18/02/27 09:21:53 WARN CarbonDataProcessorUtil: Executor task launch worker for task 1 sort scope is set to LOCAL_SORT
	18/02/27 09:25:36 ERROR IntermediateFileMerger: SafeIntermediateMergerPool:c_compact3 Problem while intermediate merging
	org.apache.carbondata.processing.sort.exception.CarbonSortKeyAndGroupByException: Problem while writing the file
		at org.apache.carbondata.processing.sort.sortdata.IntermediateFileMerger.writeDataToFile(IntermediateFileMerger.java:321)
		at org.apache.carbondata.processing.sort.sortdata.IntermediateFileMerger.call(IntermediateFileMerger.java:108)
		at org.apache.carbondata.processing.sort.sortdata.IntermediateFileMerger.call(IntermediateFileMerger.java:39)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
		at java.lang.Thread.run(Thread.java:748)
	Caused by: java.io.IOException: No space left on device
		at java.io.FileOutputStream.writeBytes(Native Method)
		at java.io.FileOutputStream.write(FileOutputStream.java:326)
		at java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:82)
		at java.io.BufferedOutputStream.write(BufferedOutputStream.java:126)
		at java.io.DataOutputStream.write(DataOutputStream.java:107)
		at java.io.FilterOutputStream.write(FilterOutputStream.java:97)
		at org.apache.carbondata.processing.sort.sortdata.IntermediateFileMerger.writeDataToFile(IntermediateFileMerger.java:280)
		... 6 more
	18/02/27 09:25:36 ERROR CarbonUtil: SortDataRowPool:c_compact3 Error while closing stream:java.io.IOException: No space left on device
	java.io.IOException: No space left on device
		at java.io.FileOutputStream.writeBytes(Native Method)
		at java.io.FileOutputStream.write(FileOutputStream.java:326)
		at java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:82)
		at java.io.BufferedOutputStream.flush(BufferedOutputStream.java:140)
		at java.io.DataOutputStream.flush(DataOutputStream.java:123)
		at java.io.FilterOutputStream.close(FilterOutputStream.java:158)
		at org.apache.carbondata.core.util.CarbonUtil.closeStream(CarbonUtil.java:168)
		at org.apache.carbondata.core.util.CarbonUtil.closeStreams(CarbonUtil.java:152)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.writeDataToFile(SortDataRows.java:295)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.access$300(SortDataRows.java:44)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows$DataSorterAndWriter.run(SortDataRows.java:378)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
		at java.lang.Thread.run(Thread.java:748)
		Suppressed: java.io.IOException: No space left on device
			at java.io.FileOutputStream.writeBytes(Native Method)
			at java.io.FileOutputStream.write(FileOutputStream.java:326)
			at java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:82)
			at java.io.BufferedOutputStream.flush(BufferedOutputStream.java:140)
			at java.io.FilterOutputStream.close(FilterOutputStream.java:158)
			at java.io.FilterOutputStream.close(FilterOutputStream.java:159)
			... 8 more
	18/02/27 09:25:36 ERROR SortDataRows: SortDataRowPool:c_compact3 
	org.apache.carbondata.processing.sort.exception.CarbonSortKeyAndGroupByException: Problem while writing the file
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.writeDataToFile(SortDataRows.java:292)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.access$300(SortDataRows.java:44)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows$DataSorterAndWriter.run(SortDataRows.java:378)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
		at java.lang.Thread.run(Thread.java:748)
	Caused by: java.io.IOException: No space left on device
		at java.io.FileOutputStream.writeBytes(Native Method)
		at java.io.FileOutputStream.write(FileOutputStream.java:326)
		at java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:82)
		at java.io.BufferedOutputStream.write(BufferedOutputStream.java:126)
		at java.io.DataOutputStream.write(DataOutputStream.java:107)
		at java.io.FilterOutputStream.write(FilterOutputStream.java:97)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.writeDataToFile(SortDataRows.java:250)
		... 5 more
	18/02/27 09:25:36 ERROR SortDataRows: SortDataRowPool:c_compact3 
	org.apache.carbondata.processing.sort.exception.CarbonSortKeyAndGroupByException: 
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows$ThreadStatusObserver.notifyFailed(SortDataRows.java:337)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows$DataSorterAndWriter.run(SortDataRows.java:386)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
		at java.lang.Thread.run(Thread.java:748)
	Caused by: org.apache.carbondata.processing.sort.exception.CarbonSortKeyAndGroupByException: Problem while writing the file
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.writeDataToFile(SortDataRows.java:292)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.access$300(SortDataRows.java:44)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows$DataSorterAndWriter.run(SortDataRows.java:378)
		... 3 more
	Caused by: java.io.IOException: No space left on device
		at java.io.FileOutputStream.writeBytes(Native Method)
		at java.io.FileOutputStream.write(FileOutputStream.java:326)
		at java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:82)
		at java.io.BufferedOutputStream.write(BufferedOutputStream.java:126)
		at java.io.DataOutputStream.write(DataOutputStream.java:107)
		at java.io.FilterOutputStream.write(FilterOutputStream.java:97)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.writeDataToFile(SortDataRows.java:250)
		... 5 more
	18/02/27 09:25:36 ERROR SortDataRows: SafeParallelSorterPool:c_compact3 exception occurred while trying to acquire a semaphore lock: Task org.apache.carbondata.processing.sort.sortdata.SortDataRows$DataSorterAndWriter@67799767 rejected from java.util.concurrent.ThreadPoolExecutor@4afe2a8f[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 486]
	18/02/27 09:25:36 ERROR ParallelReadMergeSorterImpl: SafeParallelSorterPool:c_compact3 
	org.apache.carbondata.processing.sort.exception.CarbonSortKeyAndGroupByException: 
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.addRowBatch(SortDataRows.java:172)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl$SortIteratorThread.run(ParallelReadMergeSorterImpl.java:223)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
		at java.lang.Thread.run(Thread.java:748)
	Caused by: java.util.concurrent.RejectedExecutionException: Task org.apache.carbondata.processing.sort.sortdata.SortDataRows$DataSorterAndWriter@67799767 rejected from java.util.concurrent.ThreadPoolExecutor@4afe2a8f[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 486]
		at java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2047)
		at java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:823)
		at java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1369)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.addRowBatch(SortDataRows.java:168)
		... 4 more
	18/02/27 09:25:36 ERROR CarbonUtil: SafeIntermediateMergerPool:c_compact3 Error while closing stream:java.io.IOException: No space left on device
	java.io.IOException: No space left on device
		at java.io.FileOutputStream.writeBytes(Native Method)
		at java.io.FileOutputStream.write(FileOutputStream.java:326)
		at java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:82)
		at java.io.BufferedOutputStream.flush(BufferedOutputStream.java:140)
		at java.io.DataOutputStream.flush(DataOutputStream.java:123)
		at java.io.FilterOutputStream.close(FilterOutputStream.java:158)
		at org.apache.carbondata.core.util.CarbonUtil.closeStream(CarbonUtil.java:168)
		at org.apache.carbondata.core.util.CarbonUtil.closeStreams(CarbonUtil.java:152)
		at org.apache.carbondata.processing.sort.sortdata.IntermediateFileMerger.call(IntermediateFileMerger.java:119)
		at org.apache.carbondata.processing.sort.sortdata.IntermediateFileMerger.call(IntermediateFileMerger.java:39)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
		at java.lang.Thread.run(Thread.java:748)
		Suppressed: java.io.IOException: No space left on device
			at java.io.FileOutputStream.writeBytes(Native Method)
			at java.io.FileOutputStream.write(FileOutputStream.java:326)
			at java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:82)
			at java.io.BufferedOutputStream.flush(BufferedOutputStream.java:140)
			at java.io.FilterOutputStream.close(FilterOutputStream.java:158)
			at java.io.FilterOutputStream.close(FilterOutputStream.java:159)
			... 8 more
	18/02/27 09:25:36 ERROR CarbonUtil: Executor task launch worker for task 1 Error while closing stream:java.io.IOException: No space left on device
	java.io.IOException: No space left on device
		at java.io.FileOutputStream.writeBytes(Native Method)
		at java.io.FileOutputStream.write(FileOutputStream.java:326)
		at java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:82)
		at java.io.BufferedOutputStream.flush(BufferedOutputStream.java:140)
		at java.io.DataOutputStream.flush(DataOutputStream.java:123)
		at java.io.FilterOutputStream.close(FilterOutputStream.java:158)
		at org.apache.carbondata.core.util.CarbonUtil.closeStream(CarbonUtil.java:168)
		at org.apache.carbondata.core.util.CarbonUtil.closeStreams(CarbonUtil.java:152)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.writeDataToFile(SortDataRows.java:295)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.startSorting(SortDataRows.java:214)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl.processRowToNextStep(ParallelReadMergeSorterImpl.java:170)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl.sort(ParallelReadMergeSorterImpl.java:108)
		at org.apache.carbondata.processing.loading.steps.SortProcessorStepImpl.execute(SortProcessorStepImpl.java:62)
		at org.apache.carbondata.processing.loading.steps.DataWriterProcessorStepImpl.execute(DataWriterProcessorStepImpl.java:86)
		at org.apache.carbondata.processing.loading.DataLoadExecutor.execute(DataLoadExecutor.java:51)
		at org.apache.carbondata.spark.rdd.NewDataFrameLoaderRDD$$anon$2.<init>(NewCarbonDataLoadRDD.scala:390)
		at org.apache.carbondata.spark.rdd.NewDataFrameLoaderRDD.internalCompute(NewCarbonDataLoadRDD.scala:353)
		at org.apache.carbondata.spark.rdd.CarbonRDD.compute(CarbonRDD.scala:60)
		at org.apache.spark.rdd.RDD.computeOrReadCheckpoint(RDD.scala:323)
		at org.apache.spark.rdd.RDD.iterator(RDD.scala:287)
		at org.apache.spark.scheduler.ResultTask.runTask(ResultTask.scala:87)
		at org.apache.spark.scheduler.Task.run(Task.scala:108)
		at org.apache.spark.executor.Executor$TaskRunner.run(Executor.scala:338)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
		at java.lang.Thread.run(Thread.java:748)
	18/02/27 09:25:36 ERROR NewDataFrameLoaderRDD: Executor task launch worker for task 1 
	org.apache.carbondata.processing.loading.exception.CarbonDataLoadingException: 
		at org.apache.carbondata.processing.loading.sort.AbstractMergeSorter.checkError(AbstractMergeSorter.java:39)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl.sort(ParallelReadMergeSorterImpl.java:110)
		at org.apache.carbondata.processing.loading.steps.SortProcessorStepImpl.execute(SortProcessorStepImpl.java:62)
		at org.apache.carbondata.processing.loading.steps.DataWriterProcessorStepImpl.execute(DataWriterProcessorStepImpl.java:86)
		at org.apache.carbondata.processing.loading.DataLoadExecutor.execute(DataLoadExecutor.java:51)
		at org.apache.carbondata.spark.rdd.NewDataFrameLoaderRDD$$anon$2.<init>(NewCarbonDataLoadRDD.scala:390)
		at org.apache.carbondata.spark.rdd.NewDataFrameLoaderRDD.internalCompute(NewCarbonDataLoadRDD.scala:353)
		at org.apache.carbondata.spark.rdd.CarbonRDD.compute(CarbonRDD.scala:60)
		at org.apache.spark.rdd.RDD.computeOrReadCheckpoint(RDD.scala:323)
		at org.apache.spark.rdd.RDD.iterator(RDD.scala:287)
		at org.apache.spark.scheduler.ResultTask.runTask(ResultTask.scala:87)
		at org.apache.spark.scheduler.Task.run(Task.scala:108)
		at org.apache.spark.executor.Executor$TaskRunner.run(Executor.scala:338)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
		at java.lang.Thread.run(Thread.java:748)
	Caused by: org.apache.carbondata.processing.sort.exception.CarbonSortKeyAndGroupByException: 
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.addRowBatch(SortDataRows.java:172)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl$SortIteratorThread.run(ParallelReadMergeSorterImpl.java:223)
		... 3 more
	Caused by: java.util.concurrent.RejectedExecutionException: Task org.apache.carbondata.processing.sort.sortdata.SortDataRows$DataSorterAndWriter@67799767 rejected from java.util.concurrent.ThreadPoolExecutor@4afe2a8f[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 486]
		at java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2047)
		at java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:823)
		at java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1369)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.addRowBatch(SortDataRows.java:168)
		... 4 more
	18/02/27 09:25:36 ERROR Executor: Exception in task 0.0 in stage 1.0 (TID 1)
	org.apache.carbondata.processing.loading.exception.CarbonDataLoadingException: 
		at org.apache.carbondata.processing.loading.sort.AbstractMergeSorter.checkError(AbstractMergeSorter.java:39)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl.sort(ParallelReadMergeSorterImpl.java:110)
		at org.apache.carbondata.processing.loading.steps.SortProcessorStepImpl.execute(SortProcessorStepImpl.java:62)
		at org.apache.carbondata.processing.loading.steps.DataWriterProcessorStepImpl.execute(DataWriterProcessorStepImpl.java:86)
		at org.apache.carbondata.processing.loading.DataLoadExecutor.execute(DataLoadExecutor.java:51)
		at org.apache.carbondata.spark.rdd.NewDataFrameLoaderRDD$$anon$2.<init>(NewCarbonDataLoadRDD.scala:390)
		at org.apache.carbondata.spark.rdd.NewDataFrameLoaderRDD.internalCompute(NewCarbonDataLoadRDD.scala:353)
		at org.apache.carbondata.spark.rdd.CarbonRDD.compute(CarbonRDD.scala:60)
		at org.apache.spark.rdd.RDD.computeOrReadCheckpoint(RDD.scala:323)
		at org.apache.spark.rdd.RDD.iterator(RDD.scala:287)
		at org.apache.spark.scheduler.ResultTask.runTask(ResultTask.scala:87)
		at org.apache.spark.scheduler.Task.run(Task.scala:108)
		at org.apache.spark.executor.Executor$TaskRunner.run(Executor.scala:338)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
		at java.lang.Thread.run(Thread.java:748)
	Caused by: org.apache.carbondata.processing.sort.exception.CarbonSortKeyAndGroupByException: 
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.addRowBatch(SortDataRows.java:172)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl$SortIteratorThread.run(ParallelReadMergeSorterImpl.java:223)
		... 3 more
	Caused by: java.util.concurrent.RejectedExecutionException: Task org.apache.carbondata.processing.sort.sortdata.SortDataRows$DataSorterAndWriter@67799767 rejected from java.util.concurrent.ThreadPoolExecutor@4afe2a8f[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 486]
		at java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2047)
		at java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:823)
		at java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1369)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.addRowBatch(SortDataRows.java:168)
		... 4 more
	18/02/27 09:25:36 WARN TaskSetManager: Lost task 0.0 in stage 1.0 (TID 1, localhost, executor driver): org.apache.carbondata.processing.loading.exception.CarbonDataLoadingException: 
		at org.apache.carbondata.processing.loading.sort.AbstractMergeSorter.checkError(AbstractMergeSorter.java:39)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl.sort(ParallelReadMergeSorterImpl.java:110)
		at org.apache.carbondata.processing.loading.steps.SortProcessorStepImpl.execute(SortProcessorStepImpl.java:62)
		at org.apache.carbondata.processing.loading.steps.DataWriterProcessorStepImpl.execute(DataWriterProcessorStepImpl.java:86)
		at org.apache.carbondata.processing.loading.DataLoadExecutor.execute(DataLoadExecutor.java:51)
		at org.apache.carbondata.spark.rdd.NewDataFrameLoaderRDD$$anon$2.<init>(NewCarbonDataLoadRDD.scala:390)
		at org.apache.carbondata.spark.rdd.NewDataFrameLoaderRDD.internalCompute(NewCarbonDataLoadRDD.scala:353)
		at org.apache.carbondata.spark.rdd.CarbonRDD.compute(CarbonRDD.scala:60)
		at org.apache.spark.rdd.RDD.computeOrReadCheckpoint(RDD.scala:323)
		at org.apache.spark.rdd.RDD.iterator(RDD.scala:287)
		at org.apache.spark.scheduler.ResultTask.runTask(ResultTask.scala:87)
		at org.apache.spark.scheduler.Task.run(Task.scala:108)
		at org.apache.spark.executor.Executor$TaskRunner.run(Executor.scala:338)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
		at java.lang.Thread.run(Thread.java:748)
	Caused by: org.apache.carbondata.processing.sort.exception.CarbonSortKeyAndGroupByException: 
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.addRowBatch(SortDataRows.java:172)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl$SortIteratorThread.run(ParallelReadMergeSorterImpl.java:223)
		... 3 more
	Caused by: java.util.concurrent.RejectedExecutionException: Task org.apache.carbondata.processing.sort.sortdata.SortDataRows$DataSorterAndWriter@67799767 rejected from java.util.concurrent.ThreadPoolExecutor@4afe2a8f[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 486]
		at java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2047)
		at java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:823)
		at java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1369)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.addRowBatch(SortDataRows.java:168)
		... 4 more
	
	18/02/27 09:25:36 ERROR TaskSetManager: Task 0 in stage 1.0 failed 1 times; aborting job
	18/02/27 09:25:36 ERROR CarbonDataRDDFactory$: main load data frame failed
	org.apache.spark.SparkException: Job aborted due to stage failure: Task 0 in stage 1.0 failed 1 times, most recent failure: Lost task 0.0 in stage 1.0 (TID 1, localhost, executor driver): org.apache.carbondata.processing.loading.exception.CarbonDataLoadingException: 
		at org.apache.carbondata.processing.loading.sort.AbstractMergeSorter.checkError(AbstractMergeSorter.java:39)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl.sort(ParallelReadMergeSorterImpl.java:110)
		at org.apache.carbondata.processing.loading.steps.SortProcessorStepImpl.execute(SortProcessorStepImpl.java:62)
		at org.apache.carbondata.processing.loading.steps.DataWriterProcessorStepImpl.execute(DataWriterProcessorStepImpl.java:86)
		at org.apache.carbondata.processing.loading.DataLoadExecutor.execute(DataLoadExecutor.java:51)
		at org.apache.carbondata.spark.rdd.NewDataFrameLoaderRDD$$anon$2.<init>(NewCarbonDataLoadRDD.scala:390)
		at org.apache.carbondata.spark.rdd.NewDataFrameLoaderRDD.internalCompute(NewCarbonDataLoadRDD.scala:353)
		at org.apache.carbondata.spark.rdd.CarbonRDD.compute(CarbonRDD.scala:60)
		at org.apache.spark.rdd.RDD.computeOrReadCheckpoint(RDD.scala:323)
		at org.apache.spark.rdd.RDD.iterator(RDD.scala:287)
		at org.apache.spark.scheduler.ResultTask.runTask(ResultTask.scala:87)
		at org.apache.spark.scheduler.Task.run(Task.scala:108)
		at org.apache.spark.executor.Executor$TaskRunner.run(Executor.scala:338)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
		at java.lang.Thread.run(Thread.java:748)
	Caused by: org.apache.carbondata.processing.sort.exception.CarbonSortKeyAndGroupByException: 
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.addRowBatch(SortDataRows.java:172)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl$SortIteratorThread.run(ParallelReadMergeSorterImpl.java:223)
		... 3 more
	Caused by: java.util.concurrent.RejectedExecutionException: Task org.apache.carbondata.processing.sort.sortdata.SortDataRows$DataSorterAndWriter@67799767 rejected from java.util.concurrent.ThreadPoolExecutor@4afe2a8f[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 486]
		at java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2047)
		at java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:823)
		at java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1369)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.addRowBatch(SortDataRows.java:168)
		... 4 more
	
	Driver stacktrace:
		at org.apache.spark.scheduler.DAGScheduler.org$apache$spark$scheduler$DAGScheduler$$failJobAndIndependentStages(DAGScheduler.scala:1517)
		at org.apache.spark.scheduler.DAGScheduler$$anonfun$abortStage$1.apply(DAGScheduler.scala:1505)
		at org.apache.spark.scheduler.DAGScheduler$$anonfun$abortStage$1.apply(DAGScheduler.scala:1504)
		at scala.collection.mutable.ResizableArray$class.foreach(ResizableArray.scala:59)
		at scala.collection.mutable.ArrayBuffer.foreach(ArrayBuffer.scala:48)
		at org.apache.spark.scheduler.DAGScheduler.abortStage(DAGScheduler.scala:1504)
		at org.apache.spark.scheduler.DAGScheduler$$anonfun$handleTaskSetFailed$1.apply(DAGScheduler.scala:814)
		at org.apache.spark.scheduler.DAGScheduler$$anonfun$handleTaskSetFailed$1.apply(DAGScheduler.scala:814)
		at scala.Option.foreach(Option.scala:257)
		at org.apache.spark.scheduler.DAGScheduler.handleTaskSetFailed(DAGScheduler.scala:814)
		at org.apache.spark.scheduler.DAGSchedulerEventProcessLoop.doOnReceive(DAGScheduler.scala:1732)
		at org.apache.spark.scheduler.DAGSchedulerEventProcessLoop.onReceive(DAGScheduler.scala:1687)
		at org.apache.spark.scheduler.DAGSchedulerEventProcessLoop.onReceive(DAGScheduler.scala:1676)
		at org.apache.spark.util.EventLoop$$anon$1.run(EventLoop.scala:48)
		at org.apache.spark.scheduler.DAGScheduler.runJob(DAGScheduler.scala:630)
		at org.apache.spark.SparkContext.runJob(SparkContext.scala:2029)
		at org.apache.spark.SparkContext.runJob(SparkContext.scala:2050)
		at org.apache.spark.SparkContext.runJob(SparkContext.scala:2069)
		at org.apache.spark.SparkContext.runJob(SparkContext.scala:2094)
		at org.apache.spark.rdd.RDD$$anonfun$collect$1.apply(RDD.scala:936)
		at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:151)
		at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:112)
		at org.apache.spark.rdd.RDD.withScope(RDD.scala:362)
		at org.apache.spark.rdd.RDD.collect(RDD.scala:935)
		at org.apache.carbondata.spark.rdd.CarbonDataRDDFactory$.loadDataFrame(CarbonDataRDDFactory.scala:1002)
		at org.apache.carbondata.spark.rdd.CarbonDataRDDFactory$.loadCarbonData(CarbonDataRDDFactory.scala:346)
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
		at org.apache.carbondata.testUpdate$.main(testUpdate.scala:57)
		at org.apache.carbondata.testUpdate.main(testUpdate.scala)
	Caused by: org.apache.carbondata.processing.loading.exception.CarbonDataLoadingException: 
		at org.apache.carbondata.processing.loading.sort.AbstractMergeSorter.checkError(AbstractMergeSorter.java:39)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl.sort(ParallelReadMergeSorterImpl.java:110)
		at org.apache.carbondata.processing.loading.steps.SortProcessorStepImpl.execute(SortProcessorStepImpl.java:62)
		at org.apache.carbondata.processing.loading.steps.DataWriterProcessorStepImpl.execute(DataWriterProcessorStepImpl.java:86)
		at org.apache.carbondata.processing.loading.DataLoadExecutor.execute(DataLoadExecutor.java:51)
		at org.apache.carbondata.spark.rdd.NewDataFrameLoaderRDD$$anon$2.<init>(NewCarbonDataLoadRDD.scala:390)
		at org.apache.carbondata.spark.rdd.NewDataFrameLoaderRDD.internalCompute(NewCarbonDataLoadRDD.scala:353)
		at org.apache.carbondata.spark.rdd.CarbonRDD.compute(CarbonRDD.scala:60)
		at org.apache.spark.rdd.RDD.computeOrReadCheckpoint(RDD.scala:323)
		at org.apache.spark.rdd.RDD.iterator(RDD.scala:287)
		at org.apache.spark.scheduler.ResultTask.runTask(ResultTask.scala:87)
		at org.apache.spark.scheduler.Task.run(Task.scala:108)
		at org.apache.spark.executor.Executor$TaskRunner.run(Executor.scala:338)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
		at java.lang.Thread.run(Thread.java:748)
	Caused by: org.apache.carbondata.processing.sort.exception.CarbonSortKeyAndGroupByException: 
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.addRowBatch(SortDataRows.java:172)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl$SortIteratorThread.run(ParallelReadMergeSorterImpl.java:223)
		... 3 more
	Caused by: java.util.concurrent.RejectedExecutionException: Task org.apache.carbondata.processing.sort.sortdata.SortDataRows$DataSorterAndWriter@67799767 rejected from java.util.concurrent.ThreadPoolExecutor@4afe2a8f[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 486]
		at java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2047)
		at java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:823)
		at java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1369)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.addRowBatch(SortDataRows.java:168)
		... 4 more
	18/02/27 09:25:36 ERROR CarbonDataRDDFactory$: main 
	org.apache.spark.SparkException: Job aborted due to stage failure: Task 0 in stage 1.0 failed 1 times, most recent failure: Lost task 0.0 in stage 1.0 (TID 1, localhost, executor driver): org.apache.carbondata.processing.loading.exception.CarbonDataLoadingException: 
		at org.apache.carbondata.processing.loading.sort.AbstractMergeSorter.checkError(AbstractMergeSorter.java:39)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl.sort(ParallelReadMergeSorterImpl.java:110)
		at org.apache.carbondata.processing.loading.steps.SortProcessorStepImpl.execute(SortProcessorStepImpl.java:62)
		at org.apache.carbondata.processing.loading.steps.DataWriterProcessorStepImpl.execute(DataWriterProcessorStepImpl.java:86)
		at org.apache.carbondata.processing.loading.DataLoadExecutor.execute(DataLoadExecutor.java:51)
		at org.apache.carbondata.spark.rdd.NewDataFrameLoaderRDD$$anon$2.<init>(NewCarbonDataLoadRDD.scala:390)
		at org.apache.carbondata.spark.rdd.NewDataFrameLoaderRDD.internalCompute(NewCarbonDataLoadRDD.scala:353)
		at org.apache.carbondata.spark.rdd.CarbonRDD.compute(CarbonRDD.scala:60)
		at org.apache.spark.rdd.RDD.computeOrReadCheckpoint(RDD.scala:323)
		at org.apache.spark.rdd.RDD.iterator(RDD.scala:287)
		at org.apache.spark.scheduler.ResultTask.runTask(ResultTask.scala:87)
		at org.apache.spark.scheduler.Task.run(Task.scala:108)
		at org.apache.spark.executor.Executor$TaskRunner.run(Executor.scala:338)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
		at java.lang.Thread.run(Thread.java:748)
	Caused by: org.apache.carbondata.processing.sort.exception.CarbonSortKeyAndGroupByException: 
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.addRowBatch(SortDataRows.java:172)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl$SortIteratorThread.run(ParallelReadMergeSorterImpl.java:223)
		... 3 more
	Caused by: java.util.concurrent.RejectedExecutionException: Task org.apache.carbondata.processing.sort.sortdata.SortDataRows$DataSorterAndWriter@67799767 rejected from java.util.concurrent.ThreadPoolExecutor@4afe2a8f[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 486]
		at java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2047)
		at java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:823)
		at java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1369)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.addRowBatch(SortDataRows.java:168)
		... 4 more
	
	Driver stacktrace:
		at org.apache.spark.scheduler.DAGScheduler.org$apache$spark$scheduler$DAGScheduler$$failJobAndIndependentStages(DAGScheduler.scala:1517)
		at org.apache.spark.scheduler.DAGScheduler$$anonfun$abortStage$1.apply(DAGScheduler.scala:1505)
		at org.apache.spark.scheduler.DAGScheduler$$anonfun$abortStage$1.apply(DAGScheduler.scala:1504)
		at scala.collection.mutable.ResizableArray$class.foreach(ResizableArray.scala:59)
		at scala.collection.mutable.ArrayBuffer.foreach(ArrayBuffer.scala:48)
		at org.apache.spark.scheduler.DAGScheduler.abortStage(DAGScheduler.scala:1504)
		at org.apache.spark.scheduler.DAGScheduler$$anonfun$handleTaskSetFailed$1.apply(DAGScheduler.scala:814)
		at org.apache.spark.scheduler.DAGScheduler$$anonfun$handleTaskSetFailed$1.apply(DAGScheduler.scala:814)
		at scala.Option.foreach(Option.scala:257)
		at org.apache.spark.scheduler.DAGScheduler.handleTaskSetFailed(DAGScheduler.scala:814)
		at org.apache.spark.scheduler.DAGSchedulerEventProcessLoop.doOnReceive(DAGScheduler.scala:1732)
		at org.apache.spark.scheduler.DAGSchedulerEventProcessLoop.onReceive(DAGScheduler.scala:1687)
		at org.apache.spark.scheduler.DAGSchedulerEventProcessLoop.onReceive(DAGScheduler.scala:1676)
		at org.apache.spark.util.EventLoop$$anon$1.run(EventLoop.scala:48)
		at org.apache.spark.scheduler.DAGScheduler.runJob(DAGScheduler.scala:630)
		at org.apache.spark.SparkContext.runJob(SparkContext.scala:2029)
		at org.apache.spark.SparkContext.runJob(SparkContext.scala:2050)
		at org.apache.spark.SparkContext.runJob(SparkContext.scala:2069)
		at org.apache.spark.SparkContext.runJob(SparkContext.scala:2094)
		at org.apache.spark.rdd.RDD$$anonfun$collect$1.apply(RDD.scala:936)
		at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:151)
		at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:112)
		at org.apache.spark.rdd.RDD.withScope(RDD.scala:362)
		at org.apache.spark.rdd.RDD.collect(RDD.scala:935)
		at org.apache.carbondata.spark.rdd.CarbonDataRDDFactory$.loadDataFrame(CarbonDataRDDFactory.scala:1002)
		at org.apache.carbondata.spark.rdd.CarbonDataRDDFactory$.loadCarbonData(CarbonDataRDDFactory.scala:346)
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
		at org.apache.carbondata.testUpdate$.main(testUpdate.scala:57)
		at org.apache.carbondata.testUpdate.main(testUpdate.scala)
	Caused by: org.apache.carbondata.processing.loading.exception.CarbonDataLoadingException: 
		at org.apache.carbondata.processing.loading.sort.AbstractMergeSorter.checkError(AbstractMergeSorter.java:39)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl.sort(ParallelReadMergeSorterImpl.java:110)
		at org.apache.carbondata.processing.loading.steps.SortProcessorStepImpl.execute(SortProcessorStepImpl.java:62)
		at org.apache.carbondata.processing.loading.steps.DataWriterProcessorStepImpl.execute(DataWriterProcessorStepImpl.java:86)
		at org.apache.carbondata.processing.loading.DataLoadExecutor.execute(DataLoadExecutor.java:51)
		at org.apache.carbondata.spark.rdd.NewDataFrameLoaderRDD$$anon$2.<init>(NewCarbonDataLoadRDD.scala:390)
		at org.apache.carbondata.spark.rdd.NewDataFrameLoaderRDD.internalCompute(NewCarbonDataLoadRDD.scala:353)
		at org.apache.carbondata.spark.rdd.CarbonRDD.compute(CarbonRDD.scala:60)
		at org.apache.spark.rdd.RDD.computeOrReadCheckpoint(RDD.scala:323)
		at org.apache.spark.rdd.RDD.iterator(RDD.scala:287)
		at org.apache.spark.scheduler.ResultTask.runTask(ResultTask.scala:87)
		at org.apache.spark.scheduler.Task.run(Task.scala:108)
		at org.apache.spark.executor.Executor$TaskRunner.run(Executor.scala:338)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
		at java.lang.Thread.run(Thread.java:748)
	Caused by: org.apache.carbondata.processing.sort.exception.CarbonSortKeyAndGroupByException: 
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.addRowBatch(SortDataRows.java:172)
		at org.apache.carbondata.processing.loading.sort.impl.ParallelReadMergeSorterImpl$SortIteratorThread.run(ParallelReadMergeSorterImpl.java:223)
		... 3 more
	Caused by: java.util.concurrent.RejectedExecutionException: Task org.apache.carbondata.processing.sort.sortdata.SortDataRows$DataSorterAndWriter@67799767 rejected from java.util.concurrent.ThreadPoolExecutor@4afe2a8f[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 486]
		at java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2047)
		at java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:823)
		at java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1369)
		at org.apache.carbondata.processing.sort.sortdata.SortDataRows.addRowBatch(SortDataRows.java:168)
		... 4 more
	18/02/27 09:25:36 AUDIT CarbonDataRDDFactory$: [hadoop][root][Thread-1]Data load is failed for public.c_compact3
	18/02/27 09:25:36 WARN CarbonDataRDDFactory$: main Cannot write load metadata file as data load failed
	18/02/27 09:25:36 ERROR CarbonLoadDataCommand: main 
	java.lang.Exception: DataLoad failure: 
		at org.apache.carbondata.spark.rdd.CarbonDataRDDFactory$.loadCarbonData(CarbonDataRDDFactory.scala:491)
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
		at org.apache.carbondata.testUpdate$.main(testUpdate.scala:57)
		at org.apache.carbondata.testUpdate.main(testUpdate.scala)
	18/02/27 09:25:36 AUDIT CarbonLoadDataCommand: [hadoop][root][Thread-1]Dataload failure for public.c_compact3. Please check the logs
	18/02/27 09:25:36 ERROR CarbonInsertIntoCommand: main Got exception java.lang.Exception: DataLoad failure:  when processing data. But this command does not support undo yet, skipping the undo part.
	Exception in thread "main" java.lang.Exception: DataLoad failure: 
		at org.apache.carbondata.spark.rdd.CarbonDataRDDFactory$.loadCarbonData(CarbonDataRDDFactory.scala:491)
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
		at org.apache.carbondata.testUpdate$.main(testUpdate.scala:57)
		at org.apache.carbondata.testUpdate.main(testUpdate.scala)
	
	Process finished with exit code 1
