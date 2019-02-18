Running py4j benchmark
## Command
	python py4jbench.py  --verbose --csv-output report.csv --append-to-csv /Users/xubo/Desktop/xubo/maven/carbondata1/net/sf/py4j/py4j/0.10.7/py4j-0.10.7.jar
	
## History

	localhost:py4j-benchmark xubo$ python py4jbench.py  --verbose --csv-output report.csv --append-to-csv /Users/xubo/Desktop/xubo/maven/carbondata1/net/sf/py4j/py4j/0.10.7/py4j-0.10.7.jar
	Starting benchmark
	Initializing random numbers
	Increasing python recursion limit for deep recursive tests
	With pinned thread? True
	Compiling java utility classe(s)
	Running standard tests
	Test java-instance-creation - avg: 0.000551066398621s, stddev: 0.00037642783066s, total: 0.0551066398621s, iterations: 100
	Test java-static-method - avg: 0.000553677082062s, stddev: 0.000152118158429s, total: 0.0553677082062s, iterations: 100
	Test java-list - avg: 0.00601419687271s, stddev: 0.00134309467999s, total: 0.601419687271s, iterations: 100
	Test python-type-conversion - avg: 0.00219285726547s, stddev: 0.000773086400418s, total: 0.219285726547s, iterations: 100
	Test both-medium-string - avg: 0.00061646938324s, stddev: 0.000662360559909s, total: 0.061646938324s, iterations: 100
	Test both-large-string - avg: 0.0193599510193s, stddev: 0.00484683980382s, total: 1.93599510193s, iterations: 100
	Test both-extra-large-string - avg: 0.523616099358s, stddev: 0.0425123081069s, total: 5.23616099358s, iterations: 10
	Test both-small-bytes - avg: 0.000286087989807s, stddev: 0.000165229511451s, total: 0.0286087989807s, iterations: 100
	Test both-medium-bytes - avg: 0.000497608184814s, stddev: 6.96165036593e-05s, total: 0.0497608184814s, iterations: 100
	Test both-large-bytes - avg: 0.244279551506s, stddev: 0.00781857331865s, total: 2.44279551506s, iterations: 10
	Test both-extra-large-bytes - avg: 6.42896475792s, stddev: 0.0612510015733s, total: 32.1448237896s, iterations: 5
	Test both-multiple-calling-threads - avg: 0.0590855526924s, stddev: 0.0103318188204s, total: 5.90855526924s, iterations: 100
	Test python-garbage-collection - avg: 0.00863787889481s, stddev: 0.000971430304178s, total: 0.863787889481s, iterations: 100
	Test python-simple-callback - avg: 0.00062228679657s, stddev: 0.00121592284226s, total: 0.062228679657s, iterations: 100
	Test both-recursive-callback - avg: 0.00719441652298s, stddev: 0.00277913950347s, total: 0.719441652298s, iterations: 100
	Traceback (most recent call last):
	  File "py4jbench.py", line 783, in <module>
	    main()
	  File "py4jbench.py", line 771, in main
	    run_standard_tests(args, results)
	  File "py4jbench.py", line 652, in run_standard_tests
	    _run_tests(options, results, gateway, STD_TESTS)
	  File "py4jbench.py", line 693, in _run_tests
	    stats = test(options, gateway)
	  File "py4jbench.py", line 483, in both_deep_recursive_callback
	    return benchmark(func, None, cleanup, options.max_iterations)
	  File "py4jbench.py", line 201, in benchmark
	    function()
	  File "py4jbench.py", line 476, in func
	    startCountdown(250, pythonCountdown)
	  File "/usr/local/lib/python2.7/site-packages/py4j/java_gateway.py", line 1257, in __call__
	    answer, self.gateway_client, self.target_id, self.name)
	  File "/usr/local/lib/python2.7/site-packages/py4j/protocol.py", line 328, in get_return_value
	    format(target_id, ".", name), value)
	py4j.protocol.Py4JJavaError: <exception str() failed>

## Refer

[1] https://www.py4j.org/advanced_topics.html#performance。  
[2] https://github.com/bartdag/py4j-benchmark