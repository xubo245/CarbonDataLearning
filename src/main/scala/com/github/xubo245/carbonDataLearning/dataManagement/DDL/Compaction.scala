package com.github.xubo245.carbonDataLearning.dataManagement.DDL

import java.io.File

import org.apache.carbondata.core.constants.CarbonCommonConstants
import org.apache.carbondata.core.util.CarbonProperties
import org.apache.spark.sql.SparkSession

/**
  * Created by root on 8/11/17.
  */
object Compaction {
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
    val path = s"$rootPath/src/main/resources/sample.csv"

    sql("DROP TABLE IF EXISTS test_table")
    sql("CREATE TABLE IF NOT EXISTS test_table(id string,name string,city string,age Int) STORED BY 'carbondata' ")
    carbon.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
    carbon.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
    carbon.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
    carbon.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
    carbon.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
    carbon.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
    carbon.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
    carbon.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
    carbon.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
    carbon.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
    carbon.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
    carbon.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
    carbon.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
    carbon.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
    carbon.sql("SELECT * FROM test_table").show()

    sql("SHOW SEGMENTS FOR TABLE test_table").show()

    sql("ALTER TABLE test_table COMPACT 'MINOR'").show()
    carbon.sql("SELECT * FROM test_table").show()
    sql("SHOW SEGMENTS FOR TABLE test_table").show()

    sql("ALTER TABLE test_table COMPACT 'major'").show()
    carbon.sql("SELECT * FROM test_table").show()
    sql("SHOW SEGMENTS FOR TABLE test_table").show()



    sql(" CREATE TABLE IF NOT EXISTS productSalesTable2 ( productNumber Int, saleQuantity Int," +
      " productName String, storeCity String,storeProvince String,  productCategory String, productBatch String," +
      "   revenue Int) STORED BY 'carbondata' TBLPROPERTIES ('DICTIONARY_EXCLUDE'='productName', " +
      "'DICTIONARY_INCLUDE'='productNumber,saleQuantity', 'NO_INVERTED_INDEX'='productBatch'," +
      "'BUCKETNUMBER'='4', 'BUCKETCOLUMNS'='productName')")
    sql("select * from productSalesTable2").show()
    //    sc.stop()
    carbon.stop()

  }

}
