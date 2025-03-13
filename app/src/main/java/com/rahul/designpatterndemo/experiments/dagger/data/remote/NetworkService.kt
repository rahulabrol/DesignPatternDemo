package com.rahul.designpatterndemo.experiments.dagger.data.remote

import android.content.Context
import com.rahul.designpatterndemo.experiments.dagger.di.ApplicationContext
import com.rahul.designpatterndemo.experiments.dagger.di.ApplicationScope
import com.rahul.designpatterndemo.experiments.dagger.di.NetworkApiKey
import javax.inject.Inject

/**
 * Created by abrol at 24/11/24.
 */
@ApplicationScope
class NetworkService @Inject constructor(
    private val httpClient: HttpClient,
    @ApplicationContext private val context: Context,
    @NetworkApiKey private val networkApiKey: String
)  {
    fun getDummyData(): String {
        return "NETWORK_DUMMY_DATA"
    }
}