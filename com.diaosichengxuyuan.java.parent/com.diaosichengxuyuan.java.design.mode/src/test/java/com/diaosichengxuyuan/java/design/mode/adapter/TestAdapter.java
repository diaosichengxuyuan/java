package com.diaosichengxuyuan.java.design.mode.adapter;

import org.junit.Test;

public class TestAdapter {

    @Test
    public void test(){
        System.out.println(new Adapter1().say());
        System.out.println(new Adapter2(new Original()).say());
    }

}
