package com.diaosichengxuyuan.java.design.mode.factory.abs;

public class HuaweiElectronicFactory implements ElectronicFactory {

    @Override
    public Phone producePhone() {
        return new Phone("mate20");
    }

    @Override
    public Computer produceComputer() {
        return new Computer("huawei computer");
    }

    @Override
    public Tablet produceTablet() {
        return new Tablet("huawei pad");
    }

}
