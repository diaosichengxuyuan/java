package com.diaosichengxuyuan.java.design.mode.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CountryCache {

    private static final CountryCache INSTANCE = new CountryCache();

    private static final Map<String, Country> countries = new HashMap<>(3);

    static {
        countries.put("China", new China());
        countries.put("America", new America());
        countries.put("Japan", new Japan());
    }

    public static CountryCache getInstance() {
        return INSTANCE;
    }

    public void printGdp(String country) {
        System.out.println(countries.get(country).gdp());
    }

    public void printPopulation(String country) {
        System.out.println(countries.get(country).population());
    }

}
