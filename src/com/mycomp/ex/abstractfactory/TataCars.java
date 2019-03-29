package com.mycomp.ex.abstractfactory;

public enum TataCars {

    SAFARI("SAFARI"), TIAGO("TIAGO"), HARRIER("HARRIER");

    private String carName;

    private TataCars(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
}
