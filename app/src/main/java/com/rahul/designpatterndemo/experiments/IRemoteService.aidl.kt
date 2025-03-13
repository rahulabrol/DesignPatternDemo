package com.rahul.designpatterndemo.experiments

/**
 * Created by abrol at 24/11/24.
 */

/** Example service interface  */
internal interface IRemoteService {
    /** Request the process ID of this service.  */
    val pid: Int

    /** Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    fun basicTypes(
        anInt: Int, aLong: Long, aBoolean: Boolean, aFloat: Float,
        aDouble: Double, aString: String?
    )
}