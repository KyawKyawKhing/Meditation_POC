package com.aceplus.padc_poc_one.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.aceplus.padc_poc_one.R;
import com.aceplus.padc_poc_one.adapter.RecyclerViewAdapter;
import com.aceplus.padc_poc_one.data.model.MeditateModel;
import com.aceplus.padc_poc_one.delegates.MeditateSeriesDelegate;
import com.aceplus.padc_poc_one.events.RestApiEvents;
import com.aceplus.padc_poc_one.ui.activity.MainActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * A simple {@link Fragment} subclass.
 */
<<<<<<< Updated upstream:app/src/main/java/com/aceplus/padc_poc_one/ui/fragment/MediaFragment.java
public class MediaFragment extends Fragment {

=======
public class SeriesFragment extends Fragment implements MeditateSeriesDelegate {

    RecyclerViewAdapter adapter;
    RecyclerView recyclerView;
>>>>>>> Stashed changes:app/src/main/java/com/aceplus/padc_poc_one/ui/fragment/SeriesFragment.java

    public MediaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_meditate_series, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        adapter = new RecyclerViewAdapter(getContext(), this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


<<<<<<< Updated upstream:app/src/main/java/com/aceplus/padc_poc_one/ui/fragment/MediaFragment.java
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

=======
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        adapter.setNewList(MeditateModel.getInstance().getObjects());
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);

    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    void onAllDataLoaded(RestApiEvents.AllDataLoadedEvent event) {
        adapter.setNewList(event.getObjectList());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onErrorInvokingAPI(RestApiEvents.ErrorInvokingAPIEvent event) {
        Toast.makeText(getContext(), event.getErrorMsg(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTapPeriod() {
        MainActivity.setTab(R.id.navigation_two);
    }


>>>>>>> Stashed changes:app/src/main/java/com/aceplus/padc_poc_one/ui/fragment/SeriesFragment.java
}
