package com.mycomp.ex.decorator;

public class MakeSandwitch {

    public static void main(String[] args) {
        Sandwitch simpleDecoratedSandwitch = new ToppingsDecorator(new VegetableSandwitchDecorator(new SimpleSandwitch()));
        System.out.println(simpleDecoratedSandwitch.make());
    }
}
