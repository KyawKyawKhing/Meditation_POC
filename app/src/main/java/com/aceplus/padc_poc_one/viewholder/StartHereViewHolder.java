package com.aceplus.padc_poc_one.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.aceplus.padc_poc_one.R;
import com.aceplus.padc_poc_one.vo.StartVO;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kkk on 5/19/2018.
 */

public class StartHereViewHolder extends BaseViewHolder<StartVO> {
    @BindView(R.id.tv_title)
    TextView tv_title;
    @BindView(R.id.tv_start_name)
    TextView tv_name;
    @BindView(R.id.tv_start_time)
    TextView tv_time;
    @BindView(R.id.iv_main_bg)
    ImageView iv_main_bg;

    public StartHereViewHolder(View itemView) {
        super(itemView);
<<<<<<< Updated upstream
        ButterKnife.bind(this, itemView);
=======
        this.currentProgramDelegate = currentProgramDelegate;
>>>>>>> Stashed changes
    }

    @Override
    public void setData(StartVO data) {
        tv_title.setText(data.getTitle());
        tv_name.setText(data.getName());
        tv_time.setText(data.getTime());
        iv_main_bg.setImageDrawable(itemView.getContext().getResources().getDrawable(data.getMain_bg()));
    }
}
