package scala_for_the_impatient.ch9

import java.io._
import scala.collection.mutable.ArrayBuffer

class Person(val name: String) extends Serializable {
  val friends = new ArrayBuffer[Person]
  // OK—ArrayBuffer is serializable
  def description = name + " with friends " +
    friends.map(_.name).mkString(", ")
}
