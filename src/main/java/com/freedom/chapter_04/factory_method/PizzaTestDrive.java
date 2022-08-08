package com.freedom.chapter_04.factory_method;

import com.freedom.chapter_04.factory_method.pizza.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza cheese = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + cheese.getName() + "\n");

        Pizza pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }

}
