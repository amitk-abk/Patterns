package com.mycomp.ex.visitor;

public class Chassis implements Part {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
