package com.rahul.designpatterndemo.experiments.dagger.ui.maiin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rahul.designpatterndemo.R
import com.rahul.designpatterndemo.experiments.dagger.MyApp
import com.rahul.designpatterndemo.experiments.dagger.di.component.DaggerActivityComponent
import com.rahul.designpatterndemo.experiments.dagger.di.module.ActivityModule
import com.rahul.designpatterndemo.experiments.dagger.ui.home.HomeFragment
import javax.inject.Inject

/**
 * Created by abrol at 24/11/24.
 */
class DumMyActivity : AppCompatActivity() {
    @Inject
    lateinit var viewModel: DumMyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dummy_main)


        Toast.makeText(
            this,
            viewModel.getSomeData(),
            Toast.LENGTH_LONG
        ).show()

        addHomeFragment()
    }

    private fun addHomeFragment() {
        if (supportFragmentManager.findFragmentByTag(HomeFragment.TAG) == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container_fragment, HomeFragment.newInstance(), HomeFragment.TAG)
                .commit()
        }
    }

    private fun getDependencies() {
        DaggerActivityComponent.builder()
            .applicationComponent((application as MyApp).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)
    }
}