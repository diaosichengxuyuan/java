package com.diaosichengxuyuan.java.design.mode.factory.simple;

import org.junit.Test;

public class TestSimpleFactory {

    @Test
    public void test(){
         System.out.println(ElectronicFactory.produce(1));
         System.out.println(ElectronicFactory.produce(2));
         System.out.println(ElectronicFactory.produce(3));
         System.out.println(ElectronicFactory.produce(4));
    }

}
