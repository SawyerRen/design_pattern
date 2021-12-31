package adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int output5V() {
        int src = output220V();
        int dst = src / 44;
        System.out.println("Adapter voltage: " + dst + " V");
        return dst;
    }
}
