package com.mycomp.ex.visitor;

import java.util.ArrayList;
import java.util.List;

// The integrator piece, that aggregates visits across parts i.e. elements and initiates final compute in it's visitor
public class PartsCalculator implements Part{

    List<Part> parts = new ArrayList<>();

    public void addPart(Part part) {
        parts.add(part);
    }

    @Override
    public void accept(Visitor visitor) {
        for (Part part: parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
