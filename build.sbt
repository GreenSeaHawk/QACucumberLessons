name := "qacohortproject"

version := "0.1"
scalaVersion := "2.13.12"

// Add Maven Central properly
resolvers += Resolver.mavenCentral

libraryDependencies ++= Seq(
  "io.cucumber" %% "cucumber-scala" % "8.28.0" % Test, // Should be % Test
  "io.cucumber" % "cucumber-junit" % "7.23.0" % Test,
  "org.seleniumhq.selenium" % "selenium-java" % "4.33.0",
  "org.scalatest" %% "scalatest" % "3.2.19" % Test,
  "junit" % "junit" % "4.13.2" % Test,
  "commons-io" % "commons-io" % "2.19.0",
  "net.bytebuddy" % "byte-buddy" % "1.17.6", // Added later
  "net.java.dev.jna" % "jna" % "5.17.0" // Added later
)

