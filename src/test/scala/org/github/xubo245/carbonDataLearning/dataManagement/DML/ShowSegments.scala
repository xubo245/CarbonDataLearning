/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.github.xubo245.carbonDataLearning.dataManagement.DML

import java.io.File

import org.apache.carbondata.core.constants.CarbonCommonConstants
import org.apache.carbondata.core.util.CarbonProperties
import org.apache.spark.sql.SparkSession

object ShowSegments {
  def main(args: Array[String]): Unit = {
    val rootPath = new File(this.getClass.getResource("/").getPath
      + "../../").getCanonicalPath
    val storeLocation = s"$rootPath/examples/spark2/target/store"
    val warehouse = s"$rootPath/examples/spark2/target/warehouse"
    val metastoredb = s"$rootPath/examples/spark2/target"

    CarbonProperties.getInstance()
      .addProperty(CarbonCommonConstants.CARBON_TIMESTAMP_FORMAT, "yyyy/MM/dd HH:mm:ss")
      .addProperty(CarbonCommonConstants.CARBON_DATE_FORMAT, "yyyy/MM/dd")

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
    sql("SHOW SEGMENTS FOR TABLE test_table").show()
    carbon.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
    carbon.sql("SELECT * FROM test_table").show()
    sql("SHOW SEGMENTS FOR TABLE test_table limit 3").show()
    sql("SHOW SEGMENTS FOR TABLE test_table limit 1").show()
    carbon.sql(s"""LOAD DATA INPATH '$path' INTO TABLE test_table""")
    carbon.sql("SELECT * FROM test_table").show()
    sql("SHOW SEGMENTS FOR TABLE test_table limit 3").show()
    sql("SHOW SEGMENTS FOR TABLE test_table limit 1").show()


    sql("DELETE FROM TABLE test_table WHERE SEGMENT.ID IN (1)")
    carbon.sql("SELECT * FROM test_table").show()
    sql("SHOW SEGMENTS FOR TABLE test_table limit 3").show()
    sql("SHOW SEGMENTS FOR TABLE test_table limit 2").show()

    sql("DELETE FROM TABLE test_table WHERE SEGMENT.STARTTIME BEFORE '2077-08-14 11:52:00'")
    carbon.sql("SELECT * FROM test_table").show()
    sql("SHOW SEGMENTS FOR TABLE test_table limit 3").show()

    sql("SHOW SEGMENTS FOR TABLE test_table limit 2").show()

    sql("clean files for table test_table")
    carbon.sql("SELECT * FROM test_table").show()
    sql("SHOW SEGMENTS FOR TABLE test_table limit 2").show()

    carbon.stop()

  }

}
