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

    val names = mutableListOf("Alice", "Bob", "Charlie")
    names.add("David")

    for (name in names) {
        println("name : $name")
    }

    val ages = mutableMapOf("Peter" to 24, "Clark" to 31, "Bruce" to 32)
    ages.put("Barry", 25)

    for ((key, value) in ages) {
        println("$key is $value years old.")
    }

    val name: String? = null
    println(name?.length ?: "Name is null")
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