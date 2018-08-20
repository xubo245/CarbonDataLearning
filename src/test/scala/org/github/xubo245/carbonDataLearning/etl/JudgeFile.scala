package org.github.xubo245.carbonDataLearning.etl

import scala.io.Source

/**
  * Created by root on 8/17/18.
  */
object JudgeFile {
  def main(args: Array[String]): Unit = {
//    val fileName = "/root/xubo/data/pageviews-20150505"

//    val fileName = "/root/xubo/data/pageviews-20150505-000000WithTime"
    for (i <- 0 to 9) {
      val path = s"/root/xubo/data/pageviews-20150505-0" + i + "0000WithTime"
      println("read file " +i + ":" + path)
      judge(path)
    }
  }
  def judge(fileName:String): Unit ={
    val reader = Source.fromFile(fileName)
    var i=1;
    for (line <- reader.getLines()) {
      val array = line.split('\t')
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
        println(line.length)
      }
      if(array(5).equalsIgnoreCase("\"")){
        println(line)
      }

    }
  }
}
