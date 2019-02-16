package com.diaosichengxuyuan.java.design.mode.memento;

import org.junit.Test;

public class TestMemento {

    @Test
    public void test() {
        GameRole gameRole = new GameRole();
        GameMemento gameMemento = new GameMemento();
        gameMemento.backup(gameRole);

        for(int i = 0; i < 50; i++) {
            System.out.println(gameRole);
            gameRole.attack();
        }

        System.out.println("恢复生命和体力");
        gameMemento.recover(gameRole);
        for(int i = 0; i < 10; i++) {
            System.out.println(gameRole);
            gameRole.attack();
        }
    }

}
