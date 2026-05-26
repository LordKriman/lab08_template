package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByYearFilter extends AbstractFilter {
    @Override
    public List<CarOffer> filter() {
        return offers.stream()
                .filter(o -> settings.getYearFrom() == null ||
                        o.getYear() >= settings.getYearFrom())
                .filter(o -> settings.getYearTo() == null ||
                        o.getYear() <= settings.getYearTo())
                .collect(Collectors.toList());
    }
}
