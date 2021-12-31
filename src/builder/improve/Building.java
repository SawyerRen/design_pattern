package builder.improve;

public class Building extends Builder{
    @Override
    public void buildBase() {
        house.setBase("building base");
    }

    @Override
    public void buildWall() {
        house.setBase("building wall");

    }

    @Override
    public void buildRoof() {
        house.setBase("building roof");

    }
}
