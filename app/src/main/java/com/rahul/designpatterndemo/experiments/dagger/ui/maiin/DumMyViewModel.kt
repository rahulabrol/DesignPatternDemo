package com.rahul.designpatterndemo.experiments.dagger.ui.maiin

import androidx.lifecycle.ViewModel
import com.rahul.designpatterndemo.experiments.dagger.data.local.DatabaseService
import com.rahul.designpatterndemo.experiments.dagger.data.remote.NetworkService
import com.rahul.designpatterndemo.experiments.dagger.di.ActivityScope
import javax.inject.Inject

/**
 * Created by abrol at 24/11/24.
 */
@ActivityScope
class DumMyViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService
) :ViewModel(){

    fun getSomeData(): String {
        return "dsHashCode: " + databaseService.hashCode() + "\n" + "nsHashCode: " + networkService.hashCode()
    }

}