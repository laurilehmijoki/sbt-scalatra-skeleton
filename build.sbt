organization := "hello"

name := "world"

version := "0.0.1"

scalaVersion := "2.10.3"

resolvers += "Sonatype Nexus Releases" at "https://oss.sonatype.org/content/repositories/releases"

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra-json" % "2.2.2",
  "org.scalatra" %% "scalatra" % "2.2.2",
  "org.scalatra" %% "scalatra-specs2" % "2.2.2" % "test",
  "org.json4s"   %% "json4s-jackson" % "3.2.6",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.7.v20120910" % "container,compile",
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container,compile" artifacts Artifact( "javax.servlet", "jar", "jar")
)

seq(webSettings :_*)
