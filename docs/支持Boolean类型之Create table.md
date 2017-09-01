

##支持从schema中获取boolean

org.apache.spark.sql.parser.CarbonSpark2SqlParser#getFields

修改：

org.apache.spark.sql.catalyst.CarbonDDLSqlParser#primitiveTypes

增加BOOLEAN



##convert支持boolean

org.apache.carbondata.spark.util.DataTypeConverterUtil#convertToCarbonType

其他几个方法都加上boolean类型的支持


##验证：
###debug验证：
org.apache.spark.sql.execution.command.CreateTable#processSchema

	CREATE TABLE default.carbon_table
	(`booleanField` boolean)
	USING org.apache.spark.sql.CarbonSource OPTIONS (tableName "carbon_table", dbName "default", tablePath "/david/xubo/git/bool/carbondata/integration/spark-common/target/warehouse/default/carbon_table",carbonSchemaPartsNo '1',carbonSchema0 '{"databaseName":"default","tableUniqueName":"default_carbon_table","factTable":{"tableId":"efb36186-b154-4b78-ae1c-b6c0cfe0d273","tableName":"carbon_table","listOfColumns":[{"dataType":"BOOLEAN","columnName":"booleanfield","columnUniqueId":"57986cd1-8769-43e0-bae4-28e53ed93bc7","columnReferenceId":"57986cd1-8769-43e0-bae4-28e53ed93bc7","isColumnar":true,"encodingList":[],"isDimensionColumn":false,"columnGroupId":-1,"scale":0,"precision":0,"schemaOrdinal":0,"numberOfChild":0,"invisible":false,"isSortColumn":false}],"schemaEvalution":{"schemaEvolutionEntryList":[{"timeStamp":1504235974879}]},"tableProperties":{"sort_columns":""}},"lastUpdatedTime":1504235974879,"metaDataFilepath":"/david/xubo/git/bool/carbondata/integration/spark-common/target/warehouse/default/carbon_table/Metadata","storePath":"/david/xubo/git/bool/carbondata/integration/spark-common/target/warehouse","identifier":{"storePath":"/david/xubo/git/bool/carbondata/integration/spark-common/target/warehouse","isLocalPath":false,"carbonTableIdentifier":{"databaseName":"default","tableName":"carbon_table","tableId":"efb36186-b154-4b78-ae1c-b6c0cfe0d273"}}}') 

###代码验证

	  sql("create table if not exists carbon_table (booleanField boolean) STORED BY 'org.apache.carbondata.format'")
	      sql("desc carbon_table ").show

结果

	+------------+---------+-------+
	|    col_name|data_type|comment|
	+------------+---------+-------+
	|booleanField|  boolean|   null|
	+------------+---------+-------+