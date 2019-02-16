package com.diaosichengxuyuan.java.design.mode.template;

public abstract class AbstractCircus {
    
    public void show(){
        prepare();
        showing();
        finish();
    }
    
    protected abstract void prepare();
    protected abstract void showing();
    protected abstract void finish();
}
