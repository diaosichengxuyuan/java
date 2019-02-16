package com.diaosichengxuyuan.java.design.mode.strategy;

public class Plane implements Travel{

    @Override
    public String getName() {
        return "飞机";
    }

    @Override
    public String cost() {
        return "2小时";
    }

}
