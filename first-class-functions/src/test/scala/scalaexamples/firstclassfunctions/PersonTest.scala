package scalaexamples.firstclassfunctions

import junit.framework.Assert._
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import scalaexamples.EmptyTest

// Comment in the tests below and make them run and pass

// The objective in each exercise is to 
// transform the list 'persons' in some way,
// using the functions filter, map etc. on the list

@RunWith(classOf[JUnit4])
class PersonTest extends EmptyTest {

  val alf = Person("Alf", 30, List(EmailAddress("alf.kristian@gmail.com")))
  val fredrik = Person("Fredrik", 33, List(EmailAddress("fredrik@vraalsen.no"), EmailAddress("fvr@knowit.no")))
  val johannes = Person("Johannes", 0, Nil)

  val persons = List(alf, fredrik, johannes)

  // @Test
  def testAdults {
    // Filter the list of persons to find all adults
    val adults = Nil

    assertEquals(List(alf, fredrik), adults)
  }

  // @Test
  def testName {
    // Find the names of all persons
    val names = Nil
    
    assertEquals(List("Alf", "Fredrik", "Johannes"), names)
  }

  // @Test
  def testNamesOfAdults {
    // Create a list containing the names of the adults,
    // by combining the approaches in the two exercises above
    val names = Nil

    assertEquals(List("Alf", "Fredrik"), names)
  }

  // @Test
  def testAgeLimit {
    // Partition the list of persons into two new lists,
    // one containing the adults and one containing the kids
    val (adults, kids) = (Nil, Nil)

    assertEquals(List(alf, fredrik), adults)
    assertEquals(List(johannes), kids)
  }

  // @Test
  def testHasMultipleEmails {
    // Split the list of persons into two new lists containing
    // techies (more than one email address) and luddites (zero or only one email address)
    val (techies, luddites) = (Nil, Nil)

    assertEquals(List(fredrik), techies)
    assertEquals(List(alf, johannes), luddites)
  }

  // @Test
  def testFindByName {
    // Find the person named "Johannes" in the list of persons
    val name = "Johannes"
    val person: Option[Person] = null
    
    person match {
      case Some(person) => assertEquals(johannes, person)
      case _ => error("No match")
    }
  }
  
  // @Test
  def testFindByName2 {
    // Find the person named "Jon-Anders" (should not match)
    val name = "Jon-Anders"
    val person: Option[Person] = null

    person match {
      case None => "OK"
      case _ => error("Unexpected match")
    }
  }

  // @Test
  def testFindEmailAddressesByName {
    // Find the e-mail addresses of the person named "Alf". 
    // Here you must first find the person, 
    // then map the collection to a different type
    val name = "Alf"
    val addresses: Option[List[EmailAddress]] = null
    
    addresses match {
      case Some(addresses) => assertEquals(alf.emailAddresses, addresses)
      case _ => error("No match")
    }
  }

  // @Test
  def testFindPersonByEmail {
    // Find the person who has the e-mail address "fvr@knowit.no".
    
    // Hint: Try combining finding the person and checking if
    // there exists an email address matching the criteria in the
    // person's list of email addresses.
    val address = EmailAddress("fredrik@vraalsen.no")
    val person: Option[Person] = null
    
    person match {
      case Some(person) => assertEquals(fredrik, person)
      case _ => error("No match")
    }
  }
  
  // @Test
  def testGetFirstEmailAddress {
    // Create a new list of the first e-mail address of each person,
    // filtering out persons without e-mail addresses. 
    
    // Hint: Try combining filtering the list and then 
    // mapping it to a different type, only getting
    // the head of the email address list.
    val addresses = Nil

    assertEquals(List(alf.emailAddresses.head, fredrik.emailAddresses.head), addresses)
  }

  //@Test
  def testSumOfAge {
    // Calculate the sum of the age of all the persons using foldLeft

    // Insert code here for sumFunction, a function of two variables, the sum and the current value
    val sumFunction = null
    var sumOfAges = persons.foldLeft(0)( sumFunction )

    assertEquals(63, sumOfAges)

  }

  //@Test
  def testNameToAge{
    //Create a map from each person's age to his name. Add entries to the map using foldLeft
    
    // Insert code here for nameToAge
   var emptyMap:Map[Int,String] = Map()
   val nameToAge: Map[Int, String] = null

   assertEquals(Map(30 -> "Alf", 33 -> "Fredrik", 0 -> "Johannes"), nameToAge)
  }

  // @Test
  def testNameToEmailAddress {
    // Note that this is a difficult task for Scala beginners
    
    // Create a map from each person's name to their e-mail addresses,
    // filtering out persons without e-mail addresses
    // Hint: First filter list, then use foldLeft to accumulate...
    val emptyMap: Map[String, List[EmailAddress]] = Map()
    
    // Insert code here for emptyMap
    val nameToEmail = emptyMap

    assertEquals(Map(alf.name -> alf.emailAddresses, fredrik.name -> fredrik.emailAddresses), nameToEmail)
  }

}
