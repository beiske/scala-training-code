package scalaexamples.patternmatching

import junit.framework.Assert._
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import scalaexamples.EmptyTest

@RunWith(classOf[JUnit4])
class ListMatchingTest extends EmptyTest  {

  val list = List("Scala", "is", "powerful")
  
  @Test
  def matchFirstElementOfList {
    
    // matchedElement must find the first element. It can also skip the rest (if you want to)
    val mathedElement = list match {
      // Insert you match statement(s) here
      case List(firstElement, _ *) => firstElement
      case _ => "failed"
    }
    
    assertEquals(list(0), mathedElement)
  }
  
  @Test 
  def matchSecondElementOfList {
    
    // matchedElement should find the second element of the list. 
    // You may ignore the first element and any subsequent elements if you want
    val mathedElement = list match {
      // Insert you match statement here
      case List(_, middle, _ *) => middle
      case _ => "failed"
    }

    assertEquals(list(1), mathedElement)
  }

  
  @Test 
  def matchNestedLists {
	val nestedList = list :: List("Indeed", "it", "is")
	// Same as List(List(Scala, is, powerful), Indeed, it, is) 
 
	// A side note here. If you want only one list use "list ::: List("Indeed", "it", "is")" 
	// Which prepends the entire list.
                                                                   
	// You must find the sublist to make the test pass.
    val matchedElement = nestedList match {
      // Insert your match statement here
      case List(sublist:List[String], _*) => sublist
      case _ => "failed"
    }

    assertEquals(list, matchedElement)
  }
  
  @Test 
  def matchNestedElementOfList {
    val subList = List("Indeed", "it", "is")
	val list = List("Scala", "is", "powerful", subList)
 
	// Here you must find the first element of the second sublist
    val matchedElement = list match {
      // Insert you match statement here
      case List(_, _, _, List(matched, _ *)) => matched
      case _ => "failed"
    }
    assertEquals(subList(0), matchedElement)
  }
  
  
}
