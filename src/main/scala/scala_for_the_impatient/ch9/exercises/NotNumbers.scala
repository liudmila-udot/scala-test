package scala_for_the_impatient.ch9.exercises

import scala.io.Source
import scala.util.Using

object NotNumbers extends App {
  Using(Source.fromFile("7.txt", "UTF-8")) {
    source =>
      val pattern = "\\d+[\\.,]\\d+"
      source.mkString.split("\\s+").foreach(
        s => {
          if (!s.matches(pattern)) {
            println(s)
          }
        }
      )
  }
}
