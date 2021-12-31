package composite;

import java.util.Arrays;
import java.util.Comparator;

public class Client {
    public static void main(String[] args) {
        Organization university = new University("uiuc", "uiuc");

        Organization college1 = new College("ECE", "ECE");
        Organization college2 = new College("CS", "CS");

        college1.add(new Department("software", "sde"));
        college1.add(new Department("algorithm", "sde"));
        college2.add(new Department("CE", "CE"));
        college2.add(new Department("EE", "EE"));

        university.add(college1);
        university.add(college2);
        university.print();
        Integer[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        Arrays.sort(arr, Comparator.reverseOrder());
    }
}
