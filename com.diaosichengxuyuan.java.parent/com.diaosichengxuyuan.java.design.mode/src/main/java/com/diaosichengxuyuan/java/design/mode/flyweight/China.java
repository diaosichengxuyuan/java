package com.diaosichengxuyuan.java.design.mode.flyweight;

public class China implements Country{

    @Override
    public String gdp() {
        return "10000亿";
    }

    @Override
    public int population() {
        return 1300000000;
    }

}
