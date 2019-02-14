package com.diaosichengxuyuan.java.design.mode.factory.abs;

public class AppleElectronicFactory implements ElectronicFactory{
    @Override
    public Phone producePhone() {
        return new Phone("iphone");
    }

    @Override
    public Computer produceComputer() {
        return new Computer("macbook");
    }

    @Override
    public Tablet produceTablet() {
        return new Tablet("ipad");
    }
}
