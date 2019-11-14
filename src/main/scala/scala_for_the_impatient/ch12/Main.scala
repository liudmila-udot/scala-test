package scala_for_the_impatient.ch12

object Main extends App {
  val fun = scala.math.ceil _
  val f: Double => Double = scala.math.ceil

  val f1 = (_: String).charAt(_: Int)
  val f2: (String, Int) => Char = _.charAt(_)

  fun(5)
  Array(3.14, 1.42, 2.0).map(fun)

  (x: Double) => 3 * x

  val triple = (x: Double) => 3 * x

  Array(3.14, 1.42, 2.0).map(triple)

  Array(3.14, 1.42, 2.0).map((x: Double) => 3 * x)

  Array(3.14, 1.42, 2.0) map { (x: Double) => 3 * x }

  def valueAtOneQuarter(f: (Double) => Double) = f(0.25)

  valueAtOneQuarter(scala.math.ceil _)
  valueAtOneQuarter(scala.math.sqrt _)

  def mulBy(factor: Double) = (x: Double) => factor * x

  val quintuple = mulBy(5)
  println(quintuple(20))

  println(mulBy(5)(20))

  (1 to 9).map("*" * _).foreach(println)

  (1 to 9).filter(_ % 2 == 0).foreach(println)

  (1 to 9).reduceLeft(_ * _)

  "Mary had a little lamb".split(" ").sortWith(_.length < _.length)

  val a = Array("Hello", "World")
  val b = Array("hello", "world")
  a.corresponds(b)(_.equalsIgnoreCase(_))

 /* def runInThread(block: => Unit) {
    new Thread {
      override def run() {
        block
      }
    }.start()
  }

  runInThread {
    println("Hi"); Thread.sleep(10000); println("Bye")
  }*/

  def until(condition: => Boolean)(block: => Unit) {
    if (!condition) {
      block
      until(condition)(block)
    }
  }

  var x = 10
  until (x == 0) {
    x -= 1
    println(x)
  }

  def indexOf(str: String, ch: Char): Int = {
    var i = 0
    try {
      until (i == str.length) {
        if (str(i) == ch) return i
        i += 1
      }
    } catch {
      case t: Throwable => println(t)
    }
    -1
  }

  indexOf("aaaa", 'g')
}
