package com.freedom.chapter_04.abstract_factory.product;

import com.freedom.chapter_04.abstract_factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza{

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());
        setClams(ingredientFactory.createClams());
    }
}
