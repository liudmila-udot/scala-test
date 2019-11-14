package scala_for_the_impatient.ch10.exercises

import java.io.InputStream

trait Buffering extends PrintLogger {
  this: InputStream =>

  val BUF_SIZE: Int = 5
  private val buf = new Array[Byte](BUF_SIZE)
  private var bufsize: Int = 0
  private var pos: Int = 0

  override def read(): Int = {
    if (pos >= bufsize) {
      bufsize = this.read(buf, 0, BUF_SIZE)
      log("buffered %d bytes: %s".format(bufsize, buf.mkString(", ")))
      if (bufsize > 0) -1
      pos = 0
    }
    pos += 1
    buf(pos-1)
  }
}
