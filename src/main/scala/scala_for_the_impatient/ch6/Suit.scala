package scala_for_the_impatient.ch6

object Suit extends Enumeration {
  type Suit = Value
  val Heart = Value("♥")
  val Spade = Value("♠")
  val Club = Value("♣")
  val Diamond = Value("♦")

  def red(suit: Suit): Boolean = {
    suit == Heart || suit == Spade
  }
}
