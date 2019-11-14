package classes

class Time2 (_hrs: Int, _min: Int) {
    if (_hrs < 0 || _hrs > 23) {
      throw new IllegalArgumentException(f"hrs should be between 0 and 23, entered $hrs")
    }
    if (_min < 0 || _min > 59) {
      throw new IllegalArgumentException(f"min should be between 0 and 59, entered $min")
    }
    private val minutesSinceMidnight: Int = _hrs * 60 + _min

  def before(other: Time2): Boolean = {
    minutesSinceMidnight < other.minutesSinceMidnight
  }

  def hrs: Int = {
    minutesSinceMidnight / 60
  }

  def min: Int = {
    minutesSinceMidnight % 60
  }
}
