name := "SparkTest"

version := "0.1"

scalaVersion := "2.12.8"

val sparkVersion = "2.4.0"
val sqlVersion = "2.4.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sqlVersion
)
