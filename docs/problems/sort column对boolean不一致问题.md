

#sort column对boolean不一致问题

##问题：

'sort_columns'=''：

	+------------+
	|booleanField|
	+------------+
	|        null|
	|        null|
	|        null|
	|        null|
	|        null|
	|        null|
	+------------+

'sort_columns'='booleanField'：

	+------------+
	|booleanField|
	+------------+
	|       false|
	|       false|
	|       false|
	|       false|
	|       false|
	|        null|
	+------------+


##代码：

	  test("ENABLE_AUTO_LOAD_MERGE: false, and sort column") {
	    sql("drop table if exists boolean_one_column")
	    sql(
	      s"""CREATE TABLE if not exists boolean_one_column(
	         |booleanField BOOLEAN)
	         |STORED BY 'carbondata'
	         |TBLPROPERTIES('sort_columns'='booleanField','SORT_SCOPE'='GLOBAL_SORT')
	         |""".stripMargin)
	    CarbonProperties.getInstance().addProperty(CarbonCommonConstants.ENABLE_AUTO_LOAD_MERGE, "false")
	    sql("insert into boolean_one_column values('tr')")
	
	    sql("select * from boolean_one_column").show()
	    checkAnswer(
	      sql("select * from boolean_one_column"),
	      Seq(
	        Row(null))
	    )
	
	    val segments = sql("SHOW SEGMENTS FOR TABLE boolean_one_column")
	    val SegmentSequenceIds = segments.collect().map { each => (each.toSeq) (0) }
	    assert(!SegmentSequenceIds.contains("0.1"))
	    CarbonProperties.getInstance().addProperty(CarbonCommonConstants.ENABLE_AUTO_LOAD_MERGE,
	      CarbonCommonConstants.DEFAULT_ENABLE_AUTO_LOAD_MERGE)
	  }


##解决方案：

	org.apache.carbondata.core.util.DataTypeUtil#getBytesBasedOnDataTypeForNoDictionaryColumn
中写成了

	case BOOLEAN:
        return ByteUtil.toBytes(Boolean.parseBoolean(dimensionValue));
会将“tr”转换成false，就出现了上面的情况

主要是设置sort_columns之后会用NonDictionaryFieldConverterImpl进行处理

	org.apache.carbondata.processing.newflow.converter.impl.FieldEncoderFactory#createFieldEncoder
执行：

	return new NonDictionaryFieldConverterImpl(dataField, nullFormat, index, isEmptyBadRecord);
关键转换：

	org.apache.carbondata.processing.newflow.converter.impl.NonDictionaryFieldConverterImpl#convert

改成：

      case BOOLEAN:
        return ByteUtil.toBytes(BooleanConvert.parseBoolean(dimensionValue));

即可