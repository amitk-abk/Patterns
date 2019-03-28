package com.mycomp.ex.visitor;

public class Seat implements Part {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
