package com.diaosichengxuyuan.java.concurrent.threadlocal;

import org.junit.Test;

public class TestMyThreadLocal {

    @Test
    public void test() {
        System.out.println(MyThreadLocal1.get());
        System.out.println(MyThreadLocal2.get());

        MyThreadLocal1.set("abc");
        MyThreadLocal1.set("efg");

        MyThreadLocal2.set("abc");
        MyThreadLocal2.set("efg");

        System.out.println(MyThreadLocal1.get());
        System.out.println(MyThreadLocal2.get());
    }
}
