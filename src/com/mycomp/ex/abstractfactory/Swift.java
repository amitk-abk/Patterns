package com.mycomp.ex.abstractfactory;

public class Swift implements Car {
    public Swift() {
        System.out.println("Assembled Swift");
    }

    @Override
    public String getDescription() {
        return "Evergreen Swift from Maruti";
    }
}
