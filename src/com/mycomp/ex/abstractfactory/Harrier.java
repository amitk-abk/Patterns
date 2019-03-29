package com.mycomp.ex.abstractfactory;

public class Harrier implements Car {
    public Harrier() {
        System.out.println("Assembled Harrier");
    }

    @Override
    public String getDescription() {
        return "The mighty Harrier from TATA!";
    }
}
