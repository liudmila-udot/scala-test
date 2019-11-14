package scala_for_the_impatient.ch9.exercises.p2

import java.io.PrintWriter

import scala.io.Source

object ReplaceTabWithWhitespace extends App {
  val source = Source.fromFile("2.txt", "UTF-8")
  val arr = source.getLines.toArray[String]
  source.close()
  val out = new PrintWriter("2_out.txt")
  val pattern = """\t""".r
  arr.foreach(s => out.println(pattern.replaceAllIn(s, " ")))
  out.close()
}
