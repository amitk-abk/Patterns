package com.mycomp.ex.observer;

public class NewsPaperSubscriber implements Observer {

    private String name;

    public NewsPaperSubscriber(final String name) {
        this.name = name;
    }

    @Override
    public void updateNewsPaper(String newsPaper) {
        System.out.println("Received news paper at " + name);
    }
}
