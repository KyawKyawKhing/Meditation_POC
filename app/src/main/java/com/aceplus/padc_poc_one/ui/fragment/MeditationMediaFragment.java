package com.aceplus.padc_poc_one.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aceplus.padc_poc_one.R;
import com.aceplus.padc_poc_one.adapter.RecyclerViewAdapter;
import com.aceplus.padc_poc_one.vo.MeditationHorizontalItemVO;
import com.aceplus.padc_poc_one.vo.MeditationHorizontalVO;
import com.aceplus.padc_poc_one.vo.MeditationMainItemVO;
import com.aceplus.padc_poc_one.vo.SingleVO;
import com.aceplus.padc_poc_one.vo.StartVO;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeditationMediaFragment extends Fragment {


    public MeditationMediaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_meditation_media, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getMainVo());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

    private ArrayList<Object> getMainVo() {
        MeditationHorizontalItemVO horizontalItemVO1 = new MeditationHorizontalItemVO(R.mipmap.rv_hor1, "Deal with Depression", "5:10.19 mins");
        MeditationHorizontalItemVO horizontalItemVO2 = new MeditationHorizontalItemVO(R.mipmap.rv_hor2, "Panic Attack Relief", "1:50.12 mins");
        MeditationHorizontalItemVO horizontalItemVO3 = new MeditationHorizontalItemVO(R.mipmap.rv_hor3, "Guided Naptime", "50 mins");
        MeditationHorizontalItemVO horizontalItemVO4 = new MeditationHorizontalItemVO(R.mipmap.rv_hor4, "Gratitude For Moms", "2:45.33 mins");
        MeditationHorizontalItemVO horizontalItemVO5 = new MeditationHorizontalItemVO(R.mipmap.rv_hor5, "Simple Habit", "2:20.44 mins");
        MeditationHorizontalItemVO horizontalItemVO6 = new MeditationHorizontalItemVO(R.mipmap.rv_hor6, "Relesase Blame", "39 mins");
        MeditationHorizontalItemVO horizontalItemVO7 = new MeditationHorizontalItemVO(R.mipmap.rv_hor7, "Heal From Traumna", "3:15.20 mins");

        ArrayList<MeditationHorizontalItemVO> horizontalItemVOS1 = new ArrayList<>();
        horizontalItemVOS1.add(horizontalItemVO2);
        horizontalItemVOS1.add(horizontalItemVO3);
        horizontalItemVOS1.add(horizontalItemVO4);
        horizontalItemVOS1.add(horizontalItemVO5);
        horizontalItemVOS1.add(horizontalItemVO6);
        horizontalItemVOS1.add(horizontalItemVO7);

        ArrayList<MeditationHorizontalItemVO> horizontalItemVOS2 = new ArrayList<>();
        horizontalItemVOS2.add(horizontalItemVO7);
        horizontalItemVOS2.add(horizontalItemVO1);
        horizontalItemVOS2.add(horizontalItemVO5);
        horizontalItemVOS2.add(horizontalItemVO4);
        horizontalItemVOS2.add(horizontalItemVO3);
        horizontalItemVOS2.add(horizontalItemVO2);
        horizontalItemVOS2.add(horizontalItemVO1);

        ArrayList<MeditationHorizontalItemVO> horizontalItemVOS3 = new ArrayList<>();
        horizontalItemVOS3.add(horizontalItemVO5);
        horizontalItemVOS3.add(horizontalItemVO6);
        horizontalItemVOS3.add(horizontalItemVO7);
        horizontalItemVOS3.add(horizontalItemVO1);
        horizontalItemVOS3.add(horizontalItemVO2);

        ArrayList<MeditationHorizontalItemVO> horizontalItemVOS4 = new ArrayList<>();
        horizontalItemVOS4.add(horizontalItemVO1);
        horizontalItemVOS4.add(horizontalItemVO2);
        horizontalItemVOS4.add(horizontalItemVO1);
        horizontalItemVOS4.add(horizontalItemVO2);
        horizontalItemVOS4.add(horizontalItemVO3);

        MeditationHorizontalVO horizontalVO1 = new MeditationHorizontalVO("Morning Meditations", horizontalItemVOS1);
        MeditationHorizontalVO horizontalVO2 = new MeditationHorizontalVO("A Healthy Mind", horizontalItemVOS2);
        MeditationHorizontalVO horizontalVO3 = new MeditationHorizontalVO("New on Simple Habit", horizontalItemVOS3);
        MeditationHorizontalVO horizontalVO4 = new MeditationHorizontalVO("Most Popular", horizontalItemVOS4);

        MeditationMainItemVO mainItemVO1 = new MeditationMainItemVO(R.mipmap.rv_ver_land5, R.drawable.ic_brightness_3_white_24dp, "Basic", "Learn meditation fundamentals");
        MeditationMainItemVO mainItemVO2 = new MeditationMainItemVO(R.mipmap.rv_ver_land2, R.drawable.ic_wb_cloudy_white_24dp, "Relax", "Unwind and relieve stress");
        MeditationMainItemVO mainItemVO3 = new MeditationMainItemVO(R.mipmap.rv_ver_land3, R.drawable.ic_wb_sunny_white_24dp, "Sleep", "Rest effortlessly in deep sleep");
        MeditationMainItemVO mainItemVO4 = new MeditationMainItemVO(R.mipmap.rv_ver_land4, R.drawable.ic_brightness_3_white_24dp, "Focus", "Learn meditation fundamentals");
        MeditationMainItemVO mainItemVO5 = new MeditationMainItemVO(R.mipmap.rv_ver_land1, R.drawable.ic_wb_cloudy_white_24dp, "Well-being", "Unwind and relieve stress");
        MeditationMainItemVO mainItemVO6 = new MeditationMainItemVO(R.mipmap.rv_ver_land6, R.drawable.ic_brightness_3_white_24dp, "Resilience", "Rest effortlessly in deep sleep");
        MeditationMainItemVO mainItemVO7 = new MeditationMainItemVO(R.mipmap.rv_ver_land7, R.drawable.ic_wb_sunny_white_24dp, "Health", "Learn meditation fundamentals");
        MeditationMainItemVO mainItemVO8 = new MeditationMainItemVO(R.mipmap.rv_ver_land8, R.drawable.ic_wb_cloudy_white_24dp, "Relationships", "Unwind and relieve stress");
        MeditationMainItemVO mainItemVO9 = new MeditationMainItemVO(R.mipmap.rv_ver_land5, R.drawable.ic_brightness_3_white_24dp, "Unguided", "Learn meditation fundamentals");

        StartVO startVO = new StartVO("Start Here", "Simple Habit Starter", "5 mins", R.mipmap.rv_hor5);
        SingleVO singleVO = new SingleVO("All Topics");

        ArrayList<Object> myObject = new ArrayList<>();

        myObject.add(startVO);

        myObject.add(horizontalVO1);
        myObject.add(horizontalVO2);
        myObject.add(horizontalVO3);
        myObject.add(horizontalVO4);


        myObject.add(singleVO);

        myObject.add(mainItemVO1);
        myObject.add(mainItemVO2);
        myObject.add(mainItemVO3);
        myObject.add(mainItemVO4);
        myObject.add(mainItemVO5);
        myObject.add(mainItemVO6);
        myObject.add(mainItemVO7);
        myObject.add(mainItemVO8);
        myObject.add(mainItemVO9);

        return myObject;
    }

}
