//package JavaPractice.src.com.safatech.java8;
//
//import JavaPractice.src.com.safatech.comparator.Address;
//import JavaPractice.src.com.safatech.comparator.Employee;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class RealTimeJava8 {
//    public static void main(String[] args){
//
//         /*
//         11.How many male and female employees are there in the sales and marketing team?
//         */
//        RealTimeJava8.getMaleNFemaleEmpInSalesNMarkt(employeeList);
//
//        /*
//        12.What is the average salary of male and female employees?
//         */
//        RealTimeJava8.getAvgSalaryOfMaleNFemale(employeeList);
//
//        /*
//        13.List down the names of all employees in each department?
//         */
//        RealTimeJava8.namesOfEmpInEachDept(employeeList);
//        /*
//        14.What is the average salary and total salary of the whole organization?
//         */
//        RealTimeJava8.avgSalaryAndTotalSalaryOfWholeOrg(employeeList);
//        /*
//        15.Separate the employees who are younger or equal to 25
//         years from those employees who are older than 25 years.
//         */
//        RealTimeJava8.getSeparatedEmpOlderThan_25AndYoungerOrEqualTo_25Years(employeeList);
//        /*
//        16.Who is the oldest employee in the organization?
//         What is his age and which department he belongs to?
//         */
//
//        RealTimeJava8.getOlderEmployee(employeeList);
//
//    }
//    /*
//    Query 3.15 : Who is the oldest employee in the organization?
//     What is his age and which department he belongs to?
//     */
//    public static void getOlderEmployee(List<Employee> employeeList){
//
//        System.out.println("************* Printing the oldest employee in the organization *************");
//        Optional<Employee> optionalEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
//        Employee employee = optionalEmployee.get();
//        System.out.println("Name : " + employee.getName());
//        System.out.println("Age : " + employee.getAge());
//        System.out.println("Department : " + employee.getDepartment());
//    }
//    /*
//    Query 3.14 : Separate the employees who are younger or equal to 25 years from
//     those employees who are older than 25 years.
//     */
//    public static void getSeparatedEmpOlderThan_25AndYoungerOrEqualTo_25Years(List<Employee> employeeList){
//
//        System.out.println(" ********** Younger or equal to 25 years from those employees who are older than 25 years ******");
//        Map<Boolean, List<Employee>> partitionedEmployee = employeeList.stream()
//                .collect(Collectors.partitioningBy(e -> e.getAge() > 25));
//
//        Set<Map.Entry<Boolean, List<Employee>>> entrySet = partitionedEmployee.entrySet();
//        for(Map.Entry<Boolean,List<Employee>> entry : entrySet){
//
//            System.out.println("--------------------------------------");
//            if(entry.getKey()){
//                System.out.println("Employees Older than 25 years: ");
//            }else{
//                System.out.println("Employees Younger than or equal to 25 years :");
//            }
//            List<Employee> emp = entry.getValue();
//            for(Employee e : emp){
//                System.out.println(e.getName());
//            }
//        }
//    }
//    /*
//    Query 3.13 : What is the average salary and total salary of the whole organization?
//     */
//    public static void avgSalaryAndTotalSalaryOfWholeOrg(List<Employee> employeeList){
//
//        System.out.println(" ********* average salary and total salary of the whole organization ****************");
//        DoubleSummaryStatistics employeeSalaryStatistics = employeeList.stream()
//                .collect(Collectors.summarizingDouble(Employee::getSalary));
//        System.out.println("Average Salary : " + employeeSalaryStatistics.getAverage());
//        System.out.println("Total Salary : " + employeeSalaryStatistics.getSum());
//    }
//    /*
//    Query 3.12 : List down the names of all employees in each department?
//     */
//    public static void namesOfEmpInEachDept(List<Employee> employeeList){
//
//        System.out.println("************* Printing names of all employees in each department ***************");
//        Map<String, List<Employee>> employeeByDept = employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment));
//        Set<Map.Entry<String, List<Employee>>> entrySet = employeeByDept.entrySet();
//
//        for(Map.Entry<String, List<Employee>> entry : entrySet){
//
//            System.out.println("-----------------------------------");
//            System.out.println("Employees in :" + entry.getKey());
//            System.out.println("-----------------------------------");
//            List<Employee> list = entry.getValue();
//            for( Employee e : list){
//                System.out.println(e.getName());
//            }
//        }
//    }
//    /*
//    Query 3.11 : What is the average salary of male and female employees?
//     */
//    public static void getAvgSalaryOfMaleNFemale(List<Employee> employeeList){
//
//        System.out.println(" Printing average salary of male and female employees *******");
//        Map<String, Double> avgSalary = employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(avgSalary);
//    }
//    /*
//    Query 3.10 : How many male and female employees are there in the sales and marketing team?
//     */
//    public static void getMaleNFemaleEmpInSalesNMarkt(List<Employee> employeeList){
//
//        System.out.println("************ Printing male and female employees in sales and marketing team *******");
//        Map<String, Long> maleNFemaleEmployee = employeeList.stream()
//                .filter(e -> e.getDepartment().equalsIgnoreCase("sales and marketing"))
//                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//        System.out.println(maleNFemaleEmployee);
//    }
//    /*
//   3.1 Find out the count of male and female employees present in the organization?
//    */
//    public static void getCountOfMaleFemale(List<Employee> employeeList){
//
//        Map<String, Long> noOfMaleFemale = employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//        System.out.println(noOfMaleFemale);
//    }
//}
