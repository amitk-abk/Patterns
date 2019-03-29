package com.mycomp.ex.abstractfactory;

public class TataCarFactory implements CarFactory {
    @Override
    public Car manufacture(String carName) {
        TataCars cars = TataCars.valueOf(carName);
        Car car = null;
        switch (cars) {
            case SAFARI: car = new Safari();
                break;

            case TIAGO: car = new Tiago();
                break;

            case HARRIER: car = new Harrier();
                break;
        }
        return car;
    }
}
