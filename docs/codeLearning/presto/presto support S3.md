	
	CREATE TABLE LINEITEM(L_ORDERKEY BIGINT,L_PARTKEY BIGINT,L_SUPPKEY BIGINT, L_LINENUMBER INTEGER, L_QUANTITY DECIMAL,L_EXTENDEDPRICE DECIMAL,L_DISCOUNT DECIMAL,L_TAX	 DECIMAL,L_RETURNFLAG STRING,L_LINESTATUS STRING,L_SHIPDATE DATE, L_COMMITDATE DATE,L_RECEIPTDATE DATE,L_SHIPINSTRUCT STRING,L_SHIPMODE STRING,L_COMMENT STRING) stored as carbondata;
	
	
	CREATE TABLE LINEITEM2(L_ORDERKEY BIGINT,L_PARTKEY BIGINT,L_SUPPKEY BIGINT, L_LINENUMBER INTEGER, L_QUANTITY DECIMAL,L_EXTENDEDPRICE DECIMAL(10,3),L_DISCOUNT DECIMAL(10,3),L_TAX	 DECIMAL(10,3),L_RETURNFLAG STRING,L_LINESTATUS STRING,L_SHIPDATE DATE, L_COMMITDATE DATE,L_RECEIPTDATE DATE,L_SHIPINSTRUCT STRING,L_SHIPMODE STRING,L_COMMENT STRING) stored as carbondata;
	
	LOAD DATA LOCAL INPATH 's3a://carbondata/TPCH/size5G/lineitem.tbl' into table lineitem2 OPTIONS('DELIMITER'='|','HEADER'='false');
	
	
		   LOAD DATA LOCAL INPATH 's3a://carbondata/TPCH/size5G/lineitem100.tbl' into table lineitem2 OPTIONS('DELIMITER'='|','HEADER'='false');
		   
		   
		   
		   create external table lineitem STORED BY 'carbondata' location 's3a://carbondata/presto/default/lineitem';
		   
		   1|775947|38463|1|17|34389.47|0.04|0.02|N|O|1996-03-13|1996-02-12|1996-03-22|DELIVER IN PERSON|TRUCK|egular courts above the|
		   
		   
		   
		   0: jdbc:hive2://127.0.0.1:10000> CREATE TABLE LINEITEM2(L_ORDERKEY BIGINT,L_PARTKEY BIGINT,L_SUPPKEY BIGINT, L_LINENUMBER INTEGER, L_QUANTITY DECIMAL,L_EXTENDEDPRICE DECIMAL(10,3),L_DISCOUNT DECIMAL(10,3),L_TAX DECIMAL(10,3),L_RETURNFLAG STRING,L_LINESTATUS STRING,L_SHIPDATE DATE, L_COMMITDATE DATE,L_RECEIPTDATE DATE,L_SHIPINSTRUCT STRING,L_SHIPMODE STRING,L_COMMENT STRING) stored as carbondata;
