package com.diaosichengxuyuan.java.design.mode.flyweight;

public class America implements Country{

    @Override
    public String gdp() {
        return "35000亿";
    }

    @Override
    public int population() {
        return 200000000;
    }

}
