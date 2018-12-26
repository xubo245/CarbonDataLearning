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

package org.github.xubo245.carbonDataLearning.example

import org.apache.carbondata.examples.util.ExampleUtils
import org.apache.spark.sql.{SaveMode, SparkSession}

object CarbonDataFrameExample {

  def main(args: Array[String]) {
    val spark = ExampleUtils.createCarbonSession("CarbonDataFrameExample")
    exampleBody(spark)
    spark.close()
  }

  def exampleBody(spark : SparkSession): Unit = {
    // Writes Dataframe to CarbonData file:
    import spark.implicits._
    val df = spark.sparkContext.parallelize(1 to 100)
      .map(x => ("a" + x % 10, "b", x))
      .toDF("c1", "c2", "number")

    // Saves dataframe to carbondata file
    df.write
      .format("carbondata")
      .option("tableName", "carbon_df_table")
      .option("partitionColumns", "c1")  // a list of column names
      .mode(SaveMode.Overwrite)
      .save()

    spark.sql(""" SELECT * FROM carbon_df_table """).show()

    spark.sql("SHOW PARTITIONS carbon_df_table").show()

    // Specify schema
    import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}
    val customSchema = StructType(Array(
      StructField("c1", StringType),
      StructField("c2", StringType),
      StructField("number", IntegerType)))

    // Reads carbondata to dataframe
    val carbondf = spark.read
      .format("carbondata")
      .schema(customSchema)
      // .option("dbname", "db_name") the system will use "default" as dbname if not set this option
      .option("tableName", "carbon_df_table")
      .load()

    df.write
      .format("csv")
      .option("tableName", "csv_df_table")
      .option("partitionColumns", "c1") // a list of column names
      //      .option("timestampFormat", "yyyy/MM/dd HH:mm:ss ZZ")
      .mode(SaveMode.Overwrite)
      .csv("/Users/xubo/Desktop/xubo/git/carbondata3/examples/spark2/target/csv/1.csv")

    // Reads carbondata to dataframe
    val carbondf2 = spark.read
      .format("csv")
      .schema(customSchema)
      // .option("dbname", "db_name") the system will use "default" as dbname if not set this option
      .option("tableName", "csv_df_table")

      //      .option("timestampFormat", "yyyy/MM/dd HH:mm:ss ZZ")
      .load("/Users/xubo/Desktop/xubo/git/carbondata3/examples/spark2/target/csv")

    carbondf2.show()


    // Dataframe operations
    carbondf.printSchema()
    carbondf.select($"c1", $"number" + 10).show()
    carbondf.filter($"number" > 31).show()

    spark.sql("DROP TABLE IF EXISTS carbon_df_table")
  }
}
