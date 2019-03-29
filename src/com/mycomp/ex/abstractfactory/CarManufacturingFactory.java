package com.mycomp.ex.abstractfactory;

public class CarManufacturingFactory {

    public static Car manufactureCar(String carName) {
        String carManufacturer = getManufacturer(carName);

        CarFactory carFactory;
        switch (carManufacturer) {
            case "maruti" : carFactory = new MarutiCarFactory();
                break;

            case "tata" : carFactory = new TataCarFactory();
                break;

            default: carFactory = null;
        }
        return carFactory.manufacture(carName.toUpperCase());
    }

    private static String getManufacturer(String carName) {
        MarutiCars[] marutiCars = MarutiCars.values();
        for (MarutiCars car : marutiCars) {
            if (car.getCarName().equalsIgnoreCase(carName))
                return "maruti";
        }

        TataCars[] tataCars = TataCars.values();
        for (TataCars car : tataCars) {
            if (car.getCarName().equalsIgnoreCase(carName))
                return "tata";
        }

        return "";
    }
}
