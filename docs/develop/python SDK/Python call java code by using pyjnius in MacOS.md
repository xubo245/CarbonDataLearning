# Python call java code by using pyjnius in MacOS

## Installation for macOS

Python and pip must be installed and present in the PATH environment variable.

### Download and install the JDK containing the JRE:

	http://www.oracle.com/technetwork/java/javase/downloads/index.html
Edit your system and environment variables (use the appropriate Java bitness and version in the paths):

### Add to your Environment Variables:
	
	export JAVA_HOME=/usr/libexec/java_home
### Install Xcode command-line tools.
Update pip and setuptools:

	python -m pip install --upgrade pip setuptools
### Install Cython:

	python -m pip install --upgrade cython
### Install Pyjnius:

	pip install pyjnius
	
### install pyjnius in pycharm
	 prefernece=> project interpreter
## Test in python code:

	from jnius import autoclass
	
	Stack = autoclass('java.util.Stack')
	stack = Stack()
	stack.push("Hello")
	stack.push("World")
	
	print(stack.pop()) # --> 'world'
	print(stack.pop()) # --> 'hello'

## Result 
	
	/usr/local/bin/python3.6 /Users/xubo/Desktop/xubo/git/carbondata1/store/PYSDK/test/pyjnius/testPyjnius.py
	World
	Hello
	
	Process finished with exit code 0
	
## Refer:

[1] https://pyjnius.readthedocs.io/en/stable/installation.html