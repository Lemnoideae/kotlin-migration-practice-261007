package com.programmers.be14

fun main() {
    val p1 = Person()

    p1.apply {
    name = "John"
    age = 20
}
    .also { println("name: ${it.name}, age: ${it.age} applied") }.name.length
        .run { this * 2 }
        .also { println("name length * 2: $it") }

    val rst1 = with(p1) { println("$name : $age ")}

    printOneEqualLine()

    val example = Example()
    example.value = "test"
    println("value : ${example.value}")
    println("length: ${example.value.length}")

    printOneEqualLine()

    println(lazyValue)
    println(lazyValue)

    printOneEqualLine()

    MathUtil.square(5).also { println("square of 5: $it") }
    MathUtil.PI.also { println("PI: $it") }

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

class Example {
    lateinit var value: String
}

val lazyValue: String by lazy {
    println("initializing...")
    "Hello, Lazy"
}

class MathUtil {

    companion object {
        val PI = 3.141569

        fun square(n: Int): Int {
            return n * n
        }
    }
}