+---------+--+
| Result  |
+---------+--+
+---------+--+
No rows selected (2.451 seconds)
0: jdbc:hive2://127.0.0.1:10000> LOAD DATA LOCAL INPATH 's3a://carbondata/TPCH/size5G/lineitem.tbl' into table lineitem2 OPTIONS('DELIMITER'='|','HEADER'='false');
+---------+--+
| Result  |
+---------+--+
+---------+--+
No rows selected (1399.757 seconds)
0: jdbc:hive2://127.0.0.1:10000> Display all 560 possibilities? (y or n)
0: jdbc:hive2://127.0.0.1:10000> select * from lineitem2 limit 10;
+-------------+------------+------------+---------------+-------------+------------------+-------------+--------+---------------+---------------+-------------+---------------+----------------+--------------------+-------------+--------------------------------------+--+
| l_orderkey  | l_partkey  | l_suppkey  | l_linenumber  | l_quantity  | l_extendedprice  | l_discount  | l_tax  | l_returnflag  | l_linestatus  | l_shipdate  | l_commitdate  | l_receiptdate  |   l_shipinstruct   | l_shipmode  |              l_comment               |
+-------------+------------+------------+---------------+-------------+------------------+-------------+--------+---------------+---------------+-------------+---------------+----------------+--------------------+-------------+--------------------------------------+--+
| 1           | 775947     | 38463      | 1             | 17          | 34389.470        | 0.040       | 0.020  | N             | O             | 1996-03-13  | 1996-02-12    | 1996-03-22     | DELIVER IN PERSON  | TRUCK       | egular courts above the              |
| 1           | 336546     | 36547      | 2             | 36          | 56971.080        | 0.090       | 0.060  | N             | O             | 1996-04-12  | 1996-02-28    | 1996-04-20     | TAKE BACK RETURN   | MAIL        | ly final dependencies: slyly bold    |
| 1           | 318499     | 18500      | 3             | 8           | 12139.840        | 0.100       | 0.020  | N             | O             | 1996-01-29  | 1996-03-05    | 1996-01-31     | TAKE BACK RETURN   | REG AIR     | riously. regular, express dep        |
| 1           | 10658      | 23159      | 4             | 28          | 43922.200        | 0.090       | 0.060  | N             | O             | 1996-04-21  | 1996-03-30    | 1996-05-16     | NONE               | AIR         | lites. fluffily even de              |
| 1           | 120134     | 7641       | 5             | 24          | 27699.120        | 0.100       | 0.040  | N             | O             | 1996-03-30  | 1996-03-14    | 1996-04-01     | NONE               | FOB         |  pending foxes. slyly re             |
| 1           | 78173      | 3176       | 6             | 32          | 36837.440        | 0.070       | 0.020  | N             | O             | 1996-01-30  | 1996-02-07    | 1996-02-03     | DELIVER IN PERSON  | MAIL        | arefully slyly ex                    |
| 2           | 530849     | 5870       | 1             | 38          | 71433.160        | 0.000       | 0.050  | N             | O             | 1997-01-28  | 1997-01-14    | 1997-02-02     | TAKE BACK RETURN   | RAIL        | ven requests. deposits breach a      |
| 3           | 21485      | 8986       | 1             | 45          | 63291.600        | 0.060       | 0.000  | R             | F             | 1994-02-02  | 1994-01-04    | 1994-02-23     | NONE               | AIR         | ongside of the furiously brave acco  |
| 3           | 95178      | 32682      | 2             | 49          | 57485.330        | 0.100       | 0.000  | R             | F             | 1993-11-09  | 1993-12-20    | 1993-11-24     | TAKE BACK RETURN   | RAIL        |  unusual accounts. eve               |
| 3           | 642242     | 17267      | 3             | 27          | 31973.670        | 0.060       | 0.070  | A             | F             | 1994-01-16  | 1993-11-22    | 1994-01-23     | DELIVER IN PERSON  | SHIP        | nal foxes wake.                      |
+-------------+------------+------------+---------------+-------------+------------------+-------------+--------+---------------+---------------+-------------+---------------+----------------+--------------------+-------------+--------------------------------------+--+



		   
	0: jdbc:hive2://127.0.0.1:10000> select * from lineitem2 limit 10;
		+-------------+------------+------------+---------------+-------------+------------------+-------------+--------+---------------+---------------+-------------+---------------+----------------+--------------------+-------------+--------------------------------------+--+
		| l_orderkey  | l_partkey  | l_suppkey  | l_linenumber  | l_quantity  | l_extendedprice  | l_discount  | l_tax  | l_returnflag  | l_linestatus  | l_shipdate  | l_commitdate  | l_receiptdate  |   l_shipinstruct   | l_shipmode  |          l_comment               |
		+-------------+------------+------------+---------------+-------------+------------------+-------------+--------+---------------+---------------+-------------+---------------+----------------+--------------------+-------------+--------------------------------------+--+
		| 1           | 775947     | 38463      | 1             | 17          | 34389.470        | 0.040       | 0.020  | N             | O             | 1996-03-13  | 1996-02-12    | 1996-03-22     | DELIVER IN PERSON  | TRUCK       | egular courts above the              |
		| 1           | 336546     | 36547      | 2             | 36          | 56971.080        | 0.090       | 0.060  | N             | O             | 1996-04-12  | 1996-02-28    | 1996-04-20     | TAKE BACK RETURN   | MAIL        | ly final dependencies: slyly bold    |
		| 1           | 318499     | 18500      | 3             | 8           | 12139.840        | 0.100       | 0.020  | N             | O             | 1996-01-29  | 1996-03-05    | 1996-01-31     | TAKE BACK RETURN   | REG AIR     | riously. regular, express dep        |
		| 1           | 10658      | 23159      | 4             | 28          | 43922.200        | 0.090       | 0.060  | N             | O             | 1996-04-21  | 1996-03-30    | 1996-05-16     | NONE               | AIR         | lites. fluffily even de              |
		| 1           | 120134     | 7641       | 5             | 24          | 27699.120        | 0.100       | 0.040  | N             | O             | 1996-03-30  | 1996-03-14    | 1996-04-01     | NONE               | FOB         |  pending foxes. slyly re             |
		| 1           | 78173      | 3176       | 6             | 32          | 36837.440        | 0.070       | 0.020  | N             | O             | 1996-01-30  | 1996-02-07    | 1996-02-03     | DELIVER IN PERSON  | MAIL        | arefully slyly ex                    |
		| 2           | 530849     | 5870       | 1             | 38          | 71433.160        | 0.000       | 0.050  | N             | O             | 1997-01-28  | 1997-01-14    | 1997-02-02     | TAKE BACK RETURN   | RAIL        | ven requests. deposits breach a      |
		| 3           | 21485      | 8986       | 1             | 45          | 63291.600        | 0.060       | 0.000  | R             | F             | 1994-02-02  | 1994-01-04    | 1994-02-23     | NONE               | AIR         | ongside of the furiously brave acco  |
		| 3           | 95178      | 32682      | 2             | 49          | 57485.330        | 0.100       | 0.000  | R             | F             | 1993-11-09  | 1993-12-20    | 1993-11-24     | TAKE BACK RETURN   | RAIL        |  unusual accounts. eve               |
		| 3           | 642242     | 17267      | 3             | 27          | 31973.670        | 0.060       | 0.070  | A             | F             | 1994-01-16  | 1993-11-22    | 1994-01-23     | DELIVER IN PERSON  | SHIP        | nal foxes wake.                      |
		+-------------+------------+------------+---------------+-------------+------------------+-------------+--------+---------------+---------------+-------------+---------------+----------------+--------------------+-------------+--------------------------------------+--+


		   
	 0: jdbc:hive2://127.0.0.1:10000> select count(*) from lineitem2 limit 10;
		+-----------+--+
		| count(1)  |
		+-----------+--+
		| 29999795  |
		+-----------+--+




clean -DskipTests -Pspark-2.3  -Pbuild-with-format -Pskip.findbugs=true  install



root@ecs-909c:/huawei/xubo/tools#  ./presto --server localhost:8086 --catalog carbondata --schema default
presto:default> show tables;
        Table
---------------------
 ae_event_carbon_one
 lineitem
 lineitem2
 sdk
 xubo1
 xubo5
(6 rows)

Query 20181222_032235_00001_82p8t, FINISHED, 1 node
Splits: 19 total, 19 done (100.00%)
0:08 [6 rows, 151B] [0 rows/s, 19B/s]

presto:default> select * from xubo1;
 name
