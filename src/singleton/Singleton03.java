package singleton;

public class Singleton03 {
    private Singleton03() {
    }

    private static class SingletonInstance {
        private static final Singleton03 INSTANCE = new Singleton03();
    }

    public static Singleton03 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
