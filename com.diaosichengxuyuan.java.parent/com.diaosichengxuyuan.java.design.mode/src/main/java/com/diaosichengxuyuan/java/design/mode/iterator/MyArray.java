package com.diaosichengxuyuan.java.design.mode.iterator;

public class MyArray<E> implements Iterator<E> {

    private final E[] array;

    private int beginIndex = 0;
    private int endIndex;

    public MyArray(E[] array) {
        if(array == null) {
            throw new NullPointerException();
        }
        this.array = array;
        endIndex = array.length - 1;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean hasNext() {
        return beginIndex <= endIndex;
    }

    @Override
    public E next() {
        return array[beginIndex++];
    }

}
