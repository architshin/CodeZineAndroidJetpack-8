package com.websarva.wings.android.databindingobservablekotlin.data.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.websarva.wings.android.databindingobservablekotlin.BR

class Rectangle: BaseObservable() {
	var height: Int = 0
		set(value) {
			field = value
			notifyPropertyChanged(BR.heightStr)
			notifyPropertyChanged(BR.areaStr)
		}
	var width: Int = 0
		set(value) {
			field = value
			notifyPropertyChanged(BR.widthStr)
			notifyPropertyChanged(BR.areaStr)
		}

	fun getArea(): Int {
		return height * width
	}
	@Bindable
	fun getAreaStr(): String {
		return getArea().toString()
	}

	@Bindable
	fun getHeightStr(): String {
		return height.toString()
	}

	@Bindable
	fun getWidthStr(): String {
		return  width.toString()
	}
}
