package com.diaosichengxuyuan.java.design.mode.observer;

import org.junit.Test;

public class TestObserver {

    @Test
    public void test() {
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();

        Observable1 observable1 = new Observable1("旅行者1号");
        observable1.addObserver(observer1);
        observable1.addObserver(observer2);
        observable1.change();
        System.out.println();
        Observable1 observable2 = new Observable1("哥伦比亚号航天飞机");
        observable2.addObserver(observer1);
        observable2.addObserver(observer2);
        observable2.change();
    }

}
