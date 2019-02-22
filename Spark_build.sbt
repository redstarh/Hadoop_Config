name := "SparkTest"

version := "0.1"

scalaVersion := "2.10.0"

val sparkVersion = "2.2.3"
val sqlVersion = "2.2.3"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sqlVersion
)
