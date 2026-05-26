package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByDateFilter extends AbstractFilter{
    @Override
    public List<CarOffer> filter() {
        return offers.stream()
                .filter(o -> settings.getDateFrom() == null || o.getDate().isAfter(settings.getDateFrom()))
                .filter(o -> settings.getDateTo() == null || o.getDate().isBefore(settings.getDateFrom()))
                .collect(Collectors.toList());
    }
}
