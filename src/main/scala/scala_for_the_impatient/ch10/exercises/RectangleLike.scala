package scala_for_the_impatient.ch10.exercises

trait RectangleLike {

  def getX: Double

  def getY: Double

  def getWidth: Double

  def getHeight: Double

  def setFrame(x: Double, y: Double, w: Double, h: Double): Unit

  def translate(dx: Int, dy: Int): Unit = {
    setFrame(getX + dx, getY + dy, getWidth, getHeight)
  }

  def grow(dx: Double, dy: Double) = {
    setFrame(getX - dx, getY - dy, getWidth + 2 * dx, getHeight + 2 * dy)
  }

  override def toString = s"RectangleLike($getX, $getY, $getWidth, $getHeight)"
}
