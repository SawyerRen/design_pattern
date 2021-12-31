package builder.improve;

public class CommonHouse extends Builder {
    @Override
    public void buildBase() {
        house.setBase("common base");
    }

    @Override
    public void buildWall() {
        house.setWall("common wall");
    }

    @Override
    public void buildRoof() {
        house.setRoof("common roof");
    }
}
