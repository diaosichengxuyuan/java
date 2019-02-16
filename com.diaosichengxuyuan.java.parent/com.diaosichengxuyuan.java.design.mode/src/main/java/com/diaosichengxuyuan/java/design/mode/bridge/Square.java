package com.diaosichengxuyuan.java.design.mode.bridge;

public class Square extends Shape{

    @Override
    public void draw() {
        System.out.print("画正方形 ");
        color.paint();
    }
}
