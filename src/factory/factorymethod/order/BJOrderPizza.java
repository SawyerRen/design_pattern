package factory.factorymethod.order;

import factory.factorymethod.pizza.BJCheesePizza;
import factory.factorymethod.pizza.BJPepperPizza;
import factory.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (type.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
