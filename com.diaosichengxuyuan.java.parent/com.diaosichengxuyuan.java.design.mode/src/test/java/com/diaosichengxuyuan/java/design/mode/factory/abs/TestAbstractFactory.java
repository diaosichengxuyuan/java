package com.diaosichengxuyuan.java.design.mode.factory.abs;

import org.junit.Test;

public class TestAbstractFactory {

    @Test
    public void test() {
        ElectronicFactory appleElectronicFactory = new AppleElectronicFactory();
        System.out.println(appleElectronicFactory.producePhone());
        System.out.println(appleElectronicFactory.produceComputer());
        System.out.println(appleElectronicFactory.produceTablet());

        HuaweiElectronicFactory huaweiElectronicFactory = new HuaweiElectronicFactory();
        System.out.println(huaweiElectronicFactory.producePhone());
        System.out.println(huaweiElectronicFactory.produceComputer());
        System.out.println(huaweiElectronicFactory.produceTablet());
    }

}
