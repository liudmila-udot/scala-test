package scala_for_the_impatient.ch11

import scala.language.dynamics

class DynamicPropsHelper(val props: java.util.Properties, val names: List[String]) extends Dynamic {

  def selectDynamic(name: String) =
    new DynamicPropsHelper(this.props, names.appended(name))

  override def toString: String = props.getProperty(names.mkString("."))
}
