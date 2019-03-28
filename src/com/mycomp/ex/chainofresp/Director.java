package com.mycomp.ex.chainofresp;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Director can approve conferences! This request is approved by Director");
        } else {
            successor.handleRequest(request);
        }
    }
}
