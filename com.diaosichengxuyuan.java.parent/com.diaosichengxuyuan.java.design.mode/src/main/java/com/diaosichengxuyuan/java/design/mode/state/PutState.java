package com.diaosichengxuyuan.java.design.mode.state;

public class PutState extends ParentState {

    @Override
    public void carry() {
        System.out.println("小Y:还在敌方区，无法再扛炸药包");
    }

    @Override
    public void put() {
        System.out.println("小Y:好险，成功把放置炸药包");
    }

    @Override
    public void goaway() {
        super.context.setParentState(Context.GOAWAY_STATE);
        super.context.getParentState().goaway();
    }

    @Override
    public void ignite() {
        System.out.println("小Y:还没逃离敌方区，无法引爆炸药");
    }

}
