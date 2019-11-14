// construct immutable map
val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

// construct mutable map
val scores2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

// empty map
val scores3 = scala.collection.mutable.Map[String, Int]()

// -> is easier, but the same syntax
val scores4 = scala.collection.mutable.Map[String, Int]()

// accessing map values
val bobScores = scores("Bob")

// contains
val bobsScore = if (scores.contains("Bob")) scores("Bob") else 0

scores.getOrElse("Bob", 0)

scores.get("Bob")

val scores5 = scores.withDefaultValue(0)
val zeldasScore5 = scores5.get("Zelda")
// Yields 0 since "Zelda" is not present
val scores6 = scores.withDefault(_.length)
val zeldasScore6 = scores6.get("Zelda")
// Yields 5, applying the length function to the key
// that is not present

// update map values
scores2("Bob") = 10

scores2("Liuda") = 10 // adds new value

scores2 += ("Bob" -> 10, "Fred" -> 7)

// for ((k, v) <- map) process k and v
// keySet
// values

// tuple

val t = (1, 3.14, "Fred")

// access its components with methods _1, _2, _3

// zipping
val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)
val pairs = symbols.zip(counts)

//
//Array(("<", 2), ("-", 10), (">", 2))
// keys.zip(values).toMap
pairs.toMap