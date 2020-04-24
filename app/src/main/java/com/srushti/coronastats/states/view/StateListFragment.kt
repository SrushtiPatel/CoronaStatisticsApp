package com.srushti.coronastats.states.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.srushti.coronastats.base.ViewModelProviderFactory
import com.srushti.coronastats.base.di.component.DaggerNetComponent
import com.srushti.coronastats.databinding.FragmentStateListBinding
import com.srushti.coronastats.states.di.component.DaggerStateListComponent
import com.srushti.coronastats.states.di.module.StateListModule
import com.srushti.coronastats.states.viewmodel.StateListViewModel
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 * Use the [StateListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StateListFragment : Fragment() {

    @Inject
    lateinit var viewModelProviderFactory: ViewModelProviderFactory

    //    @Inject
    lateinit var viewModel: StateListViewModel

    private lateinit var binding: FragmentStateListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStateListBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = StateListFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buildDaggerComponent()

        initView()
    }


    private fun buildDaggerComponent() {
        val netComponent = DaggerNetComponent.create()
        DaggerStateListComponent.builder()
            .netComponent(netComponent)
            .stateListModule(StateListModule())
            .build()
            .inject(this)
    }

    private fun initView() {

        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(
            StateListViewModel::class.java
        )

        binding.stateListViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        val stateListAdapter = StateListAdapter()
        binding.rvStateList.adapter = stateListAdapter

        viewModel.stateListLiveData.observe(viewLifecycleOwner, Observer {
            stateListAdapter.submitList(it)
        })


    }
}
