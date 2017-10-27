package org.github.xubo245.carbonDataLearning.dataManagement.DML

import java.io.File

import org.apache.carbondata.core.constants.CarbonCommonConstants
import org.apache.carbondata.core.util.CarbonProperties
import org.apache.spark.sql.SparkSession

/**
  * Created by root on 8/11/17.
  */
object InsertDataIntoTable {
  def main(args: Array[String]): Unit = {
    val rootPath = new File(this.getClass.getResource("/").getPath
      + "../..").getCanonicalPath
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
    val path = s"$rootPath/src/main/resources/data_with_all_types.csv"

    import carbon._

    sql("DROP TABLE IF EXISTS carbon_table")
    sql("DROP TABLE IF EXISTS carbon_table1")
    sql("DROP TABLE IF EXISTS carbon_table2")
    // Create table
    sql(
      s"""
         | CREATE TABLE carbon_table(
         |    shortField smallint,
         |    intField int,
         |    bigintField bigint,
         |    doubleField double,
         |    stringField string,
         |    timestampField timestamp,
         |    decimalField decimal(18,2),
         |    dateField date,
         |    charField string,
         |    floatField float
         | )
         | STORED BY 'carbondata'
         | TBLPROPERTIES('DICTIONARY_INCLUDE'='dateField, charField')
       """.stripMargin)

    sql(
      s"""
         | CREATE TABLE carbon_table1(
         |    shortField smallint,
         |    intField int,
         |    bigintField bigint,
         |    doubleField double,
         |    stringField string,
         |    timestampField timestamp,
         |    decimalField decimal(18,2),
         |    dateField date,
         |    charField string,
         |    floatField float
         | )
         | STORED BY 'carbondata'
         | TBLPROPERTIES('DICTIONARY_INCLUDE'='dateField, charField')
       """.stripMargin)

    sql(
      s"""
         | CREATE TABLE carbon_table2(
         |    shortField smallint,
         |    intField int,
         |    bigintField bigint,
         |    doubleField double,
         |    stringField string,
         |    timestampField timestamp,
         |    decimalField decimal(18,2),
         |    dateField date,
         |    charField string,
         |    floatField float
         | )
         | STORED BY 'carbondata'
         | TBLPROPERTIES('DICTIONARY_INCLUDE'='dateField, charField')
       """.stripMargin)

    sql("DROP TABLE IF EXISTS carbon_table3")
    sql(
      s"""
         | CREATE TABLE carbon_table3(
         |    shortField smallint,
         |    intField int,
         |    bigintField bigint,
         |    doubleField double,
         |    stringField string,
         |    timestampField timestamp,
         |    decimalField decimal(18,2),
         |    dateField date,
         |    charField string,
         |    floatField float
         | )
         | STORED BY 'carbondata'
         | TBLPROPERTIES('DICTIONARY_INCLUDE'='dateField, charField')
       """.stripMargin)


    sql("DROP TABLE IF EXISTS carbon_table4")
    sql(
      s"""
         | CREATE TABLE carbon_table4(
         |    shortField smallint,
         |    intField int,
         |    bigintField bigint,
         |    doubleField double,
         |    dateField date,
         |    charField string
         | )
         | STORED BY 'carbondata'
         | TBLPROPERTIES('DICTIONARY_INCLUDE'='dateField, charField')
       """.stripMargin)


    sql("DROP TABLE IF EXISTS carbon_table5")
    sql(
      s"""
         | CREATE TABLE carbon_table5(
         |    shortField smallint,
         |    intField int,
         |    bigintField bigint,
         |    doubleField double,
         |    stringField string,
         |    timestampField timestamp,
         |    decimalField decimal(18,2),
         |    dateField date,
         |    charField string,
         |    floatField float
         | )
         | STORED BY 'carbondata'
         | TBLPROPERTIES('DICTIONARY_INCLUDE'='dateField, charField')
       """.stripMargin)

    sql(
      s"""
         | LOAD DATA LOCAL INPATH '$path'
         | INTO TABLE carbon_table
         | options('FILEHEADER'='shortField,intField,bigintField,doubleField,stringField,timestampField,decimalField,dateField,charField,floatField')
       """.stripMargin)

    println("carbon_table1:")
    sql("select * from carbon_table1").show()
    println("carbon_table2:")
    sql("select * from carbon_table2").show()

    sql(
      """insert into table carbon_table1 select shortField,intField,bigintField,doubleField,ASCII(stringField),
                timestampField,decimalField,dateField,charField,floatField from carbon_table
              """)
    sql(
      """insert into table carbon_table2 select shortField,intField,bigintField,doubleField,ASCII(stringField),
                timestampField,decimalField,dateField,charField,floatField from carbon_table where (carbon_table.intField=10)
              """)
    println("carbon_table:")
    sql("select * from carbon_table").show()
    println("carbon_table1:")
    sql("select * from carbon_table1").show()
    println("carbon_table2:")
    sql("select * from carbon_table2").show()
    sql(
      """insert into table carbon_table3 select shortField,intField,(bigintField+1) as result,doubleField,ASCII(stringField),
                timestampField,decimalField,dateField,charField,floatField from carbon_table where (carbon_table.intField=11)
              """)
    println("carbon_table3:")
    sql("select * from carbon_table3").show()

    sql(
      """insert into table carbon_table4 select shortField,intField,(bigintField+1) as result,doubleField,dateField,charField from carbon_table where (carbon_table.intField=11)
      """)
    println("carbon_table4:")
    sql("select * from carbon_table4").show()


    println("carbon_table5:")
    sql("select * from carbon_table5").show()
    //    sql("INSERT INTO carbon_table5 SELECT * FROM carbon_table where exists (select * from carbon_table where carbon_table.intField = 10)")
    sql("INSERT INTO carbon_table5 SELECT * FROM carbon_table where exists (select * from carbon_table2 where carbon_table2.intField = carbon_table.intField)")
    println("carbon_table5:")
    sql("select * from carbon_table5").show()

    println("describe")
    sql("describe carbon_table5").show()

    //    sc.stop()
    carbon.stop()

  }

}
