package com.mycomp.ex.interpreter;

public class InterpreterDemo {

    public static void main(String[] args) {
        String lion = "Lion";
        String tiger = "Tiger";
        String fox = "fox";

        final String context = "in the jungle the tiger was lurking around, many animals like " +
                " leopard, elephant, monkey, rabbit were running around but lion was sleeping peacefully " +
                " next to cave of that tiger";

        Expression expressionLion = new TerminalExpression(lion);
        Expression expressionTiger = new TerminalExpression(tiger);

        boolean isLionThere = expressionLion.interpret(context);
        System.out.println("is Lion There? " + isLionThere);
        boolean isTigerThere = expressionTiger.interpret(context);
        System.out.println("is Tiger There? " + isTigerThere);



        Expression expressionLionOrTiger = new OrTerminalExpression(expressionLion, expressionTiger);
        boolean lionOrTiger = expressionLionOrTiger.interpret(context);
        System.out.println("Lion or tiger? " + lionOrTiger);

        Expression expressionLionAndTiger = new AndTerminalExpression(expressionLion, expressionTiger);
        boolean lionAndTiger = expressionLionAndTiger.interpret(context);
        System.out.println("Lion And tiger? " + lionAndTiger);

        Expression expressionFox = new TerminalExpression(fox);
        boolean isLionOrTigerAndFox = new AndTerminalExpression(expressionLionOrTiger, expressionFox).interpret(context);
        System.out.println("(Lion Or tiger) and fox ? " + isLionOrTigerAndFox);
    }
}
