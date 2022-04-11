package com.gzgs.bigdata.spark.core.rdd

import org.apache.spark.{SparkConf, SparkContext}

object Spatk01_RDD {

  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setMaster("local").setAppName("WordCount")
    val sc = new SparkContext(sparkConf)


    //TODO RDD -创建

    //0-1 无->有

    //1)从集合（内存）中创建
    //2）从文件（磁盘）中创建
    sc.stop()

  }

}
