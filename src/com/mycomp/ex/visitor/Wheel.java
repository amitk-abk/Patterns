package com.mycomp.ex.visitor;

public class Wheel implements Part {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
