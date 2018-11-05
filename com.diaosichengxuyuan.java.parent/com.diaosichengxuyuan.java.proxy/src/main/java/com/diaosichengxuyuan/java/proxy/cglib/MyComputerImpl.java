package com.diaosichengxuyuan.java.proxy.cglib;

/**
 * @author liuhaipeng
 * @date 2018/11/5
 */
public class MyComputerImpl {

    public Integer add(Integer t1, Integer t2) {
        return Integer.valueOf(t1.intValue() + t2.intValue());
    }
}
