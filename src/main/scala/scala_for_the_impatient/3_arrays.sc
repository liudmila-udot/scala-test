val nums = new Array[Int](10)
// An array of ten integers, all initialized with zero
val a = new Array[String](10)
// A string array with ten elements, all initialized with null
val s = Array("Hello", "World")
// An Array[String] of length 2—the type is inferred
// Note: No new when you supply initial values
s(0) = "Goodbye"
// Array("Goodbye", "World")
// Use () instead of [] to access elements”
val ints = Array(1, 2)

// traverse
ints.foreach(i=>{
  println(i)
})
for (i <- ints.indices)
  println(s"$i: ${ints(i)}")

val s = Array("Hello", "World")

import scala.collection.mutable.ArrayBuffer
val b = ArrayBuffer[Int]()
// Or new ArrayBuffer[Int]
// An empty array buffer, ready to hold integers
b += 1
// ArrayBuffer(1)
// Add an element at the end with +=
b += (1, 2, 3, 5)
// ArrayBuffer(1, 1, 2, 3, 5)
// Add multiple elements at the end by enclosing them in parentheses
b ++= Array(8, 13, 21)
// ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21)
// You can append any collection with the ++= operator
b.trimEnd(5)
// ArrayBuffer(1, 1, 2)
// Removes the last five elements

// transforming arrays
val a1 = Array(2, 3, 5, 7, 11, 12)
val result = for (elem <- a1) yield 2 * elem

for (elem <- a1 if elem % 2 == 0) yield 2 * elem

a1.filter(_ % 2 == 0).map(2 * _)

// common algorithms

Array(1, 7, 2, 9).sum

val a2 = Array(1, 7, 2, 9)
scala.util.Sorting.quickSort(a2)
a2

val matrix = Array.ofDim[Double](3, 4)
matrix(0)(0) = 42
matrix


