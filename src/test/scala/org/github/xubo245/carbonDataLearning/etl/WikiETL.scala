package org.github.xubo245.carbonDataLearning.etl

import java.io.{File, PrintWriter}

import scala.io.Source

/**
  * Created by root on 8/14/18.
  */
object WikiETL {
  def main(args: Array[String]): Unit = {
    val directory = "/root/xubo/data"
    val files = new File(directory)
    val out = new PrintWriter("/root/xubo/data/pageviews-20150505")
    for (file <- files.listFiles().sorted.filter(_.getCanonicalFile.getName.contains("pageviews"))) {
      val filePath = file.getCanonicalPath
      println(filePath)
      //      val out = new PrintWriter(filePath + "WithTime")
      val reader = Source.fromFile(filePath)
      val fileName = file.getCanonicalFile.getName
      for (line <- reader.getLines()) {
        val stringBuffer = new StringBuffer()
        stringBuffer
          .append(fileName.substring(10, 14)).append("\t")
          .append(fileName.substring(14, 16)).append("\t")
          .append(fileName.substring(16, 18)).append("\t")
          .append(fileName.substring(19, 21)).append("\t")
        val array=line.mkString.split("\\s+")
        array.foreach(stringBuffer.append(_).append("\t"))
        val result = stringBuffer.toString.substring(0, stringBuffer.length() - 1)
        //        println(result)
        if (array.length == 4 && array(2).matches("[0-9]*")) {
          out.println(result)
        }
      }
      //      out.close()
    }
    out.close()
  }
}
