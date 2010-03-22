package scalaexamples.inheritance

import Math.Pi

// Make Circle extend Shape, and add a primary constructor for radius and color
class Circle(radius: Double, color: String) extends Shape(color) {

  def this(radius: Double) = this(radius, Shape.DefaultColor)
  // Create a auxiliary constructor
  
  // Define the area function
  
  def area = Pi * radius * radius
  
  // Make this compile
  def circumference = 2 * Pi * radius
  
}
