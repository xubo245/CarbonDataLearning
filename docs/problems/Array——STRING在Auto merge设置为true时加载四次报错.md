
##问题：

Array<STRING>在Auto merge设置为true时，加载四次报错

    //unfinish
    sql("drop table if exists array_table")
    CarbonProperties.getInstance().addProperty(CarbonCommonConstants.ENABLE_AUTO_LOAD_MERGE, "true")
    sql(
      s"""
         | CREATE TABLE array_table(
         | complexData ARRAY<STRING>
         | )
         | STORED BY 'carbondata'
         | TBLPROPERTIES('sort_columns'='')
       """.stripMargin)

    val storeLocation = s"$rootPath/integration/spark-common-test/src/test/resources/bool/ArrayString.csv"

    for (i <- 0 until 4) {
      sql(
        s"""
           | LOAD DATA LOCAL INPATH '${storeLocation}'
           | INTO TABLE array_table
           | options('FILEHEADER'='complexData')
           """.stripMargin)
    }

    checkAnswer(
      sql("select count(*) from array_table"),
      Seq(Row(40))
    )
    val segments = sql("SHOW SEGMENTS FOR TABLE array_table")
    val SegmentSequenceIds = segments.collect().map { each => (each.toSeq) (0) }
    assert(!SegmentSequenceIds.contains("0.1"))
    assert(SegmentSequenceIds.length == 4)
    CarbonProperties.getInstance().addProperty(CarbonCommonConstants.ENABLE_AUTO_LOAD_MERGE,
      CarbonCommonConstants.DEFAULT_ENABLE_AUTO_LOAD_MERGE)
    sql("drop table if exists array_table")



debug位置：

org.apache.carbondata.core.datastore.block.SegmentProperties#SegmentProperties


org.apache.carbondata.spark.rdd.CarbonMergerRDD#internalCompute



## 问题分析

	org.apache.carbondata.processing.merger.CarbonCompactionUtil#updateColumnSchemaAndGetCardinality

获取的时候就只有Dimensions一列：

	  List<CarbonDimension> masterDimensions =
	        carbonTable.getDimensionByTableName(carbonTable.getFactTableName());


参考正确的代码：
会进行复杂数据类型的操作

	org.apache.carbondata.core.util.CarbonUtil#fillCollumnSchemaListForComplexDims


org.apache.carbondata.processing.store.CarbonFactDataHandlerModel

##后又出现row没有数据：

	org.apache.carbondata.processing.merger.CompactionResultSortProcessor#processResult