package scala_for_the_impatient.ch10

object Main extends App {
/*  val ell = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
  println(ell)
  ell.translate(10, 20)
  println(ell)

  println(new OrderPoint(12, 12).compare(new Point(1,1)))*/

/*  val cl = new CryptoLoggerImpl()
  val e = cl.encrypt("i am here")
  println(f"Encrypted: $e")
  println(f"Decrypted: ${cl.decrypt(e)}")
  cl.setKey(5)
  val e5 = cl.encrypt("i am here")
  println(f"Encrypted: $e5")
  println(f"Decrypted: ${cl.decrypt(e5)}")*/

/*  val pointWithPropertyChangeSupport = new java.awt.Point(12,12) with PropertyChangeSupportLike {
    override def setLocation(x: Int, y: Int): Unit = {
      firePropertyChange("x", this.x, x)
      firePropertyChange("y", this.y, y)
      move(x, y)
    }
  }
  pointWithPropertyChangeSupport.addPropertyChangeListener(
    (evt: PropertyChangeEvent) => {
      println(f"something changed $evt")
    }
  )
  pointWithPropertyChangeSupport.setLocation(4,6)*/


}
