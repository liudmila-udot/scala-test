package scala_for_the_impatient.ch9.exercises

import scala.io.Source
import scala.util.Using

object PrintSrcOfImgTags extends App {
  Using(Source.fromURL("http://www.visitgreece.gr/en/nature/forests")) {
    source =>
      val pattern = """<img.+src="(.+)".+>""".r
      pattern.findAllMatchIn(source.mkString)
        .foreach(m => println(m.group(1)))
  }
}
