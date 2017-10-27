package org.github.xubo245.carbonDataLearning.dataManagement.dataType

import java.io.File

import org.apache.carbondata.core.constants.CarbonCommonConstants
import org.apache.carbondata.core.util.CarbonProperties
import org.apache.spark.sql.SparkSession

/**
  * Created by root on 8/11/17.
  */
object SupportBooleanSparkSQL {
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
    //    val spark = SparkSession
    //      .builder()
    //      .master("local")
    //      .appName("CarbonSessionExample")
    //      .config("spark.sql.warehouse.dir", warehouse)
    //      .config("spark.driver.host", "localhost")
    //    .getOrCreate()
    val spark = SparkSession
      .builder()
      .appName("Spark SQL basic example")
      .config("spark.some.config.option", "some-value")
      .master("local[4]")
      .getOrCreate()

    val path = s"$rootPath/src/main/resources/sample.csv"

    spark.sql("DROP TABLE IF EXISTS test_table")
    spark.sql("CREATE TABLE IF NOT EXISTS test_table(id string,name string,city string,age boolean)")
    spark.sql("insert into default.test_table values('id1','name2','city3',false)")
    spark.sql("desc test_table").show()
    //    spark.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
//    spark.sql("SELECT id FROM test_table")
    //    sc.stop()
    //    spark.stop()

  }

}
