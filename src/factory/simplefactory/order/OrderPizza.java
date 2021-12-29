package factory.simplefactory.order;

import factory.simplefactory.pizza.CheesePizza;
import factory.simplefactory.pizza.GreekPizza;
import factory.simplefactory.pizza.Pizza;

import java.util.Scanner;

public class OrderPizza {
    Pizza pizza;

    public void setFactory() {
        String orderType;
        while (true) {
            orderType = new Scanner(System.in).next();
            pizza = SimpleFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.box();
            } else {
                break;
            }
        }
    }

    public OrderPizza() {
        setFactory();
    }
}
