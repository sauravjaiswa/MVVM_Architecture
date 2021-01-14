package com.saurav.mvvm_architecture.viewmodel

import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel
import com.saurav.mvvm_architecture.R
import com.saurav.mvvm_architecture.adapter.RecycleAdapter
import com.saurav.mvvm_architecture.model.RecycleData

class MainViewModel: ViewModel() {
    var mdata:ArrayList<RecycleData> = ArrayList()

    init {
        mdata.add(RecycleData("A","kdjhf@kjdsh.com",true))
        mdata.add(RecycleData("B","kdjhf@kjdsh.com",true))
        mdata.add(RecycleData("C","kdjhf@kjdsh.com",true))
        mdata.add(RecycleData("D","kdjhf@kjdsh.com",true))
        mdata.add(RecycleData("E","kdjhf@kjdsh.com",true))
        mdata.add(RecycleData("F","kdjhf@kjdsh.com",true))
        mdata.add(RecycleData("G","kdjhf@kjdsh.com",true))
        mdata.add(RecycleData("H","kdjhf@kjdsh.com",true))
    }

    var adapter=RecycleAdapter(R.layout.recycle_item,mdata,this)

    fun setAdapter():RecycleAdapter{
        return adapter
    }

    fun onClick(position: Int){
        Log.i("onClick","$position")
    }

    fun setCheck(position: Int):Boolean{
        return if (mdata.size>position){
            mdata.get(position).status
        }else{
            false
        }

    }

    fun setTitle(position: Int):String{
        return mdata[position].name
    }

    fun setEmail(position: Int):String{
        return mdata[position].email

    }
}