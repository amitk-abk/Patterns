package com.mycomp.ex.decorator;

public class VegetableSandwitchDecorator extends AbstractSandwitchDecorator {

    private Sandwitch sandwitch;

    public VegetableSandwitchDecorator(Sandwitch sandwitch) {
        super(sandwitch);
        this.sandwitch = sandwitch;
    }

    @Override
    public String make() {
        return sandwitch.make() + ", added fresh veggies into it";
    }
}
