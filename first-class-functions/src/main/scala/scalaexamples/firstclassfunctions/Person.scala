package scalaexamples.firstclassfunctions

case class EmailAddress(address: String)

case class Person(name: String, age: Int, emailAddresses: List[EmailAddress])

