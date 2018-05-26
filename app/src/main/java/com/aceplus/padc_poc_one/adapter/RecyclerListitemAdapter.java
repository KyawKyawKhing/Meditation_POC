package com.aceplus.padc_poc_one.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aceplus.padc_poc_one.R;
import com.aceplus.padc_poc_one.viewholder.RvListItemViewHolder;
import com.aceplus.padc_poc_one.vo.MeditationHorizontalItemVO;
import com.aceplus.padc_poc_one.vo.MeditationHorizontalVO;
import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kkk on 5/18/2018.
 */

public class RecyclerListitemAdapter extends RecyclerView.Adapter<RvListItemViewHolder> {
    private ArrayList<MeditationHorizontalItemVO> mArrayList;

    public RecyclerListitemAdapter(ArrayList<MeditationHorizontalItemVO> meditationVerticalVOS) {
        mArrayList = meditationVerticalVOS;
    }

    @Override
    public RvListItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list_item, parent, false);
        return new RvListItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RvListItemViewHolder holder, int position) {
        holder.setData(mArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }


}
