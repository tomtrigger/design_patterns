package com.freedom.chapter_04.simple_factory;

import com.freedom.chapter_04.simple_factory.pizza.Pizza;

public class PizzaStore {

    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        // 这里没有用 new 关键字实例化对象
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();
        return pizza;
    }

}
