package factory.factorymethod.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare for beijing cheese pizza");
    }
}
