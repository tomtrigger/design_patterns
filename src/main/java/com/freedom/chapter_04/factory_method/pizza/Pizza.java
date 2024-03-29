package com.freedom.chapter_04.factory_method.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;

    protected String dough;

    protected String sauce;

    List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding topping: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));
        }
    };

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    };

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    };

    public void box() {
        System.out.println("Place pizza in offical PizzaStore box");
    };

    public String getName() {
        return name;
    }
}
