package scala_for_the_impatient.ch10.exercises

trait CryptoLogger {
  var key = 3
  private val alphaL = 'a' to 'z'

  def encrypt(msg: String): String = {
    encrypt(msg, key)
  }

  private def encrypt(msg: String, key: Int): String = {
    msg.map(x => {
      if (alphaL.contains(x)) {
        alphaL((x - alphaL.head + key + alphaL.size) % alphaL.size)
      } else {
        x
      }
    })
  }

  def decrypt(msg: String): String = {
    encrypt(msg, -key)
  }

  def setKey(key: Int): Unit ={
    this.key = key
  }
}
