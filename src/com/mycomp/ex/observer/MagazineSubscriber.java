package com.mycomp.ex.observer;

public class MagazineSubscriber implements Observer {

    private String name;

    public MagazineSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void updateMagzine(String magazine) {
        System.out.println("Received magazine at: " + name);
    }
}
