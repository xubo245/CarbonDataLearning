We need to take table some scenarios into consideration and employ different compaction strategies:

1. load data once per day, the data is about several gigabytes each time  
   Compaction strategy: Compact by manual trigger
2. load data once per day, the data is about several hundred megabytes each time  
   Compaction strategy: Auto merge
3. load data once every 5 minutes, the data is about several gigabytes each time  
   Compaction strategy: Major compact in free time, such as compact at 2:00 a.m. If users want to compact all segments, they can set the value of "carbon.major.compaction.size" as big enough
4. load data once every 5 minutes, the data is about several hundred megabytes each time  
   Compaction strategy: Auto merge, the value of "carbon.compaction.level.threshold" should be "12,24" 
