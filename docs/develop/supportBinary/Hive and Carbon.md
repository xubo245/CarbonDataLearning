## code
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

CREATE TABLE IF NOT EXISTS hivetable3 (
    id int,
    label boolean,
    name string,
    image binary,
    autoLabel boolean)
 row format delimited fields terminated by '|'

