package com.mycomp.ex.abstractfactory;

public class Tiago implements Car {
    public Tiago() {
        System.out.println("Assembled Tiago");
    }

    @Override
    public String getDescription() {
        return "Car of year from TATA the Tiago";
    }
}
