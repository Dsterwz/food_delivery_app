package com.dsterwz.food_delivery;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class LaunchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activivty_launch);
        startMainActivity();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }


    private void startMainActivity () {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Intent i = new Intent(LaunchActivity.this, OnBoardingActivity.class);
                startActivity(i);
            }
        }).start();
    }
}
