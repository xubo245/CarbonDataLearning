
ESC[33mcommit 771a4f37c8b0b050215259161ffca95b89d3b8c5ESC[mESC[33m (ESC[mESC[1;36mHEAD -> ESC[mESC[1;32mPreAggregateTestForTimeSeriesESC[mESC[33m, ESC[mESC[1;31mxubo/PreAggregateTestForTimeSeriesESC[mESC[33m)ESC[m
Author: xubo245 <601450868@qq.com>
Date:   Sun Feb 4 12:43:59 2018 +0800

    fix test case

ESC[33mcommit 61231dd0dd5efff59162cb34106c1c091ac17b89ESC[m
Author: xubo245 <601450868@qq.com>
Date:   Fri Feb 2 11:22:20 2018 +0800

     [CARBONDATA-2073][CARBONDATA-1516][Tests] Add test cases for timeseries pre-aggregate table
    
        add using test, to be fixed
    
        add drop datamap test cases
    
        add drop test case and change timestamp
    
        add ignore
    
        "optimize the test cases"
    
        add test case for load twice
    
        add  some test case for IUD in timeseries table
    
    unify test case name
    
    change ignore to test, the issue not happen
    
    fix test error
    
    fix CI error


     [CARBONDATA-2129][CARBONDATA-2094][CARBONDATA-1516] Carbon should give a remind when user use old syntax to create timeseries pre-aggregate table


  test("test pre agg create table 23: don't support blank space when using 'preaggregate '") {
    val e = intercept[MalformedDataMapCommandException] {
      sql(
        """
          | CREATE DATAMAP preagg1 ON TABLE PreAggMain
          | USING 'preaggregate ' AS SELECT a,SUM(b)
          | FROM PreAggMain
          | GROUP BY a""".stripMargin)
    }
    assert(e.getMessage.equals("Unknown datamap provider/class preaggregate "))
  }
