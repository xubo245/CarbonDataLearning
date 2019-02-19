
Replace py4j with pyjnius, support OBS

1. optimize binary data type: two binary
2. design the schema, for different annotation, consider filter
3. optimize the page size => ok
4. test the perforance: TFrecord Vs python SDK: projection, filter
5. Support union


TODO
1. decrease the data size for image dataset
2. save feature vector for classification


Python SDK:
1.for other frame work integrationg, such as MXnet
2.For user to read carbon file simplily, for example: download from OBS and read