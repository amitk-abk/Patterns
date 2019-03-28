package com.mycomp.ex.interpreter;

public class AndTerminalExpression implements Expression {

    private Expression expressionOne;
    private Expression expressionTwo;

    public AndTerminalExpression(Expression expressionOne, Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }

    @Override
    public boolean interpret(String context) {
        return this.expressionOne.interpret(context) &&
                this.expressionTwo.interpret(context);
    }
}
