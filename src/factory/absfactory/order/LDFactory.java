package factory.absfactory.order;

import factory.absfactory.pizza.*;

public class LDFactory implements Factory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (type.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
