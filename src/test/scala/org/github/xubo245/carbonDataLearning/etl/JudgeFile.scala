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

package org.github.xubo245.carbonDataLearning.etl

import scala.io.Source

object JudgeFile {
  def main(args: Array[String]): Unit = {
    val fileName = "/root/xubo/data/pageviews-20150505key"
    judge(fileName)
    //    val fileName = "/root/xubo/data/pageviews-20150505-000000WithTime"
    //    for (i <- 0 to 9) {
    //      val path = s"/root/xubo/data/pageviews-20150505-0" + i + "0000WithTime"
    //      println("read file " +i + ":" + path)
    //      judge(path)
    //    }
  }
  def judge(fileName:String): Unit ={
    val reader = Source.fromFile(fileName)
    var i=1;
    for (line <- reader.getLines()) {
      val array = line.split('\t')
      if (array.length != 9) {
        println(i + ":\t" + line)
        i = i + 1
      }
      if (array.length>7 && !array(7).matches("[0-9]*")) {
        println(line)
        println(array(7))
      }
      if(array.length>8 && !array(8).equalsIgnoreCase("0")){
        println(line)
      }
      if(line.length>3200){
        println(line)
        println(line.length)
      }
      if(array(6).equalsIgnoreCase("\"")){
        println(line)
      }


    }
  }
}
