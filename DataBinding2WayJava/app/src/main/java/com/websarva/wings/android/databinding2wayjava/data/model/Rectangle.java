package com.websarva.wings.android.databinding2wayjava.data.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.websarva.wings.android.databinding2wayjava.BR;

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

	@Bindable
	public String getHeightStr() {
		return String.valueOf(_height);
	}

	@Bindable
	public String getWidthStr() {
		return String.valueOf(_width);
	}

	@Bindable
	public void setHeightStr(String heightStr) {
		if(!heightStr.equals("")) {
			int height = Integer.valueOf(heightStr);
			setHeight(height);
		}
	}

	@Bindable
	public void setWidthStr(String widthStr) {
		if(!widthStr.equals("")) {
			int width = Integer.valueOf(widthStr);
			setWidth(width);
		}
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
}
