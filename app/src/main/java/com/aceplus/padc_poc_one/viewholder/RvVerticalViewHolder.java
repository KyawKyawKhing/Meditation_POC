package com.aceplus.padc_poc_one.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.aceplus.padc_poc_one.R;
import com.aceplus.padc_poc_one.vo.MeditationMainItemVO;
import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kkk on 5/19/2018.
 */

public class RvVerticalViewHolder extends BaseViewHolder<MeditationMainItemVO> {
    @BindView(R.id.tv_title)
    TextView tv_title;
    @BindView(R.id.tv_desp)
    TextView tv_desp;
    @BindView(R.id.iv_main_bg)
    ImageView iv_bg;
    @BindView(R.id.iv_content)
    ImageView iv_item;

    public RvVerticalViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void setData(MeditationMainItemVO data) {
        Context context = this.itemView.getContext();
        tv_title.setText(data.getTitle());
        tv_desp.setText(data.getDesp());
        iv_bg.setImageDrawable(context.getResources().getDrawable(data.getBg_image()));
        iv_item.setImageDrawable(context.getResources().getDrawable(data.getItem_image()));
    }
}
