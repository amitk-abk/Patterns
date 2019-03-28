package com.mycomp.ex.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    private List<Page> webPages = new ArrayList<>();

    public Website() {
        addPages(webPages);
    }

    public List<Page> getWebPages() {
        return webPages;
    }

    public abstract void addPages(List<Page> webPages);
}
