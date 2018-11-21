
##问题1
为什么PRESERVE_LATEST_SEGMENTS_NUMBER大于100要报错？

org.apache.carbondata.core.constants.CarbonCommonConstants#PRESERVE_LATEST_SEGMENTS_NUMBER

org.apache.carbondata.core.util.CarbonProperties#getNumberOfSegmentsToBePreserved

	 if (numberOfSegmentsToBePreserved < 0 || numberOfSegmentsToBePreserved > 100) {
	        LOGGER.error("The specified value for property "
	            + CarbonCommonConstants.PRESERVE_LATEST_SEGMENTS_NUMBER + " is incorrect."
	            + " Correct value should be in range of 0 -100. Taking the default value.");
	        numberOfSegmentsToBePreserved =
	            Integer.parseInt(CarbonCommonConstants.DEFAULT_PRESERVE_LATEST_SEGMENTS_NUMBER);
	      }

小于0大于100之后然后设置为0


##问题2：疑问：
segment有哪些状态？全部
org.apache.carbondata.processing.merger.CarbonDataMergerUtil#isSegmentValid

	  private static boolean isSegmentValid(LoadMetadataDetails seg) {
	    return seg.getLoadStatus().equalsIgnoreCase(CarbonCommonConstants.STORE_LOADSTATUS_SUCCESS)
	            || seg.getLoadStatus()
	            .equalsIgnoreCase(CarbonCommonConstants.STORE_LOADSTATUS_PARTIAL_SUCCESS) || seg
	            .getLoadStatus().equalsIgnoreCase(CarbonCommonConstants.MARKED_FOR_UPDATE);
	  }

##问题3：疑问
carbon.allowed.compaction.days合并的是从第一个segment开始计时的指定天数内的compaction？

org.apache.carbondata.processing.merger.CarbonDataMergerUtil#identifySegmentsToBeMergedBasedOnLoadedDate

	  for (LoadMetadataDetails segment : listOfSegmentsBelowThresholdSize) {
	
	        if (first) {
	          segDate1 = initializeFirstSegment(loadsOfSameDate, segment, sdf);
	          first = false;
	          continue;
	        }
	        long segmentDate = segment.getLoadStartTime();
	        Date segDate2 = null;
	        try {
	          segDate2 = sdf.parse(sdf.format(segmentDate));
	        } catch (ParseException e) {
	          LOGGER.error("Error while parsing segment start time" + e.getMessage());
	        }
	
	        if (isTwoDatesPresentInRequiredRange(segDate1, segDate2, numberOfDaysAllowedToMerge)) {
	          loadsOfSameDate.add(segment);
	        }
	        // if the load is beyond merged date.
	        // then reset everything and continue search for loads.
	        else if (loadsOfSameDate.size() < 2) {
	          loadsOfSameDate.clear();
	          // need to add the next segment as first and  to check further
	          segDate1 = initializeFirstSegment(loadsOfSameDate, segment, sdf);
	        } else { // case where a load is beyond merge date and there is at least 2 loads to merge.
	          break;
	        }


















##获取文件大小：
java.io.File#length

	   public long length() {
	        SecurityManager security = System.getSecurityManager();
	        if (security != null) {
	            security.checkRead(path);
	        }
	        if (isInvalid()) {
	            return 0L;
	        }
	        return fs.getLength(this);
	    }