	
[CARBONDATA-2073][CARBONDATA-1516][Tests] Add test cases for timeseries pre-aggregate table


    [CARBONDATA-2075][CARBONDATA-1516] it should throw no such datamap when drop datamap and the datamap does not exist
    
    noSuchDataMapException extends MalformedCarbonCommandException


    fix error: drop datamap should throw exception when carbonTable.get.getTableInfo.getDataMapSchemaList.size() == 0



  fix error: drop datamap should throw exception when carbonTable.get.getTableInfo.getDataMapSchemaList.size() == 0
    
     and fix CI error

 [CARBONDATA-2086][CARBONDATA-1516] Create datamap should throw exception if using improper string

 [CARBONDATA-2088][CARBONDATA-1516] It better using 'timeseries_cube' instead of preaggregate for timeseries pre-aggregate table
 [CARBONDATA-2089] Test case is incorrect

 exception is error. Because some test case always run success whether sql throw exception

[CARBONDATA-2082][CARBONDATA-1516] Timeseries pre-aggregate table should support the blank space
[CARBONDATA-2083][CARBONDATA-1516] Timeseries pre-aggregate table should support hour !=1 and so on 


[CARBONDATA-2085][CARBONDATA-1516] Timeseries pre-aggregate table is error when load data after create Timeseries pre-aggregate table



ESC[33mcommit ab68ae8361a2a85afeb7dbac68777227961c5992ESC[mESC[33m (ESC[mESC[1;36mHEAD -> ESC[mESC[1;32mPreAggregateTestForTimeSeriesESC[mESC[33m)ESC[m
Author: xubo245 <601450868@qq.com>
Date:   Thu Feb 1 15:55:39 2018 +0800

    fix test error

ESC[33mcommit b4991c93cf864d4468843128ce25c49431aabe88ESC[m
Author: xubo245 <601450868@qq.com>
Date:   Thu Feb 1 11:17:44 2018 +0800

    [CARBONDATA-2073][CARBONDATA-1516][Tests] Add test cases for timeseries pre-aggregate table
    
    add using test, to be fixed
    
    add drop datamap test cases
    
    add drop test case and change timestamp
    
    add test cases
    
    add ignore
    
    "optimize the test cases"
    
    add test case for load twice
    
    add  some test case for IUD in timeseries table
    
    fix test error
    
    fix test error: timestamp
    
    update
