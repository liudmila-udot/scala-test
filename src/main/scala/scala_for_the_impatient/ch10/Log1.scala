package scala_for_the_impatient.ch10

trait Log1 {

  var a = 5

  def log(msg: String): Unit = {
    println("1" + a)
  }
}
