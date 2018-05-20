package com.aceplus.padc_poc_one.ui.fragment;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.aceplus.padc_poc_one.R;

import java.lang.reflect.Field;

/**
 * A simple {@link Fragment} subclass.
 */
public class MediaFragment extends Fragment {


    public MediaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_media, container, false);

        BottomNavigationView navigation = (BottomNavigationView) view.findViewById(R.id.navigation);
        BottomNavigationViewHelper.removeShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        displayView(1);
        return view;
    }

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

        @SuppressLint("RestrictedApi")
        public static void removeShiftMode(BottomNavigationView view) {
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
                fragment = new MeditationMediaFragment();
                break;
            case 2:
                fragment = new MeditationMediaFragment();
                break;
            case 3:
                fragment = new MeditationMediaFragment();
                break;
        }
        if (fragment != null) {
            getFragmentManager().beginTransaction().replace(R.id.mainTabframe, fragment).commit();

        }
    }

}
