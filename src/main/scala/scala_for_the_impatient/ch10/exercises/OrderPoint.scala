package scala_for_the_impatient.ch10.exercises

import java.awt.Point

class OrderPoint(x: Int, y: Int) extends java.awt.Point(x, y) with Ordered[java.awt.Point] {
  override def compare(that: Point): Int = {
    if (this.x == that.x)
      this.y.compare(that.y)
    else
      this.x.compare(that.x)
  }
}
