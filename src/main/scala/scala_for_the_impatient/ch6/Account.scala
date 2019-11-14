package scala_for_the_impatient.ch6

class Account {
  val id = Account.newUniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double) { balance += amount }
  def description = "Account " + id + " with balance " + balance
}

object Account { // The companion object
  private var lastNumber = 123
  private def newUniqueNumber() = { lastNumber += 1; lastNumber }
}
