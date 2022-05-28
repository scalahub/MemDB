name := "MemDB"

version := "1.0"

updateOptions := updateOptions.value.withLatestSnapshots(false)

scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-collection-compat" % "2.1.3",
  "org.bouncycastle"        % "bcprov-jdk15on"          % "1.61",
  "net.snaq"                % "dbpool"                  % "7.0.1",
  "com.h2database"          % "h2"                      % "1.4.199"
)

lazy val root = (project in file("."))
  .settings(
    updateOptions := updateOptions.value.withLatestSnapshots(false)
  )
