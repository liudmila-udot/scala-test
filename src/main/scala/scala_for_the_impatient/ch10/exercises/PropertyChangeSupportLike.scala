package scala_for_the_impatient.ch10.exercises

import java.beans.{PropertyChangeEvent, PropertyChangeListener, PropertyChangeSupport}

trait PropertyChangeSupportLike {
  val pcs = new PropertyChangeSupport(this)

  def addPropertyChangeListener(listener: PropertyChangeListener): Unit = {
    this.pcs.addPropertyChangeListener(listener)
  }

  def removePropertyChangeListener(listener: PropertyChangeListener) {
    this.pcs.removePropertyChangeListener(listener)
  }

  def firePropertyChange(propertyName: String, oldValue: Any, newValue: Any): Unit = {
    pcs.firePropertyChange(propertyName, oldValue, newValue)
  }

  def firePropertyChange(propertyName: String, oldValue: Int, newValue: Int): Unit = {
    pcs.firePropertyChange(propertyName, oldValue, newValue)
  }


  def firePropertyChange(propertyName: String, oldValue: Boolean, newValue: Boolean): Unit = {
    pcs.firePropertyChange(propertyName, oldValue, newValue)
  }

  def firePropertyChange(event: PropertyChangeEvent): Unit = {
    pcs.firePropertyChange(event)
  }

  def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Any, newValue: Any): Unit = {
    pcs.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)
  }

  def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Int, newValue: Int): Unit = {
    pcs.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)
  }

  def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Boolean, newValue: Boolean): Unit = {
    pcs.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)
  }
}
