package JavaPractice.src.com.safatech.java8.realtime;

import JavaPractice.src.com.safatech.comparator.Employee;
import JavaPractice.src.com.safatech.java8.dao.EmployeeRepositoryRealTime;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * What is the average salary and total salary of the whole organization?
 */
public class AvgSalaryAndTotalSalaryOfWholeOrg {

    public static void avgSalaryAndTotalSalaryOfWholeOrg(List<Employee> employees){


        // DoubleSummaryStatistics: A class that collects statistics like
        // count, sum, min, max, and average for double values.
        DoubleSummaryStatistics summaryStatistics = employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Average Salary : " + summaryStatistics.getAverage());
        System.out.println("Total Salary : " + summaryStatistics.getSum());
    }

    public static void main(String[] args) {

        avgSalaryAndTotalSalaryOfWholeOrg(EmployeeRepositoryRealTime.getEmployee());
    }
}
