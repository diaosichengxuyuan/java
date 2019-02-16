package com.diaosichengxuyuan.java.design.mode.visitor;

public class Element1 implements Element {

    @Override
    public void doSomething() {
        System.out.println("元素1正在搞事情");
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visit(this);
    }

}
