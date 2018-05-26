package com.aceplus.padc_poc_one.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.aceplus.padc_poc_one.R;
import com.aceplus.padc_poc_one.data.vo.CategoriesProgramsItemVO;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by hakerfaker on 5/21/2018.
 */

public class RvListItemViewHolder extends BaseViewHolder<CategoriesProgramsItemVO> {
    @BindView(R.id.iv_main)
    ImageView iv_main;
    @BindView(R.id.tv_name)
    TextView tv_name;
    @BindView(R.id.tv_time)
    TextView tv_time;

    public RvListItemViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setData(CategoriesProgramsItemVO data) {
        Context context = itemView.getContext();
//        iv_main.setImageDrawable(context.getResources().getDrawable(data.getBgImage()));
        tv_name.setText(data.getTitle());
        String time = data.getAverageeLengths().get(0) + " mins";
        tv_time.setText(time);
    }
}