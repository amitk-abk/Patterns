package com.mycomp.ex.factory;

import java.util.List;

public class ShopWebSite extends Website {
    @Override
    public void addPages(List<Page> webPages) {
        webPages.add(new About());
        webPages.add(new Contact());
        webPages.add(new Order());
        webPages.add(new Shop());
    }
}
