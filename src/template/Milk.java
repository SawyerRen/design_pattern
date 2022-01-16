package template;

public abstract class Milk {
    final void make() {
        select();
        if (wantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    void select() {
        System.out.println("1. select good soy bean");
    }

    abstract void addCondiments();

    void soak() {
        System.out.println("3. soak for 3 hours");
    }

    void beat() {
        System.out.println("4. beat all");
    }

    // hook method
    boolean wantCondiments() {
        return true;
    }
}
