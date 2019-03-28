package com.mycomp.ex.strategy;

public class TestStrategy {

    public static void main(String[] args) {
        Plane fighterPlane = new FighterPlane();

        System.out.println("    ...Testing vertical take off");
        TakeOff verticalTakeOff = new VerticalTakeOff();
        fighterPlane.addTakeOffStyle(verticalTakeOff);
        fighterPlane.takeOff();
        fighterPlane.fly();

        Land landNormally = new LandNormally();
        fighterPlane.addLandingStyle(landNormally);
        fighterPlane.land();
        System.out.println();

        System.out.println("    ...Vertical take off system test completed, falling back to normalcy");
        TakeOff normalTakeOff = new NormalTakeOff();
        fighterPlane.addTakeOffStyle(normalTakeOff);
        fighterPlane.takeOff();
        fighterPlane.fly();

        Land landVertically = new LandVertically();
        fighterPlane.addLandingStyle(landVertically);
        fighterPlane.land();
        System.out.println();

        Plane commercialPlane = new CommercialPlane();
        commercialPlane.takeOff();
        commercialPlane.fly();
        commercialPlane.land();
    }
}
