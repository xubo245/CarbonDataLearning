	Schema:
	ImageName
	ImageBinary
	labelFileName
	label
	labelFileContent String(detection)
	
	classification:
		image1,XX,XX,cat
	Object detection:
		image1,XX,XX,cat,'objectname:cat\nlocation:XX'\
		'cat,dog'. contains sql filter.  //like, lucene in CarbonSession
	
	
	, complex data type<!---->
	/Binary(SegmentationClass)
	
	=> labelFileContent =>carbon
	
	
	1.image classification
	2.Object detection
	3.voice classification
	4.text classification
	TODO:
	5. Segmentation
	6. point cloud dataSet
	
	
	
	TFrecord Schema:
	hight
	width
	depth
	label
	raw image 【binary】
	imageName
	labelName
	
	Carbon Schema:
	hight
	width
	depth
	label
	raw image【Binary】
	imageName
	labelName
