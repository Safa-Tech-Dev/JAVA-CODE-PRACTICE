package JavaPractice.src.com.safatech.java8.realtime;

import JavaPractice.src.com.safatech.comparator.Employee;
import JavaPractice.src.com.safatech.java8.dao.EmployeeRepositoryRealTime;

import java.util.List;

/**
 * Get the names of all employees who have joined after 2015
 */
public class EmployeeJoinedAfter2015 {

    public static void getNameJoiningDateGT2015(List<Employee> employees){

        employees.stream()
                .filter(employee -> employee.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        getNameJoiningDateGT2015(EmployeeRepositoryRealTime.getEmployee());
    }
}
