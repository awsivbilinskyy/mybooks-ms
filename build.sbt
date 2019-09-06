name := "books-ms"

version := "1.0"

resolvers += "spray" at "http://repo.spray.io/"

libraryDependencies ++= {
  val akkaV = "2.5.9"
  val sprayV = "1.3.5"
  val specs2V = "2.3.12"
  Seq(
    "io.spray"                  %   "spray-can"       % sprayV,
    "io.spray"                  %   "spray-routing"   % sprayV,
    "io.spray"                  %%  "spray-json"      % "1.2.6",
    "com.typesafe.akka"         %%  "akka-actor"      % akkaV,
    "org.mongodb"               %%  "casbah"          % "3.1.1",
    "com.novus"                 %%  "salat"           % "1.9.8",
    "org.slf4j"                 %   "slf4j-api"       % "1.7.7",
    "ch.qos.logback"            %   "logback-classic" % "1.0.3",
    "io.spray"                  %   "spray-testkit"   % sprayV    % "test",
    "org.specs2"                %%  "specs2-core"     % specs2V   % "test",
    "org.scalaj"                %%  "scalaj-http"     % "1.1.4"
  )
}

test in assembly := {}