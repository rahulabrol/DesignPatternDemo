package com.rahul.designpatterndemo.experiments

import android.util.Log

const val TAG = "logCurrentMemoryProfile"

fun logCurrentMemoryProfile(src: String) {
    val maxMemoryInMB = Runtime.getRuntime().maxMemory() / 1024 / 1024
    val totalMemoryInMB = Runtime.getRuntime().totalMemory() / 1024 / 1024
    val freeMemoryInMB = Runtime.getRuntime().freeMemory() / 1024 / 1024
    val usedMemoryInMB = totalMemoryInMB - freeMemoryInMB

    Log.d(TAG, "***************************")
    Log.d(TAG, "Start for the source: $src")

    Log.d(TAG, "maxMemoryInMB : $maxMemoryInMB")
    Log.d(TAG, "totalMemoryInMB : $totalMemoryInMB")
    Log.d(TAG, "freeMemoryInMB : $freeMemoryInMB")
    Log.d(TAG, "usedMemoryInMB : $usedMemoryInMB")

    Log.d(TAG, "End for the source: $src")
    Log.d(TAG, "***************************")
}