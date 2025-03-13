package com.rahul.designpatterndemo.experiments.dagger

import android.app.Application
import com.rahul.designpatterndemo.experiments.dagger.data.local.DatabaseService
import com.rahul.designpatterndemo.experiments.dagger.data.remote.NetworkService
import com.rahul.designpatterndemo.experiments.dagger.di.component.ApplicationComponent
import com.rahul.designpatterndemo.experiments.dagger.di.component.DaggerApplicationComponent
import com.rahul.designpatterndemo.experiments.dagger.di.module.ApplicationModule
import javax.inject.Inject

/**
 * Created by abrol at 24/11/24.
 */
class MyApp : Application() {
    lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var networkService: NetworkService

    @Inject
    lateinit var databaseService: DatabaseService

    override fun onCreate() {
        getDependencies()
        super.onCreate()
    }

    private fun getDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder().applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}