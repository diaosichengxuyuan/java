package com.diaosichengxuyuan.java.design.mode.facade;

import org.junit.Test;

public class TestFacade {

    @Test
    public void test() {
        ModuleFacade moduleFacade = new ModuleFacade();
        moduleFacade.a1();
        moduleFacade.b2();
        moduleFacade.c3();
    }

}
