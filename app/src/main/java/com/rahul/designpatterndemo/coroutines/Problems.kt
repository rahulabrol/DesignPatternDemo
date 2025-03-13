package com.rahul.designpatterndemo.coroutines

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Created by abrol at 18/01/25.
 */

//Company name - LOKAL
//Live coding round question
// Create a generic debouncer class which debounces requests
// Example - assume you are sending analytic events to your sever rapidly
// only send the last event after a certain cooldown time, this cooldown time should be configurable

fun main() {
    main1()
    main2()
    main3()
    main4()
    main5()
}


// What will be the output of this program
fun main1() {
    val topLevelScope = CoroutineScope(SupervisorJob())
    topLevelScope.async {
        throw RuntimeException("RuntimeException in async coroutine")
    }

    Thread.sleep(100)
}

//=============================================================================
// What will be the output of this program
fun main2() {
    val topLevelScope = CoroutineScope(Job())
    topLevelScope.launch {
        try {
            throw RuntimeException("RuntimeException in coroutine")
        } catch (exception: Exception) {
            println("Handle $exception")
        }
    }
    Thread.sleep(100)
}

//============================================================================
fun main3() {
    val topLevelScope = CoroutineScope(Job())
    topLevelScope.launch {
        try {
            coroutineScope {
                launch {
                    throw RuntimeException("RuntimeException in nested coroutine")
                }
            }
        } catch (exception: Exception) {
            println("Handle $exception in try/catch")
        }
    }

    Thread.sleep(100)
}

//============================================================================

// We need to call `getUser` and `getProfile` in parallel and wait for both to
// complete and show result in the UI
fun main4() {
//    val topLevelScope = CoroutineScope(Job())
    runBlocking {
        val userDeferred = async { getUser() }  // Launch in parallel
        val profileDeferred = async { getProfile() }  // Launch in parallel

        val user = userDeferred.await()  // Wait for result
        val profile = profileDeferred.await()  // Wait for result
        println("Result: $user and $profile")
    }
}


suspend fun getUser(): String {
    delay(1000) // Simulate network delay
    return "Got user"
}

suspend fun getProfile(): String {
    delay(2000) // Simulate network delay
    return "Got profile"
}

//============================================================================

//What will be the output of this program
/*
The exception is NOT caught by CoroutineExceptionHandler.
Instead, it crashes the application, because:

The nested coroutine fails and cancels its parent.
The outer coroutine doesn’t handle the exception, leading to a crash.

 */
fun main5() {
    val coroutineExceptionHandler = CoroutineExceptionHandler { coroutineContext, exception ->
        println("Handle $exception in CoroutineExceptionHandler")
    }

    val topLevelScope = CoroutineScope(Job())

    topLevelScope.launch {
        launch(coroutineExceptionHandler) {
            throw RuntimeException("RuntimeException in nested coroutine")
        }
    }

    Thread.sleep(100)
}