package scala_for_the_impatient.ch6

object InchesToCentimeters extends UnitConversion {
  override def convert(inches: Double): Double = {
    inches * 2.54
  }
}
