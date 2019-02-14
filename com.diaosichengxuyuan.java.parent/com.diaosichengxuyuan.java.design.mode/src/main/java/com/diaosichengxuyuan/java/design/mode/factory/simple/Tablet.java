package com.diaosichengxuyuan.java.design.mode.factory.simple;

public class Tablet extends ElectronicProduction{

    private String name;

    public Tablet(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

}
