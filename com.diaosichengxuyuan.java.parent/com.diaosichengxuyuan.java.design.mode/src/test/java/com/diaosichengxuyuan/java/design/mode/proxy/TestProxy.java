package com.diaosichengxuyuan.java.design.mode.proxy;

import org.junit.Test;

public class TestProxy {

    @Test
    public void test() {
        Player player = new YaomingProxy(new Yaoming());
        player.playBasketball();
    }

}
