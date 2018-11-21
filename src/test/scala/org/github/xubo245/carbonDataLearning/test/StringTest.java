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

package org.github.xubo245.carbonDataLearning.test;

public class StringTest {
  public static final String ROW_SEPARATOR = "\001";
  public static final String BATCH_SEPARATOR = "\002";

  public static void main(String[] args) {
    System.out.println("String Test");
    int num = 10000000;
    int capacity = 629888890;
    long start = System.nanoTime();
    String result = StringBuilderTest(num);
    long end = System.nanoTime();
    System.out.println("StringBuilder time is " + ((end - start) / 1000000000.0)
        + "s. num is " + num + "\n");
    System.out.println(result.length());
    System.out.println(result.substring(0, 500));

    start = System.nanoTime();
    result = StringBuilderTest(num, capacity);
    end = System.nanoTime();
    System.out.println("StringBuilder time is " + ((end - start) / 1000000000.0)
        + "s. num is " + num + ", Capacity is " + capacity + "\n");
    System.out.println(result.length());
    System.out.println(result.substring(0, 500));


    start = System.nanoTime();
    result = StringBufferTest(num);
    end = System.nanoTime();
    System.out.println("StringBuffer time is " + ((end - start) / 1000000000.0)
        + "s. num is " + num + "\n");
    System.out.println(result.length());
    System.out.println(result.substring(0, 500));

    start = System.nanoTime();
    result = StringBufferTest(num, capacity);
    end = System.nanoTime();
    System.out.println("StringBuilder time is " + ((end - start) / 1000000000.0)
        + "s. num is " + num + ", Capacity is " + capacity + "\n");
    System.out.println(result.length());
    System.out.println(result.substring(0, 500));
  }

  public static String StringBuilderTest(int num) {
    return StringBuilderTest(num, 16);
  }

  public static String StringBuilderTest(int num, int capacity) {
    if (capacity < 1) {
      capacity = 16;
    }
    StringBuilder stringBuilder = new StringBuilder(capacity);

    for (int i = 0; i < num; i++) {
      stringBuilder
          .append("row1Num" + i).append(ROW_SEPARATOR)
          .append("row2").append(ROW_SEPARATOR)
          .append("row3").append(ROW_SEPARATOR)
          .append("row4").append(ROW_SEPARATOR)
          .append(121341231231223L).append(ROW_SEPARATOR)
          .append(435641421225123L).append(BATCH_SEPARATOR);
    }
    return stringBuilder.toString();
  }


  public static String StringBufferTest(int num) {
    return StringBufferTest(num, 16);
  }

  public static String StringBufferTest(int num, int capacity) {
    if (capacity < 1) {
      capacity = 16;
    }
    StringBuffer stringBuffer = new StringBuffer(capacity);

    for (int i = 0; i < num; i++) {
      stringBuffer
          .append("row1Num" + i).append(ROW_SEPARATOR)
          .append("row2").append(ROW_SEPARATOR)
          .append("row3").append(ROW_SEPARATOR)
          .append("row4").append(ROW_SEPARATOR)
          .append(121341231231223L).append(ROW_SEPARATOR)
          .append(435641421225123L).append(BATCH_SEPARATOR);
    }
    return stringBuffer.toString();
  }
}
