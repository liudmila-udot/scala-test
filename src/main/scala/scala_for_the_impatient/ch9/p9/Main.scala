package scala_for_the_impatient.ch9.p9

import scala.sys.process._

object Main extends App {
  "ls -al ..".!
  val varPattern = """\$[0-9]+""".r
  def format(message: String, vars: String*) =
    varPattern.replaceSomeIn(message, m => vars.lift(
      m.matched.tail.toInt))
  format("At $1, there was $2 on $0.",
    "planet 7", "12:30 pm", "a disturbance of the force")
}
