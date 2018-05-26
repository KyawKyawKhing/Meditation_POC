package com.aceplus.padc_poc_one.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by kkk on 5/17/2018.
 */

public class CategoriesProgramsItemVO {

    @SerializedName("title")
    private String title;

    @SerializedName("image")
    private String image;

    @SerializedName("average-lengths")
    private List<Integer> averageeLengths;

    @SerializedName("description")
    private String description;

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public List<Integer> getAverageeLengths() {
        return averageeLengths;
    }

    public String getDescription() {
        return description;
    }
}
