package com.mycomp.ex.strategy;

public class FighterPlane implements Plane {

    private TakeOff takeOffStyle;
    private Land landingStyle;

    public FighterPlane() {
        System.out.println("I am a x gen fighter plane");
        this.takeOffStyle = new NormalTakeOff();
        this.landingStyle = new LandNormally();
    }

    @Override
    public void fly() {
        System.out.println("I am cruising nicely at 50,000ft...");
    }

    @Override
    public void takeOff() {
        takeOffStyle.takeOff();
    }

    @Override
    public void addTakeOffStyle(TakeOff takeOffStyle) {
        this.takeOffStyle = takeOffStyle;
    }

    @Override
    public void land() {
        landingStyle.land();
    }

    @Override
    public void addLandingStyle(Land landNormally) {
        this.landingStyle = landNormally;
    }
}
