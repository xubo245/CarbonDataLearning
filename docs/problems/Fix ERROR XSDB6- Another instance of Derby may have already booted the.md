## Error:

	Caused by: java.sql.SQLException: Failed to start database '/Users/xubo/Desktop/xubo/git/carbondata2/examples/spark2/target/metaStore_db2/metastore_db' with class loader org.apache.spark.sql.hive.client.IsolatedClientLoader$$anon$1@1967c032, see the next exception for details.
		at org.apache.derby.impl.jdbc.SQLExceptionFactory.getSQLException(Unknown Source)
		at org.apache.derby.impl.jdbc.SQLExceptionFactory.getSQLException(Unknown Source)
		at org.apache.derby.impl.jdbc.Util.seeNextException(Unknown Source)
		at org.apache.derby.impl.jdbc.EmbedConnection.bootDatabase(Unknown Source)
		at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		at org.apache.derby.jdbc.InternalDriver$1.run(Unknown Source)
		at org.apache.derby.jdbc.InternalDriver$1.run(Unknown Source)
		at java.security.AccessController.doPrivileged(Native Method)
		at org.apache.derby.jdbc.InternalDriver.getNewEmbedConnection(Unknown Source)
		at org.apache.derby.jdbc.InternalDriver.connect(Unknown Source)
		at org.apache.derby.jdbc.InternalDriver.connect(Unknown Source)
		at org.apache.derby.jdbc.AutoloadedDriver.connect(Unknown Source)
		at java.sql.DriverManager.getConnection(DriverManager.java:664)
		at java.sql.DriverManager.getConnection(DriverManager.java:208)
		at com.jolbox.bonecp.BoneCP.obtainRawInternalConnection(BoneCP.java:361)
		at com.jolbox.bonecp.BoneCP.<init>(BoneCP.java:416)
		... 93 more
	Caused by: ERROR XJ040: Failed to start database '/Users/xubo/Desktop/xubo/git/carbondata2/examples/spark2/target/metaStore_db2/metastore_db' with class loader org.apache.spark.sql.hive.client.IsolatedClientLoader$$anon$1@1967c032, see the next exception for details.
		at org.apache.derby.iapi.error.StandardException.newException(Unknown Source)
		at org.apache.derby.impl.jdbc.SQLExceptionFactory.wrapArgsForTransportAcrossDRDA(Unknown Source)
		... 109 more
	Caused by: ERROR XSDB6: Another instance of Derby may have already booted the database /Users/xubo/Desktop/xubo/git/carbondata2/examples/spark2/target/metaStore_db2/metastore_db.
		at org.apache.derby.iapi.error.StandardException.newException(Unknown Source)
		at org.apache.derby.iapi.error.StandardException.newException(Unknown Source)
		at org.apache.derby.impl.store.raw.data.BaseDataFileFactory.privGetJBMSLockOnDB(Unknown Source)
		at org.apache.derby.impl.store.raw.data.BaseDataFileFactory.run(Unknown Source)
		at java.security.AccessController.doPrivileged(Native Method)
		at org.apache.derby.impl.store.raw.data.BaseDataFileFactory.getJBMSLockOnDB(Unknown Source)
		at org.apache.derby.impl.store.raw.data.BaseDataFileFactory.boot(Unknown Source)
		at org.apache.derby.impl.services.monitor.BaseMonitor.boot(Unknown Source)
		at org.apache.derby.impl.services.monitor.TopService.bootModule(Unknown Source)
		at org.apache.derby.impl.services.monitor.BaseMonitor.startModule(Unknown Source)
		at org.apache.derby.impl.services.monitor.FileMonitor.startModule(Unknown Source)
		at org.apache.derby.iapi.services.monitor.Monitor.bootServiceModule(Unknown Source)
		at org.apache.derby.impl.store.raw.RawStore$6.run(Unknown Source)
		at java.security.AccessController.doPrivileged(Native Method)
		at org.apache.derby.impl.store.raw.RawStore.bootServiceModule(Unknown Source)
		at org.apache.derby.impl.store.raw.RawStore.boot(Unknown Source)
		at org.apache.derby.impl.services.monitor.BaseMonitor.boot(Unknown Source)
		at org.apache.derby.impl.services.monitor.TopService.bootModule(Unknown Source)
		at org.apache.derby.impl.services.monitor.BaseMonitor.startModule(Unknown Source)
		at org.apache.derby.impl.services.monitor.FileMonitor.startModule(Unknown Source)
		at org.apache.derby.iapi.services.monitor.Monitor.bootServiceModule(Unknown Source)
		at org.apache.derby.impl.store.access.RAMAccessManager$5.run(Unknown Source)
		at java.security.AccessController.doPrivileged(Native Method)
		at org.apache.derby.impl.store.access.RAMAccessManager.bootServiceModule(Unknown Source)
		at org.apache.derby.impl.store.access.RAMAccessManager.boot(Unknown Source)
		at org.apache.derby.impl.services.monitor.BaseMonitor.boot(Unknown Source)
		at org.apache.derby.impl.services.monitor.TopService.bootModule(Unknown Source)
		at org.apache.derby.impl.services.monitor.BaseMonitor.startModule(Unknown Source)
		at org.apache.derby.impl.services.monitor.FileMonitor.startModule(Unknown Source)
		at org.apache.derby.iapi.services.monitor.Monitor.bootServiceModule(Unknown Source)
		at org.apache.derby.impl.db.BasicDatabase$5.run(Unknown Source)
		at java.security.AccessController.doPrivileged(Native Method)
		at org.apache.derby.impl.db.BasicDatabase.bootServiceModule(Unknown Source)
		at org.apache.derby.impl.db.BasicDatabase.bootStore(Unknown Source)
		at org.apache.derby.impl.db.BasicDatabase.boot(Unknown Source)
		at org.apache.derby.impl.services.monitor.BaseMonitor.boot(Unknown Source)
		at org.apache.derby.impl.services.monitor.TopService.bootModule(Unknown Source)
		at org.apache.derby.impl.services.monitor.BaseMonitor.bootService(Unknown Source)
		at org.apache.derby.impl.services.monitor.BaseMonitor.startProviderService(Unknown Source)
		at org.apache.derby.impl.services.monitor.BaseMonitor.findProviderAndStartService(Unknown Source)
		at org.apache.derby.impl.services.monitor.BaseMonitor.startPersistentService(Unknown Source)
		at org.apache.derby.iapi.services.monitor.Monitor.startPersistentService(Unknown Source)
		at org.apache.derby.impl.jdbc.EmbedConnection$4.run(Unknown Source)
		at org.apache.derby.impl.jdbc.EmbedConnection$4.run(Unknown Source)
		at java.security.AccessController.doPrivileged(Native Method)
		at org.apache.derby.impl.jdbc.EmbedConnection.startPersistentService(Unknown Source)
		... 106 more
	Exception in thread "main" java.lang.reflect.InvocationTargetException
		at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
		at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
		at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
		at java.lang.reflect.Method.invoke(Method.java:498)
		at org.apache.spark.util.CarbonReflectionUtils$.getSessionState(CarbonReflectionUtils.scala:220)
		at org.apache.spark.sql.CarbonSession.sessionState$lzycompute(CarbonSession.scala:57)
		at org.apache.spark.sql.CarbonSession.sessionState(CarbonSession.scala:56)
		at org.apache.spark.sql.CarbonSession$CarbonBuilder$$anonfun$getOrCreateCarbonSession$2.apply(CarbonSession.scala:259)
		at org.apache.spark.sql.CarbonSession$CarbonBuilder$$anonfun$getOrCreateCarbonSession$2.apply(CarbonSession.scala:259)
		at scala.collection.mutable.HashMap$$anonfun$foreach$1.apply(HashMap.scala:99)
		at scala.collection.mutable.HashMap$$anonfun$foreach$1.apply(HashMap.scala:99)
		at scala.collection.mutable.HashTable$class.foreachEntry(HashTable.scala:230)
		at scala.collection.mutable.HashMap.foreachEntry(HashMap.scala:40)
		at scala.collection.mutable.HashMap.foreach(HashMap.scala:99)
		at org.apache.spark.sql.CarbonSession$CarbonBuilder.getOrCreateCarbonSession(CarbonSession.scala:259)
		at org.apache.carbondata.examples.DataFrameSDKS3Example$.DataFrameToCarbonSession(DataFrameSDKS3Example.scala:159)
		at org.apache.carbondata.examples.DataFrameSDKS3Example$.read(DataFrameSDKS3Example.scala:82)
		at org.apache.carbondata.examples.DataFrameSDKS3Example$.main(DataFrameSDKS3Example.scala:63)
		at org.apache.carbondata.examples.DataFrameSDKS3Example.main(DataFrameSDKS3Example.scala)
	Caused by: org.apache.spark.sql.AnalysisException: java.lang.RuntimeException: java.lang.RuntimeException: Unable to instantiate org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient;
		at org.apache.spark.sql.hive.HiveExternalCatalog.withClient(HiveExternalCatalog.scala:106)
		at org.apache.spark.sql.hive.HiveExternalCatalog.databaseExists(HiveExternalCatalog.scala:194)
		at org.apache.spark.sql.internal.SharedState.externalCatalog$lzycompute(SharedState.scala:105)
		at org.apache.spark.sql.internal.SharedState.externalCatalog(SharedState.scala:93)
		at org.apache.spark.sql.hive.CarbonSessionStateBuilder.externalCatalog(CarbonSessionState.scala:232)
		at org.apache.spark.sql.hive.CarbonSessionStateBuilder.catalog$lzycompute(CarbonSessionState.scala:219)
		at org.apache.spark.sql.hive.CarbonSessionStateBuilder.catalog(CarbonSessionState.scala:217)
		at org.apache.spark.sql.hive.CarbonSessionStateBuilder.catalog(CarbonSessionState.scala:196)
		at org.apache.spark.sql.internal.BaseSessionStateBuilder.build(BaseSessionStateBuilder.scala:289)
		... 19 more
	Caused by: java.lang.RuntimeException: java.lang.RuntimeException: Unable to instantiate org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient
		at org.apache.hadoop.hive.ql.session.SessionState.start(SessionState.java:522)
		at org.apache.spark.sql.hive.client.HiveClientImpl.<init>(HiveClientImpl.scala:191)
		at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
		at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
		at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
		at org.apache.spark.sql.hive.client.IsolatedClientLoader.createClient(IsolatedClientLoader.scala:264)
		at org.apache.spark.sql.hive.HiveUtils$.newClientForMetadata(HiveUtils.scala:362)
		at org.apache.spark.sql.hive.HiveUtils$.newClientForMetadata(HiveUtils.scala:266)
		at org.apache.spark.sql.hive.HiveExternalCatalog.client$lzycompute(HiveExternalCatalog.scala:66)
		at org.apache.spark.sql.hive.HiveExternalCatalog.client(HiveExternalCatalog.scala:65)
		at org.apache.spark.sql.hive.HiveExternalCatalog$$anonfun$databaseExists$1.apply$mcZ$sp(HiveExternalCatalog.scala:195)
		at org.apache.spark.sql.hive.HiveExternalCatalog$$anonfun$databaseExists$1.apply(HiveExternalCatalog.scala:195)
		at org.apache.spark.sql.hive.HiveExternalCatalog$$anonfun$databaseExists$1.apply(HiveExternalCatalog.scala:195)
		at org.apache.spark.sql.hive.HiveExternalCatalog.withClient(HiveExternalCatalog.scala:97)
		... 27 more
	Caused by: java.lang.RuntimeException: Unable to instantiate org.apache.hadoop.hive.ql.metadata.SessionHiveMetaStoreClient
		at org.apache.hadoop.hive.metastore.MetaStoreUtils.newInstance(MetaStoreUtils.java:1523)
		at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.<init>(RetryingMetaStoreClient.java:86)
		at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:132)
		at org.apache.hadoop.hive.metastore.RetryingMetaStoreClient.getProxy(RetryingMetaStoreClient.java:104)
		at org.apache.hadoop.hive.ql.metadata.Hive.createMetaStoreClient(Hive.java:3005)
		at org.apache.hadoop.hive.ql.metadata.Hive.getMSC(Hive.java:3024)
		at org.apache.hadoop.hive.ql.session.SessionState.start(SessionState.java:503)
		... 41 more
	Caused by: java.lang.reflect.InvocationTargetException
		at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
		at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
		at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
		at org.apache.hadoop.hive.metastore.MetaStoreUtils.newInstance(MetaStoreUtils.java:1521)
		... 47 more
		
		
