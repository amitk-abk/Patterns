package com.mycomp.ex.visitor;

public class TestVisitor {

    public static void main(String[] args) {
        PartsCalculator partsCalculator = new PartsCalculator();
        Part wheel = new Wheel();
        Part seat = new Seat();
        Part chassis = new Chassis();

        partsCalculator.addPart(wheel);
        partsCalculator.addPart(seat);
        partsCalculator.addPart(chassis);

        partsCalculator.accept(new CostCalculatorVisitor());
    }
}
