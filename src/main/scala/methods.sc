

val a = 1

val add = (a: Int, b: Int) => a + b
val add1: (Int, Int) => Int = (a, b) => a + b

def max(a: Int, b: Int): Int =
  if (b > a) b else a

max(2, 6)

def sumSqr(a: Int, b: Int): Int = {
  def sqr(x: Int) = x * x

  if (a + b > 100)
    return 1
  sqr(a) + sqr(b)
}

sumSqr(3, 5)

