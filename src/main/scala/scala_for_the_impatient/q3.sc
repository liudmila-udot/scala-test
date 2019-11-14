import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

// 1
def genArray(n: Int): Array[Int] = {
  val ret = new Array[Int](n)
  val r = scala.util.Random
  for (i <- ret.indices) {
    ret(i) = r.nextInt(n)
  }
  ret
}

println(genArray(9).mkString(","))

// 2
def swapElement(a: Array[Int], i: Int): Unit = {
  val temp = a(i)
  a(i) = a(i + 1)
  a(i + 1) = temp
}

def swap(a: Array[Int]): Unit = {
  for (i <- 0 until a.length - 1 by 2) {
    swapElement(a, i)
  }
}



val a = Array[Int](1, 2, 3, 4, 5)
swap(a)

println(a.mkString(", "))

// 3
def swapNew(a: Array[Int]): Array[Int] = {
  (for (i <- a.indices) yield {
    if (i % 2 == 0)
      if (i < a.length - 1)
        a(i + 1)
      else a(i)
    else
      a(i - 1)
  }).toArray
}

val b = Array[Int](1, 2, 3, 4, 5)
val b1 = swapNew(b)

println(b.mkString(", "))
println(b1.mkString(", "))

// 4
def sortedArray(a: Array[Int]): Array[Int] = {
  val b = new ArrayBuffer[Int](a.length)
  var positiveIndexNext = 0;
  for (elem <- a) {
    if (elem <= 0) {
      b.addOne(elem)
    } else {
      b.insert(positiveIndexNext, elem)
      positiveIndexNext += 1
    }
  }
  b.toArray
}

println(sortedArray(Array(-1, 5, 0, 3, -5, -2, 10)).mkString(", "))

def posneg(a: Array[Int]) =
  a.filter(_ > 0) ++ a.filter(_ <= 0)
posneg(Array(-1, 5, 0, 3, -5, -2, 10))

// 5
val d = Array[Double](1.6, 2.7, 3, 4.8, 5)
println(d.sum / d.length)

// 6
println(Array(-1, 5, 0, 3, -5, -2, 10)
  .sortWith(_ > _).mkString(", "))

println(ArrayBuffer[Int](-1, 5, 0, 3, -5, -2, 10)
  .sortWith(_ > _))

// 7
val set = mutable.LinkedHashSet(-1, -1, 5, 0, 3, -5, 3, -2, 10, -2)
println(set.toArray.mkString(", "))

println(Array(-1, -1, 5, 0, 3, -5, 3, -2, 10, -2).distinct.mkString(", "))

// 8

def removeFirstNegative(a: ArrayBuffer[Int]): Unit = {
  a.zipWithIndex
    .filter({ case (el, index) =>
      el < 0
    })
    .map(_._2)
    .drop(0)
    .reverse
    .foreach(i =>{
      a.remove(i)
    })
  }


val input = ArrayBuffer[Int](-1, 5, 0, 3, -5, -2, 10)
removeFirstNegative(input)
println(input)

// 9 skip

// 10
java.util.TimeZone.getAvailableIDs
  .filter(s=>s.startsWith("America"))
  .map(s=>s.drop("America/".length))
  .sorted

// 11
val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
val natives = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
scala.jdk.CollectionConverters.ListHasAsScala(natives)
