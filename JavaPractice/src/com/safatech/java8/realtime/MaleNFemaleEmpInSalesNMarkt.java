package JavaPractice.src.com.safatech.java8.realtime;

import JavaPractice.src.com.safatech.comparator.Employee;
import JavaPractice.src.com.safatech.java8.dao.EmployeeRepositoryRealTime;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * How many male and female employees are there in the "sales and marketing" team?
 */
public class MaleNFemaleEmpInSalesNMarkt {

    public static void getMaleNFemaleEmpInSalesNMarkt(List<Employee> employees){

        Map<String, Long> sales_and_marketing = employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("sales and marketing"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(sales_and_marketing);
    }

    public static void main(String[] args) {
        getMaleNFemaleEmpInSalesNMarkt(EmployeeRepositoryRealTime.getEmployee());
    }
}
