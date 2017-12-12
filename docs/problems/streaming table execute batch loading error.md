	
	
		17/11/16 18:58:28 AUDIT DictionaryServer: [***][root][Thread-218]Dictionary Server started, Time spent 1 Listening on port 2040
		17/11/16 18:58:28 AUDIT DictionaryClient: [***][root][Thread-234]Starting client on 10.229.51.168 2040
		17/11/16 18:58:28 AUDIT DictionaryClient: [***][root][Thread-233]Starting client on 10.229.51.168 2040
		17/11/16 18:58:28 AUDIT DictionaryServerHandler: [***][root][Thread-220]Connected io.netty.channel.DefaultChannelHandlerContext@369fd475
		17/11/16 18:58:28 AUDIT DictionaryServerHandler: [***][root][Thread-220]Connected io.netty.channel.DefaultChannelHandlerContext@1e4468fb
		17/11/16 18:58:28 AUDIT DictionaryClientHandler: [***][root][Thread-235]Connected client io.netty.channel.DefaultChannelHandlerContext@67bbd10a
		17/11/16 18:58:28 AUDIT DictionaryClientHandler: [***][root][Thread-236]Connected client io.netty.channel.DefaultChannelHandlerContext@772ac754
		17/11/16 18:58:31 AUDIT IncrementalColumnDictionaryGenerator: [***][root][Thread-238]
		 columnName: city
		 columnId: 4ecfcea6-203f-4ee5-bf8c-a29751d1d4a7
		 new distinct values count: 101
		 create dictionary cache: 0
		 sort list, distinct and write: 1
		 write sort info: 1
		17/11/16 18:58:31 AUDIT TableDictionaryGenerator: [***][root][Thread-224]Total time taken to write dictionary file is: 3
		17/11/16 18:58:35 AUDIT DictionaryClient: [***][root][Thread-251]Starting client on 10.229.51.168 2040
		17/11/16 18:58:35 AUDIT DictionaryClient: [***][root][Thread-253]Starting client on 10.229.51.168 2040
		17/11/16 18:58:35 AUDIT DictionaryClientHandler: [***][root][Thread-252]Connected client io.netty.channel.DefaultChannelHandlerContext@517f9139
		17/11/16 18:58:35 AUDIT DictionaryServerHandler: [***][root][Thread-220]Connected io.netty.channel.DefaultChannelHandlerContext@3254e95f
		17/11/16 18:58:35 AUDIT DictionaryClientHandler: [***][root][Thread-254]Connected client io.netty.channel.DefaultChannelHandlerContext@7508a044
		17/11/16 18:58:35 AUDIT DictionaryServerHandler: [***][root][Thread-220]Connected io.netty.channel.DefaultChannelHandlerContext@2e93704b
		17/11/16 18:58:38 AUDIT IncrementalColumnDictionaryGenerator: [***][root][Thread-257]
		 columnName: city
		 columnId: 4ecfcea6-203f-4ee5-bf8c-a29751d1d4a7
		 new distinct values count: 200
		 create dictionary cache: 0
		 sort list, distinct and write: 2
		 write sort info: 3
		17/11/16 18:58:38 AUDIT TableDictionaryGenerator: [***][root][Thread-224]Total time taken to write dictionary file is: 7
		17/11/16 18:58:40 AUDIT DictionaryClient: [***][root][Thread-270]Starting client on 10.229.51.168 2040
		17/11/16 18:58:40 AUDIT DictionaryClient: [***][root][Thread-271]Starting client on 10.229.51.168 2040
		17/11/16 18:58:40 AUDIT DictionaryServerHandler: [***][root][Thread-220]Connected io.netty.channel.DefaultChannelHandlerContext@590e2d70
		17/11/16 18:58:40 AUDIT DictionaryClientHandler: [***][root][Thread-272]Connected client io.netty.channel.DefaultChannelHandlerContext@36eb21a
		17/11/16 18:58:40 AUDIT DictionaryClientHandler: [***][root][Thread-273]Connected client io.netty.channel.DefaultChannelHandlerContext@6837f9a0
		17/11/16 18:58:40 AUDIT DictionaryServerHandler: [***][root][Thread-220]Connected io.netty.channel.DefaultChannelHandlerContext@6791fe63
		17/11/16 18:58:43 AUDIT IncrementalColumnDictionaryGenerator: [***][root][Thread-276]
		 columnName: city
		 columnId: 4ecfcea6-203f-4ee5-bf8c-a29751d1d4a7
		 new distinct values count: 100
		 create dictionary cache: 0
		 sort list, distinct and write: 1
		 write sort info: 1
		17/11/16 18:58:43 AUDIT TableDictionaryGenerator: [***][root][Thread-224]Total time taken to write dictionary file is: 2
		17/11/16 18:58:45 AUDIT DictionaryClient: [***][root][Thread-290]Starting client on 10.229.51.168 2040
		17/11/16 18:58:45 AUDIT DictionaryClient: [***][root][Thread-289]Starting client on 10.229.51.168 2040
		17/11/16 18:58:45 AUDIT DictionaryClientHandler: [***][root][Thread-291]Connected client io.netty.channel.DefaultChannelHandlerContext@6f6a94c4
		17/11/16 18:58:45 AUDIT DictionaryClientHandler: [***][root][Thread-292]Connected client io.netty.channel.DefaultChannelHandlerContext@7a1dbaaf
		17/11/16 18:58:45 AUDIT DictionaryServerHandler: [***][root][Thread-220]Connected io.netty.channel.DefaultChannelHandlerContext@3aa96c0
		17/11/16 18:58:45 AUDIT DictionaryServerHandler: [***][root][Thread-220]Connected io.netty.channel.DefaultChannelHandlerContext@29a73757
		17/11/16 18:58:48 ERROR CarbonAppendableStreamSink$: stream execution thread for [id = cfbbe0e6-6ceb-42b6-9fda-07425f312b3b, runId = d836087b-5cf2-46a7-9025-5e497c328279] Aborting job job_20171116185845_0003.
		java.lang.InterruptedException
			at java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:998)
			at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
			at scala.concurrent.impl.Promise$DefaultPromise.tryAwait(Promise.scala:202)
			at scala.concurrent.impl.Promise$DefaultPromise.ready(Promise.scala:218)
			at scala.concurrent.impl.Promise$DefaultPromise.ready(Promise.scala:153)
			at org.apache.spark.scheduler.DAGScheduler.runJob(DAGScheduler.scala:619)
			at org.apache.spark.SparkContext.runJob(SparkContext.scala:1918)
			at org.apache.spark.SparkContext.runJob(SparkContext.scala:1931)
			at org.apache.spark.SparkContext.runJob(SparkContext.scala:1951)
			at org.apache.spark.sql.execution.streaming.CarbonAppendableStreamSink$$anonfun$writeDataFileJob$1.apply$mcV$sp(CarbonAppendableStreamSink.scala:190)
			at org.apache.spark.sql.execution.streaming.CarbonAppendableStreamSink$$anonfun$writeDataFileJob$1.apply(CarbonAppendableStreamSink.scala:180)
			at org.apache.spark.sql.execution.streaming.CarbonAppendableStreamSink$$anonfun$writeDataFileJob$1.apply(CarbonAppendableStreamSink.scala:180)
			at org.apache.spark.sql.execution.SQLExecution$.withNewExecutionId(SQLExecution.scala:57)
			at org.apache.spark.sql.execution.streaming.CarbonAppendableStreamSink$.writeDataFileJob(CarbonAppendableStreamSink.scala:180)
			at org.apache.spark.sql.execution.streaming.CarbonAppendableStreamSink.addBatch(CarbonAppendableStreamSink.scala:100)
			at org.apache.spark.sql.execution.streaming.StreamExecution$$anonfun$org$apache$spark$sql$execution$streaming$StreamExecution$$runBatch$1.apply$mcV$sp(StreamExecution.scala:503)
			at org.apache.spark.sql.execution.streaming.StreamExecution$$anonfun$org$apache$spark$sql$execution$streaming$StreamExecution$$runBatch$1.apply(StreamExecution.scala:503)
			at org.apache.spark.sql.execution.streaming.StreamExecution$$anonfun$org$apache$spark$sql$execution$streaming$StreamExecution$$runBatch$1.apply(StreamExecution.scala:503)
			at org.apache.spark.sql.execution.streaming.ProgressReporter$class.reportTimeTaken(ProgressReporter.scala:262)
			at org.apache.spark.sql.execution.streaming.StreamExecution.reportTimeTaken(StreamExecution.scala:46)
			at org.apache.spark.sql.execution.streaming.StreamExecution.org$apache$spark$sql$execution$streaming$StreamExecution$$runBatch(StreamExecution.scala:502)
			at org.apache.spark.sql.execution.streaming.StreamExecution$$anonfun$org$apache$spark$sql$execution$streaming$StreamExecution$$runBatches$1$$anonfun$1.apply$mcV$sp(StreamExecution.scala:255)
			at org.apache.spark.sql.execution.streaming.StreamExecution$$anonfun$org$apache$spark$sql$execution$streaming$StreamExecution$$runBatches$1$$anonfun$1.apply(StreamExecution.scala:244)
			at org.apache.spark.sql.execution.streaming.StreamExecution$$anonfun$org$apache$spark$sql$execution$streaming$StreamExecution$$runBatches$1$$anonfun$1.apply(StreamExecution.scala:244)
			at org.apache.spark.sql.execution.streaming.ProgressReporter$class.reportTimeTaken(ProgressReporter.scala:262)
			at org.apache.spark.sql.execution.streaming.StreamExecution.reportTimeTaken(StreamExecution.scala:46)
			at org.apache.spark.sql.execution.streaming.StreamExecution$$anonfun$org$apache$spark$sql$execution$streaming$StreamExecution$$runBatches$1.apply$mcZ$sp(StreamExecution.scala:244)
			at org.apache.spark.sql.execution.streaming.ProcessingTimeExecutor.execute(TriggerExecutor.scala:43)
			at org.apache.spark.sql.execution.streaming.StreamExecution.org$apache$spark$sql$execution$streaming$StreamExecution$$runBatches(StreamExecution.scala:239)
			at org.apache.spark.sql.execution.streaming.StreamExecution$$anon$1.run(StreamExecution.scala:177)
		17/11/16 18:58:48 ERROR StreamExecution: Query [id = cfbbe0e6-6ceb-42b6-9fda-07425f312b3b, runId = d836087b-5cf2-46a7-9025-5e497c328279] terminated with error
		org.apache.carbondata.streaming.CarbonStreamException: Job failed to write data file
			at org.apache.spark.sql.execution.streaming.CarbonAppendableStreamSink$$anonfun$writeDataFileJob$1.apply$mcV$sp(CarbonAppendableStreamSink.scala:228)
			at org.apache.spark.sql.execution.streaming.CarbonAppendableStreamSink$$anonfun$writeDataFileJob$1.apply(CarbonAppendableStreamSink.scala:180)
			at org.apache.spark.sql.execution.streaming.CarbonAppendableStreamSink$$anonfun$writeDataFileJob$1.apply(CarbonAppendableStreamSink.scala:180)
			at org.apache.spark.sql.execution.SQLExecution$.withNewExecutionId(SQLExecution.scala:57)
			at org.apache.spark.sql.execution.streaming.CarbonAppendableStreamSink$.writeDataFileJob(CarbonAppendableStreamSink.scala:180)
			at org.apache.spark.sql.execution.streaming.CarbonAppendableStreamSink.addBatch(CarbonAppendableStreamSink.scala:100)
			at org.apache.spark.sql.execution.streaming.StreamExecution$$anonfun$org$apache$spark$sql$execution$streaming$StreamExecution$$runBatch$1.apply$mcV$sp(StreamExecution.scala:503)
			at org.apache.spark.sql.execution.streaming.StreamExecution$$anonfun$org$apache$spark$sql$execution$streaming$StreamExecution$$runBatch$1.apply(StreamExecution.scala:503)
			at org.apache.spark.sql.execution.streaming.StreamExecution$$anonfun$org$apache$spark$sql$execution$streaming$StreamExecution$$runBatch$1.apply(StreamExecution.scala:503)
			at org.apache.spark.sql.execution.streaming.ProgressReporter$class.reportTimeTaken(ProgressReporter.scala:262)
			at org.apache.spark.sql.execution.streaming.StreamExecution.reportTimeTaken(StreamExecution.scala:46)
			at org.apache.spark.sql.execution.streaming.StreamExecution.org$apache$spark$sql$execution$streaming$StreamExecution$$runBatch(StreamExecution.scala:502)
			at org.apache.spark.sql.execution.streaming.StreamExecution$$anonfun$org$apache$spark$sql$execution$streaming$StreamExecution$$runBatches$1$$anonfun$1.apply$mcV$sp(StreamExecution.scala:255)
			at org.apache.spark.sql.execution.streaming.StreamExecution$$anonfun$org$apache$spark$sql$execution$streaming$StreamExecution$$runBatches$1$$anonfun$1.apply(StreamExecution.scala:244)
			at org.apache.spark.sql.execution.streaming.StreamExecution$$anonfun$org$apache$spark$sql$execution$streaming$StreamExecution$$runBatches$1$$anonfun$1.apply(StreamExecution.scala:244)
			at org.apache.spark.sql.execution.streaming.ProgressReporter$class.reportTimeTaken(ProgressReporter.scala:262)
			at org.apache.spark.sql.execution.streaming.StreamExecution.reportTimeTaken(StreamExecution.scala:46)
			at org.apache.spark.sql.execution.streaming.StreamExecution$$anonfun$org$apache$spark$sql$execution$streaming$StreamExecution$$runBatches$1.apply$mcZ$sp(StreamExecution.scala:244)
			at org.apache.spark.sql.execution.streaming.ProcessingTimeExecutor.execute(TriggerExecutor.scala:43)
			at org.apache.spark.sql.execution.streaming.StreamExecution.org$apache$spark$sql$execution$streaming$StreamExecution$$runBatches(StreamExecution.scala:239)
			at org.apache.spark.sql.execution.streaming.StreamExecution$$anon$1.run(StreamExecution.scala:177)
		Caused by: java.lang.InterruptedException
			at java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:998)
			at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
			at scala.concurrent.impl.Promise$DefaultPromise.tryAwait(Promise.scala:202)
			at scala.concurrent.impl.Promise$DefaultPromise.ready(Promise.scala:218)
			at scala.concurrent.impl.Promise$DefaultPromise.ready(Promise.scala:153)
			at org.apache.spark.scheduler.DAGScheduler.runJob(DAGScheduler.scala:619)
			at org.apache.spark.SparkContext.runJob(SparkContext.scala:1918)
			at org.apache.spark.SparkContext.runJob(SparkContext.scala:1931)
			at org.apache.spark.SparkContext.runJob(SparkContext.scala:1951)
			at org.apache.spark.sql.execution.streaming.CarbonAppendableStreamSink$$anonfun$writeDataFileJob$1.apply$mcV$sp(CarbonAppendableStreamSink.scala:190)
			... 20 more
		Exception in thread "Thread-27" java.lang.Exception
			at org.apache.spark.carbondata.TestStreamingTableOperation$$anon$2.run(TestStreamingTableOperation.scala:716)
		
		
		Results do not match for query:
		== Parsed Logical Plan ==
		'Project [unresolvedalias('count(1), None)]
		+- 'UnresolvedRelation `streaming`.`stream_table_batch`
		
		== Analyzed Logical Plan ==
		count(1): bigint
		Aggregate [count(1) AS count(1)#683L]
		+- SubqueryAlias stream_table_batch
		   +- Relation[id#609,name#610,city#611,salary#612] CarbonDatasourceHadoopRelation [ Database name :streaming, Table name :stream_table_batch, Schema :Some(StructType(StructField(id,IntegerType,true), StructField(name,StringType,true), StructField(city,StringType,true), StructField(salary,DoubleType,true))) ]
		
		== Optimized Logical Plan ==
		CarbonDictionaryCatalystDecoder [CarbonDecoderRelation(Map(id#609 -> id#609, name#610 -> name#610, city#611 -> city#611, salary#612 -> salary#612),CarbonDatasourceHadoopRelation [ Database name :streaming, Table name :stream_table_batch, Schema :Some(StructType(StructField(id,IntegerType,true), StructField(name,StringType,true), StructField(city,StringType,true), StructField(salary,DoubleType,true))) ])], ExcludeProfile(ArrayBuffer()), CarbonAliasDecoderRelation(), true
		+- Aggregate [count(1) AS count(1)#683L]
		   +- Project
		      +- Relation[id#609,name#610,city#611,salary#612] CarbonDatasourceHadoopRelation [ Database name :streaming, Table name :stream_table_batch, Schema :Some(StructType(StructField(id,IntegerType,true), StructField(name,StringType,true), StructField(city,StringType,true), StructField(salary,DoubleType,true))) ]
		
		== Physical Plan ==
		*HashAggregate(keys=[], functions=[count(1)], output=[count(1)#683L])
		+- Exchange SinglePartition
		   +- *HashAggregate(keys=[], functions=[partial_count(1)], output=[count#690L])
		      +- *BatchedScan CarbonDatasourceHadoopRelation [ Database name :streaming, Table name :stream_table_batch, Schema :Some(StructType(StructField(id,IntegerType,true), StructField(name,StringType,true), StructField(city,StringType,true), StructField(salary,DoubleType,true))) ] streaming.stream_table_batch[]
		== Results ==
		!== Correct Answer - 1 ==   == Spark Answer - 1 ==
		![500]                      [400]
		      
		ScalaTestFailureLocation: org.apache.spark.sql.test.util.QueryTest at (QueryTest.scala:87)
		org.scalatest.exceptions.TestFailedException: 
		Results do not match for query:
		== Parsed Logical Plan ==
		'Project [unresolvedalias('count(1), None)]
		+- 'UnresolvedRelation `streaming`.`stream_table_batch`
		
		== Analyzed Logical Plan ==
		count(1): bigint
		Aggregate [count(1) AS count(1)#683L]
		+- SubqueryAlias stream_table_batch
		   +- Relation[id#609,name#610,city#611,salary#612] CarbonDatasourceHadoopRelation [ Database name :streaming, Table name :stream_table_batch, Schema :Some(StructType(StructField(id,IntegerType,true), StructField(name,StringType,true), StructField(city,StringType,true), StructField(salary,DoubleType,true))) ]
		
		== Optimized Logical Plan ==
		CarbonDictionaryCatalystDecoder [CarbonDecoderRelation(Map(id#609 -> id#609, name#610 -> name#610, city#611 -> city#611, salary#612 -> salary#612),CarbonDatasourceHadoopRelation [ Database name :streaming, Table name :stream_table_batch, Schema :Some(StructType(StructField(id,IntegerType,true), StructField(name,StringType,true), StructField(city,StringType,true), StructField(salary,DoubleType,true))) ])], ExcludeProfile(ArrayBuffer()), CarbonAliasDecoderRelation(), true
		+- Aggregate [count(1) AS count(1)#683L]
		   +- Project
		      +- Relation[id#609,name#610,city#611,salary#612] CarbonDatasourceHadoopRelation [ Database name :streaming, Table name :stream_table_batch, Schema :Some(StructType(StructField(id,IntegerType,true), StructField(name,StringType,true), StructField(city,StringType,true), StructField(salary,DoubleType,true))) ]
		
		== Physical Plan ==
		*HashAggregate(keys=[], functions=[count(1)], output=[count(1)#683L])
		+- Exchange SinglePartition
		   +- *HashAggregate(keys=[], functions=[partial_count(1)], output=[count#690L])
		      +- *BatchedScan CarbonDatasourceHadoopRelation [ Database name :streaming, Table name :stream_table_batch, Schema :Some(StructType(StructField(id,IntegerType,true), StructField(name,StringType,true), StructField(city,StringType,true), StructField(salary,DoubleType,true))) ] streaming.stream_table_batch[]
		== Results ==
		!== Correct Answer - 1 ==   == Spark Answer - 1 ==
		![500]                      [400]
		      
			at org.scalatest.Assertions$class.newAssertionFailedException(Assertions.scala:495)
			at org.scalatest.FunSuite.newAssertionFailedException(FunSuite.scala:1555)
			at org.scalatest.Assertions$class.fail(Assertions.scala:1328)
			at org.scalatest.FunSuite.fail(FunSuite.scala:1555)
			at org.apache.spark.sql.test.util.QueryTest.checkAnswer(QueryTest.scala:87)
			at org.apache.spark.carbondata.TestStreamingTableOperation$$anonfun$11.apply$mcV$sp(TestStreamingTableOperation.scala:342)
			at org.apache.spark.carbondata.TestStreamingTableOperation$$anonfun$11.apply(TestStreamingTableOperation.scala:331)
			at org.apache.spark.carbondata.TestStreamingTableOperation$$anonfun$11.apply(TestStreamingTableOperation.scala:331)
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
			at org.apache.spark.carbondata.TestStreamingTableOperation.org$scalatest$BeforeAndAfterAll$$super$run(TestStreamingTableOperation.scala:41)
			at org.scalatest.BeforeAndAfterAll$class.liftedTree1$1(BeforeAndAfterAll.scala:257)
			at org.scalatest.BeforeAndAfterAll$class.run(BeforeAndAfterAll.scala:256)
			at org.apache.spark.carbondata.TestStreamingTableOperation.run(TestStreamingTableOperation.scala:41)
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
		
	
	
第二次：
	
	Testing started at 11:05 AM ...
	log4j:WARN No appenders could be found for logger (org.apache.spark.sql.test.TestQueryExecutor$).
	log4j:WARN Please initialize the log4j system properly.
	log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
	Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
	17/11/16 19:05:37 INFO SparkContext: Running Spark version 2.1.0
	17/11/16 19:05:37 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
	17/11/16 19:05:37 WARN Utils: Your hostname, *** resolves to a loopback address: 127.0.0.1; using 10.229.51.168 instead (on interface eth0)
	17/11/16 19:05:37 WARN Utils: Set SPARK_LOCAL_IP if you need to bind to another address
	17/11/16 19:05:37 INFO SecurityManager: Changing view acls to: root
	17/11/16 19:05:37 INFO SecurityManager: Changing modify acls to: root
	17/11/16 19:05:37 INFO SecurityManager: Changing view acls groups to: 
	17/11/16 19:05:37 INFO SecurityManager: Changing modify acls groups to: 
	17/11/16 19:05:37 INFO SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(root); groups with view permissions: Set(); users  with modify permissions: Set(root); groups with modify permissions: Set()
	17/11/16 19:05:38 INFO Utils: Successfully started service 'sparkDriver' on port 57078.
	17/11/16 19:05:38 INFO SparkEnv: Registering MapOutputTracker
	17/11/16 19:05:38 INFO SparkEnv: Registering BlockManagerMaster
	17/11/16 19:05:38 INFO BlockManagerMasterEndpoint: Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
	17/11/16 19:05:38 INFO BlockManagerMasterEndpoint: BlockManagerMasterEndpoint up
	17/11/16 19:05:38 INFO DiskBlockManager: Created local directory at /tmp/blockmgr-ec506853-bdd4-4be3-9067-dcd286eba69f
	17/11/16 19:05:38 INFO MemoryStore: MemoryStore started with capacity 867.6 MB
	17/11/16 19:05:38 INFO SparkEnv: Registering OutputCommitCoordinator
	17/11/16 19:05:38 WARN Utils: Service 'SparkUI' could not bind on port 4040. Attempting port 4041.
	17/11/16 19:05:38 WARN Utils: Service 'SparkUI' could not bind on port 4041. Attempting port 4042.
	17/11/16 19:05:38 INFO Utils: Successfully started service 'SparkUI' on port 4042.
	17/11/16 19:05:38 INFO SparkUI: Bound SparkUI to 0.0.0.0, and started at http://10.229.51.168:4042
	17/11/16 19:05:38 INFO Executor: Starting executor ID driver on host localhost
	17/11/16 19:05:38 INFO Utils: Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 51832.
	17/11/16 19:05:38 INFO NettyBlockTransferService: Server created on 10.229.51.168:51832
	17/11/16 19:05:38 INFO BlockManager: Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
	17/11/16 19:05:38 INFO BlockManagerMaster: Registering BlockManager BlockManagerId(driver, 10.229.51.168, 51832, None)
	17/11/16 19:05:38 INFO BlockManagerMasterEndpoint: Registering block manager 10.229.51.168:51832 with 867.6 MB RAM, BlockManagerId(driver, 10.229.51.168, 51832, None)
	17/11/16 19:05:38 INFO BlockManagerMaster: Registered BlockManager BlockManagerId(driver, 10.229.51.168, 51832, None)
	17/11/16 19:05:38 INFO BlockManager: Initialized BlockManager: BlockManagerId(driver, 10.229.51.168, 51832, None)
	17/11/16 19:05:38 INFO SharedState: Warehouse path is '/***/xubo/git/carbondata/integration/spark-common/target/warehouse'.
	17/11/16 19:05:38 INFO HiveUtils: Initializing HiveMetastoreConnection version 1.2.1 using Spark classes.
	17/11/16 19:05:39 INFO HiveMetaStore: 0: Opening raw store with implemenation class:org.apache.hadoop.hive.metastore.ObjectStore
	17/11/16 19:05:39 INFO ObjectStore: ObjectStore, initialize called
	17/11/16 19:05:39 INFO Persistence: Property hive.metastore.integral.jdo.pushdown unknown - will be ignored
	17/11/16 19:05:39 INFO Persistence: Property datanucleus.cache.level2 unknown - will be ignored
	17/11/16 19:05:40 INFO ObjectStore: Setting MetaStore object pin classes with hive.metastore.cache.pinobjtypes="Table,StorageDescriptor,SerDeInfo,Partition,Database,Type,FieldSchema,Order"
	17/11/16 19:05:41 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	17/11/16 19:05:41 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	17/11/16 19:05:41 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	17/11/16 19:05:41 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	17/11/16 19:05:42 INFO Query: Reading in results for query "org.datanucleus.store.rdbms.query.SQLQuery@0" since the connection used is closing
	17/11/16 19:05:42 INFO MetaStoreDirectSql: Using direct SQL, underlying DB is DERBY
	17/11/16 19:05:42 INFO ObjectStore: Initialized ObjectStore
	17/11/16 19:05:42 INFO HiveMetaStore: Added admin role in metastore
	17/11/16 19:05:42 INFO HiveMetaStore: Added public role in metastore
	17/11/16 19:05:42 INFO HiveMetaStore: No user is added in admin role, since config is empty
	17/11/16 19:05:42 INFO HiveMetaStore: 0: get_all_databases
	17/11/16 19:05:42 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_all_databases	
	17/11/16 19:05:42 INFO HiveMetaStore: 0: get_functions: db=carbondb pat=*
	17/11/16 19:05:42 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_functions: db=carbondb pat=*	
	17/11/16 19:05:42 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MResourceUri" is tagged as "embedded-only" so does not have its own datastore table.
	17/11/16 19:05:42 INFO HiveMetaStore: 0: get_functions: db=default pat=*
	17/11/16 19:05:42 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_functions: db=default pat=*	
	17/11/16 19:05:42 INFO SessionState: Created local directory: /tmp/55773d66-ad05-4f7d-a5c1-5a36b5095288_resources
	17/11/16 19:05:42 INFO SessionState: Created HDFS directory: /tmp/hive/root/55773d66-ad05-4f7d-a5c1-5a36b5095288
	17/11/16 19:05:42 INFO SessionState: Created local directory: /tmp/root/55773d66-ad05-4f7d-a5c1-5a36b5095288
	17/11/16 19:05:42 INFO SessionState: Created HDFS directory: /tmp/hive/root/55773d66-ad05-4f7d-a5c1-5a36b5095288/_tmp_space.db
	17/11/16 19:05:42 INFO HiveClientImpl: Warehouse location for Hive client (version 1.2.1) is /***/xubo/git/carbondata/integration/spark-common/target/warehouse
	17/11/16 19:05:42 INFO HiveMetaStore: 0: get_database: default
	17/11/16 19:05:42 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_database: default	
	17/11/16 19:05:42 INFO HiveMetaStore: 0: get_database: global_temp
	17/11/16 19:05:42 INFO audit: ugi=root	ip=unknown-ip-addr	cmd=get_database: global_temp	
	17/11/16 19:05:42 WARN ObjectStore: Failed to get database global_temp, returning NoSuchObjectException
	17/11/16 19:05:42 INFO StateStoreCoordinatorRef: Registered StateStoreCoordinator endpoint
	17/11/16 19:05:44 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [source]
	17/11/16 19:05:44 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [source]
	17/11/16 19:05:45 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.source
	17/11/16 19:05:45 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.source
	17/11/16 19:05:46 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [batch_table]
	17/11/16 19:05:46 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [batch_table]
	17/11/16 19:05:47 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.batch_table
	17/11/16 19:05:47 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.batch_table
	17/11/16 19:05:47 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [stream_table_socket]
	17/11/16 19:05:47 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [stream_table_socket]
	17/11/16 19:05:47 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.stream_table_socket
	17/11/16 19:05:47 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.stream_table_socket
	17/11/16 19:05:47 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [stream_table_file]
	17/11/16 19:05:47 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [stream_table_file]
	17/11/16 19:05:47 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.stream_table_file
	17/11/16 19:05:47 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.stream_table_file
	17/11/16 19:05:47 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [bad_record_force]
	17/11/16 19:05:47 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [bad_record_force]
	17/11/16 19:05:47 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.bad_record_force
	17/11/16 19:05:47 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.bad_record_force
	17/11/16 19:05:47 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [bad_record_fail]
	17/11/16 19:05:47 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [bad_record_fail]
	17/11/16 19:05:48 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.bad_record_fail
	17/11/16 19:05:48 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.bad_record_fail
	17/11/16 19:05:48 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [stream_table_1s]
	17/11/16 19:05:48 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [stream_table_1s]
	17/11/16 19:05:48 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.stream_table_1s
	17/11/16 19:05:48 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.stream_table_1s
	17/11/16 19:05:48 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [stream_table_10s]
	17/11/16 19:05:48 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [stream_table_10s]
	17/11/16 19:05:48 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.stream_table_10s
	17/11/16 19:05:48 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.stream_table_10s
	17/11/16 19:05:48 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [stream_table_batch]
	17/11/16 19:05:48 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [stream_table_batch]
	17/11/16 19:05:48 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [stream_table_scan]
	17/11/16 19:05:48 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [stream_table_scan]
	17/11/16 19:05:48 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.stream_table_scan
	17/11/16 19:05:48 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.stream_table_scan
	17/11/16 19:05:48 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [stream_table_scan_complex]
	17/11/16 19:05:49 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [stream_table_scan_complex]
	17/11/16 19:05:49 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.stream_table_scan_complex
	17/11/16 19:05:49 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.stream_table_scan_complex
	17/11/16 19:05:49 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [stream_table_filter]
	17/11/16 19:05:49 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [stream_table_filter]
	17/11/16 19:05:49 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.stream_table_filter
	17/11/16 19:05:49 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.stream_table_filter
	17/11/16 19:05:49 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [stream_table_filter_complex]
	17/11/16 19:05:49 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [stream_table_filter_complex]
	17/11/16 19:05:49 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.stream_table_filter_complex
	17/11/16 19:05:49 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.stream_table_filter_complex
	17/11/16 19:05:49 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [stream_table_agg]
	17/11/16 19:05:49 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [stream_table_agg]
	17/11/16 19:05:49 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.stream_table_agg
	17/11/16 19:05:49 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.stream_table_agg
	17/11/16 19:05:49 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [stream_table_agg_complex]
	17/11/16 19:05:49 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [stream_table_agg_complex]
	17/11/16 19:05:49 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.stream_table_agg_complex
	17/11/16 19:05:50 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.stream_table_agg_complex
	17/11/16 19:05:50 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [stream_table_compact]
	17/11/16 19:05:50 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [stream_table_compact]
	17/11/16 19:05:50 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.stream_table_compact
	17/11/16 19:05:50 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.stream_table_compact
	17/11/16 19:05:50 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [stream_table_new]
	17/11/16 19:05:50 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [stream_table_new]
	17/11/16 19:05:50 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.stream_table_new
	17/11/16 19:05:50 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.stream_table_new
	17/11/16 19:05:50 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [stream_table_tolerant]
	17/11/16 19:05:50 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [stream_table_tolerant]
	17/11/16 19:05:50 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load request has been received for table streaming.stream_table_tolerant
	17/11/16 19:05:50 AUDIT CarbonDataRDDFactory$: [***][root][Thread-1]Data load is successful for streaming.stream_table_tolerant
	17/11/16 19:05:50 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Creating Table with Database name [streaming] and Table name [stream_table_delete]
	17/11/16 19:05:50 AUDIT CarbonCreateTableCommand: [***][root][Thread-1]Table created with Database name [streaming] and Table name [stream_table_delete]
	
	Address already in use (Bind failed)
	java.net.BindException: Address already in use (Bind failed)
		at java.net.PlainSocketImpl.socketBind(Native Method)
		at java.net.AbstractPlainSocketImpl.bind(AbstractPlainSocketImpl.java:387)
		at java.net.ServerSocket.bind(ServerSocket.java:375)
		at java.net.ServerSocket.<init>(ServerSocket.java:237)
		at java.net.ServerSocket.<init>(ServerSocket.java:128)
		at org.apache.spark.carbondata.TestStreamingTableOperation.executeStreamingIngest(TestStreamingTableOperation.scala:746)
		at org.apache.spark.carbondata.TestStreamingTableOperation$$anonfun$11.apply$mcV$sp(TestStreamingTableOperation.scala:332)
		at org.apache.spark.carbondata.TestStreamingTableOperation$$anonfun$11.apply(TestStreamingTableOperation.scala:331)
		at org.apache.spark.carbondata.TestStreamingTableOperation$$anonfun$11.apply(TestStreamingTableOperation.scala:331)
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
		at org.apache.spark.carbondata.TestStreamingTableOperation.org$scalatest$BeforeAndAfterAll$$super$run(TestStreamingTableOperation.scala:41)
		at org.scalatest.BeforeAndAfterAll$class.liftedTree1$1(BeforeAndAfterAll.scala:257)
		at org.scalatest.BeforeAndAfterAll$class.run(BeforeAndAfterAll.scala:256)
		at org.apache.spark.carbondata.TestStreamingTableOperation.run(TestStreamingTableOperation.scala:41)
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
	
	17/11/16 19:05:50 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [batch_table] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [batch_table] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [stream_table_socket] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [stream_table_socket] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [stream_table_file] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [stream_table_file] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [bad_record_force] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [bad_record_force] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [bad_record_fail] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [bad_record_fail] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [stream_table_1s] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [stream_table_1s] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [stream_table_10s] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [stream_table_10s] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [stream_table_batch] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [stream_table_batch] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [stream_table_scan] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [stream_table_scan] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [stream_table_scan_complex] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [stream_table_scan_complex] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [stream_table_filter] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [stream_table_filter] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [stream_table_filter_complex] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [stream_table_filter_complex] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [stream_table_agg] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [stream_table_agg] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [stream_table_agg_complex] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [stream_table_agg_complex] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [stream_table_compact] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [stream_table_compact] under database [streaming]
	17/11/16 19:05:51 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [stream_table_new] under database [streaming]
	17/11/16 19:05:52 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [stream_table_new] under database [streaming]
	17/11/16 19:05:52 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [stream_table_tolerant] under database [streaming]
	17/11/16 19:05:52 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [stream_table_tolerant] under database [streaming]
	17/11/16 19:05:52 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [stream_table_delete] under database [streaming]
	17/11/16 19:05:52 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [stream_table_delete] under database [streaming]
	17/11/16 19:05:52 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleting table [source] under database [streaming]
	17/11/16 19:05:52 AUDIT CarbonDropTableCommand: [***][root][Thread-1]Deleted table [source] under database [streaming]
	
	Process finished with exit code 0
