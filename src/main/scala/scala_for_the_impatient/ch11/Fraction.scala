package scala_for_the_impatient.ch11

import scala.math._

class Fraction(n: Int, d: Int) {
  private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d);
  private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d);

  override def toString = num + "/" + den

  def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0

  def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

  def *(other: Fraction) = new Fraction(num * other.num, den * other.den)

  def +(other: Fraction): Fraction = {
    new Fraction(num * other.den + other.num * den, den * other.den)
  }
}

object Fraction {
  def apply(n: Int, d: Int) = new Fraction(n, d)

  def unapply(input: Fraction) =
    if (input.den == 0) None else Some((input.num, input.den))
}