package scalaexamples.companionobject

import junit.framework.Assert._
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import scalaexamples.EmptyTest

@RunWith(classOf[JUnit4])
class CompanionObjectTest extends EmptyTest{

	@Test def companionObjectTest {
		// Comment in expression for expression and make them compile and run
		// Hint: You do this by changing the Train.scala definition. More hints in the source file.

		val myPassengers:List[String] = List("Espen")
		val trainOne = Train(myPassengers)

		assertEquals(myPassengers(0), trainOne.passengers(0))
		assertTrue(trainOne.conductor.isEmpty)

		val trainTwo = Train("Per", "Pål")
		assertEquals(List("Per", "Pål"), trainTwo.passengers)
		assertTrue(trainTwo.conductor.isEmpty)

		val trainObject = Train
		val trainThree = trainObject(List("Espen"))
		assertEquals(List("Espen"), trainThree.passengers)
		assertTrue(trainThree.conductor.isEmpty)

		val trainFour = trainObject.apply(Some("conductor"), "Espen")
		assertEquals(List("Espen"), trainFour.passengers)
		assertTrue(trainFour.conductor.isDefined)

	}

}