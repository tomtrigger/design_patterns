package com.freedom.chapter_04.abstract_factory;

public class PizzaStoreTestDriver {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
    }

}
