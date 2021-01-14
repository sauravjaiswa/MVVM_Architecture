package com.saurav.mvvm_architecture.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.saurav.mvvm_architecture.BR
import com.saurav.mvvm_architecture.model.RecycleData
import com.saurav.mvvm_architecture.viewmodel.MainViewModel

class RecycleAdapter(@LayoutRes var layoutId:Int, var data:ArrayList<RecycleData>, var viewModel: MainViewModel): RecyclerView.Adapter<RecycleAdapter.GenericViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleAdapter.GenericViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        val binding=DataBindingUtil.inflate<ViewDataBinding>(layoutInflater,viewType,parent,false)

        return GenericViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecycleAdapter.GenericViewHolder, position: Int) {

        holder.bind(viewModel,position)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun getItemViewType(position: Int): Int {
        return layoutId
    }

    class GenericViewHolder(private var binding:ViewDataBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(viewModel: MainViewModel,position: Int){
            binding.setVariable(BR.itemViewModel,viewModel)
            binding.setVariable(BR.position,position)

        }

    }
}