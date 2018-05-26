package com.aceplus.padc_poc_one.events;

import com.aceplus.padc_poc_one.data.vo.CategoriesProgramsItemVO;
import com.aceplus.padc_poc_one.data.vo.CategoriesProgramsVO;
import com.aceplus.padc_poc_one.data.vo.CurrentProgramVO;
import com.aceplus.padc_poc_one.data.vo.MainVO;
import com.aceplus.padc_poc_one.data.vo.TopicVO;

import java.util.List;

/**
 * Created by kkk on 5/26/2018.
 */

public class RestApiEvents {

    public static class AllDataLoadedEvent {
        private List<MainVO> objectList;

        public AllDataLoadedEvent(List<MainVO> objectList) {
            this.objectList = objectList;
        }

        public List<MainVO> getObjectList() {
            return objectList;
        }
    }

    public static class CurrentProgramDataLoadedEvent {
        private CurrentProgramVO currentProgramVO;

        public CurrentProgramDataLoadedEvent(CurrentProgramVO currentProgramVO) {
            this.currentProgramVO = currentProgramVO;
        }

        public CurrentProgramVO getCurrentProgramVO() {
            return currentProgramVO;
        }
    }

    public static class CategoriesProgramsDataLoadedEvent {
        private int loadedPageIndex;
        private List<CategoriesProgramsVO> list;

        public CategoriesProgramsDataLoadedEvent(int loadedPageIndex, List<CategoriesProgramsVO> list) {
            this.loadedPageIndex = loadedPageIndex;
            this.list = list;
        }

        public int getLoadedPageIndex() {
            return loadedPageIndex;
        }

        public List<CategoriesProgramsVO> getList() {
            return list;
        }
    }

    public static class TopicsDataLoadedEvent {
        private int loadedPageIndex;
        private List<TopicVO> list;

        public TopicsDataLoadedEvent(int loadedPageIndex, List<TopicVO> list) {
            this.loadedPageIndex = loadedPageIndex;
            this.list = list;
        }

        public int getLoadedPageIndex() {
            return loadedPageIndex;
        }

        public List<TopicVO> getList() {
            return list;
        }
    }

    public static class ErrorInvokingAPIEvent {
        private String errorMsg;

        public ErrorInvokingAPIEvent(String errorMsg) {
            this.errorMsg = errorMsg;
        }

        public String getErrorMsg() {
            return errorMsg;
        }
    }
}
