package com.aceplus.padc_poc_one.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aceplus.padc_poc_one.R;
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

public class RecyclerListitemAdapter extends RecyclerView.Adapter<RecyclerListitemAdapter.MyViewHolder> {
    private ArrayList<MeditationHorizontalItemVO> mArrayList;

    public RecyclerListitemAdapter(ArrayList<MeditationHorizontalItemVO> meditationVerticalVOS) {
        mArrayList = meditationVerticalVOS;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Context context = holder.itemView.getContext();
        holder.iv_main.setImageDrawable(context.getResources().getDrawable(mArrayList.get(position).getBgImage()));
        holder.tv_name.setText(mArrayList.get(position).getName());
        holder.tv_time.setText(mArrayList.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_main)
        ImageView iv_main;
        @BindView(R.id.tv_name)
        TextView tv_name;
        @BindView(R.id.tv_time)
        TextView tv_time;

        MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
