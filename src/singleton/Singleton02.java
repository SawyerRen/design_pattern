package singleton;

public class Singleton02 {
    private Singleton02() {

    }

    private volatile static Singleton02 instance;

    public static Singleton02 getInstance() {
        if (instance == null) {
            synchronized (Singleton02.class) {
                if (instance == null) {
                    instance = new Singleton02();
                }
            }
        }
        return instance;
    }
}
