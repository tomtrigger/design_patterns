package com.freedom.chapter_03.decorator;

import com.freedom.chapter_03.Beverage;

public class Soy extends CondimentDecorator{

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (Beverage.TALL.equals(getSize())) {
            cost = .1 + cost;
        } else if (Beverage.GRANDE.equals(getSize())) {
            cost = .15 + cost;
        } else if (Beverage.VENTI.equals(getSize())) {
            cost = .2 + cost;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }
}
