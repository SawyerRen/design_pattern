package adapter.classadapter;

public class Phone {
    public void charge(Voltage5V voltage5V) {
        if (voltage5V.output5V() == 5) {
            System.out.println("charging now");
        } else {
            System.out.println("wrong voltage");
        }
    }
}
