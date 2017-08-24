package com.github.xubo245.carbonDataLearning.baseLearning

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by root on 8/11/17.
  */
object TestSpark {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Simple Application").setMaster("local[8]")
    val sc = new SparkContext(conf)
    sc.setLogLevel("ERROR")
    val rdd=sc.parallelize(1 to 10,2)
    rdd.foreach(println)
    println(rdd.count())
    sc.stop()
  }

}
