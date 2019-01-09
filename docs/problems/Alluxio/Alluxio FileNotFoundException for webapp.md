## code

    AuthenticatedClientUser.remove()
    LoginUserTestUtils.resetLoginUser()
    val localAlluxioCluster = new alluxio.master.LocalAlluxioCluster(2);
    localAlluxioCluster.initConfiguration()
    import scala.collection.JavaConversions._
    val mConfiguration: Map[PropertyKey, String] = new HashMap[PropertyKey, String]
    val SIZE_BYTES: Int =Constants.MB * 16
    mConfiguration.put(PropertyKey.WORKER_MEMORY_SIZE, SIZE_BYTES.toString)
    mConfiguration.put(PropertyKey.USER_BLOCK_SIZE_BYTES_DEFAULT, SIZE_BYTES.toString)
    mConfiguration.put(PropertyKey.MASTER_TTL_CHECKER_INTERVAL_MS, Integer.MAX_VALUE.toString)

	//    mConfiguration.put(PropertyKey.WEB_RESOURCES, "./")
	    for (entry <- mConfiguration.entrySet()) {
	      Configuration.set(entry.getKey, entry.getValue)
	    }
	//    Configuration.set("alluxio.web.file.info.enabled","false");
	    Configuration.validate()
	    localAlluxioCluster.start()


