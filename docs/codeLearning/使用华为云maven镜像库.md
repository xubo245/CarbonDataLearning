#使用华为云maven镜像库
##准备
安装JDK，maven等
我的事jdk1.8， maven 3.3.9

##配置
在setting文件中加入

	   <server>
	      <id>huaweicloud</id>
	      <username>anonymous</username>
	      <password>devcloud</password>
	    </server>
以及

	 <mirror>
	        <id>huaweicloud</id>
	        <url>https://repo.huaweicloud.com/repository/maven/</url>
	        <mirrorOf>*</mirrorOf>
	</mirror>
##测试

	
	[INFO] --- provisio-maven-plugin:0.1.40:provision (default-provision) @ carbondata-presto ---
	Downloading: https://repo.huaweicloud.com/repository/maven/io/provis/provisio-model/0.1.40/provisio-model-0.1.40.pom
	Downloaded: https://repo.huaweicloud.com/repository/maven/io/provis/provisio-model/0.1.40/provisio-model-0.1.40.pom (0 B at 0.0 KB/sec)
	Downloading: https://repo.huaweicloud.com/repository/maven/org/eclipse/aether/aether-api/1.0.2.v20150114/aether-api-1.0.2.v20150114.pom
	Downloaded: https://repo.huaweicloud.com/repository/maven/org/eclipse/aether/aether-api/1.0.2.v20150114/aether-api-1.0.2.v20150114.pom (0 B at 0.0 KB/sec)
	Downloading: https://repo.huaweicloud.com/repository/maven/org/eclipse/aether/aether/1.0.2.v20150114/aether-1.0.2.v20150114.pom 
	
	
##Refer:   
[1] https://forum.huaweicloud.com/thread-1779-1-1.html