package com.rahul.designpatterndemo.coroutines

/**
 * Created by abrol at 01/02/25.
 */
fun main() {
    val alphabets = ('a'..'z').joinToString("").repeat(2)
    println(alphabets)
    val user = User()
    user.copy()
}

data class User(val name: String? = null)