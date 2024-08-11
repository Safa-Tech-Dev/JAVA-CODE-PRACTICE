package com.safatech.java8;

import com.safatech.java8.dao.EmployeeDao;
import com.safatech.java8.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

    public static void main(String[] args) {
      /*  List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);

        Collections.sort(list); // default ascending order
        Collections.reverse(list); // to make it descending order reverse the list
        System.out.println("Collections sort method...");
        System.out.println(list);

        System.out.println("Stream API sort with default ascending order...");
        list.stream().sorted().forEach(System.out::println); // default ascending order
        System.out.println("Stream API sort descending order...");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //to make it in descending order use comaprator*/

         List<Employee> employeeList = EmployeeDao.getEmployees();

        // Collections.sort(employeeList, new EmployeeComparator());
     /*   Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return (int) (e2.getSalary() - e1.getSalary()); // ascending order
            }
        });*/
       /* Collections.sort(employeeList,  (e1, e2) -> (int)(e1.getSalary() - e2.getSalary()));
        System.out.println(employeeList);*/

        //Using steam and lambda
       // employeeList.stream().sorted((e1, e2) -> (int)(e2.getSalary() - e1.getSalary())).forEach(System.out::println);
//        employeeList.stream().sorted(Comparator.comparing(empl -> empl.getSalary())).forEach(System.out::println);
        employeeList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
    }
}
/*
class EmployeeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return (int) (e1.getSalary() - e2.getSalary()); // ascending order
    }
}
*/
