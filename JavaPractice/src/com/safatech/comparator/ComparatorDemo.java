package JavaPractice.src.com.safatech.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Employee emp1 = new Employee(1001, "Aarav Mehta", 29, "Male", "Software Engineering", 2020, 875000.50,
                new Address("Green Field Apartments, Koramangala", 560034));

        Employee emp2 = new Employee(1002, "Sneha Roy", 32, "Female", "Human Resources", 2018, 690000.00,
                new Address("Lakeview Residency, Salt Lake", 700091));

        Employee emp3 = new Employee(1003, "Ravi Narayan", 41, "Male", "Finance", 2015, 980000.75,
                new Address("Sunshine Heights, Banjara Hills", 500034));

        Employee emp4 = new Employee(1004, "Meera Iyer", 26, "Female", "Marketing", 2022, 610000.00,
                new Address("Blossom Park, HSR Layout", 560102));

        Employee emp5 = new Employee(1005, "Zaid Khan", 35, "Male", "Product Management", 2016, 1120000.25,
                new Address("Olive Grove, Andheri West", 400053));

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);

        //1.Sort based on Age
        Collections.sort(employeeList,new AgeComparator());
        System.out.println("Sorted based on Ages " + employeeList);

        System.out.println("***********************************************************************************");

        //2.Sort based on Name
        Collections.sort(employeeList,new NameComparator());
        System.out.println("Sorted based on Names " + employeeList);

        System.out.println("***********************************************************************************");

        //3.Sort based on Address
        Collections.sort(employeeList,new AddressComparator());
        System.out.println("Sorted based on Address " + employeeList);

        // Sort,  if name is same then sort based on age
        Collections.sort(employeeList, new NameAndAgeComparator());
        System.out.println("Sort,  if name is same then sort based on age " + employeeList);

    }
}
