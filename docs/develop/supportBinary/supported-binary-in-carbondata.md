<!--
    Licensed to the Apache Software Foundation (ASF) under one or more 
    contributor license agreements.  See the NOTICE file distributed with
    this work for additional information regarding copyright ownership. 
    The ASF licenses this file to you under the Apache License, Version 2.0
    (the "License"); you may not use this file except in compliance with 
    the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and 
    limitations under the License.
-->

# Support binary data type in CarbonData
Binary is basic data type and widely used in various scenarios. So it’s better to support binary data type in CarbonData. Download data from S3 will be slow when dataset has lots of small binary data. The majority of application scenarios are related to storage small binary data type into CarbonData, which can avoid small binary files problem and speed up S3 access performance, also can decrease cost of accessing S3 by decreasing the number of calling S3 API. It also will easier to manage structure data and Unstructured data(binary) by storing them into CarbonData.

## Support binary data type in CarbonData Java SDK
CarbonData Java SDK supports write and read binary data type.

### Example of writing binary data type 
```$java
    // 1. build writer
    Field[] fields = new Field[5];
    fields[0] = new Field("binaryId", DataTypes.INT);
    fields[1] = new Field("binaryName", DataTypes.STRING);
    fields[2] = new Field("binary", DataTypes.BINARY);
    fields[3] = new Field("labelName", DataTypes.STRING);
    fields[4] = new Field("labelContent", DataTypes.STRING);
    CarbonWriter writer = CarbonWriter
        .builder()
        .outputPath(outputPath)
        .withCsvInput(new Schema(fields))
        .withBlockSize(256)
        .writtenBy("binaryExample")
        .withPageSizeInMb(1)
        .build();
    
    // 2. read binary from image
    byte[] originBinary = null;
    Object[] files = listFiles(sourceImageFolder, sufImage).toArray();
    if (null != files) {
      for (int i = 0; i < files.length; i++) {
        // read image and encode to Hex
        BufferedInputStream bis = new BufferedInputStream(
            new FileInputStream(new File((String) files[i])));
        originBinary = new byte[bis.available()];
        while ((bis.read(originBinary)) != -1) {
        }

        String labelFileName = ((String) files[i]).split(sufImage)[0] + sufAnnotation;
        BufferedInputStream txtBis = new BufferedInputStream(new FileInputStream(labelFileName));
        String labelValue = null;
        byte[] labelBinary = null;
        labelBinary = new byte[txtBis.available()];
        while ((txtBis.read(labelBinary)) != -1) {
          labelValue = new String(labelBinary, "UTF-8");
        }
        
        // 3. Write binary data to carbon
        writer.write(new Object[]{i, (String) files[i], originBinary,
            labelFileName, labelValue});
        bis.close();
        txtBis.close();
      }
    }
    
    // 4. close the writer. 
    writer.close();
```

### Example of reading binary data type 
```$java
    // 1. build carbon reader
    CarbonReader reader = CarbonReader
            .builder(carbonPath)
            .build();
    // 2. read binary data
    while (reader.hasNext()) {
      Object[] row = (Object[]) reader.readNextRow();

      byte[] outputBinary = (byte[]) row[1];

      // 3. convert binary and save, user can compare the save image and original image
      String originalPath = (String) row[0];
      int index = originalPath.lastIndexOf("/");
      File file = new File(outputPath);
      if (!file.exists()) {
        assert file.mkdir();
      }
      String destString = outputPath + originalPath.substring(index, originalPath.length());
      BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));
      bos.write(outputBinary);
      bos.close();
    }
    // 4. close carbon reader
    reader.close();
```

## Support binary data type in CarbonData DataSource
The CarbonData fileformat is now integrated as Spark DataSource for read and write operation without using CarbonSession. CarbonData DataSource also need support binary data type. It already supports create table with data path, insert into, CTAS and query binary data. CarbonData  DataSource doesn't support load data because LOAD DATA is not supported for Spark DataSource tables

### Example of creating binary table with path and querying in CarbonData DataSource.

```$java
        sql(s"CREATE TABLE binaryCarbon USING CARBON LOCATION '$Path'")
        sql("SELECT * FROM binaryCarbon").show()
```
Path can be CarbonData path which was written by CarbonData SDK.

### Example of creating binary table, inserting into and querying in CarbonData DataSource.

```$java
        sql(
            s"""
               | CREATE TABLE IF NOT EXISTS carbontable (
               |    id INT,
               |    label BOOLEAN,
               |    name STRING,
               |    image BINARY,
               |    autoLabel BOOLEAN)
               | using carbon
             """.stripMargin)
        sql("INSERT INTO carbontable VALUES(1,true,'Bob','binary',false)")
        sql("SELECT * FROM carbontable").show()
```
CarbonData DataSource also supports CTAS (create table as select) for binary data type.

## Support binary data type in CarbonSession
CarbonSession already support create table, insert into, load data and query binary data. Table property doesn’t support sort_columns, dictionary, COLUMN_META_CACHE, RANGE_COLUMN for binary column. CarbonSession doesn’t support PARTITION, filter, BUCKETCOLUMNS for binary. Bloomfilter, lucene, timeseries, min max datamap don't support binary data type. CarbonSession Supports read binary data type from non-transaction table, read binary column and return as byte[].

### Example of creating binary table with path and querying in CarbonSession.
```sql
    sql(s"CREATE EXTERNAL TABLE binaryCarbon STORED BY 'carbondata' LOCATION '$writerPath'")
    sql("SELECT * FROM binaryCarbon").show()
```
Path can be CarbonData path which was written by CarbonData SDK.

### Example of creating binary table, inserting into, load data and querying.
```sql
      sql(
            s"""
               | CREATE TABLE IF NOT EXISTS carbontable (
               |    id int,
               |    label boolean,
               |    name string,
               |    image binary,
               |    autoLabel boolean)
               | STORED BY 'carbondata'
             """.stripMargin)
      sql(
            s"""
               | LOAD DATA LOCAL INPATH '$resourcesPath/binarystringdata.csv'
               | INTO TABLE carbontable
               | OPTIONS('header'='false','DELIMITER'='|')
             """.stripMargin)
      sql("insert into carbontable values(1,true,'Bob','binary',false)")
      sql("SELECT * FROM carbontable").show()
```