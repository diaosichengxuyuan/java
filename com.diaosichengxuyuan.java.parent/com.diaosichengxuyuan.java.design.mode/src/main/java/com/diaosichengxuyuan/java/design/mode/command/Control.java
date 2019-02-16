package com.diaosichengxuyuan.java.design.mode.command;

public class Control {

    private final Command openCommand;

    private final Command closeCommand;

    private final Command changeCommand;

    public Control(Command openCommand, Command closeCommand, Command changeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
        this.changeCommand = changeCommand;
    }

    public void open() {
        openCommand.execute();
    }

    public void close() {
        closeCommand.execute();
    }

    public void change() {
        changeCommand.execute();
    }

}
