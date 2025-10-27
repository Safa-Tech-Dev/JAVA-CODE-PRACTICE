package JavaPractice.src.com.safatech.java8.dao;

import JavaPractice.src.com.safatech.java8.model.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDao {

   public static List<Employee> getEmployees(){
       List<Employee> employeeList = new ArrayList<>();
        /*  employeeList.add(new Employee(176, "Roshan" , "IT", "A", 600000));
       employeeList.add(new Employee(388, "Saddam" , "ECE", "B", 1000000));
       employeeList.add(new Employee(378, "Aquib" , "CSE", "A",500000));
       employeeList.add(new Employee(889, "Shahbaz" , "Customer support", "A",400000));
       employeeList.add(new Employee(569, "Asif" , "ECE", "C",1200000));
       return employeeList;*/
       for(int i = 1 ; i < 1000; i++){
           employeeList.add(new Employee(i , "emp"+i,"xxx"+i, "A", Long.valueOf(new Random().nextInt(1000 * 100))));
       }
       return employeeList;
   }
}
