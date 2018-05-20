package com.aceplus.padc_poc_one.vo;

/**
 * Created by kkk on 5/19/2018.
 */

public class MeditationMainItemVO {
    private int bg_image;
    private int item_image;
    private String title;
    private String desp;

    public MeditationMainItemVO(int bg_image, int item_image, String title, String desp) {
        this.bg_image = bg_image;
        this.item_image = item_image;
        this.title = title;
        this.desp = desp;
    }

    public int getBg_image() {
        return bg_image;
    }

    public int getItem_image() {
        return item_image;
    }

    public String getTitle() {
        return title;
    }

    public String getDesp() {
        return desp;
    }
}
