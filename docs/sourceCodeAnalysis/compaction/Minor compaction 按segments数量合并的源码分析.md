
Minor compaction 按segments数量合并的源码分析：


#位置:
	
	org.apache.carbondata.processing.merger.CarbonDataMergerUtil#identifySegmentsToBeMergedBasedOnSegCount

#分析:

##1.首先对segment排序
根据metadata的loadId

org.apache.carbondata.processing.merger.CarbonDataMergerUtil#identifySegmentsToBeMerged

    List<LoadMetadataDetails> sortedSegments = new ArrayList<LoadMetadataDetails>(segments);

    sortSegments(sortedSegments);

##2.获取level值

默认level值大小是：

	  public static final String DEFAULT_SEGMENT_LEVEL_THRESHOLD = "4,3";
  通过逗号划分

实际值获取：
	  private int[] getIntArray(String commaSeparatedLevels) {
	    String[] levels = commaSeparatedLevels.split(",");
	    int[] compactionSize = new int[levels.length];
	    int i = 0;
	    for (String levelSize : levels) {
	      try {
	        int size = Integer.parseInt(levelSize.trim());
	        if (validate(size, 100, 0, -1) < 0) {
	          // if given size is out of boundary then take default value for all levels.
	          return new int[0];
	        }
	        compactionSize[i++] = size;
	      } catch (NumberFormatException e) {
	        LOGGER.error(
	            "Given value for property" + CarbonCommonConstants.COMPACTION_SEGMENT_LEVEL_THRESHOLD
	                + " is not proper. Taking the default value "
	                + CarbonCommonConstants.DEFAULT_SEGMENT_LEVEL_THRESHOLD);
	        return new int[0];
	      }
	    }
	    return compactionSize;
	  }

如果给的值小于等于0或者大于等于100，则重置为0：

	  public int validate(int actual, int max, int min, int defaultVal) {
	    if (actual <= max && actual >= min) {
	      return actual;
	    }
	    return defaultVal;
	  }


当然也可以是单个值：

  if (size >= 2) {
      level1Size = noOfSegmentLevelsCount[0];
      level2Size = noOfSegmentLevelsCount[1];
    } else if (size == 1) {
      level1Size = noOfSegmentLevelsCount[0];
    }


##3.过滤
过滤已经是level2的，major合并的：
	if (segName.endsWith(CarbonCommonConstants.LEVEL2_COMPACTION_INDEX) || (
	          segment.isMajorCompacted() != null && segment.isMajorCompacted()
	              .equalsIgnoreCase("true"))) {
	        continue;
	      }


过滤已经合并的：

分别统计没有合并的和已经经过level1合并的数量

	 if (!isMergedSegment(segName)) {
	        //if it is an unmerged segment then increment counter
	        unMergeCounter++;
	        unMergedSegments.add(segment);
	        if (unMergeCounter == (level1Size)) {
	          return unMergedSegments;
	        }
	      } else {
	        mergeCounter++;
	        mergedSegments.add(segment);
	        if (mergeCounter == (level2Size)) {
	          return mergedSegments;
	        }
	      }
	    }

level1和level2 compaction 哪个先达到阈值就返回哪一个