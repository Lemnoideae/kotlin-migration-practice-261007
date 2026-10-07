package com.programmers.be14

fun main() {
    val number = 10
    var message = "hello world"

    message = "Kotlin!"
    println("hello ${message}")

    val str = if(number % 2 == 0) "Even" else "Odd"
    println(str)
}