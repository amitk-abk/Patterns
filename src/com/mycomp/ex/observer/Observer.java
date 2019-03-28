package com.mycomp.ex.observer;

public interface Observer {
    default void updateNewsPaper(String newsPaper) {
        System.out.println("Default subscriber");
    }

    default void updateMagzine(String magazine) {
        System.out.println("Default subscriber");
    }
}
