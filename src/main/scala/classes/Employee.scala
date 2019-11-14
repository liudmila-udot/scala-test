package classes

class Employee {
  var _name: String = ""
  var salary: Double = 0

  def this(_name: String = "John Q. Public", _salary: Double = 0) {
    this()
    this._name = _name
    this.salary = _salary
  }

  def name = {
    _name
  }
}