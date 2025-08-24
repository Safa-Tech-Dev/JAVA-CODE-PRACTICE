package JavaPractice.src.com.safatech.java8;

import JavaPractice.src.com.safatech.java8.dao.EmployeeDao;
import JavaPractice.src.com.safatech.java8.model.Employee;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {

       long start = 0;
        long end = 0;
        /*
        start = System.currentTimeMillis();
        IntStream.range(1, 100).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Squential stream took: " + (end - start) + " ms");

        System.out.println("=============================================");

        start = System.currentTimeMillis();
        IntStream.range(1, 100).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Parallel  stream took: " + (end - start) + " ms");*/

      /*  IntStream.range(1, 10)
                .forEach(x -> {
                    System.out.println(" Thread " + Thread.currentThread().getName() + " : " + x);
                });
        System.out.println("======================================================");
        IntStream.range(1, 10)
                .parallel()
                .forEach(x -> {
                    System.out.println(" Thread " + Thread.currentThread().getName() + " : " + x);
                });*/

        List<Employee> employeeList = EmployeeDao.getEmployees();
        start = System.currentTimeMillis();
        double avgSalaryStream = employeeList.stream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average().getAsDouble();
        end = System.currentTimeMillis();

        System.out.println("Normal stream execution Time: " + (end - start) + " : avg salary: " + avgSalaryStream);
        start = System.currentTimeMillis();
        double avgSalaryWithParallelStream = employeeList.parallelStream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Normal stream execution Time: " + (end - start) + " : avg salary: " + avgSalaryWithParallelStream);
    }
}
