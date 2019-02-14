package com.diaosichengxuyuan.java.design.mode.factory.simple;

public class ElectronicFactory {

    public static ElectronicProduction produce(int type) {
        switch(type) {
            case 1:
                return new Phone("phone");
            case 2:
                return new Computer("computer");
            case 3:
                return new Tablet("tablet");
            default:
                return null;
        }
    }

}
