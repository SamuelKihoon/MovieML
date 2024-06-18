{
 "cells": [
  {
   "cell_type": "code",
   "execution_count": 3,
   "id": "d5d7d80c-605c-4ee0-8ce1-c9e22017adb6",
   "metadata": {},
   "outputs": [
    {
     "ename": "CompilationException",
     "evalue": "",
     "output_type": "error",
     "traceback": [
      "\u001b[1m\u001b[30m|   \u001b[1m\u001b[30mimport \u001b[0m\u001b[1m\u001b[30m\u001b[41morg.apache.spark.sql.SparkSession\u001b[0m\u001b[1m\u001b[30m;\u001b[0m",
      "\u001b[1m\u001b[31mpackage org.apache.spark.sql does not exist\u001b[0m",
      ""
     ]
    }
   ],
   "source": [
    "// Import required packages\n",
    "import org.apache.spark.sql.SparkSession;\n",
    "import org.apache.spark.sql.Dataset;\n",
    "import org.apache.spark.sql.Row;\n",
    "\n",
    "// Create SparkSession\n",
    "SparkSession spark = SparkSession.builder()\n",
    "                                 .appName(\"Bloggers Example\")\n",
    "                                 .config(\"spark.master\", \"local\")\n",
    "                                 .getOrCreate();\n",
    "\n",
    "// JSON file path\n",
    "String bloggersPath = \"C:\\\\\\\\javawork\\\\Hello\\\\data_1.json\";\n",
    "\n",
    "// Read JSON file into Dataset\n",
    "Dataset<Row> bloggersDF = spark.read().format(\"json\").option(\"path\", bloggersPath).load();\n",
    "\n",
    "// Show the content of the DataFrame\n",
    "bloggersDF.show();\n",
    "\n",
    "// Print the schema of the DataFrame\n",
    "bloggersDF.printSchema();\n",
    "\n",
    "// Select specific columns and show the result\n",
    "bloggersDF.select(\"first\", \"last\", \"url\").show();\n",
    "\n",
    "// Filter rows based on a condition and show the result\n",
    "bloggersDF.filter(bloggersDF.col(\"hits\").gt(100)).show();\n",
    "\n",
    "// Create a temporary view and run SQL queries\n",
    "bloggersDF.createOrReplaceTempView(\"bloggers\");\n",
    "Dataset<Row> resultDF = spark.sql(\"SELECT first, last, hits FROM bloggers WHERE hits > 100\");\n",
    "resultDF.show();\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "8428af48-97d1-453a-bc7d-614319f662b2",
   "metadata": {},
   "outputs": [],
   "source": []
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "97d39a7e-4a6d-45f2-a19d-10f4cc3444f2",
   "metadata": {},
   "outputs": [],
   "source": []
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Java",
   "language": "java",
   "name": "java"
  },
  "language_info": {
   "codemirror_mode": "java",
   "file_extension": ".jshell",
   "mimetype": "text/x-java-source",
   "name": "Java",
   "pygments_lexer": "java",
   "version": "22+36-2370"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 5
}
