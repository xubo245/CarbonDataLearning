package org.github.xubo245.carbonDataLearning.baseLearning

import java.io.File

/**
  * Created by root on 8/11/17.
  */
object TestFile {
  def main(args: Array[String]): Unit = {
    var file = new File("data/1.txt")
    println(file.getPath)
    println(file.getAbsolutePath)
    println(file.getName)
    println(file.getCanonicalPath)
    //    println(file.get)
  }

}
