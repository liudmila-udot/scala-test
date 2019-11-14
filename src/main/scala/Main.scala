import java.time.LocalDateTime

import HelperImplicit._

object Main {

  def max(v1: Int, v2: Int) = if (v1 > v2) v1 else v2

  def main(args: Array[String]): Unit = {
    val a = "c"
    println("Hello, world2!")
    LocalDateTime.now()
    a.isInstanceOf[Any]
    val b = 3;

    val s = "Hello"
    var sum = 0
    for (j <- 0 until s.length)
      sum += s(j)

    val year = 2011;
    val month = 12;
    val day = 14;
    val x = 1;
    try {
      var date = date"$year-$month-$day"
      println(date)
    } catch {
      case ilA: IllegalArgumentException =>
        println(ilA.getMessage)
    }

    val set = Set(-1, -1, 5, 0, 3, -5, 3, -2, 10, -2)
    println(set.toArray.mkString(", "))
  }
}
