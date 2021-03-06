package com.example.catlittlebox04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreen.this)
                .withFullScreen()
                .withTargetActivity(Auth.class)
                .withSplashTimeOut(2000)
                .withBackgroundResource(R.drawable.app_start);

        View view = config.create();

        setContentView(view);
    }
}
