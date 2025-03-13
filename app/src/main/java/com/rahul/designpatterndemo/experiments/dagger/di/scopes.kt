package com.rahul.designpatterndemo.experiments.dagger.di

import javax.inject.Scope

/**
 * Created by abrol at 24/11/24.
 */

@Scope
@Retention(AnnotationRetention.BINARY)
annotation class ApplicationScope

@Scope
@Retention(AnnotationRetention.BINARY)
annotation class ActivityScope

@Scope
@Retention(AnnotationRetention.BINARY)
annotation class FragmentScope
