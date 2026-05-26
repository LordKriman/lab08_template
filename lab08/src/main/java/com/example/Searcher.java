package com.example;

import java.util.ArrayList;
import java.util.List;

public class Searcher {

    private final List<Filter> filters = new ArrayList<>();

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public List<CarOffer> filter(List<CarOffer> offers, SearchSettings settings) {
        List<CarOffer> result = offers;

        for (Filter filter : filters) {
            filter.setCarOffers(result);
            filter.setSearchSettings(settings);

            if (filter.canFilter()) {
                result = filter.filter();
            }
        }
        return result;
    }
}