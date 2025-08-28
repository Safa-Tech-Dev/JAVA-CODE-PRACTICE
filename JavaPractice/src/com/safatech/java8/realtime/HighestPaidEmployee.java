package JavaPractice.src.com.safatech.java8.realtime;

import JavaPractice.src.com.safatech.comparator.Employee;
import JavaPractice.src.com.safatech.java8.dao.EmployeeRepositoryRealTime;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HighestPaidEmployee {

    public static void getDetailsOfHighestPaidEmployee(List<Employee> employees){

        Employee employee = employees.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))
                .get();
        System.out.println(employee);
    }
    public static void main(String[] args) {

        getDetailsOfHighestPaidEmployee(EmployeeRepositoryRealTime.getEmployee());
    }
}
