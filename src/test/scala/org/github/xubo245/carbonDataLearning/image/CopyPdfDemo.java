package org.github.xubo245.carbonDataLearning.image;

import java.io.*;


public class CopyPdfDemo {
  public static void main(String[] args) throws IOException {
    String srcPath = "/Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/src/main/resources/images/multi-channel/BGRA.png";
    String prefix = "/Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/target/BGRA";
    String suffix = ".png";

    String desPath1 = prefix + "1" + suffix;
    String desPath2 = prefix + "2" + suffix;
    String desPath3 = prefix + "3" + suffix;
    String desPath4 = prefix + "4" + suffix;

    long start = System.nanoTime();
    method1(srcPath, desPath1);
    long end = System.nanoTime();
    System.out.println("time is: " + (end - start) / 1000000.0 + " ms");


    start = System.nanoTime();
    method2(srcPath, desPath2);
    end = System.nanoTime();
    System.out.println("time is: " + (end - start) / 1000000.0 + " ms");


    start = System.nanoTime();
    method3(srcPath, desPath3);
    end = System.nanoTime();
    System.out.println("time is: " + (end - start) / 1000000.0 + " ms");


    start = System.nanoTime();
    method4(srcPath, desPath4);
    end = System.nanoTime();
    System.out.println("time is: " + (end - start) / 1000000.0 + " ms");

  }


  //单字节写入--共耗时196000毫秒
  private static void method1(String srcString, String destString) throws IOException {
    FileInputStream fis = new FileInputStream(srcString);
    FileOutputStream fos = new FileOutputStream(destString);

    int by = 0;
    while ((by = fis.read()) != -1) {
      fos.write(by);
    }

    fos.close();
    fis.close();
  }

  //字节数组写入---共耗时297毫秒
  private static void method2(String srcString, String destString) throws IOException {
    FileInputStream fis = new FileInputStream(srcString);
    FileOutputStream fos = new FileOutputStream(destString);

    byte[] by = new byte[1024];
    int len = 0;
    while ((len = fis.read(by)) != -1) {
      fos.write(by);
    }

    fos.close();
    fis.close();
  }

  //缓冲区单字节写入---共耗时938毫秒
  private static void method3(String srcString, String destString) throws IOException {
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));

    int by = 0;
    while ((by = bis.read()) != -1) {
      bos.write(by);
    }

    bos.close();
    bis.close();
  }

  //缓冲区字节数组写入----共耗时63毫秒---最高效
  private static void method4(String srcString, String destString) throws IOException {
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));

    byte[] by = new byte[1024];
    int len = 0;
    while ((len = bis.read(by)) != -1) {
      bos.write(by);
    }

    bos.close();
    bis.close();
  }

}