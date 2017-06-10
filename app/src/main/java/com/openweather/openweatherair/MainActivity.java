package com.openweather.openweatherair;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.roger.gifloadinglibrary.GifLoadingView;

public class MainActivity extends AppCompatActivity {

    private GifLoadingView mGifLoadingView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGifLoadingView = new GifLoadingView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mGifLoadingView.setImageResource(R.drawable.loading);
        mGifLoadingView.show(getFragmentManager(), "");
        mGifLoadingView.setBackgroundResource(R.color.colorAccent);
        mGifLoadingView.setCancelable(false);
    }
}

