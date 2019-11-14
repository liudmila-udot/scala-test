package scala_for_the_impatient.ch11

object Main extends App {
  /*  Thread.`yield`()
    // associate key with the value
    1.->(10)
    var Fraction(a, b) = Fraction(3, 4) * Fraction(2, 5)
    println(a)
    println(b)*/

    val sysProps = new DynamicProps(System.getProperties)
    sysProps.username = "Fred"
    println(sysProps.java.home)
    sysProps.add(username="Fred", password="Secret")
    println(sysProps.props)

  //println(Fraction(1, 8) + Fraction(1, 8))
  //println(Money(1, 75) + Money(0, 50))
  //val table = Table() | "Java"  | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
  //println(table)
  //println((Cat-Chat)|Cat)

  /*  val bs = BitSequence(12)
    println(bs)
    println(bs(2))
    bs(0) = true
    println(bs)*/

  /* val m = Matrix(Array(Array(1, 2), Array(8, 3))) + Matrix(Array(Array(0, 0), Array(2, 0)))
   println(m)
   println(m(1, 0))

   println(m(1, 0))

   println(Matrix(Array(Array(1, 0, -2), Array(0, 3, -1)))
     * Matrix(Array(Array(0, 3), Array(-2, -1), Array(0, 4)))
   )

   println(Matrix(Array(Array(1, 0, -2), Array(0, 3, -1)))
     * 5
   )*/
  /*val PathComponents(dir, fn) = Paths.get("/home/cay/readme.txt")
  println(dir)
  println(fn)*/
/*  println(PathComponents.unapplySeq(Paths.get("/home/cay/readme.txt")))
  val PathComponents(a, b, c) = Paths.get("/home/cay/readme.txt")
  println(b)*/
}
