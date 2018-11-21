
Major compaction 按大小合并的源码分析：


#位置:
	org.apache.carbondata.processing.merger.CarbonDataMergerUtil#identifySegmentsToBeMergedBasedOnSize


#分析:

##1.首先对segment排序
根据metadata的loadId

org.apache.carbondata.processing.merger.CarbonDataMergerUtil#identifySegmentsToBeMerged

    List<LoadMetadataDetails> sortedSegments = new ArrayList<LoadMetadataDetails>(segments);

    sortSegments(sortedSegments);

##2.如果单个segment的大小大于Major compaction size，则忽略

      // if size of a segment is greater than the Major compaction size. then ignore it.
      if (sizeOfOneSegmentAcrossPartition > (compactionSize * 1024 * 1024)) {
        // if already 2 segments have been found for merging then stop scan here and merge.
        if (segmentsToBeMerged.size() > 1) {
          break;
        } else { // if only one segment is found then remove the earlier one in list.
          // reset the total length to 0.
          segmentsToBeMerged = new ArrayList<>(CarbonCommonConstants.DEFAULT_COLLECTION_SIZE);
          totalLength = 0;
          continue;
        }
      }

##3.当大小累积小于Major compaction size时，继续加
     // in case of major compaction the size doesnt matter. all the segments will be merged.
      if (totalLength < (compactionSize * 1024 * 1024)) {
        segmentsToBeMerged.add(segment);
      } else { // if already 2 segments have been found for merging then stop scan here and merge.
        if (segmentsToBeMerged.size() > 1) {
          break;
        } else { // if only one segment is found then remove the earlier one in list and put this.
          // reset the total length to the current identified segment.
          segmentsToBeMerged = new ArrayList<>(CarbonCommonConstants.DEFAULT_COLLECTION_SIZE);
          segmentsToBeMerged.add(segment);
          totalLength = sizeOfOneSegmentAcrossPartition;
        }
      }

当大于Major compaction size时，则不再继续加，返回segmentsToBeMerged， 此时segmentsToBeMerged中的segments累积大小还是小于Major compaction size