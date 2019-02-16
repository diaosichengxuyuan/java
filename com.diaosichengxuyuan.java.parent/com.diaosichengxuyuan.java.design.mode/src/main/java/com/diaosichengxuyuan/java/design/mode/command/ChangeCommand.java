package com.diaosichengxuyuan.java.design.mode.command;

public class ChangeCommand implements Command{

    @Override
    public void execute() {
        new Tv().change();
    }

}
