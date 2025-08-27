package JavaPractice.src.com.safatech.java8.realtime;

import JavaPractice.src.com.safatech.comparator.Employee;
import JavaPractice.src.com.safatech.java8.dao.EmployeeRepositoryRealTime;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Find the average age of Male and Female Employees.
 */
public class AverageAgeOfMaleAndFemale {


    public static void findAverageAgeOfMaleAndFemale(List<Employee> employees){

        Map<String, Double> avgAge = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println(avgAge);
    }

    public static void main(String[] args) {

        findAverageAgeOfMaleAndFemale(EmployeeRepositoryRealTime.getEmployee());
    }
}
