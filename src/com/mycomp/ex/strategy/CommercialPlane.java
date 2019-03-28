package com.mycomp.ex.strategy;

public class CommercialPlane implements Plane {

    private TakeOff takeOffStyle;
    private Land landingStyle;

    public CommercialPlane() {
        System.out.println("I am a commercial plane");
        this.takeOffStyle = new NormalTakeOff();
        this.landingStyle = new LandNormally();
    }

    @Override
    public void fly() {
        System.out.println("I am a commercial plane.....flying at 23000ft at 0.80Mk");
    }

    @Override
    public void takeOff() {
        this.takeOffStyle.takeOff();
    }

    @Override
    public void addTakeOffStyle(TakeOff takeOffStyle) {
        this.takeOffStyle = takeOffStyle;
    }

    @Override
    public void land() {
        this.landingStyle.land();
    }

    @Override
    public void addLandingStyle(Land landingStyle) {
        this.landingStyle = landingStyle;
    }
}
