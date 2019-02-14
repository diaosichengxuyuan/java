package com.diaosichengxuyuan.java.design.mode.adapter;

public class Adapter2 implements Target{

    private Original original;

    public Adapter2(Original original){
        this.original = original;
    }

    @Override
    public String say() {
        return original.shout();
    }

}
