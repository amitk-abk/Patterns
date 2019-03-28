package com.mycomp.ex.chainofresp;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can approve anything!! This request is approved by CEO!!");
    }
}
