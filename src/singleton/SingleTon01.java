package singleton;

public class SingleTon01 {
    private SingleTon01() {
    }

    private final static SingleTon01 instance = new SingleTon01();

    public static SingleTon01 getInstance() {
        return instance;
    }
}
