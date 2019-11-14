package scala_for_the_impatient.ch8.exercises.n5

class Rectangle(val bottomLeftPoint: Point, height: Double, width: Double) extends Shape {
  override def centerPoint: Point = {
    new Point(bottomLeftPoint.x + width / 2, bottomLeftPoint.y + height / 2)
  }
}
