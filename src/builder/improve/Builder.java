package builder.improve;

public abstract class Builder {
    protected House house = new House();

    public abstract void buildBase();

    public abstract void buildWall();

    public abstract void buildRoof();

    public House build() {
        return house;
    }
}
