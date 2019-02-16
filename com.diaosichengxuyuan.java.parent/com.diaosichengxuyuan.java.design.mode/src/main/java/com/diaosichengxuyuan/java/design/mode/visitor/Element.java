package com.diaosichengxuyuan.java.design.mode.visitor;

public interface Element {

    void doSomething();

    void acceptVisitor(Visitor visitor);
}
