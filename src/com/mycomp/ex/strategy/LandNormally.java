package com.mycomp.ex.strategy;

public class LandNormally implements Land {
    @Override
    public void land() {
        System.out.println("I am landing normally....");
    }
}
