package com.diaosichengxuyuan.java.design.mode.iterator;

public interface Iterator<E> {

    int size();

    boolean hasNext();

    E next();
}
