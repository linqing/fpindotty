lazy val root = (project in file(".")).
  settings(
    name := "fpindotty",
    description := "Fpinscala code compiles using Dotty",
    version := "0.1",

    // All the settings set below this line are important to get your project
    // to compile with Dotty. Please read the comments carefully.

    // Dotty version
    scalaVersion := "0.1.1-SNAPSHOT",
    scalaOrganization := "ch.epfl.lamp",

    // Enable Scala 2 compatibility mode.
    // This allows you to use Scala 2 features that have been removed
    // from Dotty, like procedure syntax, thus making it easier to test
    // Dotty on an existing Scala 2 code base.
    // A rewriting tool that can do the porting for you is currently in
    // development at https://github.com/scalacenter/scalafix
    // Note that this affects typechecking and thus may prevent some valid
    // Dotty code from compiling, so it is not enabled by default.
    // scalacOptions ++= Seq("-language:Scala2"),

    // Note: Dotty can use Scala 2.11 libraries so we set `scalaBinaryVersion`
    // to `2.11` for convenience. However, if you publish an artefact compiled
    // with Dotty, you should set it to `0.1`, this will force you to change
    // your library dependencies to be of the form `"org.foo" % "bar_2.11" % "1.0"`
    // instead of `"org.foo" %% "bar" % "1.0"`
    scalaBinaryVersion := "2.11",

    // Maintained at https://github.com/lampepfl/dotty/tree/master/sbt-bridge
    scalaCompilerBridgeSource := ("ch.epfl.lamp" % "dotty-sbt-bridge" % scalaVersion.value % "component").sources()
  )
