package scala_for_the_impatient.ch10.exercises

import java.io.InputStream

abstract class IterableInputStream extends InputStream with Iterable[Byte] {
  override def iterator: Iterator[Byte] = new Iterator[Byte] {
    override def hasNext: Boolean = ???

    override def next(): Byte = read().toByte
  }
}
