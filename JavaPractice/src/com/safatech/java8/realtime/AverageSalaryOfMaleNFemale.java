package JavaPractice.src.com.safatech.java8.realtime;

import JavaPractice.src.com.safatech.comparator.Employee;
import JavaPractice.src.com.safatech.java8.dao.EmployeeRepositoryRealTime;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Average salary of male and female employees
 */
public class AverageSalaryOfMaleNFemale {

    public static void getAvgSalaryOfMaleNFemale(List<Employee> employees){

        Map<String, Double> avgSalaryOfMaleNFemale = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryOfMaleNFemale);
    }
    public static void main(String[] args) {

        getAvgSalaryOfMaleNFemale(EmployeeRepositoryRealTime.getEmployee());

    }
}
