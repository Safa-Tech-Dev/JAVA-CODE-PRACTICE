package JavaPractice.src.com.safatech.java8.realtime;

import JavaPractice.src.com.safatech.comparator.Employee;
import JavaPractice.src.com.safatech.java8.dao.EmployeeRepositoryRealTime;

import java.util.Comparator;
import java.util.List;

public class MostWorkingWorkingExpEmp {

    public static void getMostWorkingWorkingExpEmp(List<Employee> employees){

        Employee mostExperiencedEmployee = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getYearOfJoining))
                .findFirst()
                .get();
        System.out.println(mostExperiencedEmployee);
    }
    public static void main(String[] args) {

        getMostWorkingWorkingExpEmp(EmployeeRepositoryRealTime.getEmployee());
    }
}
