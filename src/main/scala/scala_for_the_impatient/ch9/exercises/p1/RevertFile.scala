package scala_for_the_impatient.ch9.exercises.p1

import java.io.PrintWriter

import scala.io.Source

object RevertFile extends App {
  val source = Source.fromFile("mary.txt", "UTF-8")
  val arr = source.getLines.toArray[String]
  source.close()
  val out = new PrintWriter("mary.txt")
  arr.reverse.foreach(out.println)
  out.close()
}
