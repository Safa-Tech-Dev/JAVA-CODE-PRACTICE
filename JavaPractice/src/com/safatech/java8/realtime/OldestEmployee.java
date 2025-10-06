package JavaPractice.src.com.safatech.java8.realtime;

import JavaPractice.src.com.safatech.comparator.Employee;
import JavaPractice.src.com.safatech.java8.dao.EmployeeRepositoryRealTime;

import java.util.Comparator;
import java.util.List;

/**
 *
 * Who is the oldest employee in the organization?
 * What is his age and which department he belongs to?
 */
public class OldestEmployee {

    public static void getOldestEmployee(List<Employee> employees){

        Employee employee = employees.stream()
                .max(Comparator.comparingInt(Employee::getAge))
                .get();

        System.out.println("Name : " + employee.getName());
        System.out.println("Age : " + employee.getAge());
        System.out.println("Department : " + employee.getDepartment());

    }

    public static void main(String[] args) {

        getOldestEmployee(EmployeeRepositoryRealTime.getEmployee());
    }
}
