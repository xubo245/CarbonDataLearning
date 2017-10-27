package org.github.xubo245.carbonDataLearning.baseLearning

import java.io.File

import org.apache.carbondata.core.constants.CarbonCommonConstants
import org.apache.carbondata.core.util.CarbonProperties
import org.apache.spark.sql.SparkSession

/**
  * Created by root on 8/11/17.
  */
object TestCarbon {
  def main(args: Array[String]): Unit = {
    //    val conf = new SparkConf().setAppName("Simple Application").setMaster("local[8]")
    //    val sc = new SparkContext(conf)
    //    sc.setLogLevel("ERROR")
    //    val carbon = SparkSession.builder().config(sc.getConf).getOrCreateCarbonSession("data/carbon/")
    //


    val rootPath = new File(this.getClass.getResource("/").getPath
      + "../../../..").getCanonicalPath
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
    carbon.sql("DROP TABLE IF EXISTS test_table")
    carbon.sql("CREATE TABLE IF NOT EXISTS test_table(id string,name string,city string,age Int) STORED BY 'carbondata' ")

    carbon.sql("LOAD DATA INPATH '/david/xubo/CarbonDataLearning/src/main/resources/sample.csv' INTO TABLE test_table")
    carbon.sql("SELECT * FROM test_table").show()
    carbon.sql("SELECT city, avg(age), sum(age)      FROM test_table      GROUP BY city").show()
    //    sc.stop()

  }

}
