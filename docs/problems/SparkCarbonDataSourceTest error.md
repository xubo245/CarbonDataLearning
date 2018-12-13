	/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/bin/java -Dmaven.multiModuleProjectDirectory=/Users/xubo/Desktop/xubo/git/carbondata1 -Dmaven.home=/Users/xubo/all/soft/apache-maven-3.3.9 -Dclassworlds.conf=/Users/xubo/all/soft/apache-maven-3.3.9/bin/m2.conf "-javaagent:/Volumes/IntelliJ IDEA CE/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=54300:/Volumes/IntelliJ IDEA CE/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Users/xubo/all/soft/apache-maven-3.3.9/boot/plexus-classworlds-2.5.2.jar org.codehaus.classworlds.Launcher -Didea.version=2018.1.2 -Pspark-2.1 clean install
	[INFO] Scanning for projects...
	[WARNING] 
	[WARNING] Some problems were encountered while building the effective model for org.apache.carbondata:carbondata-presto:presto-plugin:1.6.0-SNAPSHOT
	[WARNING] 'build.plugins.plugin.version' for com.ning.maven.plugins:maven-duplicate-finder-plugin is missing. @ org.apache.carbondata:carbondata-presto:[unknown-version], /Users/xubo/Desktop/xubo/git/carbondata1/integration/presto/pom.xml, line 617, column 15
	[WARNING] 'build.plugins.plugin.version' for pl.project13.maven:git-commit-id-plugin is missing. @ org.apache.carbondata:carbondata-presto:[unknown-version], /Users/xubo/Desktop/xubo/git/carbondata1/integration/presto/pom.xml, line 630, column 15
	[WARNING] 
	[WARNING] Some problems were encountered while building the effective model for org.apache.carbondata:carbondata-examples-spark2:jar:1.6.0-SNAPSHOT
	[WARNING] 'build.plugins.plugin.version' for com.ning.maven.plugins:maven-duplicate-finder-plugin is missing. @ org.apache.carbondata:carbondata-examples-spark2:[unknown-version], /Users/xubo/Desktop/xubo/git/carbondata1/examples/spark2/pom.xml, line 181, column 15
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
	[INFO] Building Apache CarbonData :: Parent 1.6.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-parent ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-parent ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata1/target/jacoco.exec
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
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata1/target/jacoco-it.exec
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-parent ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-parent ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata1/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata1/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 86 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-parent ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-parent ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-parent ---
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata1/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-parent ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata1/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-parent/1.6.0-SNAPSHOT/carbondata-parent-1.6.0-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Common 1.6.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-common ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-common ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata1/common/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-common ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-common ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata1/common/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-common ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 19 source files to /Users/xubo/Desktop/xubo/git/carbondata1/common/target/classes
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
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata1/common/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-common ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 5 source files to /Users/xubo/Desktop/xubo/git/carbondata1/common/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ carbondata-common ---
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-common ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata1/common/target/carbondata-common-1.6.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-common ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-common ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata1/common/target/jacoco-it.exec
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-common ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-common ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata1/common/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata1/common/target/scalastyle-output.xml
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
	[INFO] Skipping JaCoCo execution due to missing execution data file:/Users/xubo/Desktop/xubo/git/carbondata1/common/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-common ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata1/common/target/carbondata-common-1.6.0-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-common/1.6.0-SNAPSHOT/carbondata-common-1.6.0-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata1/common/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-common/1.6.0-SNAPSHOT/carbondata-common-1.6.0-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Core 1.6.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-core ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-core ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata1/core/target/jacoco.exec,append=true
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
	[INFO] Compiling 651 source files to /Users/xubo/Desktop/xubo/git/carbondata1/core/target/classes
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata1/core/src/main/java/org/apache/carbondata/core/memory/CarbonUnsafe.java:[23,16] sun.misc.Unsafe is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata1/core/src/main/java/org/apache/carbondata/core/memory/CarbonUnsafe.java:[43,18] sun.misc.Unsafe is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata1/core/src/main/java/org/apache/carbondata/core/memory/CarbonUnsafe.java:[47,21] sun.misc.Unsafe is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata1/core/src/main/java/org/apache/carbondata/core/memory/CarbonUnsafe.java:[49,17] sun.misc.Unsafe is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata1/core/src/main/java/org/apache/carbondata/core/memory/CarbonUnsafe.java:[70,17] sun.misc.Unsafe is internal proprietary API and may be removed in a future release
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/core/src/main/java/org/apache/carbondata/core/util/ByteUtil.java: /Users/xubo/Desktop/xubo/git/carbondata1/core/src/main/java/org/apache/carbondata/core/util/ByteUtil.java uses or overrides a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/core/src/main/java/org/apache/carbondata/core/util/ByteUtil.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/core/src/main/java/org/apache/carbondata/core/metadata/schema/table/DataMapSchema.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/core/src/main/java/org/apache/carbondata/core/metadata/schema/table/DataMapSchema.java: Recompile with -Xlint:unchecked for details.
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
	[INFO] Compiling 110 source files to /Users/xubo/Desktop/xubo/git/carbondata1/core/target/test-classes
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata1/core/src/test/java/org/apache/carbondata/core/datastore/filesystem/LocalCarbonFileTest.java:[27,18] sun.nio.ch.FileChannelImpl is internal proprietary API and may be removed in a future release
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata1/core/src/test/java/org/apache/carbondata/core/datastore/filesystem/LocalCarbonFileTest.java:[200,20] sun.nio.ch.FileChannelImpl is internal proprietary API and may be removed in a future release
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/core/src/test/java/org/apache/carbondata/core/scan/expression/conditional/GreaterThanExpressionUnitTest.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/core/src/test/java/org/apache/carbondata/core/scan/expression/conditional/GreaterThanExpressionUnitTest.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/core/src/test/java/org/apache/carbondata/core/scan/complextypes/StructQueryTypeTest.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/core/src/test/java/org/apache/carbondata/core/scan/complextypes/StructQueryTypeTest.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ carbondata-core ---
	[INFO] Surefire report directory: /Users/xubo/Desktop/xubo/git/carbondata1/core/target/surefire-reports
	
	-------------------------------------------------------
	 T E S T S
	-------------------------------------------------------
	Running org.apache.carbondata.core.reader.ThriftReaderTest
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.138 sec - in org.apache.carbondata.core.reader.ThriftReaderTest
	Running org.apache.carbondata.core.reader.sortindex.CarbonDictionarySortIndexReaderImplTest
	log4j:WARN No appenders could be found for logger (org.apache.carbondata.core.util.CarbonProperties).
	log4j:WARN Please initialize the log4j system properly.
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.466 sec - in org.apache.carbondata.core.reader.sortindex.CarbonDictionarySortIndexReaderImplTest
	Running org.apache.carbondata.core.reader.CarbonIndexFileReaderTest
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.132 sec - in org.apache.carbondata.core.reader.CarbonIndexFileReaderTest
	Running org.apache.carbondata.core.reader.CarbonDictionaryReaderImplTest
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.172 sec - in org.apache.carbondata.core.reader.CarbonDictionaryReaderImplTest
	Running org.apache.carbondata.core.keygenerator.mdkey.NumberCompressorUnitTest
	[I@18356d9e
	Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.009 sec - in org.apache.carbondata.core.keygenerator.mdkey.NumberCompressorUnitTest
	Running org.apache.carbondata.core.keygenerator.mdkey.BitsUnitTest
	Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 sec - in org.apache.carbondata.core.keygenerator.mdkey.BitsUnitTest
	Running org.apache.carbondata.core.keygenerator.mdkey.MultiDimKeyVarLengthGeneratorUnitTest
	Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 sec - in org.apache.carbondata.core.keygenerator.mdkey.MultiDimKeyVarLengthGeneratorUnitTest
	Running org.apache.carbondata.core.keygenerator.columnar.impl.MultiDimKeyVarLengthVariableSplitGeneratorUnitTest
	Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 sec - in org.apache.carbondata.core.keygenerator.columnar.impl.MultiDimKeyVarLengthVariableSplitGeneratorUnitTest
	Running org.apache.carbondata.core.keygenerator.columnar.impl.MultiDimKeyVarLengthEquiSplitGeneratorUnitTest
	Tests run: 14, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 sec - in org.apache.carbondata.core.keygenerator.columnar.impl.MultiDimKeyVarLengthEquiSplitGeneratorUnitTest
	Running org.apache.carbondata.core.keygenerator.directdictionary.DirectDictionaryKeyGeneratorFactoryUnitTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.01 sec - in org.apache.carbondata.core.keygenerator.directdictionary.DirectDictionaryKeyGeneratorFactoryUnitTest
	Running org.apache.carbondata.core.keygenerator.directdictionary.DateDirectDictionaryGeneratorTest
	Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 sec - in org.apache.carbondata.core.keygenerator.directdictionary.DateDirectDictionaryGeneratorTest
	Running org.apache.carbondata.core.keygenerator.factory.KeyGeneratorFactoryUnitTest
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec - in org.apache.carbondata.core.keygenerator.factory.KeyGeneratorFactoryUnitTest
	Running org.apache.carbondata.core.memory.MemoryAllocatorUnitTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 sec - in org.apache.carbondata.core.memory.MemoryAllocatorUnitTest
	Running org.apache.carbondata.core.cache.CacheProviderTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.006 sec - in org.apache.carbondata.core.cache.CacheProviderTest
	Running org.apache.carbondata.core.cache.CarbonLRUCacheTest
	Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.043 sec - in org.apache.carbondata.core.cache.CarbonLRUCacheTest
	Running org.apache.carbondata.core.cache.dictionary.ForwardDictionaryCacheTest
	Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.046 sec - in org.apache.carbondata.core.cache.dictionary.ForwardDictionaryCacheTest
	Running org.apache.carbondata.core.cache.dictionary.DictionaryColumnUniqueIdentifierTest
	Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.101 sec - in org.apache.carbondata.core.cache.dictionary.DictionaryColumnUniqueIdentifierTest
	Running org.apache.carbondata.core.cache.dictionary.DictionaryCacheLoaderImplTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.185 sec - in org.apache.carbondata.core.cache.dictionary.DictionaryCacheLoaderImplTest
	Running org.apache.carbondata.core.cache.dictionary.ColumnDictionaryInfoTest
	Tests run: 22, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.839 sec - in org.apache.carbondata.core.cache.dictionary.ColumnDictionaryInfoTest
	Running org.apache.carbondata.core.cache.dictionary.ForwardDictionaryTest
	MockedMockedMockedMockedTests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.283 sec - in org.apache.carbondata.core.cache.dictionary.ForwardDictionaryTest
	Running org.apache.carbondata.core.cache.dictionary.ReverseDictionaryCacheTest
	Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.129 sec - in org.apache.carbondata.core.cache.dictionary.ReverseDictionaryCacheTest
	Running org.apache.carbondata.core.cache.dictionary.ColumnDictionaryChunkIteratorTest
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in org.apache.carbondata.core.cache.dictionary.ColumnDictionaryChunkIteratorTest
	Running org.apache.carbondata.core.cache.dictionary.DictionaryByteArrayWrapperTest
	Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in org.apache.carbondata.core.cache.dictionary.DictionaryByteArrayWrapperTest
	Running org.apache.carbondata.core.cache.dictionary.ReverseDictionaryTest
	Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.212 sec - in org.apache.carbondata.core.cache.dictionary.ReverseDictionaryTest
	Running org.apache.carbondata.core.cache.dictionary.DictionaryChunksWrapperTest
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.007 sec - in org.apache.carbondata.core.cache.dictionary.DictionaryChunksWrapperTest
	Running org.apache.carbondata.core.cache.dictionary.ColumnReverseDictionaryInfoTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec - in org.apache.carbondata.core.cache.dictionary.ColumnReverseDictionaryInfoTest
	Running org.apache.carbondata.core.util.CarbonUtilTest
	Tests run: 74, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.157 sec - in org.apache.carbondata.core.util.CarbonUtilTest
	Running org.apache.carbondata.core.util.DataTypeUtilTest
	Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 sec - in org.apache.carbondata.core.util.DataTypeUtilTest
	Running org.apache.carbondata.core.util.path.CarbonFormatDirectoryStructureTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in org.apache.carbondata.core.util.path.CarbonFormatDirectoryStructureTest
	Running org.apache.carbondata.core.util.ByteUtilTest
	Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 sec - in org.apache.carbondata.core.util.ByteUtilTest
	Running org.apache.carbondata.core.util.DataFileFooterConverterTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.429 sec - in org.apache.carbondata.core.util.DataFileFooterConverterTest
	Running org.apache.carbondata.core.util.RangeFilterProcessorTest
	Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.139 sec - in org.apache.carbondata.core.util.RangeFilterProcessorTest
	Running org.apache.carbondata.core.util.CarbonMetadataUtilTest
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.02 sec - in org.apache.carbondata.core.util.CarbonMetadataUtilTest
	Running org.apache.carbondata.core.carbon.ColumnIdentifierTest
	Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in org.apache.carbondata.core.carbon.ColumnIdentifierTest
	Running org.apache.carbondata.core.carbon.CarbonTableIdentifierTest
	sfdsdf DatabseName_tableNameTests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in org.apache.carbondata.core.carbon.CarbonTableIdentifierTest
	Running org.apache.carbondata.core.carbon.datastorage.filesystem.store.impl.DFSFileReaderImplUnitTest
	Tests run: 11, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.212 sec - in org.apache.carbondata.core.carbon.datastorage.filesystem.store.impl.DFSFileReaderImplUnitTest
	Running org.apache.carbondata.core.carbon.datastorage.filesystem.store.impl.FileFactoryImplUnitTest
	Tests run: 19, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.104 sec - in org.apache.carbondata.core.carbon.datastorage.filesystem.store.impl.FileFactoryImplUnitTest
	Running org.apache.carbondata.core.carbon.datastorage.filesystem.store.impl.FileReaderImplUnitTest
	Tests run: 11, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.069 sec - in org.apache.carbondata.core.carbon.datastorage.filesystem.store.impl.FileReaderImplUnitTest
	Running org.apache.carbondata.core.carbon.AbsoluteTableIdentifierTest
	Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 sec - in org.apache.carbondata.core.carbon.AbsoluteTableIdentifierTest
	Running org.apache.carbondata.core.constants.CarbondataVersionUnitTest
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.016 sec - in org.apache.carbondata.core.constants.CarbondataVersionUnitTest
	Running org.apache.carbondata.core.scan.wrappers.ByteArrayWrapperTest
	Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in org.apache.carbondata.core.scan.wrappers.ByteArrayWrapperTest
	Running org.apache.carbondata.core.scan.result.RowBatchTest
	Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.09 sec - in org.apache.carbondata.core.scan.result.RowBatchTest
	Running org.apache.carbondata.core.scan.executor.util.RestructureUtilTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.008 sec - in org.apache.carbondata.core.scan.executor.util.RestructureUtilTest
	Running org.apache.carbondata.core.scan.executor.util.QueryUtilTest
	Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.018 sec - in org.apache.carbondata.core.scan.executor.util.QueryUtilTest
	Running org.apache.carbondata.core.scan.complextypes.StructQueryTypeTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.084 sec - in org.apache.carbondata.core.scan.complextypes.StructQueryTypeTest
	Running org.apache.carbondata.core.scan.complextypes.ArrayQueryTypeTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in org.apache.carbondata.core.scan.complextypes.ArrayQueryTypeTest
	Running org.apache.carbondata.core.scan.complextypes.PrimitiveQueryTypeTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.164 sec - in org.apache.carbondata.core.scan.complextypes.PrimitiveQueryTypeTest
	Running org.apache.carbondata.core.scan.expression.ColumnExpressionTest
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.139 sec - in org.apache.carbondata.core.scan.expression.ColumnExpressionTest
	Running org.apache.carbondata.core.scan.expression.conditional.NotInExpressionUnitTest
	Tests run: 11, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.658 sec - in org.apache.carbondata.core.scan.expression.conditional.NotInExpressionUnitTest
	Running org.apache.carbondata.core.scan.expression.conditional.NotEqualsExpressionUnitTest
	Tests run: 20, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.247 sec - in org.apache.carbondata.core.scan.expression.conditional.NotEqualsExpressionUnitTest
	Running org.apache.carbondata.core.scan.expression.conditional.GreaterThanExpressionUnitTest
	Tests run: 17, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.04 sec - in org.apache.carbondata.core.scan.expression.conditional.GreaterThanExpressionUnitTest
	Running org.apache.carbondata.core.scan.expression.conditional.ListExpressionUnitTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 sec - in org.apache.carbondata.core.scan.expression.conditional.ListExpressionUnitTest
	Running org.apache.carbondata.core.scan.expression.conditional.EqualToExpressionUnitTest
	Tests run: 15, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.904 sec - in org.apache.carbondata.core.scan.expression.conditional.EqualToExpressionUnitTest
	Running org.apache.carbondata.core.scan.expression.conditional.InExpressionUnitTest
	Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.51 sec - in org.apache.carbondata.core.scan.expression.conditional.InExpressionUnitTest
	Running org.apache.carbondata.core.scan.expression.conditional.GreaterThanEqualToExpressionUnitTest
	Tests run: 18, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.132 sec - in org.apache.carbondata.core.scan.expression.conditional.GreaterThanEqualToExpressionUnitTest
	Running org.apache.carbondata.core.scan.expression.conditional.LessThanEqualToExpressionUnitTest
	Tests run: 16, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.988 sec - in org.apache.carbondata.core.scan.expression.conditional.LessThanEqualToExpressionUnitTest
	Running org.apache.carbondata.core.scan.expression.conditional.LessThanExpressionUnitTest
	Tests run: 17, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.1 sec - in org.apache.carbondata.core.scan.expression.conditional.LessThanExpressionUnitTest
	Running org.apache.carbondata.core.scan.expression.LiteralExpressionTest
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 sec - in org.apache.carbondata.core.scan.expression.LiteralExpressionTest
	Running org.apache.carbondata.core.scan.expression.ExpressionResultTest
	Tests run: 66, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.013 sec - in org.apache.carbondata.core.scan.expression.ExpressionResultTest
	Running org.apache.carbondata.core.scan.expression.logical.AndExpressionTest
	Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.377 sec - in org.apache.carbondata.core.scan.expression.logical.AndExpressionTest
	Running org.apache.carbondata.core.scan.expression.logical.TrueExpressionTest
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in org.apache.carbondata.core.scan.expression.logical.TrueExpressionTest
	Running org.apache.carbondata.core.scan.expression.logical.RangeExpressionTest
	Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.35 sec - in org.apache.carbondata.core.scan.expression.logical.RangeExpressionTest
	Running org.apache.carbondata.core.scan.expression.logical.OrExpressionTest
	Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.352 sec - in org.apache.carbondata.core.scan.expression.logical.OrExpressionTest
	Running org.apache.carbondata.core.scan.expression.logical.FalseExpressionTest
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec - in org.apache.carbondata.core.scan.expression.logical.FalseExpressionTest
	Running org.apache.carbondata.core.scan.filter.FilterUtilTest
	Tests run: 31, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.496 sec - in org.apache.carbondata.core.scan.filter.FilterUtilTest
	Running org.apache.carbondata.core.scan.filter.FilterExpressionProcessorTest
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.008 sec - in org.apache.carbondata.core.scan.filter.FilterExpressionProcessorTest
	Running org.apache.carbondata.core.scan.filter.executer.IncludeFilterExecuterImplTest
	dimColumnSize: 2
	old code performance time: 1772 ms
	new code performance time: 31 ms
	filteredValueCnt: 800
	dimColumnSize: 1
	old code performance time: 198 ms
	new code performance time: 15 ms
	filteredValueCnt: 100
	dimColumnSize: 2
	old code performance time: 2 ms
	new code performance time: 2 ms
	filteredValueCnt: 1
	dimColumnSize: 2
	old code performance time: 0 ms
	new code performance time: 0 ms
	filteredValueCnt: 0
	old code performance time: 2014 ms
	new code performance time: 1909 ms
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.969 sec - in org.apache.carbondata.core.scan.filter.executer.IncludeFilterExecuterImplTest
	Running org.apache.carbondata.core.scan.filter.executer.ExcludeFilterExecuterImplTest
	dimColumnSize: 2
	old code performance time: 1780 ms
	new code performance time: 26 ms
	filteredValueCnt: 800
	dimColumnSize: 1
	old code performance time: 217 ms
	new code performance time: 14 ms
	filteredValueCnt: 100
	dimColumnSize: 2
	old code performance time: 4 ms
	new code performance time: 1 ms
	filteredValueCnt: 1
	dimColumnSize: 2
	old code performance time: 0 ms
	new code performance time: 1 ms
	filteredValueCnt: 0
	old code performance time: 2025 ms
	new code performance time: 1919 ms
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.998 sec - in org.apache.carbondata.core.scan.filter.executer.ExcludeFilterExecuterImplTest
	Running org.apache.carbondata.core.datastore.columnar.ColumnarKeyStoreDataHolderUnitTest
	Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec - in org.apache.carbondata.core.datastore.columnar.ColumnarKeyStoreDataHolderUnitTest
	Running org.apache.carbondata.core.datastore.page.encoding.RLECodecTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.046 sec - in org.apache.carbondata.core.datastore.page.encoding.RLECodecTest
	Running org.apache.carbondata.core.datastore.page.encoding.TestEncodingFactory
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.011 sec - in org.apache.carbondata.core.datastore.page.encoding.TestEncodingFactory
	Running org.apache.carbondata.core.datastore.chunk.impl.FixedLengthDimensionDataChunkTest
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec - in org.apache.carbondata.core.datastore.chunk.impl.FixedLengthDimensionDataChunkTest
	Running org.apache.carbondata.core.datastore.filesystem.LocalCarbonFileTest
	Tests run: 19, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.784 sec - in org.apache.carbondata.core.datastore.filesystem.LocalCarbonFileTest
	Running org.apache.carbondata.core.datastore.filesystem.ViewFsCarbonFileTest
	Tests run: 11, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.312 sec - in org.apache.carbondata.core.datastore.filesystem.ViewFsCarbonFileTest
	Running org.apache.carbondata.core.datastore.filesystem.HDFSCarbonFileTest
	Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.965 sec - in org.apache.carbondata.core.datastore.filesystem.HDFSCarbonFileTest
	Running org.apache.carbondata.core.datastore.filesystem.AlluxioCarbonFileTest
	Tests run: 11, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.134 sec - in org.apache.carbondata.core.datastore.filesystem.AlluxioCarbonFileTest
	Running org.apache.carbondata.core.datastore.CompressdFileTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.018 sec - in org.apache.carbondata.core.datastore.CompressdFileTest
	Running org.apache.carbondata.core.datastore.block.BlockInfoTest
	Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec - in org.apache.carbondata.core.datastore.block.BlockInfoTest
	Running org.apache.carbondata.core.datastore.block.TableTaskInfoTest
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in org.apache.carbondata.core.datastore.block.TableTaskInfoTest
	Running org.apache.carbondata.core.datastore.block.TableBlockInfoTest
	Tests run: 14, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.199 sec - in org.apache.carbondata.core.datastore.block.TableBlockInfoTest
	Running org.apache.carbondata.core.datastore.block.SegmentPropertiesTest
	Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 sec - in org.apache.carbondata.core.datastore.block.SegmentPropertiesTest
	Running org.apache.carbondata.core.writer.CarbonDictionaryWriterImplTest
	Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.148 sec - in org.apache.carbondata.core.writer.CarbonDictionaryWriterImplTest
	Running org.apache.carbondata.core.writer.sortindex.CarbonDictionarySortIndexWriterImplTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.007 sec - in org.apache.carbondata.core.writer.sortindex.CarbonDictionarySortIndexWriterImplTest
	Running org.apache.carbondata.core.writer.sortindex.CarbonDictionarySortInfoPreparatorTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.177 sec - in org.apache.carbondata.core.writer.sortindex.CarbonDictionarySortInfoPreparatorTest
	Running org.apache.carbondata.core.writer.sortindex.CarbonDictionarySortModelTest
	Tests run: 20, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.006 sec - in org.apache.carbondata.core.writer.sortindex.CarbonDictionarySortModelTest
	Running org.apache.carbondata.core.load.LoadMetadataDetailsUnitTest
	Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 sec - in org.apache.carbondata.core.load.LoadMetadataDetailsUnitTest
	Running org.apache.carbondata.core.dictionary.generator.TableDictionaryGeneratorTest
	Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.017 sec - in org.apache.carbondata.core.dictionary.generator.TableDictionaryGeneratorTest
	Running org.apache.carbondata.core.dictionary.generator.IncrementalColumnDictionaryGeneratorTest
	true/private/var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/tmp/test/TestTable/Metadata/empNameCol.dict
	Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 sec - in org.apache.carbondata.core.dictionary.generator.IncrementalColumnDictionaryGeneratorTest
	Running org.apache.carbondata.core.dictionary.generator.ServerDictionaryGeneratorTest
	Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 sec - in org.apache.carbondata.core.dictionary.generator.ServerDictionaryGeneratorTest
	Running org.apache.carbondata.core.dictionary.client.DictionaryClientTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.043 sec - in org.apache.carbondata.core.dictionary.client.DictionaryClientTest
	Running org.apache.carbondata.core.localdictionary.TestDictionaryStore
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 sec - in org.apache.carbondata.core.localdictionary.TestDictionaryStore
	Running org.apache.carbondata.core.localdictionary.TestLocalDictionaryGenerator
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 sec - in org.apache.carbondata.core.localdictionary.TestLocalDictionaryGenerator
	Running org.apache.carbondata.core.localdictionary.TestPageLevelDictionary
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.028 sec - in org.apache.carbondata.core.localdictionary.TestPageLevelDictionary
	Running org.apache.carbondata.core.indexstore.blockletindex.TestBlockletDataMapFactory
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.349 sec - in org.apache.carbondata.core.indexstore.blockletindex.TestBlockletDataMapFactory
	Running org.apache.carbondata.core.indexstore.blockletindex.TestBlockletDataMap
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.146 sec - in org.apache.carbondata.core.indexstore.blockletindex.TestBlockletDataMap
	Running org.apache.carbondata.core.metadata.CarbonMetadataTest
	Tests run: 13, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.47 sec - in org.apache.carbondata.core.metadata.CarbonMetadataTest
	Running org.apache.carbondata.core.metadata.converter.ThriftWrapperSchemaConverterImplTest
	Tests run: 31, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.624 sec - in org.apache.carbondata.core.metadata.converter.ThriftWrapperSchemaConverterImplTest
	Running org.apache.carbondata.core.metadata.schema.table.TableSchemaTest
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in org.apache.carbondata.core.metadata.schema.table.TableSchemaTest
	Running org.apache.carbondata.core.metadata.schema.table.TableInfoTest
	Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.041 sec - in org.apache.carbondata.core.metadata.schema.table.TableInfoTest
	Running org.apache.carbondata.core.metadata.schema.table.CarbonTableWithComplexTypesTest
	Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in org.apache.carbondata.core.metadata.schema.table.CarbonTableWithComplexTypesTest
	Running org.apache.carbondata.core.metadata.schema.table.CarbonTableTest
	Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in org.apache.carbondata.core.metadata.schema.table.CarbonTableTest
	Running org.apache.carbondata.core.CarbonPropertiesValidationTest
	Tests run: 13, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 sec - in org.apache.carbondata.core.CarbonPropertiesValidationTest
	Running org.apache.carbondata.core.stats.QueryStasticsRecorderImplTest
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.142 sec - in org.apache.carbondata.core.stats.QueryStasticsRecorderImplTest
	Running org.apache.carbondata.core.stats.DriverQueryStatisticsRecorderImplTest
	Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 sec - in org.apache.carbondata.core.stats.DriverQueryStatisticsRecorderImplTest
	
	Results :
	
	Tests run: 862, Failures: 0, Errors: 0, Skipped: 0
	
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-core ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata1/core/target/carbondata-core-1.6.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-core ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-core ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata1/core/target/jacoco-it.exec,append=true
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-core ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-core ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata1/core/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata1/core/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 1 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-core ---
	[INFO] Loading execution data file /Users/xubo/Desktop/xubo/git/carbondata1/core/target/jacoco.exec
	[INFO] Analyzed bundle 'Apache CarbonData :: Core' with 749 classes
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-core ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-core ---
	[INFO] Loading execution data file /Users/xubo/Desktop/xubo/git/carbondata1/core/target/jacoco.exec
	[INFO] Analyzed bundle 'carbondata-core' with 0 classes
	[INFO] All coverage checks have been met.
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-core ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata1/core/target/carbondata-core-1.6.0-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-core/1.6.0-SNAPSHOT/carbondata-core-1.6.0-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata1/core/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-core/1.6.0-SNAPSHOT/carbondata-core-1.6.0-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Processing 1.6.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-processing ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-processing ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata1/processing/target/jacoco.exec,append=true
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
	[INFO] Compiling 148 source files to /Users/xubo/Desktop/xubo/git/carbondata1/processing/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/processing/src/main/java/org/apache/carbondata/processing/merger/CarbonDataMergerUtil.java: /Users/xubo/Desktop/xubo/git/carbondata1/processing/src/main/java/org/apache/carbondata/processing/merger/CarbonDataMergerUtil.java uses or overrides a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/processing/src/main/java/org/apache/carbondata/processing/merger/CarbonDataMergerUtil.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/processing/src/main/java/org/apache/carbondata/processing/loading/converter/impl/RowConverterImpl.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/processing/src/main/java/org/apache/carbondata/processing/loading/converter/impl/RowConverterImpl.java: Recompile with -Xlint:unchecked for details.
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
	[INFO] Compiling 5 source files to /Users/xubo/Desktop/xubo/git/carbondata1/processing/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ carbondata-processing ---
	[INFO] Surefire report directory: /Users/xubo/Desktop/xubo/git/carbondata1/processing/target/surefire-reports
	
	-------------------------------------------------------
	 T E S T S
	-------------------------------------------------------
	Running org.apache.carbondata.core.keygenerator.directdictionary.timestamp.TimeStampDirectDictionaryGeneratorTest
	log4j:WARN No appenders could be found for logger (org.apache.carbondata.core.util.CarbonProperties).
	log4j:WARN Please initialize the log4j system properly.
	log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
	Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.522 sec - in org.apache.carbondata.core.keygenerator.directdictionary.timestamp.TimeStampDirectDictionaryGeneratorTest
	Running org.apache.carbondata.processing.loading.csvinput.CSVInputFormatTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.305 sec - in org.apache.carbondata.processing.loading.csvinput.CSVInputFormatTest
	Running org.apache.carbondata.processing.util.CarbonLoaderUtilTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.027 sec - in org.apache.carbondata.processing.util.CarbonLoaderUtilTest
	Running org.apache.carbondata.lcm.locks.LocalFileLockTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.028 sec - in org.apache.carbondata.lcm.locks.LocalFileLockTest
	
	Results :
	
	Tests run: 11, Failures: 0, Errors: 0, Skipped: 0
	
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-processing ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata1/processing/target/carbondata-processing-1.6.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-processing ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-processing ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata1/processing/target/jacoco-it.exec,append=true
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-processing ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-processing ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata1/processing/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata1/processing/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 1 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-processing ---
	[INFO] Loading execution data file /Users/xubo/Desktop/xubo/git/carbondata1/processing/target/jacoco.exec
	[INFO] Analyzed bundle 'Apache CarbonData :: Processing' with 203 classes
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-processing ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-processing ---
	[INFO] Loading execution data file /Users/xubo/Desktop/xubo/git/carbondata1/processing/target/jacoco.exec
	[INFO] Analyzed bundle 'carbondata-processing' with 0 classes
	[INFO] All coverage checks have been met.
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-processing ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata1/processing/target/carbondata-processing-1.6.0-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-processing/1.6.0-SNAPSHOT/carbondata-processing-1.6.0-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata1/processing/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-processing/1.6.0-SNAPSHOT/carbondata-processing-1.6.0-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Hadoop 1.6.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-hadoop ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-hadoop ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata1/hadoop/target/jacoco.exec,append=true
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-hadoop ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-hadoop ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata1/hadoop/src/main/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-hadoop ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 21 source files to /Users/xubo/Desktop/xubo/git/carbondata1/hadoop/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/hadoop/src/main/java/org/apache/carbondata/hadoop/readsupport/impl/DictionaryDecodeReadSupport.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/hadoop/src/main/java/org/apache/carbondata/hadoop/readsupport/impl/DictionaryDecodeReadSupport.java: Recompile with -Xlint:unchecked for details.
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
	[INFO] Compiling 3 source files to /Users/xubo/Desktop/xubo/git/carbondata1/hadoop/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ carbondata-hadoop ---
	[INFO] Surefire report directory: /Users/xubo/Desktop/xubo/git/carbondata1/hadoop/target/surefire-reports
	
	-------------------------------------------------------
	 T E S T S
	-------------------------------------------------------
	Running org.apache.carbondata.hadoop.test.util.ObjectSerializationUtilTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.192 sec - in org.apache.carbondata.hadoop.test.util.ObjectSerializationUtilTest
	Running org.apache.carbondata.hadoop.ft.CarbonTableOutputFormatTest
	log4j:WARN No appenders could be found for logger (org.apache.carbondata.core.util.CarbonProperties).
	log4j:WARN Please initialize the log4j system properly.
	log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.854 sec - in org.apache.carbondata.hadoop.ft.CarbonTableOutputFormatTest
	Running org.apache.carbondata.hadoop.ft.CarbonTableInputFormatTest
	Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.961 sec - in org.apache.carbondata.hadoop.ft.CarbonTableInputFormatTest
	
	Results :
	
	Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
	
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-hadoop ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata1/hadoop/target/carbondata-hadoop-1.6.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-hadoop ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-hadoop ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata1/hadoop/target/jacoco-it.exec,append=true
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-hadoop ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-hadoop ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata1/hadoop/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata1/hadoop/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 1 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-hadoop ---
	[INFO] Loading execution data file /Users/xubo/Desktop/xubo/git/carbondata1/hadoop/target/jacoco.exec
	[INFO] Analyzed bundle 'Apache CarbonData :: Hadoop' with 23 classes
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-hadoop ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-hadoop ---
	[INFO] Loading execution data file /Users/xubo/Desktop/xubo/git/carbondata1/hadoop/target/jacoco.exec
	[INFO] Analyzed bundle 'carbondata-hadoop' with 0 classes
	[INFO] All coverage checks have been met.
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-hadoop ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata1/hadoop/target/carbondata-hadoop-1.6.0-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-hadoop/1.6.0-SNAPSHOT/carbondata-hadoop-1.6.0-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata1/hadoop/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-hadoop/1.6.0-SNAPSHOT/carbondata-hadoop-1.6.0-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Streaming 1.6.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-streaming ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-streaming ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata1/streaming/target/jacoco.exec
	[INFO] 
	[INFO] --- maven-remote-resources-plugin:1.5:process (default) @ carbondata-streaming ---
	[INFO] 
	[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ carbondata-streaming ---
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata1/streaming/src/resources
	[INFO] Copying 0 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:compile (default) @ carbondata-streaming ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/streaming/src/main/java:-1: info: compiling
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/streaming/src/main/scala:-1: info: compiling
	[INFO] Compiling 13 source files to /Users/xubo/Desktop/xubo/git/carbondata1/streaming/target/classes at 1544190339628
	[INFO] prepare-compile in 0 s
	[INFO] compile in 3 s
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-streaming ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 11 source files to /Users/xubo/Desktop/xubo/git/carbondata1/streaming/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/streaming/src/main/java/org/apache/carbondata/streaming/segment/StreamSegment.java: /Users/xubo/Desktop/xubo/git/carbondata1/streaming/src/main/java/org/apache/carbondata/streaming/segment/StreamSegment.java uses or overrides a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/streaming/src/main/java/org/apache/carbondata/streaming/segment/StreamSegment.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/streaming/src/main/java/org/apache/carbondata/streaming/CarbonStreamInputFormat.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/streaming/src/main/java/org/apache/carbondata/streaming/CarbonStreamInputFormat.java: Recompile with -Xlint:unchecked for details.
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
	[INFO] skip non existing resourceDirectory /Users/xubo/Desktop/xubo/git/carbondata1/streaming/src/test/resources
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-streaming ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 1 source file to /Users/xubo/Desktop/xubo/git/carbondata1/streaming/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18:test (default-test) @ carbondata-streaming ---
	[INFO] Surefire report directory: /Users/xubo/Desktop/xubo/git/carbondata1/streaming/target/surefire-reports
	
	-------------------------------------------------------
	 T E S T S
	-------------------------------------------------------
	Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=512m; support was removed in 8.0
	Running org.apache.carbondata.streaming.CarbonStreamOutputFormatTest
	log4j:WARN No appenders could be found for logger (org.apache.carbondata.core.metadata.schema.table.TableInfo).
	log4j:WARN Please initialize the log4j system properly.
	log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.27 sec - in org.apache.carbondata.streaming.CarbonStreamOutputFormatTest
	
	Results :
	
	
	
	
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
	
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:testCompile (testCompile) @ carbondata-streaming ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/streaming/src/test/java:-1: info: compiling
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/streaming/target/generated-test-sources/test-annotations:-1: info: compiling
	[INFO] Compiling 1 source files to /Users/xubo/Desktop/xubo/git/carbondata1/streaming/target/test-classes at 1544190352746
	[INFO] prepare-compile in 0 s
	[INFO] compile in 2 s
	[INFO] 
	[INFO] --- scalatest-maven-plugin:1.0:test (test) @ carbondata-streaming ---
	Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=512m; support was removed in 8.0
	Discovery starting.
	Discovery completed in 439 milliseconds.
	Run starting. Expected test count is: 0
	DiscoverySuite:
	Run completed in 653 milliseconds.
	Total number of tests run: 0
	Suites: completed 1, aborted 0
	Tests: succeeded 0, failed 0, canceled 0, ignored 0, pending 0
	No tests were executed.
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-streaming ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata1/streaming/target/carbondata-streaming-1.6.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-streaming ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent-integration (default-prepare-agent-integration) @ carbondata-streaming ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata1/streaming/target/jacoco-it.exec
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-streaming ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-streaming ---
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata1/streaming/target/scalastyle-output.xml
	Processed 2 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 1130 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-streaming ---
	[INFO] Loading execution data file /Users/xubo/Desktop/xubo/git/carbondata1/streaming/target/jacoco.exec
	[INFO] Analyzed bundle 'Apache CarbonData :: Streaming' with 17 classes
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-streaming ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-streaming ---
	[INFO] Loading execution data file /Users/xubo/Desktop/xubo/git/carbondata1/streaming/target/jacoco.exec
	[INFO] Analyzed bundle 'carbondata-streaming' with 0 classes
	[INFO] All coverage checks have been met.
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-streaming ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata1/streaming/target/carbondata-streaming-1.6.0-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-streaming/1.6.0-SNAPSHOT/carbondata-streaming-1.6.0-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata1/streaming/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-streaming/1.6.0-SNAPSHOT/carbondata-streaming-1.6.0-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Store SDK 1.6.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-store-sdk ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-store-sdk ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/target/jacoco.exec
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
	[INFO] Compiling 16 source files to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/target/classes
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/src/main/java/org/apache/carbondata/sdk/file/CarbonReaderBuilder.java: Some input files use or override a deprecated API.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/src/main/java/org/apache/carbondata/sdk/file/CarbonReaderBuilder.java: Recompile with -Xlint:deprecation for details.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/src/main/java/org/apache/carbondata/sdk/file/TestUtil.java: Some input files use unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/src/main/java/org/apache/carbondata/sdk/file/TestUtil.java: Recompile with -Xlint:unchecked for details.
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
	[INFO] Copying 0 resource
	[INFO] Copying 3 resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ carbondata-store-sdk ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 8 source files to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/target/test-classes
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/src/test/java/org/apache/carbondata/sdk/file/ConcurrentSdkReaderTest.java: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/src/test/java/org/apache/carbondata/sdk/file/ConcurrentSdkReaderTest.java uses unchecked or unsafe operations.
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/src/test/java/org/apache/carbondata/sdk/file/ConcurrentSdkReaderTest.java: Recompile with -Xlint:unchecked for details.
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ carbondata-store-sdk ---
	[INFO] Surefire report directory: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/target/surefire-reports
	
	-------------------------------------------------------
	 T E S T S
	-------------------------------------------------------
	Running org.apache.carbondata.sdk.file.ConcurrentSdkReaderTest
	2018-12-07 21:46:09 INFO  CarbonProperties:707 - Property file path: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/../../../conf/carbon.properties
	2018-12-07 21:46:09 INFO  CarbonProperties:900 - ------Using Carbon.properties --------
	2018-12-07 21:46:09 INFO  CarbonProperties:901 - {}
	2018-12-07 21:46:09 INFO  CarbonProperties:693 - Considered file format is: V3
	2018-12-07 21:46:09 INFO  CarbonProperties:587 - Blocklet Size Configured value is "64
	2018-12-07 21:46:09 WARN  CarbonProperties:465 - The enable unsafe sort value "null" is invalid. Using the default value "true
	2018-12-07 21:46:09 WARN  CarbonProperties:477 - The enable off heap sort value "null" is invalid. Using the default value "true
	2018-12-07 21:46:09 WARN  CarbonProperties:438 - The custom block distribution value "null" is invalid. Using the default value "false
	2018-12-07 21:46:09 WARN  CarbonProperties:425 - The enable vector reader value "null" is invalid. Using the default value "true
	2018-12-07 21:46:09 WARN  CarbonProperties:453 - The carbon task distribution value "null" is invalid. Using the default value "block
	2018-12-07 21:46:09 WARN  CarbonProperties:556 - The enable auto handoff value "null" is invalid. Using the default value "true
	2018-12-07 21:46:09 WARN  CarbonProperties:1298 - The specified value for property 512is invalid.
	2018-12-07 21:46:09 WARN  CarbonProperties:1309 - The specified value for property carbon.sort.storage.inmemory.size.inmbis invalid. Taking the default value.512
	2018-12-07 21:46:09 INFO  CarbonProperties:1512 - Considered value for min max byte limit for string is: 200
	2018-12-07 21:46:10 WARN  NativeCodeLoader:62 - Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
	2018-12-07 21:46:10 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:10 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:10 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:10 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45197533457311_attempt_2723923e-8c3e-46e9-bfb4-fbfdb567c68b_0000_m_-1545280713_785261487/Fact/Part0/Segment_null/45197533396907/sortrowtmp
	2018-12-07 21:46:10 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:10 INFO  UnsafeSortMemoryManager:111 - Sort Memory manager is created with size 536870912 with org.apache.carbondata.core.memory.UnsafeMemoryAllocator@249328d
	2018-12-07 21:46:10 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:10 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45196479974155
	2018-12-07 21:46:10 WARN  UnsafeMemoryManager:80 - It is not recommended to set offheap working memory size less than 512MB, so setting default value to 512
	2018-12-07 21:46:10 INFO  UnsafeMemoryManager:106 - Offheap Working Memory manager is created with size 536870912 with OFFHEAP
	2018-12-07 21:46:10 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:10 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 101
	2018-12-07 21:46:10 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45196479974155
	2018-12-07 21:46:10 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:10 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:10 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:10 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:10 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45197533457311_attempt_2723923e-8c3e-46e9-bfb4-fbfdb567c68b_0000_m_-1545280713_785261487/Fact/Part0/Segment_null/45197533396907
	2018-12-07 21:46:10 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:10 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:10 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45197533457311_attempt_2723923e-8c3e-46e9-bfb4-fbfdb567c68b_0000_m_-1545280713_785261487/Fact/Part0/Segment_null/45197533396907
	2018-12-07 21:46:10 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:10 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45197533457311_attempt_2723923e-8c3e-46e9-bfb4-fbfdb567c68b_0000_m_-1545280713_785261487/Fact/Part0/Segment_null/45197533396907/part-0-45197533396907_batchno0-0-null-45196479974155.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190370743
	2018-12-07 21:46:10 INFO  CarbonUtil:2747 - Total copy time is 4 ms, operation id 1544190370743
	2018-12-07 21:46:10 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45197533457311_attempt_2723923e-8c3e-46e9-bfb4-fbfdb567c68b_0000_m_-1545280713_785261487/Fact/Part0/Segment_null/45197533396907
	2018-12-07 21:46:10 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45197533457311_attempt_2723923e-8c3e-46e9-bfb4-fbfdb567c68b_0000_m_-1545280713_785261487/Fact/Part0/Segment_null/45197533396907/45197533396907_batchno0-0-null-45196479974155.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190370767
	2018-12-07 21:46:10 INFO  CarbonUtil:2747 - Total copy time is 3 ms, operation id 1544190370767
	2018-12-07 21:46:10 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:10 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:10 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:10 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:10 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_2723923e-8c3e-46e9-bfb4-fbfdb567c68b_0000_m_-1545280713_785261487
	2018-12-07 21:46:10 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45197533457311_attempt_2723923e-8c3e-46e9-bfb4-fbfdb567c68b_0000_m_-1545280713_785261487 : Time taken: 3
	2018-12-07 21:46:10 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:10 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:10 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:10 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198096222782_attempt_c025395a-3767-4d3b-99c2-4a04607f5887_0000_m_1944686664_-2070821652/Fact/Part0/Segment_null/45198096176354/sortrowtmp
	2018-12-07 21:46:10 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:10 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:10 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45198055213854
	2018-12-07 21:46:10 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:10 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 58
	2018-12-07 21:46:10 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45198055213854
	2018-12-07 21:46:10 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:10 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:10 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:10 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:10 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198096222782_attempt_c025395a-3767-4d3b-99c2-4a04607f5887_0000_m_1944686664_-2070821652/Fact/Part0/Segment_null/45198096176354
	2018-12-07 21:46:10 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:10 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:10 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198096222782_attempt_c025395a-3767-4d3b-99c2-4a04607f5887_0000_m_1944686664_-2070821652/Fact/Part0/Segment_null/45198096176354
	2018-12-07 21:46:10 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:11 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198096222782_attempt_c025395a-3767-4d3b-99c2-4a04607f5887_0000_m_1944686664_-2070821652/Fact/Part0/Segment_null/45198096176354/part-0-45198096176354_batchno0-0-null-45198055213854.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190370999
	2018-12-07 21:46:11 INFO  CarbonUtil:2747 - Total copy time is 3 ms, operation id 1544190370999
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198096222782_attempt_c025395a-3767-4d3b-99c2-4a04607f5887_0000_m_1944686664_-2070821652/Fact/Part0/Segment_null/45198096176354
	2018-12-07 21:46:11 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198096222782_attempt_c025395a-3767-4d3b-99c2-4a04607f5887_0000_m_1944686664_-2070821652/Fact/Part0/Segment_null/45198096176354/45198096176354_batchno0-0-null-45198055213854.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190371005
	2018-12-07 21:46:11 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190371005
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:11 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_c025395a-3767-4d3b-99c2-4a04607f5887_0000_m_1944686664_-2070821652
	2018-12-07 21:46:11 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198096222782_attempt_c025395a-3767-4d3b-99c2-4a04607f5887_0000_m_1944686664_-2070821652 : Time taken: 1
	2018-12-07 21:46:11 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:11 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:11 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:11 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198294420715_attempt_cab53237-2868-446e-8eaf-e0b1c2f47304_0000_m_470725170_-2447608/Fact/Part0/Segment_null/45198294400757/sortrowtmp
	2018-12-07 21:46:11 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:11 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:11 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45198286630322
	2018-12-07 21:46:11 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:11 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 56
	2018-12-07 21:46:11 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45198286630322
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:11 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:11 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198294420715_attempt_cab53237-2868-446e-8eaf-e0b1c2f47304_0000_m_470725170_-2447608/Fact/Part0/Segment_null/45198294400757
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198294420715_attempt_cab53237-2868-446e-8eaf-e0b1c2f47304_0000_m_470725170_-2447608/Fact/Part0/Segment_null/45198294400757
	2018-12-07 21:46:11 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:11 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198294420715_attempt_cab53237-2868-446e-8eaf-e0b1c2f47304_0000_m_470725170_-2447608/Fact/Part0/Segment_null/45198294400757/part-0-45198294400757_batchno0-0-null-45198286630322.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190371166
	2018-12-07 21:46:11 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190371166
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198294420715_attempt_cab53237-2868-446e-8eaf-e0b1c2f47304_0000_m_470725170_-2447608/Fact/Part0/Segment_null/45198294400757
	2018-12-07 21:46:11 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198294420715_attempt_cab53237-2868-446e-8eaf-e0b1c2f47304_0000_m_470725170_-2447608/Fact/Part0/Segment_null/45198294400757/45198294400757_batchno0-0-null-45198286630322.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190371169
	2018-12-07 21:46:11 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190371169
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:11 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_cab53237-2868-446e-8eaf-e0b1c2f47304_0000_m_470725170_-2447608
	2018-12-07 21:46:11 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198294420715_attempt_cab53237-2868-446e-8eaf-e0b1c2f47304_0000_m_470725170_-2447608 : Time taken: 1
	2018-12-07 21:46:11 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:11 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:11 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:11 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198460240321_attempt_4349d6e5-2586-476b-9c51-3af261749d33_0000_m_-44407188_-746775431/Fact/Part0/Segment_null/45198460220617/sortrowtmp
	2018-12-07 21:46:11 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:11 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:11 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45198452105123
	2018-12-07 21:46:11 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:11 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 56
	2018-12-07 21:46:11 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45198452105123
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:11 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:11 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198460240321_attempt_4349d6e5-2586-476b-9c51-3af261749d33_0000_m_-44407188_-746775431/Fact/Part0/Segment_null/45198460220617
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198460240321_attempt_4349d6e5-2586-476b-9c51-3af261749d33_0000_m_-44407188_-746775431/Fact/Part0/Segment_null/45198460220617
	2018-12-07 21:46:11 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:11 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198460240321_attempt_4349d6e5-2586-476b-9c51-3af261749d33_0000_m_-44407188_-746775431/Fact/Part0/Segment_null/45198460220617/part-0-45198460220617_batchno0-0-null-45198452105123.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190371327
	2018-12-07 21:46:11 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190371327
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198460240321_attempt_4349d6e5-2586-476b-9c51-3af261749d33_0000_m_-44407188_-746775431/Fact/Part0/Segment_null/45198460220617
	2018-12-07 21:46:11 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198460240321_attempt_4349d6e5-2586-476b-9c51-3af261749d33_0000_m_-44407188_-746775431/Fact/Part0/Segment_null/45198460220617/45198460220617_batchno0-0-null-45198452105123.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190371331
	2018-12-07 21:46:11 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190371331
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:11 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_4349d6e5-2586-476b-9c51-3af261749d33_0000_m_-44407188_-746775431
	2018-12-07 21:46:11 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198460240321_attempt_4349d6e5-2586-476b-9c51-3af261749d33_0000_m_-44407188_-746775431 : Time taken: 2
	2018-12-07 21:46:11 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:11 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:11 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:11 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198623001919_attempt_33ee198b-8450-40a1-a943-01694aa73ce8_0000_m_467059348_-488724732/Fact/Part0/Segment_null/45198622979985/sortrowtmp
	2018-12-07 21:46:11 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:11 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:11 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45198614438604
	2018-12-07 21:46:11 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:11 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 35
	2018-12-07 21:46:11 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45198614438604
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:11 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:11 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198623001919_attempt_33ee198b-8450-40a1-a943-01694aa73ce8_0000_m_467059348_-488724732/Fact/Part0/Segment_null/45198622979985
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198623001919_attempt_33ee198b-8450-40a1-a943-01694aa73ce8_0000_m_467059348_-488724732/Fact/Part0/Segment_null/45198622979985
	2018-12-07 21:46:11 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:11 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198623001919_attempt_33ee198b-8450-40a1-a943-01694aa73ce8_0000_m_467059348_-488724732/Fact/Part0/Segment_null/45198622979985/part-0-45198622979985_batchno0-0-null-45198614438604.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190371473
	2018-12-07 21:46:11 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190371473
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198623001919_attempt_33ee198b-8450-40a1-a943-01694aa73ce8_0000_m_467059348_-488724732/Fact/Part0/Segment_null/45198622979985
	2018-12-07 21:46:11 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198623001919_attempt_33ee198b-8450-40a1-a943-01694aa73ce8_0000_m_467059348_-488724732/Fact/Part0/Segment_null/45198622979985/45198622979985_batchno0-0-null-45198614438604.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190371479
	2018-12-07 21:46:11 INFO  CarbonUtil:2747 - Total copy time is 3 ms, operation id 1544190371479
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:11 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_33ee198b-8450-40a1-a943-01694aa73ce8_0000_m_467059348_-488724732
	2018-12-07 21:46:11 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198623001919_attempt_33ee198b-8450-40a1-a943-01694aa73ce8_0000_m_467059348_-488724732 : Time taken: 2
	2018-12-07 21:46:11 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:11 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:11 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:11 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198771382457_attempt_440ed465-3c6e-43f4-b4a7-471dd04ecfa2_0000_m_-1079051960_282220034/Fact/Part0/Segment_null/45198771355268/sortrowtmp
	2018-12-07 21:46:11 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:11 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:11 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45198764492687
	2018-12-07 21:46:11 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:11 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 54
	2018-12-07 21:46:11 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45198764492687
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:11 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:11 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198771382457_attempt_440ed465-3c6e-43f4-b4a7-471dd04ecfa2_0000_m_-1079051960_282220034/Fact/Part0/Segment_null/45198771355268
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198771382457_attempt_440ed465-3c6e-43f4-b4a7-471dd04ecfa2_0000_m_-1079051960_282220034/Fact/Part0/Segment_null/45198771355268
	2018-12-07 21:46:11 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:11 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198771382457_attempt_440ed465-3c6e-43f4-b4a7-471dd04ecfa2_0000_m_-1079051960_282220034/Fact/Part0/Segment_null/45198771355268/part-0-45198771355268_batchno0-0-null-45198764492687.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190371644
	2018-12-07 21:46:11 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190371644
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198771382457_attempt_440ed465-3c6e-43f4-b4a7-471dd04ecfa2_0000_m_-1079051960_282220034/Fact/Part0/Segment_null/45198771355268
	2018-12-07 21:46:11 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198771382457_attempt_440ed465-3c6e-43f4-b4a7-471dd04ecfa2_0000_m_-1079051960_282220034/Fact/Part0/Segment_null/45198771355268/45198771355268_batchno0-0-null-45198764492687.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190371648
	2018-12-07 21:46:11 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190371648
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:11 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_440ed465-3c6e-43f4-b4a7-471dd04ecfa2_0000_m_-1079051960_282220034
	2018-12-07 21:46:11 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198771382457_attempt_440ed465-3c6e-43f4-b4a7-471dd04ecfa2_0000_m_-1079051960_282220034 : Time taken: 1
	2018-12-07 21:46:11 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:11 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:11 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:11 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198936404713_attempt_4902f9eb-cf56-402e-9f84-7595bf64f2eb_0000_m_-1306103488_-1321841605/Fact/Part0/Segment_null/45198936385434/sortrowtmp
	2018-12-07 21:46:11 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:11 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:11 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45198930255241
	2018-12-07 21:46:11 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:11 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 73
	2018-12-07 21:46:11 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45198930255241
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:11 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:11 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198936404713_attempt_4902f9eb-cf56-402e-9f84-7595bf64f2eb_0000_m_-1306103488_-1321841605/Fact/Part0/Segment_null/45198936385434
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198936404713_attempt_4902f9eb-cf56-402e-9f84-7595bf64f2eb_0000_m_-1306103488_-1321841605/Fact/Part0/Segment_null/45198936385434
	2018-12-07 21:46:11 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:11 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198936404713_attempt_4902f9eb-cf56-402e-9f84-7595bf64f2eb_0000_m_-1306103488_-1321841605/Fact/Part0/Segment_null/45198936385434/part-0-45198936385434_batchno0-0-null-45198930255241.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190371835
	2018-12-07 21:46:11 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190371835
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198936404713_attempt_4902f9eb-cf56-402e-9f84-7595bf64f2eb_0000_m_-1306103488_-1321841605/Fact/Part0/Segment_null/45198936385434
	2018-12-07 21:46:11 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198936404713_attempt_4902f9eb-cf56-402e-9f84-7595bf64f2eb_0000_m_-1306103488_-1321841605/Fact/Part0/Segment_null/45198936385434/45198936385434_batchno0-0-null-45198930255241.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190371838
	2018-12-07 21:46:11 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190371838
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:11 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:11 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_4902f9eb-cf56-402e-9f84-7595bf64f2eb_0000_m_-1306103488_-1321841605
	2018-12-07 21:46:11 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45198936404713_attempt_4902f9eb-cf56-402e-9f84-7595bf64f2eb_0000_m_-1306103488_-1321841605 : Time taken: 2
	2018-12-07 21:46:11 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:11 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:11 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:11 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199127483155_attempt_74af1043-92f8-438d-b72a-580da4871cdc_0000_m_534702230_856473218/Fact/Part0/Segment_null/45199127456296/sortrowtmp
	2018-12-07 21:46:11 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:11 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:11 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45199120650016
	2018-12-07 21:46:11 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:11 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 64
	2018-12-07 21:46:11 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45199120650016
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:11 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:11 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:11 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199127483155_attempt_74af1043-92f8-438d-b72a-580da4871cdc_0000_m_534702230_856473218/Fact/Part0/Segment_null/45199127456296
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:11 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199127483155_attempt_74af1043-92f8-438d-b72a-580da4871cdc_0000_m_534702230_856473218/Fact/Part0/Segment_null/45199127456296
	2018-12-07 21:46:11 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:12 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199127483155_attempt_74af1043-92f8-438d-b72a-580da4871cdc_0000_m_534702230_856473218/Fact/Part0/Segment_null/45199127456296/part-0-45199127456296_batchno0-0-null-45199120650016.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190372006
	2018-12-07 21:46:12 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190372006
	2018-12-07 21:46:12 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199127483155_attempt_74af1043-92f8-438d-b72a-580da4871cdc_0000_m_534702230_856473218/Fact/Part0/Segment_null/45199127456296
	2018-12-07 21:46:12 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199127483155_attempt_74af1043-92f8-438d-b72a-580da4871cdc_0000_m_534702230_856473218/Fact/Part0/Segment_null/45199127456296/45199127456296_batchno0-0-null-45199120650016.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190372008
	2018-12-07 21:46:12 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190372008
	2018-12-07 21:46:12 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:12 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:12 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:12 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:12 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_74af1043-92f8-438d-b72a-580da4871cdc_0000_m_534702230_856473218
	2018-12-07 21:46:12 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199127483155_attempt_74af1043-92f8-438d-b72a-580da4871cdc_0000_m_534702230_856473218 : Time taken: 1
	2018-12-07 21:46:12 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:12 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:12 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:12 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199295410490_attempt_774d1dc6-a058-4d18-9af2-5aa89a73a32b_0000_m_505818430_-2123880281/Fact/Part0/Segment_null/45199295395534/sortrowtmp
	2018-12-07 21:46:12 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:12 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:12 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45199290187973
	2018-12-07 21:46:12 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:12 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 42
	2018-12-07 21:46:12 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45199290187973
	2018-12-07 21:46:12 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:12 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:12 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:12 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:12 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199295410490_attempt_774d1dc6-a058-4d18-9af2-5aa89a73a32b_0000_m_505818430_-2123880281/Fact/Part0/Segment_null/45199295395534
	2018-12-07 21:46:12 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:12 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:12 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199295410490_attempt_774d1dc6-a058-4d18-9af2-5aa89a73a32b_0000_m_505818430_-2123880281/Fact/Part0/Segment_null/45199295395534
	2018-12-07 21:46:12 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:12 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199295410490_attempt_774d1dc6-a058-4d18-9af2-5aa89a73a32b_0000_m_505818430_-2123880281/Fact/Part0/Segment_null/45199295395534/part-0-45199295395534_batchno0-0-null-45199290187973.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190372149
	2018-12-07 21:46:12 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190372149
	2018-12-07 21:46:12 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199295410490_attempt_774d1dc6-a058-4d18-9af2-5aa89a73a32b_0000_m_505818430_-2123880281/Fact/Part0/Segment_null/45199295395534
	2018-12-07 21:46:12 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199295410490_attempt_774d1dc6-a058-4d18-9af2-5aa89a73a32b_0000_m_505818430_-2123880281/Fact/Part0/Segment_null/45199295395534/45199295395534_batchno0-0-null-45199290187973.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190372151
	2018-12-07 21:46:12 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190372151
	2018-12-07 21:46:12 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:12 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:12 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:12 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:12 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_774d1dc6-a058-4d18-9af2-5aa89a73a32b_0000_m_505818430_-2123880281
	2018-12-07 21:46:12 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199295410490_attempt_774d1dc6-a058-4d18-9af2-5aa89a73a32b_0000_m_505818430_-2123880281 : Time taken: 2
	2018-12-07 21:46:12 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:12 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:12 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:12 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199441695732_attempt_4f4b0946-7c96-4ba0-82a4-2470c56eb383_0000_m_-807350398_-1287645403/Fact/Part0/Segment_null/45199441678011/sortrowtmp
	2018-12-07 21:46:12 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:12 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:12 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45199434524829
	2018-12-07 21:46:12 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:12 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 36
	2018-12-07 21:46:12 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45199434524829
	2018-12-07 21:46:12 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:12 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:12 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:12 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:12 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199441695732_attempt_4f4b0946-7c96-4ba0-82a4-2470c56eb383_0000_m_-807350398_-1287645403/Fact/Part0/Segment_null/45199441678011
	2018-12-07 21:46:12 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:12 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:12 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199441695732_attempt_4f4b0946-7c96-4ba0-82a4-2470c56eb383_0000_m_-807350398_-1287645403/Fact/Part0/Segment_null/45199441678011
	2018-12-07 21:46:12 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:12 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199441695732_attempt_4f4b0946-7c96-4ba0-82a4-2470c56eb383_0000_m_-807350398_-1287645403/Fact/Part0/Segment_null/45199441678011/part-0-45199441678011_batchno0-0-null-45199434524829.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190372294
	2018-12-07 21:46:12 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190372294
	2018-12-07 21:46:12 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199441695732_attempt_4f4b0946-7c96-4ba0-82a4-2470c56eb383_0000_m_-807350398_-1287645403/Fact/Part0/Segment_null/45199441678011
	2018-12-07 21:46:12 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199441695732_attempt_4f4b0946-7c96-4ba0-82a4-2470c56eb383_0000_m_-807350398_-1287645403/Fact/Part0/Segment_null/45199441678011/45199441678011_batchno0-0-null-45199434524829.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testReadFiles, operation id 1544190372296
	2018-12-07 21:46:12 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190372296
	2018-12-07 21:46:12 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:12 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:12 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:12 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:12 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_4f4b0946-7c96-4ba0-82a4-2470c56eb383_0000_m_-807350398_-1287645403
	2018-12-07 21:46:12 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45199441695732_attempt_4f4b0946-7c96-4ba0-82a4-2470c56eb383_0000_m_-807350398_-1287645403 : Time taken: 1
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	[Sequential read] Time: 76 ms
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, intfield]
	2018-12-07 21:46:12 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:12 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	[Parallel read] Time: 14 ms
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.431 sec - in org.apache.carbondata.sdk.file.ConcurrentSdkReaderTest
	Running org.apache.carbondata.sdk.file.AvroCarbonWriterTest
	2018-12-07 21:46:13 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:13 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:13 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:13 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200315596737_attempt_1b7237e1-1f83-4821-baf4-cae53497337d_0000_m_2107821420_-2070572923/Fact/Part0/Segment_null/45200315570582/sortrowtmp
	2018-12-07 21:46:13 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:13 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:13 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45200305807799
	2018-12-07 21:46:13 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:13 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 36
	2018-12-07 21:46:13 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45200305807799
	2018-12-07 21:46:13 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:13 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:13 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:13 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:13 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200315596737_attempt_1b7237e1-1f83-4821-baf4-cae53497337d_0000_m_2107821420_-2070572923/Fact/Part0/Segment_null/45200315570582
	2018-12-07 21:46:13 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:13 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:13 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200315596737_attempt_1b7237e1-1f83-4821-baf4-cae53497337d_0000_m_2107821420_-2070572923/Fact/Part0/Segment_null/45200315570582
	2018-12-07 21:46:13 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:13 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200315596737_attempt_1b7237e1-1f83-4821-baf4-cae53497337d_0000_m_2107821420_-2070572923/Fact/Part0/Segment_null/45200315570582/part-0-45200315570582_batchno0-0-null-45200305807799.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/AvroCarbonWriterSuiteWriteFiles, operation id 1544190373176
	2018-12-07 21:46:13 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190373176
	2018-12-07 21:46:13 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200315596737_attempt_1b7237e1-1f83-4821-baf4-cae53497337d_0000_m_2107821420_-2070572923/Fact/Part0/Segment_null/45200315570582
	2018-12-07 21:46:13 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200315596737_attempt_1b7237e1-1f83-4821-baf4-cae53497337d_0000_m_2107821420_-2070572923/Fact/Part0/Segment_null/45200315570582/45200315570582_batchno0-0-null-45200305807799.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/AvroCarbonWriterSuiteWriteFiles, operation id 1544190373178
	2018-12-07 21:46:13 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190373178
	2018-12-07 21:46:13 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:13 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:13 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:13 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_1b7237e1-1f83-4821-baf4-cae53497337d_0000_m_2107821420_-2070572923
	2018-12-07 21:46:13 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200315596737_attempt_1b7237e1-1f83-4821-baf4-cae53497337d_0000_m_2107821420_-2070572923 : Time taken: 1
	2018-12-07 21:46:13 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:13 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:13 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:13 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200468742375_attempt_64c364cd-7bd4-43b6-a182-ed8e814137b4_0000_m_-1769491961_691717759/Fact/Part0/Segment_null/45200468726901/sortrowtmp
	2018-12-07 21:46:13 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:13 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:13 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45200463823898
	2018-12-07 21:46:13 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:13 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 83
	2018-12-07 21:46:13 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45200463823898
	2018-12-07 21:46:13 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:13 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:13 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:13 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:13 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200468742375_attempt_64c364cd-7bd4-43b6-a182-ed8e814137b4_0000_m_-1769491961_691717759/Fact/Part0/Segment_null/45200468726901
	2018-12-07 21:46:13 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:13 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:13 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200468742375_attempt_64c364cd-7bd4-43b6-a182-ed8e814137b4_0000_m_-1769491961_691717759/Fact/Part0/Segment_null/45200468726901
	2018-12-07 21:46:13 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:13 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200468742375_attempt_64c364cd-7bd4-43b6-a182-ed8e814137b4_0000_m_-1769491961_691717759/Fact/Part0/Segment_null/45200468726901/part-0-45200468726901_batchno0-0-null-45200463823898.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/AvroCarbonWriterSuiteWriteFiles, operation id 1544190373396
	2018-12-07 21:46:13 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190373396
	2018-12-07 21:46:13 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200468742375_attempt_64c364cd-7bd4-43b6-a182-ed8e814137b4_0000_m_-1769491961_691717759/Fact/Part0/Segment_null/45200468726901
	2018-12-07 21:46:13 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200468742375_attempt_64c364cd-7bd4-43b6-a182-ed8e814137b4_0000_m_-1769491961_691717759/Fact/Part0/Segment_null/45200468726901/45200468726901_batchno0-0-null-45200463823898.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/AvroCarbonWriterSuiteWriteFiles, operation id 1544190373399
	2018-12-07 21:46:13 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190373399
	2018-12-07 21:46:13 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:13 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:13 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:13 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_64c364cd-7bd4-43b6-a182-ed8e814137b4_0000_m_-1769491961_691717759
	2018-12-07 21:46:13 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200468742375_attempt_64c364cd-7bd4-43b6-a182-ed8e814137b4_0000_m_-1769491961_691717759 : Time taken: 2
	java.lang.RuntimeException: sort columns not supported for array, struct, map, double, float, decimal,varchar
		at org.apache.carbondata.sdk.file.CarbonWriterBuilder.buildTableSchema(CarbonWriterBuilder.java:642)
		at org.apache.carbondata.sdk.file.CarbonWriterBuilder.buildCarbonTable(CarbonWriterBuilder.java:573)
		at org.apache.carbondata.sdk.file.CarbonWriterBuilder.buildLoadModel(CarbonWriterBuilder.java:505)
		at org.apache.carbondata.sdk.file.CarbonWriterBuilder.build(CarbonWriterBuilder.java:449)
		at org.apache.carbondata.sdk.file.AvroCarbonWriterTest.WriteAvroComplexData(AvroCarbonWriterTest.java:324)
		at org.apache.carbondata.sdk.file.AvroCarbonWriterTest.testWriteComplexRecordWithSortColumns(AvroCarbonWriterTest.java:421)
		at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
		at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
		at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
		at java.lang.reflect.Method.invoke(Method.java:498)
		at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
		at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
		at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
		at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
		at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
		at org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)
		at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
		at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
		at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
		at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
		at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
		at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
		at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
		at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
		at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
		at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:283)
		at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:173)
		at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:153)
		at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:128)
		at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:203)
		at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:155)
		at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:103)
	2018-12-07 21:46:13 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:13 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:13 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:13 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200746570280_attempt_fa099e50-eb19-45d1-b92d-0dfaf0fb2fb7_0000_m_-1617648721_2095364656/Fact/Part0/Segment_null/45200746549833/sortrowtmp
	2018-12-07 21:46:13 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:13 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:13 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45200740748063
	2018-12-07 21:46:13 ERROR UnsafeParallelReadMergeSorterImpl:211 - org.apache.carbondata.processing.loading.exception.BadRecordFoundException: Data load failed due to bad record: The value with column name date and column data type DATE is not a valid DATE type.Please enable bad record logger to know the detail reason.
	2018-12-07 21:46:13 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:13 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45200740748063
	2018-12-07 21:46:13 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 0
	2018-12-07 21:46:13 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 0
	2018-12-07 21:46:13 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 0
	2018-12-07 21:46:13 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 1
	2018-12-07 21:46:13 ERROR CarbonTableOutputFormat:458 - Error while loading data
	java.util.concurrent.ExecutionException: java.lang.RuntimeException: org.apache.carbondata.processing.loading.exception.NoRetryException: Data load failed due to bad record: The value with column name date and column data type DATE is not a valid DATE type.Please enable bad record logger to know the detail reason.
		at java.util.concurrent.FutureTask.report(FutureTask.java:122)
		at java.util.concurrent.FutureTask.get(FutureTask.java:192)
		at org.apache.carbondata.hadoop.api.CarbonTableOutputFormat$CarbonRecordWriter.close(CarbonTableOutputFormat.java:456)
		at org.apache.carbondata.sdk.file.CSVCarbonWriter.close(CSVCarbonWriter.java:81)
		at org.apache.carbondata.sdk.file.AvroCarbonWriterTest.testExceptionForInvalidDate(AvroCarbonWriterTest.java:460)
		at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
		at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
		at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
		at java.lang.reflect.Method.invoke(Method.java:498)
		at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
		at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
		at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
		at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
		at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
		at org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)
		at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
		at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
		at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
		at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
		at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
		at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
		at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
		at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
		at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
		at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:283)
		at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:173)
		at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:153)
		at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:128)
		at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:203)
		at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:155)
		at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:103)
	Caused by: java.lang.RuntimeException: org.apache.carbondata.processing.loading.exception.NoRetryException: Data load failed due to bad record: The value with column name date and column data type DATE is not a valid DATE type.Please enable bad record logger to know the detail reason.
		at org.apache.carbondata.hadoop.api.CarbonTableOutputFormat$1.run(CarbonTableOutputFormat.java:276)
		at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
		at java.lang.Thread.run(Thread.java:748)
	Caused by: org.apache.carbondata.processing.loading.exception.NoRetryException: Data load failed due to bad record: The value with column name date and column data type DATE is not a valid DATE type.Please enable bad record logger to know the detail reason.
		at org.apache.carbondata.processing.loading.DataLoadExecutor.execute(DataLoadExecutor.java:59)
		at org.apache.carbondata.hadoop.api.CarbonTableOutputFormat$1.run(CarbonTableOutputFormat.java:269)
		... 5 more
	2018-12-07 21:46:13 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200746570280_attempt_fa099e50-eb19-45d1-b92d-0dfaf0fb2fb7_0000_m_-1617648721_2095364656 : Time taken: 1
	2018-12-07 21:46:13 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:13 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:13 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:13 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200838954187_attempt_c367c9a3-f6b5-489e-b266-bd094d8f41a3_0000_m_578180987_-37894186/Fact/Part0/Segment_null/45200838933270/sortrowtmp
	2018-12-07 21:46:13 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:13 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:13 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45200830608349
	2018-12-07 21:46:13 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:13 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 58
	2018-12-07 21:46:13 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45200830608349
	2018-12-07 21:46:13 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:13 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:13 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:13 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:13 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200838954187_attempt_c367c9a3-f6b5-489e-b266-bd094d8f41a3_0000_m_578180987_-37894186/Fact/Part0/Segment_null/45200838933270
	2018-12-07 21:46:13 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:13 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:13 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200838954187_attempt_c367c9a3-f6b5-489e-b266-bd094d8f41a3_0000_m_578180987_-37894186/Fact/Part0/Segment_null/45200838933270
	2018-12-07 21:46:13 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:13 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200838954187_attempt_c367c9a3-f6b5-489e-b266-bd094d8f41a3_0000_m_578180987_-37894186/Fact/Part0/Segment_null/45200838933270/part-0-45200838933270_batchno0-0-null-45200830608349.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/AvroCarbonWriterSuiteWriteFiles, operation id 1544190373730
	2018-12-07 21:46:13 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190373730
	2018-12-07 21:46:13 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200838954187_attempt_c367c9a3-f6b5-489e-b266-bd094d8f41a3_0000_m_578180987_-37894186/Fact/Part0/Segment_null/45200838933270
	2018-12-07 21:46:13 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200838954187_attempt_c367c9a3-f6b5-489e-b266-bd094d8f41a3_0000_m_578180987_-37894186/Fact/Part0/Segment_null/45200838933270/45200838933270_batchno0-0-null-45200830608349.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/AvroCarbonWriterSuiteWriteFiles, operation id 1544190373734
	2018-12-07 21:46:13 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190373734
	2018-12-07 21:46:13 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:13 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:13 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:13 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_c367c9a3-f6b5-489e-b266-bd094d8f41a3_0000_m_578180987_-37894186
	2018-12-07 21:46:13 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45200838954187_attempt_c367c9a3-f6b5-489e-b266-bd094d8f41a3_0000_m_578180987_-37894186 : Time taken: 1
	2018-12-07 21:46:13 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:13 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:13 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:13 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201028406935_attempt_a7b1ae19-b327-4652-ad87-e93187228657_0000_m_-1746433911_-727724066/Fact/Part0/Segment_null/45201028392827/sortrowtmp
	2018-12-07 21:46:13 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:13 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:13 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45201022304281
	2018-12-07 21:46:13 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:13 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 49
	2018-12-07 21:46:13 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45201022304281
	2018-12-07 21:46:13 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:13 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:13 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:13 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:13 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201028406935_attempt_a7b1ae19-b327-4652-ad87-e93187228657_0000_m_-1746433911_-727724066/Fact/Part0/Segment_null/45201028392827
	2018-12-07 21:46:13 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:13 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:13 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201028406935_attempt_a7b1ae19-b327-4652-ad87-e93187228657_0000_m_-1746433911_-727724066/Fact/Part0/Segment_null/45201028392827
	2018-12-07 21:46:13 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:13 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201028406935_attempt_a7b1ae19-b327-4652-ad87-e93187228657_0000_m_-1746433911_-727724066/Fact/Part0/Segment_null/45201028392827/part-0-45201028392827_batchno0-0-null-45201022304281.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/AvroCarbonWriterSuiteWriteFiles, operation id 1544190373908
	2018-12-07 21:46:13 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190373908
	2018-12-07 21:46:13 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201028406935_attempt_a7b1ae19-b327-4652-ad87-e93187228657_0000_m_-1746433911_-727724066/Fact/Part0/Segment_null/45201028392827
	2018-12-07 21:46:13 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201028406935_attempt_a7b1ae19-b327-4652-ad87-e93187228657_0000_m_-1746433911_-727724066/Fact/Part0/Segment_null/45201028392827/45201028392827_batchno0-0-null-45201022304281.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/AvroCarbonWriterSuiteWriteFiles, operation id 1544190373912
	2018-12-07 21:46:13 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190373912
	2018-12-07 21:46:13 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:13 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:13 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:13 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_a7b1ae19-b327-4652-ad87-e93187228657_0000_m_-1746433911_-727724066
	2018-12-07 21:46:13 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201028406935_attempt_a7b1ae19-b327-4652-ad87-e93187228657_0000_m_-1746433911_-727724066 : Time taken: 1
	2018-12-07 21:46:13 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:13 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:13 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:13 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201210969087_attempt_eea7d752-980f-4f87-8990-aa23c97e35f7_0000_m_-703244888_583695947/Fact/Part0/Segment_null/45201210954773/sortrowtmp
	2018-12-07 21:46:13 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:13 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:13 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45201200197648
	2018-12-07 21:46:13 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:14 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 61
	2018-12-07 21:46:14 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45201200197648
	2018-12-07 21:46:14 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:14 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:14 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:14 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:14 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201210969087_attempt_eea7d752-980f-4f87-8990-aa23c97e35f7_0000_m_-703244888_583695947/Fact/Part0/Segment_null/45201210954773
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201210969087_attempt_eea7d752-980f-4f87-8990-aa23c97e35f7_0000_m_-703244888_583695947/Fact/Part0/Segment_null/45201210954773
	2018-12-07 21:46:14 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:14 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201210969087_attempt_eea7d752-980f-4f87-8990-aa23c97e35f7_0000_m_-703244888_583695947/Fact/Part0/Segment_null/45201210954773/part-0-45201210954773_batchno0-0-null-45201200197648.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/AvroCarbonWriterSuiteWriteFiles, operation id 1544190374100
	2018-12-07 21:46:14 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190374100
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201210969087_attempt_eea7d752-980f-4f87-8990-aa23c97e35f7_0000_m_-703244888_583695947/Fact/Part0/Segment_null/45201210954773
	2018-12-07 21:46:14 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201210969087_attempt_eea7d752-980f-4f87-8990-aa23c97e35f7_0000_m_-703244888_583695947/Fact/Part0/Segment_null/45201210954773/45201210954773_batchno0-0-null-45201200197648.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/AvroCarbonWriterSuiteWriteFiles, operation id 1544190374104
	2018-12-07 21:46:14 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190374104
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:14 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_eea7d752-980f-4f87-8990-aa23c97e35f7_0000_m_-703244888_583695947
	2018-12-07 21:46:14 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201210969087_attempt_eea7d752-980f-4f87-8990-aa23c97e35f7_0000_m_-703244888_583695947 : Time taken: 1
	2018-12-07 21:46:14 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:14 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:14 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:14 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201393313586_attempt_2dab6226-c8e0-422b-8fd5-e70727a18ce0_0000_m_523742180_-1370165341/Fact/Part0/Segment_null/45201393287676/sortrowtmp
	2018-12-07 21:46:14 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:14 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:14 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45201388909727
	2018-12-07 21:46:14 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:14 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 62
	2018-12-07 21:46:14 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45201388909727
	2018-12-07 21:46:14 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:14 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:14 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:14 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:14 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201393313586_attempt_2dab6226-c8e0-422b-8fd5-e70727a18ce0_0000_m_523742180_-1370165341/Fact/Part0/Segment_null/45201393287676
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201393313586_attempt_2dab6226-c8e0-422b-8fd5-e70727a18ce0_0000_m_523742180_-1370165341/Fact/Part0/Segment_null/45201393287676
	2018-12-07 21:46:14 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:14 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201393313586_attempt_2dab6226-c8e0-422b-8fd5-e70727a18ce0_0000_m_523742180_-1370165341/Fact/Part0/Segment_null/45201393287676/part-0-45201393287676_batchno0-0-null-45201388909727.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/AvroCarbonWriterSuiteWriteFiles, operation id 1544190374273
	2018-12-07 21:46:14 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190374273
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201393313586_attempt_2dab6226-c8e0-422b-8fd5-e70727a18ce0_0000_m_523742180_-1370165341/Fact/Part0/Segment_null/45201393287676
	2018-12-07 21:46:14 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201393313586_attempt_2dab6226-c8e0-422b-8fd5-e70727a18ce0_0000_m_523742180_-1370165341/Fact/Part0/Segment_null/45201393287676/45201393287676_batchno0-0-null-45201388909727.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/AvroCarbonWriterSuiteWriteFiles, operation id 1544190374275
	2018-12-07 21:46:14 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190374275
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:14 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_2dab6226-c8e0-422b-8fd5-e70727a18ce0_0000_m_523742180_-1370165341
	2018-12-07 21:46:14 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201393313586_attempt_2dab6226-c8e0-422b-8fd5-e70727a18ce0_0000_m_523742180_-1370165341 : Time taken: 2
	Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.686 sec - in org.apache.carbondata.sdk.file.AvroCarbonWriterTest
	Running org.apache.carbondata.sdk.file.ConcurrentAvroSdkWriterTest
	2018-12-07 21:46:14 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:14 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:14 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:14 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201567478525_attempt_80a91b45-9b29-4df4-839a-ac4aa27f334a_0000_m_130376455_-174491875/Fact/Part0/Segment_null/45201567457185/sortrowtmp
	2018-12-07 21:46:14 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:14 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:14 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45201563869882
	2018-12-07 21:46:14 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:14 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 40 is: 48
	2018-12-07 21:46:14 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45201563869882
	2018-12-07 21:46:14 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:14 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:14 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 40
	2018-12-07 21:46:14 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:14 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201567478525_attempt_80a91b45-9b29-4df4-839a-ac4aa27f334a_0000_m_130376455_-174491875/Fact/Part0/Segment_null/45201567457185
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201567478525_attempt_80a91b45-9b29-4df4-839a-ac4aa27f334a_0000_m_130376455_-174491875/Fact/Part0/Segment_null/45201567457185
	2018-12-07 21:46:14 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 40
	2018-12-07 21:46:14 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201567478525_attempt_80a91b45-9b29-4df4-839a-ac4aa27f334a_0000_m_130376455_-174491875/Fact/Part0/Segment_null/45201567457185/part-0-45201567457185_batchno0-0-null-45201563869882.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190374426
	2018-12-07 21:46:14 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190374426
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201567478525_attempt_80a91b45-9b29-4df4-839a-ac4aa27f334a_0000_m_130376455_-174491875/Fact/Part0/Segment_null/45201567457185
	2018-12-07 21:46:14 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201567478525_attempt_80a91b45-9b29-4df4-839a-ac4aa27f334a_0000_m_130376455_-174491875/Fact/Part0/Segment_null/45201567457185/45201567457185_batchno0-0-null-45201563869882.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190374428
	2018-12-07 21:46:14 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190374428
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 40
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 40
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 40
	2018-12-07 21:46:14 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_80a91b45-9b29-4df4-839a-ac4aa27f334a_0000_m_130376455_-174491875
	2018-12-07 21:46:14 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201567478525_attempt_80a91b45-9b29-4df4-839a-ac4aa27f334a_0000_m_130376455_-174491875 : Time taken: 1
	2018-12-07 21:46:14 INFO  QueryModelBuilder:94 - Projection Columns: [name, age]
	2018-12-07 21:46:14 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:14 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:14 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:14 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.159 sec - in org.apache.carbondata.sdk.file.ConcurrentAvroSdkWriterTest
	Running org.apache.carbondata.sdk.file.ConcurrentSdkWriterTest
	2018-12-07 21:46:14 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:14 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:14 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:14 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201725728248_attempt_fa8f33f6-a552-44f6-9b91-7b54c1374cd3_0000_m_1782874581_-1179775866/Fact/Part0/Segment_null/45201725709032/sortrowtmp
	2018-12-07 21:46:14 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:14 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:14 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45201722154434
	2018-12-07 21:46:14 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:14 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 40 is: 36
	2018-12-07 21:46:14 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45201722154434
	2018-12-07 21:46:14 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:14 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:14 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 40
	2018-12-07 21:46:14 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:14 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201725728248_attempt_fa8f33f6-a552-44f6-9b91-7b54c1374cd3_0000_m_1782874581_-1179775866/Fact/Part0/Segment_null/45201725709032
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201725728248_attempt_fa8f33f6-a552-44f6-9b91-7b54c1374cd3_0000_m_1782874581_-1179775866/Fact/Part0/Segment_null/45201725709032
	2018-12-07 21:46:14 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 40
	2018-12-07 21:46:14 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201725728248_attempt_fa8f33f6-a552-44f6-9b91-7b54c1374cd3_0000_m_1782874581_-1179775866/Fact/Part0/Segment_null/45201725709032/part-0-45201725709032_batchno0-0-null-45201722154434.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190374573
	2018-12-07 21:46:14 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190374573
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201725728248_attempt_fa8f33f6-a552-44f6-9b91-7b54c1374cd3_0000_m_1782874581_-1179775866/Fact/Part0/Segment_null/45201725709032
	2018-12-07 21:46:14 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201725728248_attempt_fa8f33f6-a552-44f6-9b91-7b54c1374cd3_0000_m_1782874581_-1179775866/Fact/Part0/Segment_null/45201725709032/45201725709032_batchno0-0-null-45201722154434.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190374576
	2018-12-07 21:46:14 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190374576
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 40
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 40
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 40
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 40
	2018-12-07 21:46:14 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_fa8f33f6-a552-44f6-9b91-7b54c1374cd3_0000_m_1782874581_-1179775866
	2018-12-07 21:46:14 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201725728248_attempt_fa8f33f6-a552-44f6-9b91-7b54c1374cd3_0000_m_1782874581_-1179775866 : Time taken: 2
	2018-12-07 21:46:14 INFO  QueryModelBuilder:94 - Projection Columns: [name, age]
	2018-12-07 21:46:14 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:14 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:14 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:14 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.144 sec - in org.apache.carbondata.sdk.file.ConcurrentSdkWriterTest
	Running org.apache.carbondata.sdk.file.CarbonReaderTest
	2018-12-07 21:46:14 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:14 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:14 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:14 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:14 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201877361338_attempt_ff103d63-c04b-4180-897b-c816610bd6f7_0000_m_850367991_504454540/Fact/Part0/Segment_null/45201877331802/sortrowtmp
	2018-12-07 21:46:14 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:14 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:14 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45201874373188
	2018-12-07 21:46:14 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:14 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 200 is: 65
	2018-12-07 21:46:14 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45201874373188
	2018-12-07 21:46:14 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:14 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:14 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 200
	2018-12-07 21:46:14 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:14 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201877361338_attempt_ff103d63-c04b-4180-897b-c816610bd6f7_0000_m_850367991_504454540/Fact/Part0/Segment_null/45201877331802
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201877361338_attempt_ff103d63-c04b-4180-897b-c816610bd6f7_0000_m_850367991_504454540/Fact/Part0/Segment_null/45201877331802
	2018-12-07 21:46:14 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 200
	2018-12-07 21:46:14 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201877361338_attempt_ff103d63-c04b-4180-897b-c816610bd6f7_0000_m_850367991_504454540/Fact/Part0/Segment_null/45201877331802/part-0-45201877331802_batchno0-0-null-45201874373188.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190374772
	2018-12-07 21:46:14 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190374772
	2018-12-07 21:46:14 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201877361338_attempt_ff103d63-c04b-4180-897b-c816610bd6f7_0000_m_850367991_504454540/Fact/Part0/Segment_null/45201877331802
	2018-12-07 21:46:14 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201877361338_attempt_ff103d63-c04b-4180-897b-c816610bd6f7_0000_m_850367991_504454540/Fact/Part0/Segment_null/45201877331802/45201877331802_batchno0-0-null-45201874373188.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190374775
	2018-12-07 21:46:14 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190374775
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 200
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 200
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 200
	2018-12-07 21:46:14 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 200
	2018-12-07 21:46:14 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_ff103d63-c04b-4180-897b-c816610bd6f7_0000_m_850367991_504454540
	2018-12-07 21:46:14 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45201877361338_attempt_ff103d63-c04b-4180-897b-c816610bd6f7_0000_m_850367991_504454540 : Time taken: 1
	2018-12-07 21:46:14 INFO  CacheProvider:169 - Executor LRU cache size not configured. Initializing with driver LRU cache size.
	2018-12-07 21:46:14 INFO  CarbonLRUCache:76 - LRU cache size not configured. Therefore default behavior will be considered and no LRU based eviction of columns will be done
	2018-12-07 21:46:14 INFO  CarbonInputFormat:491 - Started block pruning ...
	2018-12-07 21:46:14 INFO  SegmentPropertiesAndSchemaHolder:119 - Constructing new SegmentProperties for table: null_null. Current size of segment properties holder list is: 1
	2018-12-07 21:46:14 INFO  CarbonInputFormat:547 - Finished block pruning ...
	2018-12-07 21:46:14 INFO  QueryModelBuilder:94 - Projection Columns: [name, age]
	2018-12-07 21:46:14 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:14 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:14 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:14 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:14 INFO  CarbonLRUCache:163 - Removed entry from InMemory lru cache :: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/45201877331802_batchno0-0-null-45201874373188.carbonindex
	2018-12-07 21:46:14 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:14 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:14 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:14 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202230982212_attempt_f7c8f863-7c86-4e8a-a55f-8715625ab31c_0000_m_-1016898191_461810502/Fact/Part0/Segment_null/45202230966201/sortrowtmp
	2018-12-07 21:46:14 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:14 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:14 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45202227964638
	2018-12-07 21:46:14 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:15 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 200 is: 53
	2018-12-07 21:46:15 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45202227964638
	2018-12-07 21:46:15 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:15 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:15 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 200
	2018-12-07 21:46:15 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:15 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202230982212_attempt_f7c8f863-7c86-4e8a-a55f-8715625ab31c_0000_m_-1016898191_461810502/Fact/Part0/Segment_null/45202230966201
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202230982212_attempt_f7c8f863-7c86-4e8a-a55f-8715625ab31c_0000_m_-1016898191_461810502/Fact/Part0/Segment_null/45202230966201
	2018-12-07 21:46:15 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 200
	2018-12-07 21:46:15 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202230982212_attempt_f7c8f863-7c86-4e8a-a55f-8715625ab31c_0000_m_-1016898191_461810502/Fact/Part0/Segment_null/45202230966201/part-0-45202230966201_batchno0-0-null-45202227964638.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190375113
	2018-12-07 21:46:15 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190375113
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202230982212_attempt_f7c8f863-7c86-4e8a-a55f-8715625ab31c_0000_m_-1016898191_461810502/Fact/Part0/Segment_null/45202230966201
	2018-12-07 21:46:15 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202230982212_attempt_f7c8f863-7c86-4e8a-a55f-8715625ab31c_0000_m_-1016898191_461810502/Fact/Part0/Segment_null/45202230966201/45202230966201_batchno0-0-null-45202227964638.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190375115
	2018-12-07 21:46:15 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190375115
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 200
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 200
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 200
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 200
	2018-12-07 21:46:15 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_f7c8f863-7c86-4e8a-a55f-8715625ab31c_0000_m_-1016898191_461810502
	2018-12-07 21:46:15 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202230982212_attempt_f7c8f863-7c86-4e8a-a55f-8715625ab31c_0000_m_-1016898191_461810502 : Time taken: 1
	2018-12-07 21:46:15 INFO  CarbonInputFormat:491 - Started block pruning ...
	2018-12-07 21:46:15 INFO  SegmentPropertiesAndSchemaHolder:119 - Constructing new SegmentProperties for table: null_null. Current size of segment properties holder list is: 1
	2018-12-07 21:46:15 INFO  CarbonInputFormat:547 - Finished block pruning ...
	2018-12-07 21:46:15 INFO  QueryModelBuilder:94 - Projection Columns: [name, age, doublefield]
	2018-12-07 21:46:15 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:15 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:15 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:15 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:15 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:15 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:15 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202436978286_attempt_07184fbc-d569-4b64-bd19-5494cb291a3c_0000_m_-446902503_-1335124846/Fact/Part0/Segment_null/45202436964677/sortrowtmp
	2018-12-07 21:46:15 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:15 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:15 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45202434524236
	2018-12-07 21:46:15 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:15 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 2 is: 58
	2018-12-07 21:46:15 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45202434524236
	2018-12-07 21:46:15 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:15 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:15 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 2
	2018-12-07 21:46:15 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:15 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202436978286_attempt_07184fbc-d569-4b64-bd19-5494cb291a3c_0000_m_-446902503_-1335124846/Fact/Part0/Segment_null/45202436964677
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202436978286_attempt_07184fbc-d569-4b64-bd19-5494cb291a3c_0000_m_-446902503_-1335124846/Fact/Part0/Segment_null/45202436964677
	2018-12-07 21:46:15 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 2
	2018-12-07 21:46:15 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202436978286_attempt_07184fbc-d569-4b64-bd19-5494cb291a3c_0000_m_-446902503_-1335124846/Fact/Part0/Segment_null/45202436964677/part-0-45202436964677_batchno0-0-null-45202434524236.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190375301
	2018-12-07 21:46:15 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190375301
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202436978286_attempt_07184fbc-d569-4b64-bd19-5494cb291a3c_0000_m_-446902503_-1335124846/Fact/Part0/Segment_null/45202436964677
	2018-12-07 21:46:15 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202436978286_attempt_07184fbc-d569-4b64-bd19-5494cb291a3c_0000_m_-446902503_-1335124846/Fact/Part0/Segment_null/45202436964677/45202436964677_batchno0-0-null-45202434524236.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190375305
	2018-12-07 21:46:15 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190375305
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 2
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 2
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 2
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 2
	2018-12-07 21:46:15 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_07184fbc-d569-4b64-bd19-5494cb291a3c_0000_m_-446902503_-1335124846
	2018-12-07 21:46:15 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202436978286_attempt_07184fbc-d569-4b64-bd19-5494cb291a3c_0000_m_-446902503_-1335124846 : Time taken: 2
	2018-12-07 21:46:15 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, booleanfield]
	2018-12-07 21:46:15 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:15 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:15 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:15 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:15 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:15 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:15 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:15 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202609482937_attempt_2065530d-d54b-49e4-b04f-e597ad4e4606_0000_m_1570940497_1027414346/Fact/Part0/Segment_null/45202609462645/sortrowtmp
	2018-12-07 21:46:15 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:15 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:15 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45202599770151
	2018-12-07 21:46:15 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:15 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 34
	2018-12-07 21:46:15 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45202599770151
	2018-12-07 21:46:15 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:15 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:15 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:15 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:15 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202609482937_attempt_2065530d-d54b-49e4-b04f-e597ad4e4606_0000_m_1570940497_1027414346/Fact/Part0/Segment_null/45202609462645
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202609482937_attempt_2065530d-d54b-49e4-b04f-e597ad4e4606_0000_m_1570940497_1027414346/Fact/Part0/Segment_null/45202609462645
	2018-12-07 21:46:15 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:15 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202609482937_attempt_2065530d-d54b-49e4-b04f-e597ad4e4606_0000_m_1570940497_1027414346/Fact/Part0/Segment_null/45202609462645/part-0-45202609462645_batchno0-0-null-45202599770151.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/carbondata, operation id 1544190375462
	2018-12-07 21:46:15 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190375462
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202609482937_attempt_2065530d-d54b-49e4-b04f-e597ad4e4606_0000_m_1570940497_1027414346/Fact/Part0/Segment_null/45202609462645
	2018-12-07 21:46:15 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202609482937_attempt_2065530d-d54b-49e4-b04f-e597ad4e4606_0000_m_1570940497_1027414346/Fact/Part0/Segment_null/45202609462645/45202609462645_batchno0-0-null-45202599770151.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/carbondata, operation id 1544190375465
	2018-12-07 21:46:15 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190375465
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:15 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_2065530d-d54b-49e4-b04f-e597ad4e4606_0000_m_1570940497_1027414346
	2018-12-07 21:46:15 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202609482937_attempt_2065530d-d54b-49e4-b04f-e597ad4e4606_0000_m_1570940497_1027414346 : Time taken: 2
	2018-12-07 21:46:15 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, datefield, timefield, varcharfield, arrayfield, shortfield, intfield, longfield, doublefield, boolfield, decimalfield, floatfield]
	2018-12-07 21:46:15 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, datefield, timefield, varcharfield, arrayfield, shortfield, intfield, longfield, doublefield, boolfield, decimalfield, floatfield]
	2018-12-07 21:46:15 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:15 INFO  ResultCollectorFactory:79 - Row based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:15 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/carbondata/Metadata/schema
	2018-12-07 21:46:15 INFO  CarbonLRUCache:163 - Removed entry from InMemory lru cache :: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/45202230966201_batchno0-0-null-45202227964638.carbonindex
	2018-12-07 21:46:15 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:15 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:15 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:15 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:15 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:15 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202781100832_attempt_170de42a-9dff-4e3a-a6af-8524e455143a_0000_m_886567497_1035976452/Fact/Part0/Segment_null/45202781074016/sortrowtmp
	2018-12-07 21:46:15 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:15 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:15 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45202778546196
	2018-12-07 21:46:15 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:15 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 66
	2018-12-07 21:46:15 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45202778546196
	2018-12-07 21:46:15 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:15 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:15 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:15 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:15 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202781100832_attempt_170de42a-9dff-4e3a-a6af-8524e455143a_0000_m_886567497_1035976452/Fact/Part0/Segment_null/45202781074016
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202781100832_attempt_170de42a-9dff-4e3a-a6af-8524e455143a_0000_m_886567497_1035976452/Fact/Part0/Segment_null/45202781074016
	2018-12-07 21:46:15 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:15 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202781100832_attempt_170de42a-9dff-4e3a-a6af-8524e455143a_0000_m_886567497_1035976452/Fact/Part0/Segment_null/45202781074016/part-0-45202781074016_batchno0-0-null-45202778546196.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190375664
	2018-12-07 21:46:15 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190375664
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202781100832_attempt_170de42a-9dff-4e3a-a6af-8524e455143a_0000_m_886567497_1035976452/Fact/Part0/Segment_null/45202781074016
	2018-12-07 21:46:15 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202781100832_attempt_170de42a-9dff-4e3a-a6af-8524e455143a_0000_m_886567497_1035976452/Fact/Part0/Segment_null/45202781074016/45202781074016_batchno0-0-null-45202778546196.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190375666
	2018-12-07 21:46:15 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190375666
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:15 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_170de42a-9dff-4e3a-a6af-8524e455143a_0000_m_886567497_1035976452
	2018-12-07 21:46:15 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202781100832_attempt_170de42a-9dff-4e3a-a6af-8524e455143a_0000_m_886567497_1035976452 : Time taken: 2
	2018-12-07 21:46:15 INFO  QueryModelBuilder:94 - Projection Columns: [name, name, age, age]
	2018-12-07 21:46:15 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:15 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:15 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:15 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:15 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:15 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:15 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:15 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202960236869_attempt_add16c3e-e6bc-425b-90e5-e4da97f85cc2_0000_m_-2083396943_-401372815/Fact/Part0/Segment_null/45202960214632/sortrowtmp
	2018-12-07 21:46:15 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:15 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:15 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45202956368211
	2018-12-07 21:46:15 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:15 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 67
	2018-12-07 21:46:15 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45202956368211
	2018-12-07 21:46:15 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:15 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:15 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:15 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:15 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202960236869_attempt_add16c3e-e6bc-425b-90e5-e4da97f85cc2_0000_m_-2083396943_-401372815/Fact/Part0/Segment_null/45202960214632
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202960236869_attempt_add16c3e-e6bc-425b-90e5-e4da97f85cc2_0000_m_-2083396943_-401372815/Fact/Part0/Segment_null/45202960214632
	2018-12-07 21:46:15 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:15 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202960236869_attempt_add16c3e-e6bc-425b-90e5-e4da97f85cc2_0000_m_-2083396943_-401372815/Fact/Part0/Segment_null/45202960214632/part-0-45202960214632_batchno0-0-null-45202956368211.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190375882
	2018-12-07 21:46:15 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190375882
	2018-12-07 21:46:15 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202960236869_attempt_add16c3e-e6bc-425b-90e5-e4da97f85cc2_0000_m_-2083396943_-401372815/Fact/Part0/Segment_null/45202960214632
	2018-12-07 21:46:15 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202960236869_attempt_add16c3e-e6bc-425b-90e5-e4da97f85cc2_0000_m_-2083396943_-401372815/Fact/Part0/Segment_null/45202960214632/45202960214632_batchno0-0-null-45202956368211.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190375884
	2018-12-07 21:46:15 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190375884
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:15 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:15 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_add16c3e-e6bc-425b-90e5-e4da97f85cc2_0000_m_-2083396943_-401372815
	2018-12-07 21:46:15 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45202960236869_attempt_add16c3e-e6bc-425b-90e5-e4da97f85cc2_0000_m_-2083396943_-401372815 : Time taken: 1
	2018-12-07 21:46:15 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, datefield, timefield, shortfield, intfield, longfield, doublefield, boolfield, decimalfield]
	2018-12-07 21:46:15 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:15 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:15 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:15 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:15 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:15 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:15 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:15 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:15 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203204976052_attempt_423f0e7a-bdb3-41e7-9f32-8213bd2a5211_0000_m_-1361201160_66908567/Fact/Part0/Segment_null/45203204955656/sortrowtmp
	2018-12-07 21:46:15 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:15 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:15 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45203200013501
	2018-12-07 21:46:15 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:16 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 200 is: 70
	2018-12-07 21:46:16 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45203200013501
	2018-12-07 21:46:16 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:16 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:16 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 200
	2018-12-07 21:46:16 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:16 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203204976052_attempt_423f0e7a-bdb3-41e7-9f32-8213bd2a5211_0000_m_-1361201160_66908567/Fact/Part0/Segment_null/45203204955656
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203204976052_attempt_423f0e7a-bdb3-41e7-9f32-8213bd2a5211_0000_m_-1361201160_66908567/Fact/Part0/Segment_null/45203204955656
	2018-12-07 21:46:16 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 200
	2018-12-07 21:46:16 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203204976052_attempt_423f0e7a-bdb3-41e7-9f32-8213bd2a5211_0000_m_-1361201160_66908567/Fact/Part0/Segment_null/45203204955656/part-0-45203204955656_batchno0-0-null-45203200013501.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190376096
	2018-12-07 21:46:16 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190376096
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203204976052_attempt_423f0e7a-bdb3-41e7-9f32-8213bd2a5211_0000_m_-1361201160_66908567/Fact/Part0/Segment_null/45203204955656
	2018-12-07 21:46:16 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203204976052_attempt_423f0e7a-bdb3-41e7-9f32-8213bd2a5211_0000_m_-1361201160_66908567/Fact/Part0/Segment_null/45203204955656/45203204955656_batchno0-0-null-45203200013501.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190376098
	2018-12-07 21:46:16 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190376098
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 200
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 200
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 200
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 200
	2018-12-07 21:46:16 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_423f0e7a-bdb3-41e7-9f32-8213bd2a5211_0000_m_-1361201160_66908567
	2018-12-07 21:46:16 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203204976052_attempt_423f0e7a-bdb3-41e7-9f32-8213bd2a5211_0000_m_-1361201160_66908567 : Time taken: 1
	2018-12-07 21:46:16 INFO  CarbonInputFormat:491 - Started block pruning ...
	2018-12-07 21:46:16 INFO  SegmentPropertiesAndSchemaHolder:119 - Constructing new SegmentProperties for table: null_null. Current size of segment properties holder list is: 1
	2018-12-07 21:46:16 INFO  CarbonInputFormat:547 - Finished block pruning ...
	2018-12-07 21:46:16 INFO  QueryModelBuilder:94 - Projection Columns: [name, age, doublefield]
	2018-12-07 21:46:16 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:16 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:16 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:16 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:16 INFO  CarbonLRUCache:163 - Removed entry from InMemory lru cache :: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/45203204955656_batchno0-0-null-45203200013501.carbonindex
	2018-12-07 21:46:16 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:16 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:16 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:16 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203401866560_attempt_3579689c-64ea-4267-8fc4-c9f843c2dcca_0000_m_1931264480_-977611234/Fact/Part0/Segment_null/45203401854745/sortrowtmp
	2018-12-07 21:46:16 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:16 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:16 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45203399164969
	2018-12-07 21:46:16 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:16 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 62
	2018-12-07 21:46:16 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45203399164969
	2018-12-07 21:46:16 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:16 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:16 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:16 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:16 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203401866560_attempt_3579689c-64ea-4267-8fc4-c9f843c2dcca_0000_m_1931264480_-977611234/Fact/Part0/Segment_null/45203401854745
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203401866560_attempt_3579689c-64ea-4267-8fc4-c9f843c2dcca_0000_m_1931264480_-977611234/Fact/Part0/Segment_null/45203401854745
	2018-12-07 21:46:16 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:16 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203401866560_attempt_3579689c-64ea-4267-8fc4-c9f843c2dcca_0000_m_1931264480_-977611234/Fact/Part0/Segment_null/45203401854745/part-0-45203401854745_batchno0-0-null-45203399164969.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190376292
	2018-12-07 21:46:16 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190376292
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203401866560_attempt_3579689c-64ea-4267-8fc4-c9f843c2dcca_0000_m_1931264480_-977611234/Fact/Part0/Segment_null/45203401854745
	2018-12-07 21:46:16 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203401866560_attempt_3579689c-64ea-4267-8fc4-c9f843c2dcca_0000_m_1931264480_-977611234/Fact/Part0/Segment_null/45203401854745/45203401854745_batchno0-0-null-45203399164969.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190376294
	2018-12-07 21:46:16 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190376294
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:16 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_3579689c-64ea-4267-8fc4-c9f843c2dcca_0000_m_1931264480_-977611234
	2018-12-07 21:46:16 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203401866560_attempt_3579689c-64ea-4267-8fc4-c9f843c2dcca_0000_m_1931264480_-977611234 : Time taken: 1
	2018-12-07 21:46:16 INFO  QueryModelBuilder:94 - Projection Columns: [name, age]
	2018-12-07 21:46:16 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:16 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:16 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:16 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:16 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:16 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:16 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:16 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203584277030_attempt_f9d41d0c-eb49-4f0c-8d58-59d76df97a6d_0000_m_38184653_-360162970/Fact/Part0/Segment_null/45203584262233/sortrowtmp
	2018-12-07 21:46:16 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:16 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:16 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45203581430903
	2018-12-07 21:46:16 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:16 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 66
	2018-12-07 21:46:16 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45203581430903
	2018-12-07 21:46:16 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:16 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:16 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:16 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:16 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203584277030_attempt_f9d41d0c-eb49-4f0c-8d58-59d76df97a6d_0000_m_38184653_-360162970/Fact/Part0/Segment_null/45203584262233
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203584277030_attempt_f9d41d0c-eb49-4f0c-8d58-59d76df97a6d_0000_m_38184653_-360162970/Fact/Part0/Segment_null/45203584262233
	2018-12-07 21:46:16 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:16 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203584277030_attempt_f9d41d0c-eb49-4f0c-8d58-59d76df97a6d_0000_m_38184653_-360162970/Fact/Part0/Segment_null/45203584262233/part-0-45203584262233_batchno0-0-null-45203581430903.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190376467
	2018-12-07 21:46:16 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190376467
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203584277030_attempt_f9d41d0c-eb49-4f0c-8d58-59d76df97a6d_0000_m_38184653_-360162970/Fact/Part0/Segment_null/45203584262233
	2018-12-07 21:46:16 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203584277030_attempt_f9d41d0c-eb49-4f0c-8d58-59d76df97a6d_0000_m_38184653_-360162970/Fact/Part0/Segment_null/45203584262233/45203584262233_batchno0-0-null-45203581430903.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190376469
	2018-12-07 21:46:16 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190376469
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:16 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_f9d41d0c-eb49-4f0c-8d58-59d76df97a6d_0000_m_38184653_-360162970
	2018-12-07 21:46:16 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203584277030_attempt_f9d41d0c-eb49-4f0c-8d58-59d76df97a6d_0000_m_38184653_-360162970 : Time taken: 1
	2018-12-07 21:46:16 INFO  QueryModelBuilder:94 - Projection Columns: [name, age]
	2018-12-07 21:46:16 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:16 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:16 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:16 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:16 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:16 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:16 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:16 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203760694513_attempt_cf304040-e335-4653-9cc3-d8574e72068c_0000_m_-1605389819_1750253466/Fact/Part0/Segment_null/45203760682527/sortrowtmp
	2018-12-07 21:46:16 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:16 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:16 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45203756484591
	2018-12-07 21:46:16 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:16 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 106
	2018-12-07 21:46:16 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45203756484591
	2018-12-07 21:46:16 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:16 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:16 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:16 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:16 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203760694513_attempt_cf304040-e335-4653-9cc3-d8574e72068c_0000_m_-1605389819_1750253466/Fact/Part0/Segment_null/45203760682527
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203760694513_attempt_cf304040-e335-4653-9cc3-d8574e72068c_0000_m_-1605389819_1750253466/Fact/Part0/Segment_null/45203760682527
	2018-12-07 21:46:16 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:16 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203760694513_attempt_cf304040-e335-4653-9cc3-d8574e72068c_0000_m_-1605389819_1750253466/Fact/Part0/Segment_null/45203760682527/part-0-45203760682527_batchno0-0-null-45203756484591.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/carbondata, operation id 1544190376717
	2018-12-07 21:46:16 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190376717
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203760694513_attempt_cf304040-e335-4653-9cc3-d8574e72068c_0000_m_-1605389819_1750253466/Fact/Part0/Segment_null/45203760682527
	2018-12-07 21:46:16 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203760694513_attempt_cf304040-e335-4653-9cc3-d8574e72068c_0000_m_-1605389819_1750253466/Fact/Part0/Segment_null/45203760682527/45203760682527_batchno0-0-null-45203756484591.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/carbondata, operation id 1544190376719
	2018-12-07 21:46:16 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190376719
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:16 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_cf304040-e335-4653-9cc3-d8574e72068c_0000_m_-1605389819_1750253466
	2018-12-07 21:46:16 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45203760694513_attempt_cf304040-e335-4653-9cc3-d8574e72068c_0000_m_-1605389819_1750253466 : Time taken: 1
	2018-12-07 21:46:16 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, datefield, timefield, varcharfield, arrayfield, shortfield, intfield, longfield, doublefield, boolfield, decimalfield, floatfield]
	2018-12-07 21:46:16 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, datefield, timefield, varcharfield, arrayfield, shortfield, intfield, longfield, doublefield, boolfield, decimalfield, floatfield]
	2018-12-07 21:46:16 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:16 INFO  ResultCollectorFactory:79 - Row based dictionary collector is used to scan and collect the data
	batch is 4
	batch is 8
	batch is 10
	2018-12-07 21:46:16 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/carbondata/Metadata/schema
	2018-12-07 21:46:16 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:16 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:16 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:16 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:16 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204014834668_attempt_d64b2326-7065-4387-a46e-9873c1cd05d0_0000_m_-575875301_-2075131984/Fact/Part0/Segment_null/45204014824184/sortrowtmp
	2018-12-07 21:46:16 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:16 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:16 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45204011947286
	2018-12-07 21:46:16 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:16 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 200 is: 105
	2018-12-07 21:46:16 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45204011947286
	2018-12-07 21:46:16 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:16 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:16 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 200
	2018-12-07 21:46:16 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:16 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204014834668_attempt_d64b2326-7065-4387-a46e-9873c1cd05d0_0000_m_-575875301_-2075131984/Fact/Part0/Segment_null/45204014824184
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204014834668_attempt_d64b2326-7065-4387-a46e-9873c1cd05d0_0000_m_-575875301_-2075131984/Fact/Part0/Segment_null/45204014824184
	2018-12-07 21:46:16 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 200
	2018-12-07 21:46:16 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204014834668_attempt_d64b2326-7065-4387-a46e-9873c1cd05d0_0000_m_-575875301_-2075131984/Fact/Part0/Segment_null/45204014824184/part-0-45204014824184_batchno0-0-null-45204011947286.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/1/45204011503914, operation id 1544190376932
	2018-12-07 21:46:16 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190376932
	2018-12-07 21:46:16 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204014834668_attempt_d64b2326-7065-4387-a46e-9873c1cd05d0_0000_m_-575875301_-2075131984/Fact/Part0/Segment_null/45204014824184
	2018-12-07 21:46:16 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204014834668_attempt_d64b2326-7065-4387-a46e-9873c1cd05d0_0000_m_-575875301_-2075131984/Fact/Part0/Segment_null/45204014824184/45204014824184_batchno0-0-null-45204011947286.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/1/45204011503914, operation id 1544190376934
	2018-12-07 21:46:16 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190376934
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 200
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 200
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 200
	2018-12-07 21:46:16 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 200
	2018-12-07 21:46:16 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_d64b2326-7065-4387-a46e-9873c1cd05d0_0000_m_-575875301_-2075131984
	2018-12-07 21:46:16 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204014834668_attempt_d64b2326-7065-4387-a46e-9873c1cd05d0_0000_m_-575875301_-2075131984 : Time taken: 1
	2018-12-07 21:46:16 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:16 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:16 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:16 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204218159809_attempt_9568945d-f449-486b-b4b3-6e9b164fc820_0000_m_1829619434_140512375/Fact/Part0/Segment_null/45204218143626/sortrowtmp
	2018-12-07 21:46:16 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:16 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:16 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45204214814064
	2018-12-07 21:46:16 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:17 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 200 is: 51
	2018-12-07 21:46:17 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45204214814064
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:17 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 200
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:17 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204218159809_attempt_9568945d-f449-486b-b4b3-6e9b164fc820_0000_m_1829619434_140512375/Fact/Part0/Segment_null/45204218143626
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204218159809_attempt_9568945d-f449-486b-b4b3-6e9b164fc820_0000_m_1829619434_140512375/Fact/Part0/Segment_null/45204218143626
	2018-12-07 21:46:17 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 200
	2018-12-07 21:46:17 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204218159809_attempt_9568945d-f449-486b-b4b3-6e9b164fc820_0000_m_1829619434_140512375/Fact/Part0/Segment_null/45204218143626/part-0-45204218143626_batchno0-0-null-45204214814064.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/2/45204011511461, operation id 1544190377081
	2018-12-07 21:46:17 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190377081
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204218159809_attempt_9568945d-f449-486b-b4b3-6e9b164fc820_0000_m_1829619434_140512375/Fact/Part0/Segment_null/45204218143626
	2018-12-07 21:46:17 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204218159809_attempt_9568945d-f449-486b-b4b3-6e9b164fc820_0000_m_1829619434_140512375/Fact/Part0/Segment_null/45204218143626/45204218143626_batchno0-0-null-45204214814064.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/2/45204011511461, operation id 1544190377084
	2018-12-07 21:46:17 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190377084
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 200
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 200
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 200
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 200
	2018-12-07 21:46:17 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_9568945d-f449-486b-b4b3-6e9b164fc820_0000_m_1829619434_140512375
	2018-12-07 21:46:17 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204218159809_attempt_9568945d-f449-486b-b4b3-6e9b164fc820_0000_m_1829619434_140512375 : Time taken: 2
	2018-12-07 21:46:17 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:17 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:17 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:17 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204370313642_attempt_8c6e321f-7694-4d5a-9bdb-3a5ac1a6591e_0000_m_-1247539191_-1207922861/Fact/Part0/Segment_null/45204370294859/sortrowtmp
	2018-12-07 21:46:17 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:17 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:17 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45204365712048
	2018-12-07 21:46:17 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:17 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 200 is: 36
	2018-12-07 21:46:17 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45204365712048
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:17 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 200
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:17 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204370313642_attempt_8c6e321f-7694-4d5a-9bdb-3a5ac1a6591e_0000_m_-1247539191_-1207922861/Fact/Part0/Segment_null/45204370294859
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204370313642_attempt_8c6e321f-7694-4d5a-9bdb-3a5ac1a6591e_0000_m_-1247539191_-1207922861/Fact/Part0/Segment_null/45204370294859
	2018-12-07 21:46:17 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 200
	2018-12-07 21:46:17 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204370313642_attempt_8c6e321f-7694-4d5a-9bdb-3a5ac1a6591e_0000_m_-1247539191_-1207922861/Fact/Part0/Segment_null/45204370294859/part-0-45204370294859_batchno0-0-null-45204365712048.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/3/45204011512534, operation id 1544190377224
	2018-12-07 21:46:17 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190377224
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204370313642_attempt_8c6e321f-7694-4d5a-9bdb-3a5ac1a6591e_0000_m_-1247539191_-1207922861/Fact/Part0/Segment_null/45204370294859
	2018-12-07 21:46:17 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204370313642_attempt_8c6e321f-7694-4d5a-9bdb-3a5ac1a6591e_0000_m_-1247539191_-1207922861/Fact/Part0/Segment_null/45204370294859/45204370294859_batchno0-0-null-45204365712048.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/3/45204011512534, operation id 1544190377226
	2018-12-07 21:46:17 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190377226
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 200
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 200
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 200
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 200
	2018-12-07 21:46:17 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_8c6e321f-7694-4d5a-9bdb-3a5ac1a6591e_0000_m_-1247539191_-1207922861
	2018-12-07 21:46:17 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204370313642_attempt_8c6e321f-7694-4d5a-9bdb-3a5ac1a6591e_0000_m_-1247539191_-1207922861 : Time taken: 1
	2018-12-07 21:46:17 INFO  CarbonInputFormat:491 - Started block pruning ...
	2018-12-07 21:46:17 INFO  SegmentPropertiesAndSchemaHolder:119 - Constructing new SegmentProperties for table: null_null. Current size of segment properties holder list is: 1
	2018-12-07 21:46:17 INFO  CarbonInputFormat:547 - Finished block pruning ...
	2018-12-07 21:46:17 INFO  QueryModelBuilder:94 - Projection Columns: [name, age]
	2018-12-07 21:46:17 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:17 INFO  QueryModelBuilder:94 - Projection Columns: [name, age]
	2018-12-07 21:46:17 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:17 INFO  QueryModelBuilder:94 - Projection Columns: [name, age]
	2018-12-07 21:46:17 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:17 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:17 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:17 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:17 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:17 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:17 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:17 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:17 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:17 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:17 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204548450418_attempt_a9f61c66-7944-4a4d-886d-051f754f5b47_0000_m_329285450_385991701/Fact/Part0/Segment_null/45204548403843/sortrowtmp
	2018-12-07 21:46:17 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:17 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:17 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45204541117487
	2018-12-07 21:46:17 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:17 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 69
	2018-12-07 21:46:17 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45204541117487
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:17 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:17 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204548450418_attempt_a9f61c66-7944-4a4d-886d-051f754f5b47_0000_m_329285450_385991701/Fact/Part0/Segment_null/45204548403843
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204548450418_attempt_a9f61c66-7944-4a4d-886d-051f754f5b47_0000_m_329285450_385991701/Fact/Part0/Segment_null/45204548403843
	2018-12-07 21:46:17 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:17 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204548450418_attempt_a9f61c66-7944-4a4d-886d-051f754f5b47_0000_m_329285450_385991701/Fact/Part0/Segment_null/45204548403843/part-0-45204548403843_batchno0-0-null-45204541117487.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190377444
	2018-12-07 21:46:17 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190377444
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204548450418_attempt_a9f61c66-7944-4a4d-886d-051f754f5b47_0000_m_329285450_385991701/Fact/Part0/Segment_null/45204548403843
	2018-12-07 21:46:17 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204548450418_attempt_a9f61c66-7944-4a4d-886d-051f754f5b47_0000_m_329285450_385991701/Fact/Part0/Segment_null/45204548403843/45204548403843_batchno0-0-null-45204541117487.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190377446
	2018-12-07 21:46:17 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190377446
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:17 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_a9f61c66-7944-4a4d-886d-051f754f5b47_0000_m_329285450_385991701
	2018-12-07 21:46:17 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204548450418_attempt_a9f61c66-7944-4a4d-886d-051f754f5b47_0000_m_329285450_385991701 : Time taken: 1
	2018-12-07 21:46:17 INFO  QueryModelBuilder:94 - Projection Columns: [name, maprecord, age]
	2018-12-07 21:46:17 INFO  QueryModelBuilder:94 - Projection Columns: [name, maprecord, age]
	2018-12-07 21:46:17 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:17 INFO  ResultCollectorFactory:79 - Row based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:17 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:17 INFO  CarbonLRUCache:163 - Removed entry from InMemory lru cache :: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/2/45204011511461/45204218143626_batchno0-0-null-45204214814064.carbonindex
	2018-12-07 21:46:17 INFO  CarbonLRUCache:163 - Removed entry from InMemory lru cache :: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/3/45204011512534/45204370294859_batchno0-0-null-45204365712048.carbonindex
	2018-12-07 21:46:17 INFO  CarbonLRUCache:163 - Removed entry from InMemory lru cache :: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/1/45204011503914/45204014824184_batchno0-0-null-45204011947286.carbonindex
	2018-12-07 21:46:17 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:17 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:17 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:17 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:17 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204755351865_attempt_324172f4-f4ba-487d-a286-e0bfd90eba99_0000_m_503031369_456273886/Fact/Part0/Segment_null/45204755339924/sortrowtmp
	2018-12-07 21:46:17 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:17 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:17 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45204752813463
	2018-12-07 21:46:17 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:17 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 200 is: 62
	2018-12-07 21:46:17 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45204752813463
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:17 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 200
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:17 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204755351865_attempt_324172f4-f4ba-487d-a286-e0bfd90eba99_0000_m_503031369_456273886/Fact/Part0/Segment_null/45204755339924
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204755351865_attempt_324172f4-f4ba-487d-a286-e0bfd90eba99_0000_m_503031369_456273886/Fact/Part0/Segment_null/45204755339924
	2018-12-07 21:46:17 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 200
	2018-12-07 21:46:17 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204755351865_attempt_324172f4-f4ba-487d-a286-e0bfd90eba99_0000_m_503031369_456273886/Fact/Part0/Segment_null/45204755339924/part-0-45204755339924_batchno0-0-null-45204752813463.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190377645
	2018-12-07 21:46:17 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190377645
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204755351865_attempt_324172f4-f4ba-487d-a286-e0bfd90eba99_0000_m_503031369_456273886/Fact/Part0/Segment_null/45204755339924
	2018-12-07 21:46:17 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204755351865_attempt_324172f4-f4ba-487d-a286-e0bfd90eba99_0000_m_503031369_456273886/Fact/Part0/Segment_null/45204755339924/45204755339924_batchno0-0-null-45204752813463.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190377647
	2018-12-07 21:46:17 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190377647
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 200
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 200
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 200
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 200
	2018-12-07 21:46:17 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_324172f4-f4ba-487d-a286-e0bfd90eba99_0000_m_503031369_456273886
	2018-12-07 21:46:17 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:17 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204755351865_attempt_324172f4-f4ba-487d-a286-e0bfd90eba99_0000_m_503031369_456273886 : Time taken: 1
	2018-12-07 21:46:17 INFO  CarbonInputFormat:491 - Started block pruning ...
	2018-12-07 21:46:17 INFO  SegmentPropertiesAndSchemaHolder:119 - Constructing new SegmentProperties for table: null_null. Current size of segment properties holder list is: 1
	2018-12-07 21:46:17 INFO  CarbonInputFormat:547 - Finished block pruning ...
	2018-12-07 21:46:17 INFO  QueryModelBuilder:94 - Projection Columns: [name, age, doublefield]
	2018-12-07 21:46:17 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:17 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:17 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:17 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:17 INFO  CarbonLRUCache:163 - Removed entry from InMemory lru cache :: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/45204755339924_batchno0-0-null-45204752813463.carbonindex
	2018-12-07 21:46:17 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:17 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:17 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:17 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204944673687_attempt_0b52ffa8-8d47-4de9-9efe-f68ef831c13c_0000_m_-1292940162_-1591928973/Fact/Part0/Segment_null/45204944662728/sortrowtmp
	2018-12-07 21:46:17 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:17 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:17 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45204941843529
	2018-12-07 21:46:17 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:17 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 200 is: 67
	2018-12-07 21:46:17 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45204941843529
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:17 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 200
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:17 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204944673687_attempt_0b52ffa8-8d47-4de9-9efe-f68ef831c13c_0000_m_-1292940162_-1591928973/Fact/Part0/Segment_null/45204944662728
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204944673687_attempt_0b52ffa8-8d47-4de9-9efe-f68ef831c13c_0000_m_-1292940162_-1591928973/Fact/Part0/Segment_null/45204944662728
	2018-12-07 21:46:17 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 200
	2018-12-07 21:46:17 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204944673687_attempt_0b52ffa8-8d47-4de9-9efe-f68ef831c13c_0000_m_-1292940162_-1591928973/Fact/Part0/Segment_null/45204944662728/part-0-45204944662728_batchno0-0-null-45204941843529.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190377834
	2018-12-07 21:46:17 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190377834
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204944673687_attempt_0b52ffa8-8d47-4de9-9efe-f68ef831c13c_0000_m_-1292940162_-1591928973/Fact/Part0/Segment_null/45204944662728
	2018-12-07 21:46:17 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204944673687_attempt_0b52ffa8-8d47-4de9-9efe-f68ef831c13c_0000_m_-1292940162_-1591928973/Fact/Part0/Segment_null/45204944662728/45204944662728_batchno0-0-null-45204941843529.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190377835
	2018-12-07 21:46:17 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190377835
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 200
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 200
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 200
	2018-12-07 21:46:17 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 200
	2018-12-07 21:46:17 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_0b52ffa8-8d47-4de9-9efe-f68ef831c13c_0000_m_-1292940162_-1591928973
	2018-12-07 21:46:17 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45204944673687_attempt_0b52ffa8-8d47-4de9-9efe-f68ef831c13c_0000_m_-1292940162_-1591928973 : Time taken: 1
	2018-12-07 21:46:17 INFO  CarbonInputFormat:491 - Started block pruning ...
	2018-12-07 21:46:17 INFO  SegmentPropertiesAndSchemaHolder:119 - Constructing new SegmentProperties for table: null_null. Current size of segment properties holder list is: 1
	2018-12-07 21:46:17 INFO  CarbonInputFormat:547 - Finished block pruning ...
	2018-12-07 21:46:17 INFO  QueryModelBuilder:94 - Projection Columns: [name, age, doublefield]
	2018-12-07 21:46:17 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:17 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:17 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:17 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:17 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:17 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:17 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205130617629_attempt_f51db25f-db40-4c09-9605-34ebcde50bfd_0000_m_1377788770_474410799/Fact/Part0/Segment_null/45205130606550/sortrowtmp
	2018-12-07 21:46:17 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:17 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:17 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45205128448241
	2018-12-07 21:46:17 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:17 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 68
	2018-12-07 21:46:17 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45205128448241
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:17 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:17 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:17 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205130617629_attempt_f51db25f-db40-4c09-9605-34ebcde50bfd_0000_m_1377788770_474410799/Fact/Part0/Segment_null/45205130606550
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:17 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205130617629_attempt_f51db25f-db40-4c09-9605-34ebcde50bfd_0000_m_1377788770_474410799/Fact/Part0/Segment_null/45205130606550
	2018-12-07 21:46:17 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:18 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205130617629_attempt_f51db25f-db40-4c09-9605-34ebcde50bfd_0000_m_1377788770_474410799/Fact/Part0/Segment_null/45205130606550/part-0-45205130606550_batchno0-0-null-45205128448241.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190378009
	2018-12-07 21:46:18 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190378009
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205130617629_attempt_f51db25f-db40-4c09-9605-34ebcde50bfd_0000_m_1377788770_474410799/Fact/Part0/Segment_null/45205130606550
	2018-12-07 21:46:18 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205130617629_attempt_f51db25f-db40-4c09-9605-34ebcde50bfd_0000_m_1377788770_474410799/Fact/Part0/Segment_null/45205130606550/45205130606550_batchno0-0-null-45205128448241.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190378011
	2018-12-07 21:46:18 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190378011
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:18 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_f51db25f-db40-4c09-9605-34ebcde50bfd_0000_m_1377788770_474410799
	2018-12-07 21:46:18 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205130617629_attempt_f51db25f-db40-4c09-9605-34ebcde50bfd_0000_m_1377788770_474410799 : Time taken: 1
	2018-12-07 21:46:18 INFO  QueryModelBuilder:94 - Projection Columns: [name, age]
	2018-12-07 21:46:18 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:18 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:18 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:18 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:18 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:18 INFO  CarbonLRUCache:163 - Removed entry from InMemory lru cache :: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/45204944662728_batchno0-0-null-45204941843529.carbonindex
	2018-12-07 21:46:18 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:18 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:18 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:18 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205303760780_attempt_19da4de3-d4dc-4240-bcce-902c59e7ef5a_0000_m_-1398081811_1228665391/Fact/Part0/Segment_null/45205303751655/sortrowtmp
	2018-12-07 21:46:18 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:18 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:18 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45205301596314
	2018-12-07 21:46:18 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:18 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 200 is: 53
	2018-12-07 21:46:18 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45205301596314
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:18 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 200
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:18 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205303760780_attempt_19da4de3-d4dc-4240-bcce-902c59e7ef5a_0000_m_-1398081811_1228665391/Fact/Part0/Segment_null/45205303751655
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205303760780_attempt_19da4de3-d4dc-4240-bcce-902c59e7ef5a_0000_m_-1398081811_1228665391/Fact/Part0/Segment_null/45205303751655
	2018-12-07 21:46:18 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 200
	2018-12-07 21:46:18 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205303760780_attempt_19da4de3-d4dc-4240-bcce-902c59e7ef5a_0000_m_-1398081811_1228665391/Fact/Part0/Segment_null/45205303751655/part-0-45205303751655_batchno0-0-null-45205301596314.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190378169
	2018-12-07 21:46:18 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190378169
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205303760780_attempt_19da4de3-d4dc-4240-bcce-902c59e7ef5a_0000_m_-1398081811_1228665391/Fact/Part0/Segment_null/45205303751655
	2018-12-07 21:46:18 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205303760780_attempt_19da4de3-d4dc-4240-bcce-902c59e7ef5a_0000_m_-1398081811_1228665391/Fact/Part0/Segment_null/45205303751655/45205303751655_batchno0-0-null-45205301596314.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190378173
	2018-12-07 21:46:18 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190378173
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 200
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 200
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 200
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 200
	2018-12-07 21:46:18 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_19da4de3-d4dc-4240-bcce-902c59e7ef5a_0000_m_-1398081811_1228665391
	2018-12-07 21:46:18 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205303760780_attempt_19da4de3-d4dc-4240-bcce-902c59e7ef5a_0000_m_-1398081811_1228665391 : Time taken: 1
	2018-12-07 21:46:18 INFO  CarbonInputFormat:491 - Started block pruning ...
	2018-12-07 21:46:18 INFO  SegmentPropertiesAndSchemaHolder:119 - Constructing new SegmentProperties for table: null_null. Current size of segment properties holder list is: 1
	2018-12-07 21:46:18 INFO  CarbonInputFormat:547 - Finished block pruning ...
	2018-12-07 21:46:18 INFO  QueryModelBuilder:94 - Projection Columns: [name, age, doublefield]
	2018-12-07 21:46:18 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:18 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:18 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:18 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:18 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:18 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:18 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205478135247_attempt_7f625a66-7807-4e93-a6b1-544b1eaaba4e_0000_m_1050280860_-1190177164/Fact/Part0/Segment_null/45205478115404/sortrowtmp
	2018-12-07 21:46:18 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:18 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:18 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45205472727621
	2018-12-07 21:46:18 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:18 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 34
	2018-12-07 21:46:18 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45205472727621
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:18 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:18 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205478135247_attempt_7f625a66-7807-4e93-a6b1-544b1eaaba4e_0000_m_1050280860_-1190177164/Fact/Part0/Segment_null/45205478115404
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205478135247_attempt_7f625a66-7807-4e93-a6b1-544b1eaaba4e_0000_m_1050280860_-1190177164/Fact/Part0/Segment_null/45205478115404
	2018-12-07 21:46:18 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:18 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205478135247_attempt_7f625a66-7807-4e93-a6b1-544b1eaaba4e_0000_m_1050280860_-1190177164/Fact/Part0/Segment_null/45205478115404/part-0-45205478115404_batchno0-0-null-45205472727621.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190378338
	2018-12-07 21:46:18 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190378338
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205478135247_attempt_7f625a66-7807-4e93-a6b1-544b1eaaba4e_0000_m_1050280860_-1190177164/Fact/Part0/Segment_null/45205478115404
	2018-12-07 21:46:18 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205478135247_attempt_7f625a66-7807-4e93-a6b1-544b1eaaba4e_0000_m_1050280860_-1190177164/Fact/Part0/Segment_null/45205478115404/45205478115404_batchno0-0-null-45205472727621.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190378341
	2018-12-07 21:46:18 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190378341
	2018-12-07 21:46:18 ERROR DataLoadExecutor:55 - Data Load is partially success for table _tempTable_45205472727621
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 200
	2018-12-07 21:46:18 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_7f625a66-7807-4e93-a6b1-544b1eaaba4e_0000_m_1050280860_-1190177164
	2018-12-07 21:46:18 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205478135247_attempt_7f625a66-7807-4e93-a6b1-544b1eaaba4e_0000_m_1050280860_-1190177164 : Time taken: 1
	2018-12-07 21:46:18 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, datefield, timefield, shortfield, intfield, longfield, doublefield, boolfield, decimalfield]
	2018-12-07 21:46:18 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:18 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:18 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:18 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:18 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:18 INFO  CarbonLRUCache:163 - Removed entry from InMemory lru cache :: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/45205303751655_batchno0-0-null-45205301596314.carbonindex
	2018-12-07 21:46:18 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:18 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:18 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:18 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205643541941_attempt_5d803adb-4b71-43f5-bfcc-2d0dd21b9295_0000_m_1910696055_-1024038833/Fact/Part0/Segment_null/45205643529816/sortrowtmp
	2018-12-07 21:46:18 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:18 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:18 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45205640700175
	2018-12-07 21:46:18 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:18 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 59
	2018-12-07 21:46:18 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45205640700175
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:18 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:18 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205643541941_attempt_5d803adb-4b71-43f5-bfcc-2d0dd21b9295_0000_m_1910696055_-1024038833/Fact/Part0/Segment_null/45205643529816
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205643541941_attempt_5d803adb-4b71-43f5-bfcc-2d0dd21b9295_0000_m_1910696055_-1024038833/Fact/Part0/Segment_null/45205643529816
	2018-12-07 21:46:18 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:18 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205643541941_attempt_5d803adb-4b71-43f5-bfcc-2d0dd21b9295_0000_m_1910696055_-1024038833/Fact/Part0/Segment_null/45205643529816/part-0-45205643529816_batchno0-0-null-45205640700175.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190378523
	2018-12-07 21:46:18 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190378523
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205643541941_attempt_5d803adb-4b71-43f5-bfcc-2d0dd21b9295_0000_m_1910696055_-1024038833/Fact/Part0/Segment_null/45205643529816
	2018-12-07 21:46:18 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205643541941_attempt_5d803adb-4b71-43f5-bfcc-2d0dd21b9295_0000_m_1910696055_-1024038833/Fact/Part0/Segment_null/45205643529816/45205643529816_batchno0-0-null-45205640700175.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190378525
	2018-12-07 21:46:18 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190378525
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:18 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_5d803adb-4b71-43f5-bfcc-2d0dd21b9295_0000_m_1910696055_-1024038833
	2018-12-07 21:46:18 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205643541941_attempt_5d803adb-4b71-43f5-bfcc-2d0dd21b9295_0000_m_1910696055_-1024038833 : Time taken: 1
	2018-12-07 21:46:18 INFO  QueryModelBuilder:94 - Projection Columns: [name, age]
	2018-12-07 21:46:18 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:18 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:18 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:18 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:18 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:18 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:18 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:18 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205815665583_attempt_7c79143d-9e73-4dbc-bffc-76c80b721d30_0000_m_541434039_-745215670/Fact/Part0/Segment_null/45205815655048/sortrowtmp
	2018-12-07 21:46:18 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:18 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:18 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45205812669495
	2018-12-07 21:46:18 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:18 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 67
	2018-12-07 21:46:18 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45205812669495
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:18 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:18 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205815665583_attempt_7c79143d-9e73-4dbc-bffc-76c80b721d30_0000_m_541434039_-745215670/Fact/Part0/Segment_null/45205815655048
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205815665583_attempt_7c79143d-9e73-4dbc-bffc-76c80b721d30_0000_m_541434039_-745215670/Fact/Part0/Segment_null/45205815655048
	2018-12-07 21:46:18 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:18 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205815665583_attempt_7c79143d-9e73-4dbc-bffc-76c80b721d30_0000_m_541434039_-745215670/Fact/Part0/Segment_null/45205815655048/part-0-45205815655048_batchno0-0-null-45205812669495.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190378697
	2018-12-07 21:46:18 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190378697
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205815665583_attempt_7c79143d-9e73-4dbc-bffc-76c80b721d30_0000_m_541434039_-745215670/Fact/Part0/Segment_null/45205815655048
	2018-12-07 21:46:18 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205815665583_attempt_7c79143d-9e73-4dbc-bffc-76c80b721d30_0000_m_541434039_-745215670/Fact/Part0/Segment_null/45205815655048/45205815655048_batchno0-0-null-45205812669495.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190378698
	2018-12-07 21:46:18 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190378698
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:18 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_7c79143d-9e73-4dbc-bffc-76c80b721d30_0000_m_541434039_-745215670
	2018-12-07 21:46:18 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205815665583_attempt_7c79143d-9e73-4dbc-bffc-76c80b721d30_0000_m_541434039_-745215670 : Time taken: 2
	2018-12-07 21:46:18 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, datefield, timefield, varcharfield, arrayfield, shortfield, intfield, longfield, doublefield, boolfield, decimalfield]
	2018-12-07 21:46:18 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, datefield, timefield, varcharfield, arrayfield, shortfield, intfield, longfield, doublefield, boolfield, decimalfield]
	2018-12-07 21:46:18 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:18 INFO  ResultCollectorFactory:79 - Row based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:18 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:18 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:18 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:18 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:18 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:18 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:18 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205995726460_attempt_3fbe9382-896e-44ef-a7c8-67e095421d67_0000_m_2039963686_1629621325/Fact/Part0/Segment_null/45205995716774/sortrowtmp
	2018-12-07 21:46:18 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:18 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:18 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45205993562608
	2018-12-07 21:46:18 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:18 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 200 is: 59
	2018-12-07 21:46:18 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45205993562608
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:18 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 200
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:18 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205995726460_attempt_3fbe9382-896e-44ef-a7c8-67e095421d67_0000_m_2039963686_1629621325/Fact/Part0/Segment_null/45205995716774
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205995726460_attempt_3fbe9382-896e-44ef-a7c8-67e095421d67_0000_m_2039963686_1629621325/Fact/Part0/Segment_null/45205995716774
	2018-12-07 21:46:18 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 200
	2018-12-07 21:46:18 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205995726460_attempt_3fbe9382-896e-44ef-a7c8-67e095421d67_0000_m_2039963686_1629621325/Fact/Part0/Segment_null/45205995716774/part-0-45205995716774_batchno0-0-null-45205993562608.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190378867
	2018-12-07 21:46:18 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190378867
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205995726460_attempt_3fbe9382-896e-44ef-a7c8-67e095421d67_0000_m_2039963686_1629621325/Fact/Part0/Segment_null/45205995716774
	2018-12-07 21:46:18 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205995726460_attempt_3fbe9382-896e-44ef-a7c8-67e095421d67_0000_m_2039963686_1629621325/Fact/Part0/Segment_null/45205995716774/45205995716774_batchno0-0-null-45205993562608.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190378869
	2018-12-07 21:46:18 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190378869
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 200
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 200
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 200
	2018-12-07 21:46:18 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 200
	2018-12-07 21:46:18 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_3fbe9382-896e-44ef-a7c8-67e095421d67_0000_m_2039963686_1629621325
	2018-12-07 21:46:18 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45205995726460_attempt_3fbe9382-896e-44ef-a7c8-67e095421d67_0000_m_2039963686_1629621325 : Time taken: 1
	2018-12-07 21:46:18 INFO  CarbonInputFormat:491 - Started block pruning ...
	2018-12-07 21:46:18 INFO  SegmentPropertiesAndSchemaHolder:119 - Constructing new SegmentProperties for table: null_null. Current size of segment properties holder list is: 1
	2018-12-07 21:46:18 INFO  CarbonInputFormat:547 - Finished block pruning ...
	2018-12-07 21:46:18 INFO  QueryModelBuilder:94 - Projection Columns: [name, age, doublefield]
	2018-12-07 21:46:18 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:18 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:18 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:18 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:18 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:18 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:18 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206168126100_attempt_b363783d-4302-4810-8057-06753a8d8a19_0000_m_-1363839165_-1623891722/Fact/Part0/Segment_null/45206168116009/sortrowtmp
	2018-12-07 21:46:18 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:18 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:18 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45206164933147
	2018-12-07 21:46:18 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:18 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 34
	2018-12-07 21:46:18 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45206164933147
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:18 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:18 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:18 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206168126100_attempt_b363783d-4302-4810-8057-06753a8d8a19_0000_m_-1363839165_-1623891722/Fact/Part0/Segment_null/45206168116009
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:18 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206168126100_attempt_b363783d-4302-4810-8057-06753a8d8a19_0000_m_-1363839165_-1623891722/Fact/Part0/Segment_null/45206168116009
	2018-12-07 21:46:18 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:19 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206168126100_attempt_b363783d-4302-4810-8057-06753a8d8a19_0000_m_-1363839165_-1623891722/Fact/Part0/Segment_null/45206168116009/part-0-45206168116009_batchno0-0-null-45206164933147.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190379016
	2018-12-07 21:46:19 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190379016
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206168126100_attempt_b363783d-4302-4810-8057-06753a8d8a19_0000_m_-1363839165_-1623891722/Fact/Part0/Segment_null/45206168116009
	2018-12-07 21:46:19 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206168126100_attempt_b363783d-4302-4810-8057-06753a8d8a19_0000_m_-1363839165_-1623891722/Fact/Part0/Segment_null/45206168116009/45206168116009_batchno0-0-null-45206164933147.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190379018
	2018-12-07 21:46:19 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190379018
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:19 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_b363783d-4302-4810-8057-06753a8d8a19_0000_m_-1363839165_-1623891722
	2018-12-07 21:46:19 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206168126100_attempt_b363783d-4302-4810-8057-06753a8d8a19_0000_m_-1363839165_-1623891722 : Time taken: 2
	2018-12-07 21:46:19 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:19 INFO  CarbonLRUCache:163 - Removed entry from InMemory lru cache :: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/45205995716774_batchno0-0-null-45205993562608.carbonindex
	2018-12-07 21:46:19 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:19 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:19 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:19 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206307566696_attempt_47668742-1040-48e1-afed-930c7dc9934a_0000_m_-581361286_2050919864/Fact/Part0/Segment_null/45206307557324/sortrowtmp
	2018-12-07 21:46:19 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:19 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:19 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45206304254456
	2018-12-07 21:46:19 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:19 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 200 is: 69
	2018-12-07 21:46:19 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45206304254456
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:19 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 200
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:19 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206307566696_attempt_47668742-1040-48e1-afed-930c7dc9934a_0000_m_-581361286_2050919864/Fact/Part0/Segment_null/45206307557324
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206307566696_attempt_47668742-1040-48e1-afed-930c7dc9934a_0000_m_-581361286_2050919864/Fact/Part0/Segment_null/45206307557324
	2018-12-07 21:46:19 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 200
	2018-12-07 21:46:19 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206307566696_attempt_47668742-1040-48e1-afed-930c7dc9934a_0000_m_-581361286_2050919864/Fact/Part0/Segment_null/45206307557324/part-0-45206307557324_batchno0-0-null-45206304254456.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190379191
	2018-12-07 21:46:19 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190379191
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206307566696_attempt_47668742-1040-48e1-afed-930c7dc9934a_0000_m_-581361286_2050919864/Fact/Part0/Segment_null/45206307557324
	2018-12-07 21:46:19 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206307566696_attempt_47668742-1040-48e1-afed-930c7dc9934a_0000_m_-581361286_2050919864/Fact/Part0/Segment_null/45206307557324/45206307557324_batchno0-0-null-45206304254456.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190379194
	2018-12-07 21:46:19 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190379194
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 200
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 200
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 200
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 200
	2018-12-07 21:46:19 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_47668742-1040-48e1-afed-930c7dc9934a_0000_m_-581361286_2050919864
	2018-12-07 21:46:19 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206307566696_attempt_47668742-1040-48e1-afed-930c7dc9934a_0000_m_-581361286_2050919864 : Time taken: 2
	2018-12-07 21:46:19 INFO  CarbonInputFormat:491 - Started block pruning ...
	2018-12-07 21:46:19 INFO  SegmentPropertiesAndSchemaHolder:119 - Constructing new SegmentProperties for table: null_null. Current size of segment properties holder list is: 1
	2018-12-07 21:46:19 INFO  CarbonInputFormat:547 - Finished block pruning ...
	2018-12-07 21:46:19 INFO  QueryModelBuilder:94 - Projection Columns: [name, age]
	2018-12-07 21:46:19 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:19 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:19 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:19 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:19 INFO  CarbonLRUCache:163 - Removed entry from InMemory lru cache :: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/45206307557324_batchno0-0-null-45206304254456.carbonindex
	2018-12-07 21:46:19 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles2/Metadata/schema
	2018-12-07 21:46:19 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:19 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:19 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:19 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206488044422_attempt_8249e75a-81db-4029-9bc0-9512f33c1e6b_0000_m_-1892336858_-1668876599/Fact/Part0/Segment_null/45206488035599/sortrowtmp
	2018-12-07 21:46:19 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:19 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:19 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45206485842532
	2018-12-07 21:46:19 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:19 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 1 is: 59
	2018-12-07 21:46:19 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45206485842532
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:19 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 1
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:19 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206488044422_attempt_8249e75a-81db-4029-9bc0-9512f33c1e6b_0000_m_-1892336858_-1668876599/Fact/Part0/Segment_null/45206488035599
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206488044422_attempt_8249e75a-81db-4029-9bc0-9512f33c1e6b_0000_m_-1892336858_-1668876599/Fact/Part0/Segment_null/45206488035599
	2018-12-07 21:46:19 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 1
	2018-12-07 21:46:19 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206488044422_attempt_8249e75a-81db-4029-9bc0-9512f33c1e6b_0000_m_-1892336858_-1668876599/Fact/Part0/Segment_null/45206488035599/part-0-45206488035599_batchno0-0-null-45206485842532.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190379355
	2018-12-07 21:46:19 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190379355
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206488044422_attempt_8249e75a-81db-4029-9bc0-9512f33c1e6b_0000_m_-1892336858_-1668876599/Fact/Part0/Segment_null/45206488035599
	2018-12-07 21:46:19 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206488044422_attempt_8249e75a-81db-4029-9bc0-9512f33c1e6b_0000_m_-1892336858_-1668876599/Fact/Part0/Segment_null/45206488035599/45206488035599_batchno0-0-null-45206485842532.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190379358
	2018-12-07 21:46:19 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190379358
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 1
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 1
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 1
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 1
	2018-12-07 21:46:19 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_8249e75a-81db-4029-9bc0-9512f33c1e6b_0000_m_-1892336858_-1668876599
	2018-12-07 21:46:19 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206488044422_attempt_8249e75a-81db-4029-9bc0-9512f33c1e6b_0000_m_-1892336858_-1668876599 : Time taken: 1
	2018-12-07 21:46:19 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:19 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:19 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:19 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206643154583_attempt_12445ff8-1c31-4330-b3b6-6b45493db264_0000_m_906322996_936754877/Fact/Part0/Segment_null/45206643144924/sortrowtmp
	2018-12-07 21:46:19 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:19 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:19 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45206639806855
	2018-12-07 21:46:19 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:19 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 1 is: 34
	2018-12-07 21:46:19 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45206639806855
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:19 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 1
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:19 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206643154583_attempt_12445ff8-1c31-4330-b3b6-6b45493db264_0000_m_906322996_936754877/Fact/Part0/Segment_null/45206643144924
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206643154583_attempt_12445ff8-1c31-4330-b3b6-6b45493db264_0000_m_906322996_936754877/Fact/Part0/Segment_null/45206643144924
	2018-12-07 21:46:19 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 1
	2018-12-07 21:46:19 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206643154583_attempt_12445ff8-1c31-4330-b3b6-6b45493db264_0000_m_906322996_936754877/Fact/Part0/Segment_null/45206643144924/part-0-45206643144924_batchno0-0-null-45206639806855.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles2, operation id 1544190379483
	2018-12-07 21:46:19 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190379483
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206643154583_attempt_12445ff8-1c31-4330-b3b6-6b45493db264_0000_m_906322996_936754877/Fact/Part0/Segment_null/45206643144924
	2018-12-07 21:46:19 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206643154583_attempt_12445ff8-1c31-4330-b3b6-6b45493db264_0000_m_906322996_936754877/Fact/Part0/Segment_null/45206643144924/45206643144924_batchno0-0-null-45206639806855.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles2, operation id 1544190379486
	2018-12-07 21:46:19 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190379486
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 1
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 1
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 1
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 1
	2018-12-07 21:46:19 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_12445ff8-1c31-4330-b3b6-6b45493db264_0000_m_906322996_936754877
	2018-12-07 21:46:19 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206643154583_attempt_12445ff8-1c31-4330-b3b6-6b45493db264_0000_m_906322996_936754877 : Time taken: 1
	2018-12-07 21:46:19 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	Success
	2018-12-07 21:46:19 INFO  QueryModelBuilder:94 - Projection Columns: [p1, p2]
	2018-12-07 21:46:19 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:19 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:19 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	PQR
	200
	2018-12-07 21:46:19 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:19 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:19 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:19 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:19 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:19 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206782541346_attempt_bac88b7c-380d-41ef-be1c-32b3e45a81e1_0000_m_-1101404839_2044041932/Fact/Part0/Segment_null/45206782532424/sortrowtmp
	2018-12-07 21:46:19 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:19 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:19 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45206780071857
	2018-12-07 21:46:19 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:19 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 200 is: 61
	2018-12-07 21:46:19 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45206780071857
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:19 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 200
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:19 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206782541346_attempt_bac88b7c-380d-41ef-be1c-32b3e45a81e1_0000_m_-1101404839_2044041932/Fact/Part0/Segment_null/45206782532424
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206782541346_attempt_bac88b7c-380d-41ef-be1c-32b3e45a81e1_0000_m_-1101404839_2044041932/Fact/Part0/Segment_null/45206782532424
	2018-12-07 21:46:19 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 200
	2018-12-07 21:46:19 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206782541346_attempt_bac88b7c-380d-41ef-be1c-32b3e45a81e1_0000_m_-1101404839_2044041932/Fact/Part0/Segment_null/45206782532424/part-0-45206782532424_batchno0-0-null-45206780071857.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190379662
	2018-12-07 21:46:19 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190379662
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206782541346_attempt_bac88b7c-380d-41ef-be1c-32b3e45a81e1_0000_m_-1101404839_2044041932/Fact/Part0/Segment_null/45206782532424
	2018-12-07 21:46:19 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206782541346_attempt_bac88b7c-380d-41ef-be1c-32b3e45a81e1_0000_m_-1101404839_2044041932/Fact/Part0/Segment_null/45206782532424/45206782532424_batchno0-0-null-45206780071857.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190379665
	2018-12-07 21:46:19 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190379665
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 200
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 200
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 200
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 200
	2018-12-07 21:46:19 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_bac88b7c-380d-41ef-be1c-32b3e45a81e1_0000_m_-1101404839_2044041932
	2018-12-07 21:46:19 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206782541346_attempt_bac88b7c-380d-41ef-be1c-32b3e45a81e1_0000_m_-1101404839_2044041932 : Time taken: 1
	2018-12-07 21:46:19 INFO  CarbonInputFormat:491 - Started block pruning ...
	2018-12-07 21:46:19 INFO  SegmentPropertiesAndSchemaHolder:119 - Constructing new SegmentProperties for table: null_null. Current size of segment properties holder list is: 1
	2018-12-07 21:46:19 INFO  CarbonInputFormat:547 - Finished block pruning ...
	2018-12-07 21:46:19 INFO  QueryModelBuilder:94 - Projection Columns: [name, age, doublefield]
	2018-12-07 21:46:19 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:19 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:19 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:19 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:19 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:19 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:19 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206968789791_attempt_aecfaed2-3053-4071-826c-d68c29dd923d_0000_m_-1624648701_-1759828745/Fact/Part0/Segment_null/45206968775037/sortrowtmp
	2018-12-07 21:46:19 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:19 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:19 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45206965283721
	2018-12-07 21:46:19 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:19 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 70
	2018-12-07 21:46:19 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45206965283721
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:19 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:19 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206968789791_attempt_aecfaed2-3053-4071-826c-d68c29dd923d_0000_m_-1624648701_-1759828745/Fact/Part0/Segment_null/45206968775037
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206968789791_attempt_aecfaed2-3053-4071-826c-d68c29dd923d_0000_m_-1624648701_-1759828745/Fact/Part0/Segment_null/45206968775037
	2018-12-07 21:46:19 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:19 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206968789791_attempt_aecfaed2-3053-4071-826c-d68c29dd923d_0000_m_-1624648701_-1759828745/Fact/Part0/Segment_null/45206968775037/part-0-45206968775037_batchno0-0-null-45206965283721.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190379863
	2018-12-07 21:46:19 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190379863
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206968789791_attempt_aecfaed2-3053-4071-826c-d68c29dd923d_0000_m_-1624648701_-1759828745/Fact/Part0/Segment_null/45206968775037
	2018-12-07 21:46:19 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206968789791_attempt_aecfaed2-3053-4071-826c-d68c29dd923d_0000_m_-1624648701_-1759828745/Fact/Part0/Segment_null/45206968775037/45206968775037_batchno0-0-null-45206965283721.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190379866
	2018-12-07 21:46:19 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190379866
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:19 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:19 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_aecfaed2-3053-4071-826c-d68c29dd923d_0000_m_-1624648701_-1759828745
	2018-12-07 21:46:19 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45206968789791_attempt_aecfaed2-3053-4071-826c-d68c29dd923d_0000_m_-1624648701_-1759828745 : Time taken: 1
	2018-12-07 21:46:19 INFO  QueryModelBuilder:94 - Projection Columns: [name, age]
	2018-12-07 21:46:19 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:19 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:19 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:19 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:19 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:19 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:19 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:19 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207158544942_attempt_ad3a5697-83f2-4420-9433-34d4fd1e3eb4_0000_m_-575495318_-2085043596/Fact/Part0/Segment_null/45207158535504/sortrowtmp
	2018-12-07 21:46:19 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:19 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:19 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45207155327295
	2018-12-07 21:46:19 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:19 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 69
	2018-12-07 21:46:19 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45207155327295
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:19 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:19 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:19 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207158544942_attempt_ad3a5697-83f2-4420-9433-34d4fd1e3eb4_0000_m_-575495318_-2085043596/Fact/Part0/Segment_null/45207158535504
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:19 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207158544942_attempt_ad3a5697-83f2-4420-9433-34d4fd1e3eb4_0000_m_-575495318_-2085043596/Fact/Part0/Segment_null/45207158535504
	2018-12-07 21:46:19 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:20 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207158544942_attempt_ad3a5697-83f2-4420-9433-34d4fd1e3eb4_0000_m_-575495318_-2085043596/Fact/Part0/Segment_null/45207158535504/part-0-45207158535504_batchno0-0-null-45207155327295.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/carbondata, operation id 1544190380046
	2018-12-07 21:46:20 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190380046
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207158544942_attempt_ad3a5697-83f2-4420-9433-34d4fd1e3eb4_0000_m_-575495318_-2085043596/Fact/Part0/Segment_null/45207158535504
	2018-12-07 21:46:20 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207158544942_attempt_ad3a5697-83f2-4420-9433-34d4fd1e3eb4_0000_m_-575495318_-2085043596/Fact/Part0/Segment_null/45207158535504/45207158535504_batchno0-0-null-45207155327295.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/carbondata, operation id 1544190380048
	2018-12-07 21:46:20 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190380048
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:20 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_ad3a5697-83f2-4420-9433-34d4fd1e3eb4_0000_m_-575495318_-2085043596
	2018-12-07 21:46:20 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207158544942_attempt_ad3a5697-83f2-4420-9433-34d4fd1e3eb4_0000_m_-575495318_-2085043596 : Time taken: 1
	2018-12-07 21:46:20 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, datefield, timefield, varcharfield, shortfield, intfield, longfield, doublefield, boolfield, decimalfield, floatfield]
	2018-12-07 21:46:20 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:20 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:20 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	batch is 4
	batch is 8
	batch is 10
	2018-12-07 21:46:20 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:20 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:20 INFO  CarbonLRUCache:163 - Removed entry from InMemory lru cache :: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/45206782532424_batchno0-0-null-45206780071857.carbonindex
	2018-12-07 21:46:20 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:20 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:20 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:20 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207347730871_attempt_859ffe5b-67a9-499c-8e07-05a870c0abe5_0000_m_-2049608151_1726311377/Fact/Part0/Segment_null/45207347722233/sortrowtmp
	2018-12-07 21:46:20 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:20 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:20 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45207345858779
	2018-12-07 21:46:20 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:20 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 200 is: 71
	2018-12-07 21:46:20 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45207345858779
	2018-12-07 21:46:20 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:20 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:20 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 200
	2018-12-07 21:46:20 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:20 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207347730871_attempt_859ffe5b-67a9-499c-8e07-05a870c0abe5_0000_m_-2049608151_1726311377/Fact/Part0/Segment_null/45207347722233
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207347730871_attempt_859ffe5b-67a9-499c-8e07-05a870c0abe5_0000_m_-2049608151_1726311377/Fact/Part0/Segment_null/45207347722233
	2018-12-07 21:46:20 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 200
	2018-12-07 21:46:20 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207347730871_attempt_859ffe5b-67a9-499c-8e07-05a870c0abe5_0000_m_-2049608151_1726311377/Fact/Part0/Segment_null/45207347722233/part-0-45207347722233_batchno0-0-null-45207345858779.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190380232
	2018-12-07 21:46:20 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190380232
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207347730871_attempt_859ffe5b-67a9-499c-8e07-05a870c0abe5_0000_m_-2049608151_1726311377/Fact/Part0/Segment_null/45207347722233
	2018-12-07 21:46:20 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207347730871_attempt_859ffe5b-67a9-499c-8e07-05a870c0abe5_0000_m_-2049608151_1726311377/Fact/Part0/Segment_null/45207347722233/45207347722233_batchno0-0-null-45207345858779.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190380233
	2018-12-07 21:46:20 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190380233
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 200
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 200
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 200
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 200
	2018-12-07 21:46:20 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_859ffe5b-67a9-499c-8e07-05a870c0abe5_0000_m_-2049608151_1726311377
	2018-12-07 21:46:20 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207347730871_attempt_859ffe5b-67a9-499c-8e07-05a870c0abe5_0000_m_-2049608151_1726311377 : Time taken: 2
	2018-12-07 21:46:20 INFO  QueryModelBuilder:94 - Projection Columns: [name, age]
	2018-12-07 21:46:20 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:20 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:20 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:20 INFO  QueryModelBuilder:94 - Projection Columns: [name, age]
	2018-12-07 21:46:20 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:20 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:20 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:20 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:20 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:20 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles/Metadata/schema
	2018-12-07 21:46:20 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:20 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:20 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:20 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207531612771_attempt_30108c85-87e0-49e5-b37e-cd7fe6c58ddb_0000_m_-742444647_182591739/Fact/Part0/Segment_null/45207531603679/sortrowtmp
	2018-12-07 21:46:20 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:20 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:20 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45207529448060
	2018-12-07 21:46:20 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:20 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 58
	2018-12-07 21:46:20 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45207529448060
	2018-12-07 21:46:20 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:20 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:20 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:20 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:20 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207531612771_attempt_30108c85-87e0-49e5-b37e-cd7fe6c58ddb_0000_m_-742444647_182591739/Fact/Part0/Segment_null/45207531603679
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207531612771_attempt_30108c85-87e0-49e5-b37e-cd7fe6c58ddb_0000_m_-742444647_182591739/Fact/Part0/Segment_null/45207531603679
	2018-12-07 21:46:20 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:20 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207531612771_attempt_30108c85-87e0-49e5-b37e-cd7fe6c58ddb_0000_m_-742444647_182591739/Fact/Part0/Segment_null/45207531603679/part-0-45207531603679_batchno0-0-null-45207529448060.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190380400
	2018-12-07 21:46:20 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190380400
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207531612771_attempt_30108c85-87e0-49e5-b37e-cd7fe6c58ddb_0000_m_-742444647_182591739/Fact/Part0/Segment_null/45207531603679
	2018-12-07 21:46:20 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207531612771_attempt_30108c85-87e0-49e5-b37e-cd7fe6c58ddb_0000_m_-742444647_182591739/Fact/Part0/Segment_null/45207531603679/45207531603679_batchno0-0-null-45207529448060.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190380402
	2018-12-07 21:46:20 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190380402
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:20 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_30108c85-87e0-49e5-b37e-cd7fe6c58ddb_0000_m_-742444647_182591739
	2018-12-07 21:46:20 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207531612771_attempt_30108c85-87e0-49e5-b37e-cd7fe6c58ddb_0000_m_-742444647_182591739 : Time taken: 2
	2018-12-07 21:46:20 INFO  QueryModelBuilder:94 - Projection Columns: [name, age]
	2018-12-07 21:46:20 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:20 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:20 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:20 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:20 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:20 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207693741816_attempt_c67bfb92-6cc8-46ce-8648-1f36fcba7df3_0000_m_-1458505058_-1389951833/Fact/Part0/Segment_null/45207693669804/sortrowtmp
	2018-12-07 21:46:20 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:20 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:20 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45207688848886
	2018-12-07 21:46:20 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:20 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 33
	2018-12-07 21:46:20 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45207688848886
	2018-12-07 21:46:20 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:20 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:20 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:20 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:20 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207693741816_attempt_c67bfb92-6cc8-46ce-8648-1f36fcba7df3_0000_m_-1458505058_-1389951833/Fact/Part0/Segment_null/45207693669804
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207693741816_attempt_c67bfb92-6cc8-46ce-8648-1f36fcba7df3_0000_m_-1458505058_-1389951833/Fact/Part0/Segment_null/45207693669804
	2018-12-07 21:46:20 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:20 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207693741816_attempt_c67bfb92-6cc8-46ce-8648-1f36fcba7df3_0000_m_-1458505058_-1389951833/Fact/Part0/Segment_null/45207693669804/part-0-45207693669804_batchno0-0-null-45207688848886.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190380549
	2018-12-07 21:46:20 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190380549
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207693741816_attempt_c67bfb92-6cc8-46ce-8648-1f36fcba7df3_0000_m_-1458505058_-1389951833/Fact/Part0/Segment_null/45207693669804
	2018-12-07 21:46:20 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207693741816_attempt_c67bfb92-6cc8-46ce-8648-1f36fcba7df3_0000_m_-1458505058_-1389951833/Fact/Part0/Segment_null/45207693669804/45207693669804_batchno0-0-null-45207688848886.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190380551
	2018-12-07 21:46:20 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190380551
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:20 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_c67bfb92-6cc8-46ce-8648-1f36fcba7df3_0000_m_-1458505058_-1389951833
	2018-12-07 21:46:20 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207693741816_attempt_c67bfb92-6cc8-46ce-8648-1f36fcba7df3_0000_m_-1458505058_-1389951833 : Time taken: 1
	2018-12-07 21:46:20 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, datefield, timefield, shortfield, intfield, longfield, doublefield, boolfield, decimalfield]
	2018-12-07 21:46:20 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:20 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:20 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:20 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:20 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:20 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:20 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:20 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207851791131_attempt_115586fc-3a12-457f-88d8-2938b56ed307_0000_m_1411753096_-1403499439/Fact/Part0/Segment_null/45207851781044/sortrowtmp
	2018-12-07 21:46:20 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:20 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:20 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45207846728883
	2018-12-07 21:46:20 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:20 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 69
	2018-12-07 21:46:20 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45207846728883
	2018-12-07 21:46:20 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:20 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:20 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:20 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:20 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207851791131_attempt_115586fc-3a12-457f-88d8-2938b56ed307_0000_m_1411753096_-1403499439/Fact/Part0/Segment_null/45207851781044
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207851791131_attempt_115586fc-3a12-457f-88d8-2938b56ed307_0000_m_1411753096_-1403499439/Fact/Part0/Segment_null/45207851781044
	2018-12-07 21:46:20 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:20 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207851791131_attempt_115586fc-3a12-457f-88d8-2938b56ed307_0000_m_1411753096_-1403499439/Fact/Part0/Segment_null/45207851781044/part-0-45207851781044_batchno0-0-null-45207846728883.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190380742
	2018-12-07 21:46:20 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190380742
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207851791131_attempt_115586fc-3a12-457f-88d8-2938b56ed307_0000_m_1411753096_-1403499439/Fact/Part0/Segment_null/45207851781044
	2018-12-07 21:46:20 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207851791131_attempt_115586fc-3a12-457f-88d8-2938b56ed307_0000_m_1411753096_-1403499439/Fact/Part0/Segment_null/45207851781044/45207851781044_batchno0-0-null-45207846728883.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190380744
	2018-12-07 21:46:20 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190380744
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:20 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_115586fc-3a12-457f-88d8-2938b56ed307_0000_m_1411753096_-1403499439
	2018-12-07 21:46:20 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45207851791131_attempt_115586fc-3a12-457f-88d8-2938b56ed307_0000_m_1411753096_-1403499439 : Time taken: 1
	2018-12-07 21:46:20 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, datefield, timefield, varcharfield, shortfield, intfield, longfield, doublefield, boolfield, decimalfield, bytefield, floatfield]
	2018-12-07 21:46:20 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:20 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:20 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:20 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:20 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:20 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:20 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:20 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208040636111_attempt_1ac7392e-2a4f-4fd6-8b54-f746eb0c24ed_0000_m_503740446_-699296438/Fact/Part0/Segment_null/45208040622621/sortrowtmp
	2018-12-07 21:46:20 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:20 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:20 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45208037939280
	2018-12-07 21:46:20 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:20 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 67
	2018-12-07 21:46:20 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45208037939280
	2018-12-07 21:46:20 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:20 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:20 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:20 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:20 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208040636111_attempt_1ac7392e-2a4f-4fd6-8b54-f746eb0c24ed_0000_m_503740446_-699296438/Fact/Part0/Segment_null/45208040622621
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208040636111_attempt_1ac7392e-2a4f-4fd6-8b54-f746eb0c24ed_0000_m_503740446_-699296438/Fact/Part0/Segment_null/45208040622621
	2018-12-07 21:46:20 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:20 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208040636111_attempt_1ac7392e-2a4f-4fd6-8b54-f746eb0c24ed_0000_m_503740446_-699296438/Fact/Part0/Segment_null/45208040622621/part-0-45208040622621_batchno0-0-null-45208037939280.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190380927
	2018-12-07 21:46:20 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190380927
	2018-12-07 21:46:20 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208040636111_attempt_1ac7392e-2a4f-4fd6-8b54-f746eb0c24ed_0000_m_503740446_-699296438/Fact/Part0/Segment_null/45208040622621
	2018-12-07 21:46:20 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208040636111_attempt_1ac7392e-2a4f-4fd6-8b54-f746eb0c24ed_0000_m_503740446_-699296438/Fact/Part0/Segment_null/45208040622621/45208040622621_batchno0-0-null-45208037939280.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190380929
	2018-12-07 21:46:20 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190380929
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:20 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:20 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_1ac7392e-2a4f-4fd6-8b54-f746eb0c24ed_0000_m_503740446_-699296438
	2018-12-07 21:46:20 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208040636111_attempt_1ac7392e-2a4f-4fd6-8b54-f746eb0c24ed_0000_m_503740446_-699296438 : Time taken: 1
	name	0
	age	1
	address	2
	doornum	3
	2018-12-07 21:46:20 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:20 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:20 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:20 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208217259791_attempt_8e92e9d9-af08-492b-8377-0086082392a7_0000_m_-2059032757_762944547/Fact/Part0/Segment_null/45208217246733/sortrowtmp
	2018-12-07 21:46:20 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:20 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:20 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45208213467116
	2018-12-07 21:46:20 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:21 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 50
	2018-12-07 21:46:21 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45208213467116
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:21 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:21 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208217259791_attempt_8e92e9d9-af08-492b-8377-0086082392a7_0000_m_-2059032757_762944547/Fact/Part0/Segment_null/45208217246733
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208217259791_attempt_8e92e9d9-af08-492b-8377-0086082392a7_0000_m_-2059032757_762944547/Fact/Part0/Segment_null/45208217246733
	2018-12-07 21:46:21 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:21 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208217259791_attempt_8e92e9d9-af08-492b-8377-0086082392a7_0000_m_-2059032757_762944547/Fact/Part0/Segment_null/45208217246733/part-0-45208217246733_batchno0-0-null-45208213467116.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/carbondata, operation id 1544190381079
	2018-12-07 21:46:21 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190381079
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208217259791_attempt_8e92e9d9-af08-492b-8377-0086082392a7_0000_m_-2059032757_762944547/Fact/Part0/Segment_null/45208217246733
	2018-12-07 21:46:21 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208217259791_attempt_8e92e9d9-af08-492b-8377-0086082392a7_0000_m_-2059032757_762944547/Fact/Part0/Segment_null/45208217246733/45208217246733_batchno0-0-null-45208213467116.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/carbondata, operation id 1544190381081
	2018-12-07 21:46:21 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190381081
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:21 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_8e92e9d9-af08-492b-8377-0086082392a7_0000_m_-2059032757_762944547
	2018-12-07 21:46:21 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208217259791_attempt_8e92e9d9-af08-492b-8377-0086082392a7_0000_m_-2059032757_762944547 : Time taken: 1
	2018-12-07 21:46:21 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, datefield, timefield, varcharfield, arrayfield, shortfield, intfield, longfield, doublefield, boolfield, decimalfield, floatfield]
	2018-12-07 21:46:21 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, datefield, timefield, varcharfield, arrayfield, shortfield, intfield, longfield, doublefield, boolfield, decimalfield, floatfield]
	2018-12-07 21:46:21 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:21 INFO  ResultCollectorFactory:79 - Row based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:21 WARN  DataMapStoreManager:505 - failed to get carbon table from table PathFile does not exist: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/carbondata/Metadata/schema
	2018-12-07 21:46:21 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:21 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:21 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:21 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:21 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208381636591_attempt_d236b46f-3b3e-404d-9e3c-16eb6c0a9d75_0000_m_1642988549_1719426011/Fact/Part0/Segment_null/45208381624579/sortrowtmp
	2018-12-07 21:46:21 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:21 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:21 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45208378870967
	2018-12-07 21:46:21 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:21 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 33
	2018-12-07 21:46:21 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45208378870967
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:21 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:21 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208381636591_attempt_d236b46f-3b3e-404d-9e3c-16eb6c0a9d75_0000_m_1642988549_1719426011/Fact/Part0/Segment_null/45208381624579
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208381636591_attempt_d236b46f-3b3e-404d-9e3c-16eb6c0a9d75_0000_m_1642988549_1719426011/Fact/Part0/Segment_null/45208381624579
	2018-12-07 21:46:21 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:21 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208381636591_attempt_d236b46f-3b3e-404d-9e3c-16eb6c0a9d75_0000_m_1642988549_1719426011/Fact/Part0/Segment_null/45208381624579/part-0-45208381624579_batchno0-0-null-45208378870967.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190381217
	2018-12-07 21:46:21 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190381217
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208381636591_attempt_d236b46f-3b3e-404d-9e3c-16eb6c0a9d75_0000_m_1642988549_1719426011/Fact/Part0/Segment_null/45208381624579
	2018-12-07 21:46:21 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208381636591_attempt_d236b46f-3b3e-404d-9e3c-16eb6c0a9d75_0000_m_1642988549_1719426011/Fact/Part0/Segment_null/45208381624579/45208381624579_batchno0-0-null-45208378870967.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190381218
	2018-12-07 21:46:21 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190381218
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:21 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_d236b46f-3b3e-404d-9e3c-16eb6c0a9d75_0000_m_1642988549_1719426011
	2018-12-07 21:46:21 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208381636591_attempt_d236b46f-3b3e-404d-9e3c-16eb6c0a9d75_0000_m_1642988549_1719426011 : Time taken: 1
	Tests run: 33, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.633 sec - in org.apache.carbondata.sdk.file.CarbonReaderTest
	Running org.apache.carbondata.sdk.file.CarbonSchemaReaderTest
	2018-12-07 21:46:21 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:21 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:21 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:21 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208505989446_attempt_3da9b5d5-5d53-42de-b127-41a2e94dcf23_0000_m_-2057272415_-967971014/Fact/Part0/Segment_null/45208505973164/sortrowtmp
	2018-12-07 21:46:21 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:21 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:21 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45208502269409
	2018-12-07 21:46:21 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:21 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 68
	2018-12-07 21:46:21 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45208502269409
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:21 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:21 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208505989446_attempt_3da9b5d5-5d53-42de-b127-41a2e94dcf23_0000_m_-2057272415_-967971014/Fact/Part0/Segment_null/45208505973164
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208505989446_attempt_3da9b5d5-5d53-42de-b127-41a2e94dcf23_0000_m_-2057272415_-967971014/Fact/Part0/Segment_null/45208505973164
	2018-12-07 21:46:21 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:21 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208505989446_attempt_3da9b5d5-5d53-42de-b127-41a2e94dcf23_0000_m_-2057272415_-967971014/Fact/Part0/Segment_null/45208505973164/part-0-45208505973164_batchno0-0-null-45208502269409.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190381397
	2018-12-07 21:46:21 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190381397
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208505989446_attempt_3da9b5d5-5d53-42de-b127-41a2e94dcf23_0000_m_-2057272415_-967971014/Fact/Part0/Segment_null/45208505973164
	2018-12-07 21:46:21 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208505989446_attempt_3da9b5d5-5d53-42de-b127-41a2e94dcf23_0000_m_-2057272415_-967971014/Fact/Part0/Segment_null/45208505973164/45208505973164_batchno0-0-null-45208502269409.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190381399
	2018-12-07 21:46:21 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190381399
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:21 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_3da9b5d5-5d53-42de-b127-41a2e94dcf23_0000_m_-2057272415_-967971014
	2018-12-07 21:46:21 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208505989446_attempt_3da9b5d5-5d53-42de-b127-41a2e94dcf23_0000_m_-2057272415_-967971014 : Time taken: 1
	2018-12-07 21:46:21 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:21 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:21 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:21 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208687567499_attempt_df5103da-eb8d-419d-aaa0-fb121b59d7bc_0000_m_1136887029_997463164/Fact/Part0/Segment_null/45208687557449/sortrowtmp
	2018-12-07 21:46:21 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:21 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:21 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45208683883863
	2018-12-07 21:46:21 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:21 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 64
	2018-12-07 21:46:21 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45208683883863
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:21 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:21 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208687567499_attempt_df5103da-eb8d-419d-aaa0-fb121b59d7bc_0000_m_1136887029_997463164/Fact/Part0/Segment_null/45208687557449
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208687567499_attempt_df5103da-eb8d-419d-aaa0-fb121b59d7bc_0000_m_1136887029_997463164/Fact/Part0/Segment_null/45208687557449
	2018-12-07 21:46:21 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:21 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208687567499_attempt_df5103da-eb8d-419d-aaa0-fb121b59d7bc_0000_m_1136887029_997463164/Fact/Part0/Segment_null/45208687557449/part-0-45208687557449_batchno0-0-null-45208683883863.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190381563
	2018-12-07 21:46:21 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190381563
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208687567499_attempt_df5103da-eb8d-419d-aaa0-fb121b59d7bc_0000_m_1136887029_997463164/Fact/Part0/Segment_null/45208687557449
	2018-12-07 21:46:21 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208687567499_attempt_df5103da-eb8d-419d-aaa0-fb121b59d7bc_0000_m_1136887029_997463164/Fact/Part0/Segment_null/45208687557449/45208687557449_batchno0-0-null-45208683883863.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190381565
	2018-12-07 21:46:21 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190381565
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:21 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_df5103da-eb8d-419d-aaa0-fb121b59d7bc_0000_m_1136887029_997463164
	2018-12-07 21:46:21 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208687567499_attempt_df5103da-eb8d-419d-aaa0-fb121b59d7bc_0000_m_1136887029_997463164 : Time taken: 2
	2018-12-07 21:46:21 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:21 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:21 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:21 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208855112874_attempt_4aa07ecc-4452-43c6-892e-67b0f1e19f0d_0000_m_-1763829529_1853202292/Fact/Part0/Segment_null/45208855103790/sortrowtmp
	2018-12-07 21:46:21 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:21 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:21 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45208851118945
	2018-12-07 21:46:21 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:21 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 34
	2018-12-07 21:46:21 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45208851118945
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:21 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:21 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208855112874_attempt_4aa07ecc-4452-43c6-892e-67b0f1e19f0d_0000_m_-1763829529_1853202292/Fact/Part0/Segment_null/45208855103790
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208855112874_attempt_4aa07ecc-4452-43c6-892e-67b0f1e19f0d_0000_m_-1763829529_1853202292/Fact/Part0/Segment_null/45208855103790
	2018-12-07 21:46:21 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:21 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208855112874_attempt_4aa07ecc-4452-43c6-892e-67b0f1e19f0d_0000_m_-1763829529_1853202292/Fact/Part0/Segment_null/45208855103790/part-0-45208855103790_batchno0-0-null-45208851118945.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190381694
	2018-12-07 21:46:21 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190381694
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208855112874_attempt_4aa07ecc-4452-43c6-892e-67b0f1e19f0d_0000_m_-1763829529_1853202292/Fact/Part0/Segment_null/45208855103790
	2018-12-07 21:46:21 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208855112874_attempt_4aa07ecc-4452-43c6-892e-67b0f1e19f0d_0000_m_-1763829529_1853202292/Fact/Part0/Segment_null/45208855103790/45208855103790_batchno0-0-null-45208851118945.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190381696
	2018-12-07 21:46:21 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190381696
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:21 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_4aa07ecc-4452-43c6-892e-67b0f1e19f0d_0000_m_-1763829529_1853202292
	2018-12-07 21:46:21 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208855112874_attempt_4aa07ecc-4452-43c6-892e-67b0f1e19f0d_0000_m_-1763829529_1853202292 : Time taken: 1
	2018-12-07 21:46:21 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:21 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:21 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:21 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208987238537_attempt_0e925793-d6a8-4508-954b-cb1b482e9eca_0000_m_-2041142198_-72382085/Fact/Part0/Segment_null/45208987228397/sortrowtmp
	2018-12-07 21:46:21 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:21 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:21 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45208982909465
	2018-12-07 21:46:21 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:21 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 68
	2018-12-07 21:46:21 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45208982909465
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:21 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:21 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208987238537_attempt_0e925793-d6a8-4508-954b-cb1b482e9eca_0000_m_-2041142198_-72382085/Fact/Part0/Segment_null/45208987228397
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208987238537_attempt_0e925793-d6a8-4508-954b-cb1b482e9eca_0000_m_-2041142198_-72382085/Fact/Part0/Segment_null/45208987228397
	2018-12-07 21:46:21 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:21 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208987238537_attempt_0e925793-d6a8-4508-954b-cb1b482e9eca_0000_m_-2041142198_-72382085/Fact/Part0/Segment_null/45208987228397/part-0-45208987228397_batchno0-0-null-45208982909465.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190381878
	2018-12-07 21:46:21 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190381878
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208987238537_attempt_0e925793-d6a8-4508-954b-cb1b482e9eca_0000_m_-2041142198_-72382085/Fact/Part0/Segment_null/45208987228397
	2018-12-07 21:46:21 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208987238537_attempt_0e925793-d6a8-4508-954b-cb1b482e9eca_0000_m_-2041142198_-72382085/Fact/Part0/Segment_null/45208987228397/45208987228397_batchno0-0-null-45208982909465.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190381881
	2018-12-07 21:46:21 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190381881
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:21 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:21 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_0e925793-d6a8-4508-954b-cb1b482e9eca_0000_m_-2041142198_-72382085
	2018-12-07 21:46:21 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45208987238537_attempt_0e925793-d6a8-4508-954b-cb1b482e9eca_0000_m_-2041142198_-72382085 : Time taken: 1
	2018-12-07 21:46:21 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:21 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:21 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:21 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209166383818_attempt_1650bc80-5b46-4771-8cf7-9db103180fe0_0000_m_127009273_173948648/Fact/Part0/Segment_null/45209166372470/sortrowtmp
	2018-12-07 21:46:21 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:21 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:21 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45209163389990
	2018-12-07 21:46:21 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:21 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 67
	2018-12-07 21:46:21 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45209163389990
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:21 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:21 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:21 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209166383818_attempt_1650bc80-5b46-4771-8cf7-9db103180fe0_0000_m_127009273_173948648/Fact/Part0/Segment_null/45209166372470
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:21 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209166383818_attempt_1650bc80-5b46-4771-8cf7-9db103180fe0_0000_m_127009273_173948648/Fact/Part0/Segment_null/45209166372470
	2018-12-07 21:46:21 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:22 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209166383818_attempt_1650bc80-5b46-4771-8cf7-9db103180fe0_0000_m_127009273_173948648/Fact/Part0/Segment_null/45209166372470/part-0-45209166372470_batchno0-0-null-45209163389990.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190382055
	2018-12-07 21:46:22 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190382055
	2018-12-07 21:46:22 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209166383818_attempt_1650bc80-5b46-4771-8cf7-9db103180fe0_0000_m_127009273_173948648/Fact/Part0/Segment_null/45209166372470
	2018-12-07 21:46:22 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209166383818_attempt_1650bc80-5b46-4771-8cf7-9db103180fe0_0000_m_127009273_173948648/Fact/Part0/Segment_null/45209166372470/45209166372470_batchno0-0-null-45209163389990.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190382057
	2018-12-07 21:46:22 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190382057
	2018-12-07 21:46:22 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:22 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:22 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:22 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:22 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_1650bc80-5b46-4771-8cf7-9db103180fe0_0000_m_127009273_173948648
	2018-12-07 21:46:22 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209166383818_attempt_1650bc80-5b46-4771-8cf7-9db103180fe0_0000_m_127009273_173948648 : Time taken: 1
	2018-12-07 21:46:22 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:22 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:22 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:22 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209343958033_attempt_98321c82-50c9-41d0-b0d3-913befe2356f_0000_m_1580316677_-638887470/Fact/Part0/Segment_null/45209343948186/sortrowtmp
	2018-12-07 21:46:22 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:22 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:22 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45209340403021
	2018-12-07 21:46:22 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:22 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 61
	2018-12-07 21:46:22 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45209340403021
	2018-12-07 21:46:22 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:22 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:22 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:22 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:22 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209343958033_attempt_98321c82-50c9-41d0-b0d3-913befe2356f_0000_m_1580316677_-638887470/Fact/Part0/Segment_null/45209343948186
	2018-12-07 21:46:22 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:22 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:22 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209343958033_attempt_98321c82-50c9-41d0-b0d3-913befe2356f_0000_m_1580316677_-638887470/Fact/Part0/Segment_null/45209343948186
	2018-12-07 21:46:22 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:22 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209343958033_attempt_98321c82-50c9-41d0-b0d3-913befe2356f_0000_m_1580316677_-638887470/Fact/Part0/Segment_null/45209343948186/part-0-45209343948186_batchno0-0-null-45209340403021.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190382213
	2018-12-07 21:46:22 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190382213
	2018-12-07 21:46:22 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209343958033_attempt_98321c82-50c9-41d0-b0d3-913befe2356f_0000_m_1580316677_-638887470/Fact/Part0/Segment_null/45209343948186
	2018-12-07 21:46:22 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209343958033_attempt_98321c82-50c9-41d0-b0d3-913befe2356f_0000_m_1580316677_-638887470/Fact/Part0/Segment_null/45209343948186/45209343948186_batchno0-0-null-45209340403021.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190382215
	2018-12-07 21:46:22 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190382215
	2018-12-07 21:46:22 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:22 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:22 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:22 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:22 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_98321c82-50c9-41d0-b0d3-913befe2356f_0000_m_1580316677_-638887470
	2018-12-07 21:46:22 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209343958033_attempt_98321c82-50c9-41d0-b0d3-913befe2356f_0000_m_1580316677_-638887470 : Time taken: 1
	Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.996 sec - in org.apache.carbondata.sdk.file.CarbonSchemaReaderTest
	Running org.apache.carbondata.sdk.file.CSVCarbonWriterTest
	2018-12-07 21:46:22 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:22 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:22 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:22 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209506339189_attempt_769ca5ce-3923-45d4-aa41-2e98f7d3c9c6_0000_m_364638090_490233649/Fact/Part0/Segment_null/45209506295600/sortrowtmp
	2018-12-07 21:46:22 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:22 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:22 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45209500587915
	2018-12-07 21:46:22 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:23 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 1000000 is: 884
	2018-12-07 21:46:23 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45209500587915
	2018-12-07 21:46:23 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:23 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:23 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 1000000
	2018-12-07 21:46:23 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:23 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209506339189_attempt_769ca5ce-3923-45d4-aa41-2e98f7d3c9c6_0000_m_364638090_490233649/Fact/Part0/Segment_null/45209506295600
	2018-12-07 21:46:23 INFO  AbstractFactDataWriter:172 - Total file size: 104857600 and dataBlock Size: 94371840
	2018-12-07 21:46:23 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:23 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209506339189_attempt_769ca5ce-3923-45d4-aa41-2e98f7d3c9c6_0000_m_364638090_490233649/Fact/Part0/Segment_null/45209506295600
	2018-12-07 21:46:24 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 8 :Rows Added: 232000
	2018-12-07 21:46:24 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209506339189_attempt_769ca5ce-3923-45d4-aa41-2e98f7d3c9c6_0000_m_364638090_490233649/Fact/Part0/Segment_null/45209506295600/part-0-45209506295600_batchno0-0-null-45209500587915.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190384526
	2018-12-07 21:46:24 INFO  CarbonUtil:2747 - Total copy time is 9 ms, operation id 1544190384526
	2018-12-07 21:46:24 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209506339189_attempt_769ca5ce-3923-45d4-aa41-2e98f7d3c9c6_0000_m_364638090_490233649/Fact/Part0/Segment_null/45209506295600
	2018-12-07 21:46:24 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209506339189_attempt_769ca5ce-3923-45d4-aa41-2e98f7d3c9c6_0000_m_364638090_490233649/Fact/Part0/Segment_null/45209506295600/45209506295600_batchno0-0-null-45209500587915.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190384537
	2018-12-07 21:46:24 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190384537
	2018-12-07 21:46:24 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 1000000
	2018-12-07 21:46:24 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 1000000
	2018-12-07 21:46:24 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 1000000
	2018-12-07 21:46:24 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 1000000
	2018-12-07 21:46:24 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_769ca5ce-3923-45d4-aa41-2e98f7d3c9c6_0000_m_364638090_490233649
	2018-12-07 21:46:24 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45209506339189_attempt_769ca5ce-3923-45d4-aa41-2e98f7d3c9c6_0000_m_364638090_490233649 : Time taken: 2
	2018-12-07 21:46:24 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:24 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:24 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:24 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45211832067186_attempt_3c5160d4-3021-4cca-8460-6e178ef7956c_0000_m_-1625026034_301725442/Fact/Part0/Segment_null/45211832057147/sortrowtmp
	2018-12-07 21:46:24 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:24 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:24 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45211829647977
	2018-12-07 21:46:24 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:24 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 10 is: 56
	2018-12-07 21:46:24 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45211829647977
	2018-12-07 21:46:24 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:24 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:24 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 10
	2018-12-07 21:46:24 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:24 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45211832067186_attempt_3c5160d4-3021-4cca-8460-6e178ef7956c_0000_m_-1625026034_301725442/Fact/Part0/Segment_null/45211832057147
	2018-12-07 21:46:24 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:24 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:24 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45211832067186_attempt_3c5160d4-3021-4cca-8460-6e178ef7956c_0000_m_-1625026034_301725442/Fact/Part0/Segment_null/45211832057147
	2018-12-07 21:46:24 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 10
	2018-12-07 21:46:24 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45211832067186_attempt_3c5160d4-3021-4cca-8460-6e178ef7956c_0000_m_-1625026034_301725442/Fact/Part0/Segment_null/45211832057147/part-0-45211832057147_batchno0-0-null-45211829647977.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFilesJsonSchema, operation id 1544190384690
	2018-12-07 21:46:24 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190384690
	2018-12-07 21:46:24 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45211832067186_attempt_3c5160d4-3021-4cca-8460-6e178ef7956c_0000_m_-1625026034_301725442/Fact/Part0/Segment_null/45211832057147
	2018-12-07 21:46:24 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45211832067186_attempt_3c5160d4-3021-4cca-8460-6e178ef7956c_0000_m_-1625026034_301725442/Fact/Part0/Segment_null/45211832057147/45211832057147_batchno0-0-null-45211829647977.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFilesJsonSchema, operation id 1544190384691
	2018-12-07 21:46:24 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190384691
	2018-12-07 21:46:24 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 10
	2018-12-07 21:46:24 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 10
	2018-12-07 21:46:24 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 10
	2018-12-07 21:46:24 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 10
	2018-12-07 21:46:24 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_3c5160d4-3021-4cca-8460-6e178ef7956c_0000_m_-1625026034_301725442
	2018-12-07 21:46:24 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45211832067186_attempt_3c5160d4-3021-4cca-8460-6e178ef7956c_0000_m_-1625026034_301725442 : Time taken: 1
	2018-12-07 21:46:24 INFO  QueryModelBuilder:94 - Projection Columns: [name, age, height]
	2018-12-07 21:46:24 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:24 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:24 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	
	
	
	
	
	
	
	
	
	
	2018-12-07 21:46:24 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:24 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:24 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:24 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:24 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45211981175330_attempt_6cd1ee09-08eb-4a01-86fd-c04a68d7dfdc_0000_m_-1021410858_-168178424/Fact/Part0/Segment_null/45211981152094/sortrowtmp
	2018-12-07 21:46:24 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:24 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:24 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45211979094461
	2018-12-07 21:46:24 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:24 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 59
	2018-12-07 21:46:24 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45211979094461
	2018-12-07 21:46:24 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:24 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:24 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:24 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:24 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45211981175330_attempt_6cd1ee09-08eb-4a01-86fd-c04a68d7dfdc_0000_m_-1021410858_-168178424/Fact/Part0/Segment_null/45211981152094
	2018-12-07 21:46:24 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:24 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:24 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45211981175330_attempt_6cd1ee09-08eb-4a01-86fd-c04a68d7dfdc_0000_m_-1021410858_-168178424/Fact/Part0/Segment_null/45211981152094
	2018-12-07 21:46:24 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:24 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45211981175330_attempt_6cd1ee09-08eb-4a01-86fd-c04a68d7dfdc_0000_m_-1021410858_-168178424/Fact/Part0/Segment_null/45211981152094/part-0-45211981152094_batchno0-0-null-45211979094461.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190384855
	2018-12-07 21:46:24 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190384855
	2018-12-07 21:46:24 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45211981175330_attempt_6cd1ee09-08eb-4a01-86fd-c04a68d7dfdc_0000_m_-1021410858_-168178424/Fact/Part0/Segment_null/45211981152094
	2018-12-07 21:46:24 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45211981175330_attempt_6cd1ee09-08eb-4a01-86fd-c04a68d7dfdc_0000_m_-1021410858_-168178424/Fact/Part0/Segment_null/45211981152094/45211981152094_batchno0-0-null-45211979094461.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190384856
	2018-12-07 21:46:24 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190384856
	2018-12-07 21:46:24 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:24 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:24 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:24 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:24 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_6cd1ee09-08eb-4a01-86fd-c04a68d7dfdc_0000_m_-1021410858_-168178424
	2018-12-07 21:46:24 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45211981175330_attempt_6cd1ee09-08eb-4a01-86fd-c04a68d7dfdc_0000_m_-1021410858_-168178424 : Time taken: 1
	2018-12-07 21:46:24 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:24 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:24 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:24 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212143897734_attempt_ab5d6959-6c5f-4838-9acd-4d2a850320c4_0000_m_1192899963_1875497057/Fact/Part0/Segment_null/45212143873936/sortrowtmp
	2018-12-07 21:46:24 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:24 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:24 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45212139361797
	2018-12-07 21:46:24 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:24 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 48
	2018-12-07 21:46:24 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45212139361797
	2018-12-07 21:46:24 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:24 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:24 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:24 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:24 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212143897734_attempt_ab5d6959-6c5f-4838-9acd-4d2a850320c4_0000_m_1192899963_1875497057/Fact/Part0/Segment_null/45212143873936
	2018-12-07 21:46:24 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:24 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:24 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212143897734_attempt_ab5d6959-6c5f-4838-9acd-4d2a850320c4_0000_m_1192899963_1875497057/Fact/Part0/Segment_null/45212143873936
	2018-12-07 21:46:24 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:25 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212143897734_attempt_ab5d6959-6c5f-4838-9acd-4d2a850320c4_0000_m_1192899963_1875497057/Fact/Part0/Segment_null/45212143873936/part-0-45212143873936_batchno0-0-null-45212139361797.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190385004
	2018-12-07 21:46:25 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190385004
	2018-12-07 21:46:25 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212143897734_attempt_ab5d6959-6c5f-4838-9acd-4d2a850320c4_0000_m_1192899963_1875497057/Fact/Part0/Segment_null/45212143873936
	2018-12-07 21:46:25 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212143897734_attempt_ab5d6959-6c5f-4838-9acd-4d2a850320c4_0000_m_1192899963_1875497057/Fact/Part0/Segment_null/45212143873936/45212143873936_batchno0-0-null-45212139361797.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190385006
	2018-12-07 21:46:25 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190385006
	2018-12-07 21:46:25 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:25 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:25 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:25 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:25 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_ab5d6959-6c5f-4838-9acd-4d2a850320c4_0000_m_1192899963_1875497057
	2018-12-07 21:46:25 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212143897734_attempt_ab5d6959-6c5f-4838-9acd-4d2a850320c4_0000_m_1192899963_1875497057 : Time taken: 1
	2018-12-07 21:46:25 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:25 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:25 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:25 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212291452556_attempt_7da34115-baea-4307-87b5-6fe819e399ff_0000_m_941238996_-2010149239/Fact/Part0/Segment_null/5/sortrowtmp
	2018-12-07 21:46:25 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:25 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:25 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45212289102101
	2018-12-07 21:46:25 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:25 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 15 is: 47
	2018-12-07 21:46:25 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45212289102101
	2018-12-07 21:46:25 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:25 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:25 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 15
	2018-12-07 21:46:25 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:25 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212291452556_attempt_7da34115-baea-4307-87b5-6fe819e399ff_0000_m_941238996_-2010149239/Fact/Part0/Segment_null/5
	2018-12-07 21:46:25 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:25 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:25 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212291452556_attempt_7da34115-baea-4307-87b5-6fe819e399ff_0000_m_941238996_-2010149239/Fact/Part0/Segment_null/5
	2018-12-07 21:46:25 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 15
	2018-12-07 21:46:25 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212291452556_attempt_7da34115-baea-4307-87b5-6fe819e399ff_0000_m_941238996_-2010149239/Fact/Part0/Segment_null/5/part-0-5_batchno0-0-null-45212289102101.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190385150
	2018-12-07 21:46:25 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190385150
	2018-12-07 21:46:25 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212291452556_attempt_7da34115-baea-4307-87b5-6fe819e399ff_0000_m_941238996_-2010149239/Fact/Part0/Segment_null/5
	2018-12-07 21:46:25 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212291452556_attempt_7da34115-baea-4307-87b5-6fe819e399ff_0000_m_941238996_-2010149239/Fact/Part0/Segment_null/5/5_batchno0-0-null-45212289102101.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190385151
	2018-12-07 21:46:25 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190385151
	2018-12-07 21:46:25 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 15
	2018-12-07 21:46:25 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 15
	2018-12-07 21:46:25 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 15
	2018-12-07 21:46:25 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 15
	2018-12-07 21:46:25 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_7da34115-baea-4307-87b5-6fe819e399ff_0000_m_941238996_-2010149239
	2018-12-07 21:46:25 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212291452556_attempt_7da34115-baea-4307-87b5-6fe819e399ff_0000_m_941238996_-2010149239 : Time taken: 0
	2018-12-07 21:46:25 INFO  QueryModelBuilder:94 - Projection Columns: [stringfield, bytefield, floatfield]
	2018-12-07 21:46:25 INFO  AbstractQueryExecutor:122 - Query will be executed on table: null
	2018-12-07 21:46:25 INFO  ResultCollectorFactory:68 - Vector based dictionary collector is used to scan and collect the data
	2018-12-07 21:46:25 INFO  DictionaryBasedVectorResultCollector:71 - Direct pagewise vector fill collector is used to scan and collect the data
	2018-12-07 21:46:25 INFO  UnsafeMemoryManager:176 - Total offheap working memory used after task fe49ea04-89a4-44f0-95af-6c7c46b0a092 is 0. Current running tasks are c8cd4820-efcc-491f-9b5f-c591eeecc646, c31d1ee8-b68c-4d66-86c8-c4c1919d3686, 1fc3ba8f-f549-4cbe-b733-49684d4cdf40, ceaf0f88-faac-4b52-9ebd-c2abba02a20a, 8110cbc2-0f11-4caf-bf07-848c5d686ff0, f411fb3f-481d-4cfa-b293-57fc552c8e8e, 5e660a04-2650-4d54-b782-7e22ac64a36c, b75b8224-ef02-4cb0-91ae-5ee0e4335c54, 53d42270-f5fe-44dd-80e6-4e7b07697d3e, 8a6198be-1c71-437d-921f-5263c6ab036e
	2018-12-07 21:46:25 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:25 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:25 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:25 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212439866497_attempt_eb470482-b449-47ff-9b6d-59c90cdf2757_0000_m_1534790236_-1195913981/Fact/Part0/Segment_null/45212439857096/sortrowtmp
	2018-12-07 21:46:25 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:25 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:25 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45212437550255
	2018-12-07 21:46:25 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:25 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 1 is: 59
	2018-12-07 21:46:25 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45212437550255
	2018-12-07 21:46:25 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:25 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:25 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 1
	2018-12-07 21:46:25 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:25 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212439866497_attempt_eb470482-b449-47ff-9b6d-59c90cdf2757_0000_m_1534790236_-1195913981/Fact/Part0/Segment_null/45212439857096
	2018-12-07 21:46:25 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:25 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:25 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212439866497_attempt_eb470482-b449-47ff-9b6d-59c90cdf2757_0000_m_1534790236_-1195913981/Fact/Part0/Segment_null/45212439857096
	2018-12-07 21:46:25 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 1
	2018-12-07 21:46:25 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212439866497_attempt_eb470482-b449-47ff-9b6d-59c90cdf2757_0000_m_1534790236_-1195913981/Fact/Part0/Segment_null/45212439857096/part-0-45212439857096_batchno0-0-null-45212437550255.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190385313
	2018-12-07 21:46:25 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190385313
	2018-12-07 21:46:25 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212439866497_attempt_eb470482-b449-47ff-9b6d-59c90cdf2757_0000_m_1534790236_-1195913981/Fact/Part0/Segment_null/45212439857096
	2018-12-07 21:46:25 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212439866497_attempt_eb470482-b449-47ff-9b6d-59c90cdf2757_0000_m_1534790236_-1195913981/Fact/Part0/Segment_null/45212439857096/45212439857096_batchno0-0-null-45212437550255.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190385315
	2018-12-07 21:46:25 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190385315
	2018-12-07 21:46:25 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 1
	2018-12-07 21:46:25 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 1
	2018-12-07 21:46:25 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 1
	2018-12-07 21:46:25 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 1
	2018-12-07 21:46:25 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_eb470482-b449-47ff-9b6d-59c90cdf2757_0000_m_1534790236_-1195913981
	2018-12-07 21:46:25 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212439866497_attempt_eb470482-b449-47ff-9b6d-59c90cdf2757_0000_m_1534790236_-1195913981 : Time taken: 2
	2018-12-07 21:46:25 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45212598640183
	2018-12-07 21:46:25 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:25 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:25 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212601993409_attempt_888fe992-a4e1-45fc-95a3-8baa8bbee0d4_0000_m_587101349_1737091731/Fact/Part0/Segment_null/5
	2018-12-07 21:46:25 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 15
	2018-12-07 21:46:25 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212601993409_attempt_888fe992-a4e1-45fc-95a3-8baa8bbee0d4_0000_m_587101349_1737091731/Fact/Part0/Segment_null/5/part-0-5_batchno0-0-null-45212598640183.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190385382
	2018-12-07 21:46:25 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190385382
	2018-12-07 21:46:25 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212601993409_attempt_888fe992-a4e1-45fc-95a3-8baa8bbee0d4_0000_m_587101349_1737091731/Fact/Part0/Segment_null/5
	2018-12-07 21:46:25 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212601993409_attempt_888fe992-a4e1-45fc-95a3-8baa8bbee0d4_0000_m_587101349_1737091731/Fact/Part0/Segment_null/5/5_batchno0-0-null-45212598640183.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190385385
	2018-12-07 21:46:25 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190385385
	2018-12-07 21:46:25 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 15
	2018-12-07 21:46:25 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 15
	2018-12-07 21:46:25 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 15
	2018-12-07 21:46:25 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_888fe992-a4e1-45fc-95a3-8baa8bbee0d4_0000_m_587101349_1737091731
	2018-12-07 21:46:25 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212601993409_attempt_888fe992-a4e1-45fc-95a3-8baa8bbee0d4_0000_m_587101349_1737091731 : Time taken: 2
	2018-12-07 21:46:25 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:25 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:25 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:25 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212671203212_attempt_e1f87980-ebda-4d69-904f-db1afd662009_0000_m_-1409086351_-452143079/Fact/Part0/Segment_null/45212671185204/sortrowtmp
	2018-12-07 21:46:25 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:25 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:25 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45212668695210
	2018-12-07 21:46:25 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:26 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 1000000 is: 802
	2018-12-07 21:46:26 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45212668695210
	2018-12-07 21:46:26 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:26 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:26 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 1000000
	2018-12-07 21:46:26 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:26 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212671203212_attempt_e1f87980-ebda-4d69-904f-db1afd662009_0000_m_-1409086351_-452143079/Fact/Part0/Segment_null/45212671185204
	2018-12-07 21:46:26 INFO  AbstractFactDataWriter:172 - Total file size: 8388608 and dataBlock Size: 7549748
	2018-12-07 21:46:26 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:26 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212671203212_attempt_e1f87980-ebda-4d69-904f-db1afd662009_0000_m_-1409086351_-452143079/Fact/Part0/Segment_null/45212671185204
	2018-12-07 21:46:27 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 7 :Rows Added: 200000
	2018-12-07 21:46:27 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212671203212_attempt_e1f87980-ebda-4d69-904f-db1afd662009_0000_m_-1409086351_-452143079/Fact/Part0/Segment_null/45212671185204/part-0-45212671185204_batchno0-0-null-45212668695210.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190387513
	2018-12-07 21:46:27 INFO  CarbonUtil:2747 - Total copy time is 11 ms, operation id 1544190387513
	2018-12-07 21:46:27 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212671203212_attempt_e1f87980-ebda-4d69-904f-db1afd662009_0000_m_-1409086351_-452143079/Fact/Part0/Segment_null/45212671185204
	2018-12-07 21:46:27 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212671203212_attempt_e1f87980-ebda-4d69-904f-db1afd662009_0000_m_-1409086351_-452143079/Fact/Part0/Segment_null/45212671185204/45212671185204_batchno0-0-null-45212668695210.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190387525
	2018-12-07 21:46:27 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190387525
	2018-12-07 21:46:27 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 1000000
	2018-12-07 21:46:27 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 1000000
	2018-12-07 21:46:27 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 1000000
	2018-12-07 21:46:27 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 1000000
	2018-12-07 21:46:27 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_e1f87980-ebda-4d69-904f-db1afd662009_0000_m_-1409086351_-452143079
	2018-12-07 21:46:27 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45212671203212_attempt_e1f87980-ebda-4d69-904f-db1afd662009_0000_m_-1409086351_-452143079 : Time taken: 1
	2018-12-07 21:46:27 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:27 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:27 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:27 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45214812018704_attempt_00a632af-7e15-4c9e-b97c-6a6eef8a2403_0000_m_-351584331_159069548/Fact/Part0/Segment_null/45214812007915/sortrowtmp
	2018-12-07 21:46:27 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:27 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:27 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45214809300117
	2018-12-07 21:46:27 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:28 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 1000000 is: 725
	2018-12-07 21:46:28 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45214809300117
	2018-12-07 21:46:28 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:28 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:28 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 1000000
	2018-12-07 21:46:28 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:28 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45214812018704_attempt_00a632af-7e15-4c9e-b97c-6a6eef8a2403_0000_m_-351584331_159069548/Fact/Part0/Segment_null/45214812007915
	2018-12-07 21:46:28 INFO  AbstractFactDataWriter:172 - Total file size: 2097152 and dataBlock Size: 1887437
	2018-12-07 21:46:28 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:28 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45214812018704_attempt_00a632af-7e15-4c9e-b97c-6a6eef8a2403_0000_m_-351584331_159069548/Fact/Part0/Segment_null/45214812007915
	2018-12-07 21:46:29 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 16 :Rows Added: 488000
	2018-12-07 21:46:29 INFO  AbstractFactDataWriter:230 - Writing data to file as max file size reached for file: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45214812018704_attempt_00a632af-7e15-4c9e-b97c-6a6eef8a2403_0000_m_-351584331_159069548/Fact/Part0/Segment_null/45214812007915/part-0-45214812007915_batchno0-0-null-45214809300117.carbondata. Data block size: 1994576
	2018-12-07 21:46:29 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45214812018704_attempt_00a632af-7e15-4c9e-b97c-6a6eef8a2403_0000_m_-351584331_159069548/Fact/Part0/Segment_null/45214812007915
	2018-12-07 21:46:29 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45214812018704_attempt_00a632af-7e15-4c9e-b97c-6a6eef8a2403_0000_m_-351584331_159069548/Fact/Part0/Segment_null/45214812007915/part-0-45214812007915_batchno0-0-null-45214809300117.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190389411
	2018-12-07 21:46:29 INFO  CarbonUtil:2747 - Total copy time is 4 ms, operation id 1544190389411
	2018-12-07 21:46:29 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45214812018704_attempt_00a632af-7e15-4c9e-b97c-6a6eef8a2403_0000_m_-351584331_159069548/Fact/Part0/Segment_null/45214812007915/part-1-45214812007915_batchno0-0-null-45214809300117.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190389465
	2018-12-07 21:46:29 INFO  CarbonUtil:2747 - Total copy time is 5 ms, operation id 1544190389465
	2018-12-07 21:46:29 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45214812018704_attempt_00a632af-7e15-4c9e-b97c-6a6eef8a2403_0000_m_-351584331_159069548/Fact/Part0/Segment_null/45214812007915
	2018-12-07 21:46:29 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45214812018704_attempt_00a632af-7e15-4c9e-b97c-6a6eef8a2403_0000_m_-351584331_159069548/Fact/Part0/Segment_null/45214812007915/45214812007915_batchno0-0-null-45214809300117.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190389471
	2018-12-07 21:46:29 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190389471
	2018-12-07 21:46:29 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 1000000
	2018-12-07 21:46:29 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 1000000
	2018-12-07 21:46:29 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 1000000
	2018-12-07 21:46:29 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 1000000
	2018-12-07 21:46:29 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_00a632af-7e15-4c9e-b97c-6a6eef8a2403_0000_m_-351584331_159069548
	2018-12-07 21:46:29 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45214812018704_attempt_00a632af-7e15-4c9e-b97c-6a6eef8a2403_0000_m_-351584331_159069548 : Time taken: 1
	2018-12-07 21:46:29 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:29 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:29 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:29 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45216757893581_attempt_2f61e00e-1e6b-48a9-9764-305ea545139b_0000_m_896532274_511759430/Fact/Part0/Segment_null/5/sortrowtmp
	2018-12-07 21:46:29 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:29 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:29 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45216755384322
	2018-12-07 21:46:29 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:29 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 15 is: 34
	2018-12-07 21:46:29 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45216755384322
	2018-12-07 21:46:29 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:29 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:29 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 15
	2018-12-07 21:46:29 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:29 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45216757893581_attempt_2f61e00e-1e6b-48a9-9764-305ea545139b_0000_m_896532274_511759430/Fact/Part0/Segment_null/5
	2018-12-07 21:46:29 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:29 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:29 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45216757893581_attempt_2f61e00e-1e6b-48a9-9764-305ea545139b_0000_m_896532274_511759430/Fact/Part0/Segment_null/5
	2018-12-07 21:46:29 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 15
	2018-12-07 21:46:29 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45216757893581_attempt_2f61e00e-1e6b-48a9-9764-305ea545139b_0000_m_896532274_511759430/Fact/Part0/Segment_null/5/part-0-5_batchno0-0-null-45216755384322.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190389592
	2018-12-07 21:46:29 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190389592
	2018-12-07 21:46:29 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45216757893581_attempt_2f61e00e-1e6b-48a9-9764-305ea545139b_0000_m_896532274_511759430/Fact/Part0/Segment_null/5
	2018-12-07 21:46:29 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45216757893581_attempt_2f61e00e-1e6b-48a9-9764-305ea545139b_0000_m_896532274_511759430/Fact/Part0/Segment_null/5/5_batchno0-0-null-45216755384322.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190389594
	2018-12-07 21:46:29 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190389594
	2018-12-07 21:46:29 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 15
	2018-12-07 21:46:29 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 15
	2018-12-07 21:46:29 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 15
	2018-12-07 21:46:29 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 15
	2018-12-07 21:46:29 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_2f61e00e-1e6b-48a9-9764-305ea545139b_0000_m_896532274_511759430
	2018-12-07 21:46:29 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45216757893581_attempt_2f61e00e-1e6b-48a9-9764-305ea545139b_0000_m_896532274_511759430 : Time taken: 1
	2018-12-07 21:46:29 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:29 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:29 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:29 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45216881418320_attempt_114bc5b7-a525-40bc-a59a-726233a0b195_0000_m_-2060974430_1358293874/Fact/Part0/Segment_null/45216881408361/sortrowtmp
	2018-12-07 21:46:29 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:29 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:29 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45216878840613
	2018-12-07 21:46:29 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:29 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:29 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:29 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45216884607637_attempt_0c16f446-4ecf-455c-a2d7-8b4d6166f449_0000_m_-1683417506_-2027720237/Fact/Part0/Segment_null/45216884598834/sortrowtmp
	2018-12-07 21:46:29 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:29 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:29 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45216882542795
	2018-12-07 21:46:29 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:29 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 78
	2018-12-07 21:46:29 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45216882542795
	2018-12-07 21:46:29 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:29 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:29 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:29 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:29 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45216884607637_attempt_0c16f446-4ecf-455c-a2d7-8b4d6166f449_0000_m_-1683417506_-2027720237/Fact/Part0/Segment_null/45216884598834
	2018-12-07 21:46:29 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:29 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:29 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45216884607637_attempt_0c16f446-4ecf-455c-a2d7-8b4d6166f449_0000_m_-1683417506_-2027720237/Fact/Part0/Segment_null/45216884598834
	2018-12-07 21:46:29 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:29 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45216884607637_attempt_0c16f446-4ecf-455c-a2d7-8b4d6166f449_0000_m_-1683417506_-2027720237/Fact/Part0/Segment_null/45216884598834/part-0-45216884598834_batchno0-0-null-45216882542795.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190389785
	2018-12-07 21:46:29 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190389785
	2018-12-07 21:46:29 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45216884607637_attempt_0c16f446-4ecf-455c-a2d7-8b4d6166f449_0000_m_-1683417506_-2027720237/Fact/Part0/Segment_null/45216884598834
	2018-12-07 21:46:29 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45216884607637_attempt_0c16f446-4ecf-455c-a2d7-8b4d6166f449_0000_m_-1683417506_-2027720237/Fact/Part0/Segment_null/45216884598834/45216884598834_batchno0-0-null-45216882542795.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190389789
	2018-12-07 21:46:29 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190389789
	2018-12-07 21:46:29 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:29 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:29 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:29 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:29 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_0c16f446-4ecf-455c-a2d7-8b4d6166f449_0000_m_-1683417506_-2027720237
	2018-12-07 21:46:29 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45216884607637_attempt_0c16f446-4ecf-455c-a2d7-8b4d6166f449_0000_m_-1683417506_-2027720237 : Time taken: 2
	2018-12-07 21:46:29 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:29 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:29 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:29 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217075942166_attempt_ceae1fb6-d9e2-4f4d-ad85-d97d1e9997d9_0000_m_418768739_-684498319/Fact/Part0/Segment_null/45217075931702/sortrowtmp
	2018-12-07 21:46:29 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:29 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:29 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45217072999638
	2018-12-07 21:46:29 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:29 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 60
	2018-12-07 21:46:29 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45217072999638
	2018-12-07 21:46:29 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:29 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:29 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:29 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:29 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217075942166_attempt_ceae1fb6-d9e2-4f4d-ad85-d97d1e9997d9_0000_m_418768739_-684498319/Fact/Part0/Segment_null/45217075931702
	2018-12-07 21:46:29 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:29 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:29 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217075942166_attempt_ceae1fb6-d9e2-4f4d-ad85-d97d1e9997d9_0000_m_418768739_-684498319/Fact/Part0/Segment_null/45217075931702
	2018-12-07 21:46:29 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:29 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217075942166_attempt_ceae1fb6-d9e2-4f4d-ad85-d97d1e9997d9_0000_m_418768739_-684498319/Fact/Part0/Segment_null/45217075931702/part-0-45217075931702_batchno0-0-null-45217072999638.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFilesJsonSchema, operation id 1544190389942
	2018-12-07 21:46:29 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190389942
	2018-12-07 21:46:29 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217075942166_attempt_ceae1fb6-d9e2-4f4d-ad85-d97d1e9997d9_0000_m_418768739_-684498319/Fact/Part0/Segment_null/45217075931702
	2018-12-07 21:46:29 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217075942166_attempt_ceae1fb6-d9e2-4f4d-ad85-d97d1e9997d9_0000_m_418768739_-684498319/Fact/Part0/Segment_null/45217075931702/45217075931702_batchno0-0-null-45217072999638.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFilesJsonSchema, operation id 1544190389944
	2018-12-07 21:46:29 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190389944
	2018-12-07 21:46:29 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:29 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:29 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:29 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:29 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_ceae1fb6-d9e2-4f4d-ad85-d97d1e9997d9_0000_m_418768739_-684498319
	2018-12-07 21:46:29 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217075942166_attempt_ceae1fb6-d9e2-4f4d-ad85-d97d1e9997d9_0000_m_418768739_-684498319 : Time taken: 1
	2018-12-07 21:46:29 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:29 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:29 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:29 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217230053686_attempt_86c43d67-0984-4d79-a51d-d70ba92314dd_0000_m_1131247845_679707855/Fact/Part0/Segment_null/5/sortrowtmp
	2018-12-07 21:46:29 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:29 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:29 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45217227922500
	2018-12-07 21:46:29 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:30 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 2 is: 36
	2018-12-07 21:46:30 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45217227922500
	2018-12-07 21:46:30 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:30 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:30 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 2
	2018-12-07 21:46:30 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:30 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217230053686_attempt_86c43d67-0984-4d79-a51d-d70ba92314dd_0000_m_1131247845_679707855/Fact/Part0/Segment_null/5
	2018-12-07 21:46:30 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:30 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:30 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217230053686_attempt_86c43d67-0984-4d79-a51d-d70ba92314dd_0000_m_1131247845_679707855/Fact/Part0/Segment_null/5
	2018-12-07 21:46:30 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 2
	2018-12-07 21:46:30 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217230053686_attempt_86c43d67-0984-4d79-a51d-d70ba92314dd_0000_m_1131247845_679707855/Fact/Part0/Segment_null/5/part-0-5_batchno0-0-null-45217227922500.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190390079
	2018-12-07 21:46:30 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190390079
	2018-12-07 21:46:30 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217230053686_attempt_86c43d67-0984-4d79-a51d-d70ba92314dd_0000_m_1131247845_679707855/Fact/Part0/Segment_null/5
	2018-12-07 21:46:30 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217230053686_attempt_86c43d67-0984-4d79-a51d-d70ba92314dd_0000_m_1131247845_679707855/Fact/Part0/Segment_null/5/5_batchno0-0-null-45217227922500.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190390081
	2018-12-07 21:46:30 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190390081
	2018-12-07 21:46:30 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 2
	2018-12-07 21:46:30 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 2
	2018-12-07 21:46:30 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 2
	2018-12-07 21:46:30 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 2
	2018-12-07 21:46:30 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_86c43d67-0984-4d79-a51d-d70ba92314dd_0000_m_1131247845_679707855
	2018-12-07 21:46:30 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217230053686_attempt_86c43d67-0984-4d79-a51d-d70ba92314dd_0000_m_1131247845_679707855 : Time taken: 2
	2018-12-07 21:46:30 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45217364397664
	2018-12-07 21:46:30 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:30 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:30 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217367872272_attempt_b6f5de06-b1f8-4a77-b67c-2aaf593a78c4_0000_m_624517921_2017927107/Fact/Part0/Segment_null/5
	2018-12-07 21:46:30 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 15
	2018-12-07 21:46:30 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217367872272_attempt_b6f5de06-b1f8-4a77-b67c-2aaf593a78c4_0000_m_624517921_2017927107/Fact/Part0/Segment_null/5/part-0-5_batchno0-0-null-45217364397664.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190390147
	2018-12-07 21:46:30 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190390147
	2018-12-07 21:46:30 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217367872272_attempt_b6f5de06-b1f8-4a77-b67c-2aaf593a78c4_0000_m_624517921_2017927107/Fact/Part0/Segment_null/5
	2018-12-07 21:46:30 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217367872272_attempt_b6f5de06-b1f8-4a77-b67c-2aaf593a78c4_0000_m_624517921_2017927107/Fact/Part0/Segment_null/5/5_batchno0-0-null-45217364397664.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190390150
	2018-12-07 21:46:30 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190390150
	2018-12-07 21:46:30 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 15
	2018-12-07 21:46:30 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 15
	2018-12-07 21:46:30 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 15
	2018-12-07 21:46:30 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_b6f5de06-b1f8-4a77-b67c-2aaf593a78c4_0000_m_624517921_2017927107
	2018-12-07 21:46:30 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217367872272_attempt_b6f5de06-b1f8-4a77-b67c-2aaf593a78c4_0000_m_624517921_2017927107 : Time taken: 1
	2018-12-07 21:46:30 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:30 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:30 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:30 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217438130674_attempt_ab832b32-ca77-47f9-8243-1ae1925083eb_0000_m_-1788682390_112109695/Fact/Part0/Segment_null/5/sortrowtmp
	2018-12-07 21:46:30 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:30 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:30 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45217435378323
	2018-12-07 21:46:30 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:30 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 15 is: 36
	2018-12-07 21:46:30 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45217435378323
	2018-12-07 21:46:30 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:30 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:30 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 15
	2018-12-07 21:46:30 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:30 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217438130674_attempt_ab832b32-ca77-47f9-8243-1ae1925083eb_0000_m_-1788682390_112109695/Fact/Part0/Segment_null/5
	2018-12-07 21:46:30 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:30 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:30 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217438130674_attempt_ab832b32-ca77-47f9-8243-1ae1925083eb_0000_m_-1788682390_112109695/Fact/Part0/Segment_null/5
	2018-12-07 21:46:30 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 15
	2018-12-07 21:46:30 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217438130674_attempt_ab832b32-ca77-47f9-8243-1ae1925083eb_0000_m_-1788682390_112109695/Fact/Part0/Segment_null/5/part-0-5_batchno0-0-null-45217435378323.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190390279
	2018-12-07 21:46:30 INFO  CarbonUtil:2747 - Total copy time is 2 ms, operation id 1544190390279
	2018-12-07 21:46:30 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217438130674_attempt_ab832b32-ca77-47f9-8243-1ae1925083eb_0000_m_-1788682390_112109695/Fact/Part0/Segment_null/5
	2018-12-07 21:46:30 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217438130674_attempt_ab832b32-ca77-47f9-8243-1ae1925083eb_0000_m_-1788682390_112109695/Fact/Part0/Segment_null/5/5_batchno0-0-null-45217435378323.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190390282
	2018-12-07 21:46:30 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190390282
	2018-12-07 21:46:30 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 15
	2018-12-07 21:46:30 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 15
	2018-12-07 21:46:30 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 15
	2018-12-07 21:46:30 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 15
	2018-12-07 21:46:30 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_ab832b32-ca77-47f9-8243-1ae1925083eb_0000_m_-1788682390_112109695
	2018-12-07 21:46:30 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217438130674_attempt_ab832b32-ca77-47f9-8243-1ae1925083eb_0000_m_-1788682390_112109695 : Time taken: 1
	Tests run: 17, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.067 sec - in org.apache.carbondata.sdk.file.CSVCarbonWriterTest
	Running org.apache.carbondata.store.LocalCarbonStoreTest
	2018-12-07 21:46:30 INFO  CarbonDataProcessorUtil:572 - batch sort size is set to 0
	2018-12-07 21:46:30 INFO  SortParameters:427 - Sort size for table: 100000
	2018-12-07 21:46:30 INFO  SortParameters:433 - Number of intermediate file to be merged: 20
	2018-12-07 21:46:30 INFO  SortParameters:443 - temp file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217570221040_attempt_0075a5e0-4aee-455e-8a29-596e364f4fe1_0000_m_1364572776_665322992/Fact/Part0/Segment_null/45217570202977/sortrowtmp
	2018-12-07 21:46:30 INFO  SortParameters:460 -  Compression SNAPPY will be used for writing the sort temp File
	2018-12-07 21:46:30 WARN  UnsafeIntermediateMerger:88 - the configure spill size is 0 less than the page size 67108864,so no merge and spill in-memory pages to disk
	2018-12-07 21:46:30 INFO  DataLoadExecutor:50 - Data Loading is started for table _tempTable_45217567330398
	2018-12-07 21:46:30 INFO  UnsafeSortDataRows:270 - Unsafe based sorting will be used
	2018-12-07 21:46:30 INFO  UnsafeSortDataRows:419 - Time taken to sort row page with size: 100 is: 62
	2018-12-07 21:46:30 INFO  UnsafeParallelReadMergeSorterImpl:157 - Record Processed For table: _tempTable_45217567330398
	2018-12-07 21:46:30 INFO  UnsafeSingleThreadFinalSortFilesMerger:114 - Starting final merge of 1 pages, including row pages: 1, sort temp files: 0, intermediate merges: 0
	2018-12-07 21:46:30 INFO  UnsafeSingleThreadFinalSortFilesMerger:122 - Started adding first record from each page
	2018-12-07 21:46:30 INFO  UnsafeInmemoryHolder:47 - Processing unsafe inmemory rows page with size : 100
	2018-12-07 21:46:30 INFO  UnsafeSingleThreadFinalSortFilesMerger:155 - Heap Size: 1
	2018-12-07 21:46:30 WARN  CarbonDataProcessorUtil:93 - dir already exists, skip dir creation: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217570221040_attempt_0075a5e0-4aee-455e-8a29-596e364f4fe1_0000_m_1364572776_665322992/Fact/Part0/Segment_null/45217570202977
	2018-12-07 21:46:30 INFO  AbstractFactDataWriter:172 - Total file size: 1073741824 and dataBlock Size: 966367642
	2018-12-07 21:46:30 INFO  AbstractFactDataWriter:183 - Carbondata will write temporary fact data to local disk.
	2018-12-07 21:46:30 INFO  AbstractFactDataWriter:314 - Randomly choose factdata temp location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217570221040_attempt_0075a5e0-4aee-455e-8a29-596e364f4fe1_0000_m_1364572776_665322992/Fact/Part0/Segment_null/45217570202977
	2018-12-07 21:46:30 INFO  CarbonFactDataWriterImplV3:172 - Number of Pages for blocklet is: 1 :Rows Added: 100
	2018-12-07 21:46:30 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217570221040_attempt_0075a5e0-4aee-455e-8a29-596e364f4fe1_0000_m_1364572776_665322992/Fact/Part0/Segment_null/45217570202977/part-0-45217570202977_batchno0-0-null-45217567330398.carbondata to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190390454
	2018-12-07 21:46:30 INFO  CarbonUtil:2747 - Total copy time is 1 ms, operation id 1544190390454
	2018-12-07 21:46:30 INFO  AbstractFactDataWriter:394 - Randomly choose index file location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217570221040_attempt_0075a5e0-4aee-455e-8a29-596e364f4fe1_0000_m_1364572776_665322992/Fact/Part0/Segment_null/45217570202977
	2018-12-07 21:46:30 INFO  CarbonUtil:2733 - Copying /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217570221040_attempt_0075a5e0-4aee-455e-8a29-596e364f4fe1_0000_m_1364572776_665322992/Fact/Part0/Segment_null/45217570202977/45217570202977_batchno0-0-null-45217567330398.carbonindex to /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/testWriteFiles, operation id 1544190390457
	2018-12-07 21:46:30 INFO  CarbonUtil:2747 - Total copy time is 0 ms, operation id 1544190390457
	2018-12-07 21:46:30 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Writer: 100
	2018-12-07 21:46:30 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Sort Processor: 100
	2018-12-07 21:46:30 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Data Converter: 100
	2018-12-07 21:46:30 INFO  AbstractDataLoadProcessorStep:138 - Total rows processed in step Input Processor: 100
	2018-12-07 21:46:30 INFO  CarbonTableOutputFormat:467 - Closed writer task attempt_0075a5e0-4aee-455e-8a29-596e364f4fe1_0000_m_1364572776_665322992
	2018-12-07 21:46:30 INFO  CarbonLoaderUtil:142 - Deleted the local store location: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T//45217570221040_attempt_0075a5e0-4aee-455e-8a29-596e364f4fe1_0000_m_1364572776_665322992 : Time taken: 1
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.224 sec - in org.apache.carbondata.store.LocalCarbonStoreTest
	
	Results :
	
	Tests run: 68, Failures: 0, Errors: 0, Skipped: 0
	
	[INFO] 
	[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ carbondata-store-sdk ---
	[INFO] Building jar: /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/target/carbondata-store-sdk-1.6.0-SNAPSHOT.jar
	[INFO] 
	[INFO] --- maven-site-plugin:3.4:attach-descriptor (attach-descriptor) @ carbondata-store-sdk ---
	[INFO] 
	[INFO] --- maven-shade-plugin:2.4.3:shade (default) @ carbondata-store-sdk ---
	[INFO] Including org.apache.carbondata:carbondata-hadoop:jar:1.6.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-processing:jar:1.6.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-core:jar:1.6.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-format:jar:1.6.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.thrift:libthrift:jar:0.9.3 in the shaded jar.
	[INFO] Including org.apache.carbondata:carbondata-common:jar:1.6.0-SNAPSHOT in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-client:jar:2.7.2 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-mapreduce-client-app:jar:2.7.2 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-mapreduce-client-common:jar:2.7.2 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-yarn-client:jar:2.7.2 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-yarn-server-common:jar:2.7.2 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-mapreduce-client-shuffle:jar:2.7.2 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-yarn-api:jar:2.7.2 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-mapreduce-client-core:jar:2.7.2 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-yarn-common:jar:2.7.2 in the shaded jar.
	[INFO] Including com.sun.jersey:jersey-client:jar:1.9 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-mapreduce-client-jobclient:jar:2.7.2 in the shaded jar.
	[INFO] Including com.github.luben:zstd-jni:jar:1.3.2-2 in the shaded jar.
	[INFO] Including org.roaringbitmap:RoaringBitmap:jar:0.5.11 in the shaded jar.
	[INFO] Including io.netty:netty-all:jar:4.0.42.Final in the shaded jar.
	[INFO] Including org.lz4:lz4-java:jar:1.4.0 in the shaded jar.
	[INFO] Including com.univocity:univocity-parsers:jar:2.2.1 in the shaded jar.
	[INFO] Including org.apache.commons:commons-lang3:jar:3.5 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-hdfs:jar:2.7.2 in the shaded jar.
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
	[INFO] Including org.apache.hadoop:hadoop-aws:jar:2.7.2 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-common:jar:2.7.2 in the shaded jar.
	[INFO] Including org.apache.hadoop:hadoop-annotations:jar:2.7.2 in the shaded jar.
	[INFO] Including com.google.guava:guava:jar:11.0.2 in the shaded jar.
	[INFO] Including commons-cli:commons-cli:jar:1.2 in the shaded jar.
	[INFO] Including org.apache.commons:commons-math3:jar:3.1.1 in the shaded jar.
	[INFO] Including xmlenc:xmlenc:jar:0.52 in the shaded jar.
	[INFO] Including commons-httpclient:commons-httpclient:jar:3.1 in the shaded jar.
	[INFO] Including commons-io:commons-io:jar:2.4 in the shaded jar.
	[INFO] Including commons-net:commons-net:jar:3.1 in the shaded jar.
	[INFO] Including commons-collections:commons-collections:jar:3.2.2 in the shaded jar.
	[INFO] Including org.mortbay.jetty:jetty:jar:6.1.26 in the shaded jar.
	[INFO] Including org.mortbay.jetty:jetty-util:jar:6.1.26 in the shaded jar.
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
	[INFO] Including org.apache.hadoop:hadoop-auth:jar:2.7.2 in the shaded jar.
	[INFO] Including org.apache.directory.server:apacheds-kerberos-codec:jar:2.0.0-M15 in the shaded jar.
	[INFO] Including org.apache.directory.server:apacheds-i18n:jar:2.0.0-M15 in the shaded jar.
	[INFO] Including org.apache.directory.api:api-asn1-api:jar:1.0.0-M20 in the shaded jar.
	[INFO] Including org.apache.directory.api:api-util:jar:1.0.0-M20 in the shaded jar.
	[INFO] Including org.apache.curator:curator-framework:jar:2.7.1 in the shaded jar.
	[INFO] Including com.jcraft:jsch:jar:0.1.42 in the shaded jar.
	[INFO] Including org.apache.curator:curator-client:jar:2.7.1 in the shaded jar.
	[INFO] Including org.apache.curator:curator-recipes:jar:2.7.1 in the shaded jar.
	[INFO] Including com.google.code.findbugs:jsr305:jar:3.0.0 in the shaded jar.
	[INFO] Including org.apache.htrace:htrace-core:jar:3.1.0-incubating in the shaded jar.
	[INFO] Including org.apache.zookeeper:zookeeper:jar:3.4.6 in the shaded jar.
	[INFO] Including com.fasterxml.jackson.core:jackson-databind:jar:2.2.3 in the shaded jar.
	[INFO] Including com.fasterxml.jackson.core:jackson-core:jar:2.2.3 in the shaded jar.
	[INFO] Including com.fasterxml.jackson.core:jackson-annotations:jar:2.2.3 in the shaded jar.
	[INFO] Including com.amazonaws:aws-java-sdk:jar:1.7.4 in the shaded jar.
	[INFO] Including joda-time:joda-time:jar:2.10.1 in the shaded jar.
	[INFO] Including org.apache.httpcomponents:httpclient:jar:4.2.5 in the shaded jar.
	[INFO] Including org.apache.httpcomponents:httpcore:jar:4.2.4 in the shaded jar.
	[INFO] Including commons-logging:commons-logging:jar:1.1.1 in the shaded jar.
	[INFO] Including commons-codec:commons-codec:jar:1.6 in the shaded jar.
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
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/target/jacoco-it.exec
	[INFO] 
	[INFO] --- maven-checkstyle-plugin:2.17:check (default) @ carbondata-store-sdk ---
	[INFO] Starting audit...
	Audit done.
	[INFO] 
	[INFO] --- scalastyle-maven-plugin:0.8.0:check (default) @ carbondata-store-sdk ---
	[WARNING] sourceDirectory is not specified or does not exist value=/Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/src/main/scala
	Saving to outputFile=/Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/target/scalastyle-output.xml
	Processed 0 file(s)
	Found 0 errors
	Found 0 warnings
	Found 0 infos
	Finished in 1 ms
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report (default-report) @ carbondata-store-sdk ---
	[INFO] Loading execution data file /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/target/jacoco.exec
	[INFO] Analyzed bundle 'Apache CarbonData :: Store SDK' with 21 classes
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:report-integration (default-report-integration) @ carbondata-store-sdk ---
	[INFO] Skipping JaCoCo execution due to missing execution data file.
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:check (default-check) @ carbondata-store-sdk ---
	[INFO] Loading execution data file /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/target/jacoco.exec
	[INFO] Analyzed bundle 'carbondata-store-sdk' with 0 classes
	[INFO] All coverage checks have been met.
	[INFO] 
	[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ carbondata-store-sdk ---
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/target/carbondata-store-sdk-1.6.0-SNAPSHOT.jar to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-store-sdk/1.6.0-SNAPSHOT/carbondata-store-sdk-1.6.0-SNAPSHOT.jar
	[INFO] Installing /Users/xubo/Desktop/xubo/git/carbondata1/store/sdk/pom.xml to /Users/xubo/.m2/repository/org/apache/carbondata/carbondata-store-sdk/1.6.0-SNAPSHOT/carbondata-store-sdk-1.6.0-SNAPSHOT.pom
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building Apache CarbonData :: Spark Datasource 1.6.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ carbondata-spark-datasource ---
	[INFO] 
	[INFO] --- jacoco-maven-plugin:0.7.9:prepare-agent (default-prepare-agent) @ carbondata-spark-datasource ---
	[INFO] argLine set to -javaagent:/Users/xubo/.m2/repository/org/jacoco/org.jacoco.agent/0.7.9/org.jacoco.agent-0.7.9-runtime.jar=destfile=/Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/target/jacoco.exec,append=true
	[INFO] 
	[INFO] --- build-helper-maven-plugin:3.0.0:add-source (add-source) @ carbondata-spark-datasource ---
	[INFO] Source directory: /Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/src/main/spark2.1andspark2.2 added.
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
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/src/main/spark2.1andspark2.2:-1: info: compiling
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/src/main/scala:-1: info: compiling
	[INFO] Compiling 15 source files to /Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/target/classes at 1544190401560
	[WARNING] warning: Class org.apache.hadoop.yarn.api.records.ReservationId not found - continuing with a stub.
	[WARNING] warning: Class org.apache.hadoop.yarn.api.records.ReservationId not found - continuing with a stub.
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/src/main/scala/org/apache/spark/sql/carbondata/execution/datasources/SparkCarbonFileFormat.scala:500: warning: non-variable type argument String in type scala.collection.immutable.Map[String,String] (the underlying of Map[String,String]) is unchecked since it is eliminated by erasure
	[INFO]         if (taskCommits.exists(_.obj.isInstanceOf[Map[String, String]])) {
	[INFO]                                                  ^
	[WARNING] three warnings found
	[INFO] prepare-compile in 0 s
	[INFO] compile in 8 s
	[INFO] 
	[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ carbondata-spark-datasource ---
	[INFO] Changes detected - recompiling the module!
	[INFO] Compiling 6 source files to /Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/target/classes
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
	[INFO] 
	[INFO] --- maven-scala-plugin:2.15.2:testCompile (testCompile) @ carbondata-spark-datasource ---
	[INFO] Checking for multiple versions of scala
	[INFO] includes = [**/*.java,**/*.scala,]
	[INFO] excludes = []
	[INFO] /Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/src/test/scala:-1: info: compiling
	[INFO] Compiling 3 source files to /Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/target/test-classes at 1544190418602
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/src/test/scala/org/apache/spark/sql/carbondata/datasource/SparkCarbonDataSourceTest.scala:1006: warning: This catches all Throwables. If this is really intended, use `case _ : Throwable` to clear this warning.
	[INFO]       case _ => None
	[INFO]            ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/src/test/scala/org/apache/spark/sql/carbondata/datasource/SparkCarbonDataSourceTest.scala:1071: warning: This catches all Throwables. If this is really intended, use `case _ : Throwable` to clear this warning.
	[INFO]       case _ => None
	[INFO]            ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/src/test/scala/org/apache/spark/sql/carbondata/datasource/SparkCarbonDataSourceTest.scala:1107: warning: This catches all Throwables. If this is really intended, use `case _ : Throwable` to clear this warning.
	[INFO]       case _ => None
	[INFO]            ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/src/test/scala/org/apache/spark/sql/carbondata/datasource/SparkCarbonDataSourceTest.scala:1184: warning: This catches all Throwables. If this is really intended, use `case _ : Throwable` to clear this warning.
	[INFO]       case _ => None
	[INFO]            ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/src/test/scala/org/apache/spark/sql/carbondata/datasource/TestCreateTableUsingSparkCarbonFileFormat.scala:375: warning: A try without a catch or finally is equivalent to putting its body in a block; no exceptions are handled.
	[INFO]     try{
	[INFO]     ^
	[WARNING] /Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/src/test/scala/org/apache/spark/sql/carbondata/datasource/TestUtil.scala:123: warning: enclosing method checkAnswer has result type Unit: return value discarded
	[ERROR]         return Some(errorMessage)
	[INFO]         ^
	[WARNING] 6 warnings found
	[INFO] prepare-compile in 0 s
	[INFO] compile in 9 s
	[INFO] 
	[INFO] --- scalatest-maven-plugin:1.0:test (test) @ carbondata-spark-datasource ---
	Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=512m; support was removed in 8.0
	Discovery starting.
	Discovery completed in 416 milliseconds.
	Run starting. Expected test count is: 65
	SparkCarbonDataSourceTest:
	2018-12-07 21:47:10 INFO  SparkContext:54 - Running Spark version 2.1.0
	2018-12-07 21:47:10 WARN  NativeCodeLoader:62 - Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
	2018-12-07 21:47:10 WARN  Utils:66 - Your hostname, localhost resolves to a loopback address: 127.0.0.1; using 192.168.3.124 instead (on interface en0)
	2018-12-07 21:47:10 WARN  Utils:66 - Set SPARK_LOCAL_IP if you need to bind to another address
	2018-12-07 21:47:10 INFO  SecurityManager:54 - Changing view acls to: xubo
	2018-12-07 21:47:10 INFO  SecurityManager:54 - Changing modify acls to: xubo
	2018-12-07 21:47:10 INFO  SecurityManager:54 - Changing view acls groups to: 
	2018-12-07 21:47:10 INFO  SecurityManager:54 - Changing modify acls groups to: 
	2018-12-07 21:47:10 INFO  SecurityManager:54 - SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(xubo); groups with view permissions: Set(); users  with modify permissions: Set(xubo); groups with modify permissions: Set()
	2018-12-07 21:47:11 INFO  Utils:54 - Successfully started service 'sparkDriver' on port 54375.
	2018-12-07 21:47:11 INFO  SparkEnv:54 - Registering MapOutputTracker
	2018-12-07 21:47:11 INFO  SparkEnv:54 - Registering BlockManagerMaster
	2018-12-07 21:47:11 INFO  BlockManagerMasterEndpoint:54 - Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
	2018-12-07 21:47:11 INFO  BlockManagerMasterEndpoint:54 - BlockManagerMasterEndpoint up
	2018-12-07 21:47:11 INFO  DiskBlockManager:54 - Created local directory at /private/var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/blockmgr-f13d3e72-18a2-466f-b348-cd4cc99e0998
	2018-12-07 21:47:11 INFO  MemoryStore:54 - MemoryStore started with capacity 1458.6 MB
	2018-12-07 21:47:11 INFO  SparkEnv:54 - Registering OutputCommitCoordinator
	2018-12-07 21:47:11 INFO  log:186 - Logging initialized @3626ms
	2018-12-07 21:47:11 INFO  Server:327 - jetty-9.2.z-SNAPSHOT
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@3fdef83{/jobs,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@5157d57c{/jobs/json,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@7b2794ac{/jobs/job,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@67b47b31{/jobs/job/json,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@b5911b3{/stages,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@64cac991{/stages/json,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@238fa350{/stages/stage,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@67a639e3{/stages/stage/json,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@2431682d{/stages/pool,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@1605ab7b{/stages/pool/json,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@48ce0fc8{/storage,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@1ef15e13{/storage/json,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@312e3de0{/storage/rdd,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@acb16cd{/storage/rdd/json,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@32c3f813{/environment,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@26d6399e{/environment/json,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@6657c199{/executors,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@34f8cee0{/executors/json,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@19d6bb0c{/executors/threadDump,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@e5b7b61{/executors/threadDump/json,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@56d8283a{/static,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@242573cf{/,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@807b29c{/api,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@5d52508e{/jobs/job/kill,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@4adc3ae6{/stages/stage/kill,null,AVAILABLE}
	2018-12-07 21:47:11 INFO  ServerConnector:266 - Started ServerConnector@3729c576{HTTP/1.1}{0.0.0.0:4040}
	2018-12-07 21:47:11 INFO  Server:379 - Started @3820ms
	2018-12-07 21:47:11 INFO  Utils:54 - Successfully started service 'SparkUI' on port 4040.
	2018-12-07 21:47:11 INFO  SparkUI:54 - Bound SparkUI to 0.0.0.0, and started at http://localhost:4040
	2018-12-07 21:47:11 INFO  Executor:54 - Starting executor ID driver on host localhost
	2018-12-07 21:47:11 INFO  Utils:54 - Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 54376.
	2018-12-07 21:47:11 INFO  NettyBlockTransferService:54 - Server created on localhost:54376
	2018-12-07 21:47:11 INFO  BlockManager:54 - Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
	2018-12-07 21:47:11 INFO  BlockManagerMaster:54 - Registering BlockManager BlockManagerId(driver, localhost, 54376, None)
	2018-12-07 21:47:11 INFO  BlockManagerMasterEndpoint:54 - Registering block manager localhost:54376 with 1458.6 MB RAM, BlockManagerId(driver, localhost, 54376, None)
	2018-12-07 21:47:11 INFO  BlockManagerMaster:54 - Registered BlockManager BlockManagerId(driver, localhost, 54376, None)
	2018-12-07 21:47:11 INFO  BlockManager:54 - Initialized BlockManager: BlockManagerId(driver, localhost, 54376, None)
	2018-12-07 21:47:12 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@33d11437{/metrics/json,null,AVAILABLE}
	2018-12-07 21:47:12 INFO  SharedState:54 - Warehouse path is '/Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/target/warehouse'.
	2018-12-07 21:47:12 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@5c8d2380{/SQL,null,AVAILABLE}
	2018-12-07 21:47:12 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@26e40792{/SQL/json,null,AVAILABLE}
	2018-12-07 21:47:12 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@5c8b33bd{/SQL/execution,null,AVAILABLE}
	2018-12-07 21:47:12 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@2a946570{/SQL/execution/json,null,AVAILABLE}
	2018-12-07 21:47:12 INFO  ContextHandler:744 - Started o.s.j.s.ServletContextHandler@5ba41f44{/static/sql,null,AVAILABLE}
	2018-12-07 21:47:12 INFO  HiveUtils:54 - Initializing HiveMetastoreConnection version 1.2.1 using Spark classes.
	2018-12-07 21:47:13 INFO  HiveMetaStore:589 - 0: Opening raw store with implemenation class:org.apache.hadoop.hive.metastore.ObjectStore
	2018-12-07 21:47:13 INFO  ObjectStore:289 - ObjectStore, initialize called
	2018-12-07 21:47:13 INFO  Persistence:77 - Property hive.metastore.integral.jdo.pushdown unknown - will be ignored
	2018-12-07 21:47:13 INFO  Persistence:77 - Property datanucleus.cache.level2 unknown - will be ignored
	2018-12-07 21:47:15 INFO  ObjectStore:370 - Setting MetaStore object pin classes with hive.metastore.cache.pinobjtypes="Table,StorageDescriptor,SerDeInfo,Partition,Database,Type,FieldSchema,Order"
	2018-12-07 21:47:17 INFO  Datastore:77 - The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	2018-12-07 21:47:17 INFO  Datastore:77 - The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	2018-12-07 21:47:19 INFO  Datastore:77 - The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
	2018-12-07 21:47:19 INFO  Datastore:77 - The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
	2018-12-07 21:47:19 INFO  MetaStoreDirectSql:139 - Using direct SQL, underlying DB is DERBY
	2018-12-07 21:47:19 INFO  ObjectStore:272 - Initialized ObjectStore
	2018-12-07 21:47:19 WARN  ObjectStore:6666 - Version information not found in metastore. hive.metastore.schema.verification is not enabled so recording the schema version 1.2.0
	2018-12-07 21:47:19 WARN  ObjectStore:568 - Failed to get database default, returning NoSuchObjectException
	2018-12-07 21:47:20 INFO  HiveMetaStore:663 - Added admin role in metastore
	2018-12-07 21:47:20 INFO  HiveMetaStore:672 - Added public role in metastore
	2018-12-07 21:47:20 INFO  HiveMetaStore:712 - No user is added in admin role, since config is empty
	2018-12-07 21:47:20 INFO  HiveMetaStore:746 - 0: get_all_databases
	2018-12-07 21:47:20 INFO  audit:371 - ugi=xubo	ip=unknown-ip-addr	cmd=get_all_databases	
	2018-12-07 21:47:20 INFO  HiveMetaStore:746 - 0: get_functions: db=default pat=*
	2018-12-07 21:47:20 INFO  audit:371 - ugi=xubo	ip=unknown-ip-addr	cmd=get_functions: db=default pat=*	
	2018-12-07 21:47:20 INFO  Datastore:77 - The class "org.apache.hadoop.hive.metastore.model.MResourceUri" is tagged as "embedded-only" so does not have its own datastore table.
	2018-12-07 21:47:20 INFO  SessionState:641 - Created local directory: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/6dc8702c-cb1c-4bfd-8797-2936577837e2_resources
	2018-12-07 21:47:20 INFO  SessionState:641 - Created HDFS directory: /tmp/hive/xubo/6dc8702c-cb1c-4bfd-8797-2936577837e2
	2018-12-07 21:47:20 INFO  SessionState:641 - Created local directory: /var/folders/lw/4y5plg0x7rq45h38m4sfxlbm0000gn/T/xubo/6dc8702c-cb1c-4bfd-8797-2936577837e2
	2018-12-07 21:47:20 INFO  SessionState:641 - Created HDFS directory: /tmp/hive/xubo/6dc8702c-cb1c-4bfd-8797-2936577837e2/_tmp_space.db
	2018-12-07 21:47:20 INFO  HiveClientImpl:54 - Warehouse location for Hive client (version 1.2.1) is /Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/target/warehouse
	2018-12-07 21:47:20 INFO  HiveMetaStore:746 - 0: get_database: default
	2018-12-07 21:47:20 INFO  audit:371 - ugi=xubo	ip=unknown-ip-addr	cmd=get_database: default	
	2018-12-07 21:47:20 INFO  HiveMetaStore:746 - 0: get_database: global_temp
	2018-12-07 21:47:20 INFO  audit:371 - ugi=xubo	ip=unknown-ip-addr	cmd=get_database: global_temp	
	2018-12-07 21:47:20 WARN  ObjectStore:568 - Failed to get database global_temp, returning NoSuchObjectException
	*** RUN ABORTED ***
	  org.apache.spark.sql.catalyst.parser.ParseException: mismatched input 'location' expecting {<EOF>, '(', '.', 'SELECT', 'FROM', 'AS', 'WITH', 'VALUES', 'TABLE', 'INSERT', 'MAP', 'REDUCE', 'OPTIONS', 'CLUSTERED', 'PARTITIONED'}(line 1, pos 150)
	
	== SQL ==
	create table par_table(male boolean, age int, height double, name string, address string,salary long, floatField float, bytefield byte) using parquet location '/Users/xubo/Desktop/xubo/git/carbondata1/integration/spark-datasource/target/warehouse2'
	------------------------------------------------------------------------------------------------------------------------------------------------------^^^
	  at org.apache.spark.sql.catalyst.parser.ParseException.withCommand(ParseDriver.scala:197)
	  at org.apache.spark.sql.catalyst.parser.AbstractSqlParser.parse(ParseDriver.scala:99)
	  at org.apache.spark.sql.execution.SparkSqlParser.parse(SparkSqlParser.scala:45)
	  at org.apache.spark.sql.catalyst.parser.AbstractSqlParser.parsePlan(ParseDriver.scala:53)
	  at org.apache.spark.sql.SparkSession.sql(SparkSession.scala:592)
	  at org.apache.spark.sql.carbondata.datasource.SparkCarbonDataSourceTest.createParquetTable(SparkCarbonDataSourceTest.scala:1126)
	  at org.apache.spark.sql.carbondata.datasource.SparkCarbonDataSourceTest.beforeAll(SparkCarbonDataSourceTest.scala:1359)
	  at org.scalatest.BeforeAndAfterAll$class.beforeAll(BeforeAndAfterAll.scala:187)
	  at org.apache.spark.sql.carbondata.datasource.SparkCarbonDataSourceTest.beforeAll(SparkCarbonDataSourceTest.scala:38)
	  at org.scalatest.BeforeAndAfterAll$class.run(BeforeAndAfterAll.scala:253)
	  ...
	[INFO] ------------------------------------------------------------------------
	[INFO] Reactor Summary:
	[INFO] 
	[INFO] Apache CarbonData :: Parent ........................ SUCCESS [  3.047 s]
	[INFO] Apache CarbonData :: Common ........................ SUCCESS [  6.423 s]
	[INFO] Apache CarbonData :: Core .......................... SUCCESS [01:19 min]
	[INFO] Apache CarbonData :: Processing .................... SUCCESS [ 20.925 s]
	[INFO] Apache CarbonData :: Hadoop ........................ SUCCESS [ 17.470 s]
	[INFO] Apache CarbonData :: Streaming ..................... SUCCESS [ 23.269 s]
	[INFO] Apache CarbonData :: Store SDK ..................... SUCCESS [ 37.673 s]
	[INFO] Apache CarbonData :: Spark Datasource .............. FAILURE [ 48.211 s]
	[INFO] Apache CarbonData :: Spark Common .................. SKIPPED
	[INFO] Apache CarbonData :: CLI ........................... SKIPPED
	[INFO] Apache CarbonData :: Lucene Index DataMap .......... SKIPPED
	[INFO] Apache CarbonData :: Bloom Index DataMap ........... SKIPPED
	[INFO] Apache CarbonData :: Spark2 ........................ SKIPPED
	[INFO] Apache CarbonData :: Spark Common Test ............. SKIPPED
	[INFO] Apache CarbonData :: DataMap Examples .............. SKIPPED
	[INFO] Apache CarbonData :: Assembly ...................... SKIPPED
	[INFO] Apache CarbonData :: Hive .......................... SKIPPED
	[INFO] Apache CarbonData :: presto ........................ SKIPPED
	[INFO] Apache CarbonData :: Spark2 Examples ............... SKIPPED
	[INFO] ------------------------------------------------------------------------
	[INFO] BUILD FAILURE
	[INFO] ------------------------------------------------------------------------
	[INFO] Total time: 03:57 min
	[INFO] Finished at: 2018-12-07T21:47:26+08:00
	[INFO] Final Memory: 125M/1390M
	[INFO] ------------------------------------------------------------------------
	[ERROR] Failed to execute goal org.scalatest:scalatest-maven-plugin:1.0:test (test) on project carbondata-spark-datasource: There are test failures -> [Help 1]
	[ERROR] 
	[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
	[ERROR] Re-run Maven using the -X switch to enable full debug logging.
	[ERROR] 
	[ERROR] For more information about the errors and possible solutions, please read the following articles:
	[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
	[ERROR] 
	[ERROR] After correcting the problems, you can resume the build with the command
	[ERROR]   mvn <goals> -rf :carbondata-spark-datasource
	
	Process finished with exit code 1
