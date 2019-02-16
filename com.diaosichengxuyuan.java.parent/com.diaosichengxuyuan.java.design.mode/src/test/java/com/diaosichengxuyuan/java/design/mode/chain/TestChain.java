package com.diaosichengxuyuan.java.design.mode.chain;

import org.junit.Test;

public class TestChain {

    @Test
    public void test() {
        Filter1 filter1 = new Filter1();
        Filter2 filter2 = new Filter2();
        Filter3 filter3 = new Filter3();

        filter1.setNextFilter(filter2);
        filter2.setNextFilter(filter3);

        filter1.doFilter();
    }

}
