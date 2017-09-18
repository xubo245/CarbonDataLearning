
ESC[33mcommit b51883bcfeecb5ed1fd806f55d0c5dc71bc356ecESC[mESC[33m (ESC[mESC[1;36mHEAD -> ESC[mESC[1;32mpr-1438ESC[mESC[33m)ESC[m
Author: chenerlu <chenerlu@huawei.com>
Date:   Sat Sep 16 21:59:44 2017 +0800

    fix test case failed in spark1.6

ESC[33mcommit ea5e592da2ffcb8ebe970d943d4330e6caf372a8ESC[m
Author: chenerlu <chenerlu@huawei.com>
Date:   Sat Sep 16 17:52:07 2017 +0800

    fix sdvtest

ESC[33mcommit 66142e0d4a7a1cbd09685c41fd81f9ca6d5c67feESC[m
Author: chenerlu <chenerlu@huawei.com>
Date:   Sat Sep 16 17:49:10 2017 +0800

    fix sdvtest

ESC[33mcommit f4a4e679f4ceb9a0f90ff965be6b49ebdaceeaa2ESC[m
Author: chenerlu <chenerlu@huawei.com>
Date:   Sat Sep 16 17:00:13 2017 +0800

    fix scala style

ESC[33mcommit bb29fd5e16d22407e13ba88813d14b4192cbcda9ESC[m
Author: chenerlu <chenerlu@huawei.com>
Date:   Mon Sep 4 20:54:55 2017 +0800

    Unify the sort column and sort scope in create table command
    
    move sort scope from segment level to table level
    
    move sort scope from segment level to table level
    
    move sort scope from segment level to table level
    
    Fix scala stype
    
    fix compile error
    
    fix TestCreateTableWithSortScope
    
    add a spaceline
    
    fix scala style
    
    fix null exception
    
    fix comment
    
    fix comment and add testcase
    
    fix commemnt
    
    fix scala style
    
    fix testcase

ESC[33mcommit 6f204376f880231c8f537052fe1b29008178aad8ESC[m
Author: manishgupta88 <tomanishgupta18@gmail.com>
Date:   Thu Aug 24 12:43:58 2017 +0530

















ESC[33mcommit 03a20960b84dafc941100f189c502c4c15def616ESC[mESC[33m (ESC[mESC[1;36mHEAD -> ESC[mESC[1;32mcompactionESC[mESC[33m)ESC[m
Author: xubo245 <601450868@qq.com>
Date:   Wed Sep 13 20:15:39 2017 +0800

    compaction supprt global_sort

ESC[33mcommit 8c1ddbf2a6ba74a0a6d1333d95d0f6ad70297c01ESC[m
Author: Jacky Li <jacky.likun@qq.com>
Date:   Tue Sep 12 09:33:20 2017 +0800

    [CARBONDATA-1400] Fix bug of array column out of bound when writing carbondata file
    
    If there is a big array in input csv file, when loading carbondata table, it may throw ArrayIndexOutOfBoundException because data exceed page size (32000 rows)
    
    This PR fixed it by changing complex column encoding to DirectCompressionEncoding
    This PR added a test case to test input data with big array
    
    This closes #1273

ESC[33mcommit b414393bed319ea970036aac72f140b9389bccf9ESC[m
Author: vandana <vandana.yadav759@gmail.com>
Date:   Mon Jul 31 19:32:58 2017 +0530

    [CARBONDATA-1117]updated configuration-parameters.md and useful-tips-on-carbondata.md files for SET/RESET
    
    This closes #1219

ESC[33mcommit 2176a2f1d317763f5423dc1a5c254ee29e096c4bESC[m
Author: dhatchayani <dhatcha.official@gmail.com>
Date:   Wed Sep 6 15:43:56 2017 +0530

    [CARBONDATA-1452] Issue with loading timestamp data beyond cutoff
    
    While generating surrogate for timestamp dictionary column, we are casting the value to int. We are considering only the +ve values for generating dictionary, when the value is out of range,overflow occurs and cyclic rotation happen
s while casting, in the cyclic rotation there is possibility of getting +ve values in overflow cases too.
    
    Lets say cutoff timestamp is 1970-01-01 05:30:00, so we will be able to load data 68 years from this date, not beyond 68 years
    
    While loading 3007-01-01 00:00:00, dictionary generation will throw bad record exception as converting this data to int is -ve (overflows and cyclic rotation)
    
    But while loading 4016-01-01 00:00:00, dictionary will be generated for this as converting this data to int is +ve (overflows and cyclic rotation) --> This data is loaded but not as actual value. Different timestamp will be loaded.
    
    This PR has,
    
    (1) Refactoring
    (2) Checking overflow
    
