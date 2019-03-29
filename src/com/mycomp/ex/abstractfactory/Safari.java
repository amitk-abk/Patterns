package com.mycomp.ex.abstractfactory;

public class Safari implements Car {
    public Safari() {
        System.out.println("Assembled Safari");
    }

    @Override
    public String getDescription() {
        return "Legandary Safari from Maruti";
    }
}
