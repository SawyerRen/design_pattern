package factory.factorymethod.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare for london cheese pizza");
    }
}
