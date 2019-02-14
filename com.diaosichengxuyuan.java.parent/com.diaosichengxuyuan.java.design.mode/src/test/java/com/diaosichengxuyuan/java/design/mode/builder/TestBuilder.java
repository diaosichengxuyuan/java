package com.diaosichengxuyuan.java.design.mode.builder;

import org.junit.Test;

public class TestBuilder {

    @Test
    public void test() {
        PlaneBuilder planeBuilder = new PlaneBuilderImpl();
        planeBuilder.buildHead();
        planeBuilder.buildBody();
        planeBuilder.buildTail();
    }

}
