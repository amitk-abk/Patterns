package com.mycomp.ex.abstractfactory;

public class MarutiCarFactory implements CarFactory {
    @Override
    public Car manufacture(String carName) {
        MarutiCars cars = MarutiCars.valueOf(carName);

        Car car = null;
        switch (cars) {
            case BALENO: car = new Baleno();
            break;

            case SWIFT: car = new Swift();
            break;

            case ERTIGA: car = new Ertiga();
            break;
        }
        return car;
    }
}
