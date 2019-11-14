import scala.util.Random

val factorial: Char => Boolean = n => {
  val value = Set('s', 'a')
  if (value.contains(n)) true else false
}

"ssssaaaa".count(factorial)

scala.math.pow(scala.math.sqrt(3), 2)

10.max(2)

scala.math.pow(2, 1024)
BigInt.apply(2).pow(1024)

BigInt.probablePrime(8, Random)

// 8
BigInt.probablePrime(100, Random).toString(36)

// 9
val str = "abcde"
str(0)
str(str.length - 1)
str.head
str.last

// 10
val str2 = "abcdefghijklmn"
str2.drop(1)
str2.take(5)
str2.takeRight(1)
str2.dropRight(1)