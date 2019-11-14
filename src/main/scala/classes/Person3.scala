package classes

class Person3(val name: String = "", val age: Int = 0) {
  println("Just constructed another person")
  def description = name + " is " + age + " years old"
}

