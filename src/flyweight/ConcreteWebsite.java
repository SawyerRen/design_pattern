package flyweight;

public class ConcreteWebsite extends Website {
    private String type;

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("website is " + type);
    }
}
