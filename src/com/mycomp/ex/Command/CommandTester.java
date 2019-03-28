package com.mycomp.ex.Command;

public class CommandTester {

    public static void main(String[] args) {
        LightSwitch lightSwitch = new LightSwitch();
        Light light = new Light();
        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);

        lightSwitch.switchOn(onCommand);
        lightSwitch.switchOff(offCommand);
    }
}
