var x = 2
// if returns value
var y = if (x > 0) 1 else -1

if (x > 0) 1 else "positive"

if (x > 0) 1
else if (x == 0) "positive"
else 0
// no switch
// no need for ; except
if (x > 0) {
  var v = 1;
  v = v * v
}
// blocks
x = 6;
y = 6;
var x0 = 5;
var y0 = 0;
val distance = {
  val dx = x - x0;
  val dy = y - y0;
  math.sqrt(dx * dx + dy * dy)
}
// unit type block
var r = 0;
var n = 0;
var t = {
  r = r * n;
  n = n - r
}

// input output
print("Answer " + 42)
println("Answer " + 42)

val name = "Lucy"
val age = 33

// "%n" always outputs the correct platform-specific line separator,
// it is portable across platforms whereas"\n" is no
printf("Hello, %s! You are %d years old.%n", name, age)

// A formatted string is prefixed with the letter f.
// 7.2f formatted as floating point number of width 7 and precision 2
print(f"Hello, $name! In six months, you'll be ${age + 0.5}%7.2f years old.%n")

// Using the f interpolator is better
// than using the printf method because it is type-safe

// for loop
val s = "Hello"
var sum = 0
for (j <- 0 until s.length)
  sum += s(j)
sum

for (w <- 0 to 10) {
  print(f"$w ");
}

var sum1 = 0
for (ch <- "Hello") sum1 += ch
sum1

// advanced for loop
for (i <- 1 to 3; j <- 1 to 3) print(f"${10 * i + j}%3d")

// Each generator can have a guard, a Boolean condition preceded by if:
for (i <- 1 to 3; j <- 1 to 3 if i != j) print(f"${10 * i + j}%3d")

// You can have any number of definitions, introducing variables that can be used inside the loop:
for (i <- 1 to 3; from = 4 - i; j <- from to 3) print(f"${10 * i + j}%3d")

// for comprehension
for (i <- 1 to 10) yield i % 3

for (ch <- "Hello"; i <- 0 to 1) yield (ch + i).toChar
for (i <- 0 to 1; ch <- "Hello") yield (ch + i).toChar

// Default and Named Arguments
def decorate(str: String, left: String = "[", right: String = "]") =
  left + str + right

decorate("test")

// Variable Arguments (varargs)
def sum(args: Int*) = {
  var result = 0;
  for (arg <- args)
    result += arg
  result
}

sum(1, 2, 3, 4)

// val s = sum(1 to 5) Error
// The remedy is to tell the compiler that you want
// the parameter to be considered an argument sequence.
// Append : _*”

val s = sum(1 to 10: _*)

def recursiveSum(args: Int*) : Int = {
  if (args.length == 0) 0
  else args.head + recursiveSum(args.tail : _*)
}

recursiveSum(1,2,3)

// Procedures. Unit , no = in definition
def box(s : String) { // Look carefully: no =
  val border = "-" * (s.length + 2)
  print(f"$border%n|$s|%n$border%n")
}

box("Lime")

// lazy to delay costly initialization statement
lazy val words = scala.io.Source.fromFile("/usr/share/dict/words").mkString

// def is evaluated on each call