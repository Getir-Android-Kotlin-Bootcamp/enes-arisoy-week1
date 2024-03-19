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

    /**         Strings
     *  A string value is a sequence of characters in double quotes (" ") or triple quotes (""").
     *  Strings are immutable.
     *  Once you initialize a string, you can't change its value or assign a new value to it.
     *
     *  If you want to modify a string, you need to use functions provided by the String class,
     *  and these functions create a new string object with the modified value
     *  rather than modifying the original string in place.
     */
    println("Page 14 -> String")

    // Double quotes
    val greeting: String = "Hey!"

    // String Templates -> Use $ sign if you want to use variable within string.
    println("Hey $greeting")

    // Escaping Characters
    val escapedString: String = "This is a \"quoted\" string."
    println(escapedString)

    // String Functions
    val str: String = "This is Enes from Getir Bootcamp."
    println("This function converts all characters to uppercase -> ${str.uppercase()}")
    println("This function converts all characters to uppercase -> ${str.lowercase()}")
    println("This function extracts a portion of a string -> ${str.substring(8, 12)}")

    println("-------------------------------------------")

    /**
     *              Control Flow
     *  Control flow statements are used for making decisions based on conditions.
     */
    println("Page 15 -> Control Flow")

    /**
     * Imagine you have a gym that offers discounts to its customers.
     * The discount percentage varies depending on the customer's age
     * and whether they are a member of the gym's loyalty program.
     */

    fun calculateDiscount(age: Int, isMember: Boolean): Int {

        return if (isMember) {
            if (age < 18) {
                10
            } else if (age in 18..64) {
                20
            } else {
                30
            }
        } else {
            if (age < 18) {
                5
            } else if (age in 18..64) {
                15
            } else {
                25
            }
        }
    }

    println("Your discount is: ${calculateDiscount(18, true)}%")

    println("-------------------------------------------")

    /**             For loop
     *  The for loop iterates through anything that provides an iterator.
     */
    println("Page 16 -> For loop")

    /**
     * Let's assume that you have received a list of fruits from an API.
     * Your goal is to display the available fruits in the application and allow the user to add them to the cart.
     * To achieve this, you want to display each fruit on a card individually.
     * To do this, you need to separate those fruits one by one using a loop.
     */
    val fruitList = listOf("Apple", "Banana", "Pineapple", "Watermelon")
    for (fruit in fruitList) {
        println(fruit)
    }

    println("-------------------------------------------")

    /**             While loop
     *  A while loop is a control flow statement that repeatedly executes
     *  a block of code as long as a given condition is true.
     */
    println("Page 17 -> While loop")

    var index = 0

    // The same task as the previous example using a while loop
    while (index < fruitList.size) {
        val fruit = fruitList[index]

        println(fruit)

        index++
    }

    println("-------------------------------------------")

    /**             When Expression
     *  When allows you to perform different actions based on the value of a variable or expression.
     */

    println("Page 18 -> When Expression")

    // I've written a scenario about gym discount above. Let's use this with when expression.
    fun calculateDiscountWithWhenExpression(age: Int, isMember: Boolean): Int {
        return when {
            isMember -> when {
                age < 18 -> 10
                age in 18..64 -> 20
                else -> 30
            }

            else -> when {
                age < 18 -> 5
                age in 18..64 -> 15
                else -> 25
            }
        }
    }
    println("Your discount is: ${calculateDiscountWithWhenExpression(24, false)}%")

    println("-------------------------------------------")

    /**             Ranges
     * The range is a collection of finite values which is defined by endpoints.
     * The range in Kotlin consists of a start, a stop, and the step
     */

    println("Page 19 -> Ranges")

    // Example 1 -> Check if a person adult or not
    val age = 24
    fun isAdult(age: Int): Boolean = age in 18..65
    if (isAdult(age)) {
        println("This person is an adult.")
    } else {
        println("This person is not an adult.")
    }

    // Example 2 -> Give the even numbers within the specified range.
    for (i in 0..10 step 2) {
        println(i)
    }

    println("-------------------------------------------")

    /**             Collections
     *  Collections are objects that group multiple elements into a single unit.
     *  They are used to store, retrieve, manipulate, and iterate over data in a structured way.
     *  Collections Types in kotlin is -> List, Set, Map
     *
     *  List -> A list is an ordered collection of elements where each element has an index.
     *  Lists in Kotlin are mutable (MutableList) or immutable (List).
     *
     *  Set -> A set is a collection of unique elements where order is not guaranteed.
     *  Sets in Kotlin are mutable (MutableSet) or immutable (Set).
     *
     *  Map -> A map is a collection of key-value pairs, where each key is unique.
     *  Maps in Kotlin are mutable (MutableMap) or immutable (Map).
     */

    println("Page 20 -> Collections")

    // Imagine we have a data about fruits and vegetables that comes from an API.
    val apiData = mapOf(
        "fruits" to arrayListOf("Apple", "Banana", "Pineapple", "Watermelon"),
        "vegetables" to arrayListOf("Carrot", "Broccoli", "Tomato", "Spinach")
    )

    val fruits = apiData["fruits"]
    val vegetables = apiData["vegetables"]

    val fruitEndsWith = fruits?.filter {
        it.endsWith("e")
    }
    println("Fruits that ends with the letter 'e' -> $fruitEndsWith")

    val upperCaseVegetables = vegetables?.map {
        it.uppercase()
    }
    println("Uppercase the vegetables -> $upperCaseVegetables")

    println("Get all fruits: ")
    fruits?.forEach {
        println(it)
    }

    println("-------------------------------------------")

    /**             Nullable and Null Check
     *  Nullable types allow variables to hold null values, indicating the absence of a value.
     *  This helps in handling cases where the value of a variable can be null, preventing null pointer exceptions.
     */

    println("Page 21 -> Nullable and Null Check")

    fun checkNullable(nullInt: Int?) {
        if (nullInt != null) {
            println("This variable is not null.")
        } else {
            println("This variable is null.")
        }
        // Or you can do this like Kotlin style.
        nullInt?.let {
            println("This variable is not null.")
        } ?: run {
            println("This variable is null.")
        }
    }
    checkNullable(2)
    println()
    /**
     * In the scenario where fruits and vegetables are retrieved from the API,
     * let's assume there is occasionally a null value.
     * We need to perform a null check to prevent our application from crashing.
     */

    val listWithNulls: List<String?> = listOf("Apple", "Watermelon", null, "Banana")
    listWithNulls.forEach {fruit ->
        fruit?.let {
            // Check if there is a null value and if there is, don't display it.
            println(it)
        }
    }

    println("-------------------------------------------")

    /**         Type Checks and Automatic Casts
     *  Type checks and automatic casts in Kotlin allow you to check the type of an object
     *  and automatically cast it to the specified type if the check is successful.
     *  This feature provides a convenient way to work with different types in a safe.
     */
    println("Page 22 -> Type Checks and Automatic Casts")

    fun checkType(x: Any) {
        when (x) {
            is String -> println("It's a string.")
            is Number -> println("It's a number.")
            is Person -> println("It's a person.")
            else -> println("None of them above.")
        }
    }
    checkType(person)

    // The compiler know the obj is an integer value.
    val obj: Any = 22
    if (obj is Int) {
        println("It's an integer.")
    } else {
        println("Object is not an integer")
    }

    println("-------------------------------------------")

}