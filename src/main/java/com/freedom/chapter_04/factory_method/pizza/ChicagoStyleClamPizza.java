package com.freedom.chapter_04.factory_method.pizza;

public class ChicagoStyleClamPizza extends Pizza{

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Deep Dish Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Clam");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
