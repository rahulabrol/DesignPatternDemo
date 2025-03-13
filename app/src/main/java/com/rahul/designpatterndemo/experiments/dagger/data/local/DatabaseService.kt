package com.rahul.designpatterndemo.experiments.dagger.data.local

import android.content.Context
import com.rahul.designpatterndemo.experiments.dagger.di.ApplicationContext
import com.rahul.designpatterndemo.experiments.dagger.di.ApplicationScope
import com.rahul.designpatterndemo.experiments.dagger.di.DatabaseName
import com.rahul.designpatterndemo.experiments.dagger.di.DatabaseVersion
import javax.inject.Inject

/**
 * Created by abrol at 24/11/24.
 */
@ApplicationScope
class DatabaseService @Inject constructor(
    @ApplicationContext private val context: Context,
    @DatabaseName private val databaseName: String,
    @DatabaseVersion private val databaseVersion: Int
) {
    fun getDummyData(): String {
        return "DATABASE_DUMMY_DATA"
    }
}