(x: Int) => x * x
(x: Int, y: Int) => x + y

res0(5)
res1(2, 5)

val sqr = (x: Int) => x * x
val sum = (x: Int, y: Int) => x + y

sqr(5)
sum(2, 5)

sqr.isInstanceOf[Any]

val sqr1 = new Function1[Int, Int] {
  override def apply(v1: Int) = v1 * v1
}
sqr1(7)
val sum1 = new Function2[Int, Int, Int] {
  override def apply(v1: Int, v2: Int) = v1 + v2
}
sum1(12, 89)
sum1.apply(4, 5)

val sum2: (Int, Int) => Int = (x, y) => x + y
val sum3: (Int, Int) => Int = _ + _
val sum4 = (_: Int) + (_: Int)

val factorial: Int => Int = n =>
  if (n == 0) 1 else n * factorial(n - 1)

factorial(4)

val sumSqr = (x: Int, y: Int) => sum(sqr(x), sqr(y))

sumSqr(10, 5)

val sumSqr2 = (x: Int, y: Int) => {
  val x1 = sqr(x)
  val x2 = sqr(y)
  sum(x1, x2)
}

sumSqr2(10, 5)

val sumSqr3: (Int, Int) => Int = { (x, y) =>
  val x1 = sqr(x)
  val x2 = sqr(y)
  sum(x1, x2)
}