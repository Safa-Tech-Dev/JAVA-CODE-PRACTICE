package com.safatech.java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalary {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Anil", 1000);
        map1.put("Bhavna", 1300);
        map1.put("Macael", 1500);
        map1.put("Tom", 1600);
        map1.put("Ankit", 1200);
        map1.put("Daniel", 1700);
        map1.put("James", 1400);

        System.out.println(nthHighestSalary(2,map1));

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Anil", 1000);
        map2.put("Bhavna", 1200);
        map2.put("Macael", 1200);
        map2.put("Tom", 1200);
        map2.put("Ankit", 1000);
        map2.put("Daniel", 1300);
        map2.put("James", 1300);

        System.out.println(nthHighestSalaryCorrect(2,map2));


    }

    // this will give wrong output if there is duplicate value
    public static Map.Entry<String, Integer>  nthHighestSalary(int num, Map<String, Integer> map){

        return  map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(num - 1);
    }

    // so the correct solution is
    public static Map.Entry<Integer, List<String>>  nthHighestSalaryCorrect(int num, Map<String, Integer> map){

        return map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, // group all duplicate salary as single
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList()))) // get the name as list
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey())) //sort as descending order
                .collect(Collectors.toList())
                .get(num - 1); // get 2nd/3rd ... highest salary
    }
}
