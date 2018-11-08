		localhost:carbondata1 xubo$ 
	localhost:carbondata1 xubo$ 
	localhost:carbondata1 xubo$ beeline -u jdbc:hive2://127.0.0.1:10000
	Connecting to jdbc:hive2://127.0.0.1:10000
	log4j:WARN No appenders could be found for logger (org.apache.hive.jdbc.Utils).
	log4j:WARN Please initialize the log4j system properly.
	log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
	Connected to: Spark SQL (version 2.2.1)
	Driver: Hive JDBC (version 1.2.1.spark2)
	Transaction isolation: TRANSACTION_REPEATABLE_READ
	Beeline version 1.2.1.spark2 by Apache Hive
	0: jdbc:hive2://127.0.0.1:10000> create datamap datamap43 using 'mv' as select name from tt13 ;
	Error: java.lang.ClassNotFoundException: org.apache.carbondata.mv.datamap.MVDataMapProvider (state=,code=0)
	0: jdbc:hive2://127.0.0.1:10000> 
	0: jdbc:hive2://127.0.0.1:10000> 
	0: jdbc:hive2://127.0.0.1:10000> 
	0: jdbc:hive2://127.0.0.1:10000> 
	0: jdbc:hive2://127.0.0.1:10000> localhost:carbondata1 xubo$ beeline -u jdbc:hive2://127.0.0.1:10000
	Connecting to jdbc:hive2://127.0.0.1:10000
	log4j:WARN No appenders could be found for logger (org.apache.hive.jdbc.Utils).
	log4j:WARN Please initialize the log4j system properly.
	log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
	Connected to: Spark SQL (version 2.2.1)
	Driver: Hive JDBC (version 1.2.1.spark2)
	Transaction isolation: TRANSACTION_REPEATABLE_READ
	Beeline version 1.2.1.spark2 by Apache Hive
	0: jdbc:hive2://127.0.0.1:10000> create datamap datamap43 using 'mv' as select name from tt13 ;
	Error: java.lang.ClassNotFoundException: org.apache.carbondata.mv.datamap.MVDataMapProvider (state=,code=0)
	0: jdbc:hive2://127.0.0.1:10000> localhost:carbondata1 xubo$ beeline -u jdbc:hive2://127.0.0.1:10000
	Connecting to jdbc:hive2://127.0.0.1:10000
	log4j:WARN No appenders could be found for logger (org.apache.hive.jdbc.Utils).
	log4j:WARN Please initialize the log4j system properly.
	log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
	Connected to: Spark SQL (version 2.2.1)
	Driver: Hive JDBC (version 1.2.1.spark2)
	Transaction isolation: TRANSACTION_REPEATABLE_READ
	Beeline version 1.2.1.spark2 by Apache Hive
	0: jdbc:hive2://127.0.0.1:10000> create datamap datamap43 using 'mv' as select name from tt13 ;
	Error: org.apache.spark.sql.catalyst.analysis.NoSuchTableException: Table or view 'tt13' not found in database 'default'; (state=,code=0)
	0: jdbc:hive2://127.0.0.1:10000> 
	0: jdbc:hive2://127.0.0.1:10000> 
	0: jdbc:hive2://127.0.0.1:10000> show tables;
	+-----------+------------------+--------------+--+
	| database  |    tableName     | isTemporary  |
	+-----------+------------------+--------------+--+
	| default   | datamap43_table  | false        |
	| default   | tt13             | false        |
	+-----------+------------------+--------------+--+
	2 rows selected (0.385 seconds)
	0: jdbc:hive2://127.0.0.1:10000> drop table tt13;
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (0.508 seconds)
	0: jdbc:hive2://127.0.0.1:10000> show tables;
	+-----------+------------------+--------------+--+
	| database  |    tableName     | isTemporary  |
	+-----------+------------------+--------------+--+
	| default   | datamap43_table  | false        |
	+-----------+------------------+--------------+--+
	1 row selected (0.027 seconds)
	0: jdbc:hive2://127.0.0.1:10000> drop table datamap43_table;
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (0.158 seconds)
	0: jdbc:hive2://127.0.0.1:10000> show tables;
	+-----------+------------+--------------+--+
	| database  | tableName  | isTemporary  |
	+-----------+------------+--------------+--+
	+-----------+------------+--------------+--+
	No rows selected (0.02 seconds)
	0: jdbc:hive2://127.0.0.1:10000> create table tt13 ( name string, age int) stored by 'carbondata';
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (0.129 seconds)
	0: jdbc:hive2://127.0.0.1:10000> insert into tt13 select 'babu',12;
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (1.401 seconds)
	0: jdbc:hive2://127.0.0.1:10000> create datamap datamap43 using 'mv' as select name from tt13 ;
	Error: java.io.IOException: DataMap with name datamap43 already exists in storage (state=,code=0)
	0: jdbc:hive2://127.0.0.1:10000> show tables;
	+-----------+------------------+--------------+--+
	| database  |    tableName     | isTemporary  |
	+-----------+------------------+--------------+--+
	| default   | datamap43_table  | false        |
	| default   | tt13             | false        |
	+-----------+------------------+--------------+--+
	2 rows selected (0.024 seconds)
	0: jdbc:hive2://127.0.0.1:10000> create datamap datamap44 using 'mv' as select name from tt13 ;
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (0.176 seconds)
	0: jdbc:hive2://127.0.0.1:10000> drop table tt13;
	Error: org.apache.carbondata.spark.exception.ProcessMetaDataException: operation failed for default.tt13: Dropping table default.tt13 failed: requirement failed: Datamap datamap43 is not registered. (state=,code=0)
	0: jdbc:hive2://127.0.0.1:10000> show tables;
	+-----------+------------------+--------------+--+
	| database  |    tableName     | isTemporary  |
	+-----------+------------------+--------------+--+
	| default   | datamap44_table  | false        |
	+-----------+------------------+--------------+--+
	1 row selected (0.027 seconds)
	0: jdbc:hive2://127.0.0.1:10000> drop datamap on table tt13;
	Error: org.apache.spark.sql.AnalysisException: == Parse1 ==
	
	no viable alternative at input 'drop datamap'(line 1, pos 5)
	
	== SQL ==
	drop datamap on table tt13
	-----^^^
	
	== Parse2 ==
	[1.17] failure: ``;'' expected but identifier table found
	
	drop datamap on table tt13
	                ^;; (state=,code=0)
	0: jdbc:hive2://127.0.0.1:10000> drop datamap datamap43;
	Error: java.lang.IllegalArgumentException: requirement failed: Datamap datamap43 is not registered. (state=,code=0)
	0: jdbc:hive2://127.0.0.1:10000> show tables;
	+-----------+------------------+--------------+--+
	| database  |    tableName     | isTemporary  |
	+-----------+------------------+--------------+--+
	| default   | datamap44_table  | false        |
	+-----------+------------------+--------------+--+
	1 row selected (0.021 seconds)
	0: jdbc:hive2://127.0.0.1:10000> drop datamap datamap44;
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (0.051 seconds)
	0: jdbc:hive2://127.0.0.1:10000> show tables;
	+-----------+------------+--------------+--+
	| database  | tableName  | isTemporary  |
	+-----------+------------+--------------+--+
	+-----------+------------+--------------+--+
	No rows selected (0.017 seconds)
	0: jdbc:hive2://127.0.0.1:10000> create table tt13 ( name string, age int) stored by 'carbondata';
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (0.091 seconds)
	0: jdbc:hive2://127.0.0.1:10000> insert into tt13 select 'babu',12;
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (0.29 seconds)
	0: jdbc:hive2://127.0.0.1:10000> create datamap datamap44 using 'mv' as select name from tt13 ;
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (0.134 seconds)
	0: jdbc:hive2://127.0.0.1:10000> explain select name from tt13;
	+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	|                                                                                                                 plan                                                                                                                 |
	+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	| == CarbonData Profiler ==
	Table Scan on tt13
	 - total blocklets: 2
	 - filter: none
	 - pruned by Main DataMap
	    - skipped blocklets: 0
	                                                                                             |
	| == Physical Plan ==
	*BatchedScan CarbonDatasourceHadoopRelation [ Database name :default, Table name :tt13, Schema :Some(StructType(StructField(name,StringType,true), StructField(age,IntegerType,true))) ] default.tt13[name#135]  |
	+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	2 rows selected (0.303 seconds)
	0: jdbc:hive2://127.0.0.1:10000> rebuild datamap datamap43;
	Error: org.apache.spark.sql.catalyst.analysis.NoSuchTableException: Table or view 'datamap43_table' not found in database 'default'; (state=,code=0)
	0: jdbc:hive2://127.0.0.1:10000> rebuild datamap datamap44;
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (0.507 seconds)
	0: jdbc:hive2://127.0.0.1:10000> explain select name from tt13;
	+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	|                                                                                                                                   plan                                                                                                                                    |
	+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	| == CarbonData Profiler ==
	Table Scan on datamap44_table
	 - total blocklets: 1
	 - filter: none
	 - pruned by Main DataMap
	    - skipped blocklets: 0
	                                                                                                                       |
	| == Physical Plan ==
	*Project [tt13_name#165 AS name#193]
	+- *BatchedScan CarbonDatasourceHadoopRelation [ Database name :default, Table name :datamap44_table, Schema :Some(StructType(StructField(tt13_name,StringType,true))) ] default.datamap44_table[tt13_name#165]  |
	+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	2 rows selected (0.198 seconds)
	0: jdbc:hive2://127.0.0.1:10000> select name from tt13;
	+-------+--+
	| name  |
	+-------+--+
	| NULL  |
	| babu  |
	+-------+--+
	2 rows selected (0.129 seconds)
	0: jdbc:hive2://127.0.0.1:10000> insert into tt13 select 'lal',13;
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (0.324 seconds)
	0: jdbc:hive2://127.0.0.1:10000> select name from tt13;
	+-------+--+
	| name  |
	+-------+--+
	| NULL  |
	| babu  |
	+-------+--+
	2 rows selected (0.15 seconds)
	0: jdbc:hive2://127.0.0.1:10000> explain select name from tt13;explain select name from tt13;
	+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	|                                                                                                                                   plan                                                                                                                                    |
	+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	| == CarbonData Profiler ==
	Table Scan on datamap44_table
	 - total blocklets: 1
	 - filter: none
	 - pruned by Main DataMap
	    - skipped blocklets: 0
	                                                                                                                       |
	| == Physical Plan ==
	*Project [tt13_name#165 AS name#226]
	+- *BatchedScan CarbonDatasourceHadoopRelation [ Database name :default, Table name :datamap44_table, Schema :Some(StructType(StructField(tt13_name,StringType,true))) ] default.datamap44_table[tt13_name#165]  |
	+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	2 rows selected (0.118 seconds)
	+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	|                                                                                                                                   plan                                                                                                                                    |
	+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	| == CarbonData Profiler ==
	Table Scan on datamap44_table
	 - total blocklets: 1
	 - filter: none
	 - pruned by Main DataMap
	    - skipped blocklets: 0
	                                                                                                                       |
	| == Physical Plan ==
	*Project [tt13_name#165 AS name#236]
	+- *BatchedScan CarbonDatasourceHadoopRelation [ Database name :default, Table name :datamap44_table, Schema :Some(StructType(StructField(tt13_name,StringType,true))) ] default.datamap44_table[tt13_name#165]  |
	+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	2 rows selected (0.109 seconds)
	0: jdbc:hive2://127.0.0.1:10000> explain select name from tt13;
	+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	|                                                                                                                                   plan                                                                                                                                    |
	+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	| == CarbonData Profiler ==
	Table Scan on datamap44_table
	 - total blocklets: 1
	 - filter: none
	 - pruned by Main DataMap
	    - skipped blocklets: 0
	                                                                                                                       |
	| == Physical Plan ==
	*Project [tt13_name#165 AS name#246]
	+- *BatchedScan CarbonDatasourceHadoopRelation [ Database name :default, Table name :datamap44_table, Schema :Some(StructType(StructField(tt13_name,StringType,true))) ] default.datamap44_table[tt13_name#165]  |
	+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	2 rows selected (0.113 seconds)
	0: jdbc:hive2://127.0.0.1:10000> insert into tt13 select 'babu',12;
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (0.295 seconds)
	0: jdbc:hive2://127.0.0.1:10000> select name from tt13;
	+-------+--+
	| name  |
	+-------+--+
	| NULL  |
	| babu  |
	+-------+--+
	2 rows selected (0.109 seconds)
	0: jdbc:hive2://127.0.0.1:10000> rebuild datamap datamap43;
	Error: org.apache.spark.sql.catalyst.analysis.NoSuchTableException: Table or view 'datamap43_table' not found in database 'default'; (state=,code=0)
	0: jdbc:hive2://127.0.0.1:10000> rebuild datamap datamap44;
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (0.429 seconds)
	0: jdbc:hive2://127.0.0.1:10000> select name from tt13;
	+-------+--+
	| name  |
	+-------+--+
	| NULL  |
	| babu  |
	| babu  |
	| lal   |
	+-------+--+
	4 rows selected (0.107 seconds)
	0: jdbc:hive2://127.0.0.1:10000> create table test4 ( name string,age int,salary int) stored by 'carbondata';
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (0.076 seconds)
	0: jdbc:hive2://127.0.0.1:10000>  insert into test4 select 'babu',12,12;
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (0.27 seconds)
	0: jdbc:hive2://127.0.0.1:10000>  create datamap mv13 using 'mv' as select name,sum(salary) from test4 group by name;
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (0.2 seconds)
	0: jdbc:hive2://127.0.0.1:10000> rebuild datamap mv13;
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (1.34 seconds)
	0: jdbc:hive2://127.0.0.1:10000> explain select name,sum(salary) from test4 group by name;
	+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	|                                                                                                                                                                                                                                                   plan                                                                                                                                                                                                                                                    |
	+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	| == CarbonData Profiler ==
	Table Scan on mv13_table
	 - total blocklets: 1
	 - filter: none
	 - pruned by Main DataMap
	    - skipped blocklets: 0
	                                                                                                                                                                                                                                                                                                                                                            |
	| == Physical Plan ==
	*HashAggregate(keys=[test4_name#344], functions=[sum(sum_salary#345L)])
	+- Exchange hashpartitioning(test4_name#344, 200)
	   +- *HashAggregate(keys=[test4_name#344], functions=[partial_sum(sum_salary#345L)])
	      +- *BatchedScan CarbonDatasourceHadoopRelation [ Database name :default, Table name :mv13_table, Schema :Some(StructType(StructField(test4_name,StringType,true), StructField(sum_salary,LongType,true))) ] default.mv13_table[test4_name#344,sum_salary#345L]  |
	+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--+
	2 rows selected (0.219 seconds)
	0: jdbc:hive2://127.0.0.1:10000> 
