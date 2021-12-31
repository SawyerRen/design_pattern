package composite;

import java.util.ArrayList;
import java.util.List;

public class College extends Organization {

    List<Organization> organizations = new ArrayList<>();

    public College(String name, String desc) {
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
        System.out.println("College: " + getName());
        for (Organization organization : organizations) {
            organization.print();
        }    }
}
