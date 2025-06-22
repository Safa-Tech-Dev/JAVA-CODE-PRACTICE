package JavaPractice.src.com.safatech.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {

        List<Address> addressList = new ArrayList<>();

        Address addr1 = new Address("Pearl Residency, Jubilee Hills", 500033);
        Address addr2 = new Address("Gardenia Enclave, Whitefield", 560066);
        Address addr3 = new Address("Rosewood Villas, Bandra East", 400051);
        Address addr4 = new Address("Sunset Residency, Aundh", 411007);
        Address addr5 = new Address("Ocean View Apartments, Besant Nagar", 600090);

        addressList.add(addr1);
        addressList.add(addr2);
        addressList.add(addr3);
        addressList.add(addr4);
        addressList.add(addr5);
        Collections.sort(addressList);
        System.out.println("Sort based on address: " + addressList);
    }
}
