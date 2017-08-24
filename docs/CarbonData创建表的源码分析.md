
CarbonData创建表的源码分析


##环境说明
	Spark-2.1.0  
	Carbon-1.2.0-SNAPSHOT  
	Scala-2.11.8  
	Java-1.8.0_131  

##运行代码
 	
	package com.github.xubo245.carbonDataLearning.dataManagement.DML
	
	import java.io.File
	
	import org.apache.carbondata.core.constants.CarbonCommonConstants
	import org.apache.carbondata.core.util.CarbonProperties
	import org.apache.spark.sql.SparkSession
	
	/**
	  * Created by root on 8/11/17.
	  */
	object CreateAnalysis {
	  def main(args: Array[String]): Unit = {
	    val rootPath = new File(this.getClass.getResource("/").getPath
	      + "../../").getCanonicalPath
	    val storeLocation = s"$rootPath/target/store"
	    val warehouse = s"$rootPath/target/warehouse"
	    val metastoredb = s"$rootPath/target"
	
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
	
	    sql("CREATE TABLE IF NOT EXISTS test_table(id string,name string,city string,age Int) STORED BY 'carbondata' ")
	    carbon.sql("SELECT * FROM test_table").show()
	    sql("DROP TABLE IF EXISTS test_table")
	    carbon.stop()
	  }
	}


## 源码分析
##Create table 
###1.初始化

　　在Spark2中，使用CarbonSession作为spark Sql接口的入口，CarbonSession扩展了SparkSession。
  
     val carbon = SparkSession
      .builder()
      .master("local")
      .appName("CarbonSessionExample")
      .config("spark.sql.warehouse.dir", warehouse)
      .config("spark.driver.host", "localhost")
      .getOrCreateCarbonSession(storeLocation, metastoredb)
    import carbon._

使用CarbonSparkSqlParser进行parser：

    override lazy val sqlParser: ParserInterface = new CarbonSparkSqlParser(conf, sparkSession)

sql执行入口：

	 def sql(sqlText: String): DataFrame = {
	    Dataset.ofRows(self, sessionState.sqlParser.parsePlan(sqlText))
	  }

parsePlan方法则对应的是：

	org.apache.spark.sql.parser.CarbonSparkSqlParser#parsePlan

###2.parsePlan方法
方法代码为：

	  override def parsePlan(sqlText: String): LogicalPlan = {
	    val carbonSessionInfo: CarbonSessionInfo = CarbonEnv.getInstance(sparkSession).carbonSessionInfo
	    ThreadLocalSessionInfo.setCarbonSessionInfo(carbonSessionInfo)
	    try {
	      super.parsePlan(sqlText)
	    } catch {
	      case ce: MalformedCarbonCommandException =>
	        throw ce
	      case ex =>
	        try {
	          astBuilder.parser.parse(sqlText)
	        } catch {
	          case mce: MalformedCarbonCommandException =>
	            throw mce
	          case e =>
	            sys
	              .error("\n" + "BaseSqlParser>>>> " + ex.getMessage + "\n" + "CarbonSqlParser>>>> " +
	                     e.getMessage)
	        }
	    }
	  }

先获取carbonSessionInfo，然后再调用父类的parsePlan执行（org.apache.spark.sql.catalyst.parser.AbstractSqlParser#parsePlan）：

	  /** Creates LogicalPlan for a given SQL string. */
	  override def parsePlan(sqlText: String): LogicalPlan = parse(sqlText) { parser =>
	    astBuilder.visitSingleStatement(parser.singleStatement()) match {
	      case plan: LogicalPlan => plan
	      case _ =>
	        val position = Origin(None, None)
	        throw new ParseException(Option(sqlText), "Unsupported SQL statement", position, position)
	    }
	  }


parse方法被子类重写的（org.apache.spark.sql.parser.CarbonSparkSqlParser#parse）：

	 protected override def parse[T](command: String)(toResult: SqlBaseParser => T): T = {
	    super.parse(substitutor.substitute(command))(toResult)
	  }

substitut方法（org.apache.spark.sql.internal.VariableSubstitution#substitute）：

	  /**
	   * Given a query, does variable substitution and return the result.
	   */
	  def substitute(input: String): String = {
	    if (conf.variableSubstituteEnabled) {
	      reader.substitute(input)
	    } else {
	      input
	    }
	  }

调用的是Spark sql 来进行parse：org.apache.spark.sql.catalyst.parser.AbstractSqlParser#parse，该步骤很长，有时间在进行详细阅读

经过整个parsePlan后会根据SQL string语句创建一个LogicalPlan


###3.调用ofRows方法

	  def ofRows(sparkSession: SparkSession, logicalPlan: LogicalPlan): DataFrame = {
	    val qe = sparkSession.sessionState.executePlan(logicalPlan)
	    qe.assertAnalyzed()
	    new Dataset[Row](sparkSession, qe, RowEncoder(qe.analyzed.schema))
	  }

