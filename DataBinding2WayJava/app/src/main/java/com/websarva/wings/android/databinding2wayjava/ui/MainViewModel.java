package com.websarva.wings.android.databinding2wayjava.ui;

import androidx.lifecycle.ViewModel;

import com.websarva.wings.android.databinding2wayjava.data.model.Rectangle;

public class MainViewModel extends ViewModel {
	private Rectangle _rectangle = new Rectangle();

	public MainViewModel() {
		generateNewHeight();
		generateNewWidth();
	}

	public void generateNewHeight() {
		int height = (int) (Math.random() * 10) + 1;
		_rectangle.setHeight(height);
	}

	public void generateNewWidth() {
		int width = (int) (Math.random() * 10) + 1;
		_rectangle.setWidth(width);
	}

	public Rectangle getRectangle() {
		return _rectangle;
	}
}
