package com.mycomp.ex.interpreter;

import java.util.stream.Stream;

public class TerminalExpression implements Expression {
    private String context;

    public TerminalExpression(String context) {
        this.context = context;
    }


    @Override
    public boolean interpret(String input) {
        return Stream.of(input.split(" "))
                .anyMatch(word -> word.equalsIgnoreCase(context));
    }
}
