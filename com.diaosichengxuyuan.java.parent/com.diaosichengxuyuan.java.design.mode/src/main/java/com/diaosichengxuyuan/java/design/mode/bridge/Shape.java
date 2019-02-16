package com.diaosichengxuyuan.java.design.mode.bridge;

public abstract class Shape {

    protected Color color;

    protected void setColor(Color color){
        this.color = color;
    }

    public abstract void draw();
}
