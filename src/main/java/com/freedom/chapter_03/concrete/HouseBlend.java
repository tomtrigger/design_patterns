package com.freedom.chapter_03.concrete;

import com.freedom.chapter_03.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(String size) {
        this.description = "House Blend Coffee";
        this.size = size;
    }

    @Override
    public double cost() {
        return .89;
    }

    @Override
    public String getSize() {
        return this.size;
    }

    @Override
    public String setSzie(String size) {
        return this.size = size;
    }
}
