package scala_for_the_impatient.ch8.exercises.n5

class Square(val point: Point = new Point(0, 0), val side: Double = 0)
  extends java.awt.Rectangle(point.x.intValue(), point.y.intValue, side.intValue(), side.intValue()) {

}
