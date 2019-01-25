	/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/bin/java -Dmaven.multiModuleProjectDirectory=/Users/xubo/Desktop/xubo/git/carbondata3 -Dmaven.home=/Users/xubo/all/soft/apache-maven-3.3.9 -Dclassworlds.conf=/Users/xubo/all/soft/apache-maven-3.3.9/bin/m2.conf "-javaagent:/Volumes/IntelliJ IDEA CE/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=49510:/Volumes/IntelliJ IDEA CE/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Users/xubo/all/soft/apache-maven-3.3.9/boot/plexus-classworlds-2.5.2.jar org.codehaus.classworlds.Launcher -Didea.version=2018.1.2 clean -DskipTests -Pspark-2.3 -Phadoop-2.8 -Pbuild-with-format install
	[INFO] Scanning for projects...
	[WARNING] 
	[WARNING] Some problems were encountered while building the effective model for org.apache.carbondata:carbondata-presto:presto-plugin:1.5.2-SNAPSHOT
	[WARNING] 'build.plugins.plugin.version' for com.ning.maven.plugins:maven-duplicate-finder-plugin is missing. @ org.apache.carbondata:carbondata-presto:[unknown-version], /Users/xubo/Desktop/xubo/git/carbondata3/integration/presto/pom.xml, line 623, column 15
	[WARNING] 'build.plugins.plugin.version' for pl.project13.maven:git-commit-id-plugin is missing. @ org.apache.carbondata:carbondata-presto:[unknown-version], /Users/xubo/Desktop/xubo/git/carbondata3/integration/presto/pom.xml, line 636, column 15
	[WARNING] 
	[WARNING] Some problems were encountered while building the effective model for org.apache.carbondata:carbondata-examples-spark2:jar:1.5.2-SNAPSHOT
	[WARNING] 'build.plugins.plugin.version' for com.ning.maven.plugins:maven-duplicate-finder-plugin is missing. @ org.apache.carbondata:carbondata-examples-spark2:[unknown-version], /Users/xubo/Desktop/xubo/git/carbondata3/examples/spark2/pom.xml, line 181, column 15
	[WARNING] 
	[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
	[WARNING] 
	[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
	[WARNING] 
	[INFO] ------------------------------------------------------------------------
	[INFO] Reactor Build Order:
	[INFO] 
	[INFO] Apache CarbonData :: Parent
	[INFO] Apache CarbonData :: Common
	[INFO] Apache CarbonData :: Format
	[INFO] Apache CarbonData :: Core
	[INFO] Apache CarbonData :: Processing
	[INFO] Apache CarbonData :: Hadoop
	[INFO] Apache CarbonData :: Streaming
	[INFO] Apache CarbonData :: Store SDK
	[INFO] Apache CarbonData :: Spark Datasource
	[INFO] Apache CarbonData :: Spark Common
	[INFO] Apache CarbonData :: CLI
	[INFO] Apache CarbonData :: Lucene Index DataMap
	[INFO] Apache CarbonData :: Bloom Index DataMap
	[INFO] Apache CarbonData :: Spark2
	[INFO] Apache CarbonData :: Spark Common Test
	[INFO] Apache CarbonData :: DataMap Examples
	[INFO] Apache CarbonData :: Assembly
	[INFO] Apache CarbonData :: Hive
	[INFO] Apache CarbonData :: presto
	[INFO] Apache CarbonData :: Spark2 Examples
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Parent 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-parent ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-parent ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-parent ---
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-parent >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-parent ---
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-parent <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-parent ---
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-parent ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-parent ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/target/jacoco-it.exec
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-parent ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-parent ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata3/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 100 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-parent ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-parent ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-parent ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-parent ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-parent/1.5.2-SNAPSHOT/carbondata-parent-1.5.2-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Common 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-common ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/common/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-common ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/common/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-common ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-common ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/common/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-common ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 19 source files to /Users/xubo/Desktop/xubo/git/carbondata3/common/target/classes
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-common >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-common ---
	[INFO] Fork Value is true
	[INFO] Done FindBugs Analysis....
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-common <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-common ---
	[INFO] BugInstance size is 0
	[INFO] Error size is 0
	[INFO] No errors/warnings found
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ carbondata-common ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/common/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-common ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 5 source files to /Users/xubo/Desktop/xubo/git/carbondata3/common/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ carbondata-common ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-common ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata3/common/target/carbondata-common-1.5.2-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-common ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-common ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/common/target/jacoco-it.exec
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-common ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-common ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata3/common/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/common/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 1 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-common ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-common ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-common ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/common/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-common ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/common/target/carbondata-common-1.5.2-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-common/1.5.2-SNAPSHOT/carbondata-common-1.5.2-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/common/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-common/1.5.2-SNAPSHOT/carbondata-common-1.5.2-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Format 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-format ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/format/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-format ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/format/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-thrift-plugin:0.1.11:compile (generate-thrift-java) @ carbondata-format ---
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-format ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-format ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/format/src/main/resources
	[INFO] Copying 7 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-format ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 41 source files to /Users/xubo/Desktop/xubo/git/carbondata3/format/target/classes
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-format >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-format ---
	[INFO] Fork Value is true
	[INFO] Done FindBugs Analysis....
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-format <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-format ---
	[INFO] BugInstance size is 0
	[INFO] Error size is 0
	[INFO] No errors/warnings found
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ carbondata-format ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/format/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-format ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ carbondata-format ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-format ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata3/format/target/carbondata-format-1.5.2-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-format ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-format ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/format/target/jacoco-it.exec
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-format ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-format ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata3/format/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/format/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 1 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-format ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-format ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-format ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/format/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-format ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/format/target/carbondata-format-1.5.2-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-format/1.5.2-SNAPSHOT/carbondata-format-1.5.2-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/format/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-format/1.5.2-SNAPSHOT/carbondata-format-1.5.2-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Core 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-core ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/core/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-core ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/core/target/jacoco.exec,append=true
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-core ---
	[INFO] 
	[INFO] --- exec-maven-plugin:1.2.1:exec (default) @ carbondata-core ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-core ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 1 resource
	[INFO] Copying 1 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-core ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 653 source files to /Users/xubo/Desktop/xubo/git/carbondata3/core/target/classes
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/core/src/main/java/org/apache/carbondata/core/memory/CarbonUnsafe.java:[23,16] sun.misc.Unsafe is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/core/src/main/java/org/apache/carbondata/core/memory/CarbonUnsafe.java:[43,18] sun.misc.Unsafe is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/core/src/main/java/org/apache/carbondata/core/memory/CarbonUnsafe.java:[47,21] sun.misc.Unsafe is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/core/src/main/java/org/apache/carbondata/core/memory/CarbonUnsafe.java:[49,17] sun.misc.Unsafe is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/core/src/main/java/org/apache/carbondata/core/memory/CarbonUnsafe.java:[70,17] sun.misc.Unsafe is internal proprietary API and may be removed in a future release
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/core/src/main/java/org/apache/carbondata/core/util/ByteUtil.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/core/src/main/java/org/apache/carbondata/core/util/ByteUtil.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/core/src/main/java/org/apache/carbondata/core/metadata/schema/table/DataMapSchema.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/core/src/main/java/org/apache/carbondata/core/metadata/schema/table/DataMapSchema.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-core >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-core ---
	[INFO] Fork Value is true
	[INFO] Done FindBugs Analysis....
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-core <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-core ---
	[INFO] BugInstance size is 0
	[INFO] Error size is 0
	[INFO] No errors/warnings found
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ carbondata-core ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 1 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-core ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 110 source files to /Users/xubo/Desktop/xubo/git/carbondata3/core/target/test-classes
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/core/src/test/java/org/apache/carbondata/core/datastore/filesystem/LocalCarbonFileTest.java:[27,18] sun.nio.ch.FileChannelImpl is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/core/src/test/java/org/apache/carbondata/core/datastore/filesystem/LocalCarbonFileTest.java:[200,20] sun.nio.ch.FileChannelImpl is internal proprietary API and may be removed in a future release
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/core/src/test/java/org/apache/carbondata/core/keygenerator/factory/KeyGeneratorFactoryUnitTest.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/core/src/test/java/org/apache/carbondata/core/keygenerator/factory/KeyGeneratorFactoryUnitTest.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/core/src/test/java/org/apache/carbondata/core/metadata/CarbonMetadataTest.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/core/src/test/java/org/apache/carbondata/core/metadata/CarbonMetadataTest.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ carbondata-core ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-core ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata3/core/target/carbondata-core-1.5.2-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-core ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-core ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/core/target/jacoco-it.exec,append=true
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-core ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-core ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata3/core/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/core/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 0 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-core ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-core ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-core ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/core/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-core ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/core/target/carbondata-core-1.5.2-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-core/1.5.2-SNAPSHOT/carbondata-core-1.5.2-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/core/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-core/1.5.2-SNAPSHOT/carbondata-core-1.5.2-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Processing 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-processing ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/processing/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-processing ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/processing/target/jacoco.exec,append=true
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-processing ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-processing ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 1 resource
	[INFO] Copying 1 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-processing ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 150 source files to /Users/xubo/Desktop/xubo/git/carbondata3/processing/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/processing/src/main/java/org/apache/carbondata/processing/merger/CarbonDataMergerUtil.java: /Users/xubo/Desktop/xubo/git/carbondata3/processing/src/main/java/org/apache/carbondata/processing/merger/CarbonDataMergerUtil.java uses or overrides a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/processing/src/main/java/org/apache/carbondata/processing/merger/CarbonDataMergerUtil.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/processing/src/main/java/org/apache/carbondata/processing/store/CarbonFactDataHandlerModel.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/processing/src/main/java/org/apache/carbondata/processing/store/CarbonFactDataHandlerModel.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-processing >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-processing ---
	[INFO] Fork Value is true
	[INFO] Done FindBugs Analysis....
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-processing <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-processing ---
	[INFO] BugInstance size is 0
	[INFO] Error size is 0
	[INFO] No errors/warnings found
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ carbondata-processing ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 17 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-processing ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 5 source files to /Users/xubo/Desktop/xubo/git/carbondata3/processing/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ carbondata-processing ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-processing ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata3/processing/target/carbondata-processing-1.5.2-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-processing ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-processing ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/processing/target/jacoco-it.exec,append=true
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-processing ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-processing ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata3/processing/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/processing/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 0 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-processing ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-processing ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-processing ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/processing/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-processing ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/processing/target/carbondata-processing-1.5.2-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-processing/1.5.2-SNAPSHOT/carbondata-processing-1.5.2-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/processing/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-processing/1.5.2-SNAPSHOT/carbondata-processing-1.5.2-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Hadoop 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-hadoop ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/hadoop/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-hadoop ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/hadoop/target/jacoco.exec,append=true
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-hadoop ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-hadoop ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/hadoop/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-hadoop ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 21 source files to /Users/xubo/Desktop/xubo/git/carbondata3/hadoop/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/hadoop/src/main/java/org/apache/carbondata/hadoop/api/CarbonInputFormat.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/hadoop/src/main/java/org/apache/carbondata/hadoop/api/CarbonInputFormat.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-hadoop >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-hadoop ---
	[INFO] Fork Value is true
	[INFO] Done FindBugs Analysis....
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-hadoop <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-hadoop ---
	[INFO] BugInstance size is 0
	[INFO] Error size is 0
	[INFO] No errors/warnings found
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ carbondata-hadoop ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 1 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-hadoop ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 3 source files to /Users/xubo/Desktop/xubo/git/carbondata3/hadoop/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ carbondata-hadoop ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-hadoop ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata3/hadoop/target/carbondata-hadoop-1.5.2-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-hadoop ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-hadoop ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/hadoop/target/jacoco-it.exec,append=true
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-hadoop ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-hadoop ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata3/hadoop/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/hadoop/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 0 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-hadoop ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-hadoop ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-hadoop ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/hadoop/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-hadoop ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/hadoop/target/carbondata-hadoop-1.5.2-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-hadoop/1.5.2-SNAPSHOT/carbondata-hadoop-1.5.2-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/hadoop/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-hadoop/1.5.2-SNAPSHOT/carbondata-hadoop-1.5.2-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Streaming 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-streaming ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/streaming/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-streaming ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/streaming/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-streaming ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-streaming ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/streaming/src/resources
	[INFO] Copying 0 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (default) @ carbondata-streaming ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/streaming/src/main/java:-1: info: compiling
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/streaming/src/main/scala:-1: info: compiling
	[INFO] Compiling 13 source files to /Users/xubo/Desktop/xubo/git/carbondata3/streaming/target/classes at 1547432706246
	[INFO] prepare-compile in 0 s
	[INFO] compile in 4 s
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-streaming ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 11 source files to /Users/xubo/Desktop/xubo/git/carbondata3/streaming/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/streaming/src/main/java/org/apache/carbondata/streaming/segment/StreamSegment.java: /Users/xubo/Desktop/xubo/git/carbondata3/streaming/src/main/java/org/apache/carbondata/streaming/segment/StreamSegment.java uses or overrides a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/streaming/src/main/java/org/apache/carbondata/streaming/segment/StreamSegment.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/streaming/src/main/java/org/apache/carbondata/streaming/CarbonStreamUtils.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/streaming/src/main/java/org/apache/carbondata/streaming/CarbonStreamUtils.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-streaming >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-streaming ---
	[INFO] Fork Value is true
	[INFO] Done FindBugs Analysis....
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-streaming <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-streaming ---
	[INFO] BugInstance size is 0
	[INFO] Error size is 0
	[INFO] No errors/warnings found
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (compile) @ carbondata-streaming ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] Nothing to compile - all classes are up to date
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ carbondata-streaming ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/streaming/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-streaming ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 1 source file to /Users/xubo/Desktop/xubo/git/carbondata3/streaming/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18:test (default-test) @ carbondata-streaming ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:testCompile (testCompile) @ carbondata-streaming ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/streaming/src/test/java:-1: info: compiling
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/streaming/target/generated-test-sources/test-annotations:-1: info: compiling
	[INFO] Compiling 1 source files to /Users/xubo/Desktop/xubo/git/carbondata3/streaming/target/test-classes at 1547432720139
	[INFO] prepare-compile in 0 s
	[INFO] compile in 2 s
	[INFO] 
	[INFO] --- scalatest-maven-plugin:1.0:test (test) @ carbondata-streaming ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-streaming ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata3/streaming/target/carbondata-streaming-1.5.2-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-streaming ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-streaming ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/streaming/target/jacoco-it.exec
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-streaming ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-streaming ---
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/streaming/target/scalastyle-output.xml
	Processed 2 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 797 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-streaming ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-streaming ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-streaming ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/streaming/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-streaming ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/streaming/target/carbondata-streaming-1.5.2-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-streaming/1.5.2-SNAPSHOT/carbondata-streaming-1.5.2-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/streaming/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-streaming/1.5.2-SNAPSHOT/carbondata-streaming-1.5.2-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Store SDK 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-store-sdk ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-store-sdk ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-store-sdk ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-store-sdk ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 1 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-store-sdk ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 16 source files to /Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/src/main/java/org/apache/carbondata/sdk/file/CarbonReaderBuilder.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/src/main/java/org/apache/carbondata/sdk/file/CarbonReaderBuilder.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/src/main/java/org/apache/carbondata/sdk/file/TestUtil.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/src/main/java/org/apache/carbondata/sdk/file/TestUtil.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-store-sdk >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-store-sdk ---
	[INFO] Fork Value is true
	[INFO] Done FindBugs Analysis....
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-store-sdk <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-store-sdk ---
	[INFO] BugInstance size is 0
	[INFO] Error size is 0
	[INFO] No errors/warnings found
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ carbondata-store-sdk ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-store-sdk ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 8 source files to /Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/src/test/java/org/apache/carbondata/sdk/file/ConcurrentSdkReaderTest.java: /Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/src/test/java/org/apache/carbondata/sdk/file/ConcurrentSdkReaderTest.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/src/test/java/org/apache/carbondata/sdk/file/ConcurrentSdkReaderTest.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ carbondata-store-sdk ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-store-sdk ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/target/carbondata-store-sdk-1.5.2-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-store-sdk ---
	[INFO] 
	[INFO] --- maven-shade-plugin:2.4.3:shade (default) @ carbondata-store-sdk ---
	[INFO] Including org.apache.carbondata:carbondata-hadoop:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-processing:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-core:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-format:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.thrift:libthrift:jar:0.9.3 in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-common:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-client:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-mapreduce-client-app:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-mapreduce-client-common:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-yarn-client:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-yarn-server-common:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-mapreduce-client-shuffle:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-yarn-api:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-mapreduce-client-core:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-yarn-common:jar:2.8.3 in the shaded jar.
	[INFO] Including com.sun.jersey:jersey-client:jar:1.9 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-mapreduce-client-jobclient:jar:2.8.3 in the shaded jar.
	[INFO] Including com.github.luben:zstd-jni:jar:1.3.2-2 in the shaded jar.
	[INFO] Including org.roaringbitmap:RoaringBitmap:jar:0.5.11 in the shaded jar.
	[INFO] Including io.netty:netty-all:jar:4.0.42.Final in the shaded jar.
	[INFO] Including org.lz4:lz4-java:jar:1.4.0 in the shaded jar.
	[INFO] Including com.univocity:univocity-parsers:jar:2.2.1 in the shaded jar.
	[INFO] Including org.apache.commons:commons-lang3:jar:3.5 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-hdfs:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-hdfs-client:jar:2.8.3 in the shaded jar.
	[INFO] Including com.squareup.okhttp:okhttp:jar:2.4.0 in the shaded jar.
	[INFO] Including com.squareup.okio:okio:jar:1.4.0 in the shaded jar.
	[INFO] Including commons-daemon:commons-daemon:jar:1.0.13 in the shaded jar.
	[INFO] Including io.netty:netty:jar:3.6.2.Final in the shaded jar.
	[INFO] Including xerces:xercesImpl:jar:2.9.1 in the shaded jar.
	[INFO] Including xml-apis:xml-apis:jar:1.3.04 in the shaded jar.
	[INFO] Including org.fusesource.leveldbjni:leveldbjni-all:jar:1.8 in the shaded jar.
	[INFO] Including org.apache.avro:avro:jar:1.8.1 in the shaded jar.
	[INFO] Including org.codehaus.jackson:jackson-core-asl:jar:1.9.13 in the shaded jar.
	[INFO] Including org.codehaus.jackson:jackson-mapper-asl:jar:1.9.13 in the shaded jar.
	[INFO] Including com.thoughtworks.paranamer:paranamer:jar:2.7 in the shaded jar.
	[INFO] Including org.xerial.snappy:snappy-java:jar:1.1.1.3 in the shaded jar.
	[INFO] Including org.apache.commons:commons-compress:jar:1.8.1 in the shaded jar.
	[INFO] Including org.tukaani:xz:jar:1.5 in the shaded jar.
	[INFO] Including org.slf4j:slf4j-api:jar:1.7.7 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-aws:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-common:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-annotations:jar:2.8.3 in the shaded jar.
	[INFO] Including com.google.guava:guava:jar:11.0.2 in the shaded jar.
	[INFO] Including commons-cli:commons-cli:jar:1.2 in the shaded jar.
	[INFO] Including org.apache.commons:commons-math3:jar:3.1.1 in the shaded jar.
	[INFO] Including xmlenc:xmlenc:jar:0.52 in the shaded jar.
	[INFO] Including commons-io:commons-io:jar:2.4 in the shaded jar.
	[INFO] Including commons-net:commons-net:jar:3.1 in the shaded jar.
	[INFO] Including commons-collections:commons-collections:jar:3.2.2 in the shaded jar.
	[INFO] Including org.mortbay.jetty:jetty:jar:6.1.26 in the shaded jar.
	[INFO] Including org.mortbay.jetty:jetty-util:jar:6.1.26 in the shaded jar.
	[INFO] Including org.mortbay.jetty:jetty-sslengine:jar:6.1.26 in the shaded jar.
	[INFO] Including com.sun.jersey:jersey-core:jar:1.9 in the shaded jar.
	[INFO] Including com.sun.jersey:jersey-json:jar:1.9 in the shaded jar.
	[INFO] Including org.codehaus.jettison:jettison:jar:1.1 in the shaded jar.
	[INFO] Including com.sun.xml.bind:jaxb-impl:jar:2.2.3-1 in the shaded jar.
	[INFO] Including javax.xml.bind:jaxb-api:jar:2.2.2 in the shaded jar.
	[INFO] Including javax.xml.stream:stax-api:jar:1.0-2 in the shaded jar.
	[INFO] Including javax.activation:activation:jar:1.1 in the shaded jar.
	[INFO] Including org.codehaus.jackson:jackson-jaxrs:jar:1.8.3 in the shaded jar.
	[INFO] Including org.codehaus.jackson:jackson-xc:jar:1.8.3 in the shaded jar.
	[INFO] Including com.sun.jersey:jersey-server:jar:1.9 in the shaded jar.
	[INFO] Including asm:asm:jar:3.1 in the shaded jar.
	[INFO] Including log4j:log4j:jar:1.2.17 in the shaded jar.
	[INFO] Including net.java.dev.jets3t:jets3t:jar:0.9.0 in the shaded jar.
	[INFO] Including com.jamesmurty.utils:java-xmlbuilder:jar:0.4 in the shaded jar.
	[INFO] Including commons-lang:commons-lang:jar:2.6 in the shaded jar.
	[INFO] Including commons-configuration:commons-configuration:jar:1.6 in the shaded jar.
	[INFO] Including commons-digester:commons-digester:jar:1.8 in the shaded jar.
	[INFO] Including commons-beanutils:commons-beanutils:jar:1.7.0 in the shaded jar.
	[INFO] Including commons-beanutils:commons-beanutils-core:jar:1.8.0 in the shaded jar.
	[INFO] Including org.slf4j:slf4j-log4j12:jar:1.7.10 in the shaded jar.
	[INFO] Including com.google.protobuf:protobuf-java:jar:2.5.0 in the shaded jar.
	[INFO] Including com.google.code.gson:gson:jar:2.2.4 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-auth:jar:2.8.3 in the shaded jar.
	[INFO] Including com.nimbusds:nimbus-jose-jwt:jar:3.9 in the shaded jar.
	[INFO] Including net.jcip:jcip-annotations:jar:1.0 in the shaded jar.
	[INFO] Including net.minidev:json-smart:jar:1.1.1 in the shaded jar.
	[INFO] Including org.apache.directory.server:apacheds-kerberos-codec:jar:2.0.0-M15 in the shaded jar.
	[INFO] Including org.apache.directory.server:apacheds-i18n:jar:2.0.0-M15 in the shaded jar.
	[INFO] Including org.apache.directory.api:api-asn1-api:jar:1.0.0-M20 in the shaded jar.
	[INFO] Including org.apache.directory.api:api-util:jar:1.0.0-M20 in the shaded jar.
	[INFO] Including org.apache.curator:curator-framework:jar:2.7.1 in the shaded jar.
	[INFO] Including com.jcraft:jsch:jar:0.1.54 in the shaded jar.
	[INFO] Including org.apache.curator:curator-client:jar:2.7.1 in the shaded jar.
	[INFO] Including org.apache.curator:curator-recipes:jar:2.7.1 in the shaded jar.
	[INFO] Including com.google.code.findbugs:jsr305:jar:3.0.0 in the shaded jar.
	[INFO] Including org.apache.htrace:htrace-core4:jar:4.0.1-incubating in the shaded jar.
	[INFO] Including org.apache.zookeeper:zookeeper:jar:3.4.6 in the shaded jar.
	[INFO] Including com.amazonaws:aws-java-sdk-s3:jar:1.10.6 in the shaded jar.
	[INFO] Including com.amazonaws:aws-java-sdk-kms:jar:1.10.6 in the shaded jar.
	[INFO] Including com.amazonaws:aws-java-sdk-core:jar:1.10.6 in the shaded jar.
	[INFO] Including com.fasterxml.jackson.core:jackson-core:jar:2.2.3 in the shaded jar.
	[INFO] Including com.fasterxml.jackson.core:jackson-databind:jar:2.2.3 in the shaded jar.
	[INFO] Including com.fasterxml.jackson.core:jackson-annotations:jar:2.2.3 in the shaded jar.
	[INFO] Including joda-time:joda-time:jar:2.9.4 in the shaded jar.
	[INFO] Including org.apache.httpcomponents:httpclient:jar:4.5.2 in the shaded jar.
	[INFO] Including org.apache.httpcomponents:httpcore:jar:4.4.4 in the shaded jar.
	[INFO] Including commons-logging:commons-logging:jar:1.2 in the shaded jar.
	[INFO] Including commons-codec:commons-codec:jar:1.9 in the shaded jar.
	[WARNING] commons-beanutils-core-1.8.0.jar, commons-collections-3.2.2.jar, commons-beanutils-1.7.0.jar define 10 overlapping classes: 
	[WARNING]   - org.apache.commons.collections.FastHashMap$EntrySet
	[WARNING]   - org.apache.commons.collections.FastHashMap$KeySet
	[WARNING]   - org.apache.commons.collections.FastHashMap$CollectionView$CollectionViewIterator
	[WARNING]   - org.apache.commons.collections.ArrayStack
	[WARNING]   - org.apache.commons.collections.FastHashMap$Values
	[WARNING]   - org.apache.commons.collections.FastHashMap$CollectionView
	[WARNING]   - org.apache.commons.collections.FastHashMap$1
	[WARNING]   - org.apache.commons.collections.Buffer
	[WARNING]   - org.apache.commons.collections.FastHashMap
	[WARNING]   - org.apache.commons.collections.BufferUnderflowException
	[WARNING] commons-beanutils-core-1.8.0.jar, commons-beanutils-1.7.0.jar define 82 overlapping classes: 
	[WARNING]   - org.apache.commons.beanutils.ConvertUtilsBean
	[WARNING]   - org.apache.commons.beanutils.converters.SqlTimeConverter
	[WARNING]   - org.apache.commons.beanutils.Converter
	[WARNING]   - org.apache.commons.beanutils.converters.FloatArrayConverter
	[WARNING]   - org.apache.commons.beanutils.NestedNullException
	[WARNING]   - org.apache.commons.beanutils.ConvertingWrapDynaBean
	[WARNING]   - org.apache.commons.beanutils.converters.LongArrayConverter
	[WARNING]   - org.apache.commons.beanutils.converters.SqlDateConverter
	[WARNING]   - org.apache.commons.beanutils.converters.BooleanArrayConverter
	[WARNING]   - org.apache.commons.beanutils.converters.StringConverter
	[WARNING]   - 72 more...
	[WARNING] maven-shade-plugin has detected that some class files are
	[WARNING] present in two or more JARs. When this happens, only one
	[WARNING] single version of the class is copied to the uber jar.
	[WARNING] Usually this is not harmful and you can skip these warnings,
	[WARNING] otherwise try to manually exclude artifacts based on
	[WARNING] mvn dependency:tree -Ddetail=true and the above output.
	[WARNING] See http://maven.apache.org/plugins/maven-shade-plugin/
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-store-sdk ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/target/jacoco-it.exec
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-store-sdk ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-store-sdk ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 1 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-store-sdk ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-store-sdk ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-store-sdk ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-store-sdk ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/target/carbondata-store-sdk-1.5.2-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-store-sdk/1.5.2-SNAPSHOT/carbondata-store-sdk-1.5.2-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/store/sdk/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-store-sdk/1.5.2-SNAPSHOT/carbondata-store-sdk-1.5.2-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Spark Datasource 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-spark-datasource ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-spark-datasource ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/target/jacoco.exec,append=true
	[INFO] 
	[INFO] --- build-helper-maven-plugin:3.0.0:add-source (add-source) @ carbondata-spark-datasource ---
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/src/main/spark2.3plus added.
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-spark-datasource ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-spark-datasource ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 1 resource
	[INFO] Copying 0 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (default) @ carbondata-spark-datasource ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/src/main/spark2.3plus:-1: info: compiling
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/src/main/scala:-1: info: compiling
	[INFO] Compiling 16 source files to /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/target/classes at 1547432742618
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/src/main/scala/org/apache/spark/sql/carbondata/execution/datasources/SparkCarbonFileFormat.scala:500: warning: non-variable type argument String in type scala.collection.immutable.Map[String,String] (the underlying of Map[String,String]) is unchecked since it is eliminated by erasure
	[INFO]         if (taskCommits.exists(_.obj.isInstanceOf[Map[String, String]])) {
	[INFO]                                                  ^
	[WARNING] one warning found
	[INFO] prepare-compile in 0 s
	[INFO] compile in 8 s
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-spark-datasource ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 7 source files to /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/target/classes
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-spark-datasource >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-spark-datasource ---
	[INFO] Fork Value is true
	[INFO] Done FindBugs Analysis....
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-spark-datasource <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-spark-datasource ---
	[INFO] BugInstance size is 0
	[INFO] Error size is 0
	[INFO] No errors/warnings found
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (compile) @ carbondata-spark-datasource ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] Nothing to compile - all classes are up to date
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ carbondata-spark-datasource ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 4 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-spark-datasource ---
	[INFO] Nothing to compile - all classes are up to date
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18:test (default-test) @ carbondata-spark-datasource ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:testCompile (testCompile) @ carbondata-spark-datasource ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/src/test/scala:-1: info: compiling
	[INFO] Compiling 3 source files to /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/target/test-classes at 1547432763620
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/src/test/scala/org/apache/spark/sql/carbondata/datasource/SparkCarbonDataSourceTest.scala:1017: warning: This catches all Throwables. If this is really intended, use `case _ : Throwable` to clear this warning.
	[INFO]       case _ => None
	[INFO]            ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/src/test/scala/org/apache/spark/sql/carbondata/datasource/SparkCarbonDataSourceTest.scala:1102: warning: This catches all Throwables. If this is really intended, use `case _ : Throwable` to clear this warning.
	[INFO]       case _ => None
	[INFO]            ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/src/test/scala/org/apache/spark/sql/carbondata/datasource/SparkCarbonDataSourceTest.scala:1149: warning: This catches all Throwables. If this is really intended, use `case _ : Throwable` to clear this warning.
	[INFO]       case _ => None
	[INFO]            ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/src/test/scala/org/apache/spark/sql/carbondata/datasource/SparkCarbonDataSourceTest.scala:1237: warning: This catches all Throwables. If this is really intended, use `case _ : Throwable` to clear this warning.
	[INFO]       case _ => None
	[INFO]            ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/src/test/scala/org/apache/spark/sql/carbondata/datasource/TestCreateTableUsingSparkCarbonFileFormat.scala:375: warning: A try without a catch or finally is equivalent to putting its body in a block; no exceptions are handled.
	[INFO]     try{
	[INFO]     ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/src/test/scala/org/apache/spark/sql/carbondata/datasource/TestUtil.scala:123: warning: enclosing method checkAnswer has result type Unit: return value discarded
	[ERROR]         return Some(errorMessage)
	[INFO]         ^
	[WARNING] warning: there were three deprecation warnings; re-run with -deprecation for details
	[WARNING] 7 warnings found
	[INFO] prepare-compile in 0 s
	[INFO] compile in 12 s
	[INFO] 
	[INFO] --- scalatest-maven-plugin:1.0:test (test) @ carbondata-spark-datasource ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-spark-datasource ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/target/carbondata-spark-datasource-1.5.2-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-spark-datasource ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-spark-datasource ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/target/jacoco-it.exec,append=true
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-spark-datasource ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-spark-datasource ---
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/target/scalastyle-output.xml
	Processed 9 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 517 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-spark-datasource ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-spark-datasource ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-spark-datasource ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-spark-datasource ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/target/carbondata-spark-datasource-1.5.2-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-spark-datasource/1.5.2-SNAPSHOT/carbondata-spark-datasource-1.5.2-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-datasource/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-spark-datasource/1.5.2-SNAPSHOT/carbondata-spark-datasource-1.5.2-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Spark Common 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-spark-common ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-spark-common ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/target/jacoco.exec,append=true
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-spark-common ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-spark-common ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/src/resources
	[INFO] Copying 0 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (default) @ carbondata-spark-common ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/src/main/java:-1: info: compiling
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/src/main/scala:-1: info: compiling
	[INFO] Compiling 92 source files to /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/target/classes at 1547432778821
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/src/main/scala/org/apache/spark/rdd/DataLoadPartitionCoalescer.scala:190: warning: match may not be exhaustive.
	[INFO] It would fail on the following input: None
	[INFO]           partitionIdMapHosts.get(partitionId) match {
	[INFO]                                  ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/src/main/scala/org/apache/spark/sql/catalyst/CarbonDDLSqlParser.scala:1219: warning: patterns after a variable pattern cannot match (SLS 8.1.1)
	[INFO]       case optValue => optValue
	[INFO]            ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/src/main/scala/org/apache/spark/sql/catalyst/CarbonDDLSqlParser.scala:1220: warning: unreachable code due to variable pattern 'optValue' on line 1219
	[INFO]       case _ => ""
	[INFO]                 ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/src/main/scala/org/apache/spark/sql/catalyst/CarbonDDLSqlParser.scala:1220: warning: unreachable code
	[INFO]       case _ => ""
	[INFO]                 ^
	[WARNING] warning: there were 30 deprecation warnings; re-run with -deprecation for details
	[WARNING] warning: there were four feature warnings; re-run with -feature for details
	[WARNING] 6 warnings found
	[INFO] prepare-compile in 0 s
	[INFO] compile in 24 s
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-spark-common ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 10 source files to /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/target/classes
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-spark-common >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-spark-common ---
	[INFO] Fork Value is true
	[INFO] Done FindBugs Analysis....
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-spark-common <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-spark-common ---
	[INFO] BugInstance size is 0
	[INFO] Error size is 0
	[INFO] No errors/warnings found
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (compile) @ carbondata-spark-common ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] Nothing to compile - all classes are up to date
	[INFO] 
	[INFO] --- maven-dependency-plugin:3.0.0:copy (compile) @ carbondata-spark-common ---
	[INFO] Configured Artifact: org.apache.carbondata:carbondata-format:1.5.2-SNAPSHOT:jar
	[INFO] Configured Artifact: com.google.code.gson:gson:2.4:jar
	[INFO] Configured Artifact: org.xerial.snappy:snappy-java:1.1.2.6:jar
	[INFO] Copying carbondata-format-1.5.2-SNAPSHOT.jar to /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/target/jars/carbondata-format-1.5.2-SNAPSHOT.jar
	[INFO] Copying gson-2.4.jar to /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/target/jars/gson-2.4.jar
	[INFO] Copying snappy-java-1.1.2.6.jar to /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/target/jars/snappy-java-1.1.2.6.jar
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ carbondata-spark-common ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-spark-common ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18:test (default-test) @ carbondata-spark-common ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:testCompile (testCompile) @ carbondata-spark-common ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/src/test/scala:-1: info: compiling
	[INFO] Compiling 1 source files to /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/target/test-classes at 1547432835112
	[INFO] prepare-compile in 0 s
	[INFO] compile in 4 s
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-spark-common ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/target/carbondata-spark-common-1.5.2-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-spark-common ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-spark-common ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/target/jacoco-it.exec,append=true
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-spark-common ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-spark-common ---
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/target/scalastyle-output.xml
	Processed 82 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 1779 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-spark-common ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-spark-common ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-spark-common ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-spark-common ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/target/carbondata-spark-common-1.5.2-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-spark-common/1.5.2-SNAPSHOT/carbondata-spark-common-1.5.2-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-spark-common/1.5.2-SNAPSHOT/carbondata-spark-common-1.5.2-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: CLI 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-cli ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/tools/cli/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-cli ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/tools/cli/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-cli ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-cli ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/tools/cli/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-cli ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 8 source files to /Users/xubo/Desktop/xubo/git/carbondata3/tools/cli/target/classes
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-cli >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-cli ---
	[INFO] Fork Value is true
	[INFO] Done FindBugs Analysis....
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-cli <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-cli ---
	[INFO] BugInstance size is 0
	[INFO] Error size is 0
	[INFO] No errors/warnings found
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ carbondata-cli ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/tools/cli/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-cli ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 1 source file to /Users/xubo/Desktop/xubo/git/carbondata3/tools/cli/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ carbondata-cli ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-cli ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata3/tools/cli/target/carbondata-cli-1.5.2-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-cli ---
	[INFO] 
	[INFO] --- maven-shade-plugin:3.1.1:shade (default) @ carbondata-cli ---
	[INFO] Including org.apache.carbondata:carbondata-store-sdk:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-hadoop:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-processing:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-core:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-format:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.thrift:libthrift:jar:0.9.3 in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-common:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-client:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-mapreduce-client-app:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-mapreduce-client-common:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-yarn-client:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-yarn-server-common:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-mapreduce-client-shuffle:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-yarn-api:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-mapreduce-client-core:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-yarn-common:jar:2.8.3 in the shaded jar.
	[INFO] Including com.sun.jersey:jersey-client:jar:1.9 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-mapreduce-client-jobclient:jar:2.8.3 in the shaded jar.
	[INFO] Including com.github.luben:zstd-jni:jar:1.3.2-2 in the shaded jar.
	[INFO] Including org.roaringbitmap:RoaringBitmap:jar:0.5.11 in the shaded jar.
	[INFO] Including io.netty:netty-all:jar:4.0.42.Final in the shaded jar.
	[INFO] Including org.lz4:lz4-java:jar:1.4.0 in the shaded jar.
	[INFO] Including com.univocity:univocity-parsers:jar:2.2.1 in the shaded jar.
	[INFO] Including org.apache.commons:commons-lang3:jar:3.5 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-hdfs:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-hdfs-client:jar:2.8.3 in the shaded jar.
	[INFO] Including com.squareup.okhttp:okhttp:jar:2.4.0 in the shaded jar.
	[INFO] Including com.squareup.okio:okio:jar:1.4.0 in the shaded jar.
	[INFO] Including commons-daemon:commons-daemon:jar:1.0.13 in the shaded jar.
	[INFO] Including io.netty:netty:jar:3.6.2.Final in the shaded jar.
	[INFO] Including xerces:xercesImpl:jar:2.9.1 in the shaded jar.
	[INFO] Including xml-apis:xml-apis:jar:1.3.04 in the shaded jar.
	[INFO] Including org.fusesource.leveldbjni:leveldbjni-all:jar:1.8 in the shaded jar.
	[INFO] Including org.apache.avro:avro:jar:1.8.1 in the shaded jar.
	[INFO] Including org.codehaus.jackson:jackson-core-asl:jar:1.9.13 in the shaded jar.
	[INFO] Including org.codehaus.jackson:jackson-mapper-asl:jar:1.9.13 in the shaded jar.
	[INFO] Including com.thoughtworks.paranamer:paranamer:jar:2.7 in the shaded jar.
	[INFO] Including org.xerial.snappy:snappy-java:jar:1.1.1.3 in the shaded jar.
	[INFO] Including org.apache.commons:commons-compress:jar:1.8.1 in the shaded jar.
	[INFO] Including org.tukaani:xz:jar:1.5 in the shaded jar.
	[INFO] Including org.slf4j:slf4j-api:jar:1.7.7 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-aws:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-common:jar:2.8.3 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-annotations:jar:2.8.3 in the shaded jar.
	[INFO] Including com.google.guava:guava:jar:11.0.2 in the shaded jar.
	[INFO] Including commons-cli:commons-cli:jar:1.2 in the shaded jar.
	[INFO] Including org.apache.commons:commons-math3:jar:3.1.1 in the shaded jar.
	[INFO] Including xmlenc:xmlenc:jar:0.52 in the shaded jar.
	[INFO] Including commons-io:commons-io:jar:2.4 in the shaded jar.
	[INFO] Including commons-net:commons-net:jar:3.1 in the shaded jar.
	[INFO] Including commons-collections:commons-collections:jar:3.2.2 in the shaded jar.
	[INFO] Including org.mortbay.jetty:jetty:jar:6.1.26 in the shaded jar.
	[INFO] Including org.mortbay.jetty:jetty-util:jar:6.1.26 in the shaded jar.
	[INFO] Including org.mortbay.jetty:jetty-sslengine:jar:6.1.26 in the shaded jar.
	[INFO] Including com.sun.jersey:jersey-core:jar:1.9 in the shaded jar.
	[INFO] Including com.sun.jersey:jersey-json:jar:1.9 in the shaded jar.
	[INFO] Including org.codehaus.jettison:jettison:jar:1.1 in the shaded jar.
	[INFO] Including com.sun.xml.bind:jaxb-impl:jar:2.2.3-1 in the shaded jar.
	[INFO] Including javax.xml.bind:jaxb-api:jar:2.2.2 in the shaded jar.
	[INFO] Including javax.xml.stream:stax-api:jar:1.0-2 in the shaded jar.
	[INFO] Including javax.activation:activation:jar:1.1 in the shaded jar.
	[INFO] Including org.codehaus.jackson:jackson-jaxrs:jar:1.8.3 in the shaded jar.
	[INFO] Including org.codehaus.jackson:jackson-xc:jar:1.8.3 in the shaded jar.
	[INFO] Including com.sun.jersey:jersey-server:jar:1.9 in the shaded jar.
	[INFO] Including asm:asm:jar:3.1 in the shaded jar.
	[INFO] Including log4j:log4j:jar:1.2.17 in the shaded jar.
	[INFO] Including net.java.dev.jets3t:jets3t:jar:0.9.0 in the shaded jar.
	[INFO] Including com.jamesmurty.utils:java-xmlbuilder:jar:0.4 in the shaded jar.
	[INFO] Including commons-lang:commons-lang:jar:2.6 in the shaded jar.
	[INFO] Including commons-configuration:commons-configuration:jar:1.6 in the shaded jar.
	[INFO] Including commons-digester:commons-digester:jar:1.8 in the shaded jar.
	[INFO] Including commons-beanutils:commons-beanutils:jar:1.7.0 in the shaded jar.
	[INFO] Including commons-beanutils:commons-beanutils-core:jar:1.8.0 in the shaded jar.
	[INFO] Including org.slf4j:slf4j-log4j12:jar:1.7.10 in the shaded jar.
	[INFO] Including com.google.protobuf:protobuf-java:jar:2.5.0 in the shaded jar.
	[INFO] Including com.google.code.gson:gson:jar:2.2.4 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-auth:jar:2.8.3 in the shaded jar.
	[INFO] Including com.nimbusds:nimbus-jose-jwt:jar:3.9 in the shaded jar.
	[INFO] Including net.jcip:jcip-annotations:jar:1.0 in the shaded jar.
	[INFO] Including net.minidev:json-smart:jar:1.1.1 in the shaded jar.
	[INFO] Including org.apache.directory.server:apacheds-kerberos-codec:jar:2.0.0-M15 in the shaded jar.
	[INFO] Including org.apache.directory.server:apacheds-i18n:jar:2.0.0-M15 in the shaded jar.
	[INFO] Including org.apache.directory.api:api-asn1-api:jar:1.0.0-M20 in the shaded jar.
	[INFO] Including org.apache.directory.api:api-util:jar:1.0.0-M20 in the shaded jar.
	[INFO] Including org.apache.curator:curator-framework:jar:2.7.1 in the shaded jar.
	[INFO] Including com.jcraft:jsch:jar:0.1.54 in the shaded jar.
	[INFO] Including org.apache.curator:curator-client:jar:2.7.1 in the shaded jar.
	[INFO] Including org.apache.curator:curator-recipes:jar:2.7.1 in the shaded jar.
	[INFO] Including com.google.code.findbugs:jsr305:jar:3.0.0 in the shaded jar.
	[INFO] Including org.apache.htrace:htrace-core4:jar:4.0.1-incubating in the shaded jar.
	[INFO] Including org.apache.zookeeper:zookeeper:jar:3.4.6 in the shaded jar.
	[INFO] Including com.amazonaws:aws-java-sdk-s3:jar:1.10.6 in the shaded jar.
	[INFO] Including com.amazonaws:aws-java-sdk-kms:jar:1.10.6 in the shaded jar.
	[INFO] Including com.amazonaws:aws-java-sdk-core:jar:1.10.6 in the shaded jar.
	[INFO] Including com.fasterxml.jackson.core:jackson-core:jar:2.2.3 in the shaded jar.
	[INFO] Including com.fasterxml.jackson.core:jackson-databind:jar:2.2.3 in the shaded jar.
	[INFO] Including com.fasterxml.jackson.core:jackson-annotations:jar:2.2.3 in the shaded jar.
	[INFO] Including joda-time:joda-time:jar:2.9.4 in the shaded jar.
	[INFO] Including org.apache.httpcomponents:httpclient:jar:4.5.2 in the shaded jar.
	[INFO] Including org.apache.httpcomponents:httpcore:jar:4.4.4 in the shaded jar.
	[INFO] Including commons-logging:commons-logging:jar:1.2 in the shaded jar.
	[INFO] Including commons-codec:commons-codec:jar:1.9 in the shaded jar.
	[INFO] Including org.scala-lang:scala-library:jar:2.11.8 in the shaded jar.
	[INFO] Including org.scala-lang:scala-reflect:jar:2.11.8 in the shaded jar.
	[WARNING] commons-beanutils-core-1.8.0.jar, commons-collections-3.2.2.jar, commons-beanutils-1.7.0.jar define 10 overlapping classes: 
	[WARNING]   - org.apache.commons.collections.FastHashMap$EntrySet
	[WARNING]   - org.apache.commons.collections.FastHashMap$KeySet
	[WARNING]   - org.apache.commons.collections.FastHashMap$CollectionView$CollectionViewIterator
	[WARNING]   - org.apache.commons.collections.ArrayStack
	[WARNING]   - org.apache.commons.collections.FastHashMap$Values
	[WARNING]   - org.apache.commons.collections.FastHashMap$CollectionView
	[WARNING]   - org.apache.commons.collections.FastHashMap$1
	[WARNING]   - org.apache.commons.collections.Buffer
	[WARNING]   - org.apache.commons.collections.FastHashMap
	[WARNING]   - org.apache.commons.collections.BufferUnderflowException
	[WARNING] commons-beanutils-core-1.8.0.jar, commons-beanutils-1.7.0.jar define 82 overlapping classes: 
	[WARNING]   - org.apache.commons.beanutils.ConvertUtilsBean
	[WARNING]   - org.apache.commons.beanutils.converters.SqlTimeConverter
	[WARNING]   - org.apache.commons.beanutils.Converter
	[WARNING]   - org.apache.commons.beanutils.converters.FloatArrayConverter
	[WARNING]   - org.apache.commons.beanutils.NestedNullException
	[WARNING]   - org.apache.commons.beanutils.ConvertingWrapDynaBean
	[WARNING]   - org.apache.commons.beanutils.converters.LongArrayConverter
	[WARNING]   - org.apache.commons.beanutils.converters.SqlDateConverter
	[WARNING]   - org.apache.commons.beanutils.converters.BooleanArrayConverter
	[WARNING]   - org.apache.commons.beanutils.converters.StringConverter
	[WARNING]   - 72 more...
	[WARNING] maven-shade-plugin has detected that some class files are
	[WARNING] present in two or more JARs. When this happens, only one
	[WARNING] single version of the class is copied to the uber jar.
	[WARNING] Usually this is not harmful and you can skip these warnings,
	[WARNING] otherwise try to manually exclude artifacts based on
	[WARNING] mvn dependency:tree -Ddetail=true and the above output.
	[WARNING] See http://maven.apache.org/plugins/maven-shade-plugin/
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-cli ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/tools/cli/target/jacoco-it.exec
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-cli ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-cli ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata3/tools/cli/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/tools/cli/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 1 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-cli ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-cli ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-cli ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/tools/cli/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-cli ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/tools/cli/target/carbondata-cli-1.5.2-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-cli/1.5.2-SNAPSHOT/carbondata-cli-1.5.2-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/tools/cli/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-cli/1.5.2-SNAPSHOT/carbondata-cli-1.5.2-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Lucene Index DataMap 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-lucene ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/datamap/lucene/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-lucene ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/datamap/lucene/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-lucene ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-lucene ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/datamap/lucene/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (default) @ carbondata-lucene ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/datamap/lucene/src/main/java:-1: info: compiling
	[INFO] Compiling 6 source files to /Users/xubo/Desktop/xubo/git/carbondata3/datamap/lucene/target/classes at 1547432860794
	[INFO] prepare-compile in 0 s
	[INFO] compile in 1 s
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-lucene ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 6 source files to /Users/xubo/Desktop/xubo/git/carbondata3/datamap/lucene/target/classes
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-lucene >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-lucene ---
	[INFO] Fork Value is true
	[INFO] Done FindBugs Analysis....
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-lucene <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-lucene ---
	[INFO] BugInstance size is 0
	[INFO] Error size is 0
	[INFO] No errors/warnings found
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (compile) @ carbondata-lucene ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] Nothing to compile - all classes are up to date
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ carbondata-lucene ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/datamap/lucene/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-lucene ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ carbondata-lucene ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:testCompile (testCompile) @ carbondata-lucene ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[WARNING] No source files found.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-lucene ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata3/datamap/lucene/target/carbondata-lucene-1.5.2-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-lucene ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-lucene ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/datamap/lucene/target/jacoco-it.exec
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-lucene ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-lucene ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata3/datamap/lucene/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/datamap/lucene/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 0 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-lucene ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-lucene ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-lucene ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/datamap/lucene/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-lucene ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/datamap/lucene/target/carbondata-lucene-1.5.2-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-lucene/1.5.2-SNAPSHOT/carbondata-lucene-1.5.2-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/datamap/lucene/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-lucene/1.5.2-SNAPSHOT/carbondata-lucene-1.5.2-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Bloom Index DataMap 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-bloom ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/datamap/bloom/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-bloom ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/datamap/bloom/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-bloom ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-bloom ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/datamap/bloom/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (default) @ carbondata-bloom ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/datamap/bloom/src/main/java:-1: info: compiling
	[INFO] Compiling 12 source files to /Users/xubo/Desktop/xubo/git/carbondata3/datamap/bloom/target/classes at 1547432869050
	[INFO] prepare-compile in 0 s
	[INFO] compile in 2 s
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-bloom ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 12 source files to /Users/xubo/Desktop/xubo/git/carbondata3/datamap/bloom/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/datamap/bloom/src/main/java/org/apache/carbondata/datamap/bloom/BloomCoarseGrainDataMap.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/datamap/bloom/src/main/java/org/apache/carbondata/datamap/bloom/BloomCoarseGrainDataMap.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-bloom >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-bloom ---
	[INFO] Fork Value is true
	[INFO] Done FindBugs Analysis....
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-bloom <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-bloom ---
	[INFO] BugInstance size is 0
	[INFO] Error size is 0
	[INFO] No errors/warnings found
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (compile) @ carbondata-bloom ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] Nothing to compile - all classes are up to date
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ carbondata-bloom ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/datamap/bloom/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-bloom ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ carbondata-bloom ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:testCompile (testCompile) @ carbondata-bloom ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[WARNING] No source files found.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-bloom ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata3/datamap/bloom/target/carbondata-bloom-1.5.2-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-bloom ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-bloom ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/datamap/bloom/target/jacoco-it.exec
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-bloom ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-bloom ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata3/datamap/bloom/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/datamap/bloom/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 0 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-bloom ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-bloom ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-bloom ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/datamap/bloom/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-bloom ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/datamap/bloom/target/carbondata-bloom-1.5.2-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-bloom/1.5.2-SNAPSHOT/carbondata-bloom-1.5.2-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/datamap/bloom/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-bloom/1.5.2-SNAPSHOT/carbondata-bloom-1.5.2-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Spark2 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-spark2 ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-spark2 ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/target/jacoco.exec,append=true
	[INFO] 
	[INFO] --- build-helper-maven-plugin:3.0.0:add-source (add-source) @ carbondata-spark2 ---
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/src/main/spark2.3 added.
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/src/main/commonTo2.2And2.3 added.
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-spark2 ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-spark2 ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 2 resources
	[INFO] Copying 0 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (default) @ carbondata-spark2 ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/src/main/java:-1: info: compiling
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/src/main/spark2.3:-1: info: compiling
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/src/main/commonTo2.2And2.3:-1: info: compiling
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/src/main/scala:-1: info: compiling
	[INFO] Compiling 124 source files to /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/target/classes at 1547432881340
	[WARNING] warning: there were 8 deprecation warnings; re-run with -deprecation for details
	[WARNING] warning: there were three feature warnings; re-run with -feature for details
	[WARNING] two warnings found
	[INFO] prepare-compile in 0 s
	[INFO] compile in 30 s
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-spark2 ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 6 source files to /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/src/main/java/org/apache/carbondata/datamap/TimeseriesDataMapProvider.java: /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/src/main/java/org/apache/carbondata/datamap/TimeseriesDataMapProvider.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/src/main/java/org/apache/carbondata/datamap/TimeseriesDataMapProvider.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-spark2 >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-spark2 ---
	[INFO] Fork Value is true
	[INFO] Done FindBugs Analysis....
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-spark2 <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-spark2 ---
	[INFO] BugInstance size is 0
	[INFO] Error size is 0
	[INFO] No errors/warnings found
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (compile) @ carbondata-spark2 ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] Nothing to compile - all classes are up to date
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ carbondata-spark2 ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 6 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-spark2 ---
	[INFO] Nothing to compile - all classes are up to date
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18:test (default-test) @ carbondata-spark2 ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:testCompile (testCompile) @ carbondata-spark2 ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/src/test/scala:-1: info: compiling
	[INFO] Compiling 43 source files to /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/target/test-classes at 1547432960451
	[WARNING] warning: there were 26 deprecation warnings; re-run with -deprecation for details
	[WARNING] one warning found
	[INFO] prepare-compile in 0 s
	[INFO] compile in 21 s
	[INFO] 
	[INFO] --- scalatest-maven-plugin:1.0:test (test) @ carbondata-spark2 ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-spark2 ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/target/carbondata-spark2-1.5.2-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-spark2 ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-spark2 ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/target/jacoco-it.exec,append=true
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-spark2 ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-spark2 ---
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/target/scalastyle-output.xml
	Processed 106 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 2403 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-spark2 ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-spark2 ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-spark2 ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-spark2 ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/target/carbondata-spark2-1.5.2-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-spark2/1.5.2-SNAPSHOT/carbondata-spark2-1.5.2-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark2/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-spark2/1.5.2-SNAPSHOT/carbondata-spark2-1.5.2-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Spark Common Test 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-spark-common-test ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-spark-common-test ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/target/jacoco.exec,append=true
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-spark-common-test ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-spark-common-test ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/resources
	[INFO] Copying 0 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (default) @ carbondata-spark-common-test ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[WARNING] No source files found.
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-spark-common-test ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-spark-common-test >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-spark-common-test ---
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-spark-common-test <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-spark-common-test ---
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (compile) @ carbondata-spark-common-test ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[WARNING] No source files found.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ carbondata-spark-common-test ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] Copying 272 resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-dependency-plugin:2.8:copy (jacoco-dependency-ant) @ carbondata-spark-common-test ---
	[INFO] Configured Artifact: org.jacoco:org.jacoco.ant:0.7.9:jar
	[INFO] Copying org.jacoco.ant-0.7.9.jar to /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/target/jacoco-jars/org.jacoco.ant.jar
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-spark-common-test ---
	[INFO] Nothing to compile - all classes are up to date
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18:test (default-test) @ carbondata-spark-common-test ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:testCompile (testCompile) @ carbondata-spark-common-test ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/scala:-1: info: compiling
	[INFO] Compiling 214 source files to /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/target/test-classes at 1547432990437
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/scala/org/apache/carbondata/integration/spark/testsuite/preaggregate/TestPreAggCreateCommand.scala:551: warning: fruitless type test: a value of type org.apache.spark.sql.hive.CarbonRelation cannot also be a org.apache.spark.sql.CarbonDatasourceHadoopRelation
	[INFO]         if (ca.isInstanceOf[CarbonDatasourceHadoopRelation]) {
	[INFO]                            ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/scala/org/apache/carbondata/integration/spark/testsuite/preaggregate/TestPreAggregateExpressions.scala:144: warning: fruitless type test: a value of type org.apache.spark.sql.hive.CarbonRelation cannot also be a org.apache.spark.sql.CarbonDatasourceHadoopRelation
	[INFO]         if (ca.isInstanceOf[CarbonDatasourceHadoopRelation]) {
	[INFO]                            ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/scala/org/apache/carbondata/integration/spark/testsuite/preaggregate/TestPreAggregateTableSelection.scala:225: warning: fruitless type test: a value of type org.apache.spark.sql.hive.CarbonRelation cannot also be a org.apache.spark.sql.CarbonDatasourceHadoopRelation
	[INFO]         if (ca.isInstanceOf[CarbonDatasourceHadoopRelation]) {
	[INFO]                            ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/scala/org/apache/carbondata/integration/spark/testsuite/timeseries/TestTimeSeriesMatchStrategySuite.scala:372: warning: fruitless type test: a value of type org.apache.spark.sql.hive.CarbonRelation cannot also be a org.apache.spark.sql.CarbonDatasourceHadoopRelation
	[INFO]         if (ca.isInstanceOf[CarbonDatasourceHadoopRelation]) {
	[INFO]                            ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/scala/org/apache/carbondata/integration/spark/testsuite/timeseries/TestTimeseriesTableSelection.scala:853: warning: fruitless type test: a value of type org.apache.spark.sql.hive.CarbonRelation cannot also be a org.apache.spark.sql.CarbonDatasourceHadoopRelation
	[INFO]         if (ca.isInstanceOf[CarbonDatasourceHadoopRelation]) {
	[INFO]                            ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/scala/org/apache/carbondata/spark/testsuite/createTable/TestCarbonFileInputFormatWithExternalCarbonTable.scala:69: warning: This catches all Throwables. If this is really intended, use `case _ : Throwable` to clear this warning.
	[INFO]       case _ => None
	[INFO]            ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/scala/org/apache/carbondata/spark/testsuite/standardpartition/StandardPartitionWithPreaggregateTestCase.scala:626: warning: fruitless type test: a value of type org.apache.spark.sql.hive.CarbonRelation cannot also be a org.apache.spark.sql.CarbonDatasourceHadoopRelation
	[INFO]         if (ca.isInstanceOf[CarbonDatasourceHadoopRelation]) {
	[INFO]                            ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/test/scala/org/apache/carbondata/spark/util/SparkQueryTest.scala:25: warning: fruitless type test: a value of type org.apache.spark.sql.hive.CarbonRelation cannot also be a org.apache.spark.sql.CarbonDatasourceHadoopRelation
	[INFO]           if (ca.isInstanceOf[CarbonDatasourceHadoopRelation]) {
	[INFO]                              ^
	[WARNING] warning: there were 907 deprecation warnings; re-run with -deprecation for details
	[WARNING] 9 warnings found
	[INFO] prepare-compile in 0 s
	[INFO] compile in 40 s
	[INFO] 
	[INFO] --- scalatest-maven-plugin:1.0:test (test) @ carbondata-spark-common-test ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-spark-common-test ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/target/carbondata-spark-common-test-1.5.2-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-spark-common-test ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-spark-common-test ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/target/jacoco-it.exec,append=true
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.6:run (default) @ carbondata-spark-common-test ---
	[INFO] Executing tasks
	
	main:
	     [echo] Generating JaCoCo Reports
	    [mkdir] Created dir: /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/target/coverage-report
	   [report] Writing bundle 'carbondata-coverage' with 3950 classes
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-spark-common-test ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-spark-common-test ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 1 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-spark-common-test ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-spark-common-test ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-spark-common-test ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-spark-common-test ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/target/carbondata-spark-common-test-1.5.2-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-spark-common-test/1.5.2-SNAPSHOT/carbondata-spark-common-test-1.5.2-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/integration/spark-common-test/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-spark-common-test/1.5.2-SNAPSHOT/carbondata-spark-common-test-1.5.2-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: DataMap Examples 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-datamap-examples ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/datamap/examples/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-datamap-examples ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/datamap/examples/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-datamap-examples ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-datamap-examples ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/datamap/examples/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (default) @ carbondata-datamap-examples ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[WARNING] No source files found.
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-datamap-examples ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-datamap-examples >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-datamap-examples ---
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-datamap-examples <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-datamap-examples ---
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (compile) @ carbondata-datamap-examples ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[WARNING] No source files found.
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ carbondata-datamap-examples ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata3/datamap/examples/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-datamap-examples ---
	[INFO] No sources to compile
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ carbondata-datamap-examples ---
	[INFO] Tests are skipped.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-datamap-examples ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata3/datamap/examples/target/carbondata-datamap-examples-1.5.2-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-datamap-examples ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-datamap-examples ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/datamap/examples/target/jacoco-it.exec
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-datamap-examples ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-datamap-examples ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata3/datamap/examples/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/datamap/examples/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 1 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-datamap-examples ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-datamap-examples ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-datamap-examples ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/datamap/examples/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-datamap-examples ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/datamap/examples/target/carbondata-datamap-examples-1.5.2-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-datamap-examples/1.5.2-SNAPSHOT/carbondata-datamap-examples-1.5.2-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata3/datamap/examples/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-datamap-examples/1.5.2-SNAPSHOT/carbondata-datamap-examples-1.5.2-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Assembly 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-assembly ---
	[INFO] Deleting /Users/xubo/Desktop/xubo/git/carbondata3/assembly/target
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-assembly ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/assembly/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-assembly ---
	[INFO] 
	[INFO] >>> findbugs-maven-plugin:3.0.4:check (analyze-compile) > :findbugs @ carbondata-assembly >>>
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:findbugs (findbugs) @ carbondata-assembly ---
	[INFO] 
	[INFO] <<< findbugs-maven-plugin:3.0.4:check (analyze-compile) < :findbugs @ carbondata-assembly <<<
	[INFO] 
	[INFO] --- findbugs-maven-plugin:3.0.4:check (analyze-compile) @ carbondata-assembly ---
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-assembly ---
	[INFO] 
	[INFO] --- maven-shade-plugin:2.4.3:shade (default) @ carbondata-assembly ---
	[INFO] Including org.apache.carbondata:carbondata-common:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including log4j:log4j:jar:1.2.12 in the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-annotations:jar:2.8.3 from the shaded jar.
	[INFO] Excluding com.google.guava:guava:jar:11.0.2 from the shaded jar.
	[INFO] Including commons-cli:commons-cli:jar:1.2 in the shaded jar.
	[INFO] Including commons-codec:commons-codec:jar:1.4 in the shaded jar.
	[INFO] Including commons-io:commons-io:jar:2.4 in the shaded jar.
	[INFO] Including org.mortbay.jetty:jetty-util:jar:6.1.26 in the shaded jar.
	[INFO] Including com.sun.jersey:jersey-core:jar:1.9 in the shaded jar.
	[INFO] Including javax.xml.bind:jaxb-api:jar:2.2.2 in the shaded jar.
	[INFO] Including javax.xml.stream:stax-api:jar:1.0-2 in the shaded jar.
	[INFO] Including javax.activation:activation:jar:1.1 in the shaded jar.
	[INFO] Including org.codehaus.jackson:jackson-jaxrs:jar:1.8.3 in the shaded jar.
	[INFO] Including org.codehaus.jackson:jackson-xc:jar:1.8.3 in the shaded jar.
	[INFO] Including commons-logging:commons-logging:jar:1.1.3 in the shaded jar.
	[INFO] Including commons-lang:commons-lang:jar:2.6 in the shaded jar.
	[INFO] Including org.slf4j:slf4j-api:jar:1.7.10 in the shaded jar.
	[INFO] Including org.slf4j:slf4j-log4j12:jar:1.7.10 in the shaded jar.
	[INFO] Including org.codehaus.jackson:jackson-core-asl:jar:1.9.13 in the shaded jar.
	[INFO] Including org.codehaus.jackson:jackson-mapper-asl:jar:1.9.13 in the shaded jar.
	[INFO] Excluding org.apache.avro:avro:jar:1.7.4 from the shaded jar.
	[INFO] Including com.thoughtworks.paranamer:paranamer:jar:2.3 in the shaded jar.
	[INFO] Including com.google.protobuf:protobuf-java:jar:2.5.0 in the shaded jar.
	[INFO] Including com.google.code.findbugs:jsr305:jar:3.0.0 in the shaded jar.
	[INFO] Including org.apache.commons:commons-compress:jar:1.4.1 in the shaded jar.
	[INFO] Including org.tukaani:xz:jar:1.0 in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-core:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-format:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.thrift:libthrift:jar:0.9.3 in the shaded jar.
	[INFO] Including com.google.code.gson:gson:jar:2.4 in the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-hdfs-client:jar:2.8.3 from the shaded jar.
	[INFO] Including com.squareup.okhttp:okhttp:jar:2.4.0 in the shaded jar.
	[INFO] Including com.squareup.okio:okio:jar:1.4.0 in the shaded jar.
	[INFO] Including org.fusesource.leveldbjni:leveldbjni-all:jar:1.8 in the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-client:jar:2.8.3 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-mapreduce-client-app:jar:2.8.3 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-mapreduce-client-common:jar:2.8.3 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-client:jar:2.8.3 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-server-common:jar:2.8.3 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-mapreduce-client-shuffle:jar:2.8.3 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-api:jar:2.8.3 from the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-yarn-common:jar:2.8.3 from the shaded jar.
	[INFO] Including com.sun.jersey:jersey-client:jar:1.9 in the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-mapreduce-client-jobclient:jar:2.8.3 from the shaded jar.
	[INFO] Excluding org.xerial.snappy:snappy-java:jar:1.1.2.6 from the shaded jar.
	[INFO] Including com.github.luben:zstd-jni:jar:1.3.2-2 in the shaded jar.
	[INFO] Excluding org.apache.zookeeper:zookeeper:jar:3.4.7 from the shaded jar.
	[INFO] Including org.apache.commons:commons-lang3:jar:3.5 in the shaded jar.
	[INFO] Including org.roaringbitmap:RoaringBitmap:jar:0.5.11 in the shaded jar.
	[INFO] Including io.netty:netty-all:jar:4.0.42.Final in the shaded jar.
	[INFO] Including org.lz4:lz4-java:jar:1.4.0 in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-processing:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including com.univocity:univocity-parsers:jar:2.2.1 in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-spark2:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-spark-common:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-streaming:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-spark-datasource:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-cli:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-store-sdk:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-hadoop:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-lucene:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.lucene:lucene-core:jar:6.3.0 in the shaded jar.
	[INFO] Including org.apache.lucene:lucene-analyzers-common:jar:6.3.0 in the shaded jar.
	[INFO] Including org.apache.lucene:lucene-queryparser:jar:6.3.0 in the shaded jar.
	[INFO] Including org.apache.lucene:lucene-sandbox:jar:6.3.0 in the shaded jar.
	[INFO] Including org.apache.solr:solr-core:jar:6.3.0 in the shaded jar.
	[INFO] Including org.apache.solr:solr-solrj:jar:6.3.0 in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-bloom:jar:1.5.2-SNAPSHOT in the shaded jar.
	[INFO] Excluding org.apache.hadoop:hadoop-aws:jar:2.8.3 from the shaded jar.
	[INFO] Including com.amazonaws:aws-java-sdk-s3:jar:1.10.6 in the shaded jar.
	[INFO] Including com.amazonaws:aws-java-sdk-kms:jar:1.10.6 in the shaded jar.
	[INFO] Including com.amazonaws:aws-java-sdk-core:jar:1.10.6 in the shaded jar.
	[INFO] Including joda-time:joda-time:jar:2.9.4 in the shaded jar.
	[INFO] Including org.apache.httpcomponents:httpclient:jar:4.5.2 in the shaded jar.
	[INFO] Including org.apache.httpcomponents:httpcore:jar:4.4.4 in the shaded jar.
	[INFO] Including net.java.dev.jets3t:jets3t:jar:0.9.0 in the shaded jar.
	[INFO] Including com.jamesmurty.utils:java-xmlbuilder:jar:0.4 in the shaded jar.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-assembly ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata3/assembly/target/jacoco-it.exec
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-assembly ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-assembly ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata3/assembly/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata3/assembly/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 0 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-assembly ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-assembly ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-assembly ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata3/assembly/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-assembly ---
	[INFO] Skipping artifact installation
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Hive 1.5.2-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	Downloading: https://repo.huaweicloud.com/repository/maven/org/apache/httpcomponents/httpcore/4.5.2/httpcore-4.5.2.pom
	[WARNING] The POM for org.apache.httpcomponents:httpcore:jar:4.5.2 is missing, no dependency information available
	Downloading: https://repo.huaweicloud.com/repository/maven/org/apache/httpcomponents/httpcore/4.5.2/httpcore-4.5.2.jar
	[INFO] ------------------------------------------------------------------------
	[INFO] Reactor Summary:
	[INFO] 
	[INFO] Apache CarbonData :: Parent ........................ SUCCESS [  4.886 s]
	[INFO] Apache CarbonData :: Common ........................ SUCCESS [  9.265 s]
	[INFO] Apache CarbonData :: Format ........................ SUCCESS [ 18.333 s]
	[INFO] Apache CarbonData :: Core .......................... SUCCESS [ 45.652 s]
	[INFO] Apache CarbonData :: Processing .................... SUCCESS [ 19.867 s]
	[INFO] Apache CarbonData :: Hadoop ........................ SUCCESS [  9.311 s]
	[INFO] Apache CarbonData :: Streaming ..................... SUCCESS [ 20.691 s]
	[INFO] Apache CarbonData :: Store SDK ..................... SUCCESS [ 15.496 s]
	[INFO] Apache CarbonData :: Spark Datasource .............. SUCCESS [ 38.356 s]
	[INFO] Apache CarbonData :: Spark Common .................. SUCCESS [01:04 min]
	[INFO] Apache CarbonData :: CLI ........................... SUCCESS [ 15.994 s]
	[INFO] Apache CarbonData :: Lucene Index DataMap .......... SUCCESS [ 10.297 s]
	[INFO] Apache CarbonData :: Bloom Index DataMap ........... SUCCESS [  9.036 s]
	[INFO] Apache CarbonData :: Spark2 ........................ SUCCESS [01:48 min]
	[INFO] Apache CarbonData :: Spark Common Test ............. SUCCESS [ 51.980 s]
	[INFO] Apache CarbonData :: DataMap Examples .............. SUCCESS [  2.405 s]
	[INFO] Apache CarbonData :: Assembly ...................... SUCCESS [  8.401 s]
	[INFO] Apache CarbonData :: Hive .......................... FAILURE [  1.885 s]
	[INFO] Apache CarbonData :: presto ........................ SKIPPED
	[INFO] Apache CarbonData :: Spark2 Examples ............... SKIPPED
	[INFO] ------------------------------------------------------------------------
	[INFO] BUILD FAILURE
	[INFO] ------------------------------------------------------------------------
	[INFO] Total time: 07:35 min
	[INFO] Finished at: 2019-01-14T10:30:50+08:00
	[INFO] Final Memory: 232M/1856M
	[INFO] ------------------------------------------------------------------------
	[ERROR] Failed to execute goal on project carbondata-hive: Could not resolve dependencies for project org.apache.carbondata:carbondata-hive:jar:1.5.2-SNAPSHOT: Could not find artifact org.apache.httpcomponents:httpcore:jar:4.5.2 in huaweicloud (https://repo.huaweicloud.com/repository/maven/) -> [Help 1]
	[ERROR] 
	[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
	[ERROR] Re-run Maven using the -X switch to enable full debug logging.
	[ERROR] 
	[ERROR] For more information about the errors and possible solutions, please read the following articles:
	[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/DependencyResolutionException
	[ERROR] 
	[ERROR] After correcting the problems, you can resume the build with the command
	[ERROR]   mvn <goals> -rf :carbondata-hive
	
	Process finished with exit code 1
	
## Solution:
Cherry-pick 
