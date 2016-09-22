addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.2.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-osgi" % "0.8.0")

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-simple" % "1.6.6" % "runtime",
  "com.typesafe" % "config" % "1.2.1"
)