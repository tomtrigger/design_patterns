package com.freedom.chapter_04.factory_method.pizza;

public class CaliforniaStyleCheesePizza extends Pizza{

    public CaliforniaStyleCheesePizza() {
        name = "California Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }


}
