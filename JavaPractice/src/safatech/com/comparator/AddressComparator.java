package safatech.com.comparator;

import java.util.Comparator;

public class AddressComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAddress().compareTo(o2.getAddress());
    }
}
