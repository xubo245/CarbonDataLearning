


 sql("drop table if exists index1")

改成

dropTable("index1“)

spark-common-cluster-test
org.apache.spark.sql.common.util.QueryTest#dropTable

 protected def dropTable(tableName: String): Unit ={
    sql(s"DROP TABLE IF EXISTS $tableName")
  }