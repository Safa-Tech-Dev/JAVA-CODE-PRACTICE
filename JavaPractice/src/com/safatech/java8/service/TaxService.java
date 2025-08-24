package JavaPractice.src.com.safatech.java8.service;

import JavaPractice.src.com.safatech.java8.dao.EmployeeDao;
import JavaPractice.src.com.safatech.java8.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> getTaxUsers(String input){
        return
                (input.equalsIgnoreCase("tax"))
                        ? EmployeeDao.getEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
                        : EmployeeDao.getEmployees().stream().filter(emp -> emp.getSalary() <= 500000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(getTaxUsers("non tax"));
    }
}
