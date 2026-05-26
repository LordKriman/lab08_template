package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByWordFilter extends AbstractFilter{
    @Override
    public List<CarOffer> filter() {
        return offers.stream()
                .filter(o -> settings.getWord() == null ||
                        o.getTitle().toLowerCase().contains(settings.getWord().toLowerCase()))
                .collect(Collectors.toList());
    }
}