## Exception
	2019-01-08 19:27:43 WARN  InstancedConfiguration:360 - alluxio.master.worker.connect.wait.time=0ms is smaller than alluxio.user.rpc.retry.max.sleep=500ms. Workers might not have enough time to register. Consider either increasing alluxio.master.worker.connect.wait.time or decreasing alluxio.user.rpc.retry.max.sleep
	2019-01-08 19:27:43 INFO  MetricsSystem:148 - Starting sinks with config: {}.
	2019-01-08 19:27:43 INFO  FileSystemContext:195 - Created filesystem context with id app-1058066870042646378. This ID will be used for identifying info from the client, such as metrics. It can be set manually through the alluxio.user.app.id property
	2019-01-08 19:27:43 INFO  ExtensionFactoryRegistry:169 - Loading core jars from /opt/alluxio/lib
	2019-01-08 19:27:43 WARN  ExtensionFactoryRegistry:179 - Failed to load libs: java.nio.file.NoSuchFileException: /opt/alluxio/lib
	2019-01-08 19:27:43 INFO  ExtensionFactoryRegistry:159 - Loading extension jars from /opt/alluxio/extensions
	2019-01-08 19:27:43 INFO  Format:114 - Formatting master journal: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/alluxio-tests/test-cluster-dba270da-f52a-43ad-af12-094e3c7d6158/journal/
	2019-01-08 19:27:43 INFO  ExtensionFactoryRegistry:169 - Loading core jars from /opt/alluxio/lib
	2019-01-08 19:27:43 WARN  ExtensionFactoryRegistry:179 - Failed to load libs: java.nio.file.NoSuchFileException: /opt/alluxio/lib
	2019-01-08 19:27:43 INFO  ExtensionFactoryRegistry:159 - Loading extension jars from /opt/alluxio/extensions
	2019-01-08 19:27:43 INFO  ExtensionFactoryRegistry:169 - Loading core jars from /opt/alluxio/lib
	2019-01-08 19:27:43 WARN  ExtensionFactoryRegistry:179 - Failed to load libs: java.nio.file.NoSuchFileException: /opt/alluxio/lib
	2019-01-08 19:27:43 INFO  ExtensionFactoryRegistry:159 - Loading extension jars from /opt/alluxio/extensions
	2019-01-08 19:27:43 INFO  ExtensionFactoryRegistry:169 - Loading core jars from /opt/alluxio/lib
	2019-01-08 19:27:43 WARN  ExtensionFactoryRegistry:179 - Failed to load libs: java.nio.file.NoSuchFileException: /opt/alluxio/lib
	2019-01-08 19:27:43 INFO  ExtensionFactoryRegistry:159 - Loading extension jars from /opt/alluxio/extensions
	2019-01-08 19:27:43 INFO  ExtensionFactoryRegistry:169 - Loading core jars from /opt/alluxio/lib
	2019-01-08 19:27:43 WARN  ExtensionFactoryRegistry:179 - Failed to load libs: java.nio.file.NoSuchFileException: /opt/alluxio/lib
	2019-01-08 19:27:43 INFO  ExtensionFactoryRegistry:159 - Loading extension jars from /opt/alluxio/extensions
	2019-01-08 19:27:43 INFO  UfsJournal:293 - Formatting /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/alluxio-tests/test-cluster-dba270da-f52a-43ad-af12-094e3c7d6158/journal/BlockMaster/v1
	2019-01-08 19:27:43 INFO  UfsJournal:293 - Formatting /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/alluxio-tests/test-cluster-dba270da-f52a-43ad-af12-094e3c7d6158/journal/FileSystemMaster/v1
	2019-01-08 19:27:43 INFO  UfsJournal:293 - Formatting /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/alluxio-tests/test-cluster-dba270da-f52a-43ad-af12-094e3c7d6158/journal/MetaMaster/v1
	2019-01-08 19:27:43 INFO  UfsJournal:293 - Formatting /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/alluxio-tests/test-cluster-dba270da-f52a-43ad-af12-094e3c7d6158/journal/MetricsMaster/v1
	2019-01-08 19:27:44 INFO  BlockMasterFactory:49 - Creating alluxio.master.block.BlockMaster 
	2019-01-08 19:27:44 INFO  FileSystemMasterFactory:49 - Creating alluxio.master.file.FileSystemMaster 
	2019-01-08 19:27:44 INFO  MetricsMasterFactory:48 - Creating alluxio.master.metrics.MetricsMaster 
	2019-01-08 19:27:44 INFO  MetaMasterFactory:50 - Creating alluxio.master.meta.MetaMaster 
	2019-01-08 19:27:44 INFO  ExtensionFactoryRegistry:169 - Loading core jars from /opt/alluxio/lib
	2019-01-08 19:27:44 WARN  ExtensionFactoryRegistry:179 - Failed to load libs: java.nio.file.NoSuchFileException: /opt/alluxio/lib
	2019-01-08 19:27:44 INFO  ExtensionFactoryRegistry:159 - Loading extension jars from /opt/alluxio/extensions
	2019-01-08 19:27:44 INFO  ExtensionFactoryRegistry:169 - Loading core jars from /opt/alluxio/lib
	2019-01-08 19:27:44 WARN  ExtensionFactoryRegistry:179 - Failed to load libs: java.nio.file.NoSuchFileException: /opt/alluxio/lib
	2019-01-08 19:27:44 INFO  ExtensionFactoryRegistry:159 - Loading extension jars from /opt/alluxio/extensions
	2019-01-08 19:27:44 INFO  ExtensionFactoryRegistry:169 - Loading core jars from /opt/alluxio/lib
	2019-01-08 19:27:44 WARN  ExtensionFactoryRegistry:179 - Failed to load libs: java.nio.file.NoSuchFileException: /opt/alluxio/lib
	2019-01-08 19:27:44 INFO  ExtensionFactoryRegistry:159 - Loading extension jars from /opt/alluxio/extensions
	2019-01-08 19:27:44 INFO  ExtensionFactoryRegistry:169 - Loading core jars from /opt/alluxio/lib
	2019-01-08 19:27:44 WARN  ExtensionFactoryRegistry:179 - Failed to load libs: java.nio.file.NoSuchFileException: /opt/alluxio/lib
	2019-01-08 19:27:44 INFO  ExtensionFactoryRegistry:159 - Loading extension jars from /opt/alluxio/extensions
	2019-01-08 19:27:44 INFO  MountTable:197 - Clearing mount table (except the root).
	2019-01-08 19:27:44 INFO  ExtensionFactoryRegistry:169 - Loading core jars from /opt/alluxio/lib
	2019-01-08 19:27:44 WARN  ExtensionFactoryRegistry:179 - Failed to load libs: java.nio.file.NoSuchFileException: /opt/alluxio/lib
	2019-01-08 19:27:44 INFO  ExtensionFactoryRegistry:159 - Loading extension jars from /opt/alluxio/extensions
	2019-01-08 19:27:44 INFO  MountTable:155 - Mounting /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/alluxio-tests/test-cluster-dba270da-f52a-43ad-af12-094e3c7d6158/underFSStorage at /
	2019-01-08 19:27:44 INFO  LocalAlluxioMaster:102 - Starting Alluxio master Alluxio master @xubodembp/192.168.44.90:54213.
	2019-01-08 19:27:44 INFO  UfsJournalCheckpointThread:135 - BlockMaster: Journal checkpoint thread started.
	2019-01-08 19:27:44 INFO  MountTable:197 - Clearing mount table (except the root).
	2019-01-08 19:27:44 INFO  UfsJournalCheckpointThread:135 - FileSystemMaster: Journal checkpoint thread started.
	2019-01-08 19:27:44 INFO  UfsJournalCheckpointThread:135 - MetaMaster: Journal checkpoint thread started.
	2019-01-08 19:27:44 INFO  UfsJournalCheckpointThread:91 - BlockMaster: Journal checkpointer shutdown has been initiated.
	2019-01-08 19:27:44 INFO  UfsJournalCheckpointThread:135 - MetricsMaster: Journal checkpoint thread started.
	2019-01-08 19:27:44 INFO  UfsJournalCheckpointThread:171 - BlockMaster: Journal checkpoint thread has been shutdown. No new logs have been found during the quiet period.
	2019-01-08 19:27:44 INFO  UfsJournalCheckpointThread:98 - BlockMaster: Journal shutdown complete
	2019-01-08 19:27:44 INFO  UfsJournalCheckpointThread:91 - FileSystemMaster: Journal checkpointer shutdown has been initiated.
	2019-01-08 19:27:44 INFO  UfsJournalCheckpointThread:171 - FileSystemMaster: Journal checkpoint thread has been shutdown. No new logs have been found during the quiet period.
	2019-01-08 19:27:44 INFO  UfsJournalCheckpointThread:98 - FileSystemMaster: Journal shutdown complete
	2019-01-08 19:27:44 INFO  UfsJournalCheckpointThread:91 - MetaMaster: Journal checkpointer shutdown has been initiated.
	2019-01-08 19:27:44 INFO  UfsJournalCheckpointThread:171 - MetaMaster: Journal checkpoint thread has been shutdown. No new logs have been found during the quiet period.
	2019-01-08 19:27:44 INFO  UfsJournalCheckpointThread:98 - MetaMaster: Journal shutdown complete
	2019-01-08 19:27:44 INFO  UfsJournalCheckpointThread:91 - MetricsMaster: Journal checkpointer shutdown has been initiated.
	2019-01-08 19:27:44 INFO  UfsJournalCheckpointThread:171 - MetricsMaster: Journal checkpoint thread has been shutdown. No new logs have been found during the quiet period.
	2019-01-08 19:27:44 INFO  UfsJournalCheckpointThread:98 - MetricsMaster: Journal shutdown complete
	2019-01-08 19:27:44 INFO  AbstractMaster:116 - MetricsMaster: Starting primary master.
	2019-01-08 19:27:44 INFO  AbstractMaster:116 - BlockMaster: Starting primary master.
	2019-01-08 19:27:44 INFO  AbstractMaster:116 - FileSystemMaster: Starting primary master.
	2019-01-08 19:27:44 INFO  DefaultFileSystemMaster:572 - Starting fs master as primary
	2019-01-08 19:27:44 INFO  UfsJournalLogWriter:273 - Created current log file: UfsJournalFile{location=/var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/alluxio-tests/test-cluster-dba270da-f52a-43ad-af12-094e3c7d6158/journal/BlockMaster/v1/logs/0x0-0x7fffffffffffffff, start=0, end=9223372036854775807, isCheckpoint=false}
	2019-01-08 19:27:44 INFO  UfsJournalLogWriter:273 - Created current log file: UfsJournalFile{location=/var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/alluxio-tests/test-cluster-dba270da-f52a-43ad-af12-094e3c7d6158/journal/FileSystemMaster/v1/logs/0x0-0x7fffffffffffffff, start=0, end=9223372036854775807, isCheckpoint=false}
	2019-01-08 19:27:44 INFO  AbstractMaster:116 - MetaMaster: Starting primary master.
	2019-01-08 19:27:44 INFO  AlluxioMasterProcess:263 - All masters started
	2019-01-08 19:27:44 INFO  MetricsSystem:125 - Sinks have already been started.
	2019-01-08 19:27:44 INFO  log:186 - Logging initialized @2270ms
	2019-01-08 19:27:44 INFO  WebServer:95 - Using temporary directory /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/alluxio-tests/test-cluster-dba270da-f52a-43ad-af12-094e3c7d6158/web/ for web server resources
	2019-01-08 19:27:44 INFO  Server:327 - jetty-9.2.16.v20160414
	2019-01-08 19:27:45 INFO  ContextHandler:744 - Started o.e.j.s.ServletContextHandler@2cd9b418{/metrics/prometheus,null,AVAILABLE}
	2019-01-08 19:27:45 INFO  ContextHandler:744 - Started o.e.j.s.ServletContextHandler@2a9d9600{/metrics/json,null,AVAILABLE}
	2019-01-08 19:27:45 WARN  WebInfConfiguration:492 - Web application not found /Users/xubo/Desktop/xubo/git/carbondata1/../core/server/common/src/main/webapp
	2019-01-08 19:27:45 WARN  WebAppContext:514 - Failed startup of context o.e.j.w.WebAppContext@2cc83899{/,null,null}{/Users/xubo/Desktop/xubo/git/carbondata1/../core/server/common/src/main/webapp}
	java.io.FileNotFoundException: /Users/xubo/Desktop/xubo/git/carbondata1/../core/server/common/src/main/webapp
		at org.eclipse.jetty.webapp.WebInfConfiguration.unpack(WebInfConfiguration.java:493)
		at org.eclipse.jetty.webapp.WebInfConfiguration.preConfigure(WebInfConfiguration.java:72)
		at org.eclipse.jetty.webapp.WebAppContext.preConfigure(WebAppContext.java:468)
		at org.eclipse.jetty.webapp.WebAppContext.doStart(WebAppContext.java:504)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.start(ContainerLifeCycle.java:132)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.doStart(ContainerLifeCycle.java:114)
		at org.eclipse.jetty.server.handler.AbstractHandler.doStart(AbstractHandler.java:61)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.start(ContainerLifeCycle.java:132)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.doStart(ContainerLifeCycle.java:114)
		at org.eclipse.jetty.server.handler.AbstractHandler.doStart(AbstractHandler.java:61)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.start(ContainerLifeCycle.java:132)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.doStart(ContainerLifeCycle.java:114)
		at org.eclipse.jetty.server.handler.AbstractHandler.doStart(AbstractHandler.java:61)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.start(ContainerLifeCycle.java:132)
		at org.eclipse.jetty.server.Server.start(Server.java:387)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.doStart(ContainerLifeCycle.java:114)
		at org.eclipse.jetty.server.handler.AbstractHandler.doStart(AbstractHandler.java:61)
		at org.eclipse.jetty.server.Server.doStart(Server.java:354)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at alluxio.web.WebServer.start(WebServer.java:184)
		at alluxio.master.AlluxioMasterProcess.startServingWebServer(AlluxioMasterProcess.java:336)
		at alluxio.master.AlluxioMasterProcess.startServing(AlluxioMasterProcess.java:308)
		at alluxio.master.AlluxioMasterProcess.startServing(AlluxioMasterProcess.java:296)
		at alluxio.master.AlluxioMasterProcess.start(AlluxioMasterProcess.java:229)
		at alluxio.master.LocalAlluxioMaster$2.run(LocalAlluxioMaster.java:103)
		at java.lang.Thread.run(Thread.java:748)
	2019-01-08 19:27:45 INFO  ServerConnector:266 - Started ServerConnector@640e77b7{HTTP/1.1}{192.168.44.90:54214}
	2019-01-08 19:27:45 INFO  Server:379 - Started @2524ms
	2019-01-08 19:27:45 INFO  WebServer:185 - Alluxio Master Web service started @ xubodembp/192.168.44.90:0
	2019-01-08 19:27:45 INFO  AlluxioMasterProcess:310 - Alluxio master version 1.8.1 started. bindHost=xubodembp/192.168.44.90:54213, connectHost=xubodembp/192.168.44.90:54213, rpcPort=54213, webPort=54214
	2019-01-08 19:27:45 INFO  DefaultSafeModeManager:64 - Rpc server started, waiting 0ms for workers to register
	2019-01-08 19:27:45 INFO  BlockMasterFactory:49 - Creating alluxio.master.block.BlockMaster 
	2019-01-08 19:27:45 INFO  FileSystemMasterFactory:49 - Creating alluxio.master.file.FileSystemMaster 
	2019-01-08 19:27:45 INFO  MetaMasterFactory:50 - Creating alluxio.master.meta.MetaMaster 
	2019-01-08 19:27:45 INFO  MetricsMasterFactory:48 - Creating alluxio.master.metrics.MetricsMaster 
	2019-01-08 19:27:45 INFO  ExtensionFactoryRegistry:169 - Loading core jars from /opt/alluxio/lib
	2019-01-08 19:27:45 WARN  ExtensionFactoryRegistry:179 - Failed to load libs: java.nio.file.NoSuchFileException: /opt/alluxio/lib
	2019-01-08 19:27:45 INFO  ExtensionFactoryRegistry:159 - Loading extension jars from /opt/alluxio/extensions
	2019-01-08 19:27:45 INFO  ExtensionFactoryRegistry:169 - Loading core jars from /opt/alluxio/lib
	2019-01-08 19:27:45 WARN  ExtensionFactoryRegistry:179 - Failed to load libs: java.nio.file.NoSuchFileException: /opt/alluxio/lib
	2019-01-08 19:27:45 INFO  ExtensionFactoryRegistry:159 - Loading extension jars from /opt/alluxio/extensions
	2019-01-08 19:27:45 INFO  ExtensionFactoryRegistry:169 - Loading core jars from /opt/alluxio/lib
	2019-01-08 19:27:45 INFO  ExtensionFactoryRegistry:169 - Loading core jars from /opt/alluxio/lib
	2019-01-08 19:27:45 WARN  ExtensionFactoryRegistry:179 - Failed to load libs: java.nio.file.NoSuchFileException: /opt/alluxio/lib
	2019-01-08 19:27:45 WARN  ExtensionFactoryRegistry:179 - Failed to load libs: java.nio.file.NoSuchFileException: /opt/alluxio/lib
	2019-01-08 19:27:45 INFO  ExtensionFactoryRegistry:159 - Loading extension jars from /opt/alluxio/extensions
	2019-01-08 19:27:45 INFO  ExtensionFactoryRegistry:159 - Loading extension jars from /opt/alluxio/extensions
	2019-01-08 19:27:45 INFO  MountTable:197 - Clearing mount table (except the root).
	2019-01-08 19:27:45 INFO  ExtensionFactoryRegistry:169 - Loading core jars from /opt/alluxio/lib
	2019-01-08 19:27:45 WARN  ExtensionFactoryRegistry:179 - Failed to load libs: java.nio.file.NoSuchFileException: /opt/alluxio/lib
	2019-01-08 19:27:45 INFO  ExtensionFactoryRegistry:159 - Loading extension jars from /opt/alluxio/extensions
	2019-01-08 19:27:45 INFO  MountTable:155 - Mounting /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/alluxio-tests/test-cluster-dba270da-f52a-43ad-af12-094e3c7d6158/underFSStorage at /
	2019-01-08 19:27:45 INFO  LocalAlluxioMaster:122 - Starting secondary master Alluxio secondary master.
	2019-01-08 19:27:45 INFO  TieredIdentityFactory:62 - Initialized tiered identity TieredIdentity(node=xubodembp, rack=null)
	2019-01-08 19:27:45 INFO  BlockWorkerFactory:42 - Creating alluxio.worker.block.BlockWorker 
	2019-01-08 19:27:45 INFO  FileSystemWorkerFactory:43 - Creating alluxio.worker.file.FileSystemWorker 
	2019-01-08 19:27:45 INFO  StorageDir:111 - Folder /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/alluxio-tests/test-cluster-dba270da-f52a-43ad-af12-094e3c7d6158/ramdisk/alluxioworker was created!
	2019-01-08 19:27:45 INFO  WebServer:95 - Using temporary directory /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/alluxio-tests/test-cluster-dba270da-f52a-43ad-af12-094e3c7d6158/web/ for web server resources
	2019-01-08 19:27:45 INFO  NettyUtils:175 - EPOLL is not available, will use NIO
	2019-01-08 19:27:45 INFO  NettyUtils:175 - EPOLL is not available, will use NIO
	2019-01-08 19:27:45 INFO  BlockWorkerFactory:42 - Creating alluxio.worker.block.BlockWorker 
	2019-01-08 19:27:45 INFO  FileSystemWorkerFactory:43 - Creating alluxio.worker.file.FileSystemWorker 
	2019-01-08 19:27:45 INFO  WebServer:95 - Using temporary directory /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/alluxio-tests/test-cluster-dba270da-f52a-43ad-af12-094e3c7d6158/web/ for web server resources
	2019-01-08 19:27:45 INFO  MetricsSystem:125 - Sinks have already been started.
	2019-01-08 19:27:45 INFO  MetricsSystem:125 - Sinks have already been started.
	2019-01-08 19:27:45 INFO  AbstractClient:196 - Alluxio client (version 1.8.1) is trying to bootstrap-connect with xubodembp/192.168.44.90:54213
	2019-01-08 19:27:45 WARN  InstancedConfiguration:360 - alluxio.master.worker.connect.wait.time=0ms is smaller than alluxio.user.rpc.retry.max.sleep=500ms. Workers might not have enough time to register. Consider either increasing alluxio.master.worker.connect.wait.time or decreasing alluxio.user.rpc.retry.max.sleep
	2019-01-08 19:27:45 INFO  AbstractClient:248 - Alluxio client has bootstrap-connected with xubodembp/192.168.44.90:54213
	2019-01-08 19:27:45 INFO  AbstractClient:253 - Alluxio client (version 1.8.1) is trying to connect with BlockMasterWorker @ xubodembp/192.168.44.90:54213
	2019-01-08 19:27:45 INFO  AbstractClient:253 - Alluxio client (version 1.8.1) is trying to connect with BlockMasterWorker @ xubodembp/192.168.44.90:54213
	2019-01-08 19:27:45 INFO  AbstractClient:260 - Client registered with BlockMasterWorker @ xubodembp/192.168.44.90:54213
	2019-01-08 19:27:45 INFO  AbstractClient:260 - Client registered with BlockMasterWorker @ xubodembp/192.168.44.90:54213
	2019-01-08 19:27:45 INFO  DefaultBlockMaster:785 - getWorkerId(): WorkerNetAddress: WorkerNetAddress{host=xubodembp, rpcPort=54219, dataPort=54220, webPort=54218, domainSocketPath=, tieredIdentity=TieredIdentity(node=xubodembp, rack=null)} id: 2425122639401956712
	2019-01-08 19:27:45 INFO  DefaultBlockMaster:785 - getWorkerId(): WorkerNetAddress: WorkerNetAddress{host=xubodembp, rpcPort=54216, dataPort=54217, webPort=54215, domainSocketPath=, tieredIdentity=TieredIdentity(node=xubodembp, rack=null)} id: 2457145218802715257
	2019-01-08 19:27:45 INFO  DefaultBlockMaster:833 - registerWorker(): MasterWorkerInfo{id=2425122639401956712, workerAddress=WorkerNetAddress{host=xubodembp, rpcPort=54219, dataPort=54220, webPort=54218, domainSocketPath=, tieredIdentity=TieredIdentity(node=xubodembp, rack=null)}, capacityBytes=16777216, usedBytes=0, lastUpdatedTimeMs=1546946865657, blocks=[]}
	2019-01-08 19:27:45 INFO  DefaultBlockMaster:833 - registerWorker(): MasterWorkerInfo{id=2457145218802715257, workerAddress=WorkerNetAddress{host=xubodembp, rpcPort=54216, dataPort=54217, webPort=54215, domainSocketPath=, tieredIdentity=TieredIdentity(node=xubodembp, rack=null)}, capacityBytes=16777216, usedBytes=0, lastUpdatedTimeMs=1546946865658, blocks=[]}
	2019-01-08 19:27:45 INFO  AbstractClient:253 - Alluxio client (version 1.8.1) is trying to connect with FileSystemMasterWorker @ xubodembp/192.168.44.90:54213
	2019-01-08 19:27:45 INFO  AbstractClient:253 - Alluxio client (version 1.8.1) is trying to connect with FileSystemMasterWorker @ xubodembp/192.168.44.90:54213
	2019-01-08 19:27:45 INFO  AlluxioWorkerProcess:245 - Started Alluxio worker with id 2457145218802715257
	2019-01-08 19:27:45 INFO  Server:327 - jetty-9.2.16.v20160414
	2019-01-08 19:27:45 INFO  AlluxioWorkerProcess:245 - Started Alluxio worker with id 2425122639401956712
	2019-01-08 19:27:45 INFO  ContextHandler:744 - Started o.e.j.s.ServletContextHandler@78e7ca49{/metrics/prometheus,null,AVAILABLE}
	2019-01-08 19:27:45 INFO  AbstractClient:260 - Client registered with FileSystemMasterWorker @ xubodembp/192.168.44.90:54213
	2019-01-08 19:27:45 INFO  Server:327 - jetty-9.2.16.v20160414
	2019-01-08 19:27:45 INFO  ContextHandler:744 - Started o.e.j.s.ServletContextHandler@87f401e{/metrics/json,null,AVAILABLE}
	2019-01-08 19:27:45 INFO  AbstractClient:260 - Client registered with FileSystemMasterWorker @ xubodembp/192.168.44.90:54213
	2019-01-08 19:27:45 INFO  ContextHandler:744 - Started o.e.j.s.ServletContextHandler@5e80abaf{/metrics/prometheus,null,AVAILABLE}
	2019-01-08 19:27:45 INFO  ContextHandler:744 - Started o.e.j.s.ServletContextHandler@15273b3{/metrics/json,null,AVAILABLE}
	2019-01-08 19:27:45 WARN  WebInfConfiguration:492 - Web application not found /Users/xubo/Desktop/xubo/git/carbondata1/../core/server/common/src/main/webapp
	2019-01-08 19:27:45 WARN  WebAppContext:514 - Failed startup of context o.e.j.w.WebAppContext@16f577cd{/,null,null}{/Users/xubo/Desktop/xubo/git/carbondata1/../core/server/common/src/main/webapp}
	java.io.FileNotFoundException: /Users/xubo/Desktop/xubo/git/carbondata1/../core/server/common/src/main/webapp
		at org.eclipse.jetty.webapp.WebInfConfiguration.unpack(WebInfConfiguration.java:493)
		at org.eclipse.jetty.webapp.WebInfConfiguration.preConfigure(WebInfConfiguration.java:72)
		at org.eclipse.jetty.webapp.WebAppContext.preConfigure(WebAppContext.java:468)
		at org.eclipse.jetty.webapp.WebAppContext.doStart(WebAppContext.java:504)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.start(ContainerLifeCycle.java:132)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.doStart(ContainerLifeCycle.java:114)
		at org.eclipse.jetty.server.handler.AbstractHandler.doStart(AbstractHandler.java:61)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.start(ContainerLifeCycle.java:132)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.doStart(ContainerLifeCycle.java:114)
		at org.eclipse.jetty.server.handler.AbstractHandler.doStart(AbstractHandler.java:61)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.start(ContainerLifeCycle.java:132)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.doStart(ContainerLifeCycle.java:114)
		at org.eclipse.jetty.server.handler.AbstractHandler.doStart(AbstractHandler.java:61)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.start(ContainerLifeCycle.java:132)
		at org.eclipse.jetty.server.Server.start(Server.java:387)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.doStart(ContainerLifeCycle.java:114)
		at org.eclipse.jetty.server.handler.AbstractHandler.doStart(AbstractHandler.java:61)
		at org.eclipse.jetty.server.Server.doStart(Server.java:354)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at alluxio.web.WebServer.start(WebServer.java:184)
		at alluxio.worker.AlluxioWorkerProcess.start(AlluxioWorkerProcess.java:250)
		at alluxio.master.AbstractLocalAlluxioCluster$2.run(AbstractLocalAlluxioCluster.java:144)
		at java.lang.Thread.run(Thread.java:748)
	2019-01-08 19:27:45 INFO  ServerConnector:266 - Started ServerConnector@26a9b5ec{HTTP/1.1}{192.168.44.90:54215}
	2019-01-08 19:27:45 INFO  Server:379 - Started @3164ms
	2019-01-08 19:27:45 INFO  WebServer:185 - Alluxio worker web service started @ xubodembp/192.168.44.90:0
	2019-01-08 19:27:45 INFO  AlluxioWorkerProcess:261 - Alluxio worker version 1.8.1 started. bindHost=xubodembp, connectHost=xubodembp, rpcPort=0, dataPort=0, webPort=0
	2019-01-08 19:27:45 WARN  WebInfConfiguration:492 - Web application not found /Users/xubo/Desktop/xubo/git/carbondata1/../core/server/common/src/main/webapp
	2019-01-08 19:27:45 WARN  WebAppContext:514 - Failed startup of context o.e.j.w.WebAppContext@2c08185{/,null,null}{/Users/xubo/Desktop/xubo/git/carbondata1/../core/server/common/src/main/webapp}
	java.io.FileNotFoundException: /Users/xubo/Desktop/xubo/git/carbondata1/../core/server/common/src/main/webapp
		at org.eclipse.jetty.webapp.WebInfConfiguration.unpack(WebInfConfiguration.java:493)
		at org.eclipse.jetty.webapp.WebInfConfiguration.preConfigure(WebInfConfiguration.java:72)
		at org.eclipse.jetty.webapp.WebAppContext.preConfigure(WebAppContext.java:468)
		at org.eclipse.jetty.webapp.WebAppContext.doStart(WebAppContext.java:504)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.start(ContainerLifeCycle.java:132)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.doStart(ContainerLifeCycle.java:114)
		at org.eclipse.jetty.server.handler.AbstractHandler.doStart(AbstractHandler.java:61)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.start(ContainerLifeCycle.java:132)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.doStart(ContainerLifeCycle.java:114)
		at org.eclipse.jetty.server.handler.AbstractHandler.doStart(AbstractHandler.java:61)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.start(ContainerLifeCycle.java:132)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.doStart(ContainerLifeCycle.java:114)
		at org.eclipse.jetty.server.handler.AbstractHandler.doStart(AbstractHandler.java:61)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.start(ContainerLifeCycle.java:132)
		at org.eclipse.jetty.server.Server.start(Server.java:387)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.doStart(ContainerLifeCycle.java:114)
		at org.eclipse.jetty.server.handler.AbstractHandler.doStart(AbstractHandler.java:61)
		at org.eclipse.jetty.server.Server.doStart(Server.java:354)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at alluxio.web.WebServer.start(WebServer.java:184)
		at alluxio.worker.AlluxioWorkerProcess.start(AlluxioWorkerProcess.java:250)
		at alluxio.master.AbstractLocalAlluxioCluster$2.run(AbstractLocalAlluxioCluster.java:144)
		at java.lang.Thread.run(Thread.java:748)
	2019-01-08 19:27:45 INFO  ServerConnector:266 - Started ServerConnector@5d4bc5b2{HTTP/1.1}{192.168.44.90:54218}
	2019-01-08 19:27:45 INFO  Server:379 - Started @3166ms
	2019-01-08 19:27:45 INFO  WebServer:185 - Alluxio worker web service started @ xubodembp/192.168.44.90:0
	2019-01-08 19:27:45 INFO  AlluxioWorkerProcess:261 - Alluxio worker version 1.8.1 started. bindHost=xubodembp, connectHost=xubodembp, rpcPort=0, dataPort=0, webPort=0
	2019-01-08 19:27:45 INFO  AbstractClient:253 - Alluxio client (version 1.8.1) is trying to connect with FileSystemMasterWorker @ xubodembp/192.168.44.90:54213
	2019-01-08 19:27:45 INFO  AbstractClient:253 - Alluxio client (version 1.8.1) is trying to connect with FileSystemMasterWorker @ xubodembp/192.168.44.90:54213
	2019-01-08 19:27:45 INFO  AbstractClient:260 - Client registered with FileSystemMasterWorker @ xubodembp/192.168.44.90:54213
	2019-01-08 19:27:45 INFO  AbstractClient:260 - Client registered with FileSystemMasterWorker @ xubodembp/192.168.44.90:54213
	2019-01-08 19:27:45 INFO  WebServer:95 - Using temporary directory /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/alluxio-tests/test-cluster-dba270da-f52a-43ad-af12-094e3c7d6158/web/ for web server resources
	2019-01-08 19:27:45 INFO  Server:327 - jetty-9.2.16.v20160414
	2019-01-08 19:27:45 WARN  WebInfConfiguration:492 - Web application not found /Users/xubo/Desktop/xubo/git/carbondata1/../core/server/common/src/main/webapp
	2019-01-08 19:27:45 WARN  WebAppContext:514 - Failed startup of context o.e.j.w.WebAppContext@5c62b39b{/,null,null}{/Users/xubo/Desktop/xubo/git/carbondata1/../core/server/common/src/main/webapp}
	java.io.FileNotFoundException: /Users/xubo/Desktop/xubo/git/carbondata1/../core/server/common/src/main/webapp
		at org.eclipse.jetty.webapp.WebInfConfiguration.unpack(WebInfConfiguration.java:493)
		at org.eclipse.jetty.webapp.WebInfConfiguration.preConfigure(WebInfConfiguration.java:72)
		at org.eclipse.jetty.webapp.WebAppContext.preConfigure(WebAppContext.java:468)
		at org.eclipse.jetty.webapp.WebAppContext.doStart(WebAppContext.java:504)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.start(ContainerLifeCycle.java:132)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.doStart(ContainerLifeCycle.java:114)
		at org.eclipse.jetty.server.handler.AbstractHandler.doStart(AbstractHandler.java:61)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.start(ContainerLifeCycle.java:132)
		at org.eclipse.jetty.server.Server.start(Server.java:387)
		at org.eclipse.jetty.util.component.ContainerLifeCycle.doStart(ContainerLifeCycle.java:114)
		at org.eclipse.jetty.server.handler.AbstractHandler.doStart(AbstractHandler.java:61)
		at org.eclipse.jetty.server.Server.doStart(Server.java:354)
		at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:68)
		at alluxio.web.WebServer.start(WebServer.java:184)
		at alluxio.proxy.AlluxioProxyProcess.start(AlluxioProxyProcess.java:82)
		at alluxio.master.AbstractLocalAlluxioCluster$1.run(AbstractLocalAlluxioCluster.java:113)
		at java.lang.Thread.run(Thread.java:748)
	2019-01-08 19:27:45 INFO  ServerConnector:266 - Started ServerConnector@5a7d1016{HTTP/1.1}{0.0.0.0:54228}
	2019-01-08 19:27:45 INFO  Server:379 - Started @3181ms
	2019-01-08 19:27:45 INFO  WebServer:185 - Alluxio Proxy Web service started @ /0.0.0.0:0
	2019-01-08 19:27:45 WARN  SleepingTimer:78 - Worker Pin List Sync last execution took 25 ms. Longer than the interval 15
	2019-01-08 19:27:45 WARN  SleepingTimer:78 - Worker Pin List Sync last execution took 25 ms. Longer than the interval 15
	2019-01-08 19:27:45 WARN  SleepingTimer:78 - Worker Block Sync last execution took 48 ms. Longer than the interval 15
	2019-01-08 19:27:45 WARN  SleepingTimer:78 - Worker Block Sync last execution took 48 ms. Longer than the interval 15
	2019-01-08 19:28:06 WARN  SleepingTimer:78 - Worker Block Sync last execution took 16 ms. Longer than the interval 15
	2019-01-08 19:28:12 WARN  SleepingTimer:78 - Worker Block Sync last execution took 16 ms. Longer than the interval 15
	2019-01-08 19:28:27 WARN  SleepingTimer:78 - Worker Block Sync last execution took 19 ms. Longer than the interval 15
	2019-01-08 19:28:45 INFO  ThreadUtils:49 - Dumping all threads:
	Exception in thread "main" java.lang.RuntimeException: Timed out waiting for process Alluxio Proxy to start
	java.lang.Throwable: Stack trace for thread qtp2012814077-100-acceptor-0@6f31ee9e-ServerConnector@5a7d1016{HTTP/1.1}{0.0.0.0:54228} (State: RUNNABLE):
		at alluxio.master.TestUtils.waitForReady(TestUtils.java:30)
		at sun.nio.ch.ServerSocketChannelImpl.accept0(Native Method)
		at sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:422)
		at alluxio.master.AbstractLocalAlluxioCluster.startProxy(AbstractLocalAlluxioCluster.java:127)
		at sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:250)
		at alluxio.master.AbstractLocalAlluxioCluster.start(AbstractLocalAlluxioCluster.java:85)
		at org.eclipse.jetty.server.ServerConnector.accept(ServerConnector.java:377)
		at org.eclipse.jetty.server.AbstractConnector$Acceptor.run(AbstractConnector.java:500)
		at org.apache.carbondata.alluxio.AlluxioExample$.main(AlluxioExample.scala:60)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.apache.carbondata.alluxio.AlluxioExample.main(AlluxioExample.scala)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp1789452565-81-selector-ServerConnectorManager@736a179f/0 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:601)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.run(SelectorManager.java:550)
		at org.eclipse.jetty.util.thread.NonBlockingThread.run(NonBlockingThread.java:52)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Worker Block Sync (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.time.ThreadSleeper.sleep(ThreadSleeper.java:26)
		at alluxio.heartbeat.SleepingTimer.tick(SleepingTimer.java:81)
		at alluxio.heartbeat.HeartbeatThread.run(HeartbeatThread.java:73)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Master Lost Files Detection (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.time.ThreadSleeper.sleep(ThreadSleeper.java:26)
		at alluxio.heartbeat.SleepingTimer.tick(SleepingTimer.java:81)
		at alluxio.heartbeat.HeartbeatThread.run(HeartbeatThread.java:73)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp1789452565-88-selector-ServerConnectorManager@736a179f/3 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:601)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.run(SelectorManager.java:550)
		at org.eclipse.jetty.util.thread.NonBlockingThread.run(NonBlockingThread.java:52)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread pool-14-thread-3 (State: RUNNABLE):
		at java.net.SocketInputStream.socketRead0(Native Method)
		at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
		at java.net.SocketInputStream.read(SocketInputStream.java:171)
		at java.net.SocketInputStream.read(SocketInputStream.java:141)
		at java.io.BufferedInputStream.fill(BufferedInputStream.java:246)
		at java.io.BufferedInputStream.read1(BufferedInputStream.java:286)
		at java.io.BufferedInputStream.read(BufferedInputStream.java:345)
		at org.apache.thrift.transport.TIOStreamTransport.read(TIOStreamTransport.java:127)
		at alluxio.network.thrift.PeekableTransport.read(PeekableTransport.java:63)
		at org.apache.thrift.transport.TTransport.readAll(TTransport.java:86)
		at org.apache.thrift.transport.TSaslTransport.readLength(TSaslTransport.java:376)
		at org.apache.thrift.transport.TSaslTransport.readFrame(TSaslTransport.java:453)
		at org.apache.thrift.transport.TSaslTransport.read(TSaslTransport.java:435)
		at org.apache.thrift.transport.TSaslServerTransport.read(TSaslServerTransport.java:41)
		at alluxio.network.thrift.BootstrapServerTransport.read(BootstrapServerTransport.java:98)
		at org.apache.thrift.transport.TTransport.readAll(TTransport.java:86)
		at org.apache.thrift.protocol.TBinaryProtocol.readAll(TBinaryProtocol.java:429)
		at org.apache.thrift.protocol.TBinaryProtocol.readI32(TBinaryProtocol.java:318)
		at org.apache.thrift.protocol.TBinaryProtocol.readMessageBegin(TBinaryProtocol.java:219)
		at org.apache.thrift.TMultiplexedProcessor.process(TMultiplexedProcessor.java:92)
		at org.apache.thrift.server.TThreadPoolServer$WorkerProcess.run(TThreadPoolServer.java:286)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread UfsJournalGarbageCollector-0 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
		at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
		at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp851766649-42-acceptor-0@63204856-ServerConnector@640e77b7{HTTP/1.1}{192.168.44.90:54214} (State: RUNNABLE):
		at sun.nio.ch.ServerSocketChannelImpl.accept0(Native Method)
		at sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:422)
		at sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:250)
		at org.eclipse.jetty.server.ServerConnector.accept(ServerConnector.java:377)
		at org.eclipse.jetty.server.AbstractConnector$Acceptor.run(AbstractConnector.java:500)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp2012814077-98-selector-ServerConnectorManager@607063e4/2 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:601)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.run(SelectorManager.java:550)
		at org.eclipse.jetty.util.thread.NonBlockingThread.run(NonBlockingThread.java:52)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread ProxyThread-749927456 (State: WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
		at java.util.concurrent.CountDownLatch.await(CountDownLatch.java:231)
		at alluxio.proxy.AlluxioProxyProcess.start(AlluxioProxyProcess.java:83)
		at alluxio.master.AbstractLocalAlluxioCluster$1.run(AbstractLocalAlluxioCluster.java:113)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Worker Space Reserver (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.time.ThreadSleeper.sleep(ThreadSleeper.java:26)
		at alluxio.heartbeat.SleepingTimer.tick(SleepingTimer.java:81)
		at alluxio.heartbeat.HeartbeatThread.run(HeartbeatThread.java:73)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Monitor Ctrl-Break (State: RUNNABLE):
		at java.net.SocketInputStream.socketRead0(Native Method)
		at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
		at java.net.SocketInputStream.read(SocketInputStream.java:171)
		at java.net.SocketInputStream.read(SocketInputStream.java:141)
		at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:284)
		at sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:326)
		at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:178)
		at java.io.InputStreamReader.read(InputStreamReader.java:184)
		at java.io.BufferedReader.fill(BufferedReader.java:161)
		at java.io.BufferedReader.readLine(BufferedReader.java:324)
		at java.io.BufferedReader.readLine(BufferedReader.java:389)
		at com.intellij.rt.execution.application.AppMainV2$1.run(AppMainV2.java:64)
	java.lang.Throwable: Stack trace for thread Master Log Config Report Scheduling (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.time.ThreadSleeper.sleep(ThreadSleeper.java:26)
		at alluxio.heartbeat.SleepingTimer.tick(SleepingTimer.java:81)
		at alluxio.heartbeat.HeartbeatThread.run(HeartbeatThread.java:73)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp1789452565-89-acceptor-0@1a989668-ServerConnector@5d4bc5b2{HTTP/1.1}{192.168.44.90:54218} (State: RUNNABLE):
		at sun.nio.ch.ServerSocketChannelImpl.accept0(Native Method)
		at sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:422)
		at sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:250)
		at org.eclipse.jetty.server.ServerConnector.accept(ServerConnector.java:377)
		at org.eclipse.jetty.server.AbstractConnector$Acceptor.run(AbstractConnector.java:500)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Finalizer (State: WAITING):
		at java.lang.Object.wait(Native Method)
		at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:143)
		at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:164)
		at java.lang.ref.Finalizer$FinalizerThread.run(Finalizer.java:212)
	java.lang.Throwable: Stack trace for thread Worker Pin List Sync (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.time.ThreadSleeper.sleep(ThreadSleeper.java:26)
		at alluxio.heartbeat.SleepingTimer.tick(SleepingTimer.java:81)
		at alluxio.heartbeat.HeartbeatThread.run(HeartbeatThread.java:73)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Master Cluster Metrics Updater (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.time.ThreadSleeper.sleep(ThreadSleeper.java:26)
		at alluxio.heartbeat.SleepingTimer.tick(SleepingTimer.java:81)
		at alluxio.heartbeat.HeartbeatThread.run(HeartbeatThread.java:73)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread WorkerThread-1298146757 (State: RUNNABLE):
		at java.net.PlainSocketImpl.socketAccept(Native Method)
		at java.net.AbstractPlainSocketImpl.accept(AbstractPlainSocketImpl.java:409)
		at java.net.ServerSocket.implAccept(ServerSocket.java:545)
		at java.net.ServerSocket.accept(ServerSocket.java:513)
		at org.apache.thrift.transport.TServerSocket.acceptImpl(TServerSocket.java:129)
		at org.apache.thrift.transport.TServerSocket.acceptImpl(TServerSocket.java:35)
		at org.apache.thrift.transport.TServerTransport.accept(TServerTransport.java:60)
		at org.apache.thrift.server.TThreadPoolServer.serve(TThreadPoolServer.java:162)
		at alluxio.worker.AlluxioWorkerProcess.start(AlluxioWorkerProcess.java:269)
		at alluxio.master.AbstractLocalAlluxioCluster$2.run(AbstractLocalAlluxioCluster.java:144)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp2012814077-107 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:389)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:531)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.access$700(QueuedThreadPool.java:47)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:590)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp2012814077-108 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:389)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:531)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.access$700(QueuedThreadPool.java:47)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:590)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp2012814077-96-selector-ServerConnectorManager@607063e4/0 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:601)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.run(SelectorManager.java:550)
		at org.eclipse.jetty.util.thread.NonBlockingThread.run(NonBlockingThread.java:52)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp702061917-84-selector-ServerConnectorManager@1bb7721f/3 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:601)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.run(SelectorManager.java:550)
		at org.eclipse.jetty.util.thread.NonBlockingThread.run(NonBlockingThread.java:52)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp2012814077-97-selector-ServerConnectorManager@607063e4/1 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:601)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.run(SelectorManager.java:550)
		at org.eclipse.jetty.util.thread.NonBlockingThread.run(NonBlockingThread.java:52)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread data-server-tcp-socket-boss-0 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at io.netty.channel.nio.NioEventLoop.select(NioEventLoop.java:747)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:392)
		at io.netty.util.concurrent.SingleThreadEventExecutor$2.run(SingleThreadEventExecutor.java:131)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp851766649-39-selector-ServerConnectorManager@bb9d40d/2 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:601)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.run(SelectorManager.java:550)
		at org.eclipse.jetty.util.thread.NonBlockingThread.run(NonBlockingThread.java:52)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp702061917-78-selector-ServerConnectorManager@1bb7721f/2 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:601)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.run(SelectorManager.java:550)
		at org.eclipse.jetty.util.thread.NonBlockingThread.run(NonBlockingThread.java:52)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread WorkerThread-2133344792 (State: RUNNABLE):
		at java.net.PlainSocketImpl.socketAccept(Native Method)
		at java.net.AbstractPlainSocketImpl.accept(AbstractPlainSocketImpl.java:409)
		at java.net.ServerSocket.implAccept(ServerSocket.java:545)
		at java.net.ServerSocket.accept(ServerSocket.java:513)
		at org.apache.thrift.transport.TServerSocket.acceptImpl(TServerSocket.java:129)
		at org.apache.thrift.transport.TServerSocket.acceptImpl(TServerSocket.java:35)
		at org.apache.thrift.transport.TServerTransport.accept(TServerTransport.java:60)
		at org.apache.thrift.server.TThreadPoolServer.serve(TThreadPoolServer.java:162)
		at alluxio.worker.AlluxioWorkerProcess.start(AlluxioWorkerProcess.java:269)
		at alluxio.master.AbstractLocalAlluxioCluster$2.run(AbstractLocalAlluxioCluster.java:144)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Signal Dispatcher (State: RUNNABLE):
	java.lang.Throwable: Stack trace for thread UfsJournalGarbageCollector-0 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
		at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
		at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread pool-14-thread-4 (State: RUNNABLE):
		at java.net.SocketOutputStream.socketWrite0(Native Method)
		at java.net.SocketOutputStream.socketWrite(SocketOutputStream.java:111)
		at java.net.SocketOutputStream.write(SocketOutputStream.java:155)
		at java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:82)
		at java.io.BufferedOutputStream.flush(BufferedOutputStream.java:140)
		at org.apache.thrift.transport.TIOStreamTransport.flush(TIOStreamTransport.java:159)
		at alluxio.network.thrift.PeekableTransport.flush(PeekableTransport.java:74)
		at org.apache.thrift.transport.TSaslTransport.flush(TSaslTransport.java:501)
		at org.apache.thrift.transport.TSaslServerTransport.flush(TSaslServerTransport.java:41)
		at alluxio.network.thrift.BootstrapServerTransport.flush(BootstrapServerTransport.java:114)
		at org.apache.thrift.ProcessFunction.process(ProcessFunction.java:55)
		at org.apache.thrift.TBaseProcessor.process(TBaseProcessor.java:39)
		at org.apache.thrift.TMultiplexedProcessor.process(TMultiplexedProcessor.java:123)
		at org.apache.thrift.server.TThreadPoolServer$WorkerProcess.run(TThreadPoolServer.java:286)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp702061917-76-selector-ServerConnectorManager@1bb7721f/0 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:601)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.run(SelectorManager.java:550)
		at org.eclipse.jetty.util.thread.NonBlockingThread.run(NonBlockingThread.java:52)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp2012814077-105 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:389)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:531)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.access$700(QueuedThreadPool.java:47)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:590)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread block-worker-heartbeat-3 (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.util.CommonUtils.sleepMs(CommonUtils.java:189)
		at alluxio.worker.SessionCleaner.run(SessionCleaner.java:71)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp702061917-116 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:389)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:531)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.access$700(QueuedThreadPool.java:47)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:590)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp1789452565-83-selector-ServerConnectorManager@736a179f/2 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:601)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.run(SelectorManager.java:550)
		at org.eclipse.jetty.util.thread.NonBlockingThread.run(NonBlockingThread.java:52)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp851766649-114 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:389)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:531)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.access$700(QueuedThreadPool.java:47)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:590)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread MasterThread-1346201722 (State: RUNNABLE):
		at java.net.PlainSocketImpl.socketAccept(Native Method)
		at java.net.AbstractPlainSocketImpl.accept(AbstractPlainSocketImpl.java:409)
		at java.net.ServerSocket.implAccept(ServerSocket.java:545)
		at java.net.ServerSocket.accept(ServerSocket.java:513)
		at org.apache.thrift.transport.TServerSocket.acceptImpl(TServerSocket.java:129)
		at alluxio.network.thrift.SocketTrackingTServerSocket.acceptImpl(SocketTrackingTServerSocket.java:59)
		at alluxio.network.thrift.SocketTrackingTServerSocket.acceptImpl(SocketTrackingTServerSocket.java:38)
		at org.apache.thrift.transport.TServerTransport.accept(TServerTransport.java:60)
		at org.apache.thrift.server.TThreadPoolServer.serve(TThreadPoolServer.java:162)
		at alluxio.master.AlluxioMasterProcess.startServingRPCServer(AlluxioMasterProcess.java:399)
		at alluxio.master.AlluxioMasterProcess.startServing(AlluxioMasterProcess.java:318)
		at alluxio.master.AlluxioMasterProcess.startServing(AlluxioMasterProcess.java:296)
		at alluxio.master.AlluxioMasterProcess.start(AlluxioMasterProcess.java:229)
		at alluxio.master.LocalAlluxioMaster$2.run(LocalAlluxioMaster.java:103)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp2012814077-109 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:389)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:531)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.access$700(QueuedThreadPool.java:47)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:590)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp1789452565-82-selector-ServerConnectorManager@736a179f/1 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:601)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.run(SelectorManager.java:550)
		at org.eclipse.jetty.util.thread.NonBlockingThread.run(NonBlockingThread.java:52)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp2012814077-113 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:389)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:531)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.access$700(QueuedThreadPool.java:47)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:590)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp2012814077-99-selector-ServerConnectorManager@607063e4/3 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:601)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.run(SelectorManager.java:550)
		at org.eclipse.jetty.util.thread.NonBlockingThread.run(NonBlockingThread.java:52)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp1789452565-115 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:389)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:531)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.access$700(QueuedThreadPool.java:47)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:590)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp2012814077-110 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:389)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:531)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.access$700(QueuedThreadPool.java:47)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:590)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Worker FileSystemMaster Sync (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.time.ThreadSleeper.sleep(ThreadSleeper.java:26)
		at alluxio.heartbeat.SleepingTimer.tick(SleepingTimer.java:81)
		at alluxio.heartbeat.HeartbeatThread.run(HeartbeatThread.java:73)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread SecondaryMasterThread-879583678 (State: WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
		at java.util.concurrent.CountDownLatch.await(CountDownLatch.java:231)
		at alluxio.master.AlluxioSecondaryMaster.start(AlluxioSecondaryMaster.java:74)
		at alluxio.master.LocalAlluxioMaster$3.run(LocalAlluxioMaster.java:123)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp851766649-38-selector-ServerConnectorManager@bb9d40d/1 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:601)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.run(SelectorManager.java:550)
		at org.eclipse.jetty.util.thread.NonBlockingThread.run(NonBlockingThread.java:52)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp851766649-40-selector-ServerConnectorManager@bb9d40d/3 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:601)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.run(SelectorManager.java:550)
		at org.eclipse.jetty.util.thread.NonBlockingThread.run(NonBlockingThread.java:52)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp702061917-77-selector-ServerConnectorManager@1bb7721f/1 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:601)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.run(SelectorManager.java:550)
		at org.eclipse.jetty.util.thread.NonBlockingThread.run(NonBlockingThread.java:52)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp2012814077-111 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:389)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:531)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.access$700(QueuedThreadPool.java:47)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:590)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp2012814077-106 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:389)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:531)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.access$700(QueuedThreadPool.java:47)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:590)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Worker Pin List Sync (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.time.ThreadSleeper.sleep(ThreadSleeper.java:26)
		at alluxio.heartbeat.SleepingTimer.tick(SleepingTimer.java:81)
		at alluxio.heartbeat.HeartbeatThread.run(HeartbeatThread.java:73)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Master TTL Check (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.time.ThreadSleeper.sleep(ThreadSleeper.java:26)
		at alluxio.heartbeat.SleepingTimer.tick(SleepingTimer.java:81)
		at alluxio.heartbeat.HeartbeatThread.run(HeartbeatThread.java:73)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Worker Block Sync (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.time.ThreadSleeper.sleep(ThreadSleeper.java:26)
		at alluxio.heartbeat.SleepingTimer.tick(SleepingTimer.java:81)
		at alluxio.heartbeat.HeartbeatThread.run(HeartbeatThread.java:73)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread UfsJournalGarbageCollector-0 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
		at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
		at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp2012814077-102 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:389)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:531)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.access$700(QueuedThreadPool.java:47)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:590)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread main (State: RUNNABLE):
		at java.lang.Thread.getStackTrace(Thread.java:1559)
		at alluxio.util.ThreadUtils.formatStackTrace(ThreadUtils.java:35)
		at alluxio.util.ThreadUtils.logAllThreads(ThreadUtils.java:47)
		at alluxio.master.TestUtils.waitForReady(TestUtils.java:28)
		at alluxio.master.AbstractLocalAlluxioCluster.startProxy(AbstractLocalAlluxioCluster.java:127)
		at alluxio.master.AbstractLocalAlluxioCluster.start(AbstractLocalAlluxioCluster.java:85)
		at org.apache.carbondata.alluxio.AlluxioExample$.main(AlluxioExample.scala:60)
		at org.apache.carbondata.alluxio.AlluxioExample.main(AlluxioExample.scala)
	java.lang.Throwable: Stack trace for thread Worker FileSystemMaster Sync (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.time.ThreadSleeper.sleep(ThreadSleeper.java:26)
		at alluxio.heartbeat.SleepingTimer.tick(SleepingTimer.java:81)
		at alluxio.heartbeat.HeartbeatThread.run(HeartbeatThread.java:73)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread pool-14-thread-2 (State: RUNNABLE):
		at java.net.SocketInputStream.socketRead0(Native Method)
		at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
		at java.net.SocketInputStream.read(SocketInputStream.java:171)
		at java.net.SocketInputStream.read(SocketInputStream.java:141)
		at java.io.BufferedInputStream.fill(BufferedInputStream.java:246)
		at java.io.BufferedInputStream.read1(BufferedInputStream.java:286)
		at java.io.BufferedInputStream.read(BufferedInputStream.java:345)
		at org.apache.thrift.transport.TIOStreamTransport.read(TIOStreamTransport.java:127)
		at alluxio.network.thrift.PeekableTransport.read(PeekableTransport.java:63)
		at org.apache.thrift.transport.TTransport.readAll(TTransport.java:86)
		at org.apache.thrift.transport.TSaslTransport.readLength(TSaslTransport.java:376)
		at org.apache.thrift.transport.TSaslTransport.readFrame(TSaslTransport.java:453)
		at org.apache.thrift.transport.TSaslTransport.read(TSaslTransport.java:435)
		at org.apache.thrift.transport.TSaslServerTransport.read(TSaslServerTransport.java:41)
		at alluxio.network.thrift.BootstrapServerTransport.read(BootstrapServerTransport.java:98)
		at org.apache.thrift.transport.TTransport.readAll(TTransport.java:86)
		at org.apache.thrift.protocol.TBinaryProtocol.readAll(TBinaryProtocol.java:429)
		at org.apache.thrift.protocol.TBinaryProtocol.readI32(TBinaryProtocol.java:318)
		at org.apache.thrift.protocol.TBinaryProtocol.readMessageBegin(TBinaryProtocol.java:219)
		at org.apache.thrift.TMultiplexedProcessor.process(TMultiplexedProcessor.java:92)
		at org.apache.thrift.server.TThreadPoolServer$WorkerProcess.run(TThreadPoolServer.java:286)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Worker Space Reserver (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.time.ThreadSleeper.sleep(ThreadSleeper.java:26)
		at alluxio.heartbeat.SleepingTimer.tick(SleepingTimer.java:81)
		at alluxio.heartbeat.HeartbeatThread.run(HeartbeatThread.java:73)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp702061917-85-acceptor-0@78f920b2-ServerConnector@26a9b5ec{HTTP/1.1}{192.168.44.90:54215} (State: RUNNABLE):
		at sun.nio.ch.ServerSocketChannelImpl.accept0(Native Method)
		at sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:422)
		at sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:250)
		at org.eclipse.jetty.server.ServerConnector.accept(ServerConnector.java:377)
		at org.eclipse.jetty.server.AbstractConnector$Acceptor.run(AbstractConnector.java:500)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Master Lost Worker Detection (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.time.ThreadSleeper.sleep(ThreadSleeper.java:26)
		at alluxio.heartbeat.SleepingTimer.tick(SleepingTimer.java:81)
		at alluxio.heartbeat.HeartbeatThread.run(HeartbeatThread.java:73)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread block-worker-heartbeat-3 (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.util.CommonUtils.sleepMs(CommonUtils.java:189)
		at alluxio.worker.SessionCleaner.run(SessionCleaner.java:71)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Master Lost Master Detection (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.time.ThreadSleeper.sleep(ThreadSleeper.java:26)
		at alluxio.heartbeat.SleepingTimer.tick(SleepingTimer.java:81)
		at alluxio.heartbeat.HeartbeatThread.run(HeartbeatThread.java:73)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Master Block Integrity Check (State: TIMED_WAITING):
		at java.lang.Thread.sleep(Native Method)
		at alluxio.time.ThreadSleeper.sleep(ThreadSleeper.java:26)
		at alluxio.heartbeat.SleepingTimer.tick(SleepingTimer.java:81)
		at alluxio.heartbeat.HeartbeatThread.run(HeartbeatThread.java:73)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread socket-closer-thread (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
		at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
		at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Scheduler-2034170482 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
		at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
		at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp2012814077-104 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:389)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:531)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.access$700(QueuedThreadPool.java:47)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:590)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread pool-14-thread-6 (State: RUNNABLE):
		at java.net.SocketInputStream.socketRead0(Native Method)
		at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
		at java.net.SocketInputStream.read(SocketInputStream.java:171)
		at java.net.SocketInputStream.read(SocketInputStream.java:141)
		at java.io.BufferedInputStream.fill(BufferedInputStream.java:246)
		at java.io.BufferedInputStream.read1(BufferedInputStream.java:286)
		at java.io.BufferedInputStream.read(BufferedInputStream.java:345)
		at org.apache.thrift.transport.TIOStreamTransport.read(TIOStreamTransport.java:127)
		at alluxio.network.thrift.PeekableTransport.read(PeekableTransport.java:63)
		at org.apache.thrift.transport.TTransport.readAll(TTransport.java:86)
		at org.apache.thrift.transport.TSaslTransport.readLength(TSaslTransport.java:376)
		at org.apache.thrift.transport.TSaslTransport.readFrame(TSaslTransport.java:453)
		at org.apache.thrift.transport.TSaslTransport.read(TSaslTransport.java:435)
		at org.apache.thrift.transport.TSaslServerTransport.read(TSaslServerTransport.java:41)
		at alluxio.network.thrift.BootstrapServerTransport.read(BootstrapServerTransport.java:98)
		at org.apache.thrift.transport.TTransport.readAll(TTransport.java:86)
		at org.apache.thrift.protocol.TBinaryProtocol.readAll(TBinaryProtocol.java:429)
		at org.apache.thrift.protocol.TBinaryProtocol.readI32(TBinaryProtocol.java:318)
		at org.apache.thrift.protocol.TBinaryProtocol.readMessageBegin(TBinaryProtocol.java:219)
		at org.apache.thrift.TMultiplexedProcessor.process(TMultiplexedProcessor.java:92)
		at org.apache.thrift.server.TThreadPoolServer$WorkerProcess.run(TThreadPoolServer.java:286)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread pool-14-thread-5 (State: RUNNABLE):
		at java.net.SocketInputStream.socketRead0(Native Method)
		at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
		at java.net.SocketInputStream.read(SocketInputStream.java:171)
		at java.net.SocketInputStream.read(SocketInputStream.java:141)
		at java.io.BufferedInputStream.fill(BufferedInputStream.java:246)
		at java.io.BufferedInputStream.read1(BufferedInputStream.java:286)
		at java.io.BufferedInputStream.read(BufferedInputStream.java:345)
		at org.apache.thrift.transport.TIOStreamTransport.read(TIOStreamTransport.java:127)
		at alluxio.network.thrift.PeekableTransport.read(PeekableTransport.java:63)
		at org.apache.thrift.transport.TTransport.readAll(TTransport.java:86)
		at org.apache.thrift.transport.TSaslTransport.readLength(TSaslTransport.java:376)
		at org.apache.thrift.transport.TSaslTransport.readFrame(TSaslTransport.java:453)
		at org.apache.thrift.transport.TSaslTransport.read(TSaslTransport.java:435)
		at org.apache.thrift.transport.TSaslServerTransport.read(TSaslServerTransport.java:41)
		at alluxio.network.thrift.BootstrapServerTransport.read(BootstrapServerTransport.java:98)
		at org.apache.thrift.transport.TTransport.readAll(TTransport.java:86)
		at org.apache.thrift.protocol.TBinaryProtocol.readAll(TBinaryProtocol.java:429)
		at org.apache.thrift.protocol.TBinaryProtocol.readI32(TBinaryProtocol.java:318)
		at org.apache.thrift.protocol.TBinaryProtocol.readMessageBegin(TBinaryProtocol.java:219)
		at org.apache.thrift.TMultiplexedProcessor.process(TMultiplexedProcessor.java:92)
		at org.apache.thrift.server.TThreadPoolServer$WorkerProcess.run(TThreadPoolServer.java:286)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread pool-14-thread-1 (State: RUNNABLE):
		at java.net.SocketInputStream.socketRead0(Native Method)
		at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
		at java.net.SocketInputStream.read(SocketInputStream.java:171)
		at java.net.SocketInputStream.read(SocketInputStream.java:141)
		at java.io.BufferedInputStream.fill(BufferedInputStream.java:246)
		at java.io.BufferedInputStream.read1(BufferedInputStream.java:286)
		at java.io.BufferedInputStream.read(BufferedInputStream.java:345)
		at org.apache.thrift.transport.TIOStreamTransport.read(TIOStreamTransport.java:127)
		at alluxio.network.thrift.PeekableTransport.read(PeekableTransport.java:63)
		at org.apache.thrift.transport.TTransport.readAll(TTransport.java:86)
		at org.apache.thrift.transport.TSaslTransport.readLength(TSaslTransport.java:376)
		at org.apache.thrift.transport.TSaslTransport.readFrame(TSaslTransport.java:453)
		at org.apache.thrift.transport.TSaslTransport.read(TSaslTransport.java:435)
		at org.apache.thrift.transport.TSaslServerTransport.read(TSaslServerTransport.java:41)
		at alluxio.network.thrift.BootstrapServerTransport.read(BootstrapServerTransport.java:98)
		at org.apache.thrift.transport.TTransport.readAll(TTransport.java:86)
		at org.apache.thrift.protocol.TBinaryProtocol.readAll(TBinaryProtocol.java:429)
		at org.apache.thrift.protocol.TBinaryProtocol.readI32(TBinaryProtocol.java:318)
		at org.apache.thrift.protocol.TBinaryProtocol.readMessageBegin(TBinaryProtocol.java:219)
		at org.apache.thrift.TMultiplexedProcessor.process(TMultiplexedProcessor.java:92)
		at org.apache.thrift.server.TThreadPoolServer$WorkerProcess.run(TThreadPoolServer.java:286)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread data-server-tcp-socket-boss-0 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at io.netty.channel.nio.NioEventLoop.select(NioEventLoop.java:747)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:392)
		at io.netty.util.concurrent.SingleThreadEventExecutor$2.run(SingleThreadEventExecutor.java:131)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread qtp851766649-37-selector-ServerConnectorManager@bb9d40d/0 (State: RUNNABLE):
		at sun.nio.ch.KQueueArrayWrapper.kevent0(Native Method)
		at sun.nio.ch.KQueueArrayWrapper.poll(KQueueArrayWrapper.java:198)
		at sun.nio.ch.KQueueSelectorImpl.doSelect(KQueueSelectorImpl.java:117)
		at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
		at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:601)
		at org.eclipse.jetty.io.SelectorManager$ManagedSelector.run(SelectorManager.java:550)
		at org.eclipse.jetty.util.thread.NonBlockingThread.run(NonBlockingThread.java:52)
		at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
		at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread UfsJournalGarbageCollector-0 (State: TIMED_WAITING):
		at sun.misc.Unsafe.park(Native Method)
		at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
		at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
		at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
		at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
		at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	java.lang.Throwable: Stack trace for thread Reference Handler (State: WAITING):
		at java.lang.Object.wait(Native Method)
		at java.lang.Object.wait(Object.java:502)
		at java.lang.ref.Reference.tryHandlePending(Reference.java:191)
		at java.lang.ref.Reference$ReferenceHandler.run(Reference.java:153)
	
	2019-01-08 19:39:26 WARN  SleepingTimer:78 - Worker Pin List Sync last execution took 17 ms. Longer than the interval 15
	
	Process finished with exit code 130 (interrupted by signal 2: SIGINT)


## Analysis

alluxio.PropertyKey#WEB_RESOURCES
alluxio.PropertyKey#WEB_FILE_INFO_ENABLED

But alluxio.PropertyKey#WEB_FILE_INFO_ENABLED can't set as false