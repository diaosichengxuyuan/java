package com.diaosichengxuyuan.java.design.mode.state;

public class Context {

    public final static CarryState CARRY_STATE = new CarryState();
    public final static PutState PUT_STATE = new PutState();
    public final static GoawayState GOAWAY_STATE = new GoawayState();
    public final static IgnitState IGNIT_STATE = new IgnitState();

    private ParentState parentState;

    public ParentState getParentState() {
        return parentState;
    }

    public void setParentState(ParentState parentState) {
        this.parentState = parentState;
        this.parentState.setContext(this);
    }

    public void carry() {
        this.parentState.carry();
    }

    public void put() {
        this.parentState.put();
    }

    public void goaway() {
        this.parentState.goaway();
    }

    public void ignite() {
        this.parentState.ignite();
    }

}
