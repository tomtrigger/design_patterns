package com.freedom.chapter_04.factory_method.pizza;

    public class ChicagoStyleVeggiePizza extends Pizza{

        public ChicagoStyleVeggiePizza() {
            name = "Chicago Style Deep Dish Veggie Pizza";
            dough = "Extra Thick Crust Dough";
            sauce = "Plum Tomato Sauce";

            toppings.add("Shredded Mozzarella Veggie");
        }

        @Override
        public void cut() {
            System.out.println("Cutting the pizza into square slices");
        }

    }
