We need to take some scenarios into consideration and employ different compaction strategies for them.  
Scenarios are concluded as follows:
 
1. Loading data once per day, the data is about several gigabytes each time  
   Recommended compaction strategy: Manual trigger Compaction. The compaction type can be minor and using default threshold. If users want to adjust compaction level, they can changed the value of "carbon.compaction.level.threshold". 
2. Loading data once per day, the data is about several hundred megabytes each time  
   Recommended compaction strategy: Using auto merge by setting "carbon.enable.auto.load.merge" as true. The auto merge uses minor compaction, and the default value of "carbon.compaction.level.threshold" is "4,3". 
3. Loading data once every 5 minutes, the data is about several gigabytes each time  
   Recommended compaction strategy: Using major compaction in free time, such as triggering compact at 2:00 a.m. Because the compaction needs lots of computation overhead in this scenario and it will affect performance, users should trigger compaction in free time if they want to decrease the effect for other service. If users want to compact all segments, they can set the value of "carbon.major.compaction.size" as big enough
4. Loading data once every 5 minutes, the data is about several hundred megabytes each time  
   Recommended compaction strategy: Using auto merge. If users want to improve the performance of query function, they can decrease the number of level 2 compacted segments and set the value of "carbon.compaction.level.threshold" as bigger value, such as "12,24".  


Whether do we try to decrease users operation and add more function into auto merge?    
Auto merge parameter: 

- Type: major or minor
- Trigger time: support every day, every month, every year? 

Goals:  

- Scenario 1: Auto merge every month, such as the first day in each month. The compaction type is major, and set the value of "carbon.major.compaction.size" as big enough.  
- Scenario 3: Auto merge every day, trigger compaction in free time.
