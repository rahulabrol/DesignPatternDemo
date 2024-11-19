package com.rahul.designpatterndemo.experiments

import android.app.Service
import android.content.Intent
import android.os.IBinder

/**
 * Created by abrol at 19/11/24.
 */
class NewProcessService : Service() {
    companion object {
        private const val TAG = "NewProcessService"
    }

    override fun onCreate() {
        logCurrentMemoryProfile("onCreate start")
        super.onCreate()
        logCurrentMemoryProfile("after onCreate")
//        Thread {
//            Thread.sleep(10000)
//            logCurrentMemoryProfile("onCreate end after delay")
//        }.start()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}