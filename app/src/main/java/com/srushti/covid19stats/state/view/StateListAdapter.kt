package com.srushti.covid19stats.state.view

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.srushti.covid19stats.covid19india.datamodel.DmState
import com.srushti.covid19stats.databinding.AdapterStateListItemBinding


/**
 * <h1>com.srushti.coronastats.states.view</h1>
 *
 *
 * @author Srushti Patel (srushtip@meditab.com) Meditab Software Inc.
 * @since 24/4/20 3:47 PM
 */
class StateListAdapter :
    ListAdapter<DmState, StateListAdapter.StateListViewHolder>(StateListDiffUtilCallback()) {

    class StateListViewHolder(private val binding: AdapterStateListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(dmState: DmState) {
            binding.stateData = dmState
        }

        companion object {
            fun from(parent: ViewGroup): StateListViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                return StateListViewHolder(
                    AdapterStateListItemBinding.inflate(
                        layoutInflater,
                        parent,
                        false
                    )
                )
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateListViewHolder {
        return StateListViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: StateListViewHolder, position: Int) {
        holder.bind(getItem(position))
        Log.d("Adapter", "-------------- ${getItem(position)}")
    }

    class StateListDiffUtilCallback : DiffUtil.ItemCallback<DmState>() {
        override fun areItemsTheSame(oldItem: DmState, newItem: DmState): Boolean {
            return oldItem.statecode == newItem.statecode
        }

        override fun areContentsTheSame(oldItem: DmState, newItem: DmState): Boolean {
            return oldItem == newItem
        }
    }

}