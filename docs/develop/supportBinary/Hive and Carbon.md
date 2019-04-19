 
## CarbonData DataSource
```
 0: jdbc:hive2://127.0.0.1:10000> create table binarytable2(name string, image binary) using carbon;
+---------+--+
| Result  |
+---------+--+
+---------+--+
No rows selected (0.139 seconds)
0: jdbc:hive2://127.0.0.1:10000> insert into binarytable2 values('Bob','binary');
+---------+--+
| Result  |
+---------+--+
+---------+--+
No rows selected (0.359 seconds)
0: jdbc:hive2://127.0.0.1:10000> select * from binarytable2;
+-------+---------+--+
| name  |  image  |
+-------+---------+--+
| Bob   | binary  |
+-------+---------+--+
1 row selected (0.077 seconds)
```
###Hive

```
0: jdbc:hive2://127.0.0.1:10000> Create table htable(name string, image binary);
+---------+--+
| Result  |
+---------+--+
+---------+--+
No rows selected (0.075 seconds)
0: jdbc:hive2://127.0.0.1:10000> insert into htable values('Bob','binary')
0: jdbc:hive2://127.0.0.1:10000> ;
+---------+--+
| Result  |
+---------+--+
+---------+--+
No rows selected (0.342 seconds)
0: jdbc:hive2://127.0.0.1:10000> select * from htable;
+-------+---------+--+
| name  |  image  |
+-------+---------+--+
| Bob   | binary  |
+-------+---------+--+
1 row selected (0.091 seconds)
```

## CarbonSession

#### with \u0001 before binary and \u0002 after binary(binarystringdata.csv)
```
CREATE TABLE IF NOT EXISTS carbontable (
    id int,
    label boolean,
    name string,
    image binary,
    autoLabel boolean)
 STORED BY 'carbondata';
 
 LOAD DATA LOCAL INPATH '/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/resources/binarystringdata.csv' INTO TABLE carbontable OPTIONS('header'='false','DELIMITER'='|');
 
0: jdbc:hive2://127.0.0.1:10000> select * from carbontable3;
+-----+--------+--------+--------------+------------+--+
| id  | label  |  name  |    image     | autolabel  |
+-----+--------+--------+--------------+------------+--+
| 2   | false  | 2.png  | history    | true       |
| 3   | false  | 3.png  | biology    | false      |
| 1   | true   | 1.png  | education  | true       |
+-----+--------+--------+--------------+------------+--+
3 rows selected (0.134 seconds)

```
#### without \u0001 before binary and \u0002 after binary(binarystringdata2.csv)
```
0: jdbc:hive2://127.0.0.1:10000>  LOAD DATA LOCAL INPATH '/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/resources/binarystringdata2.csv' INTO TABLE carbontable OPTIONS('header'='false','DELIMITER'='|');
+---------+--+
| Result  |
+---------+--+
+---------+--+
No rows selected (0.168 seconds)
0: jdbc:hive2://127.0.0.1:10000> select * from carbontable;
+-----+--------+--------+--------------+------------+--+
| id  | label  |  name  |    image     | autolabel  |
+-----+--------+--------+--------------+------------+--+
| 2   | false  | 2.png  | history    | true       |
| 3   | false  | 3.png  | biology    | false      |
| 1   | true   | 1.png  | education  | true       |
| 2   | false  | 2.png  | binary       | true       |
| 3   | false  | 3.png  | biology      | false      |
| 1   | true   | 1.png  | education    | true       |
+-----+--------+--------+--------------+------------+--+
6 rows selected (0.068 seconds)
0: jdbc:hive2://127.0.0.1:10000> 

```

