package com.saurav.mvvm_architecture.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.saurav.mvvm_architecture.R
import com.saurav.mvvm_architecture.databinding.ActivityMainBinding
import com.saurav.mvvm_architecture.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel=ViewModelProvider(this).get(MainViewModel::class.java)
        activityMainBinding=DataBindingUtil.setContentView(this, R.layout.activity_main)

        activityMainBinding.viewmodel=viewModel
        activityMainBinding.recycleView.layoutManager=LinearLayoutManager(this)

    }
}