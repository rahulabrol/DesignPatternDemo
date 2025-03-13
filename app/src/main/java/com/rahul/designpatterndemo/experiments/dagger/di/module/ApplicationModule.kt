package com.rahul.designpatterndemo.experiments.dagger.di.module

import android.content.Context
import com.rahul.designpatterndemo.experiments.dagger.MyApp
import com.rahul.designpatterndemo.experiments.dagger.data.local.FileStorageService
import com.rahul.designpatterndemo.experiments.dagger.data.remote.HttpClient
import com.rahul.designpatterndemo.experiments.dagger.di.ApplicationContext
import com.rahul.designpatterndemo.experiments.dagger.di.ApplicationScope
import com.rahul.designpatterndemo.experiments.dagger.di.DatabaseName
import com.rahul.designpatterndemo.experiments.dagger.di.DatabaseVersion
import com.rahul.designpatterndemo.experiments.dagger.di.NetworkApiKey
import dagger.Module
import dagger.Provides

/**
 * Created by abrol at 24/11/24.
 */
@Module
class ApplicationModule(private val myApp: MyApp) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context = myApp.applicationContext

    @ApplicationScope
    @Provides
    fun provideHttpClient(): HttpClient {
        return HttpClient()
    }

    @Provides
    @DatabaseName
    fun provideDatabaseName(): String = "dummy_db"

    @Provides
    @DatabaseVersion
    fun provideDatabaseVersion(): Int = 1

    @Provides
    @NetworkApiKey
    fun provideApiKey(): String = "SOME_API_KEY"

    @ApplicationScope
    @Provides
    fun provideFileStorageService(): FileStorageService {
        return FileStorageService()
    }

}