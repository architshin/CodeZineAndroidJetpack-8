package com.websarva.wings.android.databindinglivedatakotlin.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.websarva.wings.android.databindinglivedatakotlin.data.model.Rectangle

class MainViewModel : ViewModel() {
	val liveRectangle: MutableLiveData<Rectangle> = MutableLiveData()

	init {
		liveRectangle.value = Rectangle(0, 0)
		generateNewHeight()
		generateNewWidth()
	}

	fun generateNewHeight() {
		var rectangle = liveRectangle.value
		val height = (Math.random() * 10).toInt() + 1
		val width = rectangle!!.width
		rectangle = Rectangle(height, width)
		liveRectangle.value = rectangle
	}

	fun generateNewWidth() {
		var rectangle = liveRectangle.value
		val height = rectangle!!.height
		val width = (Math.random() * 10).toInt() + 1
		rectangle = Rectangle(height, width)
		liveRectangle.value = rectangle
	}
}
