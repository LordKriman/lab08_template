package com.example;

import java.time.LocalDate;

public class SearchSettings {
    private Integer yearFrom;
    private Integer yearTo;

    private Integer mileageFrom;
    private Integer mileageTo;

    private Double priceFrom;
    private Double priceTo;

    private String word;

    private LocalDate dateFrom;
    private LocalDate dateTo;

    public Integer getYearFrom() {
        return yearFrom;
    }
    public void setYearFrom(Integer yearFrom) {
        this.yearFrom = yearFrom;
    }

    public Integer getYearTo() {
        return yearTo;
    }
    public void setYearTo(Integer yearTo) {
        this.yearTo = yearTo;
    }


    public Integer getMileageFrom() {
        return mileageFrom;
    }
    public void setMileageFrom(Integer mileageFrom) {
        this.mileageFrom = mileageFrom;
    }

    public Integer getMileageTo() {
        return mileageTo;
    }
    public void setMileageTo(Integer mileageTo) {
        this.mileageTo = mileageTo;
    }


    public Double getPriceFrom() {
        return priceFrom;
    }
    public void setPriceFrom(Double priceFrom) {
        this.priceFrom = priceFrom;
    }

    public Double getPriceTo() {
        return priceTo;
    }
    public void setPriceTo(Double priceTo) {
        this.priceTo = priceTo;
    }

    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }


    public LocalDate getDateFrom() {
        return dateFrom;
    }
    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }
    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }
}

