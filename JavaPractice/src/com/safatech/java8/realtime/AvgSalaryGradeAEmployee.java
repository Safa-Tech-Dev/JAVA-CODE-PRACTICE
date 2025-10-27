package JavaPractice.src.com.safatech.java8.realtime;


import JavaPractice.src.com.safatech.java8.dao.EmployeeDao;
import JavaPractice.src.com.safatech.java8.model.Employee;

import java.util.List;
//get the employee whose grade A
//get the avg salary
public class AvgSalaryGradeAEmployee {

    public static void getAvgSalaryGradeAEmployee(List<Employee> employees){

        double salary = employees.stream()
                .filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(emp -> emp.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();
        IO.println(salary);
    }

    static void main() {

        System.out.println(EmployeeDao.getEmployees());
        getAvgSalaryGradeAEmployee(EmployeeDao.getEmployees());
    }
}
