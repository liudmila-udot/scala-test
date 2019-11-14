import java.util.Calendar

import scala.collection.mutable

// 1
val prices = Map("Flat" -> 1000000, "Surf" -> 2000, "auto" -> 30000)

prices.map({ case (key, value) => (key, value - value / 10) })
prices.view.mapValues(_ * 0.90).toMap
println(prices)

// 2
def wordsCount(): mutable.Map[String, Int] = {
  val ret = collection.mutable.Map[String, Int]()
  val in = new java.util.Scanner(new java.io.File(
    "/Users/liudmila-udot/IdeaProjects/scala-test/src/main/scala/scala_for_the_impatient/myfile.txt"))
  while (in.hasNext()) {
    // put in map
    in.next().split(" +").foreach(
      w => {
        ret(w) = ret.getOrElse(w, 0) + 1
      }
    )
  }
  ret
}

println(wordsCount())

// 3 immutable map
def wordsCount3(): Map[String, Int] = {
  var ret = Map[String, Int]()
  val in = new java.util.Scanner(new java.io.File(
    "/Users/liudmila-udot/IdeaProjects/scala-test/src/main/scala/scala_for_the_impatient/myfile.txt"))
  while (in.hasNext()) {
    // put in map
    in.next().split(" +").foreach(
      w => {
        ret += (w -> (ret.getOrElse(w, 0) + 1))
      }
    )
  }
  ret
}

println(wordsCount3())

// 3
def wordsCount4(): mutable.Map[String, Int] = {
  val ret = collection.mutable.SortedMap[String, Int]()
  val in = new java.util.Scanner(new java.io.File(
    "/Users/liudmila-udot/IdeaProjects/scala-test/src/main/scala/scala_for_the_impatient/myfile.txt"))
  while (in.hasNext()) {
    // put in map
    in.next().split(" +").foreach(
      w => {
        ret(w) = ret.getOrElse(w, 0) + 1
      }
    )
  }
  ret
}

println(wordsCount4())

// 5
def wordsCount5(): mutable.Map[String, Int] = {
  val ret = scala.jdk.CollectionConverters.MapHasAsScala(new java.util.TreeMap[String, Int]()).asScala

  val in = new java.util.Scanner(new java.io.File(
    "/Users/liudmila-udot/IdeaProjects/scala-test/src/main/scala/scala_for_the_impatient/myfile.txt"))
  while (in.hasNext()) {
    // put in map
    in.next().split(" +").foreach(
      w => {
        ret(w) = ret.getOrElse(w, 0) + 1
      }
    )
  }
  ret
}

println(wordsCount5())

// 6
val map6 = collection.mutable.LinkedHashMap[String, Int]()
map6("Monday") = Calendar.MONDAY;
map6("Tuesday") = Calendar.TUESDAY;
map6("Wednesday") = Calendar.WEDNESDAY;
map6("Thursday") = Calendar.THURSDAY;
map6("Friday") = Calendar.FRIDAY;
map6("Saturday") = Calendar.SATURDAY;
map6("Sunday") = Calendar.SUNDAY;
println(map6)

// 7
val properties = scala.jdk.CollectionConverters.SetHasAsScala(java.lang.System.getProperties.entrySet()).asScala

val maxKeyLength = properties.map(p => p.getKey.toString.length).max

properties.foreach(p => {
  printf(f"%%-${maxKeyLength}s| %%s%n", p.getKey, p.getValue)
})

// 8
def minMax(arr: Array[Int]): Tuple2[Int, Int] = {
  (arr.min, arr.max)
}

println(minMax(Array(1, 2, 3, 4, 5)))

// 9
def lteqgt(arr: Array[Int], v: Int): Tuple3[Int, Int, Int] = {
  (arr.count(_ < v), arr.count(_ == v), arr.count(_ > v))
}

println(lteqgt(Array(1, 2, 3, 4, 5), 3))