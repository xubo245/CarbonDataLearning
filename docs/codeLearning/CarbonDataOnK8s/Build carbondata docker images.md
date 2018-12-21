


## compile carbondata
	 mvn -DskipTests -Pspark-2.2 -Dspark.version=2.2.0 clean package

## make distributed Spark
	dev/make-distribution.sh --tgz -Phadoop-2.7 -Pkubernetes
## copy carbondata jar to spark dist
	   cp /root/carbondata/assembly/target/scala-2.11/apache-carbondata-1.3.1-bin-spark2.2.1-hadoop2.7.2.jar jars/
	   cp /root/carbondata/assembly/target/scala-2.11/apache-carbondata-1.3.1-bin-spark2.2.1-hadoop2.7.2.jar ../assembly/target/scala-2.11/jars/

## build docker images

	 ./sbin/build-push-docker-images.sh -r  spark-2.2.1-carbon-1.3.1-k8s-0.5.0 -t 0.0.1 build
	

## docker save images

	  docker save -o spark-2.2.1-carbon-1.3.1-k8s-0.5.0_spark-executor_0.0.1.tar.gz spark-2.2.1-carbon-1.3.1-k8s-0.5.0/spark-executor:0.0.1  
	  docker save -o spark-2.2.1-carbon-1.3.1-k8s-0.5.0_spark-init_0.0.1.tar.gz spark-2.2.1-carbon-1.3.1-k8s-0.5.0/spark-init:0.0.1  
	  docker save -o spark-2.2.1-carbon-1.3.1-k8s-0.5.0_spark-driver_0.0.1.tar.gz spark-2.2.1-carbon-1.3.1-k8s-0.5.0/spark-driver:0.0.1  

## upload images to docker repo
	https://console.huaweicloud.com/swr/?locale=zh-cn&region=cn-north-1&agencyId=8c76b46b7b55413abd532ecf9e7a23cd#/app/warehouse/list

## docker pull images to each node

	ssh -i KeyPair-spark.pem root@192.168.0.174
	ssh -i KeyPair-spark.pem root@192.168.0.29

	docker pull 100.125.0.198:20202/spark/spark-init:0.0.1
	docker pull 100.125.0.198:20202/spark/spark-driver:0.0.1
	docker pull 100.125.0.198:20202/spark/spark-executor:0.0.1



##other

	docker pull 100.125.0.198:20202/spark/spark-init:0.0.2
	docker pull 100.125.0.198:20202/spark/spark-driver:0.0.2
	docker pull 100.125.0.198:20202/spark/spark-executor:0.0.2

	docker pull 100.125.0.198:20202/spark/spark-init:0.0.3
	docker pull 100.125.0.198:20202/spark/spark-driver:0.0.3
	docker pull 100.125.0.198:20202/spark/spark-executor:0.0.3

	  docker save -o spark-2.2.1-carbon-1.3.1-k8s-0.5.0_spark-executor_0.0.2.tar.gz spark-2.2.1-carbon-1.3.1-k8s-0.5.0/spark-executor:0.0.2  
	  docker save -o spark-2.2.1-carbon-1.3.1-k8s-0.5.0_spark-init_0.0.2.tar.gz spark-2.2.1-carbon-1.3.1-k8s-0.5.0/spark-init:0.0.2  
	  docker save -o spark-2.2.1-carbon-1.3.1-k8s-0.5.0_spark-driver_0.0.2.tar.gz spark-2.2.1-carbon-1.3.1-k8s-0.5.0/spark-driver:0.0.2  

	  docker save -o spark-2.2.1-carbon-1.3.1-k8s-0.5.0_spark-executor_0.0.3.tar.gz spark-2.2.1-carbon-1.3.1-k8s-0.5.0/spark-executor:0.0.3  
	  docker save -o spark-2.2.1-carbon-1.3.1-k8s-0.5.0_spark-init_0.0.3.tar.gz spark-2.2.1-carbon-1.3.1-k8s-0.5.0/spark-init:0.0.3 
	  docker save -o spark-2.2.1-carbon-1.3.1-k8s-0.5.0_spark-driver_0.0.3.tar.gz spark-2.2.1-carbon-1.3.1-k8s-0.5.0/spark-driver:0.0.3  


	docker pull 100.125.0.198:20202/spark/spark-init:0.0.2
	docker pull 100.125.0.198:20202/spark/spark-driver:0.0.2
	docker pull 100.125.0.198:20202/spark/spark-executor:0.0.2


	  docker save -o spark-2.2.0-k8s-0.5.0_spark-executor_0.0.4.tar.gz spark-2.2.0-k8s-0.5.0/spark-executor:0.0.4  
	  docker save -o spark-2.2.0-k8s-0.5.0_spark-init_0.0.4.tar.gz spark-2.2.0-k8s-0.5.0/spark-init:0.0.4  
	  docker save -o spark-2.2.0-k8s-0.5.0_spark-driver_0.0.4.tar.gz spark-2.2.0-k8s-0.5.0/spark-driver:0.0.4

	  docker save -o spark-2.2.0-k8s-0.5.0_spark-executor_0.0.5.tar.gz spark-2.2.0-k8s-0.5.0/spark-executor:0.0.5  
	  docker save -o spark-2.2.0-k8s-0.5.0_spark-init_0.0.5.tar.gz spark-2.2.0-k8s-0.5.0/spark-init:0.0.5  
	  docker save -o spark-2.2.0-k8s-0.5.0_spark-driver_0.0.5.tar.gz spark-2.2.0-k8s-0.5.0/spark-driver:0.0.5

	docker pull 100.125.0.198:20202/spark/spark-init:0.0.4

	docker pull 100.125.0.198:20202/spark/spark-init:0.0.5
	docker pull 100.125.0.198:20202/spark/spark-driver:0.0.5
	docker pull 100.125.0.198:20202/spark/spark-executor:0.0.5


	docker pull 100.125.0.198:20202/spark/spark-init:0.0.5
	docker pull 100.125.0.198:20202/spark/spark-driver:0.0.5
	docker pull 100.125.0.198:20202/spark/spark-executor:0.0.5

