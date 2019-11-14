package scala_for_the_impatient.ch7

object Task9 extends App {
  val userName = System.getProperty("user.name")
  println(userName)
  val password = scala.io.StdIn.readLine()
  if (!"secret".equals(password)){
    Console.err.println("Wrong password")
  } else {
    println(f"Hello $userName")
  }
}
