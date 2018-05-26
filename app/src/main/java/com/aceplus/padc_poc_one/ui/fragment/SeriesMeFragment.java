package com.aceplus.padc_poc_one.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aceplus.padc_poc_one.R;
import com.aceplus.padc_poc_one.components.CCV;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SeriesMeFragment extends Fragment {

    public SeriesMeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_series_me, container, false);
    }

}
