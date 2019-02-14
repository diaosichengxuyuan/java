package com.diaosichengxuyuan.java.design.mode.singleton;

public class FullWay {

    private static FullWay INSTANCE = null;

    private static FullWay getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new FullWay();
        }

        return INSTANCE;
    }

}
