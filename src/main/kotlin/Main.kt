package com.programmers.be14

fun main() {
    val name: String? = "hello"
    val len = name?.length ?: 0
    println(len)

    val rst25 = name?.let {
        println(it.length)
        10
    }
    println(rst25)
}