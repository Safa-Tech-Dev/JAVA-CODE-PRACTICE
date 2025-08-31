package JavaPractice.src.com.safatech.java8.realtime;

import JavaPractice.src.com.safatech.comparator.Employee;
import JavaPractice.src.com.safatech.java8.CollectorsGroupingBy;
import JavaPractice.src.com.safatech.java8.dao.EmployeeRepositoryRealTime;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Count the number of employees in each department
 */
public class NumberOfEmpInEachDept {

        public static void getNumberOfEmpInEachDept(List<Employee> employees){

            Map<String, Long> collectedDept = employees.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

            System.out.println(collectedDept);
        }

    public static void main(String[] args) {

            getNumberOfEmpInEachDept(EmployeeRepositoryRealTime.getEmployee());
    }

}
