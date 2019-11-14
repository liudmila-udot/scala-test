package scala_for_the_impatient.ch11

import scala.language.dynamics

class DynamicProps(val props: java.util.Properties) extends Dynamic {
  def updateDynamic(name: String)(value: String) {
    props.setProperty(name.replaceAll("_", "."), value)
  }

/*  def selectDynamic(name: String) =
    props.getProperty(name.replaceAll("_", "."))*/

  def selectDynamic(name: String) =
    new DynamicPropsHelper(props, List(name))

  def applyDynamicNamed(name: String)(args: (String, String)*) {
    if (name != "add") throw new IllegalArgumentException
    for ((k, v) <- args)
      props.setProperty(k.replaceAll("_", "."), v)
  }
}
