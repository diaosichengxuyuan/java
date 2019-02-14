package com.diaosichengxuyuan.java.design.mode.adapter;

public class Adapter1 extends Original implements Target{

    @Override
    public String say() {
        return super.shout();
    }

}
