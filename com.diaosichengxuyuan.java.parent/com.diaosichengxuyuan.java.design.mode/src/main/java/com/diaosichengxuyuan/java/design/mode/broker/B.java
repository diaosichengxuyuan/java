package com.diaosichengxuyuan.java.design.mode.broker;

public class B implements P{

    @Override
    public void doSomething(Broker broker) {
        System.out.println("B正在做事情");
        broker.effectA();
    }

}
