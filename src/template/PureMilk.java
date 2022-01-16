package template;

public class PureMilk extends Milk{
    @Override
    void addCondiments() {

    }

    @Override
    boolean wantCondiments() {
        return false;
    }
}
