package com.diaosichengxuyuan.java.design.mode.state;

public abstract class ParentState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void carry();

    public abstract void put();

    public abstract void goaway();

    public abstract void ignite();

}
