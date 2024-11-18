import org.apache.spark.sql.SparkSession

object TestSparkScala1Hello {
  def main(args: Array[String]): Unit = {
    println("Hello world!")

    val spark = SparkSession.builder().appName("my First Spark application").master("local[1]").getOrCreate()


  }
}