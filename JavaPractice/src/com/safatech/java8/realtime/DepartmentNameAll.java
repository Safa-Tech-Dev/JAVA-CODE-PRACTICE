package JavaPractice.src.com.safatech.java8.realtime;

import JavaPractice.src.com.safatech.comparator.Employee;
import JavaPractice.src.com.safatech.java8.dao.EmployeeRepositoryRealTime;

import java.util.List;

/**
 * Print the name of all departments in the organization
 */

public class DepartmentNameAll {

    public static void getDepartmentName(List<Employee> employees){

        employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(e -> System.out.println(e));
    }
    public static void main(String[] args) {

        getDepartmentName(EmployeeRepositoryRealTime.getEmployee());
    }

}
