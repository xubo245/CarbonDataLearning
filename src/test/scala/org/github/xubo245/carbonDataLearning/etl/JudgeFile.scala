package org.github.xubo245.carbonDataLearning.etl

import scala.io.Source

/**
  * Created by root on 8/17/18.
  */
object JudgeFile {
  def main(args: Array[String]): Unit = {
    val fileName = "/root/xubo/data/pageviews-20150505"
    val reader = Source.fromFile(fileName)
    var i=1;
    for (line <- reader.getLines()) {
      val array = line.split("\\s+")
      if (array.length != 8) {
        println(i + ":\t" + line)
        i = i + 1
      }
      if (array.length>6 && !array(6).matches("[0-9]*")) {
        println(line)
        println(array(6))
      }
      if(array.length>7 && !array(7).equalsIgnoreCase("0")){
        println(line)
      }
      if(line.length>3200){
        println(line)
      }
    }
  }
}
