package com.mycomp.ex.factory;

public class WebsiteTester {
    public static void main(String[] args) {
        Website website = WebsiteFactory.createWebsiteFor("shop");
        website.getWebPages().forEach(System.out::println);

        System.out.println("===================================");
        website = WebsiteFactory.createWebsiteFor("food");
        website.getWebPages().forEach(System.out::println);
    }
}