###Hive 
#### with \u0001 before binary and \u0002 after binary(binarystringdata.csv)
```
 CREATE TABLE IF NOT EXISTS hivetable (
    id int,
    label boolean,
    name string,
    image binary,
    autoLabel boolean)
 row format delimited fields terminated by '|';
 
 LOAD DATA LOCAL INPATH '/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/resources/binarystringdata.csv' INTO TABLE hivetable
 
 0: jdbc:hive2://127.0.0.1:10000> select * from hivetable;
+-----+--------+--------+--------------+------------+--+
| id  | label  |  name  |    image     | autoLabel  |
+-----+--------+--------+--------------+------------+--+
| 2   | false  | 2.png  | history    | true       |
| 3   | false  | 3.png  | biology    | false      |
| 1   | true   | 1.png  | education  | true       |
+-----+--------+--------+--------------+------------+--+
3 rows selected (0.371 seconds)
```
#### without \u0001 before binary and \u0002 after binary(binarystringdata2.csv)
```
0: jdbc:hive2://127.0.0.1:10000>  LOAD DATA LOCAL INPATH '/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/resources/binarystringdata2.csv' INTO TABLE hivetable2;
+---------+--+
| Result  |
+---------+--+
+---------+--+
No rows selected (0.131 seconds)
0: jdbc:hive2://127.0.0.1:10000> select * from hivetable;
+-----+--------+--------+--------------+------------+--+
| id  | label  |  name  |    image     | autoLabel  |
+-----+--------+--------+--------------+------------+--+
| 2   | false  | 2.png  | n)گ          | true       |
| 3   | false  | 3.png  | n*%�
                                      | false      |
| 1   | true   | 1.png  | yۜjب         | true       |
| 2   | false  | 2.png  | history    | true       |
| 3   | false  | 3.png  | biology    | false      |
| 1   | true   | 1.png  | education  | true       |
+-----+--------+--------+--------------+------------+--+
6 rows selected (0.098 seconds)
```

### alter table serde to LazyBinarySerDe
```
hive> ALTER TABLE hivetable SET SERDE 'org.apache.hadoop.hive.serde2.lazybinary.LazyBinarySerDe';
OK
Time taken: 0.049 seconds
hive> desc formatted hivetable;
OK
# col_name            	data_type           	comment             
	 	 
id                  	int                 	                    
label               	boolean             	                    
name                	string              	                    
image               	binary              	                    
autolabel           	boolean             	                    
	 	 
# Detailed Table Information	 	 
Database:           	default             	 
Owner:              	xubo                	 
CreateTime:         	Thu Apr 18 16:11:25 CST 2019	 
LastAccessTime:     	UNKNOWN             	 
Protect Mode:       	None                	 
Retention:          	0                   	 
Location:           	file:/user/hive/warehouse/hivetable	 
Table Type:         	MANAGED_TABLE       	 
Table Parameters:	 	 
	COLUMN_STATS_ACCURATE	false               
	last_modified_by    	xubo                
	last_modified_time  	1555575169          
	numFiles            	1                   
	numRows             	-1                  
	rawDataSize         	-1                  
	totalSize           	81                  
	transient_lastDdlTime	1555575169          
	 	 
# Storage Information	 	 
SerDe Library:      	org.apache.hadoop.hive.serde2.lazybinary.LazyBinarySerDe	 
InputFormat:        	org.apache.hadoop.mapred.TextInputFormat	 
OutputFormat:       	org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat	 
Compressed:         	No                  	 
Num Buckets:        	-1                  	 
Bucket Columns:     	ÄÅ                  	 
Sort Columns:       	ÄÅ                  	 
Storage Desc Params:	 	 
	field.delim         	ö                   
	serialization.format	ö                   
Time taken: 0.053 seconds, Fetched: 38 row(s)
hive> LOAD DATA LOCAL INPATH '/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/resources/binarystringdata2.csv' INTO TABLE hivetable;
Loading data to table default.hivetable
Table default.hivetable stats: ÄnumFiles=2, numRows=0, totalSize=162, rawDataSize=0Å
OK
Time taken: 0.141 seconds
hive> select * from hivetable;
OK
NULL	false	NULL	NULL	false
124	false	NULL	NULL	false
124	NULL	NULL	NULL	false
NULL	false	NULL	NULL	false
124	false	NULL	NULL	false
124	NULL	NULL	NULL	false
Time taken: 0.093 seconds, Fetched: 6 row(s)
hive> ALTER TABLE hivetable SET SERDEPROPERTIES ('field.delim' = 'ö');
OK
Time taken: 0.037 seconds
hive> select * from hivetable;
OK
NULL	false	NULL	NULL	false
124	false	NULL	NULL	false
124	NULL	NULL	NULL	false
NULL	false	NULL	NULL	false
124	false	NULL	NULL	false
124	NULL	NULL	NULL	false
Time taken: 0.091 seconds, Fetched: 6 row(s)
```
 
