package factory.absfactory.order;

import factory.absfactory.pizza.Pizza;

import java.util.Calendar;
import java.util.Scanner;

public class OrderPizza {
    Factory factory;
    public void setFactory(Factory factory) {
        Pizza pizza = null;
        String type;
        this.factory = factory;
        while (true) {
            type = new Scanner(System.in).nextLine();
            pizza = factory.createPizza(type);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.box();
            } else {
                System.out.println("error");
                break;
            }
        }
    }
}
