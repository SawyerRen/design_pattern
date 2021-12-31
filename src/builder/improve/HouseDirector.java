package builder.improve;

public class HouseDirector {
    Builder builder = null;

    public HouseDirector(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public House buildHouse() {
        builder.buildBase();
        builder.buildWall();
        builder.buildRoof();
        return builder.build();
    }
}
