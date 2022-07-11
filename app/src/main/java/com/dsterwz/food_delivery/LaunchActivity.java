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
    private Animation logoAnim;
    private ImageView logoPan;
    private Typeface face_lobster2;
    private TextView textLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activivty_launch);
        init();
        startMainActivity();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

    private void init() {
        textLogo = findViewById(R.id.logoText);
        logoPan = findViewById(R.id.logoPan);
        logoAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.logo_anim);
        face_lobster2 = Typeface.createFromAsset(this.getAssets(), "font/LobsterTwo-Regular.ttf");
        textLogo.setTypeface(face_lobster2);
        logoPan.startAnimation(logoAnim);
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

                Intent i = new Intent(LaunchActivity.this, OnBoardingFragment2.class);
                startActivity(i);
            }
        }).start();
    }
}
