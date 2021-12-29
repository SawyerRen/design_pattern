package factory.absfactory.order;

import factory.absfactory.pizza.Pizza;

public interface Factory {
    Pizza createPizza(String type);
}
