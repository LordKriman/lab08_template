package com.example;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFilter implements Filter {
    protected List<CarOffer> offers = new ArrayList<>();
    protected SearchSettings settings;

    @Override
    public void setCarOffers(List<CarOffer> offers) {
        this.offers = offers;
    }

    @Override
    public void setSearchSettings(SearchSettings settings) {
        this.settings = settings;
    }

    @Override
    public boolean canFilter() {
        return offers != null && settings != null;
    }
}