package com.freedom.chapter_04.factory_method.pizza;

public class NYStyleVeggiePizza extends Pizza{

    public NYStyleVeggiePizza() {
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Veggie");
    }

}
