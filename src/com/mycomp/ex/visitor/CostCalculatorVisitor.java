package com.mycomp.ex.visitor;

public class CostCalculatorVisitor implements Visitor {

    private double totalPrice = 0;

    @Override
    public void visit(Chassis chassis) {
        totalPrice += 15;
    }

    @Override
    public void visit(Seat seat) {
        totalPrice += 8;
    }

    @Override
    public void visit(Wheel wheel) {
        totalPrice += 12;
    }

    @Override
    public void visit(PartsCalculator partsCalculator) {
        System.out.println("Total cost is:" + totalPrice);
    }
}
