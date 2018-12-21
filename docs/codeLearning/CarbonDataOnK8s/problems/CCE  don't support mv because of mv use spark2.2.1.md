## History

	30 rows selected (1.866 seconds)
	0: jdbc:hive2://172.31.0.8:10000> show tables;
	+-----------+-------------+--------------+--+
	| database  |  tableName  | isTemporary  |
	+-----------+-------------+--------------+--+
	| default   | main_table  | false        |
	| default   | mv1_table   | false        |
	+-----------+-------------+--------------+--+
	2 rows selected (0.033 seconds)
	0: jdbc:hive2://172.31.0.8:10000> drop datamap mv1;
	+---------+--+
	| Result  |
	+---------+--+
	+---------+--+
	No rows selected (8.236 seconds)
	0: jdbc:hive2://172.31.0.8:10000> show tables;
	+-----------+-------------+--------------+--+
	| database  |  tableName  | isTemporary  |
	+-----------+-------------+--------------+--+
	| default   | main_table  | false        |
	+-----------+-------------+--------------+--+
	1 row selected (0.035 seconds)
	0: jdbc:hive2://172.31.0.8:10000>  create datamap mv2 using 'mv' as select shortField, stringField from main_table;
	Error: java.lang.NoClassDefFoundError: org/apache/spark/sql/catalyst/catalog/HiveTableRelation (state=,code=0)
	0: jdbc:hive2://172.31.0.8:10000> select * from mv2_table;
	Error: java.lang.NoClassDefFoundError: org/apache/spark/sql/catalyst/catalog/HiveTableRelation (state=,code=0)
	0: jdbc:hive2://172.31.0.8:10000> refresh datamap mv2;
