package com.diaosichengxuyuan.java.design.mode.factory.simple;

public class Computer extends ElectronicProduction {

    private String name;

    public Computer(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

}
