package com.freedom.chapter_03.decorator;

import com.freedom.chapter_03.Beverage;

public class Mocha extends CondimentDecorator{

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (Beverage.TALL.equals(beverage.getSize())) {
            cost = .1 + cost;
        } else if (Beverage.GRANDE.equals(beverage.getSize())) {
            cost = .15 + cost;
        } else if (Beverage.VENTI.equals(beverage.getSize())) {
            cost = .2 + cost;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

}
