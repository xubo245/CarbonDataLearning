	[36mDiscovery starting.[0m
	[36mDiscovery completed in 23 seconds, 174 milliseconds.[0m
	[36mRun starting. Expected test count is: 1539[0m
	[32mTimestampNoDictionaryColumnTestCase:[0m
	[32m- select projectjoindate, projectenddate from timestamp_nodictionary[0m
	[32m- select projectjoindate, projectenddate from timestamp_nodictionary where in filter[0m
	[32mColumnPropertyValidationTestCase:[0m
	[32m- Validate ColumnProperties_ valid key[0m
	[32m- Validate Dictionary include _ invalid key[0m
	[32mTestLoadDataWithFileHeaderException:[0m
	[32m- test load data both file and ddl without file header exception[0m
	[32m- test load data ddl provided wrong file header exception[0m
	[32m- test load data with wrong header , but without fileheader[0m
	[32m- test load data with wrong header and fileheader[0m
	[32m- test load data with header=false, but without fileheader[0m
	[32m- test load data with header=false and fileheader[0m
	[32m- test load data with header=false and wrong fileheader[0m
	[32m- test load data with header=true, but without fileheader[0m
	[32m- test load data with header=true and fileheader[0m
	[32m- test load data with header=true and wrong fileheader[0m
	[32m- test load data without header and fileheader[0m
	[32m- test load data without header, but with fileheader[0m
	[32mIntegerDataTypeTestCase:[0m
	[32m- select empno from inttypetablesort[0m
	[32mStandardPartitionTableOverwriteTestCase:[0m
	[32m- overwriting static partition table for date partition column on insert query[0m
	[32m- overwriting partition table for date partition column on insert query[0m
	[32m- dynamic and static partition table with load syntax[0m
	[32m- dynamic and static partition table with overwrite [0m
	[32m- overwriting all partition on table and do compaction[0m
	[32m- Test overwrite static partition [0m
	[32m- Test overwrite static partition with wrong int value[0m
	[32m- test insert overwrite on dynamic partition[0m
	[32m- test insert overwrite on static partition[0m
	[32m- overwrite whole partition table with empty data[0m
	[32mDataTypeConverterUtilSuite:[0m
	[32m- test short convert[0m
	[32mTestPreAggCreateCommand:[0m
	[32m- test pre agg create table 1[0m
	[32m- test pre agg create table 2[0m
	[32m- test pre agg create table 3[0m
	[32m- test pre agg create table 4[0m
	[32m- test pre agg create table 5[0m
	[32m- test pre agg create table 6[0m
	[32m- test pre agg create table 7[0m
	[32m- test pre agg create table 8[0m
	[32m- test pre agg create table 9[0m
	[32m- test pre agg create table 10[0m
	[32m- test pre agg create table 11[0m
	[32m- test pre agg create table 12[0m
	[32m- test pre agg create table 13[0m
	[32m- test pre agg create table 14[0m
	[32m- test pre agg create table 15[0m
	[32m- test pre agg create table 16[0m
	[32m- test pre agg create table 17[0m
	[32m- test pre agg create table 18[0m
	[32m- test pre agg create table 19[0m
	[32m- test pre agg create table 20[0m
	[32mDataCompactionBoundaryConditionsTest:[0m
	[32m- check if compaction is completed correctly.[0m
	[32m- check if compaction is completed correctly for one load.[0m
	[32m- check if compaction is completed correctly for multiple load.[0m
	[32mTestLoadDataWithMaxMinBigInt:[0m
	[32m- test carbon table data loading when the bigint column contains min bigint value[0m
	[32m- test carbon table data loading when the bigint column contains max bigint value[0m
	[32m- test carbon table data loading when the bigint column contains min and max bigint value[0m
	[32mDateDataTypeNullDataTest:[0m
	[32m- SELECT max(dateField) FROM timestampTyeNullData where dateField is not null[0m
	[32m- SELECT * FROM timestampTyeNullData where dateField is null[0m
	[32mTestCreateTableWithColumnComment:[0m
	[32m- test create table with column comment[0m
	[32m- test create table with default column comment value[0m
	[32mDoubleDataTypeTestCase:[0m
	[32m- detail query[0m
	[31m- duplicate values *** FAILED ***[0m
	[31m  Results do not match for query:[0m
	[31m  == Parsed Logical Plan ==[0m
	[31m  'Project [*][0m
	[31m  +- 'Filter ('double_column >= 11)[0m
	[31m     +- 'UnresolvedRelation `uniq_carbon`[0m
	  
	[31m  == Analyzed Logical Plan ==[0m
	[31m  name: string, double_column: double[0m
	[31m  Project [name#7764, double_column#7765][0m
	[31m  +- Filter (double_column#7765 >= cast(11 as double))[0m
	[31m     +- SubqueryAlias uniq_carbon[0m
	[31m        +- Relation[name#7764,double_column#7765] CarbonDatasourceHadoopRelation [ Database name :default, Table name :uniq_carbon, Schema :Some(StructType(StructField(name,StringType,true), StructField(double_column,DoubleType,true))) ][0m
	  
	[31m  == Optimized Logical Plan ==[0m
	[31m  CarbonDictionaryCatalystDecoder [CarbonDecoderRelation(Map(name#7764 -> name#7764, double_column#7765 -> double_column#7765),CarbonDatasourceHadoopRelation [ Database name :default, Table name :uniq_carbon, Schema :Some(StructType(StructField(name,StringType,true), StructField(double_column,DoubleType,true))) ])], ExcludeProfile(ArrayBuffer()), CarbonAliasDecoderRelation(), true[0m
	[31m  +- Filter (isnotnull(double_column#7765) && (double_column#7765 >= 11.0))[0m
	[31m     +- Relation[name#7764,double_column#7765] CarbonDatasourceHadoopRelation [ Database name :default, Table name :uniq_carbon, Schema :Some(StructType(StructField(name,StringType,true), StructField(double_column,DoubleType,true))) ][0m
	  
	[31m  == Physical Plan ==[0m
	[31m  *CarbonDictionaryDecoder [CarbonDecoderRelation(Map(name#7764 -> name#7764, double_column#7765 -> double_column#7765),CarbonDatasourceHadoopRelation [ Database name :default, Table name :uniq_carbon, Schema :Some(StructType(StructField(name,StringType,true), StructField(double_column,DoubleType,true))) ])], ExcludeProfile(ArrayBuffer()), CarbonAliasDecoderRelation(), org.apache.spark.sql.CarbonSession@29b52cfd[0m
	[31m  +- *BatchedScan CarbonDatasourceHadoopRelation [ Database name :default, Table name :uniq_carbon, Schema :Some(StructType(StructField(name,StringType,true), StructField(double_column,DoubleType,true))) ] default.uniq_carbon[name#7764,double_column#7765] PushedFilters: [IsNotNull(double_column), GreaterThanOrEqual(double_column,11.0)][0m
	[31m  == Results ==[0m
	[31m  !== Correct Answer - 0 ==   == Spark Answer - 2 ==[0m
	[31m  !                           [a,1.12345674897976E10][0m
	[31m  !                           [b,1.12345674897976E10] (QueryTest.scala:87)[0m
	[32mTestQueryWithoutDataLoad:[0m
	[32m- test query without data load[0m
	[32mTestEmptyRows:[0m
	[32m- select eid from table[0m
	[32m- select Desc from emptyRowTable[0m
	[32m- select count(Desc) from emptyRowTable[0m
	[32m- select count(distinct Desc) from emptyRowTable[0m
	[32mCompactionSupportGlobalSortParameterTest:[0m
	[32m- MINOR, ENABLE_AUTO_LOAD_MERGE: false[0m
	[32m- MINOR, ENABLE_AUTO_LOAD_MERGE: true[0m
	[32m- MINOR, PRESERVE_LATEST_SEGMENTS_NUMBER: 0[0m
	[32m- MINOR, PRESERVE_LATEST_SEGMENTS_NUMBER: 4[0m
	[32m- MINOR, DAYS_ALLOWED_TO_COMPACT: 0[0m
	[32m- MINOR, DAYS_ALLOWED_TO_COMPACT: 4[0m
	[32m- MAJOR, ENABLE_AUTO_LOAD_MERGE: false[0m
	[32m- MAJOR, ENABLE_AUTO_LOAD_MERGE: true[0m
	[32m- MAJOR, PRESERVE_LATEST_SEGMENTS_NUMBER: 0[0m
	[32m- MAJOR, PRESERVE_LATEST_SEGMENTS_NUMBER: 4[0m
	[32m- MAJOR, DAYS_ALLOWED_TO_COMPACT: 0[0m
	[32m- MAJOR, DAYS_ALLOWED_TO_COMPACT: 4[0m
	[32mCompactionSupportGlobalSortBigFileTest:[0m
	[32m- Compaction major:  segments size is bigger than default compaction size[0m
	[32mTestNullAndEmptyFieldsUnsafe:[0m
	[32m- test detail query on column having null values[0m
	[32m- test filter query on column is null[0m
	[32m- test filter query on column is not null[0m
	[32m- test filter query on columnValue=null[0m
	[32m- test filter query where date is null[0m
	[32m- test  subquery on column having null values[0m
	[32m- test  subquery on column having not null values[0m
	[32mCarbonCustomBlockDistributionTest:[0m
	[32m- test block prune query[0m
	[32mTestCreateTableWithSortScope:[0m
	[32m- Do not support load data with specify sort scope[0m
	[32m- test create table with sort scope in normal cases[0m
	[32m- test create table with sort scope in abnormal cases[0m
	[32mTestDataLoadWithColumnsMoreThanSchema:[0m
	[32m- test count(*) to check for data loss[0m
	[32m- test for invalid value of maxColumns[0m
	[32m- test for valid value of maxColumns[0m
	[32m- test with invalid maxColumns value[0m
	[32m- test for maxcolumns option value greater than threshold value for maxcolumns[0m
	[32m- test for boundary value for maxcolumns[0m
	[32m- test for maxcolumns value less than columns in 1st line of csv file[0m
	[32m- test for duplicate column name in the Fileheader options in load command[0m
	[32mTimestampDataTypeNullDataTest:[0m
	[32m- SELECT max(dateField) FROM timestampTyeNullData where dateField is not null[0m
	[32m- SELECT * FROM timestampTyeNullData where dateField is null[0m
	[32mTestDDLForPartitionTableWithDefaultProperties:[0m
	[32m- create partition table: hash partition[0m
	[32m- create partition table: range partition[0m
	[32m- create partition table: list partition with timestamp datatype[0m
	[32m- create partition table: list partition with date datatype[0m
	[32m- test exception when values in list_info can not match partition column type[0m
	[32m- test exception when partition values in rangeTable are in group [0m
	[32m- test exception when values in rangeTable does not match partition column type[0m
	[32mJoinWithoutDictionaryColumn:[0m
	[32m- select * from emp join mobile on emp.Mobileid=mobile.Mobileid[0m
	[32mTestPreAggregateMisc:[0m
	[33m- test PreAggregate With Set Segments property !!! IGNORED !!![0m
	[33m- check preagg tbl properties sort columns inherit from main tbl !!! IGNORED !!![0m
	[32mSubqueryWithFilterAndSortTestCase:[0m
	[32m- When the query has sub-query with sort and has '=' filter[0m
	[32m- When the query has sub-query with sort and has 'like' filter[0m
	[32mFilterProcessorTestCase:[0m
	[32m- Is not null filter[0m
	[32m- join filter[0m
	[32m- Between  filter[0m
	[32m- Multi column with invalid member filter[0m
	[32m- Greater Than Filter[0m
	[32m- Greater Than Filter with decimal[0m
	[32m- Greater Than equal to Filter[0m
	[32m- Greater Than equal to Filter with limit[0m
	[32m- Greater Than equal to Filter with aggregation limit[0m
	[32m- Greater Than equal to Filter with decimal[0m
	[32m- Include Filter[0m
	[32m- In Filter[0m
	[32m- Logical condition[0m
	[32m- filter query over table having no data[0m
	[32m- Time stamp filter with diff time format for load greater[0m
	[32m- Time stamp filter with diff time format for load less[0m
	[32m- Time stamp filter with diff time format for load less than equal[0m
	[32m- Time stamp filter with diff time format for load greater than equal[0m
	[32m- join query with bigdecimal filter[0m
	[32m- join query with bigint filter[0m
	[32m- test FilterUnsupportedException when using big numbers[0m
	[32mNullMeasureValueTestCaseFilter:[0m
	[32m- select ID from t3 where salary is not null[0m
	[32m- select ID from t3 where salary is null[0m
	[32mTestLoadDataGeneral:[0m
	[32m- test data loading CSV file[0m
	[32m- test data loading CSV file without extension name[0m
	[32m- test data loading GZIP compressed CSV file[0m
	[32m- test data loading BZIP2 compressed CSV file[0m
	[32m- test data loading CSV file with delimiter char \017[0m
	[32m- test data loading with invalid values for mesasures[0m
	[32m- test data loading into table whose name has '_'[0m
	[32m- test data loading into table with Single Pass[0m
	[32m- test load data with decimal type and sort intermediate files as 1[0m
	[32m- test insert / update with data more than 32000 characters[0m
	[32m- test load / insert / update with data more than 32000 bytes - dictionary_exclude[0m
	[32m- test load / insert / update with data more than 32000 bytes - dictionary_include[0m
	[32m- test if stale folders are deleting on data load[0m
	[32mCountStarTestCase:[0m
	[32m- select count [0m
	[32mTestShowPartition:[0m
	[32m- show partition table: exception when show not partition table[0m
	[32m- show partition table: hash table[0m
	[32m- show partition table: desc formatted should show partition type[0m
	[32m- show partition table: range partition[0m
	[32m- show partition table: list partition[0m
	[32m- show partition table: not default db[0m
	[32m- show partition table: hive partition table[0m
	[32mCastColumnTestCase:[0m
	[32m- Dictionary String [0m
	[32m- Dictionary String OR[0m
	[32m- Dictionary String OR Implicit Cast to int[0m
	[32m- Dictionary String OR explicit Cast to int[0m
	[32m- Dictionary INT OR to implicit String[0m
	[32m- Dictionary INT OR to excplicit String[0m
	[32m- Dictionary INT OR to explicit double[0m
	[32m- Dictionary String Not[0m
	[32m- Dictionary String Not Implicit Cast to int[0m
	[32m- Dictionary String Not explicit Cast to int[0m
	[32m- Dictionary INT Not to implicit String[0m
	[32m- Dictionary INT Not to excplicit String[0m
	[32m- Dictionary INT Not to explicit double[0m
	[32m- Dictionary String In[0m
	[32m- Dictionary String In Implicit [0m
	[32m- Dictionary String In Explicit [0m
	[32m- Dictionary String In Explicit double[0m
	[32m- Dictionary String Not in Explicit double 1[0m
	[32m- Dictionary INT In to implicit Int[0m
	[32m- Dictionary INT In to excplicit String[0m
	[32m- Dictionary INT In to explicit double[0m
	[32m- Dictionary String Greater Than[0m
	[32m- Dictionary String Greater Than Implicit[0m
	[32m- Dictionary String Greater Than explicit 1[0m
	[32m- Dictionary String Greater Than explicit 2[0m
	[32m- Dictionary INT Greater Than[0m
	[32m- Dictionary INT Greater Than implicit [0m
	[32m- Dictionary INT Greater Than double[0m
	[32m- Dictionary INT Greater Than String [0m
	[32m- Dictionary String Greater Than equal[0m
	[32m- Dictionary String Greater Than Implicit equal[0m
	[32m- Dictionary String Greater Than equal explicit 1[0m
	[32m- Dictionary String Greater Than equal explicit 2[0m
	[32m- Dictionary INT Greater Than equal [0m
	[32m- Dictionary INT Greater Than equal implicit [0m
	[32m- Dictionary INT Greater Than equal 2[0m
	[32m- Dictionary INT Greater equal Than[0m
	[32m- Dictionary String less Than[0m
	[32m- Dictionary String Less Than Implicit[0m
	[32m- Dictionary String Less Than explicit 1[0m
	[32m- Dictionary String Less Than explicit 2[0m
	[32m- Dictionary INT Less Than[0m
	[32m- Dictionary INT Less Than implicit [0m
	[32m- Dictionary INT Less Than double[0m
	[32m- Dictionary INT Less Than String [0m
	[32m- Dictionary String Less Than equal[0m
	[32m- Dictionary String Less Than Implicit equal[0m
	[32m- Dictionary String Less Than equal explicit 1[0m
	[32m- Dictionary String Less Than equal explicit 2[0m
	[32m- Dictionary INT Less Than equal [0m
	[32m- Dictionary INT Less Than equal implicit [0m
	[32m- Dictionary INT Less Than equal 2[0m
	[32m- Dictionary INT Less equal Than[0m
	[32m- Dictionary INT greater less Than explicit double[0m
	[32m- Dictionary INT greater less Than explicit string[0m
	[32m- Dictionary INT greater less Than implicit  string[0m
	[32m- Dictionary INT greater less Than implicit int[0m
	[32m- Dictionary INT greater less Than implicit double[0m
	[32m- NO Dictionary String [0m
	[32m- NO Dictionary String OR[0m
	[32m- NO Dictionary String OR Implicit Cast to int[0m
	[32m- NO Dictionary String OR explicit Cast to int[0m
	[32m- NO Dictionary INT OR to implicit String[0m
	[32m- NO Dictionary INT OR to excplicit String[0m
	[32m- NO Dictionary INT OR to explicit double[0m
	[32m- NO Dictionary String Not[0m
	[32m- NO Dictionary String Not Implicit Cast to int[0m
	[32m- NO Dictionary String Not explicit Cast to int[0m
	[32m- NO Dictionary INT Not to implicit String[0m
	[32m- NO Dictionary INT Not to excplicit String[0m
	[32m- NO Dictionary INT Not to explicit double[0m
	[32m- NO Dictionary String In[0m
	[32m- NO Dictionary String In Implicit [0m
	[32m- NO Dictionary String In Explicit [0m
	[32m- NO Dictionary String In Explicit double[0m
	[32m- NO Dictionary String Not in Explicit double 1[0m
	[32m- NO Dictionary INT In to implicit Int[0m
	[32m- NO Dictionary INT In to excplicit String[0m
	[32m- NO Dictionary INT In to explicit double[0m
	[32m- NO Dictionary String Greater Than[0m
	[32m- NO Dictionary String Greater Than Implicit[0m
	[32m- NO Dictionary String Greater Than explicit 1[0m
	[32m- NO Dictionary String Greater Than explicit 2[0m
	[32m- NO Dictionary INT Greater Than[0m
	[32m- NO Dictionary INT Greater Than implicit [0m
	[32m- NO Dictionary INT Greater Than double[0m
	[32m- NO Dictionary INT Greater Than String [0m
	[32m- NO Dictionary String Greater Than equal[0m
	[32m- NO Dictionary String Greater Than Implicit equal[0m
	[32m- NO Dictionary String Greater Than equal explicit 1[0m
	[32m- NO Dictionary String Greater Than equal explicit 2[0m
	[32m- NO Dictionary INT Greater Than equal [0m
	[32m- NO Dictionary INT Greater Than equal implicit [0m
	[32m- NO Dictionary INT Greater Than equal 2[0m
	[32m- NO Dictionary INT Greater equal Than[0m
	[32m- NO Dictionary String less Than[0m
	[32m- NO Dictionary String Less Than Implicit[0m
	[32m- NO Dictionary String Less Than explicit 1[0m
	[32m- NO Dictionary String Less Than explicit 2[0m
	[32m- NO Dictionary INT Less Than[0m
	[32m- NO Dictionary INT Less Than implicit [0m
	[32m- NO Dictionary INT Less Than double[0m
	[32m- NO Dictionary INT Less Than String [0m
	[32m- NO Dictionary String Less Than equal[0m
	[32m- NO Dictionary String Less Than Implicit equal[0m
	[32m- NO Dictionary String Less Than equal explicit 1[0m
	[32m- NO Dictionary String Less Than equal explicit 2[0m
	[32m- NO Dictionary INT Less Than equal [0m
	[32m- NO Dictionary INT Less Than equal implicit [0m
	[32m- NO Dictionary INT Less Than equal 2[0m
	[32m- NO Dictionary INT Less equal Than[0m
	[32m- NO Dictionary INT greater less Than explicit double[0m
	[32m- NO Dictionary INT greater less Than explicit string[0m
	[32m- NO Dictionary INT greater less Than implicit  string[0m
	[32m- NO Dictionary INT greater less Than implicit int[0m
	[32m- NO Dictionary INT greater less Than implicit double[0m
	[32mCarbonIndexFileMergeTestCase:[0m
	[32m- Verify correctness of index merge[0m
	[32m- Verify command of index merge[0m
	[32m- Verify command of index merge without enabling property[0m
	[32m- Verify index index merge with compaction[0m
	[32m- Verify index index merge for compacted segments[0m
	[32mTestLoadDataWithMaxMinInteger:[0m
	[32m- test carbon table data loading when the int column contains min integer value[0m
	[32m- test carbon table data loading when the int column contains max integer value[0m
	[32m- test carbon table data loading when the int column contains min and max integer value[0m
	[32mStandardPartitionTableCleanTestCase:[0m
	[32m- clean up partition table for int partition column[0m
	[32m- clean up partition on table for more partition columns[0m
	[32m- clean up after dropping all partition on table[0m
	[32mTestLoadDataWithNotProperInputFile:[0m
	[32m- test loading data with input path exists but has nothing[0m
	[32m- test loading data with input file not ends with '.csv'[0m
	[32m- test loading data with input file does not exist[0m
	[32mTestDeleteTableNewDDL:[0m
	[32m- drop table Test with new DDL[0m
	[32m- test drop database[0m
	[32m- test drop database cascade command[0m
	[32m- drop table if exists Test with new DDL[0m
	[32m- drop table after deletion with if exists with new DDL[0m
	[32m- drop table after deletion with new DDL[0m
	[32m- drop table using case insensitive table name[0m
	[32m- drop table using dbName and table name[0m
	[32m- drop table and create table with different data type[0m
	[32m- drop table and create table with dictionary exclude integer scenario[0m
	[32m- drop table and create table with dictionary exclude string scenario[0m
	[32m- drop table and create table with same name but different cols[0m
	[32mTestPreAggregateDrop:[0m
	[32m- create and drop preaggregate table[0m
	[32m- dropping 1 aggregate table should not drop others[0m
	[32m- drop datamap which is not existed[0m
	[32m- drop datamap with same name on different tables[0m
	[32m- drop datamap and create again with same name[0m
	[32m- drop main table and check if preaggreagte is deleted[0m
	[32mTestAllDataTypeForPartitionTable:[0m
	[32m- allTypeTable_hash_smallInt[0m
	[32m- allTypeTable_hash_int[0m
	[32m- allTypeTable_hash_bigint[0m
	[32m- allTypeTable_hash_float[0m
	[32m- allTypeTable_hash_double[0m
	[32m- allTypeTable_hash_decimal[0m
	[32m- allTypeTable_hash_timestamp[0m
	[32m- allTypeTable_hash_date[0m
	[32m- allTypeTable_hash_string[0m
	[32m- allTypeTable_hash_varchar[0m
	[32m- allTypeTable_hash_char[0m
	[32m- allTypeTable_list_smallInt[0m
	[32m- allTypeTable_list_int[0m
	[32m- allTypeTable_list_bigint[0m
	[32m- allTypeTable_list_float[0m
	[32m- allTypeTable_list_double[0m
	[32m- allTypeTable_list_decimal[0m
	[32m- allTypeTable_list_timestamp[0m
	[32m- allTypeTable_list_date[0m
	[32m- allTypeTable_list_string[0m
	[32m- allTypeTable_list_varchar[0m
	[32m- allTypeTable_list_char[0m
	[32m- allTypeTable_range_smallInt[0m
	[32m- allTypeTable_range_int[0m
	[32m- allTypeTable_range_bigint[0m
	[32m- allTypeTable_range_float[0m
	[32m- allTypeTable_range_double[0m
	[32m- allTypeTable_range_decimal[0m
	[32m- allTypeTable_range_timestamp[0m
	[32m- allTypeTable_range_date[0m
	[32m- allTypeTable_range_string[0m
	[32m- allTypeTable_range_varchar[0m
	[32m- allTypeTable_range_char[0m
	[32mStandardPartitionTableCompactionTestCase:[0m
	[32m- data compaction for partition table for one partition column[0m
	[32m- data compaction for partition table for three partition column[0m
	[32m- data major compaction for partition table[0m
	[32m- data compaction for static partition table[0m
	[32m- enable auto compaction for partition table[0m
	[32m- Compaction after update in partition table[0m
	[32mDataRetentionConcurrencyTestCase:[0m
	[33m- DataRetention_Concurrency_load_id !!! IGNORED !!![0m
	[32m- DataRetention_Concurrency_load_date[0m
	[32mAllDataTypesTestCaseAggregate:[0m
	[32m- select empno,empname,utilization,count(salary),sum(empno) from alldatatypestableAGG where empname in ('arvind','ayushi') group by empno,empname,utilization[0m
	[32m- select empname,trim(designation),avg(salary),avg(empno) from alldatatypestableAGG where empname in ('arvind','ayushi') group by empname,trim(designation)[0m
	[32m- select empname,length(designation),max(empno),min(empno), avg(empno) from alldatatypestableAGG where empname in ('arvind','ayushi') group by empname,length(designation) order by empname[0m
	[32m- select count(empno), count(distinct(empno)) from alldatatypestableAGG[0m
	[32mTestLoadDataWithYarnLocalDirs:[0m
	[32m- test carbon table data loading for multiple temp dir[0m
	[32mTestDescribeTable:[0m
	[32m- test describe table[0m
	[32m- test describe formatted table[0m
	[32m- test describe formatted table desc1[0m
	[32mDeleteCarbonTableTestCase:[0m
	[32m- delete data from carbon table with alias [where clause ][0m
	[32m- delete data from  carbon table[where clause ][0m
	[32m- delete data from  carbon table[where IN  ][0m
	[32m- delete data from  carbon table[with alias No where clause][0m
	[32m- delete data from  carbon table[No alias No where clause][0m
	[32m- delete data from  carbon table[ JOIN with another table ][0m
	[32m- delete data from  carbon table[where numeric condition  ][0m
	[32m- partition delete data from carbon table with alias [where clause ][0m
	[32m- partition delete data from  carbon table[where clause ][0m
	[32m- Records more than one pagesize after delete operation [0m
	[32m- test if delete is unsupported for pre-aggregate tables[0m
	[32m- test select query after compaction, delete and clean files[0m
	[32mNO_DICTIONARY_COL_TestCase:[0m
	[32m- Count (*) with filter[0m
	[32m- Detail Query with NO_DICTIONARY_COLUMN Compare With HIVE RESULT[0m
	[32m- Detail Query with NO_DICTIONARY_COLUMN with Like range filter[0m
	[32m- Detail Query with NO_DICTIONARY_COLUMN with greater than range filter[0m
	[32m- Detail Query with NO_DICTIONARY_COLUMN with  in filter Compare With HIVE RESULT[0m
	[32m- Detail Query with NO_DICTIONARY_COLUMN with not in filter Compare With HIVE RESULT[0m
	[32m- Detail Query with NO_DICTIONARY_COLUMN with equals filter Compare With HIVE RESULT[0m
	[32m- Detail Query with NO_DICTIONARY_COLUMN with IS NOT NULL filter[0m
	[32m- filter with arithmetic expression[0m
	[32m- Detail Query with NO_DICTIONARY_COLUMN with equals multiple filter Compare With HIVE RESULT[0m
	[32m- ORDER Query with NO_DICTIONARY_COLUMN Compare With HIVE RESULT[0m
	[32m- Distinct Query with NO_DICTIONARY_COLUMN  Compare With HIVE RESULT[0m
	[32m- Sum Query with NO_DICTIONARY_COLUMN  Compare With HIVE RESULT[0m
	[32m- average Query with NO_DICTIONARY_COLUMN  Compare With HIVE RESULT[0m
	[32m- Multiple column  group Query with NO_DICTIONARY_COLUMN  Compare With HIVE RESULT[0m
	[32m- Multiple column  Detail Query with NO_DICTIONARY_COLUMN  Compare With HIVE RESULT[0m
	[32mTestDataLoadPartitionCoalescer:[0m
	[32m- test number of partitions is more than nodes's[0m
	[32m- test number of partitions equals nodes's[0m
	[32m- test number of partitions is less than nodes's[0m
	[32m- all partitions are locality[0m
	[32m- part of partitions are locality1[0m
	[32m- part of partitions are locality2[0m
	[32m- part of partitions are locality3[0m
	[32m- all partition are not locality[0m
	[32mStandardPartitionTableDropTestCase:[0m
	[32m- show partitions on partition table[0m
	[32m- droping on partition table for int partition column[0m
	[32m- dropping partition on table for more partition columns[0m
	[32m- dropping all partition on table[0m
	[32m- dropping static partition on table[0m
	[32m- dropping all partition on table and do compaction[0m
	[32mFloatDataTypeTestCase:[0m
	[32m- select row whose rating is more than 2.8 from tfloat[0m
	[32m- select row whose rating is 3.5 from tfloat[0m
	[32m- select sum of rating column from tfloat[0m
	[32mTestCompactionForPartitionTable:[0m
	[32m- minor compaction[0m
	[32m- major compaction[0m
	[32mTestLoadDataWithMalformedCarbonCommandException:[0m
	[32m- test load data with dictionary exclude columns which no exist in table.[0m
	[32m- test load data with dictionary include columns which no exist in table.[0m
	[32m- test load data with dictionary include is same with dictionary exclude[0m
	[32m- test load data with invalid option[0m
	[32m- test load data with duplicate options[0m
	[32m- test load data with case sensitive options[0m
	[32m- test load data with dictionary include is same with dictionary exclude with spaces[0m
	[32mTestLoadDataFrame:[0m
	[32m- test the boolean data type[0m
	[32m- test load dataframe with saving compressed csv files[0m
	[32m- test load dataframe with saving csv uncompressed files[0m
	[32m- test load dataframe without saving csv files[0m
	[32m- test decimal values for dataframe load[0m
	[32m- test loading data if the data count is multiple of page size[0m
	[32m- test load dataframe with integer columns included in the dictionary[0m
	[32m- test load dataframe with string column excluded from the dictionary[0m
	[32m- test load dataframe with both dictionary include and exclude specified[0m
	[32m- test load dataframe with single pass enabled[0m
	[32m- test load dataframe with single pass disabled[0m
	[32m- test datasource table with specified table path[0m
	[32m- test streaming Table[0m
	[32m- test load dataframe with sort_columns not specified, by default all string columns will be sort_columns[0m
	[32m- test load dataframe with sort_columns specified[0m
	[32m- test load dataframe with sort_columns specified empty[0m
	[32mTestLoadTableConcurrentScenario:[0m
	[32m- do not allow drop table when load is in progress[0m
	[32m- do not allow rename table when load is in progress[0m
	[32mTableLevelCompactionOptionTest:[0m
	[32m- MAJOR_COMPACTION_SIZE, use system level configuration[0m
	[32m- MAJOR_COMPACTION_SIZE, use table level configuration[0m
	[32m- ENABLE_AUTO_LOAD_MERGE: true, use system level configuration[0m
	[32m- ENABLE_AUTO_LOAD_MERGE: false, use table level configuration[0m
	[32m- ENABLE_AUTO_LOAD_MERGE: true, use table level configuration[0m
	[32mInsertIntoNonCarbonTableTestCase:[0m
	[32m- insert into hive[0m
	[32m- insert into parquet[0m
	[32m- insert into hive conditional[0m
	[32mTestPreAggregateExpressions:[0m
	[32m- test pre agg create table with expression 1[0m
	[32m- test pre agg create table with expression 2[0m
	[32m- test pre agg create table with expression 3[0m
	[32m- test pre agg create table with expression 4[0m
	[32m- test pre agg create table with expression 5[0m
	[32m- test pre agg create table with expression 6[0m
	[32m- test pre agg table selection with expression 1[0m
	[32m- test pre agg table selection with expression 2[0m
	[32m- test pre agg table selection with expression 3[0m
	[32m- test pre agg table selection with expression 4[0m
	[32m- test pre agg table selection with expression 5[0m
	[32mTestAndEqualFilterEmptyOperandValue:[0m
	[32m- select * from carbonTable where country='' and salary='')[0m
	[32m- select * from carbonTable where date='' and salary='')[0m
	[32mTestGrtLessFilter:[0m
	[32m- select * from carbonTable where date > cast('2017-7-25 12:07:29' as timestamp)[0m
	[32m- select * from carbonTable where date < cast('2017-7-25 12:07:29' as timestamp)[0m
	[32m- select * from carbonTable where date > cast('2018-7-24 12:07:28' as timestamp)[0m
	[32m- select * from carbonTable where date < cast('2018-7-24 12:07:28' as timestamp)[0m
	[32mTestNullAndEmptyFields:[0m
	[32m- test detail query on column having null values[0m
	[32m- test filter query on column is null[0m
	[32m- test filter query on column is not null[0m
	[32m- test filter query on columnValue=null[0m
	[32m- test filter query where date is null[0m
	[32m- test  subquery on column having null values[0m
	[32m- test  subquery on column having not null values[0m
	[32mTestTimeseriesCompaction:[0m
	[32m- test if pre-agg table is compacted with parent table minor compaction[0m
	[32mIntegerDataTypeTestCase:[0m
	[32m- select empno from integertypetableFilter[0m
	[32mTestLoadDataWithJunkChars:[0m
	[32m- [bug]fix bug of duplicate rows in UnivocityCsvParser #877[0m
	[32mWindowsExprTestCase:[0m
	[32m- SELECT country,name,salary FROM (SELECT country,name,salary,dense_rank() OVER (PARTITION BY country ORDER BY salary DESC) as rank FROM windowstable) tmp WHERE rank <= 2 order by country[0m
	[32m- SELECT ID, country, SUM(salary) OVER (PARTITION BY country ) AS TopBorcT FROM windowstable[0m
	[32m- SELECT country,name,salary,ROW_NUMBER() OVER (PARTITION BY country ORDER BY salary DESC) as rownum FROM windowstable[0m
	[32mTestTimeseriesTableSelection:[0m
	[32m- test PreAggregate table selection 1[0m
	[32m- test PreAggregate table selection 2[0m
	[32m- test PreAggregate table selection 3[0m
	[32m- test PreAggregate table selection 4[0m
	[32m- test PreAggregate table selection 5[0m
	[32m- test PreAggregate table selection 6[0m
	[32m- test PreAggregate table selection 7[0m
	[32m- test PreAggregate table selection 8[0m
	[32m- test PreAggregate table selection 9[0m
	[32m- test PreAggregate table selection 10[0m
	[32m- test PreAggregate table selection 11[0m
	[32m- test PreAggregate table selection 12[0m
	[32m- test PreAggregate table selection 13[0m
	[32m- test PreAggregate table selection 14: No enum constant MILLI[0m
	[32m- test PreAggregate table selection 15: timeseries(mytime,'hour') match[0m
	[32m- test PreAggregate table selection 16: timeseries(mytime,'hour') not match[0m
	[32m- test PreAggregate table selection 17: timeseries(mytime,'minute') match[0m
	[32m- test PreAggregate table selection 18: timeseries(mytime,'minute') not match pre aggregate table[0m
	[32m- test PreAggregate table selection 19: select with many group by and one filter[0m
	[32m- test PreAggregate table selection 20: select with many group by and many filter, don't check the preaggregate table[0m
	[32m- test PreAggregate table selection 21: filter >=[0m
	[32m- test PreAggregate table selection 22: filter >[0m
	[32m- test PreAggregate table selection 23: filter >[0m
	[32m- test PreAggregate table selection 24: filter >=[0m
	[32m- test PreAggregate table selection 25: filter <=[0m
	[32m- test PreAggregate table selection 26: filter <=[0m
	[32m- test PreAggregate table selection 27: filter <=[0m
	[32m- test PreAggregate table selection 28: filter <[0m
	[32m- test PreAggregate table selection 29: filter <[0m
	[32m- test PreAggregate table selection 30: filter <[0m
	[32m- test PreAggregate table selection 31: filter < and >[0m
	[32m- test PreAggregate table selection 32: filter < and >[0m
	[32m- test PreAggregate table selection 33: filter <= and >=[0m
	[32m- test PreAggregate table selection 34: filter < and >=[0m
	[32m- test PreAggregate table selection 35: filter < and >=[0m
	[32m- test PreAggregate table selection 36: filter many column[0m
	[32m- test PreAggregate table selection 37: filter < and >=, avg[0m
	[33m- test PreAggregate table selection 38: filter < and >=, max !!! IGNORED !!![0m
	[33m- test PreAggregate table selection 39: filter < and >=, min !!! IGNORED !!![0m
	[32m- test PreAggregate table selection 40: count[0m
	[32m- test PreAggregate table selection 41: count, max, min[0m
	[32mTestCreateTableWithDouble:[0m
	[32m- test creating carbon table with double in complex type[0m
	[32m- test creating carbon table with double as dimension[0m
	[32mTestSortColumnsWithUnsafe:[0m
	[32m- create table with no dictionary sort_columns[0m
	[32m- create table with dictionary sort_columns[0m
	[32m- create table with direct-dictioanry sort_columns[0m
	[32m- create table with multi-sort_columns and data loading with offheap safe[0m
	[32m- create table with multi-sort_columns and data loading with offheap and unsafe sort[0m
	[32m- create table with multi-sort_columns and data loading with offheap and inmemory sort[0m
	[32m- create table with multi-sort_columns and data loading with heap[0m
	[32m- create table with multi-sort_columns and data loading with heap and unsafe sort[0m
	[32m- create table with multi-sort_columns and data loading with heap and inmemory sort[0m
	[32m- compaction on sort_columns table[0m
	[32m- filter on sort_columns include no-dictionary, direct-dictionary and dictioanry[0m
	[32m- unsorted table creation, query data loading with heap and safe sort config[0m
	[32m- unsorted table creation, query and data loading with heap and unsafe sort config[0m
	[32m- unsorted table creation, query and loading with heap and inmemory sort config[0m
	[32m- unsorted table creation, query and data loading with offheap and safe sort config[0m
	[32m- unsorted table creation, query and data loading with offheap and unsafe sort config[0m
	[32m- unsorted table creation, query and data loading with offheap and inmemory sort config[0m
	[32m- create table with invalid values for numeric data type columns specified as sort_columns[0m
	[32mRangeFilterMyTests:[0m
	[32m- test for dictionary columns[0m
	[32m- test for dictionary columns OR [0m
	[32m- test for dictionary columns OR AND[0m
	[32m- test for dictionary columns OR AND OR[0m
	[32m- test range filter for direct dictionary[0m
	[32m- test range filter for direct dictionary and[0m
	[32m- test range filter for direct dictionary equality[0m
	[32m- test range filter for less than filter[0m
	[32m- test range filter for direct dictionary not equality[0m
	[32m- test range filter for direct dictionary and with explicit casts[0m
	[32m- test range filter for different Timestamp formats[0m
	[32m- test range filter for different Timestamp formats1[0m
	[32m- test range filter for different Timestamp formats2[0m
	[32m- test range filter for different Timestamp formats3[0m
	[32m- test range filter for different Timestamp In format [0m
	[32m- test range filter for direct dictionary and boundary[0m
	[32m- test range filter for direct dictionary and boundary 2[0m
	[32m- test range filter for direct dictionary and boundary 3[0m
	[32m- test range filter for direct dictionary and boundary 4[0m
	[32m- test range filter for direct dictionary and boundary 5[0m
	[32m- test range filter for direct dictionary more values after filter[0m
	[32m- test range filter for direct dictionary or condition[0m
	[32m- test range filter for direct dictionary or and condition[0m
	[32m- test range filter for direct dictionary with no data in csv[0m
	[32m- test range filter for direct dictionary cast[0m
	[32m- test range filter for direct dictionary cast and[0m
	[32m- test range filter for direct dictionary and boundary cast [0m
	[32m- test range filter for direct dictionary and boundary 2 cast [0m
	[32m- test range filter for direct dictionary and boundary 3 cast[0m
	[32m- test range filter for direct dictionary and boundary 4 cast[0m
	[32m- test range filter for direct dictionary and boundary 5 cast [0m
	[32m- test range filter for direct dictionary more values after filter cast[0m
	[32m- test range filter for direct dictionary or condition cast[0m
	[32m- test range filter for direct dictionary or and condition cast[0m
	[32m- test range filter for direct dictionary with no data in csv cast[0m
	[32m- test range filter for measure in dictionary include[0m
	[32m- test range filter for measure in dictionary include and condition[0m
	[32m- test range filter for measure in dictionary include or condition[0m
	[32m- test range filter for measure in dictionary include or and condition[0m
	[32m- test range filter for measure in dictionary include or and condition 1[0m
	[32m- test range filter for measure in dictionary include boundary values[0m
	[32m- test range filter for measure in dictionary include same values and[0m
	[32m- test range filter for measure in dictionary include same values or[0m
	[32m- test for dictionary exclude columns[0m
	[32m- test for dictionary exclude columns or condition[0m
	[32m- test for dictionary exclude columns or and condition[0m
	[32m- test for dictionary exclude columns boundary condition[0m
	[32m- test range filter for multiple columns and condition[0m
	[32m- test range filter for multiple columns or condition[0m
	[32m- test range filter for multiplecolumns conditions[0m
	[32m- test range filter No Dictionary Range[0m
	[32m- test range filter for more columns conditions[0m
	[32m- test range filter for multiple columns and or combination[0m
	[32m- test range filter for more columns boundary conditions[0m
	[32mIntegerDataTypeTestCase:[0m
	[32m- select empno from integertypetable[0m
	[32mTestLoadOptions:[0m
	[32m- test load data with more than one char in quotechar option[0m
	[32m- test load data with more than one char in commentchar option[0m
	[32m- test load data with more than one char in escapechar option[0m
	[32m- test load data with invalid escape sequence in escapechar option[0m
	[32m- test load data with with valid escape sequence in escapechar option[0m
	[32mDBLocationCarbonTableTestCase:[0m
	[32m- Update operation on carbon table with insert into[0m
	[32m- create and drop database test[0m
	[32m- create two databases at same table[0m
	[32m- create table and load data[0m
	[32m- create table and insert data[0m
	[32m- create table and 2 times data load[0m
	[32m- Update operation on carbon table[0m
	[32m- Delete operation on carbon table[0m
	[32m- Alter table add column test[0m
	[32m- Alter table change column datatype test[0m
	[32m- Alter table drop column test[0m
	[32m- test mdt file path with configured paths[0m
	[32mTestNoInvertedIndexLoadAndQuery:[0m
	[32m- no inverted index load and point query[0m
	[32m- no inverted index load and agg query[0m
	[32m- no inverted index with measure[0m
	[32m- no inverted index with measure as dictionary_include[0m
	[32m- no inverted index with measure as sort_column[0m
	[32m- no inverted index with Dictionary_EXCLUDE and NO_INVERTED_INDEX[0m
	[32m- no inverted index test for row level filter queries[0m
	[32m- no inverted index with describe formatted query[0m
	[32m- filter query on dictionary and no inverted index column where all values are null[0m
	[32mMeasureOnlyTableTestCases:[0m
	[32m- SELECT sum(intField) FROM carbon_table where intField > 10[0m
	[32m- SELECT sum(intField),sum(doubleField) FROM carbon_table where intField > 10 OR doubleField > 10[0m
	[32m- SELECT sum(decimalField) FROM carbon_table[0m
	[32m- SELECT count(*), sum(intField) FROM carbon_table where intField > 10[0m
	[32m- SELECT count(*), sum(decimalField) b FROM carbon_table order by b[0m
	[32m- SELECT intField, sum(floatField) total FROM carbon_table group by intField order by total[0m
	[32m- select shortField, avg(intField+ 10) as a from carbon_table group by shortField[0m
	[32m- select shortField, avg(intField+ 10) as a from carbon_table group by shortField order by a[0m
	[32m- select shortField, avg(intField+ intField) as a from carbon_table group by shortField order by a[0m
	[32m- select shortField, count(intField+ 10) as a from carbon_table group by shortField order by a[0m
	[32m- select shortField, min(intField+ 10) as a from carbon_table group by shortField order by a[0m
	[32m- select shortField, max(intField+ 10) as a from carbon_table group by shortField order by a[0m
	[32m- select shortField, sum(distinct intField) + 10 as a from carbon_table group by shortFieldorder by a[0m
	[32m- select sum(doubleField) + 7.28 as a, intField from carbon_table group by intField[0m
	[32m- select count(floatField) + 7.28 a, intField from carbon_table group by intField[0m
	[32m- select count(distinct floatField) + 7.28 a, intField from carbon_table group by intField[0m
	[32m- select count (if(doubleField>100,NULL,doubleField))  a from carbon_table[0m
	[32m- select count (if(decimalField>100,NULL,decimalField))  a from carbon_table[0m
	[32m- select avg (if(floatField>100,NULL,floatField))  a from carbon_table[0m
	[32m- select min (if(intField>100,NULL,intField))  a from carbon_table[0m
	[32m- select max (if(intField>5,NULL,intField))  a from carbon_table[0m
	[32m- select variance(doubleField) as a from carbon_table[0m
	[32m- select var_samp(doubleField) as a  from carbon_table[0m
	[32m- select stddev_pop(doubleField) as a  from carbon_table[0m
	[32m- select stddev_samp(doubleField)  as a from carbon_table[0m
	[32m- select covar_pop(doubleField,doubleField) as a  from carbon_table[0m
	[32m- select covar_samp(doubleField,doubleField) as a  from carbon_table[0m
	[32m- select corr(doubleField,doubleField)  as a from carbon_table[0m
	[32m- select percentile(bigintField,0.2) as  a  from carbon_table[0m
	[32m- select last(doubleField) a from carbon_table[0m
	[32m- select intField from carbon_table where carbon_table.intField IN (3,2)[0m
	[32m- select intField from carbon_table where carbon_table.intField NOT IN (3,2)[0m
	[32m- select intField,sum(floatField) a from carbon_table group by intField order by a desc[0m
	[32m- select intField,sum(floatField) a from carbon_table group by intField order by a asc[0m
	[32m- select doubleField from carbon_table where doubleField NOT BETWEEN intField AND floatField[0m
	[32m- select cast(doubleField as int) as a from carbon_table limit 10[0m
	[32m- select percentile_approx(1, 0.5 ,5000) from carbon_table[0m
	[32m- CARBONDATA-60-union-defect[0m
	[32m- select b.intField from carbon_table a join carbon_table b on a.intField=b.intField[0m
	[32mTestBigInt:[0m
	[32m- test detail query on big int column[0m
	[32m- test sum function on big int column[0m
	[32m- test max function on big int column[0m
	[32m- test min function on big int column[0m
	[32m- test count function on big int column[0m
	[32m- test distinct function on big int column[0m
	[32m- test sum-distinct function on big int column[0m
	[32m- test count-distinct function on big int column[0m
	[32m- test big int data type storage for boundary values[0m
	[32mTestLoadDataWithEmptyArrayColumns:[0m
	[32m- test carbon table data loading when there are empty array columns in data[0m
	[32mDateDataTypeDirectDictionaryWithNoDictTestCase:[0m
	[32m- select doj from directDictionaryTable[0m
	[32m- select doj from directDictionaryTable with equals filter[0m
	[32m- select doj from directDictionaryTable with greater than filter[0m
	[32mValueCompressionDataTypeTestCase:[0m
	[32m- ActualDataType:double,ChangedDatatype:Short,CompressionType:NonDecimalMaxMin[0m
	[32m- ActualDataType:double,ChangedDatatype:byte,CompressionType:NonDecimalMaxMin[0m
	[32m- When the values of Double datatype are negative values[0m
	[32m- When the values of Double datatype have both postive and negative values[0m
	[32mTestTableLevelBlockSize:[0m
	[32m- Value test: set table level blocksize value beyong [1,2048][0m
	[32m- Value test: set table level blocksize in not int value[0m
	[32m- Function test: set table level blocksize load and agg query[0m
	[32m- test block size for its max value[0m
	[32mAllQueriesSpark2TestCase:[0m
	[32m- select empno,empname,utilization,count(salary),sum(empno) from alldatatypestable where empname in ('arvind','ayushi') group by empno,empname,utilization[0m
	[32mDataCompactionCardinalityBoundryTest:[0m
	[32m- check if compaction is completed or not and  verify select query.[0m
	[32mNullMeasureValueTestCaseAggregate:[0m
	[32m- select count(salary) from t3[0m
	[32m- select count(ditinct salary) from t3[0m
	[32m- select sum(salary) from t3[0m
	[32m- select avg(salary) from t3[0m
	[32m- select max(salary) from t3[0m
	[32m- select min(salary) from t3[0m
	[32m- select sum(distinct salary) from t3[0m
	[32mTestLoadWithSortTempCompressed:[0m
	[32m- test data load for simple table with sort temp compressed with snappy and off-heap sort enabled[0m
	[32m- test data load for simple table with sort temp compressed with snappy and off-heap sort disabled[0m
	[32m- test data load for complex table with sort temp compressed with snappy and off-heap sort enabled[0m
	[32m- test data load for complex table with sort temp compressed with snappy and off-heap sort disabled[0m
	[32mTestLoadDataWithNoMeasure:[0m
	[32m- test data loading and validate query output[0m
	[32m- test data loading with single dictionary column[0m
	[32m- test data loading with single no dictionary column[0m
	[32m- test data loading with single complex struct type column[0m
	[32m- test data loading with single complex array type column[0m
	[32mCarbonTableSchemaCommonSuite:[0m
	[32m- Creating table: Duplicate dimensions found with name, it should throw AnalysisException[0m
	[32m- Altering table: Duplicate column found with name, it should throw RuntimeException[0m
	[32mMajorCompactionStopsAfterCompaction:[0m
	[32m- delete merged folder and check segments[0m
	[32mUpdateCarbonTableTestCase:[0m
	[32m- test update operation with 0 rows updation.[0m
	[32m- update carbon table[select from source table with where and exist][0m
	[32m- update carbon table[using destination table columns with where and exist][0m
	[32m- update carbon table without alias in set columns[0m
	[32m- update carbon table without alias in set columns with mulitple loads[0m
	[32m- update carbon table with optimized parallelism for segment[0m
	[32m- update carbon table without alias in set three columns[0m
	[32m- update carbon table[single column select from source with where and exist][0m
	[32m- update carbon table[single column SELECT from source with where and exist][0m
	[32m- update carbon table[using destination table columns without where clause][0m
	[32m- update carbon table[using destination table columns with where clause][0m
	[32m- update carbon table[using destination table( no alias) columns without where clause][0m
	[32m- update carbon table[using destination table columns with hard coded value ][0m
	[32m- update carbon tableusing destination table columns with hard coded value and where condition][0m
	[32m- update carbon table[using source  table columns with where and exist and no destination table condition][0m
	[32m- update carbon table[using destination table where and exist][0m
	[32m- update carbon table[using destination table (concat) where and exist][0m
	[32m- update carbon table[using destination table (concat) with  where[0m
	[32m- update table with data for datatype mismatch with column [0m
	[32m- update carbon table-error[more columns in source table not allowed[0m
	[32m- update carbon table-error[no set columns[0m
	[32m- update carbon table-error[no set columns with updated column[0m
	[32m- update carbon table-error[one set column with two updated column[0m
	[32m- update carbon [special characters  in value- test parsing logic ][0m
	[32m- update carbon [sub query, between and existing in outer condition.(Customer query ) ][0m
	[32m- update carbon [self join select query ][0m
	[32m- update carbon table-error[closing bracket missed[0m
	[32m- update carbon table-error[starting bracket missed[0m
	[32m- update carbon table-error[missing starting and closing bracket[0m
	[32m- test create table with column name as tupleID[0m
	[32m- test show segment after updating data : JIRA-1411,JIRA-1414[0m
	[32m- Failure of update operation due to bad record with proper error message[0m
	[32m- More records after update operation [0m
	[32m- CARBONDATA-1445 carbon.update.persist.enable=false it will fail to update data[0m
	[32m- update table in carbondata with rand() [0m
	[32m- test if update is unsupported for pre-aggregate tables[0m
	[32m- Update operation on carbon table with singlepass[0m
	[32m- Update operation on carbon table with persist false[0m
	[32m- partition test update operation with 0 rows updation.[0m
	[32m- partition update carbon table[select from source table with where and exist][0m
	[32m- partition update carbon table[using destination table columns with where and exist][0m
	[32m- partition update carbon table without alias in set columns[0m
	[32m- partition update carbon table without alias in set columns with mulitple loads[0m
	[32m- test create table with tupleid as column name[0m
	[32m- test create table with position reference as column name[0m
	[32m- test create table with position id as column name[0m
	[32m- empty folder creation after compaction and update[0m
	[32mCompactionSupportGlobalSortFunctionTest:[0m
	[32m- Compaction type: major[0m
	[32m- Compaction type: minor, < default segments in level 1, not compact[0m
	[32m- Compaction type: minor, >= default segments and < (default segments)*2 in level 1, compact once[0m
	[32m- Compaction type: minor, >= default segments in level 1,compact twice in level 1[0m
	[32m- Compaction type: minor, >= compacted segments in level 2,compact once in level 2[0m
	[32m- Compaction: clean files, major[0m
	[32m- Compaction: clean files, minor[0m
	[32m- Compaction: global_sort_partitions=1, major[0m
	[32m- Compaction: global_sort_partitions=2, major[0m
	[32m- Compaction: delete, major[0m
	[32m- Compaction: delete, minor[0m
	[32m- Compaction: load from file dictory, three csv file, major[0m
	[32m- Compaction: load from file dictory, three csv file, minor[0m
	[32m- Compaction: one file and no sort_columns[0m
	[32m- Compaction: global_sort sort_columns is int data type[0m
	[32mUpdateCarbonTableTestCaseWithBadRecord:[0m
	[32m- test update operation with Badrecords action as force.[0m
	[32m- test update operation with Badrecords action as FAIL.[0m
	[32mTestLoadDataWithDictionaryExcludeAndInclude:[0m
	[32m- test load data with dictionary exclude & include and with empty dimension[0m
	[32m- test create external table should fail[0m
	[32mAverageQueryTestCase:[0m
	[32m- select avg(Measure_IntType)+IntType from carbonTable[0m
	[32m- select avg(Dimension_IntType)+IntType from table[0m
	[32m- select avg(TimeStamp)+IntType from table[0m
	[32m- select avg(TimeStamp) from table[0m
	[32m- select avg(StringType)+IntType from table[0m
	[32m- select max(StringType)+IntType from table[0m
	[32m- select min(StringType)+IntType from table[0m
	[32m- select sum(StringType)+IntType from table[0m
	[32m- select sum(distinct StringType)+IntType from table[0m
	[32m- group by with having[0m
	[32mTestCreateTableWithDatabaseNameCaseChange:[0m
	[32m- test create table with database case name change[0m
	[32m- test drop database cascade with case sensitive[0m
	[32mTestComplexTypeQuery:[0m
	[32m- test for create table with complex type[0m
	[32m- Test ^ * special character data loading for complex types[0m
	[32m- complex filter set1[0m
	[32m- complex filter set2[0m
	[32m- select * from structusingarraycarbon[0m
	[32m- select * from structusingstructCarbon[0m
	[32m- select * from complexcarbontable[0m
	[32m- select mobile, proddate, deviceInformationId  from complexcarbontable[0m
	[32m- select mobile, MAC, deviceInformationId, purchasedate from complexcarbontable[0m
	[32m- select mobile, ROMSize, deviceInformationId from complexcarbontable[0m
	[32m- select locationinfo, purchasedate, deviceInformationId from complexcarbontable[0m
	[32m- select locationinfo, ROMName, purchasedate, deviceinformationId from complexcarbontable[0m
	[32m- select MAC from complexcarbontable where MAC[0] = 'MAC1'[0m
	[32m- select mobile from complexcarbontable where mobile.imei like '1AA%'[0m
	[32m- select locationinfo from complexcarbontable where locationinfo[0].ActiveAreaId > 2 AND locationinfo[0].ActiveAreaId < 7[0m
	[32m- select locationinfo from complexcarbontable where locationinfo[0].ActiveAreaId >= 2 AND locationinfo[0].ActiveAreaId <= 7[0m
	[32m- select locationinfo from complexcarbontable where (locationinfo[0].ActiveAreaId +5 )> 6 AND (locationinfo[0].ActiveAreaId+10) < 20[0m
	[32m- select count(mobile),channelsId from complexcarbontable group by mobile,channelsId[0m
	[32m- select count(mobile),channelsId from complexcarbontable group by mobile,channelsId order by channelsId[0m
	[32m- select count(mobile),channelsId from complexcarbontable group by mobile,channelsId order by channelsId limit 10[0m
	[32m- select count(mobile),channelsId from complexcarbontable where MAC[0] = 'MAC1'  group by mobile,channelsId order by channelsId limit 10[0m
	[32mTestCSVHavingOnlySpaceChar:[0m
	[32m- dataload[0m
	[32mRangeFilterTestCase:[0m
	[32m- Range filter No Dictionary 1[0m
	[32m- Range filter No Dictionary outside Boundary before block[0m
	[32m- Range filter No Dictionary outside Boundary after block[0m
	[32m- Range filter No Dictionary Inside Boundary[0m
	[32m- Range filter No Dictionary outside Boundary 1[0m
	[32m- Range filter No Dictionary outside Boundary 2[0m
	[32m- Range filter No Dictionary outside Boundary 3[0m
	[32m- Range filter No Dictionary outside Boundary 4[0m
	[32m- Range filter No Dictionary outside Boundary 5[0m
	[32m- Range filter No Dictionary outside Boundary 6[0m
	[32m- Range filter No Dictionary outside Boundary 7[0m
	[32m- Range filter No Dictionary outside Boundary 8[0m
	[32m- Range filter No Dictionary Inside Boundary 9[0m
	[32m- Range filter No Dictionary Inside Boundary 10[0m
	[32m- Range filter No Dictionary Inside Boundary 11[0m
	[32m- Range filter No Dictionary Inside Boundary 12[0m
	[32m- Range filter No Dictionary Inside Boundary 13[0m
	[32m- Range filter No Dictionary Inside Boundary 14[0m
	[32m- Range filter No Dictionary Inside Boundary 15[0m
	[32m- Range filter No Dictionary Inside Boundary 16[0m
	[32m- Range filter No Dictionary duplicate filters 1[0m
	[32m- Range filter No Dictionary duplicate filters2[0m
	[32m- Range filter No Dictionary duplicate filters3[0m
	[32m- Range filter No Dictionary multiple filters[0m
	[32m- Range filter No Dictionary multiple filters1[0m
	[32m- Range filter No Dictionary multiple filters2[0m
	[32m- Range filter No Dictionary multiple filters3[0m
	[32m- Range filter Dictionary 1[0m
	[32m- Range filter Dictionary outside Boundary before block[0m
	[32m- Range filter Dictionary outside Boundary after block[0m
	[32m- Range filter Dictionary Inside Boundary[0m
	[32m- Range filter Dictionary outside Boundary[0m
	[32m- Range filter Dictionary duplicate filters1[0m
	[32m- Range filter Dictionary duplicate filters2[0m
	[32m- Range filter Dictionary duplicate filters3[0m
	[32m- Range filter Dictionary multiple filters[0m
	[32m- Range filter Dictionary multiple filters1[0m
	[32m- Range filter Dictionary multiple filters2[0m
	[32m- Range filter Dictionary multiple filters3[0m
	[32m- Range filter with join[0m
	[32m- Range filter with join 1[0m
	[32m- Range with name comparision[0m
	[32m- Range with name comparision 1[0m
	[32m- Range with name comparision 3[0m
	[32m- Range with name comparision 4[0m
	[32m- Range with name comparision 5[0m
	[32m- Range with name comparision 6[0m
	[32m- Range with name comparision 7[0m
	[32m- Range with name comparision 8[0m
	[32m- Range with name comparision 9[0m
	[32m- Range with name comparision 10[0m
	[32m- Range with name comparision 11[0m
	[32m- Range with name comparision 12[0m
	[32m- Range with name comparision 13[0m
	[32m- Range with name comparision 14[0m
	[32m- Range with name comparision 15[0m
	[32m- No Range with name comparision 1[0m
	[32m- No Range with name comparision 2[0m
	[32m- No Range with name comparision 3[0m
	[32m- No Range with name comparision 4[0m
	[32m- No Range with name comparision 5[0m
	[32m- No Range with name comparision 6[0m
	[32m- No Range with name comparision 7[0m
	[32m- No Range with name comparision 8[0m
	[32mNoDictionaryColumnTestCase:[0m
	[32m- SELECT IntType FROM carbonTable[0m
	[32m- SELECT BigIntType FROM carbonTable[0m
	[32m- test load data with one row that all no dictionary column values are empty[0m
	[32mTestLoadDataWithHiveSyntaxDefaultFormat:[0m
	[32m- create table with smallint type and query smallint table[0m
	[32m- test data loading and validate query output[0m
	[32m- test data loading with different case file header and validate query output[0m
	[32m- test hive table data loading[0m
	[32m- test carbon table data loading using old syntax[0m
	[32m- test carbon table data loading using new syntax compatible with hive[0m
	[32m- test carbon table data loading using new syntax with overwrite option compatible with hive[0m
	[32m- complex types data loading[0m
	[32m- complex types data loading with more unused columns and different order of complex columns in csv and create table[0m
	[32m- test carbon table data loading with csv file Header in caps[0m
	[32m- test duplicate column validation[0m
	[32m- test carbon table data loading with csv file Header in Mixed Case and create table columns in mixed case[0m
	[32m- complex types data loading with hive column having more than required column values[0m
	[32m- complex types & no dictionary columns data loading[0m
	[32m- array<string> and string datatype for same column is not working properly[0m
	[32m- test carbon table data loading when table name is in different case with create table, for UpperCase[0m
	[32m- test carbon table data loading when table name is in different case with create table ,for LowerCase[0m
	[32m- test carbon table data loading using escape char 1[0m
	[32m- test carbon table data loading using escape char 2[0m
	[32m- test carbon table data loading using escape char 3[0m
	[32m- test carbon table data loading with special character 1[0m
	[32m- test carbon table data loading with special character 2[0m
	[32m- test data which contain column less than schema[0m
	[32m- test data which contain column with decimal data type in array.[0m
	[32m- test data which contain column with decimal data type in struct.[0m
	[32m- test data which contain column with decimal data type in array of struct.[0m
	[32m- test data loading when delimiter is '|' and data with header[0m
	[32m- test data loading with comment option[0m
	[32m- test data load with double datatype[0m
	[32m- test table with specified table path[0m
	[32m- test table with specified database and table path[0m
	[32mTestTimeSeriesDropSuite:[0m
	[33m- test timeseries drop datamap 1: drop datamap should throw exception !!! IGNORED !!![0m
	[32m- test timeseries drop datamap 2: should support drop datamap IF EXISTS[0m
	[32m- test timeseries drop datamap 3: should support drop datamap[0m
	[33m- test timeseries drop datamap 4: should support drop datamap !!! IGNORED !!![0m
	[33m- test timeseries drop datamap 5: drop datamap when table not exists !!! IGNORED !!![0m
	[33m- test timeseries drop datamap 6: drop datamap when table not exists !!! IGNORED !!![0m
	[32m- test timeseries drop datamap 7: drop datamap when table not exists[0m
	[33m- test timeseries drop datamap 8: drop datamap when table not exists !!! IGNORED !!![0m
	[32m- test timeseries drop datamap 9: drop datamap when table not exists[0m
	[32mTestDDLForPartitionTable:[0m
	[32m- create partition table: hash partition[0m
	[32m- create partition table: range partition[0m
	[32m- create partition table: list partition[0m
	[32m- create partition table: list partition with duplicate value[0m
	[32m- test exception if partition column is dropped[0m
	[32m- test describe formatted for partition column[0m
	[32m- test exception if hash number is invalid[0m
	[32m- test exception when values in list_info can not match partition column type[0m
	[32m- test exception when values in range_info can not match partition column type[0m
	[32m- Invalid Partition Range[0m
	[32mStandardPartitionTableLoadingTestCase:[0m
	[32m- data loading for partition table for one partition column[0m
	[32m- data loading for partition table for two partition column[0m
	[32m- data loading for partition table for three partition column[0m
	[32m- multiple data loading for partition table for three partition column[0m
	[32m- insert data for partition table for three partition column[0m
	[32m- data loading for partition table for one static partition column[0m
	[32m- single pass loading for partition table for one partition column[0m
	[32m- data loading for partition table for one static partition column with load syntax[0m
	[32m- overwrite partition table for one static partition column with load syntax[0m
	[32m- test partition column with special characters[0m
	[32m- Restrict streaming on partitioned table[0m
	[32m- concurrent partition table load test[0m
	[32m- merge carbon index disable data loading for partition table for three partition column[0m
	[32m- load static partition table for one static partition column with load syntax issue[0m
	[32m- bad record test with null values[0m
	[32m- test restore partition table[0m
	[32m- test case sensitive on partition columns[0m
	[32mStandardPartitionTableQueryTestCase:[0m
	[32m- querying on partition table for int partition column[0m
	[32m- querying on partition table for string partition column[0m
	[32m- querying on partition table for more partition columns[0m
	[32m- querying on partition table for date partition column[0m
	[32m- querying on partition table for date partition column on insert query[0m
	[32m- badrecords on partition column[0m
	[32m- badrecords fail on partition column[0m
	[32m- badrecords ignore on partition column[0m
	[32m- test partition fails on int null partition[0m
	[32m- test partition fails on int null partition read alternate[0m
	[32m- static column partition with load command[0m
	[32m- Creation of partition table should fail if the colname in table schema and partition column is same even if both are case sensitive[0m
	[32mDateDataTypeDirectDictionaryTest:[0m
	[32m- test direct dictionary for not null condition[0m
	[32m- test direct dictionary for getting all the values[0m
	[32m- test direct dictionary for not equals condition[0m
	[32m- test direct dictionary for null condition[0m
	[32m- select doj from directDictionaryTable with equals filter[0m
	[32m- select doj from directDictionaryTable with regexp_replace equals filter[0m
	[32m- select doj from directDictionaryTable with regexp_replace NOT IN filter[0m
	[32m- select doj from directDictionaryTable with greater than filter[0m
	[32m- select doj from directDictionaryTable with greater than filter with cast[0m
	[32m- select count(doj) from directDictionaryTable[0m
	[32mTestLoadDataUseAllDictionary:[0m
	[32m- test load data use all dictionary, and given wrong format dictionary values[0m
	[32mTestLoadDataWithDiffTimestampFormat:[0m
	[32m- test load data with different timestamp format[0m
	[32m- test load data with different timestamp format with wrong setting[0m
	[32mDateTypeTest:[0m
	[32m- must throw exception for date data type in dictionary_exclude[0m
	[32m- must throw exception for timestamp data type in dictionary_exclude[0m
	[32mTestPreAggregateCompaction:[0m
	[32m- test if pre-agg table is compacted with parent table minor compaction[0m
	[32m- test if pre-agg table is compacted with parent table major compaction[0m
	[32m- test if 2nd level minor compaction is successful for pre-agg table[0m
	[32m- test direct minor compaction on pre-agg tables[0m
	[32m- test if minor/major compaction is successful for pre-agg table[0m
	[32mTestBatchSortDataLoad:[0m
	[32m- test batch sort load by passing option to load command[0m
	[32m- test batch sort load by passing option to load command and compare with normal load[0m
	[32m- test batch sort load by passing option and compaction[0m
	[32m- test batch sort load by passing option with single pass[0m
	[32m- test batch sort load by with out passing option but through carbon properties[0m
	[32m- test batch sort load by with out passing option but through carbon properties with default size[0m
	[32mMajorCompactionIgnoreInMinorTest:[0m
	[32m- delete merged folder and check segments[0m
	[32m- delete compacted segment and check status[0m
	[32m- delete compacted segment by date and check status[0m
	[32m- Execute two major compactions sequentially[0m
	[32mTestDataLoadWithFileName:[0m
	[32m- Check the file_name in carbonindex with v3 format[0m
	[32mTestCreateTableWithSpaceInColumnName:[0m
	[32m- test create table space in column names[0m
	[32mAllDataTypesTestCaseSort:[0m
	[32m- select empno,empname,utilization,count(salary),sum(empno) from alldatatypestablesort where empname in ('arvind','ayushi') group by empno,empname,utilization order by empno[0m
	[32m- select * from alldatatypestablesort order by empname limit 10[0m
	[32m- select * from alldatatypestablesort order by salary limit 2[0m
	[32m- select * from alldatatypestablesort where empname='arvind' order by salary limit 2[0m
	[32mTestAlterTableWithTableComment:[0m
	[32m- test add table comment using alter table set [0m
	[32m- test modifiy table comment using alter table set [0m
	[32m- test remove table comment using alter table unset [0m
	[32mDateDataTypeDirectDictionaryWithOffHeapSortDisabledTest:[0m
	[32m- test direct dictionary for not null condition[0m
	[32mDataCompactionLockTest:[0m
	[32m- check if compaction is failed or not.[0m
	[32mAllDataTypesTestCase:[0m
	[32m- select channelsId, sum(Latest_DAY+ 10) as a from Carbon_automation_test group by  channelsId[0m
	[32m- select channelsId, Latest_DAY from Carbon_automation_test where count(channelsId) = 1[0m
	[32m- select channelsId, sum(channelsId+ 10)  Total from Carbon_automation_test group by  channelsId order by Total[0m
	[32m- select channelsId, sum(channelsId+channelsId) Total from Carbon_automation_test group by  channelsId order by Total[0m
	[32m- select channelsId, sum(channelsId+channelsId) Total from Carbon_automation_test group by  channelsId[0m
	[32m- select channelsId, avg(Latest_DAY+ 10) as a from Carbon_automation_test group by  channelsId[0m
	[32m- select channelsId, avg(channelsId+ 10)  Total from Carbon_automation_test group by  channelsId order by Total[0m
	[32m- select channelsId, avg(channelsId+channelsId) Total from Carbon_automation_test group by  channelsId order by Total[0m
	[32m- select channelsId, count(Latest_DAY+ 10) as a  from Carbon_automation_test group by  channelsId[0m
	[32m- select channelsId, count(channelsId+ 10) Total from Carbon_automation_test group by  channelsId order by channelsId[0m
	[32m- select channelsId, count(channelsId+channelsId)  Total from Carbon_automation_test group by  channelsId order by channelsId[0m
	[32m- select channelsId, min(Latest_DAY+ 10) as a  from Carbon_automation_test group by  channelsId[0m
	[32m- select channelsId, min(channelsId+ 10) Total from Carbon_automation_test group by  channelsId order by Total[0m
	[32m- select channelsId, min(channelsId+channelsId)  Total from Carbon_automation_test group by  channelsId order by Total[0m
	[32m- select channelsId, max(Latest_DAY+ 10) as a  from Carbon_automation_test group by  channelsId[0m
	[32m- select channelsId, max(channelsId+ 10) Total from Carbon_automation_test group by  channelsId order by Total[0m
	[32m- select channelsId, max(channelsId+channelsId)  Total from Carbon_automation_test group by  channelsId order by Total[0m
	[32m- select Latest_YEAR ,sum(distinct Latest_YEAR)+10 from Carbon_automation_test group by Latest_YEAR[0m
	[32m- select Latest_YEAR ,sum(distinct Latest_YEAR)+10 from Carbon_automation_test group by Latest_YEAR.[0m
	[32m- select sum(gamepointid) +10 as a ,series  from Carbon_automation_test group by series[0m
	[32m- select sum(gamepointid) +10.36 as a ,series  from Carbon_automation_test group by series[0m
	[32m- select count(deviceinformationid)+10.32 as a ,series  from Carbon_automation_test group by series[0m
	[32m- select count(gamepointid) +10.36 as a ,series  from Carbon_automation_test group by series[0m
	[32m- select count(latest_year)+10.364 as a,series  from Carbon_automation_test group by series[0m
	[32m- select count(distinct series)+10 as a,series from Carbon_automation_test group by series[0m
	[32m- select count(*) as a  from Carbon_automation_test[0m
	[32m- Select count(1) as a  from Carbon_automation_test[0m
	[32m- select count(imei) as a   from Carbon_automation_test[0m
	[32m- select count(device_backColor)  as a from Carbon_automation_test[0m
	[32m- select count(DISTINCT imei) as a  from Carbon_automation_test[0m
	[32m- select count(DISTINCT series) as a from Carbon_automation_test[0m
	[32m- select count(DISTINCT  device_backColor)  as a from Carbon_automation_test[0m
	[32m- select count (if(deviceInformationId>100,NULL,deviceInformationId))  a from Carbon_automation_test[0m
	[32m- select count(gamePointId)  as a from Carbon_automation_test[0m
	[32m- select sum(gamePointId) a  from Carbon_automation_test[0m
	[32m- select sum(DISTINCT  deviceInformationId) a  from Carbon_automation_test[0m
	[32m- select sum (if(deviceInformationId>100,NULL,deviceInformationId))  a from Carbon_automation_test[0m
	[32m- select sum( DISTINCT Latest_MONTH)  a from Carbon_automation_test[0m
	[32m- select avg (if(deviceInformationId>100,NULL,deviceInformationId))  a from Carbon_automation_test[0m
	[32m- select min(deviceInformationId) a  from Carbon_automation_test[0m
	[32m- select min(channelsId) a  from Carbon_automation_test[0m
	[32m- select min(bomCode)  a  from Carbon_automation_test[0m
	[32m- select min(Latest_MONTH)  a  from Carbon_automation_test[0m
	[32m- select min (if(deviceInformationId>100,NULL,deviceInformationId))  a from Carbon_automation_test[0m
	[32m- select max(deviceInformationId) a  from Carbon_automation_test[0m
	[32m- select max(channelsId) a  from Carbon_automation_test[0m
	[32m- select max(bomCode)  a  from Carbon_automation_test[0m
	[32m- select max(Latest_MONTH)  a  from Carbon_automation_test[0m
	[32m- select max (if(deviceInformationId>100,NULL,deviceInformationId))  a from Carbon_automation_test[0m
	[32m- select variance(deviceInformationId) as a   from carbon_automation_test[0m
	[32m- select var_samp(deviceInformationId) as a  from Carbon_automation_test[0m
	[32m- select stddev_pop(deviceInformationId) as a  from Carbon_automation_test[0m
	[32m- select stddev_samp(deviceInformationId)  as a from Carbon_automation_test[0m
	[32m- select covar_pop(deviceInformationId,deviceInformationId) as a  from Carbon_automation_test[0m
	[32m- select covar_samp(deviceInformationId,deviceInformationId) as a  from Carbon_automation_test[0m
	[32m- select corr(deviceInformationId,deviceInformationId)  as a from Carbon_automation_test[0m
	[32m- select percentile(deviceInformationId,0.2) as  a  from Carbon_automation_test[0m
	[32m- select percentile(deviceInformationId,0.2) as  a  from Carbon_automation_test1[0m
	[32m- select last(imei) a from Carbon_automation_test[0m
	[32m- select series,count(imei) a from Carbon_automation_test group by series order by series[0m
	[32m- select series,ActiveProvince,count(imei)  a from Carbon_automation_test group by ActiveProvince,series order by series,ActiveProvince[0m
	[32m- select count(distinct deviceColor) a,deliveryProvince from Carbon_automation_test group by deliveryProvince[0m
	[32m- select series,sum(gamePointId) a from Carbon_automation_test group by series order by series[0m
	[32m- select imei,series from Carbon_automation_test where Carbon_automation_test.series IN ('1Series','7Series')[0m
	[32m- select imei,series from Carbon_automation_test where Carbon_automation_test.series  NOT IN ('1Series','7Series')[0m
	[32m- select Upper(series) a  from Carbon_automation_test[0m
	[32m- select Upper(Latest_DAY) a  from Carbon_automation_test[0m
	[32m- select imei,series from Carbon_automation_test limit 10[0m
	[32m- select Lower(series) a  from Carbon_automation_test[0m
	[32m- select Lower(Latest_DAY) a  from Carbon_automation_test[0m
	[32m- select distinct  Latest_DAY from Carbon_automation_test[0m
	[32m- select distinct  channelsId from Carbon_automation_test[0m
	[32m- select distinct  series from Carbon_automation_test[0m
	[32m- select distinct count(series) as a  from Carbon_automation_test group by channelsName[0m
	[32m- select distinct count(gamePointId) a from Carbon_automation_test group by channelsName[0m
	[32m- select imei,series from Carbon_automation_test limit 101[0m
	[32m- select series,sum(gamePointId) a from Carbon_automation_test group by series order by series desc[0m
	[32m- select series,sum(gamePointId) a from Carbon_automation_test group by series order by a desc[0m
	[32m- select series,sum(gamePointId) a from Carbon_automation_test group by series order by series desc ,a desc[0m
	[32m- select series,sum(gamePointId) a from Carbon_automation_test group by series order by series asc[0m
	[32m- select series,sum(gamePointId) a from Carbon_automation_test group by series order by a asc[0m
	[32m- select series,sum(gamePointId) a from Carbon_automation_test group by series order by series asc ,a asc[0m
	[32m- select series,sum(gamePointId) a from Carbon_automation_test group by series order by series desc ,a asc[0m
	[32m- select series,ActiveProvince,sum(gamePointId) a from Carbon_automation_test group by series,ActiveProvince order by series desc,ActiveProvince asc[0m
	[32m- select Latest_DAY as a from Carbon_automation_test where Latest_DAY<=>Latest_areaId[0m
	[32m- select Latest_DAY  from Carbon_automation_test where Latest_DAY<>Latest_areaId[0m
	[32m- select Latest_DAY from Carbon_automation_test where Latest_DAY != Latest_areaId[0m
	[32m- select imei, Latest_DAY from Carbon_automation_test where Latest_DAY<Latest_areaId[0m
	[32m- select imei, Latest_DAY from Carbon_automation_test where Latest_DAY<=Latest_areaId[0m
	[32m- select imei, Latest_DAY from Carbon_automation_test where Latest_DAY>=Latest_areaId[0m
	[32m- select imei, Latest_DAY from Carbon_automation_test where Latest_DAY NOT BETWEEN Latest_areaId AND  Latest_HOUR[0m
	[32m- select imei, Latest_DAY from Carbon_automation_test where Latest_DAY IS NOT NULL[0m
	[32m- select imei, Latest_DAY from Carbon_automation_test where imei IS NOT NULL[0m
	[32m- select * from (select if( Latest_areaId=7,7,NULL) as babu,Latest_MONTH from Carbon_automation_test) qq where babu LIKE   Latest_MONTH[0m
	[32m- SELECT AMSize, ActiveAreaId, SUM(gamePointId) AS Sum_gamePointId FROM (select * from Carbon_automation_test) SUB_QRY GROUP BY AMSize, ActiveAreaId ORDER BY AMSize ASC, ActiveAreaId ASC[0m
	[32m- SELECT AMSize, ActiveAreaId, SUM(gamePointId) AS Sum_gamePointId FROM (select * from Carbon_automation_test) SUB_QRY WHERE NOT(AMSize = "") GROUP BY AMSize, ActiveAreaId ORDER BY AMSize ASC, ActiveAreaId ASC[0m
	[32m- SELECT ActiveCountry, ActiveDistrict, Activecity, SUM(gamepointid) AS Sum_gamepointid FROM  Carbon_automation_test group by ActiveCountry,ActiveDistrict,Activecity[0m
	[32m- SELECT Latest_country, Latest_city, Latest_district, SUM(gamepointid) AS Sum_gamepointid FROM (select * from Carbon_automation_test) SUB_QRY GROUP BY Latest_country, Latest_city, Latest_district ORDER BY Latest_country ASC, Latest_city ASC, Latest_district ASC[0m
	[32m- SELECT Activecity, ActiveCountry, ActiveDistrict, COUNT(imei) AS Count_imei FROM (select * from Carbon_automation_test) SUB_QRY GROUP BY Activecity, ActiveCountry, ActiveDistrict ORDER BY Activecity ASC, ActiveCountry ASC, ActiveDistrict ASC[0m
	[32m- SELECT ActiveCountry, COUNT(DISTINCT imei) AS DistinctCount_imei FROM (select * from Carbon_automation_test) SUB_QRY GROUP BY ActiveCountry ORDER BY ActiveCountry ASC[0m
	[32m- SELECT ActiveCountry, ActiveDistrict, Activecity, SUM(gamepointid) AS Sum_gamepointid FROM (select * from Carbon_automation_test) SUB_QRY GROUP BY ActiveCountry, ActiveDistrict, Activecity ORDER BY ActiveCountry ASC, ActiveDistrict ASC, Activecity ASC[0m
	[32m- select channelsId from Carbon_automation_test order by  channelsId[0m
	[32m- select count(series),series from Carbon_automation_test group by series having series='6Series'[0m
	[32m- SELECT ActiveCountry, ActiveDistrict, Activecity, SUM(gamePointId) AS Sum_gamePointId FROM (select * from Carbon_automation_test) SUB_QRY GROUP BY ActiveCountry, ActiveDistrict, Activecity ORDER BY ActiveCountry ASC, ActiveDistrict ASC, Activecity ASC[0m
	[32m- SELECT ActiveCountry, ActiveDistrict, Activecity, SUM(gamePointId) AS Sum_gamePointId FROM (select * from Carbon_automation_test) SUB_QRY WHERE imei = "1AA100000" GROUP BY ActiveCountry, ActiveDistrict, Activecity ORDER BY ActiveCountry ASC, ActiveDistrict ASC, Activecity ASC[0m
	[32m- SELECT series, SUM(gamePointId) AS Sum_gamePointId FROM (select * from Carbon_automation_test) SUB_QRY GROUP BY series ORDER BY series ASC[0m
	[32m- SELECT channelsId, deliveryCity FROM (select * from Carbon_automation_test) SUB_QRY GROUP BY channelsId, deliveryCity ORDER BY channelsId ASC, deliveryCity ASC[0m
	[32m- SELECT modelId, SUM(gamepointid) AS Sum_gamepointid FROM (select * from Carbon_automation_test) SUB_QRY GROUP BY modelId ORDER BY modelId ASC[0m
	[32m- SELECT imei, channelsId, COUNT(deliveryTime) AS Count_deliveryTime FROM (select * from Carbon_automation_test) SUB_QRY GROUP BY imei, channelsId ORDER BY imei ASC, channelsId ASC[0m
	[32m- select imei,series from Carbon_automation_test where series='7Series' order by imei limit 10[0m
	[32m- select  count(channelsId) from Carbon_automation_test where  modelId is  null[0m
	[32m- select  sum(channelsId) from Carbon_automation_test where  deviceinformationid is  null[0m
	[32m- select  avg(channelsName) from Carbon_automation_test where  modelId is  null[0m
	[32m- SELECT count(DISTINCT gamePointId) FROM Carbon_automation_test where imei is null[0m
	[32m- select  imei from Carbon_automation_test where contractNumber is NOT null[0m
	[32m- select  count(gamePointId) from Carbon_automation_test where imei is NOT null[0m
	[32m- select  count(bomCode) from Carbon_automation_test where contractNumber is NOT null[0m
	[32m- select  channelsName from Carbon_automation_test where contractNumber is NOT null[0m
	[32m- select  channelsId from Carbon_automation_test where gamePointId is NOT null[0m
	[32m- select  channelsName from Carbon_automation_test where gamePointId is NOT null[0m
	[32m- select  channelsId from Carbon_automation_test where latest_day is NOT null[0m
	[32m- select  channelsName from Carbon_automation_test where latest_day is NOT null[0m
	[32m- SELECT min(AMSize) FROM Carbon_automation_test where imei is NOT null[0m
	[32m- select var_samp(Latest_YEAR) from Carbon_automation_test[0m
	[32m- select var_samp(AMSize) from Carbon_automation_test[0m
	[32m- select stddev_pop(bomcode)from Carbon_automation_test[0m
	[32m- select stddev_pop(deviceInformationId)from Carbon_automation_test1[0m
	[32m- select stddev_pop(AMSIZE)from Carbon_automation_test[0m
	[32m- select stddev_samp(deviceInformationId)from Carbon_automation_test1[0m
	[32m- select stddev_samp(AMSIZE)from Carbon_automation_test[0m
	[32m- select stddev_samp(Latest_MONTH)from Carbon_automation_test[0m
	[32m- Select percentile(1,1.0) from Carbon_automation_test2[0m
	[32m- Select percentile(1,1.0) from Carbon_automation_test[0m
	[32m- select cast(series as int) as a from Carbon_automation_test limit 10[0m
	[32m- select cast(modelid as int) as a from Carbon_automation_test limit 10[0m
	[32m- Select percentile(1,1.0) from Carbon_automation_test1[0m
	[32m- select percentile_approx(1, 0.5 ,5000) from Carbon_automation_test[0m
	[32m- select percentile_approx(1, 0.5 ,1000) from Carbon_automation_test[0m
	[32m- select percentile_approx(1, 0.5 ,700) from Carbon_automation_test[0m
	[32m- select percentile_approx(1, 0.5 ,500) from Carbon_automation_test[0m
	[32m- select var_samp(Latest_YEAR) from Carbon_automation_test1[0m
	[32m- select stddev_pop(deviceInformationId)from Carbon_automation_test[0m
	[32m- select stddev_samp(deviceInformationId)from Carbon_automation_test[0m
	[32m- CARBONDATA-60-union-defect[0m
	[32m- select Min(imei) from (select imei from Carbon_automation_test order by imei) t[0m
	[32m- select b.IMEI from Carbon_automation_test a join Carbon_automation_test b on a.imei=b.imei[0m
	[32m- Right join with filter issue1[0m
	[32m- Right join with filter issue2[0m
	[32mTestCreateTableWithCompactionOptions:[0m
	[32m- test create table with compaction options[0m
	[32m- test create table with invalid major compaction size[0m
	[32m- test create table with invalid auto load merge[0m
	[32m- test create table with invalid level threshold[0m
	[32m- test create table with invalid preserve segments number[0m
	[32m- test create table with invalid allowed days[0m
	[32m- test create table without compaction options[0m
	[32mBadRecordEmptyDataTest:[0m
	[32m- select count(*) from empty_timestamp[0m
	[32m- select count(*) from emptyColumnValues[0m
	[32m- select count(*) from emptyColumnValues_false[0m
	[32m- select count(*) from empty_timestamp_false[0m
	[32m- test load ddl command[0m
	[32m- test load multiple loads- pne with valid record and one with invalid[0m
	[32mDataRetentionTestCase:[0m
	[32m- RetentionTest_withoutDelete[0m
	[32m- RetentionTest_DeleteSegmentsByLoadTime[0m
	[32m- RetentionTest3_DeleteByLoadId[0m
	[32m- RetentionTest4_DeleteByInvalidLoadId[0m
	[32m- test delete segments by load date with case-insensitive table name[0m
	[32m- RetentionTest_DeleteSegmentsByLoadTimeValiadtion[0m
	[32m- RetentionTest_InvalidDeleteCommands[0m
	[32m- RetentionTest_Locks[0m
	[32mInsertOverwriteConcurrentTest:[0m
	[32m- compaction should fail if insert overwrite is in progress[0m
	[32m- update should fail if insert overwrite is in progress[0m
	[32m- delete should fail if insert overwrite is in progress[0m
	[32m- drop table should fail if insert overwrite is in progress[0m
	[32mTestBetweenFilter:[0m
	[32m- SELECT id FROM carbonTableBetween where id >= 1[0m
	[32m- SELECT id FROM carbonTableBetween where id >= 1 and id < 5[0m
	[32m- SELECT id FROM carbonTableBetween where id > 1 and id < 3[0m
	[32m- SELECT id FROM carbonTableBetween where id between 1 and 3[0m
	[32mTestCreateTableIfNotExists:[0m
	[32m- test create table if not exists[0m
	[32mTestPreDefDictionary:[0m
	[32m- dictionary value not present in the allpredefdictionary dic file must be loaded.[0m
	[32m- dictionary value not present in the allpredefdictionary dic with single_pass.[0m
	[32m- dictionary value not present in the columndict dic with single_pass.[0m
	[32m- validation test columndict with single_pass= false.[0m
	[32m- validation test ALL_DICTIONARY_PATH with single_pass= false.[0m
	[32mTestLoadDataWithBlankLine:[0m
	[32m- test carbon table data loading when there are  blank lines in data[0m
	[32m- test carbon table data loading when the first line is blank[0m
	[32mStandardPartitionBadRecordLoggerTest:[0m
	[32m- test partition redirect[0m
	[32m- test partition serializable_values[0m
	[32m- test partition serializable_values_false[0m
	[32m- test partition with empty_timestamp[0m
	[32m- test partition with insufficientColumn[0m
	[32m- test partition with insufficientColumn_false[0m
	[32m- test partition with emptyColumnValues[0m
	[32m- test partition with emptyColumnValues_false[0m
	[32m- test partition with empty_timestamp_false[0m
	[32m- test load ddl command[0m
	[32mOrderByLimitTestCase:[0m
	[32m- test join with orderby limit[0m
	[32mAllDataTypesTestCaseFilter:[0m
	[32m- select empno,empname,utilization,count(salary),sum(empno) from alldatatypestableFilter where empname in ('arvind','ayushi') group by empno,empname,utilization[0m
	[32m- select empno,empname from alldatatypestableFilter where regexp_replace(workgroupcategoryname, 'er', 'ment') NOT IN ('development')[0m
	[32m- select empno,empname from alldatatypescubeFilter where regexp_replace(workgroupcategoryname, 'er', 'ment') != 'development'[0m
	[32m- verify like query ends with filter push down[0m
	[32m- verify like query contains with filter push down[0m
	[32mTestPreAggregateTableSelection:[0m
	[32m- test sum and avg on same column should give proper results[0m
	[32m- test PreAggregate table selection 1[0m
	[32m- test PreAggregate table selection 2[0m
	[32m- test PreAggregate table selection 3[0m
	[32m- test PreAggregate table selection 4[0m
	[32m- test PreAggregate table selection 5[0m
	[32m- test PreAggregate table selection 6[0m
	[32m- test PreAggregate table selection 7[0m
	[32m- test PreAggregate table selection 8[0m
	[32m- test PreAggregate table selection 9[0m
	[32m- test PreAggregate table selection 10[0m
	[32m- test PreAggregate table selection 11[0m
	[32m- test PreAggregate table selection 12[0m
	[32m- test PreAggregate table selection 13[0m
	[32m- test PreAggregate table selection 14[0m
	[32m- test PreAggregate table selection 15[0m
	[32m- test PreAggregate table selection 16[0m
	[32m- test PreAggregate table selection 17[0m
	[32m- test PreAggregate table selection 18[0m
	[32m- test PreAggregate table selection 20[0m
	[32m- test PreAggregate table selection 21[0m
	[32m- test PreAggregate table selection 22[0m
	[32m- test PreAggregate table selection 23[0m
	[32m- test PreAggregate table selection 24[0m
	[32m- test PreAggregate table selection 25[0m
	[32m- test PreAggregate table selection 26[0m
	[32m- test PreAggregate table selection 27[0m
	[32m- test PreAggregate table selection 28[0m
	[32m- test if pre-agg table is hit with filter condition[0m
	[32m- test PreAggregate table selection 29[0m
	[32m- test pre-agg table with group by condition[0m
	[32m- test PreAggregate table selection 30[0m
	[32m- test PreAggregate table selection 31[0m
	[32m- test PreAggregate table selection 32[0m
	[32m- Test query with math operation hitting fact table[0m
	[32m- test PreAggregate table selection with timeseries and normal together[0m
	[32m- test table selection when unsupported aggregate function is present[0m
	[32mTestCreateTableWithTableComment:[0m
	[32m- test create table with table comment[0m
	[32m- test create table without table comment[0m
	[32mExpressionWithNullTestCase:[0m
	[32m- test to check in expression with null values[0m
	[32m- test to check not in expression with null values[0m
	[32m- test to check equals expression with null values[0m
	[32m- test to check not equals expression with null values[0m
	[32m- test to check greater than equals to expression with null values[0m
	[32m- test to check less than equals to expression with null values[0m
	[32m- test to check greater than expression with null values[0m
	[32m- test to check less than expression with null values[0m
	[32mTestBigDecimal:[0m
	[32m- test detail query on big decimal column[0m
	[32m- test sum function on big decimal column[0m
	[32m- test max function on big decimal column[0m
	[32m- test min function on big decimal column[0m
	[32m- test min datatype on big decimal column[0m
	[32m- test max datatype on big decimal column[0m
	[32m- test count function on big decimal column[0m
	[32m- test distinct function on big decimal column[0m
	[32m- test sum-distinct function on big decimal column[0m
	[32m- test count-distinct function on big decimal column[0m
	[32m- test filter query on big decimal column[0m
	[32m- test aggregation on big decimal column with increased precision[0m
	[32m- test big decimal for dictionary look up[0m
	[32m- test sum+10 aggregation on big decimal column with high precision[0m
	[32m- test sum*10 aggregation on big decimal column with high precision[0m
	[32m- test sum/10 aggregation on big decimal column with high precision[0m
	[32m- test sum-distinct+10 aggregation on big decimal column with high precision[0m
	[32m- test sum-distinct*10 aggregation on big decimal column with high precision[0m
	[32m- test sum-distinct/10 aggregation on big decimal column with high precision[0m
	[32m- test avg+10 aggregation on big decimal column with high precision[0m
	[32m- test avg*10 aggregation on big decimal column with high precision[0m
	[32m- test avg/10 aggregation on big decimal column with high precision[0m
	[32m- test decimal compression where both precision and data falls in integer range[0m
	[32mTestPreAggregateWithSubQuery:[0m
	[32m- test sub query PreAggregate table selection 1[0m
	[32m- test sub query PreAggregate table selection 2[0m
	[32m- test sub query PreAggregate table selection 3[0m
	[32m- test sub query PreAggregate table selection 4[0m
	[32mTestSkipEmptyLines:[0m
	[32m- test load options with true[0m
	[32m- test load options with false[0m
	[32m- test carbonproperties with true[0m
	[32m- test carbonproperties with false[0m
	[32m- test carbonproperties with false and load options true[0m
	[32m- test carbonproperties with true and load options false[0m
	[32mTestLoadDataWithSinglePass:[0m
	[32m- test data loading use one pass[0m
	[32m- test data loading use one pass when offer column dictionary file[0m
	[32m- test data loading use one pass when do incremental load[0m
	[32m- test data loading with dctionary exclude[0m
	[32mTestQueryWithOldCarbonDataFile:[0m
	[32m- Test select * query[0m
	[32mTestLoadTblNameIsKeyword:[0m
	[32m- test load data whose name is a keyword of data type[0m
	[32m- test case in-sensitiveness[0m
	[32m- test other ddl whose table name a keyword of data type[0m
	[32mBadRecordLoggerTest:[0m
	[32m- select count(*) from sales[0m
	[32m- select count(*) from serializable_values[0m
	[32m- select count(*) from serializable_values_false[0m
	[32m- select count(*) from empty_timestamp[0m
	[32m- select count(*) from insufficientColumn[0m
	[32m- select count(*) from insufficientColumn_false[0m
	[32m- select count(*) from emptyColumnValues[0m
	[32m- select count(*) from emptyColumnValues_false[0m
	[32m- select count(*) from empty_timestamp_false[0m
	[32m- test load ddl command[0m
	[32m- validate redirected data[0m
	[32mTestTableNameHasDbName:[0m
	[32m- test query when part of tableName has dbName[0m
	[32mInsertIntoCarbonTableTestCase:[0m
	[32m- insert from hive[0m
	[32m- insert from carbon-select columns[0m
	[32m- insert from carbon-select * columns[0m
	[32m- insert->carbon column is more then hive-fails[0m
	[32m- insert->insert wrong data types-pass[0m
	[32m- insert->insert with functions[0m
	[32m- insert->insert with different names and aliases[0m
	[32m- insert into existing load-pass[0m
	[32m- insert select from same table[0m
	[32m- insert overwrite[0m
	[32m- Load overwrite[0m
	[32m- Load overwrite fail handle[0m
	[32m- insert overwrite in group by scenario with t1 no record and t2 no record[0m
	[32m- insert overwrite in group by scenario with t1 no record and t2 some record[0m
	[32m- insert overwrite in group by scenario having record in both table[0m
	[32m- insert overwrite in group by scenario t1 some record and t2 no record[0m
	[32m- insert overwrite without group by scenario t1 no record and t2 no record[0m
	[32m- insert overwrite without group by scenario with t1 no record and t2 some record[0m
	[32m- insert overwrite without group by scenario having record in both table[0m
	[32m- test show segments after clean files for insert overwrite[0m
	[32mTestNotNullFilter:[0m
	[32m- select ID from carbonTableNotNull where ID is not null[0m
	[32mTestComplexTypeWithBigArray:[0m
	[32m- test with big string array[0m
	[32m- test with big int array[0m
	[32mTestAvgForBigInt:[0m
	[32m- test avg function on big int column[0m
	[32mBlockPruneQueryTestCase:[0m
	[32m- test block prune query[0m
	[32mTestLoadDataWithHiveSyntaxUnsafe:[0m
	[32m- create table with smallint type and query smallint table[0m
	[32m- test data loading and validate query output[0m
	[32m- test data loading with different case file header and validate query output[0m
	[32m- test hive table data loading[0m
	[32m- test carbon table data loading using old syntax[0m
	[32m- test carbon table data loading using new syntax compatible with hive[0m
	[32m- test carbon table data loading using new syntax with overwrite option compatible with hive[0m
	[32m- complex types data loading[0m
	[32m- complex types data loading with more unused columns and different order of complex columns in csv and create table[0m
	[32m- test carbon table data loading with csv file Header in caps[0m
	[32m- test duplicate column validation[0m
	[32m- test carbon table data loading with csv file Header in Mixed Case and create table columns in mixed case[0m
	[32m- complex types data loading with hive column having more than required column values[0m
	[32m- complex types & no dictionary columns data loading[0m
	[32m- array<string> and string datatype for same column is not working properly[0m
	[32m- test carbon table data loading when table name is in different case with create table, for UpperCase[0m
	[32m- test carbon table data loading when table name is in different case with create table ,for LowerCase[0m
	[32m- test carbon table data loading using escape char 1[0m
	[32m- test carbon table data loading using escape char 2[0m
	[32m- test carbon table data loading using escape char 3[0m
	[32m- test carbon table data loading with special character 1[0m
	[32m- test carbon table data loading with special character 2[0m
	[32m- test data which contain column less than schema[0m
	[32m- test data which contain column with decimal data type in array.[0m
	[32m- test data which contain column with decimal data type in struct.[0m
	[32m- test data which contain column with decimal data type in array of struct.[0m
	[32m- test data loading when delimiter is '|' and data with header[0m
	[32m- test data loading with comment option[0m
	[32m- test decimal var lenght comlumn page[0m
	[32mTestQueryForPartitionTable:[0m
	[32m- detail query on partition table: hash table[0m
	[32m- detail query on partition table: range partition[0m
	[32m- detail query on partition table: range partition on string[0m
	[32m- detail query on partition table: range partition on string no dictionary[0m
	[32m- detail query on partition table: list partition[0m
	[32m- detail query on partition table: list partition on string[0m
	[32m- detail query on partition table: list partition on string no dictionary[0m
	[32mDataMapWriterSuite:[0m
	[32m- test write datamap 2 pages[0m
	[32m- test write datamap 2 blocklet[0m
	[32mTestPreAggregateLoad:[0m
	[32m- test load into main table with pre-aggregate table[0m
	[32m- test load into main table with pre-aggregate table with dictionary_include[0m
	[32m- test load into main table with pre-aggregate table with single_pass[0m
	[32m- test load into main table with incremental load[0m
	[32m- test to check if exception is thrown for direct load on pre-aggregate table[0m
	[32m- test whether all segments are loaded into pre-aggregate table if segments are set on main table[0m
	[32m- test if pre-aagregate is overwritten if main table is inserted with insert overwrite[0m
	[32m- test load in aggregate table with Measure col[0m
	[32m- test partition load into main table with pre-aggregate table[0m
	[32m- test load into preaggregate table having group by clause[0m
	[32m- check load and select for avg double datatype[0m
	[32m- check load and select for avg int datatype[0m
	[32m- check load and select for avg bigint datatype[0m
	[32m- check load and select for avg short datatype[0m
	[32m- check load and select for avg float datatype[0m
	[32mTestNullValueSerialization:[0m
	[32m- test detail query on column having null values[0m
	[32m- test filter query on column is null[0m
	[32m- test filter query on column is not null[0m
	[32m- test filter query on columnValue=null[0m
	[32m- test filter query where date is null[0m
	[32mTimestampDataTypeDirectDictionaryTest:[0m
	[32m- test direct dictionary for not null condition[0m
	[32m- test direct dictionary for getting all the values[0m
	[32m- test direct dictionary for not equals condition[0m
	[32m- test direct dictionary for null condition[0m
	[32m- select doj from directDictionaryTable with equals filter[0m
	[32m- select doj from directDictionaryTable with regexp_replace equals filter[0m
	[32m- select doj from directDictionaryTable with regexp_replace NOT IN filter[0m
	[32m- select doj from directDictionaryTable with greater than filter[0m
	[32m- select count(doj) from directDictionaryTable[0m
	[32mAllDataTypesTestCaseJoin:[0m
	[32m- select empno,empname,utilization,count(salary),sum(empno) from alldatatypestableJoin where empname in ('arvind','ayushi') group by empno,empname,utilization[0m
	[32m- select e.empid from employee e inner join manager m on e.mgrid=m.empid[0m
	[32m- Union with alias fails[0m
	[32m- join with aggregate plan[0m
	[32mIntegerDataTypeTestCase:[0m
	[32m- select empno from integertypetableAgg[0m
	[32m- short int table boundary test, safe column page[0m
	[32m- short int table boundary test, unsafe column page[0m
	[32m- short int as target type in deltaIntegerCodec[0m
	[32m- Create a table that contains short data type[0m
	[32mTestDataMapCommand:[0m
	[32m- test datamap create[0m
	[32m- test datamap create with dmproperties[0m
	[32m- test datamap create with existing name[0m
	[32m- test datamap create with preagg[0m
	[32m- check hivemetastore after drop datamap[0m
	[32m- drop the table having pre-aggregate[0m
	[32m- test datamap create with preagg with duplicate name[0m
	[32m- test datamap drop with preagg[0m
	[32m- test show datamap without preaggregate[0m
	[32m- test show datamap with preaggregate[0m
	[32m- test show datamap with no datamap[0m
	[32m- test show datamap after dropping datamap[0m
	[32m- test if preaggregate load is successfull for hivemetastore[0m
	[32m- test preaggregate load for decimal column for hivemetastore[0m
	[32m- create pre-agg table with path[0m
	[32mTestLoadDataWithNullMeasures:[0m
	[32m- test carbon table data loading when there are null measures in data[0m
	[32mTimestampDataTypeDirectDictionaryWithNoDictTestCase:[0m
	[32m- select doj from directDictionaryTable[0m
	[32m- select doj from directDictionaryTable with equals filter[0m
	[32m- select doj from directDictionaryTable with greater than filter[0m
	[32mTestDimensionWithDecimalDataType:[0m
	[32m- test unsafe with bigdecimal[0m
	[32m- test aggregate query on dimension column with decimal data type[0m
	[32mTestDataLoadingForPartitionTable:[0m
	[32m- data loading for partition table: hash partition[0m
	[32m- data loading for partition table: range partition[0m
	[32m- data loading for partition table: list partition[0m
	[32m- single pass data loading for partition table: hash partition[0m
	[32m- single pass data loading for partition table: range partition[0m
	[32m- single pass data loading for partition table: list partition[0m
	[32m- Insert into for partition table: hash partition[0m
	[32m- Insert into for partition table: range partition[0m
	[32m- Insert into partition table: list partition[0m
	[32m- multiple data loading for partition table[0m
	[32m- multiple single pass data loading for partition table[0m
	[32m- multiple insertInto for partition table[0m
	[32m- multiple data loading and insertInto for partition table[0m
	[32m- list partition with string coloum and  list_info in upper case[0m
	[32m- badrecords on partition column[0m
	[32mTestTimeSeriesCreateTable:[0m
	[32m- test timeseries create table Zero[0m
	[32m- test timeseries create table One[0m
	[32m- test timeseries create table two[0m
	[32m- test timeseries create table three[0m
	[32m- test timeseries create table four[0m
	[32m- test timeseries create table five[0m
	[32m- test timeseries create table Six[0m
	[32m- test timeseries create table seven[0m
	[32m- test timeseries create table Eight[0m
	[32m- test timeseries create table Nine[0m
	[32m- test timeseries create table 10: Not supported hierarchy type[0m
	[32m- test timeseries create table 11: Table or view already exists in database[0m
	[32m- test timeseries create table 12: hierarchy type with space[0m
	[32m- test timeseries create table 13: don't support hour=2[0m
	[32m- test timeseries create table 14: Table or view 'maintable_agg1_hour' already exists in database[0m
	[32m- test timeseries create table 15: support hour=1,day=1,year=1,month=1[0m
	[32m- test timeseries create table 16: don't support create timeseries table on non timestamp column[0m
	[32m- test timeseries create table 17: Time series column dataTime does not exists in select[0m
	[32m- test timeseries create table 18: support day=1,year=1,month=1[0m
	[32m- test timeseries create table 19: support month=1,year=1[0m
	[32m- test timeseries create table 20: support year=1[0m
	[32m- test timeseries create table 21: don't support year=1,month=1[0m
	[32m- test timeseries create table 22: don't support month=1, year=1[0m
	[32m- test timeseries create table 23: support month=1[0m
	[32m- test timeseries create table 24: support day=1[0m
	[32m- test timeseries create table 25: support hour=1[0m
	[32m- test timeseries create table 26: support second=1[0m
	[32m- test timeseries create table 27: support SECOND=1[0m
	[32m- test timeseries create table 28: support second=1,year=1[0m
	[32m- test timeseries create table 29: test different data type[0m
	[32m- test timeseries create table 30: test data map name[0m
	[32m- test timeseries create table 31: timeseries.eventTime is null[0m
	[32m- test timeseries create table 32: table not exists[0m
	[32m- test timeseries create table 33: timeseries.hierarchy is null[0m
	[33m- test timeseries create table 34: using !!! IGNORED !!![0m
	[33m- test timeseries create table 35: should support if not exists !!! IGNORED !!![0m
	[32mTestLoadDataWithAutoLoadMerge:[0m
	[32m- test data loading with auto load merge[0m
	[32mDoubleDataTypeTest:[0m
	[32m- test to check result for double data type[0m
	[32m- Double Datatype Check with AdaptiveDeltaFloating Codec (BYTE)[0m
	[32m- Double Datatype Check with AdaptiveDeltaFloating Codec (Short)[0m
	[32m- Double Datatype Check with AdaptiveDeltaFloating Codec (Short_Int)[0m
	[32m- Double Datatype Check with AdaptiveDeltaFloating Codec (Int)[0m
	[32m- Double Datatype Check with AdaptiveDeltaFloating Codec (Long)[0m
	[32m- Double Datatype Check with AdaptiveFloatingCodec Codec (BYTE)[0m
	[32m- Double Datatype Check with AdaptiveFloatingCodec Codec (Short)[0m
	[32m- Double Datatype Check with AdaptiveFloatingCodec Codec (Short_Int)[0m
	[32m- Double Datatype Check with AdaptiveFloatingCodec Codec (Int)[0m
	[32m- Double Datatype Check with AdaptiveFloatingCodec Codec (Long)[0m
	[32mHorizontalCompactionTestCase:[0m
	[32m- test IUD Horizontal Compaction Update Alter Clean.[0m
	[32m- test IUD Horizontal Compaction Delete[0m
	[32m- test IUD Horizontal Compaction Multiple Update Vertical Compaction and Clean[0m
	[32m- test IUD Horizontal Compaction Update Delete and Clean[0m
	[32m- test IUD Horizontal Compaction Check Column Cardinality[0m
	[32m- test IUD Horizontal Compaction Segment Delete Test Case[0m
	[32m- test case full table delete[0m
	[32mMultiFilesDataLoagdingTestCase:[0m
	[32m- test data loading for multi files and nested folder[0m
	[32mIntegerDataTypeTestCase:[0m
	[32m- select empno from integertypetablejoin[0m
	[32mDataCompactionBlockletBoundryTest:[0m
	[32m- select country,count(*) as a from blocklettest[0m
	[32mGrtLtFilterProcessorTestCase:[0m
	[32m- Less Than Filter[0m
	[32m- Les Than equal Filter[0m
	[32m- Greater Than Filter[0m
	[32m- 0.0 and -0.0 equality check for double data type applying log function[0m
	[32m- Greater Than equal to Filter[0m
	[32m- Less Than Filter all null[0m
	[32m- Les Than equal Filter all null[0m
	[32m- Greater Than Filter all null[0m
	[32m- Greater Than equal to Filter all null[0m
	[32m- Less Than Filter no null[0m
	[32m- Less Than equal Filter no null[0m
	[32m- Greater Than Filter no null[0m
	[32m- Greater Than equal to Filter no null[0m
	[32mTestUpdateAndDeleteWithLargeData:[0m
	[32m- test the update and delete delete functionality for large data[0m
	[32mTestSortColumns:[0m
	[32m- create table sort columns dictionary include - int[0m
	[32m- create table sort columns dictionary exclude - int[0m
	[32m- create table sort columns dictionary include - bigint[0m
	[32m- create table sort columns dictionary exclude - bigint[0m
	[32m- create table with no dictionary sort_columns[0m
	[32m- create table with no dictionary sort_columns with dictionary exclude[0m
	[32m- create table with no dictionary sort_columns where NumberOfNoDictSortColumns is less than NoDictionaryCount[0m
	[32m- create table with dictionary sort_columns[0m
	[32m- create table with direct-dictioanry sort_columns[0m
	[32m- create table with multi-sort_columns and data loading with offheap safe[0m
	[32m- create table with multi-sort_columns and data loading with offheap and unsafe sort[0m
	[32m- create table with multi-sort_columns and data loading with offheap and inmemory sort[0m
	[32m- create table with multi-sort_columns and data loading with heap[0m
	[32m- create table with multi-sort_columns and data loading with heap and unsafe sort[0m
	[32m- create table with multi-sort_columns and data loading with heap and inmemory sort[0m
	[32m- compaction on sort_columns table[0m
	[32m- filter on sort_columns include no-dictionary, direct-dictionary and dictioanry[0m
	[32m- unsorted table creation, query data loading with heap and safe sort config[0m
	[32m- unsorted table creation, query and data loading with heap and unsafe sort config[0m
	[32m- unsorted table creation, query and loading with heap and inmemory sort config[0m
	[31m- unsorted table creation, query and data loading with offheap and safe sort config *** FAILED ***[0m
	[31m  Results do not match for query:[0m
	[31m  == Parsed Logical Plan ==[0m
	[31m  'Project [*][0m
	[31m  +- 'Filter ('empno = 11)[0m
	[31m     +- 'UnresolvedRelation `unsortedtable_offheap_safe`[0m
	  
	[31m  == Analyzed Logical Plan ==[0m
	[31m  empno: int, empname: string, designation: string, doj: timestamp, workgroupcategory: int, workgroupcategoryname: string, deptno: int, deptname: string, projectcode: int, projectjoindate: timestamp, projectenddate: timestamp, attendance: int, utilization: int, salary: int[0m
	[31m  Project [empno#191957, empname#191958, designation#191959, doj#191960, workgroupcategory#191961, workgroupcategoryname#191962, deptno#191963, deptname#191964, projectcode#191965, projectjoindate#191966, projectenddate#191967, attendance#191968, utilization#191969, salary#191970][0m
	[31m  +- Filter (empno#191957 = 11)[0m
	[31m     +- SubqueryAlias unsortedtable_offheap_safe[0m
	[31m        +- Relation[empno#191957,empname#191958,designation#191959,doj#191960,workgroupcategory#191961,workgroupcategoryname#191962,deptno#191963,deptname#191964,projectcode#191965,projectjoindate#191966,projectenddate#191967,attendance#191968,utilization#191969,salary#191970] CarbonDatasourceHadoopRelation [ Database name :default, Table name :unsortedtable_offheap_safe, Schema :Some(StructType(StructField(empno,IntegerType,true), StructField(empname,StringType,true), StructField(designation,StringType,true), StructField(doj,TimestampType,true), StructField(workgroupcategory,IntegerType,true), StructField(workgroupcategoryname,StringType,true), StructField(deptno,IntegerType,true), StructField(deptname,StringType,true), StructField(projectcode,IntegerType,true), StructField(projectjoindate,TimestampType,true), StructField(projectenddate,TimestampType,true), StructField(attendance,IntegerType,true), StructField(utilization,IntegerType,true), StructField(salary,IntegerType,true))) ][0m
	  
	[31m  == Optimized Logical Plan ==[0m
	[31m  CarbonDictionaryCatalystDecoder [CarbonDecoderRelation(Map(designation#191959 -> designation#191959, deptname#191964 -> deptname#191964, empno#191957 -> empno#191957, deptno#191963 -> deptno#191963, doj#191960 -> doj#191960, empname#191958 -> empname#191958, salary#191970 -> salary#191970, workgroupcategoryname#191962 -> workgroupcategoryname#191962, utilization#191969 -> utilization#191969, projectenddate#191967 -> projectenddate#191967, projectjoindate#191966 -> projectjoindate#191966, projectcode#191965 -> projectcode#191965, attendance#191968 -> attendance#191968, workgroupcategory#191961 -> workgroupcategory#191961),CarbonDatasourceHadoopRelation [ Database name :default, Table name :unsortedtable_offheap_safe, Schema :Some(StructType(StructField(empno,IntegerType,true), StructField(empname,StringType,true), StructField(designation,StringType,true), StructField(doj,TimestampType,true), StructField(workgroupcategory,IntegerType,true), StructField(workgroupcategoryname,StringType,true), StructField(deptno,IntegerType,true), StructField(deptname,StringType,true), StructField(projectcode,IntegerType,true), StructField(projectjoindate,TimestampType,true), StructField(projectenddate,TimestampType,true), StructField(attendance,IntegerType,true), StructField(utilization,IntegerType,true), StructField(salary,IntegerType,true))) ])], ExcludeProfile(ArrayBuffer()), CarbonAliasDecoderRelation(), true[0m
	[31m  +- Filter (isnotnull(empno#191957) && (empno#191957 = 11))[0m
	[31m     +- Relation[empno#191957,empname#191958,designation#191959,doj#191960,workgroupcategory#191961,workgroupcategoryname#191962,deptno#191963,deptname#191964,projectcode#191965,projectjoindate#191966,projectenddate#191967,attendance#191968,utilization#191969,salary#191970] CarbonDatasourceHadoopRelation [ Database name :default, Table name :unsortedtable_offheap_safe, Schema :Some(StructType(StructField(empno,IntegerType,true), StructField(empname,StringType,true), StructField(designation,StringType,true), StructField(doj,TimestampType,true), StructField(workgroupcategory,IntegerType,true), StructField(workgroupcategoryname,StringType,true), StructField(deptno,IntegerType,true), StructField(deptname,StringType,true), StructField(projectcode,IntegerType,true), StructField(projectjoindate,TimestampType,true), StructField(projectenddate,TimestampType,true), StructField(attendance,IntegerType,true), StructField(utilization,IntegerType,true), StructField(salary,IntegerType,true))) ][0m
	  
	[31m  == Physical Plan ==[0m
	[31m  *BatchedScan CarbonDatasourceHadoopRelation [ Database name :default, Table name :unsortedtable_offheap_safe, Schema :Some(StructType(StructField(empno,IntegerType,true), StructField(empname,StringType,true), StructField(designation,StringType,true), StructField(doj,TimestampType,true), StructField(workgroupcategory,IntegerType,true), StructField(workgroupcategoryname,StringType,true), StructField(deptno,IntegerType,true), StructField(deptname,StringType,true), StructField(projectcode,IntegerType,true), StructField(projectjoindate,TimestampType,true), StructField(projectenddate,TimestampType,true), StructField(attendance,IntegerType,true), StructField(utilization,IntegerType,true), StructField(salary,IntegerType,true))) ] default.unsortedtable_offheap_safe[empno#191957,empname#191958,designation#191959,doj#191960,workgroupcategory#191961,workgroupcategoryname#191962,deptno#191963,deptname#191964,projectcode#191965,projectjoindate#191966,projectenddate#191967,attendance#191968,utilization#191969,salary#191970] PushedFilters: [IsNotNull(empno), EqualTo(empno,11)][0m
	[31m  == Results ==[0m
	[31m  !== Correct Answer - 1 ==                                                                                                    == Spark Answer - 1 ==[0m
	[31m  ![11,arvind,SE,2007-01-17 00:00:00.0,1,developer,10,network,928478,2007-02-17 00:00:00.0,2016-11-29 00:00:00.0,96,96,5040]   [11,arvind,SE,null,1,developer,10,network,928478,null,null,96,96,5040] (QueryTest.scala:87)[0m
	[31m- unsorted table creation, query and data loading with offheap and unsafe sort config *** FAILED ***[0m
	[31m  Results do not match for query:[0m
	[31m  == Parsed Logical Plan ==[0md
	[31m  'Project [*][0m
	[31m  +- 'Filter ('empno = 11)[0m
	[31m     +- 'UnresolvedRelation `unsortedtable_offheap_unsafe`[0m
	  
	[31m  == Analyzed Logical Plan ==[0m
	[31m  empno: int, empname: string, designation: string, doj: timestamp, workgroupcategory: int, workgroupcategoryname: string, deptno: int, deptname: string, projectcode: int, projectjoindate: timestamp, projectenddate: timestamp, attendance: int, utilization: int, salary: int[0m
	[31m  Project [empno#192088, empname#192089, designation#192090, doj#192091, workgroupcategory#192092, workgroupcategoryname#192093, deptno#192094, deptname#192095, projectcode#192096, projectjoindate#192097, projectenddate#192098, attendance#192099, utilization#192100, salary#192101][0m
	[31m  +- Filter (empno#192088 = 11)[0m
	[31m     +- SubqueryAlias unsortedtable_offheap_unsafe[0m
	[31m        +- Relation[empno#192088,empname#192089,designation#192090,doj#192091,workgroupcategory#192092,workgroupcategoryname#192093,deptno#192094,deptname#192095,projectcode#192096,projectjoindate#192097,projectenddate#192098,attendance#192099,utilization#192100,salary#192101] CarbonDatasourceHadoopRelation [ Database name :default, Table name :unsortedtable_offheap_unsafe, Schema :Some(StructType(StructField(empno,IntegerType,true), StructField(empname,StringType,true), StructField(designation,StringType,true), StructField(doj,TimestampType,true), StructField(workgroupcategory,IntegerType,true), StructField(workgroupcategoryname,StringType,true), StructField(deptno,IntegerType,true), StructField(deptname,StringType,true), StructField(projectcode,IntegerType,true), StructField(projectjoindate,TimestampType,true), StructField(projectenddate,TimestampType,true), StructField(attendance,IntegerType,true), StructField(utilization,IntegerType,true), StructField(salary,IntegerType,true))) ][0m
	  
	[31m  == Optimized Logical Plan ==[0m
	[31m  CarbonDictionaryCatalystDecoder [CarbonDecoderRelation(Map(workgroupcategoryname#192093 -> workgroupcategoryname#192093, salary#192101 -> salary#192101, deptno#192094 -> deptno#192094, projectenddate#192098 -> projectenddate#192098, utilization#192100 -> utilization#192100, doj#192091 -> doj#192091, deptname#192095 -> deptname#192095, empno#192088 -> empno#192088, attendance#192099 -> attendance#192099, designation#192090 -> designation#192090, empname#192089 -> empname#192089, projectcode#192096 -> projectcode#192096, workgroupcategory#192092 -> workgroupcategory#192092, projectjoindate#192097 -> projectjoindate#192097),CarbonDatasourceHadoopRelation [ Database name :default, Table name :unsortedtable_offheap_unsafe, Schema :Some(StructType(StructField(empno,IntegerType,true), StructField(empname,StringType,true), StructField(designation,StringType,true), StructField(doj,TimestampType,true), StructField(workgroupcategory,IntegerType,true), StructField(workgroupcategoryname,StringType,true), StructField(deptno,IntegerType,true), StructField(deptname,StringType,true), StructField(projectcode,IntegerType,true), StructField(projectjoindate,TimestampType,true), StructField(projectenddate,TimestampType,true), StructField(attendance,IntegerType,true), StructField(utilization,IntegerType,true), StructField(salary,IntegerType,true))) ])], ExcludeProfile(ArrayBuffer()), CarbonAliasDecoderRelation(), true[0m
	[31m  +- Filter (isnotnull(empno#192088) && (empno#192088 = 11))[0m
	[31m     +- Relation[empno#192088,empname#192089,designation#192090,doj#192091,workgroupcategory#192092,workgroupcategoryname#192093,deptno#192094,deptname#192095,projectcode#192096,projectjoindate#192097,projectenddate#192098,attendance#192099,utilization#192100,salary#192101] CarbonDatasourceHadoopRelation [ Database name :default, Table name :unsortedtable_offheap_unsafe, Schema :Some(StructType(StructField(empno,IntegerType,true), StructField(empname,StringType,true), StructField(designation,StringType,true), StructField(doj,TimestampType,true), StructField(workgroupcategory,IntegerType,true), StructField(workgroupcategoryname,StringType,true), StructField(deptno,IntegerType,true), StructField(deptname,StringType,true), StructField(projectcode,IntegerType,true), StructField(projectjoindate,TimestampType,true), StructField(projectenddate,TimestampType,true), StructField(attendance,IntegerType,true), StructField(utilization,IntegerType,true), StructField(salary,IntegerType,true))) ][0m
	  
	[31m  == Physical Plan ==[0m
	[31m  *BatchedScan CarbonDatasourceHadoopRelation [ Database name :default, Table name :unsortedtable_offheap_unsafe, Schema :Some(StructType(StructField(empno,IntegerType,true), StructField(empname,StringType,true), StructField(designation,StringType,true), StructField(doj,TimestampType,true), StructField(workgroupcategory,IntegerType,true), StructField(workgroupcategoryname,StringType,true), StructField(deptno,IntegerType,true), StructField(deptname,StringType,true), StructField(projectcode,IntegerType,true), StructField(projectjoindate,TimestampType,true), StructField(projectenddate,TimestampType,true), StructField(attendance,IntegerType,true), StructField(utilization,IntegerType,true), StructField(salary,IntegerType,true))) ] default.unsortedtable_offheap_unsafe[empno#192088,empname#192089,designation#192090,doj#192091,workgroupcategory#192092,workgroupcategoryname#192093,deptno#192094,deptname#192095,projectcode#192096,projectjoindate#192097,projectenddate#192098,attendance#192099,utilization#192100,salary#192101] PushedFilters: [IsNotNull(empno), EqualTo(empno,11)][0m
	[31m  == Results ==[0m
	[31m  !== Correct Answer - 1 ==                                                                                                    == Spark Answer - 1 ==[0m
	[31m  ![11,arvind,SE,2007-01-17 00:00:00.0,1,developer,10,network,928478,2007-02-17 00:00:00.0,2016-11-29 00:00:00.0,96,96,5040]   [11,arvind,SE,null,1,developer,10,network,928478,null,null,96,96,5040] (QueryTest.scala:87)[0m
	[31m- unsorted table creation, query and data loading with offheap and inmemory sort config *** FAILED ***[0m
	[31m  Results do not match for query:[0m
	[31m  == Parsed Logical Plan ==[0m
	[31m  'Project [*][0m
	[31m  +- 'Filter ('empno = 11)[0m
	[31m     +- 'UnresolvedRelation `unsortedtable_offheap_inmemory`[0m
	  
	[31m  == Analyzed Logical Plan ==[0m
	[31m  empno: int, empname: string, designation: string, doj: timestamp, workgroupcategory: int, workgroupcategoryname: string, deptno: int, deptname: string, projectcode: int, projectjoindate: timestamp, projectenddate: timestamp, attendance: int, utilization: int, salary: int[0m
	[31m  Project [empno#192219, empname#192220, designation#192221, doj#192222, workgroupcategory#192223, workgroupcategoryname#192224, deptno#192225, deptname#192226, projectcode#192227, projectjoindate#192228, projectenddate#192229, attendance#192230, utilization#192231, salary#192232][0m
	[31m  +- Filter (empno#192219 = 11)[0m
	[31m     +- SubqueryAlias unsortedtable_offheap_inmemory[0m
	[31m        +- Relation[empno#192219,empname#192220,designation#192221,doj#192222,workgroupcategory#192223,workgroupcategoryname#192224,deptno#192225,deptname#192226,projectcode#192227,projectjoindate#192228,projectenddate#192229,attendance#192230,utilization#192231,salary#192232] CarbonDatasourceHadoopRelation [ Database name :default, Table name :unsortedtable_offheap_inmemory, Schema :Some(StructType(StructField(empno,IntegerType,true), StructField(empname,StringType,true), StructField(designation,StringType,true), StructField(doj,TimestampType,true), StructField(workgroupcategory,IntegerType,true), StructField(workgroupcategoryname,StringType,true), StructField(deptno,IntegerType,true), StructField(deptname,StringType,true), StructField(projectcode,IntegerType,true), StructField(projectjoindate,TimestampType,true), StructField(projectenddate,TimestampType,true), StructField(attendance,IntegerType,true), StructField(utilization,IntegerType,true), StructField(salary,IntegerType,true))) ][0m
	  
	[31m  == Optimized Logical Plan ==[0m
	[31m  CarbonDictionaryCatalystDecoder [CarbonDecoderRelation(Map(projectcode#192227 -> projectcode#192227, deptno#192225 -> deptno#192225, attendance#192230 -> attendance#192230, workgroupcategoryname#192224 -> workgroupcategoryname#192224, salary#192232 -> salary#192232, utilization#192231 -> utilization#192231, empname#192220 -> empname#192220, projectjoindate#192228 -> projectjoindate#192228, projectenddate#192229 -> projectenddate#192229, empno#192219 -> empno#192219, doj#192222 -> doj#192222, designation#192221 -> designation#192221, workgroupcategory#192223 -> workgroupcategory#192223, deptname#192226 -> deptname#192226),CarbonDatasourceHadoopRelation [ Database name :default, Table name :unsortedtable_offheap_inmemory, Schema :Some(StructType(StructField(empno,IntegerType,true), StructField(empname,StringType,true), StructField(designation,StringType,true), StructField(doj,TimestampType,true), StructField(workgroupcategory,IntegerType,true), StructField(workgroupcategoryname,StringType,true), StructField(deptno,IntegerType,true), StructField(deptname,StringType,true), StructField(projectcode,IntegerType,true), StructField(projectjoindate,TimestampType,true), StructField(projectenddate,TimestampType,true), StructField(attendance,IntegerType,true), StructField(utilization,IntegerType,true), StructField(salary,IntegerType,true))) ])], ExcludeProfile(ArrayBuffer()), CarbonAliasDecoderRelation(), true[0m
	[31m  +- Filter (isnotnull(empno#192219) && (empno#192219 = 11))[0m
	[31m     +- Relation[empno#192219,empname#192220,designation#192221,doj#192222,workgroupcategory#192223,workgroupcategoryname#192224,deptno#192225,deptname#192226,projectcode#192227,projectjoindate#192228,projectenddate#192229,attendance#192230,utilization#192231,salary#192232] CarbonDatasourceHadoopRelation [ Database name :default, Table name :unsortedtable_offheap_inmemory, Schema :Some(StructType(StructField(empno,IntegerType,true), StructField(empname,StringType,true), StructField(designation,StringType,true), StructField(doj,TimestampType,true), StructField(workgroupcategory,IntegerType,true), StructField(workgroupcategoryname,StringType,true), StructField(deptno,IntegerType,true), StructField(deptname,StringType,true), StructField(projectcode,IntegerType,true), StructField(projectjoindate,TimestampType,true), StructField(projectenddate,TimestampType,true), StructField(attendance,IntegerType,true), StructField(utilization,IntegerType,true), StructField(salary,IntegerType,true))) ][0m
	  
	[31m  == Physical Plan ==[0m
	[31m  *BatchedScan CarbonDatasourceHadoopRelation [ Database name :default, Table name :unsortedtable_offheap_inmemory, Schema :Some(StructType(StructField(empno,IntegerType,true), StructField(empname,StringType,true), StructField(designation,StringType,true), StructField(doj,TimestampType,true), StructField(workgroupcategory,IntegerType,true), StructField(workgroupcategoryname,StringType,true), StructField(deptno,IntegerType,true), StructField(deptname,StringType,true), StructField(projectcode,IntegerType,true), StructField(projectjoindate,TimestampType,true), StructField(projectenddate,TimestampType,true), StructField(attendance,IntegerType,true), StructField(utilization,IntegerType,true), StructField(salary,IntegerType,true))) ] default.unsortedtable_offheap_inmemory[empno#192219,empname#192220,designation#192221,doj#192222,workgroupcategory#192223,workgroupcategoryname#192224,deptno#192225,deptname#192226,projectcode#192227,projectjoindate#192228,projectenddate#192229,attendance#192230,utilization#192231,salary#192232] PushedFilters: [IsNotNull(empno), EqualTo(empno,11)][0m
	[31m  == Results ==[0m
	[31m  !== Correct Answer - 1 ==                                                                                                    == Spark Answer - 1 ==[0m
	[31m  ![11,arvind,SE,2007-01-17 00:00:00.0,1,developer,10,network,928478,2007-02-17 00:00:00.0,2016-11-29 00:00:00.0,96,96,5040]   [11,arvind,SE,null,1,developer,10,network,928478,null,null,96,96,5040] (QueryTest.scala:87)[0m
	[32m- create table with invalid values for numeric data type columns specified as sort_columns[0m
	[32m- describe formatted for sort_columns[0m
	[32m- duplicate columns in sort_columns[0m
	[32m- Test tableTwo data[0m
	[32m- Measure columns in sort_columns[0m
	[32mTestGlobalSortDataLoad:[0m
	[32m- Make sure the result is right and sorted in global level[0m
	[32m- Test GLOBAL_SORT with BAD_RECORDS_ACTION = 'FAIL'[0m
	[32m- Test GLOBAL_SORT with BAD_RECORDS_ACTION = 'REDIRECT'[0m
	[32m- Test GLOBAL_SORT with SINGLE_PASS[0m
	[32m- Don't support GLOBAL_SORT on partitioned table[0m
	[32m- Number of partitions should be greater than 0[0m
	[32m- Compaction GLOBAL_SORT * 2[0m
	[33m- DDL > SET !!! IGNORED !!![0m
	[32m- DDL > carbon.properties[0m
	[33m- SET > carbon.properties !!! IGNORED !!![0m
	[32m- carbon.properties[0m
	[32m- LOAD with DELETE[0m
	[32m- LOAD with UPDATE[0m
	[32m- LOAD with small files[0m
	[32m- INSERT INTO[0m
	[32m- Test with different date types[0m
	[32mTestTimeseriesDataLoad:[0m
	[32m- test Year level timeseries data validation1 [0m
	[32m- test month level timeseries data validation1 [0m
	[32m- test day level timeseries data validation1 [0m
	[32m- test Year level timeseries data validation[0m
	[32m- test month level timeseries data validation[0m
	[32m- test day level timeseries data validation[0m
	[32m- test hour level timeseries data validation[0m
	[32m- test minute level timeseries data validation[0m
	[32m- test second level timeseries data validation[0m
	[32m- test if timeseries load is successful on table creation[0m
	[32m- test if timeseries load twice is successful on table creation[0m
	[33m- load data into mainTable after create timeseries datamap on table !!! IGNORED !!![0m
	[32mTestCreateTableAsSelect:[0m
	[32m- test create table as select with select from same table name when table exists[0m
	[32m- test create table as select with select from same table name when table does not exists[0m
	[32m- test create table as select with select from same table name with if not exists clause[0m
	[32m- test create table as select with select from another carbon table[0m
	[32m- test create table as select with select from another parquet table[0m
	[32m- test create table as select with select from another hive/orc table[0m
	[32m- test create table as select with where clause in select from carbon table that returns data[0m
	[32m- test create table as select with where clause in select from carbon table that does not return data[0m
	[32m- test create table as select with where clause in select from carbon table and load again[0m
	[32m- test create table as select with where clause in select from parquet table[0m
	[32m- test create table as select with where clause in select from hive/orc table[0m
	[32m- test create table as select with select directly having the data[0m
	[32m- test create table as select with TBLPROPERTIES[0m
	[32m- test create table as select with column name as tupleid[0m
	[32m- test create table as select with column name as positionid[0m
	[32m- test create table as select with column name as positionreference[0m
	[36mRun completed in 39 minutes, 40 seconds.[0m
	[36mTotal number of tests run: 1539[0m
	[36mSuites: completed 166, aborted 0[0m
	[36mTests: succeeded 1535, failed 4, canceled 0, ignored 15, pending 0[0m
	[31m*** 4 TESTS FAILED ***[0m
