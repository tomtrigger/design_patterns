package com.freedom.chapter_03.concrete;

import com.freedom.chapter_03.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(String size) {
        this.description = "Dark Roase Coffee";
        this.size = size;
    }

    @Override
    public double cost() {
        return 0.99;
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
