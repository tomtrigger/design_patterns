package com.freedom.chapter_04.abstract_factory;

import com.freedom.chapter_04.abstract_factory.factory.ChicagoPizzaIngredientFactory;
import com.freedom.chapter_04.abstract_factory.product.*;

public class ChicagoPizzaStore extends  PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            return new CheesePizza(ingredientFactory);
        } else if ("veggie".equals(type)) {
            return new VeggiePizza(ingredientFactory);
        } else if ("clam".equals(type)) {
            return new ClamPizza(ingredientFactory);
        } else if ("pepperoni".equals(type)) {
            return new PepperoniPizza(ingredientFactory);
        }

        return pizza;
    }

}
