package com.diaosichengxuyuan.java.design.mode.proxy;

public class YaomingProxy implements Player {

    private Player player;

    public YaomingProxy(Player player){
        this.player = player;
    }

    @Override
    public void playBasketball() {
        System.out.println("助手给篮球充气");
        player.playBasketball();
        System.out.println("助手给篮球放气");
    }

}
