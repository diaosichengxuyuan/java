package com.diaosichengxuyuan.java.design.mode.template;

public class Elephant extends AbstractCircus{

    @Override
    protected void prepare() {
        System.out.println("把大象笼子打开");
    }

    @Override
    protected void showing() {
        System.out.println("大象开始表演啦");
    }

    @Override
    protected void finish() {
        System.out.println("给大象洗个澡");
    }

}
