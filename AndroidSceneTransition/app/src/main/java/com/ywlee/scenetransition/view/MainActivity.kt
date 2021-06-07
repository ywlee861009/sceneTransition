package com.ywlee.scenetransition.view

import android.os.Bundle
import com.ywlee.scenetransition.R
import com.ywlee.scenetransition.databinding.ActivityMainBinding
import com.ywlee.scenetransition.util.YwLog
import com.ywlee.scenetransition.viewmodel.MainViewModel

class MainActivity : BaseMvvmActivity<ActivityMainBinding, MainViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        YwLog.d("onCreate() ${this.onCreateDescription()}")
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun getViewModel(): Class<MainViewModel> {
        return MainViewModel::class.java
    }

    override fun observeViewModelVariables() {

    }
}