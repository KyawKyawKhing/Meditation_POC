package com.aceplus.padc_poc_one.ui.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.aceplus.padc_poc_one.R;
import com.aceplus.padc_poc_one.adapter.ViewpagerAdapter;
import com.aceplus.padc_poc_one.ui.fragment.SeriesFragment;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewpagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.app_name);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        TabLayout.Tab tab = tabLayout.getTabAt(1); // Count Starts From 0
        tab.select();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    public void setupViewPager(ViewPager vp) {
        adapter = new ViewpagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SeriesFragment(), "ON THE GO");
        adapter.addFragment(new SeriesFragment(), "SERIES");
        adapter.addFragment(new SeriesFragment(), "TEACHERS");
        adapter.notifyDataSetChanged();
        vp.setOffscreenPageLimit(adapter.getCount());
        vp.setAdapter(adapter);

    }
}
