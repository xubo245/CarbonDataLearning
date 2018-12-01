package org.github.xubo245.carbonDataLearning.test;

import org.apache.commons.lang.StringUtils;

public class DefaultValueTest {
  static boolean flag;
  public static void main(String[] args) {
    System.out.println(flag);
    System.out.println(StringUtils.isNotBlank(""));
    System.out.println(StringUtils.isNotBlank(" "));

    System.out.println(StringUtils.isNotBlank(" a"));
  }
}
