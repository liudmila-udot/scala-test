package scala_for_the_impatient.ch11

class Table(inside: String) {

  var insideTableTag: String = inside

  def | (s: String): Table = {
    insideTableTag = insideTableTag + f"<td>$s</td>"
    this
  }

  def || (s: String): Table = {
    insideTableTag = insideTableTag + f"</tr>\n<tr><td>$s</td>"
    this
  }

  override def toString: String = f"<table>/\n$insideTableTag\n</table>"
}

object Table {
  def apply() = new Table("<tr>")
}
