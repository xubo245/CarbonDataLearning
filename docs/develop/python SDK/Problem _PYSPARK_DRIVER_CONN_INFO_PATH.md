## Problem

	19/02/12 23:23:15 WARN Utils: Your hostname, localhost resolves to a loopback address: 127.0.0.1; using 192.168.3.124 instead (on interface en0)
	19/02/12 23:23:15 WARN Utils: Set SPARK_LOCAL_IP if you need to bind to another address
	19/02/12 23:23:15 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
	Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
	Setting default log level to "WARN".
	To adjust logging level use sc.setLogLevel(newLevel). For SparkR, use setLogLevel(newLevel).
	Exception in thread "main" java.util.NoSuchElementException: key not found: _PYSPARK_DRIVER_CONN_INFO_PATH
		at scala.collection.MapLike.default(MapLike.scala:235)
		at scala.collection.MapLike.default$(MapLike.scala:234)
		at scala.collection.AbstractMap.default(Map.scala:63)
		at scala.collection.MapLike.apply(MapLike.scala:144)
		at scala.collection.MapLike.apply$(MapLike.scala:143)
		at scala.collection.AbstractMap.apply(Map.scala:63)
		at org.apache.spark.api.python.PythonGatewayServer$.main(PythonGatewayServer.scala:64)
		at org.apache.spark.api.python.PythonGatewayServer.main(PythonGatewayServer.scala)
		at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
		at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
		at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
		at java.lang.reflect.Method.invoke(Method.java:498)
		at org.apache.spark.deploy.JavaMainApplication.start(SparkApplication.scala:52)
		at org.apache.spark.deploy.SparkSubmit.org$apache$spark$deploy$SparkSubmit$$runMain(SparkSubmit.scala:853)
		at org.apache.spark.deploy.SparkSubmit.doRunMain$1(SparkSubmit.scala:168)
		at org.apache.spark.deploy.SparkSubmit.submit(SparkSubmit.scala:196)
		at org.apache.spark.deploy.SparkSubmit.doSubmit(SparkSubmit.scala:87)
		at org.apache.spark.deploy.SparkSubmit$$anon$2.doSubmit(SparkSubmit.scala:932)
		at org.apache.spark.deploy.SparkSubmit$.main(SparkSubmit.scala:941)
		at org.apache.spark.deploy.SparkSubmit.main(SparkSubmit.scala)
		
		
## Solution
The problem still exist after instapp pyspark by:

	pip install pyspark==2.2.1

After install carbondata is ok:

	clean -DskipTests  -Dfindbugs.skip=true -Pspark-2.3 -Pbuild-with-format  install
	
	
## running

	WARNING:tensorflow:From /Library/Frameworks/Python.framework/Versions/3.6/lib/python3.6/site-packages/tensorflow/python/training/input.py:753: add_queue_runner (from tensorflow.python.training.queue_runner_impl) is deprecated and will be removed in a future version.
	Instructions for updating:
	To construct input pipelines, use the `tf.data` module.
	Training model for 100 training iterations with batch size 100 and evaluation interval 10
	2019-02-13 12:01:12.879699: I tensorflow/core/platform/cpu_feature_guard.cc:141] Your CPU supports instructions that this TensorFlow binary was not compiled to use: AVX2 FMA
	WARNING:tensorflow:From /Users/xubo/Desktop/xubo/git/petastorm/examples/mnist/tf_example_carbon.py:85: start_queue_runners (from tensorflow.python.training.queue_runner_impl) is deprecated and will be removed in a future version.
	Instructions for updating:
	To construct input pipelines, use the `tf.data` module.
	After 0 training iterations, the accuracy of the model is: 0.27
	After 10 training iterations, the accuracy of the model is: 0.48
	After 20 training iterations, the accuracy of the model is: 0.78
	After 30 training iterations, the accuracy of the model is: 0.69
	After 40 training iterations, the accuracy of the model is: 0.73
	After 50 training iterations, the accuracy of the model is: 0.79
	After 60 training iterations, the accuracy of the model is: 0.85
	After 70 training iterations, the accuracy of the model is: 0.73
	After 80 training iterations, the accuracy of the model is: 0.86
	After 90 training iterations, the accuracy of the model is: 0.80
	After 99 training iterations, the accuracy of the model is: 0.79
