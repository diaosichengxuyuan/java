package com.diaosichengxuyuan.java.design.mode.command;

import org.junit.Test;

public class TestCommand {

    @Test
    public void test() {
        Control control = new Control(new OpenCommand(), new CloseCommand(), new ChangeCommand());
        control.open();
        control.close();
        control.change();
    }

}