------
 Bob
 Bob
 Bob
 Bob
(4 rows)

Query 20181222_032249_00003_82p8t, FINISHED, 1 node
Splits: 20 total, 20 done (100.00%)
0:10 [4 rows, 48B] [0 rows/s, 4B/s]

presto:default> select * from lineitem2 limit 10;
 l_orderkey | l_partkey | l_suppkey | l_linenumber | l_quantity | l_extendedprice | l_discount | l_tax | l_returnflag | l_linestatus | l_shipdate | l_commitdate | l_receiptd
------------+-----------+-----------+--------------+------------+-----------------+------------+-------+--------------+--------------+------------+--------------+-----------
          1 |    775947 |     38463 |            1 | 17         | 34389.470       | 0.040      | 0.020 | N            | O            | 1996-03-13 | 1996-02-12   | 1996-03-22
          1 |    336546 |     36547 |            2 | 36         | 56971.080       | 0.090      | 0.060 | N            | O            | 1996-04-12 | 1996-02-28   | 1996-04-20
          1 |    318499 |     18500 |            3 | 8          | 12139.840       | 0.100      | 0.020 | N            | O            | 1996-01-29 | 1996-03-05   | 1996-01-31
          1 |     10658 |     23159 |            4 | 28         | 43922.200       | 0.090      | 0.060 | N            | O            | 1996-04-21 | 1996-03-30   | 1996-05-16
          1 |    120134 |      7641 |            5 | 24         | 27699.120       | 0.100      | 0.040 | N            | O            | 1996-03-30 | 1996-03-14   | 1996-04-01
          1 |     78173 |      3176 |            6 | 32         | 36837.440       | 0.070      | 0.020 | N            | O            | 1996-01-30 | 1996-02-07   | 1996-02-03
          2 |    530849 |      5870 |            1 | 38         | 71433.160       | 0.000      | 0.050 | N            | O            | 1997-01-28 | 1997-01-14   | 1997-02-02
          3 |     21485 |      8986 |            1 | 45         | 63291.600       | 0.060      | 0.000 | R            | F            | 1994-02-02 | 1994-01-04   | 1994-02-23
          3 |     95178 |     32682 |            2 | 49         | 57485.330       | 0.100      | 0.000 | R            | F            | 1993-11-09 | 1993-12-20   | 1993-11-24
          3 |    642242 |     17267 |            3 | 27         | 31973.670       | 0.060      | 0.070 | A            | F            | 1994-01-16 | 1993-11-22   | 1994-01-23
(10 rows)




presto:default> select count(*) from lineitem2 limit 10;
  _col0
----------
 29999795
(1 row)

Query 20181222_032433_00005_82p8t, FINISHED, 1 node
Splits: 19 total, 19 done (100.00%)
0:11 [30M rows, 0B] [2.84M rows/s, 0B/s]

presto:default> select l_partkey from lineitem2 limit 10;
 l_partkey
-----------
    775947
    336546
    318499
     10658
    120134
     78173
    530849
     21485
     95178
    642242
(10 rows)

Query 20181222_032500_00006_82p8t, FINISHED, 1 node
Splits: 19 total, 19 done (100.00%)
0:13 [64K rows, 563KB] [5.07K rows/s, 44.6KB/s]

presto:default> select * from xubo1 limit 1;
 name
------
 Bob
(1 row)

Query 20181222_032544_00007_82p8t, FINISHED, 1 node
Splits: 21 total, 19 done (90.48%)
0:03 [2 rows, 24B] [0 rows/s, 6B/s]

presto:default> select l_partkey from lineitem2 where l_partkey=775947 limit 10;
 l_partkey
-----------
    775947
    775947
    775947
    775947
    775947
    775947
    775947
    775947
    775947
    775947
(10 rows)

Query 20181222_032616_00008_82p8t, FINISHED, 1 node
Splits: 19 total, 19 done (100.00%)
0:23 [30M rows, 257MB] [1.3M rows/s, 11.1MB/s]

presto:default>
presto:default>
presto:default> select l_partkey,l_suppkey from lineitem2 where l_partkey=775947 limit 10;
 l_partkey | l_suppkey
-----------+-----------
    775947 |     38463
    775947 |     25948
    775947 |     13493
    775947 |       978
    775947 |       978
    775947 |       978
    775947 |     38463
    775947 |     25948
    775947 |     25948
    775947 |     38463
(10 rows)

Query 20181222_032649_00009_82p8t, FINISHED, 1 node
Splits: 19 total, 19 done (100.00%)
0:27 [30M rows, 264MB] [1.1M rows/s, 9.64MB/s]

presto:default> select l_partkey,l_suppkey from lineitem2 where l_partkey=775947 group by l_suppkey limit 10;
Query 20181222_032947_00010_82p8t failed: line 1:8: 'l_partkey' must be an aggregate expression or appear in GROUP BY clause
select l_partkey,l_suppkey from lineitem2 where l_partkey=775947 group by l_suppkey limit 10

presto:default> select l_partkey,l_suppkey,count(*) from lineitem2 where l_partkey=775947 group by l_suppkey,l_partkey limit 10;
 l_partkey | l_suppkey | _col2
-----------+-----------+-------
    775947 |     38463 |    10
    775947 |       978 |     6
    775947 |     13493 |     1
    775947 |     25948 |     7
(4 rows)

Query 20181222_033026_00011_82p8t, FINISHED, 1 node
Splits: 51 total, 51 done (100.00%)
0:28 [30M rows, 264MB] [1.06M rows/s, 9.34MB/s]

presto:default> select l_partkey,l_suppkey,count(*) from lineitem2 where l_partkey=775947 group by l_suppkey,l_partkey order by l_suppkey limit 10;
 l_partkey | l_suppkey | _col2
