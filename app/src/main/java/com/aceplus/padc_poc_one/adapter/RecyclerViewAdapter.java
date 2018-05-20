package com.aceplus.padc_poc_one.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aceplus.padc_poc_one.R;
import com.aceplus.padc_poc_one.viewholder.RvHorizontalViewHolder;
import com.aceplus.padc_poc_one.viewholder.RvVerticalViewHolder;
import com.aceplus.padc_poc_one.viewholder.SingleViewHolder;
import com.aceplus.padc_poc_one.viewholder.StartHereViewHolder;
import com.aceplus.padc_poc_one.vo.MeditationHorizontalVO;
import com.aceplus.padc_poc_one.vo.MeditationMainItemVO;
import com.aceplus.padc_poc_one.vo.SingleVO;
import com.aceplus.padc_poc_one.vo.StartVO;

import java.util.ArrayList;

/**
 * Created by kkk on 5/17/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<Object> arrayList;

    private final int START_HERE_LAYOUT = 0;
    private final int HORIZONTAL_RV_LAYOUT = 1;
    private final int TV_LAYOUT = 2;
    private final int MAIN = 3;

    public RecyclerViewAdapter(ArrayList<Object> objects) {
        arrayList = objects;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        switch (viewType) {
//            case START_HERE_LAYOUT:
//                View start_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.meditation_start, parent, false);
//                return new StartHereViewHolder(start_view);
//            case HORZIONTAL_RV_LAYOUT:
//                View horizontal_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
//                return new RvHorizontalViewHolder(horizontal_view);
//            case TV_LAYOUT:
//                View single_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_tv, parent, false);
//                return new StartHereViewHolder(single_view);
//            case MAIN:
//                View main_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_main_item, parent, false);
//                return new RvVerticalViewHolder(main_view);
//        }
//

        if (viewType == START_HERE_LAYOUT) {
            View start_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.meditation_start, parent, false);
            return new StartHereViewHolder(start_view);
        } else if (viewType == HORIZONTAL_RV_LAYOUT) {
            View horizontal_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
            return new RvHorizontalViewHolder(horizontal_view);
        } else if (viewType == TV_LAYOUT) {
            View single_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_tv, parent, false);
            return new SingleViewHolder(single_view);
        } else if (viewType == MAIN) {
            View main_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_main_item, parent, false);
            return new RvVerticalViewHolder(main_view);
        }
        return null;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        switch (myObj.getClass()) {
//            case StartVO.class:
//                StartHereViewHolder startHereViewHolder = (StartHereViewHolder) holder;
//                startHereViewHolder.setData((StartVO) arrayList.get(position));
//                break;
//            case HORIZONTAL_RV_LAYOUT:
////                for (int i = 0; i < mMainVO.getMeditationHorizontalVOS().size(); i++) {
//                RvHorizontalViewHolder horizontalViewHolder = (RvHorizontalViewHolder) holder;
//                horizontalViewHolder.setData((MeditationHorizontalVO) arrayList.get(position));
////                }
//                break;
//            case TV_LAYOUT:
//                StartHereViewHolder singleViewHolder = (StartHereViewHolder) holder;
//                singleViewHolder.setData((StartVO) arrayList.get(position));
//                break;
//            case MAIN:
////                for (int i = 0; i < mMainVO.getMeditationMainItemVOS().size(); i++) {
//                RvVerticalViewHolder rvVerticalViewHolder = (RvVerticalViewHolder) holder;
//                rvVerticalViewHolder.setData((MeditationMainItemVO) arrayList.get(position));
//                break;
//        }

//        if (arrayList.get(position).getClass().equals(StartVO.class)) {
//            StartHereViewHolder startHereViewHolder = (StartHereViewHolder) holder;
//            startHereViewHolder.setData((StartVO) arrayList.get(position));
//        } else if (arrayList.get(position).getClass().equals(MeditationHorizontalVO.class)) {
//            RvHorizontalViewHolder horizontalViewHolder = (RvHorizontalViewHolder) holder;
//            horizontalViewHolder.setData((MeditationHorizontalVO) arrayList.get(position));
//        }
////        else if (arrayList.get(position).getClass().equals(SingleVO.class)) {
////            StartHereViewHolder singleViewHolder = (StartHereViewHolder) holder;
////            singleViewHolder.setData((StartVO) arrayList.get(position));
////        }
//        else if (arrayList.get(position).getClass().equals(MeditationMainItemVO.class)) {
//            RvVerticalViewHolder rvVerticalViewHolder = (RvVerticalViewHolder) holder;
//            rvVerticalViewHolder.setData((MeditationMainItemVO) arrayList.get(position));
//        }

        int viewType = holder.getItemViewType();
        switch (viewType) {
            case START_HERE_LAYOUT:
                StartHereViewHolder startHereViewHolder = (StartHereViewHolder) holder;
                startHereViewHolder.setData((StartVO) arrayList.get(position));
                break;
            case HORIZONTAL_RV_LAYOUT:
                RvHorizontalViewHolder horizontalViewHolder = (RvHorizontalViewHolder) holder;
                horizontalViewHolder.setData((MeditationHorizontalVO) arrayList.get(position));
                break;
            case TV_LAYOUT:
                SingleViewHolder singleViewHolder = (SingleViewHolder) holder;
                singleViewHolder.setData((SingleVO) arrayList.get(position));
                break;
            case MAIN:
                RvVerticalViewHolder rvVerticalViewHolder = (RvVerticalViewHolder) holder;
                rvVerticalViewHolder.setData((MeditationMainItemVO) arrayList.get(position));
                break;
        }
    }


//    @Override
//    public void onBindViewHolder(SingleViewHolder holder, int position) {
//        switch (getItemViewType(position)) {
//            case START_HERE_LAYOUT:
//                break;
//            case HORZIONTAL_RV_LAYOUT:
//                mAdapter = new RecyclerListitemAdapter(mMainVO.getMeditationHorizontalVOS());
////        holder.tv_title.setText(mResultModels.get(position).getTitle());
////        holder.recyclerView.setAdapter(mAdapter);
////        holder.recyclerView.setLayoutManager(new LinearLayoutManager(holder.itemView.getContext(), LinearLayoutManager.HORIZONTAL, false));
//
//                break;
//            case TV_LAYOUT:
//                break;
//            default:
//                break;
//        }
////        if (HORZIONTAL_RV_LAYOUT)
//        }

    @Override
    public int getItemCount() {
//        return 4;
        return arrayList.size();
    }

    @Override
    public int getItemViewType(int position) {
//        switch (position) {
//            case START_HERE_LAYOUT:
//                return START_HERE_LAYOUT;
//            case HORZIONTAL_RV_LAYOUT:
//                return HORZIONTAL_RV_LAYOUT;
//            case TV_LAYOUT:
//                return TV_LAYOUT;
//            default:
//                return MAIN;
        if (arrayList.get(position) instanceof StartVO) {
            return START_HERE_LAYOUT;
        } else if (arrayList.get(position) instanceof MeditationHorizontalVO) {
            return HORIZONTAL_RV_LAYOUT;
        } else if (arrayList.get(position) instanceof SingleVO) {
            return TV_LAYOUT;
        } else if (arrayList.get(position) instanceof MeditationMainItemVO) {
            return MAIN;
        }
        return -1;
    }

}
