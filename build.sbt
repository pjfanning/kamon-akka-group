name := "kamon-akka-group"

scalaVersion := "2.12.2"

resolvers += Resolver.bintrayRepo("kamon-io", "releases")
resolvers += "jitpack" at "https://jitpack.io"
 
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.0",
  "com.typesafe.akka" %% "akka-slf4j" % "2.5.0",
  "io.kamon" %% "kamon-core" % "0.6.6",
  "com.github.pjfanning.kamon-akka" %% "kamon-akka-2.4" % "v0.1-alpha4",
  "com.github.pjfanning" %% "kamon-log-reporter" % "v0.6.7-alpha2",
  "ch.qos.logback" % "logback-classic" % "1.2.1"
)
