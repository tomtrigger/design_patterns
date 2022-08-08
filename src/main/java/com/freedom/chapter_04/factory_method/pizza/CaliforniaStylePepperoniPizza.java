package com.freedom.chapter_04.factory_method.pizza;

public class CaliforniaStylePepperoniPizza extends Pizza{

    public CaliforniaStylePepperoniPizza() {
        name = "California Style Deep Dish Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Pepperoni");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
