package com.websarva.wings.android.databinding2wayjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.websarva.wings.android.databinding2wayjava.databinding.ActivityMainBinding;
import com.websarva.wings.android.databinding2wayjava.ui.MainViewModel;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
		ViewModelProvider provider = new ViewModelProvider(MainActivity.this);
		MainViewModel mainViewModel = provider.get(MainViewModel.class);
		activityMainBinding.setMainViewModel(mainViewModel);
	}
}
