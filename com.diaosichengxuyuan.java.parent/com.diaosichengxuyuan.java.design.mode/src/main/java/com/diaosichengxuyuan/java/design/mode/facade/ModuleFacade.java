package com.diaosichengxuyuan.java.design.mode.facade;

public class ModuleFacade {

    private ModuleA moduleA = new ModuleA();

    private ModuleB moduleB = new ModuleB();

    private ModuleC moduleC = new ModuleC();

    public void a1(){
        moduleA.a1();
    }

    public void b2(){
        moduleB.b2();
    }

    public void c3(){
        moduleC.c3();
    }

}
