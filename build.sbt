import Dependencies._

lazy val root = (project in file("."))
  .settings(
    name := "funcrest",
    scalaVersion := "2.13.1",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies += scalaTest % Test
  )
