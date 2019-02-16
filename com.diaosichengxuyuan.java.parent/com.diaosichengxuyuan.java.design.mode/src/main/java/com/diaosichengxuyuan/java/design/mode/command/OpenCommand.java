package com.diaosichengxuyuan.java.design.mode.command;

public class OpenCommand implements Command{

    @Override
    public void execute() {
        new Tv().open();
    }

}
