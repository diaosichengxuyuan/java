package com.diaosichengxuyuan.java.design.mode.factory.abs;

public class Phone {

    private String name;

    public Phone(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

}
