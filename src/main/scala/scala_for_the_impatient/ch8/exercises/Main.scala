package scala_for_the_impatient.ch8.exercises

import scala_for_the_impatient.ch8.exercises.n9.Ant

object Main extends App {
/*  val acc = new SavingsAccount(12)
  acc.deposit(1)
  acc.deposit(1)
  acc.deposit(1)
  acc.deposit(1)
  println(acc.currentBalance)

  val i1 = new SimpleItem(12, "table")
  val i2 = new SimpleItem(price = 24, description = "couch")
  val b = new Bundle()
  b.addItem(i1)
  b.addItem(i2)
  b.addItem(new SimpleItem(20, "closet"))
  println(b.price)
  println(b.description)
  println(14.0/3)
  println(new Square())*/
/*  val sa = new SecretAgent("John")
  println(sa.name)
  println(sa.asInstanceOf[Person].name)*/
  println((new Ant).env.length)
}
