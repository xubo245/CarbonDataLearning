## command:
 maven clean -DskipTests package	
## log:
	
	/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/bin/java -Dmaven.multiModuleProjectDirectory=/Users/xubo/Desktop/xubo/git/hive -Dmaven.home=/Users/xubo/all/soft/apache-maven-3.3.9 -Dclassworlds.conf=/Users/xubo/all/soft/apache-maven-3.3.9/bin/m2.conf "-javaagent:/Volumes/IntelliJ IDEA CE/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=61111:/Volumes/IntelliJ IDEA CE/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Users/xubo/all/soft/apache-maven-3.3.9/boot/plexus-classworlds-2.5.2.jar org.codehaus.classworlds.Launcher -Didea.version=2018.1.2 clean -DskipTests package
	[INFO] Scanning for projects...
	[INFO] ------------------------------------------------------------------------
	[INFO] Reactor Build Order:
	[INFO] 
	[INFO] Hive Storage API
	[INFO] Hive
	[INFO] Hive Classifications
	[INFO] Hive Shims Common
	[INFO] Hive Shims 0.23
	[INFO] Hive Shims Scheduler
	[INFO] Hive Shims
	[INFO] Hive Standalone Metastore
	[INFO] Hive Standalone Metastore Common Code
	[INFO] Hive Common
	[INFO] Hive Service RPC
	[INFO] Hive Serde
	[INFO] Hive Metastore
	[INFO] Hive Vector-Code-Gen Utilities
	[INFO] Hive Llap Common
	[INFO] Hive Llap Client
	[INFO] Hive Llap Tez
	[INFO] Hive Spark Remote Client
	[INFO] Hive Metastore Server
	[INFO] Hive Query Language
	[INFO] Hive Llap Server
	[INFO] Hive Service
	[INFO] Hive Accumulo Handler
	[INFO] Hive JDBC
	[INFO] Hive Beeline
	[INFO] Hive CLI
	[INFO] Hive Contrib
	[INFO] Hive Druid Handler
	[INFO] Hive HBase Handler
	[INFO] Hive JDBC Handler
	[INFO] Hive HCatalog
	[INFO] Hive HCatalog Core
	[INFO] Hive HCatalog Pig Adapter
	[INFO] Hive HCatalog Server Extensions
	[INFO] Hive HCatalog Webhcat Java Client
	[INFO] Hive HCatalog Webhcat
	[INFO] Hive HCatalog Streaming
	[INFO] Hive HPL/SQL
	[INFO] Hive Streaming
	[INFO] Hive Llap External Client
	[INFO] Hive Shims Aggregator
	[INFO] Hive Kryo Registrator
	[INFO] Hive TestUtils
	[INFO] Hive Kafka Storage Handler
	[INFO] Hive Packaging
	[INFO] Hive Metastore Tools
	[INFO] Hive Metastore Tools common libraries
	[INFO] Hive metastore benchmarks
	[INFO] Hive Upgrade Acid
	[INFO] Hive Pre Upgrade Acid
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Storage API 2.7.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:3.0.0:clean (default-clean) @ hive-storage-api ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/storage-api/target
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-storage-api ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-storage-api ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/storage-api/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ hive-storage-api ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 63 source files to /Users/xubo/Desktop/xubo/git/hive/storage-api/target/classes
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-storage-api ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 1 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ hive-storage-api ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 24 source files to /Users/xubo/Desktop/xubo/git/hive/storage-api/target/test-classes
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/storage-api/src/test/org/apache/hadoop/hive/common/TestValidReadTxnList.java: Some input files use or override a deprecated API.
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/storage-api/src/test/org/apache/hadoop/hive/common/TestValidReadTxnList.java: Recompile with -Xlint:deprecation for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.19.1:test (default-test) @ hive-storage-api ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:3.0.0:jar (default-jar) @ hive-storage-api ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/storage-api/target/hive-storage-api-2.7.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-storage-api ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/target
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive ---
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Classifications 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-classification ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/classification/target
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/classification (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-classification ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-classification ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-classification ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-classification ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-classification ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/classification/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-classification ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-classification ---
	[INFO] Compiling 2 source files to /Users/xubo/Desktop/xubo/git/hive/classification/target/classes
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-classification ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/classification/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-classification ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/classification/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/classification/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/classification/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/classification/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-classification ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-classification ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-classification ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/classification/target/hive-classification-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-classification ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:test-jar (default) @ hive-classification ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/classification/target/hive-classification-4.0.0-SNAPSHOT-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Shims Common 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-shims-common ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/shims/common/target
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/shims/common (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-shims-common ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-shims-common ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-shims-common ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-shims-common ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-shims-common ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/shims/common/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-shims-common ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-shims-common ---
	[INFO] Compiling 20 source files to /Users/xubo/Desktop/xubo/git/hive/shims/common/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/shims/common/src/main/java/org/apache/hadoop/fs/ProxyFileSystem.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/shims/common/src/main/java/org/apache/hadoop/fs/ProxyFileSystem.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/shims/common/src/main/java/org/apache/hadoop/hive/shims/HadoopShimsSecure.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/shims/common/src/main/java/org/apache/hadoop/hive/shims/HadoopShimsSecure.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-shims-common ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/shims/common/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-shims-common ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/shims/common/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/shims/common/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/shims/common/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/shims/common/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-shims-common ---
	[INFO] Compiling 2 source files to /Users/xubo/Desktop/xubo/git/hive/shims/common/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/shims/common/src/main/test/org/apache/hadoop/hive/io/TestHdfsUtils.java: /Users/xubo/Desktop/xubo/git/hive/shims/common/src/main/test/org/apache/hadoop/hive/io/TestHdfsUtils.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/shims/common/src/main/test/org/apache/hadoop/hive/io/TestHdfsUtils.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-shims-common ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-shims-common ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/shims/common/target/hive-shims-common-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-shims-common ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Shims 0.23 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-shims-0.23 ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/shims/0.23/target
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/shims/0.23 (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-shims-0.23 ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-shims-0.23 ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-shims-0.23 ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-shims-0.23 ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-shims-0.23 ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/shims/0.23/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-shims-0.23 ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-shims-0.23 ---
	[INFO] Compiling 3 source files to /Users/xubo/Desktop/xubo/git/hive/shims/0.23/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/shims/0.23/src/main/java/org/apache/hadoop/hive/shims/Hadoop23Shims.java: /Users/xubo/Desktop/xubo/git/hive/shims/0.23/src/main/java/org/apache/hadoop/hive/shims/Hadoop23Shims.java uses or overrides a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/shims/0.23/src/main/java/org/apache/hadoop/hive/shims/Hadoop23Shims.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/shims/0.23/src/main/java/org/apache/hadoop/hive/shims/Hadoop23Shims.java: /Users/xubo/Desktop/xubo/git/hive/shims/0.23/src/main/java/org/apache/hadoop/hive/shims/Hadoop23Shims.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/shims/0.23/src/main/java/org/apache/hadoop/hive/shims/Hadoop23Shims.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-shims-0.23 ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/shims/0.23/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-shims-0.23 ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/shims/0.23/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/shims/0.23/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/shims/0.23/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/shims/0.23/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-shims-0.23 ---
	[INFO] Compiling 1 source file to /Users/xubo/Desktop/xubo/git/hive/shims/0.23/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-shims-0.23 ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-shims-0.23 ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/shims/0.23/target/hive-shims-0.23-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-shims-0.23 ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Shims Scheduler 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-shims-scheduler ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/shims/scheduler/target
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/shims/scheduler (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-shims-scheduler ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-shims-scheduler ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-shims-scheduler ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-shims-scheduler ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-shims-scheduler ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/shims/scheduler/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-shims-scheduler ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-shims-scheduler ---
	[INFO] Compiling 1 source file to /Users/xubo/Desktop/xubo/git/hive/shims/scheduler/target/classes
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-shims-scheduler ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/shims/scheduler/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-shims-scheduler ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/shims/scheduler/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/shims/scheduler/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/shims/scheduler/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/shims/scheduler/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-shims-scheduler ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-shims-scheduler ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-shims-scheduler ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/shims/scheduler/target/hive-shims-scheduler-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-shims-scheduler ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Shims 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-shims ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/shims/aggregator/target
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/shims/aggregator (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-shims ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-shims ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-shims ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-shims ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-shims ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/shims/aggregator/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-shims ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-shims ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-shims ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/shims/aggregator/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-shims ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/shims/aggregator/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/shims/aggregator/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/shims/aggregator/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/shims/aggregator/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-shims ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-shims ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-shims ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/shims/aggregator/target/hive-shims-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-shims ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Standalone Metastore 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:3.0.0:clean (default-clean) @ hive-standalone-metastore ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/target
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-standalone-metastore ---
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-standalone-metastore ---
	[INFO] 
	[INFO] --- maven-assembly-plugin:3.1.0:single (assemble) @ hive-standalone-metastore ---
	[INFO] Reading assembly descriptor: src/assembly/src.xml
	[INFO] Building tar: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/target/apache-hive-standalone-metastore-4.0.0-SNAPSHOT-src.tar.gz
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Standalone Metastore Common Code 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:3.0.0:clean (default-clean) @ hive-standalone-metastore-common ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/target
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.4.1:enforce (enforce-banned-dependencies) @ hive-standalone-metastore-common ---
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (generate-version-annotation) @ hive-standalone-metastore-common ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- protoc-jar-maven-plugin:3.5.1.1:run (default) @ hive-standalone-metastore-common ---
	[INFO] Resolving artifact: com.google.protobuf:protoc:2.5.0, platform: osx-x86_64
	protoc-jar: executing: [/var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/protoc2598249185436005262.exe, --version]
	libprotoc 2.5.0
	[INFO] Protoc command: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/protoc2598249185436005262.exe
	[INFO] Input directories:
	[INFO]     /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/src/main/protobuf/org/apache/hadoop/hive/metastore
	[INFO] Output targets:
	[INFO]     java: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/target/generated-sources (add: none, clean: false, plugin: null, outputOptions: null)
	[INFO] /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/target/generated-sources does not exist. Creating...
	[INFO]     Processing (java): metastore.proto
	protoc-jar: executing: [/var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/protoc2598249185436005262.exe, -I/Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/src/main/protobuf/org/apache/hadoop/hive/metastore, --java_out=/Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/target/generated-sources, /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/src/main/protobuf/org/apache/hadoop/hive/metastore/metastore.proto]
	[INFO] 
	[INFO] --- build-helper-maven-plugin:3.0.0:add-source (add-source) @ hive-standalone-metastore-common ---
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/src/gen/thrift/gen-javabean added.
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/target/generated-sources added.
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/src/gen/version added.
	[INFO] 
	[INFO] --- antlr3-maven-plugin:3.5.2:antlr (default) @ hive-standalone-metastore-common ---
	[INFO] ANTLR: Processing source directory /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/src/main/java
	[INFO] No grammars to process
	ANTLR Parser Generator  Version 3.5.2
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-standalone-metastore-common ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-standalone-metastore-common ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 0 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.5.1:compile (default-compile) @ hive-standalone-metastore-common ---
	[INFO] Compiling 336 source files to /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/src/main/java/org/apache/hadoop/hive/common/ZooKeeperHiveHelper.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/src/main/java/org/apache/hadoop/hive/common/ZooKeeperHiveHelper.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/src/main/java/org/apache/hadoop/hive/metastore/utils/ObjectPair.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/src/main/java/org/apache/hadoop/hive/metastore/utils/ObjectPair.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-standalone-metastore-common ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 1 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-standalone-metastore-common ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/target/warehouse
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-metastore-scripts) @ hive-standalone-metastore-common ---
	[INFO] No ant target defined - SKIPPED
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.5.1:testCompile (default-testCompile) @ hive-standalone-metastore-common ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.20.1:test (default-test) @ hive-standalone-metastore-common ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:3.0.0:jar (default-jar) @ hive-standalone-metastore-common ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/target/hive-standalone-metastore-common-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-standalone-metastore-common ---
	[INFO] 
	[INFO] --- maven-jar-plugin:3.0.0:test-jar (default) @ hive-standalone-metastore-common ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/target/hive-standalone-metastore-common-4.0.0-SNAPSHOT-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Common 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-common ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/common/target
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/common (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-common ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-common ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-common ---
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (generate-version-annotation) @ hive-common ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- build-helper-maven-plugin:1.8:add-source (add-source) @ hive-common ---
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/common/src/gen added.
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-common ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-common ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 2 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-common ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-common ---
	[INFO] Compiling 121 source files to /Users/xubo/Desktop/xubo/git/hive/common/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/common/src/java/org/apache/hadoop/hive/common/metrics/metrics2/CodahaleMetrics.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/common/src/java/org/apache/hadoop/hive/common/metrics/metrics2/CodahaleMetrics.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/common/src/java/org/apache/hadoop/hive/common/metrics/metrics2/CodahaleMetrics.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/common/src/java/org/apache/hadoop/hive/common/metrics/metrics2/CodahaleMetrics.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-common ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 2 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-common ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/common/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/common/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/common/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/common/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-common ---
	[INFO] Compiling 42 source files to /Users/xubo/Desktop/xubo/git/hive/common/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/common/src/test/org/apache/hadoop/hive/conf/TestVariableSubstitution.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/common/src/test/org/apache/hadoop/hive/conf/TestVariableSubstitution.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/common/src/test/org/apache/hadoop/hive/common/jsonexplain/TestOp.java: /Users/xubo/Desktop/xubo/git/hive/common/src/test/org/apache/hadoop/hive/common/jsonexplain/TestOp.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/common/src/test/org/apache/hadoop/hive/common/jsonexplain/TestOp.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-common ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-common ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/common/target/hive-common-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-common ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:test-jar (default) @ hive-common ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/common/target/hive-common-4.0.0-SNAPSHOT-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Service RPC 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-service-rpc ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/service-rpc/target
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/service-rpc (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-service-rpc ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-service-rpc ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-service-rpc ---
	[INFO] 
	[INFO] --- build-helper-maven-plugin:1.8:add-source (add-source) @ hive-service-rpc ---
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/service-rpc/src/gen/thrift/gen-javabean added.
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-service-rpc ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-service-rpc ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/service-rpc/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-service-rpc ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-service-rpc ---
	[INFO] Compiling 93 source files to /Users/xubo/Desktop/xubo/git/hive/service-rpc/target/classes
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-service-rpc ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/service-rpc/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-service-rpc ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/service-rpc/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/service-rpc/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/service-rpc/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/service-rpc/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-service-rpc ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-service-rpc ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-service-rpc ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/service-rpc/target/hive-service-rpc-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-service-rpc ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:test-jar (default) @ hive-service-rpc ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/service-rpc/target/hive-service-rpc-4.0.0-SNAPSHOT-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Serde 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-serde ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/serde/target
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/serde (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-serde ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-serde ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-serde ---
	[INFO] 
	[INFO] --- build-helper-maven-plugin:1.8:add-source (add-source) @ hive-serde ---
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/serde/src/gen/protobuf/gen-java added.
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/serde/src/gen/thrift/gen-javabean added.
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-serde ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-serde ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/serde/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-serde ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-serde ---
	[INFO] Compiling 435 source files to /Users/xubo/Desktop/xubo/git/hive/serde/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/serde/src/java/org/apache/hadoop/hive/serde2/binarysortable/BinarySortableSerDe.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/serde/src/java/org/apache/hadoop/hive/serde2/binarysortable/BinarySortableSerDe.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/serde/src/java/org/apache/hadoop/hive/serde2/dynamic_type/DynamicSerDeTypeSet.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/serde/src/java/org/apache/hadoop/hive/serde2/dynamic_type/DynamicSerDeTypeSet.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-serde ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 2 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-serde ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/serde/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/serde/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/serde/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/serde/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-serde ---
	[INFO] Compiling 64 source files to /Users/xubo/Desktop/xubo/git/hive/serde/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/serde/src/test/org/apache/hadoop/hive/serde2/columnar/TestLazyBinaryColumnarSerDe.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/serde/src/test/org/apache/hadoop/hive/serde2/columnar/TestLazyBinaryColumnarSerDe.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/serde/src/test/org/apache/hadoop/hive/serde2/TestOpenCSVSerde.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/serde/src/test/org/apache/hadoop/hive/serde2/TestOpenCSVSerde.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-serde ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-serde ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/serde/target/hive-serde-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-serde ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Metastore 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-metastore ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/metastore/target
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/metastore (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-metastore ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-metastore ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-metastore ---
	[INFO] 
	[INFO] --- build-helper-maven-plugin:1.8:add-source (add-source) @ hive-metastore ---
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/metastore/src/model added.
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-metastore ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-metastore ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/metastore/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-metastore ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-metastore ---
	[INFO] Compiling 6 source files to /Users/xubo/Desktop/xubo/git/hive/metastore/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/metastore/src/java/org/apache/hadoop/hive/metastore/HiveClientCache.java: /Users/xubo/Desktop/xubo/git/hive/metastore/src/java/org/apache/hadoop/hive/metastore/HiveClientCache.java uses or overrides a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/metastore/src/java/org/apache/hadoop/hive/metastore/HiveClientCache.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/metastore/src/java/org/apache/hadoop/hive/metastore/HiveClientCache.java: /Users/xubo/Desktop/xubo/git/hive/metastore/src/java/org/apache/hadoop/hive/metastore/HiveClientCache.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/metastore/src/java/org/apache/hadoop/hive/metastore/HiveClientCache.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-metastore ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/metastore/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-metastore ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/metastore/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/metastore/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/metastore/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/metastore/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-metastore ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-metastore ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-metastore ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/metastore/target/hive-metastore-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-metastore ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Vector-Code-Gen Utilities 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-vector-code-gen ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/vector-code-gen/target
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/vector-code-gen (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-vector-code-gen ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-vector-code-gen ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-vector-code-gen ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-vector-code-gen ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-vector-code-gen ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/vector-code-gen/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-vector-code-gen ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-vector-code-gen ---
	[INFO] Compiling 2 source files to /Users/xubo/Desktop/xubo/git/hive/vector-code-gen/target/classes
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-vector-code-gen ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/vector-code-gen/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-vector-code-gen ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/vector-code-gen/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/vector-code-gen/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/vector-code-gen/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/vector-code-gen/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-vector-code-gen ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-vector-code-gen ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-vector-code-gen ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/vector-code-gen/target/hive-vector-code-gen-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-vector-code-gen ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Llap Common 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-llap-common ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/llap-common/target
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/llap-common (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-llap-common ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-llap-common ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-llap-common ---
	[INFO] 
	[INFO] --- build-helper-maven-plugin:1.8:add-source (add-source) @ hive-llap-common ---
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/llap-common/src/gen/protobuf/gen-java added.
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/llap-common/src/gen/thrift/gen-javabean added.
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-llap-common ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-llap-common ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 1 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-llap-common ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-llap-common ---
	[INFO] Compiling 34 source files to /Users/xubo/Desktop/xubo/git/hive/llap-common/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-common/src/java/org/apache/hadoop/hive/llap/LlapUtil.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-common/src/java/org/apache/hadoop/hive/llap/LlapUtil.java: Recompile with -Xlint:deprecation for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-llap-common ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/llap-common/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-llap-common ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/llap-common/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/llap-common/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/llap-common/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/llap-common/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-llap-common ---
	[INFO] Compiling 4 source files to /Users/xubo/Desktop/xubo/git/hive/llap-common/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-llap-common ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-llap-common ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/llap-common/target/hive-llap-common-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-llap-common ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:test-jar (default) @ hive-llap-common ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/llap-common/target/hive-llap-common-4.0.0-SNAPSHOT-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Llap Client 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-llap-client ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/llap-client/target
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/llap-client (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-llap-client ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-llap-client ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-llap-client ---
	[INFO] 
	[INFO] --- build-helper-maven-plugin:1.8:add-source (add-source) @ hive-llap-client ---
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/llap-client/src/gen/protobuf/gen-java added.
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/llap-client/src/gen/thrift/gen-javabean added.
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-llap-client ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-llap-client ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/llap-client/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-llap-client ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-llap-client ---
	[INFO] Compiling 29 source files to /Users/xubo/Desktop/xubo/git/hive/llap-client/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-client/src/java/org/apache/hadoop/hive/registry/impl/ZkRegistryBase.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-client/src/java/org/apache/hadoop/hive/registry/impl/ZkRegistryBase.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-client/src/java/org/apache/hadoop/hive/llap/registry/impl/LlapRegistryService.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-client/src/java/org/apache/hadoop/hive/llap/registry/impl/LlapRegistryService.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-llap-client ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/llap-client/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-llap-client ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/llap-client/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/llap-client/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/llap-client/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/llap-client/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-llap-client ---
	[INFO] Compiling 2 source files to /Users/xubo/Desktop/xubo/git/hive/llap-client/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-client/src/test/org/apache/hadoop/hive/llap/TestAsyncPbRpcProxy.java: /Users/xubo/Desktop/xubo/git/hive/llap-client/src/test/org/apache/hadoop/hive/llap/TestAsyncPbRpcProxy.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-client/src/test/org/apache/hadoop/hive/llap/TestAsyncPbRpcProxy.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-llap-client ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-llap-client ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/llap-client/target/hive-llap-client-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-llap-client ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Llap Tez 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-llap-tez ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/llap-tez/target
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/llap-tez (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-llap-tez ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-llap-tez ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-llap-tez ---
	[INFO] 
	[INFO] --- build-helper-maven-plugin:1.8:add-source (add-source) @ hive-llap-tez ---
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/llap-tez/src/gen/protobuf/gen-java added.
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/llap-tez/src/gen/thrift/gen-javabean added.
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-llap-tez ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-llap-tez ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 1 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-llap-tez ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-llap-tez ---
	[INFO] Compiling 14 source files to /Users/xubo/Desktop/xubo/git/hive/llap-tez/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-tez/src/java/org/apache/hadoop/hive/llap/tezplugins/LlapTaskSchedulerService.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-tez/src/java/org/apache/hadoop/hive/llap/tezplugins/LlapTaskSchedulerService.java: Recompile with -Xlint:deprecation for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-llap-tez ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/llap-tez/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-llap-tez ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/llap-tez/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/llap-tez/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/llap-tez/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/llap-tez/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-llap-tez ---
	[INFO] Compiling 2 source files to /Users/xubo/Desktop/xubo/git/hive/llap-tez/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-tez/src/test/org/apache/hadoop/hive/llap/tezplugins/TestLlapTaskCommunicator.java: /Users/xubo/Desktop/xubo/git/hive/llap-tez/src/test/org/apache/hadoop/hive/llap/tezplugins/TestLlapTaskCommunicator.java uses or overrides a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-tez/src/test/org/apache/hadoop/hive/llap/tezplugins/TestLlapTaskCommunicator.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-tez/src/test/org/apache/hadoop/hive/llap/tezplugins/TestLlapTaskCommunicator.java: /Users/xubo/Desktop/xubo/git/hive/llap-tez/src/test/org/apache/hadoop/hive/llap/tezplugins/TestLlapTaskCommunicator.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-tez/src/test/org/apache/hadoop/hive/llap/tezplugins/TestLlapTaskCommunicator.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-llap-tez ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-llap-tez ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/llap-tez/target/hive-llap-tez-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-llap-tez ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Spark Remote Client 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-spark-client ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/spark-client/target
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/spark-client (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-spark-client ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-spark-client ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-spark-client ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-spark-client ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-spark-client ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/spark-client/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-spark-client ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-spark-client ---
	[INFO] Compiling 32 source files to /Users/xubo/Desktop/xubo/git/hive/spark-client/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/spark-client/src/main/java/org/apache/hive/spark/counter/SparkCounter.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/spark-client/src/main/java/org/apache/hive/spark/counter/SparkCounter.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/spark-client/src/main/java/org/apache/hive/spark/client/rpc/RpcDispatcher.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/spark-client/src/main/java/org/apache/hive/spark/client/rpc/RpcDispatcher.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-spark-client ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 1 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-spark-client ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/spark-client/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/spark-client/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/spark-client/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/spark-client/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-spark-client ---
	[INFO] Compiling 7 source files to /Users/xubo/Desktop/xubo/git/hive/spark-client/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/spark-client/src/test/java/org/apache/hive/spark/client/TestJobHandle.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/spark-client/src/test/java/org/apache/hive/spark/client/TestJobHandle.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-dependency-plugin:2.8:copy (copy-guava-14) @ hive-spark-client ---
	[INFO] Configured Artifact: com.google.guava:guava:14.0.1:jar
	[INFO] Copying guava-14.0.1.jar to /Users/xubo/Desktop/xubo/git/hive/spark-client/target/dependency/guava-14.0.1.jar
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-spark-client ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-spark-client ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/spark-client/target/hive-spark-client-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-spark-client ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Metastore Server 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: https://repo.maven.apache.org/maven2/org/datanucleus/datanucleus-maven-plugin/4.0.5/datanucleus-maven-plugin-4.0.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/datanucleus/datanucleus-maven-plugin/4.0.5/datanucleus-maven-plugin-4.0.5.pom (4 KB at 2.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/datanucleus/datanucleus-maven-plugin/4.0.5/datanucleus-maven-plugin-4.0.5.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/datanucleus/datanucleus-maven-plugin/4.0.5/datanucleus-maven-plugin-4.0.5.jar (26 KB at 7.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/sqlline/sqlline/1.3.0/sqlline-1.3.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/sqlline/sqlline/1.3.0/sqlline-1.3.0.pom (9 KB at 12.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/jline/jline/2.14.3/jline-2.14.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/jline/jline/2.14.3/jline-2.14.3.pom (20 KB at 21.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/microsoft/sqlserver/mssql-jdbc/6.2.1.jre8/mssql-jdbc-6.2.1.jre8.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/microsoft/sqlserver/mssql-jdbc/6.2.1.jre8/mssql-jdbc-6.2.1.jre8.pom (9 KB at 14.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/mariadb/jdbc/mariadb-java-client/2.2.0/mariadb-java-client-2.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/mariadb/jdbc/mariadb-java-client/2.2.0/mariadb-java-client-2.2.0.pom (17 KB at 24.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/sqlline/sqlline/1.3.0/sqlline-1.3.0.jar
	Downloading: https://repo.maven.apache.org/maven2/jline/jline/2.14.3/jline-2.14.3.jar
	Downloading: https://repo.maven.apache.org/maven2/com/microsoft/sqlserver/mssql-jdbc/6.2.1.jre8/mssql-jdbc-6.2.1.jre8.jar
	Downloading: https://repo.maven.apache.org/maven2/org/mariadb/jdbc/mariadb-java-client/2.2.0/mariadb-java-client-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/sqlline/sqlline/1.3.0/sqlline-1.3.0.jar (122 KB at 14.5 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/jline/jline/2.14.3/jline-2.14.3.jar (263 KB at 17.2 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/mariadb/jdbc/mariadb-java-client/2.2.0/mariadb-java-client-2.2.0.jar (514 KB at 16.3 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/com/microsoft/sqlserver/mssql-jdbc/6.2.1.jre8/mssql-jdbc-6.2.1.jre8.jar (774 KB at 23.1 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:3.0.0:clean (default-clean) @ hive-standalone-metastore-server ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.4.1:enforce (enforce-banned-dependencies) @ hive-standalone-metastore-server ---
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (generate-version-annotation) @ hive-standalone-metastore-server ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- protoc-jar-maven-plugin:3.5.1.1:run (default) @ hive-standalone-metastore-server ---
	[INFO] Resolving artifact: com.google.protobuf:protoc:2.5.0, platform: osx-x86_64
	protoc-jar: executing: [/var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/protoc2396931490407724857.exe, --version]
	libprotoc 2.5.0
	[INFO] Protoc command: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/protoc2396931490407724857.exe
	[INFO] Input directories:
	[INFO]     /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/src/main/protobuf/org/apache/hadoop/hive/metastore
	[INFO] Output targets:
	[INFO]     java: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/target/generated-sources (add: none, clean: false, plugin: null, outputOptions: null)
	[INFO] /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/target/generated-sources does not exist. Creating...
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/src/main/protobuf/org/apache/hadoop/hive/metastore does not exist
	[INFO] 
	[INFO] --- build-helper-maven-plugin:3.0.0:add-source (add-source) @ hive-standalone-metastore-server ---
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/src/gen/thrift/gen-javabean added.
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/target/generated-sources added.
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/src/gen/version added.
	[INFO] 
	[INFO] --- antlr3-maven-plugin:3.5.2:antlr (default) @ hive-standalone-metastore-server ---
	[INFO] ANTLR: Processing source directory /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/src/main/java
	ANTLR Parser Generator  Version 3.5.2
	Output file /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/target/generated-sources/org/apache/hadoop/hive/metastore/parser/FilterParser.java does not exist: must build /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/src/main/java/org/apache/hadoop/hive/metastore/parser/Filter.g
	org/apache/hadoop/hive/metastore/parser/Filter.g
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-standalone-metastore-server ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-standalone-metastore-server ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 1 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.5.1:compile (default-compile) @ hive-standalone-metastore-server ---
	[INFO] Compiling 346 source files to /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/src/main/java/org/apache/hadoop/hive/metastore/utils/MetaStoreServerUtils.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/src/main/java/org/apache/hadoop/hive/metastore/utils/MetaStoreServerUtils.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/src/main/java/org/apache/hadoop/hive/metastore/utils/MetaStoreServerUtils.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/src/main/java/org/apache/hadoop/hive/metastore/utils/MetaStoreServerUtils.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- datanucleus-maven-plugin:4.0.5:enhance (default) @ hive-standalone-metastore-server ---
	log4j:WARN No appenders could be found for logger (DataNucleus.Persistence).
	log4j:WARN Please initialize the log4j system properly.
	DataNucleus Enhancer (version 4.1.17) for API "JDO"
	DataNucleus Enhancer completed with success for 41 classes.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-standalone-metastore-server ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 1 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-standalone-metastore-server ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/target/warehouse
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-metastore-scripts) @ hive-standalone-metastore-server ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/target/tmp/scripts/metastore/upgrade
	     [copy] Copying 74 files to /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/target/tmp/scripts/metastore/upgrade
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.5.1:testCompile (default-testCompile) @ hive-standalone-metastore-server ---
	[INFO] Compiling 127 source files to /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/src/test/java/org/apache/hadoop/hive/metastore/txn/TestTxnHandlerNegative.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/src/test/java/org/apache/hadoop/hive/metastore/txn/TestTxnHandlerNegative.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/src/test/java/org/apache/hadoop/hive/metastore/TestHiveMetaStore.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/src/test/java/org/apache/hadoop/hive/metastore/TestHiveMetaStore.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.20.1:test (default-test) @ hive-standalone-metastore-server ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- exec-maven-plugin:1.6.0:java (default) @ hive-standalone-metastore-server ---
	[INFO] 
	[INFO] --- maven-jar-plugin:3.0.0:jar (default-jar) @ hive-standalone-metastore-server ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/target/hive-standalone-metastore-server-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-standalone-metastore-server ---
	[INFO] 
	[INFO] --- maven-assembly-plugin:3.1.0:single (assemble) @ hive-standalone-metastore-server ---
	[INFO] Reading assembly descriptor: src/assembly/bin.xml
	[WARNING] The assembly descriptor contains a filesystem-root relative reference, which is not cross platform compatible /
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/maven-metadata.xml
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/maven-metadata.xml (2 KB at 0.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/4.1.0/maven-bundle-plugin-4.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/4.1.0/maven-bundle-plugin-4.1.0.pom (10 KB at 11.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/felix-parent/6/felix-parent-6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/felix-parent/6/felix-parent-6.pom (22 KB at 16.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/apache/21/apache-21.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/apache/21/apache-21.pom (17 KB at 21.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/4.1.0/maven-bundle-plugin-4.1.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/4.1.0/maven-bundle-plugin-4.1.0.jar (227 KB at 56.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/osgi/org.osgi.core/4.3.1/org.osgi.core-4.3.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/osgi/org.osgi.core/4.3.1/org.osgi.core-4.3.1.pom (2 KB at 3.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/biz/aQute/bnd/biz.aQute.bndlib/4.1.0/biz.aQute.bndlib-4.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/biz/aQute/bnd/biz.aQute.bndlib/4.1.0/biz.aQute.bndlib-4.1.0.pom (2 KB at 2.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/org.apache.felix.bundlerepository/1.6.6/org.apache.felix.bundlerepository-1.6.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/org.apache.felix.bundlerepository/1.6.6/org.apache.felix.bundlerepository-1.6.6.pom (6 KB at 11.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/felix-parent/2.1/felix-parent-2.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/felix-parent/2.1/felix-parent-2.1.pom (10 KB at 16.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/osgi/org.osgi.core/4.1.0/org.osgi.core-4.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/osgi/org.osgi.core/4.1.0/org.osgi.core-4.1.0.pom (193 B at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/easymock/easymock/2.4/easymock-2.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/easymock/easymock/2.4/easymock-2.4.pom (6 KB at 10.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/org.apache.felix.utils/1.6.0/org.apache.felix.utils-1.6.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/org.apache.felix.utils/1.6.0/org.apache.felix.utils-1.6.0.pom (4 KB at 6.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/osgi/org.osgi.compendium/4.2.0/org.osgi.compendium-4.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/osgi/org.osgi.compendium/4.2.0/org.osgi.compendium-4.2.0.pom (463 B at 0.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.0/maven-core-2.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.0/maven-core-2.2.0.pom (11 KB at 16.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.0/maven-plugin-parameter-documenter-2.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.0/maven-plugin-parameter-documenter-2.2.0.pom (2 KB at 3.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/2.2.0/maven-reporting-api-2.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/2.2.0/maven-reporting-api-2.2.0.pom (2 KB at 3.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting/2.2.0/maven-reporting-2.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting/2.2.0/maven-reporting-2.2.0.pom (2 KB at 2.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.0/maven-error-diagnostics-2.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.0/maven-error-diagnostics-2.2.0.pom (2 KB at 3.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.0/maven-plugin-api-2.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.0/maven-plugin-api-2.2.0.pom (2 KB at 3.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.0/maven-plugin-descriptor-2.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.0/maven-plugin-descriptor-2.2.0.pom (3 KB at 3.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.0/maven-monitor-2.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.0/maven-monitor-2.2.0.pom (2 KB at 2.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/osgi/org.osgi.core/4.3.1/org.osgi.core-4.3.1.jar
	Downloading: https://repo.maven.apache.org/maven2/biz/aQute/bnd/biz.aQute.bndlib/4.1.0/biz.aQute.bndlib-4.1.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/org.apache.felix.bundlerepository/1.6.6/org.apache.felix.bundlerepository-1.6.6.jar
	Downloading: https://repo.maven.apache.org/maven2/org/easymock/easymock/2.4/easymock-2.4.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/org.apache.felix.utils/1.6.0/org.apache.felix.utils-1.6.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/org.apache.felix.utils/1.6.0/org.apache.felix.utils-1.6.0.jar (67 KB at 6.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/osgi/org.osgi.compendium/4.2.0/org.osgi.compendium-4.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/org.apache.felix.bundlerepository/1.6.6/org.apache.felix.bundlerepository-1.6.6.jar (165 KB at 14.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.0/maven-core-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/easymock/easymock/2.4/easymock-2.4.jar (80 KB at 5.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.0/maven-settings-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/osgi/org.osgi.core/4.3.1/org.osgi.core-4.3.1.jar (342 KB at 18.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.0/maven-plugin-parameter-documenter-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.0/maven-settings-2.2.0.jar (48 KB at 2.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/2.2.0/maven-reporting-api-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.0/maven-plugin-parameter-documenter-2.2.0.jar (22 KB at 1.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.0/maven-profile-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.0/maven-core-2.2.0.jar (172 KB at 7.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.0/maven-model-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/2.2.0/maven-reporting-api-2.2.0.jar (10 KB at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.0/maven-artifact-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.0/maven-model-2.2.0.jar (86 KB at 3.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.0/maven-repository-metadata-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.0/maven-artifact-2.2.0.jar (79 KB at 2.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.0/maven-error-diagnostics-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.0/maven-profile-2.2.0.jar (35 KB at 1.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.0/maven-project-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.0/maven-repository-metadata-2.2.0.jar (26 KB at 0.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.0/maven-plugin-registry-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.0/maven-error-diagnostics-2.2.0.jar (13 KB at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.0/maven-plugin-api-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.0/maven-plugin-registry-2.2.0.jar (30 KB at 0.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.0/maven-plugin-descriptor-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.0/maven-plugin-api-2.2.0.jar (13 KB at 0.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.0/maven-artifact-manager-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.0/maven-plugin-descriptor-2.2.0.jar (39 KB at 1.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.0/maven-monitor-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.0/maven-artifact-manager-2.2.0.jar (64 KB at 1.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/2.8.1/plexus-archiver-2.8.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/osgi/org.osgi.compendium/4.2.0/org.osgi.compendium-4.2.0.jar (600 KB at 15.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.3.2/plexus-io-2.3.2.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/2.8.1/plexus-archiver-2.8.1.jar (0 B at 0.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.10/plexus-utils-3.0.10.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.3.2/plexus-io-2.3.2.jar (0 B at 0.0 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.0/maven-monitor-2.2.0.jar (11 KB at 0.3 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.10/plexus-utils-3.0.10.jar (226 KB at 5.0 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.0/maven-project-2.2.0.jar (153 KB at 3.3 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/biz/aQute/bnd/biz.aQute.bndlib/4.1.0/biz.aQute.bndlib-4.1.0.jar (2830 KB at 38.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/2.3.7/maven-bundle-plugin-2.3.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/2.3.7/maven-bundle-plugin-2.3.7.pom (4 KB at 8.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/biz/aQute/bndlib/1.50.0/bndlib-1.50.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/biz/aQute/bndlib/1.50.0/bndlib-1.50.0.pom (2 KB at 2.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.0.7/maven-core-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.0.7/maven-core-2.0.7.pom (7 KB at 12.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.7/maven-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.7/maven-2.0.7.pom (11 KB at 19.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.0.7/maven-settings-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.0.7/maven-settings-2.0.7.pom (2 KB at 3.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.0.7/maven-model-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.0.7/maven-model-2.0.7.pom (3 KB at 6.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.0.7/maven-plugin-parameter-documenter-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.0.7/maven-plugin-parameter-documenter-2.0.7.pom (2 KB at 3.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/2.0.7/maven-reporting-api-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/2.0.7/maven-reporting-api-2.0.7.pom (2 KB at 3.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting/2.0.7/maven-reporting-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting/2.0.7/maven-reporting-2.0.7.pom (2 KB at 3.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.0.7/maven-profile-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.0.7/maven-profile-2.0.7.pom (2 KB at 3.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.7/maven-artifact-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.7/maven-artifact-2.0.7.pom (2 KB at 3.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.7/maven-repository-metadata-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.7/maven-repository-metadata-2.0.7.pom (2 KB at 3.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.0.7/maven-error-diagnostics-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.0.7/maven-error-diagnostics-2.0.7.pom (2 KB at 3.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.0.7/maven-project-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.0.7/maven-project-2.0.7.pom (3 KB at 5.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.7/maven-artifact-manager-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.7/maven-artifact-manager-2.0.7.pom (3 KB at 5.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.0.7/maven-plugin-registry-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.0.7/maven-plugin-registry-2.0.7.pom (2 KB at 4.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.7/maven-plugin-api-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.7/maven-plugin-api-2.0.7.pom (2 KB at 2.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.0.7/maven-plugin-descriptor-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.0.7/maven-plugin-descriptor-2.0.7.pom (2 KB at 4.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.0.7/maven-monitor-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.0.7/maven-monitor-2.0.7.pom (2 KB at 2.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/2.4.1/maven-archiver-2.4.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/2.4.1/maven-archiver-2.4.1.pom (4 KB at 6.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/2.3.7/maven-bundle-plugin-2.3.7.jar
	Downloading: https://repo.maven.apache.org/maven2/biz/aQute/bndlib/1.50.0/bndlib-1.50.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/osgi/org.osgi.core/4.1.0/org.osgi.core-4.1.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.0.7/maven-core-2.0.7.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.0.7/maven-settings-2.0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.0.7/maven-settings-2.0.7.jar (48 KB at 3.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.0.7/maven-plugin-parameter-documenter-2.0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.0.7/maven-core-2.0.7.jar (150 KB at 12.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/2.0.7/maven-reporting-api-2.0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.0.7/maven-plugin-parameter-documenter-2.0.7.jar (21 KB at 1.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.0.7/maven-profile-2.0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/2.0.7/maven-reporting-api-2.0.7.jar (10 KB at 0.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.0.7/maven-model-2.0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.0.7/maven-profile-2.0.7.jar (35 KB at 2.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.7/maven-artifact-2.0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.0.7/maven-model-2.0.7.jar (85 KB at 5.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.7/maven-repository-metadata-2.0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.7/maven-repository-metadata-2.0.7.jar (24 KB at 1.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.0.7/maven-error-diagnostics-2.0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.7/maven-artifact-2.0.7.jar (86 KB at 4.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.0.7/maven-project-2.0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.0.7/maven-error-diagnostics-2.0.7.jar (14 KB at 0.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.0.7/maven-plugin-registry-2.0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.0.7/maven-plugin-registry-2.0.7.jar (29 KB at 1.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.7/maven-plugin-api-2.0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/2.3.7/maven-bundle-plugin-2.3.7.jar (122 KB at 5.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.0.7/maven-plugin-descriptor-2.0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.0.7/maven-project-2.0.7.jar (114 KB at 5.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.7/maven-artifact-manager-2.0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.7/maven-plugin-api-2.0.7.jar (13 KB at 0.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.0.7/maven-monitor-2.0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.0.7/maven-monitor-2.0.7.jar (11 KB at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/2.4.1/maven-archiver-2.4.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/osgi/org.osgi.core/4.1.0/org.osgi.core-4.1.0.jar (160 KB at 6.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.1/plexus-utils-2.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/2.4.1/maven-archiver-2.4.1.jar (20 KB at 0.8 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.7/maven-artifact-manager-2.0.7.jar (56 KB at 2.2 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.0.7/maven-plugin-descriptor-2.0.7.jar (37 KB at 1.4 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.1/plexus-utils-2.1.jar (220 KB at 7.3 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/biz/aQute/bndlib/1.50.0/bndlib-1.50.0.jar (899 KB at 23.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-gitexe/1.9.1/maven-scm-provider-gitexe-1.9.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-gitexe/1.9.1/maven-scm-provider-gitexe-1.9.1.pom (3 KB at 5.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-providers-git/1.9.1/maven-scm-providers-git-1.9.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-providers-git/1.9.1/maven-scm-providers-git-1.9.1.pom (3 KB at 4.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-providers/1.9.1/maven-scm-providers-1.9.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-providers/1.9.1/maven-scm-providers-1.9.1.pom (4 KB at 6.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm/1.9.1/maven-scm-1.9.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm/1.9.1/maven-scm-1.9.1.pom (22 KB at 30.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-git-commons/1.9.1/maven-scm-provider-git-commons-1.9.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-git-commons/1.9.1/maven-scm-provider-git-commons-1.9.1.pom (3 KB at 4.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-api/1.9.1/maven-scm-api-1.9.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-api/1.9.1/maven-scm-api-1.9.1.pom (2 KB at 3.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-gitexe/1.9.1/maven-scm-provider-gitexe-1.9.1.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-git-commons/1.9.1/maven-scm-provider-git-commons-1.9.1.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-api/1.9.1/maven-scm-api-1.9.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-git-commons/1.9.1/maven-scm-provider-git-commons-1.9.1.jar (37 KB at 18.5 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-gitexe/1.9.1/maven-scm-provider-gitexe-1.9.1.jar (63 KB at 24.8 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-api/1.9.1/maven-scm-api-1.9.1.jar (104 KB at 29.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-manager-plexus/1.9.1/maven-scm-manager-plexus-1.9.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-manager-plexus/1.9.1/maven-scm-manager-plexus-1.9.1.pom (3 KB at 3.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-managers/1.9.1/maven-scm-managers-1.9.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-managers/1.9.1/maven-scm-managers-1.9.1.pom (2 KB at 3.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-manager-plexus/1.9.1/maven-scm-manager-plexus-1.9.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-manager-plexus/1.9.1/maven-scm-manager-plexus-1.9.1.jar (11 KB at 15.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/kathrynhuxtable/maven/wagon/wagon-gitsite/0.3.1/wagon-gitsite-0.3.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/kathrynhuxtable/maven/wagon/wagon-gitsite/0.3.1/wagon-gitsite-0.3.1.pom (17 KB at 23.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-api/1.3/maven-scm-api-1.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-api/1.3/maven-scm-api-1.3.pom (2 KB at 3.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm/1.3/maven-scm-1.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm/1.3/maven-scm-1.3.pom (12 KB at 19.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-manager-plexus/1.3/maven-scm-manager-plexus-1.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-manager-plexus/1.3/maven-scm-manager-plexus-1.3.pom (3 KB at 4.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-managers/1.3/maven-scm-managers-1.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-managers/1.3/maven-scm-managers-1.3.pom (2 KB at 2.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.5.4/plexus-container-default-1.5.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.5.4/plexus-container-default-1.5.4.pom (3 KB at 5.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-gitexe/1.3/maven-scm-provider-gitexe-1.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-gitexe/1.3/maven-scm-provider-gitexe-1.3.pom (3 KB at 4.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-providers-git/1.3/maven-scm-providers-git-1.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-providers-git/1.3/maven-scm-providers-git-1.3.pom (3 KB at 5.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-providers/1.3/maven-scm-providers-1.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-providers/1.3/maven-scm-providers-1.3.pom (4 KB at 6.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-git-commons/1.3/maven-scm-provider-git-commons-1.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-git-commons/1.3/maven-scm-provider-git-commons-1.3.pom (3 KB at 4.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/kathrynhuxtable/maven/wagon/wagon-gitsite/0.3.1/wagon-gitsite-0.3.1.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-api/1.3/maven-scm-api-1.3.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-manager-plexus/1.3/maven-scm-manager-plexus-1.3.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-gitexe/1.3/maven-scm-provider-gitexe-1.3.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-git-commons/1.3/maven-scm-provider-git-commons-1.3.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-manager-plexus/1.3/maven-scm-manager-plexus-1.3.jar (11 KB at 4.6 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/kathrynhuxtable/maven/wagon/wagon-gitsite/0.3.1/wagon-gitsite-0.3.1.jar (20 KB at 7.5 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-gitexe/1.3/maven-scm-provider-gitexe-1.3.jar (49 KB at 18.7 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-api/1.3/maven-scm-api-1.3.jar (88 KB at 24.6 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-git-commons/1.3/maven-scm-provider-git-commons-1.3.jar (36 KB at 10.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/3.2.0/maven-bundle-plugin-3.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/3.2.0/maven-bundle-plugin-3.2.0.pom (9 KB at 12.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/felix-parent/4/felix-parent-4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/felix-parent/4/felix-parent-4.pom (24 KB at 29.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/biz/aQute/bnd/biz.aQute.bndlib/3.2.0/biz.aQute.bndlib-3.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/biz/aQute/bnd/biz.aQute.bndlib/3.2.0/biz.aQute.bndlib-3.2.0.pom (2 KB at 2.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/easymock/easymock/3.4/easymock-3.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/easymock/easymock/3.4/easymock-3.4.pom (8 KB at 12.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/easymock/easymock-parent/3.4/easymock-parent-3.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/easymock/easymock-parent/3.4/easymock-parent-3.4.pom (17 KB at 22.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/3.2.0/maven-bundle-plugin-3.2.0.jar
	Downloading: https://repo.maven.apache.org/maven2/biz/aQute/bnd/biz.aQute.bndlib/3.2.0/biz.aQute.bndlib-3.2.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/easymock/easymock/3.4/easymock-3.4.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/3.2.0/maven-bundle-plugin-3.2.0.jar (218 KB at 25.6 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/easymock/easymock/3.4/easymock-3.4.jar (464 KB at 21.6 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/biz/aQute/bnd/biz.aQute.bndlib/3.2.0/biz.aQute.bndlib-3.2.0.jar (2319 KB at 43.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/2.5.3/maven-bundle-plugin-2.5.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/2.5.3/maven-bundle-plugin-2.5.3.pom (5 KB at 8.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/biz/aQute/bnd/bndlib/2.3.0/bndlib-2.3.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/biz/aQute/bnd/bndlib/2.3.0/bndlib-2.3.0.pom (2 KB at 3.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/biz/aQute/bnd/parent/2.3.0/parent-2.3.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/biz/aQute/bnd/parent/2.3.0/parent-2.3.0.pom (5 KB at 8.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/2.5.3/maven-bundle-plugin-2.5.3.jar
	Downloading: https://repo.maven.apache.org/maven2/biz/aQute/bnd/bndlib/2.3.0/bndlib-2.3.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/2.5.3/maven-bundle-plugin-2.5.3.jar (172 KB at 28.4 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/biz/aQute/bnd/bndlib/2.3.0/bndlib-2.3.0.jar (1744 KB at 49.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-gitexe/1.9.4/maven-scm-provider-gitexe-1.9.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-gitexe/1.9.4/maven-scm-provider-gitexe-1.9.4.pom (3 KB at 5.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-providers-git/1.9.4/maven-scm-providers-git-1.9.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-providers-git/1.9.4/maven-scm-providers-git-1.9.4.pom (3 KB at 4.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-providers/1.9.4/maven-scm-providers-1.9.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-providers/1.9.4/maven-scm-providers-1.9.4.pom (4 KB at 7.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm/1.9.4/maven-scm-1.9.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm/1.9.4/maven-scm-1.9.4.pom (22 KB at 29.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-git-commons/1.9.4/maven-scm-provider-git-commons-1.9.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-git-commons/1.9.4/maven-scm-provider-git-commons-1.9.4.pom (3 KB at 4.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-api/1.9.4/maven-scm-api-1.9.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-api/1.9.4/maven-scm-api-1.9.4.pom (2 KB at 3.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-gitexe/1.9.4/maven-scm-provider-gitexe-1.9.4.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-git-commons/1.9.4/maven-scm-provider-git-commons-1.9.4.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-api/1.9.4/maven-scm-api-1.9.4.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-gitexe/1.9.4/maven-scm-provider-gitexe-1.9.4.jar (65 KB at 31.5 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-api/1.9.4/maven-scm-api-1.9.4.jar (105 KB at 33.8 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-git-commons/1.9.4/maven-scm-provider-git-commons-1.9.4.jar (34 KB at 9.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-manager-plexus/1.9.4/maven-scm-manager-plexus-1.9.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-manager-plexus/1.9.4/maven-scm-manager-plexus-1.9.4.pom (3 KB at 3.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-managers/1.9.4/maven-scm-managers-1.9.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-managers/1.9.4/maven-scm-managers-1.9.4.pom (2 KB at 3.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-manager-plexus/1.9.4/maven-scm-manager-plexus-1.9.4.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-manager-plexus/1.9.4/maven-scm-manager-plexus-1.9.4.jar (11 KB at 13.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/github/stephenc/wagon/wagon-gitsite/0.5/wagon-gitsite-0.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/github/stephenc/wagon/wagon-gitsite/0.5/wagon-gitsite-0.5.pom (18 KB at 18.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-api/1.9.2/maven-scm-api-1.9.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-api/1.9.2/maven-scm-api-1.9.2.pom (2 KB at 3.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm/1.9.2/maven-scm-1.9.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm/1.9.2/maven-scm-1.9.2.pom (23 KB at 22.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-manager-plexus/1.9.2/maven-scm-manager-plexus-1.9.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-manager-plexus/1.9.2/maven-scm-manager-plexus-1.9.2.pom (3 KB at 4.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-managers/1.9.2/maven-scm-managers-1.9.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-managers/1.9.2/maven-scm-managers-1.9.2.pom (2 KB at 3.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-gitexe/1.9.2/maven-scm-provider-gitexe-1.9.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-gitexe/1.9.2/maven-scm-provider-gitexe-1.9.2.pom (3 KB at 5.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-providers-git/1.9.2/maven-scm-providers-git-1.9.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-providers-git/1.9.2/maven-scm-providers-git-1.9.2.pom (3 KB at 4.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-providers/1.9.2/maven-scm-providers-1.9.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-providers/1.9.2/maven-scm-providers-1.9.2.pom (4 KB at 7.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-git-commons/1.9.2/maven-scm-provider-git-commons-1.9.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-git-commons/1.9.2/maven-scm-provider-git-commons-1.9.2.pom (3 KB at 4.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/github/stephenc/wagon/wagon-gitsite/0.5/wagon-gitsite-0.5.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-api/1.9.2/maven-scm-api-1.9.2.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-manager-plexus/1.9.2/maven-scm-manager-plexus-1.9.2.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-gitexe/1.9.2/maven-scm-provider-gitexe-1.9.2.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-git-commons/1.9.2/maven-scm-provider-git-commons-1.9.2.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-manager-plexus/1.9.2/maven-scm-manager-plexus-1.9.2.jar (11 KB at 7.2 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/com/github/stephenc/wagon/wagon-gitsite/0.5/wagon-gitsite-0.5.jar (20 KB at 9.2 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-git-commons/1.9.2/maven-scm-provider-git-commons-1.9.2.jar (37 KB at 15.6 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-provider-gitexe/1.9.2/maven-scm-provider-gitexe-1.9.2.jar (63 KB at 17.7 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/scm/maven-scm-api/1.9.2/maven-scm-api-1.9.2.jar (104 KB at 24.1 KB/sec)
	Downloading: http://download.java.net/maven/2/org/jvnet/wagon-svn/wagon-svn/1.9/wagon-svn-1.9.pom
	Downloading: https://repo.maven.apache.org/maven2/org/jvnet/wagon-svn/wagon-svn/1.9/wagon-svn-1.9.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/jvnet/wagon-svn/wagon-svn/1.9/wagon-svn-1.9.pom (3 KB at 4.6 KB/sec)
	Downloading: http://download.java.net/maven/2/org/jvnet/hudson/svnkit/svnkit/1.1.4-hudson-4/svnkit-1.1.4-hudson-4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/jvnet/hudson/svnkit/svnkit/1.1.4-hudson-4/svnkit-1.1.4-hudson-4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/jvnet/hudson/svnkit/svnkit/1.1.4-hudson-4/svnkit-1.1.4-hudson-4.pom (2 KB at 2.3 KB/sec)
	Downloading: http://download.java.net/maven/2/ch/ethz/ganymed/ganymed-ssh2/build210/ganymed-ssh2-build210.pom
	Downloading: https://repo.maven.apache.org/maven2/ch/ethz/ganymed/ganymed-ssh2/build210/ganymed-ssh2-build210.pom
	Downloaded: https://repo.maven.apache.org/maven2/ch/ethz/ganymed/ganymed-ssh2/build210/ganymed-ssh2-build210.pom (710 B at 1.3 KB/sec)
	Downloading: http://download.java.net/maven/2/org/jvnet/wagon-svn/wagon-svn/1.9/wagon-svn-1.9.jar
	Downloading: http://download.java.net/maven/2/org/jvnet/hudson/svnkit/svnkit/1.1.4-hudson-4/svnkit-1.1.4-hudson-4.jar
	Downloading: http://download.java.net/maven/2/ch/ethz/ganymed/ganymed-ssh2/build210/ganymed-ssh2-build210.jar
	Downloading: https://repo.maven.apache.org/maven2/org/jvnet/wagon-svn/wagon-svn/1.9/wagon-svn-1.9.jar
	Downloading: https://repo.maven.apache.org/maven2/org/jvnet/hudson/svnkit/svnkit/1.1.4-hudson-4/svnkit-1.1.4-hudson-4.jar
	Downloading: https://repo.maven.apache.org/maven2/ch/ethz/ganymed/ganymed-ssh2/build210/ganymed-ssh2-build210.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/jvnet/wagon-svn/wagon-svn/1.9/wagon-svn-1.9.jar (20 KB at 10.9 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/ch/ethz/ganymed/ganymed-ssh2/build210/ganymed-ssh2-build210.jar (240 KB at 46.7 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/jvnet/hudson/svnkit/svnkit/1.1.4-hudson-4/svnkit-1.1.4-hudson-4.jar (1195 KB at 38.0 KB/sec)
	Downloading: http://download.java.net/maven/2/org/apache/felix/maven-bundle-plugin/maven-metadata.xml
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-ssh-external/2.2/wagon-ssh-external-2.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-ssh-external/2.2/wagon-ssh-external-2.2.pom (5 KB at 9.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-providers/2.2/wagon-providers-2.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-providers/2.2/wagon-providers-2.2.pom (3 KB at 5.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-ssh-common/2.2/wagon-ssh-common-2.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-ssh-common/2.2/wagon-ssh-common-2.2.pom (2 KB at 3.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interactivity-api/1.0-alpha-6/plexus-interactivity-api-1.0-alpha-6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interactivity-api/1.0-alpha-6/plexus-interactivity-api-1.0-alpha-6.pom (726 B at 1.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interactivity/1.0-alpha-6/plexus-interactivity-1.0-alpha-6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interactivity/1.0-alpha-6/plexus-interactivity-1.0-alpha-6.pom (2 KB at 2.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.9/plexus-components-1.1.9.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.9/plexus-components-1.1.9.pom (3 KB at 5.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-ssh-external/2.2/wagon-ssh-external-2.2.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-ssh-common/2.2/wagon-ssh-common-2.2.jar
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interactivity-api/1.0-alpha-6/plexus-interactivity-api-1.0-alpha-6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interactivity-api/1.0-alpha-6/plexus-interactivity-api-1.0-alpha-6.jar (12 KB at 11.3 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-ssh-common/2.2/wagon-ssh-common-2.2.jar (25 KB at 17.3 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-ssh-external/2.2/wagon-ssh-external-2.2.jar (15 KB at 4.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/2.4.0/maven-bundle-plugin-2.4.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/2.4.0/maven-bundle-plugin-2.4.0.pom (4 KB at 6.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/biz/aQute/bnd/bndlib/2.1.0/bndlib-2.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/biz/aQute/bnd/bndlib/2.1.0/bndlib-2.1.0.pom (2 KB at 2.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/biz/aQute/bnd/parent/2.1.0/parent-2.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/biz/aQute/bnd/parent/2.1.0/parent-2.1.0.pom (3 KB at 3.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/osgi/org.osgi.core/4.2.0/org.osgi.core-4.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/osgi/org.osgi.core/4.2.0/org.osgi.core-4.2.0.pom (457 B at 1.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/2.4.0/maven-bundle-plugin-2.4.0.jar
	Downloading: https://repo.maven.apache.org/maven2/biz/aQute/bnd/bndlib/2.1.0/bndlib-2.1.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/osgi/org.osgi.core/4.2.0/org.osgi.core-4.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/felix/maven-bundle-plugin/2.4.0/maven-bundle-plugin-2.4.0.jar (124 KB at 22.6 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/osgi/org.osgi.core/4.2.0/org.osgi.core-4.2.0.jar (242 KB at 23.2 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/biz/aQute/bnd/bndlib/2.1.0/bndlib-2.1.0.jar (1356 KB at 39.8 KB/sec)
	[INFO] Building tar: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/target/apache-hive-standalone-metastore-server-4.0.0-SNAPSHOT-bin.tar.gz
	[INFO] 
	[INFO] --- maven-jar-plugin:3.0.0:test-jar (default) @ hive-standalone-metastore-server ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/target/hive-standalone-metastore-server-4.0.0-SNAPSHOT-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Query Language 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty/3.5.13.Final/netty-3.5.13.Final.pom
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty/3.5.13.Final/netty-3.5.13.Final.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty/3.5.13.Final/netty-3.5.13.Final.pom (26 KB at 22.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hadoop/hadoop-archives/3.1.0/hadoop-archives-3.1.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-archives/3.1.0/hadoop-archives-3.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-archives/3.1.0/hadoop-archives-3.1.0.pom (5 KB at 8.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/orc/orc-tools/1.5.3/orc-tools-1.5.3.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/orc/orc-tools/1.5.3/orc-tools-1.5.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/orc/orc-tools/1.5.3/orc-tools-1.5.3.pom (5 KB at 9.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/opencsv/opencsv/3.9/opencsv-3.9.pom
	Downloading: https://repo.maven.apache.org/maven2/com/opencsv/opencsv/3.9/opencsv-3.9.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/opencsv/opencsv/3.9/opencsv-3.9.pom (17 KB at 18.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/threeten/threetenbp/1.3.5/threetenbp-1.3.5.pom
	Downloading: https://repo.maven.apache.org/maven2/org/threeten/threetenbp/1.3.5/threetenbp-1.3.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/threeten/threetenbp/1.3.5/threetenbp-1.3.5.pom (28 KB at 17.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/codehaus/groovy/groovy-all/2.4.11/groovy-all-2.4.11.pom
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/groovy/groovy-all/2.4.11/groovy-all-2.4.11.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/groovy/groovy-all/2.4.11/groovy-all-2.4.11.pom (21 KB at 19.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/calcite/calcite-core/1.17.0/calcite-core-1.17.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-core/1.17.0/calcite-core-1.17.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-core/1.17.0/calcite-core-1.17.0.pom (19 KB at 21.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/calcite/calcite/1.17.0/calcite-1.17.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite/1.17.0/calcite-1.17.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite/1.17.0/calcite-1.17.0.pom (44 KB at 32.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/calcite/calcite-linq4j/1.17.0/calcite-linq4j-1.17.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-linq4j/1.17.0/calcite-linq4j-1.17.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-linq4j/1.17.0/calcite-linq4j-1.17.0.pom (3 KB at 6.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/commons/commons-dbcp2/2.4.0/commons-dbcp2-2.4.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-dbcp2/2.4.0/commons-dbcp2-2.4.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-dbcp2/2.4.0/commons-dbcp2-2.4.0.pom (19 KB at 22.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/commons/commons-parent/46/commons-parent-46.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/46/commons-parent-46.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/46/commons-parent-46.pom (74 KB at 43.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/commons/commons-pool2/2.5.0/commons-pool2-2.5.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-pool2/2.5.0/commons-pool2-2.5.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-pool2/2.5.0/commons-pool2-2.5.0.pom (13 KB at 17.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/esri/geometry/esri-geometry-api/2.0.0/esri-geometry-api-2.0.0.pom
	Downloading: https://repo.maven.apache.org/maven2/com/esri/geometry/esri-geometry-api/2.0.0/esri-geometry-api-2.0.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/esri/geometry/esri-geometry-api/2.0.0/esri-geometry-api-2.0.0.pom (6 KB at 11.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/yahoo/datasketches/sketches-core/0.9.0/sketches-core-0.9.0.pom
	Downloading: https://repo.maven.apache.org/maven2/com/yahoo/datasketches/sketches-core/0.9.0/sketches-core-0.9.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/yahoo/datasketches/sketches-core/0.9.0/sketches-core-0.9.0.pom (3 KB at 4.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/yahoo/datasketches/sketches/0.9.0/sketches-0.9.0.pom
	Downloading: https://repo.maven.apache.org/maven2/com/yahoo/datasketches/sketches/0.9.0/sketches-0.9.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/yahoo/datasketches/sketches/0.9.0/sketches-0.9.0.pom (17 KB at 21.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/yahoo/datasketches/memory/0.9.0/memory-0.9.0.pom
	Downloading: https://repo.maven.apache.org/maven2/com/yahoo/datasketches/memory/0.9.0/memory-0.9.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/yahoo/datasketches/memory/0.9.0/memory-0.9.0.pom (807 B at 1.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/calcite/calcite-druid/1.17.0/calcite-druid-1.17.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-druid/1.17.0/calcite-druid-1.17.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-druid/1.17.0/calcite-druid-1.17.0.pom (6 KB at 10.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/net/hydromatic/aggdesigner-algorithm/6.0/aggdesigner-algorithm-6.0.pom
	Downloading: https://repo.maven.apache.org/maven2/net/hydromatic/aggdesigner-algorithm/6.0/aggdesigner-algorithm-6.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/net/hydromatic/aggdesigner-algorithm/6.0/aggdesigner-algorithm-6.0.pom (2 KB at 3.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/net/hydromatic/aggdesigner/6.0/aggdesigner-6.0.pom
	Downloading: https://repo.maven.apache.org/maven2/net/hydromatic/aggdesigner/6.0/aggdesigner-6.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/net/hydromatic/aggdesigner/6.0/aggdesigner-6.0.pom (11 KB at 16.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/calcite/avatica/avatica/1.12.0/avatica-1.12.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/avatica/avatica/1.12.0/avatica-1.12.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/avatica/avatica/1.12.0/avatica-1.12.0.pom (5 KB at 8.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/calcite/avatica/avatica-parent/1.12.0/avatica-parent-1.12.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/avatica/avatica-parent/1.12.0/avatica-parent-1.12.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/avatica/avatica-parent/1.12.0/avatica-parent-1.12.0.pom (30 KB at 31.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-module-junit4/1.6.6/powermock-module-junit4-1.6.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-module-junit4/1.6.6/powermock-module-junit4-1.6.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-module-junit4/1.6.6/powermock-module-junit4-1.6.6.pom (2 KB at 3.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-modules/1.6.6/powermock-modules-1.6.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-modules/1.6.6/powermock-modules-1.6.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-modules/1.6.6/powermock-modules-1.6.6.pom (771 B at 1.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock/1.6.6/powermock-1.6.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock/1.6.6/powermock-1.6.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock/1.6.6/powermock-1.6.6.pom (17 KB at 21.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-module-junit4-common/1.6.6/powermock-module-junit4-common-1.6.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-module-junit4-common/1.6.6/powermock-module-junit4-common-1.6.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-module-junit4-common/1.6.6/powermock-module-junit4-common-1.6.6.pom (2 KB at 2.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-core/1.6.6/powermock-core-1.6.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-core/1.6.6/powermock-core-1.6.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-core/1.6.6/powermock-core-1.6.6.pom (3 KB at 6.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-reflect/1.6.6/powermock-reflect-1.6.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-reflect/1.6.6/powermock-reflect-1.6.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-reflect/1.6.6/powermock-reflect-1.6.6.pom (2 KB at 2.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/objenesis/objenesis/2.4/objenesis-2.4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/objenesis/objenesis/2.4/objenesis-2.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/objenesis/objenesis/2.4/objenesis-2.4.pom (3 KB at 5.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/objenesis/objenesis-parent/2.4/objenesis-parent-2.4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/objenesis/objenesis-parent/2.4/objenesis-parent-2.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/objenesis/objenesis-parent/2.4/objenesis-parent-2.4.pom (17 KB at 22.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.pom
	Downloading: https://repo.maven.apache.org/maven2/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.pom (10 KB at 18.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-api-mockito/1.6.6/powermock-api-mockito-1.6.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-mockito/1.6.6/powermock-api-mockito-1.6.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-mockito/1.6.6/powermock-api-mockito-1.6.6.pom (2 KB at 2.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-api/1.6.6/powermock-api-1.6.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-api/1.6.6/powermock-api-1.6.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-api/1.6.6/powermock-api-1.6.6.pom (855 B at 2.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-api-mockito-common/1.6.6/powermock-api-mockito-common-1.6.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-mockito-common/1.6.6/powermock-api-mockito-common-1.6.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-mockito-common/1.6.6/powermock-api-mockito-common-1.6.6.pom (2 KB at 3.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-api-support/1.6.6/powermock-api-support-1.6.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-support/1.6.6/powermock-api-support-1.6.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-support/1.6.6/powermock-api-support-1.6.6.pom (2 KB at 2.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hadoop/hadoop-archives/3.1.0/hadoop-archives-3.1.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/orc/orc-tools/1.5.3/orc-tools-1.5.3.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/opencsv/opencsv/3.9/opencsv-3.9.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/threeten/threetenbp/1.3.5/threetenbp-1.3.5.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/codehaus/groovy/groovy-all/2.4.11/groovy-all-2.4.11.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/calcite/calcite-core/1.17.0/calcite-core-1.17.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/calcite/calcite-linq4j/1.17.0/calcite-linq4j-1.17.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/commons/commons-dbcp2/2.4.0/commons-dbcp2-2.4.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/commons/commons-pool2/2.5.0/commons-pool2-2.5.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/esri/geometry/esri-geometry-api/2.0.0/esri-geometry-api-2.0.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/yahoo/datasketches/sketches-core/0.9.0/sketches-core-0.9.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/yahoo/datasketches/memory/0.9.0/memory-0.9.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/calcite/calcite-druid/1.17.0/calcite-druid-1.17.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/calcite/avatica/avatica/1.12.0/avatica-1.12.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/parquet/parquet-column/1.10.0/parquet-column-1.10.0-tests.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-module-junit4/1.6.6/powermock-module-junit4-1.6.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-module-junit4-common/1.6.6/powermock-module-junit4-common-1.6.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-core/1.6.6/powermock-core-1.6.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-reflect/1.6.6/powermock-reflect-1.6.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-api-mockito/1.6.6/powermock-api-mockito-1.6.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-api-mockito-common/1.6.6/powermock-api-mockito-common-1.6.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-api-support/1.6.6/powermock-api-support-1.6.6.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-archives/3.1.0/hadoop-archives-3.1.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/orc/orc-tools/1.5.3/orc-tools-1.5.3.jar
	Downloading: https://repo.maven.apache.org/maven2/com/opencsv/opencsv/3.9/opencsv-3.9.jar
	Downloading: https://repo.maven.apache.org/maven2/org/threeten/threetenbp/1.3.5/threetenbp-1.3.5.jar
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/groovy/groovy-all/2.4.11/groovy-all-2.4.11.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/orc/orc-tools/1.5.3/orc-tools-1.5.3.jar (104 KB at 8.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-core/1.17.0/calcite-core-1.17.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-archives/3.1.0/hadoop-archives-3.1.0.jar (63 KB at 4.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-linq4j/1.17.0/calcite-linq4j-1.17.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/opencsv/opencsv/3.9/opencsv-3.9.jar (79 KB at 3.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-dbcp2/2.4.0/commons-dbcp2-2.4.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-dbcp2/2.4.0/commons-dbcp2-2.4.0.jar (191 KB at 4.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-pool2/2.5.0/commons-pool2-2.5.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-linq4j/1.17.0/calcite-linq4j-1.17.0.jar (450 KB at 9.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/esri/geometry/esri-geometry-api/2.0.0/esri-geometry-api-2.0.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/threeten/threetenbp/1.3.5/threetenbp-1.3.5.jar (581 KB at 12.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/yahoo/datasketches/sketches-core/0.9.0/sketches-core-0.9.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-pool2/2.5.0/commons-pool2-2.5.0.jar (126 KB at 2.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/yahoo/datasketches/memory/0.9.0/memory-0.9.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/yahoo/datasketches/memory/0.9.0/memory-0.9.0.jar (30 KB at 0.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-druid/1.17.0/calcite-druid-1.17.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/yahoo/datasketches/sketches-core/0.9.0/sketches-core-0.9.0.jar (447 KB at 6.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/avatica/avatica/1.12.0/avatica-1.12.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-druid/1.17.0/calcite-druid-1.17.0.jar (165 KB at 2.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/parquet/parquet-column/1.10.0/parquet-column-1.10.0-tests.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/parquet/parquet-column/1.10.0/parquet-column-1.10.0-tests.jar (204 KB at 1.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-module-junit4/1.6.6/powermock-module-junit4-1.6.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/esri/geometry/esri-geometry-api/2.0.0/esri-geometry-api-2.0.0.jar (893 KB at 7.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-module-junit4-common/1.6.6/powermock-module-junit4-common-1.6.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-module-junit4/1.6.6/powermock-module-junit4-1.6.6.jar (45 KB at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-core/1.6.6/powermock-core-1.6.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-module-junit4-common/1.6.6/powermock-module-junit4-common-1.6.6.jar (16 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-reflect/1.6.6/powermock-reflect-1.6.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-core/1.6.6/powermock-core-1.6.6.jar (120 KB at 0.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-mockito/1.6.6/powermock-api-mockito-1.6.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-reflect/1.6.6/powermock-reflect-1.6.6.jar (59 KB at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-mockito-common/1.6.6/powermock-api-mockito-common-1.6.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-mockito/1.6.6/powermock-api-mockito-1.6.6.jar (80 KB at 0.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-support/1.6.6/powermock-api-support-1.6.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-mockito-common/1.6.6/powermock-api-mockito-common-1.6.6.jar (39 KB at 0.3 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-support/1.6.6/powermock-api-support-1.6.6.jar (21 KB at 0.1 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-core/1.17.0/calcite-core-1.17.0.jar (4475 KB at 16.5 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/avatica/avatica/1.12.0/avatica-1.12.0.jar (5880 KB at 19.0 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/groovy/groovy-all/2.4.11/groovy-all-2.4.11.jar (6867 KB at 21.4 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-exec ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/ql (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-exec ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-exec ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-exec ---
	[INFO] 
	[INFO] --- antlr3-maven-plugin:3.5.2:antlr (default) @ hive-exec ---
	[INFO] ANTLR: Processing source directory /Users/xubo/Desktop/xubo/git/hive/ql/src/java
	ANTLR Parser Generator  Version 3.5.2
	Output file /Users/xubo/Desktop/xubo/git/hive/ql/target/generated-sources/antlr3/org/apache/hadoop/hive/ql/parse/HiveLexer.java does not exist: must build /Users/xubo/Desktop/xubo/git/hive/ql/src/java/org/apache/hadoop/hive/ql/parse/HiveLexer.g
	org/apache/hadoop/hive/ql/parse/HiveLexer.g
	Output file /Users/xubo/Desktop/xubo/git/hive/ql/target/generated-sources/antlr3/org/apache/hadoop/hive/ql/parse/HiveParser.java does not exist: must build /Users/xubo/Desktop/xubo/git/hive/ql/src/java/org/apache/hadoop/hive/ql/parse/HiveParser.g
	org/apache/hadoop/hive/ql/parse/HiveParser.g
	warning(200): org/apache/hadoop/hive/ql/parse/HiveParser.g:808:14: 
	Decision can match input such as "KW_EXTENDED" using multiple alternatives: 1, 2
	
	As a result, alternative(s) 2 were disabled for that input
	warning(200): org/apache/hadoop/hive/ql/parse/HiveParser.g:2439:5: 
	Decision can match input such as "KW_CHECK KW_DATETIME" using multiple alternatives: 1, 2
	
	As a result, alternative(s) 2 were disabled for that input
	warning(200): org/apache/hadoop/hive/ql/parse/HiveParser.g:2439:5: 
	Decision can match input such as "KW_CHECK KW_DATE {LPAREN, StringLiteral}" using multiple alternatives: 1, 2
	
	As a result, alternative(s) 2 were disabled for that input
	warning(200): org/apache/hadoop/hive/ql/parse/HiveParser.g:2439:5: 
	Decision can match input such as "KW_CHECK KW_UNIONTYPE LESSTHAN" using multiple alternatives: 1, 2
	
	As a result, alternative(s) 2 were disabled for that input
	warning(200): org/apache/hadoop/hive/ql/parse/HiveParser.g:2439:5: 
	Decision can match input such as "KW_CHECK {KW_EXISTS, KW_TINYINT}" using multiple alternatives: 1, 2
	
	As a result, alternative(s) 2 were disabled for that input
	warning(200): org/apache/hadoop/hive/ql/parse/HiveParser.g:2439:5: 
	Decision can match input such as "KW_CHECK KW_STRUCT LESSTHAN" using multiple alternatives: 1, 2
	
	As a result, alternative(s) 2 were disabled for that input
	warning(200): IdentifiersParser.g:424:5: 
	Decision can match input such as "KW_UNKNOWN" using multiple alternatives: 1, 10
	
	As a result, alternative(s) 10 were disabled for that input
	Output file /Users/xubo/Desktop/xubo/git/hive/ql/target/generated-sources/antlr3/org/apache/hadoop/hive/ql/parse/HintParser.java does not exist: must build /Users/xubo/Desktop/xubo/git/hive/ql/src/java/org/apache/hadoop/hive/ql/parse/HintParser.g
	org/apache/hadoop/hive/ql/parse/HintParser.g
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (generate-sources) @ hive-exec ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/ql/target/generated-sources/java/org/apache/hadoop/hive/ql/exec/vector/expressions/gen
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/ql/target/generated-sources/java/org/apache/hadoop/hive/ql/exec/vector/expressions/aggregates/gen
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/ql/target/generated-test-sources/java/org/apache/hadoop/hive/ql/exec/vector/expressions/gen
	Generating vector expression code
	Generating vector expression test code
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- build-helper-maven-plugin:1.8:add-source (add-source) @ hive-exec ---
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/ql/src/gen/thrift/gen-javabean added.
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/ql/target/generated-sources/java added.
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/ql/src/gen/protobuf/gen-java added.
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-exec ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-exec ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 4 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-exec ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-exec ---
	[INFO] Compiling 3345 source files to /Users/xubo/Desktop/xubo/git/hive/ql/target/classes
	Processing annotations
	Annotations processed
	Processing annotations
	No elements to process
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/ql/src/java/org/apache/hadoop/hive/ql/io/orc/encoded/EncodedReaderImpl.java:[75,16] sun.misc.Cleaner is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/ql/src/java/org/apache/hadoop/hive/ql/io/orc/encoded/EncodedReaderImpl.java:[75,16] sun.misc.Cleaner is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/ql/src/java/org/apache/hadoop/hive/ql/io/orc/encoded/EncodedReaderImpl.java:[75,16] sun.misc.Cleaner is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/ql/src/java/org/apache/hadoop/hive/ql/io/orc/encoded/EncodedReaderImpl.java:[1724,7] sun.misc.Cleaner is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/ql/src/java/org/apache/hadoop/hive/ql/io/orc/encoded/EncodedReaderImpl.java:[1724,26] sun.misc.Cleaner is internal proprietary API and may be removed in a future release
	[INFO] /Users/xubo/Desktop/xubo/git/hive/ql/src/java/org/apache/hadoop/hive/ql/parse/BaseSemanticAnalyzer.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/ql/src/java/org/apache/hadoop/hive/ql/parse/BaseSemanticAnalyzer.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/ql/src/java/org/apache/hadoop/hive/ql/parse/ASTNode.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/ql/src/java/org/apache/hadoop/hive/ql/parse/ASTNode.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- build-helper-maven-plugin:1.8:add-test-source (add-test-sources) @ hive-exec ---
	[INFO] Test Source directory: /Users/xubo/Desktop/xubo/git/hive/ql/target/generated-test-sources/java added.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-exec ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 6 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-exec ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/ql/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/ql/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/ql/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/ql/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-exec ---
	[INFO] Compiling 449 source files to /Users/xubo/Desktop/xubo/git/hive/ql/target/test-classes
	Processing annotations
	Annotations processed
	Processing annotations
	No elements to process
	[INFO] /Users/xubo/Desktop/xubo/git/hive/ql/src/test/org/apache/hadoop/hive/metastore/txn/TestTxnHandlerNoConnectionPool.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/ql/src/test/org/apache/hadoop/hive/metastore/txn/TestTxnHandlerNoConnectionPool.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/ql/src/test/org/apache/hadoop/hive/ql/exec/util/collectoroperator/CollectorTestOperator.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/ql/src/test/org/apache/hadoop/hive/ql/exec/util/collectoroperator/CollectorTestOperator.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-exec ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-exec ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/ql/target/hive-exec-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-exec ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:test-jar (default) @ hive-exec ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/ql/target/hive-exec-4.0.0-SNAPSHOT-tests.jar
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (core-jar) @ hive-exec ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/ql/target/hive-exec-4.0.0-SNAPSHOT-core.jar
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (fallbackauthorizer-jar) @ hive-exec ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/ql/target/hive-exec-4.0.0-SNAPSHOT-fallbackauthorizer.jar
	[INFO] 
	[INFO] --- maven-shade-plugin:3.1.0:shade (build-exec-bundle) @ hive-exec ---
	[INFO] Excluding org.apache.hive:hive-vector-code-gen:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.velocity:velocity:jar:1.5 from the shaded jar.
	[INFO] Including org.apache.hive:hive-common:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Excluding org.apache.hive:hive-classification:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Including org.apache.hive:hive-storage-api:jar:2.7.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.hive:hive-standalone-metastore-common:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Excluding commons-cli:commons-cli:jar:1.2 from the shaded jar.
	[INFO] Including org.apache.orc:orc-core:jar:1.5.3 in the shaded jar.
	[INFO] Including org.apache.orc:orc-shims:jar:1.5.3 in the shaded jar.
	[INFO] Including io.airlift:aircompressor:jar:0.10 in the shaded jar.
	[INFO] Excluding jline:jline:jar:2.12 from the shaded jar.
	[INFO] Excluding javax.servlet:javax.servlet-api:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-http:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-rewrite:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-client:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-server:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-io:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-servlet:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-security:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-webapp:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-xml:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Including joda-time:joda-time:jar:2.9.9 in the shaded jar.
	[INFO] Excluding org.apache.logging.log4j:log4j-web:jar:2.10.0 from the shaded jar.
	[INFO] Excluding net.sf.jpam:jpam:jar:1.1 from the shaded jar.
	[INFO] Excluding io.dropwizard.metrics:metrics-core:jar:3.1.0 from the shaded jar.
	[INFO] Excluding io.dropwizard.metrics:metrics-jvm:jar:3.1.0 from the shaded jar.
	[INFO] Excluding io.dropwizard.metrics:metrics-json:jar:3.1.0 from the shaded jar.
	[INFO] Excluding com.github.joshelser:dropwizard-metrics-hadoop-metrics2-reporter:jar:0.1.2 from the shaded jar.
	[INFO] Including org.apache.hive:hive-metastore:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-client:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase.thirdparty:hbase-shaded-protobuf:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-common:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding com.github.stephenc.findbugs:findbugs-annotations:jar:1.3.9-1 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-hadoop-compat:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-metrics-api:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-hadoop2-compat:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-metrics:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-protocol-shaded:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-protocol:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase.thirdparty:hbase-shaded-miscellaneous:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.hbase.thirdparty:hbase-shaded-netty:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.htrace:htrace-core:jar:3.2.0-incubating from the shaded jar.
	[INFO] Excluding org.jruby.jcodings:jcodings:jar:1.0.18 from the shaded jar.
	[INFO] Excluding org.jruby.joni:joni:jar:2.1.11 from the shaded jar.
	[INFO] Excluding org.apache.yetus:audience-annotations:jar:0.5.0 from the shaded jar.
	[INFO] Excluding com.jolbox:bonecp:jar:0.8.0.RELEASE from the shaded jar.
	[INFO] Excluding com.zaxxer:HikariCP:jar:2.6.1 from the shaded jar.
	[INFO] Excluding org.apache.derby:derby:jar:10.14.1.0 from the shaded jar.
	[INFO] Excluding commons-pool:commons-pool:jar:1.5.4 from the shaded jar.
	[INFO] Excluding commons-dbcp:commons-dbcp:jar:1.4 from the shaded jar.
	[INFO] Including javax.jdo:jdo-api:jar:3.0.1 in the shaded jar.
	[INFO] Excluding javax.transaction:jta:jar:1.1 from the shaded jar.
	[INFO] Excluding co.cask.tephra:tephra-api:jar:0.6.0 from the shaded jar.
	[INFO] Excluding co.cask.tephra:tephra-core:jar:0.6.0 from the shaded jar.
	[INFO] Excluding com.google.inject.extensions:guice-assistedinject:jar:3.0 from the shaded jar.
	[INFO] Excluding it.unimi.dsi:fastutil:jar:6.5.6 from the shaded jar.
	[INFO] Excluding org.apache.twill:twill-common:jar:0.6.0-incubating from the shaded jar.
	[INFO] Excluding org.apache.twill:twill-core:jar:0.6.0-incubating from the shaded jar.
	[INFO] Excluding org.apache.twill:twill-api:jar:0.6.0-incubating from the shaded jar.
	[INFO] Excluding org.apache.twill:twill-discovery-api:jar:0.6.0-incubating from the shaded jar.
	[INFO] Excluding org.apache.twill:twill-discovery-core:jar:0.6.0-incubating from the shaded jar.
	[INFO] Excluding org.apache.twill:twill-zookeeper:jar:0.6.0-incubating from the shaded jar.
	[INFO] Excluding co.cask.tephra:tephra-hbase-compat-1.0:jar:0.6.0 from the shaded jar.
	[INFO] Including org.apache.hive:hive-serde:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Excluding com.google.code.findbugs:jsr305:jar:3.0.0 from the shaded jar.
	[INFO] Excluding org.apache.arrow:arrow-vector:jar:0.10.0 from the shaded jar.
	[INFO] Excluding org.apache.arrow:arrow-format:jar:0.10.0 from the shaded jar.
	[INFO] Excluding org.apache.arrow:arrow-memory:jar:0.10.0 from the shaded jar.
	[INFO] Excluding io.netty:netty-buffer:jar:4.1.17.Final from the shaded jar.
	[INFO] Excluding io.netty:netty-common:jar:4.1.17.Final from the shaded jar.
	[INFO] Excluding com.carrotsearch:hppc:jar:0.7.2 from the shaded jar.
	[INFO] Excluding com.vlkan:flatbuffers:jar:1.2.0-3f79e055 from the shaded jar.
	[INFO] Including org.apache.hive:hive-service-rpc:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.hive:hive-llap-client:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.hive:hive-llap-common:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Excluding org.apache.hive:hive-llap-tez:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.hive:hive-shims:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Including org.apache.hive.shims:hive-shims-common:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.hive.shims:hive-shims-0.23:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-server-resourcemanager:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-server-applicationhistoryservice:jar:3.1.0 from the shaded jar.
	[INFO] Excluding de.ruedigermoeller:fst:jar:2.50 from the shaded jar.
	[INFO] Excluding com.cedarsoftware:java-util:jar:1.9.0 from the shaded jar.
	[INFO] Excluding com.cedarsoftware:json-io:jar:2.5.1 from the shaded jar.
	[INFO] Excluding org.apache.hive.shims:hive-shims-scheduler:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Including org.apache.hive:hive-spark-client:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Excluding io.netty:netty-all:jar:4.1.17.Final from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.module:jackson-module-scala_2.11:jar:2.9.5 from the shaded jar.
	[INFO] Excluding org.scala-lang:scala-reflect:jar:2.11.11 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.module:jackson-module-paranamer:jar:2.9.5 from the shaded jar.
	[INFO] Excluding org.apache.spark:spark-yarn_2.11:jar:2.3.0 from the shaded jar.
	[INFO] Including com.esotericsoftware:kryo-shaded:jar:3.0.3 in the shaded jar.
	[INFO] Including com.esotericsoftware:minlog:jar:1.3.0 in the shaded jar.
	[INFO] Including org.objenesis:objenesis:jar:2.1 in the shaded jar.
	[INFO] Including com.google.protobuf:protobuf-java:jar:2.5.0 in the shaded jar.
	[INFO] Including org.apache.parquet:parquet-hadoop-bundle:jar:1.10.0 in the shaded jar.
	[INFO] Excluding commons-codec:commons-codec:jar:1.7 from the shaded jar.
	[INFO] Excluding commons-io:commons-io:jar:2.4 from the shaded jar.
	[INFO] Including org.apache.commons:commons-lang3:jar:3.2 in the shaded jar.
	[INFO] Including commons-lang:commons-lang:jar:2.6 in the shaded jar.
	[INFO] Including javolution:javolution:jar:5.5.1 in the shaded jar.
	[INFO] Excluding org.apache.logging.log4j:log4j-1.2-api:jar:2.10.0 from the shaded jar.
	[INFO] Excluding org.apache.logging.log4j:log4j-api:jar:2.10.0 from the shaded jar.
	[INFO] Excluding org.apache.logging.log4j:log4j-core:jar:2.10.0 from the shaded jar.
	[INFO] Excluding org.apache.logging.log4j:log4j-slf4j-impl:jar:2.10.0 from the shaded jar.
	[INFO] Excluding org.antlr:antlr-runtime:jar:3.5.2 from the shaded jar.
	[INFO] Excluding org.antlr:ST4:jar:4.0.4 from the shaded jar.
	[INFO] Including org.apache.avro:avro:jar:1.8.2 in the shaded jar.
	[INFO] Including org.codehaus.jackson:jackson-core-asl:jar:1.9.13 in the shaded jar.
	[INFO] Including org.codehaus.jackson:jackson-mapper-asl:jar:1.9.13 in the shaded jar.
	[INFO] Excluding com.thoughtworks.paranamer:paranamer:jar:2.7 from the shaded jar.
	[INFO] Excluding org.xerial.snappy:snappy-java:jar:1.1.4 from the shaded jar.
	[INFO] Excluding org.tukaani:xz:jar:1.5 from the shaded jar.
	[INFO] Including org.apache.avro:avro-mapred:jar:hadoop2:1.8.2 in the shaded jar.
	[INFO] Excluding org.apache.avro:avro-ipc:jar:1.8.2 from the shaded jar.
	[INFO] Excluding org.apache.ant:ant:jar:1.9.1 from the shaded jar.
	[INFO] Excluding org.apache.ant:ant-launcher:jar:1.9.1 from the shaded jar.
	[INFO] Excluding org.apache.commons:commons-compress:jar:1.18 from the shaded jar.
	[INFO] Excluding org.apache.thrift:libfb303:jar:0.9.3 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-common:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-annotations:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.commons:commons-math3:jar:3.1.1 from the shaded jar.
	[INFO] Excluding commons-net:commons-net:jar:3.6 from the shaded jar.
	[INFO] Excluding commons-collections:commons-collections:jar:3.2.2 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-util:jar:9.3.19.v20170502 from the shaded jar.
	[INFO] Excluding javax.servlet.jsp:jsp-api:jar:2.1 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-core:jar:1.19 from the shaded jar.
	[INFO] Excluding javax.ws.rs:jsr311-api:jar:1.1.1 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-json:jar:1.19 from the shaded jar.
	[INFO] Excluding com.sun.xml.bind:jaxb-impl:jar:2.2.3-1 from the shaded jar.
	[INFO] Excluding org.codehaus.jackson:jackson-jaxrs:jar:1.9.2 from the shaded jar.
	[INFO] Excluding org.codehaus.jackson:jackson-xc:jar:1.9.2 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-server:jar:1.19 from the shaded jar.
	[INFO] Excluding log4j:log4j:jar:1.2.17 from the shaded jar.
	[INFO] Excluding commons-beanutils:commons-beanutils:jar:1.9.3 from the shaded jar.
	[INFO] Excluding org.apache.commons:commons-configuration2:jar:2.1.1 from the shaded jar.
	[INFO] Excluding com.google.re2j:re2j:jar:1.1 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-auth:jar:3.1.0 from the shaded jar.
	[INFO] Excluding com.nimbusds:nimbus-jose-jwt:jar:4.41.1 from the shaded jar.
	[INFO] Excluding com.github.stephenc.jcip:jcip-annotations:jar:1.0-1 from the shaded jar.
	[INFO] Excluding net.minidev:json-smart:jar:2.3 from the shaded jar.
	[INFO] Excluding net.minidev:accessors-smart:jar:1.2 from the shaded jar.
	[INFO] Excluding org.ow2.asm:asm:jar:5.0.4 from the shaded jar.
	[INFO] Excluding com.jcraft:jsch:jar:0.1.54 from the shaded jar.
	[INFO] Excluding org.apache.curator:curator-client:jar:2.12.0 from the shaded jar.
	[INFO] Excluding org.apache.curator:curator-recipes:jar:2.12.0 from the shaded jar.
	[INFO] Excluding org.apache.htrace:htrace-core4:jar:4.1.0-incubating from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-simplekdc:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-client:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerby-config:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-core:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerby-pkix:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerby-asn1:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerby-util:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-common:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-crypto:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-util:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:token-provider:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-admin:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-server:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-identity:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerby-xdr:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.codehaus.woodstox:stax2-api:jar:3.1.4 from the shaded jar.
	[INFO] Excluding com.fasterxml.woodstox:woodstox-core:jar:5.0.3 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-archives:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-registry:jar:3.1.0 from the shaded jar.
	[INFO] Excluding commons-daemon:commons-daemon:jar:1.0.13 from the shaded jar.
	[INFO] Excluding dnsjava:dnsjava:jar:2.1.7 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-mapreduce-client-core:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-hdfs-client:jar:3.1.0 from the shaded jar.
	[INFO] Excluding com.squareup.okhttp:okhttp:jar:2.7.5 from the shaded jar.
	[INFO] Excluding com.squareup.okio:okio:jar:1.6.0 from the shaded jar.
	[INFO] Excluding com.google.inject.extensions:guice-servlet:jar:4.0 from the shaded jar.
	[INFO] Excluding io.netty:netty:jar:3.10.5.Final from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-hdfs:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-util-ajax:jar:9.3.19.v20170502 from the shaded jar.
	[INFO] Excluding commons-logging:commons-logging:jar:1.1.3 from the shaded jar.
	[INFO] Excluding org.fusesource.leveldbjni:leveldbjni-all:jar:1.8 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-api:jar:3.1.0 from the shaded jar.
	[INFO] Excluding javax.xml.bind:jaxb-api:jar:2.2.11 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-common:jar:3.1.0 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-client:jar:1.19 from the shaded jar.
	[INFO] Excluding com.google.inject:guice:jar:4.0 from the shaded jar.
	[INFO] Excluding javax.inject:javax.inject:jar:1 from the shaded jar.
	[INFO] Excluding aopalliance:aopalliance:jar:1.0 from the shaded jar.
	[INFO] Excluding com.sun.jersey.contribs:jersey-guice:jar:1.19 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.module:jackson-module-jaxb-annotations:jar:2.9.5 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider:jar:2.9.5 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.jaxrs:jackson-jaxrs-base:jar:2.9.5 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-client:jar:3.1.0 from the shaded jar.
	[INFO] Including org.apache.orc:orc-tools:jar:1.5.3 in the shaded jar.
	[INFO] Excluding com.opencsv:opencsv:jar:3.9 from the shaded jar.
	[INFO] Excluding org.codehaus.jettison:jettison:jar:1.1 from the shaded jar.
	[INFO] Excluding org.threeten:threetenbp:jar:1.3.5 from the shaded jar.
	[INFO] Excluding org.apache.ivy:ivy:jar:2.4.0 from the shaded jar.
	[INFO] Including org.apache.thrift:libthrift:jar:0.9.3 in the shaded jar.
	[INFO] Excluding org.apache.httpcomponents:httpclient:jar:4.5.2 from the shaded jar.
	[INFO] Excluding org.apache.httpcomponents:httpcore:jar:4.4.4 from the shaded jar.
	[INFO] Excluding org.apache.zookeeper:zookeeper:jar:3.4.6 from the shaded jar.
	[INFO] Excluding org.apache.curator:curator-framework:jar:2.12.0 from the shaded jar.
	[INFO] Excluding org.apache.curator:apache-curator:pom:2.12.0 from the shaded jar.
	[INFO] Excluding org.codehaus.groovy:groovy-all:jar:2.4.11 from the shaded jar.
	[INFO] Including org.jodd:jodd-core:jar:3.5.2 in the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.core:jackson-annotations:jar:2.9.5 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.core:jackson-core:jar:2.9.5 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.core:jackson-databind:jar:2.9.5 from the shaded jar.
	[INFO] Excluding org.datanucleus:datanucleus-core:jar:4.1.17 from the shaded jar.
	[INFO] Excluding org.apache.calcite:calcite-core:jar:1.17.0 from the shaded jar.
	[INFO] Excluding org.apache.calcite:calcite-linq4j:jar:1.17.0 from the shaded jar.
	[INFO] Excluding org.apache.commons:commons-dbcp2:jar:2.4.0 from the shaded jar.
	[INFO] Excluding org.apache.commons:commons-pool2:jar:2.5.0 from the shaded jar.
	[INFO] Excluding com.esri.geometry:esri-geometry-api:jar:2.0.0 from the shaded jar.
	[INFO] Excluding com.yahoo.datasketches:sketches-core:jar:0.9.0 from the shaded jar.
	[INFO] Excluding com.yahoo.datasketches:memory:jar:0.9.0 from the shaded jar.
	[INFO] Excluding org.codehaus.janino:janino:jar:2.7.6 from the shaded jar.
	[INFO] Excluding org.codehaus.janino:commons-compiler:jar:2.7.6 from the shaded jar.
	[INFO] Excluding org.apache.calcite:calcite-druid:jar:1.17.0 from the shaded jar.
	[INFO] Excluding org.apache.calcite.avatica:avatica:jar:1.12.0 from the shaded jar.
	[INFO] Including com.google.guava:guava:jar:19.0 in the shaded jar.
	[INFO] Including com.googlecode.javaewah:JavaEWAH:jar:0.3.2 in the shaded jar.
	[INFO] Excluding com.google.code.gson:gson:jar:2.2.4 from the shaded jar.
	[INFO] Including com.tdunning:json:jar:1.8 in the shaded jar.
	[INFO] Excluding stax:stax-api:jar:1.0.1 from the shaded jar.
	[INFO] Including net.sf.opencsv:opencsv:jar:2.3 in the shaded jar.
	[INFO] Including org.apache.hive:hive-standalone-metastore-server:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Excluding org.datanucleus:datanucleus-api-jdo:jar:4.2.4 from the shaded jar.
	[INFO] Excluding org.datanucleus:datanucleus-rdbms:jar:4.1.19 from the shaded jar.
	[INFO] Excluding org.datanucleus:javax.jdo:jar:3.2.0-m3 from the shaded jar.
	[INFO] Excluding javax.transaction:transaction-api:jar:1.1 from the shaded jar.
	[INFO] Excluding sqlline:sqlline:jar:1.3.0 from the shaded jar.
	[INFO] Excluding org.apache.tez:tez-api:jar:0.9.1 from the shaded jar.
	[INFO] Excluding org.apache.commons:commons-collections4:jar:4.1 from the shaded jar.
	[INFO] Excluding org.apache.tez:tez-runtime-library:jar:0.9.1 from the shaded jar.
	[INFO] Excluding org.roaringbitmap:RoaringBitmap:jar:0.4.9 from the shaded jar.
	[INFO] Excluding com.ning:async-http-client:jar:1.8.16 from the shaded jar.
	[INFO] Excluding org.apache.tez:tez-common:jar:0.9.1 from the shaded jar.
	[INFO] Excluding org.apache.tez:tez-runtime-internals:jar:0.9.1 from the shaded jar.
	[INFO] Excluding org.apache.tez:hadoop-shim:jar:0.9.1 from the shaded jar.
	[INFO] Excluding org.apache.tez:tez-mapreduce:jar:0.9.1 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-server-web-proxy:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-server-common:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.geronimo.specs:geronimo-jcache_1.0_spec:jar:1.0-alpha-1 from the shaded jar.
	[INFO] Excluding org.ehcache:ehcache:jar:3.3.1 from the shaded jar.
	[INFO] Excluding com.zaxxer:HikariCP-java7:jar:2.4.12 from the shaded jar.
	[INFO] Excluding com.microsoft.sqlserver:mssql-jdbc:jar:6.2.1.jre7 from the shaded jar.
	[INFO] Excluding org.apache.spark:spark-core_2.11:jar:2.3.0 from the shaded jar.
	[INFO] Excluding com.twitter:chill_2.11:jar:0.8.4 from the shaded jar.
	[INFO] Excluding com.twitter:chill-java:jar:0.8.4 from the shaded jar.
	[INFO] Excluding org.apache.xbean:xbean-asm5-shaded:jar:4.4 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-client:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-mapreduce-client-jobclient:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.spark:spark-launcher_2.11:jar:2.3.0 from the shaded jar.
	[INFO] Excluding org.apache.spark:spark-kvstore_2.11:jar:2.3.0 from the shaded jar.
	[INFO] Excluding org.apache.spark:spark-network-common_2.11:jar:2.3.0 from the shaded jar.
	[INFO] Excluding org.apache.spark:spark-network-shuffle_2.11:jar:2.3.0 from the shaded jar.
	[INFO] Excluding org.apache.spark:spark-unsafe_2.11:jar:2.3.0 from the shaded jar.
	[INFO] Excluding net.java.dev.jets3t:jets3t:jar:0.9.4 from the shaded jar.
	[INFO] Excluding javax.activation:activation:jar:1.1.1 from the shaded jar.
	[INFO] Excluding org.bouncycastle:bcprov-jdk15on:jar:1.52 from the shaded jar.
	[INFO] Excluding com.jamesmurty.utils:java-xmlbuilder:jar:1.1 from the shaded jar.
	[INFO] Excluding net.iharder:base64:jar:2.3.8 from the shaded jar.
	[INFO] Excluding org.slf4j:jul-to-slf4j:jar:1.7.16 from the shaded jar.
	[INFO] Excluding org.slf4j:jcl-over-slf4j:jar:1.7.16 from the shaded jar.
	[INFO] Excluding com.ning:compress-lzf:jar:1.0.3 from the shaded jar.
	[INFO] Excluding org.lz4:lz4-java:jar:1.4.0 from the shaded jar.
	[INFO] Excluding com.github.luben:zstd-jni:jar:1.3.2-2 from the shaded jar.
	[INFO] Excluding org.scala-lang:scala-library:jar:2.11.8 from the shaded jar.
	[INFO] Excluding org.json4s:json4s-jackson_2.11:jar:3.2.11 from the shaded jar.
	[INFO] Excluding org.json4s:json4s-core_2.11:jar:3.2.11 from the shaded jar.
	[INFO] Excluding org.json4s:json4s-ast_2.11:jar:3.2.11 from the shaded jar.
	[INFO] Excluding org.scala-lang:scalap:jar:2.11.0 from the shaded jar.
	[INFO] Excluding org.scala-lang:scala-compiler:jar:2.11.0 from the shaded jar.
	[INFO] Excluding org.scala-lang.modules:scala-xml_2.11:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.scala-lang.modules:scala-parser-combinators_2.11:jar:1.0.1 from the shaded jar.
	[INFO] Excluding com.clearspring.analytics:stream:jar:2.7.0 from the shaded jar.
	[INFO] Excluding io.dropwizard.metrics:metrics-graphite:jar:3.1.5 from the shaded jar.
	[INFO] Excluding oro:oro:jar:2.0.8 from the shaded jar.
	[INFO] Excluding net.razorvine:pyrolite:jar:4.13 from the shaded jar.
	[INFO] Excluding net.sf.py4j:py4j:jar:0.10.6 from the shaded jar.
	[INFO] Excluding org.apache.spark:spark-tags_2.11:jar:2.3.0 from the shaded jar.
	[INFO] Excluding org.apache.commons:commons-crypto:jar:1.0.0 from the shaded jar.
	[INFO] Excluding org.spark-project.spark:unused:jar:1.0.0 from the shaded jar.
	[INFO] Excluding org.slf4j:slf4j-api:jar:1.7.10 from the shaded jar.
	[WARNING] hive-standalone-metastore-server-4.0.0-SNAPSHOT.jar, hive-standalone-metastore-common-4.0.0-SNAPSHOT.jar define 1 overlapping classes: 
	[WARNING]   - org.apache.hadoop.hive.metastore.annotation.package-info
	[WARNING] maven-shade-plugin has detected that some class files are
	[WARNING] present in two or more JARs. When this happens, only one
	[WARNING] single version of the class is copied to the uber jar.
	[WARNING] Usually this is not harmful and you can skip these warnings,
	[WARNING] otherwise try to manually exclude artifacts based on
	[WARNING] mvn dependency:tree -Ddetail=true and the above output.
	[WARNING] See http://maven.apache.org/plugins/maven-shade-plugin/
	[INFO] Replacing original artifact with shaded artifact.
	[INFO] Replacing /Users/xubo/Desktop/xubo/git/hive/ql/target/hive-exec-4.0.0-SNAPSHOT.jar with /Users/xubo/Desktop/xubo/git/hive/ql/target/hive-exec-4.0.0-SNAPSHOT-shaded.jar
	[INFO] Dependency-reduced POM written at: /Users/xubo/Desktop/xubo/git/hive/ql/dependency-reduced-pom.xml
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Llap Server 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hadoop/hadoop-yarn-services-core/3.1.0/hadoop-yarn-services-core-3.1.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-services-core/3.1.0/hadoop-yarn-services-core-3.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-services-core/3.1.0/hadoop-yarn-services-core-3.1.0.pom (8 KB at 9.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hadoop/hadoop-yarn-services/3.1.0/hadoop-yarn-services-3.1.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-services/3.1.0/hadoop-yarn-services-3.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-services/3.1.0/hadoop-yarn-services-3.1.0.pom (2 KB at 3.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hadoop/hadoop-yarn-applications/3.1.0/hadoop-yarn-applications-3.1.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-applications/3.1.0/hadoop-yarn-applications-3.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-applications/3.1.0/hadoop-yarn-applications-3.1.0.pom (2 KB at 4.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/yaml/snakeyaml/1.16/snakeyaml-1.16.pom
	Downloading: https://repo.maven.apache.org/maven2/org/yaml/snakeyaml/1.16/snakeyaml-1.16.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/yaml/snakeyaml/1.16/snakeyaml-1.16.pom (26 KB at 24.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/swagger/swagger-annotations/1.5.4/swagger-annotations-1.5.4.pom
	Downloading: https://repo.maven.apache.org/maven2/io/swagger/swagger-annotations/1.5.4/swagger-annotations-1.5.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/swagger/swagger-annotations/1.5.4/swagger-annotations-1.5.4.pom (7 KB at 12.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/swagger/swagger-project/1.5.4/swagger-project-1.5.4.pom
	Downloading: https://repo.maven.apache.org/maven2/io/swagger/swagger-project/1.5.4/swagger-project-1.5.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/swagger/swagger-project/1.5.4/swagger-project-1.5.4.pom (21 KB at 7.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-server/2.0.0-alpha4/hbase-server-2.0.0-alpha4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-server/2.0.0-alpha4/hbase-server-2.0.0-alpha4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-server/2.0.0-alpha4/hbase-server-2.0.0-alpha4.pom (32 KB at 28.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-http/2.0.0-alpha4/hbase-http-2.0.0-alpha4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-http/2.0.0-alpha4/hbase-http-2.0.0-alpha4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-http/2.0.0-alpha4/hbase-http-2.0.0-alpha4.pom (17 KB at 24.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-util-ajax/9.4.6.v20170531/jetty-util-ajax-9.4.6.v20170531.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-util-ajax/9.4.6.v20170531/jetty-util-ajax-9.4.6.v20170531.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-util-ajax/9.4.6.v20170531/jetty-util-ajax-9.4.6.v20170531.pom (2 KB at 3.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/core/jersey-server/2.25.1/jersey-server-2.25.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-server/2.25.1/jersey-server-2.25.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-server/2.25.1/jersey-server-2.25.1.pom (11 KB at 15.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/project/2.25.1/project-2.25.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/project/2.25.1/project-2.25.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/project/2.25.1/project-2.25.1.pom (86 KB at 52.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/hk2/hk2-bom/2.5.0-b32/hk2-bom-2.5.0-b32.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-bom/2.5.0-b32/hk2-bom-2.5.0-b32.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-bom/2.5.0-b32/hk2-bom-2.5.0-b32.pom (19 KB at 28.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/core/jersey-common/2.25.1/jersey-common-2.25.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-common/2.25.1/jersey-common-2.25.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-common/2.25.1/jersey-common-2.25.1.pom (11 KB at 19.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/bundles/repackaged/jersey-guava/2.25.1/jersey-guava-2.25.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/bundles/repackaged/jersey-guava/2.25.1/jersey-guava-2.25.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/bundles/repackaged/jersey-guava/2.25.1/jersey-guava-2.25.1.pom (14 KB at 20.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/bundles/repackaged/project/2.25.1/project-2.25.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/bundles/repackaged/project/2.25.1/project-2.25.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/bundles/repackaged/project/2.25.1/project-2.25.1.pom (3 KB at 6.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/bundles/project/2.25.1/project-2.25.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/bundles/project/2.25.1/project-2.25.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/bundles/project/2.25.1/project-2.25.1.pom (4 KB at 6.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/hk2/hk2-api/2.5.0-b32/hk2-api-2.5.0-b32.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-api/2.5.0-b32/hk2-api-2.5.0-b32.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-api/2.5.0-b32/hk2-api-2.5.0-b32.pom (5 KB at 9.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/hk2/hk2-parent/2.5.0-b32/hk2-parent-2.5.0-b32.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-parent/2.5.0-b32/hk2-parent-2.5.0-b32.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-parent/2.5.0-b32/hk2-parent-2.5.0-b32.pom (50 KB at 46.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/hk2/hk2-utils/2.5.0-b32/hk2-utils-2.5.0-b32.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-utils/2.5.0-b32/hk2-utils-2.5.0-b32.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-utils/2.5.0-b32/hk2-utils-2.5.0-b32.pom (6 KB at 10.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/hk2/external/aopalliance-repackaged/2.5.0-b32/aopalliance-repackaged-2.5.0-b32.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/hk2/external/aopalliance-repackaged/2.5.0-b32/aopalliance-repackaged-2.5.0-b32.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/hk2/external/aopalliance-repackaged/2.5.0-b32/aopalliance-repackaged-2.5.0-b32.pom (7 KB at 13.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/hk2/external/2.5.0-b32/external-2.5.0-b32.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/hk2/external/2.5.0-b32/external-2.5.0-b32.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/hk2/external/2.5.0-b32/external-2.5.0-b32.pom (3 KB at 5.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/hk2/external/javax.inject/2.5.0-b32/javax.inject-2.5.0-b32.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/hk2/external/javax.inject/2.5.0-b32/javax.inject-2.5.0-b32.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/hk2/external/javax.inject/2.5.0-b32/javax.inject-2.5.0-b32.pom (7 KB at 13.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/hk2/hk2-locator/2.5.0-b32/hk2-locator-2.5.0-b32.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-locator/2.5.0-b32/hk2-locator-2.5.0-b32.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-locator/2.5.0-b32/hk2-locator-2.5.0-b32.pom (8 KB at 13.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/javassist/javassist/3.20.0-GA/javassist-3.20.0-GA.pom
	Downloading: https://repo.maven.apache.org/maven2/org/javassist/javassist/3.20.0-GA/javassist-3.20.0-GA.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/javassist/javassist/3.20.0-GA/javassist-3.20.0-GA.pom (10 KB at 19.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/core/jersey-client/2.25.1/jersey-client-2.25.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-client/2.25.1/jersey-client-2.25.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-client/2.25.1/jersey-client-2.25.1.pom (8 KB at 14.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/media/jersey-media-jaxb/2.25.1/jersey-media-jaxb-2.25.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/media/jersey-media-jaxb/2.25.1/jersey-media-jaxb-2.25.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/media/jersey-media-jaxb/2.25.1/jersey-media-jaxb-2.25.1.pom (7 KB at 12.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/media/project/2.25.1/project-2.25.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/media/project/2.25.1/project-2.25.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/media/project/2.25.1/project-2.25.1.pom (3 KB at 3.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/containers/jersey-container-servlet-core/2.25.1/jersey-container-servlet-core-2.25.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/containers/jersey-container-servlet-core/2.25.1/jersey-container-servlet-core-2.25.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/containers/jersey-container-servlet-core/2.25.1/jersey-container-servlet-core-2.25.1.pom (5 KB at 4.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/containers/project/2.25.1/project-2.25.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/containers/project/2.25.1/project-2.25.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/containers/project/2.25.1/project-2.25.1.pom (4 KB at 8.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-procedure/2.0.0-alpha4/hbase-procedure-2.0.0-alpha4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-procedure/2.0.0-alpha4/hbase-procedure-2.0.0-alpha4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-procedure/2.0.0-alpha4/hbase-procedure-2.0.0-alpha4.pom (6 KB at 10.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-replication/2.0.0-alpha4/hbase-replication-2.0.0-alpha4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-replication/2.0.0-alpha4/hbase-replication-2.0.0-alpha4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-replication/2.0.0-alpha4/hbase-replication-2.0.0-alpha4.pom (8 KB at 16.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-prefix-tree/2.0.0-alpha4/hbase-prefix-tree-2.0.0-alpha4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-prefix-tree/2.0.0-alpha4/hbase-prefix-tree-2.0.0-alpha4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-prefix-tree/2.0.0-alpha4/hbase-prefix-tree-2.0.0-alpha4.pom (7 KB at 10.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/jamon/jamon-runtime/2.3.1/jamon-runtime-2.3.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/jamon/jamon-runtime/2.3.1/jamon-runtime-2.3.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/jamon/jamon-runtime/2.3.1/jamon-runtime-2.3.1.pom (2 KB at 3.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/jamon/jamon-project/1.0.2/jamon-project-1.0.2.pom
	Downloading: https://repo.maven.apache.org/maven2/org/jamon/jamon-project/1.0.2/jamon-project-1.0.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/jamon/jamon-project/1.0.2/jamon-project-1.0.2.pom (9 KB at 18.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/lmax/disruptor/3.3.6/disruptor-3.3.6.pom
	Downloading: https://repo.maven.apache.org/maven2/com/lmax/disruptor/3.3.6/disruptor-3.3.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/lmax/disruptor/3.3.6/disruptor-3.3.6.pom (2 KB at 3.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hadoop/hadoop-distcp/2.7.1/hadoop-distcp-2.7.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-distcp/2.7.1/hadoop-distcp-2.7.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-distcp/2.7.1/hadoop-distcp-2.7.1.pom (7 KB at 13.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-mapreduce/2.0.0-alpha4/hbase-mapreduce-2.0.0-alpha4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-mapreduce/2.0.0-alpha4/hbase-mapreduce-2.0.0-alpha4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-mapreduce/2.0.0-alpha4/hbase-mapreduce-2.0.0-alpha4.pom (16 KB at 21.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hadoop/hadoop-yarn-services-core/3.1.0/hadoop-yarn-services-core-3.1.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/yaml/snakeyaml/1.16/snakeyaml-1.16.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/swagger/swagger-annotations/1.5.4/swagger-annotations-1.5.4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-server/2.0.0-alpha4/hbase-server-2.0.0-alpha4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-http/2.0.0-alpha4/hbase-http-2.0.0-alpha4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/core/jersey-server/2.25.1/jersey-server-2.25.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/core/jersey-common/2.25.1/jersey-common-2.25.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/bundles/repackaged/jersey-guava/2.25.1/jersey-guava-2.25.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/core/jersey-client/2.25.1/jersey-client-2.25.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/media/jersey-media-jaxb/2.25.1/jersey-media-jaxb-2.25.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/hk2/hk2-api/2.5.0-b32/hk2-api-2.5.0-b32.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/hk2/hk2-utils/2.5.0-b32/hk2-utils-2.5.0-b32.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/hk2/external/aopalliance-repackaged/2.5.0-b32/aopalliance-repackaged-2.5.0-b32.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/hk2/external/javax.inject/2.5.0-b32/javax.inject-2.5.0-b32.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/hk2/hk2-locator/2.5.0-b32/hk2-locator-2.5.0-b32.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/javassist/javassist/3.20.0-GA/javassist-3.20.0-GA.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/jersey/containers/jersey-container-servlet-core/2.25.1/jersey-container-servlet-core-2.25.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-procedure/2.0.0-alpha4/hbase-procedure-2.0.0-alpha4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-common/2.0.0-alpha4/hbase-common-2.0.0-alpha4-tests.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-replication/2.0.0-alpha4/hbase-replication-2.0.0-alpha4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-prefix-tree/2.0.0-alpha4/hbase-prefix-tree-2.0.0-alpha4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/jamon/jamon-runtime/2.3.1/jamon-runtime-2.3.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/lmax/disruptor/3.3.6/disruptor-3.3.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hadoop/hadoop-distcp/2.7.1/hadoop-distcp-2.7.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-mapreduce/2.0.0-alpha4/hbase-mapreduce-2.0.0-alpha4.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-services-core/3.1.0/hadoop-yarn-services-core-3.1.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/yaml/snakeyaml/1.16/snakeyaml-1.16.jar
	Downloading: https://repo.maven.apache.org/maven2/io/swagger/swagger-annotations/1.5.4/swagger-annotations-1.5.4.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-server/2.0.0-alpha4/hbase-server-2.0.0-alpha4.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-http/2.0.0-alpha4/hbase-http-2.0.0-alpha4.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-http/2.0.0-alpha4/hbase-http-2.0.0-alpha4.jar (67 KB at 10.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-server/2.25.1/jersey-server-2.25.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/swagger/swagger-annotations/1.5.4/swagger-annotations-1.5.4.jar (16 KB at 1.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-common/2.25.1/jersey-common-2.25.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-services-core/3.1.0/hadoop-yarn-services-core-3.1.0.jar (412 KB at 17.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/bundles/repackaged/jersey-guava/2.25.1/jersey-guava-2.25.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/yaml/snakeyaml/1.16/snakeyaml-1.16.jar (264 KB at 7.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-client/2.25.1/jersey-client-2.25.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-client/2.25.1/jersey-client-2.25.1.jar (166 KB at 3.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/media/jersey-media-jaxb/2.25.1/jersey-media-jaxb-2.25.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-common/2.25.1/jersey-common-2.25.1.jar (700 KB at 12.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-api/2.5.0-b32/hk2-api-2.5.0-b32.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/media/jersey-media-jaxb/2.25.1/jersey-media-jaxb-2.25.1.jar (72 KB at 1.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-utils/2.5.0-b32/hk2-utils-2.5.0-b32.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-server/2.25.1/jersey-server-2.25.1.jar (919 KB at 14.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/hk2/external/aopalliance-repackaged/2.5.0-b32/aopalliance-repackaged-2.5.0-b32.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/hk2/external/aopalliance-repackaged/2.5.0-b32/aopalliance-repackaged-2.5.0-b32.jar (15 KB at 0.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/hk2/external/javax.inject/2.5.0-b32/javax.inject-2.5.0-b32.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/hk2/external/javax.inject/2.5.0-b32/javax.inject-2.5.0-b32.jar (6 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-locator/2.5.0-b32/hk2-locator-2.5.0-b32.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-utils/2.5.0-b32/hk2-utils-2.5.0-b32.jar (132 KB at 1.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/javassist/javassist/3.20.0-GA/javassist-3.20.0-GA.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-locator/2.5.0-b32/hk2-locator-2.5.0-b32.jar (183 KB at 2.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/jersey/containers/jersey-container-servlet-core/2.25.1/jersey-container-servlet-core-2.25.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/bundles/repackaged/jersey-guava/2.25.1/jersey-guava-2.25.1.jar (949 KB at 12.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-procedure/2.0.0-alpha4/hbase-procedure-2.0.0-alpha4.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/jersey/containers/jersey-container-servlet-core/2.25.1/jersey-container-servlet-core-2.25.1.jar (65 KB at 0.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-common/2.0.0-alpha4/hbase-common-2.0.0-alpha4-tests.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-api/2.5.0-b32/hk2-api-2.5.0-b32.jar (182 KB at 2.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-replication/2.0.0-alpha4/hbase-replication-2.0.0-alpha4.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-replication/2.0.0-alpha4/hbase-replication-2.0.0-alpha4.jar (71 KB at 0.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-prefix-tree/2.0.0-alpha4/hbase-prefix-tree-2.0.0-alpha4.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-prefix-tree/2.0.0-alpha4/hbase-prefix-tree-2.0.0-alpha4.jar (103 KB at 1.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/jamon/jamon-runtime/2.3.1/jamon-runtime-2.3.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-procedure/2.0.0-alpha4/hbase-procedure-2.0.0-alpha4.jar (179 KB at 1.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/lmax/disruptor/3.3.6/disruptor-3.3.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/jamon/jamon-runtime/2.3.1/jamon-runtime-2.3.1.jar (21 KB at 0.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-distcp/2.7.1/hadoop-distcp-2.7.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-common/2.0.0-alpha4/hbase-common-2.0.0-alpha4-tests.jar (287 KB at 3.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-mapreduce/2.0.0-alpha4/hbase-mapreduce-2.0.0-alpha4.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/lmax/disruptor/3.3.6/disruptor-3.3.6.jar (83 KB at 0.8 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-distcp/2.7.1/hadoop-distcp-2.7.1.jar (101 KB at 1.0 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/javassist/javassist/3.20.0-GA/javassist-3.20.0-GA.jar (733 KB at 6.4 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-mapreduce/2.0.0-alpha4/hbase-mapreduce-2.0.0-alpha4.jar (393 KB at 3.4 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-server/2.0.0-alpha4/hbase-server-2.0.0-alpha4.jar (4462 KB at 21.4 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-llap-server ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/llap-server (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-llap-server ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-llap-server ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-llap-server ---
	[INFO] 
	[INFO] --- build-helper-maven-plugin:1.8:add-source (add-source) @ hive-llap-server ---
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/llap-server/src/gen/protobuf/gen-java added.
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/llap-server/src/gen/thrift/gen-javabean added.
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-llap-server ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-llap-server ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 19 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-llap-server ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-llap-server ---
	[INFO] Compiling 119 source files to /Users/xubo/Desktop/xubo/git/hive/llap-server/target/classes
	Processing annotations
	Annotations processed
	Processing annotations
	No elements to process
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/llap-server/src/java/org/apache/hadoop/hive/llap/cache/SimpleAllocator.java:[29,16] sun.misc.Cleaner is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/llap-server/src/java/org/apache/hadoop/hive/llap/cache/SimpleAllocator.java:[29,16] sun.misc.Cleaner is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/llap-server/src/java/org/apache/hadoop/hive/llap/cache/SimpleAllocator.java:[29,16] sun.misc.Cleaner is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/llap-server/src/java/org/apache/hadoop/hive/llap/cache/SimpleAllocator.java:[85,9] sun.misc.Cleaner is internal proprietary API and may be removed in a future release
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-server/src/java/org/apache/hadoop/hive/llap/daemon/impl/LlapDaemon.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-server/src/java/org/apache/hadoop/hive/llap/daemon/impl/LlapDaemon.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-server/src/java/org/apache/hadoop/hive/llap/daemon/impl/TaskRunnerCallable.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-server/src/java/org/apache/hadoop/hive/llap/daemon/impl/TaskRunnerCallable.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-llap-server ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 4 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-llap-server ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/llap-server/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/llap-server/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/llap-server/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/llap-server/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-llap-server ---
	[INFO] Compiling 22 source files to /Users/xubo/Desktop/xubo/git/hive/llap-server/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-server/src/test/org/apache/hadoop/hive/llap/daemon/impl/TestTaskExecutorService.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-server/src/test/org/apache/hadoop/hive/llap/daemon/impl/TestTaskExecutorService.java: Recompile with -Xlint:deprecation for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-llap-server ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-llap-server ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/llap-server/target/hive-llap-server-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-llap-server ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:test-jar (default) @ hive-llap-server ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/llap-server/target/hive-llap-server-4.0.0-SNAPSHOT-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Service 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: https://repo.maven.apache.org/maven2/org/jamon/jamon-maven-plugin/2.3.4/jamon-maven-plugin-2.3.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/jamon/jamon-maven-plugin/2.3.4/jamon-maven-plugin-2.3.4.pom (5 KB at 9.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/jamon/jamon-java-parent/2.3/jamon-java-parent-2.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/jamon/jamon-java-parent/2.3/jamon-java-parent-2.3.pom (5 KB at 8.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/jamon/jamon-parent/2.3.1/jamon-parent-2.3.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/jamon/jamon-parent/2.3.1/jamon-parent-2.3.1.pom (8 KB at 15.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/jamon/jamon-maven-plugin/2.3.4/jamon-maven-plugin-2.3.4.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/jamon/jamon-maven-plugin/2.3.4/jamon-maven-plugin-2.3.4.jar (9 KB at 13.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-runner/9.3.25.v20180904/jetty-runner-9.3.25.v20180904.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-runner/9.3.25.v20180904/jetty-runner-9.3.25.v20180904.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-runner/9.3.25.v20180904/jetty-runner-9.3.25.v20180904.pom (4 KB at 6.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-plus/9.3.25.v20180904/jetty-plus-9.3.25.v20180904.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-plus/9.3.25.v20180904/jetty-plus-9.3.25.v20180904.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-plus/9.3.25.v20180904/jetty-plus-9.3.25.v20180904.pom (2 KB at 4.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-jndi/9.3.25.v20180904/jetty-jndi-9.3.25.v20180904.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-jndi/9.3.25.v20180904/jetty-jndi-9.3.25.v20180904.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-jndi/9.3.25.v20180904/jetty-jndi-9.3.25.v20180904.pom (2 KB at 3.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-annotations/9.3.25.v20180904/jetty-annotations-9.3.25.v20180904.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-annotations/9.3.25.v20180904/jetty-annotations-9.3.25.v20180904.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-annotations/9.3.25.v20180904/jetty-annotations-9.3.25.v20180904.pom (3 KB at 5.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-jaas/9.3.25.v20180904/jetty-jaas-9.3.25.v20180904.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-jaas/9.3.25.v20180904/jetty-jaas-9.3.25.v20180904.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-jaas/9.3.25.v20180904/jetty-jaas-9.3.25.v20180904.pom (2 KB at 2.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/websocket/websocket-server/9.3.25.v20180904/websocket-server-9.3.25.v20180904.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-server/9.3.25.v20180904/websocket-server-9.3.25.v20180904.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-server/9.3.25.v20180904/websocket-server-9.3.25.v20180904.pom (4 KB at 7.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/websocket/websocket-parent/9.3.25.v20180904/websocket-parent-9.3.25.v20180904.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-parent/9.3.25.v20180904/websocket-parent-9.3.25.v20180904.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-parent/9.3.25.v20180904/websocket-parent-9.3.25.v20180904.pom (3 KB at 4.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/websocket/websocket-common/9.3.25.v20180904/websocket-common-9.3.25.v20180904.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-common/9.3.25.v20180904/websocket-common-9.3.25.v20180904.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-common/9.3.25.v20180904/websocket-common-9.3.25.v20180904.pom (3 KB at 5.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/websocket/websocket-api/9.3.25.v20180904/websocket-api-9.3.25.v20180904.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-api/9.3.25.v20180904/websocket-api-9.3.25.v20180904.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-api/9.3.25.v20180904/websocket-api-9.3.25.v20180904.pom (3 KB at 4.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/websocket/websocket-client/9.3.25.v20180904/websocket-client-9.3.25.v20180904.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-client/9.3.25.v20180904/websocket-client-9.3.25.v20180904.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-client/9.3.25.v20180904/websocket-client-9.3.25.v20180904.pom (5 KB at 9.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/websocket/websocket-servlet/9.3.25.v20180904/websocket-servlet-9.3.25.v20180904.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-servlet/9.3.25.v20180904/websocket-servlet-9.3.25.v20180904.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-servlet/9.3.25.v20180904/websocket-servlet-9.3.25.v20180904.pom (3 KB at 4.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/apache-jsp/9.3.25.v20180904/apache-jsp-9.3.25.v20180904.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/apache-jsp/9.3.25.v20180904/apache-jsp-9.3.25.v20180904.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/apache-jsp/9.3.25.v20180904/apache-jsp-9.3.25.v20180904.pom (5 KB at 7.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/toolchain/jetty-schemas/3.1/jetty-schemas-3.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/toolchain/jetty-schemas/3.1/jetty-schemas-3.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/toolchain/jetty-schemas/3.1/jetty-schemas-3.1.pom (4 KB at 6.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jdt/core/compiler/ecj/4.4.2/ecj-4.4.2.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jdt/core/compiler/ecj/4.4.2/ecj-4.4.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jdt/core/compiler/ecj/4.4.2/ecj-4.4.2.pom (3 KB at 4.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/apache-jstl/9.3.25.v20180904/apache-jstl-9.3.25.v20180904.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/apache-jstl/9.3.25.v20180904/apache-jstl-9.3.25.v20180904.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/apache-jstl/9.3.25.v20180904/apache-jstl-9.3.25.v20180904.pom (3 KB at 4.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/taglibs/taglibs-standard-spec/1.2.5/taglibs-standard-spec-1.2.5.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/taglibs/taglibs-standard-spec/1.2.5/taglibs-standard-spec-1.2.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/taglibs/taglibs-standard-spec/1.2.5/taglibs-standard-spec-1.2.5.pom (6 KB at 9.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/taglibs/taglibs-standard/1.2.5/taglibs-standard-1.2.5.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/taglibs/taglibs-standard/1.2.5/taglibs-standard-1.2.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/taglibs/taglibs-standard/1.2.5/taglibs-standard-1.2.5.pom (5 KB at 7.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/taglibs/taglibs-parent/3/taglibs-parent-3.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/taglibs/taglibs-parent/3/taglibs-parent-3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/taglibs/taglibs-parent/3/taglibs-parent-3.pom (8 KB at 14.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.pom (7 KB at 12.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/client/ldap/ldap-client-api/0.1/ldap-client-api-0.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/client/ldap/ldap-client-api/0.1/ldap-client-api-0.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/client/ldap/ldap-client-api/0.1/ldap-client-api-0.1.pom (3 KB at 5.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/client/ldap/ldap-client/0.1/ldap-client-0.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/client/ldap/ldap-client/0.1/ldap-client-0.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/client/ldap/ldap-client/0.1/ldap-client-0.1.pom (6 KB at 11.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/project/project/17/project-17.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/project/project/17/project-17.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/project/project/17/project-17.pom (29 KB at 24.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldap/0.9.18/shared-ldap-0.9.18.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap/0.9.18/shared-ldap-0.9.18.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap/0.9.18/shared-ldap-0.9.18.pom (4 KB at 5.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-parent/0.9.18/shared-parent-0.9.18.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-parent/0.9.18/shared-parent-0.9.18.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-parent/0.9.18/shared-parent-0.9.18.pom (10 KB at 13.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-asn1/0.9.18/shared-asn1-0.9.18.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-asn1/0.9.18/shared-asn1-0.9.18.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-asn1/0.9.18/shared-asn1-0.9.18.pom (2 KB at 3.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-i18n/0.9.18/shared-i18n-0.9.18.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-i18n/0.9.18/shared-i18n-0.9.18.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-i18n/0.9.18/shared-i18n-0.9.18.pom (2 KB at 3.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldap-constants/0.9.18/shared-ldap-constants-0.9.18.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-constants/0.9.18/shared-ldap-constants-0.9.18.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-constants/0.9.18/shared-ldap-constants-0.9.18.pom (2 KB at 3.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-cursor/0.9.18/shared-cursor-0.9.18.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-cursor/0.9.18/shared-cursor-0.9.18.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-cursor/0.9.18/shared-cursor-0.9.18.pom (2 KB at 3.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldap-schema/0.9.18/shared-ldap-schema-0.9.18.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-schema/0.9.18/shared-ldap-schema-0.9.18.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-schema/0.9.18/shared-ldap-schema-0.9.18.pom (3 KB at 5.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldif/0.9.18/shared-ldif-0.9.18.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldif/0.9.18/shared-ldif-0.9.18.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldif/0.9.18/shared-ldif-0.9.18.pom (4 KB at 6.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldap-schema-manager/0.9.18/shared-ldap-schema-manager-0.9.18.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-schema-manager/0.9.18/shared-ldap-schema-manager-0.9.18.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-schema-manager/0.9.18/shared-ldap-schema-manager-0.9.18.pom (3 KB at 4.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldap-schema-loader/0.9.18/shared-ldap-schema-loader-0.9.18.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-schema-loader/0.9.18/shared-ldap-schema-loader-0.9.18.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-schema-loader/0.9.18/shared-ldap-schema-loader-0.9.18.pom (3 KB at 5.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/mina/mina-core/2.0.0-RC1/mina-core-2.0.0-RC1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/mina/mina-core/2.0.0-RC1/mina-core-2.0.0-RC1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/mina/mina-core/2.0.0-RC1/mina-core-2.0.0-RC1.pom (2 KB at 3.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/mina/mina-parent/2.0.0-RC1/mina-parent-2.0.0-RC1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/mina/mina-parent/2.0.0-RC1/mina-parent-2.0.0-RC1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/mina/mina-parent/2.0.0-RC1/mina-parent-2.0.0-RC1.pom (10 KB at 11.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/mina/build/2.0.0-RC1/build-2.0.0-RC1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/mina/build/2.0.0-RC1/build-2.0.0-RC1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/mina/build/2.0.0-RC1/build-2.0.0-RC1.pom (8 KB at 11.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-server-integ/1.5.6/apacheds-server-integ-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-server-integ/1.5.6/apacheds-server-integ-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-server-integ/1.5.6/apacheds-server-integ-1.5.6.pom (4 KB at 7.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-parent/1.5.6/apacheds-parent-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-parent/1.5.6/apacheds-parent-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-parent/1.5.6/apacheds-parent-1.5.6.pom (21 KB at 22.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-interceptor-kerberos/1.5.6/apacheds-interceptor-kerberos-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-interceptor-kerberos/1.5.6/apacheds-interceptor-kerberos-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-interceptor-kerberos/1.5.6/apacheds-interceptor-kerberos-1.5.6.pom (3 KB at 6.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-i18n/1.5.6/apacheds-i18n-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-i18n/1.5.6/apacheds-i18n-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-i18n/1.5.6/apacheds-i18n-1.5.6.pom (2 KB at 3.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldap-jndi/0.9.18/shared-ldap-jndi-0.9.18.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-jndi/0.9.18/shared-ldap-jndi-0.9.18.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-jndi/0.9.18/shared-ldap-jndi-0.9.18.pom (2 KB at 3.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-asn1-codec/0.9.18/shared-asn1-codec-0.9.18.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-asn1-codec/0.9.18/shared-asn1-codec-0.9.18.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-asn1-codec/0.9.18/shared-asn1-codec-0.9.18.pom (2 KB at 4.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldap-converter/0.9.18/shared-ldap-converter-0.9.18.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-converter/0.9.18/shared-ldap-converter-0.9.18.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-converter/0.9.18/shared-ldap-converter-0.9.18.pom (4 KB at 6.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldap-schema-dao/0.9.18/shared-ldap-schema-dao-0.9.18.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-schema-dao/0.9.18/shared-ldap-schema-dao-0.9.18.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-schema-dao/0.9.18/shared-ldap-schema-dao-0.9.18.pom (2 KB at 4.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-dsml-parser/0.9.18/shared-dsml-parser-0.9.18.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-dsml-parser/0.9.18/shared-dsml-parser-0.9.18.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-dsml-parser/0.9.18/shared-dsml-parser-0.9.18.pom (3 KB at 4.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/xpp3/xpp3/1.1.4c/xpp3-1.1.4c.pom
	Downloading: https://repo.maven.apache.org/maven2/xpp3/xpp3/1.1.4c/xpp3-1.1.4c.pom
	Downloaded: https://repo.maven.apache.org/maven2/xpp3/xpp3/1.1.4c/xpp3-1.1.4c.pom (3 KB at 4.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core/1.5.6/apacheds-core-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core/1.5.6/apacheds-core-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core/1.5.6/apacheds-core-1.5.6.pom (4 KB at 6.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core-api/1.5.6/apacheds-core-api-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-api/1.5.6/apacheds-core-api-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-api/1.5.6/apacheds-core-api-1.5.6.pom (3 KB at 5.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core-entry/1.5.6/apacheds-core-entry-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-entry/1.5.6/apacheds-core-entry-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-entry/1.5.6/apacheds-core-entry-1.5.6.pom (2 KB at 3.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core-constants/1.5.6/apacheds-core-constants-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-constants/1.5.6/apacheds-core-constants-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-constants/1.5.6/apacheds-core-constants-1.5.6.pom (2 KB at 2.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-utils/1.5.6/apacheds-utils-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-utils/1.5.6/apacheds-utils-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-utils/1.5.6/apacheds-utils-1.5.6.pom (2 KB at 3.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/bouncycastle/bcprov-jdk15/140/bcprov-jdk15-140.pom
	Downloading: https://repo.maven.apache.org/maven2/bouncycastle/bcprov-jdk15/140/bcprov-jdk15-140.pom
	Downloaded: https://repo.maven.apache.org/maven2/bouncycastle/bcprov-jdk15/140/bcprov-jdk15-140.pom (2 KB at 2.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-kerberos-shared/1.5.6/apacheds-kerberos-shared-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-kerberos-shared/1.5.6/apacheds-kerberos-shared-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-kerberos-shared/1.5.6/apacheds-kerberos-shared-1.5.6.pom (2 KB at 4.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core-jndi/1.5.6/apacheds-core-jndi-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-jndi/1.5.6/apacheds-core-jndi-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-jndi/1.5.6/apacheds-core-jndi-1.5.6.pom (4 KB at 6.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-protocol-shared/1.5.6/apacheds-protocol-shared-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-protocol-shared/1.5.6/apacheds-protocol-shared-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-protocol-shared/1.5.6/apacheds-protocol-shared-1.5.6.pom (3 KB at 5.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core-integ/1.5.6/apacheds-core-integ-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-integ/1.5.6/apacheds-core-integ-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-integ/1.5.6/apacheds-core-integ-1.5.6.pom (5 KB at 7.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-test-framework/1.5.6/apacheds-test-framework-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-test-framework/1.5.6/apacheds-test-framework-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-test-framework/1.5.6/apacheds-test-framework-1.5.6.pom (2 KB at 2.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-server-annotations/1.5.6/apacheds-server-annotations-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-server-annotations/1.5.6/apacheds-server-annotations-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-server-annotations/1.5.6/apacheds-server-annotations-1.5.6.pom (3 KB at 4.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core-annotations/1.5.6/apacheds-core-annotations-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-annotations/1.5.6/apacheds-core-annotations-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-annotations/1.5.6/apacheds-core-annotations-1.5.6.pom (2 KB at 3.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-jdbm-partition/1.5.6/apacheds-jdbm-partition-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-jdbm-partition/1.5.6/apacheds-jdbm-partition-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-jdbm-partition/1.5.6/apacheds-jdbm-partition-1.5.6.pom (3 KB at 4.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-jdbm-store/1.5.6/apacheds-jdbm-store-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-jdbm-store/1.5.6/apacheds-jdbm-store-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-jdbm-store/1.5.6/apacheds-jdbm-store-1.5.6.pom (4 KB at 5.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-jdbm/1.5.6/apacheds-jdbm-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-jdbm/1.5.6/apacheds-jdbm-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-jdbm/1.5.6/apacheds-jdbm-1.5.6.pom (2 KB at 3.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core-avl/1.5.6/apacheds-core-avl-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-avl/1.5.6/apacheds-core-avl-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-avl/1.5.6/apacheds-core-avl-1.5.6.pom (2 KB at 3.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-xdbm-base/1.5.6/apacheds-xdbm-base-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-xdbm-base/1.5.6/apacheds-xdbm-base-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-xdbm-base/1.5.6/apacheds-xdbm-base-1.5.6.pom (2 KB at 3.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-xdbm-search/1.5.6/apacheds-xdbm-search-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-xdbm-search/1.5.6/apacheds-xdbm-search-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-xdbm-search/1.5.6/apacheds-xdbm-search-1.5.6.pom (3 KB at 4.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-ldif-partition/1.5.6/apacheds-ldif-partition-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-ldif-partition/1.5.6/apacheds-ldif-partition-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-ldif-partition/1.5.6/apacheds-ldif-partition-1.5.6.pom (3 KB at 5.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-avl-partition/1.5.6/apacheds-avl-partition-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-avl-partition/1.5.6/apacheds-avl-partition-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-avl-partition/1.5.6/apacheds-avl-partition-1.5.6.pom (3 KB at 5.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core-mock/1.5.6/apacheds-core-mock-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-mock/1.5.6/apacheds-core-mock-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-mock/1.5.6/apacheds-core-mock-1.5.6.pom (2 KB at 3.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-protocol-ldap/1.5.6/apacheds-protocol-ldap-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-protocol-ldap/1.5.6/apacheds-protocol-ldap-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-protocol-ldap/1.5.6/apacheds-protocol-ldap-1.5.6.pom (3 KB at 5.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-xdbm-tools/1.5.6/apacheds-xdbm-tools-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-xdbm-tools/1.5.6/apacheds-xdbm-tools-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-xdbm-tools/1.5.6/apacheds-xdbm-tools-1.5.6.pom (3 KB at 5.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-protocol-kerberos/1.5.6/apacheds-protocol-kerberos-1.5.6.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-protocol-kerberos/1.5.6/apacheds-protocol-kerberos-1.5.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-protocol-kerberos/1.5.6/apacheds-protocol-kerberos-1.5.6.pom (3 KB at 5.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/ldapsdk/ldapsdk/4.1/ldapsdk-4.1.pom
	Downloading: https://repo.maven.apache.org/maven2/ldapsdk/ldapsdk/4.1/ldapsdk-4.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/ldapsdk/ldapsdk/4.1/ldapsdk-4.1.pom (146 B at 0.3 KB/sec)
	Downloading: https://repository.apache.org/snapshots/org/apache/directory/client/ldap/ldap-client-api/0.1-SNAPSHOT/maven-metadata.xml
	Downloading: https://repository.apache.org/snapshots/org/apache/directory/client/ldap/ldap-client-api/0.1-SNAPSHOT/ldap-client-api-0.1-SNAPSHOT.pom
	[WARNING] The POM for org.apache.directory.client.ldap:ldap-client-api:jar:0.1-SNAPSHOT is missing, no dependency information available
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-runner/9.3.25.v20180904/jetty-runner-9.3.25.v20180904.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-plus/9.3.25.v20180904/jetty-plus-9.3.25.v20180904.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-annotations/9.3.25.v20180904/jetty-annotations-9.3.25.v20180904.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-jaas/9.3.25.v20180904/jetty-jaas-9.3.25.v20180904.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/websocket/websocket-server/9.3.25.v20180904/websocket-server-9.3.25.v20180904.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/websocket/websocket-common/9.3.25.v20180904/websocket-common-9.3.25.v20180904.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/websocket/websocket-api/9.3.25.v20180904/websocket-api-9.3.25.v20180904.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/websocket/websocket-client/9.3.25.v20180904/websocket-client-9.3.25.v20180904.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/websocket/websocket-servlet/9.3.25.v20180904/websocket-servlet-9.3.25.v20180904.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-jndi/9.3.25.v20180904/jetty-jndi-9.3.25.v20180904.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/apache-jsp/9.3.25.v20180904/apache-jsp-9.3.25.v20180904.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/toolchain/jetty-schemas/3.1/jetty-schemas-3.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jdt/core/compiler/ecj/4.4.2/ecj-4.4.2.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/apache-jstl/9.3.25.v20180904/apache-jstl-9.3.25.v20180904.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/taglibs/taglibs-standard-spec/1.2.5/taglibs-standard-spec-1.2.5.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/client/ldap/ldap-client-api/0.1/ldap-client-api-0.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldap/0.9.18/shared-ldap-0.9.18.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-i18n/0.9.18/shared-i18n-0.9.18.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-cursor/0.9.18/shared-cursor-0.9.18.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldap-schema/0.9.18/shared-ldap-schema-0.9.18.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldap-schema-manager/0.9.18/shared-ldap-schema-manager-0.9.18.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldap-schema-loader/0.9.18/shared-ldap-schema-loader-0.9.18.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/mina/mina-core/2.0.0-RC1/mina-core-2.0.0-RC1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-server-integ/1.5.6/apacheds-server-integ-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-interceptor-kerberos/1.5.6/apacheds-interceptor-kerberos-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core/1.5.6/apacheds-core-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core-api/1.5.6/apacheds-core-api-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core-entry/1.5.6/apacheds-core-entry-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core-constants/1.5.6/apacheds-core-constants-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-utils/1.5.6/apacheds-utils-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/bouncycastle/bcprov-jdk15/140/bcprov-jdk15-140.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-kerberos-shared/1.5.6/apacheds-kerberos-shared-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core-jndi/1.5.6/apacheds-core-jndi-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-protocol-shared/1.5.6/apacheds-protocol-shared-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core-integ/1.5.6/apacheds-core-integ-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/ldapsdk/ldapsdk/4.1/ldapsdk-4.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldap-jndi/0.9.18/shared-ldap-jndi-0.9.18.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-asn1-codec/0.9.18/shared-asn1-codec-0.9.18.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-asn1/0.9.18/shared-asn1-0.9.18.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldap-constants/0.9.18/shared-ldap-constants-0.9.18.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldap-converter/0.9.18/shared-ldap-converter-0.9.18.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldap-schema-dao/0.9.18/shared-ldap-schema-dao-0.9.18.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-ldif/0.9.18/shared-ldif-0.9.18.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/shared/shared-dsml-parser/0.9.18/shared-dsml-parser-0.9.18.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/xpp3/xpp3/1.1.4c/xpp3-1.1.4c.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-test-framework/1.5.6/apacheds-test-framework-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-i18n/1.5.6/apacheds-i18n-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-server-annotations/1.5.6/apacheds-server-annotations-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core-annotations/1.5.6/apacheds-core-annotations-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-jdbm-partition/1.5.6/apacheds-jdbm-partition-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-jdbm-store/1.5.6/apacheds-jdbm-store-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-jdbm/1.5.6/apacheds-jdbm-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core-avl/1.5.6/apacheds-core-avl-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-xdbm-search/1.5.6/apacheds-xdbm-search-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-ldif-partition/1.5.6/apacheds-ldif-partition-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-avl-partition/1.5.6/apacheds-avl-partition-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-core-mock/1.5.6/apacheds-core-mock-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-protocol-ldap/1.5.6/apacheds-protocol-ldap-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-xdbm-tools/1.5.6/apacheds-xdbm-tools-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-xdbm-base/1.5.6/apacheds-xdbm-base-1.5.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/directory/server/apacheds-protocol-kerberos/1.5.6/apacheds-protocol-kerberos-1.5.6.jar
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-runner/9.3.25.v20180904/jetty-runner-9.3.25.v20180904.jar
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-plus/9.3.25.v20180904/jetty-plus-9.3.25.v20180904.jar
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-annotations/9.3.25.v20180904/jetty-annotations-9.3.25.v20180904.jar
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-jaas/9.3.25.v20180904/jetty-jaas-9.3.25.v20180904.jar
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-server/9.3.25.v20180904/websocket-server-9.3.25.v20180904.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-jaas/9.3.25.v20180904/jetty-jaas-9.3.25.v20180904.jar (40 KB at 9.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-common/9.3.25.v20180904/websocket-common-9.3.25.v20180904.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-server/9.3.25.v20180904/websocket-server-9.3.25.v20180904.jar (35 KB at 8.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-api/9.3.25.v20180904/websocket-api-9.3.25.v20180904.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-annotations/9.3.25.v20180904/jetty-annotations-9.3.25.v20180904.jar (82 KB at 19.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-client/9.3.25.v20180904/websocket-client-9.3.25.v20180904.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-client/9.3.25.v20180904/websocket-client-9.3.25.v20180904.jar (36 KB at 4.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-servlet/9.3.25.v20180904/websocket-servlet-9.3.25.v20180904.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-api/9.3.25.v20180904/websocket-api-9.3.25.v20180904.jar (45 KB at 4.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-jndi/9.3.25.v20180904/jetty-jndi-9.3.25.v20180904.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-servlet/9.3.25.v20180904/websocket-servlet-9.3.25.v20180904.jar (18 KB at 1.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/apache-jsp/9.3.25.v20180904/apache-jsp-9.3.25.v20180904.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-plus/9.3.25.v20180904/jetty-plus-9.3.25.v20180904.jar (54 KB at 5.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/toolchain/jetty-schemas/3.1/jetty-schemas-3.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/apache-jsp/9.3.25.v20180904/apache-jsp-9.3.25.v20180904.jar (11 KB at 1.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jdt/core/compiler/ecj/4.4.2/ecj-4.4.2.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/websocket/websocket-common/9.3.25.v20180904/websocket-common-9.3.25.v20180904.jar (187 KB at 16.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/apache-jstl/9.3.25.v20180904/apache-jstl-9.3.25.v20180904.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/apache-jstl/9.3.25.v20180904/apache-jstl-9.3.25.v20180904.jar (4 KB at 0.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/taglibs/taglibs-standard-spec/1.2.5/taglibs-standard-spec-1.2.5.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-jndi/9.3.25.v20180904/jetty-jndi-9.3.25.v20180904.jar (41 KB at 2.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/taglibs/taglibs-standard-spec/1.2.5/taglibs-standard-spec-1.2.5.jar (40 KB at 2.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/client/ldap/ldap-client-api/0.1/ldap-client-api-0.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/client/ldap/ldap-client-api/0.1/ldap-client-api-0.1.jar (79 KB at 3.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap/0.9.18/shared-ldap-0.9.18.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/toolchain/jetty-schemas/3.1/jetty-schemas-3.1.jar (185 KB at 4.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-i18n/0.9.18/shared-i18n-0.9.18.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar (202 KB at 4.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-cursor/0.9.18/shared-cursor-0.9.18.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-cursor/0.9.18/shared-cursor-0.9.18.jar (20 KB at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-schema/0.9.18/shared-ldap-schema-0.9.18.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-i18n/0.9.18/shared-i18n-0.9.18.jar (25 KB at 0.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-schema-manager/0.9.18/shared-ldap-schema-manager-0.9.18.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-schema-manager/0.9.18/shared-ldap-schema-manager-0.9.18.jar (20 KB at 0.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-schema-loader/0.9.18/shared-ldap-schema-loader-0.9.18.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-schema-loader/0.9.18/shared-ldap-schema-loader-0.9.18.jar (27 KB at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/mina/mina-core/2.0.0-RC1/mina-core-2.0.0-RC1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-schema/0.9.18/shared-ldap-schema-0.9.18.jar (577 KB at 6.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-server-integ/1.5.6/apacheds-server-integ-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap/0.9.18/shared-ldap-0.9.18.jar (1339 KB at 14.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-interceptor-kerberos/1.5.6/apacheds-interceptor-kerberos-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-server-integ/1.5.6/apacheds-server-integ-1.5.6.jar (12 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core/1.5.6/apacheds-core-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-interceptor-kerberos/1.5.6/apacheds-interceptor-kerberos-1.5.6.jar (21 KB at 0.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-api/1.5.6/apacheds-core-api-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/mina/mina-core/2.0.0-RC1/mina-core-2.0.0-RC1.jar (624 KB at 5.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-entry/1.5.6/apacheds-core-entry-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-api/1.5.6/apacheds-core-api-1.5.6.jar (182 KB at 1.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-constants/1.5.6/apacheds-core-constants-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-constants/1.5.6/apacheds-core-constants-1.5.6.jar (12 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-utils/1.5.6/apacheds-utils-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-utils/1.5.6/apacheds-utils-1.5.6.jar (13 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/bouncycastle/bcprov-jdk15/140/bcprov-jdk15-140.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-entry/1.5.6/apacheds-core-entry-1.5.6.jar (64 KB at 0.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-kerberos-shared/1.5.6/apacheds-kerberos-shared-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-kerberos-shared/1.5.6/apacheds-kerberos-shared-1.5.6.jar (261 KB at 1.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-jndi/1.5.6/apacheds-core-jndi-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core/1.5.6/apacheds-core-1.5.6.jar (321 KB at 2.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-protocol-shared/1.5.6/apacheds-protocol-shared-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-jndi/1.5.6/apacheds-core-jndi-1.5.6.jar (46 KB at 0.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-integ/1.5.6/apacheds-core-integ-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-protocol-shared/1.5.6/apacheds-protocol-shared-1.5.6.jar (27 KB at 0.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/ldapsdk/ldapsdk/4.1/ldapsdk-4.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-integ/1.5.6/apacheds-core-integ-1.5.6.jar (14 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-jndi/0.9.18/shared-ldap-jndi-0.9.18.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-jndi/0.9.18/shared-ldap-jndi-0.9.18.jar (11 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-asn1-codec/0.9.18/shared-asn1-codec-0.9.18.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-asn1-codec/0.9.18/shared-asn1-codec-0.9.18.jar (13 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-asn1/0.9.18/shared-asn1-0.9.18.jar
	Downloaded: https://repo.maven.apache.org/maven2/ldapsdk/ldapsdk/4.1/ldapsdk-4.1.jar (257 KB at 1.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-constants/0.9.18/shared-ldap-constants-0.9.18.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-asn1/0.9.18/shared-asn1-0.9.18.jar (95 KB at 0.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-converter/0.9.18/shared-ldap-converter-0.9.18.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-constants/0.9.18/shared-ldap-constants-0.9.18.jar (24 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-schema-dao/0.9.18/shared-ldap-schema-dao-0.9.18.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-converter/0.9.18/shared-ldap-converter-0.9.18.jar (33 KB at 0.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldif/0.9.18/shared-ldif-0.9.18.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldap-schema-dao/0.9.18/shared-ldap-schema-dao-0.9.18.jar (7 KB at 0.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-dsml-parser/0.9.18/shared-dsml-parser-0.9.18.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jdt/core/compiler/ecj/4.4.2/ecj-4.4.2.jar (2257 KB at 12.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/xpp3/xpp3/1.1.4c/xpp3-1.1.4c.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-ldif/0.9.18/shared-ldif-0.9.18.jar (42 KB at 0.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-test-framework/1.5.6/apacheds-test-framework-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/bouncycastle/bcprov-jdk15/140/bcprov-jdk15-140.jar (1557 KB at 8.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-i18n/1.5.6/apacheds-i18n-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/xpp3/xpp3/1.1.4c/xpp3-1.1.4c.jar (118 KB at 0.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-server-annotations/1.5.6/apacheds-server-annotations-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-test-framework/1.5.6/apacheds-test-framework-1.5.6.jar (16 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-annotations/1.5.6/apacheds-core-annotations-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-i18n/1.5.6/apacheds-i18n-1.5.6.jar (39 KB at 0.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-jdbm-partition/1.5.6/apacheds-jdbm-partition-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-annotations/1.5.6/apacheds-core-annotations-1.5.6.jar (20 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-jdbm-store/1.5.6/apacheds-jdbm-store-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-server-annotations/1.5.6/apacheds-server-annotations-1.5.6.jar (18 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-jdbm/1.5.6/apacheds-jdbm-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-jdbm-partition/1.5.6/apacheds-jdbm-partition-1.5.6.jar (14 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-avl/1.5.6/apacheds-core-avl-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/shared/shared-dsml-parser/0.9.18/shared-dsml-parser-0.9.18.jar (179 KB at 0.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-xdbm-search/1.5.6/apacheds-xdbm-search-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-jdbm-store/1.5.6/apacheds-jdbm-store-1.5.6.jar (64 KB at 0.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-ldif-partition/1.5.6/apacheds-ldif-partition-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-avl/1.5.6/apacheds-core-avl-1.5.6.jar (48 KB at 0.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-avl-partition/1.5.6/apacheds-avl-partition-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-ldif-partition/1.5.6/apacheds-ldif-partition-1.5.6.jar (29 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-mock/1.5.6/apacheds-core-mock-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-avl-partition/1.5.6/apacheds-avl-partition-1.5.6.jar (41 KB at 0.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-protocol-ldap/1.5.6/apacheds-protocol-ldap-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-xdbm-search/1.5.6/apacheds-xdbm-search-1.5.6.jar (79 KB at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-xdbm-tools/1.5.6/apacheds-xdbm-tools-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-core-mock/1.5.6/apacheds-core-mock-1.5.6.jar (26 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-xdbm-base/1.5.6/apacheds-xdbm-base-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-jdbm/1.5.6/apacheds-jdbm-1.5.6.jar (89 KB at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-protocol-kerberos/1.5.6/apacheds-protocol-kerberos-1.5.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-xdbm-base/1.5.6/apacheds-xdbm-base-1.5.6.jar (49 KB at 0.2 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-xdbm-tools/1.5.6/apacheds-xdbm-tools-1.5.6.jar (88 KB at 0.4 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-protocol-ldap/1.5.6/apacheds-protocol-ldap-1.5.6.jar (173 KB at 0.8 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/directory/server/apacheds-protocol-kerberos/1.5.6/apacheds-protocol-kerberos-1.5.6.jar (52 KB at 0.2 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-runner/9.3.25.v20180904/jetty-runner-9.3.25.v20180904.jar (6230 KB at 23.2 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-service ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/service (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-service ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-service ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-service ---
	[INFO] 
	[INFO] --- build-helper-maven-plugin:1.8:add-source (add-source) @ hive-service ---
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/service/target/generated-sources/java added.
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/service/target/generated-jamon added.
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (generate) @ hive-service ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/service/target/hive-webapps
	     [copy] Copying 20 files to /Users/xubo/Desktop/xubo/git/hive/service/target/hive-webapps
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/service/target/hive-webapps/hiveserver2/WEB-INF
	Dec 13, 2018 9:30:28 AM org.apache.jasper.servlet.TldScanner scanJars
	INFO: At least one JAR was scanned for TLDs yet contained no TLDs. Enable debug logging for this logger for a complete list of JARs that were scanned but no TLDs were found in them. Skipping unneeded JARs during scanning can improve startup time and JSP compilation time.
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- jamon-maven-plugin:2.3.4:translate (default) @ hive-service ---
	Downloading: https://repo.maven.apache.org/maven2/org/jamon/jamon-processor/2.3.4/jamon-processor-2.3.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/jamon/jamon-processor/2.3.4/jamon-processor-2.3.4.pom (3 KB at 6.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/jamon/jamon-api/2.3.0/jamon-api-2.3.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/jamon/jamon-api/2.3.0/jamon-api-2.3.0.pom (2 KB at 2.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/jamon/jamon-project/1.0.1/jamon-project-1.0.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/jamon/jamon-project/1.0.1/jamon-project-1.0.1.pom (9 KB at 15.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/1.8.1/plexus-compiler-api-1.8.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/1.8.1/plexus-compiler-api-1.8.1.pom (805 B at 1.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/1.8.1/plexus-compiler-1.8.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/1.8.1/plexus-compiler-1.8.1.pom (4 KB at 7.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/jamon/jamon-processor/2.3.4/jamon-processor-2.3.4.jar
	Downloading: https://repo.maven.apache.org/maven2/org/jamon/jamon-api/2.3.0/jamon-api-2.3.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/1.8.1/plexus-compiler-api-1.8.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/jamon/jamon-api/2.3.0/jamon-api-2.3.0.jar (5 KB at 4.8 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/1.8.1/plexus-compiler-api-1.8.1.jar (20 KB at 20.4 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/jamon/jamon-processor/2.3.4/jamon-processor-2.3.4.jar (264 KB at 59.5 KB/sec)
	[INFO] Translating 1 templates from /Users/xubo/Desktop/xubo/git/hive/service/src/jamon to /Users/xubo/Desktop/xubo/git/hive/service/target/generated-jamon
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-service ---
	[WARNING] Missing POM for org.apache.directory.client.ldap:ldap-client-api:jar:0.1-SNAPSHOT
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-service ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 21 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-service ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-service ---
	[INFO] Compiling 128 source files to /Users/xubo/Desktop/xubo/git/hive/service/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/service/src/java/org/apache/hive/service/cli/session/HiveSessionImplwithUGI.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/service/src/java/org/apache/hive/service/cli/session/HiveSessionImplwithUGI.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/service/src/java/org/apache/hive/service/cli/session/SessionManager.java: /Users/xubo/Desktop/xubo/git/hive/service/src/java/org/apache/hive/service/cli/session/SessionManager.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/service/src/java/org/apache/hive/service/cli/session/SessionManager.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-service ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 3 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-service ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/service/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/service/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/service/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/service/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-service ---
	[INFO] Compiling 37 source files to /Users/xubo/Desktop/xubo/git/hive/service/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/service/src/test/org/apache/hive/service/cli/TestHiveSQLException.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/service/src/test/org/apache/hive/service/cli/TestHiveSQLException.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/service/src/test/org/apache/hive/service/auth/ldap/LdapTestUtils.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/service/src/test/org/apache/hive/service/auth/ldap/LdapTestUtils.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-service ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-service ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/service/target/hive-service-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-service ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:test-jar (default) @ hive-service ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/service/target/hive-service-4.0.0-SNAPSHOT-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Accumulo Handler 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/accumulo/accumulo-core/1.7.3/accumulo-core-1.7.3.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-core/1.7.3/accumulo-core-1.7.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-core/1.7.3/accumulo-core-1.7.3.pom (11 KB at 16.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/accumulo/accumulo-project/1.7.3/accumulo-project-1.7.3.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-project/1.7.3/accumulo-project-1.7.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-project/1.7.3/accumulo-project-1.7.3.pom (55 KB at 52.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/beust/jcommander/1.32/jcommander-1.32.pom
	Downloading: https://repo.maven.apache.org/maven2/com/beust/jcommander/1.32/jcommander-1.32.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/beust/jcommander/1.32/jcommander-1.32.pom (8 KB at 12.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/accumulo/accumulo-fate/1.7.3/accumulo-fate-1.7.3.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-fate/1.7.3/accumulo-fate-1.7.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-fate/1.7.3/accumulo-fate-1.7.3.pom (3 KB at 4.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/accumulo/accumulo-start/1.7.3/accumulo-start-1.7.3.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-start/1.7.3/accumulo-start-1.7.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-start/1.7.3/accumulo-start-1.7.3.pom (4 KB at 6.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/commons/commons-vfs2/2.1/commons-vfs2-2.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-vfs2/2.1/commons-vfs2-2.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-vfs2/2.1/commons-vfs2-2.1.pom (12 KB at 18.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/commons/commons-vfs2-project/2.1/commons-vfs2-project-2.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-vfs2-project/2.1/commons-vfs2-project-2.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-vfs2-project/2.1/commons-vfs2-project-2.1.pom (20 KB at 26.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/accumulo/accumulo-trace/1.7.3/accumulo-trace-1.7.3.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-trace/1.7.3/accumulo-trace-1.7.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-trace/1.7.3/accumulo-trace-1.7.3.pom (2 KB at 3.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/accumulo/accumulo-core/1.7.3/accumulo-core-1.7.3.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/beust/jcommander/1.32/jcommander-1.32.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/commons/commons-vfs2/2.1/commons-vfs2-2.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/accumulo/accumulo-fate/1.7.3/accumulo-fate-1.7.3.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/accumulo/accumulo-start/1.7.3/accumulo-start-1.7.3.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/accumulo/accumulo-trace/1.7.3/accumulo-trace-1.7.3.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-core/1.7.3/accumulo-core-1.7.3.jar
	Downloading: https://repo.maven.apache.org/maven2/com/beust/jcommander/1.32/jcommander-1.32.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-vfs2/2.1/commons-vfs2-2.1.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-fate/1.7.3/accumulo-fate-1.7.3.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-start/1.7.3/accumulo-start-1.7.3.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-start/1.7.3/accumulo-start-1.7.3.jar (51 KB at 14.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-trace/1.7.3/accumulo-trace-1.7.3.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/beust/jcommander/1.32/jcommander-1.32.jar (60 KB at 16.9 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-trace/1.7.3/accumulo-trace-1.7.3.jar (15 KB at 2.5 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-fate/1.7.3/accumulo-fate-1.7.3.jar (113 KB at 13.5 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-vfs2/2.1/commons-vfs2-2.1.jar (432 KB at 28.9 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/accumulo/accumulo-core/1.7.3/accumulo-core-1.7.3.jar (4792 KB at 50.4 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-accumulo-handler ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/accumulo-handler (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-accumulo-handler ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-accumulo-handler ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-accumulo-handler ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-accumulo-handler ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-accumulo-handler ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-accumulo-handler ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-accumulo-handler ---
	[INFO] Compiling 61 source files to /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/src/java/org/apache/hadoop/hive/accumulo/HiveAccumuloHelper.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/src/java/org/apache/hadoop/hive/accumulo/HiveAccumuloHelper.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/src/java/org/apache/hadoop/hive/accumulo/mr/AccumuloIndexedOutputFormat.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/src/java/org/apache/hadoop/hive/accumulo/mr/AccumuloIndexedOutputFormat.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-accumulo-handler ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-accumulo-handler ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-accumulo-handler ---
	[INFO] Compiling 30 source files to /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/src/test/org/apache/hadoop/hive/accumulo/predicate/TestAccumuloPredicateHandler.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/src/test/org/apache/hadoop/hive/accumulo/predicate/TestAccumuloPredicateHandler.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/src/test/org/apache/hadoop/hive/accumulo/TestHiveAccumuloHelper.java: /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/src/test/org/apache/hadoop/hive/accumulo/TestHiveAccumuloHelper.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/src/test/org/apache/hadoop/hive/accumulo/TestHiveAccumuloHelper.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-accumulo-handler ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-accumulo-handler ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/target/hive-accumulo-handler-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-accumulo-handler ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:test-jar (default) @ hive-accumulo-handler ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/accumulo-handler/target/hive-accumulo-handler-4.0.0-SNAPSHOT-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive JDBC 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-jdbc ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/jdbc (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-jdbc ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-jdbc ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-jdbc ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-jdbc ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-jdbc ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 1 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-jdbc ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-jdbc ---
	[INFO] Compiling 25 source files to /Users/xubo/Desktop/xubo/git/hive/jdbc/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/jdbc/src/java/org/apache/hive/jdbc/HttpRequestInterceptorBase.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/jdbc/src/java/org/apache/hive/jdbc/HttpRequestInterceptorBase.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/jdbc/src/java/org/apache/hive/jdbc/HiveConnection.java: /Users/xubo/Desktop/xubo/git/hive/jdbc/src/java/org/apache/hive/jdbc/HiveConnection.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/jdbc/src/java/org/apache/hive/jdbc/HiveConnection.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-jdbc ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/jdbc/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-jdbc ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/jdbc/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/jdbc/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/jdbc/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/jdbc/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-jdbc ---
	[INFO] Compiling 3 source files to /Users/xubo/Desktop/xubo/git/hive/jdbc/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-jdbc ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-jdbc ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/jdbc/target/hive-jdbc-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-jdbc ---
	[INFO] 
	[INFO] --- maven-shade-plugin:3.1.0:shade (default) @ hive-jdbc ---
	[INFO] Including org.apache.hive:hive-common:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.hive:hive-classification:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.hive:hive-storage-api:jar:2.7.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.hive:hive-standalone-metastore-common:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Excluding commons-cli:commons-cli:jar:1.2 from the shaded jar.
	[INFO] Including commons-lang:commons-lang:jar:2.6 in the shaded jar.
	[INFO] Including org.apache.commons:commons-lang3:jar:3.2 in the shaded jar.
	[INFO] Excluding org.apache.orc:orc-core:jar:1.5.3 from the shaded jar.
	[INFO] Excluding org.apache.orc:orc-shims:jar:1.5.3 from the shaded jar.
	[INFO] Excluding io.airlift:aircompressor:jar:0.10 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-hdfs:jar:3.1.0 from the shaded jar.
	[INFO] Including org.eclipse.jetty:jetty-util-ajax:jar:9.3.19.v20170502 in the shaded jar.
	[INFO] Excluding jline:jline:jar:2.12 from the shaded jar.
	[INFO] Excluding javax.servlet:javax.servlet-api:jar:3.1.0 from the shaded jar.
	[INFO] Including org.eclipse.jetty:jetty-http:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty:jetty-rewrite:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty:jetty-client:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty:jetty-server:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty:jetty-io:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty:jetty-servlet:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty:jetty-security:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty:jetty-webapp:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty:jetty-xml:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Excluding joda-time:joda-time:jar:2.9.9 from the shaded jar.
	[INFO] Including org.apache.logging.log4j:log4j-1.2-api:jar:2.10.0 in the shaded jar.
	[INFO] Including org.apache.logging.log4j:log4j-api:jar:2.10.0 in the shaded jar.
	[INFO] Including org.apache.logging.log4j:log4j-core:jar:2.10.0 in the shaded jar.
	[INFO] Including org.apache.logging.log4j:log4j-web:jar:2.10.0 in the shaded jar.
	[INFO] Including org.apache.logging.log4j:log4j-slf4j-impl:jar:2.10.0 in the shaded jar.
	[INFO] Excluding org.apache.commons:commons-compress:jar:1.18 from the shaded jar.
	[INFO] Excluding org.apache.ant:ant:jar:1.9.1 from the shaded jar.
	[INFO] Excluding org.apache.ant:ant-launcher:jar:1.9.1 from the shaded jar.
	[INFO] Excluding net.sf.jpam:jpam:jar:1.1 from the shaded jar.
	[INFO] Excluding com.tdunning:json:jar:1.8 from the shaded jar.
	[INFO] Excluding io.dropwizard.metrics:metrics-core:jar:3.1.0 from the shaded jar.
	[INFO] Excluding io.dropwizard.metrics:metrics-jvm:jar:3.1.0 from the shaded jar.
	[INFO] Excluding io.dropwizard.metrics:metrics-json:jar:3.1.0 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.core:jackson-databind:jar:2.9.5 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.core:jackson-annotations:jar:2.9.5 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.core:jackson-core:jar:2.9.5 from the shaded jar.
	[INFO] Including com.github.joshelser:dropwizard-metrics-hadoop-metrics2-reporter:jar:0.1.2 in the shaded jar.
	[INFO] Including javolution:javolution:jar:5.5.1 in the shaded jar.
	[INFO] Including org.apache.hive:hive-service:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.hive:hive-llap-server:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.hive:hive-llap-common:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.hive:hive-llap-client:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Skipping pom dependency org.apache.curator:apache-curator:pom:2.12.0 in the shaded jar.
	[INFO] Including org.apache.hive:hive-llap-tez:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Excluding io.netty:netty-all:jar:4.1.17.Final from the shaded jar.
	[INFO] Excluding org.codehaus.jettison:jettison:jar:1.1 from the shaded jar.
	[INFO] Including org.apache.hive:hive-llap-common:test-jar:tests:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-hadoop2-compat:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-metrics:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-metrics-api:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-mapreduce-client-core:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-client:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-hdfs-client:jar:3.1.0 from the shaded jar.
	[INFO] Including com.squareup.okhttp:okhttp:jar:2.7.5 in the shaded jar.
	[INFO] Including com.squareup.okio:okio:jar:1.6.0 in the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-server:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-http:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Including org.glassfish.jersey.core:jersey-server:jar:2.25.1 in the shaded jar.
	[INFO] Including org.glassfish.jersey.core:jersey-common:jar:2.25.1 in the shaded jar.
	[INFO] Including org.glassfish.jersey.bundles.repackaged:jersey-guava:jar:2.25.1 in the shaded jar.
	[INFO] Including org.glassfish.hk2:osgi-resource-locator:jar:1.0.1 in the shaded jar.
	[INFO] Including org.glassfish.jersey.core:jersey-client:jar:2.25.1 in the shaded jar.
	[INFO] Including org.glassfish.jersey.media:jersey-media-jaxb:jar:2.25.1 in the shaded jar.
	[INFO] Including org.glassfish.hk2:hk2-api:jar:2.5.0-b32 in the shaded jar.
	[INFO] Including org.glassfish.hk2:hk2-utils:jar:2.5.0-b32 in the shaded jar.
	[INFO] Including org.glassfish.hk2.external:aopalliance-repackaged:jar:2.5.0-b32 in the shaded jar.
	[INFO] Including org.glassfish.hk2.external:javax.inject:jar:2.5.0-b32 in the shaded jar.
	[INFO] Including org.glassfish.hk2:hk2-locator:jar:2.5.0-b32 in the shaded jar.
	[INFO] Including org.javassist:javassist:jar:3.20.0-GA in the shaded jar.
	[INFO] Including javax.validation:validation-api:jar:1.1.0.Final in the shaded jar.
	[INFO] Including org.glassfish.jersey.containers:jersey-container-servlet-core:jar:2.25.1 in the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-procedure:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-common:jar:tests:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-replication:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-prefix-tree:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Including org.apache.commons:commons-collections4:jar:4.1 in the shaded jar.
	[INFO] Including javax.ws.rs:javax.ws.rs-api:jar:2.0.1 in the shaded jar.
	[INFO] Including com.lmax:disruptor:jar:3.3.6 in the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-distcp:jar:2.7.1 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-client:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-mapreduce-client-jobclient:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-mapreduce-client-common:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-mapreduce:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-common:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Including com.github.stephenc.findbugs:findbugs-annotations:jar:1.3.9-1 in the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-hadoop-compat:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding javax.servlet.jsp:javax.servlet.jsp-api:jar:2.3.1 from the shaded jar.
	[INFO] Including commons-codec:commons-codec:jar:1.7 in the shaded jar.
	[INFO] Including org.eclipse.jetty:jetty-runner:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty:jetty-plus:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty:jetty-annotations:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including javax.annotation:javax.annotation-api:jar:1.2 in the shaded jar.
	[INFO] Excluding org.ow2.asm:asm:jar:6.0 from the shaded jar.
	[INFO] Excluding org.ow2.asm:asm-commons:jar:6.0 from the shaded jar.
	[INFO] Excluding org.ow2.asm:asm-tree:jar:6.0 from the shaded jar.
	[INFO] Including org.eclipse.jetty:jetty-jaas:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty.websocket:websocket-server:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty.websocket:websocket-common:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty.websocket:websocket-api:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty.websocket:websocket-client:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty.websocket:websocket-servlet:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty:jetty-jndi:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty:apache-jsp:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.eclipse.jetty.toolchain:jetty-schemas:jar:3.1 in the shaded jar.
	[INFO] Including org.eclipse.jdt.core.compiler:ecj:jar:4.4.2 in the shaded jar.
	[INFO] Including org.eclipse.jetty:apache-jstl:jar:9.3.25.v20180904 in the shaded jar.
	[INFO] Including org.apache.taglibs:taglibs-standard-spec:jar:1.2.5 in the shaded jar.
	[INFO] Including org.apache.taglibs:taglibs-standard-impl:jar:1.2.5 in the shaded jar.
	[INFO] Including org.apache.thrift:libfb303:jar:0.9.3 in the shaded jar.
	[INFO] Including org.apache.curator:curator-recipes:jar:2.12.0 in the shaded jar.
	[INFO] Including org.jamon:jamon-runtime:jar:2.3.1 in the shaded jar.
	[INFO] Including org.apache.hive:hive-serde:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Excluding com.google.code.findbugs:jsr305:jar:3.0.0 from the shaded jar.
	[INFO] Including org.apache.arrow:arrow-vector:jar:0.10.0 in the shaded jar.
	[INFO] Including org.apache.arrow:arrow-format:jar:0.10.0 in the shaded jar.
	[INFO] Including org.apache.arrow:arrow-memory:jar:0.10.0 in the shaded jar.
	[INFO] Excluding io.netty:netty-buffer:jar:4.1.17.Final from the shaded jar.
	[INFO] Excluding io.netty:netty-common:jar:4.1.17.Final from the shaded jar.
	[INFO] Including com.carrotsearch:hppc:jar:0.7.2 in the shaded jar.
	[INFO] Including com.vlkan:flatbuffers:jar:1.2.0-3f79e055 in the shaded jar.
	[INFO] Excluding org.apache.avro:avro:jar:1.8.2 from the shaded jar.
	[INFO] Excluding org.codehaus.jackson:jackson-core-asl:jar:1.9.13 from the shaded jar.
	[INFO] Excluding org.codehaus.jackson:jackson-mapper-asl:jar:1.9.13 from the shaded jar.
	[INFO] Excluding com.thoughtworks.paranamer:paranamer:jar:2.7 from the shaded jar.
	[INFO] Excluding org.xerial.snappy:snappy-java:jar:1.1.4 from the shaded jar.
	[INFO] Excluding org.tukaani:xz:jar:1.5 from the shaded jar.
	[INFO] Excluding net.sf.opencsv:opencsv:jar:2.3 from the shaded jar.
	[INFO] Including org.apache.parquet:parquet-hadoop-bundle:jar:1.10.0 in the shaded jar.
	[INFO] Including org.apache.hive:hive-metastore:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Including com.google.guava:guava:jar:19.0 in the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-client:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase.thirdparty:hbase-shaded-protobuf:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-protocol-shaded:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-protocol:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase.thirdparty:hbase-shaded-miscellaneous:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.hbase.thirdparty:hbase-shaded-netty:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.htrace:htrace-core:jar:3.2.0-incubating from the shaded jar.
	[INFO] Including org.jruby.jcodings:jcodings:jar:1.0.18 in the shaded jar.
	[INFO] Including org.jruby.joni:joni:jar:2.1.11 in the shaded jar.
	[INFO] Including org.apache.commons:commons-crypto:jar:1.0.0 in the shaded jar.
	[INFO] Including org.apache.yetus:audience-annotations:jar:0.5.0 in the shaded jar.
	[INFO] Excluding com.jolbox:bonecp:jar:0.8.0.RELEASE from the shaded jar.
	[INFO] Excluding com.zaxxer:HikariCP:jar:2.6.1 from the shaded jar.
	[INFO] Excluding org.apache.derby:derby:jar:10.14.1.0 from the shaded jar.
	[INFO] Excluding commons-pool:commons-pool:jar:1.5.4 from the shaded jar.
	[INFO] Excluding commons-dbcp:commons-dbcp:jar:1.4 from the shaded jar.
	[INFO] Excluding javax.jdo:jdo-api:jar:3.0.1 from the shaded jar.
	[INFO] Excluding javax.transaction:jta:jar:1.1 from the shaded jar.
	[INFO] Excluding org.antlr:antlr-runtime:jar:3.5.2 from the shaded jar.
	[INFO] Including co.cask.tephra:tephra-api:jar:0.6.0 in the shaded jar.
	[INFO] Including co.cask.tephra:tephra-core:jar:0.6.0 in the shaded jar.
	[INFO] Excluding com.google.inject:guice:jar:3.0 from the shaded jar.
	[INFO] Excluding javax.inject:javax.inject:jar:1 from the shaded jar.
	[INFO] Excluding aopalliance:aopalliance:jar:1.0 from the shaded jar.
	[INFO] Excluding com.google.inject.extensions:guice-assistedinject:jar:3.0 from the shaded jar.
	[INFO] Including it.unimi.dsi:fastutil:jar:6.5.6 in the shaded jar.
	[INFO] Including org.apache.twill:twill-common:jar:0.6.0-incubating in the shaded jar.
	[INFO] Including org.apache.twill:twill-core:jar:0.6.0-incubating in the shaded jar.
	[INFO] Including org.apache.twill:twill-api:jar:0.6.0-incubating in the shaded jar.
	[INFO] Including org.apache.twill:twill-discovery-api:jar:0.6.0-incubating in the shaded jar.
	[INFO] Including org.apache.twill:twill-discovery-core:jar:0.6.0-incubating in the shaded jar.
	[INFO] Including org.apache.twill:twill-zookeeper:jar:0.6.0-incubating in the shaded jar.
	[INFO] Including co.cask.tephra:tephra-hbase-compat-1.0:jar:0.6.0 in the shaded jar.
	[INFO] Including org.apache.hive:hive-shims:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.hive.shims:hive-shims-common:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.hive.shims:hive-shims-0.23:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-server-resourcemanager:jar:3.1.0 from the shaded jar.
	[INFO] Excluding com.google.inject.extensions:guice-servlet:jar:4.0 from the shaded jar.
	[INFO] Excluding com.sun.jersey.contribs:jersey-guice:jar:1.19 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-common:jar:3.1.0 from the shaded jar.
	[INFO] Including com.fasterxml.jackson.module:jackson-module-jaxb-annotations:jar:2.9.5 in the shaded jar.
	[INFO] Including com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider:jar:2.9.5 in the shaded jar.
	[INFO] Including com.fasterxml.jackson.jaxrs:jackson-jaxrs-base:jar:2.9.5 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-yarn-api:jar:3.1.0 in the shaded jar.
	[INFO] Excluding javax.xml.bind:jaxb-api:jar:2.2.11 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-client:jar:1.19 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-server-common:jar:3.1.0 from the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-yarn-registry:jar:3.1.0 in the shaded jar.
	[INFO] Including commons-daemon:commons-daemon:jar:1.0.13 in the shaded jar.
	[INFO] Including dnsjava:dnsjava:jar:2.1.7 in the shaded jar.
	[INFO] Excluding org.apache.geronimo.specs:geronimo-jcache_1.0_spec:jar:1.0-alpha-1 from the shaded jar.
	[INFO] Including org.ehcache:ehcache:jar:3.3.1 in the shaded jar.
	[INFO] Excluding com.zaxxer:HikariCP-java7:jar:2.4.12 from the shaded jar.
	[INFO] Including com.microsoft.sqlserver:mssql-jdbc:jar:6.2.1.jre7 in the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-server-applicationhistoryservice:jar:3.1.0 from the shaded jar.
	[INFO] Including de.ruedigermoeller:fst:jar:2.50 in the shaded jar.
	[INFO] Including com.cedarsoftware:java-util:jar:1.9.0 in the shaded jar.
	[INFO] Including com.cedarsoftware:json-io:jar:2.5.1 in the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-server-web-proxy:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.fusesource.leveldbjni:leveldbjni-all:jar:1.8 from the shaded jar.
	[INFO] Including org.apache.hive.shims:hive-shims-scheduler:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.hive:hive-service-rpc:jar:4.0.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.httpcomponents:httpclient:jar:4.5.2 in the shaded jar.
	[INFO] Including commons-logging:commons-logging:jar:1.2 in the shaded jar.
	[INFO] Including org.apache.httpcomponents:httpcore:jar:4.4.4 in the shaded jar.
	[INFO] Including org.apache.thrift:libthrift:jar:0.9.3 in the shaded jar.
	[INFO] Including org.apache.zookeeper:zookeeper:jar:3.4.6 in the shaded jar.
	[INFO] Excluding log4j:log4j:jar:1.2.16 from the shaded jar.
	[INFO] Excluding io.netty:netty:jar:3.7.0.Final from the shaded jar.
	[INFO] Including org.apache.curator:curator-framework:jar:2.12.0 in the shaded jar.
	[INFO] Including org.apache.curator:curator-client:jar:2.12.0 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-common:jar:3.1.0 in the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-annotations:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.commons:commons-math3:jar:3.1.1 from the shaded jar.
	[INFO] Excluding commons-io:commons-io:jar:2.4 from the shaded jar.
	[INFO] Excluding commons-net:commons-net:jar:3.6 from the shaded jar.
	[INFO] Including commons-collections:commons-collections:jar:3.2.2 in the shaded jar.
	[INFO] Including org.eclipse.jetty:jetty-util:jar:9.3.19.v20170502 in the shaded jar.
	[INFO] Excluding javax.servlet.jsp:jsp-api:jar:2.1 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-core:jar:1.19 from the shaded jar.
	[INFO] Including javax.ws.rs:jsr311-api:jar:1.1.1 in the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-servlet:jar:1.19 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-json:jar:1.19 from the shaded jar.
	[INFO] Excluding com.sun.xml.bind:jaxb-impl:jar:2.2.3-1 from the shaded jar.
	[INFO] Excluding org.codehaus.jackson:jackson-jaxrs:jar:1.9.2 from the shaded jar.
	[INFO] Excluding org.codehaus.jackson:jackson-xc:jar:1.9.2 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-server:jar:1.19 from the shaded jar.
	[INFO] Excluding commons-beanutils:commons-beanutils:jar:1.9.3 from the shaded jar.
	[INFO] Including org.apache.commons:commons-configuration2:jar:2.1.1 in the shaded jar.
	[INFO] Including com.google.re2j:re2j:jar:1.1 in the shaded jar.
	[INFO] Excluding com.google.protobuf:protobuf-java:jar:2.5.0 from the shaded jar.
	[INFO] Excluding com.google.code.gson:gson:jar:2.2.4 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-auth:jar:3.1.0 from the shaded jar.
	[INFO] Including com.nimbusds:nimbus-jose-jwt:jar:4.41.1 in the shaded jar.
	[INFO] Including com.github.stephenc.jcip:jcip-annotations:jar:1.0-1 in the shaded jar.
	[INFO] Including net.minidev:json-smart:jar:2.3 in the shaded jar.
	[INFO] Including net.minidev:accessors-smart:jar:1.2 in the shaded jar.
	[INFO] Excluding com.jcraft:jsch:jar:0.1.54 from the shaded jar.
	[INFO] Excluding org.apache.htrace:htrace-core4:jar:4.1.0-incubating from the shaded jar.
	[INFO] Including org.apache.kerby:kerb-simplekdc:jar:1.0.1 in the shaded jar.
	[INFO] Including org.apache.kerby:kerb-client:jar:1.0.1 in the shaded jar.
	[INFO] Including org.apache.kerby:kerby-config:jar:1.0.1 in the shaded jar.
	[INFO] Including org.apache.kerby:kerb-core:jar:1.0.1 in the shaded jar.
	[INFO] Including org.apache.kerby:kerby-pkix:jar:1.0.1 in the shaded jar.
	[INFO] Including org.apache.kerby:kerby-asn1:jar:1.0.1 in the shaded jar.
	[INFO] Including org.apache.kerby:kerby-util:jar:1.0.1 in the shaded jar.
	[INFO] Including org.apache.kerby:kerb-common:jar:1.0.1 in the shaded jar.
	[INFO] Including org.apache.kerby:kerb-crypto:jar:1.0.1 in the shaded jar.
	[INFO] Including org.apache.kerby:kerb-util:jar:1.0.1 in the shaded jar.
	[INFO] Including org.apache.kerby:token-provider:jar:1.0.1 in the shaded jar.
	[INFO] Including org.apache.kerby:kerb-admin:jar:1.0.1 in the shaded jar.
	[INFO] Including org.apache.kerby:kerb-server:jar:1.0.1 in the shaded jar.
	[INFO] Including org.apache.kerby:kerb-identity:jar:1.0.1 in the shaded jar.
	[INFO] Including org.apache.kerby:kerby-xdr:jar:1.0.1 in the shaded jar.
	[INFO] Including org.codehaus.woodstox:stax2-api:jar:3.1.4 in the shaded jar.
	[INFO] Including com.fasterxml.woodstox:woodstox-core:jar:5.0.3 in the shaded jar.
	[INFO] Including org.slf4j:slf4j-api:jar:1.7.10 in the shaded jar.
	[WARNING] Discovered module-info.class. Shading will break its strong encapsulation.
	[WARNING] jetty-jndi-9.3.25.v20180904.jar, jetty-runner-9.3.25.v20180904.jar define 18 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.jndi.factories.MailSessionReference
	[WARNING]   - org.eclipse.jetty.jndi.NamingUtil
	[WARNING]   - org.eclipse.jetty.jndi.InitialContextFactory
	[WARNING]   - org.eclipse.jetty.jndi.BindingEnumeration
	[WARNING]   - org.eclipse.jetty.jndi.java.javaURLContextFactory
	[WARNING]   - org.eclipse.jetty.jndi.local.localContextRoot$1
	[WARNING]   - org.eclipse.jetty.jndi.factories.MailSessionReference$PasswordAuthenticator
	[WARNING]   - org.eclipse.jetty.jndi.InitialContextFactory$DefaultParser
	[WARNING]   - org.eclipse.jetty.jndi.java.javaRootURLContext
	[WARNING]   - org.eclipse.jetty.jndi.ContextFactory
	[WARNING]   - 8 more...
	[WARNING] jetty-runner-9.3.25.v20180904.jar, jetty-annotations-9.3.25.v20180904.jar define 42 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.annotations.ClassInheritanceHandler
	[WARNING]   - org.eclipse.jetty.annotations.WebServletAnnotationHandler
	[WARNING]   - org.eclipse.jetty.annotations.WebListenerAnnotationHandler
	[WARNING]   - org.eclipse.jetty.annotations.ContainerInitializerAnnotationHandler
	[WARNING]   - org.eclipse.jetty.annotations.PostConstructAnnotationHandler
	[WARNING]   - org.eclipse.jetty.annotations.ClassNameResolver
	[WARNING]   - org.eclipse.jetty.annotations.ResourcesAnnotationHandler
	[WARNING]   - org.eclipse.jetty.annotations.RunAsAnnotationHandler
	[WARNING]   - org.eclipse.jetty.annotations.AnnotationParser$ClassInfo
	[WARNING]   - org.eclipse.jetty.annotations.AnnotationParser$MyClassVisitor
	[WARNING]   - 32 more...
	[WARNING] jetty-runner-9.3.25.v20180904.jar, jetty-server-9.3.25.v20180904.jar define 241 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.server.handler.ThreadLimitHandler$RFC7239
	[WARNING]   - org.eclipse.jetty.server.handler.ManagedAttributeListener
	[WARNING]   - org.eclipse.jetty.server.session.JDBCSessionIdManager$SessionTableSchema
	[WARNING]   - org.eclipse.jetty.server.ServletRequestHttpWrapper
	[WARNING]   - org.eclipse.jetty.server.DebugListener$1
	[WARNING]   - org.eclipse.jetty.server.session.HashSessionManager$Saver
	[WARNING]   - org.eclipse.jetty.server.ShutdownMonitor$1
	[WARNING]   - org.eclipse.jetty.server.HttpInput$1
	[WARNING]   - org.eclipse.jetty.server.UserIdentity$Scope
	[WARNING]   - org.eclipse.jetty.server.AsyncContextState$1
	[WARNING]   - 231 more...
	[WARNING] jetty-runner-9.3.25.v20180904.jar, websocket-common-9.3.25.v20180904.jar define 113 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.websocket.common.events.annotated.InvalidSignatureException
	[WARNING]   - org.eclipse.jetty.websocket.common.io.FrameFlusher$1
	[WARNING]   - org.eclipse.jetty.websocket.common.extensions.ExtensionStack$Flusher
	[WARNING]   - org.eclipse.jetty.websocket.common.Generator
	[WARNING]   - org.eclipse.jetty.websocket.common.events.JettyListenerImpl
	[WARNING]   - org.eclipse.jetty.websocket.common.events.AbstractEventDriver
	[WARNING]   - org.eclipse.jetty.websocket.common.frames.PongFrame
	[WARNING]   - org.eclipse.jetty.websocket.common.message.MessageAppender
	[WARNING]   - org.eclipse.jetty.websocket.common.WebSocketRemoteEndpoint$MsgType
	[WARNING]   - org.eclipse.jetty.websocket.common.extensions.fragment.FragmentExtension$Flusher
	[WARNING]   - 103 more...
	[WARNING] jetty-runner-9.3.25.v20180904.jar, jetty-webapp-9.3.25.v20180904.jar define 42 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.webapp.FragmentDescriptor
	[WARNING]   - org.eclipse.jetty.webapp.WebInfConfiguration$WebAppPathNameMatcher
	[WARNING]   - org.eclipse.jetty.webapp.WebAppContext$1
	[WARNING]   - org.eclipse.jetty.webapp.CachingWebAppClassLoader
	[WARNING]   - org.eclipse.jetty.webapp.WebAppContext
	[WARNING]   - org.eclipse.jetty.webapp.AbstractConfiguration
	[WARNING]   - org.eclipse.jetty.webapp.JettyWebXmlConfiguration$1
	[WARNING]   - org.eclipse.jetty.webapp.WebAppContext$Context
	[WARNING]   - org.eclipse.jetty.webapp.FragmentDescriptor$OtherType
	[WARNING]   - org.eclipse.jetty.webapp.WebDescriptor$1
	[WARNING]   - 32 more...
	[WARNING] jetty-runner-9.3.25.v20180904.jar, apache-jsp-9.3.25.v20180904.jar define 5 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.jsp.JettyJspServlet
	[WARNING]   - org.eclipse.jetty.apache.jsp.JettyJasperInitializer$1
	[WARNING]   - org.eclipse.jetty.apache.jsp.JuliLog
	[WARNING]   - org.eclipse.jetty.apache.jsp.JettyJasperInitializer$NullTldScanner
	[WARNING]   - org.eclipse.jetty.apache.jsp.JettyJasperInitializer
	[WARNING] jetty-runner-9.3.25.v20180904.jar, javax.annotation-api-1.2.jar define 15 overlapping classes: 
	[WARNING]   - javax.annotation.ManagedBean
	[WARNING]   - javax.annotation.PreDestroy
	[WARNING]   - javax.annotation.Resource$AuthenticationType
	[WARNING]   - javax.annotation.Generated
	[WARNING]   - javax.annotation.security.DeclareRoles
	[WARNING]   - javax.annotation.Priority
	[WARNING]   - javax.annotation.Resource
	[WARNING]   - javax.annotation.security.DenyAll
	[WARNING]   - javax.annotation.security.RunAs
	[WARNING]   - javax.annotation.sql.DataSourceDefinitions
	[WARNING]   - 5 more...
	[WARNING] jetty-runner-9.3.25.v20180904.jar, ecj-4.4.2.jar define 557 overlapping classes: 
	[WARNING]   - org.eclipse.jdt.internal.compiler.apt.model.ErrorTypeElement
	[WARNING]   - org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding
	[WARNING]   - org.eclipse.jdt.internal.compiler.lookup.ConstraintFormula
	[WARNING]   - org.eclipse.jdt.internal.compiler.apt.dispatch.BatchMessagerImpl
	[WARNING]   - org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation
	[WARNING]   - org.eclipse.jdt.internal.compiler.ast.ThrowStatement
	[WARNING]   - org.eclipse.jdt.internal.compiler.ast.JavadocSingleNameReference
	[WARNING]   - org.eclipse.jdt.internal.compiler.lookup.ProblemReferenceBinding
	[WARNING]   - org.eclipse.jdt.internal.compiler.ast.IntLiteral
	[WARNING]   - org.eclipse.jdt.internal.compiler.ast.Reference
	[WARNING]   - 547 more...
	[WARNING] jetty-runner-9.3.25.v20180904.jar, jetty-xml-9.3.25.v20180904.jar define 14 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.xml.ConfigurationProcessorFactory
	[WARNING]   - org.eclipse.jetty.xml.XmlParser$Node
	[WARNING]   - org.eclipse.jetty.xml.XmlConfiguration$JettyXmlConfiguration$AttrOrElementNode
	[WARNING]   - org.eclipse.jetty.xml.XmlConfiguration$JettyXmlConfiguration
	[WARNING]   - org.eclipse.jetty.xml.ConfigurationProcessor
	[WARNING]   - org.eclipse.jetty.xml.XmlParser$Handler
	[WARNING]   - org.eclipse.jetty.xml.XmlConfiguration
	[WARNING]   - org.eclipse.jetty.xml.XmlConfiguration$1
	[WARNING]   - org.eclipse.jetty.xml.XmlConfiguration$JettyXmlConfiguration$1
	[WARNING]   - org.eclipse.jetty.xml.XmlParser
	[WARNING]   - 4 more...
	[WARNING] jetty-security-9.3.25.v20180904.jar, jetty-runner-9.3.25.v20180904.jar define 54 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.security.MappedLoginService
	[WARNING]   - org.eclipse.jetty.security.SpnegoUserPrincipal
	[WARNING]   - org.eclipse.jetty.security.JDBCLoginService$JDBCKnownUser
	[WARNING]   - org.eclipse.jetty.security.authentication.DigestAuthenticator
	[WARNING]   - org.eclipse.jetty.security.UserDataConstraint
	[WARNING]   - org.eclipse.jetty.security.PropertyUserStore$UserListener
	[WARNING]   - org.eclipse.jetty.security.authentication.FormAuthenticator
	[WARNING]   - org.eclipse.jetty.security.UserAuthentication
	[WARNING]   - org.eclipse.jetty.security.MappedLoginService$Anonymous
	[WARNING]   - org.eclipse.jetty.security.DefaultAuthenticatorFactory
	[WARNING]   - 44 more...
	[WARNING] jetty-runner-9.3.25.v20180904.jar, jetty-jaas-9.3.25.v20180904.jar define 23 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.jaas.JAASGroup
	[WARNING]   - org.eclipse.jetty.jaas.spi.AbstractDatabaseLoginModule
	[WARNING]   - org.eclipse.jetty.jaas.callback.RequestParameterCallback
	[WARNING]   - org.eclipse.jetty.jaas.spi.DataSourceLoginModule
	[WARNING]   - org.eclipse.jetty.jaas.JAASLoginService
	[WARNING]   - org.eclipse.jetty.jaas.callback.AbstractCallbackHandler
	[WARNING]   - org.eclipse.jetty.jaas.JAASUserPrincipal
	[WARNING]   - org.eclipse.jetty.jaas.spi.LdapLoginModule
	[WARNING]   - org.eclipse.jetty.jaas.RoleCheckPolicy
	[WARNING]   - org.eclipse.jetty.jaas.spi.UserInfo
	[WARNING]   - 13 more...
	[WARNING] jetty-runner-9.3.25.v20180904.jar, jetty-plus-9.3.25.v20180904.jar define 24 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.plus.webapp.EnvConfiguration$Bound
	[WARNING]   - org.eclipse.jetty.plus.annotation.PreDestroyCallback
	[WARNING]   - org.eclipse.jetty.plus.jndi.NamingEntry
	[WARNING]   - org.eclipse.jetty.plus.webapp.PlusDescriptorProcessor
	[WARNING]   - org.eclipse.jetty.plus.jndi.NamingEntryUtil
	[WARNING]   - org.eclipse.jetty.plus.security.DataSourceLoginService$DBUser
	[WARNING]   - org.eclipse.jetty.plus.jndi.EnvEntry
	[WARNING]   - org.eclipse.jetty.plus.jndi.Resource
	[WARNING]   - org.eclipse.jetty.plus.annotation.InjectionCollection
	[WARNING]   - org.eclipse.jetty.plus.annotation.PostConstructCallback
	[WARNING]   - 14 more...
	[WARNING] jetty-runner-9.3.25.v20180904.jar, jetty-io-9.3.25.v20180904.jar define 84 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.io.ssl.ALPNProcessor
	[WARNING]   - org.eclipse.jetty.io.AbstractEndPoint$2
	[WARNING]   - org.eclipse.jetty.io.WriteFlusher$FailedState
	[WARNING]   - org.eclipse.jetty.io.ManagedSelector$Acceptor
	[WARNING]   - org.eclipse.jetty.io.ByteBufferPool$Lease
	[WARNING]   - org.eclipse.jetty.io.ManagedSelector$SelectableEndPoint
	[WARNING]   - org.eclipse.jetty.io.ManagedSelector$1
	[WARNING]   - org.eclipse.jetty.io.ConnectionStatistics
	[WARNING]   - org.eclipse.jetty.io.ClientConnectionFactory
	[WARNING]   - org.eclipse.jetty.io.Connection$UpgradeTo
	[WARNING]   - 74 more...
	[WARNING] websocket-server-9.3.25.v20180904.jar, jetty-runner-9.3.25.v20180904.jar define 17 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.websocket.server.pathmap.PathSpec
	[WARNING]   - org.eclipse.jetty.websocket.server.ServletWebSocketResponse
	[WARNING]   - org.eclipse.jetty.websocket.server.WebSocketServerFactory
	[WARNING]   - org.eclipse.jetty.websocket.server.WebSocketHandler$Simple
	[WARNING]   - org.eclipse.jetty.websocket.server.pathmap.RegexPathSpec
	[WARNING]   - org.eclipse.jetty.websocket.server.WebSocketHandler
	[WARNING]   - org.eclipse.jetty.websocket.server.WebSocketUpgradeFilter
	[WARNING]   - org.eclipse.jetty.websocket.server.MappedWebSocketCreator
	[WARNING]   - org.eclipse.jetty.websocket.server.HandshakeRFC6455
	[WARNING]   - org.eclipse.jetty.websocket.server.ServletWebSocketRequest
	[WARNING]   - 7 more...
	[WARNING] jetty-runner-9.3.25.v20180904.jar, websocket-client-9.3.25.v20180904.jar define 16 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.websocket.client.masks.RandomMasker
	[WARNING]   - org.eclipse.jetty.websocket.client.io.WebSocketClientSelectorManager
	[WARNING]   - org.eclipse.jetty.websocket.client.ClientUpgradeResponse
	[WARNING]   - org.eclipse.jetty.websocket.client.WebSocketClient
	[WARNING]   - org.eclipse.jetty.websocket.client.ClientUpgradeRequest
	[WARNING]   - org.eclipse.jetty.websocket.client.io.UpgradeConnection$State
	[WARNING]   - org.eclipse.jetty.websocket.client.io.WebSocketClientConnection
	[WARNING]   - org.eclipse.jetty.websocket.client.io.ConnectionManager
	[WARNING]   - org.eclipse.jetty.websocket.client.masks.FixedMasker
	[WARNING]   - org.eclipse.jetty.websocket.client.io.UpgradeConnection$SendUpgradeRequest
	[WARNING]   - 6 more...
	[WARNING] jetty-runner-9.3.25.v20180904.jar, taglibs-standard-spec-1.2.5.jar define 26 overlapping classes: 
	[WARNING]   - javax.servlet.jsp.jstl.tlv.ScriptFreeTLV$MyContentHandler
	[WARNING]   - javax.servlet.jsp.jstl.tlv.PermittedTaglibsTLV$PermittedTaglibsHandler
	[WARNING]   - javax.servlet.jsp.jstl.tlv.PageParser
	[WARNING]   - javax.servlet.jsp.jstl.core.IteratedExpression
	[WARNING]   - javax.servlet.jsp.jstl.core.LoopTagSupport
	[WARNING]   - javax.servlet.jsp.jstl.sql.Result
	[WARNING]   - javax.servlet.jsp.jstl.fmt.JakartaInline
	[WARNING]   - javax.servlet.jsp.jstl.fmt.LocalizationContext
	[WARNING]   - javax.servlet.jsp.jstl.tlv.PageParser$1
	[WARNING]   - javax.servlet.jsp.jstl.fmt.JakartaInline$1
	[WARNING]   - 16 more...
	[WARNING] jetty-runner-9.3.25.v20180904.jar, jetty-servlet-9.3.25.v20180904.jar define 48 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.servlet.ServletHandler$Default404Servlet
	[WARNING]   - org.eclipse.jetty.servlet.FilterMapping
	[WARNING]   - org.eclipse.jetty.servlet.ErrorPageErrorHandler$PageLookupTechnique
	[WARNING]   - org.eclipse.jetty.servlet.ServletContextHandler
	[WARNING]   - org.eclipse.jetty.servlet.Holder$1
	[WARNING]   - org.eclipse.jetty.servlet.FilterMapping$1
	[WARNING]   - org.eclipse.jetty.servlet.ServletContextHandler$ServletContainerInitializerCaller
	[WARNING]   - org.eclipse.jetty.servlet.FilterHolder
	[WARNING]   - org.eclipse.jetty.servlet.Invoker
	[WARNING]   - org.eclipse.jetty.servlet.Holder
	[WARNING]   - 38 more...
	[WARNING] jetty-runner-9.3.25.v20180904.jar, websocket-servlet-9.3.25.v20180904.jar define 7 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.websocket.servlet.WebSocketCreator
	[WARNING]   - org.eclipse.jetty.websocket.servlet.ServletUpgradeResponse
	[WARNING]   - org.eclipse.jetty.websocket.servlet.UpgradeHttpServletRequest
	[WARNING]   - org.eclipse.jetty.websocket.servlet.WebSocketServlet
	[WARNING]   - org.eclipse.jetty.websocket.servlet.ServletUpgradeRequest
	[WARNING]   - org.eclipse.jetty.websocket.servlet.WebSocketServletFactory
	[WARNING]   - org.eclipse.jetty.websocket.servlet.WebSocketServletFactory$Loader
	[WARNING] jetty-runner-9.3.25.v20180904.jar, websocket-api-9.3.25.v20180904.jar define 44 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.websocket.api.WebSocketPolicy
	[WARNING]   - org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect
	[WARNING]   - org.eclipse.jetty.websocket.api.BatchMode
	[WARNING]   - org.eclipse.jetty.websocket.api.util.QuoteUtil$DeQuotingStringIterator
	[WARNING]   - org.eclipse.jetty.websocket.api.SuspendToken
	[WARNING]   - org.eclipse.jetty.websocket.api.BadPayloadException
	[WARNING]   - org.eclipse.jetty.websocket.api.WebSocketAdapter
	[WARNING]   - org.eclipse.jetty.websocket.api.extensions.Extension
	[WARNING]   - org.eclipse.jetty.websocket.api.WebSocketException
	[WARNING]   - org.eclipse.jetty.websocket.api.CloseException
	[WARNING]   - 34 more...
	[WARNING] jsr311-api-1.1.1.jar, javax.ws.rs-api-2.0.1.jar define 55 overlapping classes: 
	[WARNING]   - javax.ws.rs.core.HttpHeaders
	[WARNING]   - javax.ws.rs.ext.RuntimeDelegate$HeaderDelegate
	[WARNING]   - javax.ws.rs.DefaultValue
	[WARNING]   - javax.ws.rs.core.StreamingOutput
	[WARNING]   - javax.ws.rs.HEAD
	[WARNING]   - javax.ws.rs.core.Request
	[WARNING]   - javax.ws.rs.ext.Providers
	[WARNING]   - javax.ws.rs.core.NewCookie
	[WARNING]   - javax.ws.rs.core.UriBuilderException
	[WARNING]   - javax.ws.rs.ext.ContextResolver
	[WARNING]   - 45 more...
	[WARNING] jetty-runner-9.3.25.v20180904.jar, jetty-util-9.3.19.v20170502.jar define 257 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.util.thread.strategy.ProduceExecuteConsume$Factory
	[WARNING]   - org.eclipse.jetty.util.MemoryUtils$1
	[WARNING]   - org.eclipse.jetty.util.ArrayQueue
	[WARNING]   - org.eclipse.jetty.util.resource.URLResource
	[WARNING]   - org.eclipse.jetty.util.Scanner$DiscreteListener
	[WARNING]   - org.eclipse.jetty.util.log.StacklessLogging
	[WARNING]   - org.eclipse.jetty.util.component.Dumpable
	[WARNING]   - org.eclipse.jetty.util.preventers.Java2DLeakPreventer
	[WARNING]   - org.eclipse.jetty.util.InetAddressSet$LegacyInetRange
	[WARNING]   - org.eclipse.jetty.util.Promise
	[WARNING]   - 247 more...
	[WARNING] jetty-http-9.3.25.v20180904.jar, jetty-runner-9.3.25.v20180904.jar define 73 overlapping classes: 
	[WARNING]   - org.eclipse.jetty.http.pathmap.PathSpec
	[WARNING]   - org.eclipse.jetty.http.HttpParser$HttpHandler
	[WARNING]   - org.eclipse.jetty.http.BadMessageException
	[WARNING]   - org.eclipse.jetty.http.HttpGenerator$PreparedResponse
	[WARNING]   - org.eclipse.jetty.http.HttpParser$1
	[WARNING]   - org.eclipse.jetty.http.HttpParser$IllegalCharacterException
	[WARNING]   - org.eclipse.jetty.http.PathMap$PathSet
	[WARNING]   - org.eclipse.jetty.http.HttpField$IntValueHttpField
	[WARNING]   - org.eclipse.jetty.http.PreEncodedHttpField$1
	[WARNING]   - org.eclipse.jetty.http.HttpVersion
	[WARNING]   - 63 more...
	[WARNING] jetty-runner-9.3.25.v20180904.jar, taglibs-standard-impl-1.2.5.jar define 130 overlapping classes: 
	[WARNING]   - org.apache.taglibs.standard.tag.common.core.ForEachSupport$IteratedDeferredIterator
	[WARNING]   - org.apache.taglibs.standard.tag.common.fmt.ParamSupport
	[WARNING]   - org.apache.taglibs.standard.tag.common.core.WhenTagSupport
	[WARNING]   - org.apache.taglibs.standard.tag.common.core.ChooseTag
	[WARNING]   - org.apache.taglibs.standard.tag.common.xml.WhenTag
	[WARNING]   - org.apache.taglibs.standard.tag.common.core.ParamSupport$ParamManager
	[WARNING]   - org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag
	[WARNING]   - org.apache.taglibs.standard.tag.rt.fmt.ParseDateTag
	[WARNING]   - org.apache.taglibs.standard.tag.common.core.ForEachSupport$EnumerationIterator
	[WARNING]   - org.apache.taglibs.standard.tag.rt.core.WhenTag
	[WARNING]   - 120 more...
	[WARNING] maven-shade-plugin has detected that some class files are
	[WARNING] present in two or more JARs. When this happens, only one
	[WARNING] single version of the class is copied to the uber jar.
	[WARNING] Usually this is not harmful and you can skip these warnings,
	[WARNING] otherwise try to manually exclude artifacts based on
	[WARNING] mvn dependency:tree -Ddetail=true and the above output.
	[WARNING] See http://maven.apache.org/plugins/maven-shade-plugin/
	[INFO] Attaching shaded artifact.
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Beeline 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: http://www.datanucleus.org/downloads/maven2/postgresql/postgresql/9.1-901.jdbc4/postgresql-9.1-901.jdbc4.pom
	Downloading: https://repo.maven.apache.org/maven2/postgresql/postgresql/9.1-901.jdbc4/postgresql-9.1-901.jdbc4.pom
	Downloaded: https://repo.maven.apache.org/maven2/postgresql/postgresql/9.1-901.jdbc4/postgresql-9.1-901.jdbc4.pom (2 KB at 2.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/postgresql/postgresql/9.1-901.jdbc4/postgresql-9.1-901.jdbc4.jar
	Downloading: https://repo.maven.apache.org/maven2/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.jar
	Downloading: https://repo.maven.apache.org/maven2/postgresql/postgresql/9.1-901.jdbc4/postgresql-9.1-901.jdbc4.jar
	Downloaded: https://repo.maven.apache.org/maven2/postgresql/postgresql/9.1-901.jdbc4/postgresql-9.1-901.jdbc4.jar (528 KB at 42.4 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.jar (718 KB at 33.9 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-beeline ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/beeline (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-beeline ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-beeline ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-beeline ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-beeline ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-beeline ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 3 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-beeline ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-beeline ---
	[INFO] Compiling 45 source files to /Users/xubo/Desktop/xubo/git/hive/beeline/target/classes
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/beeline/src/java/org/apache/hive/beeline/SunSignalHandler.java:[28,16] sun.misc.Signal is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/beeline/src/java/org/apache/hive/beeline/SunSignalHandler.java:[29,16] sun.misc.SignalHandler is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/beeline/src/java/org/apache/hive/beeline/SunSignalHandler.java:[28,16] sun.misc.Signal is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/beeline/src/java/org/apache/hive/beeline/SunSignalHandler.java:[29,16] sun.misc.SignalHandler is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/beeline/src/java/org/apache/hive/beeline/SunSignalHandler.java:[28,16] sun.misc.Signal is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/beeline/src/java/org/apache/hive/beeline/SunSignalHandler.java:[29,16] sun.misc.SignalHandler is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/beeline/src/java/org/apache/hive/beeline/SunSignalHandler.java:[31,64] sun.misc.SignalHandler is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/beeline/src/java/org/apache/hive/beeline/SunSignalHandler.java:[39,24] sun.misc.Signal is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/beeline/src/java/org/apache/hive/beeline/SunSignalHandler.java:[39,5] sun.misc.Signal is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/beeline/src/java/org/apache/hive/beeline/SunSignalHandler.java:[48,23] sun.misc.Signal is internal proprietary API and may be removed in a future release
	[INFO] /Users/xubo/Desktop/xubo/git/hive/beeline/src/java/org/apache/hive/beeline/Commands.java: /Users/xubo/Desktop/xubo/git/hive/beeline/src/java/org/apache/hive/beeline/Commands.java uses or overrides a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/beeline/src/java/org/apache/hive/beeline/Commands.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/beeline/src/java/org/apache/hive/beeline/BeeLineOpts.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/beeline/src/java/org/apache/hive/beeline/BeeLineOpts.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-beeline ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 9 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-beeline ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/beeline/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/beeline/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/beeline/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/beeline/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-beeline ---
	[INFO] Compiling 15 source files to /Users/xubo/Desktop/xubo/git/hive/beeline/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/beeline/src/test/org/apache/hive/beeline/TestBeeLineExceptionHandling.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/beeline/src/test/org/apache/hive/beeline/TestBeeLineExceptionHandling.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/beeline/src/test/org/apache/hive/beeline/hs2connection/TestUserHS2ConnectionFileParser.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/beeline/src/test/org/apache/hive/beeline/hs2connection/TestUserHS2ConnectionFileParser.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-beeline ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-beeline ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/beeline/target/hive-beeline-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-beeline ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:test-jar (default) @ hive-beeline ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/beeline/target/hive-beeline-4.0.0-SNAPSHOT-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive CLI 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-cli ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/cli (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-cli ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-cli ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-cli ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-cli ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-cli ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/cli/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-cli ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-cli ---
	[INFO] Compiling 4 source files to /Users/xubo/Desktop/xubo/git/hive/cli/target/classes
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/CliDriver.java:[88,16] sun.misc.Signal is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/CliDriver.java:[89,16] sun.misc.SignalHandler is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/CliDriver.java:[88,16] sun.misc.Signal is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/CliDriver.java:[89,16] sun.misc.SignalHandler is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/CliDriver.java:[88,16] sun.misc.Signal is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/CliDriver.java:[89,16] sun.misc.SignalHandler is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/CliDriver.java:[355,5] sun.misc.SignalHandler is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/CliDriver.java:[356,5] sun.misc.Signal is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/CliDriver.java:[361,29] sun.misc.Signal is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/CliDriver.java:[362,54] sun.misc.SignalHandler is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/CliDriver.java:[366,28] sun.misc.Signal is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/CliDriver.java:[362,19] sun.misc.Signal is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/CliDriver.java:[420,9] sun.misc.Signal is internal proprietary API and may be removed in a future release
	[INFO] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/RCFileCat.java: /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/RCFileCat.java uses or overrides a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/RCFileCat.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/CliDriver.java: /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/CliDriver.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/cli/src/java/org/apache/hadoop/hive/cli/CliDriver.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-cli ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/cli/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-cli ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/cli/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/cli/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/cli/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/cli/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-cli ---
	[INFO] Compiling 4 source files to /Users/xubo/Desktop/xubo/git/hive/cli/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/cli/src/test/org/apache/hadoop/hive/cli/TestCliDriverMethods.java: /Users/xubo/Desktop/xubo/git/hive/cli/src/test/org/apache/hadoop/hive/cli/TestCliDriverMethods.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/cli/src/test/org/apache/hadoop/hive/cli/TestCliDriverMethods.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-cli ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-cli ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/cli/target/hive-cli-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-cli ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Contrib 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-contrib ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/contrib (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-contrib ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-contrib ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-contrib ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-contrib ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-contrib ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/contrib/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-contrib ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-contrib ---
	[INFO] Compiling 40 source files to /Users/xubo/Desktop/xubo/git/hive/contrib/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/contrib/src/java/org/apache/hadoop/hive/contrib/udaf/example/UDAFExampleGroupConcat.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/contrib/src/java/org/apache/hadoop/hive/contrib/udaf/example/UDAFExampleGroupConcat.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/contrib/src/java/org/apache/hadoop/hive/contrib/udf/example/UDFExampleStructPrint.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/contrib/src/java/org/apache/hadoop/hive/contrib/udf/example/UDFExampleStructPrint.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-contrib ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/contrib/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-contrib ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/contrib/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/contrib/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/contrib/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/contrib/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-contrib ---
	[INFO] Compiling 2 source files to /Users/xubo/Desktop/xubo/git/hive/contrib/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-contrib ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-contrib ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/contrib/target/hive-contrib-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-contrib ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Druid Handler 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: http://www.datanucleus.org/downloads/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-smile/2.9.5/jackson-dataformat-smile-2.9.5.pom
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-smile/2.9.5/jackson-dataformat-smile-2.9.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-smile/2.9.5/jackson-dataformat-smile-2.9.5.pom (2 KB at 4.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/fasterxml/jackson/dataformat/jackson-dataformats-binary/2.9.5/jackson-dataformats-binary-2.9.5.pom
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformats-binary/2.9.5/jackson-dataformats-binary-2.9.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformats-binary/2.9.5/jackson-dataformats-binary-2.9.5.pom (3 KB at 4.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/druid-server/0.12.1/druid-server-0.12.1.pom
	Downloading: https://repo.maven.apache.org/maven2/io/druid/druid-server/0.12.1/druid-server-0.12.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/druid-server/0.12.1/druid-server-0.12.1.pom (10 KB at 12.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/druid/0.12.1/druid-0.12.1.pom
	Downloading: https://repo.maven.apache.org/maven2/io/druid/druid/0.12.1/druid-0.12.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/druid/0.12.1/druid-0.12.1.pom (57 KB at 27.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/oss-parent/2/oss-parent-2.pom
	Downloading: https://repo.maven.apache.org/maven2/io/druid/oss-parent/2/oss-parent-2.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/oss-parent/2/oss-parent-2.pom (9 KB at 12.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/druid-processing/0.12.1/druid-processing-0.12.1.pom
	Downloading: https://repo.maven.apache.org/maven2/io/druid/druid-processing/0.12.1/druid-processing-0.12.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/druid-processing/0.12.1/druid-processing-0.12.1.pom (8 KB at 14.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/druid-common/0.12.1/druid-common-0.12.1.pom
	Downloading: https://repo.maven.apache.org/maven2/io/druid/druid-common/0.12.1/druid-common-0.12.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/druid-common/0.12.1/druid-common-0.12.1.pom (10 KB at 13.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/java-util/0.12.1/java-util-0.12.1.pom
	Downloading: https://repo.maven.apache.org/maven2/io/druid/java-util/0.12.1/java-util-0.12.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/java-util/0.12.1/java-util-0.12.1.pom (10 KB at 15.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/skife/config/config-magic/0.9/config-magic-0.9.pom
	Downloading: https://repo.maven.apache.org/maven2/org/skife/config/config-magic/0.9/config-magic-0.9.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/skife/config/config-magic/0.9/config-magic-0.9.pom (7 KB at 12.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/mozilla/rhino/1.7R5/rhino-1.7R5.pom
	Downloading: https://repo.maven.apache.org/maven2/org/mozilla/rhino/1.7R5/rhino-1.7R5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/mozilla/rhino/1.7R5/rhino-1.7R5.pom (2 KB at 2.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/jayway/jsonpath/json-path/2.1.0/json-path-2.1.0.pom
	Downloading: https://repo.maven.apache.org/maven2/com/jayway/jsonpath/json-path/2.1.0/json-path-2.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/jayway/jsonpath/json-path/2.1.0/json-path-2.1.0.pom (3 KB at 4.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/net/thisptr/jackson-jq/0.0.7/jackson-jq-0.0.7.pom
	Downloading: https://repo.maven.apache.org/maven2/net/thisptr/jackson-jq/0.0.7/jackson-jq-0.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/net/thisptr/jackson-jq/0.0.7/jackson-jq-0.0.7.pom (2 KB at 3.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/net/thisptr/jackson-jq-parent/0.0.7/jackson-jq-parent-0.0.7.pom
	Downloading: https://repo.maven.apache.org/maven2/net/thisptr/jackson-jq-parent/0.0.7/jackson-jq-parent-0.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/net/thisptr/jackson-jq-parent/0.0.7/jackson-jq-parent-0.0.7.pom (5 KB at 9.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/asynchttpclient/async-http-client/2.0.37/async-http-client-2.0.37.pom
	Downloading: https://repo.maven.apache.org/maven2/org/asynchttpclient/async-http-client/2.0.37/async-http-client-2.0.37.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/asynchttpclient/async-http-client/2.0.37/async-http-client-2.0.37.pom (2 KB at 3.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/asynchttpclient/async-http-client-project/2.0.37/async-http-client-project-2.0.37.pom
	Downloading: https://repo.maven.apache.org/maven2/org/asynchttpclient/async-http-client-project/2.0.37/async-http-client-project-2.0.37.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/asynchttpclient/async-http-client-project/2.0.37/async-http-client-project-2.0.37.pom (12 KB at 17.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/asynchttpclient/async-http-client-netty-utils/2.0.37/async-http-client-netty-utils-2.0.37.pom
	Downloading: https://repo.maven.apache.org/maven2/org/asynchttpclient/async-http-client-netty-utils/2.0.37/async-http-client-netty-utils-2.0.37.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/asynchttpclient/async-http-client-netty-utils/2.0.37/async-http-client-netty-utils-2.0.37.pom (639 B at 1.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-buffer/4.0.52.Final/netty-buffer-4.0.52.Final.pom
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.0.52.Final/netty-buffer-4.0.52.Final.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.0.52.Final/netty-buffer-4.0.52.Final.pom (2 KB at 3.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-common/4.0.52.Final/netty-common-4.0.52.Final.pom
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.0.52.Final/netty-common-4.0.52.Final.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.0.52.Final/netty-common-4.0.52.Final.pom (7 KB at 13.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-codec-http/4.0.52.Final/netty-codec-http-4.0.52.Final.pom
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http/4.0.52.Final/netty-codec-http-4.0.52.Final.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http/4.0.52.Final/netty-codec-http-4.0.52.Final.pom (2 KB at 3.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-codec/4.0.52.Final/netty-codec-4.0.52.Final.pom
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.0.52.Final/netty-codec-4.0.52.Final.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.0.52.Final/netty-codec-4.0.52.Final.pom (3 KB at 4.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-transport/4.0.52.Final/netty-transport-4.0.52.Final.pom
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.0.52.Final/netty-transport-4.0.52.Final.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.0.52.Final/netty-transport-4.0.52.Final.pom (2 KB at 3.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-handler/4.0.52.Final/netty-handler-4.0.52.Final.pom
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.0.52.Final/netty-handler-4.0.52.Final.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.0.52.Final/netty-handler-4.0.52.Final.pom (3 KB at 6.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-transport-native-epoll/4.0.52.Final/netty-transport-native-epoll-4.0.52.Final.pom
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-epoll/4.0.52.Final/netty-transport-native-epoll-4.0.52.Final.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-epoll/4.0.52.Final/netty-transport-native-epoll-4.0.52.Final.pom (10 KB at 16.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/asynchttpclient/netty-resolver-dns/2.0.37/netty-resolver-dns-2.0.37.pom
	Downloading: https://repo.maven.apache.org/maven2/org/asynchttpclient/netty-resolver-dns/2.0.37/netty-resolver-dns-2.0.37.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/asynchttpclient/netty-resolver-dns/2.0.37/netty-resolver-dns-2.0.37.pom (2 KB at 2.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/asynchttpclient/netty-bp/2.0.37/netty-bp-2.0.37.pom
	Downloading: https://repo.maven.apache.org/maven2/org/asynchttpclient/netty-bp/2.0.37/netty-bp-2.0.37.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/asynchttpclient/netty-bp/2.0.37/netty-bp-2.0.37.pom (2 KB at 3.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/asynchttpclient/netty-resolver/2.0.37/netty-resolver-2.0.37.pom
	Downloading: https://repo.maven.apache.org/maven2/org/asynchttpclient/netty-resolver/2.0.37/netty-resolver-2.0.37.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/asynchttpclient/netty-resolver/2.0.37/netty-resolver-2.0.37.pom (2 KB at 2.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/asynchttpclient/netty-codec-dns/2.0.37/netty-codec-dns-2.0.37.pom
	Downloading: https://repo.maven.apache.org/maven2/org/asynchttpclient/netty-codec-dns/2.0.37/netty-codec-dns-2.0.37.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/asynchttpclient/netty-codec-dns/2.0.37/netty-codec-dns-2.0.37.pom (2 KB at 2.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/reactivestreams/reactive-streams/1.0.0/reactive-streams-1.0.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/reactivestreams/reactive-streams/1.0.0/reactive-streams-1.0.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/reactivestreams/reactive-streams/1.0.0/reactive-streams-1.0.0.pom (2 KB at 2.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/typesafe/netty/netty-reactive-streams/1.0.8/netty-reactive-streams-1.0.8.pom
	Downloading: https://repo.maven.apache.org/maven2/com/typesafe/netty/netty-reactive-streams/1.0.8/netty-reactive-streams-1.0.8.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/typesafe/netty/netty-reactive-streams/1.0.8/netty-reactive-streams-1.0.8.pom (2 KB at 2.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/typesafe/netty/netty-reactive-streams-parent/1.0.8/netty-reactive-streams-parent-1.0.8.pom
	Downloading: https://repo.maven.apache.org/maven2/com/typesafe/netty/netty-reactive-streams-parent/1.0.8/netty-reactive-streams-parent-1.0.8.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/typesafe/netty/netty-reactive-streams-parent/1.0.8/netty-reactive-streams-parent-1.0.8.pom (8 KB at 13.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-handler/4.0.41.Final/netty-handler-4.0.41.Final.pom
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.0.41.Final/netty-handler-4.0.41.Final.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.0.41.Final/netty-handler-4.0.41.Final.pom (3 KB at 5.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-parent/4.0.41.Final/netty-parent-4.0.41.Final.pom
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-parent/4.0.41.Final/netty-parent-4.0.41.Final.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-parent/4.0.41.Final/netty-parent-4.0.41.Final.pom (44 KB at 31.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-buffer/4.0.41.Final/netty-buffer-4.0.41.Final.pom
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.0.41.Final/netty-buffer-4.0.41.Final.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.0.41.Final/netty-buffer-4.0.41.Final.pom (2 KB at 3.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-common/4.0.41.Final/netty-common-4.0.41.Final.pom
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.0.41.Final/netty-common-4.0.41.Final.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.0.41.Final/netty-common-4.0.41.Final.pom (7 KB at 11.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-transport/4.0.41.Final/netty-transport-4.0.41.Final.pom
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.0.41.Final/netty-transport-4.0.41.Final.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.0.41.Final/netty-transport-4.0.41.Final.pom (2 KB at 3.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-codec/4.0.41.Final/netty-codec-4.0.41.Final.pom
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.0.41.Final/netty-codec-4.0.41.Final.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.0.41.Final/netty-codec-4.0.41.Final.pom (3 KB at 4.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/gridkit/lab/jvm-attach-api/1.2/jvm-attach-api-1.2.pom
	Downloading: https://repo.maven.apache.org/maven2/org/gridkit/lab/jvm-attach-api/1.2/jvm-attach-api-1.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/gridkit/lab/jvm-attach-api/1.2/jvm-attach-api-1.2.pom (5 KB at 9.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/gridkit/lab/grid-lab-pom/2/grid-lab-pom-2.pom
	Downloading: https://repo.maven.apache.org/maven2/org/gridkit/lab/grid-lab-pom/2/grid-lab-pom-2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/gridkit/lab/grid-lab-pom/2/grid-lab-pom-2.pom (5 KB at 9.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/druid-api/0.12.1/druid-api-0.12.1.pom
	Downloading: https://repo.maven.apache.org/maven2/io/druid/druid-api/0.12.1/druid-api-0.12.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/druid-api/0.12.1/druid-api-0.12.1.pom (6 KB at 8.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/google/inject/guice/4.1.0/guice-4.1.0.pom
	Downloading: https://repo.maven.apache.org/maven2/com/google/inject/guice/4.1.0/guice-4.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/inject/guice/4.1.0/guice-4.1.0.pom (11 KB at 14.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/google/inject/guice-parent/4.1.0/guice-parent-4.1.0.pom
	Downloading: https://repo.maven.apache.org/maven2/com/google/inject/guice-parent/4.1.0/guice-parent-4.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/inject/guice-parent/4.1.0/guice-parent-4.1.0.pom (16 KB at 21.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/google/inject/extensions/guice-multibindings/4.1.0/guice-multibindings-4.1.0.pom
	Downloading: https://repo.maven.apache.org/maven2/com/google/inject/extensions/guice-multibindings/4.1.0/guice-multibindings-4.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/inject/extensions/guice-multibindings/4.1.0/guice-multibindings-4.1.0.pom (549 B at 1.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/google/inject/extensions/extensions-parent/4.1.0/extensions-parent-4.1.0.pom
	Downloading: https://repo.maven.apache.org/maven2/com/google/inject/extensions/extensions-parent/4.1.0/extensions-parent-4.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/inject/extensions/extensions-parent/4.1.0/extensions-parent-4.1.0.pom (4 KB at 6.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/airlift/airline/0.7/airline-0.7.pom
	Downloading: https://repo.maven.apache.org/maven2/io/airlift/airline/0.7/airline-0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/airlift/airline/0.7/airline-0.7.pom (3 KB at 4.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/it/unimi/dsi/fastutil/8.1.0/fastutil-8.1.0.pom
	Downloading: https://repo.maven.apache.org/maven2/it/unimi/dsi/fastutil/8.1.0/fastutil-8.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/it/unimi/dsi/fastutil/8.1.0/fastutil-8.1.0.pom (2 KB at 2.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/commons/commons-dbcp2/2.0.1/commons-dbcp2-2.0.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-dbcp2/2.0.1/commons-dbcp2-2.0.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-dbcp2/2.0.1/commons-dbcp2-2.0.1.pom (14 KB at 19.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/commons-pool/commons-pool/1.6/commons-pool-1.6.pom
	Downloading: https://repo.maven.apache.org/maven2/commons-pool/commons-pool/1.6/commons-pool-1.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/commons-pool/commons-pool/1.6/commons-pool-1.6.pom (11 KB at 17.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/javax/el/javax.el-api/3.0.0/javax.el-api-3.0.0.pom
	Downloading: https://repo.maven.apache.org/maven2/javax/el/javax.el-api/3.0.0/javax.el-api-3.0.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/javax/el/javax.el-api/3.0.0/javax.el-api-3.0.0.pom (12 KB at 16.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/fasterxml/jackson/datatype/jackson-datatype-guava/2.4.6/jackson-datatype-guava-2.4.6.pom
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-guava/2.4.6/jackson-datatype-guava-2.4.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-guava/2.4.6/jackson-datatype-guava-2.4.6.pom (4 KB at 7.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/fasterxml/jackson/datatype/jackson-datatype-joda/2.4.6/jackson-datatype-joda-2.4.6.pom
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-joda/2.4.6/jackson-datatype-joda-2.4.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-joda/2.4.6/jackson-datatype-joda-2.4.6.pom (4 KB at 6.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/jdbi/jdbi/2.63.1/jdbi-2.63.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/jdbi/jdbi/2.63.1/jdbi-2.63.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/jdbi/jdbi/2.63.1/jdbi-2.63.1.pom (12 KB at 18.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/basepom/basepom-standard-oss/11/basepom-standard-oss-11.pom
	Downloading: https://repo.maven.apache.org/maven2/org/basepom/basepom-standard-oss/11/basepom-standard-oss-11.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/basepom/basepom-standard-oss/11/basepom-standard-oss-11.pom (10 KB at 18.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/basepom/basepom-standard/11/basepom-standard-11.pom
	Downloading: https://repo.maven.apache.org/maven2/org/basepom/basepom-standard/11/basepom-standard-11.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/basepom/basepom-standard/11/basepom-standard-11.pom (43 KB at 40.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/basepom/basepom-foundation/11/basepom-foundation-11.pom
	Downloading: https://repo.maven.apache.org/maven2/org/basepom/basepom-foundation/11/basepom-foundation-11.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/basepom/basepom-foundation/11/basepom-foundation-11.pom (46 KB at 42.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/logging/log4j/log4j-api/2.5/log4j-api-2.5.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-api/2.5/log4j-api-2.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-api/2.5/log4j-api-2.5.pom (8 KB at 15.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/logging/log4j/log4j/2.5/log4j-2.5.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j/2.5/log4j-2.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j/2.5/log4j-2.5.pom (49 KB at 48.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/logging/log4j/log4j-core/2.5/log4j-core-2.5.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-core/2.5/log4j-core-2.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-core/2.5/log4j-core-2.5.pom (17 KB at 28.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/logging/log4j/log4j-jul/2.5/log4j-jul-2.5.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-jul/2.5/log4j-jul-2.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-jul/2.5/log4j-jul-2.5.pom (8 KB at 14.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/antlr/antlr4-runtime/4.5.1/antlr4-runtime-4.5.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.5.1/antlr4-runtime-4.5.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.5.1/antlr4-runtime-4.5.1.pom (3 KB at 4.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/antlr/antlr4-master/4.5.1/antlr4-master-4.5.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/antlr/antlr4-master/4.5.1/antlr4-master-4.5.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/antlr/antlr4-master/4.5.1/antlr4-master-4.5.1.pom (4 KB at 7.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/druid-hll/0.12.1/druid-hll-0.12.1.pom
	Downloading: https://repo.maven.apache.org/maven2/io/druid/druid-hll/0.12.1/druid-hll-0.12.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/druid-hll/0.12.1/druid-hll-0.12.1.pom (3 KB at 5.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/extendedset/0.12.1/extendedset-0.12.1.pom
	Downloading: https://repo.maven.apache.org/maven2/io/druid/extendedset/0.12.1/extendedset-0.12.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/extendedset/0.12.1/extendedset-0.12.1.pom (3 KB at 4.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/roaringbitmap/RoaringBitmap/0.5.18/RoaringBitmap-0.5.18.pom
	Downloading: https://repo.maven.apache.org/maven2/org/roaringbitmap/RoaringBitmap/0.5.18/RoaringBitmap-0.5.18.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/roaringbitmap/RoaringBitmap/0.5.18/RoaringBitmap-0.5.18.pom (7 KB at 11.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/ning/compress-lzf/1.0.4/compress-lzf-1.0.4.pom
	Downloading: https://repo.maven.apache.org/maven2/com/ning/compress-lzf/1.0.4/compress-lzf-1.0.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/ning/compress-lzf/1.0.4/compress-lzf-1.0.4.pom (9 KB at 14.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/ibm/icu/icu4j/54.1.1/icu4j-54.1.1.pom
	Downloading: https://repo.maven.apache.org/maven2/com/ibm/icu/icu4j/54.1.1/icu4j-54.1.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/ibm/icu/icu4j/54.1.1/icu4j-54.1.1.pom (5 KB at 9.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/mapdb/mapdb/1.0.8/mapdb-1.0.8.pom
	Downloading: https://repo.maven.apache.org/maven2/org/mapdb/mapdb/1.0.8/mapdb-1.0.8.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/mapdb/mapdb/1.0.8/mapdb-1.0.8.pom (11 KB at 17.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/ow2/asm/asm/5.2/asm-5.2.pom
	Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/5.2/asm-5.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/5.2/asm-5.2.pom (2 KB at 4.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/ow2/asm/asm-commons/5.2/asm-commons-5.2.pom
	Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/5.2/asm-commons-5.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/5.2/asm-commons-5.2.pom (3 KB at 4.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/ow2/asm/asm-tree/5.2/asm-tree-5.2.pom
	Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/5.2/asm-tree-5.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/5.2/asm-tree-5.2.pom (3 KB at 4.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/druid-console/0.0.2/druid-console-0.0.2.pom
	Downloading: https://repo.maven.apache.org/maven2/io/druid/druid-console/0.0.2/druid-console-0.0.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/druid-console/0.0.2/druid-console-0.0.2.pom (5 KB at 9.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/curator/curator-x-discovery/4.0.0/curator-x-discovery-4.0.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/curator/curator-x-discovery/4.0.0/curator-x-discovery-4.0.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/curator/curator-x-discovery/4.0.0/curator-x-discovery-4.0.0.pom (3 KB at 4.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/curator/apache-curator/4.0.0/apache-curator-4.0.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/curator/apache-curator/4.0.0/apache-curator-4.0.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/curator/apache-curator/4.0.0/apache-curator-4.0.0.pom (33 KB at 16.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-smile-provider/2.4.6/jackson-jaxrs-smile-provider-2.4.6.pom
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-smile-provider/2.4.6/jackson-jaxrs-smile-provider-2.4.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-smile-provider/2.4.6/jackson-jaxrs-smile-provider-2.4.6.pom (4 KB at 4.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-providers/2.4.6/jackson-jaxrs-providers-2.4.6.pom
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-providers/2.4.6/jackson-jaxrs-providers-2.4.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-providers/2.4.6/jackson-jaxrs-providers-2.4.6.pom (4 KB at 7.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-base/2.4.6/jackson-jaxrs-base-2.4.6.pom
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-base/2.4.6/jackson-jaxrs-base-2.4.6.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-base/2.4.6/jackson-jaxrs-base-2.4.6.pom (2 KB at 3.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/google/inject/extensions/guice-servlet/4.1.0/guice-servlet-4.1.0.pom
	Downloading: https://repo.maven.apache.org/maven2/com/google/inject/extensions/guice-servlet/4.1.0/guice-servlet-4.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/inject/extensions/guice-servlet/4.1.0/guice-servlet-4.1.0.pom (917 B at 2.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/sun/jersey/contribs/jersey-guice/1.19.3/jersey-guice-1.19.3.pom
	Downloading: https://repo.maven.apache.org/maven2/com/sun/jersey/contribs/jersey-guice/1.19.3/jersey-guice-1.19.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/sun/jersey/contribs/jersey-guice/1.19.3/jersey-guice-1.19.3.pom (8 KB at 13.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/sun/jersey/contribs/jersey-contribs/1.19.3/jersey-contribs-1.19.3.pom
	Downloading: https://repo.maven.apache.org/maven2/com/sun/jersey/contribs/jersey-contribs/1.19.3/jersey-contribs-1.19.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/sun/jersey/contribs/jersey-contribs/1.19.3/jersey-contribs-1.19.3.pom (4 KB at 6.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/sun/jersey/jersey-project/1.19.3/jersey-project-1.19.3.pom
	Downloading: https://repo.maven.apache.org/maven2/com/sun/jersey/jersey-project/1.19.3/jersey-project-1.19.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/sun/jersey/jersey-project/1.19.3/jersey-project-1.19.3.pom (27 KB at 18.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-proxy/9.3.19.v20170502/jetty-proxy-9.3.19.v20170502.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-proxy/9.3.19.v20170502/jetty-proxy-9.3.19.v20170502.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-proxy/9.3.19.v20170502/jetty-proxy-9.3.19.v20170502.pom (3 KB at 4.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-client/9.3.19.v20170502/jetty-client-9.3.19.v20170502.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-client/9.3.19.v20170502/jetty-client-9.3.19.v20170502.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-client/9.3.19.v20170502/jetty-client-9.3.19.v20170502.pom (3 KB at 6.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/tesla/aether/tesla-aether/0.0.5/tesla-aether-0.0.5.pom
	Downloading: https://repo.maven.apache.org/maven2/io/tesla/aether/tesla-aether/0.0.5/tesla-aether-0.0.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/tesla/aether/tesla-aether/0.0.5/tesla-aether-0.0.5.pom (8 KB at 11.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/tesla/tesla/5/tesla-5.pom
	Downloading: https://repo.maven.apache.org/maven2/io/tesla/tesla/5/tesla-5.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/tesla/tesla/5/tesla-5.pom (10 KB at 13.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/aether/aether-connector-file/0.9.0.M2/aether-connector-file-0.9.0.M2.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-connector-file/0.9.0.M2/aether-connector-file-0.9.0.M2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-connector-file/0.9.0.M2/aether-connector-file-0.9.0.M2.pom (3 KB at 5.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/tesla/aether/aether-connector-okhttp/0.0.9/aether-connector-okhttp-0.0.9.pom
	Downloading: https://repo.maven.apache.org/maven2/io/tesla/aether/aether-connector-okhttp/0.0.9/aether-connector-okhttp-0.0.9.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/tesla/aether/aether-connector-okhttp/0.0.9/aether-connector-okhttp-0.0.9.pom (8 KB at 14.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/squareup/okhttp/okhttp/1.0.2/okhttp-1.0.2.pom
	Downloading: https://repo.maven.apache.org/maven2/com/squareup/okhttp/okhttp/1.0.2/okhttp-1.0.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/squareup/okhttp/okhttp/1.0.2/okhttp-1.0.2.pom (2 KB at 2.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/squareup/okhttp/parent/1.0.2/parent-1.0.2.pom
	Downloading: https://repo.maven.apache.org/maven2/com/squareup/okhttp/parent/1.0.2/parent-1.0.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/squareup/okhttp/parent/1.0.2/parent-1.0.2.pom (5 KB at 9.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/maven/wagon/wagon-provider-api/2.4/wagon-provider-api-2.4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/2.4/wagon-provider-api-2.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/2.4/wagon-provider-api-2.4.pom (2 KB at 3.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/maven/wagon/wagon/2.4/wagon-2.4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon/2.4/wagon-2.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon/2.4/wagon-2.4.pom (20 KB at 24.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/net/spy/spymemcached/2.12.3/spymemcached-2.12.3.pom
	Downloading: https://repo.maven.apache.org/maven2/net/spy/spymemcached/2.12.3/spymemcached-2.12.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/net/spy/spymemcached/2.12.3/spymemcached-2.12.3.pom (2 KB at 3.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-servlets/9.3.19.v20170502/jetty-servlets-9.3.19.v20170502.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-servlets/9.3.19.v20170502/jetty-servlets-9.3.19.v20170502.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-servlets/9.3.19.v20170502/jetty-servlets-9.3.19.v20170502.pom (3 KB at 6.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-continuation/9.3.19.v20170502/jetty-continuation-9.3.19.v20170502.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-continuation/9.3.19.v20170502/jetty-continuation-9.3.19.v20170502.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-continuation/9.3.19.v20170502/jetty-continuation-9.3.19.v20170502.pom (2 KB at 2.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/ircclouds/irc/irc-api/1.0-0014/irc-api-1.0-0014.pom
	Downloading: https://repo.maven.apache.org/maven2/com/ircclouds/irc/irc-api/1.0-0014/irc-api-1.0-0014.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/ircclouds/irc/irc-api/1.0-0014/irc-api-1.0-0014.pom (4 KB at 7.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/maxmind/geoip2/geoip2/0.4.0/geoip2-0.4.0.pom
	Downloading: https://repo.maven.apache.org/maven2/com/maxmind/geoip2/geoip2/0.4.0/geoip2-0.4.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/maxmind/geoip2/geoip2/0.4.0/geoip2-0.4.0.pom (4 KB at 6.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/maxmind/maxminddb/maxminddb/0.2.0/maxminddb-0.2.0.pom
	Downloading: https://repo.maven.apache.org/maven2/com/maxmind/maxminddb/maxminddb/0.2.0/maxminddb-0.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/maxmind/maxminddb/maxminddb/0.2.0/maxminddb-0.2.0.pom (3 KB at 6.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/derby/derbynet/10.11.1.1/derbynet-10.11.1.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/derby/derbynet/10.11.1.1/derbynet-10.11.1.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/derby/derbynet/10.11.1.1/derbynet-10.11.1.1.pom (3 KB at 5.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/derby/derby-project/10.11.1.1/derby-project-10.11.1.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/derby/derby-project/10.11.1.1/derby-project-10.11.1.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/derby/derby-project/10.11.1.1/derby-project-10.11.1.1.pom (6 KB at 11.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/derby/derbyclient/10.11.1.1/derbyclient-10.11.1.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/derby/derbyclient/10.11.1.1/derbyclient-10.11.1.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/derby/derbyclient/10.11.1.1/derbyclient-10.11.1.1.pom (3 KB at 4.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/github/ben-manes/caffeine/caffeine/2.5.5/caffeine-2.5.5.pom
	Downloading: https://repo.maven.apache.org/maven2/com/github/ben-manes/caffeine/caffeine/2.5.5/caffeine-2.5.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/github/ben-manes/caffeine/caffeine/2.5.5/caffeine-2.5.5.pom (6 KB at 9.8 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/extensions/druid-hdfs-storage/0.12.1/druid-hdfs-storage-0.12.1.pom
	Downloading: https://repo.maven.apache.org/maven2/io/druid/extensions/druid-hdfs-storage/0.12.1/druid-hdfs-storage-0.12.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/extensions/druid-hdfs-storage/0.12.1/druid-hdfs-storage-0.12.1.pom (8 KB at 15.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/extensions/mysql-metadata-storage/0.12.1/mysql-metadata-storage-0.12.1.pom
	Downloading: https://repo.maven.apache.org/maven2/io/druid/extensions/mysql-metadata-storage/0.12.1/mysql-metadata-storage-0.12.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/extensions/mysql-metadata-storage/0.12.1/mysql-metadata-storage-0.12.1.pom (3 KB at 5.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/extensions/postgresql-metadata-storage/0.12.1/postgresql-metadata-storage-0.12.1.pom
	Downloading: https://repo.maven.apache.org/maven2/io/druid/extensions/postgresql-metadata-storage/0.12.1/postgresql-metadata-storage-0.12.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/extensions/postgresql-metadata-storage/0.12.1/postgresql-metadata-storage-0.12.1.pom (3 KB at 5.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/postgresql/postgresql/9.4.1208.jre7/postgresql-9.4.1208.jre7.pom
	Downloading: https://repo.maven.apache.org/maven2/org/postgresql/postgresql/9.4.1208.jre7/postgresql-9.4.1208.jre7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/postgresql/postgresql/9.4.1208.jre7/postgresql-9.4.1208.jre7.pom (5 KB at 9.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/postgresql/pgjdbc-core-prevjre/1.0.5/pgjdbc-core-prevjre-1.0.5.pom
	Downloading: https://repo.maven.apache.org/maven2/org/postgresql/pgjdbc-core-prevjre/1.0.5/pgjdbc-core-prevjre-1.0.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/postgresql/pgjdbc-core-prevjre/1.0.5/pgjdbc-core-prevjre-1.0.5.pom (7 KB at 12.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/postgresql/pgjdbc-core-parent/1.0.5/pgjdbc-core-parent-1.0.5.pom
	Downloading: https://repo.maven.apache.org/maven2/org/postgresql/pgjdbc-core-parent/1.0.5/pgjdbc-core-parent-1.0.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/postgresql/pgjdbc-core-parent/1.0.5/pgjdbc-core-parent-1.0.5.pom (15 KB at 15.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/postgresql/pgjdbc-versions/1.0.5/pgjdbc-versions-1.0.5.pom
	Downloading: https://repo.maven.apache.org/maven2/org/postgresql/pgjdbc-versions/1.0.5/pgjdbc-versions-1.0.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/postgresql/pgjdbc-versions/1.0.5/pgjdbc-versions-1.0.5.pom (21 KB at 25.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/druid-indexing-hadoop/0.12.1/druid-indexing-hadoop-0.12.1.pom
	Downloading: https://repo.maven.apache.org/maven2/io/druid/druid-indexing-hadoop/0.12.1/druid-indexing-hadoop-0.12.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/druid-indexing-hadoop/0.12.1/druid-indexing-hadoop-0.12.1.pom (7 KB at 12.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/druid-aws-common/0.12.1/druid-aws-common-0.12.1.pom
	Downloading: https://repo.maven.apache.org/maven2/io/druid/druid-aws-common/0.12.1/druid-aws-common-0.12.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/druid-aws-common/0.12.1/druid-aws-common-0.12.1.pom (2 KB at 3.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/amazonaws/aws-java-sdk-ec2/1.10.77/aws-java-sdk-ec2-1.10.77.pom
	Downloading: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-ec2/1.10.77/aws-java-sdk-ec2-1.10.77.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-ec2/1.10.77/aws-java-sdk-ec2-1.10.77.pom (4 KB at 6.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/amazonaws/aws-java-sdk-pom/1.10.77/aws-java-sdk-pom-1.10.77.pom
	Downloading: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-pom/1.10.77/aws-java-sdk-pom-1.10.77.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-pom/1.10.77/aws-java-sdk-pom-1.10.77.pom (9 KB at 14.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/amazonaws/aws-java-sdk-core/1.10.77/aws-java-sdk-core-1.10.77.pom
	Downloading: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-core/1.10.77/aws-java-sdk-core-1.10.77.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-core/1.10.77/aws-java-sdk-core-1.10.77.pom (4 KB at 7.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.5.3/jackson-dataformat-cbor-2.5.3.pom
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.5.3/jackson-dataformat-cbor-2.5.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.5.3/jackson-dataformat-cbor-2.5.3.pom (3 KB at 5.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-smile/2.9.5/jackson-dataformat-smile-2.9.5.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/druid-server/0.12.1/druid-server-0.12.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/druid-console/0.0.2/druid-console-0.0.2.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/java-util/0.12.1/java-util-0.12.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/jayway/jsonpath/json-path/2.1.0/json-path-2.1.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/net/thisptr/jackson-jq/0.0.7/jackson-jq-0.0.7.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/asynchttpclient/async-http-client/2.0.37/async-http-client-2.0.37.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/asynchttpclient/async-http-client-netty-utils/2.0.37/async-http-client-netty-utils-2.0.37.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-codec-http/4.0.52.Final/netty-codec-http-4.0.52.Final.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-codec/4.0.52.Final/netty-codec-4.0.52.Final.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-handler/4.0.52.Final/netty-handler-4.0.52.Final.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-transport/4.0.52.Final/netty-transport-4.0.52.Final.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-transport-native-epoll/4.0.52.Final/netty-transport-native-epoll-4.0.52.Final-linux-x86_64.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/asynchttpclient/netty-resolver-dns/2.0.37/netty-resolver-dns-2.0.37.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/asynchttpclient/netty-resolver/2.0.37/netty-resolver-2.0.37.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/asynchttpclient/netty-codec-dns/2.0.37/netty-codec-dns-2.0.37.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/reactivestreams/reactive-streams/1.0.0/reactive-streams-1.0.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/typesafe/netty/netty-reactive-streams/1.0.8/netty-reactive-streams-1.0.8.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/gridkit/lab/jvm-attach-api/1.2/jvm-attach-api-1.2.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/curator/curator-x-discovery/4.0.0/curator-x-discovery-4.0.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-smile-provider/2.4.6/jackson-jaxrs-smile-provider-2.4.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/google/inject/extensions/guice-servlet/4.1.0/guice-servlet-4.1.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/google/inject/guice/4.1.0/guice-4.1.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/sun/jersey/contribs/jersey-guice/1.19.3/jersey-guice-1.19.3.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-proxy/9.3.19.v20170502/jetty-proxy-9.3.19.v20170502.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-client/9.3.19.v20170502/jetty-client-9.3.19.v20170502.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/tesla/aether/tesla-aether/0.0.5/tesla-aether-0.0.5.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/aether/aether-connector-file/0.9.0.M2/aether-connector-file-0.9.0.M2.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/tesla/aether/aether-connector-okhttp/0.0.9/aether-connector-okhttp-0.0.9.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/maven/wagon/wagon-provider-api/2.4/wagon-provider-api-2.4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/net/spy/spymemcached/2.12.3/spymemcached-2.12.3.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-servlets/9.3.19.v20170502/jetty-servlets-9.3.19.v20170502.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jetty/jetty-continuation/9.3.19.v20170502/jetty-continuation-9.3.19.v20170502.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/ircclouds/irc/irc-api/1.0-0014/irc-api-1.0-0014.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/maxmind/geoip2/geoip2/0.4.0/geoip2-0.4.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/maxmind/maxminddb/maxminddb/0.2.0/maxminddb-0.2.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/derby/derbynet/10.11.1.1/derbynet-10.11.1.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/derby/derbyclient/10.11.1.1/derbyclient-10.11.1.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/it/unimi/dsi/fastutil/8.1.0/fastutil-8.1.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/github/ben-manes/caffeine/caffeine/2.5.5/caffeine-2.5.5.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/druid-processing/0.12.1/druid-processing-0.12.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/druid-common/0.12.1/druid-common-0.12.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/druid-api/0.12.1/druid-api-0.12.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/airlift/airline/0.7/airline-0.7.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/javax/el/javax.el-api/3.0.0/javax.el-api-3.0.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/fasterxml/jackson/datatype/jackson-datatype-guava/2.4.6/jackson-datatype-guava-2.4.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/fasterxml/jackson/datatype/jackson-datatype-joda/2.4.6/jackson-datatype-joda-2.4.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/google/inject/extensions/guice-multibindings/4.1.0/guice-multibindings-4.1.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/logging/log4j/log4j-jul/2.5/log4j-jul-2.5.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/slf4j/jcl-over-slf4j/1.7.12/jcl-over-slf4j-1.7.12.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/antlr/antlr4-runtime/4.5.1/antlr4-runtime-4.5.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/druid-hll/0.12.1/druid-hll-0.12.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/extendedset/0.12.1/extendedset-0.12.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/roaringbitmap/RoaringBitmap/0.5.18/RoaringBitmap-0.5.18.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/ning/compress-lzf/1.0.4/compress-lzf-1.0.4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/skife/config/config-magic/0.9/config-magic-0.9.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/ibm/icu/icu4j/54.1.1/icu4j-54.1.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/mozilla/rhino/1.7R5/rhino-1.7R5.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/mapdb/mapdb/1.0.8/mapdb-1.0.8.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/ow2/asm/asm/5.2/asm-5.2.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/ow2/asm/asm-commons/5.2/asm-commons-5.2.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/ow2/asm/asm-tree/5.2/asm-tree-5.2.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/extensions/druid-hdfs-storage/0.12.1/druid-hdfs-storage-0.12.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/extensions/mysql-metadata-storage/0.12.1/mysql-metadata-storage-0.12.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/extensions/postgresql-metadata-storage/0.12.1/postgresql-metadata-storage-0.12.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/postgresql/postgresql/9.4.1208.jre7/postgresql-9.4.1208.jre7.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/druid/druid-indexing-hadoop/0.12.1/druid-indexing-hadoop-0.12.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/jdbi/jdbi/2.63.1/jdbi-2.63.1.jar
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-smile/2.9.5/jackson-dataformat-smile-2.9.5.jar
	Downloading: https://repo.maven.apache.org/maven2/io/druid/druid-server/0.12.1/druid-server-0.12.1.jar
	Downloading: https://repo.maven.apache.org/maven2/io/druid/druid-console/0.0.2/druid-console-0.0.2.jar
	Downloading: https://repo.maven.apache.org/maven2/io/druid/java-util/0.12.1/java-util-0.12.1.jar
	Downloading: https://repo.maven.apache.org/maven2/com/jayway/jsonpath/json-path/2.1.0/json-path-2.1.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/jayway/jsonpath/json-path/2.1.0/json-path-2.1.0.jar (186 KB at 22.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/net/thisptr/jackson-jq/0.0.7/jackson-jq-0.0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-smile/2.9.5/jackson-dataformat-smile-2.9.5.jar (83 KB at 7.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/asynchttpclient/async-http-client/2.0.37/async-http-client-2.0.37.jar
	Downloaded: https://repo.maven.apache.org/maven2/net/thisptr/jackson-jq/0.0.7/jackson-jq-0.0.7.jar (245 KB at 16.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/asynchttpclient/async-http-client-netty-utils/2.0.37/async-http-client-netty-utils-2.0.37.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/asynchttpclient/async-http-client-netty-utils/2.0.37/async-http-client-netty-utils-2.0.37.jar (8 KB at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http/4.0.52.Final/netty-codec-http-4.0.52.Final.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/asynchttpclient/async-http-client/2.0.37/async-http-client-2.0.37.jar (424 KB at 10.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.0.52.Final/netty-codec-4.0.52.Final.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.0.52.Final/netty-codec-4.0.52.Final.jar (148 KB at 2.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.0.52.Final/netty-handler-4.0.52.Final.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http/4.0.52.Final/netty-codec-http-4.0.52.Final.jar (451 KB at 8.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.0.52.Final/netty-transport-4.0.52.Final.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/druid-console/0.0.2/druid-console-0.0.2.jar (607 KB at 11.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-epoll/4.0.52.Final/netty-transport-native-epoll-4.0.52.Final-linux-x86_64.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-epoll/4.0.52.Final/netty-transport-native-epoll-4.0.52.Final-linux-x86_64.jar (149 KB at 2.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/asynchttpclient/netty-resolver-dns/2.0.37/netty-resolver-dns-2.0.37.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/asynchttpclient/netty-resolver-dns/2.0.37/netty-resolver-dns-2.0.37.jar (88 KB at 1.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/asynchttpclient/netty-resolver/2.0.37/netty-resolver-2.0.37.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.0.52.Final/netty-transport-4.0.52.Final.jar (379 KB at 5.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/asynchttpclient/netty-codec-dns/2.0.37/netty-codec-dns-2.0.37.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/asynchttpclient/netty-resolver/2.0.37/netty-resolver-2.0.37.jar (36 KB at 0.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/reactivestreams/reactive-streams/1.0.0/reactive-streams-1.0.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/asynchttpclient/netty-codec-dns/2.0.37/netty-codec-dns-2.0.37.jar (54 KB at 0.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/typesafe/netty/netty-reactive-streams/1.0.8/netty-reactive-streams-1.0.8.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/reactivestreams/reactive-streams/1.0.0/reactive-streams-1.0.0.jar (2 KB at 0.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/gridkit/lab/jvm-attach-api/1.2/jvm-attach-api-1.2.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.0.52.Final/netty-handler-4.0.52.Final.jar (351 KB at 4.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/curator/curator-x-discovery/4.0.0/curator-x-discovery-4.0.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/typesafe/netty/netty-reactive-streams/1.0.8/netty-reactive-streams-1.0.8.jar (21 KB at 0.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-smile-provider/2.4.6/jackson-jaxrs-smile-provider-2.4.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/gridkit/lab/jvm-attach-api/1.2/jvm-attach-api-1.2.jar (58 KB at 0.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/inject/extensions/guice-servlet/4.1.0/guice-servlet-4.1.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-smile-provider/2.4.6/jackson-jaxrs-smile-provider-2.4.6.jar (16 KB at 0.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/inject/guice/4.1.0/guice-4.1.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/google/inject/extensions/guice-servlet/4.1.0/guice-servlet-4.1.0.jar (81 KB at 0.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/sun/jersey/contribs/jersey-guice/1.19.3/jersey-guice-1.19.3.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/curator/curator-x-discovery/4.0.0/curator-x-discovery-4.0.0.jar (63 KB at 0.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-proxy/9.3.19.v20170502/jetty-proxy-9.3.19.v20170502.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/sun/jersey/contribs/jersey-guice/1.19.3/jersey-guice-1.19.3.jar (16 KB at 0.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-client/9.3.19.v20170502/jetty-client-9.3.19.v20170502.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-proxy/9.3.19.v20170502/jetty-proxy-9.3.19.v20170502.jar (85 KB at 0.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/tesla/aether/tesla-aether/0.0.5/tesla-aether-0.0.5.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/tesla/aether/tesla-aether/0.0.5/tesla-aether-0.0.5.jar (34 KB at 0.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-connector-file/0.9.0.M2/aether-connector-file-0.9.0.M2.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-connector-file/0.9.0.M2/aether-connector-file-0.9.0.M2.jar (26 KB at 0.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/tesla/aether/aether-connector-okhttp/0.0.9/aether-connector-okhttp-0.0.9.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-client/9.3.19.v20170502/jetty-client-9.3.19.v20170502.jar (259 KB at 2.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/2.4/wagon-provider-api-2.4.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/druid-server/0.12.1/druid-server-0.12.1.jar (1695 KB at 13.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/net/spy/spymemcached/2.12.3/spymemcached-2.12.3.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/tesla/aether/aether-connector-okhttp/0.0.9/aether-connector-okhttp-0.0.9.jar (51 KB at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-servlets/9.3.19.v20170502/jetty-servlets-9.3.19.v20170502.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/2.4/wagon-provider-api-2.4.jar (52 KB at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-continuation/9.3.19.v20170502/jetty-continuation-9.3.19.v20170502.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-continuation/9.3.19.v20170502/jetty-continuation-9.3.19.v20170502.jar (16 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/ircclouds/irc/irc-api/1.0-0014/irc-api-1.0-0014.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/google/inject/guice/4.1.0/guice-4.1.0.jar (659 KB at 5.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/maxmind/geoip2/geoip2/0.4.0/geoip2-0.4.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-servlets/9.3.19.v20170502/jetty-servlets-9.3.19.v20170502.jar (86 KB at 0.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/maxmind/maxminddb/maxminddb/0.2.0/maxminddb-0.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/java-util/0.12.1/java-util-0.12.1.jar (2490 KB at 19.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/derby/derbynet/10.11.1.1/derbynet-10.11.1.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/maxmind/maxminddb/maxminddb/0.2.0/maxminddb-0.2.0.jar (18 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/derby/derbyclient/10.11.1.1/derbyclient-10.11.1.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/maxmind/geoip2/geoip2/0.4.0/geoip2-0.4.0.jar (28 KB at 0.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/it/unimi/dsi/fastutil/8.1.0/fastutil-8.1.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/ircclouds/irc/irc-api/1.0-0014/irc-api-1.0-0014.jar (177 KB at 1.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/github/ben-manes/caffeine/caffeine/2.5.5/caffeine-2.5.5.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/derby/derbynet/10.11.1.1/derbynet-10.11.1.1.jar (261 KB at 1.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/druid/druid-processing/0.12.1/druid-processing-0.12.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/derby/derbyclient/10.11.1.1/derbyclient-10.11.1.1.jar (571 KB at 3.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/druid/druid-common/0.12.1/druid-common-0.12.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/druid-common/0.12.1/druid-common-0.12.1.jar (232 KB at 1.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/druid/druid-api/0.12.1/druid-api-0.12.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/net/spy/spymemcached/2.12.3/spymemcached-2.12.3.jar (463 KB at 2.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/airlift/airline/0.7/airline-0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/druid-api/0.12.1/druid-api-0.12.1.jar (137 KB at 0.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/javax/el/javax.el-api/3.0.0/javax.el-api-3.0.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/airlift/airline/0.7/airline-0.7.jar (84 KB at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-guava/2.4.6/jackson-datatype-guava-2.4.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/javax/el/javax.el-api/3.0.0/javax.el-api-3.0.0.jar (72 KB at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-joda/2.4.6/jackson-datatype-joda-2.4.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-guava/2.4.6/jackson-datatype-guava-2.4.6.jar (65 KB at 0.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/inject/extensions/guice-multibindings/4.1.0/guice-multibindings-4.1.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-joda/2.4.6/jackson-datatype-joda-2.4.6.jar (55 KB at 0.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-jul/2.5/log4j-jul-2.5.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-jul/2.5/log4j-jul-2.5.jar (23 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.7.12/jcl-over-slf4j-1.7.12.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.7.12/jcl-over-slf4j-1.7.12.jar (0 B at 0.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.5.1/antlr4-runtime-4.5.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/github/ben-manes/caffeine/caffeine/2.5.5/caffeine-2.5.5.jar (984 KB at 4.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/druid/druid-hll/0.12.1/druid-hll-0.12.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/google/inject/extensions/guice-multibindings/4.1.0/guice-multibindings-4.1.0.jar (80 KB at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/druid/extendedset/0.12.1/extendedset-0.12.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/druid-hll/0.12.1/druid-hll-0.12.1.jar (15 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/roaringbitmap/RoaringBitmap/0.5.18/RoaringBitmap-0.5.18.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.5.1/antlr4-runtime-4.5.1.jar (295 KB at 1.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/ning/compress-lzf/1.0.4/compress-lzf-1.0.4.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/extendedset/0.12.1/extendedset-0.12.1.jar (57 KB at 0.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/skife/config/config-magic/0.9/config-magic-0.9.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/ning/compress-lzf/1.0.4/compress-lzf-1.0.4.jar (79 KB at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/ibm/icu/icu4j/54.1.1/icu4j-54.1.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/roaringbitmap/RoaringBitmap/0.5.18/RoaringBitmap-0.5.18.jar (200 KB at 0.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/mozilla/rhino/1.7R5/rhino-1.7R5.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/skife/config/config-magic/0.9/config-magic-0.9.jar (416 KB at 1.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/mapdb/mapdb/1.0.8/mapdb-1.0.8.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/druid-processing/0.12.1/druid-processing-0.12.1.jar (2074 KB at 7.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/5.2/asm-5.2.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/5.2/asm-5.2.jar (53 KB at 0.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/5.2/asm-commons-5.2.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/5.2/asm-commons-5.2.jar (47 KB at 0.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/5.2/asm-tree-5.2.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/mapdb/mapdb/1.0.8/mapdb-1.0.8.jar (407 KB at 1.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/druid/extensions/druid-hdfs-storage/0.12.1/druid-hdfs-storage-0.12.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/5.2/asm-tree-5.2.jar (29 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/druid/extensions/mysql-metadata-storage/0.12.1/mysql-metadata-storage-0.12.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/extensions/mysql-metadata-storage/0.12.1/mysql-metadata-storage-0.12.1.jar (11 KB at 0.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/druid/extensions/postgresql-metadata-storage/0.12.1/postgresql-metadata-storage-0.12.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/extensions/druid-hdfs-storage/0.12.1/druid-hdfs-storage-0.12.1.jar (41 KB at 0.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/postgresql/postgresql/9.4.1208.jre7/postgresql-9.4.1208.jre7.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/extensions/postgresql-metadata-storage/0.12.1/postgresql-metadata-storage-0.12.1.jar (9 KB at 0.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/io/druid/druid-indexing-hadoop/0.12.1/druid-indexing-hadoop-0.12.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/druid/druid-indexing-hadoop/0.12.1/druid-indexing-hadoop-0.12.1.jar (217 KB at 0.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/jdbi/jdbi/2.63.1/jdbi-2.63.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/mozilla/rhino/1.7R5/rhino-1.7R5.jar (1116 KB at 3.4 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/postgresql/postgresql/9.4.1208.jre7/postgresql-9.4.1208.jre7.jar (631 KB at 1.8 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/jdbi/jdbi/2.63.1/jdbi-2.63.1.jar (941 KB at 2.7 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/com/ibm/icu/icu4j/54.1.1/icu4j-54.1.1.jar (10867 KB at 15.4 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/it/unimi/dsi/fastutil/8.1.0/fastutil-8.1.0.jar (18269 KB at 22.4 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-druid-handler ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/druid-handler (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-druid-handler ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-druid-handler ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-druid-handler ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-druid-handler ---
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-common/4.0.52.Final/netty-common-4.0.52.Final.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/io/netty/netty-buffer/4.0.52.Final/netty-buffer-4.0.52.Final.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/commons-pool/commons-pool/1.6/commons-pool-1.6.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/jruby/jcodings/jcodings/1.0.13/jcodings-1.0.13.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/squareup/okhttp/okhttp/1.0.2/okhttp-1.0.2.jar
	Downloading: https://repo.maven.apache.org/maven2/org/jruby/jcodings/jcodings/1.0.13/jcodings-1.0.13.jar
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.0.52.Final/netty-common-4.0.52.Final.jar
	Downloading: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.0.52.Final/netty-buffer-4.0.52.Final.jar
	Downloading: https://repo.maven.apache.org/maven2/com/squareup/okhttp/okhttp/1.0.2/okhttp-1.0.2.jar
	Downloading: https://repo.maven.apache.org/maven2/commons-pool/commons-pool/1.6/commons-pool-1.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/commons-pool/commons-pool/1.6/commons-pool-1.6.jar (109 KB at 21.1 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.0.52.Final/netty-buffer-4.0.52.Final.jar (230 KB at 22.3 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/com/squareup/okhttp/okhttp/1.0.2/okhttp-1.0.2.jar (187 KB at 16.9 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.0.52.Final/netty-common-4.0.52.Final.jar (389 KB at 20.1 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/jruby/jcodings/jcodings/1.0.13/jcodings-1.0.13.jar (1480 KB at 35.5 KB/sec)
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-druid-handler ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/druid-handler/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-druid-handler ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-druid-handler ---
	[INFO] Compiling 40 source files to /Users/xubo/Desktop/xubo/git/hive/druid-handler/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/druid-handler/src/java/org/apache/hadoop/hive/druid/serde/DruidSerDe.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/druid-handler/src/java/org/apache/hadoop/hive/druid/serde/DruidSerDe.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/druid-handler/src/java/org/apache/hadoop/hive/druid/io/DruidQueryBasedInputFormat.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/druid-handler/src/java/org/apache/hadoop/hive/druid/io/DruidQueryBasedInputFormat.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-druid-handler ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/druid-handler/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-druid-handler ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/druid-handler/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/druid-handler/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/druid-handler/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/druid-handler/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-druid-handler ---
	[INFO] Compiling 17 source files to /Users/xubo/Desktop/xubo/git/hive/druid-handler/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-druid-handler ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-druid-handler ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/druid-handler/target/hive-druid-handler-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-druid-handler ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:test-jar (default) @ hive-druid-handler ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/druid-handler/target/hive-druid-handler-4.0.0-SNAPSHOT-tests.jar
	[INFO] 
	[INFO] --- maven-shade-plugin:3.1.0:shade (default) @ hive-druid-handler ---
	[INFO] Including com.fasterxml.jackson.dataformat:jackson-dataformat-smile:jar:2.9.5 in the shaded jar.
	[INFO] Including com.fasterxml.jackson.core:jackson-core:jar:2.9.5 in the shaded jar.
	[INFO] Including com.fasterxml.jackson.core:jackson-databind:jar:2.9.5 in the shaded jar.
	[INFO] Including com.fasterxml.jackson.core:jackson-annotations:jar:2.9.5 in the shaded jar.
	[INFO] Excluding org.apache.hive:hive-exec:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.hive:hive-vector-code-gen:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.velocity:velocity:jar:1.5 from the shaded jar.
	[INFO] Excluding oro:oro:jar:2.0.8 from the shaded jar.
	[INFO] Excluding org.apache.hive:hive-common:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.hive:hive-classification:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.hive:hive-storage-api:jar:2.7.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.hive:hive-standalone-metastore-common:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.orc:orc-core:jar:1.5.3 from the shaded jar.
	[INFO] Excluding org.apache.orc:orc-shims:jar:1.5.3 from the shaded jar.
	[INFO] Excluding io.airlift:aircompressor:jar:0.10 from the shaded jar.
	[INFO] Excluding jline:jline:jar:2.12 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-http:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-rewrite:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.apache.logging.log4j:log4j-web:jar:2.10.0 from the shaded jar.
	[INFO] Excluding net.sf.jpam:jpam:jar:1.1 from the shaded jar.
	[INFO] Excluding io.dropwizard.metrics:metrics-core:jar:3.1.0 from the shaded jar.
	[INFO] Excluding io.dropwizard.metrics:metrics-jvm:jar:3.1.0 from the shaded jar.
	[INFO] Excluding io.dropwizard.metrics:metrics-json:jar:3.1.0 from the shaded jar.
	[INFO] Excluding com.github.joshelser:dropwizard-metrics-hadoop-metrics2-reporter:jar:0.1.2 from the shaded jar.
	[INFO] Excluding org.apache.hive:hive-metastore:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-client:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase.thirdparty:hbase-shaded-protobuf:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-common:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Including org.apache.commons:commons-collections4:jar:4.1 in the shaded jar.
	[INFO] Excluding com.github.stephenc.findbugs:findbugs-annotations:jar:1.3.9-1 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-hadoop-compat:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-metrics-api:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-hadoop2-compat:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-metrics:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-protocol-shaded:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase:hbase-protocol:jar:2.0.0-alpha4 from the shaded jar.
	[INFO] Excluding org.apache.hbase.thirdparty:hbase-shaded-miscellaneous:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.hbase.thirdparty:hbase-shaded-netty:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.htrace:htrace-core:jar:3.2.0-incubating from the shaded jar.
	[INFO] Excluding org.jruby.jcodings:jcodings:jar:1.0.18 from the shaded jar.
	[INFO] Excluding org.jruby.joni:joni:jar:2.1.11 from the shaded jar.
	[INFO] Including org.apache.commons:commons-crypto:jar:1.0.0 in the shaded jar.
	[INFO] Excluding org.apache.yetus:audience-annotations:jar:0.5.0 from the shaded jar.
	[INFO] Excluding com.jolbox:bonecp:jar:0.8.0.RELEASE from the shaded jar.
	[INFO] Excluding com.zaxxer:HikariCP:jar:2.6.1 from the shaded jar.
	[INFO] Excluding commons-pool:commons-pool:jar:1.5.4 from the shaded jar.
	[INFO] Excluding commons-dbcp:commons-dbcp:jar:1.4 from the shaded jar.
	[INFO] Excluding javax.jdo:jdo-api:jar:3.0.1 from the shaded jar.
	[INFO] Excluding javax.transaction:jta:jar:1.1 from the shaded jar.
	[INFO] Excluding co.cask.tephra:tephra-api:jar:0.6.0 from the shaded jar.
	[INFO] Excluding co.cask.tephra:tephra-core:jar:0.6.0 from the shaded jar.
	[INFO] Excluding com.google.inject.extensions:guice-assistedinject:jar:3.0 from the shaded jar.
	[INFO] Excluding org.apache.twill:twill-common:jar:0.6.0-incubating from the shaded jar.
	[INFO] Excluding org.apache.twill:twill-core:jar:0.6.0-incubating from the shaded jar.
	[INFO] Excluding org.apache.twill:twill-api:jar:0.6.0-incubating from the shaded jar.
	[INFO] Excluding org.apache.twill:twill-discovery-api:jar:0.6.0-incubating from the shaded jar.
	[INFO] Excluding org.apache.twill:twill-discovery-core:jar:0.6.0-incubating from the shaded jar.
	[INFO] Excluding org.apache.twill:twill-zookeeper:jar:0.6.0-incubating from the shaded jar.
	[INFO] Excluding co.cask.tephra:tephra-hbase-compat-1.0:jar:0.6.0 from the shaded jar.
	[INFO] Excluding org.apache.hive:hive-serde:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.arrow:arrow-vector:jar:0.10.0 from the shaded jar.
	[INFO] Excluding org.apache.arrow:arrow-format:jar:0.10.0 from the shaded jar.
	[INFO] Excluding org.apache.arrow:arrow-memory:jar:0.10.0 from the shaded jar.
	[INFO] Including io.netty:netty-buffer:jar:4.1.17.Final in the shaded jar.
	[INFO] Including io.netty:netty-common:jar:4.1.17.Final in the shaded jar.
	[INFO] Excluding com.carrotsearch:hppc:jar:0.7.2 from the shaded jar.
	[INFO] Excluding com.vlkan:flatbuffers:jar:1.2.0-3f79e055 from the shaded jar.
	[INFO] Excluding org.apache.hive:hive-service-rpc:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.hive:hive-llap-client:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.hive:hive-llap-common:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.hive:hive-llap-tez:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.hive:hive-shims:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.hive.shims:hive-shims-common:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.hive.shims:hive-shims-0.23:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-server-resourcemanager:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-server-common:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.geronimo.specs:geronimo-jcache_1.0_spec:jar:1.0-alpha-1 from the shaded jar.
	[INFO] Excluding org.ehcache:ehcache:jar:3.3.1 from the shaded jar.
	[INFO] Excluding com.zaxxer:HikariCP-java7:jar:2.4.12 from the shaded jar.
	[INFO] Excluding com.microsoft.sqlserver:mssql-jdbc:jar:6.2.1.jre7 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-server-applicationhistoryservice:jar:3.1.0 from the shaded jar.
	[INFO] Excluding de.ruedigermoeller:fst:jar:2.50 from the shaded jar.
	[INFO] Excluding com.cedarsoftware:java-util:jar:1.9.0 from the shaded jar.
	[INFO] Excluding com.cedarsoftware:json-io:jar:2.5.1 from the shaded jar.
	[INFO] Excluding org.fusesource.leveldbjni:leveldbjni-all:jar:1.8 from the shaded jar.
	[INFO] Excluding org.apache.hive.shims:hive-shims-scheduler:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.apache.hive:hive-spark-client:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.module:jackson-module-scala_2.11:jar:2.9.5 from the shaded jar.
	[INFO] Excluding org.scala-lang:scala-library:jar:2.11.8 from the shaded jar.
	[INFO] Excluding org.scala-lang:scala-reflect:jar:2.11.11 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.module:jackson-module-paranamer:jar:2.9.5 from the shaded jar.
	[INFO] Excluding org.apache.spark:spark-core_2.11:jar:2.3.0 from the shaded jar.
	[INFO] Excluding com.twitter:chill_2.11:jar:0.8.4 from the shaded jar.
	[INFO] Excluding com.twitter:chill-java:jar:0.8.4 from the shaded jar.
	[INFO] Excluding org.apache.xbean:xbean-asm5-shaded:jar:4.4 from the shaded jar.
	[INFO] Excluding org.apache.spark:spark-launcher_2.11:jar:2.3.0 from the shaded jar.
	[INFO] Excluding org.apache.spark:spark-kvstore_2.11:jar:2.3.0 from the shaded jar.
	[INFO] Excluding org.apache.spark:spark-network-common_2.11:jar:2.3.0 from the shaded jar.
	[INFO] Excluding org.apache.spark:spark-network-shuffle_2.11:jar:2.3.0 from the shaded jar.
	[INFO] Excluding org.apache.spark:spark-unsafe_2.11:jar:2.3.0 from the shaded jar.
	[INFO] Excluding org.slf4j:jul-to-slf4j:jar:1.7.16 from the shaded jar.
	[INFO] Excluding org.lz4:lz4-java:jar:1.4.0 from the shaded jar.
	[INFO] Excluding com.github.luben:zstd-jni:jar:1.3.2-2 from the shaded jar.
	[INFO] Excluding org.json4s:json4s-jackson_2.11:jar:3.2.11 from the shaded jar.
	[INFO] Excluding org.json4s:json4s-core_2.11:jar:3.2.11 from the shaded jar.
	[INFO] Excluding org.json4s:json4s-ast_2.11:jar:3.2.11 from the shaded jar.
	[INFO] Excluding org.scala-lang:scalap:jar:2.11.0 from the shaded jar.
	[INFO] Excluding org.scala-lang:scala-compiler:jar:2.11.0 from the shaded jar.
	[INFO] Excluding org.scala-lang.modules:scala-xml_2.11:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.scala-lang.modules:scala-parser-combinators_2.11:jar:1.0.1 from the shaded jar.
	[INFO] Excluding com.clearspring.analytics:stream:jar:2.7.0 from the shaded jar.
	[INFO] Excluding io.dropwizard.metrics:metrics-graphite:jar:3.1.5 from the shaded jar.
	[INFO] Excluding net.razorvine:pyrolite:jar:4.13 from the shaded jar.
	[INFO] Excluding net.sf.py4j:py4j:jar:0.10.6 from the shaded jar.
	[INFO] Excluding org.apache.spark:spark-tags_2.11:jar:2.3.0 from the shaded jar.
	[INFO] Excluding org.spark-project.spark:unused:jar:1.0.0 from the shaded jar.
	[INFO] Excluding org.apache.spark:spark-yarn_2.11:jar:2.3.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-server-web-proxy:jar:3.1.0 from the shaded jar.
	[INFO] Excluding com.esotericsoftware:kryo-shaded:jar:3.0.3 from the shaded jar.
	[INFO] Excluding com.esotericsoftware:minlog:jar:1.3.0 from the shaded jar.
	[INFO] Excluding org.objenesis:objenesis:jar:2.1 from the shaded jar.
	[INFO] Excluding com.google.protobuf:protobuf-java:jar:2.5.0 from the shaded jar.
	[INFO] Excluding org.apache.parquet:parquet-hadoop-bundle:jar:1.10.0 from the shaded jar.
	[INFO] Excluding commons-codec:commons-codec:jar:1.7 from the shaded jar.
	[INFO] Excluding commons-io:commons-io:jar:2.4 from the shaded jar.
	[INFO] Including org.apache.commons:commons-lang3:jar:3.2 in the shaded jar.
	[INFO] Excluding javolution:javolution:jar:5.5.1 from the shaded jar.
	[INFO] Excluding org.apache.logging.log4j:log4j-1.2-api:jar:2.10.0 from the shaded jar.
	[INFO] Excluding org.apache.logging.log4j:log4j-api:jar:2.10.0 from the shaded jar.
	[INFO] Excluding org.apache.logging.log4j:log4j-core:jar:2.10.0 from the shaded jar.
	[INFO] Excluding org.apache.logging.log4j:log4j-slf4j-impl:jar:2.10.0 from the shaded jar.
	[INFO] Including org.antlr:antlr-runtime:jar:3.5.2 in the shaded jar.
	[INFO] Including org.antlr:ST4:jar:4.0.4 in the shaded jar.
	[INFO] Excluding org.apache.avro:avro:jar:1.8.2 from the shaded jar.
	[INFO] Excluding org.codehaus.jackson:jackson-core-asl:jar:1.9.13 from the shaded jar.
	[INFO] Excluding org.codehaus.jackson:jackson-mapper-asl:jar:1.9.13 from the shaded jar.
	[INFO] Excluding com.thoughtworks.paranamer:paranamer:jar:2.7 from the shaded jar.
	[INFO] Excluding org.xerial.snappy:snappy-java:jar:1.1.4 from the shaded jar.
	[INFO] Excluding org.tukaani:xz:jar:1.5 from the shaded jar.
	[INFO] Excluding org.apache.avro:avro-mapred:jar:hadoop2:1.8.2 from the shaded jar.
	[INFO] Excluding org.apache.avro:avro-ipc:jar:1.8.2 from the shaded jar.
	[INFO] Excluding org.apache.ant:ant:jar:1.9.1 from the shaded jar.
	[INFO] Excluding org.apache.ant:ant-launcher:jar:1.9.1 from the shaded jar.
	[INFO] Including org.apache.commons:commons-compress:jar:1.18 in the shaded jar.
	[INFO] Excluding org.apache.thrift:libfb303:jar:0.9.3 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-registry:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-api:jar:3.1.0 from the shaded jar.
	[INFO] Excluding commons-daemon:commons-daemon:jar:1.0.13 from the shaded jar.
	[INFO] Excluding dnsjava:dnsjava:jar:2.1.7 from the shaded jar.
	[INFO] Excluding org.apache.orc:orc-tools:jar:1.5.3 from the shaded jar.
	[INFO] Excluding com.opencsv:opencsv:jar:3.9 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-hdfs:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-util-ajax:jar:9.3.19.v20170502 from the shaded jar.
	[INFO] Excluding org.codehaus.jettison:jettison:jar:1.1 from the shaded jar.
	[INFO] Excluding org.threeten:threetenbp:jar:1.3.5 from the shaded jar.
	[INFO] Excluding org.apache.ivy:ivy:jar:2.4.0 from the shaded jar.
	[INFO] Excluding org.apache.thrift:libthrift:jar:0.9.3 from the shaded jar.
	[INFO] Excluding org.apache.httpcomponents:httpclient:jar:4.5.2 from the shaded jar.
	[INFO] Excluding org.apache.httpcomponents:httpcore:jar:4.4.4 from the shaded jar.
	[INFO] Excluding org.apache.zookeeper:zookeeper:jar:3.4.6 from the shaded jar.
	[INFO] Excluding org.apache.curator:curator-framework:jar:2.12.0 from the shaded jar.
	[INFO] Excluding org.apache.curator:apache-curator:pom:2.12.0 from the shaded jar.
	[INFO] Excluding org.codehaus.groovy:groovy-all:jar:2.4.11 from the shaded jar.
	[INFO] Excluding org.jodd:jodd-core:jar:3.5.2 from the shaded jar.
	[INFO] Excluding org.datanucleus:datanucleus-core:jar:4.1.17 from the shaded jar.
	[INFO] Including org.apache.calcite:calcite-core:jar:1.17.0 in the shaded jar.
	[INFO] Including org.apache.calcite:calcite-linq4j:jar:1.17.0 in the shaded jar.
	[INFO] Including org.apache.commons:commons-dbcp2:jar:2.4.0 in the shaded jar.
	[INFO] Including org.apache.commons:commons-pool2:jar:2.5.0 in the shaded jar.
	[INFO] Excluding com.esri.geometry:esri-geometry-api:jar:2.0.0 from the shaded jar.
	[INFO] Excluding com.yahoo.datasketches:sketches-core:jar:0.9.0 from the shaded jar.
	[INFO] Excluding com.yahoo.datasketches:memory:jar:0.9.0 from the shaded jar.
	[INFO] Excluding org.codehaus.janino:janino:jar:2.7.6 from the shaded jar.
	[INFO] Excluding org.codehaus.janino:commons-compiler:jar:2.7.6 from the shaded jar.
	[INFO] Including org.apache.calcite:calcite-druid:jar:1.17.0 in the shaded jar.
	[INFO] Excluding org.apache.calcite.avatica:avatica:jar:1.12.0 from the shaded jar.
	[INFO] Excluding com.googlecode.javaewah:JavaEWAH:jar:0.3.2 from the shaded jar.
	[INFO] Excluding com.google.code.gson:gson:jar:2.2.4 from the shaded jar.
	[INFO] Excluding com.tdunning:json:jar:1.8 from the shaded jar.
	[INFO] Excluding stax:stax-api:jar:1.0.1 from the shaded jar.
	[INFO] Excluding net.sf.opencsv:opencsv:jar:2.3 from the shaded jar.
	[INFO] Excluding org.apache.hive:hive-standalone-metastore-server:jar:4.0.0-SNAPSHOT from the shaded jar.
	[INFO] Excluding org.datanucleus:datanucleus-api-jdo:jar:4.2.4 from the shaded jar.
	[INFO] Excluding org.datanucleus:datanucleus-rdbms:jar:4.1.19 from the shaded jar.
	[INFO] Excluding org.datanucleus:javax.jdo:jar:3.2.0-m3 from the shaded jar.
	[INFO] Excluding javax.transaction:transaction-api:jar:1.1 from the shaded jar.
	[INFO] Excluding sqlline:sqlline:jar:1.3.0 from the shaded jar.
	[INFO] Excluding commons-logging:commons-logging:jar:1.1.3 from the shaded jar.
	[INFO] Excluding commons-lang:commons-lang:jar:2.6 from the shaded jar.
	[INFO] Including com.google.guava:guava:jar:16.0.1 in the shaded jar.
	[INFO] Excluding joda-time:joda-time:jar:2.9.9 from the shaded jar.
	[INFO] Including io.druid:druid-server:jar:0.12.1 in the shaded jar.
	[INFO] Including io.druid:druid-console:jar:0.0.2 in the shaded jar.
	[INFO] Including io.druid:java-util:jar:0.12.1 in the shaded jar.
	[INFO] Excluding com.jayway.jsonpath:json-path:jar:2.1.0 from the shaded jar.
	[INFO] Excluding net.thisptr:jackson-jq:jar:0.0.7 from the shaded jar.
	[INFO] Excluding javax.validation:validation-api:jar:1.1.0.Final from the shaded jar.
	[INFO] Including org.asynchttpclient:async-http-client:jar:2.0.37 in the shaded jar.
	[INFO] Including org.asynchttpclient:async-http-client-netty-utils:jar:2.0.37 in the shaded jar.
	[INFO] Including io.netty:netty-codec-http:jar:4.0.52.Final in the shaded jar.
	[INFO] Including io.netty:netty-codec:jar:4.0.52.Final in the shaded jar.
	[INFO] Including io.netty:netty-handler:jar:4.0.52.Final in the shaded jar.
	[INFO] Including io.netty:netty-transport:jar:4.0.52.Final in the shaded jar.
	[INFO] Including io.netty:netty-transport-native-epoll:jar:linux-x86_64:4.0.52.Final in the shaded jar.
	[INFO] Including org.asynchttpclient:netty-resolver-dns:jar:2.0.37 in the shaded jar.
	[INFO] Including org.asynchttpclient:netty-resolver:jar:2.0.37 in the shaded jar.
	[INFO] Including org.asynchttpclient:netty-codec-dns:jar:2.0.37 in the shaded jar.
	[INFO] Excluding org.reactivestreams:reactive-streams:jar:1.0.0 from the shaded jar.
	[INFO] Excluding com.typesafe.netty:netty-reactive-streams:jar:1.0.8 from the shaded jar.
	[INFO] Excluding org.gridkit.lab:jvm-attach-api:jar:1.2 from the shaded jar.
	[INFO] Including io.netty:netty:jar:3.10.6.Final in the shaded jar.
	[INFO] Excluding commons-cli:commons-cli:jar:1.2 from the shaded jar.
	[INFO] Excluding javax.inject:javax.inject:jar:1 from the shaded jar.
	[INFO] Excluding org.glassfish:javax.el:jar:3.0.0 from the shaded jar.
	[INFO] Excluding org.apache.curator:curator-x-discovery:jar:4.0.0 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider:jar:2.9.5 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.jaxrs:jackson-jaxrs-base:jar:2.9.5 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.module:jackson-module-jaxb-annotations:jar:2.9.5 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.jaxrs:jackson-jaxrs-smile-provider:jar:2.4.6 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-server:jar:1.19 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-core:jar:1.19 from the shaded jar.
	[INFO] Excluding javax.ws.rs:jsr311-api:jar:1.1.1 from the shaded jar.
	[INFO] Excluding com.google.inject.extensions:guice-servlet:jar:4.1.0 from the shaded jar.
	[INFO] Excluding com.google.inject:guice:jar:4.1.0 from the shaded jar.
	[INFO] Excluding aopalliance:aopalliance:jar:1.0 from the shaded jar.
	[INFO] Excluding com.sun.jersey.contribs:jersey-guice:jar:1.19.3 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-server:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-io:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-util:jar:9.3.19.v20170502 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-proxy:jar:9.3.19.v20170502 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-client:jar:9.3.19.v20170502 from the shaded jar.
	[INFO] Excluding com.google.code.findbugs:jsr305:jar:2.0.1 from the shaded jar.
	[INFO] Excluding io.tesla.aether:tesla-aether:jar:0.0.5 from the shaded jar.
	[INFO] Excluding org.eclipse.aether:aether-spi:jar:0.9.0.M2 from the shaded jar.
	[INFO] Excluding org.eclipse.aether:aether-util:jar:0.9.0.M2 from the shaded jar.
	[INFO] Excluding org.eclipse.aether:aether-impl:jar:0.9.0.M2 from the shaded jar.
	[INFO] Excluding org.eclipse.aether:aether-connector-file:jar:0.9.0.M2 from the shaded jar.
	[INFO] Excluding io.tesla.aether:aether-connector-okhttp:jar:0.0.9 from the shaded jar.
	[INFO] Excluding org.apache.maven.wagon:wagon-provider-api:jar:2.4 from the shaded jar.
	[INFO] Excluding org.apache.maven:maven-aether-provider:jar:3.1.1 from the shaded jar.
	[INFO] Excluding org.apache.maven:maven-model:jar:3.1.1 from the shaded jar.
	[INFO] Excluding org.apache.maven:maven-model-builder:jar:3.1.1 from the shaded jar.
	[INFO] Excluding org.apache.maven:maven-repository-metadata:jar:3.1.1 from the shaded jar.
	[INFO] Excluding org.codehaus.plexus:plexus-utils:jar:3.0.15 from the shaded jar.
	[INFO] Excluding org.apache.maven:maven-settings-builder:jar:3.1.1 from the shaded jar.
	[INFO] Excluding org.codehaus.plexus:plexus-interpolation:jar:1.19 from the shaded jar.
	[INFO] Excluding org.apache.maven:maven-settings:jar:3.1.1 from the shaded jar.
	[INFO] Excluding org.eclipse.aether:aether-api:jar:0.9.0.M2 from the shaded jar.
	[INFO] Excluding net.spy:spymemcached:jar:2.12.3 from the shaded jar.
	[INFO] Including net.jpountz.lz4:lz4:jar:1.3.0 in the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-servlet:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-security:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-servlets:jar:9.3.19.v20170502 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-continuation:jar:9.3.19.v20170502 from the shaded jar.
	[INFO] Excluding com.ircclouds.irc:irc-api:jar:1.0-0014 from the shaded jar.
	[INFO] Excluding com.maxmind.geoip2:geoip2:jar:0.4.0 from the shaded jar.
	[INFO] Excluding com.maxmind.maxminddb:maxminddb:jar:0.2.0 from the shaded jar.
	[INFO] Including org.apache.derby:derby:jar:10.14.1.0 in the shaded jar.
	[INFO] Including org.apache.derby:derbynet:jar:10.11.1.1 in the shaded jar.
	[INFO] Including org.apache.derby:derbyclient:jar:10.11.1.1 in the shaded jar.
	[INFO] Including org.apache.commons:commons-math3:jar:3.6.1 in the shaded jar.
	[INFO] Including it.unimi.dsi:fastutil:jar:8.1.0 in the shaded jar.
	[INFO] Excluding com.github.ben-manes.caffeine:caffeine:jar:2.5.5 from the shaded jar.
	[INFO] Including io.druid:druid-processing:jar:0.12.1 in the shaded jar.
	[INFO] Including io.druid:druid-common:jar:0.12.1 in the shaded jar.
	[INFO] Including io.druid:druid-api:jar:0.12.1 in the shaded jar.
	[INFO] Excluding io.airlift:airline:jar:0.7 from the shaded jar.
	[INFO] Excluding org.hibernate:hibernate-validator:jar:5.1.3.Final from the shaded jar.
	[INFO] Excluding org.jboss.logging:jboss-logging:jar:3.1.3.GA from the shaded jar.
	[INFO] Excluding com.fasterxml:classmate:jar:1.0.0 from the shaded jar.
	[INFO] Excluding javax.el:javax.el-api:jar:3.0.0 from the shaded jar.
	[INFO] Including com.fasterxml.jackson.datatype:jackson-datatype-guava:jar:2.4.6 in the shaded jar.
	[INFO] Including com.fasterxml.jackson.datatype:jackson-datatype-joda:jar:2.4.6 in the shaded jar.
	[INFO] Excluding com.google.inject.extensions:guice-multibindings:jar:4.1.0 from the shaded jar.
	[INFO] Excluding org.apache.logging.log4j:log4j-jul:jar:2.5 from the shaded jar.
	[INFO] Excluding org.slf4j:jcl-over-slf4j:jar:1.7.12 from the shaded jar.
	[INFO] Excluding com.lmax:disruptor:jar:3.3.6 from the shaded jar.
	[INFO] Excluding net.java.dev.jets3t:jets3t:jar:0.9.4 from the shaded jar.
	[INFO] Excluding javax.activation:activation:jar:1.1.1 from the shaded jar.
	[INFO] Excluding org.bouncycastle:bcprov-jdk15on:jar:1.52 from the shaded jar.
	[INFO] Excluding com.jamesmurty.utils:java-xmlbuilder:jar:1.1 from the shaded jar.
	[INFO] Excluding net.iharder:base64:jar:2.3.8 from the shaded jar.
	[INFO] Including org.antlr:antlr4-runtime:jar:4.5.1 in the shaded jar.
	[INFO] Including io.druid:druid-hll:jar:0.12.1 in the shaded jar.
	[INFO] Including io.druid:extendedset:jar:0.12.1 in the shaded jar.
	[INFO] Including org.roaringbitmap:RoaringBitmap:jar:0.5.18 in the shaded jar.
	[INFO] Excluding com.ning:compress-lzf:jar:1.0.4 from the shaded jar.
	[INFO] Excluding org.skife.config:config-magic:jar:0.9 from the shaded jar.
	[INFO] Excluding com.ibm.icu:icu4j:jar:54.1.1 from the shaded jar.
	[INFO] Excluding org.mozilla:rhino:jar:1.7R5 from the shaded jar.
	[INFO] Excluding org.mapdb:mapdb:jar:1.0.8 from the shaded jar.
	[INFO] Excluding org.ow2.asm:asm:jar:5.2 from the shaded jar.
	[INFO] Excluding org.ow2.asm:asm-commons:jar:5.2 from the shaded jar.
	[INFO] Excluding org.ow2.asm:asm-tree:jar:5.2 from the shaded jar.
	[INFO] Including io.druid.extensions:druid-hdfs-storage:jar:0.12.1 in the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-client:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-mapreduce-client-jobclient:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-mapreduce-client-common:jar:3.1.0 from the shaded jar.
	[INFO] Including io.druid.extensions:mysql-metadata-storage:jar:0.12.1 in the shaded jar.
	[INFO] Including io.druid.extensions:postgresql-metadata-storage:jar:0.12.1 in the shaded jar.
	[INFO] Excluding org.postgresql:postgresql:jar:9.4.1208.jre7 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-annotations:jar:3.1.0 from the shaded jar.
	[INFO] Excluding commons-net:commons-net:jar:3.6 from the shaded jar.
	[INFO] Excluding commons-collections:commons-collections:jar:3.2.2 from the shaded jar.
	[INFO] Excluding javax.servlet:javax.servlet-api:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-webapp:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-xml:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-servlet:jar:1.19 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-json:jar:1.19 from the shaded jar.
	[INFO] Excluding com.sun.xml.bind:jaxb-impl:jar:2.2.3-1 from the shaded jar.
	[INFO] Excluding org.codehaus.jackson:jackson-jaxrs:jar:1.9.2 from the shaded jar.
	[INFO] Excluding org.codehaus.jackson:jackson-xc:jar:1.9.2 from the shaded jar.
	[INFO] Excluding log4j:log4j:jar:1.2.17 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-auth:jar:3.1.0 from the shaded jar.
	[INFO] Excluding com.nimbusds:nimbus-jose-jwt:jar:4.41.1 from the shaded jar.
	[INFO] Excluding com.github.stephenc.jcip:jcip-annotations:jar:1.0-1 from the shaded jar.
	[INFO] Excluding net.minidev:json-smart:jar:2.3 from the shaded jar.
	[INFO] Excluding net.minidev:accessors-smart:jar:1.2 from the shaded jar.
	[INFO] Excluding org.apache.curator:curator-client:jar:2.12.0 from the shaded jar.
	[INFO] Excluding org.apache.curator:curator-recipes:jar:2.12.0 from the shaded jar.
	[INFO] Excluding org.apache.htrace:htrace-core4:jar:4.1.0-incubating from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-simplekdc:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-client:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerby-config:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-core:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerby-pkix:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerby-asn1:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerby-util:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-common:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-crypto:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-util:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:token-provider:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-admin:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-server:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-identity:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerby-xdr:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-client:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-common:jar:3.1.0 from the shaded jar.
	[INFO] Excluding javax.xml.bind:jaxb-api:jar:2.2.11 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-client:jar:1.19 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-hdfs-client:jar:3.1.0 from the shaded jar.
	[INFO] Excluding com.squareup.okhttp:okhttp:jar:2.7.5 from the shaded jar.
	[INFO] Excluding com.squareup.okio:okio:jar:1.6.0 from the shaded jar.
	[INFO] Including org.jdbi:jdbi:jar:2.63.1 in the shaded jar.
	[INFO] Excluding org.slf4j:slf4j-api:jar:1.7.10 from the shaded jar.
	[WARNING] async-http-client-2.0.37.jar, netty-common-4.1.17.Final.jar define 1 overlapping classes: 
	[WARNING]   - io.netty.util.internal.MacAddressUtil
	[WARNING] derbynet-10.11.1.1.jar, derbyclient-10.11.1.1.jar, derby-10.14.1.0.jar define 13 overlapping classes: 
	[WARNING]   - org.apache.derby.impl.tools.sysinfo.Main$8
	[WARNING]   - org.apache.derby.impl.tools.sysinfo.Main
	[WARNING]   - org.apache.derby.impl.tools.sysinfo.Main$2
	[WARNING]   - org.apache.derby.impl.tools.sysinfo.Main$9
	[WARNING]   - org.apache.derby.impl.tools.sysinfo.Main$6
	[WARNING]   - org.apache.derby.impl.tools.sysinfo.Main$1
	[WARNING]   - org.apache.derby.impl.tools.sysinfo.Main$5
	[WARNING]   - org.apache.derby.impl.tools.sysinfo.ZipInfoProperties
	[WARNING]   - org.apache.derby.impl.tools.sysinfo.Main$4
	[WARNING]   - org.apache.derby.tools.sysinfo
	[WARNING]   - 3 more...
	[WARNING] derbyclient-10.11.1.1.jar, derby-10.14.1.0.jar define 15 overlapping classes: 
	[WARNING]   - org.apache.derby.iapi.services.info.ProductGenusNames
	[WARNING]   - org.apache.derby.shared.common.error.ExceptionSeverity
	[WARNING]   - org.apache.derby.shared.common.reference.JDBC40Translation
	[WARNING]   - org.apache.derby.iapi.reference.Attribute
	[WARNING]   - org.apache.derby.iapi.services.info.JVMInfo
	[WARNING]   - org.apache.derby.iapi.services.info.JVMInfo$1
	[WARNING]   - org.apache.derby.iapi.tools.i18n.LocalizedResource
	[WARNING]   - org.apache.derby.shared.common.reference.SQLState
	[WARNING]   - org.apache.derby.iapi.tools.i18n.LocalizedInput
	[WARNING]   - org.apache.derby.iapi.services.info.ProductVersionHolder
	[WARNING]   - 5 more...
	[WARNING] maven-shade-plugin has detected that some class files are
	[WARNING] present in two or more JARs. When this happens, only one
	[WARNING] single version of the class is copied to the uber jar.
	[WARNING] Usually this is not harmful and you can skip these warnings,
	[WARNING] otherwise try to manually exclude artifacts based on
	[WARNING] mvn dependency:tree -Ddetail=true and the above output.
	[WARNING] See http://maven.apache.org/plugins/maven-shade-plugin/
	[INFO] Replacing original artifact with shaded artifact.
	[INFO] Replacing /Users/xubo/Desktop/xubo/git/hive/druid-handler/target/hive-druid-handler-4.0.0-SNAPSHOT.jar with /Users/xubo/Desktop/xubo/git/hive/druid-handler/target/hive-druid-handler-4.0.0-SNAPSHOT-shaded.jar
	[INFO] Replacing original test artifact with shaded test artifact.
	[INFO] Replacing /Users/xubo/Desktop/xubo/git/hive/druid-handler/target/hive-druid-handler-4.0.0-SNAPSHOT-tests.jar with /Users/xubo/Desktop/xubo/git/hive/druid-handler/target/hive-druid-handler-4.0.0-SNAPSHOT-shaded-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive HBase Handler 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: https://repo.maven.apache.org/maven2/org/apache/avro/avro-maven-plugin/1.8.2/avro-maven-plugin-1.8.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/avro/avro-maven-plugin/1.8.2/avro-maven-plugin-1.8.2.pom (4 KB at 1.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/avro/avro-maven-plugin/1.8.2/avro-maven-plugin-1.8.2.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/avro/avro-maven-plugin/1.8.2/avro-maven-plugin-1.8.2.jar (27 KB at 26.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/mortbay/jasper/apache-jsp/8.0.33/apache-jsp-8.0.33.pom
	Downloading: https://repo.maven.apache.org/maven2/org/mortbay/jasper/apache-jsp/8.0.33/apache-jsp-8.0.33.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/mortbay/jasper/apache-jsp/8.0.33/apache-jsp-8.0.33.pom (16 KB at 20.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/mortbay/jasper/jasper-jsp/8.0.33/jasper-jsp-8.0.33.pom
	Downloading: https://repo.maven.apache.org/maven2/org/mortbay/jasper/jasper-jsp/8.0.33/jasper-jsp-8.0.33.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/mortbay/jasper/jasper-jsp/8.0.33/jasper-jsp-8.0.33.pom (4 KB at 5.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/mortbay/jasper/apache-el/8.0.33/apache-el-8.0.33.pom
	Downloading: https://repo.maven.apache.org/maven2/org/mortbay/jasper/apache-el/8.0.33/apache-el-8.0.33.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/mortbay/jasper/apache-el/8.0.33/apache-el-8.0.33.pom (8 KB at 14.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/io/dropwizard/metrics/metrics-core/3.2.1/metrics-core-3.2.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-hadoop2-compat/2.0.0-alpha4/hbase-hadoop2-compat-2.0.0-alpha4-tests.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-server/2.0.0-alpha4/hbase-server-2.0.0-alpha4-tests.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-mapreduce/2.0.0-alpha4/hbase-mapreduce-2.0.0-alpha4-tests.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hbase/hbase-hadoop-compat/2.0.0-alpha4/hbase-hadoop-compat-2.0.0-alpha4-tests.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/mortbay/jasper/apache-jsp/8.0.33/apache-jsp-8.0.33.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/mortbay/jasper/apache-el/8.0.33/apache-el-8.0.33.jar
	Downloading: https://repo.maven.apache.org/maven2/io/dropwizard/metrics/metrics-core/3.2.1/metrics-core-3.2.1.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-hadoop2-compat/2.0.0-alpha4/hbase-hadoop2-compat-2.0.0-alpha4-tests.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-server/2.0.0-alpha4/hbase-server-2.0.0-alpha4-tests.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-mapreduce/2.0.0-alpha4/hbase-mapreduce-2.0.0-alpha4-tests.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-hadoop-compat/2.0.0-alpha4/hbase-hadoop-compat-2.0.0-alpha4-tests.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-hadoop-compat/2.0.0-alpha4/hbase-hadoop-compat-2.0.0-alpha4-tests.jar (23 KB at 7.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/mortbay/jasper/apache-jsp/8.0.33/apache-jsp-8.0.33.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-hadoop2-compat/2.0.0-alpha4/hbase-hadoop2-compat-2.0.0-alpha4-tests.jar (35 KB at 6.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/mortbay/jasper/apache-el/8.0.33/apache-el-8.0.33.jar
	Downloaded: https://repo.maven.apache.org/maven2/io/dropwizard/metrics/metrics-core/3.2.1/metrics-core-3.2.1.jar (127 KB at 11.1 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/mortbay/jasper/apache-el/8.0.33/apache-el-8.0.33.jar (236 KB at 11.6 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-mapreduce/2.0.0-alpha4/hbase-mapreduce-2.0.0-alpha4-tests.jar (464 KB at 21.4 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/mortbay/jasper/apache-jsp/8.0.33/apache-jsp-8.0.33.jar (944 KB at 32.1 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hbase/hbase-server/2.0.0-alpha4/hbase-server-2.0.0-alpha4-tests.jar (7756 KB at 44.9 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-hbase-handler ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/hbase-handler (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-hbase-handler ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-hbase-handler ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-hbase-handler ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-hbase-handler ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-hbase-handler ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/hbase-handler/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-hbase-handler ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-hbase-handler ---
	[INFO] Compiling 34 source files to /Users/xubo/Desktop/xubo/git/hive/hbase-handler/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hbase-handler/src/java/org/apache/hadoop/hive/hbase/HiveHBaseInputFormatUtil.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hbase-handler/src/java/org/apache/hadoop/hive/hbase/HiveHBaseInputFormatUtil.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hbase-handler/src/java/org/apache/hadoop/hive/hbase/HBaseSerDeParameters.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hbase-handler/src/java/org/apache/hadoop/hive/hbase/HBaseSerDeParameters.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- avro-maven-plugin:1.8.2:protocol (default) @ hive-hbase-handler ---
	Downloading: https://repo.maven.apache.org/maven2/org/apache/avro/avro-compiler/1.8.2/avro-compiler-1.8.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/avro/avro-compiler/1.8.2/avro-compiler-1.8.2.pom (5 KB at 8.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-simple/1.7.7/slf4j-simple-1.7.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-simple/1.7.7/slf4j-simple-1.7.7.pom (2 KB at 3.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/avro/avro-compiler/1.8.2/avro-compiler-1.8.2.jar
	Downloading: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-simple/1.7.7/slf4j-simple-1.7.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-simple/1.7.7/slf4j-simple-1.7.7.jar (11 KB at 13.2 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/avro/avro-compiler/1.8.2/avro-compiler-1.8.2.jar (81 KB at 22.9 KB/sec)
	[INFO] 
	[INFO] --- build-helper-maven-plugin:1.7:add-test-source (add-test-sources) @ hive-hbase-handler ---
	[INFO] Test Source directory: /Users/xubo/Desktop/xubo/git/hive/hbase-handler/src/gen/avro/gen-java added.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-hbase-handler ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/hbase-handler/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-hbase-handler ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hbase-handler/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hbase-handler/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hbase-handler/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/hbase-handler/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-hbase-handler ---
	[INFO] Compiling 18 source files to /Users/xubo/Desktop/xubo/git/hive/hbase-handler/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hbase-handler/src/test/org/apache/hadoop/hive/hbase/SampleHBaseKeyFactory3.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hbase-handler/src/test/org/apache/hadoop/hive/hbase/SampleHBaseKeyFactory3.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hbase-handler/src/test/org/apache/hadoop/hive/hbase/avro/Address.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hbase-handler/src/test/org/apache/hadoop/hive/hbase/avro/Address.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-hbase-handler ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-hbase-handler ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/hbase-handler/target/hive-hbase-handler-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-hbase-handler ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:test-jar (default) @ hive-hbase-handler ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/hbase-handler/target/hive-hbase-handler-4.0.0-SNAPSHOT-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive JDBC Handler 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-module-junit4/1.7.4/powermock-module-junit4-1.7.4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-module-junit4/1.7.4/powermock-module-junit4-1.7.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-module-junit4/1.7.4/powermock-module-junit4-1.7.4.pom (7 KB at 9.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-module-junit4-common/1.7.4/powermock-module-junit4-common-1.7.4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-module-junit4-common/1.7.4/powermock-module-junit4-common-1.7.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-module-junit4-common/1.7.4/powermock-module-junit4-common-1.7.4.pom (7 KB at 9.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-reflect/1.7.4/powermock-reflect-1.7.4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-reflect/1.7.4/powermock-reflect-1.7.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-reflect/1.7.4/powermock-reflect-1.7.4.pom (6 KB at 11.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-core/1.7.4/powermock-core-1.7.4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-core/1.7.4/powermock-core-1.7.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-core/1.7.4/powermock-core-1.7.4.pom (6 KB at 11.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/mockito/mockito-core/2.8.9/mockito-core-2.8.9.pom
	Downloading: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/2.8.9/mockito-core-2.8.9.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/2.8.9/mockito-core-2.8.9.pom (3 KB at 4.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/net/bytebuddy/byte-buddy/1.6.14/byte-buddy-1.6.14.pom
	Downloading: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.6.14/byte-buddy-1.6.14.pom
	Downloaded: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.6.14/byte-buddy-1.6.14.pom (12 KB at 16.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/net/bytebuddy/byte-buddy-parent/1.6.14/byte-buddy-parent-1.6.14.pom
	Downloading: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-parent/1.6.14/byte-buddy-parent-1.6.14.pom
	Downloaded: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-parent/1.6.14/byte-buddy-parent-1.6.14.pom (26 KB at 25.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/net/bytebuddy/byte-buddy-agent/1.6.14/byte-buddy-agent-1.6.14.pom
	Downloading: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.6.14/byte-buddy-agent-1.6.14.pom
	Downloaded: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.6.14/byte-buddy-agent-1.6.14.pom (5 KB at 8.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/objenesis/objenesis/2.5/objenesis-2.5.pom
	Downloading: https://repo.maven.apache.org/maven2/org/objenesis/objenesis/2.5/objenesis-2.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/objenesis/objenesis/2.5/objenesis-2.5.pom (3 KB at 6.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/objenesis/objenesis-parent/2.5/objenesis-parent-2.5.pom
	Downloading: https://repo.maven.apache.org/maven2/org/objenesis/objenesis-parent/2.5/objenesis-parent-2.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/objenesis/objenesis-parent/2.5/objenesis-parent-2.5.pom (17 KB at 23.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-api-mockito/1.7.4/powermock-api-mockito-1.7.4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-mockito/1.7.4/powermock-api-mockito-1.7.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-mockito/1.7.4/powermock-api-mockito-1.7.4.pom (6 KB at 10.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-api-mockito-common/1.7.4/powermock-api-mockito-common-1.7.4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-mockito-common/1.7.4/powermock-api-mockito-common-1.7.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-mockito-common/1.7.4/powermock-api-mockito-common-1.7.4.pom (7 KB at 10.6 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-api-support/1.7.4/powermock-api-support-1.7.4.pom
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-support/1.7.4/powermock-api-support-1.7.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-support/1.7.4/powermock-api-support-1.7.4.pom (6 KB at 12.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/h2database/h2/1.3.166/h2-1.3.166.pom
	Downloading: https://repo.maven.apache.org/maven2/com/h2database/h2/1.3.166/h2-1.3.166.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/h2database/h2/1.3.166/h2-1.3.166.pom (670 B at 1.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-module-junit4/1.7.4/powermock-module-junit4-1.7.4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-module-junit4-common/1.7.4/powermock-module-junit4-common-1.7.4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-reflect/1.7.4/powermock-reflect-1.7.4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-core/1.7.4/powermock-core-1.7.4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-api-mockito/1.7.4/powermock-api-mockito-1.7.4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-api-mockito-common/1.7.4/powermock-api-mockito-common-1.7.4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/powermock/powermock-api-support/1.7.4/powermock-api-support-1.7.4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/h2database/h2/1.3.166/h2-1.3.166.jar
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-module-junit4/1.7.4/powermock-module-junit4-1.7.4.jar
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-module-junit4-common/1.7.4/powermock-module-junit4-common-1.7.4.jar
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-reflect/1.7.4/powermock-reflect-1.7.4.jar
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-core/1.7.4/powermock-core-1.7.4.jar
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-mockito/1.7.4/powermock-api-mockito-1.7.4.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-module-junit4-common/1.7.4/powermock-module-junit4-common-1.7.4.jar (18 KB at 12.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-mockito-common/1.7.4/powermock-api-mockito-common-1.7.4.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-mockito-common/1.7.4/powermock-api-mockito-common-1.7.4.jar (35 KB at 6.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-support/1.7.4/powermock-api-support-1.7.4.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-module-junit4/1.7.4/powermock-module-junit4-1.7.4.jar (47 KB at 9.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/h2database/h2/1.3.166/h2-1.3.166.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-reflect/1.7.4/powermock-reflect-1.7.4.jar (65 KB at 12.4 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-core/1.7.4/powermock-core-1.7.4.jar (143 KB at 23.1 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-support/1.7.4/powermock-api-support-1.7.4.jar (23 KB at 3.6 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/powermock/powermock-api-mockito/1.7.4/powermock-api-mockito-1.7.4.jar (84 KB at 8.7 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/com/h2database/h2/1.3.166/h2-1.3.166.jar (1241 KB at 40.0 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-jdbc-handler ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/jdbc-handler (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-jdbc-handler ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-jdbc-handler ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-jdbc-handler ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-jdbc-handler ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-jdbc-handler ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/jdbc-handler/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-jdbc-handler ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-jdbc-handler ---
	[INFO] Compiling 30 source files to /Users/xubo/Desktop/xubo/git/hive/jdbc-handler/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/jdbc-handler/src/main/java/org/apache/hive/storage/jdbc/JdbcSerDe.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/jdbc-handler/src/main/java/org/apache/hive/storage/jdbc/JdbcSerDe.java: Recompile with -Xlint:deprecation for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-jdbc-handler ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 3 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-jdbc-handler ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/jdbc-handler/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/jdbc-handler/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/jdbc-handler/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/jdbc-handler/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-jdbc-handler ---
	[INFO] Compiling 4 source files to /Users/xubo/Desktop/xubo/git/hive/jdbc-handler/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-jdbc-handler ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-jdbc-handler ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/jdbc-handler/target/hive-jdbc-handler-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-jdbc-handler ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive HCatalog 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/pig/pig/0.16.0/pig-0.16.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/pig/pig/0.16.0/pig-0.16.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/pig/pig/0.16.0/pig-0.16.0.pom (6 KB at 13.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/commons-net/commons-net/1.4.1/commons-net-1.4.1.pom
	Downloading: https://repo.maven.apache.org/maven2/commons-net/commons-net/1.4.1/commons-net-1.4.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/commons-net/commons-net/1.4.1/commons-net-1.4.1.pom (5 KB at 10.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/tomcat/jasper-runtime/5.5.12/jasper-runtime-5.5.12.pom
	Downloading: https://repo.maven.apache.org/maven2/tomcat/jasper-runtime/5.5.12/jasper-runtime-5.5.12.pom
	Downloaded: https://repo.maven.apache.org/maven2/tomcat/jasper-runtime/5.5.12/jasper-runtime-5.5.12.pom (155 B at 0.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/tomcat/jasper-compiler/5.5.12/jasper-compiler-5.5.12.pom
	Downloading: https://repo.maven.apache.org/maven2/tomcat/jasper-compiler/5.5.12/jasper-compiler-5.5.12.pom
	Downloaded: https://repo.maven.apache.org/maven2/tomcat/jasper-compiler/5.5.12/jasper-compiler-5.5.12.pom (156 B at 0.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/net/sf/kosmosfs/kfs/0.3/kfs-0.3.pom
	Downloading: https://repo.maven.apache.org/maven2/net/sf/kosmosfs/kfs/0.3/kfs-0.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/net/sf/kosmosfs/kfs/0.3/kfs-0.3.pom (685 B at 1.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/hsqldb/hsqldb/1.8.0.10/hsqldb-1.8.0.10.pom
	Downloading: https://repo.maven.apache.org/maven2/hsqldb/hsqldb/1.8.0.10/hsqldb-1.8.0.10.pom
	Downloaded: https://repo.maven.apache.org/maven2/hsqldb/hsqldb/1.8.0.10/hsqldb-1.8.0.10.pom (600 B at 1.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/dk/brics/automaton/automaton/1.11-8/automaton-1.11-8.pom
	Downloading: https://repo.maven.apache.org/maven2/dk/brics/automaton/automaton/1.11-8/automaton-1.11-8.pom
	Downloaded: https://repo.maven.apache.org/maven2/dk/brics/automaton/automaton/1.11-8/automaton-1.11-8.pom (2 KB at 2.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/joda-time/joda-time/2.1/joda-time-2.1.pom
	Downloading: https://repo.maven.apache.org/maven2/joda-time/joda-time/2.1/joda-time-2.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/joda-time/joda-time/2.1/joda-time-2.1.pom (16 KB at 20.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/ivy/ivy/2.2.0/ivy-2.2.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/ivy/ivy/2.2.0/ivy-2.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/ivy/ivy/2.2.0/ivy-2.2.0.pom (6 KB at 10.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/pig/pig/0.16.0/pig-0.16.0-h2.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/tomcat/jasper-runtime/5.5.12/jasper-runtime-5.5.12.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/tomcat/jasper-compiler/5.5.12/jasper-compiler-5.5.12.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/net/sf/kosmosfs/kfs/0.3/kfs-0.3.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/hsqldb/hsqldb/1.8.0.10/hsqldb-1.8.0.10.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/dk/brics/automaton/automaton/1.11-8/automaton-1.11-8.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/joda-time/joda-time/2.1/joda-time-2.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/ivy/ivy/2.2.0/ivy-2.2.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/pig/pig/0.16.0/pig-0.16.0-h2.jar
	Downloading: https://repo.maven.apache.org/maven2/tomcat/jasper-runtime/5.5.12/jasper-runtime-5.5.12.jar
	Downloading: https://repo.maven.apache.org/maven2/tomcat/jasper-compiler/5.5.12/jasper-compiler-5.5.12.jar
	Downloading: https://repo.maven.apache.org/maven2/net/sf/kosmosfs/kfs/0.3/kfs-0.3.jar
	Downloading: https://repo.maven.apache.org/maven2/hsqldb/hsqldb/1.8.0.10/hsqldb-1.8.0.10.jar
	Downloaded: https://repo.maven.apache.org/maven2/net/sf/kosmosfs/kfs/0.3/kfs-0.3.jar (12 KB at 4.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/dk/brics/automaton/automaton/1.11-8/automaton-1.11-8.jar
	Downloaded: https://repo.maven.apache.org/maven2/dk/brics/automaton/automaton/1.11-8/automaton-1.11-8.jar (173 KB at 13.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/joda-time/joda-time/2.1/joda-time-2.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/tomcat/jasper-runtime/5.5.12/jasper-runtime-5.5.12.jar (75 KB at 5.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/ivy/ivy/2.2.0/ivy-2.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/hsqldb/hsqldb/1.8.0.10/hsqldb-1.8.0.10.jar (691 KB at 17.9 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/tomcat/jasper-compiler/5.5.12/jasper-compiler-5.5.12.jar (396 KB at 9.4 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/joda-time/joda-time/2.1/joda-time-2.1.jar (558 KB at 8.9 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/ivy/ivy/2.2.0/ivy-2.2.0.jar (926 KB at 13.6 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/pig/pig/0.16.0/pig-0.16.0-h2.jar (4307 KB at 34.2 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-hcatalog ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/hcatalog (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-hcatalog ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-hcatalog ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-hcatalog ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-hcatalog ---
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-hcatalog ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-hcatalog ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-hcatalog ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive HCatalog Core 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hadoop/hadoop-mapreduce-client-hs/3.1.0/hadoop-mapreduce-client-hs-3.1.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-hs/3.1.0/hadoop-mapreduce-client-hs-3.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-hs/3.1.0/hadoop-mapreduce-client-hs-3.1.0.pom (3 KB at 6.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hadoop/hadoop-mapreduce-client-app/3.1.0/hadoop-mapreduce-client-app-3.1.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-app/3.1.0/hadoop-mapreduce-client-app-3.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-app/3.1.0/hadoop-mapreduce-client-app-3.1.0.pom (5 KB at 9.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hadoop/hadoop-mapreduce-client-shuffle/3.1.0/hadoop-mapreduce-client-shuffle-3.1.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-shuffle/3.1.0/hadoop-mapreduce-client-shuffle-3.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-shuffle/3.1.0/hadoop-mapreduce-client-shuffle-3.1.0.pom (4 KB at 5.7 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jdt/core/3.1.1/core-3.1.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jdt/core/3.1.1/core-3.1.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jdt/core/3.1.1/core-3.1.1.pom (677 B at 1.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hadoop/hadoop-mapreduce-client-hs/3.1.0/hadoop-mapreduce-client-hs-3.1.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hadoop/hadoop-mapreduce-client-app/3.1.0/hadoop-mapreduce-client-app-3.1.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/hadoop/hadoop-mapreduce-client-shuffle/3.1.0/hadoop-mapreduce-client-shuffle-3.1.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/eclipse/jdt/core/3.1.1/core-3.1.1.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-hs/3.1.0/hadoop-mapreduce-client-hs-3.1.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-app/3.1.0/hadoop-mapreduce-client-app-3.1.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-shuffle/3.1.0/hadoop-mapreduce-client-shuffle-3.1.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jdt/core/3.1.1/core-3.1.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-shuffle/3.1.0/hadoop-mapreduce-client-shuffle-3.1.0.jar (97 KB at 9.9 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-hs/3.1.0/hadoop-mapreduce-client-hs-3.1.0.jar (211 KB at 11.8 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-app/3.1.0/hadoop-mapreduce-client-app-3.1.0.jar (597 KB at 23.7 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jdt/core/3.1.1/core-3.1.1.jar (3484 KB at 42.3 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-hcatalog-core ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/hcatalog/core (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-hcatalog-core ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-hcatalog-core ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-hcatalog-core ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-hcatalog-core ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-hcatalog-core ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/hcatalog/core/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-hcatalog-core ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-hcatalog-core ---
	[INFO] Compiling 79 source files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/core/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/core/src/main/java/org/apache/hive/hcatalog/common/HCatUtil.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/core/src/main/java/org/apache/hive/hcatalog/common/HCatUtil.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/core/src/main/java/org/apache/hive/hcatalog/mapreduce/MultiOutputFormat.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/core/src/main/java/org/apache/hive/hcatalog/mapreduce/MultiOutputFormat.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-hcatalog-core ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/hcatalog/core/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-hcatalog-core ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/core/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/core/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/core/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/core/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-hcatalog-core ---
	[INFO] Compiling 40 source files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/core/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/core/src/test/java/org/apache/hive/hcatalog/mapreduce/TestHCatDynamicPartitioned.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/core/src/test/java/org/apache/hive/hcatalog/mapreduce/TestHCatDynamicPartitioned.java: Recompile with -Xlint:deprecation for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-hcatalog-core ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-hcatalog-core ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/hcatalog/core/target/hive-hcatalog-core-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-hcatalog-core ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:test-jar (default) @ hive-hcatalog-core ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/hcatalog/core/target/hive-hcatalog-core-4.0.0-SNAPSHOT-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive HCatalog Pig Adapter 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-hcatalog-pig-adapter ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-hcatalog-pig-adapter ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-hcatalog-pig-adapter ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-hcatalog-pig-adapter ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-hcatalog-pig-adapter ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-hcatalog-pig-adapter ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-hcatalog-pig-adapter ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-hcatalog-pig-adapter ---
	[INFO] Compiling 5 source files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter/src/main/java/org/apache/hive/hcatalog/pig/HCatBaseStorer.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter/src/main/java/org/apache/hive/hcatalog/pig/HCatBaseStorer.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter/src/main/java/org/apache/hive/hcatalog/pig/HCatBaseStorer.java: /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter/src/main/java/org/apache/hive/hcatalog/pig/HCatBaseStorer.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter/src/main/java/org/apache/hive/hcatalog/pig/HCatBaseStorer.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-hcatalog-pig-adapter ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-hcatalog-pig-adapter ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-hcatalog-pig-adapter ---
	[INFO] Compiling 26 source files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter/src/test/java/org/apache/hive/hcatalog/pig/TestPigHCatUtil.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter/src/test/java/org/apache/hive/hcatalog/pig/TestPigHCatUtil.java: Recompile with -Xlint:deprecation for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-hcatalog-pig-adapter ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-hcatalog-pig-adapter ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/hcatalog/hcatalog-pig-adapter/target/hive-hcatalog-pig-adapter-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-hcatalog-pig-adapter ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive HCatalog Server Extensions 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/activemq/activemq-core/5.5.0/activemq-core-5.5.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/activemq/activemq-core/5.5.0/activemq-core-5.5.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/activemq/activemq-core/5.5.0/activemq-core-5.5.0.pom (25 KB at 32.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/activemq/activemq-parent/5.5.0/activemq-parent-5.5.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/activemq/activemq-parent/5.5.0/activemq-parent-5.5.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/activemq/activemq-parent/5.5.0/activemq-parent-5.5.0.pom (45 KB at 44.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/geronimo/specs/geronimo-jms_1.1_spec/1.1.1/geronimo-jms_1.1_spec-1.1.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/geronimo/specs/geronimo-jms_1.1_spec/1.1.1/geronimo-jms_1.1_spec-1.1.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/geronimo/specs/geronimo-jms_1.1_spec/1.1.1/geronimo-jms_1.1_spec-1.1.1.pom (3 KB at 5.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/activemq/activeio-core/3.1.2/activeio-core-3.1.2.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/activemq/activeio-core/3.1.2/activeio-core-3.1.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/activemq/activeio-core/3.1.2/activeio-core-3.1.2.pom (3 KB at 6.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/activemq/activeio-parent/3.1.2/activeio-parent-3.1.2.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/activemq/activeio-parent/3.1.2/activeio-parent-3.1.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/activemq/activeio-parent/3.1.2/activeio-parent-3.1.2.pom (11 KB at 18.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/geronimo/specs/geronimo-j2ee-management_1.1_spec/1.0.1/geronimo-j2ee-management_1.1_spec-1.0.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/geronimo/specs/geronimo-j2ee-management_1.1_spec/1.0.1/geronimo-j2ee-management_1.1_spec-1.0.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/geronimo/specs/geronimo-j2ee-management_1.1_spec/1.0.1/geronimo-j2ee-management_1.1_spec-1.0.1.pom (3 KB at 5.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/activemq/kahadb/5.5.0/kahadb-5.5.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/activemq/kahadb/5.5.0/kahadb-5.5.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/activemq/kahadb/5.5.0/kahadb-5.5.0.pom (4 KB at 6.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/activemq/protobuf/activemq-protobuf/1.1/activemq-protobuf-1.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/activemq/protobuf/activemq-protobuf/1.1/activemq-protobuf-1.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/activemq/protobuf/activemq-protobuf/1.1/activemq-protobuf-1.1.pom (3 KB at 6.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/activemq/protobuf/activemq-protobuf-pom/1.1/activemq-protobuf-pom-1.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/activemq/protobuf/activemq-protobuf-pom/1.1/activemq-protobuf-pom-1.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/activemq/protobuf/activemq-protobuf-pom/1.1/activemq-protobuf-pom-1.1.pom (12 KB at 9.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/commons-net/commons-net/2.0/commons-net-2.0.pom
	Downloading: https://repo.maven.apache.org/maven2/commons-net/commons-net/2.0/commons-net-2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/commons-net/commons-net/2.0/commons-net-2.0.pom (8 KB at 15.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/jasypt/jasypt/1.7/jasypt-1.7.pom
	Downloading: https://repo.maven.apache.org/maven2/org/jasypt/jasypt/1.7/jasypt-1.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/jasypt/jasypt/1.7/jasypt-1.7.pom (20 KB at 29.5 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/javax/jms/jms/1.1/jms-1.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/activemq/activemq-core/5.5.0/activemq-core-5.5.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/geronimo/specs/geronimo-jms_1.1_spec/1.1.1/geronimo-jms_1.1_spec-1.1.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/activemq/activeio-core/3.1.2/activeio-core-3.1.2.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/activemq/protobuf/activemq-protobuf/1.1/activemq-protobuf-1.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/geronimo/specs/geronimo-j2ee-management_1.1_spec/1.0.1/geronimo-j2ee-management_1.1_spec-1.0.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/jasypt/jasypt/1.7/jasypt-1.7.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/activemq/kahadb/5.5.0/kahadb-5.5.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/pig/pig/0.16.0/pig-0.16.0.jar
	[WARNING] Could not validate integrity of download from http://www.datanucleus.org/downloads/maven2/javax/jms/jms/1.1/jms-1.1.jar: Checksum validation failed, no checksums available
	[WARNING] Checksum validation failed, no checksums available for http://www.datanucleus.org/downloads/maven2/javax/jms/jms/1.1/jms-1.1.jar
	Downloaded: http://www.datanucleus.org/downloads/maven2/javax/jms/jms/1.1/jms-1.1.jar (26 KB at 13.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/activemq/activemq-core/5.5.0/activemq-core-5.5.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/geronimo/specs/geronimo-jms_1.1_spec/1.1.1/geronimo-jms_1.1_spec-1.1.1.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/activemq/activeio-core/3.1.2/activeio-core-3.1.2.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/activemq/protobuf/activemq-protobuf/1.1/activemq-protobuf-1.1.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/geronimo/specs/geronimo-j2ee-management_1.1_spec/1.0.1/geronimo-j2ee-management_1.1_spec-1.0.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/geronimo/specs/geronimo-jms_1.1_spec/1.1.1/geronimo-jms_1.1_spec-1.1.1.jar (32 KB at 9.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/jasypt/jasypt/1.7/jasypt-1.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/geronimo/specs/geronimo-j2ee-management_1.1_spec/1.0.1/geronimo-j2ee-management_1.1_spec-1.0.1.jar (20 KB at 4.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/activemq/kahadb/5.5.0/kahadb-5.5.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/activemq/activeio-core/3.1.2/activeio-core-3.1.2.jar (101 KB at 7.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/pig/pig/0.16.0/pig-0.16.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/activemq/protobuf/activemq-protobuf/1.1/activemq-protobuf-1.1.jar (145 KB at 8.2 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/activemq/kahadb/5.5.0/kahadb-5.5.0.jar (151 KB at 7.0 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/jasypt/jasypt/1.7/jasypt-1.7.jar (169 KB at 5.7 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/activemq/activemq-core/5.5.0/activemq-core-5.5.0.jar (3466 KB at 29.5 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/pig/pig/0.16.0/pig-0.16.0.jar (3989 KB at 30.8 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-hcatalog-server-extensions ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-hcatalog-server-extensions ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-hcatalog-server-extensions ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-hcatalog-server-extensions ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-hcatalog-server-extensions ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-hcatalog-server-extensions ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-hcatalog-server-extensions ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-hcatalog-server-extensions ---
	[INFO] Compiling 30 source files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions/src/main/java/org/apache/hive/hcatalog/listener/DbNotificationListener.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions/src/main/java/org/apache/hive/hcatalog/listener/DbNotificationListener.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions/src/main/java/org/apache/hive/hcatalog/messaging/MessageFactory.java: /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions/src/main/java/org/apache/hive/hcatalog/messaging/MessageFactory.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions/src/main/java/org/apache/hive/hcatalog/messaging/MessageFactory.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-hcatalog-server-extensions ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-hcatalog-server-extensions ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-hcatalog-server-extensions ---
	[INFO] Compiling 2 source files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions/src/test/java/org/apache/hive/hcatalog/listener/TestMsgBusConnection.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions/src/test/java/org/apache/hive/hcatalog/listener/TestMsgBusConnection.java: Recompile with -Xlint:deprecation for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-hcatalog-server-extensions ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-hcatalog-server-extensions ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/hcatalog/server-extensions/target/hive-hcatalog-server-extensions-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-hcatalog-server-extensions ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive HCatalog Webhcat Java Client 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-webhcat-java-client ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-webhcat-java-client ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-webhcat-java-client ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-webhcat-java-client ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-webhcat-java-client ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-webhcat-java-client ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-webhcat-java-client ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-webhcat-java-client ---
	[INFO] Compiling 37 source files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client/src/main/java/org/apache/hive/hcatalog/api/HCatClientHMSImpl.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client/src/main/java/org/apache/hive/hcatalog/api/HCatClientHMSImpl.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client/src/main/java/org/apache/hive/hcatalog/api/repl/ReplicationTask.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client/src/main/java/org/apache/hive/hcatalog/api/repl/ReplicationTask.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-webhcat-java-client ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-webhcat-java-client ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-webhcat-java-client ---
	[INFO] Compiling 7 source files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client/src/test/java/org/apache/hive/hcatalog/api/repl/CommandTestUtils.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client/src/test/java/org/apache/hive/hcatalog/api/repl/CommandTestUtils.java: Recompile with -Xlint:deprecation for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-webhcat-java-client ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-webhcat-java-client ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client/target/hive-webhcat-java-client-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-webhcat-java-client ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:test-jar (default) @ hive-webhcat-java-client ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/java-client/target/hive-webhcat-java-client-4.0.0-SNAPSHOT-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive HCatalog Webhcat 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-javadoc-plugin/2.4/maven-javadoc-plugin-2.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-javadoc-plugin/2.4/maven-javadoc-plugin-2.4.pom (10 KB at 13.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/10/maven-plugins-10.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/10/maven-plugins-10.pom (8 KB at 11.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-javadoc-plugin/2.4/maven-javadoc-plugin-2.4.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-javadoc-plugin/2.4/maven-javadoc-plugin-2.4.jar (73 KB at 31.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/sun/jersey/contribs/wadl-resourcedoc-doclet/1.4/wadl-resourcedoc-doclet-1.4.pom
	Downloading: https://repo.maven.apache.org/maven2/com/sun/jersey/contribs/wadl-resourcedoc-doclet/1.4/wadl-resourcedoc-doclet-1.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/sun/jersey/contribs/wadl-resourcedoc-doclet/1.4/wadl-resourcedoc-doclet-1.4.pom (5 KB at 8.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/sun/jersey/contribs/jersey-contribs/1.4/jersey-contribs-1.4.pom
	Downloading: https://repo.maven.apache.org/maven2/com/sun/jersey/contribs/jersey-contribs/1.4/jersey-contribs-1.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/sun/jersey/contribs/jersey-contribs/1.4/jersey-contribs-1.4.pom (4 KB at 6.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/sun/jersey/jersey-project/1.4/jersey-project-1.4.pom
	Downloading: https://repo.maven.apache.org/maven2/com/sun/jersey/jersey-project/1.4/jersey-project-1.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/sun/jersey/jersey-project/1.4/jersey-project-1.4.pom (12 KB at 15.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/slf4j/jul-to-slf4j/1.7.10/jul-to-slf4j-1.7.10.pom
	Downloading: https://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/1.7.10/jul-to-slf4j-1.7.10.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/1.7.10/jul-to-slf4j-1.7.10.pom (0 B at 0.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/sun/jersey/contribs/wadl-resourcedoc-doclet/1.4/wadl-resourcedoc-doclet-1.4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/slf4j/jul-to-slf4j/1.7.10/jul-to-slf4j-1.7.10.jar
	Downloading: https://repo.maven.apache.org/maven2/com/sun/jersey/contribs/wadl-resourcedoc-doclet/1.4/wadl-resourcedoc-doclet-1.4.jar
	Downloading: https://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/1.7.10/jul-to-slf4j-1.7.10.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/1.7.10/jul-to-slf4j-1.7.10.jar (0 B at 0.0 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/com/sun/jersey/contribs/wadl-resourcedoc-doclet/1.4/wadl-resourcedoc-doclet-1.4.jar (18 KB at 24.7 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-webhcat ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-webhcat ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-webhcat ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-webhcat ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-webhcat ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-webhcat ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 2 resources to .
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-webhcat ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-webhcat ---
	[INFO] Compiling 70 source files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/AppConfig.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/AppConfig.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/JsonBuilder.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/JsonBuilder.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-javadoc-plugin:2.4:javadoc (resourcesdoc.xml) @ hive-webhcat ---
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/2.0.8/maven-reporting-api-2.0.8.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/2.0.8/maven-reporting-api-2.0.8.pom (2 KB at 3.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting/2.0.8/maven-reporting-2.0.8.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting/2.0.8/maven-reporting-2.0.8.pom (2 KB at 3.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0-alpha-9/doxia-sink-api-1.0-alpha-9.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0-alpha-9/doxia-sink-api-1.0-alpha-9.pom (2 KB at 2.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.0-alpha-9/doxia-1.0-alpha-9.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.0-alpha-9/doxia-1.0-alpha-9.pom (9 KB at 17.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.0-alpha-7/doxia-site-renderer-1.0-alpha-7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.0-alpha-7/doxia-site-renderer-1.0-alpha-7.pom (2 KB at 3.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.0-alpha-7/doxia-core-1.0-alpha-7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.0-alpha-7/doxia-core-1.0-alpha-7.pom (2 KB at 2.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/oro/oro/2.0.7/oro-2.0.7.pom
	Downloaded: https://repo.maven.apache.org/maven2/oro/oro/2.0.7/oro-2.0.7.pom (141 B at 0.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/1.1.2/plexus-velocity-1.1.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/1.1.2/plexus-velocity-1.1.2.pom (8 KB at 14.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/commons-logging/commons-logging-api/1.0.4/commons-logging-api-1.0.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/commons-logging/commons-logging-api/1.0.4/commons-logging-api-1.0.4.pom (168 B at 0.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/velocity/velocity/1.4/velocity-1.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/velocity/velocity/1.4/velocity-1.4.pom (3 KB at 4.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/velocity/velocity-dep/1.4/velocity-dep-1.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/velocity/velocity-dep/1.4/velocity-dep-1.4.pom (2 KB at 4.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.0-alpha-7/doxia-decoration-model-1.0-alpha-7.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.0-alpha-7/doxia-decoration-model-1.0-alpha-7.pom (2 KB at 3.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.8/maven-repository-metadata-2.0.8.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.0.8/maven-model-2.0.8.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.0.8/maven-settings-2.0.8.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.8/maven-plugin-api-2.0.8.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/2.0.8/maven-reporting-api-2.0.8.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.8/maven-plugin-api-2.0.8.jar (13 KB at 8.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.8/maven-artifact-2.0.8.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/2.0.8/maven-reporting-api-2.0.8.jar (10 KB at 5.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.0-alpha-7/doxia-site-renderer-1.0-alpha-7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.0.8/maven-settings-2.0.8.jar (48 KB at 21.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.0-alpha-7/doxia-core-1.0-alpha-7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.8/maven-repository-metadata-2.0.8.jar (24 KB at 9.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/oro/oro/2.0.7/oro-2.0.7.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.0-alpha-7/doxia-site-renderer-1.0-alpha-7.jar (13 KB at 3.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/1.1.2/plexus-velocity-1.1.2.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/1.1.2/plexus-velocity-1.1.2.jar (8 KB at 1.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/2.0/commons-collections-2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.8/maven-artifact-2.0.8.jar (86 KB at 13.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/commons-logging/commons-logging-api/1.0.4/commons-logging-api-1.0.4.jar
	Downloaded: https://repo.maven.apache.org/maven2/oro/oro/2.0.7/oro-2.0.7.jar (64 KB at 7.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/velocity/velocity/1.4/velocity-1.4.jar
	Downloaded: https://repo.maven.apache.org/maven2/commons-logging/commons-logging-api/1.0.4/commons-logging-api-1.0.4.jar (26 KB at 2.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/velocity/velocity-dep/1.4/velocity-dep-1.4.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.0.8/maven-model-2.0.8.jar (85 KB at 9.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.0-alpha-7/doxia-decoration-model-1.0-alpha-7.jar
	Downloaded: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/2.0/commons-collections-2.0.jar (89 KB at 9.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.4.6/plexus-utils-1.4.6.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.0-alpha-7/doxia-decoration-model-1.0-alpha-7.jar (38 KB at 2.5 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.0-alpha-7/doxia-core-1.0-alpha-7.jar (226 KB at 11.6 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.4.6/plexus-utils-1.4.6.jar (200 KB at 9.7 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/velocity/velocity-dep/1.4/velocity-dep-1.4.jar (506 KB at 20.2 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/velocity/velocity/1.4/velocity-1.4.jar (353 KB at 12.4 KB/sec)
	[INFO] Setting property: classpath.resource.loader.class => 'org.codehaus.plexus.velocity.ContextClassLoaderResourceLoader'.
	[INFO] Setting property: velocimacro.messages.on => 'false'.
	[INFO] Setting property: resource.loader => 'classpath'.
	[INFO] Setting property: resource.manager.logwhenfound => 'false'.
	[INFO] ************************************************************** 
	[INFO] Starting Jakarta Velocity v1.4
	[INFO] RuntimeInstance initializing.
	[INFO] Default Properties File: org/apache/velocity/runtime/defaults/velocity.properties
	[INFO] Default ResourceManager initializing. (class org.apache.velocity.runtime.resource.ResourceManagerImpl)
	[INFO] Resource Loader Instantiated: org.codehaus.plexus.velocity.ContextClassLoaderResourceLoader
	[INFO] ClasspathResourceLoader : initialization starting.
	[INFO] ClasspathResourceLoader : initialization complete.
	[INFO] ResourceCache : initialized. (class org.apache.velocity.runtime.resource.ResourceCacheImpl)
	[INFO] Default ResourceManager initialization complete.
	[INFO] Loaded System Directive: org.apache.velocity.runtime.directive.Literal
	[INFO] Loaded System Directive: org.apache.velocity.runtime.directive.Macro
	[INFO] Loaded System Directive: org.apache.velocity.runtime.directive.Parse
	[INFO] Loaded System Directive: org.apache.velocity.runtime.directive.Include
	[INFO] Loaded System Directive: org.apache.velocity.runtime.directive.Foreach
	[INFO] Created: 20 parsers.
	[INFO] Velocimacro : initialization starting.
	[INFO] Velocimacro : adding VMs from VM library template : VM_global_library.vm
	[ERROR] ResourceManager : unable to find resource 'VM_global_library.vm' in any resource loader.
	[INFO] Velocimacro : error using  VM library template VM_global_library.vm : org.apache.velocity.exception.ResourceNotFoundException: Unable to find resource 'VM_global_library.vm'
	[INFO] Velocimacro :  VM library template macro registration complete.
	[INFO] Velocimacro : allowInline = true : VMs can be defined inline in templates
	[INFO] Velocimacro : allowInlineToOverride = false : VMs defined inline may NOT replace previous VM definitions
	[INFO] Velocimacro : allowInlineLocal = false : VMs defined inline will be  global in scope if allowed.
	[INFO] Velocimacro : initialization complete.
	[INFO] Velocity successfully started.
	Loading source files for package org.apache.hive.hcatalog.templeton...
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/JsonBuilder.java]]
	[parsing completed 25ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/JobCallable.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/WadlConfig.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/ExecBean.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/PigDelegator.java]]
	[parsing completed 6ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/JarDelegator.java]]
	[parsing completed 2ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/StreamingDelegator.java]]
	[parsing completed 2ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/MaxByteArrayOutputStream.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/SimpleWebException.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/SecureProxySupport.java]]
	[parsing completed 4ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/DatabaseDesc.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/CompleteBean.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/TempletonDelegator.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/TableLikeDesc.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/JobRequestExecutor.java]]
	[parsing completed 5ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/CallbackFailedException.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/TablePropertyDesc.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/TableDesc.java]]
	[parsing completed 3ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/JobItemBean.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/StatusDelegator.java]]
	[parsing completed 2ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/ColumnDesc.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/TooManyRequestsException.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/ExecServiceImpl.java]]
	[parsing completed 3ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/GroupPermissionsDesc.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/ProxyUserSupport.java]]
	[parsing completed 3ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/EnqueueBean.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/SqoopDelegator.java]]
	[parsing completed 3ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/BadParam.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/ListDelegator.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/BusyException.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/Main.java]]
	[parsing completed 2ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/HcatDelegator.java]]
	[parsing completed 5ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/CatchallExceptionMapper.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/QueueStatusBean.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/QueueException.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/HcatException.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/UgiFactory.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/Server.java]]
	[parsing completed 11ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/AppConfig.java]]
	[parsing completed 6ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/VersionDelegator.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/NotAuthorizedException.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/PartitionDesc.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/HiveDelegator.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/DeleteDelegator.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/LauncherDelegator.java]]
	[parsing completed 6ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/CompleteDelegator.java]]
	[parsing completed 2ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/ExecService.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/SimpleExceptionMapper.java]]
	[parsing completed 1ms]
	Loading source files for package org.apache.hive.hcatalog.templeton.tool...
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/SingleInputFormat.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/TempletonStorage.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/NullRecordReader.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/TempletonUtils.java]]
	[parsing completed 7ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/JarJobIDParser.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/LaunchMapper.java]]
	[parsing completed 7ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/DelegationTokenCache.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/JobStateTracker.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/NullSplit.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/TrivialExecService.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/LogRetriever.java]]
	[parsing completed 3ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/TempletonControllerJob.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/HDFSCleanup.java]]
	[parsing completed 5ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/HiveJobIDParser.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/JobIDParser.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/ZooKeeperCleanup.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/ZooKeeperStorage.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/PigJobIDParser.java]]
	[parsing completed 0ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/NotFoundException.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/HDFSStorage.java]]
	[parsing completed 1ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/JobState.java]]
	[parsing completed 2ms]
	[parsing started RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java/org/apache/hive/hcatalog/templeton/tool/JobSubmissionConstants.java]]
	[parsing completed 0ms]
	Constructing Javadoc information...
	[search path for source files: /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/main/java,/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/generated-sources/annotations]
	[search path for class files: /Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/resources.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/sunrsasign.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/jsse.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/jce.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/charsets.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/jfr.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/classes,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/sunec.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/nashorn.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/cldrdata.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/jfxrt.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/dnsns.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/localedata.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/jaccess.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/zipfs.jar,/System/Library/Java/Extensions/MRJToolkit.jar,/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes,/Users/xubo/.m2/repository/org/apache/hbase/hbase-server/2.0.0-alpha4/hbase-server-2.0.0-alpha4.jar,/Users/xubo/.m2/repository/org/roaringbitmap/RoaringBitmap/0.5.11/RoaringBitmap-0.5.11.jar,/Users/xubo/.m2/repository/org/json4s/json4s-ast_2.11/3.2.11/json4s-ast_2.11-3.2.11.jar,/Users/xubo/.m2/repository/com/twitter/chill-java/0.8.4/chill-java-0.8.4.jar,/Users/xubo/.m2/repository/org/codehaus/jettison/jettison/1.1/jettison-1.1.jar,/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-server/9.3.25.v20180904/jetty-server-9.3.25.v20180904.jar,/Users/xubo/.m2/repository/com/fasterxml/jackson/jaxrs/jackson-jaxrs-base/2.9.5/jackson-jaxrs-base-2.9.5.jar,/Users/xubo/Desktop/xubo/git/hive/shims/common/target/hive-shims-common-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/com/fasterxml/jackson/jaxrs/jackson-jaxrs-json-provider/2.9.5/jackson-jaxrs-json-provider-2.9.5.jar,/Users/xubo/Desktop/xubo/git/hive/shims/0.23/target/hive-shims-0.23-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/org/threeten/threetenbp/1.3.5/threetenbp-1.3.5.jar,/Users/xubo/.m2/repository/org/apache/hbase/hbase-client/2.0.0-alpha4/hbase-client-2.0.0-alpha4.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-client/3.1.0/hadoop-client-3.1.0.jar,/Users/xubo/.m2/repository/com/carrotsearch/hppc/0.7.2/hppc-0.7.2.jar,/Users/xubo/.m2/repository/org/apache/hbase/hbase-procedure/2.0.0-alpha4/hbase-procedure-2.0.0-alpha4.jar,/Users/xubo/.m2/repository/org/apache/yetus/audience-annotations/0.5.0/audience-annotations-0.5.0.jar,/Users/xubo/.m2/repository/org/apache/kerby/kerb-simplekdc/1.0.1/kerb-simplekdc-1.0.1.jar,/Users/xubo/.m2/repository/de/ruedigermoeller/fst/2.50/fst-2.50.jar,/Users/xubo/.m2/repository/com/esotericsoftware/kryo-shaded/3.0.3/kryo-shaded-3.0.3.jar,/Users/xubo/.m2/repository/commons-beanutils/commons-beanutils/1.9.3/commons-beanutils-1.9.3.jar,/Users/xubo/.m2/repository/commons-collections/commons-collections/3.2.2/commons-collections-3.2.2.jar,/Users/xubo/.m2/repository/org/apache/hbase/hbase-mapreduce/2.0.0-alpha4/hbase-mapreduce-2.0.0-alpha4.jar,/Users/xubo/.m2/repository/io/airlift/aircompressor/0.10/aircompressor-0.10.jar,/Users/xubo/.m2/repository/org/glassfish/hk2/hk2-utils/2.5.0-b32/hk2-utils-2.5.0-b32.jar,/Users/xubo/.m2/repository/org/json4s/json4s-jackson_2.11/3.2.11/json4s-jackson_2.11-3.2.11.jar,/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-client/9.3.25.v20180904/jetty-client-9.3.25.v20180904.jar,/Users/xubo/.m2/repository/com/fasterxml/jackson/module/jackson-module-paranamer/2.9.5/jackson-module-paranamer-2.9.5.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-yarn-server-web-proxy/3.1.0/hadoop-yarn-server-web-proxy-3.1.0.jar,/Users/xubo/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.9.5/jackson-core-2.9.5.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-common/3.1.0/hadoop-mapreduce-client-common-3.1.0.jar,/Users/xubo/.m2/repository/org/codehaus/janino/janino/2.7.6/janino-2.7.6.jar,/Users/xubo/.m2/repository/org/apache/curator/curator-framework/2.12.0/curator-framework-2.12.0.jar,/Users/xubo/.m2/repository/org/slf4j/jul-to-slf4j/1.7.10/jul-to-slf4j-1.7.10.jar,/Users/xubo/.m2/repository/com/jolbox/bonecp/0.8.0.RELEASE/bonecp-0.8.0.RELEASE.jar,/Users/xubo/Desktop/xubo/git/hive/hcatalog/core/target/hive-hcatalog-core-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-servlet/9.3.25.v20180904/jetty-servlet-9.3.25.v20180904.jar,/Users/xubo/.m2/repository/org/json4s/json4s-core_2.11/3.2.11/json4s-core_2.11-3.2.11.jar,/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-http/9.3.25.v20180904/jetty-http-9.3.25.v20180904.jar,/Users/xubo/.m2/repository/org/apache/logging/log4j/log4j-slf4j-impl/2.10.0/log4j-slf4j-impl-2.10.0.jar,/Users/xubo/.m2/repository/javax/transaction/jta/1.1/jta-1.1.jar,/Users/xubo/.m2/repository/org/scala-lang/modules/scala-parser-combinators_2.11/1.0.1/scala-parser-combinators_2.11-1.0.1.jar,/Users/xubo/.m2/repository/com/github/stephenc/jcip/jcip-annotations/1.0-1/jcip-annotations-1.0-1.jar,/Users/xubo/.m2/repository/io/netty/netty-common/4.1.17.Final/netty-common-4.1.17.Final.jar,/Users/xubo/.m2/repository/org/apache/logging/log4j/log4j-web/2.10.0/log4j-web-2.10.0.jar,/Users/xubo/.m2/repository/org/apache/arrow/arrow-memory/0.10.0/arrow-memory-0.10.0.jar,/Users/xubo/.m2/repository/org/apache/curator/curator-client/2.12.0/curator-client-2.12.0.jar,/Users/xubo/.m2/repository/org/scala-lang/scala-compiler/2.11.0/scala-compiler-2.11.0.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-distcp/2.7.1/hadoop-distcp-2.7.1.jar,/Users/xubo/.m2/repository/org/apache/avro/avro-mapred/1.8.2/avro-mapred-1.8.2-hadoop2.jar,/Users/xubo/.m2/repository/org/datanucleus/javax.jdo/3.2.0-m3/javax.jdo-3.2.0-m3.jar,/Users/xubo/.m2/repository/org/apache/spark/spark-kvstore_2.11/2.3.0/spark-kvstore_2.11-2.3.0.jar,/Users/xubo/.m2/repository/org/jruby/jcodings/jcodings/1.0.18/jcodings-1.0.18.jar,/Users/xubo/.m2/repository/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.jar,/Users/xubo/.m2/repository/org/apache/commons/commons-pool2/2.5.0/commons-pool2-2.5.0.jar,/Users/xubo/.m2/repository/com/cedarsoftware/java-util/1.9.0/java-util-1.9.0.jar,/Users/xubo/.m2/repository/com/github/joshelser/dropwizard-metrics-hadoop-metrics2-reporter/0.1.2/dropwizard-metrics-hadoop-metrics2-reporter-0.1.2.jar,/Users/xubo/.m2/repository/io/dropwizard/metrics/metrics-core/3.1.0/metrics-core-3.1.0.jar,/Users/xubo/.m2/repository/com/microsoft/sqlserver/mssql-jdbc/6.2.1.jre7/mssql-jdbc-6.2.1.jre7.jar,/Users/xubo/.m2/repository/net/razorvine/pyrolite/4.13/pyrolite-4.13.jar,/Users/xubo/.m2/repository/com/yahoo/datasketches/memory/0.9.0/memory-0.9.0.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-yarn-api/3.1.0/hadoop-yarn-api-3.1.0.jar,/Users/xubo/.m2/repository/org/javassist/javassist/3.20.0-GA/javassist-3.20.0-GA.jar,/Users/xubo/.m2/repository/com/lmax/disruptor/3.3.6/disruptor-3.3.6.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-jobclient/3.1.0/hadoop-mapreduce-client-jobclient-3.1.0.jar,/Users/xubo/.m2/repository/org/apache/hbase/hbase-hadoop2-compat/2.0.0-alpha4/hbase-hadoop2-compat-2.0.0-alpha4.jar,/Users/xubo/.m2/repository/org/apache/httpcomponents/httpcore/4.4.4/httpcore-4.4.4.jar,/Users/xubo/.m2/repository/org/apache/kerby/kerby-asn1/1.0.1/kerby-asn1-1.0.1.jar,/Users/xubo/.m2/repository/org/codehaus/janino/commons-compiler/2.7.6/commons-compiler-2.7.6.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-yarn-client/3.1.0/hadoop-yarn-client-3.1.0.jar,/Users/xubo/.m2/repository/org/apache/hbase/hbase-replication/2.0.0-alpha4/hbase-replication-2.0.0-alpha4.jar,/Users/xubo/.m2/repository/org/apache/hbase/hbase-prefix-tree/2.0.0-alpha4/hbase-prefix-tree-2.0.0-alpha4.jar,/Users/xubo/.m2/repository/org/apache/calcite/avatica/avatica/1.12.0/avatica-1.12.0.jar,/Users/xubo/.m2/repository/com/google/re2j/re2j/1.1/re2j-1.1.jar,/Users/xubo/.m2/repository/org/apache/curator/curator-recipes/2.12.0/curator-recipes-2.12.0.jar,/Users/xubo/.m2/repository/org/apache/orc/orc-core/1.5.3/orc-core-1.5.3.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-yarn-server-resourcemanager/3.1.0/hadoop-yarn-server-resourcemanager-3.1.0.jar,/Users/xubo/.m2/repository/com/esri/geometry/esri-geometry-api/2.0.0/esri-geometry-api-2.0.0.jar,/Users/xubo/.m2/repository/org/scala-lang/scala-library/2.11.8/scala-library-2.11.8.jar,/Users/xubo/.m2/repository/org/apache/orc/orc-shims/1.5.3/orc-shims-1.5.3.jar,/Users/xubo/.m2/repository/commons-codec/commons-codec/1.7/commons-codec-1.7.jar,/Users/xubo/.m2/repository/org/apache/hbase/thirdparty/hbase-shaded-netty/1.0.1/hbase-shaded-netty-1.0.1.jar,/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-xml/9.3.25.v20180904/jetty-xml-9.3.25.v20180904.jar,/Users/xubo/.m2/repository/org/codehaus/jackson/jackson-jaxrs/1.9.2/jackson-jaxrs-1.9.2.jar,/Users/xubo/.m2/repository/org/codehaus/jackson/jackson-core-asl/1.9.2/jackson-core-asl-1.9.2.jar,/Users/xubo/.m2/repository/co/cask/tephra/tephra-api/0.6.0/tephra-api-0.6.0.jar,/Users/xubo/.m2/repository/org/apache/twill/twill-core/0.6.0-incubating/twill-core-0.6.0-incubating.jar,/Users/xubo/.m2/repository/org/apache/calcite/calcite-core/1.17.0/calcite-core-1.17.0.jar,/Users/xubo/.m2/repository/org/glassfish/jersey/media/jersey-media-jaxb/2.25.1/jersey-media-jaxb-2.25.1.jar,/Users/xubo/.m2/repository/xerces/xercesImpl/2.9.1/xercesImpl-2.9.1.jar,/Users/xubo/.m2/repository/org/apache/kerby/kerb-admin/1.0.1/kerb-admin-1.0.1.jar,/Users/xubo/Desktop/xubo/git/hive/metastore/target/hive-metastore-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/org/tukaani/xz/1.5/xz-1.5.jar,/Users/xubo/.m2/repository/org/datanucleus/datanucleus-core/4.1.17/datanucleus-core-4.1.17.jar,/Users/xubo/.m2/repository/org/apache/ant/ant-launcher/1.9.1/ant-launcher-1.9.1.jar,/Users/xubo/.m2/repository/org/apache/avro/avro-ipc/1.8.2/avro-ipc-1.8.2.jar,/Users/xubo/.m2/repository/org/ehcache/ehcache/3.3.1/ehcache-3.3.1.jar,/Users/xubo/.m2/repository/org/apache/hbase/thirdparty/hbase-shaded-protobuf/1.0.1/hbase-shaded-protobuf-1.0.1.jar,/Users/xubo/.m2/repository/org/glassfish/hk2/osgi-resource-locator/1.0.1/osgi-resource-locator-1.0.1.jar,/Users/xubo/Desktop/xubo/git/hive/shims/scheduler/target/hive-shims-scheduler-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/com/sun/jersey/jersey-json/1.19/jersey-json-1.19.jar,/Users/xubo/.m2/repository/org/glassfish/hk2/external/javax.inject/2.5.0-b32/javax.inject-2.5.0-b32.jar,/Users/xubo/.m2/repository/sqlline/sqlline/1.3.0/sqlline-1.3.0.jar,/Users/xubo/.m2/repository/jline/jline/2.12/jline-2.12.jar,/Users/xubo/.m2/repository/commons-dbcp/commons-dbcp/1.4/commons-dbcp-1.4.jar,/Users/xubo/.m2/repository/com/google/guava/guava/19.0/guava-19.0.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-hdfs/3.1.0/hadoop-hdfs-3.1.0.jar,/Users/xubo/.m2/repository/org/apache/hbase/hbase-metrics-api/2.0.0-alpha4/hbase-metrics-api-2.0.0-alpha4.jar,/Users/xubo/.m2/repository/it/unimi/dsi/fastutil/6.5.6/fastutil-6.5.6.jar,/Users/xubo/.m2/repository/org/scala-lang/scala-reflect/2.11.11/scala-reflect-2.11.11.jar,/Users/xubo/.m2/repository/commons-pool/commons-pool/1.5.4/commons-pool-1.5.4.jar,/Users/xubo/.m2/repository/commons-daemon/commons-daemon/1.0.13/commons-daemon-1.0.13.jar,/Users/xubo/.m2/repository/org/codehaus/jackson/jackson-mapper-asl/1.9.2/jackson-mapper-asl-1.9.2.jar,/Users/xubo/.m2/repository/org/jruby/joni/joni/2.1.11/joni-2.1.11.jar,/Users/xubo/.m2/repository/io/dropwizard/metrics/metrics-jvm/3.1.0/metrics-jvm-3.1.0.jar,/Users/xubo/.m2/repository/co/cask/tephra/tephra-hbase-compat-1.0/0.6.0/tephra-hbase-compat-1.0-0.6.0.jar,/Users/xubo/.m2/repository/org/apache/kerby/kerby-xdr/1.0.1/kerby-xdr-1.0.1.jar,/Users/xubo/.m2/repository/com/tdunning/json/1.8/json-1.8.jar,/Users/xubo/.m2/repository/com/sun/jersey/jersey-client/1.19/jersey-client-1.19.jar,/Users/xubo/.m2/repository/io/netty/netty-all/4.1.17.Final/netty-all-4.1.17.Final.jar,/Users/xubo/.m2/repository/org/glassfish/jersey/containers/jersey-container-servlet-core/2.25.1/jersey-container-servlet-core-2.25.1.jar,/Users/xubo/.m2/repository/net/minidev/json-smart/2.3/json-smart-2.3.jar,/Users/xubo/Desktop/xubo/git/hive/llap-common/target/hive-llap-common-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/com/twitter/chill_2.11/0.8.4/chill_2.11-0.8.4.jar,/Users/xubo/.m2/repository/org/glassfish/jersey/core/jersey-server/2.25.1/jersey-server-2.25.1.jar,/Users/xubo/.m2/repository/org/apache/parquet/parquet-hadoop-bundle/1.10.0/parquet-hadoop-bundle-1.10.0.jar,/Users/xubo/.m2/repository/org/glassfish/jersey/bundles/repackaged/jersey-guava/2.25.1/jersey-guava-2.25.1.jar,/Users/xubo/.m2/repository/com/googlecode/javaewah/JavaEWAH/0.3.2/JavaEWAH-0.3.2.jar,/Users/xubo/.m2/repository/com/google/code/findbugs/jsr305/3.0.0/jsr305-3.0.0.jar,/Users/xubo/Desktop/xubo/git/hive/service-rpc/target/hive-service-rpc-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/commons-lang/commons-lang/2.6/commons-lang-2.6.jar,/Users/xubo/.m2/repository/org/apache/hbase/hbase-common/2.0.0-alpha4/hbase-common-2.0.0-alpha4-tests.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-yarn-server-applicationhistoryservice/3.1.0/hadoop-yarn-server-applicationhistoryservice-3.1.0.jar,/Users/xubo/.m2/repository/org/apache/calcite/calcite-druid/1.17.0/calcite-druid-1.17.0.jar,/Users/xubo/.m2/repository/org/datanucleus/datanucleus-api-jdo/4.2.4/datanucleus-api-jdo-4.2.4.jar,/Users/xubo/.m2/repository/com/nimbusds/nimbus-jose-jwt/4.41.1/nimbus-jose-jwt-4.41.1.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-hdfs-client/3.1.0/hadoop-hdfs-client-3.1.0.jar,/Users/xubo/.m2/repository/org/datanucleus/datanucleus-rdbms/4.1.19/datanucleus-rdbms-4.1.19.jar,/Users/xubo/.m2/repository/com/esotericsoftware/minlog/1.3.0/minlog-1.3.0.jar,/Users/xubo/.m2/repository/org/apache/hbase/hbase-protocol-shaded/2.0.0-alpha4/hbase-protocol-shaded-2.0.0-alpha4.jar,/Users/xubo/.m2/repository/com/github/luben/zstd-jni/1.3.2-2/zstd-jni-1.3.2-2.jar,/Users/xubo/.m2/repository/org/xerial/snappy/snappy-java/1.1.4/snappy-java-1.1.4.jar,/Users/xubo/.m2/repository/co/cask/tephra/tephra-core/0.6.0/tephra-core-0.6.0.jar,/Users/xubo/.m2/repository/com/ning/compress-lzf/1.0.3/compress-lzf-1.0.3.jar,/Users/xubo/Desktop/xubo/git/hive/serde/target/hive-serde-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/org/apache/httpcomponents/httpclient/4.5.2/httpclient-4.5.2.jar,/Users/xubo/.m2/repository/com/squareup/okhttp/okhttp/2.7.5/okhttp-2.7.5.jar,/Users/xubo/.m2/repository/oro/oro/2.0.8/oro-2.0.8.jar,/Users/xubo/.m2/repository/org/slf4j/slf4j-api/1.7.10/slf4j-api-1.7.10.jar,/Users/xubo/.m2/repository/org/apache/velocity/velocity/1.5/velocity-1.5.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-yarn-server-common/3.1.0/hadoop-yarn-server-common-3.1.0.jar,/Users/xubo/.m2/repository/com/cedarsoftware/json-io/2.5.1/json-io-2.5.1.jar,/Users/xubo/.m2/repository/com/jcraft/jsch/0.1.54/jsch-0.1.54.jar,/Users/xubo/.m2/repository/javolution/javolution/5.5.1/javolution-5.5.1.jar,/Users/xubo/.m2/repository/org/apache/hbase/hbase-http/2.0.0-alpha4/hbase-http-2.0.0-alpha4.jar,/Users/xubo/Desktop/xubo/git/hive/common/target/hive-common-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/com/yahoo/datasketches/sketches-core/0.9.0/sketches-core-0.9.0.jar,/Users/xubo/.m2/repository/org/scala-lang/modules/scala-xml_2.11/1.0.1/scala-xml_2.11-1.0.1.jar,/Users/xubo/Desktop/xubo/git/hive/storage-api/target/hive-storage-api-2.7.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/org/apache/logging/log4j/log4j-1.2-api/2.10.0/log4j-1.2-api-2.10.0.jar,/Users/xubo/.m2/repository/io/netty/netty-buffer/4.1.17.Final/netty-buffer-4.1.17.Final.jar,/Users/xubo/.m2/repository/org/apache/kerby/kerb-core/1.0.1/kerb-core-1.0.1.jar,/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-io/9.3.25.v20180904/jetty-io-9.3.25.v20180904.jar,/Users/xubo/.m2/repository/org/apache/orc/orc-tools/1.5.3/orc-tools-1.5.3.jar,/Users/xubo/.m2/repository/org/objenesis/objenesis/2.1/objenesis-2.1.jar,/Users/xubo/.m2/repository/aopalliance/aopalliance/1.0/aopalliance-1.0.jar,/Users/xubo/.m2/repository/org/apache/hbase/hbase-hadoop-compat/2.0.0-alpha4/hbase-hadoop-compat-2.0.0-alpha4.jar,/Users/xubo/.m2/repository/com/sun/jersey/contribs/wadl-resourcedoc-doclet/1.4/wadl-resourcedoc-doclet-1.4.jar,/Users/xubo/.m2/repository/com/google/protobuf/protobuf-java/2.5.0/protobuf-java-2.5.0.jar,/Users/xubo/.m2/repository/org/apache/xbean/xbean-asm5-shaded/4.4/xbean-asm5-shaded-4.4.jar,/Users/xubo/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.9.5/jackson-annotations-2.9.5.jar,/Users/xubo/.m2/repository/com/clearspring/analytics/stream/2.7.0/stream-2.7.0.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-yarn-common/3.1.0/hadoop-yarn-common-3.1.0.jar,/Users/xubo/Desktop/xubo/git/hive/llap-server/target/hive-llap-server-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/org/apache/hbase/hbase-metrics/2.0.0-alpha4/hbase-metrics-2.0.0-alpha4.jar,/Users/xubo/.m2/repository/org/codehaus/groovy/groovy-all/2.4.11/groovy-all-2.4.11.jar,/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-util/9.3.25.v20180904/jetty-util-9.3.25.v20180904.jar,/Users/xubo/.m2/repository/javax/xml/bind/jaxb-api/2.2.2/jaxb-api-2.2.2.jar,/Users/xubo/.m2/repository/com/thoughtworks/paranamer/paranamer/2.7/paranamer-2.7.jar,/Users/xubo/.m2/repository/com/google/inject/guice/4.0/guice-4.0.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-annotations/3.1.0/hadoop-annotations-3.1.0.jar,/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-webapp/9.3.25.v20180904/jetty-webapp-9.3.25.v20180904.jar,/Users/xubo/.m2/repository/org/apache/logging/log4j/log4j-core/2.10.0/log4j-core-2.10.0.jar,/Users/xubo/.m2/repository/org/apache/thrift/libthrift/0.9.3/libthrift-0.9.3.jar,/Users/xubo/Desktop/xubo/git/hive/llap-client/target/hive-llap-client-4.0.0-SNAPSHOT.jar,/Users/xubo/Desktop/xubo/git/hive/vector-code-gen/target/hive-vector-code-gen-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/org/apache/twill/twill-discovery-core/0.6.0-incubating/twill-discovery-core-0.6.0-incubating.jar,/Users/xubo/Desktop/xubo/git/hive/service/target/hive-service-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/org/apache/arrow/arrow-format/0.10.0/arrow-format-0.10.0.jar,/Users/xubo/.m2/repository/org/apache/kerby/kerby-config/1.0.1/kerby-config-1.0.1.jar,/Users/xubo/.m2/repository/org/antlr/antlr-runtime/3.5.2/antlr-runtime-3.5.2.jar,/Users/xubo/.m2/repository/com/zaxxer/HikariCP-java7/2.4.12/HikariCP-java7-2.4.12.jar,/Users/xubo/.m2/repository/org/apache/twill/twill-api/0.6.0-incubating/twill-api-0.6.0-incubating.jar,/Users/xubo/.m2/repository/org/apache/spark/spark-network-common_2.11/2.3.0/spark-network-common_2.11-2.3.0.jar,/Users/xubo/.m2/repository/org/apache/avro/avro/1.8.2/avro-1.8.2.jar,/Users/xubo/.m2/repository/javax/jdo/jdo-api/3.0.1/jdo-api-3.0.1.jar,/Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/target/hive-standalone-metastore-common-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/org/jamon/jamon-runtime/2.3.1/jamon-runtime-2.3.1.jar,/Users/xubo/.m2/repository/com/sun/xml/bind/jaxb-impl/2.2.3-1/jaxb-impl-2.2.3-1.jar,/Users/xubo/.m2/repository/com/sun/xml/bind/jaxb-impl/2.2.3-1/jaxb-api.jar,/Users/xubo/.m2/repository/com/sun/xml/bind/jaxb-impl/2.2.3-1/activation.jar,/Users/xubo/.m2/repository/com/sun/xml/bind/jaxb-impl/2.2.3-1/jsr173_1.0_api.jar,/Users/xubo/.m2/repository/com/sun/xml/bind/jaxb-impl/2.2.3-1/jaxb1-impl.jar,/Users/xubo/.m2/repository/org/apache/twill/twill-zookeeper/0.6.0-incubating/twill-zookeeper-0.6.0-incubating.jar,/Users/xubo/.m2/repository/io/dropwizard/metrics/metrics-graphite/3.1.5/metrics-graphite-3.1.5.jar,/Users/xubo/.m2/repository/org/apache/hbase/hbase-common/2.0.0-alpha4/hbase-common-2.0.0-alpha4.jar,/Users/xubo/.m2/repository/org/apache/spark/spark-unsafe_2.11/2.3.0/spark-unsafe_2.11-2.3.0.jar,/Users/xubo/.m2/repository/xml-apis/xml-apis/1.3.04/xml-apis-1.3.04.jar,/Users/xubo/.m2/repository/javax/inject/javax.inject/1/javax.inject-1.jar,/Users/xubo/.m2/repository/org/glassfish/jersey/core/jersey-common/2.25.1/jersey-common-2.25.1.jar,/Users/xubo/Desktop/xubo/git/hive/classification/target/hive-classification-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/org/spark-project/spark/unused/1.0.0/unused-1.0.0.jar,/Users/xubo/Desktop/xubo/git/hive/llap-common/target/hive-llap-common-4.0.0-SNAPSHOT-tests.jar,/Users/xubo/.m2/repository/org/apache/calcite/calcite-linq4j/1.17.0/calcite-linq4j-1.17.0.jar,/Users/xubo/.m2/repository/org/apache/geronimo/specs/geronimo-jcache_1.0_spec/1.0-alpha-1/geronimo-jcache_1.0_spec-1.0-alpha-1.jar,/Users/xubo/.m2/repository/org/apache/hbase/thirdparty/hbase-shaded-miscellaneous/1.0.1/hbase-shaded-miscellaneous-1.0.1.jar,/Users/xubo/.m2/repository/javax/servlet/jsp/javax.servlet.jsp-api/2.3.1/javax.servlet.jsp-api-2.3.1.jar,/Users/xubo/.m2/repository/org/apache/derby/derby/10.14.1.0/derby-10.14.1.0.jar,/Users/xubo/.m2/repository/org/apache/derby/derby/10.14.1.0/derbyLocale_cs.jar,/Users/xubo/.m2/repository/org/apache/derby/derby/10.14.1.0/derbyLocale_de_DE.jar,/Users/xubo/.m2/repository/org/apache/derby/derby/10.14.1.0/derbyLocale_es.jar,/Users/xubo/.m2/repository/org/apache/derby/derby/10.14.1.0/derbyLocale_fr.jar,/Users/xubo/.m2/repository/org/apache/derby/derby/10.14.1.0/derbyLocale_hu.jar,/Users/xubo/.m2/repository/org/apache/derby/derby/10.14.1.0/derbyLocale_it.jar,/Users/xubo/.m2/repository/org/apache/derby/derby/10.14.1.0/derbyLocale_ja_JP.jar,/Users/xubo/.m2/repository/org/apache/derby/derby/10.14.1.0/derbyLocale_ko_KR.jar,/Users/xubo/.m2/repository/org/apache/derby/derby/10.14.1.0/derbyLocale_pl.jar,/Users/xubo/.m2/repository/org/apache/derby/derby/10.14.1.0/derbyLocale_pt_BR.jar,/Users/xubo/.m2/repository/org/apache/derby/derby/10.14.1.0/derbyLocale_ru.jar,/Users/xubo/.m2/repository/org/apache/derby/derby/10.14.1.0/derbyLocale_zh_CN.jar,/Users/xubo/.m2/repository/org/apache/derby/derby/10.14.1.0/derbyLocale_zh_TW.jar,/Users/xubo/.m2/repository/org/apache/kerby/kerb-identity/1.0.1/kerb-identity-1.0.1.jar,/Users/xubo/Desktop/xubo/git/hive/ql/target/hive-exec-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/org/apache/spark/spark-launcher_2.11/2.3.0/spark-launcher_2.11-2.3.0.jar,/Users/xubo/.m2/repository/org/jodd/jodd-core/3.5.2/jodd-core-3.5.2.jar,/Users/xubo/.m2/repository/net/minidev/accessors-smart/1.2/accessors-smart-1.2.jar,/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar,/Users/xubo/.m2/repository/org/apache/kerby/kerb-server/1.0.1/kerb-server-1.0.1.jar,/Users/xubo/.m2/repository/org/ow2/asm/asm/5.0.4/asm-5.0.4.jar,/Users/xubo/.m2/repository/org/scala-lang/scalap/2.11.0/scalap-2.11.0.jar,/Users/xubo/.m2/repository/org/apache/logging/log4j/log4j-api/2.10.0/log4j-api-2.10.0.jar,/Users/xubo/.m2/repository/commons-net/commons-net/3.6/commons-net-3.6.jar,/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-util-ajax/9.3.19.v20170502/jetty-util-ajax-9.3.19.v20170502.jar,/Users/xubo/.m2/repository/net/java/dev/jets3t/jets3t/0.7.1/jets3t-0.7.1.jar,/Users/xubo/.m2/repository/org/apache/thrift/libfb303/0.9.3/libfb303-0.9.3.jar,/Users/xubo/.m2/repository/commons-httpclient/commons-httpclient/3.1/commons-httpclient-3.1.jar,/Users/xubo/.m2/repository/com/google/code/gson/gson/2.2.4/gson-2.2.4.jar,/Users/xubo/Desktop/xubo/git/hive/spark-client/target/hive-spark-client-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/stax/stax-api/1.0.1/stax-api-1.0.1.jar,/Users/xubo/.m2/repository/org/apache/kerby/kerb-common/1.0.1/kerb-common-1.0.1.jar,/Users/xubo/.m2/repository/io/dropwizard/metrics/metrics-json/3.1.0/metrics-json-3.1.0.jar,/Users/xubo/.m2/repository/org/apache/kerby/token-provider/1.0.1/token-provider-1.0.1.jar,/Users/xubo/.m2/repository/org/apache/kerby/kerb-client/1.0.1/kerb-client-1.0.1.jar,/Users/xubo/.m2/repository/org/antlr/ST4/4.0.4/ST4-4.0.4.jar,/Users/xubo/Desktop/xubo/git/hive/shims/aggregator/target/hive-shims-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/org/apache/ivy/ivy/2.2.0/ivy-2.2.0.jar,/Users/xubo/.m2/repository/io/netty/netty/3.7.0.Final/netty-3.7.0.Final.jar,/Users/xubo/.m2/repository/com/fasterxml/woodstox/woodstox-core/5.0.3/woodstox-core-5.0.3.jar,/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/../lib/tools.jar,/Users/xubo/.m2/repository/org/apache/kerby/kerb-util/1.0.1/kerb-util-1.0.1.jar,/Users/xubo/.m2/repository/javax/transaction/transaction-api/1.1/transaction-api-1.1.jar,/Users/xubo/.m2/repository/org/apache/commons/commons-lang3/3.4/commons-lang3-3.4.jar,/Users/xubo/.m2/repository/org/glassfish/jersey/core/jersey-client/2.25.1/jersey-client-2.25.1.jar,/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-security/9.3.25.v20180904/jetty-security-9.3.25.v20180904.jar,/Users/xubo/.m2/repository/commons-io/commons-io/2.4/commons-io-2.4.jar,/Users/xubo/.m2/repository/com/sun/jersey/jersey-server/1.19/jersey-server-1.19.jar,/Users/xubo/.m2/repository/com/sun/jersey/jersey-servlet/1.19/jersey-servlet-1.19.jar,/Users/xubo/.m2/repository/com/squareup/okio/okio/1.6.0/okio-1.6.0.jar,/Users/xubo/.m2/repository/javax/activation/activation/1.1/activation-1.1.jar,/Users/xubo/.m2/repository/javax/ws/rs/jsr311-api/1.1.1/jsr311-api-1.1.1.jar,/Users/xubo/.m2/repository/com/google/inject/extensions/guice-servlet/4.0/guice-servlet-4.0.jar,/Users/xubo/.m2/repository/org/apache/zookeeper/zookeeper/3.4.6/zookeeper-3.4.6.jar,/Users/xubo/.m2/repository/com/fasterxml/jackson/module/jackson-module-jaxb-annotations/2.9.5/jackson-module-jaxb-annotations-2.9.5.jar,/Users/xubo/.m2/repository/commons-logging/commons-logging/1.1.3/commons-logging-1.1.3.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-archives/3.1.0/hadoop-archives-3.1.0.jar,/Users/xubo/.m2/repository/dnsjava/dnsjava/2.1.7/dnsjava-2.1.7.jar,/Users/xubo/.m2/repository/org/fusesource/leveldbjni/leveldbjni-all/1.8/leveldbjni-all-1.8.jar,/Users/xubo/.m2/repository/org/apache/kerby/kerby-pkix/1.0.1/kerby-pkix-1.0.1.jar,/Users/xubo/.m2/repository/org/apache/kerby/kerby-util/1.0.1/kerby-util-1.0.1.jar,/Users/xubo/.m2/repository/javax/xml/stream/stax-api/1.0-2/stax-api-1.0-2.jar,/Users/xubo/.m2/repository/com/github/stephenc/findbugs/findbugs-annotations/1.3.9-1/findbugs-annotations-1.3.9-1.jar,/Users/xubo/.m2/repository/org/apache/spark/spark-network-shuffle_2.11/2.3.0/spark-network-shuffle_2.11-2.3.0.jar,/Users/xubo/.m2/repository/com/vlkan/flatbuffers/1.2.0-3f79e055/flatbuffers-1.2.0-3f79e055.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-yarn-registry/3.1.0/hadoop-yarn-registry-3.1.0.jar,/Users/xubo/Desktop/xubo/git/hive/cli/target/hive-cli-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/log4j/log4j/1.2.16/log4j-1.2.16.jar,/Users/xubo/.m2/repository/org/apache/hbase/hbase-protocol/2.0.0-alpha4/hbase-protocol-2.0.0-alpha4.jar,/Users/xubo/.m2/repository/org/apache/commons/commons-configuration2/2.1.1/commons-configuration2-2.1.1.jar,/Users/xubo/.m2/repository/javax/validation/validation-api/1.1.0.Final/validation-api-1.1.0.Final.jar,/Users/xubo/.m2/repository/joda-time/joda-time/2.1/joda-time-2.1.jar,/Users/xubo/.m2/repository/org/apache/commons/commons-math3/3.1.1/commons-math3-3.1.1.jar,/Users/xubo/.m2/repository/org/apache/htrace/htrace-core/3.2.0-incubating/htrace-core-3.2.0-incubating.jar,/Users/xubo/.m2/repository/org/apache/twill/twill-discovery-api/0.6.0-incubating/twill-discovery-api-0.6.0-incubating.jar,/Users/xubo/.m2/repository/org/apache/kerby/kerb-crypto/1.0.1/kerb-crypto-1.0.1.jar,/Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-server/target/hive-standalone-metastore-server-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/org/glassfish/hk2/hk2-api/2.5.0-b32/hk2-api-2.5.0-b32.jar,/Users/xubo/.m2/repository/net/sf/py4j/py4j/0.10.6/py4j-0.10.6.jar,/Users/xubo/.m2/repository/org/apache/arrow/arrow-vector/0.10.0/arrow-vector-0.10.0.jar,/Users/xubo/.m2/repository/org/glassfish/hk2/hk2-locator/2.5.0-b32/hk2-locator-2.5.0-b32.jar,/Users/xubo/.m2/repository/com/fasterxml/jackson/module/jackson-module-scala_2.11/2.9.5/jackson-module-scala_2.11-2.9.5.jar,/Users/xubo/.m2/repository/org/apache/spark/spark-yarn_2.11/2.3.0/spark-yarn_2.11-2.3.0.jar,/Users/xubo/.m2/repository/commons-cli/commons-cli/1.2/commons-cli-1.2.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar,/Users/xubo/.m2/repository/org/apache/commons/commons-collections4/4.1/commons-collections4-4.1.jar,/Users/xubo/.m2/repository/net/sf/jpam/jpam/1.1/jpam-1.1.jar,/Users/xubo/.m2/repository/com/sun/jersey/contribs/jersey-guice/1.19/jersey-guice-1.19.jar,/Users/xubo/.m2/repository/org/apache/twill/twill-common/0.6.0-incubating/twill-common-0.6.0-incubating.jar,/Users/xubo/.m2/repository/org/apache/commons/commons-compress/1.18/commons-compress-1.18.jar,/Users/xubo/.m2/repository/org/glassfish/hk2/external/aopalliance-repackaged/2.5.0-b32/aopalliance-repackaged-2.5.0-b32.jar,/Users/xubo/.m2/repository/com/opencsv/opencsv/3.9/opencsv-3.9.jar,/Users/xubo/.m2/repository/org/lz4/lz4-java/1.4.0/lz4-java-1.4.0.jar,/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-auth/3.1.0/hadoop-auth-3.1.0.jar,/Users/xubo/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.9.5/jackson-databind-2.9.5.jar,/Users/xubo/.m2/repository/org/apache/htrace/htrace-core4/4.1.0-incubating/htrace-core4-4.1.0-incubating.jar,/Users/xubo/.m2/repository/org/apache/spark/spark-tags_2.11/2.3.0/spark-tags_2.11-2.3.0.jar,/Users/xubo/.m2/repository/net/sf/opencsv/opencsv/2.3/opencsv-2.3.jar,/Users/xubo/.m2/repository/org/apache/ant/ant/1.9.1/ant-1.9.1.jar,/Users/xubo/.m2/repository/com/sun/jersey/jersey-core/1.19/jersey-core-1.19.jar,/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-rewrite/9.3.25.v20180904/jetty-rewrite-9.3.25.v20180904.jar,/Users/xubo/.m2/repository/com/google/inject/extensions/guice-assistedinject/3.0/guice-assistedinject-3.0.jar,/Users/xubo/.m2/repository/org/slf4j/jcl-over-slf4j/1.7.16/jcl-over-slf4j-1.7.16.jar,/Users/xubo/.m2/repository/org/codehaus/woodstox/stax2-api/3.1.4/stax2-api-3.1.4.jar,/Users/xubo/.m2/repository/com/zaxxer/HikariCP/2.6.1/HikariCP-2.6.1.jar,/Users/xubo/Desktop/xubo/git/hive/llap-tez/target/hive-llap-tez-4.0.0-SNAPSHOT.jar,/Users/xubo/.m2/repository/org/apache/spark/spark-core_2.11/2.3.0/spark-core_2.11-2.3.0.jar,/Users/xubo/.m2/repository/org/apache/commons/commons-crypto/1.0.0/commons-crypto-1.0.0.jar,/Users/xubo/.m2/repository/org/codehaus/jackson/jackson-xc/1.9.2/jackson-xc-1.9.2.jar,/Users/xubo/.m2/repository/org/apache/commons/commons-dbcp2/2.4.0/commons-dbcp2-2.4.0.jar,/Users/xubo/.m2/repository/javax/servlet/javax.servlet-api/3.1.0/javax.servlet-api-3.1.0.jar,/Users/xubo/.m2/repository/org/apache/commons/commons-exec/1.1/commons-exec-1.1.jar]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/io/ByteArrayOutputStream.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/io/IOException.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/HashMap.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/Map.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/core/MediaType.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/core/Response.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/ql/target/hive-exec-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/ql/ErrorMsg.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/codehaus/jackson/jackson-mapper-asl/1.9.2/jackson-mapper-asl-1.9.2.jar(org/codehaus/jackson/map/ObjectMapper.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-http/9.3.25.v20180904/jetty-http-9.3.25.v20180904.jar(org/eclipse/jetty/http/HttpStatus.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/Object.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/Integer.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/String.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/concurrent/Callable.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/calcite/avatica/avatica/1.12.0/avatica-1.12.0.jar(org/slf4j/Logger.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/calcite/avatica/avatica/1.12.0/avatica-1.12.0.jar(org/slf4j/LoggerFactory.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/Enum.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/Comparable.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/io/Serializable.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/Exception.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/List.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/com/sun/jersey/jersey-server/1.19/jersey-server-1.19.jar(com/sun/jersey/api/wadl/config/WadlGeneratorConfig.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/com/sun/jersey/jersey-server/1.19/jersey-server-1.19.jar(com/sun/jersey/api/wadl/config/WadlGeneratorDescription.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/com/sun/jersey/jersey-server/1.19/jersey-server-1.19.jar(com/sun/jersey/server/wadl/generators/resourcedoc/WadlGeneratorResourceDocSupport.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/io/FileNotFoundException.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/net/URISyntaxException.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/ArrayList.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/Arrays.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/commons/commons-exec/1.1/commons-exec-1.1.jar(org/apache/commons/exec/ExecuteException.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/security/PrivilegedExceptionAction.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/concurrent/ExecutionException.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/concurrent/TimeoutException.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/fs/FileSystem.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/fs/Path.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/common/target/hive-common-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/conf/HiveConf.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/shims/common/target/hive-shims-common-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/shims/HadoopShimsSecure.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/shims/common/target/hive-shims-common-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/shims/ShimLoader.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/shims/common/target/hive-shims-common-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/shims/HadoopShims.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/shims/common/target/hive-shims-common-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/shims/HadoopShims$WebHCatJTShim.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/security/UserGroupInformation.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/ql/target/hive-exec-4.0.0-SNAPSHOT.jar(org/apache/commons/lang3/StringUtils.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/util/ToolRunner.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/io/File.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/net/URL.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/Collection.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/Collections.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/conf/Configuration.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/common/target/hive-common-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/conf/HiveConfUtil.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/util/StringUtils.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/util/VersionInfo.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/Iterable.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/io/Writable.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/Boolean.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/Throwable.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/InterruptedException.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/concurrent/CancellationException.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/concurrent/RejectedExecutionException.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/concurrent/SynchronousQueue.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/concurrent/ThreadPoolExecutor.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/concurrent/TimeUnit.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/concurrent/Future.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/conf/Configured.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/classification/target/hive-classification-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/common/classification/InterfaceAudience.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/target/hive-standalone-metastore-common-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/metastore/IMetaStoreClient.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/io/NullWritable.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/io/Text.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapred/JobClient.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapred/JobConf.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapreduce/Job.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapreduce/JobID.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapreduce/lib/output/NullOutputFormat.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapreduce/security/token/delegation/DelegationTokenIdentifier.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/security/token/Token.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/util/Tool.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/core/target/hive-hcatalog-core-4.0.0-SNAPSHOT.jar(org/apache/hive/hcatalog/common/HCatUtil.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/thrift/libthrift/0.9.3/libthrift-0.9.3.jar(org/apache/thrift/TException.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/conf/Configurable.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/classification/target/hive-classification-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/common/classification/InterfaceAudience$Private.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/ClassNotFoundException.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/io/OutputStream.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/io/Closeable.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/AutoCloseable.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/io/Flushable.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/net/URI.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/ql/target/hive-exec-4.0.0-SNAPSHOT.jar(org/apache/commons/lang3/ArrayUtils.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-common/target/hive-standalone-metastore-common-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/metastore/api/MetaException.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/security/Credentials.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(javax/xml/bind/annotation/XmlRootElement.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapred/JobStatus.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapred/JobProfile.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/Long.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/common/target/hive-common-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/common/JavaUtils.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapred/JobID.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/io/BufferedReader.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/io/InputStream.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/io/InputStreamReader.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/io/PrintWriter.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/Map$Entry.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/concurrent/Semaphore.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/commons/commons-exec/1.1/commons-exec-1.1.jar(org/apache/commons/exec/CommandLine.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/commons/commons-exec/1.1/commons-exec-1.1.jar(org/apache/commons/exec/DefaultExecutor.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/commons/commons-exec/1.1/commons-exec-1.1.jar(org/apache/commons/exec/ExecuteWatchdog.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/commons/commons-exec/1.1/commons-exec-1.1.jar(org/apache/commons/exec/PumpStreamHandler.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/util/Shell.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/Thread.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/Runnable.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/security/Groups.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/net/InetAddress.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/net/UnknownHostException.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/text/MessageFormat.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/HashSet.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/Set.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/com/sun/jersey/jersey-server/1.19/jersey-server-1.19.jar(com/sun/jersey/api/core/PackagesResourceConfig.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/com/sun/jersey/jersey-servlet/1.19/jersey-servlet-1.19.jar(com/sun/jersey/spi/container/servlet/ServletContainer.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/io/FileInputStream.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/EnumSet.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/classification/target/hive-classification-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/common/classification/InterfaceStability.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-hdfs/3.1.0/hadoop-hdfs-3.1.0.jar(org/apache/hadoop/hdfs/web/AuthFilter.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/shims/common/target/hive-shims-common-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/shims/Utils.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-auth/3.1.0/hadoop-auth-3.1.0.jar(org/apache/hadoop/security/authentication/client/PseudoAuthenticator.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-auth/3.1.0/hadoop-auth-3.1.0.jar(org/apache/hadoop/security/authentication/server/PseudoAuthenticationHandler.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/security/SecurityUtil.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/util/GenericOptionsParser.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-rewrite/9.3.25.v20180904/jetty-rewrite-9.3.25.v20180904.jar(org/eclipse/jetty/rewrite/handler/RedirectPatternRule.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-rewrite/9.3.25.v20180904/jetty-rewrite-9.3.25.v20180904.jar(org/eclipse/jetty/rewrite/handler/RewriteHandler.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-server/9.3.25.v20180904/jetty-server-9.3.25.v20180904.jar(org/eclipse/jetty/server/Handler.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-server/9.3.25.v20180904/jetty-server-9.3.25.v20180904.jar(org/eclipse/jetty/server/Server.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-server/9.3.25.v20180904/jetty-server-9.3.25.v20180904.jar(org/eclipse/jetty/server/ServerConnector.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-server/9.3.25.v20180904/jetty-server-9.3.25.v20180904.jar(org/eclipse/jetty/server/handler/HandlerList.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-servlet/9.3.25.v20180904/jetty-servlet-9.3.25.v20180904.jar(org/eclipse/jetty/servlet/FilterHolder.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-servlet/9.3.25.v20180904/jetty-servlet-9.3.25.v20180904.jar(org/eclipse/jetty/servlet/ServletContextHandler.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-servlet/9.3.25.v20180904/jetty-servlet-9.3.25.v20180904.jar(org/eclipse/jetty/servlet/ServletHolder.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-xml/9.3.25.v20180904/jetty-xml-9.3.25.v20180904.jar(org/eclipse/jetty/xml/XmlConfiguration.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/slf4j/jul-to-slf4j/1.7.10/jul-to-slf4j-1.7.10.jar(org/slf4j/bridge/SLF4JBridgeHandler.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/servlet/javax.servlet-api/3.1.0/javax.servlet-api-3.1.0.jar(javax/servlet/DispatcherType.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/servlet/javax.servlet-api/3.1.0/javax.servlet-api-3.1.0.jar(javax/servlet/Filter.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/servlet/javax.servlet-api/3.1.0/javax.servlet-api-3.1.0.jar(javax/servlet/FilterChain.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/servlet/javax.servlet-api/3.1.0/javax.servlet-api-3.1.0.jar(javax/servlet/FilterConfig.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/servlet/javax.servlet-api/3.1.0/javax.servlet-api-3.1.0.jar(javax/servlet/ServletException.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/servlet/javax.servlet-api/3.1.0/javax.servlet-api-3.1.0.jar(javax/servlet/ServletRequest.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/servlet/javax.servlet-api/3.1.0/javax.servlet-api-3.1.0.jar(javax/servlet/ServletResponse.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/servlet/javax.servlet-api/3.1.0/javax.servlet-api-3.1.0.jar(javax/servlet/annotation/WebFilter.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/servlet/javax.servlet-api/3.1.0/javax.servlet-api-3.1.0.jar(javax/servlet/http/HttpServletRequest.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/servlet/javax.servlet-api/3.1.0/javax.servlet-api-3.1.0.jar(javax/servlet/http/HttpServletResponse.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/classification/target/hive-classification-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/common/classification/InterfaceAudience$LimitedPrivate.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/classification/target/hive-classification-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/common/classification/InterfaceStability$Unstable.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/commons-lang/commons-lang/2.6/commons-lang-2.6.jar(org/apache/commons/lang/StringUtils.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-common/3.1.0/hadoop-common-3.1.0.jar(org/apache/hadoop/fs/FileStatus.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/ext/ExceptionMapper.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/ext/Provider.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/com/sun/jersey/jersey-server/1.19/jersey-server-1.19.jar(com/sun/jersey/api/NotFoundException.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/concurrent/ConcurrentHashMap.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/regex/Matcher.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/regex/Pattern.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/DELETE.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/FormParam.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/GET.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/POST.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/PUT.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/Path.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/PathParam.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/Produces.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/QueryParam.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/core/Context.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/core/SecurityContext.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/core/UriInfo.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/common/target/hive-common-4.0.0-SNAPSHOT.jar(org/apache/hive/common/util/HiveVersionInfo.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/Date.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapreduce/InputFormat.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapreduce/InputSplit.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapreduce/JobContext.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapreduce/RecordReader.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapreduce/TaskAttemptContext.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/net/URLConnection.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/net/URLDecoder.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/Enumeration.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/Properties.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/StringTokenizer.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/common/target/hive-common-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/common/LogUtils.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/Class.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/StringBuilder.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapreduce/Mapper.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/io/OutputStreamWriter.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/Iterator.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/LinkedList.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/concurrent/ExecutorService.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/util/concurrent/Executors.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/Process.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapreduce/Mapper$Context.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/Desktop/xubo/git/hive/classification/target/hive-classification-4.0.0-SNAPSHOT.jar(org/apache/hadoop/hive/common/classification/InterfaceStability$Evolving.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/curator/curator-framework/2.12.0/curator-framework-2.12.0.jar(org/apache/curator/framework/CuratorFramework.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/zookeeper/zookeeper/3.4.6/zookeeper-3.4.6.jar(org/apache/zookeeper/CreateMode.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/zookeeper/zookeeper/3.4.6/zookeeper-3.4.6.jar(org/apache/zookeeper/KeeperException.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/zookeeper/zookeeper/3.4.6/zookeeper-3.4.6.jar(org/apache/zookeeper/ZooDefs.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/zookeeper/zookeeper/3.4.6/zookeeper-3.4.6.jar(org/apache/zookeeper/ZooDefs$Ids.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/io/DataInput.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/io/DataOutput.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-mapreduce-client-core/3.1.0/hadoop-mapreduce-client-core-3.1.0.jar(org/apache/hadoop/mapred/RunningJob.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/curator/curator-framework/2.12.0/curator-framework-2.12.0.jar(org/apache/curator/framework/CuratorFrameworkFactory.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/curator/curator-client/2.12.0/curator-client-2.12.0.jar(org/apache/curator/retry/ExponentialBackoffRetry.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/Override.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/annotation/Annotation.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-annotations/3.1.0/hadoop-annotations-3.1.0.jar(org/apache/hadoop/classification/InterfaceAudience.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/apache/hadoop/hadoop-annotations/3.1.0/hadoop-annotations-3.1.0.jar(org/apache/hadoop/classification/InterfaceAudience$LimitedPrivate.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/annotation/Retention.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/annotation/RetentionPolicy.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/annotation/Target.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/annotation/ElementType.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(java/lang/SuppressWarnings.class)]]
	[loading ZipFileIndexFileObject[/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar(sun/misc/Contended.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-util/9.3.25.v20180904/jetty-util-9.3.25.v20180904.jar(org/eclipse/jetty/util/annotation/Name.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-util/9.3.25.v20180904/jetty-util-9.3.25.v20180904.jar(org/eclipse/jetty/util/annotation/ManagedObject.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-util/9.3.25.v20180904/jetty-util-9.3.25.v20180904.jar(org/eclipse/jetty/util/annotation/ManagedAttribute.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/org/eclipse/jetty/jetty-util/9.3.25.v20180904/jetty-util-9.3.25.v20180904.jar(org/eclipse/jetty/util/annotation/ManagedOperation.class)]]
	[loading ZipFileIndexFileObject[/Users/xubo/.m2/repository/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar(javax/ws/rs/HttpMethod.class)]]
	[loading RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/org/apache/hive/hcatalog/templeton/HcatException$1.class]]
	[loading RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/org/apache/hive/hcatalog/templeton/LauncherDelegator$2.class]]
	[loading RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/org/apache/hive/hcatalog/templeton/LauncherDelegator$1.class]]
	[loading RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/org/apache/hive/hcatalog/templeton/HcatDelegator$1.class]]
	[loading RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/org/apache/hive/hcatalog/templeton/ListDelegator$2.class]]
	[loading RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/org/apache/hive/hcatalog/templeton/StatusDelegator$1.class]]
	[loading RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/org/apache/hive/hcatalog/templeton/SecureProxySupport$2.class]]
	[loading RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/org/apache/hive/hcatalog/templeton/SecureProxySupport$3.class]]
	[loading RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/org/apache/hive/hcatalog/templeton/ListDelegator$1.class]]
	[loading RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/org/apache/hive/hcatalog/templeton/SecureProxySupport$1.class]]
	[loading RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/org/apache/hive/hcatalog/templeton/tool/LogRetriever$1.class]]
	[loading RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/org/apache/hive/hcatalog/templeton/tool/TempletonControllerJob$1.class]]
	[loading RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/org/apache/hive/hcatalog/templeton/tool/TempletonControllerJob$1$1.class]]
	[loading RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/org/apache/hive/hcatalog/templeton/tool/TempletonUtils$1.class]]
	[loading RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/org/apache/hive/hcatalog/templeton/tool/ZooKeeperStorage$1.class]]
	[loading RegularFileObject[/Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/org/apache/hive/hcatalog/templeton/tool/HDFSStorage$1.class]]
	[done in 2323 ms]
	[WARNING] Javadoc Warnings
	[WARNING] Dec 13, 2018 10:02:07 AM com.sun.jersey.wadl.resourcedoc.ResourceDoclet start
	[WARNING] INFO: Wrote /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/classes/resourcedoc.xml
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-webhcat ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-webhcat ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-webhcat ---
	[INFO] Compiling 14 source files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/test/java/org/apache/hive/hcatalog/templeton/TestWebHCatE2e.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/test/java/org/apache/hive/hcatalog/templeton/TestWebHCatE2e.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/test/java/org/apache/hive/hcatalog/templeton/ConcurrentJobRequestsTestBase.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/src/test/java/org/apache/hive/hcatalog/templeton/ConcurrentJobRequestsTestBase.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-webhcat ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-webhcat ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/hcatalog/webhcat/svr/target/hive-webhcat-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-webhcat ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive HCatalog Streaming 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-hcatalog-streaming ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-hcatalog-streaming ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-hcatalog-streaming ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-hcatalog-streaming ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-hcatalog-streaming ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-hcatalog-streaming ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-hcatalog-streaming ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-hcatalog-streaming ---
	[INFO] Compiling 58 source files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/src/java/org/apache/hive/hcatalog/streaming/mutate/client/lock/HeartbeatTimerTask.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/src/java/org/apache/hive/hcatalog/streaming/mutate/client/lock/HeartbeatTimerTask.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/src/java/org/apache/hive/hcatalog/streaming/HiveEndPoint.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/src/java/org/apache/hive/hcatalog/streaming/HiveEndPoint.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-hcatalog-streaming ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-hcatalog-streaming ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-hcatalog-streaming ---
	[INFO] Compiling 22 source files to /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/src/test/org/apache/hive/hcatalog/streaming/mutate/TestMutations.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/src/test/org/apache/hive/hcatalog/streaming/mutate/TestMutations.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/src/test/org/apache/hive/hcatalog/streaming/mutate/client/lock/TestLock.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/src/test/org/apache/hive/hcatalog/streaming/mutate/client/lock/TestLock.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-hcatalog-streaming ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-hcatalog-streaming ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/target/hive-hcatalog-streaming-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-hcatalog-streaming ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:test-jar (default) @ hive-hcatalog-streaming ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/hcatalog/streaming/target/hive-hcatalog-streaming-4.0.0-SNAPSHOT-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive HPL/SQL 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: https://repo.maven.apache.org/maven2/org/antlr/antlr4-maven-plugin/4.5/antlr4-maven-plugin-4.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/antlr/antlr4-maven-plugin/4.5/antlr4-maven-plugin-4.5.pom (11 KB at 10.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/antlr/antlr4-maven-plugin/4.5/antlr4-maven-plugin-4.5.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/antlr/antlr4-maven-plugin/4.5/antlr4-maven-plugin-4.5.jar (24 KB at 27.2 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/antlr/antlr4-runtime/4.5/antlr4-runtime-4.5.pom
	Downloading: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.5/antlr4-runtime-4.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.5/antlr4-runtime-4.5.pom (3 KB at 6.1 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/abego/treelayout/org.abego.treelayout.core/1.0.1/org.abego.treelayout.core-1.0.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/abego/treelayout/org.abego.treelayout.core/1.0.1/org.abego.treelayout.core-1.0.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/abego/treelayout/org.abego.treelayout.core/1.0.1/org.abego.treelayout.core-1.0.1.pom (4 KB at 6.9 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/antlr/antlr4-runtime/4.5/antlr4-runtime-4.5.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/abego/treelayout/org.abego.treelayout.core/1.0.1/org.abego.treelayout.core-1.0.1.jar
	Downloading: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.5/antlr4-runtime-4.5.jar
	Downloading: https://repo.maven.apache.org/maven2/org/abego/treelayout/org.abego.treelayout.core/1.0.1/org.abego.treelayout.core-1.0.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/abego/treelayout/org.abego.treelayout.core/1.0.1/org.abego.treelayout.core-1.0.1.jar (25 KB at 23.0 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.5/antlr4-runtime-4.5.jar (366 KB at 49.2 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-hplsql ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/hplsql (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-hplsql ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-hplsql ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-hplsql ---
	[INFO] 
	[INFO] --- antlr4-maven-plugin:4.5:antlr4 (default) @ hive-hplsql ---
	Downloading: https://repo.maven.apache.org/maven2/org/antlr/antlr4/4.5/antlr4-4.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/antlr/antlr4/4.5/antlr4-4.5.pom (5 KB at 8.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/antlr/antlr4/4.5/antlr4-4.5.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/antlr/antlr4/4.5/antlr4-4.5.jar (1508 KB at 43.0 KB/sec)
	[INFO] ANTLR 4: Processing source directory /Users/xubo/Desktop/xubo/git/hive/hplsql/src/main/antlr4
	[INFO] Processing grammar: org/apache/hive/hplsql/Hplsql.g4
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-hplsql ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-hplsql ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 1 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-hplsql ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-hplsql ---
	[INFO] Compiling 37 source files to /Users/xubo/Desktop/xubo/git/hive/hplsql/target/classes
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-hplsql ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/hplsql/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-hplsql ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hplsql/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hplsql/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/hplsql/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/hplsql/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-hplsql ---
	[INFO] Compiling 3 source files to /Users/xubo/Desktop/xubo/git/hive/hplsql/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-hplsql ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-hplsql ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/hplsql/target/hive-hplsql-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-hplsql ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Streaming 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-streaming ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/streaming (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-streaming ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-streaming ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-streaming ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-streaming ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-streaming ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/streaming/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-streaming ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-streaming ---
	[INFO] Compiling 24 source files to /Users/xubo/Desktop/xubo/git/hive/streaming/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/streaming/src/java/org/apache/hive/streaming/AbstractRecordWriter.java: /Users/xubo/Desktop/xubo/git/hive/streaming/src/java/org/apache/hive/streaming/AbstractRecordWriter.java uses or overrides a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/streaming/src/java/org/apache/hive/streaming/AbstractRecordWriter.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/streaming/src/java/org/apache/hive/streaming/AbstractRecordWriter.java: /Users/xubo/Desktop/xubo/git/hive/streaming/src/java/org/apache/hive/streaming/AbstractRecordWriter.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/streaming/src/java/org/apache/hive/streaming/AbstractRecordWriter.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-streaming ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/streaming/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-streaming ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/streaming/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/streaming/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/streaming/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/streaming/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-streaming ---
	[INFO] Compiling 2 source files to /Users/xubo/Desktop/xubo/git/hive/streaming/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/streaming/src/test/org/apache/hive/streaming/TestStreamingDynamicPartitioning.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/streaming/src/test/org/apache/hive/streaming/TestStreamingDynamicPartitioning.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/streaming/src/test/org/apache/hive/streaming/TestStreaming.java: /Users/xubo/Desktop/xubo/git/hive/streaming/src/test/org/apache/hive/streaming/TestStreaming.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/streaming/src/test/org/apache/hive/streaming/TestStreaming.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-streaming ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-streaming ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/streaming/target/hive-streaming-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-streaming ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:test-jar (default) @ hive-streaming ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/streaming/target/hive-streaming-4.0.0-SNAPSHOT-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Llap External Client 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-llap-ext-client ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/llap-ext-client (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-llap-ext-client ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-llap-ext-client ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-llap-ext-client ---
	[INFO] 
	[INFO] --- build-helper-maven-plugin:1.8:add-source (add-source) @ hive-llap-ext-client ---
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/llap-ext-client/src/gen/protobuf/gen-java added.
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/hive/llap-ext-client/src/gen/thrift/gen-javabean added.
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-llap-ext-client ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-llap-ext-client ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/llap-ext-client/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-llap-ext-client ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-llap-ext-client ---
	[INFO] Compiling 6 source files to /Users/xubo/Desktop/xubo/git/hive/llap-ext-client/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-ext-client/src/java/org/apache/hadoop/hive/llap/LlapBaseInputFormat.java: /Users/xubo/Desktop/xubo/git/hive/llap-ext-client/src/java/org/apache/hadoop/hive/llap/LlapBaseInputFormat.java uses or overrides a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-ext-client/src/java/org/apache/hadoop/hive/llap/LlapBaseInputFormat.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-ext-client/src/java/org/apache/hadoop/hive/llap/LlapArrowRowRecordReader.java: /Users/xubo/Desktop/xubo/git/hive/llap-ext-client/src/java/org/apache/hadoop/hive/llap/LlapArrowRowRecordReader.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/llap-ext-client/src/java/org/apache/hadoop/hive/llap/LlapArrowRowRecordReader.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-llap-ext-client ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/llap-ext-client/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-llap-ext-client ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/llap-ext-client/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/llap-ext-client/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/llap-ext-client/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/llap-ext-client/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-llap-ext-client ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-llap-ext-client ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-llap-ext-client ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/llap-ext-client/target/hive-llap-ext-client-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-llap-ext-client ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Shims Aggregator 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-shims-aggregator ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/shims (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-shims-aggregator ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-shims-aggregator ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-shims-aggregator ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-shims-aggregator ---
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-shims-aggregator ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-shims-aggregator ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/shims/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/shims/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/shims/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/shims/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-shims-aggregator ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Kryo Registrator 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-kryo-registrator ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/kryo-registrator (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-kryo-registrator ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-kryo-registrator ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-kryo-registrator ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-kryo-registrator ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-kryo-registrator ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/kryo-registrator/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-kryo-registrator ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-kryo-registrator ---
	[INFO] Compiling 2 source files to /Users/xubo/Desktop/xubo/git/hive/kryo-registrator/target/classes
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-kryo-registrator ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/kryo-registrator/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-kryo-registrator ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/kryo-registrator/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/kryo-registrator/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/kryo-registrator/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/kryo-registrator/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-kryo-registrator ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-kryo-registrator ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-kryo-registrator ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/kryo-registrator/target/hive-kryo-registrator-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-kryo-registrator ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive TestUtils 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-testutils ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/testutils (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-testutils ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-testutils ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-testutils ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-testutils ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-testutils ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/testutils/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-testutils ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ hive-testutils ---
	[INFO] Compiling 3 source files to /Users/xubo/Desktop/xubo/git/hive/testutils/target/classes
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-testutils ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/testutils/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-testutils ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/testutils/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/testutils/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/testutils/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/testutils/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ hive-testutils ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ hive-testutils ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hive-testutils ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/testutils/target/hive-testutils-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-testutils ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Kafka Storage Handler 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/kafka/kafka-clients/2.0.0/kafka-clients-2.0.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/kafka/kafka-clients/2.0.0/kafka-clients-2.0.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/kafka/kafka-clients/2.0.0/kafka-clients-2.0.0.pom (0 B at 0.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/lz4/lz4-java/1.4.1/lz4-java-1.4.1.pom
	Downloading: https://repo.maven.apache.org/maven2/org/lz4/lz4-java/1.4.1/lz4-java-1.4.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/lz4/lz4-java/1.4.1/lz4-java-1.4.1.pom (0 B at 0.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/kafka/kafka_2.11/2.0.0/kafka_2.11-2.0.0.pom
	Downloading: https://repo.maven.apache.org/maven2/org/apache/kafka/kafka_2.11/2.0.0/kafka_2.11-2.0.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/kafka/kafka_2.11/2.0.0/kafka_2.11-2.0.0.pom (16 KB at 19.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/net/sf/jopt-simple/jopt-simple/5.0.4/jopt-simple-5.0.4.pom
	Downloading: https://repo.maven.apache.org/maven2/net/sf/jopt-simple/jopt-simple/5.0.4/jopt-simple-5.0.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/net/sf/jopt-simple/jopt-simple/5.0.4/jopt-simple-5.0.4.pom (14 KB at 21.3 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/scala-lang/scala-reflect/2.11.12/scala-reflect-2.11.12.pom
	Downloading: https://repo.maven.apache.org/maven2/org/scala-lang/scala-reflect/2.11.12/scala-reflect-2.11.12.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/scala-lang/scala-reflect/2.11.12/scala-reflect-2.11.12.pom (0 B at 0.0 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/com/typesafe/scala-logging/scala-logging_2.11/3.9.0/scala-logging_2.11-3.9.0.pom
	Downloading: https://repo.maven.apache.org/maven2/com/typesafe/scala-logging/scala-logging_2.11/3.9.0/scala-logging_2.11-3.9.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/typesafe/scala-logging/scala-logging_2.11/3.9.0/scala-logging_2.11-3.9.0.pom (3 KB at 6.4 KB/sec)
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/kafka/kafka-clients/2.0.0/kafka-clients-2.0.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/lz4/lz4-java/1.4.1/lz4-java-1.4.1.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/kafka/kafka-clients/2.0.0/kafka-clients-2.0.0-test.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/kafka/kafka_2.11/2.0.0/kafka_2.11-2.0.0-test.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/net/sf/jopt-simple/jopt-simple/5.0.4/jopt-simple-5.0.4.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/scala-lang/scala-reflect/2.11.12/scala-reflect-2.11.12.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/com/typesafe/scala-logging/scala-logging_2.11/3.9.0/scala-logging_2.11-3.9.0.jar
	Downloading: http://www.datanucleus.org/downloads/maven2/org/apache/kafka/kafka_2.11/2.0.0/kafka_2.11-2.0.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/kafka/kafka-clients/2.0.0/kafka-clients-2.0.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/lz4/lz4-java/1.4.1/lz4-java-1.4.1.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/kafka/kafka-clients/2.0.0/kafka-clients-2.0.0-test.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/kafka/kafka_2.11/2.0.0/kafka_2.11-2.0.0-test.jar
	Downloading: https://repo.maven.apache.org/maven2/net/sf/jopt-simple/jopt-simple/5.0.4/jopt-simple-5.0.4.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/kafka/kafka-clients/2.0.0/kafka-clients-2.0.0.jar (0 B at 0.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/scala-lang/scala-reflect/2.11.12/scala-reflect-2.11.12.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/scala-lang/scala-reflect/2.11.12/scala-reflect-2.11.12.jar (0 B at 0.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/typesafe/scala-logging/scala-logging_2.11/3.9.0/scala-logging_2.11-3.9.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/net/sf/jopt-simple/jopt-simple/5.0.4/jopt-simple-5.0.4.jar (77 KB at 10.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/kafka/kafka_2.11/2.0.0/kafka_2.11-2.0.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/typesafe/scala-logging/scala-logging_2.11/3.9.0/scala-logging_2.11-3.9.0.jar (81 KB at 4.1 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/lz4/lz4-java/1.4.1/lz4-java-1.4.1.jar (362 KB at 13.6 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/kafka/kafka-clients/2.0.0/kafka-clients-2.0.0-test.jar (910 KB at 12.9 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/kafka/kafka_2.11/2.0.0/kafka_2.11-2.0.0-test.jar (5916 KB at 31.2 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/kafka/kafka_2.11/2.0.0/kafka_2.11-2.0.0.jar (7125 KB at 27.7 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ kafka-handler ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/kafka-handler (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ kafka-handler ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ kafka-handler ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ kafka-handler ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ kafka-handler ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ kafka-handler ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/kafka-handler/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ kafka-handler ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ kafka-handler ---
	[INFO] Compiling 20 source files to /Users/xubo/Desktop/xubo/git/hive/kafka-handler/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/hive/kafka-handler/src/java/org/apache/hadoop/hive/kafka/KafkaStorageHandler.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/kafka-handler/src/java/org/apache/hadoop/hive/kafka/KafkaStorageHandler.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/kafka-handler/src/java/org/apache/hadoop/hive/kafka/KafkaStorageHandler.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/hive/kafka-handler/src/java/org/apache/hadoop/hive/kafka/KafkaStorageHandler.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ kafka-handler ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/kafka-handler/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ kafka-handler ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/kafka-handler/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/kafka-handler/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/kafka-handler/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/kafka-handler/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ kafka-handler ---
	[INFO] Compiling 11 source files to /Users/xubo/Desktop/xubo/git/hive/kafka-handler/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.21.0:test (default-test) @ kafka-handler ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ kafka-handler ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/kafka-handler/target/kafka-handler-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ kafka-handler ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.4:test-jar (default) @ kafka-handler ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/kafka-handler/target/kafka-handler-4.0.0-SNAPSHOT-tests.jar
	[INFO] 
	[INFO] --- maven-shade-plugin:3.1.0:shade (default) @ kafka-handler ---
	[INFO] Excluding jline:jline:jar:2.12 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-http:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding com.google.inject:guice:jar:3.0 from the shaded jar.
	[INFO] Excluding javax.inject:javax.inject:jar:1 from the shaded jar.
	[INFO] Excluding aopalliance:aopalliance:jar:1.0 from the shaded jar.
	[INFO] Excluding com.google.protobuf:protobuf-java:jar:2.5.0 from the shaded jar.
	[INFO] Excluding commons-codec:commons-codec:jar:1.7 from the shaded jar.
	[INFO] Excluding commons-io:commons-io:jar:2.4 from the shaded jar.
	[INFO] Excluding org.apache.commons:commons-lang3:jar:3.2 from the shaded jar.
	[INFO] Excluding commons-lang:commons-lang:jar:2.6 from the shaded jar.
	[INFO] Excluding org.apache.avro:avro:jar:1.8.2 from the shaded jar.
	[INFO] Excluding org.codehaus.jackson:jackson-core-asl:jar:1.9.13 from the shaded jar.
	[INFO] Excluding org.codehaus.jackson:jackson-mapper-asl:jar:1.9.13 from the shaded jar.
	[INFO] Excluding com.thoughtworks.paranamer:paranamer:jar:2.7 from the shaded jar.
	[INFO] Excluding org.tukaani:xz:jar:1.5 from the shaded jar.
	[INFO] Excluding org.apache.commons:commons-compress:jar:1.18 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-common:jar:3.1.0 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-client:jar:1.19 from the shaded jar.
	[INFO] Excluding com.google.inject.extensions:guice-servlet:jar:4.0 from the shaded jar.
	[INFO] Excluding com.sun.jersey.contribs:jersey-guice:jar:1.19 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.module:jackson-module-jaxb-annotations:jar:2.9.5 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider:jar:2.9.5 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.jaxrs:jackson-jaxrs-base:jar:2.9.5 from the shaded jar.
	[INFO] Excluding org.codehaus.jettison:jettison:jar:1.1 from the shaded jar.
	[INFO] Excluding org.apache.zookeeper:zookeeper:jar:3.4.6 from the shaded jar.
	[INFO] Excluding io.netty:netty:jar:3.7.0.Final from the shaded jar.
	[INFO] Excluding org.apache.curator:curator-framework:jar:2.12.0 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.core:jackson-annotations:jar:2.9.5 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.core:jackson-core:jar:2.9.5 from the shaded jar.
	[INFO] Excluding com.fasterxml.jackson.core:jackson-databind:jar:2.9.5 from the shaded jar.
	[INFO] Excluding com.google.code.gson:gson:jar:2.2.4 from the shaded jar.
	[INFO] Excluding commons-logging:commons-logging:jar:1.1.3 from the shaded jar.
	[INFO] Excluding com.google.guava:guava:jar:19.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-common:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-annotations:jar:3.1.0 from the shaded jar.
	[INFO] Excluding commons-cli:commons-cli:jar:1.2 from the shaded jar.
	[INFO] Excluding org.apache.commons:commons-math3:jar:3.1.1 from the shaded jar.
	[INFO] Excluding commons-net:commons-net:jar:3.6 from the shaded jar.
	[INFO] Excluding commons-collections:commons-collections:jar:3.2.2 from the shaded jar.
	[INFO] Excluding javax.servlet:javax.servlet-api:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-server:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-io:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-util:jar:9.3.19.v20170502 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-servlet:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-security:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-webapp:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding org.eclipse.jetty:jetty-xml:jar:9.3.25.v20180904 from the shaded jar.
	[INFO] Excluding javax.servlet.jsp:jsp-api:jar:2.1 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-core:jar:1.19 from the shaded jar.
	[INFO] Excluding javax.ws.rs:jsr311-api:jar:1.1.1 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-servlet:jar:1.19 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-json:jar:1.19 from the shaded jar.
	[INFO] Excluding com.sun.xml.bind:jaxb-impl:jar:2.2.3-1 from the shaded jar.
	[INFO] Excluding org.codehaus.jackson:jackson-jaxrs:jar:1.9.2 from the shaded jar.
	[INFO] Excluding org.codehaus.jackson:jackson-xc:jar:1.9.2 from the shaded jar.
	[INFO] Excluding com.sun.jersey:jersey-server:jar:1.19 from the shaded jar.
	[INFO] Excluding log4j:log4j:jar:1.2.17 from the shaded jar.
	[INFO] Excluding commons-beanutils:commons-beanutils:jar:1.9.3 from the shaded jar.
	[INFO] Excluding org.apache.commons:commons-configuration2:jar:2.1.1 from the shaded jar.
	[INFO] Excluding com.google.re2j:re2j:jar:1.1 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-auth:jar:3.1.0 from the shaded jar.
	[INFO] Excluding com.nimbusds:nimbus-jose-jwt:jar:4.41.1 from the shaded jar.
	[INFO] Excluding com.github.stephenc.jcip:jcip-annotations:jar:1.0-1 from the shaded jar.
	[INFO] Excluding net.minidev:json-smart:jar:2.3 from the shaded jar.
	[INFO] Excluding net.minidev:accessors-smart:jar:1.2 from the shaded jar.
	[INFO] Excluding org.ow2.asm:asm:jar:5.0.4 from the shaded jar.
	[INFO] Excluding com.jcraft:jsch:jar:0.1.54 from the shaded jar.
	[INFO] Excluding org.apache.curator:curator-client:jar:2.12.0 from the shaded jar.
	[INFO] Excluding org.apache.curator:curator-recipes:jar:2.12.0 from the shaded jar.
	[INFO] Excluding com.google.code.findbugs:jsr305:jar:3.0.0 from the shaded jar.
	[INFO] Excluding org.apache.htrace:htrace-core4:jar:4.1.0-incubating from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-simplekdc:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-client:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerby-config:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-core:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerby-pkix:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerby-asn1:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerby-util:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-common:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-crypto:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-util:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:token-provider:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-admin:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-server:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerb-identity:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.apache.kerby:kerby-xdr:jar:1.0.1 from the shaded jar.
	[INFO] Excluding org.codehaus.woodstox:stax2-api:jar:3.1.4 from the shaded jar.
	[INFO] Excluding com.fasterxml.woodstox:woodstox-core:jar:5.0.3 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-client:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-hdfs-client:jar:3.1.0 from the shaded jar.
	[INFO] Excluding com.squareup.okhttp:okhttp:jar:2.7.5 from the shaded jar.
	[INFO] Excluding com.squareup.okio:okio:jar:1.6.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-api:jar:3.1.0 from the shaded jar.
	[INFO] Excluding javax.xml.bind:jaxb-api:jar:2.2.11 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-client:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-mapreduce-client-core:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-mapreduce-client-jobclient:jar:3.1.0 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-mapreduce-client-common:jar:3.1.0 from the shaded jar.
	[INFO] Including org.apache.kafka:kafka-clients:jar:2.0.0 in the shaded jar.
	[INFO] Excluding org.lz4:lz4-java:jar:1.4.1 from the shaded jar.
	[INFO] Excluding org.xerial.snappy:snappy-java:jar:1.1.4 from the shaded jar.
	[INFO] Replacing original artifact with shaded artifact.
	[INFO] Replacing /Users/xubo/Desktop/xubo/git/hive/kafka-handler/target/kafka-handler-4.0.0-SNAPSHOT.jar with /Users/xubo/Desktop/xubo/git/hive/kafka-handler/target/kafka-handler-4.0.0-SNAPSHOT-shaded.jar
	[INFO] Replacing original test artifact with shaded test artifact.
	[INFO] Replacing /Users/xubo/Desktop/xubo/git/hive/kafka-handler/target/kafka-handler-4.0.0-SNAPSHOT-tests.jar with /Users/xubo/Desktop/xubo/git/hive/kafka-handler/target/kafka-handler-4.0.0-SNAPSHOT-shaded-tests.jar
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Packaging 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hive-packaging ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/hive/packaging (includes = [datanucleus.log, derby.log], excludes = [])
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-no-snapshots) @ hive-packaging ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-licenses) @ hive-packaging ---
	[INFO] 
	[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies-logging) @ hive-packaging ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-packaging ---
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (define-classpath) @ hive-packaging ---
	[INFO] Executing tasks
	
	main:
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-packaging ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/packaging/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/packaging/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/packaging/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/packaging/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-packaging ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Metastore Tools 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:3.0.0:clean (default-clean) @ hive-metastore-tools ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-metastore-tools ---
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-metastore-tools ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Metastore Tools common libraries 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.8.8/jackson-core-2.8.8.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.8.8/jackson-core-2.8.8.pom (0 B at 0.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.7.9/jackson-core-2.7.9.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.7.9/jackson-core-2.7.9.pom (0 B at 0.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.7.9/jackson-annotations-2.7.9.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.7.9/jackson-annotations-2.7.9.pom (2 KB at 2.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/zookeeper/zookeeper/3.4.10/zookeeper-3.4.10.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/zookeeper/zookeeper/3.4.10/zookeeper-3.4.10.pom (8 KB at 12.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/curator/curator-framework/4.0.0/curator-framework-4.0.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/curator/curator-framework/4.0.0/curator-framework-4.0.0.pom (4 KB at 6.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/curator/curator-client/4.0.0/curator-client-4.0.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/curator/curator-client/4.0.0/curator-client-4.0.0.pom (5 KB at 8.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-auth/2.7.1/hadoop-auth-2.7.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-auth/2.7.1/hadoop-auth-2.7.1.pom (8 KB at 15.3 KB/sec)
	Downloading: https://repository.apache.org/snapshots/commons-codec/commons-codec/maven-metadata.xml
	Downloading: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/maven-metadata.xml
	Downloading: http://www.datanucleus.org/downloads/maven2/commons-codec/commons-codec/maven-metadata.xml
	Downloading: https://oss.sonatype.org/content/repositories/snapshots/commons-codec/commons-codec/maven-metadata.xml
	Downloaded: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/maven-metadata.xml (642 B at 1.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-server-web-proxy/2.6.5/hadoop-yarn-server-web-proxy-2.6.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-server-web-proxy/2.6.5/hadoop-yarn-server-web-proxy-2.6.5.pom (5 KB at 10.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.13/slf4j-api-1.7.13.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.13/slf4j-api-1.7.13.pom (3 KB at 6.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.13/slf4j-parent-1.7.13.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.13/slf4j-parent-1.7.13.pom (14 KB at 18.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.9.4/jackson-annotations-2.9.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.9.4/jackson-annotations-2.9.4.pom (3 KB at 5.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-webapp/9.4.6.v20170531/jetty-webapp-9.4.6.v20170531.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-webapp/9.4.6.v20170531/jetty-webapp-9.4.6.v20170531.pom (3 KB at 5.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-xml/9.4.6.v20170531/jetty-xml-9.4.6.v20170531.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-xml/9.4.6.v20170531/jetty-xml-9.4.6.v20170531.pom (2 KB at 2.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/jettison/jettison/1.3.8/jettison-1.3.8.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/jettison/jettison/1.3.8/jettison-1.3.8.pom (8 KB at 13.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-client/2.7.1/hadoop-client-2.7.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-client/2.7.1/hadoop-client-2.7.1.pom (10 KB at 17.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-app/2.7.1/hadoop-mapreduce-client-app-2.7.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-app/2.7.1/hadoop-mapreduce-client-app-2.7.1.pom (5 KB at 9.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client/2.7.1/hadoop-mapreduce-client-2.7.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client/2.7.1/hadoop-mapreduce-client-2.7.1.pom (7 KB at 12.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-common/2.7.1/hadoop-mapreduce-client-common-2.7.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-common/2.7.1/hadoop-mapreduce-client-common-2.7.1.pom (4 KB at 7.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-client/2.7.1/hadoop-yarn-client-2.7.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-client/2.7.1/hadoop-yarn-client-2.7.1.pom (6 KB at 11.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-server-common/2.7.1/hadoop-yarn-server-common-2.7.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-server-common/2.7.1/hadoop-yarn-server-common-2.7.1.pom (6 KB at 10.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-server/2.7.1/hadoop-yarn-server-2.7.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-server/2.7.1/hadoop-yarn-server-2.7.1.pom (2 KB at 4.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-shuffle/2.7.1/hadoop-mapreduce-client-shuffle-2.7.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-shuffle/2.7.1/hadoop-mapreduce-client-shuffle-2.7.1.pom (3 KB at 6.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-jobclient/2.7.1/hadoop-mapreduce-client-jobclient-2.7.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-jobclient/2.7.1/hadoop-mapreduce-client-jobclient-2.7.1.pom (6 KB at 11.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-server-nodemanager/2.7.1/hadoop-yarn-server-nodemanager-2.7.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-server-nodemanager/2.7.1/hadoop-yarn-server-nodemanager-2.7.1.pom (12 KB at 16.6 KB/sec)
	Downloading: https://repository.apache.org/snapshots/org/glassfish/javax.el/maven-metadata.xml
	Downloading: https://repo.maven.apache.org/maven2/org/glassfish/javax.el/maven-metadata.xml
	Downloading: http://www.datanucleus.org/downloads/maven2/org/glassfish/javax.el/maven-metadata.xml
	Downloading: file:${project.basedir}/src/main/site/resources/repo/org/glassfish/javax.el/maven-metadata.xml
	Downloading: https://maven.java.net/content/repositories/snapshots/org/glassfish/javax.el/maven-metadata.xml
	Downloaded: https://repo.maven.apache.org/maven2/org/glassfish/javax.el/maven-metadata.xml (917 B at 2.1 KB/sec)
	Downloaded: https://maven.java.net/content/repositories/snapshots/org/glassfish/javax.el/maven-metadata.xml (417 B at 0.3 KB/sec)
	Downloading: https://repository.apache.org/snapshots/org/glassfish/javax.el/3.0.1-b06-SNAPSHOT/maven-metadata.xml
	Downloading: https://maven.java.net/content/repositories/snapshots/org/glassfish/javax.el/3.0.1-b06-SNAPSHOT/maven-metadata.xml
	Downloading: file:${project.basedir}/src/main/site/resources/repo/org/glassfish/javax.el/3.0.1-b06-SNAPSHOT/maven-metadata.xml
	Downloading: https://repository.apache.org/snapshots/org/glassfish/javax.el/3.0.1-b06-SNAPSHOT/javax.el-3.0.1-b06-SNAPSHOT.pom
	Downloading: file:${project.basedir}/src/main/site/resources/repo/org/glassfish/javax.el/3.0.1-b06-SNAPSHOT/javax.el-3.0.1-b06-SNAPSHOT.pom
	Downloading: https://maven.java.net/content/repositories/snapshots/org/glassfish/javax.el/3.0.1-b06-SNAPSHOT/javax.el-3.0.1-b06-SNAPSHOT.pom
	[WARNING] The POM for org.glassfish:javax.el:jar:3.0.1-b06-SNAPSHOT is missing, no dependency information available
	Downloading: https://repository.apache.org/snapshots/org/glassfish/javax.el/3.0.1-b07-SNAPSHOT/maven-metadata.xml
	Downloading: https://maven.java.net/content/repositories/snapshots/org/glassfish/javax.el/3.0.1-b07-SNAPSHOT/maven-metadata.xml
	Downloading: file:${project.basedir}/src/main/site/resources/repo/org/glassfish/javax.el/3.0.1-b07-SNAPSHOT/maven-metadata.xml
	Downloading: https://repository.apache.org/snapshots/org/glassfish/javax.el/3.0.1-b07-SNAPSHOT/javax.el-3.0.1-b07-SNAPSHOT.pom
	Downloading: file:${project.basedir}/src/main/site/resources/repo/org/glassfish/javax.el/3.0.1-b07-SNAPSHOT/javax.el-3.0.1-b07-SNAPSHOT.pom
	Downloading: https://maven.java.net/content/repositories/snapshots/org/glassfish/javax.el/3.0.1-b07-SNAPSHOT/javax.el-3.0.1-b07-SNAPSHOT.pom
	[WARNING] The POM for org.glassfish:javax.el:jar:3.0.1-b07-SNAPSHOT is missing, no dependency information available
	Downloading: https://repository.apache.org/snapshots/org/glassfish/javax.el/3.0.1-b08-SNAPSHOT/maven-metadata.xml
	Downloading: https://maven.java.net/content/repositories/snapshots/org/glassfish/javax.el/3.0.1-b08-SNAPSHOT/maven-metadata.xml
	Downloading: file:${project.basedir}/src/main/site/resources/repo/org/glassfish/javax.el/3.0.1-b08-SNAPSHOT/maven-metadata.xml
	Downloading: https://repository.apache.org/snapshots/org/glassfish/javax.el/3.0.1-b08-SNAPSHOT/javax.el-3.0.1-b08-SNAPSHOT.pom
	Downloading: file:${project.basedir}/src/main/site/resources/repo/org/glassfish/javax.el/3.0.1-b08-SNAPSHOT/javax.el-3.0.1-b08-SNAPSHOT.pom
	Downloading: https://maven.java.net/content/repositories/snapshots/org/glassfish/javax.el/3.0.1-b08-SNAPSHOT/javax.el-3.0.1-b08-SNAPSHOT.pom
	[WARNING] The POM for org.glassfish:javax.el:jar:3.0.1-b08-SNAPSHOT is missing, no dependency information available
	Downloading: file:${project.basedir}/src/main/site/resources/repo/org/glassfish/javax.el/3.0.1-b11-SNAPSHOT/maven-metadata.xml
	Downloading: https://maven.java.net/content/repositories/snapshots/org/glassfish/javax.el/3.0.1-b11-SNAPSHOT/maven-metadata.xml
	Downloading: https://repository.apache.org/snapshots/org/glassfish/javax.el/3.0.1-b11-SNAPSHOT/maven-metadata.xml
	Downloaded: https://maven.java.net/content/repositories/snapshots/org/glassfish/javax.el/3.0.1-b11-SNAPSHOT/maven-metadata.xml (2 KB at 0.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/jetbrains/annotations/16.0.2/annotations-16.0.2.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/jetbrains/annotations/16.0.2/annotations-16.0.2.pom (2 KB at 2.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.2.0/junit-jupiter-api-5.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.2.0/junit-jupiter-api-5.2.0.pom (3 KB at 5.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.0.0/apiguardian-api-1.0.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.0.0/apiguardian-api-1.0.0.pom (2 KB at 2.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.1.0/opentest4j-1.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.1.0/opentest4j-1.1.0.pom (2 KB at 3.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.2.0/junit-platform-commons-1.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.2.0/junit-platform-commons-1.2.0.pom (2 KB at 4.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/jetbrains/annotations/16.0.2/annotations-16.0.2.jar
	Downloading: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.2.0/junit-jupiter-api-5.2.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.0.0/apiguardian-api-1.0.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.1.0/opentest4j-1.1.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.2.0/junit-platform-commons-1.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.1.0/opentest4j-1.1.0.jar (7 KB at 5.3 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.0.0/apiguardian-api-1.0.0.jar (3 KB at 1.2 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/jetbrains/annotations/16.0.2/annotations-16.0.2.jar (19 KB at 6.6 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.2.0/junit-jupiter-api-5.2.0.jar (106 KB at 33.7 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.2.0/junit-platform-commons-1.2.0.jar (77 KB at 21.8 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:3.0.0:clean (default-clean) @ metastore-tools-common ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ metastore-tools-common ---
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-app/2.7.1/hadoop-mapreduce-client-app-2.7.1.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-jobclient/2.7.1/hadoop-mapreduce-client-jobclient-2.7.1.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-common/2.7.1/hadoop-mapreduce-client-common-2.7.1.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-shuffle/2.7.1/hadoop-mapreduce-client-shuffle-2.7.1.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-client/2.7.1/hadoop-client-2.7.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-client/2.7.1/hadoop-client-2.7.1.jar (3 KB at 1.4 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-shuffle/2.7.1/hadoop-mapreduce-client-shuffle-2.7.1.jar (44 KB at 11.7 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-jobclient/2.7.1/hadoop-mapreduce-client-jobclient-2.7.1.jar (38 KB at 9.9 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-common/2.7.1/hadoop-mapreduce-client-common-2.7.1.jar (736 KB at 48.2 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-mapreduce-client-app/2.7.1/hadoop-mapreduce-client-app-2.7.1.jar (505 KB at 23.2 KB/sec)
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ metastore-tools-common ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-tools/tools-common/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ metastore-tools-common ---
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac-errorprone/2.8/plexus-compiler-javac-errorprone-2.8.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac-errorprone/2.8/plexus-compiler-javac-errorprone-2.8.pom (2 KB at 3.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compilers/2.8/plexus-compilers-2.8.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compilers/2.8/plexus-compilers-2.8.pom (2 KB at 2.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/2.8/plexus-compiler-2.8.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/2.8/plexus-compiler-2.8.pom (5 KB at 9.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.8/plexus-compiler-javac-2.8.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.8/plexus-compiler-javac-2.8.pom (792 B at 1.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.8/plexus-compiler-api-2.8.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.8/plexus-compiler-api-2.8.pom (891 B at 2.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_core/2.0.5/error_prone_core-2.0.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_core/2.0.5/error_prone_core-2.0.5.pom (10 KB at 7.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_parent/2.0.5/error_prone_parent-2.0.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_parent/2.0.5/error_prone_parent-2.0.5.pom (5 KB at 9.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotation/2.0.5/error_prone_annotation-2.0.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotation/2.0.5/error_prone_annotation-2.0.5.pom (2 KB at 2.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/checkerframework/dataflow/1.8.10/dataflow-1.8.10.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/checkerframework/dataflow/1.8.10/dataflow-1.8.10.pom (5 KB at 9.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/checkerframework/javacutil/1.8.10/javacutil-1.8.10.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/checkerframework/javacutil/1.8.10/javacutil-1.8.10.pom (4 KB at 6.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/javac/1.9.0-dev-r2644-1/javac-1.9.0-dev-r2644-1.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/javac/1.9.0-dev-r2644-1/javac-1.9.0-dev-r2644-1.pom (2 KB at 2.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.0.5/error_prone_annotations-2.0.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.0.5/error_prone_annotations-2.0.5.pom (2 KB at 2.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_core/2.3.1/error_prone_core-2.3.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_core/2.3.1/error_prone_core-2.3.1.pom (13 KB at 17.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_parent/2.3.1/error_prone_parent-2.3.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_parent/2.3.1/error_prone_parent-2.3.1.pom (5 KB at 9.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotation/2.3.1/error_prone_annotation-2.3.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotation/2.3.1/error_prone_annotation-2.3.1.pom (2 KB at 4.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/guava/guava/23.5-jre/guava-23.5-jre.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/guava/guava/23.5-jre/guava-23.5-jre.pom (7 KB at 12.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/23.5-jre/guava-parent-23.5-jre.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/23.5-jre/guava-parent-23.5-jre.pom (10 KB at 14.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/2.0.0/checker-qual-2.0.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/2.0.0/checker-qual-2.0.0.pom (5 KB at 7.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_type_annotations/2.3.1/error_prone_type_annotations-2.3.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_type_annotations/2.3.1/error_prone_type_annotations-2.3.1.pom (2 KB at 3.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_check_api/2.3.1/error_prone_check_api-2.3.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_check_api/2.3.1/error_prone_check_api-2.3.1.pom (5 KB at 9.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/checkerframework/dataflow/2.5.0/dataflow-2.5.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/checkerframework/dataflow/2.5.0/dataflow-2.5.0.pom (4 KB at 6.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/2.5.0/checker-qual-2.5.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/2.5.0/checker-qual-2.5.0.pom (3 KB at 5.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/checkerframework/javacutil/2.5.0/javacutil-2.5.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/checkerframework/javacutil/2.5.0/javacutil-2.5.0.pom (3 KB at 6.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/javac/9+181-r4173-1/javac-9+181-r4173-1.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/javac/9+181-r4173-1/javac-9+181-r4173-1.pom (2 KB at 2.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/googlecode/java-diff-utils/diffutils/1.3.0/diffutils-1.3.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/googlecode/java-diff-utils/diffutils/1.3.0/diffutils-1.3.0.pom (3 KB at 5.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.3.1/error_prone_annotations-2.3.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.3.1/error_prone_annotations-2.3.1.pom (2 KB at 4.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/github/kevinstern/software-and-algorithms/1.0/software-and-algorithms-1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/github/kevinstern/software-and-algorithms/1.0/software-and-algorithms-1.0.pom (4 KB at 6.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/auto/auto-common/0.10/auto-common-0.10.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/auto/auto-common/0.10/auto-common-0.10.pom (3 KB at 6.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/auto/auto-parent/6/auto-parent-6.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/auto/auto-parent/6/auto-parent-6.pom (7 KB at 12.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac-errorprone/2.8/plexus-compiler-javac-errorprone-2.8.jar
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_core/2.3.1/error_prone_core-2.3.1.jar
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotation/2.3.1/error_prone_annotation-2.3.1.jar
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_type_annotations/2.3.1/error_prone_type_annotations-2.3.1.jar
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_check_api/2.3.1/error_prone_check_api-2.3.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_type_annotations/2.3.1/error_prone_type_annotations-2.3.1.jar (4 KB at 3.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/googlecode/java-diff-utils/diffutils/1.3.0/diffutils-1.3.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotation/2.3.1/error_prone_annotation-2.3.1.jar (10 KB at 6.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/github/kevinstern/software-and-algorithms/1.0/software-and-algorithms-1.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac-errorprone/2.8/plexus-compiler-javac-errorprone-2.8.jar (10 KB at 1.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/guava/guava/23.5-jre/guava-23.5-jre.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/github/kevinstern/software-and-algorithms/1.0/software-and-algorithms-1.0.jar (63 KB at 11.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/2.0.0/checker-qual-2.0.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/googlecode/java-diff-utils/diffutils/1.3.0/diffutils-1.3.0.jar (34 KB at 5.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/auto/auto-common/0.10/auto-common-0.10.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/google/auto/auto-common/0.10/auto-common-0.10.jar (88 KB at 5.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/checkerframework/dataflow/2.5.0/dataflow-2.5.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/2.0.0/checker-qual-2.0.0.jar (336 KB at 12.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/checkerframework/javacutil/2.5.0/javacutil-2.5.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_check_api/2.3.1/error_prone_check_api-2.3.1.jar (528 KB at 14.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/javac/9+181-r4173-1/javac-9+181-r4173-1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/checkerframework/javacutil/2.5.0/javacutil-2.5.0.jar (87 KB at 2.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.3.1/error_prone_annotations-2.3.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/checkerframework/dataflow/2.5.0/dataflow-2.5.0.jar (303 KB at 8.1 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.3.1/error_prone_annotations-2.3.1.jar (13 KB at 0.3 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_core/2.3.1/error_prone_core-2.3.1.jar (1647 KB at 22.3 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/com/google/guava/guava/23.5-jre/guava-23.5-jre.jar (2597 KB at 20.4 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/com/google/errorprone/javac/9+181-r4173-1/javac-9+181-r4173-1.jar (6725 KB at 32.2 KB/sec)
	[INFO] Compiling 5 source files to /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-tools/tools-common/target/classes
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ metastore-tools-common ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-tools/tools-common/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.7.0:testCompile (default-testCompile) @ metastore-tools-common ---
	[INFO] Compiling 2 source files to /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-tools/tools-common/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.20.1:test (default-test) @ metastore-tools-common ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:3.0.0:jar (default-jar) @ metastore-tools-common ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-tools/tools-common/target/metastore-tools-common-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ metastore-tools-common ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive metastore benchmarks 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: https://repo.maven.apache.org/maven2/info/picocli/picocli/3.1.0/picocli-3.1.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/info/picocli/picocli/3.1.0/picocli-3.1.0.pom (2 KB at 2.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jxr-plugin/2.5/maven-jxr-plugin-2.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jxr-plugin/2.5/maven-jxr-plugin-2.5.pom (8 KB at 12.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/jxr/jxr/2.5/jxr-2.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/jxr/jxr/2.5/jxr-2.5.pom (5 KB at 10.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-jxr/2.5/maven-jxr-2.5.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-jxr/2.5/maven-jxr-2.5.pom (4 KB at 7.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.0.1/commons-io-2.0.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.0.1/commons-io-2.0.1.pom (0 B at 0.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/15/commons-parent-15.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/15/commons-parent-15.pom (0 B at 0.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/xalan/xalan/2.7.0/xalan-2.7.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/xalan/xalan/2.7.0/xalan-2.7.0.pom (491 B at 0.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-runner/1.2.0/junit-platform-runner-1.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-runner/1.2.0/junit-platform-runner-1.2.0.pom (3 KB at 5.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.2.0/junit-platform-launcher-1.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.2.0/junit-platform-launcher-1.2.0.pom (3 KB at 4.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.2.0/junit-platform-engine-1.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.2.0/junit-platform-engine-1.2.0.pom (3 KB at 4.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-suite-api/1.2.0/junit-platform-suite-api-1.2.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-suite-api/1.2.0/junit-platform-suite-api-1.2.0.pom (3 KB at 4.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/info/picocli/picocli/3.1.0/picocli-3.1.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jxr-plugin/2.5/maven-jxr-plugin-2.5.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-jxr/2.5/maven-jxr-2.5.jar
	Downloading: https://repo.maven.apache.org/maven2/xalan/xalan/2.7.0/xalan-2.7.0.jar
	Downloading: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-runner/1.2.0/junit-platform-runner-1.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-runner/1.2.0/junit-platform-runner-1.2.0.jar (18 KB at 7.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.2.0/junit-platform-launcher-1.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jxr-plugin/2.5/maven-jxr-plugin-2.5.jar (41 KB at 15.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.2.0/junit-platform-engine-1.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-jxr/2.5/maven-jxr-2.5.jar (46 KB at 14.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-suite-api/1.2.0/junit-platform-suite-api-1.2.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-suite-api/1.2.0/junit-platform-suite-api-1.2.0.jar (14 KB at 2.2 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.2.0/junit-platform-engine-1.2.0.jar (88 KB at 9.9 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/info/picocli/picocli/3.1.0/picocli-3.1.0.jar (201 KB at 19.2 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.2.0/junit-platform-launcher-1.2.0.jar (79 KB at 7.5 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/xalan/xalan/2.7.0/xalan-2.7.0.jar (2667 KB at 39.9 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:3.0.0:clean (default-clean) @ hive-metastore-benchmarks ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-metastore-benchmarks ---
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-server-common/2.7.1/hadoop-yarn-server-common-2.7.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-yarn-server-common/2.7.1/hadoop-yarn-server-common-2.7.1.jar (356 KB at 26.3 KB/sec)
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-metastore-benchmarks ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 2 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ hive-metastore-benchmarks ---
	[INFO] Compiling 3 source files to /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-tools/metastore-benchmarks/target/classes
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-metastore-benchmarks ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-tools/metastore-benchmarks/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.7.0:testCompile (default-testCompile) @ hive-metastore-benchmarks ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.20.1:test (default-test) @ hive-metastore-benchmarks ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:3.0.0:jar (default-jar) @ hive-metastore-benchmarks ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/standalone-metastore/metastore-tools/metastore-benchmarks/target/hive-metastore-benchmarks-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-metastore-benchmarks ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Upgrade Acid 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:3.0.0:clean (default-clean) @ hive-upgrade-acid ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-upgrade-acid ---
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-upgrade-acid ---
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Hive Pre Upgrade Acid 4.0.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-metastore/2.3.3/hive-metastore-2.3.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-metastore/2.3.3/hive-metastore-2.3.3.pom (14 KB at 17.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive/2.3.3/hive-2.3.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive/2.3.3/hive-2.3.3.pom (51 KB at 30.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-serde/2.3.3/hive-serde-2.3.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-serde/2.3.3/hive-serde-2.3.3.pom (7 KB at 11.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-common/2.3.3/hive-common-2.3.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-common/2.3.3/hive-common-2.3.3.pom (11 KB at 14.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-shims/2.3.3/hive-shims-2.3.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-shims/2.3.3/hive-shims-2.3.3.pom (2 KB at 4.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/shims/hive-shims-common/2.3.3/hive-shims-common-2.3.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/shims/hive-shims-common/2.3.3/hive-shims-common-2.3.3.pom (4 KB at 6.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/shims/hive-shims-0.23/2.3.3/hive-shims-0.23-2.3.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/shims/hive-shims-0.23/2.3.3/hive-shims-0.23-2.3.3.pom (7 KB at 11.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/shims/hive-shims-scheduler/2.3.3/hive-shims-scheduler-2.3.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/shims/hive-shims-scheduler/2.3.3/hive-shims-scheduler-2.3.3.pom (3 KB at 6.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/guava/guava/12.0.1/guava-12.0.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/guava/guava/12.0.1/guava-12.0.1.pom (6 KB at 10.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/12.0.1/guava-parent-12.0.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/12.0.1/guava-parent-12.0.1.pom (3 KB at 4.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-service-rpc/2.3.3/hive-service-rpc-2.3.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-service-rpc/2.3.3/hive-service-rpc-2.3.3.pom (4 KB at 6.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/guava/guava/13.0.1/guava-13.0.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/guava/guava/13.0.1/guava-13.0.1.pom (6 KB at 9.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/13.0.1/guava-parent-13.0.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/13.0.1/guava-parent-13.0.1.pom (3 KB at 4.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/thrift/libthrift/0.9.0/libthrift-0.9.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/thrift/libthrift/0.9.0/libthrift-0.9.0.pom (4 KB at 7.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.1.3/httpcore-4.1.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.1.3/httpcore-4.1.3.pom (8 KB at 12.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-core/4.1.3/httpcomponents-core-4.1.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-core/4.1.3/httpcomponents-core-4.1.3.pom (10 KB at 14.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-exec/2.3.3/hive-exec-2.3.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-exec/2.3.3/hive-exec-2.3.3.pom (31 KB at 31.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-vector-code-gen/2.3.3/hive-vector-code-gen-2.3.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-vector-code-gen/2.3.3/hive-vector-code-gen-2.3.3.pom (3 KB at 4.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-llap-tez/2.3.3/hive-llap-tez-2.3.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-llap-tez/2.3.3/hive-llap-tez-2.3.3.pom (7 KB at 11.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-llap-client/2.3.3/hive-llap-client-2.3.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-llap-client/2.3.3/hive-llap-client-2.3.3.pom (7 KB at 10.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-llap-common/2.3.3/hive-llap-common-2.3.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-llap-common/2.3.3/hive-llap-common-2.3.3.pom (9 KB at 12.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/groovy/groovy-all/2.4.4/groovy-all-2.4.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/groovy/groovy-all/2.4.4/groovy-all-2.4.4.pom (20 KB at 24.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-core/1.10.0/calcite-core-1.10.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-core/1.10.0/calcite-core-1.10.0.pom (16 KB at 22.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite/1.10.0/calcite-1.10.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite/1.10.0/calcite-1.10.0.pom (36 KB at 33.4 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/avatica/avatica/1.8.0/avatica-1.8.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/avatica/avatica/1.8.0/avatica-1.8.0.pom (9 KB at 15.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/avatica/avatica-parent/1.8.0/avatica-parent-1.8.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/avatica/avatica-parent/1.8.0/avatica-parent-1.8.0.pom (30 KB at 36.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/avatica/avatica-metrics/1.8.0/avatica-metrics-1.8.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/avatica/avatica-metrics/1.8.0/avatica-metrics-1.8.0.pom (5 KB at 8.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java/3.0.0-beta-1/protobuf-java-3.0.0-beta-1.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java/3.0.0-beta-1/protobuf-java-3.0.0-beta-1.pom (15 KB at 21.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-linq4j/1.10.0/calcite-linq4j-1.10.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-linq4j/1.10.0/calcite-linq4j-1.10.0.pom (3 KB at 5.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-druid/1.10.0/calcite-druid-1.10.0.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-druid/1.10.0/calcite-druid-1.10.0.pom (6 KB at 10.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.6.3/jackson-core-2.6.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.6.3/jackson-core-2.6.3.pom (5 KB at 9.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.6.3/jackson-annotations-2.6.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.6.3/jackson-annotations-2.6.3.pom (2 KB at 2.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.6.3/jackson-databind-2.6.3.pom
	Downloaded: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.6.3/jackson-databind-2.6.3.pom (6 KB at 3.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-common/2.6.4/hadoop-common-2.6.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-common/2.6.4/hadoop-common-2.6.4.pom (30 KB at 25.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-project-dist/2.6.4/hadoop-project-dist-2.6.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-project-dist/2.6.4/hadoop-project-dist-2.6.4.pom (18 KB at 23.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-project/2.6.4/hadoop-project-2.6.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-project/2.6.4/hadoop-project-2.6.4.pom (42 KB at 37.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-main/2.6.4/hadoop-main-2.6.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-main/2.6.4/hadoop-main-2.6.4.pom (18 KB at 25.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-annotations/2.6.4/hadoop-annotations-2.6.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-annotations/2.6.4/hadoop-annotations-2.6.4.pom (3 KB at 5.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-auth/2.6.4/hadoop-auth-2.6.4.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hadoop/hadoop-auth/2.6.4/hadoop-auth-2.6.4.pom (8 KB at 13.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-storage-api/2.2.1/hive-storage-api-2.2.1.pom
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-storage-api/2.2.1/hive-storage-api-2.2.1.pom (6 KB at 9.8 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-metastore/2.3.3/hive-metastore-2.3.3.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-serde/2.3.3/hive-serde-2.3.3.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-common/2.3.3/hive-common-2.3.3.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-service-rpc/2.3.3/hive-service-rpc-2.3.3.jar
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-shims/2.3.3/hive-shims-2.3.3.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-shims/2.3.3/hive-shims-2.3.3.jar (9 KB at 6.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/shims/hive-shims-common/2.3.3/hive-shims-common-2.3.3.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/shims/hive-shims-common/2.3.3/hive-shims-common-2.3.3.jar (118 KB at 7.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/shims/hive-shims-0.23/2.3.3/hive-shims-0.23-2.3.3.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/shims/hive-shims-0.23/2.3.3/hive-shims-0.23-2.3.3.jar (53 KB at 2.2 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/shims/hive-shims-scheduler/2.3.3/hive-shims-scheduler-2.3.3.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/shims/hive-shims-scheduler/2.3.3/hive-shims-scheduler-2.3.3.jar (13 KB at 0.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-exec/2.3.3/hive-exec-2.3.3.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-common/2.3.3/hive-common-2.3.3.jar (428 KB at 11.3 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-vector-code-gen/2.3.3/hive-vector-code-gen-2.3.3.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-vector-code-gen/2.3.3/hive-vector-code-gen-2.3.3.jar (38 KB at 0.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-llap-tez/2.3.3/hive-llap-tez-2.3.3.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-llap-tez/2.3.3/hive-llap-tez-2.3.3.jar (100 KB at 2.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-llap-client/2.3.3/hive-llap-client-2.3.3.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-serde/2.3.3/hive-serde-2.3.3.jar (895 KB at 14.9 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-llap-common/2.3.3/hive-llap-common-2.3.3.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-llap-client/2.3.3/hive-llap-client-2.3.3.jar (122 KB at 2.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/codehaus/groovy/groovy-all/2.4.4/groovy-all-2.4.4.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-llap-common/2.3.3/hive-llap-common-2.3.3.jar (319 KB at 3.7 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-core/1.10.0/calcite-core-1.10.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-service-rpc/2.3.3/hive-service-rpc-2.3.3.jar (1514 KB at 11.5 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-linq4j/1.10.0/calcite-linq4j-1.10.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-linq4j/1.10.0/calcite-linq4j-1.10.0.jar (471 KB at 3.1 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-druid/1.10.0/calcite-druid-1.10.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-druid/1.10.0/calcite-druid-1.10.0.jar (95 KB at 0.6 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/avatica/avatica/1.8.0/avatica-1.8.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/calcite-core/1.10.0/calcite-core-1.10.0.jar (3990 KB at 7.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/calcite/avatica/avatica-metrics/1.8.0/avatica-metrics-1.8.0.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/avatica/avatica-metrics/1.8.0/avatica-metrics-1.8.0.jar (20 KB at 0.0 KB/sec)
	Downloading: https://repo.maven.apache.org/maven2/org/apache/hive/hive-storage-api/2.2.1/hive-storage-api-2.2.1.jar
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-storage-api/2.2.1/hive-storage-api-2.2.1.jar (173 KB at 0.3 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/calcite/avatica/avatica/1.8.0/avatica-1.8.0.jar (5101 KB at 7.9 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-metastore/2.3.3/hive-metastore-2.3.3.jar (7929 KB at 11.7 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/groovy/groovy-all/2.4.4/groovy-all-2.4.4.jar (6835 KB at 10.0 KB/sec)
	Downloaded: https://repo.maven.apache.org/maven2/org/apache/hive/hive-exec/2.3.3/hive-exec-2.3.3.jar (33406 KB at 19.5 KB/sec)
	[INFO] 
	[INFO] --- maven-clean-plugin:3.0.0:clean (default-clean) @ hive-pre-upgrade ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (process-resource-bundles) @ hive-pre-upgrade ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ hive-pre-upgrade ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/upgrade-acid/pre-upgrade/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.5.1:compile (default-compile) @ hive-pre-upgrade ---
	[INFO] Compiling 1 source file to /Users/xubo/Desktop/xubo/git/hive/upgrade-acid/pre-upgrade/target/classes
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ hive-pre-upgrade ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/hive/upgrade-acid/pre-upgrade/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-test-dirs) @ hive-pre-upgrade ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/upgrade-acid/pre-upgrade/target/tmp
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/upgrade-acid/pre-upgrade/target/warehouse
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/upgrade-acid/pre-upgrade/target/testconf
	     [copy] Copying 19 files to /Users/xubo/Desktop/xubo/git/hive/upgrade-acid/pre-upgrade/target/testconf
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (setup-metastore-scripts) @ hive-pre-upgrade ---
	[INFO] Executing tasks
	
	main:
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/hive/upgrade-acid/pre-upgrade/target/tmp/scripts/metastore
	     [copy] Copying 425 files to /Users/xubo/Desktop/xubo/git/hive/upgrade-acid/pre-upgrade/target/tmp/scripts/metastore
	     [copy] Copying 44 files to /Users/xubo/Desktop/xubo/git/hive/upgrade-acid/pre-upgrade/target/tmp/scripts/metastore/upgrade
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.5.1:testCompile (default-testCompile) @ hive-pre-upgrade ---
	[INFO] Compiling 1 source file to /Users/xubo/Desktop/xubo/git/hive/upgrade-acid/pre-upgrade/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.20.1:test (default-test) @ hive-pre-upgrade ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:3.0.0:jar (default-jar) @ hive-pre-upgrade ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/upgrade-acid/pre-upgrade/target/hive-pre-upgrade-4.0.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.5.1:attach-descriptor (attach-descriptor) @ hive-pre-upgrade ---
	[INFO] 
	[INFO] --- maven-jar-plugin:3.0.0:test-jar (default) @ hive-pre-upgrade ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/hive/upgrade-acid/pre-upgrade/target/hive-pre-upgrade-4.0.0-SNAPSHOT-tests.jar
	[INFO] ------------------------------------------------------------------------
	[INFO] Reactor Summary:
	[INFO] 
	[INFO] Hive Storage API ................................... SUCCESS [  4.756 s]
	[INFO] Hive ............................................... SUCCESS [  0.485 s]
	[INFO] Hive Classifications ............................... SUCCESS [  0.780 s]
	[INFO] Hive Shims Common .................................. SUCCESS [  2.760 s]
	[INFO] Hive Shims 0.23 .................................... SUCCESS [  3.918 s]
	[INFO] Hive Shims Scheduler ............................... SUCCESS [  1.936 s]
	[INFO] Hive Shims ......................................... SUCCESS [  1.580 s]
	[INFO] Hive Standalone Metastore .......................... SUCCESS [  1.874 s]
	[INFO] Hive Standalone Metastore Common Code .............. SUCCESS [ 18.234 s]
	[INFO] Hive Common ........................................ SUCCESS [  7.590 s]
	[INFO] Hive Service RPC ................................... SUCCESS [  2.930 s]
	[INFO] Hive Serde ......................................... SUCCESS [  5.447 s]
	[INFO] Hive Metastore ..................................... SUCCESS [  2.685 s]
	[INFO] Hive Vector-Code-Gen Utilities ..................... SUCCESS [  0.306 s]
	[INFO] Hive Llap Common ................................... SUCCESS [  2.856 s]
	[INFO] Hive Llap Client ................................... SUCCESS [  1.849 s]
	[INFO] Hive Llap Tez ...................................... SUCCESS [  2.395 s]
	[INFO] Hive Spark Remote Client ........................... SUCCESS [  4.979 s]
	[INFO] Hive Metastore Server .............................. SUCCESS [06:48 min]
	[INFO] Hive Query Language ................................ SUCCESS [07:14 min]
	[INFO] Hive Llap Server ................................... SUCCESS [04:31 min]
	[INFO] Hive Service ....................................... SUCCESS [06:21 min]
	[INFO] Hive Accumulo Handler .............................. SUCCESS [01:55 min]
	[INFO] Hive JDBC .......................................... SUCCESS [ 26.172 s]
	[INFO] Hive Beeline ....................................... SUCCESS [ 28.464 s]
	[INFO] Hive CLI ........................................... SUCCESS [  2.679 s]
	[INFO] Hive Contrib ....................................... SUCCESS [  1.814 s]
	[INFO] Hive Druid Handler ................................. SUCCESS [17:05 min]
	[INFO] Hive HBase Handler ................................. SUCCESS [03:10 min]
	[INFO] Hive JDBC Handler .................................. SUCCESS [ 51.425 s]
	[INFO] Hive HCatalog ...................................... SUCCESS [02:17 min]
	[INFO] Hive HCatalog Core ................................. SUCCESS [01:32 min]
	[INFO] Hive HCatalog Pig Adapter .......................... SUCCESS [  3.600 s]
	[INFO] Hive HCatalog Server Extensions .................... SUCCESS [02:30 min]
	[INFO] Hive HCatalog Webhcat Java Client .................. SUCCESS [  3.260 s]
	[INFO] Hive HCatalog Webhcat .............................. SUCCESS [ 54.737 s]
	[INFO] Hive HCatalog Streaming ............................ SUCCESS [  3.517 s]
	[INFO] Hive HPL/SQL ....................................... SUCCESS [ 51.067 s]
	[INFO] Hive Streaming ..................................... SUCCESS [  2.482 s]
	[INFO] Hive Llap External Client .......................... SUCCESS [  3.567 s]
	[INFO] Hive Shims Aggregator .............................. SUCCESS [  0.079 s]
	[INFO] Hive Kryo Registrator .............................. SUCCESS [  2.495 s]
	[INFO] Hive TestUtils ..................................... SUCCESS [  0.144 s]
	[INFO] Hive Kafka Storage Handler ......................... SUCCESS [04:30 min]
	[INFO] Hive Packaging ..................................... SUCCESS [  2.917 s]
	[INFO] Hive Metastore Tools ............................... SUCCESS [  0.007 s]
	[INFO] Hive Metastore Tools common libraries .............. SUCCESS [04:50 min]
	[INFO] Hive metastore benchmarks .......................... SUCCESS [01:30 min]
	[INFO] Hive Upgrade Acid .................................. SUCCESS [  0.009 s]
	[INFO] Hive Pre Upgrade Acid .............................. SUCCESS [29:05 min]
	[INFO] ------------------------------------------------------------------------
	[INFO] BUILD SUCCESS
	[INFO] ------------------------------------------------------------------------
	[INFO] Total time: 01:38 h
	[INFO] Finished at: 2018-12-13T10:43:12+08:00
	[INFO] Final Memory: 338M/1957M
	[INFO] ------------------------------------------------------------------------
	
	Process finished with exit code 0
