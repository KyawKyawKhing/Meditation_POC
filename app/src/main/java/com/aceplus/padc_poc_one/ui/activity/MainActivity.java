package com.aceplus.padc_poc_one.ui.activity;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.aceplus.padc_poc_one.R;
<<<<<<< Updated upstream
import com.aceplus.padc_poc_one.adapter.ViewpagerAdapter;
import com.aceplus.padc_poc_one.ui.fragment.MediaFragment;
=======
import com.aceplus.padc_poc_one.ui.fragment.MeFragment;
import com.aceplus.padc_poc_one.ui.fragment.MeditateFragment;

import java.lang.reflect.Field;
>>>>>>> Stashed changes

public class MainActivity extends AppCompatActivity {


    Toolbar toolbar;
    private static BottomNavigationView navigation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.app_name);

        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        MainActivity.BottomNavigationViewHelper.removeShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        displayView(1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

<<<<<<< Updated upstream
    public void setupViewPager(ViewPager vp) {
        adapter = new ViewpagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new MediaFragment(), "ON THE GO");
        adapter.addFragment(new MediaFragment(), "SERIES");
        adapter.addFragment(new MediaFragment(), "TEACHERS");
        adapter.notifyDataSetChanged();
        vp.setAdapter(adapter);
=======
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_one:
                    displayView(1);
                    return true;
                case R.id.navigation_two:
                    displayView(2);
                    return true;
                case R.id.navigation_three:
                    displayView(3);
                    return true;
            }
            return false;
        }
    };


    public static class BottomNavigationViewHelper {
>>>>>>> Stashed changes

        @SuppressLint("RestrictedApi")
        static void removeShiftMode(BottomNavigationView view) {
            BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
            try {
                Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
                shiftingMode.setAccessible(true);
                shiftingMode.setBoolean(menuView, false);
                shiftingMode.setAccessible(false);
                for (int i = 0; i < menuView.getChildCount(); i++) {
                    BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
                    //noinspection RestrictedApi
                    item.setShiftingMode(false);
                    // set once again checked value, so view will be updated
                    //noinspection RestrictedApi
                    item.setChecked(item.getItemData().isChecked());
                }
            } catch (NoSuchFieldException e) {
                Log.e("BottomNav", "Unable to get shift mode field", e);
            } catch (IllegalAccessException e) {
                Log.e("BottomNav", "Unable to change value of shift mode", e);
            }
        }
    }

    private void displayView(Integer i) {
        Fragment fragment = null;
        switch (i) {
            case 1:
                fragment = new MeditateFragment();
                break;
            case 2:
                fragment = new MeFragment();
                break;
            case 3:
                fragment = new MeditateFragment();
                break;
        }
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.mainTabframe, fragment).commit();

        }
    }

    public static void setTab(int menu_id) {
        navigation.setSelectedItemId(menu_id);
    }

}
