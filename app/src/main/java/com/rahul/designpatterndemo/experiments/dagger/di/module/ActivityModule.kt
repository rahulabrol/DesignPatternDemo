package com.rahul.designpatterndemo.experiments.dagger.di.module

import android.app.Activity
import com.rahul.designpatterndemo.experiments.dagger.di.ActivityContext
import dagger.Module
import dagger.Provides

/**
 * Created by abrol at 24/11/24.
 */
@Module
class ActivityModule(private val activity: Activity) {

    @ActivityContext
    @Provides
    fun provideContext() = activity
}