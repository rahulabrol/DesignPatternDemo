package com.rahul.designpatterndemo.experiments.dagger.ui.home

import com.rahul.designpatterndemo.experiments.dagger.data.local.DatabaseService
import com.rahul.designpatterndemo.experiments.dagger.data.local.FileStorageService
import com.rahul.designpatterndemo.experiments.dagger.data.remote.NetworkService
import javax.inject.Inject

/**
 * Created by abrol at 24/11/24.
 */
class HomeViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService,
    private val fileStorageService1: FileStorageService,
    private val fileStorageService2: FileStorageService,
) {

    fun getSomeData(): String {
        return " databaseService : " + databaseService.getDummyData() + "\n" +
                " databaseServiceHashCode : " + databaseService.hashCode() + "\n" +
                " networkService : " + networkService.getDummyData() + "\n" +
                " networkServiceHashCode : " + networkService.hashCode() + "\n" +
                " fileStorageService1HashCode : " + fileStorageService1.hashCode() + "\n" +
                " fileStorageService2HashCode : " + fileStorageService2.hashCode()
    }

}