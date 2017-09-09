


##问题1.Invalid bad records location.

	/david/xubo/CarbonDataLearning/src/main/resources/datasample.csv
	Exception in thread "main" java.lang.RuntimeException: Invalid bad records location.
		at scala.sys.package$.error(package.scala:27)
		at org.apache.spark.sql.execution.command.LoadTable.processData(carbonTableSchema.scala:546)
		at org.apache.spark.sql.execution.command.LoadTable.run(carbonTableSchema.scala:476)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult$lzycompute(commands.scala:58)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult(commands.scala:56)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.doExecute(commands.scala:74)
		at org.apache.spark.sql.execution.SparkPlan$$anonfun$execute$1.apply(SparkPlan.scala:114)
		at org.apache.spark.sql.execution.SparkPlan$$anonfun$execute$1.apply(SparkPlan.scala:114)
		at org.apache.spark.sql.execution.SparkPlan$$anonfun$executeQuery$1.apply(SparkPlan.scala:135)
		at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:151)
		at org.apache.spark.sql.execution.SparkPlan.executeQuery(SparkPlan.scala:132)
		at org.apache.spark.sql.execution.SparkPlan.execute(SparkPlan.scala:113)
		at org.apache.spark.sql.execution.QueryExecution.toRdd$lzycompute(QueryExecution.scala:87)
		at org.apache.spark.sql.execution.QueryExecution.toRdd(QueryExecution.scala:87)
		at org.apache.spark.sql.Dataset.<init>(Dataset.scala:185)
		at org.apache.spark.sql.Dataset$.ofRows(Dataset.scala:64)
		at org.apache.spark.sql.SparkSession.sql(SparkSession.scala:592)
		at com.github.xubo245.carbonDataLearning.dataManagement.DML.LoadDataWithBadRecords$.main(LoadDataWithBadRecords.scala:48)
		at com.github.xubo245.carbonDataLearning.dataManagement.DML.LoadDataWithBadRecords.main(LoadDataWithBadRecords.scala)

##解决办法：

    CarbonProperties.getInstance()
      .addProperty(CarbonCommonConstants.CARBON_BADRECORDS_LOC,
        new File("./target/test/badRecords")
          .getCanonicalPath)

