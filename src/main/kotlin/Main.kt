package com.programmers.be14

fun main() {
    val p1 = Person()

    p1.apply {
        name = "John"
        age = 20
    }
        .also { println("name: ${it.name}, age: ${it.age} applied") }
        .let { it.name.length }
        .run { this * 2 }
        .also { println("name length * 2: $it") }

    val rst1 = with(p1) { println("$name : $age ")}

    printOneEqualLine()
}

fun printOneEqualLine() {
    for (i in 1..30) { print("=")}
    println()
}

class Person(
    var name: String = "",
    var age: Int = 0
) {}