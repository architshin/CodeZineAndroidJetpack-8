package com.websarva.wings.android.databinding2waykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.websarva.wings.android.databinding2waykotlin.databinding.ActivityMainBinding
import com.websarva.wings.android.databinding2waykotlin.ui.MainViewModel

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		val activityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this@MainActivity, R.layout.activity_main)
		val mainViewModel by viewModels<MainViewModel>()
		activityMainBinding.mainViewModel = mainViewModel
	}
}
