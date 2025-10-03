package JavaPractice.src.com.safatech.java8.realtime;

import JavaPractice.src.com.safatech.comparator.Employee;
import JavaPractice.src.com.safatech.java8.dao.EmployeeRepositoryRealTime;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * List down the names of all employees in each department
 */
public class NamesOfEmpInEachDept {

    public static void namesOfEmpInEachDept(List<Employee> employees) {

        Map<String, List<Employee>> employeesDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        for(Map.Entry<String, List<Employee>> entry : employeesDepartment.entrySet()){

            System.out.println("Employees in :" + entry.getKey());

            List<Employee> employeesList = entry.getValue();

            for(Employee employee : employeesList){

                System.out.println(employee.getName());
            }
        }
    }

    public static void main(String[] args) {

        namesOfEmpInEachDept(EmployeeRepositoryRealTime.getEmployee());
    }
}
