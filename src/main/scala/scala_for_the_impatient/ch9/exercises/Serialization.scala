package scala_for_the_impatient.ch9.exercises

import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}

import scala_for_the_impatient.ch9.Person

object Serialization extends App {
  val fred = new Person("Fred")
  val wilma = new Person("Wilma")
  val barney = new Person("Barney")
  fred.friends += wilma
  fred.friends += barney
  wilma.friends += barney
  barney.friends += fred

  val out = new ObjectOutputStream(new FileOutputStream("test.obj"))
  out.writeObject(fred)
  out.close()
  val in = new ObjectInputStream(new FileInputStream("test.obj"))
  val savedFred = in.readObject().asInstanceOf[Person]
  in.close()

  savedFred.description
  println(savedFred.description)
  savedFred.friends.foreach(f=>{
    println(f.description)
  })
}
