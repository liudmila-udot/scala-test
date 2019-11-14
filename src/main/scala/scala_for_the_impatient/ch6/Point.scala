package scala_for_the_impatient.ch6

class Point(x: Int = 0, y: Int = 0) extends java.awt.Point(x, y) {
}

object Point {
  def apply(x: Int, y: Int) =
    new Point(x, y)
}
