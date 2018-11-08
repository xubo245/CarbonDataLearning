    Last login: Mon Jun  4 15:26:29 on ttys006
    localhost:play-scala-rest-api-example xubo$ pwd
    /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example
    localhost:play-scala-rest-api-example xubo$ ls
    LICENSE				build.gradle			docs				gradlew				project				target
    README.md			build.sbt			gatling				gradlew.bat			public				test
    app				conf				gradle				play-scala-rest-api-example.iml	scripts
    localhost:play-scala-rest-api-example xubo$ cd ../
    localhost:git xubo$ ls
    CarbonDataLearning		PlayBasics			carbondata1			down				spark
    GesturesRecognition		TensorFlowOnSpark		carbondata2			opencv				thrift
    OpenCvObjectDetection		carbon.metastore		carbondata3			play-scala-rest-api-example
    localhost:git xubo$ git clone git@github.com:playframework/play-java-rest-api-example.git
    Cloning into 'play-java-rest-api-example'...
    remote: Counting objects: 366, done.
    remote: Compressing objects: 100% (13/13), done.
    Receiving objects: 100% (366/366), 113.25 KiB | 117.00 KiB/s, done.
    remote: Total 366 (delta 4), reused 8 (delta 0), pack-reused 353
    Resolving deltas: 100% (170/170), done.
    localhost:git xubo$ cd play-java-rest-api-example/
    localhost:play-java-rest-api-example xubo$ ls
    LICENSE		app		build.sbt	gatling		gradlew		project		scripts
    README.md	build.gradle	conf		gradle		gradlew.bat	public		test
    localhost:play-java-rest-api-example xubo$ sbt run
    [info] Loading settings from plugins.sbt ...
    [info] Loading project definition from /Users/xubo/Desktop/xubo/git/play-java-rest-api-example/project
    [info] Updating ProjectRef(uri("file:/Users/xubo/Desktop/xubo/git/play-java-rest-api-example/project/"), "play-java-rest-api-example-build")...
    Waiting for lock on /Users/xubo/.ivy2/.sbt.ivy.lock to be available...
    [info] Done updating.
    [warn] Found version conflict(s) in library dependencies; some are suspected to be binary incompatible:
    [warn] 	* org.webjars:webjars-locator-core:0.33 is selected over 0.32
    [warn] 	    +- com.typesafe:npm_2.12:1.2.1                        (depends on 0.32)
    [warn] 	    +- com.typesafe.sbt:sbt-web:1.4.3 (scalaVersion=2.12, sbtVersion=1.0) (depends on 0.32)
    [warn] 	* org.codehaus.plexus:plexus-utils:3.0.17 is selected over {2.1, 1.5.5}
    [warn] 	    +- org.apache.maven:maven-settings:3.2.2              (depends on 3.0.17)
    [warn] 	    +- org.apache.maven:maven-repository-metadata:3.2.2   (depends on 3.0.17)
    [warn] 	    +- org.apache.maven:maven-aether-provider:3.2.2       (depends on 3.0.17)
    [warn] 	    +- org.apache.maven:maven-model:3.2.2                 (depends on 3.0.17)
    [warn] 	    +- org.apache.maven:maven-core:3.2.2                  (depends on 3.0.17)
    [warn] 	    +- org.apache.maven:maven-artifact:3.2.2              (depends on 3.0.17)
    [warn] 	    +- org.apache.maven:maven-settings-builder:3.2.2      (depends on 3.0.17)
    [warn] 	    +- org.apache.maven:maven-model-builder:3.2.2         (depends on 3.0.17)
    [warn] 	    +- org.sonatype.plexus:plexus-sec-dispatcher:1.3      (depends on 1.5.5)
    [warn] 	    +- org.eclipse.sisu:org.eclipse.sisu.plexus:0.0.0.M5  (depends on 2.1)
    [warn] 	* com.google.guava:guava:23.0 is selected over {10.0.1, 16.0, 20.0}
    [warn] 	    +- io.methvin:directory-watcher:0.3.2                 (depends on 23.0)
    [warn] 	    +- com.fasterxml.jackson.datatype:jackson-datatype-guava:2.8.8 (depends on 10.0.1)
    [warn] 	    +- org.eclipse.sisu:org.eclipse.sisu.plexus:0.0.0.M5  (depends on 10.0.1)
    [warn] 	    +- com.spotify:docker-client:8.9.0                    (depends on 10.0.1)
    [warn] Run 'evicted' to see detailed eviction warnings
    [info] Loading settings from build.sbt ...
    [info] Set current project to play-java-rest-api-example (in build file:/Users/xubo/Desktop/xubo/git/play-java-rest-api-example/)
    [info] Updating ...
    [info] downloading https://repo1.maven.org/maven2/net/jodah/failsafe/1.0.3/failsafe-1.0.3.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/springframework/spring-context/4.3.11.RELEASE/spring-context-4.3.11.RELEASE.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-java-forms_2.12/2.6.15/play-java-forms_2.12-2.6.15.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/netty/netty-transport/4.0.51.Final/netty-transport-4.0.51.Final.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/netty/netty-codec/4.0.51.Final/netty-codec-4.0.51.Final.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-java_2.12/2.6.15/play-java_2.12-2.6.15.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/netty/netty-buffer/4.0.51.Final/netty-buffer-4.0.51.Final.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/jboss/spec/javax/transaction/jboss-transaction-api_1.2_spec/1.0.1.Final/jboss-transaction-api_1.2_spec-1.0.1.Final.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-redis/2.3.0/gatling-redis-2.3.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-recorder/2.3.0/gatling-recorder-2.3.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/zaxxer/HikariCP/2.7.9/HikariCP-2.7.9.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-test-framework/2.3.0/gatling-test-framework-2.3.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/h2database/h2/1.4.197/h2-1.4.197.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/asynchttpclient/async-http-client-netty-utils/2.0.35/async-http-client-netty-utils-2.0.35.jar ...
    [info] downloading https://repo1.maven.org/maven2/antlr/antlr/2.7.7/antlr-2.7.7.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/hibernate/javax/persistence/hibernate-jpa-2.1-api/1.0.0.Final/hibernate-jpa-2.1-api-1.0.0.Final.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.jar ...
    [info] downloading https://repo1.maven.org/maven2/dom4j/dom4j/1.6.1/dom4j-1.6.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-charts/2.3.0/gatling-charts-2.3.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-java-jpa_2.12/2.6.15/play-java-jpa_2.12-2.6.15.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-java-jdbc_2.12/2.6.15/play-java-jdbc_2.12-2.6.15.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-http/2.3.0/gatling-http-2.3.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/gatling/highcharts/gatling-charts-highcharts/2.3.0/gatling-charts-highcharts-2.3.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.8.11/jackson-datatype-jsr310-2.8.11.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/netty/netty-transport-native-epoll/4.0.51.Final/netty-transport-native-epoll-4.0.51.Final-linux-x86_64.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-json_2.12/2.6.9/play-json_2.12-2.6.9.jar ...
    [info] downloading https://repo1.maven.org/maven2/xalan/serializer/2.7.2/serializer-2.7.2.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.6/commons-lang3-3.6.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/dongxiguo/fastring_2.12/0.3.1/fastring_2.12-0.3.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-functional_2.12/2.6.9/play-functional_2.12-2.6.9.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-streams_2.12/2.6.15/play-streams_2.12-2.6.15.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/google/code/gson/gson/2.8.0/gson-2.8.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/github/ben-manes/caffeine/caffeine/2.5.5/caffeine-2.5.5.jar ...
    [info] downloading https://repo1.maven.org/maven2/net/java/dev/jna/jna-platform/4.1.0/jna-platform-4.1.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar ...
    [info] 	[SUCCESSFUL ] org.asynchttpclient#async-http-client-netty-utils;2.0.35!async-http-client-netty-utils.jar (19926ms)
    [info] downloading https://repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-support/3.5.3/selenium-support-3.5.3.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/eclipse/jetty/websocket/websocket-client/9.4.5.v20170502/websocket-client-9.4.5.v20170502.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-java-jpa_2.12;2.6.15!play-java-jpa_2.12.jar (25091ms)
    [info] 	[SUCCESSFUL ] io.gatling#gatling-redis;2.3.0!gatling-redis.jar (37575ms)
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-metrics/2.3.0/gatling-metrics-2.3.0.jar ...
    [info] 	[SUCCESSFUL ] org.jboss.spec.javax.transaction#jboss-transaction-api_1.2_spec;1.0.1.Final!jboss-transaction-api_1.2_spec.jar (40105ms)
    [info] downloading https://repo1.maven.org/maven2/org/jboss/jandex/2.0.3.Final/jandex-2.0.3.Final.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-java-jdbc_2.12;2.6.15!play-java-jdbc_2.12.jar (40789ms)
    [info] downloading https://repo1.maven.org/maven2/io/advantageous/boon/boon-json/0.6.6/boon-json-0.6.6.jar ...
    [info] 	[SUCCESSFUL ] io.gatling#gatling-test-framework;2.3.0!gatling-test-framework.jar (56175ms)
    [info] 	[SUCCESSFUL ] net.jodah#failsafe;1.0.3!failsafe.jar (56790ms)
    [info] 	[SUCCESSFUL ] com.fasterxml.jackson.datatype#jackson-datatype-jsr310;2.8.11!jackson-datatype-jsr310.jar(bundle) (57014ms)
    [info] 	[SUCCESSFUL ] io.netty#netty-buffer;4.0.51.Final!netty-buffer.jar (59177ms)
    [info] downloading https://repo1.maven.org/maven2/io/netty/netty-common/4.0.51.Final/netty-common-4.0.51.Final.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-java-forms_2.12;2.6.15!play-java-forms_2.12.jar (67951ms)
    [info] 	[SUCCESSFUL ] org.hibernate.javax.persistence#hibernate-jpa-2.1-api;1.0.0.Final!hibernate-jpa-2.1-api.jar (72673ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-jdbc_2.12/2.6.15/play-jdbc_2.12-2.6.15.jar ...
    [info] 	[SUCCESSFUL ] com.zaxxer#HikariCP;2.7.9!HikariCP.jar(bundle) (78564ms)
    [info] downloading https://repo1.maven.org/maven2/com/googlecode/usc/jdbcdslog/1.0.6.2/jdbcdslog-1.0.6.2.jar ...
    [info] 	[SUCCESSFUL ] com.dongxiguo#fastring_2.12;0.3.1!fastring_2.12.jar (81021ms)
    [info] 	[SUCCESSFUL ] xalan#serializer;2.7.2!serializer.jar (101302ms)
    [info] 	[SUCCESSFUL ] org.eclipse.jetty.websocket#websocket-client;9.4.5.v20170502!websocket-client.jar (105776ms)
    [info] 	[SUCCESSFUL ] io.advantageous.boon#boon-json;0.6.6!boon-json.jar (107739ms)
    [info] 	[SUCCESSFUL ] io.netty#netty-codec;4.0.51.Final!netty-codec.jar (109004ms)
    [info] 	[SUCCESSFUL ] dom4j#dom4j;1.6.1!dom4j.jar (111452ms)
    [info] downloading https://repo1.maven.org/maven2/org/hibernate/common/hibernate-commons-annotations/5.0.1.Final/hibernate-commons-annotations-5.0.1.Final.jar ...
    [info] downloading https://repo1.maven.org/maven2/net/sf/saxon/Saxon-HE/9.8.0-4/Saxon-HE-9.8.0-4.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-jdbc_2.12;2.6.15!play-jdbc_2.12.jar (49185ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-jdbc-api_2.12/2.6.15/play-jdbc-api_2.12-2.6.15.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-java_2.12;2.6.15!play-java_2.12.jar (122057ms)
    [info] downloading https://repo1.maven.org/maven2/org/reflections/reflections/0.9.11/reflections-0.9.11.jar ...
    [info] 	[SUCCESSFUL ] org.jboss#jandex;2.0.3.Final!jandex.jar(bundle) (82162ms)
    [info] 	[SUCCESSFUL ] antlr#antlr;2.7.7!antlr.jar (124459ms)
    [info] 	[SUCCESSFUL ] org.apache.commons#commons-lang3;3.6!commons-lang3.jar (124938ms)
    [info] 	[SUCCESSFUL ] ch.qos.logback#logback-classic;1.2.3!logback-classic.jar (126122ms)
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-streams_2.12;2.6.15!play-streams_2.12.jar (132143ms)
    [info] 	[SUCCESSFUL ] io.gatling#gatling-metrics;2.3.0!gatling-metrics.jar (94610ms)
    [info] downloading https://repo1.maven.org/maven2/org/asynchttpclient/async-http-client/2.0.35/async-http-client-2.0.35.jar ...
    [info] 	[SUCCESSFUL ] io.gatling#gatling-charts;2.3.0!gatling-charts.jar (132400ms)
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-app/2.3.0/gatling-app-2.3.0.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-functional_2.12;2.6.9!play-functional_2.12.jar (134133ms)
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-jdbc-api_2.12;2.6.15!play-jdbc-api_2.12.jar (16006ms)
    [info] downloading https://repo1.maven.org/maven2/com/jolbox/bonecp/0.8.0.RELEASE/bonecp-0.8.0.RELEASE.jar ...
    [info] downloading https://repo1.maven.org/maven2/joda-time/joda-time/2.9.9/joda-time-2.9.9.jar ...
    [info] 	[SUCCESSFUL ] org.javassist#javassist;3.21.0-GA!javassist.jar(bundle) (139798ms)
    [info] downloading https://repo1.maven.org/maven2/javax/validation/validation-api/1.1.0.Final/validation-api-1.1.0.Final.jar ...
    [info] 	[SUCCESSFUL ] com.google.code.gson#gson;2.8.0!gson.jar (140346ms)
    [info] 	[SUCCESSFUL ] io.netty#netty-common;4.0.51.Final!netty-common.jar (82267ms)
    [info] 	[SUCCESSFUL ] org.hibernate.common#hibernate-commons-annotations;5.0.1.Final!hibernate-commons-annotations.jar (31002ms)
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-json_2.12;2.6.9!play-json_2.12.jar (143540ms)
    [info] 	[SUCCESSFUL ] org.springframework#spring-context;4.3.11.RELEASE!spring-context.jar (148624ms)
    [info] downloading https://repo1.maven.org/maven2/org/springframework/spring-core/4.3.11.RELEASE/spring-core-4.3.11.RELEASE.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/google/guava/guava/22.0/guava-22.0.jar ...
    [info] 	[SUCCESSFUL ] io.gatling.highcharts#gatling-charts-highcharts;2.3.0!gatling-charts-highcharts.jar (150984ms)
    [info] 	[SUCCESSFUL ] com.googlecode.usc#jdbcdslog;1.0.6.2!jdbcdslog.jar (74816ms)
    [info] downloading https://repo1.maven.org/maven2/tyrex/tyrex/1.0.1/tyrex-1.0.1.jar ...
    [info] 	[SUCCESSFUL ] org.reflections#reflections;0.9.11!reflections.jar (32210ms)
    [info] downloading https://repo1.maven.org/maven2/net/jodah/typetools/0.5.0/typetools-0.5.0.jar ...
    [info] 	[SUCCESSFUL ] io.gatling#gatling-http;2.3.0!gatling-http.jar (155442ms)
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-jms/2.3.0/gatling-jms-2.3.0.jar ...
    [info] 	[SUCCESSFUL ] io.gatling#gatling-recorder;2.3.0!gatling-recorder.jar (156602ms)
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-core/2.3.0/gatling-core-2.3.0.jar ...
    [info] 	[SUCCESSFUL ] org.seleniumhq.selenium#selenium-support;3.5.3!selenium-support.jar (157615ms)
    [info] 	[SUCCESSFUL ] io.netty#netty-transport;4.0.51.Final!netty-transport.jar (164757ms)
    [info] downloading https://repo1.maven.org/maven2/org/asynchttpclient/netty-resolver/2.0.35/netty-resolver-2.0.35.jar ...
    [info] 	[SUCCESSFUL ] io.netty#netty-transport-native-epoll;4.0.51.Final!netty-transport-native-epoll.jar (164917ms)
    [info] downloading https://repo1.maven.org/maven2/io/netty/netty-codec-http/4.0.51.Final/netty-codec-http-4.0.51.Final.jar ...
    [info] 	[SUCCESSFUL ] javax.validation#validation-api;1.1.0.Final!validation-api.jar (28246ms)
    [info] downloading https://repo1.maven.org/maven2/org/jboss/logging/jboss-logging/3.3.0.Final/jboss-logging-3.3.0.Final.jar ...
    [info] 	[SUCCESSFUL ] net.jodah#typetools;0.5.0!typetools.jar(bundle) (25288ms)
    [info] downloading https://repo1.maven.org/maven2/org/hibernate/hibernate-validator/5.4.1.Final/hibernate-validator-5.4.1.Final.jar ...
    [info] 	[SUCCESSFUL ] io.gatling#gatling-app;2.3.0!gatling-app.jar (49889ms)
    [info] 	[SUCCESSFUL ] com.github.ben-manes.caffeine#caffeine;2.5.5!caffeine.jar (184772ms)
    [info] 	[SUCCESSFUL ] io.gatling#gatling-jms;2.3.0!gatling-jms.jar (42833ms)
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-jdbc/2.3.0/gatling-jdbc-2.3.0.jar ...
    [info] 	[SUCCESSFUL ] org.asynchttpclient#netty-resolver;2.0.35!netty-resolver.jar (35455ms)
    [info] downloading https://repo1.maven.org/maven2/org/asynchttpclient/netty-codec-dns/2.0.35/netty-codec-dns-2.0.35.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/github/scopt/scopt_2.12/3.7.0/scopt_2.12-3.7.0.jar ...
    [info] 	[SUCCESSFUL ] com.h2database#h2;1.4.197!h2.jar (231267ms)
    [info] downloading https://repo1.maven.org/maven2/org/hibernate/hibernate-core/5.2.9.Final/hibernate-core-5.2.9.Final.jar ...
    [info] 	[SUCCESSFUL ] org.asynchttpclient#netty-codec-dns;2.0.35!netty-codec-dns.jar (32753ms)
    [info] 	[SUCCESSFUL ] tyrex#tyrex;1.0.1!tyrex.jar (81070ms)
    [info] 	[SUCCESSFUL ] org.jboss.logging#jboss-logging;3.3.0.Final!jboss-logging.jar (66514ms)
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/classmate/1.3.1/classmate-1.3.1.jar ...
    [info] 	[SUCCESSFUL ] io.gatling#gatling-jdbc;2.3.0!gatling-jdbc.jar (45422ms)
    [info] 	[SUCCESSFUL ] net.java.dev.jna#jna-platform;4.1.0!jna-platform.jar (252213ms)
    [info] 	[SUCCESSFUL ] com.jolbox#bonecp;0.8.0.RELEASE!bonecp.jar(bundle) (116722ms)
    [info] 	[SUCCESSFUL ] com.github.scopt#scopt_2.12;3.7.0!scopt_2.12.jar (70235ms)
    [info] 	[SUCCESSFUL ] org.asynchttpclient#async-http-client;2.0.35!async-http-client.jar (123086ms)
    [info] downloading https://repo1.maven.org/maven2/net/sourceforge/htmlunit/htmlunit/2.27/htmlunit-2.27.jar ...
    [info] 	[SUCCESSFUL ] org.hibernate#hibernate-validator;5.4.1.Final!hibernate-validator.jar (77187ms)
    [info] 	[SUCCESSFUL ] org.springframework#spring-core;4.3.11.RELEASE!spring-core.jar (109063ms)
    [info] downloading https://repo1.maven.org/maven2/org/springframework/spring-beans/4.3.11.RELEASE/spring-beans-4.3.11.RELEASE.jar ...
    [info] 	[SUCCESSFUL ] io.netty#netty-codec-http;4.0.51.Final!netty-codec-http.jar (94157ms)
    [info] downloading https://repo1.maven.org/maven2/io/netty/netty-handler/4.0.51.Final/netty-handler-4.0.51.Final.jar ...
    [info] 	[SUCCESSFUL ] com.fasterxml#classmate;1.3.1!classmate.jar(bundle) (29662ms)
    [info] 	[SUCCESSFUL ] joda-time#joda-time;2.9.9!joda-time.jar (154194ms)
    [info] 	[SUCCESSFUL ] io.gatling#gatling-core;2.3.0!gatling-core.jar (166554ms)
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-commons/2.3.0/gatling-commons-2.3.0.jar ...
    [info] 	[SUCCESSFUL ] org.springframework#spring-beans;4.3.11.RELEASE!spring-beans.jar (95118ms)
    [info] 	[SUCCESSFUL ] io.gatling#gatling-commons;2.3.0!gatling-commons.jar (45383ms)
    [info] 	[SUCCESSFUL ] com.google.guava#guava;22.0!guava.jar (228659ms)
    [info] 	[SUCCESSFUL ] io.netty#netty-handler;4.0.51.Final!netty-handler.jar (128458ms)
    [info] downloading https://repo1.maven.org/maven2/org/asynchttpclient/netty-resolver-dns/2.0.35/netty-resolver-dns-2.0.35.jar ...
    [info] 	[SUCCESSFUL ] net.sourceforge.htmlunit#htmlunit;2.27!htmlunit.jar (135282ms)
    [info] 	[SUCCESSFUL ] org.asynchttpclient#netty-resolver-dns;2.0.35!netty-resolver-dns.jar (11206ms)
    [info] 	[SUCCESSFUL ] net.sf.saxon#Saxon-HE;9.8.0-4!Saxon-HE.jar (291223ms)
    [info] 	[SUCCESSFUL ] org.hibernate#hibernate-core;5.2.9.Final!hibernate-core.jar (206151ms)
    [info] downloading https://repo1.maven.org/maven2/io/dropwizard/metrics/metrics-core/3.2.1/metrics-core-3.2.1.jar ...
    [info] 	[SUCCESSFUL ] io.dropwizard.metrics#metrics-core;3.2.1!metrics-core.jar(bundle) (2359ms)
    [info] downloading https://repo1.maven.org/maven2/com/palominolabs/http/url-builder/1.1.0/url-builder-1.1.0.jar ...
    [info] 	[SUCCESSFUL ] com.palominolabs.http#url-builder;1.1.0!url-builder.jar (1138ms)
    [info] Done updating.
    [warn] Found version conflict(s) in library dependencies; some are suspected to be binary incompatible:
    [warn] 	* com.typesafe.akka:akka-stream_2.12:2.5.11 is selected over 2.4.20
    [warn] 	    +- com.typesafe.play:play-streams_2.12:2.6.15 ()      (depends on 2.5.11)
    [warn] 	    +- com.typesafe.akka:akka-http-core_2.12:10.0.13 ()   (depends on 2.4.20)
    [warn] 	* com.typesafe.akka:akka-actor_2.12:2.5.11 is selected over 2.4.20
    [warn] 	    +- com.typesafe.play:play_2.12:2.6.15 ()              (depends on 2.5.11)
    [warn] 	    +- com.typesafe.akka:akka-stream_2.12:2.5.11 ()       (depends on 2.5.11)
    [warn] 	    +- com.typesafe.akka:akka-slf4j_2.12:2.5.11 ()        (depends on 2.5.11)
    [warn] 	    +- com.typesafe.akka:akka-parsing_2.12:10.0.13 ()     (depends on 2.4.20)
    [warn] Run 'evicted' to see detailed eviction warnings
    
    --- (Running the application, auto-reloading is enabled) ---
    
    [info] p.c.s.AkkaHttpServer - Listening for HTTP on /0:0:0:0:0:0:0:0:9000
    
    (Server started, use Enter to stop and go back to the console...)
    
    [info] Compiling 10 Scala sources and 12 Java sources to /Users/xubo/Desktop/xubo/git/play-java-rest-api-example/target/scala-2.12/classes ...
    [info] Non-compiled module 'compiler-bridge_2.12' for Scala 2.12.6. Compiling...
    [info]   Compilation completed in 9.99s.
    [info] Done compiling.
    [info] application - Creating Pool for datasource 'default'
    [info] p.a.d.HikariCPConnectionPool - datasource [default] bound to JNDI as DefaultDS
    [info] p.a.d.DefaultDBApi - Database [default] connected at jdbc:h2:mem:play
    [info] a.e.s.Slf4jLogger - Slf4jLogger started
    [info] play.api.Play - Application started (Dev)
    [error] a.PostAction - Circuit breaker is open!
    net.jodah.failsafe.FailsafeException: java.sql.SQLException: Call this to cause the circuit breaker to trip
        at net.jodah.failsafe.SyncFailsafe.call(SyncFailsafe.java:159)
        at net.jodah.failsafe.SyncFailsafe.get(SyncFailsafe.java:56)
        at v1.post.JPAPostRepository.lambda$null$5(JPAPostRepository.java:48)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:142)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:100)
        at v1.post.JPAPostRepository.wrap(JPAPostRepository.java:57)
        at v1.post.JPAPostRepository.lambda$get$6(JPAPostRepository.java:48)
        at java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1590)
        at akka.dispatch.TaskInvocation.run(AbstractDispatcher.scala:40)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
    Caused by: java.sql.SQLException: Call this to cause the circuit breaker to trip
        at v1.post.JPAPostRepository.lookup(JPAPostRepository.java:61)
        at v1.post.JPAPostRepository.lambda$null$4(JPAPostRepository.java:48)
        at net.jodah.failsafe.SyncFailsafe.call(SyncFailsafe.java:145)
        at net.jodah.failsafe.SyncFailsafe.get(SyncFailsafe.java:56)
        at v1.post.JPAPostRepository.lambda$null$5(JPAPostRepository.java:48)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:142)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:100)
        at v1.post.JPAPostRepository.wrap(JPAPostRepository.java:57)
        at v1.post.JPAPostRepository.lambda$get$6(JPAPostRepository.java:48)
        at java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1590)
    [error] a.PostAction - Circuit breaker is open!
    net.jodah.failsafe.FailsafeException: java.sql.SQLException: Call this to cause the circuit breaker to trip
        at net.jodah.failsafe.SyncFailsafe.call(SyncFailsafe.java:159)
        at net.jodah.failsafe.SyncFailsafe.get(SyncFailsafe.java:56)
        at v1.post.JPAPostRepository.lambda$null$5(JPAPostRepository.java:48)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:142)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:100)
        at v1.post.JPAPostRepository.wrap(JPAPostRepository.java:57)
        at v1.post.JPAPostRepository.lambda$get$6(JPAPostRepository.java:48)
        at java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1590)
        at akka.dispatch.TaskInvocation.run(AbstractDispatcher.scala:40)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
    Caused by: java.sql.SQLException: Call this to cause the circuit breaker to trip
        at v1.post.JPAPostRepository.lookup(JPAPostRepository.java:61)
        at v1.post.JPAPostRepository.lambda$null$4(JPAPostRepository.java:48)
        at net.jodah.failsafe.SyncFailsafe.call(SyncFailsafe.java:145)
        at net.jodah.failsafe.SyncFailsafe.get(SyncFailsafe.java:56)
        at v1.post.JPAPostRepository.lambda$null$5(JPAPostRepository.java:48)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:142)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:100)
        at v1.post.JPAPostRepository.wrap(JPAPostRepository.java:57)
        at v1.post.JPAPostRepository.lambda$get$6(JPAPostRepository.java:48)
        at java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1590)
    [error] a.PostAction - Circuit breaker is open!
    net.jodah.failsafe.FailsafeException: java.sql.SQLException: Call this to cause the circuit breaker to trip
        at net.jodah.failsafe.SyncFailsafe.call(SyncFailsafe.java:159)
        at net.jodah.failsafe.SyncFailsafe.get(SyncFailsafe.java:56)
        at v1.post.JPAPostRepository.lambda$null$5(JPAPostRepository.java:48)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:142)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:100)
        at v1.post.JPAPostRepository.wrap(JPAPostRepository.java:57)
        at v1.post.JPAPostRepository.lambda$get$6(JPAPostRepository.java:48)
        at java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1590)
        at akka.dispatch.TaskInvocation.run(AbstractDispatcher.scala:40)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
    Caused by: java.sql.SQLException: Call this to cause the circuit breaker to trip
        at v1.post.JPAPostRepository.lookup(JPAPostRepository.java:61)
        at v1.post.JPAPostRepository.lambda$null$4(JPAPostRepository.java:48)
        at net.jodah.failsafe.SyncFailsafe.call(SyncFailsafe.java:145)
        at net.jodah.failsafe.SyncFailsafe.get(SyncFailsafe.java:56)
        at v1.post.JPAPostRepository.lambda$null$5(JPAPostRepository.java:48)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:142)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:100)
        at v1.post.JPAPostRepository.wrap(JPAPostRepository.java:57)
        at v1.post.JPAPostRepository.lambda$get$6(JPAPostRepository.java:48)
        at java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1590)
    [warn] c.z.h.p.HikariPool - HikariPool-1 - Thread starvation or clock leap detected (housekeeper delta=30m21s713ms).
    [warn] c.z.h.p.HikariPool - HikariPool-1 - Thread starvation or clock leap detected (housekeeper delta=54s683ms).
    [warn] c.z.h.p.HikariPool - HikariPool-1 - Thread starvation or clock leap detected (housekeeper delta=4m39s657ms).
    [warn] c.z.h.p.HikariPool - HikariPool-1 - Thread starvation or clock leap detected (housekeeper delta=12h34s753ms).
    [warn] c.z.h.p.HikariPool - HikariPool-1 - Thread starvation or clock leap detected (housekeeper delta=51m28s150ms).
    
    
    
    [warn] c.z.h.p.HikariPool - HikariPool-1 - Thread starvation or clock leap detected (housekeeper delta=30m17s821ms).
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    [error] a.PostAction - Circuit breaker is open!
    net.jodah.failsafe.FailsafeException: java.sql.SQLException: Call this to cause the circuit breaker to trip
        at net.jodah.failsafe.SyncFailsafe.call(SyncFailsafe.java:159)
        at net.jodah.failsafe.SyncFailsafe.get(SyncFailsafe.java:56)
        at v1.post.JPAPostRepository.lambda$null$5(JPAPostRepository.java:48)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:142)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:100)
        at v1.post.JPAPostRepository.wrap(JPAPostRepository.java:57)
        at v1.post.JPAPostRepository.lambda$get$6(JPAPostRepository.java:48)
        at java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1590)
        at akka.dispatch.TaskInvocation.run(AbstractDispatcher.scala:40)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
    Caused by: java.sql.SQLException: Call this to cause the circuit breaker to trip
        at v1.post.JPAPostRepository.lookup(JPAPostRepository.java:61)
        at v1.post.JPAPostRepository.lambda$null$4(JPAPostRepository.java:48)
        at net.jodah.failsafe.SyncFailsafe.call(SyncFailsafe.java:145)
        at net.jodah.failsafe.SyncFailsafe.get(SyncFailsafe.java:56)
        at v1.post.JPAPostRepository.lambda$null$5(JPAPostRepository.java:48)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:142)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:100)
        at v1.post.JPAPostRepository.wrap(JPAPostRepository.java:57)
        at v1.post.JPAPostRepository.lambda$get$6(JPAPostRepository.java:48)
        at java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1590)
    [error] a.PostAction - Circuit breaker is open!
    net.jodah.failsafe.FailsafeException: java.sql.SQLException: Call this to cause the circuit breaker to trip
        at net.jodah.failsafe.SyncFailsafe.call(SyncFailsafe.java:159)
        at net.jodah.failsafe.SyncFailsafe.get(SyncFailsafe.java:56)
        at v1.post.JPAPostRepository.lambda$null$5(JPAPostRepository.java:48)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:142)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:100)
        at v1.post.JPAPostRepository.wrap(JPAPostRepository.java:57)
        at v1.post.JPAPostRepository.lambda$get$6(JPAPostRepository.java:48)
        at java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1590)
        at akka.dispatch.TaskInvocation.run(AbstractDispatcher.scala:40)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
    Caused by: java.sql.SQLException: Call this to cause the circuit breaker to trip
        at v1.post.JPAPostRepository.lookup(JPAPostRepository.java:61)
        at v1.post.JPAPostRepository.lambda$null$4(JPAPostRepository.java:48)
        at net.jodah.failsafe.SyncFailsafe.call(SyncFailsafe.java:145)
        at net.jodah.failsafe.SyncFailsafe.get(SyncFailsafe.java:56)
        at v1.post.JPAPostRepository.lambda$null$5(JPAPostRepository.java:48)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:142)
        at play.db.jpa.DefaultJPAApi.withTransaction(DefaultJPAApi.java:100)
        at v1.post.JPAPostRepository.wrap(JPAPostRepository.java:57)
        at v1.post.JPAPostRepository.lambda$get$6(JPAPostRepository.java:48)
        at java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1590)
    [INFO] [06/05/2018 09:26:28.541] [Thread-2] [CoordinatedShutdown(akka://sbt-web)] Starting coordinated shutdown from JVM shutdown hook
    localhost:play-java-rest-api-example xubo$ 
    localhost:play-java-rest-api-example xubo$ 
    localhost:play-java-rest-api-example xubo$ 
