package composite;

import java.util.ArrayList;
import java.util.List;

public class University extends Organization {

    List<Organization> organizations = new ArrayList<>();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(Organization organization) {
        organizations.add(organization);
    }

    @Override
    protected void remove(Organization organization) {
        organization.remove(organization);
    }

    @Override
    protected void print() {
        System.out.println("University: " + getName());
        for (Organization organization : organizations) {
            organization.print();
        }
    }
}
