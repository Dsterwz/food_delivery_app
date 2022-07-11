package com.dsterwz.food_delivery;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class OnBoardingActivity extends Activity {
    private TextView textView;
    private Typeface face_lobster2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_1);
        init();
        startMainActivity();

    }

    private void init() {
        textView = findViewById(R.id.fartDelivery);
        face_lobster2 = Typeface.createFromAsset(this.getAssets(), "fonts/LobsterTwo-Regular.ttf");
        textView.setTypeface(face_lobster2);
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

                Intent i = new Intent(OnBoardingActivity.this,MainActivity.class);
                startActivity(i);
            }
        }).start();
    }
}
