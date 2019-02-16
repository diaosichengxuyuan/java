package com.diaosichengxuyuan.java.design.mode.state;

public class CarryState extends ParentState {

    @Override
    public void carry() {
        System.out.println("小Y:报告排长，我已跑到炮楼底下");
    }

    @Override
    public void put() {
        super.context.setParentState(Context.PUT_STATE);
        super.context.getParentState().put();
    }

    @Override
    public void goaway() {
        System.out.println("小Y:还没放置炸药成功，撤离失败");
    }

    @Override
    public void ignite() {
        System.out.println("小Y:还没放置炸药成功，引爆失败");
    }

}
