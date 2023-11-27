package com.websarva.wings.android.databindingobservablejava.data.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.websarva.wings.android.databindingobservablejava.BR;

public class Rectangle extends BaseObservable {
	private int _height = 0;
	private int _width = 0;

	public int getArea() {
		return _height * _width;
	}

	@Bindable
	public String getAreaStr() {
		return String.valueOf(getArea());
	}

	public void setHeight(int height) {
		_height = height;
		notifyPropertyChanged(BR.heightStr);
		notifyPropertyChanged(BR.areaStr);
	}

	public void setWidth(int width) {
		_width = width;
		notifyPropertyChanged(BR.widthStr);
		notifyPropertyChanged(BR.areaStr);
	}

	@Bindable
	public String getHeightStr() {
		return String.valueOf(_height);
	}

	@Bindable
	public String getWidthStr() {
		return String.valueOf(_width);
	}
}
