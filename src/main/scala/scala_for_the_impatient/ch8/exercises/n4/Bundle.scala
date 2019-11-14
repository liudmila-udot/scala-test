package scala_for_the_impatient.ch8.exercises.n4

import scala.collection.mutable.ArrayBuffer

class Bundle extends Item {
  val items = new ArrayBuffer[Item]

  override def price: Int = {
    items.map(i => i.price).sum
  }

  override def description: String = {
    f"list of ${items.size}:\n" +
      items.map(i => i.description).mkString("\n")
  }

  def addItem(item: Item): Unit = {
    items+=item
  }
}
