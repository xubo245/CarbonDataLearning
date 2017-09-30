filter不一致可能的问题：


org.apache.carbondata.core.scan.expression.ExpressionResult#getBoolean

可能会导致差异？？？

	  public Boolean getBoolean() throws FilterIllegalMemberException {
	    if (value == null) {
	      return null;
	    }
	    try {
	      switch (this.getDataType()) {
	        case BOOLEAN:
	          return Boolean.parseBoolean(value.toString());
	
	        case STRING:
	          try {
	            return Boolean.parseBoolean(value.toString());
	          } catch (NumberFormatException e) {
	            throw new FilterIllegalMemberException(e);
	          }
	          