##2.问题2


	17/08/12 10:58:01 AUDIT CreateTable: [SZX1000323521][root][Thread-1]Table created with Database name [default] and Table name [sales]
	/david/xubo/CarbonDataLearning/src/main/resources/datasample.csv
	17/08/12 10:58:02 AUDIT CarbonDataRDDFactory$: [SZX1000323521][root][Thread-1]Data load request has been received for table default.sales
	17/08/12 10:58:02 ERROR DataLoadExecutor: [Executor task launch worker-0][partitionID:default_sales_a59471fd-ae74-479e-8eb5-39a26ade480e] Data Load is partially success for table sales
	17/08/12 10:58:02 AUDIT CarbonDataRDDFactory$: [SZX1000323521][root][Thread-1]Data load is failed for default.sales as there is no data to load
	17/08/12 10:58:02 ERROR LoadTable: main 
	java.lang.Exception: No Data to load
		at org.apache.carbondata.spark.rdd.CarbonDataRDDFactory$.loadCarbonData(CarbonDataRDDFactory.scala:906)
		at org.apache.spark.sql.execution.command.LoadTable.processData(carbonTableSchema.scala:754)
		at org.apache.spark.sql.execution.command.LoadTable.run(carbonTableSchema.scala:476)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult$lzycompute(commands.scala:58)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult(commands.scala:56)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.doExecute(commands.scala:74)
		at org.apache.spark.sql.execution.SparkPlan$$anonfun$execute$1.apply(SparkPlan.scala:114)
		at org.apache.spark.sql.execution.SparkPlan$$anonfun$execute$1.apply(SparkPlan.scala:114)
		at org.apache.spark.sql.execution.SparkPlan$$anonfun$executeQuery$1.apply(SparkPlan.scala:135)
		at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:151)
		at org.apache.spark.sql.execution.SparkPlan.executeQuery(SparkPlan.scala:132)
		at org.apache.spark.sql.execution.SparkPlan.execute(SparkPlan.scala:113)
		at org.apache.spark.sql.execution.QueryExecution.toRdd$lzycompute(QueryExecution.scala:87)
		at org.apache.spark.sql.execution.QueryExecution.toRdd(QueryExecution.scala:87)
		at org.apache.spark.sql.Dataset.<init>(Dataset.scala:185)
		at org.apache.spark.sql.Dataset$.ofRows(Dataset.scala:64)
		at org.apache.spark.sql.SparkSession.sql(SparkSession.scala:592)
		at com.github.xubo245.carbonDataLearning.dataManagement.DML.LoadDataWithBadRecords$.main(LoadDataWithBadRecords.scala:51)
		at com.github.xubo245.carbonDataLearning.dataManagement.DML.LoadDataWithBadRecords.main(LoadDataWithBadRecords.scala)
	17/08/12 10:58:02 AUDIT LoadTable: [SZX1000323521][root][Thread-1]Dataload failure for default.sales. Please check the logs
	Exception in thread "main" java.lang.Exception: No Data to load
		at org.apache.carbondata.spark.rdd.CarbonDataRDDFactory$.loadCarbonData(CarbonDataRDDFactory.scala:906)
		at org.apache.spark.sql.execution.command.LoadTable.processData(carbonTableSchema.scala:754)
		at org.apache.spark.sql.execution.command.LoadTable.run(carbonTableSchema.scala:476)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult$lzycompute(commands.scala:58)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.sideEffectResult(commands.scala:56)
		at org.apache.spark.sql.execution.command.ExecutedCommandExec.doExecute(commands.scala:74)
		at org.apache.spark.sql.execution.SparkPlan$$anonfun$execute$1.apply(SparkPlan.scala:114)
		at org.apache.spark.sql.execution.SparkPlan$$anonfun$execute$1.apply(SparkPlan.scala:114)
		at org.apache.spark.sql.execution.SparkPlan$$anonfun$executeQuery$1.apply(SparkPlan.scala:135)
		at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:151)
		at org.apache.spark.sql.execution.SparkPlan.executeQuery(SparkPlan.scala:132)
		at org.apache.spark.sql.execution.SparkPlan.execute(SparkPlan.scala:113)
		at org.apache.spark.sql.execution.QueryExecution.toRdd$lzycompute(QueryExecution.scala:87)
		at org.apache.spark.sql.execution.QueryExecution.toRdd(QueryExecution.scala:87)
		at org.apache.spark.sql.Dataset.<init>(Dataset.scala:185)
		at org.apache.spark.sql.Dataset$.ofRows(Dataset.scala:64)
		at org.apache.spark.sql.SparkSession.sql(SparkSession.scala:592)
		at com.github.xubo245.carbonDataLearning.dataManagement.DML.LoadDataWithBadRecords$.main(LoadDataWithBadRecords.scala:51)
		at com.github.xubo245.carbonDataLearning.dataManagement.DML.LoadDataWithBadRecords.main(LoadDataWithBadRecords.scala)


##问题分析：
###查看日志
	2015/7/23,china,10000,120000.45,3,140000.377----->The value with column name date and column data type TIMESTAMP is not a valid TIMESTAMP type.
	null,china,10001,120000.45,3,140000.377----->The value with column name date and column data type TIMESTAMP is not a valid TIMESTAMP type.
	2015/7/23,null,10003,120000.45,3,140000.377----->The value with column name date and column data type TIMESTAMP is not a valid TIMESTAMP type.
	2015/7/23,china,10004,120000.45ghf,3,140000.377----->The value with column name date and column data type TIMESTAMP is not a valid TIMESTAMP type.
	2015/7/23,china,10005,120000.45,3ghf,140000.377----->The value with column name date and column data type TIMESTAMP is not a valid TIMESTAMP type.
	2015/7/23,china,10006,120000.45,3,140000.377ghf----->The value with column name date and column data type TIMESTAMP is not a valid TIMESTAMP type.

##解决办法：

CarbonProperties.getInstance()
      .addProperty(CarbonCommonConstants.CARBON_TIMESTAMP_FORMAT, "yyyy/MM/dd")


