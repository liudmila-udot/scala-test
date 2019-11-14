package scala_for_the_impatient.ch11

import java.nio.file.Path

class PathComponents(private val path: java.nio.file.Path) {

}

object PathComponents {
  def apply(path: Path): PathComponents = new PathComponents(path)
/*

    def unapply(arg: Path): Option[(String, String)] = {
      if (arg == null)
        None
      else
        Some(arg.getParent.toString, arg.getFileName.toString)
    }
  */

  def unapplySeq(arg: Path): Option[Seq[String]] =
    if (arg == null) None else Some(arg.toString.trim.split("/")
      .filter(s => s != null && !s.trim.isEmpty))
}
