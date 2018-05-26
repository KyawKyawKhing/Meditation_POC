package com.aceplus.padc_poc_one.data.vo;

import java.util.ArrayList;

/**
 * Created by kkk on 5/19/2018.
 */

public class MeditationHorizontalVO {
    private String title;
    private ArrayList<MeditationHorizontalItemVO> meditationHorizontalItemVOS;

    public MeditationHorizontalVO(String title, ArrayList<MeditationHorizontalItemVO> meditationHorizontalItemVOS) {
        this.title = title;
        this.meditationHorizontalItemVOS = meditationHorizontalItemVOS;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<MeditationHorizontalItemVO> getMeditationHorizontalItemVOS() {
        return meditationHorizontalItemVOS;
    }
}
