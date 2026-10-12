package com.programmers.be14

fun main() {
    val p1 = Person("John", 20)
    val p2 = Person(age = 20)
}

class Person(val name: String = "(anonymous)", val age: Int = 0) {
    constructor(age: Int) : this("(anonymous)", age)
}