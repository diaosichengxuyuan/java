package com.diaosichengxuyuan.java.design.mode.prototype;

import org.junit.Test;

public class TestPrototype {

    @Test
    public void test() {
        Prototype prototype = new Prototype();
        System.out.println("克隆前：" + prototype);

        Prototype newPrototype = (Prototype)prototype.clone();
        System.out.println("克隆后：" + newPrototype);
    }

}