### create table with LazyBinarySerDe
```

CREATE TABLE IF NOT EXISTS hivetable2 (
  id int,
   label boolean,
  	name string,
   image binary,
   autoLabel boolean)
row format SERDE 'org.apache.hadoop.hive.serde2.lazybinary.LazyBinarySerDe'   WITH SERDEPROPERTIES ('field.delim'='ö');
OK
Time taken: 0.012 seconds
hive>  LOAD DATA LOCAL INPATH '/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/resources/binarystringdata2.csv' INTO TABLE hivetable2;
Loading data to table default.hivetable2
Table default.hivetable2 stats: ÄnumFiles=2, totalSize=156Å
OK
Time taken: 0.121 seconds
hive> select * from hivetable;
OK
NULL	false	NULL	NULL	false
124	false	NULL	NULL	false
124	NULL	NULL	NULL	false
NULL	false	NULL	NULL	false
124	false	NULL	NULL	false
124	NULL	NULL	NULL	false
NULL	false	NULL	NULL	false
124	false	NULL	NULL	false
124	NULL	NULL	NULL	false
Time taken: 0.091 seconds, Fetched: 9 row(s)
hive> 
```
##Cast 
```
0: jdbc:hive2://127.0.0.1:10000> insert into binarytable select 'Jack',cast('carbon' as binary);
+---------+--+
| Result  |
+---------+--+
+---------+--+
No rows selected (0.282 seconds)
0: jdbc:hive2://127.0.0.1:10000> select * from binarytable;
+-------+---------+--+
| name  |  image  |
+-------+---------+--+
| Bob   | binary  |
| Jack  | carbon  |
+-------+---------+--+
2 rows selected (0.077 seconds)
```
## code of problem
```
CREATE TABLE IF NOT EXISTS hivetable (
    id int,
    label boolean,
    name string,
    image binary,
    autoLabel boolean)
 row format delimited fields terminated by ',';
 
 LOAD DATA LOCAL INPATH '/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/resources/binarystringdata.csv' INTO TABLE hivetable
```
## result:
 
	 hive> CREATE TABLE IF NOT EXISTS hivetable (
	    >     id int,
	    >     label boolean,
	    >     name string,
	    >     image binary,
	    >     autoLabel boolean)
	    >  row format delimited fields terminated by ',';
	OK
	Time taken: 0.105 seconds
	hive> LOAD DATA LOCAL INPATH '/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/resources/binarystringdata.csv' INTO TABLE hivetable;
	Loading data to table default.hivetable
	Table default.hivetable stats: ÄnumFiles=1, totalSize=75Å
	OK
	Time taken: 0.142 seconds
	hive> select * from hivetable;
	OK
	2	false	2.png	�e	true
	3	false	3.png		�ۢ	false
	1	true	1.png	J��	true
	Time taken: 0.084 seconds, Fetched: 3 row(s)
	hive> 

no \u0001 and \u0002 in csv.
```
 CREATE TABLE IF NOT EXISTS hivetable2 (
    id int,
    label boolean,
    name string,
    image binary,
    autoLabel boolean)
 row format delimited fields terminated by ','
 
 LOAD DATA LOCAL INPATH '/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/resources/binarydata.csv' INTO TABLE hivetable2
 ```