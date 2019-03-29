package com.mycomp.ex.abstractfactory;

public class ManufactureCar {

    public static void main(String[] args) {
        Car baleno = CarManufacturingFactory.manufactureCar("Baleno");
        System.out.println(baleno.getDescription());

        Car tiago = CarManufacturingFactory.manufactureCar("tiago");
        System.out.println(tiago.getDescription());
    }
}
