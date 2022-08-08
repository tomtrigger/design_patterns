package com.freedom.chapter_04.abstract_factory;

import com.freedom.chapter_04.abstract_factory.product.*;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();

}
