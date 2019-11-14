package scala_for_the_impatient.ch6

class Account2 private (val id: Int, initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) { balance += amount }
  def description = "Account " + id + " with balance " + balance
}

object Account2 { // The companion object
  def apply(initialBalance: Double) =
    new Account2(newUniqueNumber(), initialBalance)
  private var lastNumber = 0
  private def newUniqueNumber() = { lastNumber += 1; lastNumber }
}
