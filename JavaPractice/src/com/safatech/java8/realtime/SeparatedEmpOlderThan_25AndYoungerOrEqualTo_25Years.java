package JavaPractice.src.com.safatech.java8.realtime;

import JavaPractice.src.com.safatech.comparator.Employee;
import JavaPractice.src.com.safatech.java8.dao.EmployeeRepositoryRealTime;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Separate the employees who are younger or equal to 25 years from
 * those employees who are older than 25 years.
 */
public class SeparatedEmpOlderThan_25AndYoungerOrEqualTo_25Years {

    public static void getSeparatedEmpOlderThan_25AndYoungerOrEqualTo_25Years(List<Employee> employees){

        Map<Boolean, List<Employee>> empGT25 = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 25));


        for(Map.Entry<Boolean, List<Employee>> entry : empGT25.entrySet()){

            if(entry.getKey()){
                System.out.println("Employees older than 25 years : ");
            }else{
                System.out.println("Employees Younger than or equal to 25 years :");
            }

            for(Employee e : entry.getValue()){

                System.out.println(e.getName());
            }
        }
    }

    public static void main(String[] args) {

        getSeparatedEmpOlderThan_25AndYoungerOrEqualTo_25Years(EmployeeRepositoryRealTime.getEmployee());
    }
}
