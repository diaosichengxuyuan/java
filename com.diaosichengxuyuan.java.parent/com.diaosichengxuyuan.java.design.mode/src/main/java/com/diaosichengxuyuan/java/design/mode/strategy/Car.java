package com.diaosichengxuyuan.java.design.mode.strategy;

public class Car implements Travel{

    @Override
    public String getName() {
        return "高铁";
    }

    @Override
    public String cost() {
        return "10小时";
    }

}
