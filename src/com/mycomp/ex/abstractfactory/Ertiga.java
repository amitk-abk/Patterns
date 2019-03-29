package com.mycomp.ex.abstractfactory;

public class Ertiga implements Car {
    public Ertiga() {
        System.out.println("Assembled Ertiga");
    }

    @Override
    public String getDescription() {
        return "Versatile Ertiga from Maruti!!!";
    }
}
