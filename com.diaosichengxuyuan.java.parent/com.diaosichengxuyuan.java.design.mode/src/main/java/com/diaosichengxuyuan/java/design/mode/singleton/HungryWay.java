package com.diaosichengxuyuan.java.design.mode.singleton;

public class HungryWay {

    private static final HungryWay INSTANCE = new HungryWay();

    private static HungryWay getInstance() {
        return INSTANCE;
    }

}
