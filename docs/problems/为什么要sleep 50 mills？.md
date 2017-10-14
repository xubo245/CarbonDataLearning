	
为什么要sleep 50 mills？
org.apache.carbondata.processing.store.CarbonFactDataHandlerColumnar#closeHandler

	  public void closeHandler() throws CarbonDataWriterException {
	    if (null != this.dataWriter) {
	      // wait until all blocklets have been finished writing
	      while (blockletProcessingCount.get() > 0) {
	        try {
	          Thread.sleep(50);
	        } catch (InterruptedException e) {
	          throw new CarbonDataWriterException(e.getMessage());
	        }
	      }