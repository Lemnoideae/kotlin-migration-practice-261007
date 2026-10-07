package com.programmers.be14

fun main() {
    val message = "Kotlin!"
    println("hello $message")

    for(i in 0 until 10) {
        var string = ""
        string = if(i % 2 == 0) "Even" else "Odd"
        println("num : ${i}, $string")
    }

    val result = add(5, 10)
    println(result)

    val person = Person("Alice")
    person.greet()
}

fun add(a: Int, b: Int): Int {
    return a + b
}

class Person(
    val name: String
) {
    fun greet() {
        println("Hello, my name is $name")
    }
}