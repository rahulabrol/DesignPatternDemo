package com.rahul.designpatterndemo.problems.config_handling_with_fragments

import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.AsyncTask
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import androidx.fragment.app.Fragment


/**
 * Created by Rahul Abrol on 5/9/19.
 */
class TaskFragment : Fragment() {

    /**
     * Callback interface through which the fragment will report the
     * task's progress and results back to the Activity.
     */
    interface TaskCallbacks {
        fun onPreExecute()
        fun onProgressUpdate(percent: Int)
        fun onCancelled()
        fun onPostExecute()
    }

    private var mCallbacks: TaskCallbacks? = null
    private var mTask: DummyTask? = null

    /**
     * Hold a reference to the parent Activity so we can report the
     * task's current progress and results. The Android framework
     * will pass us a reference to the newly created Activity after
     * each configuration change.
     */
    override fun onAttach(activity: Context) {
        super.onAttach(activity)
        mCallbacks = activity as TaskCallbacks?
    }

    /**
     * This method will only be called once when the retained
     * Fragment is first created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Retain this fragment across configuration changes.
        retainInstance = true

        // Create and execute the background task.
        mTask = DummyTask()
        mTask!!.execute()
//        val intent = Intent(RingtoneManager.ACTION_RINGTONE_PICKER)
//        startActivityForResult(intent,100)
    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
////        super.onActivityResult(requestCode, resultCode, data)
//        Log.e("TAG", "FRG out")
//        if(resultCode == 100){
//            Log.e("TAG", "FRG in 100")
//        }
//    }

    /**
     * Set the callback to null so we don't accidentally leak the
     * Activity instance.
     */
    override fun onDetach() {
        super.onDetach()
        mCallbacks = null
    }


    /**
     * A dummy task that performs some (dumb) background work and
     * proxies progress updates and results back to the Activity.
     *
     * Note that we need to check if the callbacks are null in each
     * method in case they are invoked after the Activity's and
     * Fragment's onDestroy() method have been called.
     */
    inner class DummyTask : AsyncTask<Unit, Int, Unit>() {
        override fun onPreExecute() {
            if (mCallbacks != null) {
                mCallbacks?.onPreExecute()
            }
        }

        /**
         * Note that we do NOT call the callback object's methods
         * directly from the background thread, as this could result
         * in a race condition.
         */
        override fun doInBackground(vararg params: Unit?) {

            for (i in 1..100) {
                if (!isCancelled) {
                    SystemClock.sleep(100)
                    publishProgress(i)
                }
            }
        }

        override fun onProgressUpdate(vararg values: Int?) {
            if (mCallbacks != null) {
                mCallbacks?.onProgressUpdate(values[0] as Int)
            }
        }

        override fun onPostExecute(result: Unit?) {
            if (mCallbacks != null) {
                mCallbacks?.onPostExecute()
            }
        }

        override fun onCancelled() {
            if (mCallbacks != null) {
                mCallbacks?.onCancelled()
            }
        }
    }
}