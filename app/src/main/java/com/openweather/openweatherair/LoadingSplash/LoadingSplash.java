package com.openweather.openweatherair.LoadingSplash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.openweather.openweatherair.MainActivity;
import com.openweather.openweatherair.R;
import com.roger.gifloadinglibrary.GifLoadingView;

public class LoadingSplash extends AppCompatActivity {

    private GifLoadingView mGifLoadingView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_splash);
        mGifLoadingView = new GifLoadingView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mGifLoadingView.setImageResource(R.drawable.loading);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        mGifLoadingView.show(getFragmentManager(), "");
        mGifLoadingView.setCancelable(false);
        //執行續
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mGifLoadingView.dismiss();
                finish();
                startActivity( new Intent(LoadingSplash.this, MainActivity.class));
            }
        }, 4000);
    }
}