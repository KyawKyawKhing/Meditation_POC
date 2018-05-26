package com.aceplus.padc_poc_one.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kkk on 5/19/2018.
 */

public class CategoriesProgramsVO implements MainVO {

    private String title;
    private List<CategoriesProgramsItemVO> programs;

    public String getTitle() {
        return title;
    }

    public List<CategoriesProgramsItemVO> getCategoriesProgramsItemVOS() {
        return programs;
    }
}
