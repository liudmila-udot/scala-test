package classes

class BankAccount(private var _balance: Int = 0) {
  def deposit(amount: Int) = {
    _balance += amount
  }

  def withdraw(amount: Int) = {
    _balance -= amount
  }

  def balance = _balance
}
