package scala_for_the_impatient.ch11

class Money(d: Int, c: Int) {
  private val dollar: Int = d + c / 100
  private val cent: Int = c % 100

  override def toString = dollar + "." + cent

  def +(other: Money): Money = {
    new Money(dollar + other.dollar, cent + other.cent)
  }
}

object Money {
  def apply(d: Int, c: Int) = new Money(d, c)
}
