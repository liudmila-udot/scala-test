package scala_for_the_impatient.ch9.exercises

import java.io.File

import scala.sys.process.Process

object ShowAllScalaFiles extends App {
  println(filesScala("./src/main/scala/classes").split("\n").length)

  def filesScala(path: String) = {
    Process("find . -type f -name '*.scala'", new File(path)).!!
  }
}




