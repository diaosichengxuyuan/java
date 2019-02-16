package com.diaosichengxuyuan.java.design.mode.observer;

public class Observable1 extends Observable {

    public Observable1(String name) {
        super(name);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }

    public void change() {
        System.out.println(getName() + "正在变化");
        notifyObservers();
    }

}
