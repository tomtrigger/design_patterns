package com.freedom.chapter_03;

import com.freedom.chapter_03.concrete.DarkRoast;
import com.freedom.chapter_03.concrete.Espresso;
import com.freedom.chapter_03.concrete.HouseBlend;
import com.freedom.chapter_03.decorator.Mocha;
import com.freedom.chapter_03.decorator.Soy;
import com.freedom.chapter_03.decorator.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso(Beverage.GRANDE);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast(Beverage.VENTI);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend(Beverage.VENTI);
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }

}
