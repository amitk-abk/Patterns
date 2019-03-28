package com.mycomp.ex.state;

public class OffState implements State {
    private final Fan fan;

    public OffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void changeState() {
        //Record the message and set the next state
        System.out.println("Fan starts at low speed");
        fan.setState(fan.getLowState());
    }

    @Override
    public String toString() {
        return "Fan is off";
    }
}
