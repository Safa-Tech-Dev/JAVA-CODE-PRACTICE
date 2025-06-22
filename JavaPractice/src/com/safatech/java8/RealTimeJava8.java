package JavaPractice.src.com.safatech.java8;

import JavaPractice.src.com.safatech.comparator.Address;
import JavaPractice.src.com.safatech.comparator.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class RealTimeJava8 {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0,new Address("Street1",12)));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0,new Address("Street1",100)));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0,new Address("Street1",99)));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0,new Address("Street1",57)));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0,new Address("Street1",58)));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0,new Address("Street1",24)));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0,new Address("Street1",28)));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0,new Address("Street1",78)));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0,new Address("Street1",36)));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5,new Address("Street1",165)));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0,new Address("Street1",42)));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0,new Address("Street1",89)));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0,new Address("Street1",52)));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5,new Address("Street1",312)));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0,new Address("Street1",112)));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0,new Address("Street1",19)));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0,new Address("Street1",16)));


        System.out.println("***********************************************************************************");
        /*
        2.Find out the count of male and female employees present in the organization?
        */
        System.out.println("******* Printing count of Male and Female employees *****");
        RealTimeJava8.getCountOfMaleFemale(employeeList);
        /*
         3 Print the name of all departments in the organization?
         */
        System.out.println(" ******* Printing the name of all departments ***********");
        RealTimeJava8.getDepartmentName(employeeList);

        /*
        4 Find the average age of Male and Female Employees.
         */
        System.out.println("Printing average age of Male and Female Employees");
        RealTimeJava8.getAvgAge(employeeList);
         /*
         5.Get the details of highest paid employee in the organization?
         */
        RealTimeJava8.getDetailsOfHighestPaidEmployee(employeeList);

        /*
         6. Get the names of all employees who have joined after 2015?
         */
        RealTimeJava8.getNameJoiningDateGT2015(employeeList);

        /*
        7.Count the number of employees in each department?
         */
        RealTimeJava8.getNumberOfEmpInEachDept(employeeList);
        /*
        8.What is the average salary of each department?
         */
        RealTimeJava8.getAvgSalaryOfEachDept(employeeList);
        /*
        9.Get the details of youngest male employee in the product development department?
         */
        RealTimeJava8.getYoungestMaleEmployeeInProductDevDept(employeeList);
        /*
        10.Who has the most working experience in the organization?
         */
        RealTimeJava8.getMostWorkingWorkingExpEmp(employeeList);
         /*
         11.How many male and female employees are there in the sales and marketing team?
         */
        RealTimeJava8.getMaleNFemaleEmpInSalesNMarkt(employeeList);

        /*
        12.What is the average salary of male and female employees?
         */
        RealTimeJava8.getAvgSalaryOfMaleNFemale(employeeList);

        /*
        13.List down the names of all employees in each department?
         */
        RealTimeJava8.namesOfEmpInEachDept(employeeList);
        /*
        14.What is the average salary and total salary of the whole organization?
         */
        RealTimeJava8.avgSalaryAndTotalSalaryOfWholeOrg(employeeList);
        /*
        15.Separate the employees who are younger or equal to 25
         years from those employees who are older than 25 years.
         */
        RealTimeJava8.getSeparatedEmpOlderThan_25AndYoungerOrEqualTo_25Years(employeeList);
        /*
        16.Who is the oldest employee in the organization?
         What is his age and which department he belongs to?
         */

        RealTimeJava8.getOlderEmployee(employeeList);

    }
    /*
    Query 3.15 : Who is the oldest employee in the organization?
     What is his age and which department he belongs to?
     */
    public static void getOlderEmployee(List<Employee> employeeList){

        System.out.println("************* Printing the oldest employee in the organization *************");
        Optional<Employee> optionalEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee employee = optionalEmployee.get();
        System.out.println("Name : " + employee.getName());
        System.out.println("Age : " + employee.getAge());
        System.out.println("Department : " + employee.getDepartment());
    }
    /*
    Query 3.14 : Separate the employees who are younger or equal to 25 years from
     those employees who are older than 25 years.
     */
    public static void getSeparatedEmpOlderThan_25AndYoungerOrEqualTo_25Years(List<Employee> employeeList){

        System.out.println(" ********** Younger or equal to 25 years from those employees who are older than 25 years ******");
        Map<Boolean, List<Employee>> partitionedEmployee = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 25));

        Set<Map.Entry<Boolean, List<Employee>>> entrySet = partitionedEmployee.entrySet();
        for(Map.Entry<Boolean,List<Employee>> entry : entrySet){

            System.out.println("--------------------------------------");
            if(entry.getKey()){
                System.out.println("Employees Older than 25 years: ");
            }else{
                System.out.println("Employees Younger than or equal to 25 years :");
            }
            List<Employee> emp = entry.getValue();
            for(Employee e : emp){
                System.out.println(e.getName());
            }
        }
    }
    /*
    Query 3.13 : What is the average salary and total salary of the whole organization?
     */
    public static void avgSalaryAndTotalSalaryOfWholeOrg(List<Employee> employeeList){

        System.out.println(" ********* average salary and total salary of the whole organization ****************");
        DoubleSummaryStatistics employeeSalaryStatistics = employeeList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average Salary : " + employeeSalaryStatistics.getAverage());
        System.out.println("Total Salary : " + employeeSalaryStatistics.getSum());
    }
    /*
    Query 3.12 : List down the names of all employees in each department?
     */
    public static void namesOfEmpInEachDept(List<Employee> employeeList){

        System.out.println("************* Printing names of all employees in each department ***************");
        Map<String, List<Employee>> employeeByDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String, List<Employee>>> entrySet = employeeByDept.entrySet();

        for(Map.Entry<String, List<Employee>> entry : entrySet){

            System.out.println("-----------------------------------");
            System.out.println("Employees in :" + entry.getKey());
            System.out.println("-----------------------------------");
            List<Employee> list = entry.getValue();
            for( Employee e : list){
                System.out.println(e.getName());
            }
        }
    }
    /*
    Query 3.11 : What is the average salary of male and female employees?
     */
    public static void getAvgSalaryOfMaleNFemale(List<Employee> employeeList){

        System.out.println(" Printing average salary of male and female employees *******");
        Map<String, Double> avgSalary = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalary);
    }
    /*
    Query 3.10 : How many male and female employees are there in the sales and marketing team?
     */
    public static void getMaleNFemaleEmpInSalesNMarkt(List<Employee> employeeList){

        System.out.println("************ Printing male and female employees in sales and marketing team *******");
        Map<String, Long> maleNFemaleEmployee = employeeList.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("sales and marketing"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(maleNFemaleEmployee);
    }
    /*
    Query 3.9 : Who has the most working experience in the organization?
     */
    public static void getMostWorkingWorkingExpEmp(List<Employee> employeeList) {

        System.out.println("********** most working experience in the organization **************");
        Optional<Employee> optionalFirst = employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        Employee mostWorkingExpEmp = optionalFirst.get();
        System.out.println(mostWorkingExpEmp);
    }
    /*
    Query 3.8 : Get the details of youngest male employee in the product development department?
     */
    public static void getYoungestMaleEmployeeInProductDevDept(List<Employee> employeeList){

        System.out.println("************ Get the details of youngest male employee in the product development department **********");
        Optional<Employee> optionalEmployee = employeeList.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("male") && e.getDepartment().equalsIgnoreCase("product development"))
                .min(Comparator.comparingInt(Employee::getAge));
        Employee youngestEmployee = optionalEmployee.get();
        System.out.println(youngestEmployee);
    }
    /*
    Query 3.7 : What is the average salary of each department?
     */
    public static void getAvgSalaryOfEachDept(List<Employee> employeeList){

        System.out.println("******* Printing the average salary of each department *********");
        Map<String, Double> avgSalaryOfDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        Set<Map.Entry<String, Double>> entrySet = avgSalaryOfDept.entrySet();
        for(Map.Entry<String, Double> entry : entrySet){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

    /*
    3.6 : Count the number of employees in each department?
     */
    public static void getNumberOfEmpInEachDept(List<Employee> employeeList){

        System.out.println("*********** Counting the number of employees in each department ********** ");
        Map<String, Long> collectedDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        Set<Map.Entry<String, Long>> entrySet = collectedDept.entrySet();
        for(Map.Entry<String, Long> entry : entrySet){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }


    /*
    3.5 Get the names of all employees who have joined after 2015?
     */
    public static void getNameJoiningDateGT2015(List<Employee> employeeList){

        System.out.println("******** Get the names of all employees who have joined after 2015? ********");
        employeeList.stream()
                .filter(emp -> emp.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .forEach(emp -> System.out.println(emp));
    }

    /*
    3.4 Get the details of highest paid employee in the organization?
     */

    public static void getDetailsOfHighestPaidEmployee(List<Employee> employeeList){

        Optional<Employee> employee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        Employee emp = employee.get();
        System.out.println("Details Of Highest Paid Employee");
        System.out.println("====================================");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Gender: " + emp.getGender());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Year Of Joining: " + emp.getYearOfJoining());
        System.out.println("Salary: " + emp.getSalary());
    }
    /*
    3.3 Print the name of all departments in the organization?
     */
    public static void getDepartmentName(List<Employee> employeeList){

        employeeList.stream()
                .map(Employee::getDepartment)
                .distinct().forEach(System.out::println);
    }

    /*
    3.2 Find the average age of Male and Female Employees.
     */
    public static void getAvgAge(List<Employee> employeeList){

        Map<String, Double> avgAge = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAge);
    }
    /*
   3.1 Find out the count of male and female employees present in the organization?
    */
    public static void getCountOfMaleFemale(List<Employee> employeeList){

        Map<String, Long> noOfMaleFemale = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleFemale);
    }
}
