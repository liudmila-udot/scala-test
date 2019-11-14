package scala_for_the_impatient.ch11

class AsciArt(s: String) {
  val content: String = s

  def |(other: AsciArt): AsciArt = {
    new AsciArt(content + "\n" + other.content)
  }

  def -(other: AsciArt) = new AsciArt(
    content.split("\n").zip(other.content.split("\n")).map(x => x._1 + x._2).mkString("\n")
  )
  override def toString = content
}

object Cat extends AsciArt(s =
  """ /\_/\
( ' ' )
(  -  )
 | | |
(__|__)""") {
  def apply(): Cat.type = this
}

object Chat extends AsciArt("   -----\n / Hello \\\n<  Scala |\n \\ Coder /\n   -----") {
  def apply(): Chat.type = this
}