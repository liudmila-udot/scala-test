package classes

class Counter(private var value: Int = 0) {
  def increment() {
    if (value < Int.MaxValue) {
      value += 1
    }
  } // Methods are public by default
  def current() = value
}
