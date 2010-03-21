package scalaexamples

import junit.framework.Assert._
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * This class exists so that test classes (that extends this one) can defined zero tests and still load nicely
 */
class EmptyTest {

  // Write a unit test. Make it fail, and then make it pass.
  @Test def testRun{}

}
