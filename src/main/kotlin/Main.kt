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

    val person = Person("Bob", 16)
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

    val name1: String = "John"
    val name2: String? = null
    println("name1 length: ${name1.length}")
    println(name2?.length ?: "name2 is null")

    val names2 = listOf("Alice", "Bob", "Charlie")

    names2.forEach { name -> println("name : $name") }
    names2.forEach { println("name : $it") }

    val p1 = Person("Alice", 29)
    val p2 = Person("Bob", 30)

    println(p1) // == p1.toString()
    println(p1 == p2) // == p1.equals(p2)
}

fun add(a: Int, b: Int): Int {
    return a + b
}

data class Person(
    val name: String,
    val age: Int
) {
    fun greet() {
        println("Hello, my name is $name")
    }

    fun sayOwnAge() {
        println("I am $age years old.")
    }
}