package com.mycomp.ex.factory;

public class WebsiteFactory {

    //Factory design pattern: Defines an interface for creating an object
    //but lets subclasses decide which class to instantiate.
    //Factory method lets a class defer instantiation to subclasses.

    public static Website createWebsiteFor(String type) {
        switch (type) {
            case "shop" : return new ShopWebSite();

            case "food" : return new RestaurantWebSite();

            default : return null;
        }
    }
}
