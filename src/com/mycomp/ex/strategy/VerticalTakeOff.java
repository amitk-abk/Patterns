package com.mycomp.ex.strategy;

public class VerticalTakeOff implements TakeOff {
    @Override
    public void takeOff() {
        System.out.println("I am equipped with vertical take off capability....taking off vertically......");
    }
}
