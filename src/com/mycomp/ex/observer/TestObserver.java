package com.mycomp.ex.observer;

public class TestObserver {

    public static void main(String[] args) {
        Subject newsStall = new NewsAgency();

        Observer paperSubscriber1 = new NewsPaperSubscriber("News paper subscriber 1");
        Observer paperSubscriber2 = new NewsPaperSubscriber("News paper subscriber 1");

        Observer magazineSubscriber1 = new MagazineSubscriber("Magazine subscriber 1");
        Observer magazineSubscriber2 = new MagazineSubscriber("Magazine subscriber 2");

        newsStall.subscribeForPaper(paperSubscriber1);
        newsStall.subscribeForPaper(paperSubscriber2);

        newsStall.subscribeForMagazine(magazineSubscriber1);
        newsStall.subscribeForMagazine(magazineSubscriber2);

        newsStall.publishNewsPaper("The Daily Prophet");
        newsStall.publishMagazine("Quidditch weekly");
    }
}
