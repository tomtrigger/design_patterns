package com.freedom.chapter_03.decorator;

import com.freedom.chapter_03.Beverage;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

    @Override
    public abstract String getSize();

    @Override
    public String setSzie(String size){
        return null;
    }
}
