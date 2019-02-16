package com.diaosichengxuyuan.java.design.mode.memento;

public class GameRole {

    private int power = 10;

    private int lives = 4;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void attack() {
        power--;
        if(power == 0) {
            lives--;
            power = 10;
        }
    }

    @Override
    public String toString() {
        return "命：" + lives + "条；体力：" + power;
    }

}
