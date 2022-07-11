package com.dsterwz.food_delivery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class OnBoardingActivity extends AppCompatActivity {

    private static final int NUM_PAGES = 2;

    private ViewPager2 viewPager2OnBoarding;
    private FragmentStateAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);
        init();
    }

    private void init() {
        this.viewPager2OnBoarding = findViewById(R.id.viewPagerOnBoarding);
        pagerAdapter = new ScreenSlidePagerAdapter(this);
        this.viewPager2OnBoarding.setAdapter(pagerAdapter);
    }

    private class ScreenSlidePagerAdapter extends FragmentStateAdapter {
        public ScreenSlidePagerAdapter(OnBoardingActivity fa) {
            super(fa);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            if(position == 0) {
                return new OnBoardingFragment1();
            } else if(position == 1) {
                return new OnBoardingFragment2();
            }
            return null;
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }
}