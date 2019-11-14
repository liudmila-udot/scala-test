package classes

class Time(_hrs: Int, _min: Int) {
  if (hrs < 0 || hrs > 23) {
    throw new IllegalArgumentException(f"hrs should be between 0 and 23, entered $hrs")
  }
  if (min < 0 || min > 59) {
    throw new IllegalArgumentException(f"min should be between 0 and 59, entered $min")
  }
  val hrs: Int = _hrs
  val min: Int = _min

  def before(other: Time): Boolean = {
    _hrs < other.hrs || (hrs == other.hrs && min < other.min)
  }
}
