package com.mycomp.ex.chainofresp;

public class Tester {

    public static void main(String[] args) {
        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();

        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request1 = new Request(RequestType.CONFERENCE, 500);
        Request request2 = new Request(RequestType.PURCHASE, 1200);
        Request request3 = new Request(RequestType.PURCHASE, 5000);

        director.handleRequest(request1);
        director.handleRequest(request2);
        director.handleRequest(request3);

    }
}
