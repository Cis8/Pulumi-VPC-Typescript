val scala3Version = "3.2.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "VPC-pulumi",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies += "com.google.guava" % "guava" % "17.0",
    libraryDependencies += "com.pulumi" % "aws" % "5.32.0",
  )
