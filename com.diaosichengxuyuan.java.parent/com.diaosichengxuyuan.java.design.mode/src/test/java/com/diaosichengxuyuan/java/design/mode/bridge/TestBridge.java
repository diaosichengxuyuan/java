package com.diaosichengxuyuan.java.design.mode.bridge;

import org.junit.Test;

public class TestBridge {

    @Test
    public void test(){
        Square square = new Square();
        square.setColor(new White());
        square.draw();

        Circular circular = new Circular();
        circular.setColor(new Red());
        circular.draw();
    }

}
