package com.example.designpatterndemo.problems.config_handling_with_fragments

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.designpatterndemo.R


/**
 * This Activity displays the screen's UI, creates a TaskFragment
 * to manage the task, and receives progress updates and results
 * from the TaskFragment when they occur.
 *
 * Created by Rahul Abrol on 5/9/19.
 */
class MainActivity : AppCompatActivity(), TaskFragment.TaskCallbacks {

    private var mTaskFragment: TaskFragment? = null


    companion object {
        private const val TAG_TASK_FRAGMENT = "task_fragment"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.textView).text = "fragment"
        val fm = supportFragmentManager
        mTaskFragment = fm.findFragmentByTag(TAG_TASK_FRAGMENT) as TaskFragment

        // If the Fragment is non-null, then it is currently being
        // retained across a configuration change.
        if (mTaskFragment == null) {
            mTaskFragment = TaskFragment()
            fm.beginTransaction().add(mTaskFragment!!, TAG_TASK_FRAGMENT).commit()
        }

        // TODO: initialize views, restore saved state, etc.
    }

    // The four methods below are called by the TaskFragment when new
    // progress updates or results are available. The MainActivity
    // should respond by updating its UI to indicate the change.
    override fun onPreExecute() {

    }

    override fun onProgressUpdate(percent: Int) {

    }

    override fun onCancelled() {

    }

    override fun onPostExecute() {

    }

}
