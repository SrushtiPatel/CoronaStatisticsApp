package com.srushti.coronastats.states.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.srushti.coronastats.R

/**
 * A simple [Fragment] subclass.
 * Use the [StateListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StateListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_state_list, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = StateListFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val netComponent = DaggerNetComponent.builder()
    }
}
