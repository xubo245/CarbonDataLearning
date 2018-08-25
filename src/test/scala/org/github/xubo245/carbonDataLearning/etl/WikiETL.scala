package org.github.xubo245.carbonDataLearning.etl

import java.io.{File, PrintWriter}

import scala.io.Source
import scala.util.Random

/**
  * Created by root on 8/14/18.
  */
object WikiETL {
  def main(args: Array[String]): Unit = {
    val directory = "/root/xubo/data"
    val files = new File(directory)
    val out = new PrintWriter("/root/xubo/data/pageviews-20150505tid")
    var flag:Int = 10000000;
    var typeMap= Map (("b","wikibooks")
      ,("d","wiktionary")
      ,("m","wikimedia")
      ,("mw","wikipedia mobile")
      ,("n","wikinews")
      ,("q","wikiquote")
      ,("s","wikisource")
      ,("v","wikiversity")
      ,("w","mediawiki"))


//    ,("","")
//    ,("","")
//    ,("","")
//    ,("","")
//    ,("","")
//    wikibooks: ".b"
//    wiktionary: ".d"
//    wikimedia: ".m"
//    wikipedia mobile: ".mw"
//    wikinews: ".n"
//    wikiquote: ".q"
//    wikisource: ".s"
//    wikiversity: ".v"
//    mediawiki: ".w"

    for (file <- files.listFiles().sorted.filter(_.getCanonicalFile.getName.contains("pageviews-20150505-"))) {
      val filePath = file.getCanonicalPath
      println(filePath)
      //            val out = new PrintWriter(filePath + "WithTime")
      val reader = Source.fromFile(filePath)
      val fileName = file.getCanonicalFile.getName
      val delimiter = "\t"
      for (line <- reader.getLines()) {
        val stringBuffer = new StringBuffer()
        val random = new Random()
        val id = flag+random.nextInt(1000000)
        stringBuffer
          .append(id).append(delimiter)
          .append(fileName.substring(10, 14)).append(delimiter)
          .append(fileName.substring(14, 16)).append(delimiter)
          .append(fileName.substring(16, 18)).append(delimiter)
          .append(fileName.substring(19, 21)).append(delimiter)
        val array=line.mkString.split("\\s+")

//        val result = stringBuffer.toString.substring(0, stringBuffer.length() - 1)
        //        println(result)
        if (array.length == 4 && array(2).matches("[0-9]*") && !array(1).contains("\"")) {
          val domain = array(0).split('.')
          stringBuffer.append(domain(0)).append(delimiter)
          if (domain.length > 1) {
            var value: String = typeMap.getOrElse(domain(1), "wiki")
            stringBuffer.append(value).append(delimiter)
          } else {
            stringBuffer.append("wiki").append(delimiter)
          }

          stringBuffer.append(array(1).replace('_',' ')).append(delimiter)
          val tid= id*10+random.nextInt(5)
          stringBuffer.append(tid).append(delimiter)
          stringBuffer.append(array(2)).append(delimiter)
          stringBuffer.append(random.nextInt(100000))

//          for (i <- 0 until array.length-1){
//            stringBuffer.append(array(i)).append(delimiter)
//          }
//          stringBuffer.append(array(array.length-1))

//        if (array.length == 4 && array(2).matches("[0-9]*")) {
//          id = id + 1
          out.println(stringBuffer.toString)
        }
      }
//            out.close()
    }
    out.close()
  }
}
