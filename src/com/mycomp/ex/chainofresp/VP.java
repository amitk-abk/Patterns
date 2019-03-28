package com.mycomp.ex.chainofresp;

public class VP extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() < 1500) {
                System.out.println("VP can approve expenses below 1500, so this request is approved by VP");
            } else {
                successor.handleRequest(request);
            }
        }
    }
}
