package com.websarva.wings.android.databindingobservablekotlin.ui

import androidx.lifecycle.ViewModel
import com.websarva.wings.android.databindingobservablekotlin.data.model.Rectangle

class MainViewModel : ViewModel() {
	var rectangle: Rectangle = Rectangle()

	init {
		generateNewHeight()
		generateNewWidth()
	}

	fun generateNewHeight() {
		rectangle.height = (Math.random() * 10).toInt() + 1
	}

	fun generateNewWidth() {
		rectangle.width = (Math.random() * 10).toInt() + 1
	}
}
