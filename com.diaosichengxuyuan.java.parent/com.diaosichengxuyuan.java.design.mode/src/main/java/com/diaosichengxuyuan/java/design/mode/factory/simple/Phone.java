package com.diaosichengxuyuan.java.design.mode.factory.simple;

public class Phone extends ElectronicProduction{

    private String name;

    public Phone(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

}
