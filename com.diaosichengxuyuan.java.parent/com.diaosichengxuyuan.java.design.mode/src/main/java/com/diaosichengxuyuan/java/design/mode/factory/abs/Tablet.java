package com.diaosichengxuyuan.java.design.mode.factory.abs;

public class Tablet {

    private String name;

    public Tablet(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

}
