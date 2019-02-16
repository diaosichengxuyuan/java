package com.diaosichengxuyuan.java.design.mode.broker;

public class A implements P{

    @Override
    public void doSomething(Broker broker) {
        System.out.println("A正在做事情");
        broker.effectB();
    }

}
