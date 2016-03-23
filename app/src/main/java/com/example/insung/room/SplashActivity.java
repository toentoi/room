package com.example.insung.room;


import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;


public class SplashActivity extends Activity {

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.splash);

        Handler hd = new Handler();
        hd.postDelayed(new Runnable() {

            @Override
            public void run() {
                finish();
            }
        }, 1000);
    }


}


