package scala_for_the_impatient.ch8.exercises

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {

  def charge1$(): Unit ={
    withdraw(1)
  }

  override def deposit(amount: Double): Double = {
    charge1$
    super.deposit(amount)
  }

  override def withdraw(amount: Double): Double = {
    charge1$
    super.withdraw(amount)
  }
}
