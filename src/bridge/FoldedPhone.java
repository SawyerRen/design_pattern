package bridge;

public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("folded phone open");
    }

    public void close() {
        super.close();
        System.out.println("folded phone close");
    }

    public void call() {
        super.call();
        System.out.println("folded phone call");
    }
}
