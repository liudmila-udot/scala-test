package classes

object Main {
  def main(args: Array[String]): Unit = {
    val counter: Counter = new Counter(Int.MaxValue);
    counter.increment()
    println(counter.current())
    val person: Person3 = new Person3();
    val ba = new BankAccount(100);
    ba.withdraw(20);
    ba.deposit(30)
    println(ba.balance)

    val time1 = new Time2(3, 45)
    println(time1.before(new Time2(11, 43)))

    println(new Person(-2).age);
    println(new Person4("Anna Im").lastName)
  }
}
