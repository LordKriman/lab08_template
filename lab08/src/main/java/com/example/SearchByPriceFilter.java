package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByPriceFilter extends AbstractFilter{
    @Override
    public List<CarOffer> filter() {
        return offers.stream()
                .filter(o -> settings.getPriceFrom() == null ||
                        o.getPrice() >= settings.getPriceFrom())
                .filter(o -> settings.getPriceTo() == null ||
                        o.getPrice() <= settings.getPriceTo())
                .collect(Collectors.toList());
    }
}
