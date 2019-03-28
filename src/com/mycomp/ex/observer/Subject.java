package com.mycomp.ex.observer;

public interface Subject {
    void subscribeForPaper(Observer paperSubscriber1);

    void subscribeForMagazine(Observer magazineSubscriber);

    void notifyNewsPaper(String s);

    void notifyMagazine(String sports_weekly);

    void publishNewsPaper(String the_daily_prophet);

    void publishMagazine(String quidditch_weekly);
}
