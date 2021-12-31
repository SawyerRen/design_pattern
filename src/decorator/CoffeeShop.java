package decorator;

import decorator.coffee.Drink;
import decorator.coffee.LongBlack;
import decorator.decorator.Milk;

public class CoffeeShop {
    public static void main(String[] args) {
        Drink longBlack = new LongBlack();
        System.out.println(longBlack.getDesc());
        System.out.println("price: " + longBlack.cost());

        longBlack = new Milk(longBlack);
        System.out.println(longBlack.getDesc());
        System.out.println("price: " + longBlack.cost());

        longBlack = new Milk(longBlack);
        System.out.println(longBlack.getDesc());
        System.out.println("price: " + longBlack.cost());
    }
}
