package com.freedom.chapter_04.abstract_factory.factory;

import com.freedom.chapter_04.abstract_factory.PizzaIngredientFactory;
import com.freedom.chapter_04.abstract_factory.product.*;
import com.freedom.chapter_04.abstract_factory.product.ny.*;
import com.freedom.chapter_04.abstract_factory.product.veggies.Garlic;
import com.freedom.chapter_04.abstract_factory.product.veggies.Mushroom;
import com.freedom.chapter_04.abstract_factory.product.veggies.Onion;
import com.freedom.chapter_04.abstract_factory.product.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = new Veggies[]{new Garlic(), new Mushroom(), new Onion(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicePepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
