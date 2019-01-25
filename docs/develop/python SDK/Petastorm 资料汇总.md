Petastorm 资料汇总

    self._dataset = pq.ParquetDataset(
                self._dataset_path,
                filesystem=self._filesystem,
                validate_schema=False)
    piece = self._split_pieces[piece_index]

        # Create pyarrow file system
        parquet_file = ParquetFile(self._dataset.fs.open(piece.path))

        if not isinstance(self._local_cache, NullCache):
            if worker_predicate:
                raise RuntimeError('Local cache is not supported together with predicates, '
                                   'unless the dataset is partitioned by the column the predicate operates on.')
            if shuffle_row_drop_partition[1] != 1:
                raise RuntimeError('Local cache is not supported together with shuffle_row_drop_partitions > 1')

        if worker_predicate:
            all_cols = self._load_rows_with_predicate(parquet_file, piece, worker_predicate, shuffle_row_drop_partition)


parquet.py:

  def __init__(self, path_or_paths, filesystem=None, schema=None,
                 metadata=None, split_row_groups=False, validate_schema=True,
                 filters=None, metadata_nthreads=1):
        if filesystem is None:
        
pyarrow:

parquet interface in arrow:

https://github.com/apache/arrow/blob/master/python/pyarrow/parquet.py


## Reference
 1. https://eng.uber.com/petastorm/
 2. https://arrow.apache.org/docs/python/
 3. https://arrow.apache.org/docs/python/parquet.html
 4. https://github.com/apache/parquet-cpp
 5. https://github.com/apache/arrow/blob/master/python/pyarrow/parquet.py
 6. https://github.com/uber/petastorm/blob/9ab100862e443752ebabd737783646f926127ada/petastorm/etl/dataset_metadata.py
 7. https://pypi.org/project/pyarrow/
