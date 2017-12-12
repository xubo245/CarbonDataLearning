ANCCompaction性能测试


##时间测试
1000次load

select:

	noCompactionTime:407161293
	compactionTime:11094272


##测试1
100次加载，每个文件一万行

第一次：

	noCompactionTime:118554616
	compactionTime:14375987

第二次：
	
	noCompactionTime:124624200
	compactionTime:15232913

第三次

	noCompactionTime:119479658
	compactionTime:14102201

第四次

noCompactionTime:117262165
compactionTime:13471310

第五次

noCompactionTime:109595761
compactionTime:13141475

##测试2
1000次加载，每个文件一万行

第一次

	noCompactionTime:185924057
	compactionTime:9663502

第二次
	
	noCompactionTime:118008713
	compactionTime:10227254

第三次：

	noCompactionTime:116846856
	compactionTime:10051953

第四次

	noCompactionTime:115409290
	compactionTime:9611412

第五次

noCompactionTime:116078952
compactionTime:9030741

##测试3
10000次加载，每个文件一万行

