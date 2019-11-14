package scala_for_the_impatient.ch8.exercises.n8

class Person(val name: String) {
  override def toString = getClass.getName + "[name=" + name + "]"
}
