package com.mycomp.ex.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {

    private List<Observer> paperSubscribers = new ArrayList<>();
    private List<Observer> magazineSubscribers = new ArrayList<>();

    @Override
    public void subscribeForPaper(Observer newsPaperSubscriber) {
        this.paperSubscribers.add(newsPaperSubscriber);
    }

    @Override
    public void subscribeForMagazine(Observer magazineSubscriber) {
        this.magazineSubscribers.add(magazineSubscriber);

    }

    @Override
    public void notifyNewsPaper(String newsPaper) {
        for (Observer paperSubscriber : paperSubscribers) {
            paperSubscriber.updateNewsPaper(newsPaper);
        }
    }

    @Override
    public void notifyMagazine(String magazine) {
        for (Observer magazineSubscriber : magazineSubscribers) {
            magazineSubscriber.updateMagzine(magazine);
        }
    }

    @Override
    public void publishNewsPaper(String newsPaper) {
        System.out.println("Publishing......" + newsPaper);
        notifyNewsPaper(newsPaper);
    }

    @Override
    public void publishMagazine(String magazine) {
        System.out.println("Publishing......" + magazine);
        notifyMagazine(magazine);
    }
}
