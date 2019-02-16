package com.diaosichengxuyuan.java.design.mode.command;

public class CloseCommand implements Command{

    @Override
    public void execute() {
        new Tv().close();
    }

}
