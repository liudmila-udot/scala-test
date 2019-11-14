package scala_for_the_impatient.ch8.exercises

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  val feeFreeTxCount = 3
  var txCount = 0

  def resetTxCount(): Unit = {
    txCount = 0
  }

  def incTxCount(): Unit = {
    txCount += 1
  }

  def charge1$(): Unit = {
    if (txCount > feeFreeTxCount) {
      super.withdraw(1)
    }
  }

  override def deposit(amount: Double): Double = {
    incTxCount()
    charge1$()
    super.deposit(amount)
  }

  override def withdraw(amount: Double): Double = {
    incTxCount()
    charge1$()
    super.withdraw(amount)
  }

  def earnMonthlyInterest(): Unit = {
    super.deposit(currentBalance / 10)
    resetTxCount()
  }
}
