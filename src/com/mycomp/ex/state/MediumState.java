package com.mycomp.ex.state;

public class MediumState implements State {

    private Fan fan;

    public MediumState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void changeState() {
        //Record the message and set the next state
        System.out.println("Fan speeds to high speed");
        fan.setState(fan.getHighState());
    }

    @Override
    public String toString() {
        return "Fan is medium";
    }
}
