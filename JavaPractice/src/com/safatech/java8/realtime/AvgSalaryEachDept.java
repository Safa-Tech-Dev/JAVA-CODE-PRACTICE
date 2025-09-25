package JavaPractice.src.com.safatech.java8.realtime;

import JavaPractice.src.com.safatech.comparator.Employee;
import JavaPractice.src.com.safatech.java8.dao.EmployeeRepositoryRealTime;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * What is the average salary of each department?
 *
 */
public class AvgSalaryEachDept {

    public static void getAvgSalaryEachDept(List<Employee> employees){

        Map<String, Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        for(Map.Entry<String, Double> entry : avgSalary.entrySet()){

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static void main(String[] args) {

        getAvgSalaryEachDept(EmployeeRepositoryRealTime.getEmployee());
    }
}
