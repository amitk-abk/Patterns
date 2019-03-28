package com.mycomp.ex.visitor;

// Part aka Element accepts visitor and call visitor's accept method passing self to it.
public interface Part {
    void accept(Visitor visitor);
}
