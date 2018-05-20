package com.aceplus.padc_poc_one.vo;

/**
 * Created by kkk on 5/19/2018.
 */

public class StartVO {
    private String title;
    private String name;
    private String time;
    private int main_bg;

    public StartVO(String title, String name, String time, int main_bg) {
        this.title = title;
        this.name = name;
        this.time = time;
        this.main_bg = main_bg;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public int getMain_bg() {
        return main_bg;
    }
}
