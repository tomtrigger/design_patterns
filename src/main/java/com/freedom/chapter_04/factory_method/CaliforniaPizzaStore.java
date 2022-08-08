package com.freedom.chapter_04.factory_method;

import com.freedom.chapter_04.factory_method.pizza.*;

public class CaliforniaPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CaliforniaStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            return new CaliforniaStyleVeggiePizza();
        } else if ("clam".equals(type)) {
            return new CaliforniaStyleClamPizza();
        } else if ("pepperoni".equals(type)) {
            return new CaliforniaStylePepperoniPizza();
        }
        return null;
    }

}
