package com.diaosichengxuyuan.java.design.mode.memento;

public class GameMemento {

    private int power = 0;

    private int lives = 0;

    public void backup(GameRole gameRole) {
        power = gameRole.getPower();
        lives = gameRole.getLives();
    }

    public GameRole recover(GameRole gameRole) {
        gameRole.setPower(power);
        gameRole.setLives(lives);
        return gameRole;
    }

}
