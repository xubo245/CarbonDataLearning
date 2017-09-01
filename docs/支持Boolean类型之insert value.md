

##new table page初始化
new table时：

      page.setStatsCollector(
          PrimitivePageStatsCollector.newInstance(
              dataTypes[i], spec.getScale(), spec.getPrecision()));
newInstance时会生成新的PrimitivePageStatsCollector对象，此时需要根据dataType来设置min和max值

org.apache.carbondata.core.datastore.page.statistics.PrimitivePageStatsCollector#PrimitivePageStatsCollector




