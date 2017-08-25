
##1.入口（org.apache.spark.sql.SparkSession#sql）

	  def sql(sqlText: String): DataFrame = {
	    Dataset.ofRows(self, sessionState.sqlParser.parsePlan(sqlText))
	  }

##2.Dataset.ofRows

	  def ofRows(sparkSession: SparkSession, logicalPlan: LogicalPlan): DataFrame = {
	    val qe = sparkSession.sessionState.executePlan(logicalPlan)
	    qe.assertAnalyzed()
	    new Dataset[Row](sparkSession, qe, RowEncoder(qe.analyzed.schema))
	  }


##3.new Dataset对象
其中需要执行queryExecution.toRdd

    queryExecution.analyzed match {
      // For various commands (like DDL) and queries with side effects, we force query execution
      // to happen right away to let these side effects take place eagerly.
      case p if hasSideEffects(p) =>
        LogicalRDD(queryExecution.analyzed.output, queryExecution.toRdd)(sparkSession)
      case Union(children) if children.forall(hasSideEffects) =>
        LogicalRDD(queryExecution.analyzed.output, queryExecution.toRdd)(sparkSession)
      case _ =>
        queryExecution.analyzed
    }

##4.toRdd方法（org.apache.spark.sql.execution.QueryExecution#toRdd）
执行toRdd<=executedPlan<= sparkPlan<=optimizedPlan<=withCachedData,optimizer<=analyzed<=analyzer  
方法都是相互依赖的，惰性执行


	  lazy val analyzed: LogicalPlan = {
	    SparkSession.setActiveSession(sparkSession)
	    sparkSession.sessionState.analyzer.execute(logical)
	  }
	
	  lazy val withCachedData: LogicalPlan = {
	    assertAnalyzed()
	    assertSupported()
	    sparkSession.sharedState.cacheManager.useCachedData(analyzed)
	  }
	
	  lazy val optimizedPlan: LogicalPlan = sparkSession.sessionState.optimizer.execute(withCachedData)
	
	  lazy val sparkPlan: SparkPlan = {
	    SparkSession.setActiveSession(sparkSession)
	    // TODO: We use next(), i.e. take the first plan returned by the planner, here for now,
	    //       but we will implement to choose the best plan.
	    planner.plan(ReturnAnswer(optimizedPlan)).next()
	  }
	
	  // executedPlan should not be used to initialize any SparkPlan. It should be
	  // only used for execution.
	  lazy val executedPlan: SparkPlan = prepareForExecution(sparkPlan)
	
	  /** Internal version of the RDD. Avoids copies and has no schema */
	  lazy val toRdd: RDD[InternalRow] = executedPlan.execute()


execute方法中会执行doExecute，其会执行：（org.apache.spark.sql.execution.command.RunnableCommand）

	protected override def doExecute(): RDD[InternalRow] = {
		sqlContext.sparkContext.parallelize(sideEffectResult, 1)
	}

执行cmd.run：

	  protected[sql] lazy val sideEffectResult: Seq[InternalRow] = {
	    val converter = CatalystTypeConverters.createToCatalystConverter(schema)
	    cmd.run(sqlContext.sparkSession).map(converter(_).asInstanceOf[InternalRow])
	  }

cmd是RunnableCommand：

	case class ExecutedCommandExec(cmd: RunnableCommand) extends SparkPlan {



其中在Carbon中的LoadTable（org.apache.spark.sql.execution.command.LoadTable）和CreateTable（org.apache.spark.sql.execution.command.CreateTable）都继承了RunnableCommand，然后执行了run方法