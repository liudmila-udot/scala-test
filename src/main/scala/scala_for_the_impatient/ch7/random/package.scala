package scala_for_the_impatient.ch7

package object random {
  private var seed = 0

  def setSeed(seed: Int): Unit = {
    this.seed = seed
  }

  def nextInt(): Int = {
    (nextDouble() % Int.MaxValue.toDouble).toInt
  }

  def nextDouble(): Double = {
    val ret = (seed * 1664525 + 1013904243L) % Math.pow(2, 32)
    seed = (ret % Int.MaxValue.toDouble).toInt
    ret
  }
}
