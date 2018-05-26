package com.aceplus.padc_poc_one.viewholder;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.aceplus.padc_poc_one.R;
import com.aceplus.padc_poc_one.adapter.RecyclerListitemAdapter;
import com.aceplus.padc_poc_one.vo.MeditationHorizontalVO;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kkk on 5/19/2018.
 */

public class RvHorizontalViewHolder extends BaseViewHolder<MeditationHorizontalVO> {
    @BindView(R.id.tv_title)
    TextView tv_title;
    @BindView(R.id.recyclerView_Horizontal)
    RecyclerView recyclerView;

    public RvHorizontalViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setData(MeditationHorizontalVO data) {
        RecyclerListitemAdapter adapter = new RecyclerListitemAdapter(data.getMeditationHorizontalItemVOS());
        tv_title.setText(data.getTitle());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), LinearLayoutManager.HORIZONTAL, false));

    }
}
