package com.aceplus.padc_poc_one.data.model;

import android.util.Log;

import com.aceplus.padc_poc_one.data.vo.CategoriesProgramsVO;
import com.aceplus.padc_poc_one.data.vo.CurrentProgramVO;
import com.aceplus.padc_poc_one.data.vo.MainVO;
import com.aceplus.padc_poc_one.data.vo.SingleVO;
import com.aceplus.padc_poc_one.data.vo.TopicVO;
import com.aceplus.padc_poc_one.events.RestApiEvents;
import com.aceplus.padc_poc_one.network.MeditateDataAgentImpl;
import com.aceplus.padc_poc_one.utils.AppConstants;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kkk on 5/26/2018.
 */

public class MeditateModel {

    private static MeditateModel INSTANCE;
    private int meditatePageIndex = 1;

    private List<MainVO> objects = new ArrayList<>();

    private MeditateModel() {
        EventBus.getDefault().register(this);
    }


    public static MeditateModel getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MeditateModel();
        }
        return INSTANCE;
    }

    public List<MainVO> getObjects() {
        if (objects.isEmpty())
            return new ArrayList<>();

        return objects;
    }

    public void startLoadingData() {
        MeditateDataAgentImpl.getInstance().loadCurrentProgram(meditatePageIndex, AppConstants.ACCESS_TOKEN);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onCurrentProgramDataLoad(RestApiEvents.CurrentProgramDataLoadedEvent event) {
        objects.add(event.getCurrentProgramVO());
        MeditateDataAgentImpl.getInstance().loadCategoriesPrograms(meditatePageIndex, AppConstants.ACCESS_TOKEN);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onCategoriesProgramsDataLoad(RestApiEvents.CategoriesProgramsDataLoadedEvent event) {
        objects.addAll(event.getList());
        objects.add(new SingleVO("All Topics"));
        MeditateDataAgentImpl.getInstance().loadTopics(meditatePageIndex, AppConstants.ACCESS_TOKEN);
//        meditatePageIndex = event.getLoadedPageIndex() + 1;
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onTopicsDataLoad(RestApiEvents.TopicsDataLoadedEvent event) {
        objects.addAll(event.getList());
//        meditatePageIndex = event.getLoadedPageIndex() + 1;
        RestApiEvents.AllDataLoadedEvent allDataLoadedEvent = new RestApiEvents.AllDataLoadedEvent(objects);
        EventBus.getDefault().post(allDataLoadedEvent);
    }


}