##3.运行结果


	17/08/12 11:08:27 AUDIT CarbonDataRDDFactory$: [SZX1000323521][root][Thread-1]Data load is successful for default.sales
	+-----+--------------------+-------+------------+--------+----------+
	|   ID|                date|country|actual_price|Quantity|sold_price|
	+-----+--------------------+-------+------------+--------+----------+
	|10000|2015-07-23 00:00:...|  china|   120000.45|       3| 140000.38|
	|10003|2015-07-23 00:00:...|   null|   120000.45|       3| 140000.38|
	+-----+--------------------+-------+------------+--------+----------+
	
	+--------+
	|count(1)|
	+--------+
	|       2|
	+--------+

代码：

	package com.github.xubo245.carbonDataLearning.dataManagement.DML
	
	import java.io.File
	
	import org.apache.carbondata.core.constants.CarbonCommonConstants
	import org.apache.carbondata.core.util.CarbonProperties
	import org.apache.spark.sql.{Row, SparkSession}
	
	/**
	  * Created by root on 8/11/17.
	  */
	object LoadDataWithBadRecords {
	  def main(args: Array[String]): Unit = {
	    val rootPath = new File(this.getClass.getResource("/").getPath
	      + "../../").getCanonicalPath
	    val storeLocation = s"$rootPath/examples/spark2/target/store"
	    val warehouse = s"$rootPath/examples/spark2/target/warehouse"
	    val metastoredb = s"$rootPath/examples/spark2/target"
	
	    CarbonProperties.getInstance()
	      .addProperty(CarbonCommonConstants.CARBON_TIMESTAMP_FORMAT, "yyyy/MM/dd HH:mm:ss")
	      .addProperty(CarbonCommonConstants.CARBON_DATE_FORMAT, "yyyy/MM/dd")
	    //      .addProperty(CarbonCommonConstants.ENABLE_UNSAFE_COLUMN_PAGE_LOADING, "true")
	
	    import org.apache.spark.sql.CarbonSession._
	    val carbon = SparkSession
	      .builder()
	      .master("local")
	      .appName("CarbonSessionExample")
	      .config("spark.sql.warehouse.dir", warehouse)
	      .config("spark.driver.host", "localhost")
	      .getOrCreateCarbonSession(storeLocation, metastoredb)
	    carbon.sparkContext.setLogLevel("ERROR")
	    import carbon._
	
	    CarbonProperties.getInstance()
	      .addProperty(CarbonCommonConstants.CARBON_BADRECORDS_LOC,
	        new File("./target/test/badRecords")
	          .getCanonicalPath)
	
	    CarbonProperties.getInstance()
	      .addProperty(CarbonCommonConstants.CARBON_TIMESTAMP_FORMAT, "yyyy/MM/dd")
	
	    sql("drop table IF EXISTS sales")
	    sql(
	      """CREATE TABLE IF NOT EXISTS sales(ID BigInt, date Timestamp, country String,
	          actual_price Double, Quantity int, sold_price Decimal(19,2)) STORED BY 'carbondata'""")
	
	//    var csvFilePath = s"$resourcesPath/badrecords/datasample.csv"
	
	    val path = s"$rootPath/src/main/resources/datasample.csv"
	    println(path)
	    sql("LOAD DATA local inpath '" + path + "' INTO TABLE sales OPTIONS" +
	      "('bad_records_logger_enable'='true','bad_records_action'='redirect', 'DELIMITER'=" +
	      " ',', 'QUOTECHAR'= '\"')");
	    sql("select * from sales").show()
	    //      checkAnswer(
	    //      sql("select count(*) from sales"),
	    //      Seq(Row(2)
	    //      )
	    //    )
	    sql("select count(*) from sales").show()
	    //    sc.stop()
	    carbon.stop()
	
	  }
	
	}


数据文件：datasample.csv

	ID,date,country,actual_price,Quantity,sold_price
	10000,2015/7/23,china,120000.45,3,140000.377
	10001,null,china,120000.45,3,140000.377
	10003,2015/7/23,null,120000.45,3,140000.377
	10004,2015/7/23,china,120000.45ghf,3,140000.377
	10005,2015/7/23,china,120000.45,3ghf,140000.377
	10006,2015/7/23,china,120000.45,3,140000.377ghf
