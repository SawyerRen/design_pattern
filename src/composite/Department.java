package composite;

import java.util.ArrayList;
import java.util.List;

public class Department extends Organization {

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println("Department: " + getName());
    }
}
