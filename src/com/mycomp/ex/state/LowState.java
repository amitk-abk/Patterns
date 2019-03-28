package com.mycomp.ex.state;

public class LowState implements State {

    private Fan fan;

    public LowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void changeState() {
        //Record the message and set the next state
        System.out.println("Fan speeds to medium state");
        fan.setState(fan.getMediumState());
    }

    @Override
    public String toString() {
        return "Fan is low";
    }
}
