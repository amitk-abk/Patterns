package com.mycomp.ex.state;

public class HighState implements State {
    private final Fan fan;

    public HighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void changeState() {
        //Record the message and set the next state
        System.out.println("Fan now stops");
        fan.setState(fan.getOffState());
    }

    @Override
    public String toString() {
        return "Fan is high";
    }
}
