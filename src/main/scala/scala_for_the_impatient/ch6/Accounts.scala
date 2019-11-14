package scala_for_the_impatient.ch6

object Accounts {
  private var lastNumber = 0

  def newUniqueNumber() = {
    lastNumber += 1; lastNumber
  }
}