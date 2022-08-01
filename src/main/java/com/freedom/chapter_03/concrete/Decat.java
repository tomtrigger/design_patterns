package com.freedom.chapter_03.concrete;

import com.freedom.chapter_03.Beverage;

public class Decat extends Beverage {

    public Decat(String size) {
        this.description = "Decat";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.05;
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
