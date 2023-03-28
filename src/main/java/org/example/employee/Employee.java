package org.example.employee;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private String name;
    private int idNumber;
    private double salary;
    @Autowired
    private String department;

    public Employee(){}

    public Employee(String name, int idNumber, String department, double salary) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.salary = salary;
    }

    // getters and setters
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

