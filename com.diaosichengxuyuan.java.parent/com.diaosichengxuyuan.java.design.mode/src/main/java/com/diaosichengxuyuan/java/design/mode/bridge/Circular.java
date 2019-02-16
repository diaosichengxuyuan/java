package com.diaosichengxuyuan.java.design.mode.bridge;

public class Circular extends Shape{

    @Override
    public void draw() {
       System.out.print("画圆形 ");
       color.paint();
    }

}
