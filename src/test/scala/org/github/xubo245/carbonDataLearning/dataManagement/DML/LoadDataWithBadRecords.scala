package org.github.xubo245.carbonDataLearning.dataManagement.DML

import java.io.File
import java.lang
import java.lang.Exception

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


    val path = s"$rootPath/src/main/resources/datasample.csv"
//    //1.redirect?
//    sql("drop table IF EXISTS sales")
//    sql(
//      """CREATE TABLE IF NOT EXISTS sales(ID BigInt, date Timestamp, country String,
//              actual_price Double, Quantity int, sold_price Decimal(19,2)) STORED BY 'carbondata'""")
//    println(path)
//    sql("LOAD DATA local inpath '" + path + "' INTO TABLE sales OPTIONS" +
//      "('bad_records_logger_enable'='true','bad_records_action'='redirect', 'DELIMITER'=" +
//      " ',', 'QUOTECHAR'= '\"')");
//    sql("select * from sales").show()
//    sql("select count(*) from sales").show()
//
//
//    //    //2.Fail
//    //    sql("drop table IF EXISTS sales2")
//    //    sql(
//    //      """CREATE TABLE IF NOT EXISTS sales2(ID BigInt, date Timestamp, country String,
//    //          actual_price Double, Quantity int, sold_price Decimal(19,2)) STORED BY 'carbondata'""")
//    //    println(path)
//    //    try{
//    //
//    //      sql("LOAD DATA local inpath '" + path + "' INTO TABLE sales2 OPTIONS" +
//    //        "('bad_records_logger_enable'='true','bad_records_action'='FAIL', 'DELIMITER'=" +
//    //        " ',', 'QUOTECHAR'= '\"')");
//    //      sql("select * from sales2").show()
//    //      sql("select count(*) from sales2").show()
//    //    }catch{
//    //      case _:Exception=>
//    //        println("FAIL")
//    //    }
//
//
//    //3.force
//    sql("drop table IF EXISTS sales3")
//    sql(
//      """CREATE TABLE IF NOT EXISTS sales3(ID BigInt, date Timestamp, country String,
//          actual_price Double, Quantity int, sold_price Decimal(19,2)) STORED BY 'carbondata'""")
//    println(path)
//    sql("LOAD DATA local inpath '" + path + "' INTO TABLE sales3 OPTIONS" +
//      "('bad_records_logger_enable'='true','bad_records_action'='FORCE', 'DELIMITER'=" +
//      " ',', 'QUOTECHAR'= '\"')");
//    sql("select * from sales3").show()
//    sql("select count(*) from sales3").show()


    //4.IGNORE
    sql("drop table IF EXISTS sales4")
    sql(
      """CREATE TABLE IF NOT EXISTS sales4(ID BigInt, date Timestamp, country String,
          actual_price Double, Quantity int, sold_price Decimal(19,2)) STORED BY 'carbondata'""")
    println(path)
    sql("LOAD DATA local inpath '" + path + "' INTO TABLE sales4 OPTIONS" +
      "('bad_records_logger_enable'='true','bad_records_action'='IGNORE', 'DELIMITER'=" +
      " ',', 'QUOTECHAR'= '\"')");


    sql("select * from sales4").show()
    sql("select count(*) from sales4").show()

    carbon.stop()

  }

}
