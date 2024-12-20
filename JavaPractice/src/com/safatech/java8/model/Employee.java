package com.safatech.java8.model;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private String grade;
    private long salary;

    public Employee() {
    }

    public Employee(int id, String name, String dept, String grade,long salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.grade = grade;
        this.salary = salary;
    }

    public Employee(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", grade='" + grade + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void getEmployeeInfo(){
        System.out.println("I am a method in Employee Class.");
    }
}
