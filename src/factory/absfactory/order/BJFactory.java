package factory.absfactory.order;

import factory.absfactory.pizza.BJCheesePizza;
import factory.absfactory.pizza.BJPepperPizza;
import factory.absfactory.pizza.Pizza;

public class BJFactory implements Factory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (type.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
