package com.diaosichengxuyuan.java.design.mode.template;

import org.junit.Test;

public class TestTemplate {

    @Test
    public void test() {
        AbstractCircus elephant = new Elephant();
        elephant.show();

        AbstractCircus monkey = new Monkey();
        monkey.show();
    }

}
