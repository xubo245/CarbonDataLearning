Example: Run CarbonData with Spark-shell
## 1.prepare 
develop environment
spark-shell
CarbonData jar

##version:
 - maven 3.3.9
 - spark 2.2
 - carbon 1.6.0-SNAPSHOT
 - Java 1.8
## 2.start spark-shell

	 ./bin/spark-shell --jars /Users/xubo/Desktop/xubo/git/carbondata1/assembly/target/scala-2.11/apache-carbondata-1.6.0-SNAPSHOT-bin-spark2.2.1-hadoop2.7.2.jar

## 3.run sql
	import org.apache.spark.sql.CarbonSession._
	import org.apache.spark.sql.SparkSession
	
	val carbon = SparkSession.builder().master("local").appName("test").getOrCreateCarbonSession("/Users/xubo/Desktop/xubo/git/carbondata1/examples/spark2/target", "/Users/xubo/Desktop/xubo/git/carbondata1/examples/spark2/target");
	      
	CREATE TABLE test_carbon(id String,name String, city String,age Int) STORED as carbondata;
	
	LOAD DATA LOCAL INPATH '/Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-common-test/src/test/resources/sample.csv' into table test_carbon；
	
	carbon.sql("select * from test_carbon").show
	
##4. History

	localhost:spark xubo$ ./bin/spark-shell --jars /Users/xubo/Desktop/xubo/git/carbondata1/assembly/target/scala-2.11/apache-carbondata-1.6.0-SNAPSHOT-bin-spark2.2.1-hadoop2.7.2.jar
	Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
	Setting default log level to "WARN".
	To adjust logging level use sc.setLogLevel(newLevel). For SparkR, use setLogLevel(newLevel).
	18/11/21 11:29:05 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
	18/11/21 11:29:05 WARN Utils: Your hostname, localhost resolves to a loopback address: 127.0.0.1; using 192.168.44.90 instead (on interface en3)
	18/11/21 11:29:05 WARN Utils: Set SPARK_LOCAL_IP if you need to bind to another address
	Spark context Web UI available at http://192.168.44.90:4040
	Spark context available as 'sc' (master = local[*], app id = local-1542770946736).
	Spark session available as 'spark'.
	Welcome to
	      ____              __
	     / __/__  ___ _____/ /__
	    _\ \/ _ \/ _ `/ __/  '_/
	   /___/ .__/\_,_/_/ /_/\_\   version 2.2.1
	      /_/
	         
	Using Scala version 2.11.8 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_171)
	Type in expressions to have them evaluated.
	Type :help for more information.
		
	scala>  import org.apache.spark.sql.CarbonSession._
	import org.apache.spark.sql.CarbonSession._
	
	scala> import org.apache.spark.sql.SparkSession
	import org.apache.spark.sql.SparkSession
	scala> val carbon = SparkSession.builder().master("local").appName("test").getOrCreateCarbonSession("/Users/xubo/Desktop/xubo/git/carbondata1/examples/spark2/target", "/Users/xubo/Desktop/xubo/git/carbondata1/examples/spark2/target");
	18/11/21 11:35:14 WARN SparkContext: Using an existing SparkContext; some configuration may not take effect.
	18/11/21 11:35:14 WARN CarbonProperties: The enable unsafe sort value "null" is invalid. Using the default value "true
	18/11/21 11:35:14 WARN CarbonProperties: The enable off heap sort value "null" is invalid. Using the default value "true
	18/11/21 11:35:14 WARN CarbonProperties: The custom block distribution value "null" is invalid. Using the default value "false
	18/11/21 11:35:14 WARN CarbonProperties: The enable vector reader value "null" is invalid. Using the default value "true
	18/11/21 11:35:14 WARN CarbonProperties: The carbon task distribution value "null" is invalid. Using the default value "block
	18/11/21 11:35:14 WARN CarbonProperties: The enable auto handoff value "null" is invalid. Using the default value "true
	18/11/21 11:35:14 WARN CarbonProperties: The specified value for property 512is invalid.
	18/11/21 11:35:14 WARN CarbonProperties: The specified value for property carbon.sort.storage.inmemory.size.inmbis invalid. Taking the default value.512
	18/11/21 11:35:18 WARN ObjectStore: Failed to get database global_temp, returning NoSuchObjectException
	carbon: org.apache.spark.sql.SparkSession = org.apache.spark.sql.CarbonSession@4bd5321e
		
	scala> carbon.sql("CREATE TABLE test_carbon(id String,name String, city String,age Int) STORED as carbondata");
	18/11/21 11:38:07 AUDIT audit: {"time":"November 21, 2018 11:38:07 AM CST","username":"xubo","opName":"CREATE TABLE","opId":"315639221674236","opStatus":"START"}
	18/11/21 11:38:08 WARN HiveExternalCatalog: Couldn't find corresponding Hive SerDe for data source provider org.apache.spark.sql.CarbonSource. Persisting data source table `default`.`test_carbon` into Hive metastore in Spark SQL specific format, which is NOT compatible with Hive.
	18/11/21 11:38:08 AUDIT audit: {"time":"November 21, 2018 11:38:08 AM CST","username":"xubo","opName":"CREATE TABLE","opId":"315639221674236","opStatus":"SUCCESS","opTime":"1056 ms","table":"default.test_carbon","extraInfo":{"bad_record_path":"","local_dictionary_enable":"true","external":"false","sort_columns":"id,name,city","comment":""}}
	res4: org.apache.spark.sql.DataFrame = []
	
	scala> carbon.sql("LOAD DATA LOCAL INPATH '/Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-common-test/src/test/resources/sample.csv' into table test_carbon");
	18/11/21 11:45:28 AUDIT audit: {"time":"November 21, 2018 11:45:28 AM CST","username":"xubo","opName":"LOAD DATA","opId":"316080298787828","opStatus":"START"}
	18/11/21 11:45:29 WARN UnsafeIntermediateMerger: the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	18/11/21 11:45:29 WARN UnsafeMemoryManager: It is not recommended to set offheap working memory size less than 512MB, so setting default value to 512
	18/11/21 11:45:29 WARN CarbonDataProcessorUtil: dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//carbon316081472667152_0/Fact/Part0/Segment_0/0
	18/11/21 11:45:30 AUDIT audit: {"time":"November 21, 2018 11:45:30 AM CST","username":"xubo","opName":"LOAD DATA","opId":"316080298787828","opStatus":"SUCCESS","opTime":"1781 ms","table":"default.test_carbon","extraInfo":{"SegmentId":"0","DataSize":"1.25KB","IndexSize":"676.0B"}}
	res5: org.apache.spark.sql.DataFrame = []
	
	scala> carbon.sql("select * from test_carbon").show;
	18/11/21 11:47:37 WARN AbstractQueryExecutor: Skipping Direct Vector Filling as it is not Supported for Legacy store prior to V3 store
	+---+------+---------+---+
	| id|  name|     city|age|
	+---+------+---------+---+
	|  1| david| shenzhen| 31|
	|  2| eason| shenzhen| 27|
	|  3| jarry|Bangalore| 35|
	|  3| jarry|    wuhan| 35|
	|  4| kunal|    Delhi| 26|
	|  4|vishal|Bangalore| 29|
	+---+------+---------+---+
