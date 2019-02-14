package com.diaosichengxuyuan.java.design.mode.singleton;

public class DoubleCheckLock {

    private static volatile DoubleCheckLock INSTANCE = null;

    private static DoubleCheckLock getInstance() {
        if(INSTANCE == null) {
            synchronized(DoubleCheckLock.class) {
                if(INSTANCE == null) {
                    INSTANCE = new DoubleCheckLock();
                }
            }
        }

        return INSTANCE;
    }

}
