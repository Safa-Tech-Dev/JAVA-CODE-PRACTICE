package JavaPractice.src.com.safatech.java8;

import JavaPractice.src.com.safatech.java8.model.Employee;
import JavaPractice.src.com.safatech.java8.model.EmployeeDO;
import JavaPractice.src.com.safatech.java8.service.EmployeeManager;
import JavaPractice.src.com.safatech.java8.service.EmployeeMapper;
import JavaPractice.src.com.safatech.java8.service.EmployeeServiceMR;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        EmployeeServiceMR employeeServiceMR = new EmployeeServiceMR();

      /*  //Annonymous implementation
        employeeServiceMR.loadEmployeeFromDB()
                .forEach(new Consumer<Employee>() {
                    @Override
                    public void accept(Employee employee) {
                        System.out.println(employee);
                    }
                });

        // Lambda expression
        employeeServiceMR.loadEmployeeFromDB()
                .forEach(employee -> System.out.println(employee));

        // Method Reference with custom type
        System.out.println("............... Method Reference with custom type ...............");
        employeeServiceMR.loadEmployeeFromDB()
                .forEach(MethodReferenceDemo::print);

        // Method Reference with predefine class
        System.out.println(" ............... Method Reference with predefine class ...............");
        employeeServiceMR.loadEmployeeFromDB()
                .forEach(System.out::println);*/

        //annonymous impl
        /*List<EmployeeDO> employeeDOS = employeeServiceMR.loadEmployeeFromDB()
                .stream()
                .map(new Function<Employee, EmployeeDO>() {
                    @Override
                    public EmployeeDO apply(Employee employee) {
                        EmployeeDO employeeDO = new EmployeeDO();
                        employeeDO.setId(employee.getId());
                        employeeDO.setName(employee.getName());
                        employeeDO.setSalary(employee.getSalary());
                        return employeeDO;
                    }
                }).collect(Collectors.toList());
        System.out.println(employeeDOS);*/

        //Lambda expression
        /*List<EmployeeDO> employeeDOS = employeeServiceMR.loadEmployeeFromDB()
                .stream()
                .map( employee -> {
                        EmployeeDO employeeDO = new EmployeeDO();
                        employeeDO.setId(employee.getId());
                        employeeDO.setName(employee.getName());
                        employeeDO.setSalary(employee.getSalary());
                        return employeeDO;
                }).collect(Collectors.toList());
        System.out.println(employeeDOS);*/

        // Simpler Lambda expression
      /*  List<EmployeeDO> employeeDOS = employeeServiceMR.loadEmployeeFromDB()
                .stream()
                .map( e -> EmployeeMapper.convert(e))
                .collect(Collectors.toList());
        System.out.println(employeeDOS);*/

        // Method Reference
       /* List<EmployeeDO> employeeDOS = employeeServiceMR.loadEmployeeFromDB()
                .stream()
                .map(EmployeeMapper::convert)
                .collect(Collectors.toList());
        System.out.println(employeeDOS);*/

     /*   List<String> nameList = employeeServiceMR.loadEmployeeFromDB()
                .stream()
                .map(Employee::getName)// if there is no argument in the method it consider as a static reference
                .collect(Collectors.toList());
        System.out.println(nameList);*/

        // Lambda expression
        EmployeeManager manager = () -> new Employee();
        manager.getEmployee().getEmployeeInfo();

        // Constructor Reference
        EmployeeManager manager1 = Employee::new;
        manager1.getEmployee().getEmployeeInfo();

        employeeServiceMR.loadEmployeeFromDB()
                .stream()
                .map(Employee::getId)
                .map(ArrayList::new);


    }
    static void print(Employee employee){
        System.out.println(employee);
    }
}
