package scala_for_the_impatient.ch7.com.horstmann.impatient

import java.util

import scala_for_the_impatient.ch7.CopyFromMap
import scala_for_the_impatient.ch7.random._

package object people {
  val defaultName = "John Q. Public"
}

package people {
  class Person {
    var name = defaultName // A constant from the package
    def description = "A person with name " + name
  }
}

// Run as scala com.horstmann.impatient.Main

object Main extends App {
  val john = new scala_for_the_impatient.ch7.com.horstmann.impatient.people.Person
  println(john.description)
  setSeed(6)
  println(nextInt())
  println(nextDouble())
  val javaMap: util.HashMap[Int, String] = new util.HashMap[Int, String]
  javaMap.put(1, "r")
  javaMap.put(2, "rr")
  val scalaMap: collection.mutable.HashMap[Int, String] = new collection.mutable.HashMap[Int, String]
  CopyFromMap.Copy.copy(javaMap, scalaMap)
  println(scalaMap)
}

