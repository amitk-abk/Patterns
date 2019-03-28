package com.mycomp.ex.state;

public class Fan {

    private State lowState;
    private State mediumState;
    private State highState;
    private State offState;

    private State currState;

    public Fan() {
        lowState = new LowState(this);
        mediumState = new MediumState(this);
        highState = new HighState(this);
        offState = new OffState(this);
        currState = offState;
    }

    public void pullChain() {
        currState.changeState();
    }


    public State getMediumState() {
        return mediumState;
    }

    public void setState(State state) {
        currState = state;
    }

    public State getHighState() {
        return highState;
    }

    public State getOffState() {
        return offState;
    }

    public State getLowState() {
        return lowState;
    }

    @Override
    public String toString() {
        return currState.toString();
    }
}
