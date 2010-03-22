package scalaexamples.intro

class Stuff {
  
  // Override the toString method to say "Stuff"
  
  override def toString:String = {
    return "Stuff"
  }

// Define a constant 'const' saying "This is a constant"
  val const = "This is a constant"
  
  // Define a variable 'variable' saying "This is a variable"
  var variable = "This is a variable"
  
  // Define a method saying "Hello " to whatever input
  def sayHello(value:String) = {
    "Hello " + value
  }
  
  // Define a method which prints hello, returning Unit (void)
  def printHello(value:String):Unit = {
    println("Hello")
  }

}

object Stuff {
  
  // Define a method that returns "StuffObject"
  
  def getString = {
    "StuffObject"
    
  }
  
  
}
