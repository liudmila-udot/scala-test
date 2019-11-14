package scala_for_the_impatient.ch9.exercises.p3

import scala.io.Source
import scala.util.Using

object PrintMoreThan13 extends App {
  Using(Source.fromFile("3.txt", "UTF-8")) {
    source => source.getLines()
      .foreach(s => {
        s.split("\\s").foreach(s => {
          if (s.length > 12) {
            println(s)
          }
        })
      })
  }
}
