package com.rahul.designpatterndemo.experiments.dagger.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.rahul.designpatterndemo.R
import com.rahul.designpatterndemo.experiments.dagger.MyApp
import com.rahul.designpatterndemo.experiments.dagger.di.component.DaggerFragmentComponent
import com.rahul.designpatterndemo.experiments.dagger.di.module.FragmentModule
import javax.inject.Inject

/**
 * Created by abrol at 24/11/24.
 */
class HomeFragment : Fragment() {
    companion object {

        const val TAG = "HomeFragment"

        fun newInstance(): HomeFragment {
            val args = Bundle()
            return HomeFragment().apply { this.arguments = args }
        }
    }

    @Inject
    lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvMessage = view.findViewById<TextView>(R.id.tv_message)
        tvMessage.text = viewModel.getSomeData()
    }

    private fun getDependencies() {
        DaggerFragmentComponent.builder()
            .applicationComponent((requireContext().applicationContext as MyApp).applicationComponent)
            .fragmentModule(FragmentModule(this))
            .build()
            .inject(this)
    }
}