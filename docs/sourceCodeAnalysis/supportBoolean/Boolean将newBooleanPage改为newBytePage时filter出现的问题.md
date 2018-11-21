	
##问题：
	sql("select * from carbon_table where booleanField = true").show时为空
运行记录：

	+------------+
	|booleanField|
	+------------+
	+------------+
	
	+------------+
	|booleanField|
	+------------+
	|       false|
	|       false|
	|       false|
	|       false|
	+------------+
	
	+------------+
	|booleanField|
	+------------+
	+------------+


	== Physical Plan ==
	*BatchedScan CarbonDatasourceHadoopRelation [ Database name :default, Table name :carbon_table, Schema :Some(StructType(StructField(booleanField,BooleanType,true))) ] default.carbon_table[booleanField#4] PushedFilters: [IsNotNull(booleanField), EqualTo(booleanField,true)]
	== Results ==
	!== Correct Answer - 4 ==   == Spark Answer - 0 ==
	![true]                     
	![true]                     
	![true]                     
	![true]                     
	      
		at org.scalatest.Assertions$class.newAssertionFailedException(Assertions.scala:495)
		at org.scalatest.FunSuite.newAssertionFailedException(FunSuite.scala:1555)
		at org.scalatest.Assertions$class.fail(Assertions.scala:1328)
		at org.scalatest.FunSuite.fail(FunSuite.scala:1555)
		at org.apache.spark.sql.test.util.QueryTest.checkAnswer(QueryTest.scala:74)
		at org.apache.carbondata.spark.testsuite.booleantype.BooleanDataTypesFilterTest$$anonfun$1.apply$mcV$sp(BooleanDataTypesFilterTest.scala:82)
		at org.apache.carbondata.spark.testsuite.booleantype.BooleanDataTypesFilterTest$$anonfun$1.apply(BooleanDataTypesFilterTest.scala:78)
		at org.apache.carbondata.spark.testsuite.booleantype.BooleanDataTypesFilterTest$$anonfun$1.apply(BooleanDataTypesFilterTest.scala:78)
		at org.scalatest.Transformer$$anonfun$apply$1.apply$mcV$sp(Transformer.scala:22)

##问题分析：

debug发现是：

	org.apache.carbondata.core.scan.filter.executer.AndFilterExecuterImpl#applyFilter

rightFilter返回是空：
	  BitSetGroup rightFilter = rightExecuter.applyFilter(blockChunkHolder);
	    if (rightFilter.isEmpty()) {
	      return rightFilter;
	    }

具体执行代码：

	org.apache.carbondata.core.scan.filter.executer.IncludeFilterExecuterImpl#applyFilter

里面的最大最小值有问题

最大值是八位，1写到了最高位，而读是从最低位开始读，所以读出来的是0，即false，所以不对。

最大值写入和读取有问题，不匹配，主要是Byte写入有问题，原来的Boolean没问题



##问题解决：

将org.apache.carbondata.core.util.CarbonUtil#getValueAsBytes中的

	 case BOOLEAN:
	        byte[] bytes = new byte[1];
	        bytes[0] = (byte) value;
	        return bytes;
	      case BYTE:
	        b = ByteBuffer.allocate(8);
	        b.putLong((byte) value);
	        b.flip();
	        return b.array();
改为：

     case BOOLEAN:
      case BYTE:
        byte[] bytes = new byte[1];
        bytes[0] = (byte) value;
        return bytes;