package factory.factorymethod.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare for beijing pepper pizza");
    }
}
