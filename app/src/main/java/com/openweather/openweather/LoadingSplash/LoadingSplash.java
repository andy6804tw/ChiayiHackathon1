package com.openweather.openweather.LoadingSplash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.openweather.openweather.R;
import com.victor.loading.rotate.RotateLoading;

public class LoadingSplash extends AppCompatActivity {
    private RotateLoading rotateLoading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_splash);
        rotateLoading = (RotateLoading) findViewById(R.id.rotateloading);


    }

    @Override
    protected void onResume() {
        super.onResume();
        rotateLoading.start();
    }
}
