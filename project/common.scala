
import com.typesafe.sbt.osgi.SbtOsgi
import com.typesafe.sbt.osgi.SbtOsgi.autoImport._
import sbt.Keys._
import sbt._

object Config {
  lazy val javaCompilerOptions = Seq(
    "-source", Version.javaLanguage,
    "-target", Version.javaTarget,
    "-Xlint",
    "-g"
  )

  val isJdk8 = System.getProperty( "java.version" ).startsWith( "1.8" )

  lazy val javadocOptions = if (isJdk8) Seq(
    "-Xdoclint:none"
  )
  else Seq( )

  lazy val allJavadocOptions = javadocOptions ++ Seq(
    "-noqualifier",
    "all",
    "-stylesheetfile",
    "internal-element-api/src/main/resources/solidfire-javadoc.css",
    "-header",
    s"""<img><br/><b>Solidfire Java SDK</b><br/>v${Version.solidfireSdks}""",
    "-bottom",
    s"""<b>Copyright &copy 2014-2016 NetApp, Inc. All Rights Reserved.</b>"""
  )

  lazy val scalaCompilerOptions = Seq(
    "-deprecation",
    "-encoding", "UTF-8", // yes, this is 2 args
    "-feature",
    "-language:existentials",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-unchecked",
    "-Xfatal-warnings",
    "-Xlint",
    "-Yno-adapted-args",
    "-Ywarn-numeric-widen",
    "-Ywarn-value-discard",
    "-Xfuture"
  )

  lazy val pomExtra = {
    <url>https://github.com/solidfire/solidfire-sdk-java</url>
      <licenses>
        <license>
          <name>Apache 2</name>
          <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
        </license>
      </licenses>
      <scm>
        <connection>scm:git:github.com/solidfire/solidfire-sdk-java</connection>
        <developerConnection>scm:git:git@github.com:solidfire/solidfire-sdk-java</developerConnection>
        <url>github.com/solidfire/solidfire-sdk-java</url>
      </scm>
      <developers>
        <developer>
          <id>jason-womack</id>
          <name>Jason Ryan Womack</name>
          <url>https://github.com/jason-womack</url>
        </developer>
      </developers>
  }

  lazy val org = "com.solidfire"

  lazy val orgName = "SolidFire, Inc."

  lazy val settings = Defaults.coreDefaultSettings ++ Seq(
    javacOptions ++= javaCompilerOptions,
    javacOptions in doc := javadocOptions,
    scalacOptions ++= scalaCompilerOptions,
    scalaVersion := "2.10.6",
    version := Version.solidfireSdks,
    organization := org,
    resolvers := repositories,
    crossPaths := false, // do not append _${scalaVersion} to generated JAR
    autoScalaLibrary := false, // do not add Scala libraries as a dependency
    unmanagedSourceDirectories in Compile += baseDirectory.value / "src/generated/java",
    unmanagedSourceDirectories in Compile += baseDirectory.value / "src/generated/scala",
    libraryDependencies ++= Seq(
      Dependencies.slf4j,
      Dependencies.jsvcgenClient,
      Dependencies.slf4jSimple,
      Dependencies.mockito,
      Dependencies.scalatest,
      Dependencies.scalacheck
    )
  )

  lazy val repositories = List(
    "Maven Central" at "http://repo1.maven.org/maven2/",
    "Sonatype Snapshots" at "https://oss.sonatype.org/content/groups/public/",
    "Sonatype Snapshots Staging" at "https://oss.sonatype.org/content/groups/staging/"
  )

  lazy val junitReports = testOptions in Test <+= (target in Test) map { target =>
    val reportTarget = target / "test-reports"
    Tests.Argument( TestFrameworks.ScalaTest, s"""junitxml(directory="$reportTarget")""" )
  }
}

object Version {
  val solidfireSdks = "1.1.0.1-SNAPSHOT"

  val javaLanguage  = "1.7"
  val javaTarget    = "1.7"

  val jsvcgenClient = "0.2.9-SNAPSHOT"
  val slf4j         = "1.6.6"

  val scalatest     = "2.2.6"
  val junit         = "0.11"
  val mockito       = "1.10.19"
  val scalacheck    = "1.13.0"
}

object Dependencies {
  lazy val jsvcgenClient  = "com.solidfire" % "jsvcgen-client-java" % Version.jsvcgenClient
  lazy val slf4j          = "org.slf4j"     % "slf4j-api"           % Version.slf4j

  lazy val slf4jSimple  = "org.slf4j"       %  "slf4j-simple"    % Version.slf4j        % "test"
  lazy val scalatest    = "org.scalatest"   %% "scalatest"       % Version.scalatest    % "test"
  lazy val mockito      = "org.mockito"     %  "mockito-all"     % Version.mockito      % "test"
  lazy val scalacheck   = "org.scalacheck"  %% "scalacheck"      % Version.scalacheck   % "test"
}

object SDKBuild extends Build {

  lazy val elementApi = Project(id = "solidfire-java-sdk",
    base = file("."),
    settings = Config.settings
  ).settings(
    version := (version in ThisBuild).value,
    description := "OSGi bundle for interfacing with the Public and Incubating SolidFire Element API.",
    OsgiKeys.exportPackage := Seq("com.solidfire.client","com.solidfire.javautil","com.solidfire.serialization","com.solidfire.annotation","com.solidfire.element.api")
  ).settings(
    addArtifact(artifact in (Compile, OsgiKeys.bundle), OsgiKeys.bundle).settings: _*
  ).enablePlugins( SbtOsgi )

}