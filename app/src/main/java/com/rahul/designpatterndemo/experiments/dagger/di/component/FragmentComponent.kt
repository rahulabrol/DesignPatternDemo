package com.rahul.designpatterndemo.experiments.dagger.di.component

import com.rahul.designpatterndemo.experiments.dagger.di.FragmentScope
import com.rahul.designpatterndemo.experiments.dagger.di.module.FragmentModule
import com.rahul.designpatterndemo.experiments.dagger.ui.home.HomeFragment
import dagger.Component


/**
 * Created by abrol at 24/11/24.
 */

@FragmentScope
@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {
    fun inject(fragment: HomeFragment)
}