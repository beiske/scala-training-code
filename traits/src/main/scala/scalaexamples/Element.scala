package scalaexamples

class Element(val anIntValue: Int) extends Ordered[Element] {
  
  def compare(other: Element) = this.anIntValue - other.anIntValue
  
  override def toString = "anIntValue is " + anIntValue
  
}

trait InterfaceTrait {
  
  def getSomeString
  
}

trait MethodTrait {
  
  def mixedInMethod = "a value"
  
}

trait SubClassTrait extends Element {
  
  override def toString = "stacked toString, super toString is '" + super.toString + "'"
  
} 

