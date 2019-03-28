package com.mycomp.ex.factory;

import java.util.List;

public class RestaurantWebSite extends Website {
    @Override
    public void addPages(List<Page> webPages) {
        webPages.add(new About());
        webPages.add(new BookRestaurant());
        webPages.add(new Contact());
        webPages.add(new Order());
    }
}
