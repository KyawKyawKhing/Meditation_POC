package com.aceplus.padc_poc_one.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import com.aceplus.padc_poc_one.viewholder.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kkk on 5/24/2018.
 */

public abstract class BaseRecyclerAdapter<T extends BaseViewHolder, W> extends RecyclerView.Adapter<T> {
    protected List<W> data;
    protected LayoutInflater inflater;


    public BaseRecyclerAdapter(Context context) {
        data = new ArrayList<>();
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public void onBindViewHolder(T holder, int position) {
        holder.setData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setNewData(List<W> newData) {
        data = newData;
        notifyDataSetChanged();
    }
}
