package scala_for_the_impatient.ch9.exercises.p5

import java.io.PrintWriter

import scala.util.Using

object PowerOfTwo extends App {
  Using(new PrintWriter("5_out.txt")) {
    out=> val maxLength = Math.pow(2, 20).toInt.toString.length
    for (i <- 0 to 20) {
      out.printf(f"%%-${maxLength}s| %%s%n", Math.pow(2, i).toInt, 1 / Math.pow(2, i))
      printf(f"%%-${maxLength}s| %%s%n", Math.pow(2, i).toInt, 1 / Math.pow(2, i))
    }
  }
}
