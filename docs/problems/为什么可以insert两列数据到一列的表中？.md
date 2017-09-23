	
	
	
	
#创建一列的表：
	
	    sql("CREATE TABLE if not exists carbon_table(booleanField BOOLEAN) STORED BY 'carbondata'")
	
##插入两列		
	
	  test("Inserting and selecting table:  create one column boolean table and insert two column"){
	    sql("insert into boolean_one_column values(true,false)")
	    sql("insert into boolean_one_column values(True)")
	    sql("insert into boolean_one_column values(false,true)")
	
	    checkAnswer(
	      sql("select * from boolean_one_column"),
	      Seq(Row(true),Row(true),Row(false))
	    )
	  }

##为什么成功？


