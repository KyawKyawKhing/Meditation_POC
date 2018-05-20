package com.aceplus.padc_poc_one.vo;

/**
 * Created by kkk on 5/17/2018.
 */

public class MeditationHorizontalItemVO {
    private int bgImage;
    private String name;
    private String time;

    public MeditationHorizontalItemVO(int bgImage, String name, String time) {
        this.bgImage = bgImage;
        this.name = name;
        this.time = time;
    }

    public int getBgImage() {
        return bgImage;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }
}
