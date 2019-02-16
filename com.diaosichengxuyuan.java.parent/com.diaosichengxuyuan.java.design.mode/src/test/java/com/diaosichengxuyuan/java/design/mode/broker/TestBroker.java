package com.diaosichengxuyuan.java.design.mode.broker;

import org.junit.Test;

public class TestBroker {

    @Test
    public void test() {
        new A().doSomething(new Broker());
        System.out.println();
        new B().doSomething(new Broker());
    }

}
