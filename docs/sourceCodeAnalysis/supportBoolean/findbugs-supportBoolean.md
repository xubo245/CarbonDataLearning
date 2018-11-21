	
在外源package代码的时候发现很多问题：

findbugs：
	
	[INFO] Dead store to codecMeta in org.apache.carbondata.core.datastore.page.encoding.bool.BooleanPageCodec.createDecoder(ColumnPageEncoderMeta) [org.apache.carbondata.core.datastore.page.encoding.bool.BooleanPageCodec] At BooleanPageCodec.java:[line 65] DLS_DEAD_LOCAL_STORE
	[INFO] Unread field: org.apache.carbondata.core.datastore.page.encoding.bool.BooleanPageCodec$BooleanDecompressor.compressor [org.apache.carbondata.core.datastore.page.encoding.bool.BooleanPageCodec$BooleanDecompressor] At BooleanPageCodec.java:[line 105] URF_UNREAD_FIELD
	[INFO] Unread field: org.apache.carbondata.core.datastore.page.encoding.bool.BooleanPageCodec$BooleanDecompressor.precision [org.apache.carbondata.core.datastore.page.encoding.bool.BooleanPageCodec$BooleanDecompressor] At BooleanPageCodec.java:[line 107] URF_UNREAD_FIELD
	[INFO] Unread field: org.apache.carbondata.core.datastore.page.encoding.bool.BooleanPageCodec$BooleanDecompressor.scale [org.apache.carbondata.core.datastore.page.encoding.bool.BooleanPageCodec$BooleanDecompressor] At BooleanPageCodec.java:[line 106] URF_UNREAD_FIELD
	[INFO] Switch statement found in new org.apache.carbondata.core.datastore.page.statistics.PrimitivePageStatsCollector(DataType, int, int) where one case falls through to the next case [org.apache.carbondata.core.datastore.page.statistics.PrimitivePageStatsCollector] At PrimitivePageStatsCollector.java:[lines 148-150] SF_SWITCH_FALLTHROUGH
	[INFO] Switch statement found in org.apache.carbondata.core.datastore.page.statistics.PrimitivePageStatsCollector.updateNull(int) where one case falls through to the next case [org.apache.carbondata.core.datastore.page.statistics.PrimitivePageStatsCollector] At PrimitivePageStatsCollector.java:[lines 187-189] SF_SWITCH_FALLTHROUGH
	[INFO] 
	
	
	To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"
	
	
	
	[INFO] ------------------------------------------------------------------------
	[INFO] Reactor Summary:

修改：  
   前面几个是有没用的代码，后面几个是switch case没有加break