./sbin/build-push-docker-images.sh -r  spark-2.2.0-k8s-0.5.0 -t 0.0.5 build

 	  docker save -o spark-2.2.0-k8s-0.5.0_spark-executor_0.0.6carbon.tar.gz spark-2.2.0-k8s-0.5.0/spark-executor:0.0.6carbon 
	  docker save -o spark-2.2.0-k8s-0.5.0_spark-init_0.0.6carbon.tar.gz spark-2.2.0-k8s-0.5.0/spark-init:0.0.6carbon
	  docker save -o spark-2.2.0-k8s-0.5.0_spark-driver_0.0.6carbon.tar.gz spark-2.2.0-k8s-0.5.0/spark-driver:0.0.6carbon


 	  docker save -o spark-2.2.0-k8s-0.5.0_spark-executor_0.0.8carbon.tar.gz spark-2.2.0-k8s-0.5.0/spark-executor:0.0.8carbon 
	  docker save -o spark-2.2.0-k8s-0.5.0_spark-init_0.0.8carbon.tar.gz spark-2.2.0-k8s-0.5.0/spark-init:0.0.8carbon
	  docker save -o spark-2.2.0-k8s-0.5.0_spark-driver_0.0.8carbon.tar.gz spark-2.2.0-k8s-0.5.0/spark-driver:0.0.8carbon


	docker pull 100.125.0.198:20202/spark/spark-init:0.0.6carbon
	docker pull 100.125.0.198:20202/spark/spark-driver:0.0.6carbon
	docker pull 100.125.0.198:20202/spark/spark-executor:0.0.6carbon

	docker pull 100.125.0.198:20202/spark/spark-init:0.0.8carbon
	docker pull 100.125.0.198:20202/spark/spark-driver:0.0.8carbon
	docker pull 100.125.0.198:20202/spark/spark-executor:0.0.8carbon



docker login -u cn-north-1@KXroaFGUcN9ubn5d4yWg -p 7727e7a8441cdae66ed061ebdec6a9f6dca3244a556f93fa401cd768e407feaf 100.125.0.198:20202
docker pull registry.cn-north-1.huaweicloud.com/spark/spark-executor:0.0.6carbon

./sbin/build-push-docker-images.sh -r  spark-2.2.0-k8s-0.5.0 -t 0.0.9carbon build


 mvn -DskipTests clean  -Phive -Phive-thriftserver -Pkubernetes package

dev/make-distribution.sh --tgz -Phadoop-2.7 -Pkubernetes  -Phive -Phive-thriftserver


 	  docker save -o spark-2.2.0-k8s-0.5.0_spark-executor_0.1.3carbon.tar.gz spark-2.2.0-k8s-0.5.0/spark-executor:0.1.3carbon 
	  docker save -o spark-2.2.0-k8s-0.5.0_spark-init_0.1.3carbon.tar.gz spark-2.2.0-k8s-0.5.0/spark-init:0.1.3carbon
	  docker save -o spark-2.2.0-k8s-0.5.0_spark-driver_0.1.3carbon.tar.gz spark-2.2.0-k8s-0.5.0/spark-driver:0.1.3carbon

	docker pull 100.125.0.198:20202/spark/spark-init:0.1.3carbon
	docker pull 100.125.0.198:20202/spark/spark-driver:0.1.3carbon
	docker pull 100.125.0.198:20202/spark/spark-executor:0.1.3carbon


 	  docker save -o spark-2.2.0-k8s-0.5.0_spark-executor_0.1.6carbon.tar.gz spark-2.2.0-k8s-0.5.0/spark-executor:0.1.6carbon 
	  docker save -o spark-2.2.0-k8s-0.5.0_spark-init_0.1.6carbon.tar.gz spark-2.2.0-k8s-0.5.0/spark-init:0.1.6carbon
	  docker save -o spark-2.2.0-k8s-0.5.0_spark-driver_0.1.6carbon.tar.gz spark-2.2.0-k8s-0.5.0/spark-driver:0.1.6carbon

	docker pull 100.125.0.198:20202/spark/spark-init:0.1.6carbon
	docker pull 100.125.0.198:20202/spark/spark-driver:0.1.6carbon
	docker pull 100.125.0.198:20202/spark/spark-executor:0.1.6carbon

./sbin/build-push-docker-images.sh -r  spark-2.2.0-k8s-0.5.0 -t 0.1.7carbon build


	docker pull 100.125.0.198:20202/spark/spark-init:0.1.9carbon
	docker pull 100.125.0.198:20202/spark/spark-driver:0.1.9carbon
	docker pull 100.125.0.198:20202/spark/spark-executor:0.1.9carbon

	docker pull 100.125.0.198:20202/spark/spark-init:0.2.9carbon
	docker pull 100.125.0.198:20202/spark/spark-driver:0.2.9carbon
	docker pull 100.125.0.198:20202/spark/spark-executor:0.2.9carbon


	docker pull 100.125.0.198:20202/spark/spark-init:0.0.1NOcarbon
	docker pull 100.125.0.198:20202/spark/spark-driver:0.0.1NOcarbon
	docker pull 100.125.0.198:20202/spark/spark-executor:0.0.1NOcarbon


	docker pull 100.125.0.198:20202/spark/spark-init:0.3.0carbon
	docker pull 100.125.0.198:20202/spark/spark-driver:0.3.0carbon
	docker pull 100.125.0.198:20202/spark/spark-executor:0.3.0carbon
