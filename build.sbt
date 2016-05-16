name := "solidFire-sdk-java"

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
