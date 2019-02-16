package com.diaosichengxuyuan.java.design.mode.flyweight;

import org.junit.Test;

public class TestFlyweight {

    @Test
    public void test() {
        CountryCache.getInstance().printGdp("China");
        CountryCache.getInstance().printGdp("America");
        CountryCache.getInstance().printGdp("Japan");

        CountryCache.getInstance().printPopulation("China");
        CountryCache.getInstance().printPopulation("America");
        CountryCache.getInstance().printPopulation("Japan");
    }

}
