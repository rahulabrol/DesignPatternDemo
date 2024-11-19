package com.rahul.designpatterndemo.problems.launchmode

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.rahul.designpatterndemo.R
import com.rahul.designpatterndemo.experiments.NewProcessService

/**
 * Created by Rahul Abrol on 24/1/21.
 */
class ActivityA : AppCompatActivity() {
    private val TAG = "ActivityA"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        findViewById<TextView>(R.id.textView2).setOnClickListener {
            startService(Intent(this, NewProcessService::class.java))
//            startActivity(Intent(this@ActivityA, ActivityB::class.java))

//            for (i in 1..100){
//                startService(Intent(this@ActivityA, MyService::class.java))
//            }
        }
        Log.e(TAG, "onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "onRestart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e(TAG, "onSaveInstanceState called")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e(TAG, "onRestoreInstanceState called")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.e(TAG, "onBackPressed called")
    }
}