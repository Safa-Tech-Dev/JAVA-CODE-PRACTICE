package JavaPractice.src.com.safatech.java8.realtime;

import JavaPractice.src.com.safatech.comparator.Employee;
import JavaPractice.src.com.safatech.java8.dao.EmployeeRepositoryRealTime;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Find out the count of male and female employees present in the organization
*/
public class CountMaleAndFemaleEmployee {


    public static void getCountOfMaleFemale(List<Employee> employeeList){

        Map<String, Long> maleFemaleCount = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(maleFemaleCount);
    }

    public static void main(String[] args) {

        List<Employee> employees = EmployeeRepositoryRealTime.getEmployee();
        getCountOfMaleFemale(employees);
    }
}
