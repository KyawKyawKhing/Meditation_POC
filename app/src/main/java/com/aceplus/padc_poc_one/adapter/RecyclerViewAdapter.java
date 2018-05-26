package com.aceplus.padc_poc_one.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.aceplus.padc_poc_one.R;
import com.aceplus.padc_poc_one.data.vo.MainVO;
import com.aceplus.padc_poc_one.delegates.MeditateSeriesDelegate;
import com.aceplus.padc_poc_one.viewholder.BaseViewHolder;
import com.aceplus.padc_poc_one.viewholder.RvHorizontalViewHolder;
import com.aceplus.padc_poc_one.viewholder.RvVerticalViewHolder;
import com.aceplus.padc_poc_one.viewholder.SingleViewHolder;
import com.aceplus.padc_poc_one.viewholder.StartHereViewHolder;
import com.aceplus.padc_poc_one.data.vo.CategoriesProgramsVO;
import com.aceplus.padc_poc_one.data.vo.TopicVO;
import com.aceplus.padc_poc_one.data.vo.SingleVO;
import com.aceplus.padc_poc_one.data.vo.CurrentProgramVO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kkk on 5/17/2018.
 */

public class RecyclerViewAdapter extends BaseRecyclerAdapter<BaseViewHolder, MainVO> {

    private final int START_HERE_LAYOUT = 0;
    private final int HORIZONTAL_RV_LAYOUT = 1;
    private final int TV_LAYOUT = 2;
    private final int MAIN = 3;

    private MeditateSeriesDelegate meditateSeriesDelegate;

    public RecyclerViewAdapter(Context context, MeditateSeriesDelegate meditateSeriesDelegate) {
        super(context);
        this.meditateSeriesDelegate = meditateSeriesDelegate;
    }

//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        if (viewType == START_HERE_LAYOUT) {
//            View start_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.meditation_start, parent, false);
//            return new StartHereViewHolder(start_view);
//        } else if (viewType == HORIZONTAL_RV_LAYOUT) {
//            View horizontal_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
//            return new RvHorizontalViewHolder(horizontal_view);
//        } else if (viewType == TV_LAYOUT) {
//            View single_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_tv, parent, false);
//            return new SingleViewHolder(single_view);
//        } else {
//            View main_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_main_item, parent, false);
//            return new RvVerticalViewHolder(main_view);
//        }
//    }
//
//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        int viewType = holder.getItemViewType();
//        switch (viewType) {
//            case START_HERE_LAYOUT:
//                StartHereViewHolder startHereViewHolder = (StartHereViewHolder) holder;
//                startHereViewHolder.setData((CurrentProgramVO) arrayList.get(position));
//                break;
//            case HORIZONTAL_RV_LAYOUT:
//                RvHorizontalViewHolder horizontalViewHolder = (RvHorizontalViewHolder) holder;
//                horizontalViewHolder.setData((CategoriesProgramsVO) arrayList.get(position));
//                break;
//            case TV_LAYOUT:
//                SingleViewHolder singleViewHolder = (SingleViewHolder) holder;
//                singleViewHolder.setData((SingleVO) arrayList.get(position));
//                break;
//            case MAIN:
//                RvVerticalViewHolder rvVerticalViewHolder = (RvVerticalViewHolder) holder;
//                rvVerticalViewHolder.setData((TopicVO) arrayList.get(position));
//                break;
//        }
//    }
//
//    @Override
//    public int getItemCount() {
//        return arrayList.size();
//    }


    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == START_HERE_LAYOUT) {
            View start_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.meditation_start, parent, false);
            return new StartHereViewHolder(start_view,meditateSeriesDelegate);
        } else if (viewType == HORIZONTAL_RV_LAYOUT) {
            View horizontal_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
            return new RvHorizontalViewHolder(horizontal_view);
        } else if (viewType == TV_LAYOUT) {
            View single_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_tv, parent, false);
            return new SingleViewHolder(single_view);
        } else {
            View main_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_main_item, parent, false);
            return new RvVerticalViewHolder(main_view);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (data.get(position) instanceof CurrentProgramVO) {
            return START_HERE_LAYOUT;
        } else if (data.get(position) instanceof CategoriesProgramsVO) {
            return HORIZONTAL_RV_LAYOUT;
        } else if (data.get(position) instanceof SingleVO) {
            return TV_LAYOUT;
        } else if (data.get(position) instanceof TopicVO) {
            return MAIN;
        }
        return -1;
    }

    public void setNewList(List<MainVO> objectArrayList) {
        data = objectArrayList;
        notifyDataSetChanged();
    }


}
