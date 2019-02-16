package com.diaosichengxuyuan.java.design.mode.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    private final String name;

    protected final List<Observer> observers = new ArrayList<>();

    protected Observable(String name) {
        this.name = name;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObservers();

    public String getName() {
        return name;
    }

}
