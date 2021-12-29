package factory.simplefactory.order;

import factory.simplefactory.pizza.CheesePizza;
import factory.simplefactory.pizza.GreekPizza;
import factory.simplefactory.pizza.Pizza;

import java.util.Scanner;

public class SimpleFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
