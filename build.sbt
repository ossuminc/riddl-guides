import com.ossuminc.sbt.helpers.RootProjectInfo.Keys.{gitHubOrganization, gitHubRepository}

Global / onChangedBuildSource := ReloadOnSourceChanges
(Global / excludeLintKeys) ++= Set(mainClass)
Global / scalaVersion := "3.3.3"

enablePlugins(OssumIncPlugin)

Global / scalaVersion := "3.3.3"

lazy val docsite = Root("root", "riddl-guides", "2024")
  .settings(
    gitHubOrganization := "ossuminc",
    gitHubRepository := "riddl-guides",
    description := "Generation of the guide documentation web site",
    libraryDependencies ++= Seq(
      "com.ossuminc" %% "riddl-hugo" % "0.40.0",
      "com.ossuminc" %% "riddlc" % "0.40.0"
    )
  )
