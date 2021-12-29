package factory.simplefactory.pizza;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare for Greek pizza");
    }
}
