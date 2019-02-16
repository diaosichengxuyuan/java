package com.diaosichengxuyuan.java.design.mode.template;

public class Monkey extends AbstractCircus{

    @Override
    protected void prepare() {
        System.out.println("把猴子链子解开");
    }

    @Override
    protected void showing() {
        System.out.println("猴子开始表演啦");
    }

    @Override
    protected void finish() {
        System.out.println("把猴子的赏钱没收掉");
    }

}
