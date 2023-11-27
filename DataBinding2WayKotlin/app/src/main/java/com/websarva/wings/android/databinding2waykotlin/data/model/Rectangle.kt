package com.websarva.wings.android.databinding2waykotlin.data.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.websarva.wings.android.databinding2waykotlin.BR

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

	@Bindable
	fun setHeightStr(value: String) {
		if(value != "") {
			val valueInt = value.toInt()
			height = valueInt
		}
	}

	@Bindable
	fun setWidthStr(value: String) {
		if(value != "") {
			val valueInt = value.toInt()
			width = valueInt
		}
	}
}
