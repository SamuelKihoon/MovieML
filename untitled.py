from pyspark.sql import SparkSession

spark = SparkSession.builder \
    .master("local[*]") \
    .appName("PySpark Tutorial") \
    .getOrCreate()
