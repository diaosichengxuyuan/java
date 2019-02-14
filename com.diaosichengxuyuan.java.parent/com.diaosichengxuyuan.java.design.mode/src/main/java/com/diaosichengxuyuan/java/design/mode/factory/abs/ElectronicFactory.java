package com.diaosichengxuyuan.java.design.mode.factory.abs;

public interface ElectronicFactory {

    Phone producePhone();

    Computer produceComputer();

    Tablet produceTablet();
}
