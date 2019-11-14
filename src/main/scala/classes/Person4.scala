package classes

class Person4(firstAndLastName: String) {
  private val split = firstAndLastName.split(" ")
  val firstName: String = split(0)
  val lastName: String = split(1)
}