## Analysis

### code

	package org.apache.carbondata.examples
	
	import java.io.File
	
	import org.apache.commons.io.FileUtils
	import org.apache.hadoop.fs.s3a.Constants
	import org.apache.spark.sql.{DataFrame, Row, SaveMode, SparkSession}
	import org.apache.spark.sql.types._
	
	import org.apache.carbondata.common.logging.LogServiceFactory
	import org.apache.carbondata.core.datamap.DataMapStoreManager
	
	/**
	  * This example show DataFrame How to read/Write SDK data from/to S3
	  */
	object DataFrameSDKS3Example {
	
	  def main(args: Array[String]): Unit = {
	    if (args.length < 3) {
	      val LOGGER = LogServiceFactory.getLogService(classOf[DataMapStoreManager].getName)
	      LOGGER.error(
	        "Please input parameters: <access-key> <secret-key> <s3-endpoint> [table-path-on-s3]")
	      System.exit(0)
	    }
	    val rootPath = new File(this.getClass.getResource("/").getPath
	      + "../../../..").getCanonicalPath
	    val warehouse = s"$rootPath/examples/spark2/target/warehouse"
	
	    val sparkSession = SparkSession
	      .builder()
	      .master("local")
	      .appName("SparkSessionExample")
	      .config("spark.sql.warehouse.dir", warehouse)
	      .getOrCreate()
	
	    sparkSession.sparkContext.setLogLevel("ERROR")
	
	    val df = sparkSession.emptyDataFrame
	
	    var path = "s3a://xubo/sdk/DFTest"
	    if (args.length > 3) {
	      path = args(3)
	    }
	    write(df, path, args);
	    read(df, path, args);
	
	    sparkSession.stop()
	  }
	
	  def exampleBody(spark: SparkSession): Unit = {
	
	  }
	
	  /**
	    * inherit DataFrame from other place,
	    * it need create CarbonSession for read CarbonData from S3
	    *
	    * @param df   DataFrame, including SparkConf
	    * @param path read path
	    * @param args argument, including ak, sk, endpoint
	    */
	  def read(df: DataFrame, path: String, args: Array[String]): Unit = {
	    val carbonSession = DataFrameToCarbonSession(df, args, 3);
	
	    val result = carbonSession
	      .read
	      .format("carbon")
	      .load(path)
	    result.show()
	
	    carbonSession.stop()
	  }
	
	  /**
	    * inherit DataFrame from other place,
	    * it need create CarbonSession for write CarbonData to S3
	    *
	    * @param df   DataFrame, including SparkConf
	    * @param path write path
	    * @param args argument, including ak, sk, endpoint
	    */
	  def write(df: DataFrame, path: String, args: Array[String]): Unit = {
	    val carbonSession = DataFrameToCarbonSession(df, args, 4);
	
	    val rdd = carbonSession.sqlContext.sparkContext
	      .parallelize(1 to 1200, 4)
	      .map { x =>
	        ("city" + x % 8, "country" + x % 1103, "planet" + x % 10007, x.toString,
	          (x % 16).toShort, x / 2, (x << 1).toLong, x.toDouble / 13, x.toDouble / 11)
	      }.map { x =>
	      Row(x._1, x._2, x._3, x._4, x._5, x._6, x._7, x._8, x._9)
	    }
	
	    val schema = StructType(
	      Seq(
	        StructField("city", StringType, nullable = false),
	        StructField("country", StringType, nullable = false),
	        StructField("planet", StringType, nullable = false),
	        StructField("id", StringType, nullable = false),
	        StructField("m1", ShortType, nullable = false),
	        StructField("m2", IntegerType, nullable = false),
	        StructField("m3", LongType, nullable = false),
	        StructField("m4", DoubleType, nullable = false),
	        StructField("m5", DoubleType, nullable = false)
	      )
	    )
	
	    carbonSession.createDataFrame(rdd, schema)
	      .write
	      .format("carbon")
	      .mode(SaveMode.Append)
	      .save(path)
	
	    SparkSession.clearDefaultSession()
	    SparkSession.clearActiveSession()
	    carbonSession.stop()
	  }
	
	  def DataFrameToCarbonSession(df: DataFrame, args: Array[String], num: Int): SparkSession = {
	    import org.apache.spark.sql.CarbonSession._
	
	    val rootPath = new File(this.getClass.getResource("/").getPath
	      + "../../../..").getCanonicalPath
	    val storeLocation = s"$rootPath/examples/spark2/target/store" + num
	    val metaStoreDB = s"$rootPath/examples/spark2/target/metaStore_db" + num
	
	    if (true) {
	      val clean = (path: String) => FileUtils.deleteDirectory(new File(path))
	      clean(storeLocation)
	      clean(metaStoreDB)
	    }
	
	    SparkSession
	      .builder()
	      .master("local")
	      .appName("carbon")
	      .config(df.sparkSession.sparkContext.getConf)
	      .config("spark.sql.crossJoin.enabled", "true")
	      .config(Constants.ACCESS_KEY, args(0))
	      .config(Constants.SECRET_KEY, args(1))
	      .config(Constants.ENDPOINT, args(2))
	      .getOrCreateCarbonSession(storeLocation, metaStoreDB)
	  }
	}

