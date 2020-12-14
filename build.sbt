import de.johoop.jacoco4sbt.XMLReport

name := "solidFire-sdk-java"

val major_version = "1"

val minor_version = "7"

val patch_version = "0"

lazy val build_number = sys.env.get("BUILD_NUMBER")

def isBlank(input: Option[String]): Boolean = 
  input.filterNot(s => s == null || s.trim.isEmpty).isEmpty

val my_build_number = if (isBlank(build_number)){
    "123"
} else {
    build_number.get
}

version := major_version + "." + minor_version + "." + patch_version + "." + my_build_number

exportJars := false

fork in run := true

ivyConfiguration <<= (externalResolvers, ivyPaths, offline, checksums, appConfiguration, target, streams) map { ( rs, paths, off, check, app, t, s ) =>
  val resCacheDir = t / "resolution-cache"
  new InlineIvyConfiguration( paths, rs, Nil, Nil, off, None, check, Some( resCacheDir ), s.log )
}

evictionWarningOptions in update := EvictionWarningOptions.default.withWarnTransitiveEvictions( false ).withWarnDirectEvictions( false ).withWarnScalaVersionEviction( false )

logLevel := Level.Info

testOptions += Tests.Argument( TestFrameworks.JUnit, "-q", "-v" )

packageOptions in(Compile, packageBin) += Package.ManifestAttributes(
  java.util.jar.Attributes.Name.IMPLEMENTATION_VERSION -> version.value
)

jacoco.settings

jacoco.excludes        in jacoco.Config := Seq("*Request*", "*Result*", "*Example*", "*SolidFire*", "*api*", "*generated*")

Keys.fork              in jacoco.Config := true

parallelExecution      in jacoco.Config := false

jacoco.reportFormats   in jacoco.Config := Seq( XMLReport(encoding = "utf-8"))

// Remove any scala sources so that documentation is build with javadoc
sources in (Compile, doc) <<= sources in (Compile, doc) map { _.filterNot(_.getName endsWith ".scala") }

