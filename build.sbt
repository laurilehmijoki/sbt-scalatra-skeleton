organization := "hello"

name := "world"

version := "0.0.1"

scalaVersion := "2.10.0"

resolvers += "Sonatype Nexus Releases" at "https://oss.sonatype.org/content/repositories/releases"

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra-json" % "2.2.0",
  "org.scalatra" %% "scalatra" % "2.2.0",
  "org.json4s"   %% "json4s-jackson" % "3.1.0",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.4.v20120524" % "container" artifacts (Artifact("jetty-webapp", "jar", "jar")),
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container" artifacts (Artifact("javax.servlet", "jar", "jar")),
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"
)

seq(webSettings :_*)
