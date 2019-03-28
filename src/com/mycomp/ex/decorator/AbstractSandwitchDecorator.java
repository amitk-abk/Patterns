package com.mycomp.ex.decorator;

public abstract class AbstractSandwitchDecorator implements Sandwitch {

    private Sandwitch sandwitch;

    public AbstractSandwitchDecorator(Sandwitch sandwitch) {
        this.sandwitch = sandwitch;
    }
}
