package com.rahul.designpatterndemo.problems

import android.media.midi.MidiReceiver

/**
 * Created by Rahul Abrol on 5/9/19.
 */
data class User(var name: String = "Rahul"){
    var age:Int=32
}

fun main() {
    var str: String? = null
     str.run1 { println("LLLLLLLLL") }
    str?.let1 {
        println("Rahul")
    }
    str = "Abrol"
    str.let1 {
        println("Abrol")
    }
val user = User(name = "HEllp").also1 { it.name = "okok" }
    println(user.name)
    user.apply1 { age = 76 }

    println(user.age)
}

inline fun <T, R> T.let1(block: (T) -> R): R {
    return block(this)
}

inline fun <T> T.also1(block: (T) -> Unit): T {
    block(this)
    return this
}

inline fun <T> T.apply1(block: T.() -> Unit):T{
    block()
    return this
}

inline fun <T,R> T.run1(block: T.() -> R): R {
    return block(this)
}

inline fun <T,R> T.with1(receiver: T,block: T.() -> R):R{
    return receiver.block()
}






