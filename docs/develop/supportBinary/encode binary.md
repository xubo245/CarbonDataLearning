1.remove measure encode
org.apache.carbondata.core.datastore.page.ColumnPage#compress

2.change isVarcharType 
org.apache.carbondata.core.datastore.page.encoding.dimension.legacy.HighCardDictDimensionIndexCodec#isVarcharType

3. safe and unsafe

4. no use: org.apache.carbondata.core.datastore.page.ColumnPage#newBinaryPage
5. write image and show image after sql

3.encode:
org.apache.carbondata.core.datastore.page.encoding.dimension.legacy.IndexStorageEncoder#encodeIndexStorage
org.apache.carbondata.core.datastore.page.encoding.dimension.legacy.HighCardDictDimensionIndexCodec
org.apache.carbondata.processing.store.TablePage#TablePage
org.apache.carbondata.core.datastore.page.ColumnPage#newPage



org.apache.carbondata.processing.store.CarbonFactDataHandlerColumnar#addDataToStore


    String sourceImageFolder = "/Users/xubo/Desktop/xubo/data/VOCdevkit/VOCImageAndAnnotation";
    
    
    String sourceImageFolder = "/Users/xubo/Desktop/xubo/data/ModelArts/flowers";
    
    
    
 Optimize:
 1.
    String errorMsg =
                "sort columns not supported for array, struct, map, double, float, decimal, "
                    + "varchar, binary";

 2.org.apache.carbondata.sdk.file.CarbonWriterBuilder#buildTableSchema
 
 3.How about carbon
 
 org.apache.spark.sql.hive.CarbonFileMetastore#lookupRelation
 
 4.Unsupport DICTIONARY_INCLUDE for binary?
 
 5.long string column : imageis not supported for data type: BINARY
 
 6.unused import 
 org.apache.carbondata.examples.ExternalTableExample