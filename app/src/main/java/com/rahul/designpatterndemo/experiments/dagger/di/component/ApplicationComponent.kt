package com.rahul.designpatterndemo.experiments.dagger.di.component

import android.content.Context
import com.rahul.designpatterndemo.experiments.dagger.MyApp
import com.rahul.designpatterndemo.experiments.dagger.data.local.DatabaseService
import com.rahul.designpatterndemo.experiments.dagger.data.local.FileStorageService
import com.rahul.designpatterndemo.experiments.dagger.data.remote.NetworkService
import com.rahul.designpatterndemo.experiments.dagger.di.ApplicationContext
import com.rahul.designpatterndemo.experiments.dagger.di.ApplicationScope
import com.rahul.designpatterndemo.experiments.dagger.di.module.ApplicationModule
import dagger.Component

/**
 * Created by abrol at 24/11/24.
 */
@ApplicationScope
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(application: MyApp)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

    fun getFileStorageService(): FileStorageService
}