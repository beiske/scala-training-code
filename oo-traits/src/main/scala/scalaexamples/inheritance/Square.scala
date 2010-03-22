package scalaexamples.inheritance

// Subclass the Rectangle
class Square(var width: Double, color:String) extends Rectangle(width, width, color){
  
  // Create an auxiliary constructor
  def this(width:Double) = this(width, Shape.DefaultColor)
  
  // Override the area method

  override def area = width * width
  
  override def circumference = 4*width

}
