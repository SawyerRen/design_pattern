package builder;

public class House extends AbstractHouse {
    @Override
    public void buildBase() {
        System.out.println("common house base");
    }

    @Override
    public void buildWall() {
        System.out.println("common house wall");
    }

    @Override
    public void buildRoof() {
        System.out.println("common house roof");
    }
}
