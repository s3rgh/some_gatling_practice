enablePlugins(GatlingPlugin)

name := "gatling"

version := "0.1"

scalaVersion := "2.13.6"

scalacOptions := Seq(
  "-encoding", "UTF-8", "-target:jvm-1.8", "-deprecation",
  "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")


val gatlingVersion = "3.6.0"
libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion % "test"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % gatlingVersion % "test"
libraryDependencies += "ch.qos.logback"        % "logback-classic"           % "1.2.3"
libraryDependencies += "org.codehaus.janino"   % "janino"                    % "3.1.3"
