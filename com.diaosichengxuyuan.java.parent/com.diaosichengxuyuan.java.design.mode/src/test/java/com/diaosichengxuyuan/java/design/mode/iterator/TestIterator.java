package com.diaosichengxuyuan.java.design.mode.iterator;

import org.junit.Test;

public class TestIterator {

    @Test
    public void test() {
        MyArray<String> myArray = new MyArray<>(new String[] {"我", "是", "一", "个", "好", "人"});
        while(myArray.hasNext()) {
            System.out.println(myArray.next());
        }
        System.out.println("一共" + myArray.size() + "个");
    }

}
