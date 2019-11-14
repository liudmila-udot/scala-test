package scala_for_the_impatient.ch11

class BitSequence(private var value: Long) {
  def apply(position: Int): Boolean = {
    ((value >> position) & 1) == 1
  }

  def update(position: Int, boolean: Boolean): Unit = {
    val mask = 1 << position
    value = (value & ~mask) | (((if (boolean) 1 else 0) << position) & mask)
  }

  override def toString = "%64s".format(value.toBinaryString).replace(" ", "0")
}

object BitSequence{
  def apply(value: Long): BitSequence = new BitSequence(value)
}
