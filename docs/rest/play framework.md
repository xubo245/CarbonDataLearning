    Last login: Mon Jun  4 08:13:01 on ttys002
    localhost:carbondata1 xubo$ ll /usr/local/Cellar/thrift
    ls: /usr/local/Cellar/thrift: No such file or directory
    localhost:carbondata1 xubo$ ll /usr/local/Cellar/thrift
    total 0
    drwxr-xr-x  2 xubo  admin    64B  6  4 09:36 0.9.3
    localhost:carbondata1 xubo$ ll /usr/local/Cellar/thrift/0.9.3/
    localhost:carbondata1 xubo$ ll /usr/local/Cellar/thrift/0.9.3/
    total 320
    -rw-r--r--  1 xubo  admin   799B  6  4 09:39 INSTALL_RECEIPT.json
    drwxr-xr-x  9 xubo  admin   288B  6  4 09:39 lib
    drwxr-xr-x  3 xubo  admin    96B  6  4 09:39 include
    drwxr-xr-x  3 xubo  admin    96B  6  4 09:39 bin
    -rw-r--r--  1 xubo  admin   125K 10  1  2015 CHANGES
    -rw-r--r--  1 xubo  admin   4.6K  9 15  2015 README.md
    -rw-r--r--  1 xubo  admin    13K  7 21  2015 LICENSE
    -rw-r--r--  1 xubo  admin   167B  1 26  2015 NOTICE
    localhost:carbondata1 xubo$ ls
    LICENSE		README.md	bin		common		core		derby.log	docs		format		integration	processing	store
    NOTICE		assembly	build		conf		datamap		dev		examples	hadoop		pom.xml		spark-warehouse	streaming
    localhost:carbondata1 xubo$ cd ../
    localhost:git xubo$ ls
    CarbonDataLearning	OpenCvObjectDetection	carbon.metastore	carbondata2		down			spark
    GesturesRecognition	TensorFlowOnSpark	carbondata1		carbondata3		opencv			thrift
    localhost:git xubo$ cd CarbonDataLearning/
    localhost:CarbonDataLearning xubo$ ls
    CarbonDataLearning.iml	LICENSE			README.md		data			docs			pom.xml			src
    localhost:CarbonDataLearning xubo$ git status
    On branch master
    Your branch is up to date with 'origin/master'.
    
    Untracked files:
      (use "git add <file>..." to include in what will be committed)
    
        docs/SearchMode/
    
    nothing added to commit but untracked files present (use "git add" to track)
    localhost:CarbonDataLearning xubo$ ls docs/S
    SearchMode/               Spark SQL执行流程分析.md  
    localhost:CarbonDataLearning xubo$ ls docs/SearchMode/
    Change thrift latest version to thrift 0.9.3 version in MacBook .md	error log when don't set the datamap writer path.md
    localhost:CarbonDataLearning xubo$ ls
    CarbonDataLearning.iml	LICENSE			README.md		data			docs			pom.xml			src
    localhost:CarbonDataLearning xubo$ ls
    CarbonDataLearning.iml	LICENSE			README.md		data			docs			pom.xml			src
    localhost:CarbonDataLearning xubo$ git status
    On branch master
    Your branch is up to date with 'origin/master'.
    
    Untracked files:
      (use "git add <file>..." to include in what will be committed)
    
        docs/SearchMode/
    
    nothing added to commit but untracked files present (use "git add" to track)
    localhost:CarbonDataLearning xubo$ git add .
    localhost:CarbonDataLearning xubo$ git status
    On branch master
    Your branch is up to date with 'origin/master'.
    
    Changes to be committed:
      (use "git reset HEAD <file>..." to unstage)
    
        new file:   docs/SearchMode/Change thrift latest version to thrift 0.9.3 version in MacBook .md
        new file:   docs/SearchMode/error log when don't set the datamap writer path.md
    
    localhost:CarbonDataLearning xubo$ git commit -m "add doc for thrift 0.9.3"
    [master 4404936] add doc for thrift 0.9.3
     2 files changed, 243 insertions(+)
     create mode 100644 docs/SearchMode/Change thrift latest version to thrift 0.9.3 version in MacBook .md
     create mode 100644 docs/SearchMode/error log when don't set the datamap writer path.md
    localhost:CarbonDataLearning xubo$ git status
    On branch master
    Your branch is ahead of 'origin/master' by 1 commit.
      (use "git push" to publish your local commits)
    
    nothing to commit, working tree clean
    localhost:CarbonDataLearning xubo$ git push origin master
    Counting objects: 6, done.
    Delta compression using up to 8 threads.
    Compressing objects: 100% (6/6), done.
    Writing objects: 100% (6/6), 9.58 KiB | 4.79 MiB/s, done.
    Total 6 (delta 2), reused 0 (delta 0)
    remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
    To https://github.com/xubo245/CarbonDataLearning.git
       bc4a40b..4404936  master -> master
    localhost:CarbonDataLearning xubo$ git status
    On branch master
    Your branch is up to date with 'origin/master'.
    
    Changes not staged for commit:
      (use "git add <file>..." to update what will be committed)
      (use "git checkout -- <file>..." to discard changes in working directory)
    
        modified:   docs/SearchMode/Change thrift latest version to thrift 0.9.3 version in MacBook .md
    
    no changes added to commit (use "git add" and/or "git commit -a")
    localhost:CarbonDataLearning xubo$ git add .
    localhost:CarbonDataLearning xubo$ git commit -m "update"
    [master 60bbe41] update
     1 file changed, 6 insertions(+), 1 deletion(-)
    localhost:CarbonDataLearning xubo$ git status
    On branch master
    Your branch is ahead of 'origin/master' by 1 commit.
      (use "git push" to publish your local commits)
    
    nothing to commit, working tree clean
    localhost:CarbonDataLearning xubo$ git push origin master
    Counting objects: 5, done.
    Delta compression using up to 8 threads.
    Compressing objects: 100% (5/5), done.
    Writing objects: 100% (5/5), 457 bytes | 457.00 KiB/s, done.
    Total 5 (delta 4), reused 0 (delta 0)
    remote: Resolving deltas: 100% (4/4), completed with 4 local objects.
    To https://github.com/xubo245/CarbonDataLearning.git
       4404936..60bbe41  master -> master
    localhost:CarbonDataLearning xubo$ git status
    On branch master
    Your branch is up to date with 'origin/master'.
    
    Changes not staged for commit:
      (use "git add <file>..." to update what will be committed)
      (use "git checkout -- <file>..." to discard changes in working directory)
    
        modified:   docs/SearchMode/Change thrift latest version to thrift 0.9.3 version in MacBook .md
    
    no changes added to commit (use "git add" and/or "git commit -a")
    localhost:CarbonDataLearning xubo$ git add .
    localhost:CarbonDataLearning xubo$ git status
    On branch master
    Your branch is up to date with 'origin/master'.
    
    Changes to be committed:
      (use "git reset HEAD <file>..." to unstage)
    
        modified:   docs/SearchMode/Change thrift latest version to thrift 0.9.3 version in MacBook .md
    
    Changes not staged for commit:
      (use "git add <file>..." to update what will be committed)
      (use "git checkout -- <file>..." to discard changes in working directory)
    
        modified:   docs/SearchMode/Change thrift latest version to thrift 0.9.3 version in MacBook .md
        modified:   docs/SearchMode/error log when don't set the datamap writer path.md
    
    localhost:CarbonDataLearning xubo$ git add .
    localhost:CarbonDataLearning xubo$ git commit -m "update doc"
    [master 6f55287] update doc
     2 files changed, 14 insertions(+), 2 deletions(-)
    localhost:CarbonDataLearning xubo$ git status
    On branch master
    Your branch is ahead of 'origin/master' by 1 commit.
      (use "git push" to publish your local commits)
    
    nothing to commit, working tree clean
    localhost:CarbonDataLearning xubo$ git push origin master
    Counting objects: 6, done.
    Delta compression using up to 8 threads.
    Compressing objects: 100% (6/6), done.
    Writing objects: 100% (6/6), 684 bytes | 684.00 KiB/s, done.
    Total 6 (delta 5), reused 0 (delta 0)
    remote: Resolving deltas: 100% (5/5), completed with 5 local objects.
    To https://github.com/xubo245/CarbonDataLearning.git
       60bbe41..6f55287  master -> master
    localhost:CarbonDataLearning xubo$ ls
    CarbonDataLearning.iml	LICENSE			README.md		data			docs			pom.xml			src
    localhost:CarbonDataLearning xubo$ cd ../
    localhost:git xubo$ pwd
    /Users/xubo/Desktop/xubo/git
    localhost:git xubo$ git clone git@github.com:mariussoutier/PlayBasics.git
    Cloning into 'PlayBasics'...
    remote: Counting objects: 719, done.
    remote: Total 719 (delta 0), reused 0 (delta 0), pack-reused 719
    Receiving objects: 100% (719/719), 283.55 KiB | 67.00 KiB/s, done.
    Resolving deltas: 100% (238/238), done.
    localhost:git xubo$ ls
    CarbonDataLearning	OpenCvObjectDetection	TensorFlowOnSpark	carbondata1		carbondata3		opencv			thrift
    GesturesRecognition	PlayBasics		carbon.metastore	carbondata2		down			spark
    localhost:git xubo$ cd PlayBasics/
    localhost:PlayBasics xubo$ ls
    ActionComposition	AngularJS-Auth		DependencyInjection	RoutesJava		Templates		play-2.2-migration
    Angular			AsyncScala		README.md		RoutesScala		build.sbt		project
    localhost:PlayBasics xubo$ sbt sbt-version
    -bash: sbt: command not found
    localhost:PlayBasics xubo$ brew sbt
    Error: Unknown command: sbt
    localhost:PlayBasics xubo$ brew install sbt
    Updating Homebrew...
    ==> Auto-updated Homebrew!
    Updated 1 tap (homebrew/core).
    ==> Updated Formulae
    cayley                clblast               futhark               gitlab-gem            gnuplot               maxwell               minetest              pngquant              sjk
    
    ==> Downloading https://piccolo.link/sbt-1.1.6.tgz
    ==> Downloading from https://sbt-downloads.cdnedge.bluemix.net/releases/v1.1.6/sbt-1.1.6.tgz
    
    curl: (6) Could not resolve host: sbt-downloads.cdnedge.bluemix.net
    Error: Failed to download resource "sbt"
    Download failed: https://piccolo.link/sbt-1.1.6.tgz
    localhost:PlayBasics xubo$ ls
    ActionComposition	AngularJS-Auth		DependencyInjection	RoutesJava		Templates		play-2.2-migration
    Angular			AsyncScala		README.md		RoutesScala		build.sbt		project
    localhost:PlayBasics xubo$ pwd
    /Users/xubo/Desktop/xubo/git/PlayBasics
    localhost:PlayBasics xubo$ cd ../
    localhost:git xubo$ ls
    CarbonDataLearning	OpenCvObjectDetection	TensorFlowOnSpark	carbondata1		carbondata3		opencv			thrift
    GesturesRecognition	PlayBasics		carbon.metastore	carbondata2		down			spark
    localhost:git xubo$ sbt
    -bash: sbt: command not found
    localhost:git xubo$ brew install sbt
    Updating Homebrew...
    ==> Auto-updated Homebrew!
    Updated 1 tap (homebrew/core).
    ==> Updated Formulae
    phpunit
    
    ==> Downloading https://piccolo.link/sbt-1.1.6.tgz
    ==> Downloading from https://sbt-downloads.cdnedge.bluemix.net/releases/v1.1.6/sbt-1.1.6.tgz
    ##########################################                                59.7%
    #####################################################                     74.5%
    #####################################################                     74.6%
    ######################################################################## 100.0%
    ==> Caveats
    You can use $SBT_OPTS to pass additional JVM options to SBT.
    Project specific options should be placed in .sbtopts in the root of your project.
    Global settings should be placed in /usr/local/etc/sbtopts
    ==> Summary
    🍺  /usr/local/Cellar/sbt/1.1.6: 500 files, 52.5MB, built in 8 minutes 45 seconds
    localhost:git xubo$ 
    localhost:git xubo$ 
    localhost:git xubo$ 
    localhost:git xubo$ sbt sbt-version
    Getting org.scala-sbt sbt 1.1.6  (this may take some time)...
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/sbt/1.1.6/jars/sbt.jar ...
        [SUCCESSFUL ] org.scala-sbt#sbt;1.1.6!sbt.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-lang/scala-library/2.12.6/jars/scala-library.jar ...
        [SUCCESSFUL ] org.scala-lang#scala-library;2.12.6!scala-library.jar (59ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/main_2.12/1.1.6/jars/main_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#main_2.12;1.1.6!main_2.12.jar (18ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/logic_2.12/1.1.6/jars/logic_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#logic_2.12;1.1.6!logic_2.12.jar (3ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/actions_2.12/1.1.6/jars/actions_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#actions_2.12;1.1.6!actions_2.12.jar (6ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/main-settings_2.12/1.1.6/jars/main-settings_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#main-settings_2.12;1.1.6!main-settings_2.12.jar (11ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/run_2.12/1.1.6/jars/run_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#run_2.12;1.1.6!run_2.12.jar (6ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/command_2.12/1.1.6/jars/command_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#command_2.12;1.1.6!command_2.12.jar (7ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/collections_2.12/1.1.6/jars/collections_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#collections_2.12;1.1.6!collections_2.12.jar (7ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-lang.modules/scala-xml_2.12/1.0.6/bundles/scala-xml_2.12.jar ...
        [SUCCESSFUL ] org.scala-lang.modules#scala-xml_2.12;1.0.6!scala-xml_2.12.jar(bundle) (9ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/launcher-interface/1.0.4/jars/launcher-interface.jar ...
        [SUCCESSFUL ] org.scala-sbt#launcher-interface;1.0.4!launcher-interface.jar (3ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.apache.logging.log4j/log4j-api/2.8.1/jars/log4j-api.jar ...
        [SUCCESSFUL ] org.apache.logging.log4j#log4j-api;2.8.1!log4j-api.jar (5ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.apache.logging.log4j/log4j-core/2.8.1/jars/log4j-core.jar ...
        [SUCCESSFUL ] org.apache.logging.log4j#log4j-core;2.8.1!log4j-core.jar (16ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.apache.logging.log4j/log4j-slf4j-impl/2.8.1/jars/log4j-slf4j-impl.jar ...
        [SUCCESSFUL ] org.apache.logging.log4j#log4j-slf4j-impl;2.8.1!log4j-slf4j-impl.jar (6ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.github.cb372/scalacache-caffeine_2.12/0.20.0/jars/scalacache-caffeine_2.12.jar ...
        [SUCCESSFUL ] com.github.cb372#scalacache-caffeine_2.12;0.20.0!scalacache-caffeine_2.12.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/io_2.12/1.1.10/jars/io_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#io_2.12;1.1.10!io_2.12.jar (8ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/util-logging_2.12/1.1.3/jars/util-logging_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#util-logging_2.12;1.1.3!util-logging_2.12.jar (6ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/librarymanagement-core_2.12/1.1.5/jars/librarymanagement-core_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#librarymanagement-core_2.12;1.1.5!librarymanagement-core_2.12.jar (10ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/librarymanagement-ivy_2.12/1.1.5/jars/librarymanagement-ivy_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#librarymanagement-ivy_2.12;1.1.5!librarymanagement-ivy_2.12.jar (11ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/compiler-interface/1.1.7/jars/compiler-interface.jar ...
        [SUCCESSFUL ] org.scala-sbt#compiler-interface;1.1.7!compiler-interface.jar (5ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/zinc-compile_2.12/1.1.7/jars/zinc-compile_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc-compile_2.12;1.1.7!zinc-compile_2.12.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/util-relation_2.12/1.1.3/jars/util-relation_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#util-relation_2.12;1.1.3!util-relation_2.12.jar (3ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.eed3si9n/sjson-new-scalajson_2.12/0.8.2/jars/sjson-new-scalajson_2.12.jar ...
        [SUCCESSFUL ] com.eed3si9n#sjson-new-scalajson_2.12;0.8.2!sjson-new-scalajson_2.12.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/util-position_2.12/1.1.3/jars/util-position_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#util-position_2.12;1.1.3!util-position_2.12.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.eed3si9n/sjson-new-core_2.12/0.8.2/jars/sjson-new-core_2.12.jar ...
        [SUCCESSFUL ] com.eed3si9n#sjson-new-core_2.12;0.8.2!sjson-new-core_2.12.jar (10ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.eed3si9n/shaded-scalajson_2.12/1.0.0-M4/jars/shaded-scalajson_2.12.jar ...
        [SUCCESSFUL ] com.eed3si9n#shaded-scalajson_2.12;1.0.0-M4!shaded-scalajson_2.12.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.spire-math/jawn-parser_2.12/0.10.4/jars/jawn-parser_2.12.jar ...
        [SUCCESSFUL ] org.spire-math#jawn-parser_2.12;0.10.4!jawn-parser_2.12.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/completion_2.12/1.1.6/jars/completion_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#completion_2.12;1.1.6!completion_2.12.jar (8ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/task-system_2.12/1.1.6/jars/task-system_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#task-system_2.12;1.1.6!task-system_2.12.jar (5ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/tasks_2.12/1.1.6/jars/tasks_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#tasks_2.12;1.1.6!tasks_2.12.jar (6ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/testing_2.12/1.1.6/jars/testing_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#testing_2.12;1.1.6!testing_2.12.jar (7ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/util-tracking_2.12/1.1.3/jars/util-tracking_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#util-tracking_2.12;1.1.3!util-tracking_2.12.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/zinc-classpath_2.12/1.1.7/jars/zinc-classpath_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc-classpath_2.12;1.1.7!zinc-classpath_2.12.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/zinc-apiinfo_2.12/1.1.7/jars/zinc-apiinfo_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc-apiinfo_2.12;1.1.7!zinc-apiinfo_2.12.jar (6ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/zinc-ivy-integration_2.12/1.1.7/jars/zinc-ivy-integration_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc-ivy-integration_2.12;1.1.7!zinc-ivy-integration_2.12.jar (3ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/zinc_2.12/1.1.7/jars/zinc_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc_2.12;1.1.7!zinc_2.12.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/jline/jline/2.14.6/jars/jline.jar ...
        [SUCCESSFUL ] jline#jline;2.14.6!jline.jar (7ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/util-control_2.12/1.1.3/jars/util-control_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#util-control_2.12;1.1.3!util-control_2.12.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.swoval/apple-file-events/1.3.2/jars/apple-file-events.jar ...
        [SUCCESSFUL ] com.swoval#apple-file-events;1.3.2!apple-file-events.jar (5ms)
    downloading file:////Users/xubo/.sbt/preloaded/net.java.dev.jna/jna/4.5.0/jars/jna.jar ...
        [SUCCESSFUL ] net.java.dev.jna#jna;4.5.0!jna.jar (17ms)
    downloading file:////Users/xubo/.sbt/preloaded/net.java.dev.jna/jna-platform/4.5.0/jars/jna-platform.jar ...
        [SUCCESSFUL ] net.java.dev.jna#jna-platform;4.5.0!jna-platform.jar (31ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/util-interface/1.1.3/jars/util-interface.jar ...
        [SUCCESSFUL ] org.scala-sbt#util-interface;1.1.3!util-interface.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.lmax/disruptor/3.3.6/jars/disruptor.jar ...
        [SUCCESSFUL ] com.lmax#disruptor;3.3.6!disruptor.jar (5ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-lang/scala-compiler/2.12.6/jars/scala-compiler.jar ...
        [SUCCESSFUL ] org.scala-lang#scala-compiler;2.12.6!scala-compiler.jar (102ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-lang/scala-reflect/2.12.6/jars/scala-reflect.jar ...
        [SUCCESSFUL ] org.scala-lang#scala-reflect;2.12.6!scala-reflect.jar (35ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/util-cache_2.12/1.1.3/jars/util-cache_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#util-cache_2.12;1.1.3!util-cache_2.12.jar (6ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.eed3si9n/sjson-new-murmurhash_2.12/0.8.2/jars/sjson-new-murmurhash_2.12.jar ...
        [SUCCESSFUL ] com.eed3si9n#sjson-new-murmurhash_2.12;0.8.2!sjson-new-murmurhash_2.12.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/test-agent/1.1.6/jars/test-agent.jar ...
        [SUCCESSFUL ] org.scala-sbt#test-agent;1.1.6!test-agent.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/test-interface/1.0/jars/test-interface.jar ...
        [SUCCESSFUL ] org.scala-sbt#test-interface;1.0!test-interface.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/zinc-classfile_2.12/1.1.7/jars/zinc-classfile_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc-classfile_2.12;1.1.7!zinc-classfile_2.12.jar (5ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.jcraft/jsch/0.1.54/jars/jsch.jar ...
        [SUCCESSFUL ] com.jcraft#jsch;0.1.54!jsch.jar (5ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.eed3si9n/gigahorse-okhttp_2.12/0.3.0/jars/gigahorse-okhttp_2.12.jar ...
        [SUCCESSFUL ] com.eed3si9n#gigahorse-okhttp_2.12;0.3.0!gigahorse-okhttp_2.12.jar (3ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.squareup.okhttp3/okhttp-urlconnection/3.7.0/jars/okhttp-urlconnection.jar ...
        [SUCCESSFUL ] com.squareup.okhttp3#okhttp-urlconnection;3.7.0!okhttp-urlconnection.jar (3ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.eed3si9n/gigahorse-core_2.12/0.3.0/jars/gigahorse-core_2.12.jar ...
        [SUCCESSFUL ] com.eed3si9n#gigahorse-core_2.12;0.3.0!gigahorse-core_2.12.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.squareup.okhttp3/okhttp/3.7.0/jars/okhttp.jar ...
        [SUCCESSFUL ] com.squareup.okhttp3#okhttp;3.7.0!okhttp.jar (8ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.typesafe/ssl-config-core_2.12/0.2.2/bundles/ssl-config-core_2.12.jar ...
        [SUCCESSFUL ] com.typesafe#ssl-config-core_2.12;0.2.2!ssl-config-core_2.12.jar(bundle) (6ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.reactivestreams/reactive-streams/1.0.0/jars/reactive-streams.jar ...
        [SUCCESSFUL ] org.reactivestreams#reactive-streams;1.0.0!reactive-streams.jar (3ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.slf4j/slf4j-api/1.7.25/jars/slf4j-api.jar ...
        [SUCCESSFUL ] org.slf4j#slf4j-api;1.7.25!slf4j-api.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.typesafe/config/1.2.0/bundles/config.jar ...
        [SUCCESSFUL ] com.typesafe#config;1.2.0!config.jar(bundle) (5ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.squareup.okio/okio/1.12.0/jars/okio.jar ...
        [SUCCESSFUL ] com.squareup.okio#okio;1.12.0!okio.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/zinc-compile-core_2.12/1.1.7/jars/zinc-compile-core_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc-compile-core_2.12;1.1.7!zinc-compile-core_2.12.jar (6ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-lang.modules/scala-parser-combinators_2.12/1.0.5/bundles/scala-parser-combinators_2.12.jar ...
        [SUCCESSFUL ] org.scala-lang.modules#scala-parser-combinators_2.12;1.0.5!scala-parser-combinators_2.12.jar(bundle) (7ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/zinc-core_2.12/1.1.7/jars/zinc-core_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc-core_2.12;1.1.7!zinc-core_2.12.jar (8ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/zinc-persist_2.12/1.1.7/jars/zinc-persist_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc-persist_2.12;1.1.7!zinc-persist_2.12.jar (24ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.trueaccord.scalapb/scalapb-runtime_2.12/0.6.0/jars/scalapb-runtime_2.12.jar ...
        [SUCCESSFUL ] com.trueaccord.scalapb#scalapb-runtime_2.12;0.6.0!scalapb-runtime_2.12.jar (21ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/sbinary_2.12/0.4.4/jars/sbinary_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#sbinary_2.12;0.4.4!sbinary_2.12.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.trueaccord.lenses/lenses_2.12/0.4.12/jars/lenses_2.12.jar ...
        [SUCCESSFUL ] com.trueaccord.lenses#lenses_2.12;0.4.12!lenses_2.12.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.lihaoyi/fastparse_2.12/0.4.2/jars/fastparse_2.12.jar ...
        [SUCCESSFUL ] com.lihaoyi#fastparse_2.12;0.4.2!fastparse_2.12.jar (6ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.google.protobuf/protobuf-java/3.3.1/bundles/protobuf-java.jar ...
        [SUCCESSFUL ] com.google.protobuf#protobuf-java;3.3.1!protobuf-java.jar(bundle) (17ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.lihaoyi/fastparse-utils_2.12/0.4.2/jars/fastparse-utils_2.12.jar ...
        [SUCCESSFUL ] com.lihaoyi#fastparse-utils_2.12;0.4.2!fastparse-utils_2.12.jar (5ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.lihaoyi/sourcecode_2.12/0.1.3/jars/sourcecode_2.12.jar ...
        [SUCCESSFUL ] com.lihaoyi#sourcecode_2.12;0.1.3!sourcecode_2.12.jar (5ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/core-macros_2.12/1.1.6/jars/core-macros_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#core-macros_2.12;1.1.6!core-macros_2.12.jar (4ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/protocol_2.12/1.1.6/jars/protocol_2.12.jar ...
        [SUCCESSFUL ] org.scala-sbt#protocol_2.12;1.1.6!protocol_2.12.jar (7ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt/template-resolver/0.1/jars/template-resolver.jar ...
        [SUCCESSFUL ] org.scala-sbt#template-resolver;0.1!template-resolver.jar (3ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt.ipcsocket/ipcsocket/1.0.0/jars/ipcsocket.jar ...
        [SUCCESSFUL ] org.scala-sbt.ipcsocket#ipcsocket;1.0.0!ipcsocket.jar (3ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.github.cb372/scalacache-core_2.12/0.20.0/jars/scalacache-core_2.12.jar ...
        [SUCCESSFUL ] com.github.cb372#scalacache-core_2.12;0.20.0!scalacache-core_2.12.jar (5ms)
    downloading file:////Users/xubo/.sbt/preloaded/com.github.ben-manes.caffeine/caffeine/2.5.6/jars/caffeine.jar ...
        [SUCCESSFUL ] com.github.ben-manes.caffeine#caffeine;2.5.6!caffeine.jar (13ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-sbt.ivy/ivy/2.3.0-sbt-b18f59ea3bc914a297bb6f1a4f7fb0ace399e310/jars/ivy.jar ...
        [SUCCESSFUL ] org.scala-sbt.ivy#ivy;2.3.0-sbt-b18f59ea3bc914a297bb6f1a4f7fb0ace399e310!ivy.jar (13ms)
    :: retrieving :: org.scala-sbt#boot-app
        confs: [default]
        76 artifacts copied, 0 already retrieved (27669kB/89ms)
    Getting Scala 2.12.6 (for sbt)...
    :: retrieving :: org.scala-sbt#boot-scala
        confs: [default]
        5 artifacts copied, 0 already retrieved (19632kB/33ms)
    [warn] No sbt.version set in project/build.properties, base directory: /Users/xubo/Desktop/xubo/git
    [info] Set current project to git (in build file:/Users/xubo/Desktop/xubo/git/)
    [error] Not a valid command: sbt-version (similar: write-sbt-version, session)
    [error] Not a valid project ID: sbt-version
    [error] Expected ':'
    [error] Not a valid key: sbt-version (similar: sbtVersion, version, sbtBinaryVersion)
    [error] sbt-version
    [error]            ^
    localhost:git xubo$ sbt version
    [warn] No sbt.version set in project/build.properties, base directory: /Users/xubo/Desktop/xubo/git
    [info] Set current project to git (in build file:/Users/xubo/Desktop/xubo/git/)
    [info] 0.1.0-SNAPSHOT
    localhost:git xubo$ ls
    CarbonDataLearning		PlayBasics			carbondata1			down				spark
    GesturesRecognition		TensorFlowOnSpark		carbondata2			opencv				thrift
    OpenCvObjectDetection		carbon.metastore		carbondata3			play-scala-rest-api-example
    localhost:git xubo$ pwd
    /Users/xubo/Desktop/xubo/git
    localhost:git xubo$ cd play-scala-rest-api-example/
    localhost:play-scala-rest-api-example xubo$ ls
    LICENSE				build.gradle			docs				gradlew				project				test
    README.md			build.sbt			gatling				gradlew.bat			public
    app				conf				gradle				play-scala-rest-api-example.iml	scripts
    localhost:play-scala-rest-api-example xubo$ sbt compile
    Getting org.scala-sbt sbt 1.1.2  (this may take some time)...
    downloading https://repo1.maven.org/maven2/org/scala-sbt/sbt/1.1.2/sbt-1.1.2.jar ...
        [SUCCESSFUL ] org.scala-sbt#sbt;1.1.2!sbt.jar (7526ms)
    downloading https://repo1.maven.org/maven2/org/scala-lang/scala-library/2.12.4/scala-library-2.12.4.jar ...
        [SUCCESSFUL ] org.scala-lang#scala-library;2.12.4!scala-library.jar (343899ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/main_2.12/1.1.2/main_2.12-1.1.2.jar ...
        [SUCCESSFUL ] org.scala-sbt#main_2.12;1.1.2!main_2.12.jar (76498ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/logic_2.12/1.1.2/logic_2.12-1.1.2.jar ...
        [SUCCESSFUL ] org.scala-sbt#logic_2.12;1.1.2!logic_2.12.jar (7464ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/actions_2.12/1.1.2/actions_2.12-1.1.2.jar ...
        [SUCCESSFUL ] org.scala-sbt#actions_2.12;1.1.2!actions_2.12.jar (20791ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/main-settings_2.12/1.1.2/main-settings_2.12-1.1.2.jar ...
        [SUCCESSFUL ] org.scala-sbt#main-settings_2.12;1.1.2!main-settings_2.12.jar (31523ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/run_2.12/1.1.2/run_2.12-1.1.2.jar ...
        [SUCCESSFUL ] org.scala-sbt#run_2.12;1.1.2!run_2.12.jar (7989ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/command_2.12/1.1.2/command_2.12-1.1.2.jar ...
        [SUCCESSFUL ] org.scala-sbt#command_2.12;1.1.2!command_2.12.jar (20725ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/collections_2.12/1.1.2/collections_2.12-1.1.2.jar ...
        [SUCCESSFUL ] org.scala-sbt#collections_2.12;1.1.2!collections_2.12.jar (23318ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/launcher-interface/1.0.3/launcher-interface-1.0.3.jar ...
        [SUCCESSFUL ] org.scala-sbt#launcher-interface;1.0.3!launcher-interface.jar (4145ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/io_2.12/1.1.4/io_2.12-1.1.4.jar ...
        [SUCCESSFUL ] org.scala-sbt#io_2.12;1.1.4!io_2.12.jar (20430ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/librarymanagement-core_2.12/1.1.4/librarymanagement-core_2.12-1.1.4.jar ...
        [SUCCESSFUL ] org.scala-sbt#librarymanagement-core_2.12;1.1.4!librarymanagement-core_2.12.jar (50728ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/librarymanagement-ivy_2.12/1.1.4/librarymanagement-ivy_2.12-1.1.4.jar ...
        [SUCCESSFUL ] org.scala-sbt#librarymanagement-ivy_2.12;1.1.4!librarymanagement-ivy_2.12.jar (37530ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/compiler-interface/1.1.3/compiler-interface-1.1.3.jar ...
        [SUCCESSFUL ] org.scala-sbt#compiler-interface;1.1.3!compiler-interface.jar (4712ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/zinc-compile_2.12/1.1.3/zinc-compile_2.12-1.1.3.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc-compile_2.12;1.1.3!zinc-compile_2.12.jar (2607ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/completion_2.12/1.1.2/completion_2.12-1.1.2.jar ...
        [SUCCESSFUL ] org.scala-sbt#completion_2.12;1.1.2!completion_2.12.jar (21185ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/task-system_2.12/1.1.2/task-system_2.12-1.1.2.jar ...
        [SUCCESSFUL ] org.scala-sbt#task-system_2.12;1.1.2!task-system_2.12.jar (5295ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/tasks_2.12/1.1.2/tasks_2.12-1.1.2.jar ...
        [SUCCESSFUL ] org.scala-sbt#tasks_2.12;1.1.2!tasks_2.12.jar (5010ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/testing_2.12/1.1.2/testing_2.12-1.1.2.jar ...
        [SUCCESSFUL ] org.scala-sbt#testing_2.12;1.1.2!testing_2.12.jar (8114ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/zinc-classpath_2.12/1.1.3/zinc-classpath_2.12-1.1.3.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc-classpath_2.12;1.1.3!zinc-classpath_2.12.jar (5264ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/zinc-apiinfo_2.12/1.1.3/zinc-apiinfo_2.12-1.1.3.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc-apiinfo_2.12;1.1.3!zinc-apiinfo_2.12.jar (13152ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/zinc-ivy-integration_2.12/1.1.3/zinc-ivy-integration_2.12-1.1.3.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc-ivy-integration_2.12;1.1.3!zinc-ivy-integration_2.12.jar (4163ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/zinc_2.12/1.1.3/zinc_2.12-1.1.3.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc_2.12;1.1.3!zinc_2.12.jar (6309ms)
    downloading https://repo1.maven.org/maven2/jline/jline/2.14.4/jline-2.14.4.jar ...
        [SUCCESSFUL ] jline#jline;2.14.4!jline.jar (19437ms)
    downloading file:////Users/xubo/.sbt/preloaded/org.scala-lang/scala-reflect/2.12.4/jars/scala-reflect.jar ...
        [SUCCESSFUL ] org.scala-lang#scala-reflect;2.12.4!scala-reflect.jar (29ms)
    downloading https://repo1.maven.org/maven2/org/scala-lang/scala-compiler/2.12.4/scala-compiler-2.12.4.jar ...
        [SUCCESSFUL ] org.scala-lang#scala-compiler;2.12.4!scala-compiler.jar (696664ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/test-agent/1.1.2/test-agent-1.1.2.jar ...
        [SUCCESSFUL ] org.scala-sbt#test-agent;1.1.2!test-agent.jar (3586ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/zinc-classfile_2.12/1.1.3/zinc-classfile_2.12-1.1.3.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc-classfile_2.12;1.1.3!zinc-classfile_2.12.jar (5542ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/zinc-compile-core_2.12/1.1.3/zinc-compile-core_2.12-1.1.3.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc-compile-core_2.12;1.1.3!zinc-compile-core_2.12.jar (26837ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/zinc-core_2.12/1.1.3/zinc-core_2.12-1.1.3.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc-core_2.12;1.1.3!zinc-core_2.12.jar (13212ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/zinc-persist_2.12/1.1.3/zinc-persist_2.12-1.1.3.jar ...
        [SUCCESSFUL ] org.scala-sbt#zinc-persist_2.12;1.1.3!zinc-persist_2.12.jar (138564ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/core-macros_2.12/1.1.2/core-macros_2.12-1.1.2.jar ...
        [SUCCESSFUL ] org.scala-sbt#core-macros_2.12;1.1.2!core-macros_2.12.jar (10343ms)
    downloading https://repo1.maven.org/maven2/org/scala-sbt/protocol_2.12/1.1.2/protocol_2.12-1.1.2.jar ...
        [SUCCESSFUL ] org.scala-sbt#protocol_2.12;1.1.2!protocol_2.12.jar (31584ms)
    :: retrieving :: org.scala-sbt#boot-app
        confs: [default]
        75 artifacts copied, 0 already retrieved (27555kB/69ms)
    Getting Scala 2.12.4 (for sbt)...
    downloading https://repo1.maven.org/maven2/jline/jline/2.14.5/jline-2.14.5.jar ...
        [SUCCESSFUL ] jline#jline;2.14.5!jline.jar (13155ms)
    :: retrieving :: org.scala-sbt#boot-scala
        confs: [default]
        5 artifacts copied, 0 already retrieved (18986kB/25ms)
    [info] Loading settings from plugins.sbt ...
    [info] Loading project definition from /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/project
    [info] Updating ProjectRef(uri("file:/Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/project/"), "play-scala-rest-api-example-build")...
    
    
    [info] downloading https://repo1.maven.org/maven2/com/github/pathikrit/better-files_2.12/2.17.1/better-files_2.12-2.17.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/javax/annotation/jsr250-api/1.0/jsr250-api-1.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/agrona/agrona/0.9.5/agrona-0.9.5.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/google/code/findbugs/jsr305/1.3.9/jsr305-1.3.9.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/glassfish/jersey/core/jersey-common/2.22.2/jersey-common-2.22.2.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/twirl-compiler_2.12/1.3.14/twirl-compiler_2.12-1.3.14.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/apigee/trireme/trireme-node10src/0.8.9/trireme-node10src-0.8.9.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/akka/akka-protobuf_2.12/2.5.4/akka-protobuf_2.12-2.5.4.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/akka/akka-cluster_2.12/2.5.4/akka-cluster_2.12-2.5.4.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.1/reactive-streams-1.0.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/twirl-api_2.12/1.3.14/twirl-api_2.12-1.3.14.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/slf4j/slf4j-simple/1.7.25/slf4j-simple-1.7.25.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/glassfish/jersey/core/jersey-client/2.22.2/jersey-client-2.22.2.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.1/commons-lang3-3.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/akka/akka-actor_2.12/2.5.4/akka-actor_2.12-2.5.4.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/bouncycastle/bcpkix-jdk15on/1.52/bcpkix-jdk15on-1.52.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/apache/httpcomponents/httpclient/4.5/httpclient-4.5.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/module/jackson-module-jaxb-annotations/2.8.8/jackson-module-jaxb-annotations-2.8.8.jar ...
    [info] downloading https://repo1.maven.org/maven2/ch/qos/logback/logback-core/1.2.1/logback-core-1.2.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/pegdown/pegdown/1.6.0/pegdown-1.6.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/eclipse/aether/aether-api/0.9.0.M2/aether-api-0.9.0.M2.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/github/jnr/jnr-ffi/2.0.3/jnr-ffi-2.0.3.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/googlecode/java-diff-utils/diffutils/1.3.0/diffutils-1.3.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/ow2/asm/asm-tree/5.0.3/asm-tree-5.0.3.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/github/jnr/jffi/1.2.9/jffi-1.2.9.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/apache/maven/maven-model/3.2.2/maven-model-3.2.2.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/glassfish/hk2/hk2-utils/2.4.0-b34/hk2-utils-2.4.0-b34.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/npm_2.12/1.2.1/npm_2.12-1.2.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/apache/maven/maven-artifact/3.2.2/maven-artifact-3.2.2.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/mozilla/rhino/1.7.7.1/rhino-1.7.7.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/glassfish/hk2/hk2-locator/2.4.0-b34/hk2-locator-2.4.0-b34.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/apache/maven/maven-core/3.2.2/maven-core-3.2.2.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/spotify/docker-client/8.9.0/docker-client-8.9.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-json-provider/2.8.8/jackson-jaxrs-json-provider-2.8.8.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/codehaus/plexus/plexus-utils/3.0.17/plexus-utils-3.0.17.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/antlr/antlr-runtime/3.5.2/antlr-runtime-3.5.2.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/apache/commons/commons-compress/1.14/commons-compress-1.14.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/build-link/2.6.15/build-link-2.6.15.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/lucidchart/sbt-scalafmt_2.12_1.0/1.12/sbt-scalafmt-1.12.jar ...
    [info] downloading https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/com.typesafe.play/sbt-plugin/scala_2.12/sbt_1.0/2.6.15/jars/sbt-plugin.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/sonatype/sisu/sisu-guice/3.1.0/sisu-guice-3.1.0-no_aop.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#build-link;2.6.15!build-link.jar (29944ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-exceptions/2.6.15/play-exceptions-2.6.15.jar ...
    [info] 	[SUCCESSFUL ] com.fasterxml.jackson.jaxrs#jackson-jaxrs-json-provider;2.8.8!jackson-jaxrs-json-provider.jar(bundle) (30678ms)
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-guava/2.8.8/jackson-datatype-guava-2.8.8.jar ...
    [info] 	[SUCCESSFUL ] javax.annotation#jsr250-api;1.0!jsr250-api.jar (30838ms)
    [info] downloading https://repo1.maven.org/maven2/aopalliance/aopalliance/1.0/aopalliance-1.0.jar ...
    [info] 	[SUCCESSFUL ] org.sonatype.plexus#plexus-cipher;1.4!plexus-cipher.jar (32741ms)
    [info] downloading https://repo1.maven.org/maven2/javax/enterprise/cdi-api/1.0/cdi-api-1.0.jar ...
    [info] 	[SUCCESSFUL ] org.slf4j#slf4j-simple;1.7.25!slf4j-simple.jar (39235ms)
    [info] downloading https://repo1.maven.org/maven2/com/lightbend/play/play-file-watch_2.12/1.1.7/play-file-watch_2.12-1.1.7.jar ...
    [info] 	[SUCCESSFUL ] com.fasterxml.jackson.module#jackson-module-jaxb-annotations;2.8.8!jackson-module-jaxb-annotations.jar(bundle) (42877ms)
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.8.0/jackson-annotations-2.8.0.jar ...
    [info] 	[SUCCESSFUL ] org.reactivestreams#reactive-streams;1.0.1!reactive-streams.jar (46624ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/ssl-config-core_2.12/0.2.1/ssl-config-core_2.12-0.2.1.jar ...
    [info] 	[SUCCESSFUL ] com.google.code.findbugs#jsr305;1.3.9!jsr305.jar (47720ms)
    [info] downloading https://repo1.maven.org/maven2/com/google/errorprone/error_prone_annotations/2.0.18/error_prone_annotations-2.0.18.jar ...
    [info] 	[SUCCESSFUL ] org.ow2.asm#asm-tree;5.0.3!asm-tree.jar (51323ms)
    [info] downloading https://repo1.maven.org/maven2/org/ow2/asm/asm-util/5.0.3/asm-util-5.0.3.jar ...
    [info] 	[SUCCESSFUL ] com.lucidchart#sbt-scalafmt;1.12!sbt-scalafmt.jar (52798ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/sbt-routes-compiler_2.12/2.6.15/sbt-routes-compiler_2.12-2.6.15.jar ...
    [info] 	[SUCCESSFUL ] org.pegdown#pegdown;1.6.0!pegdown.jar (52847ms)
    [info] downloading https://repo1.maven.org/maven2/org/antlr/ST4/4.0.8/ST4-4.0.8.jar ...
    [info] 	[SUCCESSFUL ] org.apache.maven#maven-artifact;3.2.2!maven-artifact.jar (54979ms)
    [info] downloading https://repo1.maven.org/maven2/org/apache/maven/maven-model-builder/3.2.2/maven-model-builder-3.2.2.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#twirl-compiler_2.12;1.3.14!twirl-compiler_2.12.jar (55141ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/twirl-parser_2.12/1.3.14/twirl-parser_2.12-1.3.14.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-exceptions;2.6.15!play-exceptions.jar (26818ms)
    [info] downloading https://repo1.maven.org/maven2/io/methvin/directory-watcher/0.3.2/directory-watcher-0.3.2.jar ...
    [warn] 	[FAILED     ] com.typesafe.play#sbt-plugin;2.6.15!sbt-plugin.jar: unexpected end of stream on Connection{akamai.bintray.com:443, proxy=DIRECT hostAddress=akamai.bintray.com/23.37.152.87:443 cipherSuite=TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 protocol=http/1.1} (57121ms)
    [warn] 	Detected merged artifact: [FAILED     ] com.typesafe.play#sbt-plugin;2.6.15!sbt-plugin.jar: unexpected end of stream on Connection{akamai.bintray.com:443, proxy=DIRECT hostAddress=akamai.bintray.com/23.37.152.87:443 cipherSuite=TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 protocol=http/1.1} (57121ms).
    [warn] ==== sbt-plugin-releases: tried
    [info] 	[SUCCESSFUL ] aopalliance#aopalliance;1.0!aopalliance.jar (27573ms)
    [info] downloading https://repo1.maven.org/maven2/org/eclipse/aether/aether-spi/0.9.0.M2/aether-spi-0.9.0.M2.jar ...
    [info] 	[SUCCESSFUL ] org.apache.maven#maven-model;3.2.2!maven-model.jar (65426ms)
    [info] downloading https://repo1.maven.org/maven2/org/apache/maven/maven-settings/3.2.2/maven-settings-3.2.2.jar ...
    [info] 	[SUCCESSFUL ] org.glassfish.hk2#hk2-utils;2.4.0-b34!hk2-utils.jar (77697ms)
    [info] downloading https://repo1.maven.org/maven2/org/glassfish/hk2/external/aopalliance-repackaged/2.4.0-b34/aopalliance-repackaged-2.4.0-b34.jar ...
    [info] 	[SUCCESSFUL ] com.google.errorprone#error_prone_annotations;2.0.18!error_prone_annotations.jar (37172ms)
    [info] downloading https://repo1.maven.org/maven2/com/google/j2objc/j2objc-annotations/1.1/j2objc-annotations-1.1.jar ...
    [info] 	[SUCCESSFUL ] com.fasterxml.jackson.core#jackson-annotations;2.8.0!jackson-annotations.jar(bundle) (45969ms)
    [info] downloading https://repo1.maven.org/maven2/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar ...
    [info] 	[SUCCESSFUL ] org.glassfish.hk2#hk2-locator;2.4.0-b34!hk2-locator.jar (89366ms)
    [info] downloading https://repo1.maven.org/maven2/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.jar ...
    [info] 	[SUCCESSFUL ] org.antlr#antlr-runtime;3.5.2!antlr-runtime.jar (95672ms)
    [info] downloading https://repo1.maven.org/maven2/com/lucidchart/scalafmt-api/1.12/scalafmt-api-1.12.jar ...
    [info] 	[SUCCESSFUL ] org.sonatype.sisu#sisu-guice;3.1.0!sisu-guice.jar (97895ms)
    [info] downloading https://repo1.maven.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.0.0.M5/org.eclipse.sisu.inject-0.0.0.M5.jar ...
    [info] 	[SUCCESSFUL ] org.apache.commons#commons-lang3;3.1!commons-lang3.jar (105465ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/jse_2.12/1.2.3/jse_2.12-1.2.3.jar ...
    [info] 	[SUCCESSFUL ] org.glassfish.hk2.external#aopalliance-repackaged;2.4.0-b34!aopalliance-repackaged.jar (28485ms)
    [info] downloading https://repo1.maven.org/maven2/org/javassist/javassist/3.18.1-GA/javassist-3.18.1-GA.jar ...
    [info] 	[SUCCESSFUL ] com.google.j2objc#j2objc-annotations;1.1!j2objc-annotations.jar (27586ms)
    [info] downloading https://repo1.maven.org/maven2/org/codehaus/mojo/animal-sniffer-annotations/1.14/animal-sniffer-annotations-1.14.jar ...
    [info] downloading https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/com.lightbend.sbt/sbt-javaagent/scala_2.12/sbt_1.0/0.1.4/jars/sbt-javaagent.jar ...
    [info] 	[SUCCESSFUL ] com.github.jnr#jffi;1.2.9!jffi.jar (117478ms)
    [info] 	[SUCCESSFUL ] javax.annotation#javax.annotation-api;1.2!javax.annotation-api.jar (28595ms)
    [info] downloading https://repo1.maven.org/maven2/org/glassfish/jersey/bundles/repackaged/jersey-guava/2.22.2/jersey-guava-2.22.2.jar ...
    [info] 	[SUCCESSFUL ] org.glassfish.jersey.core#jersey-client;2.22.2!jersey-client.jar (118736ms)
    [info] downloading https://repo1.maven.org/maven2/org/glassfish/jersey/connectors/jersey-apache-connector/2.22.2/jersey-apache-connector-2.22.2.jar ...
    [info] 	[SUCCESSFUL ] org.glassfish.jersey.core#jersey-common;2.22.2!jersey-common.jar (121269ms)
    [info] downloading https://repo1.maven.org/maven2/org/glassfish/hk2/hk2-api/2.4.0-b34/hk2-api-2.4.0-b34.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#twirl-api_2.12;1.3.14!twirl-api_2.12.jar (121829ms)
    [info] downloading https://repo1.maven.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/github/jnr/jffi/1.2.9/jffi-1.2.9-native.jar ...
    [info] 	[SUCCESSFUL ] org.eclipse.aether#aether-api;0.9.0.M2!aether-api.jar (123104ms)
    [info] downloading https://repo1.maven.org/maven2/org/eclipse/aether/aether-util/0.9.0.M2/aether-util-0.9.0.M2.jar ...
    [info] 	[SUCCESSFUL ] io.methvin#directory-watcher;0.3.2!directory-watcher.jar (66788ms)
    [info] downloading https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/com.lightbend.paradox/sbt-paradox/scala_2.12/sbt_1.0/0.3.1/jars/sbt-paradox.jar ...
    [info] 	[SUCCESSFUL ] com.fasterxml.jackson.datatype#jackson-datatype-guava;2.8.8!jackson-datatype-guava.jar(bundle) (96631ms)
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.8.8/jackson-databind-2.8.8.jar ...
    [warn] 	[FAILED     ] com.typesafe#npm_2.12;1.2.1!npm_2.12.jar: timeout (130751ms)
    [warn] 	Detected merged artifact: [FAILED     ] com.typesafe#npm_2.12;1.2.1!npm_2.12.jar: timeout (130751ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/akka/akka-contrib_2.12/2.5.4/akka-contrib_2.12-2.5.4.jar ...
    [info] 	[SUCCESSFUL ] javax.enterprise#cdi-api;1.0!cdi-api.jar (98761ms)
    [info] 	[SUCCESSFUL ] org.codehaus.mojo#animal-sniffer-annotations;1.14!animal-sniffer-annotations.jar (19522ms)
    [info] 	[SUCCESSFUL ] com.spotify#docker-client;8.9.0!docker-client.jar (133182ms)
    [info] downloading https://repo1.maven.org/maven2/org/vafer/jdeb/1.3/jdeb-1.3.jar ...
    [info] 	[SUCCESSFUL ] javax.ws.rs#javax.ws.rs-api;2.0.1!javax.ws.rs-api.jar (45260ms)
    [info] 	[SUCCESSFUL ] io.apigee.trireme#trireme-node10src;0.8.9!trireme-node10src.jar (144447ms)
    [info] downloading https://repo1.maven.org/maven2/io/spray/spray-json_2.12/1.3.3/spray-json_2.12-1.3.3.jar ...
    [info] 	[SUCCESSFUL ] commons-logging#commons-logging;1.2!commons-logging.jar (144876ms)
    [info] downloading https://repo1.maven.org/maven2/commons-codec/commons-codec/1.9/commons-codec-1.9.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.akka#akka-protobuf_2.12;2.5.4!akka-protobuf_2.12.jar (146986ms)
    [info] downloading https://repo1.maven.org/maven2/io/netty/netty/3.10.6.Final/netty-3.10.6.Final.jar ...
    [info] 	[SUCCESSFUL ] org.apache.commons#commons-compress;1.14!commons-compress.jar (148327ms)
    [info] downloading https://repo1.maven.org/maven2/org/apache/ant/ant/1.10.1/ant-1.10.1.jar ...
    [info] 	[SUCCESSFUL ] org.agrona#agrona;0.9.5!agrona.jar (148869ms)
    [info] downloading https://repo1.maven.org/maven2/io/apigee/trireme/trireme-kernel/0.8.9/trireme-kernel-0.8.9.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.akka#akka-cluster_2.12;2.5.4!akka-cluster_2.12.jar (149089ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/akka/akka-cluster-tools_2.12/2.5.4/akka-cluster-tools_2.12-2.5.4.jar ...
    [info] 	[SUCCESSFUL ] org.eclipse.sisu#org.eclipse.sisu.inject;0.0.0.M5!org.eclipse.sisu.inject.jar(eclipse-plugin) (51743ms)
    [info] 	[SUCCESSFUL ] org.apache.httpcomponents#httpclient;4.5!httpclient.jar (152060ms)
    [info] downloading https://repo1.maven.org/maven2/org/apache/httpcomponents/httpcore/4.4.5/httpcore-4.4.5.jar ...
    [info] 	[SUCCESSFUL ] org.glassfish.hk2#hk2-api;2.4.0-b34!hk2-api.jar (30937ms)
    [info] downloading https://repo1.maven.org/maven2/org/glassfish/hk2/external/javax.inject/2.4.0-b34/javax.inject-2.4.0-b34.jar ...
    [info] 	[SUCCESSFUL ] org.bouncycastle#bcpkix-jdk15on;1.52!bcpkix-jdk15on.jar (152238ms)
    [info] downloading https://repo1.maven.org/maven2/ch/qos/logback/logback-classic/1.2.1/logback-classic-1.2.1.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe#jse_2.12;1.2.3!jse_2.12.jar (47702ms)
    [info] 	[SUCCESSFUL ] com.lightbend.play#play-file-watch_2.12;1.1.7!play-file-watch_2.12.jar (114977ms)
    [info] 	[SUCCESSFUL ] org.eclipse.aether#aether-spi;0.9.0.M2!aether-spi.jar (96119ms)
    [info] 	[SUCCESSFUL ] org.apache.maven#maven-model-builder;3.2.2!maven-model-builder.jar (102774ms)
    [info] downloading https://repo1.maven.org/maven2/org/apache/maven/maven-aether-provider/3.2.2/maven-aether-provider-3.2.2.jar ...
    [info] 	[SUCCESSFUL ] com.googlecode.java-diff-utils#diffutils;1.3.0!diffutils.jar (162320ms)
    [info] 	[SUCCESSFUL ] org.apache.maven#maven-settings;3.2.2!maven-settings.jar (98011ms)
    [info] downloading https://repo1.maven.org/maven2/org/apache/maven/maven-settings-builder/3.2.2/maven-settings-builder-3.2.2.jar ...
    [info] 	[SUCCESSFUL ] ch.qos.logback#logback-core;1.2.1!logback-core.jar (163880ms)
    [info] 	[SUCCESSFUL ] com.typesafe.play#twirl-parser_2.12;1.3.14!twirl-parser_2.12.jar (113164ms)
    [info] 	[SUCCESSFUL ] org.glassfish.jersey.connectors#jersey-apache-connector;2.22.2!jersey-apache-connector.jar (51227ms)
    [info] downloading https://repo1.maven.org/maven2/org/glassfish/jersey/media/jersey-media-json-jackson/2.22.2/jersey-media-json-jackson-2.22.2.jar ...
    [info] 	[SUCCESSFUL ] com.github.pathikrit#better-files_2.12;2.17.1!better-files_2.12.jar (174429ms)
    [info] downloading https://repo1.maven.org/maven2/net/java/dev/jna/jna/4.2.1/jna-4.2.1.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe#ssl-config-core_2.12;0.2.1!ssl-config-core_2.12.jar(bundle) (132972ms)
    [info] 	[SUCCESSFUL ] org.glassfish.hk2.external#javax.inject;2.4.0-b34!javax.inject.jar (32403ms)
    [info] 	[SUCCESSFUL ] com.lucidchart#scalafmt-api;1.12!scalafmt-api.jar (89866ms)
    [info] downloading https://repo1.maven.org/maven2/com/michaelpollmeier/colordiff_2.12/0.8/colordiff_2.12-0.8.jar ...
    [info] 	[SUCCESSFUL ] org.ow2.asm#asm-util;5.0.3!asm-util.jar (136629ms)
    [info] downloading https://repo1.maven.org/maven2/com/github/jnr/jnr-x86asm/1.0.2/jnr-x86asm-1.0.2.jar ...
    [info] 	[SUCCESSFUL ] org.apache.maven#maven-settings-builder;3.2.2!maven-settings-builder.jar (28633ms)
    [info] downloading https://repo1.maven.org/maven2/org/apache/maven/maven-repository-metadata/3.2.2/maven-repository-metadata-3.2.2.jar ...
    [info] 	[SUCCESSFUL ] org.apache.maven#maven-aether-provider;3.2.2!maven-aether-provider.jar (41100ms)
    [info] downloading https://repo1.maven.org/maven2/org/eclipse/aether/aether-impl/0.9.0.M2/aether-impl-0.9.0.M2.jar ...
    [info] 	[SUCCESSFUL ] io.spray#spray-json_2.12;1.3.3!spray-json_2.12.jar(bundle) (56075ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/akka/akka-remote_2.12/2.5.4/akka-remote_2.12-2.5.4.jar ...
    [info] 	[SUCCESSFUL ] commons-io#commons-io;2.5!commons-io.jar (79336ms)
    [info] downloading https://repo1.maven.org/maven2/org/scala-lang/modules/scala-parser-combinators_2.12/1.0.6/scala-parser-combinators_2.12-1.0.6.jar ...
    [info] 	[SUCCESSFUL ] org.antlr#ST4;4.0.8!ST4.jar (154708ms)
    [info] downloading https://repo1.maven.org/maven2/org/parboiled/parboiled-java/1.1.7/parboiled-java-1.1.7.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#sbt-routes-compiler_2.12;2.6.15!sbt-routes-compiler_2.12.jar (158953ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/run-support_2.12/2.6.15/run-support_2.12-2.6.15.jar ...
    [info] 	[SUCCESSFUL ] org.glassfish.jersey.media#jersey-media-json-jackson;2.22.2!jersey-media-json-jackson.jar (42850ms)
    [info] 	[SUCCESSFUL ] io.apigee.trireme#trireme-kernel;0.8.9!trireme-kernel.jar (67394ms)
    [info] 	[SUCCESSFUL ] org.codehaus.plexus#plexus-utils;3.0.17!plexus-utils.jar (234170ms)
    [info] downloading https://repo1.maven.org/maven2/org/codehaus/plexus/plexus-classworlds/2.5.1/plexus-classworlds-2.5.1.jar ...
    [info] 	[SUCCESSFUL ] com.github.jnr#jffi;1.2.9!jffi.jar (139489ms)
    [info] downloading https://repo1.maven.org/maven2/org/ow2/asm/asm/5.0.3/asm-5.0.3.jar ...
    [info] 	[SUCCESSFUL ] org.glassfish.jersey.bundles.repackaged#jersey-guava;2.22.2!jersey-guava.jar(bundle) (139009ms)
    [info] downloading https://repo1.maven.org/maven2/org/glassfish/hk2/osgi-resource-locator/1.0.1/osgi-resource-locator-1.0.1.jar ...
    [info] 	[SUCCESSFUL ] org.mozilla#rhino;1.7.7.1!rhino.jar (262028ms)
    [info] downloading https://repo1.maven.org/maven2/org/webjars/npm/4.2.0/npm-4.2.0.jar ...
    [info] 	[SUCCESSFUL ] org.apache.httpcomponents#httpcore;4.4.5!httpcore.jar (111271ms)
    [info] downloading https://repo1.maven.org/maven2/com/github/jnr/jnr-unixsocket/0.8/jnr-unixsocket-0.8.jar ...
    [info] 	[SUCCESSFUL ] ch.qos.logback#logback-classic;1.2.1!logback-classic.jar (111770ms)
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-base/2.8.8/jackson-jaxrs-base-2.8.8.jar ...
    [info] 	[SUCCESSFUL ] com.michaelpollmeier#colordiff_2.12;0.8!colordiff_2.12.jar (79318ms)
    [info] 	[SUCCESSFUL ] com.typesafe.play#run-support_2.12;2.6.15!run-support_2.12.jar (66544ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/config/1.3.1/config-1.3.1.jar ...
    [info] 	[SUCCESSFUL ] org.eclipse.aether#aether-util;0.9.0.M2!aether-util.jar (155411ms)
    [info] downloading https://repo1.maven.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.0.0.M5/org.eclipse.sisu.plexus-0.0.0.M5.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.akka#akka-contrib_2.12;2.5.4!akka-contrib_2.12.jar (148729ms)
    [info] downloading https://repo1.maven.org/maven2/io/apigee/trireme/trireme-core/0.8.9/trireme-core-0.8.9.jar ...
    [info] 	[SUCCESSFUL ] org.scala-lang.modules#scala-parser-combinators_2.12;1.0.6!scala-parser-combinators_2.12.jar(bundle) (78465ms)
    [info] 	[SUCCESSFUL ] org.apache.maven#maven-core;3.2.2!maven-core.jar (281965ms)
    [info] downloading https://repo1.maven.org/maven2/org/apache/maven/maven-plugin-api/3.2.2/maven-plugin-api-3.2.2.jar ...
    [info] 	[SUCCESSFUL ] org.vafer#jdeb;1.3!jdeb.jar (150722ms)
    [info] downloading https://repo1.maven.org/maven2/org/apache/ant/ant-launcher/1.10.1/ant-launcher-1.10.1.jar ...
    [info] 	[SUCCESSFUL ] com.github.jnr#jnr-x86asm;1.0.2!jnr-x86asm.jar (101196ms)
    [info] downloading https://repo1.maven.org/maven2/org/bouncycastle/bcprov-jdk15on/1.52/bcprov-jdk15on-1.52.jar ...
    [info] 	[SUCCESSFUL ] org.eclipse.aether#aether-impl;0.9.0.M2!aether-impl.jar (91714ms)
    [info] 	[SUCCESSFUL ] org.apache.maven#maven-repository-metadata;3.2.2!maven-repository-metadata.jar (105633ms)
    [info] 	[SUCCESSFUL ] commons-codec#commons-codec;1.9!commons-codec.jar (156333ms)
    [info] downloading https://repo1.maven.org/maven2/org/glassfish/jersey/ext/jersey-entity-filtering/2.22.2/jersey-entity-filtering-2.22.2.jar ...
    [info] 	[SUCCESSFUL ] org.codehaus.plexus#plexus-classworlds;2.5.1!plexus-classworlds.jar(bundle) (68178ms)
    [info] downloading https://repo1.maven.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.jar ...
    [info] 	[SUCCESSFUL ] com.github.jnr#jnr-ffi;2.0.3!jnr-ffi.jar (308638ms)
    [info] downloading https://repo1.maven.org/maven2/com/github/jnr/jnr-constants/0.8.7/jnr-constants-0.8.7.jar ...
    [info] 	[SUCCESSFUL ] org.apache.maven#maven-plugin-api;3.2.2!maven-plugin-api.jar (34163ms)
    [info] downloading https://repo1.maven.org/maven2/org/bouncycastle/bcpg-jdk15on/1.51/bcpg-jdk15on-1.51.jar ...
    [info] 	[SUCCESSFUL ] org.glassfish.hk2#osgi-resource-locator;1.0.1!osgi-resource-locator.jar (65165ms)
    [info] 	[SUCCESSFUL ] org.codehaus.plexus#plexus-component-annotations;1.5.5!plexus-component-annotations.jar (21404ms)
    [info] downloading https://repo1.maven.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.jar ...
    [info] 	[SUCCESSFUL ] net.java.dev.jna#jna;4.2.1!jna.jar (158863ms)
    [info] downloading https://repo1.maven.org/maven2/com/google/guava/guava/23.0/guava-23.0.jar ...
    [info] downloading https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/com.typesafe.sbt/sbt-twirl/scala_2.12/sbt_1.0/1.3.14/jars/sbt-twirl.jar ...
    [info] 	[SUCCESSFUL ] org.javassist#javassist;3.18.1-GA!javassist.jar(bundle) (228783ms)
    [info] downloading https://repo1.maven.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar ...
    [info] 	[SUCCESSFUL ] org.parboiled#parboiled-java;1.1.7!parboiled-java.jar (129661ms)
    [info] downloading https://repo1.maven.org/maven2/org/parboiled/parboiled-core/1.1.7/parboiled-core-1.1.7.jar ...
    [info] 	[SUCCESSFUL ] com.fasterxml.jackson.core#jackson-databind;2.8.8!jackson-databind.jar(bundle) (210469ms)
    [info] 	[SUCCESSFUL ] com.github.jnr#jnr-unixsocket;0.8!jnr-unixsocket.jar (75992ms)
    [info] downloading https://repo1.maven.org/maven2/commons-lang/commons-lang/2.6/commons-lang-2.6.jar ...
    [info] 	[SUCCESSFUL ] org.ow2.asm#asm;5.0.3!asm.jar (85466ms)
    [info] downloading https://repo1.maven.org/maven2/org/ow2/asm/asm-commons/5.0.3/asm-commons-5.0.3.jar ...
    [info] 	[SUCCESSFUL ] org.apache.ant#ant-launcher;1.10.1!ant-launcher.jar (60869ms)
    [info] 	[SUCCESSFUL ] com.typesafe.akka#akka-cluster-tools_2.12;2.5.4!akka-cluster-tools_2.12.jar (202810ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/akka/akka-persistence_2.12/2.5.4/akka-persistence_2.12-2.5.4.jar ...
    [info] 	[SUCCESSFUL ] io.netty#netty;3.10.6.Final!netty.jar(bundle) (213366ms)
    [info] downloading https://repo1.maven.org/maven2/io/aeron/aeron-driver/1.2.5/aeron-driver-1.2.5.jar ...
    [info] 	[SUCCESSFUL ] com.fasterxml.jackson.jaxrs#jackson-jaxrs-base;2.8.8!jackson-jaxrs-base.jar(bundle) (96594ms)
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.8.8/jackson-core-2.8.8.jar ...
    [info] 	[SUCCESSFUL ] com.github.jnr#jnr-constants;0.8.7!jnr-constants.jar (55527ms)
    [info] downloading https://repo1.maven.org/maven2/com/github/jnr/jnr-enxio/0.9/jnr-enxio-0.9.jar ...
    [info] 	[SUCCESSFUL ] org.sonatype.plexus#plexus-sec-dispatcher;1.3!plexus-sec-dispatcher.jar (40863ms)
    [info] 	[SUCCESSFUL ] org.glassfish.jersey.ext#jersey-entity-filtering;2.22.2!jersey-entity-filtering.jar (66442ms)
    [info] 	[SUCCESSFUL ] javax.inject#javax.inject;1!javax.inject.jar (32924ms)
    [info] 	[SUCCESSFUL ] org.apache.ant#ant;1.10.1!ant.jar (228778ms)
    [info] downloading https://repo1.maven.org/maven2/org/scala-sbt/io_2.12/1.0.0/io_2.12-1.0.0.jar ...
    [info] 	[SUCCESSFUL ] org.eclipse.sisu#org.eclipse.sisu.plexus;0.0.0.M5!org.eclipse.sisu.plexus.jar(eclipse-plugin) (99735ms)
    [info] downloading https://repo1.maven.org/maven2/org/codehaus/plexus/plexus-interpolation/1.19/plexus-interpolation-1.19.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe#config;1.3.1!config.jar(bundle) (104341ms)
    [info] 	[SUCCESSFUL ] org.ow2.asm#asm-commons;5.0.3!asm-commons.jar (62304ms)
    [info] downloading https://repo1.maven.org/maven2/org/ow2/asm/asm-analysis/5.0.3/asm-analysis-5.0.3.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.akka#akka-remote_2.12;2.5.4!akka-remote_2.12.jar (204520ms)
    [info] 	[SUCCESSFUL ] org.codehaus.plexus#plexus-interpolation;1.19!plexus-interpolation.jar (36984ms)
    [info] 	[SUCCESSFUL ] org.parboiled#parboiled-core;1.1.7!parboiled-core.jar (86233ms)
    [warn] 	[FAILED     ] com.typesafe.sbt#sbt-twirl;1.3.14!sbt-twirl.jar: SSL peer shut down incorrectly (282651ms)
    [warn] 	Detected merged artifact: [FAILED     ] com.typesafe.sbt#sbt-twirl;1.3.14!sbt-twirl.jar: SSL peer shut down incorrectly (282651ms).
    [warn] ==== sbt-plugin-releases: tried
    [warn]   https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/com.typesafe.sbt/sbt-twirl/scala_2.12/sbt_1.0/1.3.14/jars/sbt-twirl.jar
    [info] 	[SUCCESSFUL ] org.bouncycastle#bcpg-jdk15on;1.51!bcpg-jdk15on.jar (121212ms)
    [info] 	[SUCCESSFUL ] commons-lang#commons-lang;2.6!commons-lang.jar (98726ms)
    [info] 	[SUCCESSFUL ] org.ow2.asm#asm-analysis;5.0.3!asm-analysis.jar (33647ms)
    [info] 	[SUCCESSFUL ] io.aeron#aeron-driver;1.2.5!aeron-driver.jar (88134ms)
    [info] downloading https://repo1.maven.org/maven2/io/aeron/aeron-client/1.2.5/aeron-client-1.2.5.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.akka#akka-persistence_2.12;2.5.4!akka-persistence_2.12.jar (105883ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/akka/akka-stream_2.12/2.5.4/akka-stream_2.12-2.5.4.jar ...
    [info] 	[SUCCESSFUL ] com.fasterxml.jackson.core#jackson-core;2.8.8!jackson-core.jar(bundle) (97760ms)
    [info] 	[SUCCESSFUL ] org.scala-sbt#io_2.12;1.0.0!io_2.12.jar (82918ms)
    [info] 	[SUCCESSFUL ] com.github.jnr#jnr-enxio;0.9!jnr-enxio.jar (108655ms)
    [info] downloading https://repo1.maven.org/maven2/com/github/jnr/jnr-posix/3.0.12/jnr-posix-3.0.12.jar ...
    [info] 	[SUCCESSFUL ] io.apigee.trireme#trireme-core;0.8.9!trireme-core.jar (195781ms)
    [info] 	[SUCCESSFUL ] com.lightbend.sbt#sbt-javaagent;0.1.4!sbt-javaagent.jar (492168ms)
    [info] downloading https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/com.typesafe.sbt/sbt-native-packager/scala_2.12/sbt_1.0/1.3.4/jars/sbt-native-packager.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.akka#akka-actor_2.12;2.5.4!akka-actor_2.12.jar (497006ms)
    [info] downloading https://repo1.maven.org/maven2/org/webjars/webjars-locator-core/0.33/webjars-locator-core-0.33.jar ...
    [info] 	[SUCCESSFUL ] com.google.guava#guava;23.0!guava.jar(bundle) (164006ms)
    [info] 	[SUCCESSFUL ] org.bouncycastle#bcprov-jdk15on;1.52!bcprov-jdk15on.jar (208566ms)
    [info] 	[SUCCESSFUL ] com.github.jnr#jnr-posix;3.0.12!jnr-posix.jar (28797ms)
    [info] 	[SUCCESSFUL ] org.webjars#webjars-locator-core;0.33!webjars-locator-core.jar (11056ms)
    [info] downloading https://repo1.maven.org/maven2/org/scala-lang/modules/scala-java8-compat_2.12/0.8.0/scala-java8-compat_2.12-0.8.0.jar ...
    [info] 	[SUCCESSFUL ] io.aeron#aeron-client;1.2.5!aeron-client.jar (60448ms)
    [info] 	[SUCCESSFUL ] org.webjars#npm;4.2.0!npm.jar (254780ms)
    [info] downloading https://repo1.maven.org/maven2/com/lightbend/paradox/paradox_2.12/0.3.1/paradox_2.12-0.3.1.jar ...
    [info] 	[SUCCESSFUL ] com.lightbend.paradox#sbt-paradox;0.3.1!sbt-paradox.jar (462189ms)
    [info] downloading https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/io.gatling/gatling-sbt/scala_2.12/sbt_1.0/2.2.2/jars/gatling-sbt.jar ...
    [info] downloading https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/com.typesafe.sbt/sbt-web/scala_2.12/sbt_1.0/1.4.3/jars/sbt-web.jar ...
    [info] 	[SUCCESSFUL ] org.scala-lang.modules#scala-java8-compat_2.12;0.8.0!scala-java8-compat_2.12.jar(bundle) (34829ms)
    [info] 	[SUCCESSFUL ] com.typesafe.akka#akka-stream_2.12;2.5.4!akka-stream_2.12.jar (98228ms)
    [info] 	[SUCCESSFUL ] com.lightbend.paradox#paradox_2.12;0.3.1!paradox_2.12.jar (42280ms)
    [info] 	[SUCCESSFUL ] io.gatling#gatling-sbt;2.2.2!gatling-sbt.jar (41962ms)
    [info] 	[SUCCESSFUL ] com.typesafe.sbt#sbt-native-packager;1.3.4!sbt-native-packager.jar (126603ms)
    [info] 	[SUCCESSFUL ] com.typesafe.sbt#sbt-web;1.4.3!sbt-web.jar (71579ms)
    [info] downloading https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/com.typesafe.sbt/sbt-js-engine/scala_2.12/sbt_1.0/1.2.2/jars/sbt-js-engine.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.sbt#sbt-js-engine;1.2.2!sbt-js-engine.jar (5356ms)
    [warn] 	::::::::::::::::::::::::::::::::::::::::::::::
    [warn] 	::              FAILED DOWNLOADS            ::
    [warn] 	:: ^ see resolution messages for details  ^ ::
    [warn] 	::::::::::::::::::::::::::::::::::::::::::::::
    [warn] 	:: com.typesafe.play#sbt-plugin;2.6.15!sbt-plugin.jar
    [warn] 	:: com.typesafe.sbt#sbt-twirl;1.3.14!sbt-twirl.jar
    [warn] 	:: com.typesafe#npm_2.12;1.2.1!npm_2.12.jar
    [warn] 	::::::::::::::::::::::::::::::::::::::::::::::
    [error] sbt.librarymanagement.ResolveException: download failed: com.typesafe.play#sbt-plugin;2.6.15!sbt-plugin.jar
    [error] download failed: com.typesafe.sbt#sbt-twirl;1.3.14!sbt-twirl.jar
    [error] download failed: com.typesafe#npm_2.12;1.2.1!npm_2.12.jar
    [error] 	at sbt.internal.librarymanagement.IvyActions$.resolveAndRetrieve(IvyActions.scala:334)
    [error] 	at sbt.internal.librarymanagement.IvyActions$.$anonfun$updateEither$1(IvyActions.scala:208)
    [error] 	at sbt.internal.librarymanagement.IvySbt$Module.$anonfun$withModule$1(Ivy.scala:243)
    [error] 	at sbt.internal.librarymanagement.IvySbt.$anonfun$withIvy$1(Ivy.scala:204)
    [error] 	at sbt.internal.librarymanagement.IvySbt.sbt$internal$librarymanagement$IvySbt$$action$1(Ivy.scala:70)
    [error] 	at sbt.internal.librarymanagement.IvySbt$$anon$3.call(Ivy.scala:77)
    [error] 	at xsbt.boot.Locks$GlobalLock.withChannel$1(Locks.scala:95)
    [error] 	at xsbt.boot.Locks$GlobalLock.xsbt$boot$Locks$GlobalLock$$withChannelRetries$1(Locks.scala:80)
    [error] 	at xsbt.boot.Locks$GlobalLock$$anonfun$withFileLock$1.apply(Locks.scala:99)
    [error] 	at xsbt.boot.Using$.withResource(Using.scala:10)
    [error] 	at xsbt.boot.Using$.apply(Using.scala:9)
    [error] 	at xsbt.boot.Locks$GlobalLock.ignoringDeadlockAvoided(Locks.scala:60)
    [error] 	at xsbt.boot.Locks$GlobalLock.withLock(Locks.scala:50)
    [error] 	at xsbt.boot.Locks$.apply0(Locks.scala:31)
    [error] 	at xsbt.boot.Locks$.apply(Locks.scala:28)
    [error] 	at sbt.internal.librarymanagement.IvySbt.withDefaultLogger(Ivy.scala:77)
    [error] 	at sbt.internal.librarymanagement.IvySbt.withIvy(Ivy.scala:199)
    [error] 	at sbt.internal.librarymanagement.IvySbt.withIvy(Ivy.scala:196)
    [error] 	at sbt.internal.librarymanagement.IvySbt$Module.withModule(Ivy.scala:242)
    [error] 	at sbt.internal.librarymanagement.IvyActions$.updateEither(IvyActions.scala:193)
    [error] 	at sbt.librarymanagement.ivy.IvyDependencyResolution.update(IvyDependencyResolution.scala:20)
    [error] 	at sbt.librarymanagement.DependencyResolution.update(DependencyResolution.scala:56)
    [error] 	at sbt.internal.LibraryManagement$.resolve$1(LibraryManagement.scala:46)
    [error] 	at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$12(LibraryManagement.scala:99)
    [error] 	at sbt.util.Tracked$.$anonfun$lastOutput$1(Tracked.scala:68)
    [error] 	at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$19(LibraryManagement.scala:112)
    [error] 	at scala.util.control.Exception$Catch.apply(Exception.scala:224)
    [error] 	at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$11(LibraryManagement.scala:112)
    [error] 	at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$11$adapted(LibraryManagement.scala:95)
    [error] 	at sbt.util.Tracked$.$anonfun$inputChanged$1(Tracked.scala:149)
    [error] 	at sbt.internal.LibraryManagement$.cachedUpdate(LibraryManagement.scala:126)
    [error] 	at sbt.Classpaths$.$anonfun$updateTask$5(Defaults.scala:2386)
    [error] 	at scala.Function1.$anonfun$compose$1(Function1.scala:44)
    [error] 	at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:39)
    [error] 	at sbt.std.Transform$$anon$4.work(System.scala:66)
    [error] 	at sbt.Execute.$anonfun$submit$2(Execute.scala:262)
    [error] 	at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:16)
    [error] 	at sbt.Execute.work(Execute.scala:271)
    [error] 	at sbt.Execute.$anonfun$submit$1(Execute.scala:262)
    [error] 	at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:174)
    [error] 	at sbt.CompletionService$$anon$2.call(CompletionService.scala:36)
    [error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
    [error] 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
    [error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
    [error] 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
    [error] 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    [error] 	at java.lang.Thread.run(Thread.java:748)
    [error] (update) sbt.librarymanagement.ResolveException: download failed: com.typesafe.play#sbt-plugin;2.6.15!sbt-plugin.jar
    [error] download failed: com.typesafe.sbt#sbt-twirl;1.3.14!sbt-twirl.jar
    [error] download failed: com.typesafe#npm_2.12;1.2.1!npm_2.12.jar
    Project loading failed: (r)etry, (q)uit, (l)ast, or (i)gnore? 
    [info] Loading settings from plugins.sbt ...
    [info] Loading project definition from /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/project
    [info] Updating ProjectRef(uri("file:/Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/project/"), "play-scala-rest-api-example-build")...
    [info] downloading https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/com.typesafe.play/sbt-plugin/scala_2.12/sbt_1.0/2.6.15/jars/sbt-plugin.jar ...
    [info] downloading https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/com.typesafe.sbt/sbt-twirl/scala_2.12/sbt_1.0/1.3.14/jars/sbt-twirl.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/npm_2.12/1.2.1/npm_2.12-1.2.1.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe#npm_2.12;1.2.1!npm_2.12.jar (6091ms)
    [info] 	[SUCCESSFUL ] com.typesafe.sbt#sbt-twirl;1.3.14!sbt-twirl.jar (8098ms)
    [info] 	[SUCCESSFUL ] com.typesafe.play#sbt-plugin;2.6.15!sbt-plugin.jar (10449ms)
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
    [warn] 	* com.google.guava:guava:23.0 is selected over {19.0, 10.0.1, 16.0, 20.0}
    [warn] 	    +- io.methvin:directory-watcher:0.3.2                 (depends on 23.0)
    [warn] 	    +- com.fasterxml.jackson.datatype:jackson-datatype-guava:2.8.8 (depends on 10.0.1)
    [warn] 	    +- org.eclipse.sisu:org.eclipse.sisu.plexus:0.0.0.M5  (depends on 10.0.1)
    [warn] 	    +- com.spotify:docker-client:8.9.0                    (depends on 10.0.1)
    [warn] 	    +- com.lucidchart:sbt-scalafmt:1.12 (scalaVersion=2.12, sbtVersion=1.0) (depends on 19.0)
    [warn] Run 'evicted' to see detailed eviction warnings
    [info] Compiling 1 Scala source to /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/project/target/scala-2.12/sbt-1.0/classes ...
    [info] Non-compiled module 'compiler-bridge_2.12' for Scala 2.12.4. Compiling...
    [info]   Compilation completed in 6.803s.
    [info] Done compiling.
    [info] Loading settings from build.sbt ...
    [info] Loading settings from build.sbt ...
    [info] Set current project to play-scala-rest-api-example (in build file:/Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/)
    [info] Executing in batch mode. For better performance use sbt's shell
    [info] Updating ...
    [info] downloading https://repo1.maven.org/maven2/org/atteo/classindex/classindex/3.4/classindex-3.4.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/scalameta/scalameta_2.11/1.6.0/scalameta_2.11-1.6.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/xalan/xalan/2.7.2/xalan-2.7.2.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-charts/2.3.1/gatling-charts-2.3.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/advantageous/boon/boon-json/0.6.6/boon-json-0.6.6.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-remote-driver/3.5.3/selenium-remote-driver-3.5.3.jar ...
    [info] downloading https://repo1.maven.org/maven2/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/jodd/jodd-log/3.8.6/jodd-log-3.8.6.jar ...
    [info] downloading https://repo1.maven.org/maven2/xerces/xercesImpl/2.11.0/xercesImpl-2.11.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-doc_2.12/1.8.1/play-doc_2.12-1.8.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/scalameta/tokenizers_2.11/1.6.0/tokenizers_2.11-1.6.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/netty/netty-buffer/4.0.56.Final/netty-buffer-4.0.56.Final.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/scalameta/semantic_2.11/1.6.0/semantic_2.11-1.6.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/google/code/gson/gson/2.8.0/gson-2.8.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-server_2.12/2.6.15/play-server_2.12-2.6.15.jar ...
    [info] downloading https://repo1.maven.org/maven2/net/sourceforge/htmlunit/neko-htmlunit/2.27/neko-htmlunit-2.27.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/lihaoyi/scalaparse_2.11/0.4.2/scalaparse_2.11-0.4.2.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/eclipse/jetty/jetty-io/9.4.5.v20170502/jetty-io-9.4.5.v20170502.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-csv/2.9.0/jackson-dataformat-csv-2.9.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/hdrhistogram/HdrHistogram/2.1.9/HdrHistogram-2.1.9.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/bouncycastle/bcpkix-jdk15on/1.58/bcpkix-jdk15on-1.58.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/apache/geronimo/specs/geronimo-jms_1.1_spec/1.1.1/geronimo-jms_1.1_spec-1.1.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/dongxiguo/fastring_2.12/0.3.1/fastring_2.12-0.3.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/seleniumhq/selenium/htmlunit-driver/2.27/htmlunit-driver-2.27.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-safari-driver/3.5.3/selenium-safari-driver-3.5.3.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.9.0/jackson-annotations-2.9.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/netty/netty-codec-http/4.0.56.Final/netty-codec-http-4.0.56.Final.jar ...
    [info] downloading https://repo1.maven.org/maven2/net/java/dev/jna/jna/4.1.0/jna-4.1.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/scalameta/common_2.11/1.6.0/common_2.11-1.6.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-ahc-ws-standalone_2.12/1.1.0/play-ahc-ws-standalone_2.12-1.1.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-test_2.12/2.6.15/play-test_2.12-2.6.15.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/cachecontrol_2.12/1.1.2/cachecontrol_2.12-1.1.2.jar ...
    [info] downloading https://repo1.maven.org/maven2/junit/junit/4.12/junit-4.12.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/netty/netty-codec/4.0.56.Final/netty-codec-4.0.56.Final.jar ...
    [info] downloading https://repo1.maven.org/maven2/cglib/cglib-nodep/3.2.4/cglib-nodep-3.2.4.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/github/ben-manes/caffeine/caffeine/2.5.5/caffeine-2.5.5.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-redis/2.3.1/gatling-redis-2.3.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-ahc-ws_2.12/2.6.5/play-ahc-ws_2.12-2.6.5.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-ws-standalone-xml_2.12/1.1.0/play-ws-standalone-xml_2.12-1.1.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/rauschig/jarchivelib/0.7.1/jarchivelib-0.7.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.6/commons-lang3-3.6.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/google/inject/extensions/guice-assistedinject/4.1.0/guice-assistedinject-4.1.0.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-java/3.5.3/selenium-java-3.5.3.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-functional_2.12/2.6.9/play-functional_2.12-2.6.9.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/spray/spray-json_2.12/1.3.2/spray-json_2.12-1.3.2.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-chrome-driver/3.5.3/selenium-chrome-driver-3.5.3.jar ...
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-recorder/2.3.1/gatling-recorder-2.3.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/typelevel/macro-compat_2.12/1.1.1/macro-compat_2.12-1.1.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-netty-utils/2.6.15/play-netty-utils-2.6.15.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/akka/akka-parsing_2.12/10.0.13/akka-parsing_2.12-10.0.13.jar ...
    [info] downloading https://repo1.maven.org/maven2/net/logstash/logback/logstash-logback-encoder/4.11/logstash-logback-encoder-4.11.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/akka/akka-stream_2.12/2.5.11/akka-stream_2.12-2.5.11.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/scala-lang/scala-library/2.12.1/scala-library-2.12.1.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-logback_2.12/2.6.15/play-logback_2.12-2.6.15.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.8.11/jackson-annotations-2.8.11.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/slf4j/jcl-over-slf4j/1.7.25/jcl-over-slf4j-1.7.25.jar ...
    [info] downloading https://repo1.maven.org/maven2/commons-codec/commons-codec/1.10/commons-codec-1.10.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/geirsson/scalafmt-core_2.11/0.6.8/scalafmt-core_2.11-0.6.8.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play_2.12/2.6.15/play_2.12-2.6.15.jar ...
    [info] downloading https://repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.2/reactive-streams-1.0.2.jar ...
    [info] 	[SUCCESSFUL ] org.reactivestreams#reactive-streams;1.0.2!reactive-streams.jar (22595ms)
    [info] 	[SUCCESSFUL ] io.gatling#gatling-redis;2.3.1!gatling-redis.jar (31916ms)
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-metrics/2.3.1/gatling-metrics-2.3.1.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-netty-utils;2.6.15!play-netty-utils.jar (32142ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-streams_2.12/2.6.15/play-streams_2.12-2.6.15.jar ...
    [info] 	[SUCCESSFUL ] org.slf4j#jcl-over-slf4j;1.7.25!jcl-over-slf4j.jar (32228ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/akka/akka-actor_2.12/2.5.11/akka-actor_2.12-2.5.11.jar ...
    [info] 	[SUCCESSFUL ] org.typelevel#macro-compat_2.12;1.1.1!macro-compat_2.12.jar (33495ms)
    [info] downloading https://repo1.maven.org/maven2/joda-time/joda-time/2.9.9/joda-time-2.9.9.jar ...
    [info] 	[SUCCESSFUL ] com.fasterxml.jackson.core#jackson-annotations;2.8.11!jackson-annotations.jar(bundle) (45311ms)
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.8.11/jackson-datatype-jdk8-2.8.11.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-ws-standalone-xml_2.12;1.1.0!play-ws-standalone-xml_2.12.jar (47580ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-ws-standalone-json_2.12/1.1.0/play-ws-standalone-json_2.12-1.1.0.jar ...
    [info] 	[SUCCESSFUL ] org.apache.geronimo.specs#geronimo-jms_1.1_spec;1.1.1!geronimo-jms_1.1_spec.jar (47990ms)
    [info] downloading https://repo1.maven.org/maven2/net/debasishg/redisclient_2.12/3.4/redisclient_2.12-3.4.jar ...
    [info] 	[SUCCESSFUL ] org.seleniumhq.selenium#selenium-safari-driver;3.5.3!selenium-safari-driver.jar (54609ms)
    [info] downloading https://repo1.maven.org/maven2/javax/servlet/javax.servlet-api/3.1.0/javax.servlet-api-3.1.0.jar ...
    [info] 	[SUCCESSFUL ] io.netty#netty-codec;4.0.56.Final!netty-codec.jar (63920ms)
    [info] downloading https://repo1.maven.org/maven2/io/netty/netty-transport/4.0.56.Final/netty-transport-4.0.56.Final.jar ...
    [info] 	[SUCCESSFUL ] org.jodd#jodd-log;3.8.6!jodd-log.jar (72085ms)
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-http/2.3.1/gatling-http-2.3.1.jar ...
    [info] 	[SUCCESSFUL ] org.scalameta#scalameta_2.11;1.6.0!scalameta_2.11.jar (72582ms)
    [info] downloading https://repo1.maven.org/maven2/com/geirsson/metaconfig-core_2.11/0.1.2/metaconfig-core_2.11-0.1.2.jar ...
    [info] 	[SUCCESSFUL ] org.seleniumhq.selenium#selenium-java;3.5.3!selenium-java.jar (83846ms)
    [info] downloading https://repo1.maven.org/maven2/com/codeborne/phantomjsdriver/1.4.3/phantomjsdriver-1.4.3.jar ...
    [info] 	[SUCCESSFUL ] net.sourceforge.htmlunit#neko-htmlunit;2.27!neko-htmlunit.jar (88262ms)
    [info] downloading https://repo1.maven.org/maven2/net/sourceforge/cssparser/cssparser/0.9.23/cssparser-0.9.23.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-test_2.12;2.6.15!play-test_2.12.jar (91781ms)
    [info] downloading https://repo1.maven.org/maven2/org/scalatestplus/play/scalatestplus-play_2.12/3.1.2/scalatestplus-play_2.12-3.1.2.jar ...
    [info] 	[SUCCESSFUL ] org.seleniumhq.selenium#htmlunit-driver;2.27!htmlunit-driver.jar (108917ms)
    [info] downloading https://repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-api/3.5.3/selenium-api-3.5.3.jar ...
    [info] 	[SUCCESSFUL ] org.eclipse.jetty#jetty-io;9.4.5.v20170502!jetty-io.jar (116126ms)
    [info] downloading https://repo1.maven.org/maven2/org/eclipse/jetty/jetty-client/9.4.5.v20170502/jetty-client-9.4.5.v20170502.jar ...
    [info] 	[SUCCESSFUL ] org.seleniumhq.selenium#selenium-chrome-driver;3.5.3!selenium-chrome-driver.jar (118462ms)
    [info] downloading https://repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-edge-driver/3.5.3/selenium-edge-driver-3.5.3.jar ...
    [info] 	[SUCCESSFUL ] com.fasterxml.jackson.core#jackson-annotations;2.9.0!jackson-annotations.jar(bundle) (123549ms)
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.9.0/jackson-core-2.9.0.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-server_2.12;2.6.15!play-server_2.12.jar (135533ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/filters-helpers_2.12/2.6.15/filters-helpers_2.12-2.6.15.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-ahc-ws_2.12;2.6.5!play-ahc-ws_2.12.jar (139231ms)
    [info] downloading https://repo1.maven.org/maven2/org/scalactic/scalactic_2.12/3.0.4/scalactic_2.12-3.0.4.jar ...
    [info] 	[SUCCESSFUL ] com.fasterxml.jackson.dataformat#jackson-dataformat-csv;2.9.0!jackson-dataformat-csv.jar(bundle) (140657ms)
    [info] downloading https://repo1.maven.org/maven2/io/suzaku/boopickle_2.12/1.2.6/boopickle_2.12-1.2.6.jar ...
    [info] 	[SUCCESSFUL ] com.lihaoyi#scalaparse_2.11;0.4.2!scalaparse_2.11.jar (143118ms)
    [info] downloading https://repo1.maven.org/maven2/com/lihaoyi/fastparse_2.11/0.4.2/fastparse_2.11-0.4.2.jar ...
    [info] 	[SUCCESSFUL ] org.scalameta#tokenizers_2.11;1.6.0!tokenizers_2.11.jar (147381ms)
    [info] downloading https://repo1.maven.org/maven2/org/scalameta/transversers_2.11/1.6.0/transversers_2.11-1.6.0.jar ...
    [info] 	[SUCCESSFUL ] com.google.inject.extensions#guice-assistedinject;4.1.0!guice-assistedinject.jar (155361ms)
    [info] downloading https://repo1.maven.org/maven2/org/parboiled/parboiled_2.12/2.1.3/parboiled_2.12-2.1.3.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-logback_2.12;2.6.15!play-logback_2.12.jar (158296ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-akka-http-server_2.12/2.6.15/play-akka-http-server_2.12-2.6.15.jar ...
    [info] 	[SUCCESSFUL ] org.hamcrest#hamcrest-core;1.3!hamcrest-core.jar (160455ms)
    [warn] 	[FAILED     ] org.apache.commons#commons-lang3;3.6!commons-lang3.jar: timeout (165335ms)
    [warn] 	Detected merged artifact: [FAILED     ] org.apache.commons#commons-lang3;3.6!commons-lang3.jar: timeout (165335ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/javax/transaction/jta/1.1/jta-1.1.jar ...
    [info] 	[SUCCESSFUL ] org.hdrhistogram#HdrHistogram;2.1.9!HdrHistogram.jar(bundle) (166849ms)
    [info] downloading https://repo1.maven.org/maven2/org/scala-lang/modules/scala-swing_2.12/2.0.0/scala-swing_2.12-2.0.0.jar ...
    [warn] 	[FAILED     ] io.gatling#gatling-metrics;2.3.1!gatling-metrics.jar: timeout (135206ms)
    [warn] 	Detected merged artifact: [FAILED     ] io.gatling#gatling-metrics;2.3.1!gatling-metrics.jar: timeout (135206ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/org/asynchttpclient/async-http-client/2.0.39/async-http-client-2.0.39.jar ...
    [info] 	[SUCCESSFUL ] io.netty#netty-transport;4.0.56.Final!netty-transport.jar (107832ms)
    [info] downloading https://repo1.maven.org/maven2/org/asynchttpclient/netty-resolver/2.0.39/netty-resolver-2.0.39.jar ...
    [warn] 	[FAILED     ] io.advantageous.boon#boon-json;0.6.6!boon-json.jar: timeout (172036ms)
    [warn] 	Detected merged artifact: [FAILED     ] io.advantageous.boon#boon-json;0.6.6!boon-json.jar: timeout (172036ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/net/sf/saxon/Saxon-HE/9.8.0-4/Saxon-HE-9.8.0-4.jar ...
    [warn] 	[FAILED     ] com.dongxiguo#fastring_2.12;0.3.1!fastring_2.12.jar: timeout (173686ms)
    [warn] 	Detected merged artifact: [FAILED     ] com.dongxiguo#fastring_2.12;0.3.1!fastring_2.12.jar: timeout (173686ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/com/softwaremill/quicklens/quicklens_2.12/1.4.8/quicklens_2.12-1.4.8.jar ...
    [warn] 	[FAILED     ] org.rauschig#jarchivelib;0.7.1!jarchivelib.jar(bundle): Read timed out (174202ms)
    [warn] 	Detected merged artifact: [FAILED     ] org.rauschig#jarchivelib;0.7.1!jarchivelib.jar(bundle): Read timed out (174202ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/org/apache/commons/commons-compress/1.9/commons-compress-1.9.jar ...
    [info] 	[SUCCESSFUL ] org.scalatestplus.play#scalatestplus-play_2.12;3.1.2!scalatestplus-play_2.12.jar (82478ms)
    [info] downloading https://repo1.maven.org/maven2/io/gatling/highcharts/gatling-charts-highcharts/2.3.1/gatling-charts-highcharts-2.3.1.jar ...
    [warn] 	[FAILED     ] com.typesafe.play#play-functional_2.12;2.6.9!play-functional_2.12.jar: timeout (175865ms)
    [warn] 	Detected merged artifact: [FAILED     ] com.typesafe.play#play-functional_2.12;2.6.9!play-functional_2.12.jar: timeout (175865ms).
    [warn] ==== public: tried
    [info] 	[SUCCESSFUL ] junit#junit;4.12!junit.jar (177746ms)
    [info] downloading https://repo1.maven.org/maven2/com/novocode/junit-interface/0.11/junit-interface-0.11.jar ...
    [info] 	[SUCCESSFUL ] org.scalameta#semantic_2.11;1.6.0!semantic_2.11.jar (182607ms)
    [info] downloading https://repo1.maven.org/maven2/com/lihaoyi/sourcecode_2.11/0.1.3/sourcecode_2.11-0.1.3.jar ...
    [info] 	[SUCCESSFUL ] org.atteo.classindex#classindex;3.4!classindex.jar (183223ms)
    [info] 	[SUCCESSFUL ] net.java.dev.jna#jna;4.1.0!jna.jar (183306ms)
    [info] downloading https://repo1.maven.org/maven2/net/java/dev/jna/jna-platform/4.1.0/jna-platform-4.1.0.jar ...
    [info] 	[SUCCESSFUL ] com.codeborne#phantomjsdriver;1.4.3!phantomjsdriver.jar (103081ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-ws_2.12/2.6.5/play-ws_2.12-2.6.5.jar ...
    [info] 	[SUCCESSFUL ] io.spray#spray-json_2.12;1.3.2!spray-json_2.12.jar(bundle) (190422ms)
    [info] downloading https://repo1.maven.org/maven2/com/chuusai/shapeless_2.12/2.3.2/shapeless_2.12-2.3.2.jar ...
    [info] 	[SUCCESSFUL ] cglib#cglib-nodep;3.2.4!cglib-nodep.jar (191800ms)
    [info] downloading https://repo1.maven.org/maven2/org/apache/commons/commons-exec/1.3/commons-exec-1.3.jar ...
    [warn] 	[FAILED     ] com.typesafe.play#play-streams_2.12;2.6.15!play-streams_2.12.jar: timeout (167711ms)
    [warn] 	Detected merged artifact: [FAILED     ] com.typesafe.play#play-streams_2.12;2.6.15!play-streams_2.12.jar: timeout (167711ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/org/slf4j/jul-to-slf4j/1.7.25/jul-to-slf4j-1.7.25.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-ahc-ws-standalone_2.12;1.1.0!play-ahc-ws-standalone_2.12.jar (202861ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/shaded-asynchttpclient/1.1.0/shaded-asynchttpclient-1.1.0.jar ...
    [warn] 	[FAILED     ] javax.servlet#javax.servlet-api;3.1.0!javax.servlet-api.jar: timeout (154871ms)
    [warn] 	Detected merged artifact: [FAILED     ] javax.servlet#javax.servlet-api;3.1.0!javax.servlet-api.jar: timeout (154871ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-ws-standalone_2.12/1.1.0/play-ws-standalone_2.12-1.1.0.jar ...
    [info] 	[SUCCESSFUL ] com.lihaoyi#fastparse_2.11;0.4.2!fastparse_2.11.jar (68589ms)
    [info] downloading https://repo1.maven.org/maven2/com/lihaoyi/fastparse-utils_2.11/0.4.2/fastparse-utils_2.11-0.4.2.jar ...
    [warn] 	[FAILED     ] com.typesafe.play#play-ws-standalone-json_2.12;1.1.0!play-ws-standalone-json_2.12.jar: timeout (164290ms)
    [warn] 	Detected merged artifact: [FAILED     ] com.typesafe.play#play-ws-standalone-json_2.12;1.1.0!play-ws-standalone-json_2.12.jar: timeout (164290ms).
    [warn] ==== public: tried
    [info] 	[SUCCESSFUL ] org.asynchttpclient#netty-resolver;2.0.39!netty-resolver.jar (54180ms)
    [info] downloading https://repo1.maven.org/maven2/org/asynchttpclient/netty-codec-dns/2.0.39/netty-codec-dns-2.0.39.jar ...
    [info] 	[SUCCESSFUL ] org.seleniumhq.selenium#selenium-edge-driver;3.5.3!selenium-edge-driver.jar (112083ms)
    [info] downloading https://repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-ie-driver/3.5.3/selenium-ie-driver-3.5.3.jar ...
    [info] 	[SUCCESSFUL ] org.bouncycastle#bcpkix-jdk15on;1.58!bcpkix-jdk15on.jar (236643ms)
    [info] downloading https://repo1.maven.org/maven2/org/bouncycastle/bcprov-jdk15on/1.58/bcprov-jdk15on-1.58.jar ...
    [info] 	[SUCCESSFUL ] com.fasterxml.jackson.core#jackson-core;2.9.0!jackson-core.jar(bundle) (113975ms)
    [info] downloading https://repo1.maven.org/maven2/io/advantageous/boon/boon-reflekt/0.6.6/boon-reflekt-0.6.6.jar ...
    [warn] 	[FAILED     ] com.typesafe.play#play-ws-standalone_2.12;1.1.0!play-ws-standalone_2.12.jar: Connection reset (28401ms)
    [warn] 	Detected merged artifact: [FAILED     ] com.typesafe.play#play-ws-standalone_2.12;1.1.0!play-ws-standalone_2.12.jar: Connection reset (28401ms).
    [warn] ==== public: tried
    [info] 	[SUCCESSFUL ] io.gatling#gatling-charts;2.3.1!gatling-charts.jar (239058ms)
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-app/2.3.1/gatling-app-2.3.1.jar ...
    [info] 	[SUCCESSFUL ] io.netty#netty-codec-http;4.0.56.Final!netty-codec-http.jar (239948ms)
    [info] downloading https://repo1.maven.org/maven2/io/netty/netty-handler/4.0.56.Final/netty-handler-4.0.56.Final.jar ...
    [info] 	[SUCCESSFUL ] net.logstash.logback#logstash-logback-encoder;4.11!logstash-logback-encoder.jar (241664ms)
    [info] downloading https://repo1.maven.org/maven2/com/netaporter/scala-uri_2.12/0.4.16/scala-uri_2.12-0.4.16.jar ...
    [info] 	[SUCCESSFUL ] io.gatling.highcharts#gatling-charts-highcharts;2.3.1!gatling-charts-highcharts.jar (67670ms)
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-test-framework/2.3.1/gatling-test-framework-2.3.1.jar ...
    [info] 	[SUCCESSFUL ] net.debasishg#redisclient_2.12;3.4!redisclient_2.12.jar (196390ms)
    [info] downloading https://repo1.maven.org/maven2/commons-pool/commons-pool/1.6/commons-pool-1.6.jar ...
    [info] 	[SUCCESSFUL ] org.slf4j#jul-to-slf4j;1.7.25!jul-to-slf4j.jar (46625ms)
    [info] 	[SUCCESSFUL ] io.gatling#gatling-recorder;2.3.1!gatling-recorder.jar (251381ms)
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-core/2.3.1/gatling-core-2.3.1.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#filters-helpers_2.12;2.6.15!filters-helpers_2.12.jar (121357ms)
    [info] 	[SUCCESSFUL ] javax.transaction#jta;1.1!jta.jar (95796ms)
    [warn] 	[FAILED     ] ch.qos.logback#logback-classic;1.2.3!logback-classic.jar: timeout (273420ms)
    [warn] 	Detected merged artifact: [FAILED     ] ch.qos.logback#logback-classic;1.2.3!logback-classic.jar: timeout (273420ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar ...
    [info] 	[SUCCESSFUL ] org.seleniumhq.selenium#selenium-api;3.5.3!selenium-api.jar (169729ms)
    [info] downloading https://repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-support/3.5.3/selenium-support-3.5.3.jar ...
    [info] 	[SUCCESSFUL ] net.sourceforge.cssparser#cssparser;0.9.23!cssparser.jar (193832ms)
    [info] downloading https://repo1.maven.org/maven2/org/eclipse/jetty/websocket/websocket-client/9.4.5.v20170502/websocket-client-9.4.5.v20170502.jar ...
    [info] 	[SUCCESSFUL ] io.gatling#gatling-app;2.3.1!gatling-app.jar (43392ms)
    [info] 	[SUCCESSFUL ] org.asynchttpclient#netty-codec-dns;2.0.39!netty-codec-dns.jar (57779ms)
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-ws_2.12;2.6.5!play-ws_2.12.jar (110424ms)
    [info] 	[SUCCESSFUL ] commons-codec#commons-codec;1.10!commons-codec.jar (304119ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-json_2.12/2.6.9/play-json_2.12-2.6.9.jar ...
    [info] 	[SUCCESSFUL ] org.apache.commons#commons-exec;1.3!commons-exec.jar (113657ms)
    [info] 	[SUCCESSFUL ] com.lihaoyi#fastparse-utils_2.11;0.4.2!fastparse-utils_2.11.jar (96378ms)
    [info] downloading https://repo1.maven.org/maven2/com/lihaoyi/geny_2.11/0.1.1/geny_2.11-0.1.1.jar ...
    [info] 	[SUCCESSFUL ] org.asynchttpclient#async-http-client;2.0.39!async-http-client.jar (150033ms)
    [info] downloading https://repo1.maven.org/maven2/io/netty/netty-transport-native-epoll/4.0.56.Final/netty-transport-native-epoll-4.0.56.Final-linux-x86_64.jar ...
    [info] 	[SUCCESSFUL ] com.fasterxml.jackson.datatype#jackson-datatype-jdk8;2.8.11!jackson-datatype-jdk8.jar(bundle) (285816ms)
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.8.11/jackson-datatype-jsr310-2.8.11.jar ...
    [info] 	[SUCCESSFUL ] xerces#xercesImpl;2.11.0!xercesImpl.jar (347738ms)
    [info] downloading https://repo1.maven.org/maven2/xml-apis/xml-apis/1.4.01/xml-apis-1.4.01.jar ...
    [info] 	[SUCCESSFUL ] io.advantageous.boon#boon-reflekt;0.6.6!boon-reflekt.jar (112629ms)
    [info] downloading https://repo1.maven.org/maven2/org/jodd/jodd-core/3.8.6/jodd-core-3.8.6.jar ...
    [info] 	[SUCCESSFUL ] org.seleniumhq.selenium#selenium-ie-driver;3.5.3!selenium-ie-driver.jar (129594ms)
    [info] downloading https://repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-opera-driver/3.5.3/selenium-opera-driver-3.5.3.jar ...
    [warn] 	[FAILED     ] joda-time#joda-time;2.9.9!joda-time.jar: timeout (330683ms)
    [warn] 	Detected merged artifact: [FAILED     ] joda-time#joda-time;2.9.9!joda-time.jar: timeout (330683ms).
    [warn] ==== public: tried
    [info] 	[SUCCESSFUL ] com.lihaoyi#geny_2.11;0.1.1!geny_2.11.jar (59181ms)
    [info] 	[SUCCESSFUL ] io.netty#netty-buffer;4.0.56.Final!netty-buffer.jar (370778ms)
    [info] downloading https://repo1.maven.org/maven2/io/netty/netty-common/4.0.56.Final/netty-common-4.0.56.Final.jar ...
    [info] 	[SUCCESSFUL ] org.seleniumhq.selenium#selenium-remote-driver;3.5.3!selenium-remote-driver.jar (372877ms)
    [warn] 	[FAILED     ] io.gatling#gatling-http;2.3.1!gatling-http.jar: timeout (302748ms)
    [warn] 	Detected merged artifact: [FAILED     ] io.gatling#gatling-http;2.3.1!gatling-http.jar: timeout (302748ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-jms/2.3.1/gatling-jms-2.3.1.jar ...
    [warn] 	[FAILED     ] net.java.dev.jna#jna-platform;4.1.0!jna-platform.jar: timeout (193859ms)
    [warn] 	Detected merged artifact: [FAILED     ] net.java.dev.jna#jna-platform;4.1.0!jna-platform.jar: timeout (193859ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/net/sourceforge/htmlunit/htmlunit/2.27/htmlunit-2.27.jar ...
    [info] downloading https://repo1.maven.org/maven2/com/google/guava/guava/23.0/guava-23.0.jar ...
    [info] 	[SUCCESSFUL ] com.softwaremill.quicklens#quicklens_2.12;1.4.8!quicklens_2.12.jar (208133ms)
    [info] downloading https://repo1.maven.org/maven2/org/asynchttpclient/async-http-client-netty-utils/2.0.39/async-http-client-netty-utils-2.0.39.jar ...
    [info] 	[SUCCESSFUL ] org.scalameta#common_2.11;1.6.0!common_2.11.jar (408707ms)
    [info] downloading https://repo1.maven.org/maven2/org/scalameta/dialects_2.11/1.6.0/dialects_2.11-1.6.0.jar ...
    [warn] 	[FAILED     ] com.typesafe.play#cachecontrol_2.12;1.1.2!cachecontrol_2.12.jar: timeout (410578ms)
    [warn] 	Detected merged artifact: [FAILED     ] com.typesafe.play#cachecontrol_2.12;1.1.2!cachecontrol_2.12.jar: timeout (410578ms).
    [warn] ==== public: tried
    [warn] 	[FAILED     ] org.seleniumhq.selenium#selenium-support;3.5.3!selenium-support.jar: timeout (141330ms)
    [warn] 	Detected merged artifact: [FAILED     ] org.seleniumhq.selenium#selenium-support;3.5.3!selenium-support.jar: timeout (141330ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-firefox-driver/3.5.3/selenium-firefox-driver-3.5.3.jar ...
    [info] 	[SUCCESSFUL ] com.geirsson#metaconfig-core_2.11;0.1.2!metaconfig-core_2.11.jar (350713ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/config/1.2.1/config-1.2.1.jar ...
    [warn] 	[FAILED     ] com.github.ben-manes.caffeine#caffeine;2.5.5!caffeine.jar: timeout (424523ms)
    [warn] 	Detected merged artifact: [FAILED     ] com.github.ben-manes.caffeine#caffeine;2.5.5!caffeine.jar: timeout (424523ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/com/github/scopt/scopt_2.12/3.7.0/scopt_2.12-3.7.0.jar ...
    [warn] 	[FAILED     ] com.google.code.gson#gson;2.8.0!gson.jar: timeout (442722ms)
    [warn] 	Detected merged artifact: [FAILED     ] com.google.code.gson#gson;2.8.0!gson.jar: timeout (442722ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/org/apache/httpcomponents/httpclient/4.5.3/httpclient-4.5.3.jar ...
    [info] 	[SUCCESSFUL ] org.scalactic#scalactic_2.12;3.0.4!scalactic_2.12.jar(bundle) (307052ms)
    [warn] 	[FAILED     ] io.gatling#gatling-test-framework;2.3.1!gatling-test-framework.jar: timeout (207243ms)
    [warn] 	Detected merged artifact: [FAILED     ] io.gatling#gatling-test-framework;2.3.1!gatling-test-framework.jar: timeout (207243ms).
    [warn] ==== public: tried
    [warn] 	[FAILED     ] com.fasterxml.jackson.datatype#jackson-datatype-jsr310;2.8.11!jackson-datatype-jsr310.jar(bundle): timeout (120002ms)
    [warn] 	Detected merged artifact: [FAILED     ] com.fasterxml.jackson.datatype#jackson-datatype-jsr310;2.8.11!jackson-datatype-jsr310.jar(bundle): timeout (120002ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.8.11.1/jackson-databind-2.8.11.1.jar ...
    [info] 	[SUCCESSFUL ] commons-pool#commons-pool;1.6!commons-pool.jar (215691ms)
    [info] 	[SUCCESSFUL ] org.eclipse.jetty#jetty-client;9.4.5.v20170502!jetty-client.jar (354152ms)
    [info] downloading https://repo1.maven.org/maven2/org/eclipse/jetty/websocket/websocket-common/9.4.5.v20170502/websocket-common-9.4.5.v20170502.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-doc_2.12;1.8.1!play-doc_2.12.jar (470658ms)
    [warn] 	[FAILED     ] org.eclipse.jetty.websocket#websocket-client;9.4.5.v20170502!websocket-client.jar: Read timed out (201279ms)
    [warn] 	Detected merged artifact: [FAILED     ] org.eclipse.jetty.websocket#websocket-client;9.4.5.v20170502!websocket-client.jar: Read timed out (201279ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/xalan/serializer/2.7.2/serializer-2.7.2.jar ...
    [info] 	[SUCCESSFUL ] org.seleniumhq.selenium#selenium-opera-driver;3.5.3!selenium-opera-driver.jar (124670ms)
    [info] 	[SUCCESSFUL ] com.typesafe.play#play_2.12;2.6.15!play_2.12.jar (500627ms)
    [warn] 	[FAILED     ] org.asynchttpclient#async-http-client-netty-utils;2.0.39!async-http-client-netty-utils.jar: timeout (120003ms)
    [warn] 	Detected merged artifact: [FAILED     ] org.asynchttpclient#async-http-client-netty-utils;2.0.39!async-http-client-netty-utils.jar: timeout (120003ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/scala-logging/scala-logging_2.12/3.7.2/scala-logging_2.12-3.7.2.jar ...
    [info] 	[SUCCESSFUL ] com.novocode#junit-interface;0.11!junit-interface.jar (360496ms)
    [info] downloading https://repo1.maven.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar ...
    [info] 	[SUCCESSFUL ] com.netaporter#scala-uri_2.12;0.4.16!scala-uri_2.12.jar (307767ms)
    [info] downloading https://repo1.maven.org/maven2/net/codingwell/scala-guice_2.12/4.1.1/scala-guice_2.12-4.1.1.jar ...
    [warn] 	[FAILED     ] com.typesafe.play#play-json_2.12;2.6.9!play-json_2.12.jar: timeout (246604ms)
    [warn] 	Detected merged artifact: [FAILED     ] com.typesafe.play#play-json_2.12;2.6.9!play-json_2.12.jar: timeout (246604ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/com/google/guava/guava/22.0/guava-22.0.jar ...
    [info] 	[SUCCESSFUL ] io.netty#netty-common;4.0.56.Final!netty-common.jar (183107ms)
    [info] 	[SUCCESSFUL ] org.scalameta#dialects_2.11;1.6.0!dialects_2.11.jar (163989ms)
    [info] downloading https://repo1.maven.org/maven2/org/scalameta/parsers_2.11/1.6.0/parsers_2.11-1.6.0.jar ...
    [info] 	[SUCCESSFUL ] ch.qos.logback#logback-core;1.2.3!logback-core.jar (312406ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/akka/akka-http-core_2.12/10.0.13/akka-http-core_2.12-10.0.13.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.scala-logging#scala-logging_2.12;3.7.2!scala-logging_2.12.jar(bundle) (89850ms)
    [info] 	[SUCCESSFUL ] xml-apis#xml-apis;1.4.01!xml-apis.jar (245384ms)
    [info] downloading https://repo1.maven.org/maven2/org/w3c/css/sac/1.3/sac-1.3.jar ...
    [warn] 	[FAILED     ] org.parboiled#parboiled_2.12;2.1.3!parboiled_2.12.jar: Read timed out (441061ms)
    [warn] 	Detected merged artifact: [FAILED     ] org.parboiled#parboiled_2.12;2.1.3!parboiled_2.12.jar: Read timed out (441061ms).
    [warn] ==== public: tried
    [info] 	[SUCCESSFUL ] com.typesafe.akka#akka-parsing_2.12;10.0.13!akka-parsing_2.12.jar (601163ms)
    [info] downloading https://repo1.maven.org/maven2/com/google/inject/guice/4.1.0/guice-4.1.0.jar ...
    [warn] 	[FAILED     ] com.github.scopt#scopt_2.12;3.7.0!scopt_2.12.jar: timeout (180922ms)
    [warn] 	Detected merged artifact: [FAILED     ] com.github.scopt#scopt_2.12;3.7.0!scopt_2.12.jar: timeout (180922ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/io/gatling/jsonpath_2.12/0.6.9/jsonpath_2.12-0.6.9.jar ...
    [info] 	[SUCCESSFUL ] io.netty#netty-handler;4.0.56.Final!netty-handler.jar (371203ms)
    [info] downloading https://repo1.maven.org/maven2/org/asynchttpclient/netty-resolver-dns/2.0.39/netty-resolver-dns-2.0.39.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-akka-http-server_2.12;2.6.15!play-akka-http-server_2.12.jar (458106ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-guice_2.12/2.6.15/play-guice_2.12-2.6.15.jar ...
    [info] 	[SUCCESSFUL ] xalan#xalan;2.7.2!xalan.jar (621443ms)
    [info] downloading https://repo1.maven.org/maven2/org/apache/httpcomponents/httpmime/4.5.3/httpmime-4.5.3.jar ...
    [warn] 	[FAILED     ] org.scalameta#transversers_2.11;1.6.0!transversers_2.11.jar: timeout (486578ms)
    [warn] 	Detected merged artifact: [FAILED     ] org.scalameta#transversers_2.11;1.6.0!transversers_2.11.jar: timeout (486578ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/org/scalameta/trees_2.11/1.6.0/trees_2.11-1.6.0.jar ...
    [info] 	[SUCCESSFUL ] com.chuusai#shapeless_2.12;2.3.2!shapeless_2.12.jar(bundle) (450346ms)
    [info] downloading https://repo1.maven.org/maven2/com/google/inject/extensions/guice-multibindings/4.1.0/guice-multibindings-4.1.0.jar ...
    [info] 	[SUCCESSFUL ] org.apache.httpcomponents#httpclient;4.5.3!httpclient.jar (198442ms)
    [info] downloading https://repo1.maven.org/maven2/org/apache/httpcomponents/httpcore/4.4.6/httpcore-4.4.6.jar ...
    [info] 	[SUCCESSFUL ] org.apache.httpcomponents#httpmime;4.5.3!httpmime.jar (35062ms)
    [info] downloading https://repo1.maven.org/maven2/net/sourceforge/htmlunit/htmlunit-core-js/2.27/htmlunit-core-js-2.27.jar ...
    [warn] 	[FAILED     ] com.lihaoyi#sourcecode_2.11;0.1.3!sourcecode_2.11.jar: timeout (476462ms)
    [warn] 	Detected merged artifact: [FAILED     ] com.lihaoyi#sourcecode_2.11;0.1.3!sourcecode_2.11.jar: timeout (476462ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/org/scalameta/inputs_2.11/1.6.0/inputs_2.11-1.6.0.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.akka#akka-stream_2.12;2.5.11!akka-stream_2.12.jar (661101ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/akka/akka-protobuf_2.12/2.5.11/akka-protobuf_2.12-2.5.11.jar ...
    [info] 	[SUCCESSFUL ] io.gatling#jsonpath_2.12;0.6.9!jsonpath_2.12.jar (62329ms)
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.9.0/jackson-databind-2.9.0.jar ...
    [info] 	[SUCCESSFUL ] org.scala-lang.modules#scala-swing_2.12;2.0.0!scala-swing_2.12.jar(bundle) (505827ms)
    [info] 	[SUCCESSFUL ] org.w3c.css#sac;1.3!sac.jar (83186ms)
    [info] downloading https://repo1.maven.org/maven2/org/eclipse/jetty/jetty-util/9.4.5.v20170502/jetty-util-9.4.5.v20170502.jar ...
    [warn] 	[FAILED     ] xalan#serializer;2.7.2!serializer.jar: timeout (203314ms)
    [warn] 	Detected merged artifact: [FAILED     ] xalan#serializer;2.7.2!serializer.jar: timeout (203314ms).
    [warn] ==== public: tried
    [info] 	[SUCCESSFUL ] org.jodd#jodd-core;3.8.6!jodd-core.jar (337759ms)
    [info] 	[SUCCESSFUL ] org.apache.commons#commons-compress;1.9!commons-compress.jar (545495ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-omnidoc_2.12/2.6.15/play-omnidoc_2.12-2.6.15.jar ...
    [info] 	[SUCCESSFUL ] io.netty#netty-transport-native-epoll;4.0.56.Final!netty-transport-native-epoll.jar (415515ms)
    [info] 	[SUCCESSFUL ] com.typesafe.play#shaded-asynchttpclient;1.1.0!shaded-asynchttpclient.jar (532915ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/shaded-oauth/1.1.0/shaded-oauth-1.1.0.jar ...
    [info] 	[SUCCESSFUL ] org.asynchttpclient#netty-resolver-dns;2.0.39!netty-resolver-dns.jar (125268ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/netty/netty-reactive-streams/1.0.8/netty-reactive-streams-1.0.8.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-guice_2.12;2.6.15!play-guice_2.12.jar (121911ms)
    [info] downloading https://repo1.maven.org/maven2/org/joda/joda-convert/1.9.2/joda-convert-1.9.2.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.akka#akka-actor_2.12;2.5.11!akka-actor_2.12.jar (719101ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/akka/akka-slf4j_2.12/2.5.11/akka-slf4j_2.12-2.5.11.jar ...
    [info] 	[SUCCESSFUL ] com.google.inject.extensions#guice-multibindings;4.1.0!guice-multibindings.jar (113642ms)
    [info] downloading https://repo1.maven.org/maven2/com/google/code/findbugs/jsr305/3.0.1/jsr305-3.0.1.jar ...
    [info] 	[SUCCESSFUL ] io.suzaku#boopickle_2.12;1.2.6!boopickle_2.12.jar (629742ms)
    [info] 	[SUCCESSFUL ] net.codingwell#scala-guice_2.12;4.1.1!scala-guice_2.12.jar (222405ms)
    [info] 	[SUCCESSFUL ] com.google.code.findbugs#jsr305;3.0.1!jsr305.jar (38248ms)
    [info] 	[SUCCESSFUL ] com.google.code.findbugs#jsr305;3.0.2!jsr305.jar (261592ms)
    [info] downloading https://repo1.maven.org/maven2/org/fluentlenium/fluentlenium-core/3.3.0/fluentlenium-core-3.3.0.jar ...
    [info] 	[SUCCESSFUL ] com.geirsson#scalafmt-core_2.11;0.6.8!scalafmt-core_2.11.jar (801567ms)
    [info] downloading https://repo1.maven.org/maven2/com/lucidchart/scalafmt-impl_2.11/1.12-0.6/scalafmt-impl_2.11-1.12-0.6.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.akka#akka-slf4j_2.12;2.5.11!akka-slf4j_2.12.jar (52966ms)
    [info] downloading https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.8.11/jackson-core-2.8.11.jar ...
    [info] 	[SUCCESSFUL ] org.eclipse.jetty.websocket#websocket-common;9.4.5.v20170502!websocket-common.jar (336817ms)
    [info] downloading https://repo1.maven.org/maven2/org/eclipse/jetty/jetty-http/9.4.5.v20170502/jetty-http-9.4.5.v20170502.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.akka#akka-protobuf_2.12;2.5.11!akka-protobuf_2.12.jar (154244ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/config/1.3.2/config-1.3.2.jar ...
    [info] 	[SUCCESSFUL ] org.scalameta#inputs_2.11;1.6.0!inputs_2.11.jar (157198ms)
    [info] downloading https://repo1.maven.org/maven2/org/scalameta/tokens_2.11/1.6.0/tokens_2.11-1.6.0.jar ...
    [info] 	[SUCCESSFUL ] com.google.guava#guava;23.0!guava.jar (445845ms)
    [info] downloading https://repo1.maven.org/maven2/org/scalatest/scalatest_2.12/3.0.4/scalatest_2.12-3.0.4.jar ...
    [info] 	[SUCCESSFUL ] org.scala-lang#scala-library;2.12.1!scala-library.jar (820106ms)
    [info] 	[SUCCESSFUL ] com.google.inject#guice;4.1.0!guice.jar (224474ms)
    [info] 	[SUCCESSFUL ] com.lucidchart#scalafmt-impl_2.11;1.12-0.6!scalafmt-impl_2.11.jar (24407ms)
    [info] downloading https://repo1.maven.org/maven2/org/scala-lang/scala-library/2.11.8/scala-library-2.11.8.jar ...
    [info] 	[SUCCESSFUL ] org.joda#joda-convert;1.9.2!joda-convert.jar (89141ms)
    [info] 	[SUCCESSFUL ] org.scalameta#parsers_2.11;1.6.0!parsers_2.11.jar (259175ms)
    [info] downloading https://repo1.maven.org/maven2/org/scalameta/quasiquotes_2.11/1.6.0/quasiquotes_2.11-1.6.0.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.netty#netty-reactive-streams;1.0.8!netty-reactive-streams.jar (98205ms)
    [info] 	[SUCCESSFUL ] org.bouncycastle#bcprov-jdk15on;1.58!bcprov-jdk15on.jar (626790ms)
    [info] 	[SUCCESSFUL ] io.gatling#gatling-core;2.3.1!gatling-core.jar (617928ms)
    [info] downloading https://repo1.maven.org/maven2/com/tdunning/t-digest/3.1/t-digest-3.1.jar ...
    [info] 	[SUCCESSFUL ] org.seleniumhq.selenium#selenium-firefox-driver;3.5.3!selenium-firefox-driver.jar (452765ms)
    [info] 	[SUCCESSFUL ] com.typesafe#config;1.3.2!config.jar(bundle) (58496ms)
    [info] 	[SUCCESSFUL ] net.sourceforge.htmlunit#htmlunit-core-js;2.27!htmlunit-core-js.jar (223881ms)
    [info] 	[SUCCESSFUL ] org.eclipse.jetty#jetty-util;9.4.5.v20170502!jetty-util.jar (213075ms)
    [info] 	[SUCCESSFUL ] io.gatling#gatling-jms;2.3.1!gatling-jms.jar (519166ms)
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-jdbc/2.3.1/gatling-jdbc-2.3.1.jar ...
    [warn] 	[FAILED     ] net.sourceforge.htmlunit#htmlunit;2.27!htmlunit.jar: timeout (520648ms)
    [warn] 	Detected merged artifact: [FAILED     ] net.sourceforge.htmlunit#htmlunit;2.27!htmlunit.jar: timeout (520648ms).
    [warn] ==== public: tried
    [info] 	[SUCCESSFUL ] com.fasterxml.jackson.core#jackson-databind;2.9.0!jackson-databind.jar(bundle) (232988ms)
    [info] 	[SUCCESSFUL ] com.typesafe#config;1.2.1!config.jar(bundle) (484573ms)
    [info] downloading https://repo1.maven.org/maven2/org/scalameta/testkit_2.11/1.6.0/testkit_2.11-1.6.0.jar ...
    [info] 	[SUCCESSFUL ] com.tdunning#t-digest;3.1!t-digest.jar (61910ms)
    [info] downloading https://repo1.maven.org/maven2/io/gatling/gatling-commons/2.3.1/gatling-commons-2.3.1.jar ...
    [info] 	[SUCCESSFUL ] org.scalameta#tokens_2.11;1.6.0!tokens_2.11.jar (119767ms)
    [info] 	[SUCCESSFUL ] io.gatling#gatling-jdbc;2.3.1!gatling-jdbc.jar (57397ms)
    [info] 	[SUCCESSFUL ] org.fluentlenium#fluentlenium-core;3.3.0!fluentlenium-core.jar (151992ms)
    [info] 	[SUCCESSFUL ] org.scalameta#quasiquotes_2.11;1.6.0!quasiquotes_2.11.jar (124300ms)
    [info] 	[SUCCESSFUL ] com.typesafe.akka#akka-http-core_2.12;10.0.13!akka-http-core_2.12.jar (380914ms)
    [warn] 	[FAILED     ] com.typesafe.play#shaded-oauth;1.1.0!shaded-oauth.jar: timeout (234449ms)
    [warn] 	Detected merged artifact: [FAILED     ] com.typesafe.play#shaded-oauth;1.1.0!shaded-oauth.jar: timeout (234449ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/javax/cache/cache-api/1.0.0/cache-api-1.0.0.jar ...
    [info] 	[SUCCESSFUL ] org.eclipse.jetty#jetty-http;9.4.5.v20170502!jetty-http.jar (163466ms)
    [info] downloading https://repo1.maven.org/maven2/org/eclipse/jetty/websocket/websocket-api/9.4.5.v20170502/websocket-api-9.4.5.v20170502.jar ...
    [info] 	[SUCCESSFUL ] com.fasterxml.jackson.core#jackson-databind;2.8.11.1!jackson-databind.jar(bundle) (521702ms)
    [info] 	[SUCCESSFUL ] org.scalameta#trees_2.11;1.6.0!trees_2.11.jar (342874ms)
    [info] downloading https://repo1.maven.org/maven2/org/scalameta/inline_2.11/1.6.0/inline_2.11-1.6.0.jar ...
    [info] 	[SUCCESSFUL ] org.apache.httpcomponents#httpcore;4.4.6!httpcore.jar (343013ms)
    [info] 	[SUCCESSFUL ] com.fasterxml.jackson.core#jackson-core;2.8.11!jackson-core.jar(bundle) (180695ms)
    [info] 	[SUCCESSFUL ] javax.cache#cache-api;1.0.0!cache-api.jar (20957ms)
    [info] 	[SUCCESSFUL ] org.scalameta#inline_2.11;1.6.0!inline_2.11.jar (16424ms)
    [info] 	[SUCCESSFUL ] org.eclipse.jetty.websocket#websocket-api;9.4.5.v20170502!websocket-api.jar (42460ms)
    [info] 	[SUCCESSFUL ] org.scalameta#testkit_2.11;1.6.0!testkit_2.11.jar (106211ms)
    [info] 	[SUCCESSFUL ] io.gatling#gatling-commons;2.3.1!gatling-commons.jar (94425ms)
    [warn] 	[FAILED     ] net.sf.saxon#Saxon-HE;9.8.0-4!Saxon-HE.jar: timeout (870887ms)
    [warn] 	Detected merged artifact: [FAILED     ] net.sf.saxon#Saxon-HE;9.8.0-4!Saxon-HE.jar: timeout (870887ms).
    [warn] ==== public: tried
    [info] downloading https://repo1.maven.org/maven2/org/jodd/jodd-lagarto/3.8.6/jodd-lagarto-3.8.6.jar ...
    [info] 	[SUCCESSFUL ] com.google.guava#guava;22.0!guava.jar(bundle) (500252ms)
    [info] downloading https://repo1.maven.org/maven2/io/jsonwebtoken/jjwt/0.7.0/jjwt-0.7.0.jar ...
    [info] 	[SUCCESSFUL ] org.jodd#jodd-lagarto;3.8.6!jodd-lagarto.jar (37501ms)
    [info] 	[SUCCESSFUL ] io.jsonwebtoken#jjwt;0.7.0!jjwt.jar (34976ms)
    [info] 	[SUCCESSFUL ] org.scala-lang#scala-library;2.11.8!scala-library.jar (298348ms)
    [info] 	[SUCCESSFUL ] org.scalatest#scalatest_2.12;3.0.4!scalatest_2.12.jar(bundle) (380412ms)
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-omnidoc_2.12;2.6.15!play-omnidoc_2.12.jar (584829ms)
    [info] downloading https://repo1.maven.org/maven2/com/typesafe/play/play-docs_2.12/2.6.15/play-docs_2.12-2.6.15.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-docs_2.12;2.6.15!play-docs_2.12.jar (119289ms)
    [warn] 	::::::::::::::::::::::::::::::::::::::::::::::
    [warn] 	::              FAILED DOWNLOADS            ::
    [warn] 	:: ^ see resolution messages for details  ^ ::
    [warn] 	::::::::::::::::::::::::::::::::::::::::::::::
    [warn] 	:: com.typesafe.play#play-streams_2.12;2.6.15!play-streams_2.12.jar
    [warn] 	:: com.fasterxml.jackson.datatype#jackson-datatype-jsr310;2.8.11!jackson-datatype-jsr310.jar(bundle)
    [warn] 	:: com.typesafe.play#play-json_2.12;2.6.9!play-json_2.12.jar
    [warn] 	:: com.typesafe.play#play-functional_2.12;2.6.9!play-functional_2.12.jar
    [warn] 	:: joda-time#joda-time;2.9.9!joda-time.jar
    [warn] 	:: org.apache.commons#commons-lang3;3.6!commons-lang3.jar
    [warn] 	:: ch.qos.logback#logback-classic;1.2.3!logback-classic.jar
    [warn] 	:: org.parboiled#parboiled_2.12;2.1.3!parboiled_2.12.jar
    [warn] 	:: com.google.code.gson#gson;2.8.0!gson.jar
    [warn] 	:: net.java.dev.jna#jna-platform;4.1.0!jna-platform.jar
    [warn] 	:: net.sourceforge.htmlunit#htmlunit;2.27!htmlunit.jar
    [warn] 	:: xalan#serializer;2.7.2!serializer.jar
    [warn] 	:: org.eclipse.jetty.websocket#websocket-client;9.4.5.v20170502!websocket-client.jar
    [warn] 	:: org.seleniumhq.selenium#selenium-support;3.5.3!selenium-support.jar
    [warn] 	:: javax.servlet#javax.servlet-api;3.1.0!javax.servlet-api.jar
    [warn] 	:: com.typesafe.play#play-ws-standalone_2.12;1.1.0!play-ws-standalone_2.12.jar
    [warn] 	:: com.typesafe.play#play-ws-standalone-json_2.12;1.1.0!play-ws-standalone-json_2.12.jar
    [warn] 	:: com.typesafe.play#cachecontrol_2.12;1.1.2!cachecontrol_2.12.jar
    [warn] 	:: com.typesafe.play#shaded-oauth;1.1.0!shaded-oauth.jar
    [warn] 	:: com.dongxiguo#fastring_2.12;0.3.1!fastring_2.12.jar
    [warn] 	:: org.asynchttpclient#async-http-client-netty-utils;2.0.39!async-http-client-netty-utils.jar
    [warn] 	:: com.github.ben-manes.caffeine#caffeine;2.5.5!caffeine.jar
    [warn] 	:: com.github.scopt#scopt_2.12;3.7.0!scopt_2.12.jar
    [warn] 	:: io.advantageous.boon#boon-json;0.6.6!boon-json.jar
    [warn] 	:: net.sf.saxon#Saxon-HE;9.8.0-4!Saxon-HE.jar
    [warn] 	:: io.gatling#gatling-http;2.3.1!gatling-http.jar
    [warn] 	:: io.gatling#gatling-metrics;2.3.1!gatling-metrics.jar
    [warn] 	:: io.gatling#gatling-test-framework;2.3.1!gatling-test-framework.jar
    [warn] 	:: com.lihaoyi#sourcecode_2.11;0.1.3!sourcecode_2.11.jar
    [warn] 	:: org.scalameta#transversers_2.11;1.6.0!transversers_2.11.jar
    [warn] 	:: org.rauschig#jarchivelib;0.7.1!jarchivelib.jar(bundle)
    [warn] 	::::::::::::::::::::::::::::::::::::::::::::::
    [error] sbt.librarymanagement.ResolveException: download failed: com.typesafe.play#play-streams_2.12;2.6.15!play-streams_2.12.jar
    [error] download failed: com.fasterxml.jackson.datatype#jackson-datatype-jsr310;2.8.11!jackson-datatype-jsr310.jar(bundle)
    [error] download failed: com.typesafe.play#play-json_2.12;2.6.9!play-json_2.12.jar
    [error] download failed: com.typesafe.play#play-functional_2.12;2.6.9!play-functional_2.12.jar
    [error] download failed: joda-time#joda-time;2.9.9!joda-time.jar
    [error] download failed: org.apache.commons#commons-lang3;3.6!commons-lang3.jar
    [error] download failed: ch.qos.logback#logback-classic;1.2.3!logback-classic.jar
    [error] download failed: org.parboiled#parboiled_2.12;2.1.3!parboiled_2.12.jar
    [error] download failed: com.google.code.gson#gson;2.8.0!gson.jar
    [error] download failed: net.java.dev.jna#jna-platform;4.1.0!jna-platform.jar
    [error] download failed: net.sourceforge.htmlunit#htmlunit;2.27!htmlunit.jar
    [error] download failed: xalan#serializer;2.7.2!serializer.jar
    [error] download failed: org.eclipse.jetty.websocket#websocket-client;9.4.5.v20170502!websocket-client.jar
    [error] download failed: org.seleniumhq.selenium#selenium-support;3.5.3!selenium-support.jar
    [error] download failed: javax.servlet#javax.servlet-api;3.1.0!javax.servlet-api.jar
    [error] download failed: com.typesafe.play#play-ws-standalone_2.12;1.1.0!play-ws-standalone_2.12.jar
    [error] download failed: com.typesafe.play#play-ws-standalone-json_2.12;1.1.0!play-ws-standalone-json_2.12.jar
    [error] download failed: com.typesafe.play#cachecontrol_2.12;1.1.2!cachecontrol_2.12.jar
    [error] download failed: com.typesafe.play#shaded-oauth;1.1.0!shaded-oauth.jar
    [error] download failed: com.dongxiguo#fastring_2.12;0.3.1!fastring_2.12.jar
    [error] download failed: org.asynchttpclient#async-http-client-netty-utils;2.0.39!async-http-client-netty-utils.jar
    [error] download failed: com.github.ben-manes.caffeine#caffeine;2.5.5!caffeine.jar
    [error] download failed: com.github.scopt#scopt_2.12;3.7.0!scopt_2.12.jar
    [error] download failed: io.advantageous.boon#boon-json;0.6.6!boon-json.jar
    [error] download failed: net.sf.saxon#Saxon-HE;9.8.0-4!Saxon-HE.jar
    [error] download failed: io.gatling#gatling-http;2.3.1!gatling-http.jar
    [error] download failed: io.gatling#gatling-metrics;2.3.1!gatling-metrics.jar
    [error] download failed: io.gatling#gatling-test-framework;2.3.1!gatling-test-framework.jar
    [error] download failed: com.lihaoyi#sourcecode_2.11;0.1.3!sourcecode_2.11.jar
    [error] download failed: org.scalameta#transversers_2.11;1.6.0!transversers_2.11.jar
    [error] download failed: org.rauschig#jarchivelib;0.7.1!jarchivelib.jar(bundle)
    [error] 	at sbt.internal.librarymanagement.IvyActions$.resolveAndRetrieve(IvyActions.scala:334)
    [error] 	at sbt.internal.librarymanagement.IvyActions$.$anonfun$updateEither$1(IvyActions.scala:208)
    [error] 	at sbt.internal.librarymanagement.IvySbt$Module.$anonfun$withModule$1(Ivy.scala:243)
    [error] 	at sbt.internal.librarymanagement.IvySbt.$anonfun$withIvy$1(Ivy.scala:204)
    [error] 	at sbt.internal.librarymanagement.IvySbt.sbt$internal$librarymanagement$IvySbt$$action$1(Ivy.scala:70)
    [error] 	at sbt.internal.librarymanagement.IvySbt$$anon$3.call(Ivy.scala:77)
    [error] 	at xsbt.boot.Locks$GlobalLock.withChannel$1(Locks.scala:95)
    [error] 	at xsbt.boot.Locks$GlobalLock.xsbt$boot$Locks$GlobalLock$$withChannelRetries$1(Locks.scala:80)
    [error] 	at xsbt.boot.Locks$GlobalLock$$anonfun$withFileLock$1.apply(Locks.scala:99)
    [error] 	at xsbt.boot.Using$.withResource(Using.scala:10)
    [error] 	at xsbt.boot.Using$.apply(Using.scala:9)
    [error] 	at xsbt.boot.Locks$GlobalLock.ignoringDeadlockAvoided(Locks.scala:60)
    [error] 	at xsbt.boot.Locks$GlobalLock.withLock(Locks.scala:50)
    [error] 	at xsbt.boot.Locks$.apply0(Locks.scala:31)
    [error] 	at xsbt.boot.Locks$.apply(Locks.scala:28)
    [error] 	at sbt.internal.librarymanagement.IvySbt.withDefaultLogger(Ivy.scala:77)
    [error] 	at sbt.internal.librarymanagement.IvySbt.withIvy(Ivy.scala:199)
    [error] 	at sbt.internal.librarymanagement.IvySbt.withIvy(Ivy.scala:196)
    [error] 	at sbt.internal.librarymanagement.IvySbt$Module.withModule(Ivy.scala:242)
    [error] 	at sbt.internal.librarymanagement.IvyActions$.updateEither(IvyActions.scala:193)
    [error] 	at sbt.librarymanagement.ivy.IvyDependencyResolution.update(IvyDependencyResolution.scala:20)
    [error] 	at sbt.librarymanagement.DependencyResolution.update(DependencyResolution.scala:56)
    [error] 	at sbt.internal.LibraryManagement$.resolve$1(LibraryManagement.scala:46)
    [error] 	at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$12(LibraryManagement.scala:99)
    [error] 	at sbt.util.Tracked$.$anonfun$lastOutput$1(Tracked.scala:68)
    [error] 	at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$19(LibraryManagement.scala:112)
    [error] 	at scala.util.control.Exception$Catch.apply(Exception.scala:224)
    [error] 	at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$11(LibraryManagement.scala:112)
    [error] 	at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$11$adapted(LibraryManagement.scala:95)
    [error] 	at sbt.util.Tracked$.$anonfun$inputChanged$1(Tracked.scala:149)
    [error] 	at sbt.internal.LibraryManagement$.cachedUpdate(LibraryManagement.scala:126)
    [error] 	at sbt.Classpaths$.$anonfun$updateTask$5(Defaults.scala:2386)
    [error] 	at scala.Function1.$anonfun$compose$1(Function1.scala:44)
    [error] 	at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:39)
    [error] 	at sbt.std.Transform$$anon$4.work(System.scala:66)
    [error] 	at sbt.Execute.$anonfun$submit$2(Execute.scala:262)
    [error] 	at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:16)
    [error] 	at sbt.Execute.work(Execute.scala:271)
    [error] 	at sbt.Execute.$anonfun$submit$1(Execute.scala:262)
    [error] 	at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:174)
    [error] 	at sbt.CompletionService$$anon$2.call(CompletionService.scala:36)
    [error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
    [error] 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
    [error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
    [error] 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
    [error] 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    [error] 	at java.lang.Thread.run(Thread.java:748)
    [INFO] [06/04/2018 17:13:33.870] [Thread-2] [CoordinatedShutdown(akka://sbt-web)] Starting coordinated shutdown from JVM shutdown hook
    [error] (update) sbt.librarymanagement.ResolveException: download failed: com.typesafe.play#play-streams_2.12;2.6.15!play-streams_2.12.jar
    [error] download failed: com.fasterxml.jackson.datatype#jackson-datatype-jsr310;2.8.11!jackson-datatype-jsr310.jar(bundle)
    [error] download failed: com.typesafe.play#play-json_2.12;2.6.9!play-json_2.12.jarlocalhost:play-scala-rest-api-example xubo$ 
    localhost:play-scala-rest-api-example xubo$ netstat -a |grep 9000
    localhost:play-scala-rest-api-example xubo$ ps -aux 
    ps: No user named 'x'
    localhost:play-scala-rest-api-example xubo$ ps -au
    ps: option requires an argument -- u
    usage: ps [-AaCcEefhjlMmrSTvwXx] [-O fmt | -o fmt] [-G gid[,gid...]]
              [-g grp[,grp...]] [-u [uid,uid...]]
              [-p pid[,pid...]] [-t tty[,tty...]] [-U user[,user...]]
           ps [-L]
    localhost:play-scala-rest-api-example xubo$ ps -a
      PID TTY           TIME CMD
      401 ttys000    0:00.04 login -pfl xubo /bin/bash -c exec -la bash /bin/bash
      402 ttys000    0:00.05 -bash
      414 ttys001    0:00.04 login -pfl xubo /bin/bash -c exec -la bash /bin/bash
      415 ttys001    0:01.95 -bash
    33920 ttys002    0:00.02 login -pfl xubo /bin/bash -c exec -la bash /bin/bash
    33921 ttys002    0:00.09 -bash
    47894 ttys002    0:00.05 ssh root@X
    28237 ttys003    0:00.02 /bin/bash --rcfile /Volumes/IntelliJ IDEA CE/IntelliJ IDEA CE.app/Contents/plugins/terminal/jediterm-bash.in --login -i
      432 ttys004    0:00.03 login -pfl xubo /bin/bash -c exec -la bash /bin/bash
      437 ttys004    0:01.92 -bash
    35161 ttys005    0:00.02 login -pfl xubo /bin/bash -c exec -la bash /bin/bash
    35162 ttys005    0:00.23 -bash
    48015 ttys005    0:00.00 ps -a
    46973 ttys006    0:00.02 login -pfl xubo /bin/bash -c exec -la bash /bin/bash
    46974 ttys006    0:00.07 -bash
    47725 ttys007    0:00.02 login -pfl xubo /bin/bash -c exec -la bash /bin/bash
    47726 ttys007    0:00.04 -bash
    47833 ttys007    0:00.02 bash /usr/local/Cellar/sbt/1.1.6/libexec/bin/sbt run
    47874 ttys007    2:02.88 /usr/bin/java -Xms1024m -Xmx1024m -XX:ReservedCodeCacheSize=128m -XX:MaxMetaspaceSize=256m -jar /usr/local/Cellar/sbt/1.1.6/libexec/bin/sbt-launch.jar run
    localhost:play-scala-rest-api-example xubo$ ps -a |grep 9000
    48017 ttys005    0:00.00 grep 9000
    localhost:play-scala-rest-api-example xubo$ netstat -a |grep -i 9000
    localhost:play-scala-rest-api-example xubo$ netstat -a
    Active Internet connections (including servers)
    Proto Recv-Q Send-Q  Local Address          Foreign Address        (state)    
    tcp4       0      0  xubodembp.64392        203.208.40.110.https   ESTABLISHED
    tcp4       0     31  xubodembp.64391        113.105.165.44.https   CLOSING    
    tcp4       0     31  xubodembp.64311        180.97.36.18.https     LAST_ACK   
    tcp4       0     31  xubodembp.64310        106.39.162.37.https    CLOSING    
    tcp4       0      0  xubodembp.64290        180.163.255.156.https  ESTABLISHED
    tcp4       0      0  xubodembp.64286        180.136.97.217.https   ESTABLISHED
    tcp4       0      0  xubodembp.64285        119.147.70.216.https   ESTABLISHED
    tcp4       0      0  xubodembp.64200        17.252.156.51.5223     ESTABLISHED
    tcp4       0      0  xubodembp.64197        101.227.162.139.https  ESTABLISHED
    tcp46      0      0  *.cslistener           *.*                    LISTEN     
    tcp4       0      0  xubodembp.64192        180.163.25.149.http    FIN_WAIT_2 
    tcp4       0     31  xubodembp.64140        115.239.210.141.https  LAST_ACK   
    tcp4       0     31  xubodembp.64139        115.239.210.141.https  LAST_ACK   
    tcp4       0     31  xubodembp.64138        115.239.210.141.https  LAST_ACK   
    tcp4       0      0  xubodembp.63713        ecs-139-159-237-.ssh   ESTABLISHED
    tcp4       0      0  localhost.49638        localhost.63466        ESTABLISHED
    tcp4       0      0  localhost.63466        localhost.49638        ESTABLISHED
    tcp4       0      0  localhost.59833        *.*                    LISTEN     
    tcp4       0      0  xubodembp.63361        104.16.173.166.https   ESTABLISHED
    tcp4       0      0  xubodembp.59769        112.65.69.50.https     ESTABLISHED
    tcp6       0      0  *.59387                *.*                    LISTEN     
    tcp4       0      0  *.59387                *.*                    LISTEN     
    tcp4       0      0  localhost.49638        localhost.56488        ESTABLISHED
    tcp4       0      0  localhost.56488        localhost.49638        ESTABLISHED
    tcp4       0      0  localhost.49638        *.*                    LISTEN     
    tcp4       0      0  *.49613                *.*                    LISTEN     
    tcp4       0      0  localhost.63342        *.*                    LISTEN     
    tcp4       0      0  localhost.6942         *.*                    LISTEN     
    tcp4       0      0  xubodembp.64574        ecs-43-254-0-8.c.https TIME_WAIT  
    tcp4       0      0  xubodembp.64570        ecs-43-254-0-18..https TIME_WAIT  
    tcp4       0      0  xubodembp.64568        ecs-43-254-0-18..https TIME_WAIT  
    tcp4       0      0  xubodembp.64572        ecs-43-254-0-16..https TIME_WAIT  
    tcp4       0      0  xubodembp.64571        ecs-43-254-0-18..https TIME_WAIT  
    tcp4       0      0  xubodembp.64567        ecs-43-254-0-18..https TIME_WAIT  
    tcp4       0      0  xubodembp.64569        ecs-43-254-0-18..https TIME_WAIT  
    tcp4       0      0  xubodembp.64566        ecs-43-254-0-18..https TIME_WAIT  
    tcp4       0      0  xubodembp.64393        ecs-43-254-0-69..https TIME_WAIT  
    udp6       0      0  *.52129                *.*                               
    udp4       0      0  *.52129                *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.54545                *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp46      0      0  *.*                    *.*                               
    udp6       0      0  *.mdns                 *.*                               
    udp4       0      0  *.mdns                 *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.*                    *.*                               
    udp4       0      0  *.netbios-dgm          *.*                               
    udp4       0      0  *.netbios-ns           *.*                               
    Active Multipath Internet connections
    Proto/ID  Flags      Local Address          Foreign Address        (state)    
    icm6       0      0  *.*                    *.*                               
    Active LOCAL (UNIX) domain sockets
    Address          Type   Recv-Q Send-Q            Inode             Conn             Refs          Nextref Addr
    9de888146c8424c3 stream      0      0                0 9de888146c84190b                0                0 /var/run/mDNSResponder
    9de888146c84190b stream      0      0                0 9de888146c8424c3                0                0
    9de888146ff389d3 stream      0      0                0 9de888146ff38073                0                0 /var/run/mDNSResponder
    9de888146ff38073 stream      0      0                0 9de888146ff389d3                0                0
    9de888146ff382cb stream      0      0                0 9de888146ff3926b                0                0 /var/run/mDNSResponder
    9de888146ff3926b stream      0      0                0 9de888146ff382cb                0                0
    9de888146ff37263 stream      0      0                0 9de888146ff37c8b                0                0 /var/run/mDNSResponder
    9de888146ff37c8b stream      0      0                0 9de888146ff37263                0                0
    9de888146ff386b3 stream      0      0                0                0                0                0
    9de888146ff397e3 stream      0      0                0 9de888146ff3796b                0                0 /var/run/mDNSResponder
    9de888146ff3796b stream      0      0                0 9de888146ff397e3                0                0
    9de888146ff39a3b stream      0      0                0                0                0                0
    9de888146ff39eeb stream      0      0                0                0                0                0
    9de888146ff37afb stream      0      0                0                0                0                0
    9de888146c8427e3 stream      0      0                0 9de888146c841393                0                0 /var/run/mDNSResponder
    9de888146c841393 stream      0      0                0 9de888146c8427e3                0                0
    9de888146c840263 stream      0      0                0                0                0                0
    9de888146ff3958b stream      0      0                0 9de888146ff3732b                0                0 /var/run/mDNSResponder
    9de888146ff3732b stream      0      0                0 9de888146ff3958b                0                0
    9de888146ff385eb stream      0      0                0                0                0                0
    9de888146ff38c2b stream      0      0                0                0                0                0
    9de888146ff3877b stream      0      0                0 9de888146ff37ee3                0                0 /var/run/mDNSResponder
    9de888146ff37ee3 stream      0      0                0 9de888146ff3877b                0                0
    9de888146c840ee3 stream      0      0                0 9de888146c840fab                0                0 /var/run/mDNSResponder
    9de888146c840fab stream      0      0                0 9de888146c840ee3                0                0
    9de888146c841c2b stream      0      0                0 9de88814684e1143                0                0 /var/run/mDNSResponder
    9de88814684e1143 stream      0      0                0 9de888146c841c2b                0                0
    9de88814684e107b stream      0      0                0 9de88814684de263                0                0 /var/run/mDNSResponder
    9de88814684de263 stream      0      0                0 9de88814684e107b                0                0
    9de88814684e0fb3 stream      0      0                0 9de88814684de32b                0                0 /var/run/mDNSResponder
    9de88814684de32b stream      0      0                0 9de88814684e0fb3                0                0
    9de88814684de3f3 stream      0      0                0 9de88814684de4bb                0                0 /var/run/mDNSResponder
    9de88814684de4bb stream      0      0                0 9de88814684de3f3                0                0
    9de88814684e0eeb stream      0      0                0 9de88814684de583                0                0 /var/run/mDNSResponder
    9de88814684de583 stream      0      0                0 9de88814684e0eeb                0                0
    9de88814684de64b stream      0      0                0 9de88814684de7db                0                0 /var/run/mDNSResponder
    9de88814684de713 stream      0      0                0 9de88814684de8a3                0                0 /var/run/mDNSResponder
    9de88814684e0e23 stream      0      0                0 9de88814684e0c93                0                0 /var/run/mDNSResponder
    9de88814684e0d5b stream      0      0                0 9de88814684e0bcb                0                0 /var/run/mDNSResponder
    9de88814684de7db stream      0      0                0 9de88814684de64b                0                0
    9de88814684de8a3 stream      0      0                0 9de88814684de713                0                0
    9de88814684e0c93 stream      0      0                0 9de88814684e0e23                0                0
    9de88814684e0bcb stream      0      0                0 9de88814684e0d5b                0                0
    9de88814684e0b03 stream      0      0                0 9de88814684de96b                0                0 /var/run/mDNSResponder
    9de88814684de96b stream      0      0                0 9de88814684e0b03                0                0
    9de88814684dea33 stream      0      0                0 9de88814684e0a3b                0                0 /var/run/usbmuxd
    9de88814684e0a3b stream      0      0                0 9de88814684dea33                0                0
    9de88814684debc3 stream      0      0                0 9de88814684e0973                0                0 /var/run/usbmuxd
    9de88814684e0973 stream      0      0                0 9de88814684debc3                0                0
    9de88814684dee1b stream      0      0                0 9de88814684e0653                0                0 /var/run/mDNSResponder
    9de88814684e0653 stream      0      0                0 9de88814684dee1b                0                0
    9de88814684deee3 stream      0      0                0 9de88814684e058b                0                0 /var/run/mDNSResponder
    9de88814684e058b stream      0      0                0 9de88814684deee3                0                0
    9de88814684defab stream      0      0                0 9de88814684df073                0                0 /var/run/mDNSResponder
    9de88814684df073 stream      0      0                0 9de88814684defab                0                0
    9de88814684df13b stream      0      0                0 9de88814684e04c3                0                0 /var/run/mDNSResponder
    9de88814684e04c3 stream      0      0                0 9de88814684df13b                0                0
    9de88814684df393 stream      0      0                0 9de88814684e0013                0                0 /var/run/mDNSResponder
    9de88814684e0013 stream      0      0                0 9de88814684df393                0                0
    9de88814684df523 stream      0      0                0 9de88814684dfdbb                0                0 /var/run/mDNSResponder
    9de88814684dfdbb stream      0      0                0 9de88814684df523                0                0
    9de88814684df77b stream      0      0                0 9de88814684dfa9b                0                0 /var/run/mDNSResponder
    9de88814684dfa9b stream      0      0                0 9de88814684df77b                0                0
    9de88814684df9d3 stream      0      0                0 9de8881463d9b263                0                0
    9de8881463d9b263 stream      0      0                0 9de88814684df9d3                0                0
    9de8881463d9e143 stream      0      0                0 9de8881463d9dd5b                0                0
    9de8881463d9dd5b stream      0      0                0 9de8881463d9e143                0                0
    9de8881463d9de23 stream      0      0                0 9de8881463d9dfb3                0                0
    9de8881463d9dfb3 stream      0      0                0 9de8881463d9de23                0                0
    9de8881463d9e07b stream      0      0                0 9de8881463d9b32b                0                0
    9de8881463d9b32b stream      0      0                0 9de8881463d9e07b                0                0
    9de8881463d9b4bb stream      0      0                0 9de8881463d9b583                0                0 /var/run/mDNSResponder
    9de8881463d9b583 stream      0      0                0 9de8881463d9b4bb                0                0
    9de8881463d9d3fb stream      0      0 9de888146815c8ab                0                0                0 /private/tmp/com.apple.launchd.fJeX7lAJOH/org.macosforge.xquartz:0
    9de8881463d9b8a3 stream      0      0 9de888146814954b                0                0                0 /var/tmp/filesystemui.socket
    9de8881463d9bbc3 stream      0      0 9de888146814ae7b                0                0                0 /private/tmp/com.apple.launchd.TrEbpFz1yb/Render
    9de8881463d9da3b stream      0      0 9de8881468149643                0                0                0 /private/tmp/com.apple.launchd.1EVgDg21RD/Listeners
    9de8881463d9be1b stream      0      0                0 9de8881463d9d8ab                0                0
    9de8881463d9d8ab stream      0      0                0 9de8881463d9be1b                0                0
    9de8881463d9bafb stream      0      0 9de88814656ca4cb                0                0                0 /var/run/displaypolicyd/state
    9de8881463d9d013 stream      0      0 9de8881464cd3d83                0                0                0 /var/run/pppconfd
    9de8881463d9ce83 stream      0      0 9de888146400bff3                0                0                0 /var/rpc/ncalrpc/srvsvc
    9de8881463d9c203 stream      0      0 9de888146400befb                0                0                0 /var/rpc/ncacn_np/srvsvc
    9de8881463d9cdbb stream      0      0 9de888146400cd83                0                0                0 /var/run/usbmuxd
    9de8881463d9ccf3 stream      0      0 9de888146400b453                0                0                0 /var/rpc/ncalrpc/wkssvc
    9de8881463d9c2cb stream      0      0 9de888146400d163                0                0                0 /var/rpc/ncacn_np/wkssvc
    9de8881463d9c393 stream      0      0 9de88814640191e3                0                0                0 /var/rpc/ncacn_np/mdssvc
    9de8881463d9c45b stream      0      0 9de88814640193d3                0                0                0 /var/rpc/ncalrpc/lsarpc
    9de8881463d9cc2b stream      0      0 9de8881464019a9b                0                0                0 /var/rpc/ncacn_np/lsarpc
    9de8881463d9cb63 stream      0      0 9de8881464035f73                0                0                0 /var/run/mDNSResponder
    9de8881463d9c523 stream      0      0 9de88814640432db                0                0                0 /var/run/systemkeychaincheck.socket
    9de8881463d9ca9b stream      0      0 9de8881464043f73                0                0                0 /private/var/run/.sim_diagnosticd_socket
    9de8881463d9c9d3 stream      0      0 9de888146404d3d3                0                0                0 /var/run/portmap.socket
    9de8881463d9c90b stream      0      0 9de888146404e06b                0                0                0 /var/run/vpncontrol.sock
    9de8881463d9c5eb stream      0      0 9de8881464061e7b                0                0                0 /var/rpc/ncalrpc/NETLOGON
    9de8881463d9c843 stream      0      0 9de888146407cc13                0                0                0 /private/var/run/cupsd
    9de888146c842c93 dgram       0      0                0 9de8881463d9c77b                0 9de888146ff3845b
    9de888146ff39e23 dgram       0      0                0 9de888146ff37583 9de888146ff37583                0
    9de888146ff37583 dgram       0      0                0 9de888146ff39e23 9de888146ff39e23                0
    9de888146ff3845b dgram       0      0                0 9de8881463d9c77b                0 9de888146ff38393
    9de888146ff39fb3 dgram       0      0                0 9de888146ff37a33 9de888146ff37a33                0
    9de888146ff37a33 dgram       0      0                0 9de888146ff39fb3 9de888146ff39fb3                0
    9de888146ff38393 dgram       0      0                0 9de8881463d9c77b                0 9de888146ff38cf3
    9de888146ff37713 dgram       0      0                0 9de888146ff37bc3 9de888146ff37bc3                0
    9de888146ff37bc3 dgram       0      0                0 9de888146ff37713 9de888146ff37713                0
    9de888146ff38cf3 dgram       0      0                0 9de8881463d9c77b                0 9de888146ff39bcb
    9de888146ff39bcb dgram       0      0                0 9de8881463d9c77b                0 9de888146ff38203
    9de888146ff38203 dgram       0      0                0 9de8881463d9c77b                0 9de888146ff3813b
    9de888146ff3813b dgram       0      0                0 9de8881463d9c77b                0 9de888146ff394c3
    9de888146ff39013 dgram       0      0                0 9de888146ff39973 9de888146ff39973                0
    9de888146ff39973 dgram       0      0                0 9de888146ff39013 9de888146ff39013                0
    9de888146ff394c3 dgram       0      0                0 9de8881463d9c77b                0 9de888146c840583
    9de888146c840583 dgram       0      0                0 9de8881463d9c77b                0 9de888146c842973
    9de888146c842973 dgram       0      0                0 9de8881463d9c77b                0 9de888146c842653
    9de888146c842653 dgram       0      0                0 9de8881463d9c77b                0 9de888146c842eeb
    9de888146c84113b dgram       0      0                0 9de888146c842bcb 9de888146c842bcb                0
    9de888146c842bcb dgram       0      0                0 9de888146c84113b 9de888146c84113b                0
    9de888146c842eeb dgram       0      0                0 9de8881463d9c77b                0 9de888146c842d5b
    9de888146c842b03 dgram       0      0                0 9de888146c84258b 9de888146c84258b                0
    9de888146c84258b dgram       0      0                0 9de888146c842b03 9de888146c842b03                0
    9de888146c842e23 dgram       0      0                0 9de888146c840bc3 9de888146c840bc3                0
    9de888146c840bc3 dgram       0      0                0 9de888146c842e23 9de888146c842e23                0
    9de888146c840afb dgram       0      0                0 9de888146c84096b 9de888146c84096b                0
    9de888146c84096b dgram       0      0                0 9de888146c840afb 9de888146c840afb                0
    9de888146c842d5b dgram       0      0                0 9de8881463d9c77b                0 9de888146c840d53
    9de888146c840d53 dgram       0      0                0 9de8881463d9c77b                0 9de888146c841dbb
    9de888146c841dbb dgram       0      0                0 9de8881463d9c77b                0 9de888146c841cf3
    9de888146c841cf3 dgram       0      0                0 9de8881463d9c77b                0 9de888146c841a9b
    9de888146c841a9b dgram       0      0                0 9de8881463d9c77b                0 9de88814684e07e3
    9de88814684e071b dgram       0      0                0 9de88814684deafb 9de88814684deafb                0
    9de88814684deafb dgram       0      0                0 9de88814684e071b 9de88814684e071b                0
    9de88814684e07e3 dgram       0      0                0 9de8881463d9c77b                0 9de88814684dec8b
    9de88814684dec8b dgram       0      0                0 9de8881463d9c77b                0 9de88814684e08ab
    9de88814684e08ab dgram       0      0                0 9de8881463d9c77b                0 9de88814684ded53
    9de88814684ded53 dgram       0      0                0 9de8881463d9c77b                0 9de88814684e0333
    9de88814684e0333 dgram       0      0                0 9de8881463d9c77b                0 9de88814684e03fb
    9de88814684e03fb dgram       0      0                0 9de8881463d9c77b                0 9de88814684dfb63
    9de88814684dfb63 dgram       0      0                0 9de8881463d9c77b                0 9de88814684dff4b
    9de88814684dff4b dgram       0      0                0 9de8881463d9c77b                0 9de88814684df6b3
    9de88814684df45b dgram       0      0                0 9de88814684dfe83 9de88814684dfe83                0
    9de88814684dfe83 dgram       0      0                0 9de88814684df45b 9de88814684df45b                0
    9de88814684df6b3 dgram       0      0                0 9de8881463d9c77b                0 9de8881463d9deeb
    9de8881463d9deeb dgram       0      0                0 9de8881463d9c77b                0 9de8881463d9b3f3
    9de8881463d9b3f3 dgram       0      0                0 9de8881463d9c77b                0 9de8881463d9db03
    9de8881463d9dc93 dgram       0      0                0 9de8881463d9b64b 9de8881463d9b64b                0
    9de8881463d9b64b dgram       0      0                0 9de8881463d9dc93 9de8881463d9dc93                0
    9de8881463d9db03 dgram       0      0                0 9de8881463d9c77b                0 9de8881463d9b96b
    9de8881463d9b96b dgram       0      0                0 9de8881463d9c77b                0 9de8881463d9ba33
    9de8881463d9ba33 dgram       0      0                0 9de8881463d9c77b                0 9de8881463d9b713
    9de8881463d9b713 dgram       0      0                0 9de8881463d9c77b                0 9de8881463d9dbcb
    9de8881463d9dbcb dgram       0      0                0 9de8881463d9c77b                0 9de8881463d9bd53
    9de8881463d9bd53 dgram       0      0                0 9de8881463d9c77b                0 9de8881463d9d71b
    9de8881463d9bc8b dgram       0      0                0 9de8881463d9d4c3 9de8881463d9d4c3                0
    9de8881463d9d4c3 dgram       0      0                0 9de8881463d9bc8b 9de8881463d9bc8b                0
    9de8881463d9d71b dgram       0      0                0 9de8881463d9c77b                0 9de8881463d9bee3
    9de8881463d9d7e3 dgram       0      0                0 9de8881463d9d973 9de8881463d9d973                0
    9de8881463d9d973 dgram       0      0                0 9de8881463d9d7e3 9de8881463d9d7e3                0
    9de8881463d9d653 dgram       0      0                0 9de8881463d9d58b 9de8881463d9d58b                0
    9de8881463d9d58b dgram       0      0                0 9de8881463d9d653 9de8881463d9d653                0
    9de8881463d9d333 dgram       0      0                0 9de8881463d9d26b 9de8881463d9d26b                0
    9de8881463d9d26b dgram       0      0                0 9de8881463d9d333 9de8881463d9d333                0
    9de8881463d9bee3 dgram       0      0                0 9de8881463d9c77b                0 9de8881463d9cf4b
    9de8881463d9d1a3 dgram       0      0                0 9de8881463d9d0db 9de8881463d9d0db                0
    9de8881463d9d0db dgram       0      0                0 9de8881463d9d1a3 9de8881463d9d1a3                0
    9de8881463d9cf4b dgram       0      0                0 9de8881463d9c77b                0 9de8881463d9bfab
    9de8881463d9bfab dgram       0      0                0 9de8881463d9c77b                0 9de8881463d9c6b3
    9de8881463d9c073 dgram       0      0                0 9de8881463d9c13b 9de8881463d9c13b                0
    9de8881463d9c13b dgram       0      0                0 9de8881463d9c073 9de8881463d9c073                0
    9de8881463d9c6b3 dgram       0      0                0 9de8881463d9c77b                0                0
    9de8881463d9c77b dgram       0      0 9de8881463d8cefb                0 9de888146c842c93                0 /private//var/run/syslog
    Registered kernel control modules
    id       flags    pcbcount rcvbuf   sndbuf   name 
           1        9        0   131072   131072 com.apple.flow-divert 
           2        1        0    16384     2048 com.apple.nke.sockwall 
           3        9        0   524288   524288 com.apple.content-filter 
           4        9        0     8192     2048 com.apple.packet-mangler 
           5        1        0    65536    65536 com.apple.net.necp_control 
           6        1       12    65536    65536 com.apple.net.netagent 
           7        9        1   524288   524288 com.apple.net.utun_control 
           8        1        0    65536    65536 com.apple.net.ipsec_control 
           9        0       26     8192     2048 com.apple.netsrc 
           a       18        4     8192     2048 com.apple.network.statistics 
           b        5        0     8192     2048 com.apple.network.tcp_ccdebug 
           c        1        0     8192     2048 com.apple.network.advisory 
           d        8        1     8192     2048 com.apple.userspace_ethernet 
    Active kernel event sockets
    Proto Recv-Q Send-Q vendor  class subcla
    kevt       0      0      1      6      1
    kevt       0      0      1      6      1
    kevt       0      0      1      1     11
    kevt       0      0      1      6      1
    kevt       0      0      1      6      1
    kevt       0      0      1      6      1
    kevt       0      0      1      6      1
    kevt       0      0      1      1      7
    kevt       0      0      1      1      1
    kevt       0      0      1      6      1
    kevt       0      0      1      6      1
    kevt       0      0      1      6      1
    kevt       0      0      1      6      1
    kevt       0      0      1      6      1
    kevt       0      0      1      6      1
    kevt       0      0      1      1      2
    kevt       0      0      1      1      2
    kevt       0      0      1      3      3
    kevt       0      0      1      6      1
    kevt       0      0      1      1      0
    Active kernel control sockets
    Proto Recv-Q Send-Q   unit     id name
    kctl       0      0      1      6 com.apple.net.netagent
    kctl       0      0      2      6 com.apple.net.netagent
    kctl       0      0      3      6 com.apple.net.netagent
    kctl       0      0      4      6 com.apple.net.netagent
    kctl       0      0      5      6 com.apple.net.netagent
    kctl       0      0      6      6 com.apple.net.netagent
    kctl       0      0      7      6 com.apple.net.netagent
    kctl       0      0      8      6 com.apple.net.netagent
    kctl       0      0      9      6 com.apple.net.netagent
    kctl       0      0     10      6 com.apple.net.netagent
    kctl       0      0     11      6 com.apple.net.netagent
    kctl       0      0     12      6 com.apple.net.netagent
    kctl       0      0      1      7 com.apple.net.utun_control
    kctl       0      0      1      9 com.apple.netsrc
    kctl       0      0      2      9 com.apple.netsrc
    kctl       0      0      3      9 com.apple.netsrc
    kctl       0      0      4      9 com.apple.netsrc
    kctl       0      0      5      9 com.apple.netsrc
    kctl       0      0      6      9 com.apple.netsrc
    kctl       0      0      7      9 com.apple.netsrc
    kctl       0      0      8      9 com.apple.netsrc
    kctl       0      0      9      9 com.apple.netsrc
    kctl       0      0     10      9 com.apple.netsrc
    kctl       0      0     11      9 com.apple.netsrc
    kctl       0      0     12      9 com.apple.netsrc
    kctl       0      0     13      9 com.apple.netsrc
    kctl       0      0     14      9 com.apple.netsrc
    kctl       0      0     15      9 com.apple.netsrc
    kctl       0      0     16      9 com.apple.netsrc
    kctl       0      0     17      9 com.apple.netsrc
    kctl       0      0     18      9 com.apple.netsrc
    kctl       0      0     19      9 com.apple.netsrc
    kctl       0      0     20      9 com.apple.netsrc
    kctl       0      0     21      9 com.apple.netsrc
    kctl       0      0     22      9 com.apple.netsrc
    kctl       0      0     23      9 com.apple.netsrc
    kctl       0      0     24      9 com.apple.netsrc
    kctl       0      0     25      9 com.apple.netsrc
    kctl       0      0     26      9 com.apple.netsrc
    kctl       0      0      1     10 com.apple.network.statistics
    kctl       0      0      2     10 com.apple.network.statistics
    kctl       0      0      3     10 com.apple.network.statistics
    kctl       0      0      4     10 com.apple.network.statistics
    kctl       0      0      1     13 com.apple.userspace_ethernet
    localhost:play-scala-rest-api-example xubo$ http --verbose http://localhost:9000/v1/posts
    -bash: http: command not found
    localhost:play-scala-rest-api-example xubo$ brew install http
    Updating Homebrew...
    ==> Auto-updated Homebrew!
    Updated 1 tap (homebrew/core).
    ==> Updated Formulae
    jenkins
    
    Error: No available formula with the name "http" 
    ==> Searching for a previously deleted formula (in the last month)...
    Warning: homebrew/core is shallow clone. To get complete history run:
      git -C "$(brew --repo homebrew/core)" fetch --unshallow
    
    Error: No previously deleted formula found.
    ==> Searching for similarly named formulae...
    ==> Searching local taps...
    These similarly named formulae were found:
    darkhttpd                    http_load                    httperf                      httping                      httptunnel                   libmicrohttpd                nghttp2
    http-parser                  httpd                        httpflow                     httpry                       libhttpserver                lighttpd                     slowhttptest
    http-server                  httpdiff                     httpie                       httpstat                     libhttpseverywhere           mighttpd2                    weighttp
    To install one of them, run (for example):
      brew install darkhttpd
    ==> Searching taps...
    ==> Searching taps on GitHub...
    Error: No formulae found in taps.
    localhost:play-scala-rest-api-example xubo$ brew install https
    Error: No available formula with the name "https" 
    ==> Searching for a previously deleted formula (in the last month)...
    Warning: homebrew/core is shallow clone. To get complete history run:
      git -C "$(brew --repo homebrew/core)" fetch --unshallow
    
    Error: No previously deleted formula found.
    ==> Searching for similarly named formulae...
    ==> Searching local taps...
    These similarly named formulae were found:
    httpstat                                                            libhttpserver                                                       libhttpseverywhere
    To install one of them, run (for example):
      brew install httpstat
    ==> Searching taps...
    ==> Searching taps on GitHub...
    ^[[A^[[AError: No formulae found in taps.
    localhost:play-scala-rest-api-example xubo$ brew install httpd
    ==> Installing dependencies for httpd: apr, apr-util, brotli, c-ares, libev, libevent, jansson, jemalloc, nghttp2, pcre
    ==> Installing httpd dependency: apr
    ==> Downloading https://homebrew.bintray.com/bottles/apr-1.6.3.high_sierra.bottle.tar.gz
    ######################################################################## 100.0%
    ==> Pouring apr-1.6.3.high_sierra.bottle.tar.gz
    ==> Caveats
    This formula is keg-only, which means it was not symlinked into /usr/local,
    because Apple's CLT package contains apr.
    
    If you need to have this software first in your PATH run:
      echo 'export PATH="/usr/local/opt/apr/bin:$PATH"' >> ~/.bash_profile
    
    ==> Summary
    🍺  /usr/local/Cellar/apr/1.6.3: 60 files, 1.3MB
    ==> Installing httpd dependency: apr-util
    ==> Downloading https://homebrew.bintray.com/bottles/apr-util-1.6.1_1.high_sierra.bottle.tar.gz
    ######################################################################## 100.0%
    ==> Pouring apr-util-1.6.1_1.high_sierra.bottle.tar.gz
    ==> Caveats
    This formula is keg-only, which means it was not symlinked into /usr/local,
    because Apple's CLT package contains apr.
    
    If you need to have this software first in your PATH run:
      echo 'export PATH="/usr/local/opt/apr-util/bin:$PATH"' >> ~/.bash_profile
    
    ==> Summary
    🍺  /usr/local/Cellar/apr-util/1.6.1_1: 54 files, 778.2KB
    ==> Installing httpd dependency: brotli
    ==> Downloading https://homebrew.bintray.com/bottles/brotli-1.0.4.high_sierra.bottle.tar.gz
    ######################################################################## 100.0%
    ==> Pouring brotli-1.0.4.high_sierra.bottle.tar.gz
    🍺  /usr/local/Cellar/brotli/1.0.4: 25 files, 2.1MB
    ==> Installing httpd dependency: c-ares
    ==> Downloading https://homebrew.bintray.com/bottles/c-ares-1.14.0.high_sierra.bottle.tar.gz
    ######################################################################## 100.0%
    ==> Pouring c-ares-1.14.0.high_sierra.bottle.tar.gz
    🍺  /usr/local/Cellar/c-ares/1.14.0: 70 files, 463.5KB
    ==> Installing httpd dependency: libev
    ==> Downloading https://homebrew.bintray.com/bottles/libev-4.24.high_sierra.bottle.tar.gz
    ######################################################################## 100.0%
    ==> Pouring libev-4.24.high_sierra.bottle.tar.gz
    🍺  /usr/local/Cellar/libev/4.24: 12 files, 432.8KB
    ==> Installing httpd dependency: libevent
    ==> Downloading https://homebrew.bintray.com/bottles/libevent-2.1.8.high_sierra.bottle.tar.gz
    ######################################################################## 100.0%
    ==> Pouring libevent-2.1.8.high_sierra.bottle.tar.gz
    🍺  /usr/local/Cellar/libevent/2.1.8: 847 files, 2.2MB
    ==> Installing httpd dependency: jansson
    ==> Downloading https://homebrew.bintray.com/bottles/jansson-2.11.high_sierra.bottle.tar.gz
    ######################################################################## 100.0%
    ==> Pouring jansson-2.11.high_sierra.bottle.tar.gz
    🍺  /usr/local/Cellar/jansson/2.11: 11 files, 155.7KB
    ==> Installing httpd dependency: jemalloc
    ==> Downloading https://homebrew.bintray.com/bottles/jemalloc-5.1.0.high_sierra.bottle.tar.gz
    ######################################################################## 100.0%
    ==> Pouring jemalloc-5.1.0.high_sierra.bottle.tar.gz
    🍺  /usr/local/Cellar/jemalloc/5.1.0: 16 files, 1.7MB
    ==> Installing httpd dependency: nghttp2
    ==> Downloading https://homebrew.bintray.com/bottles/nghttp2-1.32.0.high_sierra.bottle.tar.gz
    ######################################################################## 100.0%
    ==> Pouring nghttp2-1.32.0.high_sierra.bottle.tar.gz
    🍺  /usr/local/Cellar/nghttp2/1.32.0: 33 files, 6.3MB
    ==> Installing httpd dependency: pcre
    ==> Downloading https://homebrew.bintray.com/bottles/pcre-8.42.high_sierra.bottle.tar.gz
    ######################################################################## 100.0%
    ==> Pouring pcre-8.42.high_sierra.bottle.tar.gz
    🍺  /usr/local/Cellar/pcre/8.42: 204 files, 5.3MB
    ==> Installing httpd
    ==> Downloading https://homebrew.bintray.com/bottles/httpd-2.4.33.high_sierra.bottle.tar.gz
    ######################################################################## 100.0%
    ==> Pouring httpd-2.4.33.high_sierra.bottle.tar.gz
    ==> Caveats
    DocumentRoot is /usr/local/var/www.
    
    The default ports have been set in /usr/local/etc/httpd/httpd.conf to 8080 and in
    /usr/local/etc/httpd/extra/httpd-ssl.conf to 8443 so that httpd can run without sudo.
    
    To have launchd start httpd now and restart at login:
      brew services start httpd
    Or, if you don't want/need a background service you can just run:
      apachectl start
    ==> Summary
    🍺  /usr/local/Cellar/httpd/2.4.33: 1,633 files, 26.4MB
    localhost:play-scala-rest-api-example xubo$ 
    localhost:play-scala-rest-api-example xubo$ 
    localhost:play-scala-rest-api-example xubo$ http --verbose http://localhost:9000/v1/posts
    -bash: http: command not found
    localhost:play-scala-rest-api-example xubo$ htt
    httpd          httpd-wrapper  httpdstat.d    httxt2dbm      
    localhost:play-scala-rest-api-example xubo$ htt
    httpd          httpd-wrapper  httpdstat.d    httxt2dbm      
    localhost:play-scala-rest-api-example xubo$ httpd
    AH00558: httpd: Could not reliably determine the server's fully qualified domain name, using ::1. Set the 'ServerName' directive globally to suppress this message
    localhost:play-scala-rest-api-example xubo$ httpd --verbose http://localhost:9000/v1/posts
    Usage: httpd [-D name] [-d directory] [-f file]
                 [-C "directive"] [-c "directive"]
                 [-k start|restart|graceful|graceful-stop|stop]
                 [-v] [-V] [-h] [-l] [-L] [-t] [-T] [-S] [-X]
    Options:
      -D name            : define a name for use in <IfDefine name> directives
      -d directory       : specify an alternate initial ServerRoot
      -f file            : specify an alternate ServerConfigFile
      -C "directive"     : process directive before reading config files
      -c "directive"     : process directive after reading config files
      -e level           : show startup errors of level (see LogLevel)
      -E file            : log startup errors to file
      -v                 : show version number
      -V                 : show compile settings
      -h                 : list available command line options (this page)
      -l                 : list compiled in modules
      -L                 : list available configuration directives
      -t -D DUMP_VHOSTS  : show parsed vhost settings
      -t -D DUMP_RUN_CFG : show parsed run settings
      -S                 : a synonym for -t -D DUMP_VHOSTS -D DUMP_RUN_CFG
      -t -D DUMP_MODULES : show all loaded modules 
      -M                 : a synonym for -t -D DUMP_MODULES
      -t -D DUMP_INCLUDES: show all included configuration files
      -t                 : run syntax check for config files
      -T                 : start without DocumentRoot(s) check
      -X                 : debug mode (only one worker, do not detach)
    localhost:play-scala-rest-api-example xubo$ find ./  -name sbtconfig.txt
    localhost:play-scala-rest-api-example xubo$ find ./  -name sbt*
    .//project/target/scala-2.12/sbt-1.0
    .//project/target/scala-2.12/sbt-1.0/classes/sbt
    .//project/target/scala-2.12/sbt-1.0/classes/sbt/sbt.autoplugins
    .//project/target/scala-2.12/sbt-1.0/resolution-cache/default/play-scala-rest-api-example-build/scala_2.12/sbt_1.0
    .//project/target/scala-2.12/sbt-1.0/resource_managed/main/sbt
    .//project/target/scala-2.12/sbt-1.0/resource_managed/main/sbt/sbt.autoplugins
    .//.idea/sbt.xml
    localhost:play-scala-rest-api-example xubo$ sbt run
    [info] Loading settings from plugins.sbt ...
    [info] Loading project definition from /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/project
    [info] Loading settings from build.sbt ...
    [info] Loading settings from build.sbt ...
    [info] Set current project to play-scala-rest-api-example (in build file:/Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/)
    [info] Updating ...
    [info] downloading https://repo.huaweicloud.com/repository/maven/io/gatling/gatling-http/2.3.1/gatling-http-2.3.1.jar ...
    [info] downloading https://repo.huaweicloud.com/repository/maven/org/scalameta/transversers_2.11/1.6.0/transversers_2.11-1.6.0.jar ...
    [info] downloading https://repo.huaweicloud.com/repository/maven/com/typesafe/play/play-ws-standalone-json_2.12/1.1.0/play-ws-standalone-json_2.12-1.1.0.jar ...
    [info] downloading https://repo.huaweicloud.com/repository/maven/com/typesafe/play/cachecontrol_2.12/1.1.2/cachecontrol_2.12-1.1.2.jar ...
    [info] downloading https://repo.huaweicloud.com/repository/maven/com/typesafe/play/shaded-oauth/1.1.0/shaded-oauth-1.1.0.jar ...
    [info] downloading https://repo.huaweicloud.com/repository/maven/io/gatling/gatling-metrics/2.3.1/gatling-metrics-2.3.1.jar ...
    [info] downloading https://repo.huaweicloud.com/repository/maven/com/lihaoyi/sourcecode_2.11/0.1.3/sourcecode_2.11-0.1.3.jar ...
    [error] SERVER ERROR:  url=https://repo.huaweicloud.com/repository/ivy/javax.servlet/javax.servlet-api/3.1.0/jars/javax.servlet-api.jar
    [error] SERVER ERROR:  url=https://repo.huaweicloud.com/repository/ivy/org.rauschig/jarchivelib/0.7.1/bundles/jarchivelib.jar
    [error] SERVER ERROR:  url=https://repo.huaweicloud.com/repository/ivy/org.asynchttpclient/async-http-client-netty-utils/2.0.39/jars/async-http-client-netty-utils.jar
    [error] SERVER ERROR:  url=https://repo.huaweicloud.com/repository/ivy/org.parboiled/parboiled_2.12/2.1.3/jars/parboiled_2.12.jar
    [info] downloading https://repo.huaweicloud.com/repository/maven/io/gatling/gatling-test-framework/2.3.1/gatling-test-framework-2.3.1.jar ...
    [info] downloading https://repo.huaweicloud.com/repository/maven/javax/servlet/javax.servlet-api/3.1.0/javax.servlet-api-3.1.0.jar ...
    [info] downloading https://repo.huaweicloud.com/repository/maven/org/asynchttpclient/async-http-client-netty-utils/2.0.39/async-http-client-netty-utils-2.0.39.jar ...
    [info] downloading https://repo.huaweicloud.com/repository/maven/org/rauschig/jarchivelib/0.7.1/jarchivelib-0.7.1.jar ...
    [info] downloading https://repo.huaweicloud.com/repository/maven/org/parboiled/parboiled_2.12/2.1.3/parboiled_2.12-2.1.3.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-ws-standalone-json_2.12;1.1.0!play-ws-standalone-json_2.12.jar (22023ms)
    [info] 	[SUCCESSFUL ] org.scalameta#transversers_2.11;1.6.0!transversers_2.11.jar (30106ms)
    [info] 	[SUCCESSFUL ] io.gatling#gatling-test-framework;2.3.1!gatling-test-framework.jar (25220ms)
    [info] 	[SUCCESSFUL ] com.typesafe.play#cachecontrol_2.12;1.1.2!cachecontrol_2.12.jar (31142ms)
    [info] 	[SUCCESSFUL ] com.typesafe.play#shaded-oauth;1.1.0!shaded-oauth.jar (29738ms)
    [info] 	[SUCCESSFUL ] io.gatling#gatling-metrics;2.3.1!gatling-metrics.jar (29621ms)
    [info] 	[SUCCESSFUL ] org.asynchttpclient#async-http-client-netty-utils;2.0.39!async-http-client-netty-utils.jar (22978ms)
    [info] 	[SUCCESSFUL ] javax.servlet#javax.servlet-api;3.1.0!javax.servlet-api.jar (24778ms)
    [info] 	[SUCCESSFUL ] com.lihaoyi#sourcecode_2.11;0.1.3!sourcecode_2.11.jar (33762ms)
    [info] 	[SUCCESSFUL ] org.rauschig#jarchivelib;0.7.1!jarchivelib.jar(bundle) (26412ms)
    [info] 	[SUCCESSFUL ] io.gatling#gatling-http;2.3.1!gatling-http.jar (49512ms)
    [info] 	[SUCCESSFUL ] org.parboiled#parboiled_2.12;2.1.3!parboiled_2.12.jar (37289ms)
    [info] downloading https://repo.huaweicloud.com/repository/maven/com/typesafe/play/play-ws-standalone_2.12/1.1.0/play-ws-standalone_2.12-1.1.0.jar ...
    [info] 	[SUCCESSFUL ] com.typesafe.play#play-ws-standalone_2.12;1.1.0!play-ws-standalone_2.12.jar (4508ms)
    [info] Done updating.
    [warn] Found version conflict(s) in library dependencies; some are suspected to be binary incompatible:
    [warn] 	* com.google.code.findbugs:jsr305:3.0.1 is selected over 1.3.9
    [warn] 	    +- net.codingwell:scala-guice_2.12:4.1.1              (depends on 3.0.1)
    [warn] 	    +- com.google.guava:guava:22.0                        (depends on 1.3.9)
    [warn] 	* com.google.guava:guava:22.0 is selected over 19.0
    [warn] 	    +- com.typesafe.play:play_2.12:2.6.15 ()              (depends on 22.0)
    [warn] 	    +- net.codingwell:scala-guice_2.12:4.1.1              (depends on 19.0)
    [warn] 	    +- com.google.inject:guice:4.1.0                      (depends on 19.0)
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
    
    [error] a.i.TcpListener - Bind failed for TCP channel on endpoint [/0.0.0.0:9000]
    java.net.BindException: Address already in use
        at sun.nio.ch.Net.bind0(Native Method)
        at sun.nio.ch.Net.bind(Net.java:433)
        at sun.nio.ch.Net.bind(Net.java:425)
        at sun.nio.ch.ServerSocketChannelImpl.bind(ServerSocketChannelImpl.java:223)
        at sun.nio.ch.ServerSocketAdaptor.bind(ServerSocketAdaptor.java:74)
        at akka.io.TcpListener.liftedTree1$1(TcpListener.scala:56)
        at akka.io.TcpListener.<init>(TcpListener.scala:53)
        at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
        at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
        at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
    [error] akka.stream.impl.io.ConnectionSourceStage$$anon$2$$anon$1: Bind failed because of Address already in use
    [error] Caused by: java.net.BindException: Address already in use
    [error] 	at sun.nio.ch.Net.bind0(Native Method)
    [error] 	at sun.nio.ch.Net.bind(Net.java:433)
    [error] 	at sun.nio.ch.Net.bind(Net.java:425)
    [error] 	at sun.nio.ch.ServerSocketChannelImpl.bind(ServerSocketChannelImpl.java:223)
    [error] 	at sun.nio.ch.ServerSocketAdaptor.bind(ServerSocketAdaptor.java:74)
    [error] 	at akka.io.TcpListener.liftedTree1$1(TcpListener.scala:56)
    [error] 	at akka.io.TcpListener.<init>(TcpListener.scala:53)
    [error] 	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
    [error] 	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
    [error] 	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
    [error] 	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
    [error] 	at akka.util.Reflect$.instantiate(Reflect.scala:65)
    [error] 	at akka.actor.ArgsReflectConstructor.produce(IndirectActorProducer.scala:96)
    [error] 	at akka.actor.Props.newActor(Props.scala:213)
    [error] 	at akka.actor.ActorCell.newActor(ActorCell.scala:626)
    [error] 	at akka.actor.ActorCell.create(ActorCell.scala:652)
    [error] 	at akka.actor.ActorCell.invokeAll$1(ActorCell.scala:525)
    [error] 	at akka.actor.ActorCell.systemInvoke(ActorCell.scala:547)
    [error] 	at akka.dispatch.Mailbox.processAllSystemMessages(Mailbox.scala:282)
    [error] 	at akka.dispatch.Mailbox.run(Mailbox.scala:223)
    [error] 	at akka.dispatch.Mailbox.exec(Mailbox.scala:234)
    [error] 	at akka.dispatch.forkjoin.ForkJoinTask.doExec(ForkJoinTask.java:260)
    [error] 	at akka.dispatch.forkjoin.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1339)
    [error] 	at akka.dispatch.forkjoin.ForkJoinPool.runWorker(ForkJoinPool.java:1979)
    [error] 	at akka.dispatch.forkjoin.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:107)
    [error] (Compile / run) java.lang.reflect.InvocationTargetException
    [error] Total time: 83 s, completed 2018-6-5 8:50:45
    [INFO] [06/05/2018 08:50:45.356] [Thread-2] [CoordinatedShutdown(akka://sbt-web)] Starting coordinated shutdown from JVM shutdown hook
    localhost:play-scala-rest-api-example xubo$ ls
    LICENSE				build.gradle			docs				gradlew				project				target
    README.md			build.sbt			gatling				gradlew.bat			public				test
    app				conf				gradle				play-scala-rest-api-example.iml	scripts
    localhost:play-scala-rest-api-example xubo$ vi build.sbt 
    localhost:play-scala-rest-api-example xubo$ 
    localhost:play-scala-rest-api-example xubo$ vi build.gradle 
    localhost:play-scala-rest-api-example xubo$ 
    localhost:play-scala-rest-api-example xubo$ 
    localhost:play-scala-rest-api-example xubo$ 
    localhost:play-scala-rest-api-example xubo$ ls
    LICENSE				build.gradle			docs				gradlew				project				target
    README.md			build.sbt			gatling				gradlew.bat			public				test
    app				conf				gradle				play-scala-rest-api-example.iml	scripts
    localhost:play-scala-rest-api-example xubo$ pwd
    /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example
    localhost:play-scala-rest-api-example xubo$ sbt run
    [info] Loading settings from plugins.sbt ...
    [info] Loading project definition from /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/project
    [info] Loading settings from build.sbt ...
    [info] Loading settings from build.sbt ...
    [info] Set current project to play-scala-rest-api-example (in build file:/Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/)
    
    --- (Running the application, auto-reloading is enabled) ---
    
    [info] p.c.s.AkkaHttpServer - Listening for HTTP on /0:0:0:0:0:0:0:0:9000
    
    (Server started, use Enter to stop and go back to the console...)
    
    
    
    
    [info] Compiling 14 Scala sources and 1 Java source to /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/target/scala-2.12/classes ...
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/conf/routes: Unused import
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/conf/routes: Unused import
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/conf/routes: Unused import
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/views/index.scala.html:1:1: Unused import
    [warn] @()
    [warn] ^
    [warn] four warnings found
    [info] Done compiling.
    [info] p.a.h.EnabledFilters - Enabled Filters (see <https://www.playframework.com/documentation/latest/Filters>):
    
        play.filters.csrf.CSRFFilter
        play.filters.headers.SecurityHeadersFilter
        play.filters.hosts.AllowedHostsFilter
    
    [info] play.api.Play - Application started (Dev)
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostController - show: id = 1
    [trace] v.p.PostRepositoryImpl - get: id = 1
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostController - show: id = 1
    [trace] v.p.PostRepositoryImpl - get: id = 1
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostController - show: id = 2
    [trace] v.p.PostRepositoryImpl - get: id = 2
    
    
    
    
    
    
    
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostController - show: id = 3
    [trace] v.p.PostRepositoryImpl - get: id = 3
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostController - show: id = 4
    [trace] v.p.PostRepositoryImpl - get: id = 4
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostController - show: id = 5
    [trace] v.p.PostRepositoryImpl - get: id = 5
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostController - index: 
    [trace] v.p.PostRepositoryImpl - list: 
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostController - show: id = 6
    [trace] v.p.PostRepositoryImpl - get: id = 6
    
    
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostController - show: id = 8
    [trace] v.p.PostRepositoryImpl - get: id = 8
    [info] Compiling 1 Scala source to /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/target/scala-2.12/classes ...
    [info] Done compiling.
    
    --- (RELOAD) ---
    
    [info] p.a.h.EnabledFilters - Enabled Filters (see <https://www.playframework.com/documentation/latest/Filters>):
    
        play.filters.csrf.CSRFFilter
        play.filters.headers.SecurityHeadersFilter
        play.filters.hosts.AllowedHostsFilter
    
    [info] play.api.Play - Application started (Dev)
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostController - index: 
    [trace] v.p.PostController - show: id = 5
    [trace] v.p.PostRepositoryImpl - list: 
    [trace] v.p.PostRepositoryImpl - get: id = 5
    [info] Compiling 1 Scala source to /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/target/scala-2.12/classes ...
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:72: not found: type CustomExecutionContext
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                                        ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:51: not found: type ActorSystem
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                   ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:95: no arguments allowed for nullary constructor Object: ()Object
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                                                               ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:27:43: not found: type MarkerContext
    [error]   def create(data: PostData)(implicit mc: MarkerContext): Future[PostId]
    [error]                                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:29:27: not found: type MarkerContext
    [error]   def list()(implicit mc: MarkerContext): Future[Iterable[PostData]]
    [error]                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:31:36: not found: type MarkerContext
    [error]   def get(id: PostId)(implicit mc: MarkerContext): Future[Option[PostData]]
    [error]                                    ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:44:24: not found: value Logger
    [error]   private val logger = Logger(this.getClass)
    [error]                        ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:55:36: not found: type MarkerContext
    [error]   override def list()(implicit mc: MarkerContext): Future[Iterable[PostData]] = {
    [error]                                    ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:56:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:62:45: not found: type MarkerContext
    [error]   override def get(id: PostId)(implicit mc: MarkerContext): Future[Option[PostData]] = {
    [error]                                             ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:63:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:69:43: not found: type MarkerContext
    [error]   def create(data: PostData)(implicit mc: MarkerContext): Future[PostId] = {
    [error]                                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:70:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:44:15: private val logger in class PostRepositoryImpl is never used
    [warn]   private val logger = Logger(this.getClass)
    [warn]               ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:46:15: private val postList in class PostRepositoryImpl is never used
    [warn]   private val postList = List(
    [warn]               ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:42:47: parameter value ec in class PostRepositoryImpl is never used
    [warn] class PostRepositoryImpl @Inject()()(implicit ec: PostExecutionContext) extends PostRepository {
    [warn]                                               ^
    [warn] three warnings found
    [error] 13 errors found
    [error] (Compile / compileIncremental) Compilation failed
    [error] application - 
    
    ! @786ma2klb - Internal server error, for (GET) [/v1/posts/] ->
     
    play.sbt.PlayExceptions$CompilationException: Compilation error[not found: type CustomExecutionContext]
        at play.sbt.PlayExceptions$CompilationException$.apply(PlayExceptions.scala:34)
        at play.sbt.PlayExceptions$CompilationException$.apply(PlayExceptions.scala:34)
        at scala.Option.map(Option.scala:146)
        at play.sbt.run.PlayReload$.$anonfun$taskFailureHandler$1(PlayReload.scala:33)
        at scala.Option.map(Option.scala:146)
        at play.sbt.run.PlayReload$.taskFailureHandler(PlayReload.scala:28)
        at play.sbt.run.PlayReload$.compileFailure(PlayReload.scala:24)
        at play.sbt.run.PlayReload$.$anonfun$compile$3(PlayReload.scala:51)
        at scala.util.Either$LeftProjection.map(Either.scala:573)
        at play.sbt.run.PlayReload$.compile(PlayReload.scala:51)
    [info] Compiling 1 Scala source to /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/target/scala-2.12/classes ...
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:72: not found: type CustomExecutionContext
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                                        ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:51: not found: type ActorSystem
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                   ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:95: no arguments allowed for nullary constructor Object: ()Object
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                                                               ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:27:43: not found: type MarkerContext
    [error]   def create(data: PostData)(implicit mc: MarkerContext): Future[PostId]
    [error]                                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:29:27: not found: type MarkerContext
    [error]   def list()(implicit mc: MarkerContext): Future[Iterable[PostData]]
    [error]                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:31:36: not found: type MarkerContext
    [error]   def get(id: PostId)(implicit mc: MarkerContext): Future[Option[PostData]]
    [error]                                    ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:44:24: not found: value Logger
    [error]   private val logger = Logger(this.getClass)
    [error]                        ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:55:36: not found: type MarkerContext
    [error]   override def list()(implicit mc: MarkerContext): Future[Iterable[PostData]] = {
    [error]                                    ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:56:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:62:45: not found: type MarkerContext
    [error]   override def get(id: PostId)(implicit mc: MarkerContext): Future[Option[PostData]] = {
    [error]                                             ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:63:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:69:43: not found: type MarkerContext
    [error]   def create(data: PostData)(implicit mc: MarkerContext): Future[PostId] = {
    [error]                                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:70:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:44:15: private val logger in class PostRepositoryImpl is never used
    [warn]   private val logger = Logger(this.getClass)
    [warn]               ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:46:15: private val postList in class PostRepositoryImpl is never used
    [warn]   private val postList = List(
    [warn]               ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:42:47: parameter value ec in class PostRepositoryImpl is never used
    [warn] class PostRepositoryImpl @Inject()()(implicit ec: PostExecutionContext) extends PostRepository {
    [warn]                                               ^
    [warn] three warnings found
    [error] 13 errors found
    [error] (Compile / compileIncremental) Compilation failed
    [error] application - 
    
    ! @786ma2m1g - Internal server error, for (GET) [/v1/posts/0] ->
     
    play.sbt.PlayExceptions$CompilationException: Compilation error[not found: type CustomExecutionContext]
        at play.sbt.PlayExceptions$CompilationException$.apply(PlayExceptions.scala:34)
        at play.sbt.PlayExceptions$CompilationException$.apply(PlayExceptions.scala:34)
        at scala.Option.map(Option.scala:146)
        at play.sbt.run.PlayReload$.$anonfun$taskFailureHandler$1(PlayReload.scala:33)
        at scala.Option.map(Option.scala:146)
        at play.sbt.run.PlayReload$.taskFailureHandler(PlayReload.scala:28)
        at play.sbt.run.PlayReload$.compileFailure(PlayReload.scala:24)
        at play.sbt.run.PlayReload$.$anonfun$compile$3(PlayReload.scala:51)
        at scala.util.Either$LeftProjection.map(Either.scala:573)
        at play.sbt.run.PlayReload$.compile(PlayReload.scala:51)
    [info] Compiling 1 Scala source to /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/target/scala-2.12/classes ...
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:72: not found: type CustomExecutionContext
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                                        ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:51: not found: type ActorSystem
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                   ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:95: no arguments allowed for nullary constructor Object: ()Object
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                                                               ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:27:43: not found: type MarkerContext
    [error]   def create(data: PostData)(implicit mc: MarkerContext): Future[PostId]
    [error]                                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:29:27: not found: type MarkerContext
    [error]   def list()(implicit mc: MarkerContext): Future[Iterable[PostData]]
    [error]                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:31:36: not found: type MarkerContext
    [error]   def get(id: PostId)(implicit mc: MarkerContext): Future[Option[PostData]]
    [error]                                    ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:44:24: not found: value Logger
    [error]   private val logger = Logger(this.getClass)
    [error]                        ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:55:36: not found: type MarkerContext
    [error]   override def list()(implicit mc: MarkerContext): Future[Iterable[PostData]] = {
    [error]                                    ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:56:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:62:45: not found: type MarkerContext
    [error]   override def get(id: PostId)(implicit mc: MarkerContext): Future[Option[PostData]] = {
    [error]                                             ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:63:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:69:43: not found: type MarkerContext
    [error]   def create(data: PostData)(implicit mc: MarkerContext): Future[PostId] = {
    [error]                                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:70:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:44:15: private val logger in class PostRepositoryImpl is never used
    [warn]   private val logger = Logger(this.getClass)
    [warn]               ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:46:15: private val postList in class PostRepositoryImpl is never used
    [warn]   private val postList = List(
    [warn]               ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:42:47: parameter value ec in class PostRepositoryImpl is never used
    [warn] class PostRepositoryImpl @Inject()()(implicit ec: PostExecutionContext) extends PostRepository {
    [warn]                                               ^
    [warn] three warnings found
    [error] 13 errors found
    [error] (Compile / compileIncremental) Compilation failed
    [error] application - 
    
    ! @786ma41bd - Internal server error, for (GET) [/v1/posts/] ->
     
    play.sbt.PlayExceptions$CompilationException: Compilation error[not found: type CustomExecutionContext]
        at play.sbt.PlayExceptions$CompilationException$.apply(PlayExceptions.scala:34)
        at play.sbt.PlayExceptions$CompilationException$.apply(PlayExceptions.scala:34)
        at scala.Option.map(Option.scala:146)
        at play.sbt.run.PlayReload$.$anonfun$taskFailureHandler$1(PlayReload.scala:33)
        at scala.Option.map(Option.scala:146)
        at play.sbt.run.PlayReload$.taskFailureHandler(PlayReload.scala:28)
        at play.sbt.run.PlayReload$.compileFailure(PlayReload.scala:24)
        at play.sbt.run.PlayReload$.$anonfun$compile$3(PlayReload.scala:51)
        at scala.util.Either$LeftProjection.map(Either.scala:573)
        at play.sbt.run.PlayReload$.compile(PlayReload.scala:51)
    [info] Compiling 1 Scala source to /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/target/scala-2.12/classes ...
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:72: not found: type CustomExecutionContext
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                                        ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:51: not found: type ActorSystem
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                   ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:95: no arguments allowed for nullary constructor Object: ()Object
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                                                               ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:27:43: not found: type MarkerContext
    [error]   def create(data: PostData)(implicit mc: MarkerContext): Future[PostId]
    [error]                                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:29:27: not found: type MarkerContext
    [error]   def list()(implicit mc: MarkerContext): Future[Iterable[PostData]]
    [error]                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:31:36: not found: type MarkerContext
    [error]   def get(id: PostId)(implicit mc: MarkerContext): Future[Option[PostData]]
    [error]                                    ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:44:24: not found: value Logger
    [error]   private val logger = Logger(this.getClass)
    [error]                        ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:55:36: not found: type MarkerContext
    [error]   override def list()(implicit mc: MarkerContext): Future[Iterable[PostData]] = {
    [error]                                    ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:56:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:62:45: not found: type MarkerContext
    [error]   override def get(id: PostId)(implicit mc: MarkerContext): Future[Option[PostData]] = {
    [error]                                             ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:63:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:69:43: not found: type MarkerContext
    [error]   def create(data: PostData)(implicit mc: MarkerContext): Future[PostId] = {
    [error]                                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:70:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:44:15: private val logger in class PostRepositoryImpl is never used
    [warn]   private val logger = Logger(this.getClass)
    [warn]               ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:46:15: private val postList in class PostRepositoryImpl is never used
    [warn]   private val postList = List(
    [warn]               ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:42:47: parameter value ec in class PostRepositoryImpl is never used
    [warn] class PostRepositoryImpl @Inject()()(implicit ec: PostExecutionContext) extends PostRepository {
    [warn]                                               ^
    [warn] three warnings found
    [error] 13 errors found
    [error] (Compile / compileIncremental) Compilation failed
    [error] application - 
    
    ! @786ma42ca - Internal server error, for (GET) [/v1/posts/6] ->
     
    play.sbt.PlayExceptions$CompilationException: Compilation error[not found: type CustomExecutionContext]
        at play.sbt.PlayExceptions$CompilationException$.apply(PlayExceptions.scala:34)
        at play.sbt.PlayExceptions$CompilationException$.apply(PlayExceptions.scala:34)
        at scala.Option.map(Option.scala:146)
        at play.sbt.run.PlayReload$.$anonfun$taskFailureHandler$1(PlayReload.scala:33)
        at scala.Option.map(Option.scala:146)
        at play.sbt.run.PlayReload$.taskFailureHandler(PlayReload.scala:28)
        at play.sbt.run.PlayReload$.compileFailure(PlayReload.scala:24)
        at play.sbt.run.PlayReload$.$anonfun$compile$3(PlayReload.scala:51)
        at scala.util.Either$LeftProjection.map(Either.scala:573)
        at play.sbt.run.PlayReload$.compile(PlayReload.scala:51)
    [info] Compiling 1 Scala source to /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/target/scala-2.12/classes ...
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:72: not found: type CustomExecutionContext
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                                        ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:51: not found: type ActorSystem
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                   ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:95: no arguments allowed for nullary constructor Object: ()Object
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                                                               ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:27:43: not found: type MarkerContext
    [error]   def create(data: PostData)(implicit mc: MarkerContext): Future[PostId]
    [error]                                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:29:27: not found: type MarkerContext
    [error]   def list()(implicit mc: MarkerContext): Future[Iterable[PostData]]
    [error]                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:31:36: not found: type MarkerContext
    [error]   def get(id: PostId)(implicit mc: MarkerContext): Future[Option[PostData]]
    [error]                                    ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:44:24: not found: value Logger
    [error]   private val logger = Logger(this.getClass)
    [error]                        ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:55:36: not found: type MarkerContext
    [error]   override def list()(implicit mc: MarkerContext): Future[Iterable[PostData]] = {
    [error]                                    ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:56:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:62:45: not found: type MarkerContext
    [error]   override def get(id: PostId)(implicit mc: MarkerContext): Future[Option[PostData]] = {
    [error]                                             ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:63:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:69:43: not found: type MarkerContext
    [error]   def create(data: PostData)(implicit mc: MarkerContext): Future[PostId] = {
    [error]                                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:70:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:44:15: private val logger in class PostRepositoryImpl is never used
    [warn]   private val logger = Logger(this.getClass)
    [warn]               ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:46:15: private val postList in class PostRepositoryImpl is never used
    [warn]   private val postList = List(
    [warn]               ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:42:47: parameter value ec in class PostRepositoryImpl is never used
    [warn] class PostRepositoryImpl @Inject()()(implicit ec: PostExecutionContext) extends PostRepository {
    [warn]                                               ^
    [warn] three warnings found
    [error] 13 errors found
    [error] (Compile / compileIncremental) Compilation failed
    [error] application - 
    
    ! @786ma43b7 - Internal server error, for (GET) [/v1/posts/6] ->
     
    play.sbt.PlayExceptions$CompilationException: Compilation error[not found: type CustomExecutionContext]
        at play.sbt.PlayExceptions$CompilationException$.apply(PlayExceptions.scala:34)
        at play.sbt.PlayExceptions$CompilationException$.apply(PlayExceptions.scala:34)
        at scala.Option.map(Option.scala:146)
        at play.sbt.run.PlayReload$.$anonfun$taskFailureHandler$1(PlayReload.scala:33)
        at scala.Option.map(Option.scala:146)
        at play.sbt.run.PlayReload$.taskFailureHandler(PlayReload.scala:28)
        at play.sbt.run.PlayReload$.compileFailure(PlayReload.scala:24)
        at play.sbt.run.PlayReload$.$anonfun$compile$3(PlayReload.scala:51)
        at scala.util.Either$LeftProjection.map(Either.scala:573)
        at play.sbt.run.PlayReload$.compile(PlayReload.scala:51)
    [info] Compiling 1 Scala source to /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/target/scala-2.12/classes ...
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:72: not found: type CustomExecutionContext
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                                        ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:51: not found: type ActorSystem
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                   ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:95: no arguments allowed for nullary constructor Object: ()Object
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                                                               ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:27:43: not found: type MarkerContext
    [error]   def create(data: PostData)(implicit mc: MarkerContext): Future[PostId]
    [error]                                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:29:27: not found: type MarkerContext
    [error]   def list()(implicit mc: MarkerContext): Future[Iterable[PostData]]
    [error]                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:31:36: not found: type MarkerContext
    [error]   def get(id: PostId)(implicit mc: MarkerContext): Future[Option[PostData]]
    [error]                                    ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:44:24: not found: value Logger
    [error]   private val logger = Logger(this.getClass)
    [error]                        ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:54:36: not found: type MarkerContext
    [error]   override def list()(implicit mc: MarkerContext): Future[Iterable[PostData]] = {
    [error]                                    ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:55:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:61:45: not found: type MarkerContext
    [error]   override def get(id: PostId)(implicit mc: MarkerContext): Future[Option[PostData]] = {
    [error]                                             ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:62:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:68:43: not found: type MarkerContext
    [error]   def create(data: PostData)(implicit mc: MarkerContext): Future[PostId] = {
    [error]                                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:69:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:44:15: private val logger in class PostRepositoryImpl is never used
    [warn]   private val logger = Logger(this.getClass)
    [warn]               ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:46:15: private val postList in class PostRepositoryImpl is never used
    [warn]   private val postList = List(
    [warn]               ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:42:47: parameter value ec in class PostRepositoryImpl is never used
    [warn] class PostRepositoryImpl @Inject()()(implicit ec: PostExecutionContext) extends PostRepository {
    [warn]                                               ^
    [warn] three warnings found
    [error] 13 errors found
    [error] (Compile / compileIncremental) Compilation failed
    [error] application - 
    
    ! @786ma5nhn - Internal server error, for (GET) [/v1/posts/1] ->
     
    play.sbt.PlayExceptions$CompilationException: Compilation error[not found: type CustomExecutionContext]
        at play.sbt.PlayExceptions$CompilationException$.apply(PlayExceptions.scala:34)
        at play.sbt.PlayExceptions$CompilationException$.apply(PlayExceptions.scala:34)
        at scala.Option.map(Option.scala:146)
        at play.sbt.run.PlayReload$.$anonfun$taskFailureHandler$1(PlayReload.scala:33)
        at scala.Option.map(Option.scala:146)
        at play.sbt.run.PlayReload$.taskFailureHandler(PlayReload.scala:28)
        at play.sbt.run.PlayReload$.compileFailure(PlayReload.scala:24)
        at play.sbt.run.PlayReload$.$anonfun$compile$3(PlayReload.scala:51)
        at scala.util.Either$LeftProjection.map(Either.scala:573)
        at play.sbt.run.PlayReload$.compile(PlayReload.scala:51)
    [info] Compiling 1 Scala source to /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/target/scala-2.12/classes ...
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:72: not found: type CustomExecutionContext
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                                        ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:51: not found: type ActorSystem
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                   ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:95: no arguments allowed for nullary constructor Object: ()Object
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                                                               ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:27:43: not found: type MarkerContext
    [error]   def create(data: PostData)(implicit mc: MarkerContext): Future[PostId]
    [error]                                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:29:27: not found: type MarkerContext
    [error]   def list()(implicit mc: MarkerContext): Future[Iterable[PostData]]
    [error]                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:31:36: not found: type MarkerContext
    [error]   def get(id: PostId)(implicit mc: MarkerContext): Future[Option[PostData]]
    [error]                                    ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:44:24: not found: value Logger
    [error]   private val logger = Logger(this.getClass)
    [error]                        ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:54:36: not found: type MarkerContext
    [error]   override def list()(implicit mc: MarkerContext): Future[Iterable[PostData]] = {
    [error]                                    ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:55:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:61:45: not found: type MarkerContext
    [error]   override def get(id: PostId)(implicit mc: MarkerContext): Future[Option[PostData]] = {
    [error]                                             ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:62:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:68:43: not found: type MarkerContext
    [error]   def create(data: PostData)(implicit mc: MarkerContext): Future[PostId] = {
    [error]                                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:69:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:44:15: private val logger in class PostRepositoryImpl is never used
    [warn]   private val logger = Logger(this.getClass)
    [warn]               ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:46:15: private val postList in class PostRepositoryImpl is never used
    [warn]   private val postList = List(
    [warn]               ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:42:47: parameter value ec in class PostRepositoryImpl is never used
    [warn] class PostRepositoryImpl @Inject()()(implicit ec: PostExecutionContext) extends PostRepository {
    [warn]                                               ^
    [warn] three warnings found
    [error] 13 errors found
    [error] (Compile / compileIncremental) Compilation failed
    [error] application - 
    
    ! @786ma5oh6 - Internal server error, for (GET) [/v1/posts/1] ->
     
    play.sbt.PlayExceptions$CompilationException: Compilation error[not found: type CustomExecutionContext]
        at play.sbt.PlayExceptions$CompilationException$.apply(PlayExceptions.scala:34)
        at play.sbt.PlayExceptions$CompilationException$.apply(PlayExceptions.scala:34)
        at scala.Option.map(Option.scala:146)
        at play.sbt.run.PlayReload$.$anonfun$taskFailureHandler$1(PlayReload.scala:33)
        at scala.Option.map(Option.scala:146)
        at play.sbt.run.PlayReload$.taskFailureHandler(PlayReload.scala:28)
        at play.sbt.run.PlayReload$.compileFailure(PlayReload.scala:24)
        at play.sbt.run.PlayReload$.$anonfun$compile$3(PlayReload.scala:51)
        at scala.util.Either$LeftProjection.map(Either.scala:573)
        at play.sbt.run.PlayReload$.compile(PlayReload.scala:51)
    [info] Compiling 1 Scala source to /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/target/scala-2.12/classes ...
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:72: not found: type CustomExecutionContext
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                                        ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:51: not found: type ActorSystem
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                   ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:21:95: no arguments allowed for nullary constructor Object: ()Object
    [error] class PostExecutionContext @Inject()(actorSystem: ActorSystem) extends CustomExecutionContext(actorSystem, "repository.dispatcher")
    [error]                                                                                               ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:27:43: not found: type MarkerContext
    [error]   def create(data: PostData)(implicit mc: MarkerContext): Future[PostId]
    [error]                                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:29:27: not found: type MarkerContext
    [error]   def list()(implicit mc: MarkerContext): Future[Iterable[PostData]]
    [error]                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:31:36: not found: type MarkerContext
    [error]   def get(id: PostId)(implicit mc: MarkerContext): Future[Option[PostData]]
    [error]                                    ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:44:24: not found: value Logger
    [error]   private val logger = Logger(this.getClass)
    [error]                        ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:54:36: not found: type MarkerContext
    [error]   override def list()(implicit mc: MarkerContext): Future[Iterable[PostData]] = {
    [error]                                    ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:55:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:61:45: not found: type MarkerContext
    [error]   override def get(id: PostId)(implicit mc: MarkerContext): Future[Option[PostData]] = {
    [error]                                             ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:62:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:68:43: not found: type MarkerContext
    [error]   def create(data: PostData)(implicit mc: MarkerContext): Future[PostId] = {
    [error]                                           ^
    [error] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:69:12: Cannot find an implicit ExecutionContext. You might pass
    [error] an (implicit ec: ExecutionContext) parameter to your method
    [error] or import scala.concurrent.ExecutionContext.Implicits.global.
    [error]     Future {
    [error]            ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:44:15: private val logger in class PostRepositoryImpl is never used
    [warn]   private val logger = Logger(this.getClass)
    [warn]               ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:46:15: private val postList in class PostRepositoryImpl is never used
    [warn]   private val postList = List(
    [warn]               ^
    [warn] /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/app/v1/post/PostRepository.scala:42:47: parameter value ec in class PostRepositoryImpl is never used
    [warn] class PostRepositoryImpl @Inject()()(implicit ec: PostExecutionContext) extends PostRepository {
    [warn]                                               ^
    [warn] three warnings found
    [error] 13 errors found
    [error] (Compile / compileIncremental) Compilation failed
    [error] application - 
    
    ! @786ma7b11 - Internal server error, for (GET) [/v1/posts/1] ->
     
    play.sbt.PlayExceptions$CompilationException: Compilation error[not found: type CustomExecutionContext]
        at play.sbt.PlayExceptions$CompilationException$.apply(PlayExceptions.scala:34)
        at play.sbt.PlayExceptions$CompilationException$.apply(PlayExceptions.scala:34)
        at scala.Option.map(Option.scala:146)
        at play.sbt.run.PlayReload$.$anonfun$taskFailureHandler$1(PlayReload.scala:33)
        at scala.Option.map(Option.scala:146)
        at play.sbt.run.PlayReload$.taskFailureHandler(PlayReload.scala:28)
        at play.sbt.run.PlayReload$.compileFailure(PlayReload.scala:24)
        at play.sbt.run.PlayReload$.$anonfun$compile$3(PlayReload.scala:51)
        at scala.util.Either$LeftProjection.map(Either.scala:573)
        at play.sbt.run.PlayReload$.compile(PlayReload.scala:51)
    [info] Compiling 1 Scala source to /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/target/scala-2.12/classes ...
    [info] Done compiling.
    
    --- (RELOAD) ---
    
    [info] p.a.h.EnabledFilters - Enabled Filters (see <https://www.playframework.com/documentation/latest/Filters>):
    
        play.filters.csrf.CSRFFilter
        play.filters.headers.SecurityHeadersFilter
        play.filters.hosts.AllowedHostsFilter
    
    [info] play.api.Play - Application started (Dev)
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostController - show: id = 1
    [trace] v.p.PostRepositoryImpl - get: id = 1
    [info] Compiling 1 Scala source to /Users/xubo/Desktop/xubo/git/play-scala-rest-api-example/target/scala-2.12/classes ...
    [info] Done compiling.
    
    --- (RELOAD) ---
    
    [info] p.a.h.EnabledFilters - Enabled Filters (see <https://www.playframework.com/documentation/latest/Filters>):
    
        play.filters.csrf.CSRFFilter
        play.filters.headers.SecurityHeadersFilter
        play.filters.hosts.AllowedHostsFilter
    
    [info] play.api.Play - Application started (Dev)
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostController - show: id = 0
    [trace] v.p.PostController - show: id = 0
    [trace] v.p.PostRepositoryImpl - get: id = 0
    [trace] v.p.PostRepositoryImpl - get: id = 0
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostController - index: 
    [trace] v.p.PostRepositoryImpl - list: 
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostController - index: 
    [trace] v.p.PostRepositoryImpl - list: 
    [trace] v.p.PostActionBuilder - invokeBlock: 
    [trace] v.p.PostController - show: id = 0
    [trace] v.p.PostRepositoryImpl - get: id = 0
    [INFO] [06/05/2018 10:26:42.164] [Thread-2] [CoordinatedShutdown(akka://sbt-web)] Starting coordinated shutdown from JVM shutdown hook
    localhost:play-scala-rest-api-example xubo$ 
    localhost:play-scala-rest-api-example xubo$ 
    localhost:play-scala-rest-api-example xubo$ 
    localhost:play-scala-rest-api-example xubo$ ls
    LICENSE				build.gradle			docs				gradlew				play-scala-rest-api-example.iml	scripts
    README.md			build.sbt			gatling				gradlew.bat			project				target
    app				conf				gradle				logs				public				test
    localhost:play-scala-rest-api-example xubo$ 
