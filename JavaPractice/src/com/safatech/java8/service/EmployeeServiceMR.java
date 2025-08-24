package JavaPractice.src.com.safatech.java8.service;

import JavaPractice.src.com.safatech.java8.model.Employee;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeServiceMR {

    public List<Employee> loadEmployeeFromDB(){

        return IntStream.rangeClosed(1,10)
                .mapToObj(i -> new Employee(i, "employee" + i, new Random().nextInt(50000)))
                .collect(Collectors.toList());
    }
}
