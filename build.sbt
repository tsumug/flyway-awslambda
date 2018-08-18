
lazy val flywayAwsLambda = (project in file(".")).settings(
  organization := "crossroad0201.aws",
  name := "flyway-awslambda",
  version := "0.3.0",
  scalaVersion := "2.12.0",

  assemblyJarName := s"${name.value}-${version.value}.jar",
  test in assembly := {},

  libraryDependencies ++= Seq(
    // Flyway
    "org.flywaydb" % "flyway-core" % "5.1.4",
    "mysql" % "mysql-connector-java" % "8.0.12", // Flyway supports only Ver.6 higher.
    "org.postgresql" % "postgresql" % "42.2.4",

    // AWS
    "com.amazonaws" % "aws-lambda-java-core" % "1.2.0",
    "com.amazonaws" % "aws-lambda-java-events" % "2.2.2",
    "com.amazonaws" % "aws-java-sdk-s3" % "1.11.390",

    // Json
    "io.spray" %%  "spray-json" % "1.3.4",

    // Test
    "org.scalatest" %% "scalatest" % "3.0.5" % Test
  )
)
