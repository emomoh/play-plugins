import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "j"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
       "com.typesafe" % "play-plugins-guice" % "2.0-RC4"
      
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}