executePlan方法会将LogicalPlan状变成QueryExecution对象：

	 def executePlan(plan: LogicalPlan): QueryExecution = new QueryExecution(sparkSession, plan)

相对应的类为Spark sql的：	

	org.apache.spark.sql.execution.QueryExecution#QueryExecution

然后再执行assertAnalyzed方法：

	org.apache.spark.sql.execution.QueryExecution#assertAnalyzed

会对LogicalPlan进行检查和分析：

	org.apache.spark.sql.catalyst.analysis.CheckAnalysis#checkAnalysis


![](http://img.blog.csdn.net/20140730111508515?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvb29wc29vbQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

然后会调用RowEncoder方法对行的分析过的Schema进行encode：

	org.apache.spark.sql.catalyst.encoders.RowEncoder

之后会进行execute：

	org.apache.spark.sql.execution.SparkPlan#execute
###4.CreateTable方法
#### process
执行的时候会调用TableNewProcessor类中的process方法进行execute（	org.apache.spark.sql.execution.command.TableNewProcessor#process）：
	
	case class CreateTable(cm: TableModel, createDSTable: Boolean = true) extends RunnableCommand
	    with SchemaProcessCommand {
	
	  def run(sparkSession: SparkSession): Seq[Row] = {
	    processSchema(sparkSession)
	  }


参数为org.apache.spark.sql.execution.command.TableModel

process先会分别对sortKeyDims（sort column）、dimCols（dimension Column）、msrCols进行操作  

- 在sortKeyDims是会执行getColumnSchema方法，获取columnSchema信息，该方法会调用format module里面的org.apache.carbondata.core.metadata.schema.table.column.ColumnSchema类，然后对columnSchema对象进行数据填充。  其中会通过org.apache.carbondata.core.service.CarbonCommonFactory#getColumnUniqueIdGenerator获取columnUniqueId。
- dimCols操作时会处理不在sortKeyDims的数据。  
- 会对msrCols列直接调用getColumnSchema进行处理。


process接着会

 - 在对列名进行校验，避免重复列名；
 - 对column group进行校验，更新column group等； 
 - 会使用org.apache.carbondata.spark.CarbonColumnValidator对列的UniqueId进行校验，判断是否有重复的，有则抛异常；
 - 新建TableSchema，使用UUID.randomUUID()产生TableId，设置setTableProperties、setBucketingInfo、setPartitionInfo、setTableName等信息；
 - 新建tableInfo，设置tableSchema、setTableUniqueName、setLastUpdatedTime等

####

获取table path：

 	val tableIdentifier = AbsoluteTableIdentifier.from(storePath, dbName, tbName)
      // Add Database to catalog and persist
      val catalog = CarbonEnv.getInstance(sparkSession).carbonMetastore
      val tablePath = tableIdentifier.getTablePath
      val carbonSchemaString = catalog.generateTableSchemaString(tableInfo, tablePath)

调用org.apache.spark.sql.hive.CarbonMetaStore#generateTableSchemaString获取CarbonTableSchema信息：

 	val catalog = CarbonEnv.getInstance(sparkSession).carbonMetastore
      val tablePath = tableIdentifier.getTablePath
      val carbonSchemaString = catalog.generateTableSchemaString(tableInfo, tablePath)

方法代码：

	  override def generateTableSchemaString(tableInfo: schema.table.TableInfo,
	      tablePath: String): String = {
	    val tableIdentifier = AbsoluteTableIdentifier.fromTablePath(tablePath)
	    val carbonTablePath = CarbonStorePath.getCarbonTablePath(tableIdentifier)
	    val schemaMetadataPath =
	      CarbonTablePath.getFolderContainingFile(carbonTablePath.getSchemaFilePath)
	    tableInfo.setMetaDataFilepath(schemaMetadataPath)
	    tableInfo.setStorePath(tableIdentifier.getStorePath)
	    val schemaEvolutionEntry = new schema.SchemaEvolutionEntry
	    schemaEvolutionEntry.setTimeStamp(tableInfo.getLastUpdatedTime)
	    tableInfo.getFactTable.getSchemaEvalution.getSchemaEvolutionEntryList.add(schemaEvolutionEntry)
	    removeTableFromMetadata(tableInfo.getDatabaseName, tableInfo.getFactTable.getTableName)
	    CarbonMetadata.getInstance().loadTableMetadata(tableInfo)
	    addTableCache(tableInfo, tableIdentifier)
	    CarbonUtil.convertToMultiGsonStrings(tableInfo, " ", "", ",")
	  }

再调用org.apache.carbondata.core.util.CarbonUtil#convertToMultiGsonStrings生成Gson string：

	  public static String convertToMultiGsonStrings(TableInfo tableInfo, String seperator,
	      String quote, String prefix) {
	    Gson gson = new Gson();
	    String schemaString = gson.toJson(tableInfo);
	    int schemaLen = schemaString.length();
	    int splitLen = 4000;
	    int parts = schemaLen / splitLen;
	    if (schemaLen % splitLen > 0) {
	      parts++;
	    }
	    StringBuilder builder =
	        new StringBuilder(prefix).append(quote).append("carbonSchemaPartsNo").append(quote)
	            .append(seperator).append("'").append(parts).append("',");
	    int runningLen = 0;
	    int endLen = splitLen;
	    for (int i = 0; i < parts; i++) {
	      if (i == parts - 1) {
	        endLen = schemaLen % splitLen;
	      }
	      builder.append(quote).append("carbonSchema").append(i).append(quote).append(seperator);
	      builder.append("'").append(schemaString.substring(runningLen, runningLen + endLen))
	          .append("'");
	      if (i < parts - 1) {
	        builder.append(",");
	      }
	      runningLen += splitLen;
	    }
	    return builder.toString();
	  }


最后会在org.apache.spark.sql.execution.command.CreateTable#processSchema执行：

 	sparkSession.sql(
            s"""CREATE TABLE $dbName.$tbName
               |(${ fields.map(f => f.rawSchema).mkString(",") })
               |USING org.apache.spark.sql.CarbonSource""".stripMargin +
                s""" OPTIONS (tableName "$tbName", dbName "$dbName", tablePath """.stripMargin +
                s""""$tablePath"$carbonSchemaString) """)

sql中的字符串为：

	CREATE TABLE default.test_table
	(`id` string,`name` string,`city` string,`age` int)
	USING org.apache.spark.sql.CarbonSource OPTIONS (tableName "test_table", dbName "default", tablePath "/david/xubo/carbondata/examples/spark2/target/store/default/test_table",carbonSchemaPartsNo '1',carbonSchema0 '{"databaseName":"default","tableUniqueName":"default_test_table","factTable":{"tableId":"df197ea2-3311-44d9-87f7-f5ad496e2665","tableName":"test_table","listOfColumns":[{"dataType":"STRING","columnName":"id","columnUniqueId":"15b54397-97cf-46fe-bed5-be6c686b586c","columnReferenceId":"15b54397-97cf-46fe-bed5-be6c686b586c","isColumnar":true,"encodingList":["INVERTED_INDEX"],"isDimensionColumn":true,"columnGroupId":-1,"scale":0,"precision":0,"schemaOrdinal":0,"numberOfChild":0,"invisible":false,"isSortColumn":true},{"dataType":"STRING","columnName":"name","columnUniqueId":"09843886-0141-43bb-bb21-0435777b62ce","columnReferenceId":"09843886-0141-43bb-bb21-0435777b62ce","isColumnar":true,"encodingList":["INVERTED_INDEX"],"isDimensionColumn":true,"columnGroupId":-1,"scale":0,"precision":0,"schemaOrdinal":1,"numberOfChild":0,"invisible":false,"isSortColumn":true},{"dataType":"STRING","columnName":"city","columnUniqueId":"f0728971-f9a5-4792-847b-b56aefaae97c","columnReferenceId":"f0728971-f9a5-4792-847b-b56aefaae97c","isColumnar":true,"encodingList":["INVERTED_INDEX"],"isDimensionColumn":true,"columnGroupId":-1,"scale":0,"precision":0,"schemaOrdinal":2,"numberOfChild":0,"invisible":false,"isSortColumn":true},{"dataType":"INT","columnName":"age","columnUniqueId":"93997e7c-28da-4dfe-8a3a-b111242e2aa9","columnReferenceId":"93997e7c-28da-4dfe-8a3a-b111242e2aa9","isColumnar":true,"encodingList":[],"isDimensionColumn":false,"columnGroupId":-1,"scale":0,"precision":0,"schemaOrdinal":3,"numberOfChild":0,"invisible":false,"isSortColumn":false}],"schemaEvalution":{"schemaEvolutionEntryList":[{"timeStamp":1503579770112}]},"tableProperties":{"sort_columns":"id,name,city"}},"lastUpdatedTime":1503579770112,"metaDataFilepath":"/david/xubo/carbondata/examples/spark2/target/store/default/test_table/Metadata","storePath":"/david/xubo/carbondata/examples/spark2/target/store","identifier":{"storePath":"/david/xubo/carbondata/examples/spark2/target/store","isLocalPath":false,"carbonTableIdentifier":{"databaseName":"default","tableName":"test_table","tableId":"df197ea2-3311-44d9-87f7-f5ad496e2665"}}}') 


###5.结果：

只有Schema文件：

![schema](../docs/pictrues/CreateTable.PNG?raw=true)

Schema文件：

![file](../docs/pictrues/CreateTableFile.PNG?raw=true)



