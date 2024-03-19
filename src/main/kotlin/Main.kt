package org.example

fun main() {

    /**
     *              Print and Println
     *  print   -> Prints the given text without appending a new line.
     *  println -> Prints the given text and appends a new line.
     */
    println("Page 9 -> Println")

    println()
    print("I'm Enes")
    println("I'm Enes!")
    println()

    println("-------------------------------------------")

    /**
     *              Functions
     *  It's a block of code that perform specific tasks.
     */
    println("Page 10 -> Functions")

    println()
    fun greet(name: String): String {
        return "Hello $name"
    }
    println(greet("Enes"))
    println()

    println("-------------------------------------------")

    /**
     *              Variables
     *  var -> It's a mutable. Which means it can be changed after it's initialized.
     *  val -> It's read-only variable. Not immutable. That means you can not write to
     *  it after initialization.
     */
    println("Page 11 -> Variables")

    val name: String = "Enes"
    println("Name declared with val keyword: $name")

    val list = mutableListOf(1, 2, 3)
    list.add(4)
    println(list)
    /**
     * list is declared by val keyword. However, you can add an item to list.
     * This means, val is not immutable but read-only.
     */

    var sum = 0
    sum = 2 + 3
    println("Sum declared with var keyword: $sum. This means the variable can be changed.")

    println("-------------------------------------------")

    /**
     *              Classes
     *   Classes and objects are used to represent objects in the real world.
     *   It defines the properties (fields) and behaviors (methods) that objects of that class will have.
     *   A property is basically a variable that belongs to the class.
     */
    println("Page 12 -> Classes")

    open class Person {
        var name: String = ""
        var age: Int = 0

        fun getData(name: String, age: Int) {
            println("Name: $name, Age: $age")
        }
    }
    // Create an instance of the Person class
    val person = Person()
    person.name = "Enes"
    person.age = 24

    println(person.name)
    println(person.age)
    person.getData(person.name, person.age)

    println("-------------------------------------------")

    /**             Inheritance
     *  Inherit class properties and functions from one class to another.
     *  This allows for code reuse and the creation of class hierarchies.
     */
    // Inheritance
    println("Page 13 -> Inheritance")
    class GetirParticipant : Person() {}

    val participant = GetirParticipant()
    // Name and age inherited from Person class.
    participant.name = "Another name"
    participant.age = 20
    println(participant.name)
    println(participant.age)
    participant.getData(participant.name, participant.age)

    println("-------------------------------------------")

}