package com.diaosichengxuyuan.java.concurrent.threadlocal;

public class MyThreadLocal2 {

    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<String>();

    public static void set(String value) {
        THREAD_LOCAL.set(value);
    }

    public static String get() {
        return THREAD_LOCAL.get();
    }
}
