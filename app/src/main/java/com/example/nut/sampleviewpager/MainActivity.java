package com.example.nut.sampleviewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_view_pager)
    ViewPager viewPager;
    @BindView(R.id.btn_next)
    Button nextButton;
    @BindView(R.id.btn_prev)
    Button prevButton;
    @OnClick(R.id.btn_next)
    public void next_page() {
        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
    }

    @OnClick(R.id.btn_prev)
    public void prev_page() {
        viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myPagerAdapter);

        viewPager.setCurrentItem(2);
        viewPager.setOffscreenPageLimit(5);
    }
}
