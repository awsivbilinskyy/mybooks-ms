name := "books-ms"

version := "1.0"
scalaVersion := "2.11.2"

resolvers += "spray" at "http://repo.spray.io/"

libraryDependencies ++= {
  val sprayV = "1.3.1"
  val specs2V = "2.3.12"
  Seq(
    "io.spray"                  %   "spray-can"       % sprayV,
    "io.spray"                  %   "spray-routing"   % sprayV,
    "io.spray"                  %%  "spray-json"      % "1.3.1",
    "com.novus"                 %%  "salat"           % "1.9.8",
    "org.slf4j"                 %   "slf4j-api"       % "1.7.7",
    "ch.qos.logback"            %   "logback-classic" % "1.0.3",
    "io.spray"                  %   "spray-testkit"   % sprayV    % "test",
    "org.specs2"                %%  "specs2-core"     % specs2V   % "test",
    "org.scalaj"                %%  "scalaj-http"     % "1.1.4"
  )
}

dependencyOverrides ++= Seq(
    "com.typesafe.akka"         %%  "akka-actor"      % "2.4.4",
    "org.mongodb"               %%  "casbah"          % "3.1.1"
)

test in assembly := {}