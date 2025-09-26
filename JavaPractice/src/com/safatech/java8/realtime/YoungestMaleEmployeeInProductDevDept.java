package JavaPractice.src.com.safatech.java8.realtime;

import JavaPractice.src.com.safatech.comparator.Employee;
import JavaPractice.src.com.safatech.java8.dao.EmployeeRepositoryRealTime;

import java.util.Comparator;
import java.util.List;

/**
 * Get the details of youngest male employee in the product development department
 */
public class YoungestMaleEmployeeInProductDevDept {

    public static void getYoungestMaleEmployeeInProductDevDept(List<Employee> employees){

        Employee youngestEmployee = employees.stream()
                .filter(emp -> emp.getGender().equalsIgnoreCase("male") && emp.getDepartment().equalsIgnoreCase("product development"))
                .min(Comparator.comparingInt(Employee::getAge))
                .get();
        System.out.println(youngestEmployee);
    }

    public static void main(String[] args) {

        getYoungestMaleEmployeeInProductDevDept(EmployeeRepositoryRealTime.getEmployee());
    }
}
