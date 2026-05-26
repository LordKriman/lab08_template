package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByMillageFilter extends AbstractFilter{
    @Override
    public List<CarOffer> filter() {
        return offers.stream()
                .filter(o -> settings.getMileageFrom() == null ||
                        o.getMilleage() >= settings.getMileageFrom())
                .filter(o -> settings.getMileageTo() == null ||
                        o.getMilleage() <= settings.getMileageTo())
                .collect(Collectors.toList());
    }
}
