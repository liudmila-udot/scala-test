// 1. signum

def signum(a: Int) =
  if (a > 0) 1
  else if (a == 0) 0
  else -1

signum(0)
signum(6)
signum(-6)

// 2. Unit
// 3
var y: Int = 0
var x: Unit = ()
x = y = 1

// 4
for (i <- 10 to 0 by -1)
  println(i)

// 5
def countdown(n: Int) {
  for (i <- n to 0 by -1)
    println(i)
}

countdown(5)

// 6
var product = BigInt.apply(1)
for (ch <- "Hello") product = product.*(BigInt.apply(ch))
product

// 7
"Hello".toSeq.map(ch=>BigInt.apply(ch)).product
"Hello".toSeq.map(ch=>BigInt.apply(ch)).reduce((a, b) => a * b)

// 8
def product(s: String): BigInt =
s.toSeq.map(ch=>BigInt.apply(ch)).product

product("Hello")

//9 make recursive
def productRecursive(s: String): BigInt =
  if (s.length == 1)
    BigInt.apply(s.head)
  else
    productRecursive(s.tail) * BigInt.apply(s.head)

productRecursive("Hello")

// 10

def powRec(number: Double, power: Int): Double = {
  if (power > 0 && power % 2 == 0)
    powRec(number, power/2)* powRec(number, power/2)
  else if (power > 0 && power % 2 == 1)
    number * powRec(number, power - 1)
  else if (power == 0)
    1
  else
    1 / powRec(number, -power)
}

powRec(10,-1)