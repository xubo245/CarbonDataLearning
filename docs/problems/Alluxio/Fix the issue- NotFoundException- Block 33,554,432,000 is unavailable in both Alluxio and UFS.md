
## Running
	org.apache.carbondata.examples.AlluxioExample
## Exception	
	2019-01-07 11:36:53 INFO  CarbonProperties:901 - {}
	2019-01-07 11:36:54 INFO  CarbonProperties:693 - Considered file format is: V3
	2019-01-07 11:36:54 INFO  CarbonProperties:587 - Blocklet Size Configured value is "64
	2019-01-07 11:36:54 WARN  CarbonProperties:465 - The enable unsafe sort value "null" is invalid. Using the default value "true
	2019-01-07 11:36:54 WARN  CarbonProperties:477 - The enable off heap sort value "null" is invalid. Using the default value "true
	2019-01-07 11:36:54 WARN  CarbonProperties:438 - The custom block distribution value "null" is invalid. Using the default value "false
	2019-01-07 11:36:54 WARN  CarbonProperties:425 - The enable vector reader value "null" is invalid. Using the default value "true
	SLF4J: Class path contains multiple SLF4J bindings.
	SLF4J: Found binding in [jar:file:/Users/xubo/Desktop/xubo/maven/carbondata1/org/slf4j/slf4j-log4j12/1.7.16/slf4j-log4j12-1.7.16.jar!/org/slf4j/impl/StaticLoggerBinder.class]
	SLF4J: Found binding in [jar:file:/Users/xubo/Desktop/xubo/soft/alluxio-1.8.1/client/alluxio-1.8.1-client.jar!/org/slf4j/impl/StaticLoggerBinder.class]
	SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.
	SLF4J: Actual binding is of type [org.slf4j.impl.Log4jLoggerFactory]
	2019-01-07 11:36:54 WARN  CarbonProperties:453 - The carbon task distribution value "null" is invalid. Using the default value "block
	2019-01-07 11:36:54 WARN  CarbonProperties:556 - The enable auto handoff value "null" is invalid. Using the default value "true
	2019-01-07 11:36:54 WARN  CarbonProperties:1298 - The specified value for property 512is invalid.
	2019-01-07 11:36:54 WARN  CarbonProperties:1309 - The specified value for property carbon.sort.storage.inmemory.size.inmbis invalid. Taking the default value.512
	2019-01-07 11:36:54 INFO  CarbonProperties:1512 - Considered value for min max byte limit for string is: 200
	2019-01-07 11:36:56 INFO  SparkContext:54 - Running Spark version 2.2.1
	2019-01-07 11:36:56 WARN  NativeCodeLoader:62 - Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
	2019-01-07 11:36:56 WARN  Utils:66 - Your hostname, localhost resolves to a loopback address: 127.0.0.1; using 192.168.44.90 instead (on interface en3)
	2019-01-07 11:36:56 WARN  Utils:66 - Set SPARK_LOCAL_IP if you need to bind to another address
	2019-01-07 11:36:56 INFO  SparkContext:54 - Submitted application: AlluxioExample
	2019-01-07 11:36:56 INFO  SecurityManager:54 - Changing view acls to: xubo
	2019-01-07 11:36:56 INFO  SecurityManager:54 - Changing modify acls to: xubo
	2019-01-07 11:36:56 INFO  SecurityManager:54 - Changing view acls groups to: 
	2019-01-07 11:36:56 INFO  SecurityManager:54 - Changing modify acls groups to: 
	2019-01-07 11:36:56 INFO  SecurityManager:54 - SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(xubo); groups with view permissions: Set(); users  with modify permissions: Set(xubo); groups with modify permissions: Set()
	2019-01-07 11:36:56 INFO  Utils:54 - Successfully started service 'sparkDriver' on port 50533.
	2019-01-07 11:36:56 INFO  SparkEnv:54 - Registering MapOutputTracker
	2019-01-07 11:36:56 INFO  SparkEnv:54 - Registering BlockManagerMaster
	2019-01-07 11:36:56 INFO  BlockManagerMasterEndpoint:54 - Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
	2019-01-07 11:36:56 INFO  BlockManagerMasterEndpoint:54 - BlockManagerMasterEndpoint up
	2019-01-07 11:36:56 INFO  DiskBlockManager:54 - Created local directory at /private/var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/blockmgr-0f685e81-52e7-41a3-b802-8e612a4a4584
	2019-01-07 11:36:56 INFO  MemoryStore:54 - MemoryStore started with capacity 2004.6 MB
	2019-01-07 11:36:57 INFO  SparkEnv:54 - Registering OutputCommitCoordinator
	2019-01-07 11:36:57 INFO  log:192 - Logging initialized @3892ms
	2019-01-07 11:36:57 INFO  Server:345 - jetty-9.3.z-SNAPSHOT
	2019-01-07 11:36:57 INFO  Server:403 - Started @4005ms
	2019-01-07 11:36:57 INFO  AbstractConnector:270 - Started ServerConnector@14ef2482{HTTP/1.1,[http/1.1]}{0.0.0.0:4040}
	2019-01-07 11:36:57 INFO  Utils:54 - Successfully started service 'SparkUI' on port 4040.
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@290d10ef{/jobs,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@582a764a{/jobs/json,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@292158f8{/jobs/job,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@7e19755a{/jobs/job/json,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@6f49d153{/stages,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@7e7f0216{/stages/json,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@62db3891{/stages/stage,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@52e04737{/stages/stage/json,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@1a4d1ab7{/stages/pool,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@4674d90{/stages/pool/json,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@1292071f{/storage,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@b606cb6{/storage/json,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@2819c460{/storage/rdd,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@38bb9d7a{/storage/rdd/json,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@78d6447a{/environment,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@1e469dfd{/environment/json,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@1f7076bc{/executors,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@5b9396d3{/executors/json,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@6a472566{/executors/threadDump,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@5e65afb6{/executors/threadDump/json,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@8851ce1{/static,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@2af69643{/,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@48528634{/api,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@5c77ba8f{/jobs/job/kill,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@7a0ef219{/stages/stage/kill,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  SparkUI:54 - Bound SparkUI to 0.0.0.0, and started at http://localhost:4040
	2019-01-07 11:36:57 INFO  Executor:54 - Starting executor ID driver on host localhost
	2019-01-07 11:36:57 INFO  Utils:54 - Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 50534.
	2019-01-07 11:36:57 INFO  NettyBlockTransferService:54 - Server created on localhost:50534
	2019-01-07 11:36:57 INFO  BlockManager:54 - Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
	2019-01-07 11:36:57 INFO  BlockManagerMaster:54 - Registering BlockManager BlockManagerId(driver, localhost, 50534, None)
	2019-01-07 11:36:57 INFO  BlockManagerMasterEndpoint:54 - Registering block manager localhost:50534 with 2004.6 MB RAM, BlockManagerId(driver, localhost, 50534, None)
	2019-01-07 11:36:57 INFO  BlockManagerMaster:54 - Registered BlockManager BlockManagerId(driver, localhost, 50534, None)
	2019-01-07 11:36:57 INFO  BlockManager:54 - Initialized BlockManager: BlockManagerId(driver, localhost, 50534, None)
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@3206174f{/metrics/json,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  SharedState:54 - Setting hive.metastore.warehouse.dir ('null') to the value of spark.sql.warehouse.dir ('/Users/xubo/Desktop/xubo/git/carbondata2/examples/spark2/target/warehouse').
	2019-01-07 11:36:57 INFO  SharedState:54 - Warehouse path is '/Users/xubo/Desktop/xubo/git/carbondata2/examples/spark2/target/warehouse'.
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@4d68b571{/SQL,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@61bcbcce{/SQL/json,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@15efda6c{/SQL/execution,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@33f2df51{/SQL/execution/json,null,AVAILABLE,@Spark}
	2019-01-07 11:36:57 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@58b91d57{/static/sql,null,AVAILABLE,@Spark}
	2019-01-07 11:36:58 INFO  HiveUtils:54 - Initializing HiveMetastoreConnection version 1.2.1 using Spark classes.
	2019-01-07 11:36:59 INFO  HiveMetaStore:589 - 0: Opening raw store with implemenation class:org.apache.hadoop.hive.metastore.ObjectStore
	2019-01-07 11:36:59 INFO  ObjectStore:289 - ObjectStore, initialize called
	2019-01-07 11:36:59 INFO  Persistence:77 - Property hive.metastore.integral.jdo.pushdown unknown - will be ignored
	2019-01-07 11:36:59 INFO  Persistence:77 - Property datanucleus.cache.level2 unknown - will be ignored
	2019-01-07 11:37:00 INFO  ObjectStore:370 - Setting MetaStore object pin classes with hive.metastore.cache.pinobjtypes="Table,StorageDescriptor,SerDeInfo,Partition,Database,Type,FieldSchema,Order"
	2019-01-07 11:37:01 INFO  Datastore:77 - The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	2019-01-07 11:37:01 INFO  Datastore:77 - The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	2019-01-07 11:37:01 INFO  Datastore:77 - The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	2019-01-07 11:37:01 INFO  Datastore:77 - The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	2019-01-07 11:37:01 INFO  Query:77 - Reading in results for query "org.datanucleus.store.rdbms.query.SQLQuery@0" since the connection used is closing
	2019-01-07 11:37:01 INFO  MetaStoreDirectSql:139 - Using direct SQL, underlying DB is DERBY
	2019-01-07 11:37:01 INFO  ObjectStore:272 - Initialized ObjectStore
	2019-01-07 11:37:01 INFO  HiveMetaStore:663 - Added admin role in metastore
	2019-01-07 11:37:01 INFO  HiveMetaStore:672 - Added public role in metastore
	2019-01-07 11:37:02 INFO  HiveMetaStore:712 - No user is added in admin role, since config is empty
	2019-01-07 11:37:02 INFO  HiveMetaStore:746 - 0: get_all_databases
	2019-01-07 11:37:02 INFO  audit:371 - ugi=xubo	ip=unknown-ip-addr	cmd=get_all_databases	
	2019-01-07 11:37:02 INFO  HiveMetaStore:746 - 0: get_functions: db=default pat=*
	2019-01-07 11:37:02 INFO  audit:371 - ugi=xubo	ip=unknown-ip-addr	cmd=get_functions: db=default pat=*	
	2019-01-07 11:37:02 INFO  Datastore:77 - The class "org.apache.hadoop.hive.metastore.model.MResourceUri" is tagged as "embedded-only" so does not have its own datastore table.
	2019-01-07 11:37:02 INFO  SessionState:641 - Created local directory: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/ed1dc26f-bd92-4f35-8fa4-b3afb1e202e5_resources
	2019-01-07 11:37:02 INFO  SessionState:641 - Created HDFS directory: /tmp/hive/xubo/ed1dc26f-bd92-4f35-8fa4-b3afb1e202e5
	2019-01-07 11:37:02 INFO  SessionState:641 - Created local directory: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/xubo/ed1dc26f-bd92-4f35-8fa4-b3afb1e202e5
	2019-01-07 11:37:02 INFO  SessionState:641 - Created HDFS directory: /tmp/hive/xubo/ed1dc26f-bd92-4f35-8fa4-b3afb1e202e5/_tmp_space.db
	2019-01-07 11:37:02 INFO  HiveClientImpl:54 - Warehouse location for Hive client (version 1.2.1) is /Users/xubo/Desktop/xubo/git/carbondata2/examples/spark2/target/warehouse
	2019-01-07 11:37:02 INFO  HiveMetaStore:746 - 0: get_database: default
	2019-01-07 11:37:02 INFO  audit:371 - ugi=xubo	ip=unknown-ip-addr	cmd=get_database: default	
	2019-01-07 11:37:02 INFO  HiveMetaStore:746 - 0: get_database: global_temp
	2019-01-07 11:37:02 INFO  audit:371 - ugi=xubo	ip=unknown-ip-addr	cmd=get_database: global_temp	
	2019-01-07 11:37:02 WARN  ObjectStore:568 - Failed to get database global_temp, returning NoSuchObjectException
	2019-01-07 11:37:02 INFO  SessionState:641 - Created local directory: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/cf6a81e5-b1c9-4518-a19a-857e1b14b62e_resources
	2019-01-07 11:37:02 INFO  SessionState:641 - Created HDFS directory: /tmp/hive/xubo/cf6a81e5-b1c9-4518-a19a-857e1b14b62e
	2019-01-07 11:37:02 INFO  SessionState:641 - Created local directory: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/xubo/cf6a81e5-b1c9-4518-a19a-857e1b14b62e
	2019-01-07 11:37:02 INFO  SessionState:641 - Created HDFS directory: /tmp/hive/xubo/cf6a81e5-b1c9-4518-a19a-857e1b14b62e/_tmp_space.db
	2019-01-07 11:37:02 INFO  HiveClientImpl:54 - Warehouse location for Hive client (version 1.2.1) is /Users/xubo/Desktop/xubo/git/carbondata2/examples/spark2/target/warehouse
	2019-01-07 11:37:02 INFO  StateStoreCoordinatorRef:54 - Registered StateStoreCoordinator endpoint
	2019-01-07 11:37:03 AUDIT audit:72 - {"time":"January 7, 2019 11:37:03 AM CST","username":"xubo","opName":"DROP TABLE","opId":"166469946220793","opStatus":"START"}
	2019-01-07 11:37:04 AUDIT audit:93 - {"time":"January 7, 2019 11:37:04 AM CST","username":"xubo","opName":"DROP TABLE","opId":"166469946220793","opStatus":"SUCCESS","opTime":"588 ms","table":"default.alluxio_table","extraInfo":{}}
	2019-01-07 11:37:04 AUDIT audit:72 - {"time":"January 7, 2019 11:37:04 AM CST","username":"xubo","opName":"CREATE TABLE","opId":"166470771901112","opStatus":"START"}
	2019-01-07 11:37:04 AUDIT audit:93 - {"time":"January 7, 2019 11:37:04 AM CST","username":"xubo","opName":"CREATE TABLE","opId":"166470771901112","opStatus":"SUCCESS","opTime":"412 ms","table":"default.alluxio_table","extraInfo":{"bad_record_path":"","local_dictionary_enable":"true","external":"false","sort_columns":"","comment":""}}
	2019-01-07 11:37:05 AUDIT audit:72 - {"time":"January 7, 2019 11:37:05 AM CST","username":"xubo","opName":"LOAD DATA","opId":"166471219247179","opStatus":"START"}
	Exception in thread "main" alluxio.exception.status.NotFoundException: Block 33,554,432,000 is unavailable in both Alluxio and UFS.
	2019-01-07 11:37:06 ERROR CarbonLoadDataCommand:166 - Got exception alluxio.exception.status.NotFoundException: Block 33,554,432,000 is unavailable in both Alluxio and UFS. when processing data. But this command does not support undo yet, skipping the undo part.
		at alluxio.client.block.AlluxioBlockStore.getInStream(AlluxioBlockStore.java:174)
		at alluxio.client.file.FileInStream.updateStream(FileInStream.java:295)
		at alluxio.client.file.FileInStream.read(FileInStream.java:157)
	2019-01-07 11:37:06 AUDIT audit:93 - {"time":"January 7, 2019 11:37:06 AM CST","username":"xubo","opName":"LOAD DATA","opId":"166471219247179","opStatus":"FAILED","opTime":"1664 ms","table":"default.alluxio_table","extraInfo":{"Exception":"alluxio.exception.status.NotFoundException","Message":"Block 33,554,432,000 is unavailable in both Alluxio and UFS."}}
		at alluxio.hadoop.HdfsFileInputStream.read(HdfsFileInputStream.java:118)
		at java.io.DataInputStream.read(DataInputStream.java:149)
		at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:284)
		at sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:326)
		at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:178)
		at java.io.InputStreamReader.read(InputStreamReader.java:184)
		at java.io.BufferedReader.fill(BufferedReader.java:161)
		at java.io.BufferedReader.readLine(BufferedReader.java:324)
		at java.io.BufferedReader.readLine(BufferedReader.java:389)
		at org.apache.carbondata.core.util.CarbonUtil.readHeader(CarbonUtil.java:1295)
		at org.apache.carbondata.processing.loading.model.LoadOption.getCsvHeaderColumns(LoadOption.java:227)
		at org.apache.carbondata.processing.loading.model.CarbonLoadModelBuilder.build(CarbonLoadModelBuilder.java:287)
		at org.apache.spark.sql.execution.command.management.CarbonLoadDataCommand.processData(CarbonLoadDataCommand.scala:222)
		at org.apache.spark.sql.execution.command.AtomicRunnableCommand$$anonfun$run$3.apply(package.scala:148)
		at org.apache.spark.sql.execution.command.AtomicRunnableCommand$$anonfun$run$3.apply(package.scala:145)
		at org.apache.spark.sql.execution.command.Auditable$class.runWithAudit(package.scala:104)
		at org.apache.spark.sql.execution.command.AtomicRunnableCommand.runWithAudit(package.scala:141)
		at org.apache.spark.sql.execution.command.AtomicRunnableCommand.run(package.scala:145)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult$lzycompute(commands.scala:58)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult(commands.scala:56)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.executeCollect(commands.scala:67)
		at org.apache.spark.sql.Dataset.<init>(Dataset.scala:183)
		at org.apache.spark.sql.CarbonSession$$anonfun$sql$1.apply(CarbonSession.scala:91)
		at org.apache.spark.sql.CarbonSession$$anonfun$sql$1.apply(CarbonSession.scala:90)
		at org.apache.spark.sql.CarbonSession.withProfiler(CarbonSession.scala:136)
		at org.apache.spark.sql.CarbonSession.sql(CarbonSession.scala:88)
		at org.apache.carbondata.examples.AlluxioExample$.exampleBody(AlluxioExample.scala:60)
		at org.apache.carbondata.examples.AlluxioExample$.main(AlluxioExample.scala:39)
		at org.apache.carbondata.examples.AlluxioExample.main(AlluxioExample.scala)
	
	Process finished with exit code 1
	
## How to fix it?
	localhost:alluxio-1.8.1 xubo$ ./bin/alluxio fs rm /data.csv
	/data.csv has been removed
	localhost:alluxio-1.8.1 xubo$  ./bin/alluxio fs  copyFromLocal /Users/xubo/Desktop/xubo/git/carbondata2/hadoop/src/test/resources/data.csv /
	Copied file:///Users/xubo/Desktop/xubo/git/carbondata2/hadoop/src/test/resources/data.csv to /
	localhost:alluxio-1.8.1 xubo$ 
