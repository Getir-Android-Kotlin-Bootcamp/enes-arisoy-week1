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



}