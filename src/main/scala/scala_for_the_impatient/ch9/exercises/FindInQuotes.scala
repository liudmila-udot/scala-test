package scala_for_the_impatient.ch9.exercises

import scala.io.Source
import scala.util.Using

object FindInQuotes extends App {
  Using(Source.fromFile("6.txt", "UTF-8")) {
    source =>
      val patternQuotes = """"([^"]*)"""".r
      patternQuotes.findAllIn(source.mkString)
        .foreach(println(_))
  }
}
