package com.programmers.be14

fun main() {
    val len = "Hello".also {
        println("Before: $it")
    }.uppercase().also {
        println("After: $it")
    }.length

    println("Length: $len")

    printOneEqualLine()

    val num27 = 5
    println("num27 : $num27")

    val rst27 = num27.run {
        this * 2 + 10
    }.also { println("result27: $it") }

    printOneEqualLine()

    val p1 = Person("John", 20, 60.0, 1000000)

    with(p1) {
        increaseAge(1)
        increaseWeight(10.0)
        increaseSalary(10000)
    }
    p1.getInfo()

    printOneEqualLine()


}

fun printOneEqualLine() {
    for (i in 1..30) { print("=")}
    println()
}

class Person(
    var name: String,
    var age: Int,
    var weight: Double,
    var salary: Int
) {
    fun increaseAge(years: Int) { age += years }
    fun increaseWeight(kg: Double) { weight += kg }
    fun increaseSalary(amount: Int) { salary += amount }
    fun getInfo() {
        println("name: $name")
        println("age: $age")
        println("weight: $weight")
        println("salary: $salary")
    }
}