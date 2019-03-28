package com.mycomp.ex.Command;

public class LightSwitch {

    public void switchOn(Command onCommand) {
        onCommand.execute();
    }

    public void switchOff(Command offCommand) {
        offCommand.execute();
    }
}
