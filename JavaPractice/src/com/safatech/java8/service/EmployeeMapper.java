package com.safatech.java8.service;

import com.safatech.java8.model.Employee;
import com.safatech.java8.model.EmployeeDO;

public class EmployeeMapper {

    public static EmployeeDO convert(Employee employee){

        EmployeeDO employeeDO = new EmployeeDO();
        employeeDO.setId(employee.getId());
        employeeDO.setName(employee.getName());
        employeeDO.setSalary(employee.getSalary());
        return employeeDO;
    }
}
