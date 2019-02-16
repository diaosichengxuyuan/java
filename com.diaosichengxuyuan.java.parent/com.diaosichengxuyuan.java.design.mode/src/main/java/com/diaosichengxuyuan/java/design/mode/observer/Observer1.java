package com.diaosichengxuyuan.java.design.mode.observer;

public class Observer1 implements Observer {

    @Override
    public void update(Observable observable) {
        System.out.println("美国宇航局发现" + observable.getName() + "的变动");
    }

}
