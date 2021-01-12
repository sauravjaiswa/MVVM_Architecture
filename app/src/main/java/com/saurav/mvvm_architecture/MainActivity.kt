package com.saurav.mvvm_architecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.saurav.mvvm_architecture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewModel:MainViewModel
    lateinit var activityMainBinding: ActivityMainBinding
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel=ViewModelProvider(this).get(MainViewModel::class.java)
        activityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        activityMainBinding.viewmodel=viewModel
        recyclerView.layoutManager=LinearLayoutManager(this)

    }
}