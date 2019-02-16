package com.diaosichengxuyuan.java.design.mode.observer;

public class Observer2 implements Observer {

    @Override
    public void update(Observable observable) {
        System.out.println("国际空间站发现" + observable.getName() + "的变动");
    }

}