-----------+-----------+-------
    775947 |       978 |     6
    775947 |     13493 |     1
    775947 |     25948 |     7
    775947 |     38463 |    10
(4 rows)

Query 20181222_033133_00012_82p8t, FINISHED, 1 node
Splits: 51 total, 51 done (100.00%)
0:27 [30M rows, 264MB] [1.1M rows/s, 9.65MB/s]


select * from (select if(l_partkey=775947) test from carbonTable)qq where test is not null


select * from subquery where id in(select id from subquery where name in(select name from" +
      " subquery where rating=2.0
	  
	  
select * from lineitem2 where l_suppkey in(select l_suppkey from lineitem2 where l_partkey in(select l_partkey from lineitem2 where l_partkey=775947))


presto:default> select * from lineitem2 where l_suppkey in(select l_suppkey from lineitem2 where l_partkey in(select l_partkey from lineitem2 where l_partkey=775947));
 l_orderkey | l_partkey | l_suppkey | l_linenumber | l_quantity | l_extendedprice | l_discount | l_tax | l_returnflag | l_linestatus | l_shipdate | l_commitdate | l_receiptd
------------+-----------+-----------+--------------+------------+-----------------+------------+-------+--------------+--------------+------------+--------------+-----------
      12836 |    663492 |     13493 |            7 | 31         | 45119.260       | 0.040      | 0.070 | N            | O            | 1996-05-11 | 1996-05-27   | 1996-05-30
      26788 |    863428 |     38463 |            2 | 26         | 36175.880       | 0.040      | 0.060 | R            | F            | 1993-04-08 | 1993-05-02   | 1993-04-17
   21106085 |    950909 |     25948 |            2 | 2          | 3919.720        | 0.100      | 0.080 | A            | F            | 1992-12-29 | 1993-01-03   | 1993-01-28
   21108711 |    513447 |       978 |            3 | 6          | 8762.520        | 0.000      | 0.080 | N            | O            | 1998-08-04 | 1998-08-20   | 1998-08-05
   21142337 |    588414 |     25948 |            3 | 17         | 25540.630       | 0.070      | 0.080 | N            | O            | 1996-03-08 | 1996-03-15   | 1996-03-16
   21231875 |     88490 |     13493 |            2 | 18         | 26612.820       | 0.090      | 0.060 | N            | O            | 1998-03-30 | 1998-03-07   | 1998-04-24
   21262404 |    875945 |     38463 |            1 | 43         | 82598.700       | 0.090      | 0.060 | N            | O            | 1996-03-07 | 1996-04-17   | 1996-03-16
   21283525 |    538462 |     38463 |            6 | 49         | 73521.560       | 0.070      | 0.010 | N            | O            | 1996-03-31 | 1996-02-08   | 1996-04-10
   21283808 |    550981 |     13493 |            1 | 20         | 40639.200       | 0.090      | 0.070 | N            | O            | 1995-12-08 | 1996-02-09   | 1995-12-31
   21378659 |    950977 |       978 |            3 | 21         | 42586.530       | 0.080      | 0.030 | R            | F            | 1994-03-15 | 1994-02-19   | 1994-04-09
   21435170 |    225980 |     13493 |            1 | 39         | 74332.830       | 0.060      | 0.040 | N            | O            | 1997-07-06 | 1997-06-27   | 1997-07-26
   21452997 |    675951 |       978 |            1 | 36         | 69369.120       | 0.080      | 0.060 | A            | F            | 1993-07-30 | 1993-05-25   | 1993-08-27
     438244 |    588414 |     25948 |            1 | 29         | 43569.310       | 0.000      | 0.070 | N            | O            | 1997-03-08 | 1997-05-04   | 1997-03-15
     440035 |     13477 |       978 |            3 | 7          | 9733.290        | 0.000      | 0.080 | R            | F            | 1992-07-04 | 1992-05-21   | 1992-07-10
     490789 |    888460 |       978 |            3 | 47         | 68075.740       | 0.060      | 0.070 | A            | F            | 1992-08-26 | 1992-09-01   | 1992-09-10
     507943 |    675951 |       978 |            1 | 7          | 13488.440       | 0.020      | 0.000 | R            | F            | 1993-06-12 | 1993-05-18   | 1993-07-04
     510117 |    488420 |     25948 |            2 | 15         | 21126.000       | 0.030      | 0.050 | R            | F            | 1993-06-28 | 1993-06-05   | 1993-07-10
     833152 |    325947 |     25948 |            2 | 38         | 74971.340       | 0.040      | 0.050 | N            | O            | 1998-06-28 | 1998-07-01   | 1998-07-08
    1323011 |    350977 |       978 |            1 | 2          | 4055.920        | 0.070      | 0.060 | N            | O            | 1995-07-24 | 1995-05-16   | 1995-07-26
    1330631 |    363456 |       978 |            6 | 14         | 21272.160       | 0.040      | 0.040 | A            | F            | 1992-11-11 | 1992-11-14   | 1992-11-14
    1336000 |    350933 |     25948 |            1 | 17         | 33726.640       | 0.040      | 0.010 | N            | O            | 1996-04-09 | 1996-04-11   | 1996-04-23
    1356259 |    538417 |     25948 |            3 | 5          | 7276.950        | 0.080      | 0.050 | R            | F            | 1994-02-22 | 1994-03-13   | 1994-02-25
   23341635 |    613441 |       978 |            1 | 40         | 54176.400       | 0.090      | 0.060 | N            | O            | 1997-05-09 | 1997-04-03   | 1997-05-16
   23347911 |    363456 |       978 |            6 | 21         | 31908.240       | 0.000      | 0.020 | N            | O            | 1996-04-23 | 1996-03-14   | 1996-05-12
   23350084 |    125947 |     25948 |            2 | 26         | 51296.440       | 0.020      | 0.030 | A            | F            | 1992-12-08 | 1992-11-15   | 1992-12-26
   23350690 |    563436 |     25948 |            3 | 6          | 8996.460        | 0.000      | 0.020 | N            | O            | 1998-05-04 | 1998-03-14   | 1998-05-14
   23363874 |    963492 |     13493 |            7 | 19         | 29553.550       | 0.060      | 0.040 | R            | F            | 1995-03-15 | 1995-02-07   | 1995-04-04
   25738375 |     38492 |     13493 |            2 | 4          | 5721.960        | 0.050      | 0.050 | N            | O            | 1997-06-07 | 1997-04-20   | 1997-06-18
   25746784 |    950977 |       978 |            1 | 16         | 32446.880       | 0.040      | 0.070 | N            | O            | 1995-12-19 | 1995-10-23   | 1996-01-16
   25758503 |    325974 |     13493 |            2 | 28         | 55998.880       | 0.020      | 0.020 | N            | O            | 1997-04-21 | 1997-03-20   | 1997-04-22
    4977569 |    375947 |     25948 |            3 | 21         | 42481.530       | 0.100      | 0.050 | A            | F            | 1994-07-09 | 1994-05-16   | 1994-07-31
    5765281 |    413453 |       978 |            3 | 38         | 51924.340       | 0.020      | 0.000 | R            | F            | 1992-11-08 | 1992-09-27   | 1992-11-10
    5776225 |    913429 |     25948 |            2 | 42         | 60579.960       | 0.030      | 0.060 | R            | F            | 1992-11-12 | 1992-11-12   | 1992-11-18
    5783328 |    188474 |       978 |            6 | 48         | 74998.560       | 0.070      | 0.080 | N            | O            | 1996-09-18 | 1996-11-04   | 1996-09-28
    6824934 |    263492 |     13493 |            4 | 25         | 36387.000       | 0.010      | 0.020 | N            | O            | 1997-02-15 | 1997-03-19   | 1997-03-01
    9110854 |    113492 |     13493 |            1 | 26         | 39142.740       | 0.090      | 0.020 | N            | O            | 1996-12-29 | 1996-11-26   | 1997-01-22
    9112582 |    250987 |     13493 |            3 | 27         | 52325.190       | 0.020      | 0.050 | A            | F            | 1994-05-14 | 1994-06-14   | 1994-06-07
   10437671 |    175947 |     25948 |            4 | 34         | 68779.960       | 0.050      | 0.040 | N            | O            | 1996-06-08 | 1996-06-02   | 1996-06-28
   10458883 |    388478 |     13493 |            1 | 13         | 20363.980       | 0.040      | 0.020 | A            | F            | 1994-05-24 | 1994-03-18   | 1994-05-26
   11973761 |    400977 |       978 |            1 | 8          | 15023.600       | 0.050      | 0.030 | A            | F            | 1994-08-30 | 1994-09-30   | 1994-09-03
   12317505 |    538417 |     25948 |            5 | 9          | 13098.510       | 0.060      | 0.040 | N            | O            | 1996-07-26 | 1996-07-11   | 1996-08-22
   12317637 |    250987 |     13493 |            3 | 30         | 58139.100       | 0.040      | 0.020 | N            | O            | 1997-06-28 | 1997-05-05   | 1997-07-15
   13266498 |    213492 |     13493 |            5 | 9          | 12649.320       | 0.030      | 0.020 | A            | F            | 1992-06-16 | 1992-05-31   | 1992-07-09
   13832133 |    763432 |     38463 |            1 | 27         | 40375.800       | 0.060      | 0.000 | N            | O            | 1995-12-28 | 1995-10-05   | 1996-01-25
   13835264 |    250937 |     25948 |            4 | 47         | 88732.240       | 0.010      | 0.070 | N            | O            | 1998-09-21 | 1998-09-21   | 1998-10-08
   14151910 |    625947 |     25948 |            3 | 36         | 67424.760       | 0.060      | 0.050 | N            | O            | 1997-08-19 | 1997-10-13   | 1997-09-02
   15322469 |    163444 |     25948 |            5 | 23         | 34671.120       | 0.020      | 0.020 | R            | F            | 1994-09-30 | 1994-11-18   | 1994-10-07
   17384773 |    500977 |       978 |            2 | 29         | 57360.550       | 0.060      | 0.020 | N            | O            | 1996-12-24 | 1996-11-08   | 1997-01-11
   17386849 |    850913 |     25948 |            3 | 20         | 37277.400       | 0.030      | 0.070 | R            | F            | 1992-10-14 | 1992-12-18   | 1992-10-24
   17407876 |    213443 |     25948 |            2 | 9          | 12207.870       | 0.080      | 0.040 | R            | F            | 1994-09-14 | 1994-10-20   | 1994-09-25
   17410661 |    738463 |       978 |            1 | 30         | 45042.900       | 0.010      | 0.000 | N            | O            | 1996-07-07 | 1996-05-02   | 1996-07-13
   18956866 |    438476 |     13493 |            4 | 39         | 55163.550       | 0.030      | 0.000 | N            | O            | 1995-10-30 | 1995-11-23   | 1995-11-04
   19334496 |    588414 |     25948 |            3 | 17         | 25540.630       | 0.030      | 0.070 | N            | O            | 1997-04-02 | 1997-03-04   | 1997-04-11
      33062 |    163444 |     25948 |            5 | 5          | 7537.200        | 0.010      | 0.060 | N            | O            | 1996-03-26 | 1996-03-18   | 1996-04-07
      47075 |    138488 |     13493 |            1 | 27         | 41214.960       | 0.100      | 0.080 | N            | O            | 1996-01-11 | 1995-11-24   | 1996-01-31
(query aborted by user)

Query 20181222_034533_00013_82p8t, FINISHED, 1 node
Splits: 88 total, 88 done (100.00%)
2:51 [90M rows, 4.16GB] [525K rows/s, 24.8MB/s]

presto:default> select * from lineitem2 where l_suppkey in(select l_suppkey from lineitem2 where l_partkey in(select l_partkey from lineitem2 where l_orderkey=1)) limit 10;
 l_orderkey | l_partkey | l_suppkey | l_linenumber | l_quantity | l_extendedprice | l_discount | l_tax | l_returnflag | l_linestatus | l_shipdate | l_commitdate | l_receiptd
------------+-----------+-----------+--------------+------------+-----------------+------------+-------+--------------+--------------+------------+--------------+-----------
      10471 |    455990 |     18500 |            2 | 35         | 68108.950       | 0.020      | 0.050 | A            | F            | 1992-10-11 | 1992-12-09   | 1992-11-08
      11203 |    355990 |     43512 |            1 | 39         | 79793.220       | 0.050      | 0.060 | N            | O            | 1996-09-06 | 1996-07-31   | 1996-09-29
      29382 |    574035 |     36547 |            2 | 20         | 22180.200       | 0.080      | 0.000 | R            | F            | 1993-12-08 | 1994-01-02   | 1994-01-05
   21168162 |     88476 |       978 |            3 | 34         | 49791.980       | 0.080      | 0.080 | N            | O            | 1998-06-13 | 1998-05-15   | 1998-06-17
      32613 |    824030 |     36547 |            5 | 30         | 28619.700       | 0.030      | 0.040 | N            | O            | 1996-02-28 | 1996-02-17   | 1996-03-23
      32967 |    286548 |     11559 |            5 | 46         | 70588.380       | 0.030      | 0.050 | N            | O            | 1998-05-11 | 1998-05-10   | 1998-05-15
      33062 |    163444 |     25948 |            5 | 5          | 7537.200        | 0.010      | 0.060 | N            | O            | 1996-03-26 | 1996-03-18   | 1996-04-07
      34567 |    273148 |     48159 |            5 | 7          | 7847.910        | 0.090      | 0.040 | A            | F            | 1994-08-23 | 1994-06-25   | 1994-09-02
      48225 |    520134 |     20135 |            1 | 11         | 12695.210       | 0.050      | 0.060 | N            | O            | 1996-02-09 | 1996-03-28   | 1996-03-07
      49154 |    185658 |     35659 |            5 | 33         | 57540.450       | 0.060      | 0.070 | A            | F            | 1994-03-16 | 1994-05-30   | 1994-03-22
(10 rows)

Query 20181222_034848_00014_82p8t, FINISHED, 1 node
Splits: 88 total, 88 done (100.00%)
2:58 [60M rows, 4.15GB] [337K rows/s, 23.8MB/s]



CREATE TABLE CUSTOMER ( C_CUSTKEY INTEGER,C_NAME STRING,C_ADDRESS STRING,C_NATIONKEY INTEGER,C_PHONE STRING,C_ACCTBAL DECIMAL(15,2),C_MKTSEGMENT STRING,C_COMMENT STRING) STORED BY 'carbondata';

 LOAD DATA LOCAL INPATH 's3a://carbondata/TPCH/size5G/customer.tbl' into table CUSTOMER OPTIONS('DELIMITER'='|','HEADER'='false');
 
 0: jdbc:hive2://127.0.0.1:10000> CREATE TABLE CUSTOMER ( C_CUSTKEY INTEGER,C_NAME STRING,C_ADDRESS STRING,C_NATIONKEY INTEGER,C_PHONE STRING,C_ACCTBAL DECIMAL(15,2),C_MKTSEGMENT STRING,C_COMMENT STRING) STORED BY 'carbondata';
+---------+--+
| Result  |
+---------+--+
+---------+--+
No rows selected (7.076 seconds)
0: jdbc:hive2://127.0.0.1:10000>  LOAD DATA LOCAL INPATH 's3a://carbondata/TPCH/size5G/customer.tbl' into table CUSTOMER OPTIONS('DELIMITER'='|','HEADER'='false');
+---------+--+
| Result  |
+---------+--+
+---------+--+
No rows selected (109.666 seconds)
0: jdbc:hive2://127.0.0.1:10000> select * from customer limit 10;
+------------+---------------------+----------------------------------------+--------------+------------------+------------+---------------+--------------------------------------------------------------------------------------------------------------------+--+
| c_custkey  |       c_name        |               c_address                | c_nationkey  |     c_phone      | c_acctbal  | c_mktsegment  |                                                     c_comment                                                      |
+------------+---------------------+----------------------------------------+--------------+------------------+------------+---------------+--------------------------------------------------------------------------------------------------------------------+--+
| 1          | Customer#000000001  | IVhzIApeRb ot,c,E                      | 15           | 25-989-741-2988  | 711.56     | BUILDING      | to the even, regular platelets. regular, ironic epitaphs nag e                                                     |
| 2          | Customer#000000002  | XSTf4,NCwDVaWNe6tEgvwfmRchLXak         | 13           | 23-768-687-3665  | 121.65     | AUTOMOBILE    | l accounts. blithely ironic theodolites integrate boldly: caref                                                    |
| 3          | Customer#000000003  | MG9kdTD2WBHm                           | 1            | 11-719-748-3364  | 7498.12    | AUTOMOBILE    |  deposits eat slyly ironic, even instructions. express foxes detect slyly. blithely even accounts abov             |
| 4          | Customer#000000004  | XxVSJsLAGtn                            | 4            | 14-128-190-5944  | 2866.83    | MACHINERY     |  requests. final, regular ideas sleep final accou                                                                  |
| 5          | Customer#000000005  | KvpyuHCplrB84WgAiGV6sYpZq7Tj           | 3            | 13-750-942-6364  | 794.47     | HOUSEHOLD     | n accounts will have to unwind. foxes cajole accor                                                                 |
| 6          | Customer#000000006  | sKZz0CsnMD7mp4Xd0YrBvx,LREYKUWAh yVn   | 20           | 30-114-968-4951  | 7638.57    | AUTOMOBILE    | tions. even deposits boost according to the slyly bold packages. final accounts cajole requests. furious           |
| 7          | Customer#000000007  | TcGe5gaZNgVePxU5kRrvXBfkasDTea         | 18           | 28-190-982-9759  | 9561.95    | AUTOMOBILE    | ainst the ironic, express theodolites. express, even pinto beans among the exp                                     |
| 8          | Customer#000000008  | I0B10bB0AymmC, 0PrRYBCP1yGJ8xcBPmWhl5  | 17           | 27-147-574-9335  | 6819.74    | BUILDING      | among the slyly regular theodolites kindle blithely courts. carefully even theodolites haggle slyly along the ide  |
| 9          | Customer#000000009  | xKiAFTjUsCuxfeleNqefumTrjS             | 8            | 18-338-906-3675  | 8324.07    | FURNITURE     | r theodolites according to the requests wake thinly excuses: pending requests haggle furiousl                      |
| 10         | Customer#000000010  | 6LrEaV6KR6PLVcgl2ArL Q3rqzLzcT1 v2     | 5            | 15-741-346-9870  | 2753.54    | HOUSEHOLD     | es regular deposits haggle. fur                                                                                    |
+------------+---------------------+----------------------------------------+--------------+------------------+------------+---------------+--------------------------------------------------------------------------------------------------------------------+--+
10 rows selected (13.581 seconds)
0: jdbc:hive2://127.0.0.1:10000> select count(*) from customer limit 10;
+-----------+--+
| count(1)  |
+-----------+--+
| 750000    |
+-----------+--+
1 row selected (6.805 seconds)


CREATE TABLE ORDERS(O_ORDERKEY INTEGER , O_CUSTKEY INTEGER , O_ORDERSTATUS STRING , O_TOTALPRICE     DECIMAL(15,2) , O_ORDERDATE      DATE , O_ORDERPRIORITY  STRING ,   O_CLERK STRING ,  O_SHIPPRIORITY   INTEGER , O_COMMENT STRING ) STORED BY 'carbondata';
						   
select count(*) from ORDERS limit 10;		
		   
		  
0: jdbc:hive2://127.0.0.1:10000> CREATE TABLE ORDERS(O_ORDERKEY INTEGER , O_CUSTKEY INTEGER , O_ORDERSTATUS STRING , O_TOTALPRICE     DECIMAL(15,2) , O_ORDERDATE      DATE , O_ORDERPRIORITY  STRING ,   O_CLERK STRING ,  O_SHIPPRIORITY   INTEGER , O_COMMENT STRING ) STORED BY 'carbondata';
+---------+--+
| Result  |
+---------+--+
+---------+--+
No rows selected (3.909 seconds)
0: jdbc:hive2://127.0.0.1:10000>  LOAD DATA LOCAL INPATH 's3a://carbondata/TPCH/size5G/orders.tbl' into table ORDERS OPTIONS('DELIMITER'='|','HEADER'='false');
+---------+--+
| Result  |
+---------+--+
+---------+--+
No rows selected (385.16 seconds)
0: jdbc:hive2://127.0.0.1:10000>
0: jdbc:hive2://127.0.0.1:10000>
0: jdbc:hive2://127.0.0.1:10000>
0: jdbc:hive2://127.0.0.1:10000>
0: jdbc:hive2://127.0.0.1:10000> select count(*) from ORDERS limit 10;Display all 560 possibilities? (y or n)
0: jdbc:hive2://127.0.0.1:10000> select count(*) from ORDERS limit 10;
+-----------+--+
| count(1)  |
+-----------+--+
| 7500000   |
+-----------+--+
1 row selected (10.995 seconds)
0: jdbc:hive2://127.0.0.1:10000> select * from ORDERS limit 10;
+-------------+------------+----------------+---------------+--------------+------------------+------------------+-----------------+----------------------------------------------------------------------------+--+
| o_orderkey  | o_custkey  | o_orderstatus  | o_totalprice  | o_orderdate  | o_orderpriority  |     o_clerk      | o_shippriority  |                                 o_comment                                  |
+-------------+------------+----------------+---------------+--------------+------------------+------------------+-----------------+----------------------------------------------------------------------------+--+
| 1           | 184501     | O              | 203010.51     | 1996-01-02   | 5-LOW            | Clerk#000004753  | 0               | nstructions sleep furiously among                                          |
| 2           | 390010     | O              | 75004.81      | 1996-12-01   | 1-URGENT         | Clerk#000004396  | 0               |  foxes. pending accounts at the pending, silent asymptot                   |
| 3           | 616570     | F              | 228570.52     | 1993-10-14   | 5-LOW            | Clerk#000004772  | 0               | sly final accounts boost. carefully regular ideas cajole carefully. depos  |
| 4           | 683881     | O              | 35015.50      | 1995-10-11   | 5-LOW            | Clerk#000000617  | 0               | sits. slyly regular warthogs cajole. regular, regular theodolites acro     |
| 5           | 222424     | F              | 151840.11     | 1994-07-30   | 5-LOW            | Clerk#000004624  | 0               | quickly. bold deposits sleep slyly. packages use slyly                     |
| 6           | 278111     | F              | 41236.87      | 1992-02-21   | 4-NOT SPECIFIED  | Clerk#000000290  | 0               | ggle. special, final requests are against the furiously specia             |
| 7           | 195673     | O              | 250593.17     | 1996-01-10   | 2-HIGH           | Clerk#000002349  | 0               | ly special requests                                                        |
| 32          | 650285     | O              | 152975.54     | 1995-07-16   | 2-HIGH           | Clerk#000003079  | 0               | ise blithely bold, regular requests. quickly unusual dep                   |
| 33          | 334790     | F              | 170291.54     | 1993-10-27   | 3-MEDIUM         | Clerk#000002043  | 0               | uriously. furiously final request                                          |
| 34          | 305002     | O              | 56450.43      | 1998-07-21   | 3-MEDIUM         | Clerk#000001114  | 0               | ly final packages. fluffily final deposits wake blithely ideas. spe        |
+-------------+------------+----------------+---------------+--------------+------------------+------------------+-----------------+----------------------------------------------------------------------------+--+
10 rows selected (19.242 seconds)



select
	c_count,
	count(*) as custdist
from
	(
		select
			c_custkey,
			count(o_orderkey)
		from
			customer left outer join orders on
				c_custkey = o_custkey
				and o_comment not like '%:1%:2%'
		group by
			c_custkey
	) as c_orders (c_custkey, c_count)
group by
	c_count
order by
	custdist desc,
	c_count desc;
	
	presto:default> select c_count, count(*) as custdist from ( select c_custkey, count(o_orderkey) from customer left outer join orders on c_custkey = o_custkey and o_comment not like '%:1%:2%' group by c_custkey ) as c_orders (c_custkey, c_count) group by c_count order by custdist desc, c_count desc;
 c_count | custdist
---------+----------
       0 |   250011
      10 |    32817
       9 |    32110
      11 |    31084
       8 |    28595
      12 |    28063
      13 |    25075
      19 |    22880
      18 |    22804
      20 |    22658
       7 |    22583
      14 |    22516
      17 |    22406
      16 |    21560
      15 |    21433
      21 |    21401
      22 |    19162
      23 |    16645
       6 |    15755
      24 |    14298
      25 |    11152
       5 |     9525
      26 |     8538
      27 |     6441
       4 |     4802
      28 |     4610
      29 |     3112
      30 |     2094
       3 |     1861
      31 |     1355
      32 |      807
       2 |      567
      33 |      514
      34 |      288
      35 |      189
      36 |      102
       1 |       93
      37 |       47
      38 |       29
      39 |       14
      43 |        2
      40 |        2
(42 rows)

Query 20181222_042153_00003_67tih, FINISHED, 1 node
Splits: 116 total, 116 done (100.00%)
0:49 [8.25M rows, 457MB] [170K rows/s, 9.4MB/s]


select
	c_name,
	c_custkey,
	o_orderkey,
	o_orderdate,
	o_totalprice,
	sum(l_quantity)
from
	customer,
	orders,
	lineitem
where
	o_orderkey in (
		select
			l_orderkey
		from
			lineitem
		group by
			l_orderkey having
				sum(l_quantity) > 1
	)
	and c_custkey = o_custkey
	and o_orderkey = l_orderkey
group by
	c_name,
	c_custkey,
	o_orderkey,
	o_orderdate,
	o_totalprice
order by
	o_totalprice desc,
	o_orderdate;

	
	presto:default> select c_name, c_custkey, o_orderkey, o_orderdate, o_totalprice, sum(l_quantity) from customer, orders, lineitem where o_orderkey in ( select l_orderkey from lineitem group by l_orderkey having sum(l_quantity) > 1 ) and c_custkey = o_custkey and o_orderkey = l_orderkey group by c_name, c_custkey, o_orderkey, o_orderdate, o_totalprice order by o_totalprice desc, o_orderdate limit 10;
       c_name       | c_custkey | o_orderkey | o_orderdate | o_totalprice | _col5
--------------------+-----------+------------+-------------+--------------+-------
 Customer#000333941 |    333941 |    2199712 | 1996-09-30  | 569370.40    | 327
 Customer#000565334 |    565334 |   18869634 | 1995-01-10  | 565520.21    | 310
 Customer#000466960 |    466960 |    5200102 | 1997-01-22  | 550628.34    | 304
 Customer#000322406 |    322406 |    2745894 | 1996-07-04  | 549127.10    | 304
 Customer#000185383 |    185383 |   16089345 | 1996-07-09  | 539520.20    | 305
 Customer#000546893 |    546893 |    5746311 | 1996-10-10  | 538443.24    | 302
 Customer#000654188 |    654188 |   28077922 | 1996-10-27  | 537859.01    | 319
 Customer#000183092 |    183092 |    4806726 | 1995-01-17  | 537776.40    | 328
 Customer#000151676 |    151676 |   25243237 | 1996-06-30  | 535367.43    | 315
 Customer#000106226 |    106226 |   23245603 | 1994-11-22  | 531353.33    | 321
(10 rows)

Query 20181222_063523_00008_gtreq, FINISHED, 1 node
Splits: 216 total, 216 done (100.00%)
1:51 [68.2M rows, 1.19GB] [612K rows/s, 11MB/s]

presto:default> select l_partkey,l_suppkey from lineitem2 having l_partkey in (775947) limit 10;
 l_partkey | l_suppkey
-----------+-----------
    775947 |     38463
    775947 |     25948
    775947 |     13493
    775947 |       978
    775947 |       978
    775947 |       978
    775947 |     38463
    775947 |     25948
    775947 |     25948
    775947 |     38463
(10 rows)

Query 20181222_063740_00009_gtreq, FINISHED, 1 node
Splits: 19 total, 19 done (100.00%)
0:40 [30M rows, 264MB] [742K rows/s, 6.52MB/s]








