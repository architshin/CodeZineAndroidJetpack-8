package com.websarva.wings.android.databindinglivedatajava.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.websarva.wings.android.databindinglivedatajava.data.model.Rectangle;

public class MainViewModel extends ViewModel {
	MutableLiveData<Rectangle> _liveRectangle = new MutableLiveData<>();
	public MainViewModel() {
		_liveRectangle.setValue(new Rectangle(0, 0));
		generateNewHeight();
		generateNewWidth();
	}

	public void generateNewHeight() {
		Rectangle rectangle = _liveRectangle.getValue();
		int height = (int) (Math.random() * 10) + 1;
		int width = rectangle.getWidth();
		rectangle = new Rectangle(height, width);
		_liveRectangle.setValue(rectangle);
	}

	public void generateNewWidth() {
		Rectangle rectangle = _liveRectangle.getValue();
		int height = rectangle.getHeight();
		int width = (int) (Math.random() * 10) + 1;
		rectangle = new Rectangle(height, width);
		_liveRectangle.setValue(rectangle);
	}

	public MutableLiveData<Rectangle> getLiveRectangle() {
		return _liveRectangle;
	}
}
