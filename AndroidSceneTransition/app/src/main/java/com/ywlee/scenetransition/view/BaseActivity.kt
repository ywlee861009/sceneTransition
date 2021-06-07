package com.ywlee.scenetransition.view

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ywlee.scenetransition.util.YwLog

open class BaseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        YwLog.d("onCreate() ${this.onCreateDescription()}")
    }
}