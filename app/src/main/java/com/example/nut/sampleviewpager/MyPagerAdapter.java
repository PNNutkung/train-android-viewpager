package com.example.nut.sampleviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by nut on 9/6/2559.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {

    private final int PAGE_NUM = 3;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FirstFragment.newInstance();
            case 1:
                return SecondFragment.newInstance();
            case 2:
                return ThirdFragment.newInstance();
            default:
                return new Fragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_NUM;
    }
}
