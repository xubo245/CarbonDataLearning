	
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