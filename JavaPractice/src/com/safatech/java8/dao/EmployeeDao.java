package com.safatech.java8.dao;

import com.safatech.java8.model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

   public static List<Employee> getEmployees(){
       List<Employee> employeeList = new ArrayList<>();
       employeeList.add(new Employee(176, "Roshan" , "IT", 600000));
       employeeList.add(new Employee(388, "Saddam" , "ECE", 1000000));
       employeeList.add(new Employee(378, "Aquib" , "CSE", 500000));
       employeeList.add(new Employee(889, "Shahbaz" , "Customer support", 400000));
       employeeList.add(new Employee(569, "Asif" , "ECE", 1200000));
       return employeeList;
   }
}