### reason
   Because derby don't support more than one instance to access (don't support concurrent access)
    
## How to Fix 
  
  use JDBC: add it into carbonSession build
  
  
	      .config("javax.jdo.option.ConnectionURL",
	        s"jdbc:derby:;databaseName=$metaStoreDB;create=true")
	        
	
For example:

    SparkSession
      .builder()
      .master("local")
      .appName("carbon")
      .config(df.sparkSession.sparkContext.getConf)
      .config("spark.sql.crossJoin.enabled", "true")
      .config(Constants.ACCESS_KEY, args(0))
      .config(Constants.SECRET_KEY, args(1))
      .config(Constants.ENDPOINT, args(2))
      .config("javax.jdo.option.ConnectionURL",
        s"jdbc:derby:;databaseName=$metaStoreDB;create=true")
      .getOrCreateCarbonSession(storeLocation, metaStoreDB)
      
      
## Result
	
	2018-12-13 23:19:51 INFO  BlockManagerMaster:54 - Registering BlockManager BlockManagerId(driver, 192.168.3.124, 54506, None)
	2018-12-13 23:19:51 INFO  BlockManagerMasterEndpoint:54 - Registering block manager 192.168.3.124:54506 with 2004.6 MB RAM, BlockManagerId(driver, 192.168.3.124, 54506, None)
	2018-12-13 23:19:51 INFO  BlockManagerMaster:54 - Registered BlockManager BlockManagerId(driver, 192.168.3.124, 54506, None)
	2018-12-13 23:19:51 INFO  BlockManager:54 - Initialized BlockManager: BlockManagerId(driver, 192.168.3.124, 54506, None)
	2018-12-13 23:19:51 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@3961a41a{/metrics/json,null,AVAILABLE,@Spark}
	+-----+-----------+----------+----+---+---+----+-----------------+------------------+
	| city|    country|    planet|  id| m1| m2|  m3|               m4|                m5|
	+-----+-----------+----------+----+---+---+----+-----------------+------------------+
	|city0|   country1|planet1104|1104|  0|552|2208|84.92307692307692|100.36363636363636|
	|city0|country1000|planet1000|1000|  8|500|2000|76.92307692307692|  90.9090909090909|
	|city0|country1008|planet1008|1008|  0|504|2016|77.53846153846153| 91.63636363636364|
	|city0|country1016|planet1016|1016|  8|508|2032|78.15384615384616| 92.36363636363636|
	|city0|country1024|planet1024|1024|  0|512|2048|78.76923076923077|  93.0909090909091|
	|city0|country1032|planet1032|1032|  8|516|2064|79.38461538461539| 93.81818181818181|
	|city0|country1040|planet1040|1040|  0|520|2080|             80.0| 94.54545454545455|
	|city0|country1048|planet1048|1048|  8|524|2096|80.61538461538461| 95.27272727272727|
	|city0|country1056|planet1056|1056|  0|528|2112|81.23076923076923|              96.0|
	|city0|country1064|planet1064|1064|  8|532|2128|81.84615384615384| 96.72727272727273|
	|city0|country1072|planet1072|1072|  0|536|2144|82.46153846153847| 97.45454545454545|
	|city0|country1080|planet1080|1080|  8|540|2160|83.07692307692308| 98.18181818181819|
	|city0|country1088|planet1088|1088|  0|544|2176| 83.6923076923077|  98.9090909090909|
	|city0|country1096|planet1096|1096|  8|548|2192| 84.3076923076923| 99.63636363636364|
	|city0|  country17|planet1120|1120|  0|560|2240|86.15384615384616|101.81818181818181|
	|city0|  country25|planet1128|1128|  8|564|2256|86.76923076923077|102.54545454545455|
	|city0|  country33|planet1136|1136|  0|568|2272|87.38461538461539|103.27272727272727|
	|city0|  country41|planet1144|1144|  8|572|2288|             88.0|             104.0|
	|city0|  country49|planet1152|1152|  0|576|2304|88.61538461538461|104.72727272727273|
	|city0|  country57|planet1160|1160|  8|580|2320|89.23076923076923|105.45454545454545|
	+-----+-----------+----------+----+---+---+----+-----------------+------------------+
	only showing top 20 rows


## refer:

 - [1] [https://github.com/xubo245/CarbonDataLearning](https://github.com/xubo245/CarbonDataLearning)
 - [2]  [https://github.com/apache/carbondata](https://github.com/apache/carbondata). 
 - [3] [https://issues.apache.org/jira/browse/SPARK-9776](https://issues.apache.org/jira/browse/SPARK-9776)