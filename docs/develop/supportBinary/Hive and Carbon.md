 
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

#### with \u0001 before binary and \u0002 after binary
```
CREATE TABLE IF NOT EXISTS carbontable (
    id int,
    label boolean,
    name string,
    image binary,
    autoLabel boolean)
 STORED BY 'carbondata';
 
 LOAD DATA LOCAL INPATH '/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/resources/binarystringdata.csv' INTO TABLE carbontable3 OPTIONS('header'='false','DELIMITER'='|');
 
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
#### without \u0001 before binary and \u0002 after binary
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
#### with \u0001 before binary and \u0002 after binary
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
#### without \u0001 before binary and \u0002 after binary
```
0: jdbc:hive2://127.0.0.1:10000>  LOAD DATA LOCAL INPATH '/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/resources/binarystringdata2.csv' INTO TABLE hivetable;
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