package JavaPractice.src.com.safatech.java8.realtime;

import JavaPractice.src.com.safatech.java8.dao.EmployeeDao;
import JavaPractice.src.com.safatech.java8.model.Employee;

import java.util.List;

//get the employee whose grade A
//get the sum of salary
public class SumOfSalaryGradeAEmployee {

    public static void getSumOfSalaryGradeAEmployee(List<Employee> employees){

        double sum = employees.stream()
                .filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(emp -> emp.getSalary())
                .mapToDouble(i -> i)
                .sum();
        IO.println(sum);
    }

    static void main() {

        getSumOfSalaryGradeAEmployee(EmployeeDao.getEmployees());
    }
}
