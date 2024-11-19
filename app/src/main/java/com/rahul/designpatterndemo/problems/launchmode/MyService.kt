package com.rahul.designpatterndemo.problems.launchmode

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

/**
 * Created by Rahul Abrol on 24/1/21.
 */
class MyService: Service() {
    private val TAG = "MyService"
    override fun onBind(intent: Intent?): IBinder? {
        Log.e(TAG, "onBind called")
        return null
    }

    override fun onCreate() {
        super.onCreate()
        Log.e(TAG, "onCreate called")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.e(TAG, "onStartCommand called")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.e(TAG, "onLowMemory called")
    }

    override fun onRebind(intent: Intent?) {
        super.onRebind(intent)
        Log.e(TAG, "onRebind called")
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        super.onTaskRemoved(rootIntent)
        Log.e(TAG, "onTaskRemoved called")
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        Log.e(TAG, "onTrimMemory called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy called")
    }
}