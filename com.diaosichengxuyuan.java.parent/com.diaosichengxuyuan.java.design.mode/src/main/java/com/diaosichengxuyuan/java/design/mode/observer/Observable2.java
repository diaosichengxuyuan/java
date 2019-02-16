package com.diaosichengxuyuan.java.design.mode.observer;

public class Observable2 extends Observable {

    public Observable2(String name) {
        super(name);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

}
