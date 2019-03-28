package com.mycomp.ex.strategy;

public interface Plane {
    void fly();

    void takeOff();

    void addTakeOffStyle(TakeOff takeOffStyle);

    void land();

    void addLandingStyle(Land landingStyle);
}
