CREATE TABLE mainTable
 (id Int,
 name String,
 city String,
 age Int)
 STORED BY 'org.apache.carbondata.format';
 
 
  LOAD DATA LOCAL INPATH '/Users/xubo/Desktop/xubo/git/carbondata2/integration/spark-common-test/src/test/resources/sample.csv' into table mainTable;
  
  
  create datamap preagg_sum on table mainTable using 'preaggregate' as
 select id,sum(age) from mainTable group by id;
 
 show datamap on table mainTable;