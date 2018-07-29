package com.diaosichengxuyuan.java.concurrent.threadlocal;

import org.junit.Test;

public class TestMyThreadLocal {

    @Test
    public void test() {
        System.out.println(MyThreadLocal.get());

        MyThreadLocal.set("abc");

        System.out.println(MyThreadLocal.get());
    }
}
