package org.example.configuration;


import org.example.employee.Department;
import org.example.employee.Employee;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("emp")
    public Employee method1(){
        Employee employee= new Employee();
        employee.setIdNumber(1);
        employee.setSalary(900000);
        employee.setName("Trisha");

        return employee;
    }

    @Bean
    public Department method2(){
        Department department= new Department();
        department.setDeptName("IT Sector");
        department.setLocation("Pune");
        return department;
    }
}
