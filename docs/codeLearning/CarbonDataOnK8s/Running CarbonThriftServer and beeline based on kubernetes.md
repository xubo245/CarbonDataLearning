	


	[root@sparkonk8s-46929-p4jdl k8s]# ./carbon6_sparkPI1000t1.sh
	2018-03-14 08:10:10 WARN  Utils:66 - Your hostname, sparkonk8s-46929-p4jdl.novalocal resolves to a loopback address: 127.0.0.1; using 192.168.0.202 instead (on interface eth0)
	2018-03-14 08:10:10 WARN  Utils:66 - Set SPARK_LOCAL_IP if you need to bind to another address
	2018-03-14 08:10:10 INFO  LoggingPodStatusWatcherImpl:54 - State changed, new state:
	         pod name: spark-pi-1521015009517-driver
	         namespace: default
	         labels: spark-app-selector -> spark-5c257b0ec714476fae59c70d4418fa01, spark-role -> driver
	         pod uid: 1d8e32ff-275f-11e8-89bc-fa163e44a675
	         creation time: 2018-03-14T08:10:10Z
	         service account name: default
	         volumes: spark-local-dir-0-spark-03e54033-8a65-411d-90b9-47be5bf3bcad, default-token-8blbc
	         node name: N/A
	         start time: N/A
	         container images: N/A
	         phase: Pending
	         status: []
	2018-03-14 08:10:10 INFO  LoggingPodStatusWatcherImpl:54 - State changed, new state:
	         pod name: spark-pi-1521015009517-driver
	         namespace: default
	         labels: spark-app-selector -> spark-5c257b0ec714476fae59c70d4418fa01, spark-role -> driver
	         pod uid: 1d8e32ff-275f-11e8-89bc-fa163e44a675
	         creation time: 2018-03-14T08:10:10Z
	         service account name: default
	         volumes: spark-local-dir-0-spark-03e54033-8a65-411d-90b9-47be5bf3bcad, default-token-8blbc
	         node name: 192.168.0.29
	         start time: N/A
	         container images: N/A
	         phase: Pending
	         status: []
	2018-03-14 08:10:10 INFO  LoggingPodStatusWatcherImpl:54 - State changed, new state:
	         pod name: spark-pi-1521015009517-driver
	         namespace: default
	         labels: spark-app-selector -> spark-5c257b0ec714476fae59c70d4418fa01, spark-role -> driver
	         pod uid: 1d8e32ff-275f-11e8-89bc-fa163e44a675
	         creation time: 2018-03-14T08:10:10Z
	         service account name: default
	         volumes: spark-local-dir-0-spark-03e54033-8a65-411d-90b9-47be5bf3bcad, default-token-8blbc
	         node name: 192.168.0.29
	         start time: 2018-03-14T08:10:10Z
	         container images: 100.125.0.198:20202/spark/spark-driver:0.0.6carbon
	         phase: Pending
	         status: [ContainerStatus(containerID=null, image=100.125.0.198:20202/spark/spark-driver:0.0.6carbon, imageID=, lastState=ContainerState(running=null, terminated=null, waiting=null, additionalProperties={}), name=spark-kubernetes-driver, ready=false, restartCount=0, state=ContainerState(running=null, terminated=null, waiting=ContainerStateWaiting(message=null, reason=ContainerCreating, additionalProperties={}), additionalProperties={}), additionalProperties={})]
	2018-03-14 08:10:10 INFO  Client:54 - Waiting for application spark-pi to finish...
	2018-03-14 08:10:12 INFO  LoggingPodStatusWatcherImpl:54 - State changed, new state:
	         pod name: spark-pi-1521015009517-driver
	         namespace: default
	         labels: spark-app-selector -> spark-5c257b0ec714476fae59c70d4418fa01, spark-role -> driver
	         pod uid: 1d8e32ff-275f-11e8-89bc-fa163e44a675
	         creation time: 2018-03-14T08:10:10Z
	         service account name: default
	         volumes: spark-local-dir-0-spark-03e54033-8a65-411d-90b9-47be5bf3bcad, default-token-8blbc
	         node name: 192.168.0.29
	         start time: 2018-03-14T08:10:10Z
	         container images: 100.125.0.198:20202/spark/spark-driver:0.0.6carbon
	         phase: Running
	         status: [ContainerStatus(containerID=docker://03be223a1a45710c4615ae5bf5b9ca1b391e3fc769e01630592e2e2740598776, image=100.125.0.198:20202/spark/spark-driver:0.0.6carbon, imageID=docker://sha256:9839d13b14104027b149167f21dc08c9fd2b5a6635b7c6c70e80b2ae02d89edd, lastState=ContainerState(running=null, terminated=null, waiting=null, additionalProperties={}), name=spark-kubernetes-driver, ready=true, restartCount=0, state=ContainerState(running=ContainerStateRunning(startedAt=Time(time=2018-03-14T08:10:11Z, additionalProperties={}), additionalProperties={}), terminated=null, waiting=null, additionalProperties={}), additionalProperties={})]

## shell script

	spark-submit \
	  --deploy-mode cluster \
	  --master k8s://https://192.168.0.188:5443 \
	  --class org.apache.carbondata.spark.thriftserver.CarbonThriftServer \
	  --kubernetes-namespace default \
	  --conf spark.executor.instances=3 \
	  --conf spark.executor.memory=3072m \
	  --conf spark.driver.memory=4096m \
	  --conf spark.executor.cores=1 \
	  --conf spark.app.name=spark-pi \
	  --conf spark.kubernetes.initcontainer.docker.image=100.125.0.198:20202/spark/spark-init:0.0.6carbon \
	  --conf spark.kubernetes.driver.docker.image=100.125.0.198:20202/spark/spark-driver:0.0.6carbon \
	  --conf spark.kubernetes.executor.docker.image=100.125.0.198:20202/spark/spark-executor:0.0.6carbon \
	  local:///opt/spark/jars/apache-carbondata-1.3.1-bin-spark2.2.0-hadoop2.7.2.jar \
	  ./
	

## Obtain 

	[root@sparkonk8s-46929-p4jdl k8s]# kubectl get pods -o wide
	NAME                            READY     STATUS    RESTARTS   AGE       IP              NODE
	icagent-2fhzc                   0/0       Running   0          9d        192.168.0.29    192.168.0.29
	icagent-d84d7                   0/0       Running   0          9d        192.168.0.202   192.168.0.202
	icagent-f765n                   0/0       Running   0          9d        192.168.0.174   192.168.0.174
	spark-pi-1521015009517-driver   1/1       Running   0          25m       172.31.0.22     192.168.0.29
	spark-pi-1521015009517-exec-3   1/1       Running   0          25m       172.31.0.23     192.168.0.29

## Run beeline

	[root@sparkonk8s-46929-p4jdl spark-2.2.0-k8s-0.5.0-bin-2.7.3]# ./bin/beeline -u jdbc:hive2://172.31.0.22:10000
	Connecting to jdbc:hive2://172.31.0.22:10000
	2018-03-14 08:36:01 INFO  Utils:310 - Supplied authorities: 172.31.0.22:10000
	2018-03-14 08:36:01 INFO  Utils:397 - Resolved authority: 172.31.0.22:10000
	2018-03-14 08:36:01 INFO  HiveConnection:203 - Will try to open client transport with JDBC Uri: jdbc:hive2://172.31.0.22:10000
	Connected to: Spark SQL (version 2.2.0)
	Driver: Hive JDBC (version 1.2.1.spark2)
	Transaction isolation: TRANSACTION_REPEATABLE_READ
	Beeline version 1.2.1.spark2 by Apache Hive
	0: jdbc:hive2://172.31.0.22:10000> show tables;
	+-----------+------------+--------------+--+
	| database  | tableName  | isTemporary  |
	+-----------+------------+--------------+--+
	+-----------+------------+--------------+--+
	No rows selected (0.376 seconds)
	0: jdbc:hive2://172.31.0.22:10000> show databases;
	+---------------+--+
	| databaseName  |
	+---------------+--+
	| default       |
	+---------------+--+
