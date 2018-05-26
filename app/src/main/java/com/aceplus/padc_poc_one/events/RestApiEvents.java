package com.aceplus.padc_poc_one.events;

/**
 * Created by hakerfaker on 5/26/2018.
 */

public class RestApiEvent {

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
