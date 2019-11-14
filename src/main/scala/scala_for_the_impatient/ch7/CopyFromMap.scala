package scala_for_the_impatient.ch7


object CopyFromMap {

  object Copy {

    import java.util.{HashMap => JavaHashMap}
    import scala.collection.mutable.{HashMap => ScalaHashMap}

    def copy(fromJava: JavaHashMap[Int, String], toScala: ScalaHashMap[Int, String]
            ): Unit = {
      fromJava.forEach((k, v) => toScala.addOne(k, v))
    }
  }

}
