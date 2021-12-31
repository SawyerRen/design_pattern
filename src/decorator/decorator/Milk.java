package decorator.decorator;

import decorator.coffee.Drink;

public class Milk extends Decorator{
    public Milk(Drink obj) {
        super(obj);
        setDesc("Milk");
        setPrice(2.0f);
    }
}
