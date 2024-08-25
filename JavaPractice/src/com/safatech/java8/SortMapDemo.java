package com.safatech.java8;

import com.safatech.java8.model.Employee;
import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("two", 2);
        map.put("four", 4);
        map.put("ten", 10);


       // List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        //System.out.println(entries);
        //Collections.sort(entries,new MapComparator()); // traditional approach
        //Collections.sort(entries, (o1,o2) -> o1.getKey().compareTo(o2.getKey())); // Lambda approach

       /* for(Map.Entry<String, Integer> entry : entries){

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }*/

       /* map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println); // stream api approach, comparing by key
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println); // stream api approach, comparing by value*/

        Map<Employee, Integer> employeeMap1 = new TreeMap<>(new EmployeeComparator());// traditional approach
        Map<Employee, Integer> employeeMap = new TreeMap<>((o1,o2) -> (int) (o2.getSalary() - o1.getSalary()));// lambda approach
        employeeMap.put(new Employee(176, "Roshan" , "IT", "A", 600000),60);
        employeeMap.put(new Employee(388, "Sputam" , "ECE", "B",1000000),90);
        employeeMap.put(new Employee(378, "Aquib" , "CSE", "A",500000),50);
        employeeMap.put(new Employee(889, "Shahbaz" , "Customer support", "A",400000),40);
        employeeMap.put(new Employee(569, "Asif" , "ECE","C",1200000),120);
        // System.out.println(employeeMap);

        employeeMap.entrySet().stream() // Stream API
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed()))
                .forEach(System.out::println);

    }
}

/*class MapComparator implements Comparator<Map.Entry<String, Integer>>{


    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o1.getKey().compareTo(o2.getKey());
    }
}*/

class EmployeeComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o2.getSalary() - o1.getSalary());
    }
}
