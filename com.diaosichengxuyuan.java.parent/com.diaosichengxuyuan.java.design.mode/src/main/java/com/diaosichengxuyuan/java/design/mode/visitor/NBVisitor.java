package com.diaosichengxuyuan.java.design.mode.visitor;

public class NBVisitor implements Visitor{

    @Override
    public void visit(Element element) {
        element.doSomething();
    }

}
