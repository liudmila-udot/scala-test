package scala_for_the_impatient.ch9.exercises.p4

import scala.io.Source
import scala.util.Using

object ReadNumbers extends App {
  Using(Source.fromFile("4.txt", "UTF-8")) {
    source=>
      val numbers = source.mkString.split("\\s+")
      .map(_.toDouble)
      println(f"sum: ${numbers.sum}\n" +
        f"min: ${numbers.min}\n" +
        f"max: ${numbers.max}\n"+
        f"av: ${numbers.sum/numbers.length}")
  }
}
