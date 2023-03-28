package org.example.employee;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private String name;
    private int idNumber;
    private double salary;
    @Autowired
    private Department department;

    public Employee(){}

    public Employee(String name, int idNumber, double salary, Department department) {
        this.name = name;
        this.idNumber = idNumber;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}

