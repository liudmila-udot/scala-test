class TestScalaToJava {
  def sumSqr(a: Int, b: Int): Int = {
    def sqr(x: Int) = x * x

    sqr(a) + sqr(b)
  }
}
