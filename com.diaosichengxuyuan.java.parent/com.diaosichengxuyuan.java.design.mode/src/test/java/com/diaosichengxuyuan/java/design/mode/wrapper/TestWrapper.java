package com.diaosichengxuyuan.java.design.mode.wrapper;

import org.junit.Test;

public class TestWrapper {

    @Test
    public void test(){
        new GastronomeWrapper(new Foodie()).eatApple();
    }

}
