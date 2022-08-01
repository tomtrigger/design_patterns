package com.freedom.chapter_03.concrete;

import com.freedom.chapter_03.Beverage;

public class Espresso extends Beverage {

    public Espresso(String size) {
        this.description = "Espresso";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99;
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
