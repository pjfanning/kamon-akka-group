name := "kamon-akka-group"

scalaVersion := "2.12.2"

resolvers += Resolver.bintrayRepo("kamon-io", "releases")
 
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.2",
  "com.typesafe.akka" %% "akka-slf4j" % "2.5.2",
  "io.kamon" %% "kamon-core" % "0.6.7",
  "io.kamon" %% "kamon-akka-2.5" % "0.6.7",
  "io.kamon" %% "kamon-log-reporter" % "0.6.8",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)
