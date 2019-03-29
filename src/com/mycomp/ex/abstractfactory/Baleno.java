package com.mycomp.ex.abstractfactory;

public class Baleno implements Car {

    public Baleno() {
        System.out.println("Assembled Baleno");
    }

    @Override
    public String getDescription() {
        return "Brand new Baleno from Maruti";
    }
}
