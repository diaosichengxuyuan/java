package com.diaosichengxuyuan.java.design.mode.state;

import org.junit.Test;

public class TestState {

    @Test
    public void test() {
        Context context = new Context();
        context.setParentState(Context.CARRY_STATE);
        context.carry();
        context.ignite();
        context.put();
        context.goaway();
        context.ignite();
    }

}
