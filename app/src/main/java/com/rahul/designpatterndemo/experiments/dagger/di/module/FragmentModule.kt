package com.rahul.designpatterndemo.experiments.dagger.di.module

import androidx.fragment.app.Fragment
import com.rahul.designpatterndemo.experiments.dagger.di.ActivityContext
import dagger.Module
import dagger.Provides

/**
 * Created by abrol at 24/11/24.
 */
@Module
class FragmentModule(private val fragment: Fragment) {

    @ActivityContext
    @Provides
    fun provideContext() = fragment.requireContext()
}