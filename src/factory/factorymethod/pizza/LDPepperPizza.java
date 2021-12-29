package factory.factorymethod.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare for london pepper pizza");
    }
}
