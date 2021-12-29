package factory.factorymethod.order;

import factory.factorymethod.pizza.Pizza;

import java.util.Scanner;

public abstract class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        while (true) {
            String type = new Scanner(System.in).nextLine();
            pizza = createPizza(type);
            pizza.prepare();
            pizza.bake();
            pizza.box();

        }
    }

    abstract Pizza createPizza(String type);
}
