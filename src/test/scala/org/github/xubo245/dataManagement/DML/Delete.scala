package carbonDataLearning.dataManagement.DML

import java.io.File

import org.apache.carbondata.core.constants.CarbonCommonConstants
import org.apache.carbondata.core.util.CarbonProperties
import org.apache.spark.sql.SparkSession

/**
  * Created by root on 8/11/17.
  */
object Delete {
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
    carbon.sql("SELECT * FROM test_table").show()

    sql("delete from test_table d where d.age=31")
    carbon.sql("SELECT * FROM test_table").show()

    sql("delete from test_table d where d.city in ('shanghai','wuhan')")
    carbon.sql("SELECT * FROM test_table").show()


    val path2 = s"$rootPath/src/main/resources/sample2.csv"

    sql("DROP TABLE IF EXISTS test_table2")
    sql("CREATE TABLE IF NOT EXISTS test_table2(id string,name string,city string,age Int) STORED BY 'carbondata' ")
    carbon.sql(s"""LOAD DATA INPATH '$path2' INTO TABLE test_table2""")
    carbon.sql("SELECT * FROM test_table2").show()

    sql("DELETE FROM test_table2 WHERE city IN (SELECT city FROM test_table)")
    carbon.sql("SELECT * FROM test_table2").show()

    sql("DELETE FROM test_table2 WHERE id IN (SELECT id FROM test_table where city='shenzhen')")
    carbon.sql("SELECT * FROM test_table2").show()

    sql("DELETE FROM test_table2 where age> 44")
    carbon.sql("SELECT * FROM test_table2").show()

    carbon.sql("SELECT * FROM test_table").show()
    sql("SHOW SEGMENTS FOR TABLE test_table").show()

    sql("CLEAN FILES FOR TABLE test_table")
    println("clean files")
    carbon.sql("SELECT * FROM test_table").show()
    sql("SHOW SEGMENTS FOR TABLE test_table").show()
    //    sc.stop()



    carbon.stop()

  }

}
