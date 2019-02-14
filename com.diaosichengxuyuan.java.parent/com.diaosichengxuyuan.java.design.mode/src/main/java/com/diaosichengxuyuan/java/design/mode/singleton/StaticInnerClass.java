package com.diaosichengxuyuan.java.design.mode.singleton;

public class StaticInnerClass {

    private static class Holder {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    private StaticInnerClass getInstance() {
        return Holder.INSTANCE;
    }
}
