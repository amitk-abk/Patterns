package com.mycomp.ex.decorator;

public class ToppingsDecorator extends AbstractSandwitchDecorator {

    private Sandwitch sandwitch;

    public ToppingsDecorator(Sandwitch sandwitch) {
        super(sandwitch);
        this.sandwitch = sandwitch;
    }

    @Override
    public String make() {
        return sandwitch.make() + ", topped with spicy, delicious sauces.";
    }
}
