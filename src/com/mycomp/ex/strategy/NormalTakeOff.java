package com.mycomp.ex.strategy;

public class NormalTakeOff implements TakeOff {
    @Override
    public void takeOff() {
        System.out.println("Taking off normally.......");
    }
}
