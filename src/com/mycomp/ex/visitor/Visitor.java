package com.mycomp.ex.visitor;

public interface Visitor {

    void visit(Chassis chassis);

    void visit(Seat seat);

    void visit(Wheel wheel);

    void visit(PartsCalculator partsCalculator);
}
