## Introduce 
When read data by using CarbonData SDK from S3 , It throw some exception.

##Problem
	
	log4j:WARN Please initialize the log4j system properly.
	log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
	Exception in thread "main" com.amazonaws.AmazonClientException: Unable to execute HTTP request: Timeout waiting for connection from pool
		at com.amazonaws.http.AmazonHttpClient.executeHelper(AmazonHttpClient.java:454)
		at com.amazonaws.http.AmazonHttpClient.execute(AmazonHttpClient.java:232)
		at com.amazonaws.services.s3.AmazonS3Client.invoke(AmazonS3Client.java:3528)
		at com.amazonaws.services.s3.AmazonS3Client.getObjectMetadata(AmazonS3Client.java:976)
		at com.amazonaws.services.s3.AmazonS3Client.getObjectMetadata(AmazonS3Client.java:956)
		at org.apache.hadoop.fs.s3a.S3AFileSystem.getFileStatus(S3AFileSystem.java:892)
		at org.apache.hadoop.fs.s3a.S3AFileSystem.getFileStatus(S3AFileSystem.java:77)
		at org.apache.carbondata.core.datastore.filesystem.AbstractDFSCarbonFile.<init>(AbstractDFSCarbonFile.java:75)
		at org.apache.carbondata.core.datastore.filesystem.AbstractDFSCarbonFile.<init>(AbstractDFSCarbonFile.java:66)
		at org.apache.carbondata.core.datastore.filesystem.HDFSCarbonFile.<init>(HDFSCarbonFile.java:41)
		at org.apache.carbondata.core.datastore.filesystem.S3CarbonFile.<init>(S3CarbonFile.java:41)
		at org.apache.carbondata.core.datastore.impl.DefaultFileTypeProvider.getCarbonFile(DefaultFileTypeProvider.java:53)
		at org.apache.carbondata.core.datastore.impl.FileFactory.getCarbonFile(FileFactory.java:99)
		at org.apache.carbondata.core.util.path.CarbonTablePath.getActualSchemaFilePath(CarbonTablePath.java:183)
		at org.apache.carbondata.core.util.path.CarbonTablePath.getSchemaFilePath(CarbonTablePath.java:178)
		at org.apache.carbondata.core.metadata.schema.SchemaReader.readCarbonTableFromStore(SchemaReader.java:41)
		at org.apache.carbondata.core.metadata.schema.table.CarbonTable.buildFromTablePath(CarbonTable.java:288)
		at org.apache.carbondata.core.datamap.DataMapStoreManager.getCarbonTable(DataMapStoreManager.java:496)
		at org.apache.carbondata.core.datamap.DataMapStoreManager.clearDataMaps(DataMapStoreManager.java:460)
		at org.apache.carbondata.sdk.file.CarbonReaderBuilder.build(CarbonReaderBuilder.java:180)
		at org.apache.carbondata.examples.sdk.SDKS3ReadExample.main(SDKS3ReadExample.java:67)
	Caused by: org.apache.http.conn.ConnectionPoolTimeoutException: Timeout waiting for connection from pool
		at org.apache.http.impl.conn.PoolingClientConnectionManager.leaseConnection(PoolingClientConnectionManager.java:232)
		at org.apache.http.impl.conn.PoolingClientConnectionManager$1.getConnection(PoolingClientConnectionManager.java:199)
		at sun.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)
		at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
		at java.lang.reflect.Method.invoke(Method.java:498)
		at com.amazonaws.http.conn.ClientConnectionRequestFactory$Handler.invoke(ClientConnectionRequestFactory.java:70)
		at com.amazonaws.http.conn.$Proxy7.getConnection(Unknown Source)
		at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:456)
		at org.apache.http.impl.client.AbstractHttpClient.execute(AbstractHttpClient.java:906)
		at org.apache.http.impl.client.AbstractHttpClient.execute(AbstractHttpClient.java:805)
		at com.amazonaws.http.AmazonHttpClient.executeHelper(AmazonHttpClient.java:384)
		... 20 more
	
	Process finished with exit code 1

##Analysis
The default value of fs.s3a.connection.maximum is 15. When read the 16th file, it will throw ConnectionPoolTimeoutException because the connect not enougth.
	
org.apache.hadoop.fs.s3a#initialize
		
	 AWSCredentialsProviderChain credentials = new AWSCredentialsProviderChain(new AWSCredentialsProvider[]{new BasicAWSCredentialsProvider(accessKey, secretKey), new InstanceProfileCredentialsProvider(), new AnonymousAWSCredentialsProvider()});
    this.bucket = name.getHost();
    ClientConfiguration awsConf = new ClientConfiguration();
    awsConf.setMaxConnections(conf.getInt("fs.s3a.connection.maximum", 15));
    boolean secureConnections = conf.getBoolean("fs.s3a.connection.ssl.enabled", true);
    awsConf.setProtocol(secureConnections?Protocol.HTTPS:Protocol.HTTP);
    awsConf.setMaxErrorRetry(conf.getInt("fs.s3a.attempts.maximum", 10));
    awsConf.setConnectionTimeout(conf.getInt("fs.s3a.connection.establish.timeout", '썐'));
    awsConf.setSock
##Solution:
add   configuration.set("fs.s3a.connection.maximum", "1660"); in  configuration

  		Configuration configuration = new Configuration();
        configuration.set(ACCESS_KEY, args[0]);
        configuration.set(SECRET_KEY, args[1]);
        configuration.set(ENDPOINT, args[2]);
        configuration.set("fs.s3a.connection.maximum", "166");
        CarbonReader reader = CarbonReader
            .builder(path, "_temp")
            .withHadoopConf(configuration)
            .build();

