
package org.github.xubo245.carbonDataLearning.booleanDataType

import java.io.File

import org.apache.carbondata.core.util.CarbonProperties
import org.apache.spark.sql.Row
import org.apache.spark.sql.test.util.QueryTest
import org.scalatest.{BeforeAndAfterAll, BeforeAndAfterEach}


class TestBooleanCompressSuite extends QueryTest with BeforeAndAfterEach with BeforeAndAfterAll {
  val rootPath = new File(this.getClass.getResource("/").getPath
    + "../..").getCanonicalPath

  override def beforeEach(): Unit = {
    sql("drop table if exists boolean_table")
  }

  override def afterAll(): Unit = {
    sql("drop table if exists boolean_table")
    assert(BooleanFile.deleteFile(randomBoolean))
  }

  val pathOfManyDataType = s"$rootPath/src/test/resources/bool/supportBooleanBigFile.csv"
  val pathOfOnlyBoolean = s"$rootPath/src/test/resources/bool/supportBooleanBigFileOnlyBoolean.csv"
  val randomBoolean = s"$rootPath/src/test/resources/bool/supportRandomBooleanBigFile.csv"
  val trueNum = 10000000

  override def beforeAll(): Unit = {
    assert(BooleanFile.createBooleanFileRandom(randomBoolean, trueNum, 0.4))
    CarbonProperties.getInstance()
      .addProperty("carbon.storelocation", s"$rootPath/target/warehouse/")

  }

  test("test boolean compress rate: random file") {
    sql(
      s"""
         | CREATE TABLE boolean_table(
         | booleanField BOOLEAN
         | )
         | STORED BY 'carbondata'
       """.stripMargin)

    sql(
      s"""
         | LOAD DATA LOCAL INPATH '${randomBoolean}'
         | INTO TABLE boolean_table
         | options('FILEHEADER'='booleanField')
           """.stripMargin)

    //      sql("select * from boolean_table").show(100)
    sql("select count(*) from boolean_table").show()
    sql("select count(*) from boolean_table where booleanField= true").show()
    sql("select count(*) from boolean_table where booleanField= false").show()
    checkAnswer(
      sql("select count(*) from boolean_table"),
      Row(trueNum))
  }

}


