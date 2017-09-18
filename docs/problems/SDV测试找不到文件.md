SDV测试找不到文件
	
	- Batch_sort_Querying_001-01-01-01_001-TC_001 *** FAILED ***
	  org.apache.carbondata.processing.etl.DataLoadingException: The input file does not exist: file:////david/xubo/git/carbondata/integration/spark-common-test/src/test/resources/Data/uniqdata/7000_UniqData.csv
	  at org.apache.spark.util.FileUtils$$anonfun$getPaths$1.apply$mcVI$sp(FileUtils.scala:66)
	  at scala.collection.immutable.Range.foreach$mVc$sp(Range.scala:160)
	  at org.apache.spark.util.FileUtils$.getPaths(FileUtils.scala:62)
	  at org.apache.spark.sql.execution.command.LoadTable.processData(carbonTableSchema.scala:647)
	  at org.apache.spark.sql.execution.command.LoadTable.run(carbonTableSchema.scala:614)
	  at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult$lzycompute(commands.scala:58)
	  at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult(commands.scala:56)
	  at org.apache.spark.sql.execution.command.ExecutedCommandExec.doExecute(commands.scala:74)
	  at org.apache.spark.sql.execution.SparkPlan$$anonfun$execute$1.apply(SparkPlan.scala:114)
	  at org.apache.spark.sql.execution.SparkPlan$$anonfun$execute$1.apply(SparkPlan.scala:114)