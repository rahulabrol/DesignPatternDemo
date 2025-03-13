package com.rahul.designpatterndemo.experiments.dagger.di.component

import com.rahul.designpatterndemo.experiments.dagger.ui.maiin.DumMyActivity
import com.rahul.designpatterndemo.experiments.dagger.di.ActivityScope
import com.rahul.designpatterndemo.experiments.dagger.di.module.ActivityModule
import dagger.Component

/**
 * Created by abrol at 24/11/24.
 */
@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(activity: DumMyActivity)
}