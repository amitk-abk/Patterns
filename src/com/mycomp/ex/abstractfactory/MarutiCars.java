package com.mycomp.ex.abstractfactory;

public enum MarutiCars {
    BALENO("BALENO"), SWIFT("SWIFT"), ERTIGA("ERTIGA");

    private String carName;

    private MarutiCars(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
}
