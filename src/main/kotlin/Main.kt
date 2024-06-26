package org.example

import java.text.SimpleDateFormat
import java.util.*

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
    listWithNulls.forEach { fruit ->
        fruit?.let {
            // Check if there is a null value and if there is, don't display it.
            println(it)
        }
    }

    // Of course, you can do the above algorithm with a simple function like this :)
    println(listWithNulls.filterNotNull())

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

    // The compiler knows the obj is an integer value.
    val obj: Any = 22
    if (obj is Int) {
        println("It's an integer.")
    } else {
        println("Object is not an integer")
    }

    println("-------------------------------------------")

    /**             Traverse a map
     *  Traversing a map in Kotlin involves iterating over its key-value pairs to access and process each entry.
     */

    println("Page 44 -> Traverse a map")

    val studentMap = mapOf(
        1001 to "Ali",
        2234 to "Burak",
        3232 to "Ceyda",
        4003 to "Deniz"
    )
    for ((key, value) in studentMap.entries) {
        println("Student number: $key, Name: $value")
    }
    println()

    // Or you can do this with forEach
    studentMap.entries.forEach { (key, value) ->
        println("Student number: $key, Name: $value")
    }

    println("-------------------------------------------")

    /**             Lazy Property
     *   A lazy property is a property whose value is computed only upon first access.
     *   Lazy properties are useful when you have a property whose initialization is expensive or
     *   takes considerable time, but it might not be needed immediately or at all during the lifecycle of the object.
     */
    println("Page 45 -> Lazy Property")

    /**
     *  Let's consider a scenario where you have a complex calculation that needs to be performed
     *  only when certain conditions are met. You can use a lazy property to defer the computation
     *  until it's actually required.
     */
    class Player(val totalXP: Int) {
        private fun calculateLevel(): Int {
            println("Calculating player's level...")
            return totalXP / 100
        }

        // This code calculates the level. But only when the player wants to check it's level.
        val level: Int by lazy {
            calculateLevel()
        }
    }

    val player = Player(2500)

    println("Player's level is not calculated yet.")

    // Trigger the level calculation
    val level = player.level

    println("Player's level: $level")

    println("-------------------------------------------")

    /**             Extension Functions
     *  An extension function in Kotlin allows you to add new functionality to
     *  existing classes without modifying their source code. This is particularly useful
     *  when you want to add utility methods to classes from external libraries
     *  or even your own classes without subclassing or modifying their source code directly.
     */

    println("Page 46 -> Extension Functions")

    /**
     *  Let's suppose you are working with 'Date' class in kotlin. And you need to format the date
     *  based on your country's default date format.
     *  For example USA uses date format like this yyyy-MM-dd
     *  But Turkey, uses like this -> dd-MM-yyyy. So by default date format comes with USA style.
     *  Let's set the date format like Turkish style.
     */
    fun Date.formatToTurkishStyle(pattern: String = "dd-MM-yyyy HH:mm:ss"): String {
        val formatter = SimpleDateFormat(pattern)
        return formatter.format(this)
    }

    val currentDate = Date()
    // One of my favorite feature in Kotlin tbh :D
    val formattedDate = currentDate.formatToTurkishStyle()

    println("Formatted Date: $formattedDate")

    println("-------------------------------------------")

    /**             Singleton
     *   Singleton is a design pattern that ensures a class has only one instance and
     *   provides a global point of access to that instance. This pattern is commonly used when you need to
     *   create an object that should only have one instance throughout the entire lifetime of the application.
     */

    println("Page 47 -> Singleton")

    /**
     * Imagine you are developing a logging system for an application.
     * You want to ensure that there is only one instance of the logger throughout
     * the application, and all components can access and use this logger to record events,
     * errors, and debug information.
     */

    val logger = Logger.getInstance()

    logger.log("Application started.")
    logger.log("Error occurred: NullPointerException")
    logger.log("Debug information: User logged in.")

    val anotherLogger = Logger.getInstance()
    println("Are both instances the same? ${logger === anotherLogger}")

    /**
     *  So why do we need one instance?
     *  Consistency -> All parts of the application log to the same destination with the same configuration
     *      making it easier to manage and analyze the logs.
     *  Resource Efficiency -> Logging can be resource intensive. Especially if it involves writing to files or
     *      sending data over the network.If you have multiple instances of logger, it can be lead resource consumption.
     */

    println("-------------------------------------------")

    /**             Abstract
     *  an abstract class is a class marked with the abstract keyword, and it cannot be instantiated directly.
     *  It serves as a blueprint for other classes to inherit from and provides common behavior
     *  and properties that subclasses can override or implement.
     */

    println("Page 48 -> Abstract")

    /**
     *  Let's assume that you're developing Getir's grocery store feature where users can browse and purchase
     *  various fruits and vegetables.  The application needs to display information about each fruit and vegetable,
     *  including its name, availability (whether it's in stock or not), price per unit, and the quantity available in stock.
     *  In this scenario, you've defined an abstract class "Food" to represent different food items. Such as fruits and
     *  vegetables. Each fruit and vegetable object contains attributes such as its name, availability (isInStock),
     *  price per unit (price), and the quantity available in stock (quantity).
     */
    class Fruit(
        override val name: String,
        override val isInStock: Boolean,
        override val price: Double,
        override val quantity: Int
    ) : Food() {
        override fun remainingStock(): Int {
            return if (isInStock) quantity else 0
        }
    }

    class Vegetable(
        override val name: String,
        override val isInStock: Boolean,
        override val price: Double,
        override val quantity: Int
    ) : Food() {
        override fun remainingStock(): Int {
            return if (isInStock) quantity else 0
        }
    }

    val banana = Fruit("Banana", true, 3.0, 10)
    val spinach = Vegetable("Spinach", false, 3.0, 0)
    println(banana.name)
    println("${spinach.name} price: ${spinach.price.toInt()} TL")

    println("-------------------------------------------")

    /**             If Not Null Shorthand (Safe Call)
     *  It is a concise way to perform a null-check on an object and execute a block of code
     *  only if the object is not null.
     *
     *  Safe Call Operator (?.): The safe call operator allows you to access properties or
     *  call functions on an object without the risk of throwing a NullPointerException if the object is null.
     *  If the object is null, the expression returns null instead of causing an exception.
     *
     *  Elvis operator (?:) -> It is used to provide a default value when the expression to its left is null.
     */
    println("Page 49 -> If Not Null Shorthand (Safe Call)")

    val nullableVariable: String? = null
    println(nullableVariable?.lowercase() ?: "It's null.")

    println("-------------------------------------------")

    /**             Let Function
     *  The let function is a scoping function in Kotlin that executes the
     *  specified block of code if the object is not null. Inside the let block,
     *  you can refer to the non-null object using the 'it' keyword.
     */

    println("Page 50 -> Let Function")

    val letExample: String? = "Enes"

    letExample?.let {
        println("My name is $it")
    } ?: run {
        println("I'm afraid it's a null variable.")
    }

    println("-------------------------------------------")

    println("Page 55 -> Return When Expression")

    fun getFoodType(food: String): String {
        return when (food) {
            "Apple", "Banana", "Orange" -> "Fruit"
            "Spinach", "Broccoli", "Carrot" -> "Vegetable"
            else -> "Unknown"
        }
    }
    println("Type of Banana: ${getFoodType("Banana")}")

    println("-------------------------------------------")

    /**             Try - Catch
     *  Try-catch blocks are used for exception handling.
     *  They allow you to handle exceptions that might occur during the execution of a block of code.
     *  You should use try-catch blocks when you wait that a particular piece of code might throw an exception,
     *  and you want to handle it without crashing the program.
     */
    println("Page 56 -> Try-Catch")

    /**
     *  Assume that you're in Getir development team and developing grocery feature again.
     *  Customers can add items to their cart, but sometimes there might be issues with the
     *  availability of item or network issue or errors during the checkout process. In such
     *  cases you might want to handle any exceptions to ensure a trustful shopping experience
     *  for the customers. Let's use this.
     */

    // Create a custom exception for handling out of stock items
    class OutOfStockException(message: String) : Exception(message)

    fun checkAvailability(food: String): Boolean {
        val isAvailable = Random().nextBoolean()
        if (!isAvailable) {
            throw OutOfStockException(message = "$food is out of stock.")
        }
        return isAvailable
    }

    fun addToCart(food: String) {
        try {
            if (checkAvailability(food)) {
                println("$food added to cart.")
            }
        } catch (e: OutOfStockException) {
            println("Unfortunately ${e.message}")
        }
    }

    addToCart("Banana")

    println("-------------------------------------------")

    /**             Apply Function
     *   An extension function that is defined on any object. It allows you to execute a block of code
     *   on an object within the context of that object itself. The apply function returns the object
     *   it was called on after applying the transformations specified in the block.
     *
     *   Why should I use this?
     *   It provides a concise and fluent way to initialize or configure objects,
     *   especially when you need to set multiple properties or perform multiple operations on the same object.
     *   You will use this when you want to set up RecyclerView :)
     */

    println("Page 59 -> Apply Function")

    // Let's use this apply function with Getir grocery store example.
    class FoodItem(
        var foodName: String = "",
        var isInStock: Boolean = false,
        var quantity: Int = 0,
        var price: Double = 0.0
    )

    val apple = FoodItem().apply {
        foodName = "Apple"
        quantity = Random().nextInt(11)
        isInStock = quantity != 0
        price = 9.0
    }
    val isAppleAvailable =
        if (apple.isInStock) "${apple.foodName} is in stock. We have ${apple.quantity} apples. :)"
        else "Unfortunately we don't have apples right now. :("

    println(isAppleAvailable)

    println("-------------------------------------------")

    /**             With Function
     *  Well, it's not an extension function as 'apply'. Kotlin recommend this when you use for calling functions
     *  on the context object and when you don't need to use the returned value.
     */

    println("Page 61 -> With Function")

    /**
     *  It's a very common problem of kotlin community that when should we use 'with' or 'apply'?
     *  Usually you use 'apply' when you need to do something with an object and return it.
     *  And when you need to perform some operations on an object
     *  and return some other object you can use either 'with' or 'run'.
     *
     *  And also when you work with nullable objects, you need to use 'apply' instead of 'with'.
     */

    val watermelon = FoodItem()
    with(watermelon) {
        foodName = "Watermelon"
        quantity = (0..10).random()
        isInStock = quantity != 0
        price = 15.0
    }

    val isWatermelonAvailable =
        if (watermelon.isInStock) "${watermelon.foodName} is in stock. We have ${watermelon.quantity} watermelons. :)"
        else "Unfortunately we don't have watermelons right now. :("

    println(isWatermelonAvailable)

    println("-------------------------------------------")

    /**             Generic Types
     *  Generic types allow you to define classes, functions, and interfaces with placeholder types
     *  that are specified when the class, function, or interface is used. This provides type safety and flexibility,
     *  allowing you to write reusable code that can work with different types.
     */

    println("Page 64 -> Generic Types")

    /**
     *  When to use it?
     *  You should use generic types when you want to write code that is independent of specific data types
     *  but still provides type safety. Generic types are particularly useful when you need to write code that can
     *  work with different types of data while ensuring type safety and avoiding code duplication.
     */


    /**
     *  Suppose we want to create a function that checks if a given item type is available.
     *  We have a list of available items, including vegetables and fruits,
     *  and we want to retrieve based on their types.
     */

    open class FoodGeneric(val name: String)
    class VegetableGeneric(name: String) : FoodGeneric(name)
    class FruitGeneric(name: String) : FoodGeneric(name)

    class Inventory<T : FoodGeneric> {
        private val items: MutableList<T> = mutableListOf()

        fun addItem(item: T) {
            items.add(item)
        }

        inline fun <reified R : T> getItemsOfType(): List<R> {
            return items.filterIsInstance<R>()
        }
        /**
         *  Wait what the hell was that?
         *
         *  In Kotlin, the higher-order functions or lambda expressions, all stored as an object so memory allocation,
         *  for both function objects and classes, and virtual calls might introduce runtime overhead.
         *  Sometimes we can eliminate the memory overhead by inlining the lambda expression.
         *  In order to reduce the memory overhead of such higher-order functions or lambda expressions,
         *  we can use the inline keyword which ultimately requests the compiler to not allocate memory and
         *  simply copy the inlined code of that function at the calling place.
         *
         *  So I can use inline keyword for all function that I've made. Isn't it correct?
         *
         *  No, you shouldn't user inline keyword for all functions.
         *  1. If you have a simple function that doesn't accept other functions as an argument,
         *      it does not make sense to inline them.
         *  2. You cannot inline when function parameter is being assigned to a variable inside the function
         *  3. You should not inline huge functions, think about generated byte code.
         *      It will be copied to all places the function is called from.
         *  4. If you're dealing with limited memory environments or situations
         *      where code size is a concern, avoid inlining. Compilation time takes too long.
         *
         *  What about reified?
         *
         *  The purpose of reified is to allow the function to use T at compile time (to access it within the function).
         */
    }

    val inventory = Inventory<FoodGeneric>()

    inventory.addItem(VegetableGeneric("Carrot"))
    inventory.addItem(VegetableGeneric("Broccoli"))
    inventory.addItem(VegetableGeneric("Spinach"))

    inventory.addItem(FruitGeneric("Apple"))
    inventory.addItem(FruitGeneric("Banana"))
    inventory.addItem(FruitGeneric("Orange"))

    val vegetablesGeneric = inventory.getItemsOfType<VegetableGeneric>()
    println("Vegetables in the inventory: ${vegetablesGeneric.joinToString(", ") { it.name }}")

    val fruitsGeneric = inventory.getItemsOfType<FruitGeneric>()
    println("Fruits in the inventory: ${fruitsGeneric.joinToString(", ") { it.name }}")

    println("-------------------------------------------")

    /**             Also Function
     *  The 'also' function is an extension function defined on any object.
     *  It executes the given block of code on the object and returns the same object.
     *  It is particularly useful when you want to perform some additional actions on
     *  an object without changing its state and then continue working with the same object.
     */

    println("Page 65 -> Also Function")

    val person2 = Person()
    person2.name = "Enes"
    person2.age = 24

    val personWithAlso = person.also {
        it.name = "Ceren"
        it.age = 23
    }

    println("Person with also: ${personWithAlso.name}")
    println("Original person: ${person2.name}")

    println("-------------------------------------------")

    /**             TODO()
     *  It is a function that creates a placeholder indicating that some functionality is yet to be implemented.
     *  It is commonly used as a temporary marker to remind developers to come back and complete a task.
     */

    println("Page 66 -> TODO")

    // For example, you are willing to do login screen logic. But you need to do this later.
    fun login() {
        TODO()
    }

    println("-------------------------------------------")

    /**             Default Parameters
     *  Default parameters allow you to define default values for function parameters.
     *  These default values are used when the function is called without providing values for those parameters.
     *  This feature simplifies function calls by allowing you to omit arguments for parameters with default values.
     *
     *  Check the line 640. I've already done this.
     */

    println("Page 67 -> Default Parameters")

    println("-------------------------------------------")

    /**             Infix Functions
     *  It allows you to call functions using infix notation, where the function is called directly
     *  on the object without using the dot notation or parentheses. This can lead to more concise and readable code
     *  in certain scenarios.
     */

    println("Page 68 -> Infix Functions")

    val fruitListInfix = mutableListOf<String>("Apple", "Banana", "Watermelon")

    infix fun MutableList<String>.add(fruit: String) {
        fruitListInfix.add(fruit)
        println("$fruit added to cart.")
    }

    // Isn't it more readable than standard way??
    fruitListInfix add "Pineapple"
    println(fruitListInfix)

    println("-------------------------------------------")


    /**             Operator Functions
     *  Operator functions allow you to define custom behaviors for built-in operators like +, -, *, /, ==, !=, and so on.
     *  This can be useful when you want to provide custom functionality for specific operations on your own types.
     */

    println("Page 69 -> Operator Functions")

    class Counter(var value: Int) {
        operator fun plusAssign(increment: Int) {
            value += increment
        }
    }

    val counter = Counter(5)

    // Use operator fun with +=
    counter += 3

    println("Counter value after increment: ${counter.value}")

    println("-------------------------------------------")

    println("Page 70 -> Vararg")

    // So you can add infinite item if you want. It takes vararg as parameter.
    fun calculateTotalPrice(vararg items: FoodItem): Double {
        var totalPrice = 0.0
        items.forEach {
            totalPrice += it.price
        }
        return totalPrice
    }

    val appleVararg = FoodItem(foodName = "Apple", price = 9.0)
    val bananaVararg = FoodItem(foodName = "Banana", price = 19.0)
    val carrotVararg = FoodItem(foodName = "Carrot", price = 7.0)
    val orangeVararg = FoodItem(foodName = "Orange", price = 8.0)

    println("Total price is -> ${calculateTotalPrice(appleVararg, bananaVararg, carrotVararg, orangeVararg)}")

    println("-------------------------------------------")

    // Page 77 Inheritance -> Check line 716 for instance.
    // Page 78 Inheritance with Parameterized Constructor -> Check line 602 for instance.

    println("Page 83-84 -> While and Do-while loops.")

    var count = 0

    println("While loop:")
    while (count < 3) {
        println("Count is $count")
        count++
    }

    count = 0

    println("Do-while loop:")
    do {
        println("Count is $count")
        count++
    } while (count < 3)

    println("-------------------------------------------")

    /**             Equality Checks
     *  Equality check is the process of comparing two objects or values to determine if they are equal or not.
     *
     *  In Kotlin, there are two types of equality checks:
     *
     * Structural equality (==): This checks if the contents of two objects are the same.
     * Referential equality (===): This checks if two references point to the same object in memory.
     *
     * You would use equality checks in Kotlin to compare objects or values in various scenarios to determine
     * if they are equal. This can be useful when you need to verify if two objects have the same content or
     * if they refer to the same object.
     */

    println("Page 88 -> Equality Checks")

    /**
     *  Suppose we have a FoodItem class representing items available at the Getir grocery store.
     *  We want to check if two grocery items are equal based on their names and prices.
     */

    data class FoodItem2(val foodName: String, val price: Double)

    val apple1 = FoodItem2(foodName = "Apple", price = 8.0)
    val apple2 = FoodItem2(foodName = "Apple", price = 8.0)
    val banana1 = FoodItem2(foodName = "Banana", price = 12.0)

    println("Are apple1 and apple2 equal? ${apple1 == apple2}")
    println("Are apple1 and banana equal? ${apple1 == banana1}")

    println("Are apple1 and apple2 the same object? ${apple1 === apple2}")
    println("Are apple1 and apple1 the same object? ${apple1 === apple1}")

    println("-------------------------------------------")

    /**             Data class
     *  Data classes in Kotlin are primarily used to hold data. For each data class,
     *  the compiler automatically generates additional member functions that allow you to print
     *  an instance to readable output, compare instances, copy instances, and more.
     *
     *  Data classes automatically provide implementations for methods like
     *  toString(), equals(), hashCode(), and copy(), componentN() based on the properties declared in the primary constructor.
     *
     *  The primary constructor must have at least one parameter. Well, you need to hold data right? So where is the data then?
     *
     *  All primary constructor parameters must be marked as val or var. Otherwise, componentN methods won't be created.
     *
     *  Data classes can't be abstract, open, sealed, or inner.
     */

    println("Page 92 -> Data class")

    data class FoodItem3(val foodName: String, val price: Double)

    val apple3 = FoodItem3("Apple", 3.0)
    val banana3 = FoodItem3("Banana", 7.0)
    val orange3 = FoodItem3("Orange", 1.0)

    println(apple3)
    println(banana3)
    println(orange3)

    println("-------------------------------------------")

}

// Abstract example. Line 492
abstract class Food {
    abstract val name: String
    abstract val isInStock: Boolean
    abstract val price: Double
    abstract val quantity: Int

    abstract fun remainingStock(): Int
}

// Singleton example. Line 458
class Logger {
    companion object {

        private var instance: Logger? = null

        fun getInstance(): Logger {
            if (instance == null) {
                instance = Logger()
            }
            return instance!!
        }

    }

    fun log(message: String) {
        println("[LOG] $message")
    }
}
