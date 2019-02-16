package com.diaosichengxuyuan.java.design.mode.visitor;

import org.junit.Test;

public class TestVisitor {

    @Test
    public void test(){
        Visitor visitor = new NBVisitor();
        Element element1 = new Element1();
        element1.acceptVisitor(visitor);
        Element element2 = new Element2();
        element2.acceptVisitor(visitor);
    }

}
