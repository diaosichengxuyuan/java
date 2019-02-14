package com.diaosichengxuyuan.java.design.mode.builder;

public class PlaneBuilderImpl implements PlaneBuilder {

    @Override
    public void buildHead() {
        System.out.println("飞机头部建造完成");
    }

    @Override
    public void buildBody() {
        System.out.println("飞机身子建造完成");
    }

    @Override
    public void buildTail() {
        System.out.println("飞机尾部建造完成");
    }

}
