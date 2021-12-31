package bridge;

public class UprightPhone extends Phone {
    public UprightPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("Upright phone open");
    }

    public void close() {
        super.close();
        System.out.println("Upright phone close");
    }

    public void call() {
        super.call();
        System.out.println("Upright phone call");
    }
}
